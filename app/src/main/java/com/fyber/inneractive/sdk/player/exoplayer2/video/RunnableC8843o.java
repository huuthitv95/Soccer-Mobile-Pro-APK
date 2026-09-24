package com.fyber.inneractive.sdk.player.exoplayer2.video;

import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.o */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8843o implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DecoderCounters f20762a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f20763b;

    public RunnableC8843o(VideoRendererEventListener.EventDispatcher eventDispatcher, DecoderCounters decoderCounters) {
        this.f20763b = eventDispatcher;
        this.f20762a = decoderCounters;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20762a.ensureUpdated();
        this.f20763b.listener.onVideoDisabled(this.f20762a);
    }
}
