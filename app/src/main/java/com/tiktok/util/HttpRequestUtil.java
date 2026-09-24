package com.tiktok.util;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.google.common.net.HttpHeaders;
import com.tiktok.TikTokBusinessSdk;
import com.tiktok.appevents.TTCrashHandler;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class HttpRequestUtil {
    private static final String CHARSET_UTF8 = "UTF-8";
    private static final String TAG = "HttpRequestUtil";

    private static class GzipInfo {
        public byte[] bytes;
        public long duration;
        public Throwable throwable1;
        public Throwable throwable2;

        private GzipInfo() {
        }
    }

    public static class HttpRequestOptions {
        private static final int UNSET = -1;
        private boolean isGzip = true;
        public int connectTimeout = -1;
        public int readTimeout = -1;

        public void configConnection(HttpURLConnection connection) {
            int i = this.connectTimeout;
            if (i != -1) {
                connection.setConnectTimeout(i);
            }
            int i2 = this.readTimeout;
            if (i2 != -1) {
                connection.setReadTimeout(i2);
            }
        }
    }

    public static class HttpResponse {
        public JSONObject body;
        public long duration;
        public Throwable throwable;
        public String url;
        public int code = -1;
        public int httpCode = -1;

        public int getErrCode() {
            JSONObject jSONObject;
            if (this.code == -1 && (jSONObject = this.body) != null) {
                this.code = JSON.getInt(jSONObject, TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
            }
            int i = this.httpCode;
            return i == 200 ? this.code : i;
        }

        public String getErrMsg() {
            String string = JSON.getString(this.body, "message", "");
            if (this.throwable != null) {
                string = string + "==" + this.throwable.getMessage();
            }
            return TextUtils.isEmpty(string) ? "unknown" : string;
        }

        public boolean isOK() {
            getErrCode();
            return this.code == 0 && this.httpCode == 200;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.Closeable[]] */
    /* JADX WARN: Type inference failed for: r3v0, types: [com.tiktok.util.HttpRequestUtil$1] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.io.Closeable[]] */
    private static GzipInfo compress2Gzip(String str) {
        ByteArrayOutputStream byteArrayOutputStream;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        ?? r3 = 0;
        r3 = 0;
        GzipInfo gzipInfo = new GzipInfo();
        if (TextUtils.isEmpty(str)) {
            gzipInfo.duration = SystemClock.elapsedRealtime() - jElapsedRealtime;
            gzipInfo.throwable1 = new Exception("request body is empty");
            return gzipInfo;
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(str.getBytes("UTF-8"));
                    IOUtils.close(gZIPOutputStream);
                    try {
                        gzipInfo.bytes = byteArrayOutputStream.toByteArray();
                    } catch (Throwable th) {
                        gzipInfo.throwable2 = th;
                    }
                    IOUtils.close(byteArrayOutputStream);
                } catch (Throwable th2) {
                    th = th2;
                    r3 = gZIPOutputStream;
                    try {
                        gzipInfo.throwable1 = th;
                        IOUtils.close((Closeable[]) new Closeable[]{r3});
                        if (byteArrayOutputStream != null) {
                            try {
                                gzipInfo.bytes = byteArrayOutputStream.toByteArray();
                            } catch (Throwable th3) {
                                gzipInfo.throwable2 = th3;
                            }
                            IOUtils.close(byteArrayOutputStream);
                        }
                    } catch (Throwable th4) {
                        IOUtils.close((Closeable[]) new Closeable[]{r3});
                        if (byteArrayOutputStream != null) {
                            try {
                                gzipInfo.bytes = byteArrayOutputStream.toByteArray();
                            } catch (Throwable th5) {
                                gzipInfo.throwable2 = th5;
                            }
                            IOUtils.close(byteArrayOutputStream);
                        }
                        throw th4;
                    }
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            th = th7;
            byteArrayOutputStream = null;
        }
        gzipInfo.duration = SystemClock.elapsedRealtime() - jElapsedRealtime;
        return gzipInfo;
    }

    public static HttpsURLConnection connect(String url, Map<String, String> headerParamMap, HttpRequestOptions options, String method, String contentLength) throws Throwable {
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) new URL(url).openConnection();
        httpsURLConnection.setRequestMethod(method);
        options.configConnection(httpsURLConnection);
        httpsURLConnection.setDoInput(true);
        httpsURLConnection.setUseCaches(false);
        if (method.equals("GET")) {
            httpsURLConnection.setDoOutput(false);
        } else if (method.equals("POST")) {
            httpsURLConnection.setDoOutput(true);
            httpsURLConnection.setRequestProperty(HttpHeaders.CONTENT_LENGTH, contentLength);
        }
        if (headerParamMap != null && !headerParamMap.isEmpty()) {
            for (Map.Entry<String, String> entry : headerParamMap.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                if (!TextUtils.isEmpty(key) && !TextUtils.isEmpty(value)) {
                    httpsURLConnection.setRequestProperty(key, value);
                }
            }
        }
        if (options.isGzip) {
            httpsURLConnection.setRequestProperty(HttpHeaders.CONTENT_ENCODING, "gzip");
        }
        httpsURLConnection.connect();
        return httpsURLConnection;
    }

    public static HttpResponse doGet(String url, Map<String, String> headerParamMap, HttpRequestOptions options) {
        JSONObject jSONObjectBuild;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HttpResponse httpResponse = new HttpResponse();
        httpResponse.url = url;
        HttpsURLConnection httpsURLConnection = null;
        HttpsURLConnection httpsURLConnectionConnect = connect(url, headerParamMap, options, "GET", null);
        try {
            if (shouldRedirect(httpsURLConnectionConnect.getResponseCode())) {
                String headerField = httpsURLConnectionConnect.getHeaderField(HttpHeaders.LOCATION);
                IOUtils.close(httpsURLConnectionConnect);
                httpsURLConnectionConnect = connect(headerField, headerParamMap, options, "GET", null);
            }
            httpsURLConnection = httpsURLConnectionConnect;
            int responseCode = httpsURLConnection.getResponseCode();
            httpResponse.httpCode = responseCode;
            if (responseCode == 200 && (jSONObjectBuild = JSON.build(streamToString(httpsURLConnection.getInputStream()))) != null) {
                httpResponse.body = jSONObjectBuild;
                httpResponse.code = JSON.getInt(jSONObjectBuild, TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
            }
            if (httpsURLConnection != null) {
                IOUtils.close(httpsURLConnection);
            }
        } catch (Throwable th) {
            th = th;
            httpsURLConnection = httpsURLConnectionConnect;
            try {
                httpResponse.throwable = th;
                TTCrashHandler.handleCrash(TAG, th, 1);
                if (httpsURLConnection != null) {
                    IOUtils.close(httpsURLConnection);
                }
            } catch (Throwable th2) {
                if (httpsURLConnection != null) {
                    IOUtils.close(httpsURLConnection);
                }
                throw th2;
            }
        }
        httpResponse.duration = SystemClock.elapsedRealtime() - jElapsedRealtime;
        monitorNetRequest(httpResponse);
        return httpResponse;
    }

    public static HttpResponse doPost(String url, Map<String, String> headerParamMap, String jsonStr) {
        return doPost(url, headerParamMap, jsonStr, true);
    }

    public static HttpResponse doPost(String str, Map<String, String> map, String str2, HttpRequestOptions httpRequestOptions, boolean z) {
        OutputStream outputStream;
        JSONObject jSONObjectBuild;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        HttpResponse httpResponse = new HttpResponse();
        httpResponse.url = str;
        HttpsURLConnection httpsURLConnection = null;
        OutputStream outputStream2 = null;
        try {
            if (z) {
                map.put("X-TT-Signature", DecryptUtil.encryptWithHmac(str2));
            } else {
                map.remove("X-TT-Signature");
            }
            GzipInfo gzipInfoCompress2Gzip = compress2Gzip(str2);
            String strValueOf = "0";
            byte[] bytes = gzipInfoCompress2Gzip.bytes;
            if (bytes == null || bytes.length <= 0) {
                httpRequestOptions.isGzip = false;
                try {
                    bytes = str2.getBytes("UTF-8");
                    strValueOf = String.valueOf(bytes.length);
                } catch (Throwable unused) {
                }
            } else {
                strValueOf = String.valueOf(bytes.length);
            }
            if (bytes == null || bytes.length == 0) {
                monitorGzipData(gzipInfoCompress2Gzip);
                bytes = new byte[0];
            }
            HttpsURLConnection httpsURLConnectionConnect = connect(str, map, httpRequestOptions, "POST", strValueOf);
            try {
                outputStream2 = httpsURLConnectionConnect.getOutputStream();
                outputStream2.write(bytes);
                outputStream2.flush();
                if (shouldRedirect(httpsURLConnectionConnect.getResponseCode())) {
                    String headerField = httpsURLConnectionConnect.getHeaderField(HttpHeaders.LOCATION);
                    IOUtils.close(httpsURLConnectionConnect);
                    httpsURLConnectionConnect = connect(headerField, map, httpRequestOptions, "POST", strValueOf);
                    outputStream2 = httpsURLConnectionConnect.getOutputStream();
                    outputStream2.write(bytes);
                    outputStream2.flush();
                }
                OutputStream outputStream3 = outputStream2;
                httpsURLConnection = httpsURLConnectionConnect;
                try {
                    int responseCode = httpsURLConnection.getResponseCode();
                    httpResponse.httpCode = responseCode;
                    if (responseCode == 200 && (jSONObjectBuild = JSON.build(streamToString(httpsURLConnection.getInputStream()))) != null) {
                        httpResponse.body = jSONObjectBuild;
                        httpResponse.code = JSON.getInt(jSONObjectBuild, TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
                    }
                    IOUtils.close(outputStream3);
                    IOUtils.close(httpsURLConnection);
                } catch (Throwable th) {
                    outputStream = outputStream3;
                    th = th;
                    try {
                        httpResponse.throwable = th;
                        TTCrashHandler.handleCrash(TAG, th, 1);
                        IOUtils.close(outputStream);
                        IOUtils.close(httpsURLConnection);
                    } catch (Throwable th2) {
                        IOUtils.close(outputStream);
                        IOUtils.close(httpsURLConnection);
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                OutputStream outputStream4 = outputStream2;
                httpsURLConnection = httpsURLConnectionConnect;
                th = th3;
                outputStream = outputStream4;
            }
        } catch (Throwable th4) {
            th = th4;
            outputStream = null;
        }
        httpResponse.duration = SystemClock.elapsedRealtime() - jElapsedRealtime;
        monitorNetRequest(httpResponse);
        return httpResponse;
    }

    public static HttpResponse doPost(String url, Map<String, String> headerParamMap, String jsonStr, boolean needSignature) {
        HttpRequestOptions httpRequestOptions = new HttpRequestOptions();
        try {
            if (url.contains(UrlConst.PATH_CONFIG2) || url.contains(UrlConst.PATH_DDL) || url.contains(UrlConst.PATH_CONFIG)) {
                httpRequestOptions.connectTimeout = NetworkTimeout.sConfigTime;
                httpRequestOptions.readTimeout = NetworkTimeout.sConfigTime * 3;
            } else {
                httpRequestOptions.connectTimeout = NetworkTimeout.sEventTime;
                httpRequestOptions.readTimeout = NetworkTimeout.sEventTime * 3;
            }
        } catch (Throwable unused) {
            httpRequestOptions.connectTimeout = 2000;
            httpRequestOptions.readTimeout = 5000;
        }
        return doPost(url, headerParamMap, jsonStr, httpRequestOptions, needSignature);
    }

    private static void monitorGzipData(GzipInfo info) {
        if (info == null) {
            return;
        }
        try {
            JSONObject metaWithTS = TTUtil.getMetaWithTS(null);
            JSON.putInt(metaWithTS, TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, -1);
            JSON.putLong(metaWithTS, "duration", info.duration);
            String str = "";
            if (info.throwable1 != null) {
                str = "" + info.throwable1.getMessage();
            }
            if (info.throwable2 != null) {
                str = str + "==" + info.throwable2.getMessage();
            }
            JSON.putObject(metaWithTS, "err_msg", str);
            TikTokBusinessSdk.getAppEventLogger().monitorMetric("gzip_err", metaWithTS, null);
        } catch (Throwable unused) {
        }
    }

    private static void monitorNetRequest(HttpResponse httpResponse) {
        if (httpResponse == null) {
            return;
        }
        try {
            if (!TextUtils.isEmpty(httpResponse.url) && !httpResponse.url.contains(UrlConst.PATH_MONITOR)) {
                String path = Uri.parse(httpResponse.url).getPath();
                JSONObject metaWithTS = TTUtil.getMetaWithTS(null);
                JSON.putInt(metaWithTS, "result", !httpResponse.isOK() ? 1 : 0);
                JSON.putInt(metaWithTS, "err_code", httpResponse.getErrCode());
                JSON.putObject(metaWithTS, "err_msg", httpResponse.getErrMsg());
                JSON.putLong(metaWithTS, "duration", httpResponse.duration);
                JSON.putObject(metaWithTS, "path", path);
                JSON.putObject(metaWithTS, "req_id", JSON.getString(httpResponse.body, SDKAnalyticsEvents.PARAMETER_REQUEST_ID));
                TikTokBusinessSdk.getAppEventLogger().monitorMetric("network_req", metaWithTS, null);
            }
        } catch (Throwable unused) {
        }
    }

    public static boolean shouldRedirect(int status) {
        if (status != 200) {
            return status == 302 || status == 301 || status == 303 || status == 307;
        }
        return false;
    }

    private static String streamToString(InputStream is) {
        BufferedReader bufferedReader;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        String strTrim = sb.toString().trim();
                        IOUtils.close(bufferedReader);
                        return strTrim;
                    }
                    sb.append(line);
                }
            } catch (Throwable th) {
                th = th;
                try {
                    TTCrashHandler.handleCrash(TAG, th, 1);
                    IOUtils.close(bufferedReader);
                    return null;
                } catch (Throwable th2) {
                    IOUtils.close(bufferedReader);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            bufferedReader = null;
        }
    }
}
