package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3;

import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.a */
/* JADX INFO: loaded from: classes4.dex */
public final class C8579a implements InterfaceC8580b {

    /* JADX INFO: renamed from: a */
    public final long f19497a;

    /* JADX INFO: renamed from: b */
    public final int f19498b;

    /* JADX INFO: renamed from: c */
    public final long f19499c;

    public C8579a(int i, long j, long j2) {
        this.f19497a = j;
        this.f19498b = i;
        this.f19499c = j2 == -1 ? -9223372036854775807L : mo21118b(j2);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8628q
    /* JADX INFO: renamed from: a */
    public final long mo21019a(long j) {
        long j2 = this.f19499c;
        if (j2 == -9223372036854775807L) {
            return 0L;
        }
        int i = AbstractC8827z.f20671a;
        long jMax = Math.max(0L, Math.min(j, j2));
        return ((jMax * ((long) this.f19498b)) / 8000000) + this.f19497a;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8628q
    /* JADX INFO: renamed from: a */
    public final boolean mo21020a() {
        return this.f19499c != -9223372036854775807L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.InterfaceC8580b
    /* JADX INFO: renamed from: b */
    public final long mo21118b(long j) {
        return (Math.max(0L, j - this.f19497a) * 8000000) / ((long) this.f19498b);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8628q
    /* JADX INFO: renamed from: c */
    public final long mo21021c() {
        return this.f19499c;
    }
}
