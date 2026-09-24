package com.apm.insight.p021k;

import android.text.TextUtils;
import com.apm.insight.C1373a;
import com.apm.insight.C1390e;
import com.apm.insight.MonitorCrash;
import com.apm.insight.Npth;
import com.apm.insight.p011b.C1383h;
import com.apm.insight.p022l.C1430f;
import com.google.common.net.HttpHeaders;
import com.ironsource.C11540L6;
import com.ironsource.C11744X3;
import com.ironsource.C12460ra;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.zip.Deflater;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.apm.insight.k.e */
/* JADX INFO: compiled from: CrashUploader.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1418e {

    /* JADX INFO: renamed from: a */
    public static boolean f669a;

    /* JADX INFO: renamed from: b */
    private static C1383h.a f670b;

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX INFO: renamed from: com.apm.insight.k.e$a */
    /* JADX INFO: compiled from: CrashUploader.java */
    public static final class a {

        /* JADX INFO: renamed from: d */
        private int f674d;

        /* JADX INFO: renamed from: c */
        private static a f673c = new a("NONE", 0, 0);

        /* JADX INFO: renamed from: a */
        public static final a f671a = new a("GZIP", 1, 1);

        /* JADX INFO: renamed from: b */
        public static final a f672b = new a("DEFLATER", 2, 2);

        private a(String str, int i, int i2) {
            super(str, i);
            this.f674d = i2;
        }
    }

    /* JADX INFO: renamed from: com.apm.insight.k.e$b */
    /* JADX INFO: compiled from: CrashUploader.java */
    public enum b {
        NONE(0),
        MOBILE(1),
        MOBILE_2G(2),
        MOBILE_3G(3),
        WIFI(4),
        MOBILE_4G(5),
        MOBILE_5G(6),
        WIFI_24GHZ(7),
        WIFI_5GHZ(8),
        MOBILE_3G_H(9),
        MOBILE_3G_HP(10);


        /* JADX INFO: renamed from: l */
        private int f687l;

        b(int i) {
            this.f687l = i;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C1430f m1232a(String str, String str2) {
        return m1247d(str, str2);
    }

    /* JADX INFO: renamed from: a */
    public static C1430f m1233a(String str, String str2, File... fileArr) {
        return m1243b(str, str2, fileArr);
    }

    /* JADX INFO: renamed from: a */
    private static C1430f m1234a(String str, byte[] bArr, a aVar, String str2) throws IOException {
        String str3;
        if (!Npth.isStopUpload() && str != null) {
            if (bArr == null) {
                bArr = new byte[0];
            }
            int length = bArr.length;
            if (a.f671a == aVar && length > 128) {
                bArr = m1241a(bArr);
                str3 = "gzip";
            } else if (a.f672b != aVar || length <= 128) {
                str3 = null;
            } else {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
                Deflater deflater = new Deflater();
                deflater.setInput(bArr);
                deflater.finish();
                byte[] bArr2 = new byte[8192];
                while (!deflater.finished()) {
                    byteArrayOutputStream.write(bArr2, 0, deflater.deflate(bArr2));
                }
                deflater.end();
                bArr = byteArrayOutputStream.toByteArray();
                str3 = "deflate";
            }
            return bArr == null ? new C1430f(202) : m1235a(str, bArr, str2, str3, "POST");
        }
        return new C1430f(201);
    }

    /* JADX INFO: renamed from: a */
    private static C1430f m1235a(String str, byte[] bArr, String str2, String str3, String str4) {
        InputStream inputStream;
        byte[] bArrM1239a;
        DataOutputStream dataOutputStream;
        HttpURLConnection httpURLConnection = null;
        GZIPInputStream gZIPInputStream = null;
        try {
            C1383h.a aVar = f670b;
            if (aVar != null) {
                try {
                    str = aVar.m979c();
                } catch (Throwable unused) {
                }
            }
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection2.setDoOutput(true);
                if (MonitorCrash.mCustomRequestHeader != null) {
                    MonitorCrash.mCustomRequestHeader.addRequestHeader(httpURLConnection2);
                }
                if (str2 != null) {
                    httpURLConnection2.setRequestProperty("Content-Type", str2);
                }
                if (str3 != null) {
                    httpURLConnection2.setRequestProperty(HttpHeaders.CONTENT_ENCODING, str3);
                }
                httpURLConnection2.setRequestProperty(HttpHeaders.ACCEPT_ENCODING, "gzip");
                httpURLConnection2.setRequestMethod(str4);
                if (bArr != null && bArr.length > 0) {
                    try {
                        dataOutputStream = new DataOutputStream(httpURLConnection2.getOutputStream());
                        try {
                            dataOutputStream.write(bArr);
                            dataOutputStream.flush();
                            C1373a.m860a((Closeable) dataOutputStream);
                        } catch (Throwable th) {
                            th = th;
                            C1373a.m860a((Closeable) dataOutputStream);
                            throw th;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        dataOutputStream = null;
                    }
                }
                int responseCode = httpURLConnection2.getResponseCode();
                if (responseCode != 200) {
                    C1430f c1430f = new C1430f("http response code ".concat(String.valueOf(responseCode)));
                    if (httpURLConnection2 != null) {
                        try {
                            httpURLConnection2.disconnect();
                        } catch (Exception unused2) {
                        }
                    }
                    C1373a.m860a((Closeable) null);
                    return c1430f;
                }
                InputStream inputStream2 = httpURLConnection2.getInputStream();
                try {
                    if ("gzip".equalsIgnoreCase(httpURLConnection2.getContentEncoding())) {
                        try {
                            GZIPInputStream gZIPInputStream2 = new GZIPInputStream(inputStream2);
                            try {
                                bArrM1239a = m1239a(gZIPInputStream2);
                                C1373a.m860a((Closeable) gZIPInputStream2);
                            } catch (Throwable th3) {
                                th = th3;
                                gZIPInputStream = gZIPInputStream2;
                                C1373a.m860a((Closeable) gZIPInputStream);
                                throw th;
                            }
                        } catch (Throwable th4) {
                            th = th4;
                        }
                    } else {
                        bArrM1239a = m1239a(inputStream2);
                    }
                    C1430f c1430f2 = new C1430f(bArrM1239a);
                    if (httpURLConnection2 != null) {
                        try {
                            httpURLConnection2.disconnect();
                        } catch (Exception unused3) {
                        }
                    }
                    C1373a.m860a((Closeable) inputStream2);
                    return c1430f2;
                } catch (Throwable th5) {
                    httpURLConnection = httpURLConnection2;
                    inputStream = inputStream2;
                    th = th5;
                    try {
                        C1373a.m865a(th);
                        return new C1430f(207, th);
                    } finally {
                        if (httpURLConnection != null) {
                            try {
                                httpURLConnection.disconnect();
                            } catch (Exception unused4) {
                            }
                        }
                        C1373a.m860a((Closeable) inputStream);
                    }
                }
            } catch (Throwable th6) {
                th = th6;
                httpURLConnection = httpURLConnection2;
                inputStream = null;
            }
        } catch (Throwable th7) {
            th = th7;
            inputStream = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m1236a(C1383h.a aVar) {
        f670b = aVar;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1237a() {
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m1238a(String str, String str2, String str3, String str4, List<String> list) {
        if (Npth.isStopUpload()) {
            return false;
        }
        try {
            C1422i c1422i = new C1422i(str, "UTF-8", false);
            c1422i.m1271a(C12460ra.f31825b, str2);
            c1422i.m1271a("device_id", str3);
            c1422i.m1271a(C11540L6.f24911F, C11744X3.f26142d);
            c1422i.m1271a("process_name", str4);
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                File file = new File(it.next());
                if (file.exists()) {
                    HashMap map = new HashMap();
                    map.put("logtype", "alog");
                    map.put("scene", "Crash");
                    c1422i.m1270a(file.getName(), file, map);
                }
            }
            try {
                return new JSONObject(c1422i.m1269a()).optInt("errno", -1) == 200;
            } catch (JSONException unused) {
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m1239a(InputStream inputStream) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
        while (true) {
            int i = inputStream.read(bArr);
            if (-1 == i) {
                inputStream.close();
                try {
                    return byteArrayOutputStream.toByteArray();
                } finally {
                    C1373a.m860a((Closeable) byteArrayOutputStream);
                }
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m1240a(String str, byte[] bArr) {
        try {
            TextUtils.isDigitsOnly(str);
            return m1234a(str, bArr, a.f671a, "application/json; charset=utf-8").m1346b();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static byte[] m1241a(byte[] bArr) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        try {
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th) {
            try {
                C1373a.m874b(th);
                return null;
            } finally {
                gZIPOutputStream.close();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static C1430f m1242b(String str, String str2) {
        return m1247d(str, str2);
    }

    /* JADX INFO: renamed from: b */
    private static C1430f m1243b(String str, String str2, File... fileArr) {
        if (Npth.isStopUpload()) {
            return new C1430f(201);
        }
        try {
            C1422i c1422i = new C1422i(m1246c(str, "have_dump=true"), "UTF-8", true);
            c1422i.m1273b("json", str2);
            c1422i.m1272a(C11744X3.i.f26356b, fileArr);
            try {
                return new C1430f(new JSONObject(c1422i.m1269a()));
            } catch (JSONException e) {
                return new C1430f(0, e);
            }
        } catch (IOException e2) {
            e2.printStackTrace();
            return new C1430f(207);
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1244b() {
        return false;
    }

    /* JADX INFO: renamed from: c */
    public static String m1245c() {
        return C1390e.m1034i().getJavaCrashUploadUrl();
    }

    /* JADX INFO: renamed from: c */
    private static String m1246c(String str, String str2) {
        try {
            if (TextUtils.isEmpty(new URL(str).getQuery())) {
                if (!str.endsWith("?")) {
                    str = str + "?";
                }
            } else if (!str.endsWith(C11744X3.j.f26436c)) {
                str = str + C11744X3.j.f26436c;
            }
            return str + str2;
        } catch (Throwable unused) {
            return str;
        }
    }

    /* JADX INFO: renamed from: d */
    private static C1430f m1247d(String str, String str2) {
        try {
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
                return m1234a(str, str2.getBytes(), a.f671a, "application/json; charset=utf-8");
            }
            return new C1430f(201);
        } catch (Throwable th) {
            C1373a.m874b(th);
            return new C1430f(207, th);
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m1248d() {
        return C1390e.m1034i().getAlogUploadUrl();
    }

    /* JADX INFO: renamed from: e */
    public static String m1249e() {
        return C1390e.m1034i().getLaunchCrashUploadUrl();
    }

    /* JADX INFO: renamed from: f */
    public static String m1250f() {
        return C1390e.m1034i().getExceptionUploadUrl();
    }

    /* JADX INFO: renamed from: g */
    public static String m1251g() {
        return C1390e.m1034i().getNativeCrashUploadUrl();
    }
}
