package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.controller.C8456b0;
import com.fyber.inneractive.sdk.player.exoplayer2.AbstractC8515b;
import com.fyber.inneractive.sdk.player.exoplayer2.C8708o;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.e */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8720e implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f20347a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f20348b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C8721f f20349c;

    public RunnableC8720e(C8721f c8721f, int i, C8708o c8708o, int i2, Object obj, long j) {
        this.f20349c = c8721f;
        this.f20347a = obj;
        this.f20348b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8456b0 c8456b0 = this.f20349c.f20351b;
        AbstractC8515b.m21012a(this.f20348b);
        IAlog.m21945a("%s AdaptiveMediaSourceEventListener onDownstreamFormatChanged called.", c8456b0.m20854a());
    }
}
