package com.fyber.inneractive.sdk.player.exoplayer2.audio;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.g */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8497g implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f18952a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f18953b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f18954c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ AudioRendererEventListener.EventDispatcher f18955d;

    public RunnableC8497g(AudioRendererEventListener.EventDispatcher eventDispatcher, int i, long j, long j2) {
        this.f18955d = eventDispatcher;
        this.f18952a = i;
        this.f18953b = j;
        this.f18954c = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f18955d.listener.onAudioTrackUnderrun(this.f18952a, this.f18953b, this.f18954c);
    }
}
