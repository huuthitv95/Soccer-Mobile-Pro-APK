package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3;

import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.e */
/* JADX INFO: loaded from: classes9.dex */
public final class C8583e implements InterfaceC8580b {

    /* JADX INFO: renamed from: a */
    public final long f19518a;

    /* JADX INFO: renamed from: b */
    public final long f19519b;

    /* JADX INFO: renamed from: c */
    public final long f19520c;

    /* JADX INFO: renamed from: d */
    public final long[] f19521d;

    /* JADX INFO: renamed from: e */
    public final long f19522e;

    /* JADX INFO: renamed from: f */
    public final int f19523f;

    public C8583e(long j, long j2, long j3, long[] jArr, long j4, int i) {
        this.f19518a = j;
        this.f19519b = j2;
        this.f19520c = j3;
        this.f19521d = jArr;
        this.f19522e = j4;
        this.f19523f = i;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8628q
    /* JADX INFO: renamed from: a */
    public final long mo21019a(long j) {
        if (!mo21020a()) {
            return this.f19518a;
        }
        float f = (j * 100.0f) / this.f19519b;
        float f2 = 0.0f;
        if (f > 0.0f) {
            if (f >= 100.0f) {
                f2 = 256.0f;
            } else {
                int i = (int) f;
                f2 = i != 0 ? this.f19521d[i - 1] : 0.0f;
                f2 += (f - i) * ((i < 99 ? this.f19521d[i] : 256.0f) - f2);
            }
        }
        long jRound = Math.round(((double) f2) * 0.00390625d * this.f19522e);
        long j2 = this.f19518a;
        long j3 = jRound + j2;
        long j4 = this.f19520c;
        return Math.min(j3, j4 != -1 ? j4 - 1 : ((j2 - ((long) this.f19523f)) + this.f19522e) - 1);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8628q
    /* JADX INFO: renamed from: a */
    public final boolean mo21020a() {
        return this.f19521d != null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.InterfaceC8580b
    /* JADX INFO: renamed from: b */
    public final long mo21118b(long j) {
        long j2;
        if (!mo21020a()) {
            return 0L;
        }
        long j3 = this.f19518a;
        if (j < j3) {
            return 0L;
        }
        double d = ((j - j3) * 256.0d) / this.f19522e;
        int iM21380a = AbstractC8827z.m21380a(this.f19521d, (long) d, false);
        int i = iM21380a + 1;
        long j4 = this.f19519b;
        long j5 = (((long) i) * j4) / 100;
        long j6 = i == 0 ? 0L : this.f19521d[iM21380a];
        long j7 = i == 99 ? 256L : this.f19521d[i];
        long j8 = (j4 * ((long) (iM21380a + 2))) / 100;
        if (j7 == j6) {
            j2 = 0;
        } else {
            j2 = (long) (((d - j6) * (j8 - j5)) / (j7 - j6));
        }
        return j5 + j2;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8628q
    /* JADX INFO: renamed from: c */
    public final long mo21021c() {
        return this.f19519b;
    }
}
