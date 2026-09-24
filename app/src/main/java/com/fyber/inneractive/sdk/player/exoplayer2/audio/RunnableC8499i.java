package com.fyber.inneractive.sdk.player.exoplayer2.audio;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.i */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8499i implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f18958a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f18959b;

    public RunnableC8499i(AudioRendererEventListener.EventDispatcher eventDispatcher, int i) {
        this.f18959b = eventDispatcher;
        this.f18958a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f18959b.listener.onAudioSessionId(this.f18958a);
    }
}
