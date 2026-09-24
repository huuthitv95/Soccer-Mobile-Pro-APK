package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import android.media.AudioTrack;
import android.os.SystemClock;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.k */
/* JADX INFO: loaded from: classes4.dex */
public class C8501k {

    /* JADX INFO: renamed from: a */
    public AudioTrack f18962a;

    /* JADX INFO: renamed from: b */
    public boolean f18963b;

    /* JADX INFO: renamed from: c */
    public int f18964c;

    /* JADX INFO: renamed from: d */
    public long f18965d;

    /* JADX INFO: renamed from: e */
    public long f18966e;

    /* JADX INFO: renamed from: f */
    public long f18967f;

    /* JADX INFO: renamed from: g */
    public long f18968g;

    /* JADX INFO: renamed from: h */
    public long f18969h;

    /* JADX INFO: renamed from: i */
    public long f18970i;

    /* JADX INFO: renamed from: a */
    public final long m20984a() {
        if (this.f18968g != -9223372036854775807L) {
            return Math.min(this.f18970i, this.f18969h + ((((SystemClock.elapsedRealtime() * 1000) - this.f18968g) * ((long) this.f18964c)) / 1000000));
        }
        int playState = this.f18962a.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = ((long) this.f18962a.getPlaybackHeadPosition()) & 4294967295L;
        if (this.f18963b) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f18967f = this.f18965d;
            }
            playbackHeadPosition += this.f18967f;
        }
        if (this.f18965d > playbackHeadPosition) {
            this.f18966e++;
        }
        this.f18965d = playbackHeadPosition;
        return playbackHeadPosition + (this.f18966e << 32);
    }

    /* JADX INFO: renamed from: a */
    public final void m20985a(long j) {
        this.f18969h = m20984a();
        this.f18968g = SystemClock.elapsedRealtime() * 1000;
        this.f18970i = j;
        this.f18962a.stop();
    }

    /* JADX INFO: renamed from: a */
    public void mo20986a(AudioTrack audioTrack, boolean z) {
        this.f18962a = audioTrack;
        this.f18963b = z;
        this.f18968g = -9223372036854775807L;
        this.f18965d = 0L;
        this.f18966e = 0L;
        this.f18967f = 0L;
        if (audioTrack != null) {
            this.f18964c = audioTrack.getSampleRate();
        }
    }

    /* JADX INFO: renamed from: b */
    public long mo20987b() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: c */
    public long mo20988c() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: d */
    public final void m20989d() {
        if (this.f18968g != -9223372036854775807L) {
            return;
        }
        this.f18962a.pause();
    }

    /* JADX INFO: renamed from: e */
    public boolean mo20990e() {
        return false;
    }
}
