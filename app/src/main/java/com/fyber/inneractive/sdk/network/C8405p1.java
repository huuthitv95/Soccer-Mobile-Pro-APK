package com.fyber.inneractive.sdk.network;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Pair;
import androidx.webkit.ProxyConfig;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.common.net.HttpHeaders;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.FilterInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.network.p1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8405p1 extends AbstractC8382i implements InterfaceC8379h {

    /* JADX INFO: renamed from: a */
    public final OkHttpClient f18694a = new OkHttpClient().newBuilder().build();

    /* JADX INFO: renamed from: a */
    public static FilterInputStream m20778a(Response response) {
        if (response == null) {
            return null;
        }
        try {
            if (response.body() == null) {
                return null;
            }
            return AbstractC8382i.m20758a(response.body().byteStream(), TextUtils.equals("gzip", response.headers().get("content-encoding")));
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m20779a(Request.Builder builder, String str, String str2) {
        IAlog.m21948d("%s %s : %s", "REQUEST_HEADER", str, str2);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.addHeader(str, str2);
    }

    /* JADX INFO: renamed from: b */
    public static HashMap m20780b(Response response) {
        HashMap map = new HashMap();
        if (response != null) {
            Headers headers = response.headers();
            for (int i = 0; i < headers.size(); i++) {
                String strName = headers.name(i);
                map.put(strName, Collections.singletonList(headers.get(strName)));
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: a */
    public final Pair m20781a(String str, AbstractC8416t0 abstractC8416t0, ArrayList arrayList, String str2, String str3) throws Exception {
        String strHeader;
        C8393l1 c8393l1Mo20752p = abstractC8416t0.mo20752p();
        Request.Builder builder = new Request.Builder();
        m20779a(builder, HttpHeaders.ACCEPT_ENCODING, "gzip");
        m20779a(builder, "User-Agent", str2);
        m20779a(builder, HttpHeaders.IF_MODIFIED_SINCE, str3);
        Map mapMo20782l = abstractC8416t0.mo20782l();
        if (mapMo20782l != null) {
            for (String str4 : mapMo20782l.keySet()) {
                m20779a(builder, str4, (String) mapMo20782l.get(str4));
            }
        }
        builder.url(str);
        if (abstractC8416t0.mo20729m() == EnumC8395m0.POST || abstractC8416t0.mo20729m() == EnumC8395m0.PUT) {
            byte[] bArrMo20727f = abstractC8416t0.mo20727f();
            if (bArrMo20727f == null) {
                throw new Exception("Could not create ok http request. post payload is null");
            }
            builder.post(RequestBody.create(bArrMo20727f, MediaType.parse(abstractC8416t0.mo20730n())));
        }
        Request requestBuild = builder.build();
        boolean z = !(abstractC8416t0 instanceof C8381h1);
        OkHttpClient.Builder builderFollowSslRedirects = this.f18694a.newBuilder().followRedirects(z).followSslRedirects(z);
        long j = c8393l1Mo20752p.f18679a;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        OkHttpClient okHttpClientBuild = builderFollowSslRedirects.connectTimeout(j, timeUnit).readTimeout(c8393l1Mo20752p.f18680b, timeUnit).build();
        abstractC8416t0.mo20747c(System.currentTimeMillis());
        IAlog.m21945a("OkHttpExecutorImpl: start connection timestamp: %s", abstractC8416t0.f18717g);
        try {
            try {
                Response responseExecute = okHttpClientBuild.newCall(requestBuild).execute();
                if (!(abstractC8416t0 instanceof C8381h1) || (!((responseExecute.code() > 300 && responseExecute.code() < 304) || responseExecute.code() == 307 || responseExecute.code() == 308) || (strHeader = responseExecute.header(HttpHeaders.LOCATION, "")) == null)) {
                    Pair pair = new Pair(arrayList, responseExecute);
                    abstractC8416t0.mo20745a(System.currentTimeMillis());
                    IAlog.m21945a("OkHttpExecutorImpl: end connection timestamp: %s", abstractC8416t0.f18717g);
                    return pair;
                }
                if (!strHeader.startsWith(ProxyConfig.MATCH_HTTP) && !strHeader.contains("://") && arrayList.size() > 0) {
                    Uri uri = Uri.parse((String) arrayList.get(arrayList.size() - 1));
                    strHeader = String.format(strHeader.startsWith(RemoteSettings.FORWARD_SLASH_STRING) ? "%s://%s%s" : "%s://%s/%s", uri.getScheme(), uri.getHost(), strHeader);
                }
                String str5 = strHeader;
                arrayList.add(str5);
                if (arrayList.size() > 5) {
                    throw new C8359b("Url chain too big for us");
                }
                Pair pairM20781a = m20781a(str5, abstractC8416t0, arrayList, str2, str3);
                abstractC8416t0.mo20745a(System.currentTimeMillis());
                IAlog.m21945a("OkHttpExecutorImpl: end connection timestamp: %s", abstractC8416t0.f18717g);
                return pairM20781a;
            } catch (Exception e) {
                throw new C8359b(e);
            }
        } catch (Throwable th) {
            abstractC8416t0.mo20745a(System.currentTimeMillis());
            IAlog.m21945a("OkHttpExecutorImpl: end connection timestamp: %s", abstractC8416t0.f18717g);
            throw th;
        }
    }

    @Override // com.fyber.inneractive.sdk.network.InterfaceC8379h
    /* JADX INFO: renamed from: a */
    public final C8391l mo20756a(AbstractC8416t0 abstractC8416t0, String str, String str2) throws Exception {
        IAlog.m21945a("%s okhttp network stack is in use", "OkHttpExecutorImpl");
        try {
            ArrayList arrayList = new ArrayList();
            arrayList.add(abstractC8416t0.mo20732r());
            Pair pairM20781a = m20781a(abstractC8416t0.mo20732r(), abstractC8416t0, arrayList, str, str2);
            Object obj = pairM20781a.second;
            String strMessage = obj != null ? ((Response) obj).message() : "";
            FilterInputStream filterInputStreamM20778a = m20778a((Response) pairM20781a.second);
            Object obj2 = pairM20781a.second;
            int iCode = obj2 == null ? -1 : ((Response) obj2).code();
            HashMap mapM20780b = m20780b((Response) pairM20781a.second);
            Response response = (Response) pairM20781a.second;
            C8402o1 c8402o1 = new C8402o1(AbstractC8382i.m20757a(filterInputStreamM20778a, iCode, strMessage, mapM20780b, response != null ? response.headers().get(HttpHeaders.LAST_MODIFIED) : null), (Response) pairM20781a.second);
            Iterator it = ((List) pairM20781a.first).iterator();
            while (it.hasNext()) {
                c8402o1.f18671f.add((String) it.next());
            }
            return c8402o1;
        } catch (C8359b e) {
            IAlog.m21946b("%s cannot connect exception: %s", "OkHttpExecutorImpl", e.getMessage());
            throw e;
        } catch (Exception e2) {
            IAlog.m21946b("%s exception: %s", "OkHttpExecutorImpl", e2.getMessage());
            throw e2;
        }
    }
}
