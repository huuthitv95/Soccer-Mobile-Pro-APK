package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.d */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8494d implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DecoderCounters f18944a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f18945b;

    public RunnableC8494d(AudioRendererEventListener.EventDispatcher eventDispatcher, DecoderCounters decoderCounters) {
        this.f18945b = eventDispatcher;
        this.f18944a = decoderCounters;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f18945b.listener.onAudioEnabled(this.f18944a);
    }
}
