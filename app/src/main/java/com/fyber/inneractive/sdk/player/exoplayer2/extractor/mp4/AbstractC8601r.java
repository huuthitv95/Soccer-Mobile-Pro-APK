package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import android.support.v4.media.session.PlaybackStateCompat;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8527b;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8815n;
import java.io.EOFException;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.r */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8601r {

    /* JADX INFO: renamed from: a */
    public static final int[] f19741a = {AbstractC8827z.m21379a("isom"), AbstractC8827z.m21379a("iso2"), AbstractC8827z.m21379a("iso3"), AbstractC8827z.m21379a("iso4"), AbstractC8827z.m21379a("iso5"), AbstractC8827z.m21379a("iso6"), AbstractC8827z.m21379a("avc1"), AbstractC8827z.m21379a("hvc1"), AbstractC8827z.m21379a("hev1"), AbstractC8827z.m21379a("mp41"), AbstractC8827z.m21379a("mp42"), AbstractC8827z.m21379a("3g2a"), AbstractC8827z.m21379a("3g2b"), AbstractC8827z.m21379a("3gr6"), AbstractC8827z.m21379a("3gs6"), AbstractC8827z.m21379a("3ge6"), AbstractC8827z.m21379a("3gg6"), AbstractC8827z.m21379a("M4V "), AbstractC8827z.m21379a("M4A "), AbstractC8827z.m21379a("f4v "), AbstractC8827z.m21379a("kddi"), AbstractC8827z.m21379a("M4VP"), AbstractC8827z.m21379a("qt  "), AbstractC8827z.m21379a("MSNV")};

    /* JADX INFO: renamed from: a */
    public static boolean m21144a(C8527b c8527b, boolean z) throws InterruptedException, EOFException {
        boolean z2;
        int i;
        long j = c8527b.f19123b;
        if (j == -1 || j > PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            j = 4096;
        }
        int i2 = (int) j;
        C8815n c8815n = new C8815n(64);
        boolean z3 = false;
        int i3 = 0;
        boolean z4 = false;
        while (true) {
            if (i3 < i2) {
                c8815n.m21343c(8);
                c8527b.m21025a(c8815n.f20643a, z3 ? 1 : 0, 8, z3);
                long jM21353k = c8815n.m21353k();
                int iM21340b = c8815n.m21340b();
                if (jM21353k == 1) {
                    c8527b.m21025a(c8815n.f20643a, 8, 8, z3);
                    c8815n.m21345d(16);
                    i = 16;
                    jM21353k = c8815n.m21356n();
                } else {
                    i = 8;
                }
                long j2 = i;
                if (jM21353k < j2) {
                    return z3;
                }
                i3 += i;
                if (iM21340b != AbstractC8586c.f19532C) {
                    if (iM21340b == AbstractC8586c.f19550L || iM21340b == AbstractC8586c.f19554N) {
                        z2 = true;
                        return z4 && z == z2;
                    }
                    long j3 = (((long) i3) + jM21353k) - j2;
                    boolean z5 = z3 ? 1 : 0;
                    if (j3 < i2) {
                        int i4 = (int) (jM21353k - j2);
                        i3 += i4;
                        if (iM21340b == AbstractC8586c.f19570b) {
                            if (i4 < 8) {
                                return z5;
                            }
                            c8815n.m21343c(i4);
                            c8527b.m21025a(c8815n.f20643a, z5 ? 1 : 0, i4, z5);
                            int i5 = i4 / 4;
                            for (int i6 = 0; i6 < i5; i6++) {
                                if (i6 != 1) {
                                    int iM21340b2 = c8815n.m21340b();
                                    if ((iM21340b2 >>> 8) != AbstractC8827z.m21379a("3gp")) {
                                        int[] iArr = f19741a;
                                        int length = iArr.length;
                                        int i7 = 0;
                                        while (true) {
                                            if (i7 >= length) {
                                                continue;
                                            } else if (iArr[i7] != iM21340b2) {
                                                i7++;
                                            }
                                        }
                                    }
                                    z4 = true;
                                    break;
                                }
                                c8815n.m21347e(c8815n.f20644b + 4);
                            }
                            z4 = z4;
                            if (!z4) {
                                return false;
                            }
                        } else if (i4 != 0) {
                            c8527b.m21024a(i4, z5);
                            z4 = z4;
                        }
                        z3 = false;
                    }
                }
            }
            z2 = false;
            if (z4) {
                return false;
            }
        }
    }
}
