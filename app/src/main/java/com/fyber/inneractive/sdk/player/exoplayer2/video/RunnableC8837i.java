package com.fyber.inneractive.sdk.player.exoplayer2.video;

import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.i */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8837i implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DecoderCounters f20744a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f20745b;

    public RunnableC8837i(VideoRendererEventListener.EventDispatcher eventDispatcher, DecoderCounters decoderCounters) {
        this.f20745b = eventDispatcher;
        this.f20744a = decoderCounters;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20745b.listener.onVideoEnabled(this.f20744a);
    }
}
