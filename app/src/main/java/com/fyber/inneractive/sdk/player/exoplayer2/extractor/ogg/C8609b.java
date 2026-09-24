package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8527b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8628q;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.b */
/* JADX INFO: loaded from: classes4.dex */
public final class C8609b implements InterfaceC8615h {

    /* JADX INFO: renamed from: a */
    public final C8614g f19795a = new C8614g();

    /* JADX INFO: renamed from: b */
    public final long f19796b;

    /* JADX INFO: renamed from: c */
    public final long f19797c;

    /* JADX INFO: renamed from: d */
    public final AbstractC8619l f19798d;

    /* JADX INFO: renamed from: e */
    public int f19799e;

    /* JADX INFO: renamed from: f */
    public long f19800f;

    /* JADX INFO: renamed from: g */
    public long f19801g;

    /* JADX INFO: renamed from: h */
    public long f19802h;

    /* JADX INFO: renamed from: i */
    public long f19803i;

    /* JADX INFO: renamed from: j */
    public long f19804j;

    /* JADX INFO: renamed from: k */
    public long f19805k;

    /* JADX INFO: renamed from: l */
    public long f19806l;

    public C8609b(long j, long j2, AbstractC8619l abstractC8619l, int i, long j3) {
        if (j < 0 || j2 <= j) {
            throw new IllegalArgumentException();
        }
        this.f19798d = abstractC8619l;
        this.f19796b = j;
        this.f19797c = j2;
        if (i != j2 - j) {
            this.f19799e = 0;
        } else {
            this.f19800f = j3;
            this.f19799e = 3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00d4 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:48:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:51:0x00e7 A[LOOP:0: B:49:0x00df->B:51:0x00e7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:71:0x00f8 A[EDGE_INSN: B:71:0x00f8->B:52:0x00f8 BREAK  A[LOOP:0: B:49:0x00df->B:51:0x00e7], SYNTHETIC] */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.InterfaceC8615h
    /* JADX INFO: renamed from: a */
    public final long mo21147a(C8527b c8527b) throws InterruptedException, IOException {
        C8614g c8614g;
        long j;
        long jMin;
        long j2;
        long j3;
        C8614g c8614g2;
        int i;
        int i2 = this.f19799e;
        long j4 = 0;
        if (i2 == 0) {
            long j5 = c8527b.f19124c;
            this.f19801g = j5;
            this.f19799e = 1;
            long j6 = this.f19797c - 65307;
            if (j6 > j5) {
                return j6;
            }
        } else if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    return -1L;
                }
                throw new IllegalStateException();
            }
            long j7 = this.f19802h;
            if (j7 == 0) {
                i = 3;
                j = 2;
            } else {
                long j8 = this.f19803i;
                long j9 = this.f19804j;
                if (j8 == j9) {
                    j2 = this.f19805k;
                } else {
                    long j10 = c8527b.f19124c;
                    if (m21148a(c8527b, j9)) {
                        this.f19795a.m21156a(c8527b, false);
                        c8527b.f19126e = 0;
                        C8614g c8614g3 = this.f19795a;
                        long j11 = c8614g3.f19822b;
                        long j12 = j7 - j11;
                        int i3 = c8614g3.f19824d + c8614g3.f19825e;
                        if (j12 < 0 || j12 > 72000) {
                            if (j12 < 0) {
                                this.f19804j = j10;
                                this.f19806l = j11;
                                j = 2;
                            } else {
                                j = 2;
                                long j13 = i3;
                                long j14 = c8527b.f19124c + j13;
                                this.f19803i = j14;
                                this.f19805k = j11;
                                if ((this.f19804j - j14) + j13 < SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) {
                                    c8527b.m21023a(i3);
                                    jMin = -(this.f19805k + 2);
                                }
                            }
                            long j15 = this.f19804j;
                            long j16 = this.f19803i;
                            long j17 = j15 - j16;
                            if (j17 < SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US) {
                                this.f19804j = j16;
                                jMin = j16;
                            } else {
                                jMin = Math.min(Math.max(((j17 * j12) / (this.f19806l - this.f19805k)) + (c8527b.f19124c - ((long) (i3 * (j12 <= 0 ? 2 : 1)))), j16), this.f19804j - 1);
                            }
                        } else {
                            c8527b.m21023a(i3);
                            j2 = this.f19795a.f19822b;
                        }
                    } else {
                        jMin = this.f19803i;
                        if (jMin == j10) {
                            throw new IOException("No ogg page can be found.");
                        }
                        j = 2;
                    }
                    if (jMin >= 0) {
                        return jMin;
                    }
                    j3 = this.f19802h;
                    j4 = -(jMin + j);
                    this.f19795a.m21156a(c8527b, false);
                    while (true) {
                        c8614g2 = this.f19795a;
                        if (c8614g2.f19822b < j3) {
                            break;
                        }
                        c8527b.m21023a(c8614g2.f19824d + c8614g2.f19825e);
                        C8614g c8614g4 = this.f19795a;
                        long j18 = c8614g4.f19822b;
                        c8614g4.m21156a(c8527b, false);
                        j4 = j18;
                    }
                    c8527b.f19126e = 0;
                    i = 3;
                }
                jMin = -(j2 + 2);
                j = 2;
                if (jMin >= 0) {
                    return jMin;
                }
                j3 = this.f19802h;
                j4 = -(jMin + j);
                this.f19795a.m21156a(c8527b, false);
                while (true) {
                    c8614g2 = this.f19795a;
                    if (c8614g2.f19822b < j3) {
                        break;
                        break;
                    }
                    c8527b.m21023a(c8614g2.f19824d + c8614g2.f19825e);
                    C8614g c8614g5 = this.f19795a;
                    long j19 = c8614g5.f19822b;
                    c8614g5.m21156a(c8527b, false);
                    j4 = j19;
                }
                c8527b.f19126e = 0;
                i = 3;
            }
            this.f19799e = i;
            return -(j4 + j);
        }
        if (!m21148a(c8527b, this.f19797c)) {
            throw new EOFException();
        }
        C8614g c8614g6 = this.f19795a;
        c8614g6.f19821a = 0;
        c8614g6.f19822b = 0L;
        c8614g6.f19823c = 0;
        c8614g6.f19824d = 0;
        c8614g6.f19825e = 0;
        while (true) {
            c8614g = this.f19795a;
            if ((c8614g.f19821a & 4) == 4 || c8527b.f19124c >= this.f19797c) {
                break;
            }
            c8614g.m21156a(c8527b, false);
            C8614g c8614g7 = this.f19795a;
            c8527b.m21023a(c8614g7.f19824d + c8614g7.f19825e);
        }
        this.f19800f = c8614g.f19822b;
        this.f19799e = 3;
        return this.f19801g;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m21148a(C8527b c8527b, long j) throws InterruptedException, EOFException {
        int i;
        long jMin = Math.min(j + 3, this.f19797c);
        int i2 = 2048;
        byte[] bArr = new byte[2048];
        while (true) {
            long j2 = c8527b.f19124c;
            int i3 = 0;
            if (((long) i2) + j2 > jMin && (i2 = (int) (jMin - j2)) < 4) {
                return false;
            }
            c8527b.m21025a(bArr, 0, i2, false);
            while (true) {
                i = i2 - 3;
                if (i3 < i) {
                    if (bArr[i3] == 79 && bArr[i3 + 1] == 103 && bArr[i3 + 2] == 103 && bArr[i3 + 3] == 83) {
                        c8527b.m21023a(i3);
                        return true;
                    }
                    i3++;
                }
            }
            c8527b.m21023a(i);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.InterfaceC8615h
    /* JADX INFO: renamed from: b */
    public final InterfaceC8628q mo21149b() {
        if (this.f19800f != 0) {
            return new C8608a(this);
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.InterfaceC8615h
    /* JADX INFO: renamed from: c */
    public final long mo21150c(long j) {
        int i = this.f19799e;
        if (i != 3 && i != 2) {
            throw new IllegalArgumentException();
        }
        long j2 = j == 0 ? 0L : (((long) this.f19798d.f19841i) * j) / 1000000;
        this.f19802h = j2;
        this.f19799e = 2;
        this.f19803i = this.f19796b;
        this.f19804j = this.f19797c;
        this.f19805k = 0L;
        this.f19806l = this.f19800f;
        return j2;
    }
}
