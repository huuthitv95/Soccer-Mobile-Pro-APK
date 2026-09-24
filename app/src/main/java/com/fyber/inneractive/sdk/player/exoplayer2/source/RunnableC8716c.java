package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.controller.C8456b0;
import com.fyber.inneractive.sdk.player.exoplayer2.AbstractC8515b;
import com.fyber.inneractive.sdk.player.exoplayer2.C8708o;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C8786k;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.c */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8716c implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f20329a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f20330b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f20331c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ C8721f f20332d;

    public RunnableC8716c(C8721f c8721f, C8786k c8786k, int i, int i2, C8708o c8708o, int i3, Object obj, long j, long j2, long j3, long j4, long j5) {
        this.f20332d = c8721f;
        this.f20329a = obj;
        this.f20330b = j;
        this.f20331c = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8456b0 c8456b0 = this.f20332d.f20351b;
        AbstractC8515b.m21012a(this.f20330b);
        C8721f.m21270a(this.f20332d, this.f20331c);
        IAlog.m21945a("%s AdaptiveMediaSourceEventListener onLoadCanceled called.", c8456b0.m20854a());
    }
}
