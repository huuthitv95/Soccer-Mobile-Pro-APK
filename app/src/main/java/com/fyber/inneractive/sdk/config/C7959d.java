package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.InterfaceC9194u1;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.d */
/* JADX INFO: loaded from: classes4.dex */
public final class C7959d implements InterfaceC9194u1 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C7961e f17714a;

    public C7959d(C7961e c7961e) {
        this.f17714a = c7961e;
    }

    @Override // com.fyber.inneractive.sdk.util.InterfaceC9194u1
    /* JADX INFO: renamed from: a */
    public final void mo20394a() {
        IAlog.m21945a("onVisibleTimeReached: %s", Long.valueOf(System.currentTimeMillis()));
        this.f17714a.f17718c = true;
    }
}
