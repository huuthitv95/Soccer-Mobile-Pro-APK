package com.applovin.impl;

import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.shadow.okhttp3.OkHttpClient;
import com.applovin.shadow.okhttp3.Request;
import com.applovin.shadow.okhttp3.Response;
import com.applovin.shadow.okhttp3.ResponseBody;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.applovin.impl.f4 */
/* JADX INFO: loaded from: classes3.dex */
public class C1550f4 implements InterfaceC1578i2 {

    /* JADX INFO: renamed from: a */
    private final C1748l f1588a;

    /* JADX INFO: renamed from: b */
    private final C1768p f1589b;

    /* JADX INFO: renamed from: c */
    private final AtomicReference f1590c = new AtomicReference();

    public C1550f4(C1748l c1748l) {
        this.f1588a = c1748l;
        this.f1589b = c1748l.m4782Q();
    }

    /* JADX INFO: renamed from: a */
    private OkHttpClient m2581a() {
        Object objBuild = this.f1590c.get();
        if (objBuild == null) {
            synchronized (this.f1590c) {
                objBuild = this.f1590c.get();
                if (objBuild == null) {
                    OkHttpClient.Builder builder = new OkHttpClient.Builder();
                    long jIntValue = ((Integer) this.f1588a.m4801a(C1831z4.f3849W2)).intValue();
                    TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                    objBuild = builder.connectTimeout(jIntValue, timeUnit).readTimeout(((Integer) this.f1588a.m4801a(C1831z4.f3857X2)).intValue(), timeUnit).followRedirects(true).followSslRedirects(true).build();
                    if (objBuild == null) {
                        objBuild = this.f1590c;
                    }
                    this.f1590c.set(objBuild);
                }
            }
        }
        if (objBuild == this.f1590c) {
            objBuild = null;
        }
        return (OkHttpClient) objBuild;
    }

    @Override // com.applovin.impl.InterfaceC1578i2
    /* JADX INFO: renamed from: a */
    public InputStream mo2582a(String str, Map map) throws IOException {
        Response responseExecute = m2581a().newCall(new Request.Builder().url(str).get().build()).execute();
        int iCode = responseExecute.code();
        this.f1588a.m4764E().m4330a("loadResource", str, iCode, responseExecute.message());
        if (AbstractC1714s0.m4314a(iCode)) {
            return null;
        }
        if (C1768p.m5160a()) {
            this.f1589b.m5171a("OkHttpLoader", "Opened stream to resource " + str);
        }
        ResponseBody responseBodyBody = responseExecute.body();
        if (responseBodyBody == null) {
            return null;
        }
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("url", str);
        mapHashMap.putAll(map);
        CollectionUtils.putStringIfValid("source", "OkHttpLoader", mapHashMap);
        CollectionUtils.putStringIfValid("details", responseExecute.protocol().name(), mapHashMap);
        this.f1588a.m4830g().m2682d(C1548f2.f1496Q, mapHashMap);
        return responseBodyBody.byteStream();
    }
}
