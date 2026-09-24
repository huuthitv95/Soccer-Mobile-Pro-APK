package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.util.Log;
import java.util.Arrays;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.l */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8813l {

    /* JADX INFO: renamed from: a */
    public static final byte[] f20635a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b */
    public static final float[] f20636b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: c */
    public static final Object f20637c = new Object();

    /* JADX INFO: renamed from: d */
    public static int[] f20638d = new int[10];

    /* JADX INFO: renamed from: a */
    public static int m21328a(int i, byte[] bArr) {
        int i2;
        synchronized (f20637c) {
            int i3 = 0;
            int i4 = 0;
            while (i3 < i) {
                while (true) {
                    if (i3 >= i - 2) {
                        i3 = i;
                        break;
                    }
                    try {
                        if (bArr[i3] == 0 && bArr[i3 + 1] == 0 && bArr[i3 + 2] == 3) {
                            break;
                        }
                        i3++;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (i3 < i) {
                    int[] iArr = f20638d;
                    if (iArr.length <= i4) {
                        f20638d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f20638d[i4] = i3;
                    i3 += 3;
                    i4++;
                }
            }
            i2 = i - i4;
            int i5 = 0;
            int i6 = 0;
            for (int i7 = 0; i7 < i4; i7++) {
                int i8 = f20638d[i7] - i6;
                System.arraycopy(bArr, i6, bArr, i5, i8);
                int i9 = i5 + i8;
                int i10 = i9 + 1;
                bArr[i9] = 0;
                i5 = i9 + 2;
                bArr[i10] = 0;
                i6 += i8 + 3;
            }
            System.arraycopy(bArr, i6, bArr, i5, i2 - i5);
        }
        return i2;
    }

    /* JADX INFO: renamed from: a */
    public static int m21329a(byte[] bArr, int i, int i2, boolean[] zArr) {
        int i3 = i2 - i;
        if (i3 < 0) {
            throw new IllegalStateException();
        }
        if (i3 == 0) {
            return i2;
        }
        if (zArr[0]) {
            m21331a(zArr);
            return i - 3;
        }
        if (i3 > 1 && zArr[1] && bArr[i] == 1) {
            m21331a(zArr);
            return i - 2;
        }
        if (i3 > 2 && zArr[2] && bArr[i] == 0 && bArr[i + 1] == 1) {
            m21331a(zArr);
            return i - 1;
        }
        int i4 = i2 - 1;
        int i5 = i + 2;
        while (i5 < i4) {
            byte b = bArr[i5];
            if ((b & 254) == 0) {
                int i6 = i5 - 2;
                if (bArr[i6] == 0 && bArr[i5 - 1] == 0 && b == 1) {
                    m21331a(zArr);
                    return i6;
                }
                i5 -= 2;
            }
            i5 += 3;
        }
        zArr[0] = i3 <= 2 ? !(i3 != 2 ? !(zArr[1] && bArr[i4] == 1) : !(zArr[2] && bArr[i2 + (-2)] == 0 && bArr[i4] == 1)) : bArr[i2 + (-3)] == 0 && bArr[i2 + (-2)] == 0 && bArr[i4] == 1;
        zArr[1] = i3 <= 1 ? zArr[2] && bArr[i4] == 0 : bArr[i2 + (-2)] == 0 && bArr[i4] == 0;
        zArr[2] = bArr[i4] == 0;
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:67:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:70:0x010d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0111  */
    /* JADX WARN: Code duplicated, block: B:73:0x0113  */
    /* JADX WARN: Code duplicated, block: B:75:0x0117  */
    /* JADX WARN: Code duplicated, block: B:92:0x0167  */
    /* JADX INFO: renamed from: a */
    public static C8812k m21330a(byte[] bArr, int i, int i2) {
        int iM21364d;
        boolean z;
        int iM21364d2;
        boolean z2;
        boolean zM21362c;
        int i3;
        int i4;
        int i5;
        float f;
        int i6;
        C8816o c8816o = new C8816o(bArr, i, i2);
        c8816o.m21365d(8);
        int iM21360b = c8816o.m21360b(8);
        c8816o.m21365d(16);
        int iM21364d3 = c8816o.m21364d();
        int i7 = 1;
        if (iM21360b == 100 || iM21360b == 110 || iM21360b == 122 || iM21360b == 244 || iM21360b == 44 || iM21360b == 83 || iM21360b == 86 || iM21360b == 118 || iM21360b == 128 || iM21360b == 138) {
            iM21364d = c8816o.m21364d();
            boolean zM21362c2 = iM21364d == 3 ? c8816o.m21362c() : false;
            c8816o.m21364d();
            c8816o.m21364d();
            c8816o.m21367f();
            if (c8816o.m21362c()) {
                int i8 = iM21364d != 3 ? 8 : 12;
                int i9 = 0;
                while (i9 < i8) {
                    if (c8816o.m21362c()) {
                        int i10 = i9 < 6 ? 16 : 64;
                        int iM21366e = 8;
                        int i11 = 8;
                        for (int i12 = 0; i12 < i10; i12++) {
                            if (iM21366e != 0) {
                                iM21366e = ((c8816o.m21366e() + i11) + 256) % 256;
                            }
                            if (iM21366e != 0) {
                                i11 = iM21366e;
                            }
                        }
                    }
                    i9++;
                }
            }
            z = zM21362c2;
        } else {
            iM21364d = 1;
            z = false;
        }
        int iM21364d4 = c8816o.m21364d() + 4;
        int iM21364d5 = c8816o.m21364d();
        if (iM21364d5 != 0) {
            if (iM21364d5 == 1) {
                boolean zM21362c3 = c8816o.m21362c();
                c8816o.m21366e();
                c8816o.m21366e();
                long jM21364d = c8816o.m21364d();
                z = z;
                for (int i13 = 0; i13 < jM21364d; i13++) {
                    c8816o.m21364d();
                }
                z2 = zM21362c3;
                iM21364d2 = 0;
            } else {
                iM21364d2 = 0;
            }
            c8816o.m21364d();
            c8816o.m21367f();
            int iM21364d6 = c8816o.m21364d() + 1;
            int iM21364d7 = c8816o.m21364d() + 1;
            zM21362c = c8816o.m21362c();
            i3 = 2 - (zM21362c ? 1 : 0);
            int i14 = iM21364d7 * i3;
            if (!zM21362c) {
                c8816o.m21367f();
            }
            c8816o.m21367f();
            i4 = iM21364d6 * 16;
            i5 = i14 * 16;
            if (c8816o.m21362c()) {
                int iM21364d8 = c8816o.m21364d();
                int iM21364d9 = c8816o.m21364d();
                int iM21364d10 = c8816o.m21364d();
                int iM21364d11 = c8816o.m21364d();
                if (iM21364d != 0) {
                    if (iM21364d == 3) {
                        i6 = 1;
                    } else {
                        i6 = 2;
                    }
                    i3 *= iM21364d == 1 ? 2 : 1;
                    i7 = i6;
                }
                i4 -= (iM21364d8 + iM21364d9) * i7;
                i5 -= (iM21364d10 + iM21364d11) * i3;
            }
            int i15 = i4;
            int i16 = i5;
            if (c8816o.m21362c() || !c8816o.m21362c()) {
                f = 1.0f;
            } else {
                int iM21360b2 = c8816o.m21360b(8);
                if (iM21360b2 == 255) {
                    int iM21360b3 = c8816o.m21360b(16);
                    int iM21360b4 = c8816o.m21360b(16);
                    if (iM21360b3 == 0 || iM21360b4 == 0) {
                        f = 1.0f;
                    } else {
                        f = iM21360b3 / iM21360b4;
                    }
                } else {
                    float[] fArr = f20636b;
                    if (iM21360b2 < 17) {
                        f = fArr[iM21360b2];
                    } else {
                        Log.w("NalUnitUtil", "Unexpected aspect_ratio_idc value: " + iM21360b2);
                        f = 1.0f;
                    }
                }
            }
            return new C8812k(iM21364d3, i15, i16, f, z, zM21362c, iM21364d4, iM21364d5, iM21364d2, z2);
        }
        iM21364d2 = c8816o.m21364d() + 4;
        z2 = false;
        c8816o.m21364d();
        c8816o.m21367f();
        int iM21364d12 = c8816o.m21364d() + 1;
        int iM21364d13 = c8816o.m21364d() + 1;
        zM21362c = c8816o.m21362c();
        i3 = 2 - (zM21362c ? 1 : 0);
        int i17 = iM21364d13 * i3;
        if (!zM21362c) {
            c8816o.m21367f();
        }
        c8816o.m21367f();
        i4 = iM21364d12 * 16;
        i5 = i17 * 16;
        if (c8816o.m21362c()) {
            int iM21364d14 = c8816o.m21364d();
            int iM21364d15 = c8816o.m21364d();
            int iM21364d16 = c8816o.m21364d();
            int iM21364d17 = c8816o.m21364d();
            if (iM21364d != 0) {
                if (iM21364d == 3) {
                    i6 = 1;
                } else {
                    i6 = 2;
                }
                i3 *= iM21364d == 1 ? 2 : 1;
                i7 = i6;
            }
            i4 -= (iM21364d14 + iM21364d15) * i7;
            i5 -= (iM21364d16 + iM21364d17) * i3;
        }
        int i18 = i4;
        int i19 = i5;
        if (c8816o.m21362c()) {
            f = 1.0f;
        } else {
            f = 1.0f;
        }
        return new C8812k(iM21364d3, i18, i19, f, z, zM21362c, iM21364d4, iM21364d5, iM21364d2, z2);
    }

    /* JADX INFO: renamed from: a */
    public static void m21331a(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }
}
