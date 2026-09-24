package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import com.fyber.inneractive.sdk.player.exoplayer2.C8708o;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.f */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8496f implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8708o f18950a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f18951b;

    public RunnableC8496f(AudioRendererEventListener.EventDispatcher eventDispatcher, C8708o c8708o) {
        this.f18951b = eventDispatcher;
        this.f18950a = c8708o;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f18951b.listener.onAudioInputFormatChanged(this.f18950a);
    }
}
