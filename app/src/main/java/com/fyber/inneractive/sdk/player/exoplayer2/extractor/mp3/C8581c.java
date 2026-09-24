package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3;

import com.fyber.inneractive.sdk.player.exoplayer2.C8708o;
import com.fyber.inneractive.sdk.player.exoplayer2.C8711r;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8527b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8571m;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8606n;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8607o;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8568j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8629r;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.C8685b;
import com.fyber.inneractive.sdk.player.exoplayer2.metadata.id3.C8699n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8815n;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.io.EOFException;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp3.c */
/* JADX INFO: loaded from: classes4.dex */
public final class C8581c implements InterfaceC8567i {

    /* JADX INFO: renamed from: m */
    public static final int f19500m = AbstractC8827z.m21379a("Xing");

    /* JADX INFO: renamed from: n */
    public static final int f19501n = AbstractC8827z.m21379a("Info");

    /* JADX INFO: renamed from: o */
    public static final int f19502o = AbstractC8827z.m21379a("VBRI");

    /* JADX INFO: renamed from: a */
    public final long f19503a;

    /* JADX INFO: renamed from: e */
    public InterfaceC8568j f19507e;

    /* JADX INFO: renamed from: f */
    public InterfaceC8629r f19508f;

    /* JADX INFO: renamed from: g */
    public int f19509g;

    /* JADX INFO: renamed from: h */
    public C8685b f19510h;

    /* JADX INFO: renamed from: i */
    public InterfaceC8580b f19511i;

    /* JADX INFO: renamed from: k */
    public long f19513k;

    /* JADX INFO: renamed from: l */
    public int f19514l;

    /* JADX INFO: renamed from: b */
    public final C8815n f19504b = new C8815n(10);

    /* JADX INFO: renamed from: c */
    public final C8606n f19505c = new C8606n();

    /* JADX INFO: renamed from: d */
    public final C8571m f19506d = new C8571m();

    /* JADX INFO: renamed from: j */
    public long f19512j = -9223372036854775807L;

    public C8581c(long j) {
        this.f19503a = j;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    /* JADX WARN: Code duplicated, block: B:25:0x0054  */
    /* JADX WARN: Code duplicated, block: B:27:0x005a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0065  */
    /* JADX WARN: Code duplicated, block: B:30:0x0067  */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i
    /* JADX INFO: renamed from: a */
    public final int mo21035a(C8527b c8527b, C8607o c8607o) throws Throwable {
        long j;
        long j2;
        int i;
        int iM21340b;
        int iM21340b2;
        int i2;
        InterfaceC8580b interfaceC8580bM21120b;
        int iM21355m;
        C8583e c8583e;
        int iM21352j;
        long j3;
        long jMin;
        if (this.f19509g == 0) {
            try {
                m21119a(c8527b, false);
            } catch (EOFException unused) {
                return -1;
            }
        }
        int i3 = 1;
        if (this.f19511i == null) {
            C8815n c8815n = new C8815n(this.f19505c.f19788c);
            c8527b.m21025a(c8815n.f20643a, 0, this.f19505c.f19788c, false);
            C8606n c8606n = this.f19505c;
            if ((c8606n.f19786a & 1) != 0) {
                if (c8606n.f19790e != 1) {
                    i = 36;
                } else {
                    i = 21;
                }
            } else if (c8606n.f19790e != 1) {
                i = 21;
            } else {
                i = 13;
            }
            if (c8815n.f20645c >= i + 4) {
                c8815n.m21347e(i);
                iM21340b = c8815n.m21340b();
                if (iM21340b != f19500m && iM21340b != f19501n) {
                    if (c8815n.f20645c >= 40) {
                        c8815n.m21347e(36);
                        iM21340b2 = c8815n.m21340b();
                        i2 = f19502o;
                        if (iM21340b2 == i2) {
                            iM21340b = i2;
                        } else {
                            iM21340b = 0;
                        }
                    } else {
                        iM21340b = 0;
                    }
                }
            } else if (c8815n.f20645c >= 40) {
                c8815n.m21347e(36);
                iM21340b2 = c8815n.m21340b();
                i2 = f19502o;
                if (iM21340b2 == i2) {
                    iM21340b = i2;
                } else {
                    iM21340b = 0;
                }
            } else {
                iM21340b = 0;
            }
            if (iM21340b == f19500m || iM21340b == f19501n) {
                j = 1000000;
                j2 = 0;
                C8606n c8606n2 = this.f19505c;
                long j4 = c8527b.f19124c;
                long j5 = c8527b.f19123b;
                int i4 = c8606n2.f19792g;
                int i5 = c8606n2.f19789d;
                long j6 = j4 + ((long) c8606n2.f19788c);
                int iM21340b3 = c8815n.m21340b();
                if ((iM21340b3 & 1) != 1 || (iM21355m = c8815n.m21355m()) == 0) {
                    interfaceC8580bM21120b = null;
                } else {
                    long jM21382a = AbstractC8827z.m21382a(iM21355m, ((long) i4) * 1000000, i5);
                    if ((iM21340b3 & 6) != 6) {
                        c8583e = new C8583e(j6, jM21382a, j5, null, 0L, 0);
                    } else {
                        long jM21355m = c8815n.m21355m();
                        c8815n.m21347e(c8815n.f20644b + 1);
                        long[] jArr = new long[99];
                        for (int i6 = 0; i6 < 99; i6++) {
                            jArr[i6] = c8815n.m21352j();
                        }
                        c8583e = new C8583e(j6, jM21382a, j5, jArr, jM21355m, c8606n2.f19788c);
                    }
                    interfaceC8580bM21120b = c8583e;
                }
                if (interfaceC8580bM21120b != null) {
                    C8571m c8571m = this.f19506d;
                    if (c8571m.f19383a == -1 || c8571m.f19384b == -1) {
                        c8527b.f19126e = 0;
                        c8527b.m21024a(i + ModuleDescriptor.MODULE_VERSION, false);
                        c8527b.m21025a(this.f19504b.f20643a, 0, 3, false);
                        this.f19504b.m21347e(0);
                        C8571m c8571m2 = this.f19506d;
                        int iM21354l = this.f19504b.m21354l();
                        c8571m2.getClass();
                        int i7 = iM21354l >> 12;
                        int i8 = iM21354l & 4095;
                        if (i7 > 0 || i8 > 0) {
                            c8571m2.f19383a = i7;
                            c8571m2.f19384b = i8;
                        }
                    }
                }
                c8527b.m21023a(this.f19505c.f19788c);
                if (interfaceC8580bM21120b != null && !interfaceC8580bM21120b.mo21020a() && iM21340b == f19501n) {
                    interfaceC8580bM21120b = m21120b(c8527b);
                }
            } else if (iM21340b == f19502o) {
                C8606n c8606n3 = this.f19505c;
                long j7 = c8527b.f19124c;
                j = 1000000;
                long j8 = c8527b.f19123b;
                c8815n.m21347e(c8815n.f20644b + 10);
                int iM21340b4 = c8815n.m21340b();
                if (iM21340b4 <= 0) {
                    j2 = 0;
                } else {
                    j2 = 0;
                    int i9 = c8606n3.f19789d;
                    long j9 = j8;
                    long jM21382a2 = AbstractC8827z.m21382a(iM21340b4, ((long) (i9 >= 32000 ? 1152 : 576)) * 1000000, i9);
                    int iM21357o = c8815n.m21357o();
                    int iM21357o2 = c8815n.m21357o();
                    int iM21357o3 = c8815n.m21357o();
                    int i10 = 2;
                    c8815n.m21347e(c8815n.f20644b + 2);
                    long j10 = j7 + ((long) c8606n3.f19788c);
                    int i11 = iM21357o + 1;
                    long[] jArr2 = new long[i11];
                    long[] jArr3 = new long[i11];
                    jArr2[0] = 0;
                    jArr3[0] = j10;
                    int i12 = 1;
                    while (true) {
                        if (i12 >= i11) {
                            interfaceC8580bM21120b = new C8582d(jArr2, jArr3, jM21382a2);
                            break;
                        }
                        if (iM21357o3 == i3) {
                            iM21352j = c8815n.m21352j();
                        } else if (iM21357o3 == i10) {
                            iM21352j = c8815n.m21357o();
                        } else if (iM21357o3 == 3) {
                            iM21352j = c8815n.m21354l();
                        } else if (iM21357o3 == 4) {
                            iM21352j = c8815n.m21355m();
                        }
                        int i13 = i11;
                        j10 += (long) (iM21352j * iM21357o2);
                        int i14 = iM21357o2;
                        int i15 = iM21357o3;
                        jArr2[i12] = (((long) i12) * jM21382a2) / ((long) iM21357o);
                        if (j9 == -1) {
                            jMin = j10;
                            j3 = j9;
                        } else {
                            j3 = j9;
                            jMin = Math.min(j3, j10);
                        }
                        jArr3[i12] = jMin;
                        i12++;
                        j9 = j3;
                        iM21357o2 = i14;
                        i11 = i13;
                        iM21357o3 = i15;
                        i10 = 2;
                        i3 = 1;
                    }
                    c8527b.m21023a(this.f19505c.f19788c);
                }
                interfaceC8580bM21120b = null;
                c8527b.m21023a(this.f19505c.f19788c);
            } else {
                j = 1000000;
                j2 = 0;
                c8527b.f19126e = 0;
                interfaceC8580bM21120b = null;
            }
            this.f19511i = interfaceC8580bM21120b;
            if (interfaceC8580bM21120b == null) {
                this.f19511i = m21120b(c8527b);
            }
            this.f19507e.mo21093a(this.f19511i);
            InterfaceC8629r interfaceC8629r = this.f19508f;
            C8606n c8606n4 = this.f19505c;
            String str = c8606n4.f19787b;
            int i16 = c8606n4.f19790e;
            int i17 = c8606n4.f19789d;
            C8571m c8571m3 = this.f19506d;
            interfaceC8629r.mo21053a(C8708o.m21262a(null, str, -1, 4096, i16, i17, -1, c8571m3.f19383a, c8571m3.f19384b, null, null, 0, null, this.f19510h));
        } else {
            j = 1000000;
            j2 = 0;
        }
        if (this.f19514l == 0) {
            c8527b.f19126e = 0;
            if (!c8527b.m21025a(this.f19504b.f20643a, 0, 4, true)) {
                return -1;
            }
            this.f19504b.m21347e(0);
            int iM21340b5 = this.f19504b.m21340b();
            if (((-128000) & iM21340b5) != (((long) this.f19509g) & (-128000)) || C8606n.m21145a(iM21340b5) == -1) {
                c8527b.m21023a(1);
                this.f19509g = 0;
                return 0;
            }
            C8606n.m21146a(iM21340b5, this.f19505c);
            if (this.f19512j == -9223372036854775807L) {
                this.f19512j = this.f19511i.mo21118b(c8527b.f19124c);
                if (this.f19503a != -9223372036854775807L) {
                    this.f19512j = (this.f19503a - this.f19511i.mo21118b(j2)) + this.f19512j;
                }
            }
            this.f19514l = this.f19505c.f19788c;
        }
        int iMo21046a = this.f19508f.mo21046a(c8527b, this.f19514l, true);
        if (iMo21046a == -1) {
            return -1;
        }
        int i18 = this.f19514l - iMo21046a;
        this.f19514l = i18;
        if (i18 > 0) {
            return 0;
        }
        long j11 = this.f19512j;
        long j12 = this.f19513k * j;
        C8606n c8606n5 = this.f19505c;
        this.f19508f.mo21051a((j12 / ((long) c8606n5.f19789d)) + j11, 1, c8606n5.f19788c, 0, null);
        this.f19513k += (long) this.f19505c.f19792g;
        this.f19514l = 0;
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i
    /* JADX INFO: renamed from: a */
    public final void mo21036a(long j, long j2) {
        this.f19509g = 0;
        this.f19512j = -9223372036854775807L;
        this.f19513k = 0L;
        this.f19514l = 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i
    /* JADX INFO: renamed from: a */
    public final void mo21037a(InterfaceC8568j interfaceC8568j) {
        this.f19507e = interfaceC8568j;
        this.f19508f = interfaceC8568j.mo21092a(0, 1);
        this.f19507e.mo21096b();
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i
    /* JADX INFO: renamed from: a */
    public final boolean mo21038a(C8527b c8527b) {
        return m21119a(c8527b, true);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m21119a(C8527b c8527b, boolean z) throws Throwable {
        int i;
        int i2;
        int iM21145a;
        int i3 = z ? 16384 : 131072;
        c8527b.f19126e = 0;
        if (c8527b.f19124c == 0) {
            int i4 = 0;
            while (true) {
                c8527b.m21025a(this.f19504b.f20643a, 0, 10, false);
                this.f19504b.m21347e(0);
                if (this.f19504b.m21354l() != C8699n.f20280b) {
                    break;
                }
                C8815n c8815n = this.f19504b;
                c8815n.m21347e(c8815n.f20644b + 3);
                int iM21351i = this.f19504b.m21351i();
                int i5 = iM21351i + 10;
                if (this.f19510h == null) {
                    byte[] bArr = new byte[i5];
                    System.arraycopy(this.f19504b.f20643a, 0, bArr, 0, 10);
                    c8527b.m21025a(bArr, 10, iM21351i, false);
                    C8685b c8685bM21261a = new C8699n(null).m21261a(i5, bArr);
                    this.f19510h = c8685bM21261a;
                    if (c8685bM21261a != null) {
                        this.f19506d.m21109a(c8685bM21261a);
                    }
                } else {
                    c8527b.m21024a(iM21351i, false);
                }
                i4 += i5;
            }
            c8527b.f19126e = 0;
            c8527b.m21024a(i4, false);
            i = (int) (c8527b.f19124c + ((long) c8527b.f19126e));
            if (!z) {
                c8527b.m21023a(i);
            }
            i2 = 0;
        } else {
            i = 0;
            i2 = 0;
        }
        int i6 = i2;
        int i7 = i6;
        while (true) {
            if (!c8527b.m21025a(this.f19504b.f20643a, 0, 4, i2 > 0)) {
                break;
            }
            this.f19504b.m21347e(0);
            int iM21340b = this.f19504b.m21340b();
            if ((i6 == 0 || ((-128000) & iM21340b) == (((long) i6) & (-128000))) && (iM21145a = C8606n.m21145a(iM21340b)) != -1) {
                i2++;
                if (i2 != 1) {
                    if (i2 == 4) {
                        break;
                    }
                } else {
                    C8606n.m21146a(iM21340b, this.f19505c);
                    i6 = iM21340b;
                }
                c8527b.m21024a(iM21145a - 4, false);
            } else {
                int i8 = i7 + 1;
                if (i7 == i3) {
                    if (z) {
                        return false;
                    }
                    throw new C8711r("Searched too many bytes.");
                }
                if (z) {
                    c8527b.f19126e = 0;
                    c8527b.m21024a(i + i8, false);
                } else {
                    c8527b.m21023a(1);
                }
                i6 = 0;
                i7 = i8;
                i2 = 0;
            }
        }
        if (z) {
            c8527b.m21023a(i + i7);
        } else {
            c8527b.f19126e = 0;
        }
        this.f19509g = i6;
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final C8579a m21120b(C8527b c8527b) {
        c8527b.m21025a(this.f19504b.f20643a, 0, 4, false);
        this.f19504b.m21347e(0);
        C8606n.m21146a(this.f19504b.m21340b(), this.f19505c);
        return new C8579a(this.f19505c.f19791f, c8527b.f19124c, c8527b.f19123b);
    }
}
