package com.fyber.inneractive.sdk.bidder.adm;

import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.flow.C8078c0;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.bidder.adm.t */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC7849t implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8078c0 f17504a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C8006r f17505b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C7854y f17506c;

    public RunnableC7849t(C7854y c7854y, C8078c0 c8078c0, C8006r c8006r) {
        this.f17506c = c7854y;
        this.f17504a = c8078c0;
        this.f17505b = c8006r;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f17506c.m20334a(this.f17504a, this.f17505b);
    }
}
