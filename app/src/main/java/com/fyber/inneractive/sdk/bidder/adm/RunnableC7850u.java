package com.fyber.inneractive.sdk.bidder.adm;

import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.flow.C8078c0;
import com.fyber.inneractive.sdk.response.AbstractC9087e;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.bidder.adm.u */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC7850u implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8078c0 f17507a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Exception f17508b;

    public RunnableC7850u(C8078c0 c8078c0, Exception exc) {
        this.f17507a = c8078c0;
        this.f17508b = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8078c0 c8078c0 = this.f17507a;
        if (c8078c0 != null) {
            c8078c0.m20495a(this.f17508b, InneractiveErrorCode.INVALID_INPUT, new AbstractC9087e[0]);
        }
    }
}
