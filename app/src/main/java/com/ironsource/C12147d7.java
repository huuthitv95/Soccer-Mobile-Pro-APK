package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.C12367p;
import com.ironsource.mediationsdk.logger.IronLog;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: renamed from: com.ironsource.d7 */
/* JADX INFO: loaded from: classes6.dex */
public class C12147d7 {

    /* JADX INFO: renamed from: a */
    private static final int f30207a = 15000;

    /* JADX INFO: renamed from: b */
    private static final String f30208b = "GET";

    /* JADX INFO: renamed from: c */
    private static final String f30209c = "POST";

    /* JADX INFO: renamed from: d */
    private static final String f30210d = "UTF-8";

    /* JADX INFO: renamed from: e */
    public static final String f30211e = "ERROR:";

    /* JADX INFO: renamed from: f */
    private static final String f30212f = "Bad Request - 400";

    /* JADX INFO: renamed from: g */
    private static final ExecutorService f30213g = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: com.ironsource.d7$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f30214a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ String f30215b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ InterfaceC12165e7 f30216c;

        a(String str, String str2, InterfaceC12165e7 interfaceC12165e7) {
            this.f30214a = str;
            this.f30215b = str2;
            this.f30216c = interfaceC12165e7;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            HttpURLConnection httpURLConnectionM31303b;
            OutputStream outputStream;
            OutputStream outputStream2;
            try {
                try {
                    httpURLConnectionM31303b = C12147d7.m31303b(this.f30214a);
                    try {
                        outputStream2 = httpURLConnectionM31303b.getOutputStream();
                        try {
                            C12147d7.m31301a(this.f30215b, outputStream2);
                            int responseCode = httpURLConnectionM31303b.getResponseCode();
                            boolean z = responseCode == 200;
                            if (!z) {
                                IronLog.INTERNAL.error("invalid response code " + responseCode + " sending request");
                            }
                            this.f30216c.mo26483a(z);
                        } catch (Exception e) {
                            e = e;
                            C12317m4.m32153d().m32155a(e);
                            IronLog.INTERNAL.error("exception while sending request " + e.getMessage());
                            this.f30216c.mo26483a(false);
                        }
                    } catch (Exception e2) {
                        e = e2;
                        outputStream2 = null;
                    } catch (Throwable th) {
                        th = th;
                        outputStream = null;
                        C12147d7.m31300a(outputStream, httpURLConnectionM31303b, (BufferedReader) null);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e3) {
                e = e3;
                httpURLConnectionM31303b = null;
                outputStream2 = null;
            } catch (Throwable th3) {
                th = th3;
                httpURLConnectionM31303b = null;
                outputStream = null;
            }
            C12147d7.m31300a(outputStream2, httpURLConnectionM31303b, (BufferedReader) null);
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m31297a(String str) throws Exception {
        return m31298a(str, (C12367p.b) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static HttpURLConnection m31303b(String str) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setReadTimeout(15000);
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        return httpURLConnection;
    }

    /* JADX INFO: renamed from: a */
    public static String m31298a(String str, C12367p.b bVar) throws Throwable {
        HttpURLConnection httpURLConnection;
        BufferedReader bufferedReader;
        Exception e;
        BufferedReader bufferedReader2;
        Throwable th;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setReadTimeout(15000);
                httpURLConnection.setConnectTimeout(15000);
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setDoInput(true);
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode() == 400) {
                    if (bVar != null) {
                        bVar.mo32676a("Bad Request - 400");
                    }
                    m31300a((OutputStream) null, httpURLConnection, (BufferedReader) null);
                    return null;
                }
                bufferedReader2 = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream()));
                try {
                    String strM31296a = m31296a(bufferedReader2);
                    m31300a((OutputStream) null, httpURLConnection, bufferedReader2);
                    return strM31296a;
                } catch (Exception e2) {
                    e = e2;
                    try {
                        C12317m4.m32153d().m32155a(e);
                        m31300a((OutputStream) null, httpURLConnection, bufferedReader2);
                        return null;
                    } catch (Throwable th2) {
                        bufferedReader = bufferedReader2;
                        th = th2;
                        BufferedReader bufferedReader3 = bufferedReader;
                        th = th;
                        bufferedReader2 = bufferedReader3;
                        m31300a((OutputStream) null, httpURLConnection, bufferedReader2);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    m31300a((OutputStream) null, httpURLConnection, bufferedReader2);
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                e = e;
                bufferedReader2 = null;
                C12317m4.m32153d().m32155a(e);
                m31300a((OutputStream) null, httpURLConnection, bufferedReader2);
                return null;
            } catch (Throwable th4) {
                th = th4;
                bufferedReader = null;
                BufferedReader bufferedReader4 = bufferedReader;
                th = th;
                bufferedReader2 = bufferedReader4;
                m31300a((OutputStream) null, httpURLConnection, bufferedReader2);
                throw th;
            }
        } catch (Exception e4) {
            e = e4;
            httpURLConnection = null;
        } catch (Throwable th5) {
            th = th5;
            httpURLConnection = null;
            bufferedReader = null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m31302a(String str, String str2, InterfaceC12165e7 interfaceC12165e7) {
        f30213g.submit(new a(str, str2, interfaceC12165e7));
    }

    /* JADX INFO: renamed from: a */
    public static String m31299a(String str, String str2, C12367p.b bVar) {
        InterfaceC12191f7 interfaceC12191f7M31295a = m31295a(str, str2);
        if (interfaceC12191f7M31295a instanceof InterfaceC12191f7.a) {
            InterfaceC12191f7.a aVar = (InterfaceC12191f7.a) interfaceC12191f7M31295a;
            if (aVar.mo31452b()) {
                return null;
            }
            bVar.mo32676a(aVar.mo31451a());
            return null;
        }
        return ((InterfaceC12191f7.b) interfaceC12191f7M31295a).m31466d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.net.HttpURLConnection, java.net.URLConnection] */
    /* JADX INFO: renamed from: a */
    public static InterfaceC12191f7 m31295a(String str, String str2) throws Throwable {
        OutputStream outputStream;
        Exception e;
        Exception e2;
        BufferedReader bufferedReader;
        ?? r1 = 0;
        r1 = 0;
        r1 = 0;
        try {
            try {
                str = m31303b(str);
                try {
                    str.setRequestProperty("Content-Type", "application/json; charset=utf-8");
                    outputStream = str.getOutputStream();
                    try {
                        m31301a(str2, outputStream);
                        int responseCode = str.getResponseCode();
                        if (responseCode == 200) {
                            bufferedReader = new BufferedReader(new InputStreamReader(str.getInputStream()));
                            try {
                                String strM31296a = m31296a(bufferedReader);
                                if (strM31296a != null) {
                                    InterfaceC12191f7.b bVar = new InterfaceC12191f7.b(strM31296a);
                                    m31300a(outputStream, (HttpURLConnection) str, bufferedReader);
                                    return bVar;
                                }
                                InterfaceC12191f7.a.c cVar = new InterfaceC12191f7.a.c();
                                m31300a(outputStream, (HttpURLConnection) str, bufferedReader);
                                return cVar;
                            } catch (Exception e3) {
                                e2 = e3;
                                C12317m4.m32153d().m32155a(e2);
                                IronLog.INTERNAL.error("exception while sending request " + e2.getMessage());
                                InterfaceC12191f7.a.C15539a c15539a = new InterfaceC12191f7.a.C15539a(e2);
                                m31300a(outputStream, (HttpURLConnection) str, bufferedReader);
                                return c15539a;
                            }
                        }
                        InterfaceC12191f7.a.b bVar2 = new InterfaceC12191f7.a.b(responseCode, str.getResponseMessage());
                        m31300a(outputStream, (HttpURLConnection) str, (BufferedReader) null);
                        return bVar2;
                    } catch (Exception e4) {
                        e = e4;
                        e2 = e;
                        bufferedReader = null;
                        C12317m4.m32153d().m32155a(e2);
                        IronLog.INTERNAL.error("exception while sending request " + e2.getMessage());
                        InterfaceC12191f7.a.C15539a c15539a2 = new InterfaceC12191f7.a.C15539a(e2);
                        m31300a(outputStream, (HttpURLConnection) str, bufferedReader);
                        return c15539a2;
                    } catch (Throwable th) {
                        th = th;
                        m31300a(outputStream, (HttpURLConnection) str, (BufferedReader) r1);
                        throw th;
                    }
                } catch (Exception e5) {
                    e = e5;
                    outputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    outputStream = null;
                }
            } catch (Throwable th3) {
                r1 = str2;
                th = th3;
            }
        } catch (Exception e6) {
            e = e6;
            str = 0;
            outputStream = null;
        } catch (Throwable th4) {
            th = th4;
            str = 0;
            outputStream = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static void m31301a(String str, OutputStream outputStream) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, "UTF-8"));
        bufferedWriter.write(str);
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    /* JADX INFO: renamed from: a */
    private static String m31296a(BufferedReader bufferedReader) throws IOException {
        StringBuilder sb = new StringBuilder();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                break;
            }
            sb.append(line);
        }
        String string = sb.toString();
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return string;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static void m31300a(OutputStream outputStream, HttpURLConnection httpURLConnection, BufferedReader bufferedReader) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e) {
                C12317m4.m32153d().m32155a(e);
                IronLog.INTERNAL.error("exception while closing output stream " + e.getMessage());
            }
        }
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (IOException e2) {
                C12317m4.m32153d().m32155a(e2);
                IronLog.INTERNAL.error("exception while closing reader " + e2.getMessage());
            }
        }
    }
}
