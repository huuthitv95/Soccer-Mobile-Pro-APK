package com.fyber.inneractive.sdk.player.controller;

import com.fyber.inneractive.sdk.player.exoplayer2.C8667g;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.controller.e */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8461e implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8463f f18833a;

    public RunnableC8461e(C8463f c8463f) {
        this.f18833a = c8463f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8667g c8667g = this.f18833a.f18843s;
        if (c8667g != null) {
            c8667g.m21189a(c8667g.m21188a(), -9223372036854775807L);
            this.f18833a.f18843s.f20129d.f20182f.sendEmptyMessage(5);
            C8667g c8667g2 = this.f18833a.f18843s;
            c8667g2.f20129d.m21216d();
            c8667g2.f20128c.removeCallbacksAndMessages(null);
            this.f18833a.f18843s = null;
        }
    }
}
