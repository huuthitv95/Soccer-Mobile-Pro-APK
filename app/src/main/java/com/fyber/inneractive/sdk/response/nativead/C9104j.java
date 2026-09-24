package com.fyber.inneractive.sdk.response.nativead;

import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.flow.vast.AbstractC8233j;
import com.fyber.inneractive.sdk.response.C9089g;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.response.nativead.j */
/* JADX INFO: loaded from: classes4.dex */
public final class C9104j extends C9089g {

    /* JADX INFO: renamed from: Q */
    public final C9105k f21360Q = new C9105k();

    @Override // com.fyber.inneractive.sdk.response.C9089g, com.fyber.inneractive.sdk.response.AbstractC9087e
    /* JADX INFO: renamed from: a */
    public final InneractiveErrorCode mo21891a(InneractiveAdRequest inneractiveAdRequest, C8006r c8006r) {
        InneractiveErrorCode inneractiveErrorCodeM20632a = this.f21360Q.m21900d() ? AbstractC8233j.m20632a(inneractiveAdRequest, this, c8006r) : null;
        if (inneractiveErrorCodeM20632a != null) {
            return inneractiveErrorCodeM20632a;
        }
        this.f21360Q.getClass();
        return null;
    }

    @Override // com.fyber.inneractive.sdk.response.C9089g, com.fyber.inneractive.sdk.response.AbstractC9087e
    /* JADX INFO: renamed from: b */
    public final InneractiveErrorCode mo21894b() {
        return mo21891a(null, null);
    }
}
