package com.fyber.inneractive.sdk.web;

import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.web.c */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC9220c implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC9238i f21527a;

    public RunnableC9220c(AbstractC9240i1 abstractC9240i1) {
        this.f21527a = abstractC9240i1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        IAlog.m21949e("Removing clicked state after timeout", new Object[0]);
        this.f21527a.m22064i();
    }
}
