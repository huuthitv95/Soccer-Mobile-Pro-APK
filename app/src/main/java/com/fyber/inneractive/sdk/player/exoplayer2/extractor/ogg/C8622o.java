package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.AbstractC8673m;
import com.fyber.inneractive.sdk.player.exoplayer2.C8708o;
import com.fyber.inneractive.sdk.player.exoplayer2.C8711r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8815n;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.o */
/* JADX INFO: loaded from: classes4.dex */
public final class C8622o extends AbstractC8619l {

    /* JADX INFO: renamed from: n */
    public C8621n f19854n;

    /* JADX INFO: renamed from: o */
    public int f19855o;

    /* JADX INFO: renamed from: p */
    public boolean f19856p;

    /* JADX INFO: renamed from: q */
    public C8625r f19857q;

    /* JADX INFO: renamed from: r */
    public C8623p f19858r;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.AbstractC8619l
    /* JADX INFO: renamed from: a */
    public final long mo21151a(C8815n c8815n) {
        byte b = c8815n.f20643a[0];
        if ((b & 1) == 1) {
            return -1L;
        }
        C8621n c8621n = this.f19854n;
        int i = !c8621n.f19852c[(b >> 1) & (255 >>> (8 - c8621n.f19853d))].f19859a ? c8621n.f19850a.f19863d : c8621n.f19850a.f19864e;
        long j = this.f19856p ? (this.f19855o + i) / 4 : 0;
        c8815n.m21345d(c8815n.f20645c + 4);
        byte[] bArr = c8815n.f20643a;
        int i2 = c8815n.f20645c;
        bArr[i2 - 4] = (byte) (j & 255);
        bArr[i2 - 3] = (byte) ((j >>> 8) & 255);
        bArr[i2 - 2] = (byte) ((j >>> 16) & 255);
        bArr[i2 - 1] = (byte) ((j >>> 24) & 255);
        this.f19856p = true;
        this.f19855o = i;
        return j;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.AbstractC8619l
    /* JADX INFO: renamed from: a */
    public final void mo21157a(long j) {
        this.f19839g = j;
        this.f19856p = j != 0;
        C8625r c8625r = this.f19857q;
        this.f19855o = c8625r != null ? c8625r.f19863d : 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.AbstractC8619l
    /* JADX INFO: renamed from: a */
    public final void mo21152a(boolean z) {
        super.mo21152a(z);
        if (z) {
            this.f19854n = null;
            this.f19857q = null;
            this.f19858r = null;
        }
        this.f19855o = 0;
        this.f19856p = false;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.AbstractC8619l
    /* JADX INFO: renamed from: a */
    public final boolean mo21153a(C8815n c8815n, long j, C8617j c8617j) throws C8711r {
        int i;
        long jFloor;
        if (this.f19854n != null) {
            return false;
        }
        C8621n c8621n = null;
        int i2 = 1;
        if (this.f19857q == null) {
            this.f19857q = AbstractC8626s.m21161a(c8815n);
        } else if (this.f19858r == null) {
            AbstractC8626s.m21162a(3, c8815n, false);
            c8815n.m21341b((int) c8815n.m21346e());
            long jM21346e = c8815n.m21346e();
            String[] strArr = new String[(int) jM21346e];
            for (int i3 = 0; i3 < jM21346e; i3++) {
                strArr[i3] = c8815n.m21341b((int) c8815n.m21346e());
            }
            if ((c8815n.m21352j() & 1) == 0) {
                throw new C8711r("framing bit expected to be set");
            }
            this.f19858r = new C8623p();
        } else {
            int i4 = c8815n.f20645c;
            byte[] bArr = new byte[i4];
            System.arraycopy(c8815n.f20643a, 0, bArr, 0, i4);
            int i5 = this.f19857q.f19860a;
            int i6 = 5;
            AbstractC8626s.m21162a(5, c8815n, false);
            int iM21352j = c8815n.m21352j() + 1;
            C8620m c8620m = new C8620m(c8815n.f20643a);
            int i7 = 8;
            c8620m.m21160b(c8815n.f20644b * 8);
            int i8 = 0;
            while (true) {
                int i9 = 4;
                int i10 = 16;
                if (i8 >= iM21352j) {
                    int i11 = i7;
                    int i12 = 6;
                    int iM21158a = c8620m.m21158a(6) + 1;
                    for (int i13 = 0; i13 < iM21158a; i13++) {
                        if (c8620m.m21158a(16) != 0) {
                            throw new C8711r("placeholder of time domain transforms not zeroed out");
                        }
                    }
                    int i14 = 1;
                    int iM21158a2 = c8620m.m21158a(6) + 1;
                    int i15 = 0;
                    while (i15 < iM21158a2) {
                        int iM21158a3 = c8620m.m21158a(i10);
                        if (iM21158a3 == 0) {
                            int i16 = i11;
                            c8620m.m21160b(i16);
                            c8620m.m21160b(16);
                            c8620m.m21160b(16);
                            c8620m.m21160b(6);
                            c8620m.m21160b(i16);
                            int iM21158a4 = c8620m.m21158a(4) + 1;
                            int i17 = 0;
                            while (i17 < iM21158a4) {
                                c8620m.m21160b(i16);
                                i17++;
                                i16 = 8;
                            }
                        } else {
                            if (iM21158a3 != i14) {
                                throw new C8711r(AbstractC8673m.m21221a("floor type greater than 1 not decodable: ", iM21158a3));
                            }
                            int iM21158a5 = c8620m.m21158a(5);
                            int[] iArr = new int[iM21158a5];
                            int i18 = -1;
                            for (int i19 = 0; i19 < iM21158a5; i19++) {
                                int iM21158a6 = c8620m.m21158a(i9);
                                iArr[i19] = iM21158a6;
                                if (iM21158a6 > i18) {
                                    i18 = iM21158a6;
                                }
                            }
                            int i20 = i18 + 1;
                            int[] iArr2 = new int[i20];
                            int i21 = 0;
                            while (i21 < i20) {
                                iArr2[i21] = c8620m.m21158a(3) + 1;
                                int iM21158a7 = c8620m.m21158a(2);
                                int i22 = i11;
                                if (iM21158a7 > 0) {
                                    c8620m.m21160b(i22);
                                }
                                int i23 = 0;
                                for (int i24 = 1; i23 < (i24 << iM21158a7); i24 = 1) {
                                    c8620m.m21160b(i22);
                                    i23++;
                                    i22 = 8;
                                }
                                i21++;
                                i11 = 8;
                            }
                            c8620m.m21160b(2);
                            int iM21158a8 = c8620m.m21158a(4);
                            int i25 = 0;
                            int i26 = 0;
                            for (int i27 = 0; i27 < iM21158a5; i27++) {
                                i25 += iArr2[iArr[i27]];
                                while (i26 < i25) {
                                    c8620m.m21160b(iM21158a8);
                                    i26++;
                                }
                            }
                        }
                        i15++;
                        i11 = 8;
                        i12 = 6;
                        i14 = 1;
                        i9 = 4;
                        i10 = 16;
                    }
                    int i28 = i12;
                    int iM21158a9 = c8620m.m21158a(i28) + 1;
                    int i29 = 0;
                    while (i29 < iM21158a9) {
                        if (c8620m.m21158a(16) > 2) {
                            throw new C8711r("residueType greater than 2 is not decodable");
                        }
                        c8620m.m21160b(24);
                        c8620m.m21160b(24);
                        c8620m.m21160b(24);
                        int iM21158a10 = c8620m.m21158a(i28) + 1;
                        int i30 = 8;
                        c8620m.m21160b(8);
                        int[] iArr3 = new int[iM21158a10];
                        for (int i31 = 0; i31 < iM21158a10; i31++) {
                            iArr3[i31] = ((c8620m.m21159a() ? c8620m.m21158a(5) : 0) * 8) + c8620m.m21158a(3);
                        }
                        int i32 = 0;
                        while (i32 < iM21158a10) {
                            int i33 = 0;
                            while (i33 < i30) {
                                if ((iArr3[i32] & (1 << i33)) != 0) {
                                    c8620m.m21160b(i30);
                                }
                                i33++;
                                i30 = 8;
                            }
                            i32++;
                            i30 = 8;
                        }
                        i29++;
                        i28 = 6;
                    }
                    int iM21158a11 = c8620m.m21158a(i28) + 1;
                    for (int i34 = 0; i34 < iM21158a11; i34++) {
                        int iM21158a12 = c8620m.m21158a(16);
                        if (iM21158a12 != 0) {
                            Log.e("VorbisUtil", "mapping type other than 0 not supported: " + iM21158a12);
                        } else {
                            int iM21158a13 = c8620m.m21159a() ? c8620m.m21158a(4) + 1 : 1;
                            if (c8620m.m21159a()) {
                                int iM21158a14 = c8620m.m21158a(8) + 1;
                                for (int i35 = 0; i35 < iM21158a14; i35++) {
                                    int i36 = i5 - 1;
                                    int i37 = 0;
                                    for (int i38 = i36; i38 > 0; i38 >>>= 1) {
                                        i37++;
                                    }
                                    c8620m.m21160b(i37);
                                    int i39 = 0;
                                    while (i36 > 0) {
                                        i39++;
                                        i36 >>>= 1;
                                    }
                                    c8620m.m21160b(i39);
                                }
                            }
                            if (c8620m.m21158a(2) != 0) {
                                throw new C8711r("to reserved bits must be zero after mapping coupling steps");
                            }
                            if (iM21158a13 > 1) {
                                for (int i40 = 0; i40 < i5; i40++) {
                                    c8620m.m21160b(4);
                                }
                            }
                            for (int i41 = 0; i41 < iM21158a13; i41++) {
                                c8620m.m21160b(8);
                                c8620m.m21160b(8);
                                c8620m.m21160b(8);
                            }
                        }
                    }
                    int iM21158a15 = c8620m.m21158a(6);
                    int i42 = iM21158a15 + 1;
                    C8624q[] c8624qArr = new C8624q[i42];
                    for (int i43 = 0; i43 < i42; i43++) {
                        boolean zM21159a = c8620m.m21159a();
                        c8620m.m21158a(16);
                        c8620m.m21158a(16);
                        c8620m.m21158a(8);
                        c8624qArr[i43] = new C8624q(zM21159a);
                    }
                    if (!c8620m.m21159a()) {
                        throw new C8711r("framing bit after modes not set as expected");
                    }
                    int i44 = 0;
                    while (iM21158a15 > 0) {
                        i44++;
                        iM21158a15 >>>= 1;
                    }
                    c8621n = new C8621n(this.f19857q, bArr, c8624qArr, i44);
                    break;
                }
                if (c8620m.m21158a(24) != 5653314) {
                    throw new C8711r("expected code book to start with [0x56, 0x43, 0x42] at " + ((c8620m.f19848c * 8) + c8620m.f19849d));
                }
                int iM21158a16 = c8620m.m21158a(16);
                int iM21158a17 = c8620m.m21158a(24);
                long[] jArr = new long[iM21158a17];
                long j2 = 0;
                if (c8620m.m21159a()) {
                    i = i2;
                    int iM21158a18 = c8620m.m21158a(i6) + 1;
                    int i45 = 0;
                    while (i45 < iM21158a17) {
                        int i46 = 0;
                        for (int i47 = iM21158a17 - i45; i47 > 0; i47 >>>= 1) {
                            i46++;
                        }
                        int iM21158a19 = c8620m.m21158a(i46);
                        int i48 = 0;
                        while (i48 < iM21158a19 && i45 < iM21158a17) {
                            jArr[i45] = iM21158a18;
                            i45++;
                            i48++;
                            iM21352j = iM21352j;
                        }
                        iM21158a18++;
                        iM21352j = iM21352j;
                    }
                } else {
                    boolean zM21159a2 = c8620m.m21159a();
                    int i49 = 0;
                    while (i49 < iM21158a17) {
                        if (!zM21159a2) {
                            jArr[i49] = c8620m.m21158a(i6) + 1;
                        } else if (c8620m.m21159a()) {
                            jArr[i49] = c8620m.m21158a(i6) + 1;
                        } else {
                            jArr[i49] = 0;
                        }
                        i49++;
                        i2 = i2;
                    }
                    i = i2;
                }
                int i50 = iM21352j;
                int iM21158a20 = c8620m.m21158a(4);
                if (iM21158a20 > 2) {
                    throw new C8711r(AbstractC8673m.m21221a("lookup type greater than 2 not decodable: ", iM21158a20));
                }
                int i51 = i;
                if (iM21158a20 == i51 || iM21158a20 == 2) {
                    c8620m.m21160b(32);
                    c8620m.m21160b(32);
                    int iM21158a21 = c8620m.m21158a(4) + i51;
                    c8620m.m21160b(i51);
                    if (iM21158a20 == i51) {
                        if (iM21158a16 != 0) {
                            jFloor = (long) Math.floor(Math.pow(iM21158a17, 1.0d / ((double) iM21158a16)));
                        }
                        c8620m.m21160b((int) (((long) iM21158a21) * j2));
                    } else {
                        jFloor = iM21158a17 * iM21158a16;
                    }
                    j2 = jFloor;
                    c8620m.m21160b((int) (((long) iM21158a21) * j2));
                }
                i8++;
                i7 = i7;
                iM21352j = i50;
                i2 = 1;
                i6 = 5;
            }
        }
        this.f19854n = c8621n;
        if (c8621n == null) {
            return true;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f19854n.f19850a.f19865f);
        arrayList.add(this.f19854n.f19851b);
        C8625r c8625r = this.f19854n.f19850a;
        c8617j.f19831a = C8708o.m21263a(null, "audio/vorbis", c8625r.f19862c, -1, c8625r.f19860a, (int) c8625r.f19861b, arrayList, null, null);
        return true;
    }
}
