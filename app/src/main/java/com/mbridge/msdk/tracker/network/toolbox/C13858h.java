package com.mbridge.msdk.tracker.network.toolbox;

import com.mbridge.msdk.foundation.same.net.MBridgeHostnameVerifier;
import com.mbridge.msdk.tracker.network.AbstractC13850t;
import com.mbridge.msdk.tracker.network.C13837g;
import java.io.DataOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: com.mbridge.msdk.tracker.network.toolbox.h */
/* JADX INFO: compiled from: HurlStack.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13858h extends AbstractC13851a {

    /* JADX INFO: renamed from: a */
    private final SSLSocketFactory f39559a;

    /* JADX INFO: renamed from: com.mbridge.msdk.tracker.network.toolbox.h$a */
    /* JADX INFO: compiled from: HurlStack.java */
    static class a extends FilterInputStream implements AutoCloseable {

        /* JADX INFO: renamed from: a */
        private final HttpURLConnection f39560a;

        a(HttpURLConnection httpURLConnection) {
            super(C13858h.m41282b(httpURLConnection));
            this.f39560a = httpURLConnection;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            this.f39560a.disconnect();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.tracker.network.toolbox.h$b */
    /* JADX INFO: compiled from: HurlStack.java */
    public interface b {
    }

    public C13858h() {
        this(null);
    }

    public C13858h(b bVar) {
        this(bVar, null);
    }

    public C13858h(b bVar, SSLSocketFactory sSLSocketFactory) {
        this.f39559a = sSLSocketFactory;
    }

    /* JADX INFO: renamed from: a */
    static List<C13837g> m41277a(Map<String, List<String>> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            if (entry.getKey() != null) {
                Iterator<String> it = entry.getValue().iterator();
                while (it.hasNext()) {
                    arrayList.add(new C13837g(entry.getKey(), it.next()));
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    private HttpsURLConnection m41278a(URL url, AbstractC13850t<?> abstractC13850t) throws IOException {
        SSLSocketFactory sSLSocketFactory;
        HttpsURLConnection httpsURLConnectionM41285a = m41285a(url);
        int iM41245q = abstractC13850t.m41245q();
        httpsURLConnectionM41285a.setConnectTimeout(iM41245q);
        httpsURLConnectionM41285a.setReadTimeout(iM41245q);
        httpsURLConnectionM41285a.setUseCaches(false);
        httpsURLConnectionM41285a.setDoInput(true);
        if ("https".equals(url.getProtocol()) && (sSLSocketFactory = this.f39559a) != null) {
            httpsURLConnectionM41285a.setSSLSocketFactory(sSLSocketFactory);
        }
        return httpsURLConnectionM41285a;
    }

    /* JADX INFO: renamed from: a */
    private void m41279a(HttpURLConnection httpURLConnection, AbstractC13850t<?> abstractC13850t) throws IOException {
        byte[] bArrM41229b = abstractC13850t.m41229b();
        if (bArrM41229b != null) {
            m41280a(httpURLConnection, abstractC13850t, bArrM41229b);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m41280a(HttpURLConnection httpURLConnection, AbstractC13850t<?> abstractC13850t, byte[] bArr) throws IOException {
        httpURLConnection.setDoOutput(true);
        if (!httpURLConnection.getRequestProperties().containsKey("Content-Type")) {
            httpURLConnection.setRequestProperty("Content-Type", abstractC13850t.m41232c());
        }
        DataOutputStream dataOutputStream = new DataOutputStream(m41284a(abstractC13850t, httpURLConnection, bArr.length));
        dataOutputStream.write(bArr);
        dataOutputStream.close();
    }

    /* JADX INFO: renamed from: a */
    private static boolean m41281a(int i, int i2) {
        if (i != 4) {
            return ((100 <= i2 && i2 < 200) || i2 == 204 || i2 == 304) ? false : true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static InputStream m41282b(HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getInputStream();
        } catch (IOException unused) {
            return httpURLConnection.getErrorStream();
        }
    }

    @Override // com.mbridge.msdk.tracker.network.toolbox.AbstractC13851a
    /* JADX INFO: renamed from: a */
    public C13857g mo37409a(AbstractC13850t<?> abstractC13850t, Map<String, String> map) throws IOException {
        String strM41263a = abstractC13850t.m41237g() == 0 ? C13854d.m41263a(abstractC13850t.m41248t(), abstractC13850t) : abstractC13850t.m41248t();
        HashMap map2 = new HashMap();
        map2.putAll(map);
        map2.putAll(abstractC13850t.mo41111f());
        HttpsURLConnection httpsURLConnectionM41278a = m41278a(new URL(strM41263a), abstractC13850t);
        try {
            for (String str : map2.keySet()) {
                httpsURLConnectionM41278a.setRequestProperty(str, (String) map2.get(str));
            }
            m41286b(httpsURLConnectionM41278a, abstractC13850t);
            int responseCode = httpsURLConnectionM41278a.getResponseCode();
            if (responseCode == -1) {
                throw new IOException("Could not retrieve response code from HttpUrlConnection.");
            }
            if (m41281a(abstractC13850t.m41237g(), responseCode)) {
                return new C13857g(responseCode, m41277a(httpsURLConnectionM41278a.getHeaderFields()), httpsURLConnectionM41278a.getContentLength(), m41283a(abstractC13850t, httpsURLConnectionM41278a));
            }
            C13857g c13857g = new C13857g(responseCode, m41277a(httpsURLConnectionM41278a.getHeaderFields()));
            httpsURLConnectionM41278a.disconnect();
            return c13857g;
        } catch (Throwable th) {
            if (0 == 0) {
                httpsURLConnectionM41278a.disconnect();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: a */
    protected InputStream m41283a(AbstractC13850t<?> abstractC13850t, HttpURLConnection httpURLConnection) {
        return new a(httpURLConnection);
    }

    /* JADX INFO: renamed from: a */
    protected OutputStream m41284a(AbstractC13850t<?> abstractC13850t, HttpURLConnection httpURLConnection, int i) throws IOException {
        return httpURLConnection.getOutputStream();
    }

    /* JADX INFO: renamed from: a */
    protected HttpsURLConnection m41285a(URL url) throws IOException {
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection();
        httpsURLConnection.setHostnameVerifier(new MBridgeHostnameVerifier(url));
        httpsURLConnection.setInstanceFollowRedirects(HttpURLConnection.getFollowRedirects());
        return httpsURLConnection;
    }

    /* JADX INFO: renamed from: b */
    void m41286b(HttpURLConnection httpURLConnection, AbstractC13850t<?> abstractC13850t) throws IOException {
        switch (abstractC13850t.m41237g()) {
            case 0:
                httpURLConnection.setRequestMethod("GET");
                return;
            case 1:
                httpURLConnection.setRequestMethod("POST");
                m41279a(httpURLConnection, abstractC13850t);
                return;
            case 2:
                httpURLConnection.setRequestMethod("PUT");
                m41279a(httpURLConnection, abstractC13850t);
                return;
            case 3:
                httpURLConnection.setRequestMethod("DELETE");
                return;
            case 4:
                httpURLConnection.setRequestMethod("HEAD");
                return;
            case 5:
                httpURLConnection.setRequestMethod("OPTIONS");
                return;
            case 6:
                httpURLConnection.setRequestMethod("TRACE");
                return;
            case 7:
                httpURLConnection.setRequestMethod("PATCH");
                m41279a(httpURLConnection, abstractC13850t);
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }
}
