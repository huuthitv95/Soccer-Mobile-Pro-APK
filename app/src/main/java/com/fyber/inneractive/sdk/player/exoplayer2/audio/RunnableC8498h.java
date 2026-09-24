package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import com.fyber.inneractive.sdk.player.exoplayer2.decoder.DecoderCounters;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.h */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8498h implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ DecoderCounters f18956a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f18957b;

    public RunnableC8498h(AudioRendererEventListener.EventDispatcher eventDispatcher, DecoderCounters decoderCounters) {
        this.f18957b = eventDispatcher;
        this.f18956a = decoderCounters;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f18956a.ensureUpdated();
        this.f18957b.listener.onAudioDisabled(this.f18956a);
    }
}
