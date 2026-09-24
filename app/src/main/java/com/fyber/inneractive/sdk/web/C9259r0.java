package com.fyber.inneractive.sdk.web;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.web.r0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9259r0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C9270v0 f21659a;

    public C9259r0(C9270v0 c9270v0) {
        this.f21659a = c9270v0;
    }

    /* JADX INFO: renamed from: a */
    public final void m22088a(boolean z) {
        if (this.f21659a.f21697u.compareAndSet(false, true)) {
            this.f21659a.m22091d("onCancelResult(" + z + ");");
            this.f21659a.f21698v.set(false);
        }
    }
}
