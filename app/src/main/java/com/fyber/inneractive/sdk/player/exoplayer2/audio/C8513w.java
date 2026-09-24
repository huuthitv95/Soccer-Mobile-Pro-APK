package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import java.util.Arrays;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.w */
/* JADX INFO: loaded from: classes4.dex */
public final class C8513w {

    /* JADX INFO: renamed from: a */
    public final int f19051a;

    /* JADX INFO: renamed from: b */
    public final int f19052b;

    /* JADX INFO: renamed from: c */
    public final int f19053c;

    /* JADX INFO: renamed from: d */
    public final int f19054d;

    /* JADX INFO: renamed from: e */
    public final int f19055e;

    /* JADX INFO: renamed from: f */
    public final short[] f19056f;

    /* JADX INFO: renamed from: g */
    public int f19057g;

    /* JADX INFO: renamed from: h */
    public short[] f19058h;

    /* JADX INFO: renamed from: i */
    public int f19059i;

    /* JADX INFO: renamed from: j */
    public short[] f19060j;

    /* JADX INFO: renamed from: k */
    public int f19061k;

    /* JADX INFO: renamed from: l */
    public short[] f19062l;

    /* JADX INFO: renamed from: q */
    public int f19067q;

    /* JADX INFO: renamed from: r */
    public int f19068r;

    /* JADX INFO: renamed from: s */
    public int f19069s;

    /* JADX INFO: renamed from: t */
    public int f19070t;

    /* JADX INFO: renamed from: v */
    public int f19072v;

    /* JADX INFO: renamed from: w */
    public int f19073w;

    /* JADX INFO: renamed from: x */
    public int f19074x;

    /* JADX INFO: renamed from: m */
    public int f19063m = 0;

    /* JADX INFO: renamed from: n */
    public int f19064n = 0;

    /* JADX INFO: renamed from: u */
    public int f19071u = 0;

    /* JADX INFO: renamed from: o */
    public float f19065o = 1.0f;

    /* JADX INFO: renamed from: p */
    public float f19066p = 1.0f;

    public C8513w(int i, int i2) {
        this.f19051a = i;
        this.f19052b = i2;
        this.f19053c = i / 400;
        int i3 = i / 65;
        this.f19054d = i3;
        int i4 = i3 * 2;
        this.f19055e = i4;
        this.f19056f = new short[i4];
        this.f19057g = i4;
        int i5 = i2 * i4;
        this.f19058h = new short[i5];
        this.f19059i = i4;
        this.f19060j = new short[i5];
        this.f19061k = i4;
        this.f19062l = new short[i5];
    }

    /* JADX INFO: renamed from: a */
    public static void m21006a(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i10 = 0; i10 < i; i10++) {
                sArr[i7] = (short) (((sArr3[i8] * i10) + ((i - i10) * sArr2[i9])) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final int m21007a(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f19052b;
        int i5 = 255;
        int i6 = 1;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i10 = 0; i10 < i2; i10++) {
                short s = sArr[i4 + i10];
                short s2 = sArr[i4 + i2 + i10];
                i9 += s >= s2 ? s - s2 : s2 - s;
            }
            if (i9 * i7 < i6 * i2) {
                i7 = i2;
                i6 = i9;
            }
            if (i9 * i5 > i8 * i2) {
                i5 = i2;
                i8 = i9;
            }
            i2++;
        }
        this.f19073w = i6 / i7;
        this.f19074x = i8 / i5;
        return i7;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0253 A[LOOP:4: B:12:0x0048->B:102:0x0253, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:112:0x0175 A[EDGE_INSN: B:112:0x0175->B:64:0x0175 BREAK  A[LOOP:4: B:12:0x0048->B:102:0x0253], SYNTHETIC] */
    /* JADX INFO: renamed from: a */
    public final void m21008a() {
        int iM21007a;
        int i;
        int iMin;
        int i2;
        int i3;
        float f;
        int i4;
        int i5;
        int i6 = this.f19068r;
        float f2 = this.f19065o / this.f19066p;
        double d = f2;
        float f3 = 1.0f;
        int i7 = 1;
        if (d > 1.00001d || d < 0.99999d) {
            int i8 = this.f19067q;
            if (i8 >= this.f19055e) {
                int i9 = 0;
                while (true) {
                    int i10 = this.f19070t;
                    if (i10 > 0) {
                        iMin = Math.min(this.f19055e, i10);
                        short[] sArr = this.f19058h;
                        m21011b(iMin);
                        int i11 = this.f19052b;
                        System.arraycopy(sArr, i9 * i11, this.f19060j, this.f19068r * i11, i11 * iMin);
                        this.f19068r += iMin;
                        this.f19070t -= iMin;
                    } else {
                        short[] sArr2 = this.f19058h;
                        int i12 = this.f19051a;
                        int i13 = i12 > 4000 ? i12 / 4000 : i7;
                        if (this.f19052b == i7 && i13 == i7) {
                            iM21007a = m21007a(sArr2, i9, this.f19053c, this.f19054d);
                        } else {
                            m21010a(sArr2, i9, i13);
                            int iM21007a2 = m21007a(this.f19056f, 0, this.f19053c / i13, this.f19054d / i13);
                            if (i13 != i7) {
                                int i14 = iM21007a2 * i13;
                                int i15 = i13 * 4;
                                int i16 = i14 - i15;
                                int i17 = i14 + i15;
                                int i18 = this.f19053c;
                                if (i16 < i18) {
                                    i16 = i18;
                                }
                                int i19 = this.f19054d;
                                if (i17 > i19) {
                                    i17 = i19;
                                }
                                if (this.f19052b == i7) {
                                    iM21007a = m21007a(sArr2, i9, i16, i17);
                                } else {
                                    m21010a(sArr2, i9, i7);
                                    iM21007a = m21007a(this.f19056f, 0, i16, i17);
                                }
                            } else {
                                iM21007a = iM21007a2;
                            }
                        }
                        int i20 = this.f19073w;
                        int i21 = (i20 == 0 || (i3 = this.f19071u) == 0 || this.f19074x > i20 * 3 || i20 * 2 <= this.f19072v * 3) ? iM21007a : i3;
                        this.f19072v = i20;
                        this.f19071u = iM21007a;
                        if (d > 1.0d) {
                            short[] sArr3 = this.f19058h;
                            if (f2 >= 2.0f) {
                                i2 = (int) (i21 / (f2 - f3));
                            } else {
                                this.f19070t = (int) (((2.0f - f2) * i21) / (f2 - f3));
                                i2 = i21;
                            }
                            m21011b(i2);
                            int i22 = i21;
                            m21006a(i2, this.f19052b, this.f19060j, this.f19068r, sArr3, i9, sArr3, i9 + i22);
                            this.f19068r += i2;
                            f3 = f3;
                            i7 = i7;
                            i9 = i22 + i2 + i9;
                        } else {
                            int i23 = i21;
                            short[] sArr4 = this.f19058h;
                            if (f2 < 0.5f) {
                                i = (int) ((i23 * f2) / (f3 - f2));
                            } else {
                                this.f19070t = (int) ((((2.0f * f2) - f3) * i23) / (f3 - f2));
                                i = i23;
                            }
                            int i24 = i23 + i;
                            m21011b(i24);
                            int i25 = this.f19052b;
                            System.arraycopy(sArr4, i9 * i25, this.f19060j, this.f19068r * i25, i25 * i23);
                            int i26 = i9;
                            m21006a(i, this.f19052b, this.f19060j, this.f19068r + i23, sArr4, i9 + i23, sArr4, i26);
                            i9 = i26;
                            this.f19068r += i24;
                            iMin = i;
                        }
                        if (this.f19055e + i9 > i8) {
                            break;
                        }
                        f3 = f3;
                        i7 = i7;
                    }
                    i9 += iMin;
                    if (this.f19055e + i9 > i8) {
                        break;
                        break;
                    } else {
                        f3 = f3;
                        i7 = i7;
                    }
                }
                int i27 = this.f19067q - i9;
                short[] sArr5 = this.f19058h;
                int i28 = this.f19052b;
                System.arraycopy(sArr5, i9 * i28, sArr5, 0, i28 * i27);
                this.f19067q = i27;
            }
            f = this.f19066p;
            if (f != f3 || this.f19068r == i6) {
            }
            int i29 = this.f19051a;
            int i30 = (int) (i29 / f);
            while (true) {
                if (i30 <= 16384 && i29 <= 16384) {
                    break;
                }
                i30 /= 2;
                i29 /= 2;
            }
            int i31 = this.f19068r - i6;
            int i32 = this.f19069s + i31;
            int i33 = this.f19061k;
            if (i32 > i33) {
                int i34 = (i33 / 2) + i31 + i33;
                this.f19061k = i34;
                this.f19062l = Arrays.copyOf(this.f19062l, i34 * this.f19052b);
            }
            short[] sArr6 = this.f19060j;
            int i35 = this.f19052b;
            System.arraycopy(sArr6, i6 * i35, this.f19062l, this.f19069s * i35, i35 * i31);
            this.f19068r = i6;
            this.f19069s += i31;
            int i36 = 0;
            while (true) {
                int i37 = this.f19069s;
                int i38 = i37 - 1;
                if (i36 >= i38) {
                    if (i38 == 0) {
                        return;
                    }
                    short[] sArr7 = this.f19062l;
                    int i39 = this.f19052b;
                    System.arraycopy(sArr7, i38 * i39, sArr7, 0, (i37 - i38) * i39);
                    this.f19069s -= i38;
                    return;
                }
                while (true) {
                    i4 = this.f19063m + 1;
                    int i40 = i4 * i30;
                    i5 = this.f19064n;
                    if (i40 <= i5 * i29) {
                        break;
                    }
                    m21011b(i7);
                    int i41 = 0;
                    while (true) {
                        int i42 = this.f19052b;
                        if (i41 < i42) {
                            short[] sArr8 = this.f19060j;
                            int i43 = (this.f19068r * i42) + i41;
                            short[] sArr9 = this.f19062l;
                            int i44 = (i36 * i42) + i41;
                            short s = sArr9[i44];
                            short s2 = sArr9[i44 + i42];
                            int i45 = this.f19064n * i29;
                            int i46 = this.f19063m;
                            int i47 = i46 * i30;
                            int i48 = (i46 + 1) * i30;
                            int i49 = i48 - i45;
                            int i50 = i48 - i47;
                            sArr8[i43] = (short) ((((i50 - i49) * s2) + (s * i49)) / i50);
                            i41++;
                        }
                    }
                    i7 = 1;
                    this.f19064n++;
                    this.f19068r++;
                }
                this.f19063m = i4;
                if (i4 == i29) {
                    this.f19063m = 0;
                    if (i5 != i30) {
                        throw new IllegalStateException();
                    }
                    this.f19064n = 0;
                }
                i36++;
            }
        } else {
            short[] sArr10 = this.f19058h;
            int i51 = this.f19067q;
            m21011b(i51);
            int i52 = this.f19052b;
            System.arraycopy(sArr10, 0, this.f19060j, this.f19068r * i52, i52 * i51);
            this.f19068r += i51;
            this.f19067q = 0;
        }
        f3 = 1.0f;
        i7 = 1;
        f = this.f19066p;
        if (f != f3) {
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m21009a(int i) {
        int i2 = this.f19067q + i;
        int i3 = this.f19057g;
        if (i2 > i3) {
            int i4 = (i3 / 2) + i + i3;
            this.f19057g = i4;
            this.f19058h = Arrays.copyOf(this.f19058h, i4 * this.f19052b);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m21010a(short[] sArr, int i, int i2) {
        int i3 = this.f19055e / i2;
        int i4 = this.f19052b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[(i7 * i5) + i6 + i9];
            }
            this.f19056f[i7] = (short) (i8 / i5);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m21011b(int i) {
        int i2 = this.f19068r + i;
        int i3 = this.f19059i;
        if (i2 > i3) {
            int i4 = (i3 / 2) + i + i3;
            this.f19059i = i4;
            this.f19060j = Arrays.copyOf(this.f19060j, i4 * this.f19052b);
        }
    }
}
