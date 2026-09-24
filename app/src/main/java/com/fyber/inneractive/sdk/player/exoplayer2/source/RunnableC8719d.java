package com.fyber.inneractive.sdk.player.exoplayer2.source;

import com.fyber.inneractive.sdk.player.controller.C8456b0;
import com.fyber.inneractive.sdk.player.exoplayer2.AbstractC8515b;
import com.fyber.inneractive.sdk.player.exoplayer2.C8708o;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C8786k;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.IOException;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.source.d */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8719d implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Object f20342a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f20343b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f20344c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ IOException f20345d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ C8721f f20346e;

    public RunnableC8719d(C8721f c8721f, C8786k c8786k, int i, int i2, C8708o c8708o, int i3, Object obj, long j, long j2, long j3, long j4, long j5, IOException iOException, boolean z) {
        this.f20346e = c8721f;
        this.f20342a = obj;
        this.f20343b = j;
        this.f20344c = j2;
        this.f20345d = iOException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8456b0 c8456b0 = this.f20346e.f20351b;
        AbstractC8515b.m21012a(this.f20343b);
        C8721f.m21270a(this.f20346e, this.f20344c);
        IAlog.m21945a("%s AdaptiveMediaSourceEventListener onLoadError called. with exception %s", c8456b0.m20854a(), this.f20345d);
    }
}
