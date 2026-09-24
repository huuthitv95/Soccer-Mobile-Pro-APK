package com.fyber.inneractive.sdk.network;

import java.io.FilterInputStream;
import java.net.HttpURLConnection;
import java.util.Map;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.network.j */
/* JADX INFO: loaded from: classes4.dex */
public final class C8385j extends C8391l {

    /* JADX INFO: renamed from: g */
    public final HttpURLConnection f18661g;

    public C8385j(HttpURLConnection httpURLConnection, int i, FilterInputStream filterInputStream, Map map, String str) {
        this.f18661g = httpURLConnection;
        this.f18666a = i;
        this.f18668c = filterInputStream;
        this.f18669d = map;
        this.f18670e = str;
    }

    @Override // com.fyber.inneractive.sdk.network.C8391l
    /* JADX INFO: renamed from: a */
    public final void mo20759a() {
        try {
            HttpURLConnection httpURLConnection = this.f18661g;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        } catch (Throwable unused) {
        }
        super.mo20759a();
    }
}
