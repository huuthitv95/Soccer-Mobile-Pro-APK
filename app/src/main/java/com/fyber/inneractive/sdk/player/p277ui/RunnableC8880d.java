package com.fyber.inneractive.sdk.player.p277ui;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.ui.d */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8880d implements Runnable {

    /* JADX INFO: renamed from: a */
    public final boolean f20874a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC8881e f20875b;

    public RunnableC8880d(AbstractC8881e abstractC8881e, boolean z) {
        this.f20875b = abstractC8881e;
        this.f20874a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f20874a == this.f20875b.hasWindowFocus()) {
            this.f20875b.m21430f();
        }
    }
}
