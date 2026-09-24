package com.ironsource;

import android.net.Uri;
import android.util.Log;
import android.util.Pair;
import com.google.common.net.HttpHeaders;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.SSLException;

/* JADX INFO: renamed from: com.ironsource.a8 */
/* JADX INFO: loaded from: classes6.dex */
public class C11800a8 {

    /* JADX INFO: renamed from: a */
    private static final String f26748a = "POST";

    /* JADX INFO: renamed from: b */
    private static final String f26749b = "GET";

    /* JADX INFO: renamed from: c */
    private static final String f26750c = "ISHttpService";

    /* JADX INFO: renamed from: com.ironsource.a8$a */
    public static class a {

        /* JADX INFO: renamed from: h */
        private static final int f26751h = 15000;

        /* JADX INFO: renamed from: i */
        private static final int f26752i = 15000;

        /* JADX INFO: renamed from: j */
        private static final String f26753j = "UTF-8";

        /* JADX INFO: renamed from: a */
        final String f26754a;

        /* JADX INFO: renamed from: b */
        final String f26755b;

        /* JADX INFO: renamed from: c */
        final String f26756c;

        /* JADX INFO: renamed from: d */
        final int f26757d;

        /* JADX INFO: renamed from: e */
        final int f26758e;

        /* JADX INFO: renamed from: f */
        final String f26759f;

        /* JADX INFO: renamed from: g */
        ArrayList<Pair<String, String>> f26760g;

        /* JADX INFO: renamed from: com.ironsource.a8$a$a, reason: collision with other inner class name */
        static class C15520a {

            /* JADX INFO: renamed from: b */
            String f26762b;

            /* JADX INFO: renamed from: d */
            String f26764d;

            /* JADX INFO: renamed from: a */
            List<Pair<String, String>> f26761a = new ArrayList();

            /* JADX INFO: renamed from: c */
            String f26763c = "POST";

            /* JADX INFO: renamed from: e */
            int f26765e = 15000;

            /* JADX INFO: renamed from: f */
            int f26766f = 15000;

            /* JADX INFO: renamed from: g */
            String f26767g = "UTF-8";

            C15520a() {
            }

            /* JADX INFO: renamed from: a */
            C15520a m28126a(String str) {
                this.f26764d = str;
                return this;
            }

            /* JADX INFO: renamed from: b */
            C15520a m28130b(String str) {
                this.f26767g = str;
                return this;
            }

            /* JADX INFO: renamed from: c */
            C15520a m28131c(String str) {
                this.f26762b = str;
                return this;
            }

            /* JADX INFO: renamed from: d */
            C15520a m28132d(String str) {
                this.f26763c = str;
                return this;
            }

            /* JADX INFO: renamed from: a */
            C15520a m28124a(int i) {
                this.f26765e = i;
                return this;
            }

            /* JADX INFO: renamed from: b */
            C15520a m28129b(int i) {
                this.f26766f = i;
                return this;
            }

            /* JADX INFO: renamed from: a */
            C15520a m28125a(Pair<String, String> pair) {
                this.f26761a.add(pair);
                return this;
            }

            /* JADX INFO: renamed from: a */
            C15520a m28127a(List<Pair<String, String>> list) {
                this.f26761a.addAll(list);
                return this;
            }

            /* JADX INFO: renamed from: a */
            a m28128a() {
                return new a(this);
            }
        }

        public a(C15520a c15520a) {
            this.f26754a = c15520a.f26762b;
            this.f26755b = c15520a.f26763c;
            this.f26756c = c15520a.f26764d;
            this.f26760g = new ArrayList<>(c15520a.f26761a);
            this.f26757d = c15520a.f26765e;
            this.f26758e = c15520a.f26766f;
            this.f26759f = c15520a.f26767g;
        }

        /* JADX INFO: renamed from: a */
        boolean m28123a() {
            return "POST".equals(this.f26755b);
        }
    }

    /* JADX INFO: renamed from: a */
    public static C11385Cd m28115a(String str, String str2, List<Pair<String, String>> list) throws Exception {
        Uri uriBuild = Uri.parse(str).buildUpon().encodedQuery(str2).build();
        a.C15520a c15520a = new a.C15520a();
        c15520a.m28131c(uriBuild.toString()).m28126a(str2).m28132d("GET").m28127a(list);
        return m28121b(c15520a.m28128a());
    }

    /* JADX INFO: renamed from: b */
    public static C11385Cd m28122b(String str, String str2, List<Pair<String, String>> list) throws Exception {
        a.C15520a c15520a = new a.C15520a();
        c15520a.m28131c(str).m28126a(str2).m28132d("POST").m28127a(list);
        return m28121b(c15520a.m28128a());
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x009d: MOVE (r8 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:42:0x009d */
    /* JADX INFO: renamed from: b */
    public static C11385Cd m28121b(a aVar) throws Exception {
        HttpURLConnection httpURLConnectionM28116a;
        InputStream inputStream;
        InputStream inputStream2;
        if (m28120a(aVar.f26754a, aVar.f26756c)) {
            C11385Cd c11385Cd = new C11385Cd();
            InputStream inputStream3 = null;
            inputStream3 = null;
            inputStream3 = null;
            inputStream3 = null;
            inputStream3 = null;
            HttpURLConnection httpURLConnection = null;
            try {
                try {
                    httpURLConnectionM28116a = m28116a(aVar);
                    try {
                        m28118a(httpURLConnectionM28116a, aVar.f26760g);
                        m28117a(httpURLConnectionM28116a, aVar);
                        inputStream3 = httpURLConnectionM28116a.getInputStream();
                        c11385Cd.f24177a = httpURLConnectionM28116a.getResponseCode();
                        if (inputStream3 != null) {
                            c11385Cd.f24178b = C12156dg.m31329a(inputStream3);
                        }
                        if (inputStream3 != null) {
                            inputStream3.close();
                        }
                    } catch (InterruptedIOException e) {
                        e = e;
                        Log.d(f26750c, "Failed post to " + aVar.f26754a + " exception: " + e.getMessage());
                        throw e;
                    } catch (SSLException e2) {
                        e = e2;
                        Log.d(f26750c, "Failed post to " + aVar.f26754a + " exception: " + e.getMessage());
                        throw e;
                    } catch (IOException e3) {
                        e = e3;
                        inputStream = inputStream3;
                        httpURLConnection = httpURLConnectionM28116a;
                        C12317m4.m32153d().m32155a(e);
                        if (httpURLConnection != null && httpURLConnection.getHeaderFields().isEmpty()) {
                            throw new C11348Ac(e);
                        }
                        if (httpURLConnection != null) {
                            int responseCode = httpURLConnection.getResponseCode();
                            c11385Cd.f24177a = responseCode;
                            if (responseCode >= 400) {
                                Log.d(f26750c, "Failed post to " + aVar.f26754a + " StatusCode: " + c11385Cd.f24177a);
                                if (inputStream != null) {
                                    InputStream inputStream4 = inputStream;
                                    httpURLConnectionM28116a = httpURLConnection;
                                    inputStream3 = inputStream4;
                                    inputStream3.close();
                                } else {
                                    httpURLConnectionM28116a = httpURLConnection;
                                }
                            }
                        }
                        throw e;
                    } catch (Throwable th) {
                        th = th;
                        if (inputStream3 != null) {
                            inputStream3.close();
                        }
                        if (httpURLConnectionM28116a != null) {
                            httpURLConnectionM28116a.disconnect();
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    httpURLConnectionM28116a = null;
                    inputStream3 = inputStream2;
                }
            } catch (InterruptedIOException e4) {
                e = e4;
                Log.d(f26750c, "Failed post to " + aVar.f26754a + " exception: " + e.getMessage());
                throw e;
            } catch (SSLException e5) {
                e = e5;
                Log.d(f26750c, "Failed post to " + aVar.f26754a + " exception: " + e.getMessage());
                throw e;
            } catch (IOException e6) {
                e = e6;
                inputStream = null;
            } catch (Throwable th3) {
                th = th3;
                httpURLConnectionM28116a = null;
            }
            httpURLConnectionM28116a.disconnect();
            return c11385Cd;
        }
        throw new InvalidParameterException("not valid params");
    }

    /* JADX INFO: renamed from: a */
    private static void m28117a(HttpURLConnection httpURLConnection, a aVar) throws Exception {
        if (aVar.m28123a()) {
            byte[] bytes = aVar.f26756c.getBytes(aVar.f26759f);
            httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_LENGTH, Integer.toString(bytes.length));
            m28119a(httpURLConnection, bytes);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m28118a(HttpURLConnection httpURLConnection, List<Pair<String, String>> list) throws ProtocolException {
        for (Pair<String, String> pair : list) {
            httpURLConnection.setRequestProperty((String) pair.first, (String) pair.second);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m28119a(HttpURLConnection httpURLConnection, byte[] bArr) throws Exception {
        httpURLConnection.setDoOutput(true);
        DataOutputStream dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
        try {
            dataOutputStream.write(bArr);
            dataOutputStream.flush();
        } finally {
            dataOutputStream.close();
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m28120a(String str, String str2) {
        return (str == null || str.isEmpty() || str2 == null || str2.isEmpty()) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    private static HttpURLConnection m28116a(a aVar) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(aVar.f26754a).openConnection();
        httpURLConnection.setConnectTimeout(aVar.f26757d);
        httpURLConnection.setReadTimeout(aVar.f26758e);
        httpURLConnection.setRequestMethod(aVar.f26755b);
        return httpURLConnection;
    }
}
