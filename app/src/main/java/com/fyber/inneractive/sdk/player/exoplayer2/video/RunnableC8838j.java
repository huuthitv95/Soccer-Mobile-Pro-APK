package com.fyber.inneractive.sdk.player.exoplayer2.video;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.j */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC8838j implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ String f20746a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ long f20747b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ long f20748c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ VideoRendererEventListener.EventDispatcher f20749d;

    public RunnableC8838j(VideoRendererEventListener.EventDispatcher eventDispatcher, String str, long j, long j2) {
        this.f20749d = eventDispatcher;
        this.f20746a = str;
        this.f20747b = j;
        this.f20748c = j2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20749d.listener.onVideoDecoderInitialized(this.f20746a, this.f20747b, this.f20748c);
    }
}
