package com.fyber.inneractive.sdk.network;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import androidx.webkit.ProxyConfig;
import com.fyber.inneractive.sdk.config.C8040s;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.common.net.HttpHeaders;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.network.k */
/* JADX INFO: loaded from: classes4.dex */
public final class C8388k extends AbstractC8382i implements InterfaceC8379h {
    /* JADX INFO: renamed from: a */
    public static Pair m20760a(AbstractC8416t0 abstractC8416t0, ArrayList arrayList, URL url, String str, String str2) throws C8359b {
        String headerField;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            abstractC8416t0.getClass();
            if (abstractC8416t0 instanceof C8381h1) {
                httpURLConnection.setInstanceFollowRedirects(false);
            }
            C8393l1 c8393l1Mo20752p = abstractC8416t0.mo20752p();
            httpURLConnection.setConnectTimeout(c8393l1Mo20752p.f18679a);
            httpURLConnection.setReadTimeout(c8393l1Mo20752p.f18680b);
            m20762a(httpURLConnection, "User-Agent", str);
            m20762a(httpURLConnection, HttpHeaders.IF_MODIFIED_SINCE, str2);
            m20762a(httpURLConnection, HttpHeaders.ACCEPT_ENCODING, "gzip");
            C8040s c8040s = IAConfigManager.f17654M.f17688t;
            if (c8040s != null && c8040s.f17862b.m20443a("add_accept", 1, 0) == 1) {
                m20762a(httpURLConnection, HttpHeaders.ACCEPT, "*/*");
            }
            Map mapMo20782l = abstractC8416t0.mo20782l();
            if (mapMo20782l != null) {
                for (String str3 : mapMo20782l.keySet()) {
                    m20762a(httpURLConnection, str3, (String) mapMo20782l.get(str3));
                }
            }
            abstractC8416t0.mo20747c(System.currentTimeMillis());
            if (abstractC8416t0.mo20729m() == EnumC8395m0.POST || abstractC8416t0.mo20729m() == EnumC8395m0.PUT) {
                m20761a(httpURLConnection, abstractC8416t0);
            } else {
                httpURLConnection.connect();
            }
            int responseCode = httpURLConnection.getResponseCode();
            abstractC8416t0.mo20745a(System.currentTimeMillis());
            IAlog.m21945a("%s (%s) response code - %d", abstractC8416t0.toString(), url, Integer.valueOf(responseCode));
            if (!(abstractC8416t0 instanceof C8381h1) || (!((responseCode > 300 && responseCode < 304) || responseCode == 307 || responseCode == 308) || (headerField = httpURLConnection.getHeaderField(HttpHeaders.LOCATION)) == null)) {
                return new Pair(arrayList, httpURLConnection);
            }
            if (!headerField.startsWith(ProxyConfig.MATCH_HTTP) && !headerField.contains("://") && arrayList.size() > 0) {
                Uri uri = Uri.parse((String) arrayList.get(arrayList.size() - 1));
                headerField = String.format(headerField.startsWith(RemoteSettings.FORWARD_SLASH_STRING) ? "%s://%s%s" : "%s://%s/%s", uri.getScheme(), uri.getHost(), headerField);
            }
            arrayList.add(headerField);
            if (arrayList.size() <= 20) {
                return headerField.startsWith(ProxyConfig.MATCH_HTTP) ? m20760a(abstractC8416t0, arrayList, new URL(headerField), str, str2) : Pair.create(arrayList, null);
            }
            throw new C8359b("Url chain too big for us");
        } catch (Exception e) {
            abstractC8416t0.mo20745a(System.currentTimeMillis());
            IAlog.m21945a("failed executing network request for url: %s msg: %s", abstractC8416t0.mo20732r(), e.getMessage());
            throw new C8359b(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m20761a(HttpURLConnection httpURLConnection, AbstractC8416t0 abstractC8416t0) throws IOException {
        httpURLConnection.setRequestMethod(abstractC8416t0.mo20729m().key);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        byte[] bArrMo20727f = abstractC8416t0.mo20727f();
        httpURLConnection.setRequestProperty(HttpHeaders.CONTENT_LENGTH, "" + (bArrMo20727f != null ? bArrMo20727f.length : 0));
        httpURLConnection.setRequestProperty("Content-Type", abstractC8416t0.mo20730n());
        httpURLConnection.connect();
        OutputStream outputStream = httpURLConnection.getOutputStream();
        outputStream.write(bArrMo20727f);
        try {
            outputStream.close();
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m20762a(HttpURLConnection httpURLConnection, String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        IAlog.m21948d("%s %s : %s", "REQUEST_HEADER", str, str2);
        httpURLConnection.addRequestProperty(str, str2);
    }

    @Override // com.fyber.inneractive.sdk.network.InterfaceC8379h
    /* JADX INFO: renamed from: a */
    public final C8391l mo20756a(AbstractC8416t0 abstractC8416t0, String str, String str2) throws C8359b, C8408q1, C8417t1 {
        C8391l c8391lM20757a;
        IAlog.m21945a("%s hurl network stack is in use", "HttpExecutorImpl");
        String strMo20732r = abstractC8416t0.mo20732r();
        URL url = new URL(strMo20732r);
        ArrayList arrayList = new ArrayList();
        arrayList.add(strMo20732r);
        Pair pairM20760a = m20760a(abstractC8416t0, arrayList, url, str, str2);
        HttpURLConnection httpURLConnection = (HttpURLConnection) pairM20760a.second;
        List list = (List) pairM20760a.first;
        if (httpURLConnection == null) {
            try {
                if (list.size() <= 0) {
                    throw new C8408q1();
                }
            } catch (SocketTimeoutException e) {
                throw new C8417t1(e);
            } catch (IOException e2) {
                IAlog.m21945a("failed reading network response for url: %s msg: %s", httpURLConnection.getURL(), e2.getMessage());
                throw new C8408q1(e2);
            }
        }
        FilterInputStream filterInputStreamM20758a = null;
        if (httpURLConnection == null) {
            c8391lM20757a = AbstractC8382i.m20757a(null, 200, "", null, null);
        } else {
            try {
                filterInputStreamM20758a = AbstractC8382i.m20758a(httpURLConnection.getInputStream(), TextUtils.equals("gzip", httpURLConnection.getContentEncoding()));
            } catch (Exception unused) {
            }
            c8391lM20757a = AbstractC8382i.m20757a(filterInputStreamM20758a, httpURLConnection.getResponseCode(), httpURLConnection.getResponseMessage(), httpURLConnection.getHeaderFields(), httpURLConnection.getHeaderField(HttpHeaders.LAST_MODIFIED));
        }
        C8385j c8385j = new C8385j(httpURLConnection, c8391lM20757a.f18666a, (FilterInputStream) c8391lM20757a.f18668c, c8391lM20757a.f18669d, c8391lM20757a.f18670e);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c8385j.f18671f.add((String) it.next());
        }
        return c8385j;
    }
}
