package com.fyber.inneractive.sdk.web;

import android.text.TextUtils;
import android.webkit.WebResourceRequest;
import com.fyber.inneractive.sdk.util.AbstractC9195v;
import com.google.common.net.HttpHeaders;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.web.b1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9219b1 {

    /* JADX INFO: renamed from: b */
    public static final byte[] f21524b = new byte[0];

    /* JADX INFO: renamed from: c */
    public static final C9219b1 f21525c = new C9219b1();

    /* JADX INFO: renamed from: a */
    public final C9278z0 f21526a = new C9278z0();

    /* JADX INFO: renamed from: a */
    public static C9222c1 m22049a(HttpURLConnection httpURLConnection, ByteBuffer byteBuffer) throws IOException {
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream;
        String strTrim;
        String strTrim2;
        httpURLConnection.connect();
        for (int i = 0; i < 20; i++) {
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode < 300 || responseCode >= 400) {
                try {
                    inputStream = httpURLConnection.getInputStream();
                    try {
                        byte[] bArrArray = byteBuffer.array();
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        while (true) {
                            try {
                                int i2 = inputStream.read(bArrArray);
                                if (i2 == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArrArray, 0, i2);
                            } catch (Throwable unused) {
                            }
                        }
                    } catch (Throwable unused2) {
                        byteArrayOutputStream = null;
                    }
                } catch (Throwable unused3) {
                    inputStream = null;
                }
                AbstractC9195v.m22034b((Closeable) inputStream);
                httpURLConnection.disconnect();
                String contentType = httpURLConnection.getContentType();
                if (TextUtils.isEmpty(contentType)) {
                    strTrim = "";
                    strTrim2 = strTrim;
                } else {
                    String[] strArrSplit = contentType.split(";");
                    strTrim = strArrSplit.length > 0 ? strArrSplit[0].trim() : "";
                    strTrim2 = strArrSplit.length > 1 ? strArrSplit[1].trim() : "";
                }
                HashMap map = new HashMap();
                Map<String, List<String>> headerFields = httpURLConnection.getHeaderFields();
                if (headerFields != null) {
                    for (String str : headerFields.keySet()) {
                        List<String> list = headerFields.get(str);
                        if (list != null && list.size() > 0) {
                            map.put(str, list.get(0));
                        }
                    }
                }
                String responseMessage = httpURLConnection.getResponseMessage();
                if (TextUtils.isEmpty(responseMessage)) {
                    return null;
                }
                return new C9222c1(byteArrayOutputStream == null ? f21524b : byteArrayOutputStream.toByteArray(), map, strTrim, strTrim2, responseCode, responseMessage);
            }
            String headerField = httpURLConnection.getHeaderField(HttpHeaders.LOCATION);
            if (TextUtils.isEmpty(headerField)) {
                return null;
            }
            httpURLConnection.disconnect();
            httpURLConnection = (HttpURLConnection) new URL(headerField).openConnection();
            httpURLConnection.connect();
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static void m22050a(WebResourceRequest webResourceRequest, HttpURLConnection httpURLConnection) {
        if (webResourceRequest.getRequestHeaders() == null || webResourceRequest.getRequestHeaders().size() <= 0) {
            return;
        }
        for (String str : webResourceRequest.getRequestHeaders().keySet()) {
            if (str != null && webResourceRequest.getRequestHeaders().get(str) != null) {
                httpURLConnection.setRequestProperty(str, webResourceRequest.getRequestHeaders().get(str));
            }
        }
    }
}
