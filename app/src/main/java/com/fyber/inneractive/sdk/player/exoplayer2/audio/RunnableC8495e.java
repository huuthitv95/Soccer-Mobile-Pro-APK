package com.fyber.inneractive.sdk.player.exoplayer2.audio;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.e */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8495e implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f18946a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f18947b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f18948c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f18949d;

    public RunnableC8495e(AudioRendererEventListener.EventDispatcher eventDispatcher, String str, long j, long j2) {
        this.f18949d = eventDispatcher;
        this.f18946a = str;
        this.f18947b = j;
        this.f18948c = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f18949d.listener.onAudioDecoderInitialized(this.f18946a, this.f18947b, this.f18948c);
    }
}
