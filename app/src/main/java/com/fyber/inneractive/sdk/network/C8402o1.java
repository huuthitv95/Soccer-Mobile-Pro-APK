package com.fyber.inneractive.sdk.network;

import okhttp3.Response;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.network.o1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8402o1 extends C8391l {

    /* JADX INFO: renamed from: g */
    public final Response f18692g;

    public C8402o1(C8391l c8391l, Response response) {
        this.f18692g = response;
        this.f18669d = c8391l.f18669d;
        this.f18668c = c8391l.f18668c;
        this.f18670e = c8391l.f18670e;
        this.f18666a = c8391l.f18666a;
    }

    @Override // com.fyber.inneractive.sdk.network.C8391l
    /* JADX INFO: renamed from: a */
    public final void mo20759a() {
        super.mo20759a();
        Response response = this.f18692g;
        if (response != null) {
            response.close();
        }
    }
}
