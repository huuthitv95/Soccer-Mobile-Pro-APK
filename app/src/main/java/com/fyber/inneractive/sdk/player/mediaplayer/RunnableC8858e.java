package com.fyber.inneractive.sdk.player.mediaplayer;

import android.view.SurfaceHolder;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.mediaplayer.e */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8858e implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ SurfaceHolder f20801a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C8869p f20802b;

    public RunnableC8858e(C8869p c8869p, SurfaceHolder surfaceHolder) {
        this.f20802b = c8869p;
        this.f20801a = surfaceHolder;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8869p.m21405a(this.f20802b, this.f20801a);
    }
}
