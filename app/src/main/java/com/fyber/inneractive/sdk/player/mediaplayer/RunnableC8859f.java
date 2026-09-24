package com.fyber.inneractive.sdk.player.mediaplayer;

import android.view.Surface;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.mediaplayer.f */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8859f implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Surface f20803a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C8869p f20804b;

    public RunnableC8859f(C8869p c8869p, Surface surface) {
        this.f20804b = c8869p;
        this.f20803a = surface;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8869p.m21404a(this.f20804b, this.f20803a);
    }
}
