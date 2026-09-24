package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import com.fyber.inneractive.sdk.player.exoplayer2.AbstractC8490a;
import com.fyber.inneractive.sdk.player.exoplayer2.C8517d;
import com.fyber.inneractive.sdk.player.exoplayer2.C8708o;
import com.fyber.inneractive.sdk.player.exoplayer2.C8742t;
import com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.AbstractC8676c;
import com.fyber.inneractive.sdk.player.exoplayer2.mediacodec.C8679f;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C8740y;
import com.fyber.inneractive.sdk.player.exoplayer2.source.C8741z;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.trackselection.g */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8753g extends AbstractC8755i {

    /* JADX INFO: renamed from: a */
    public final SparseArray f20441a = new SparseArray();

    /* JADX INFO: renamed from: b */
    public final SparseBooleanArray f20442b = new SparseBooleanArray();

    /* JADX WARN: Code duplicated, block: B:100:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:102:0x01dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x01de A[PHI: r30
  0x01de: PHI (r30v7 int) = (r30v5 int), (r30v9 int) binds: [B:102:0x01dc, B:95:0x01cc] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:104:0x01e0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:105:0x01e2 A[PHI: r30
  0x01e2: PHI (r30v6 int) = (r30v5 int), (r30v9 int) binds: [B:104:0x01e0, B:97:0x01cf] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:106:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:114:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:116:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:193:0x0348  */
    /* JADX WARN: Code duplicated, block: B:82:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:88:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:89:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:91:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:95:0x01cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x01cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:99:0x01d2  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.trackselection.AbstractC8755i
    /* JADX INFO: renamed from: a */
    public final C8756j mo21284a(AbstractC8490a[] abstractC8490aArr, C8741z c8741z) throws C8517d {
        boolean z;
        int i;
        boolean z2;
        int i2;
        int[][] iArr;
        int i3;
        boolean z3;
        C8749c c8749c;
        int[][][] iArr2;
        int i4;
        int i5;
        C8740y c8740y;
        ArrayList arrayList;
        boolean z4;
        int i6;
        boolean z5;
        boolean zM21283a;
        boolean z6;
        int i7;
        int i8;
        int iM21269b;
        int i9;
        int i10;
        boolean z7;
        int[] iArr3;
        boolean z8 = true;
        int[] iArr4 = new int[abstractC8490aArr.length + 1];
        int length = abstractC8490aArr.length + 1;
        C8740y[][] c8740yArr = new C8740y[length][];
        int[][][] iArr5 = new int[abstractC8490aArr.length + 1][][];
        for (int i11 = 0; i11 < length; i11++) {
            int i12 = c8741z.f20426a;
            c8740yArr[i11] = new C8740y[i12];
            iArr5[i11] = new int[i12][];
        }
        int length2 = abstractC8490aArr.length;
        int[] iArr6 = new int[length2];
        for (int i13 = 0; i13 < length2; i13++) {
            abstractC8490aArr[i13].getClass();
            iArr6[i13] = 4;
        }
        int i14 = 0;
        while (i14 < c8741z.f20426a) {
            C8740y c8740y2 = c8741z.f20427b[i14];
            int length3 = abstractC8490aArr.length;
            int i15 = 0;
            int i16 = 0;
            while (true) {
                if (i15 >= abstractC8490aArr.length) {
                    z7 = z8;
                    break;
                }
                AbstractC8490a abstractC8490a = abstractC8490aArr[i15];
                int i17 = 0;
                while (i17 < c8740y2.f20422a) {
                    C8708o c8708o = c8740y2.f20423b[i17];
                    z7 = z8;
                    AbstractC8676c abstractC8676c = (AbstractC8676c) abstractC8490a;
                    abstractC8676c.getClass();
                    try {
                        int iMo20972b = abstractC8676c.mo20972b(abstractC8676c.f20223h, c8708o) & 3;
                        if (iMo20972b > i16) {
                            if (iMo20972b == 3) {
                                length3 = i15;
                                break;
                            }
                            i16 = iMo20972b;
                            length3 = i15;
                        }
                        i17++;
                        z8 = z7;
                    } catch (C8679f e) {
                        throw new C8517d(e);
                    }
                }
                i15++;
            }
            if (length3 == abstractC8490aArr.length) {
                iArr3 = new int[c8740y2.f20422a];
            } else {
                AbstractC8490a abstractC8490a2 = abstractC8490aArr[length3];
                int[] iArr7 = new int[c8740y2.f20422a];
                for (int i18 = 0; i18 < c8740y2.f20422a; i18++) {
                    C8708o c8708o2 = c8740y2.f20423b[i18];
                    AbstractC8676c abstractC8676c2 = (AbstractC8676c) abstractC8490a2;
                    abstractC8676c2.getClass();
                    try {
                        iArr7[i18] = abstractC8676c2.mo20972b(abstractC8676c2.f20223h, c8708o2);
                    } catch (C8679f e2) {
                        throw new C8517d(e2);
                    }
                }
                iArr3 = iArr7;
            }
            int i19 = iArr4[length3];
            c8740yArr[length3][i19] = c8740y2;
            iArr5[length3][i19] = iArr3;
            iArr4[length3] = i19 + 1;
            i14++;
            z8 = z7;
        }
        boolean z9 = z8;
        C8741z[] c8741zArr = new C8741z[abstractC8490aArr.length];
        int[] iArr8 = new int[abstractC8490aArr.length];
        for (int i20 = 0; i20 < abstractC8490aArr.length; i20++) {
            int i21 = iArr4[i20];
            c8741zArr[i20] = new C8741z((C8740y[]) Arrays.copyOf(c8740yArr[i20], i21));
            iArr5[i20] = (int[][]) Arrays.copyOf(iArr5[i20], i21);
            iArr8[i20] = abstractC8490aArr[i20].f18923a;
        }
        new C8741z((C8740y[]) Arrays.copyOf(c8740yArr[abstractC8490aArr.length], iArr4[abstractC8490aArr.length]));
        int length4 = abstractC8490aArr.length;
        AbstractC8748b[] abstractC8748bArr = new AbstractC8748b[length4];
        C8749c c8749c2 = (C8749c) ((C8750d) this).f20440c.get();
        int i22 = 0;
        boolean z10 = false;
        while (i22 < length4) {
            if (2 == abstractC8490aArr[i22].f18923a) {
                if (z10) {
                    c8749c = c8749c2;
                    iArr2 = iArr5;
                    i4 = i22;
                } else {
                    C8741z c8741z2 = c8741zArr[i22];
                    int[][] iArr9 = iArr5[i22];
                    c8749c2.getClass();
                    C8740y c8740y3 = null;
                    int i23 = 0;
                    int i24 = 0;
                    int i25 = 0;
                    int i26 = -1;
                    int i27 = -1;
                    while (i23 < c8741z2.f20426a) {
                        C8740y c8740y4 = c8741z2.f20427b[i23];
                        C8749c c8749c3 = c8749c2;
                        ArrayList arrayList2 = new ArrayList(c8740y4.f20422a);
                        int[][][] iArr10 = iArr5;
                        for (int i28 = 0; i28 < c8740y4.f20422a; i28++) {
                            arrayList2.add(Integer.valueOf(i28));
                        }
                        int[] iArr11 = iArr9[i23];
                        int i29 = i25;
                        int i30 = i26;
                        int i31 = i22;
                        int iM21269b2 = i30;
                        int i32 = i27;
                        C8741z c8741z3 = c8741z2;
                        int i33 = i32;
                        C8740y c8740y5 = c8740y3;
                        int i34 = 0;
                        while (i34 < c8740y4.f20422a) {
                            int i35 = i34;
                            if (C8750d.m21283a(iArr11[i34], z9)) {
                                C8708o c8708o3 = c8740y4.f20423b[i35];
                                if (arrayList2.contains(Integer.valueOf(i35))) {
                                    int i36 = c8708o3.f20299j;
                                    c8740y = c8740y4;
                                    arrayList = arrayList2;
                                    z4 = (i36 == -1 || i36 <= Integer.MAX_VALUE) && ((i9 = c8708o3.f20300k) == -1 || i9 <= Integer.MAX_VALUE) && ((i10 = c8708o3.f20291b) == -1 || i10 <= Integer.MAX_VALUE);
                                    if (z4) {
                                        i6 = 2;
                                    } else {
                                        i6 = 1;
                                    }
                                    z5 = z4;
                                    zM21283a = C8750d.m21283a(iArr11[i35], false);
                                    if (zM21283a) {
                                        i6 += 1000;
                                    }
                                    if (i6 > i29) {
                                        z6 = true;
                                    } else {
                                        z6 = false;
                                    }
                                    if (i6 == i29) {
                                        if (c8708o3.m21269b() != iM21269b2) {
                                            iM21269b = c8708o3.m21269b();
                                            i5 = i29;
                                            i7 = -1;
                                            if (iM21269b == -1) {
                                                if (iM21269b2 == -1) {
                                                    i7 = 0;
                                                }
                                            } else if (iM21269b2 == -1) {
                                                i7 = 1;
                                            } else {
                                                i7 = iM21269b - iM21269b2;
                                            }
                                        } else {
                                            i5 = i29;
                                            i7 = -1;
                                            i8 = c8708o3.f20291b;
                                            if (i8 == -1) {
                                                if (i33 == -1) {
                                                    i7 = 0;
                                                }
                                            } else if (i33 == -1) {
                                                i7 = 1;
                                            } else {
                                                i7 = i8 - i33;
                                            }
                                        }
                                        z6 = zM21283a || !z5 ? i7 < 0 : i7 > 0;
                                    } else {
                                        i5 = i29;
                                    }
                                    if (z6) {
                                        i33 = c8708o3.f20291b;
                                        iM21269b2 = c8708o3.m21269b();
                                        i29 = i6;
                                        i24 = i35;
                                        c8740y5 = c8740y;
                                    }
                                    i34 = i35 + 1;
                                    c8740y4 = c8740y;
                                    arrayList2 = arrayList;
                                    z9 = true;
                                } else {
                                    c8740y = c8740y4;
                                    arrayList = arrayList2;
                                }
                                if (z4) {
                                    i6 = 2;
                                } else {
                                    i6 = 1;
                                }
                                z5 = z4;
                                zM21283a = C8750d.m21283a(iArr11[i35], false);
                                if (zM21283a) {
                                    i6 += 1000;
                                }
                                if (i6 > i29) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                if (i6 == i29) {
                                    if (c8708o3.m21269b() != iM21269b2) {
                                        iM21269b = c8708o3.m21269b();
                                        i5 = i29;
                                        i7 = -1;
                                        if (iM21269b == -1) {
                                            if (iM21269b2 == -1) {
                                                i7 = 0;
                                            }
                                        } else if (iM21269b2 == -1) {
                                            i7 = 1;
                                        } else {
                                            i7 = iM21269b - iM21269b2;
                                        }
                                    } else {
                                        i5 = i29;
                                        i7 = -1;
                                        i8 = c8708o3.f20291b;
                                        if (i8 == -1) {
                                            if (i33 == -1) {
                                                i7 = 0;
                                            }
                                        } else if (i33 == -1) {
                                            i7 = 1;
                                        } else {
                                            i7 = i8 - i33;
                                        }
                                    }
                                    if (zM21283a) {
                                    }
                                    i34 = i35 + 1;
                                    c8740y4 = c8740y;
                                    arrayList2 = arrayList;
                                    z9 = true;
                                } else {
                                    i5 = i29;
                                }
                                if (z6) {
                                    i33 = c8708o3.f20291b;
                                    iM21269b2 = c8708o3.m21269b();
                                    i29 = i6;
                                    i24 = i35;
                                    c8740y5 = c8740y;
                                }
                                i34 = i35 + 1;
                                c8740y4 = c8740y;
                                arrayList2 = arrayList;
                                z9 = true;
                            } else {
                                i5 = i29;
                                c8740y = c8740y4;
                                arrayList = arrayList2;
                            }
                            i29 = i5;
                            i34 = i35 + 1;
                            c8740y4 = c8740y;
                            arrayList2 = arrayList;
                            z9 = true;
                        }
                        int i37 = i29;
                        i23++;
                        i26 = iM21269b2;
                        i22 = i31;
                        i27 = i33;
                        c8741z2 = c8741z3;
                        c8749c2 = c8749c3;
                        iArr5 = iArr10;
                        c8740y3 = c8740y5;
                        i25 = i37;
                        z9 = true;
                    }
                    c8749c = c8749c2;
                    iArr2 = iArr5;
                    i4 = i22;
                    C8751e c8751e = c8740y3 == null ? null : new C8751e(c8740y3, i24);
                    abstractC8748bArr[i4] = c8751e;
                    z10 = c8751e != null;
                }
                int i38 = c8741zArr[i4].f20426a;
            } else {
                c8749c = c8749c2;
                iArr2 = iArr5;
                i4 = i22;
            }
            i22 = i4 + 1;
            c8749c2 = c8749c;
            iArr5 = iArr2;
            z9 = true;
        }
        C8749c c8749c4 = c8749c2;
        int[][][] iArr12 = iArr5;
        boolean z11 = false;
        boolean z12 = false;
        int i39 = 0;
        while (i39 < length4) {
            int i40 = abstractC8490aArr[i39].f18923a;
            if (i40 == 1) {
                z = z11;
                i = length4;
                z2 = z12;
                if (!z2) {
                    C8741z c8741z4 = c8741zArr[i39];
                    int[][] iArr13 = iArr12[i39];
                    c8749c4.getClass();
                    int i41 = 0;
                    int i42 = 0;
                    int i43 = -1;
                    int i44 = -1;
                    while (i41 < c8741z4.f20426a) {
                        C8740y c8740y6 = c8741z4.f20427b[i41];
                        int[] iArr14 = iArr13[i41];
                        int i45 = i44;
                        int i46 = 0;
                        while (i46 < c8740y6.f20422a) {
                            int[][] iArr15 = iArr13;
                            if (C8750d.m21283a(iArr14[i46], true)) {
                                C8708o c8708o4 = c8740y6.f20423b[i46];
                                int i47 = iArr14[i46];
                                int i48 = (c8708o4.f20313x & 1) != 0 ? 2 : 1;
                                i2 = i41;
                                if (C8750d.m21283a(i47, false)) {
                                    i48 += 1000;
                                }
                                if (i48 > i42) {
                                    i43 = i46;
                                    i42 = i48;
                                    i45 = i2;
                                }
                            } else {
                                i2 = i41;
                            }
                            i46++;
                            i41 = i2;
                            iArr13 = iArr15;
                        }
                        i41++;
                        i44 = i45;
                        iArr13 = iArr13;
                    }
                    C8751e c8751e2 = i44 == -1 ? null : new C8751e(c8741z4.f20427b[i44], i43);
                    abstractC8748bArr[i39] = c8751e2;
                    z2 = c8751e2 != null;
                }
                z11 = z;
                i39++;
                length4 = i;
                z12 = z2;
            } else if (i40 == 2) {
                z = z11;
                i = length4;
                z2 = z12;
            } else if (i40 != 3) {
                C8741z c8741z5 = c8741zArr[i39];
                int[][] iArr16 = iArr12[i39];
                c8749c4.getClass();
                C8740y c8740y7 = null;
                int i49 = 0;
                int i50 = 0;
                int i51 = 0;
                while (i49 < c8741z5.f20426a) {
                    C8740y c8740y8 = c8741z5.f20427b[i49];
                    int[] iArr17 = iArr16[i49];
                    boolean z13 = z11;
                    int i52 = length4;
                    int i53 = 0;
                    while (i53 < c8740y8.f20422a) {
                        int i54 = i53;
                        if (C8750d.m21283a(iArr17[i53], true)) {
                            int i55 = (c8740y8.f20423b[i54].f20313x & 1) != 0 ? 2 : 1;
                            z3 = z12;
                            if (C8750d.m21283a(iArr17[i54], false)) {
                                i55 += 1000;
                            }
                            if (i55 > i51) {
                                i51 = i55;
                                c8740y7 = c8740y8;
                                i50 = i54;
                            }
                        } else {
                            z3 = z12;
                        }
                        i53 = i54 + 1;
                        z12 = z3;
                    }
                    i49++;
                    z11 = z13;
                    length4 = i52;
                }
                z = z11;
                i = length4;
                z2 = z12;
                abstractC8748bArr[i39] = c8740y7 == null ? null : new C8751e(c8740y7, i50);
            } else {
                z = z11;
                i = length4;
                z2 = z12;
                if (!z) {
                    C8741z c8741z6 = c8741zArr[i39];
                    int[][] iArr18 = iArr12[i39];
                    c8749c4.getClass();
                    C8740y c8740y9 = null;
                    int i56 = 0;
                    int i57 = 0;
                    int i58 = 0;
                    while (i56 < c8741z6.f20426a) {
                        C8740y c8740y10 = c8741z6.f20427b[i56];
                        int[] iArr19 = iArr18[i56];
                        C8740y c8740y11 = c8740y9;
                        int i59 = 0;
                        while (i59 < c8740y10.f20422a) {
                            C8741z c8741z7 = c8741z6;
                            if (C8750d.m21283a(iArr19[i59], true)) {
                                int i60 = c8740y10.f20423b[i59].f20313x;
                                boolean z14 = (i60 & 1) != 0;
                                boolean z15 = (i60 & 2) != 0;
                                if (z14) {
                                    i3 = 3;
                                } else if (z15) {
                                    i3 = 1;
                                } else {
                                    iArr = iArr18;
                                }
                                iArr = iArr18;
                                if (C8750d.m21283a(iArr19[i59], false)) {
                                    i3 += 1000;
                                }
                                if (i3 > i58) {
                                    i58 = i3;
                                    i57 = i59;
                                    c8740y11 = c8740y10;
                                }
                            } else {
                                iArr = iArr18;
                            }
                            i59++;
                            c8741z6 = c8741z7;
                            iArr18 = iArr;
                        }
                        i56++;
                        c8740y9 = c8740y11;
                    }
                    C8751e c8751e3 = c8740y9 == null ? null : new C8751e(c8740y9, i57);
                    abstractC8748bArr[i39] = c8751e3;
                    z11 = c8751e3 != null;
                }
                i39++;
                length4 = i;
                z12 = z2;
            }
            z11 = z;
            i39++;
            length4 = i;
            z12 = z2;
        }
        for (int i61 = 0; i61 < abstractC8490aArr.length; i61++) {
            if (this.f20442b.get(i61)) {
                abstractC8748bArr[i61] = null;
            } else {
                C8741z c8741z8 = c8741zArr[i61];
                Map map = (Map) this.f20441a.get(i61);
                if (map != null && map.containsKey(c8741z8)) {
                    if (((Map) this.f20441a.get(i61)).get(c8741z8) != null) {
                        throw new ClassCastException();
                    }
                    abstractC8748bArr[i61] = null;
                }
            }
        }
        C8752f c8752f = new C8752f(c8741zArr);
        C8742t[] c8742tArr = new C8742t[abstractC8490aArr.length];
        for (int i62 = 0; i62 < abstractC8490aArr.length; i62++) {
            c8742tArr[i62] = abstractC8748bArr[i62] != null ? C8742t.f20429b : null;
        }
        return new C8756j(c8741z, new C8754h(abstractC8748bArr), c8752f, c8742tArr);
    }
}
