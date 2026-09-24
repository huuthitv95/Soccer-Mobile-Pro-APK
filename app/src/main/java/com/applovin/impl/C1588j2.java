package com.applovin.impl;

import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.applovin.impl.j2 */
/* JADX INFO: loaded from: classes3.dex */
public class C1588j2 implements InterfaceC1578i2 {

    /* JADX INFO: renamed from: a */
    private final C1748l f1889a;

    /* JADX INFO: renamed from: b */
    private final C1768p f1890b;

    public C1588j2(C1748l c1748l) {
        this.f1889a = c1748l;
        this.f1890b = c1748l.m4782Q();
    }

    @Override // com.applovin.impl.InterfaceC1578i2
    /* JADX INFO: renamed from: a */
    public InputStream mo2582a(String str, Map map) throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setConnectTimeout(((Integer) this.f1889a.m4801a(C1831z4.f3849W2)).intValue());
        httpURLConnection.setReadTimeout(((Integer) this.f1889a.m4801a(C1831z4.f3857X2)).intValue());
        httpURLConnection.setDefaultUseCaches(true);
        httpURLConnection.setUseCaches(true);
        httpURLConnection.setAllowUserInteraction(false);
        httpURLConnection.setInstanceFollowRedirects(true);
        int responseCode = httpURLConnection.getResponseCode();
        this.f1889a.m4764E().m4330a("loadResource", str, responseCode, httpURLConnection.getResponseMessage());
        if (AbstractC1714s0.m4314a(responseCode)) {
            return null;
        }
        if (C1768p.m5160a()) {
            this.f1890b.m5171a("HttpUrlConnectionLoader", "Opened stream to resource " + str);
        }
        InputStream inputStream = httpURLConnection.getInputStream();
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("url", str);
        mapHashMap.putAll(map);
        CollectionUtils.putStringIfValid("source", "HttpUrlConnectionLoader", mapHashMap);
        this.f1889a.m4830g().m2682d(C1548f2.f1496Q, mapHashMap);
        return inputStream;
    }
}
