package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import android.media.AudioTimestamp;
import android.media.AudioTrack;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.l */
/* JADX INFO: loaded from: classes4.dex */
public final class C8502l extends C8501k {

    /* JADX INFO: renamed from: j */
    public final AudioTimestamp f18971j = new AudioTimestamp();

    /* JADX INFO: renamed from: k */
    public long f18972k;

    /* JADX INFO: renamed from: l */
    public long f18973l;

    /* JADX INFO: renamed from: m */
    public long f18974m;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.C8501k
    /* JADX INFO: renamed from: a */
    public final void mo20986a(AudioTrack audioTrack, boolean z) {
        super.mo20986a(audioTrack, z);
        this.f18972k = 0L;
        this.f18973l = 0L;
        this.f18974m = 0L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.C8501k
    /* JADX INFO: renamed from: b */
    public final long mo20987b() {
        return this.f18974m;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.C8501k
    /* JADX INFO: renamed from: c */
    public final long mo20988c() {
        return this.f18971j.nanoTime;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.C8501k
    /* JADX INFO: renamed from: e */
    public final boolean mo20990e() {
        boolean timestamp = this.f18962a.getTimestamp(this.f18971j);
        if (timestamp) {
            long j = this.f18971j.framePosition;
            if (this.f18973l > j) {
                this.f18972k++;
            }
            this.f18973l = j;
            this.f18974m = j + (this.f18972k << 32);
        }
        return timestamp;
    }
}
