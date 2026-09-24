package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import android.media.AudioTrack;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.j */
/* JADX INFO: loaded from: classes4.dex */
public final class C8500j extends Thread {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AudioTrack f18960a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C8508r f18961b;

    public C8500j(C8508r c8508r, AudioTrack audioTrack) {
        this.f18961b = c8508r;
        this.f18960a = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            this.f18960a.flush();
            this.f18960a.release();
        } finally {
            this.f18961b.f19011e.open();
        }
    }
}
