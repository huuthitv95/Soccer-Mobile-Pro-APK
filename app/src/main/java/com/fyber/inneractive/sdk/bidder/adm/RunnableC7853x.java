package com.fyber.inneractive.sdk.bidder.adm;

import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.flow.C8078c0;
import com.fyber.inneractive.sdk.response.AbstractC9087e;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.bidder.adm.x */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC7853x implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8078c0 f17513a;

    public RunnableC7853x(C8078c0 c8078c0) {
        this.f17513a = c8078c0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8078c0 c8078c0 = this.f17513a;
        if (c8078c0 != null) {
            c8078c0.m20495a(new Exception("adm payload must contain ad url"), InneractiveErrorCode.INVALID_INPUT, new AbstractC9087e[0]);
        }
    }
}
