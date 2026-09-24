package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.controller.C8456b0;
import com.fyber.inneractive.sdk.player.exoplayer2.AbstractC8515b;
import com.fyber.inneractive.sdk.player.exoplayer2.C8708o;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C8786k;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.b */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8715b implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f20325a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f20326b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f20327c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C8721f f20328d;

    public RunnableC8715b(C8721f c8721f, C8786k c8786k, int i, int i2, C8708o c8708o, int i3, Object obj, long j, long j2, long j3, long j4, long j5) {
        this.f20328d = c8721f;
        this.f20325a = obj;
        this.f20326b = j;
        this.f20327c = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8456b0 c8456b0 = this.f20328d.f20351b;
        AbstractC8515b.m21012a(this.f20326b);
        C8721f.m21270a(this.f20328d, this.f20327c);
        IAlog.m21945a("%s AdaptiveMediaSourceEventListener onLoadCompleted called.", c8456b0.m20854a());
    }
}
