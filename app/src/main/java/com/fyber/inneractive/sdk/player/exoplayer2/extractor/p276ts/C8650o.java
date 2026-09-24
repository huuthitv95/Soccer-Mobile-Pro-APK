package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts;

import android.util.Log;
import com.fyber.inneractive.sdk.player.exoplayer2.C8708o;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8538g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8568j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8629r;
import com.fyber.inneractive.sdk.player.exoplayer2.text.cea.AbstractC8744a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8813l;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8815n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8816o;
import java.util.Collections;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.o */
/* JADX INFO: loaded from: classes4.dex */
public final class C8650o implements InterfaceC8643h {

    /* JADX INFO: renamed from: a */
    public final C8659x f20034a;

    /* JADX INFO: renamed from: b */
    public String f20035b;

    /* JADX INFO: renamed from: c */
    public InterfaceC8629r f20036c;

    /* JADX INFO: renamed from: d */
    public C8649n f20037d;

    /* JADX INFO: renamed from: e */
    public boolean f20038e;

    /* JADX INFO: renamed from: l */
    public long f20045l;

    /* JADX INFO: renamed from: m */
    public long f20046m;

    /* JADX INFO: renamed from: f */
    public final boolean[] f20039f = new boolean[3];

    /* JADX INFO: renamed from: g */
    public final C8653r f20040g = new C8653r(32);

    /* JADX INFO: renamed from: h */
    public final C8653r f20041h = new C8653r(33);

    /* JADX INFO: renamed from: i */
    public final C8653r f20042i = new C8653r(34);

    /* JADX INFO: renamed from: j */
    public final C8653r f20043j = new C8653r(39);

    /* JADX INFO: renamed from: k */
    public final C8653r f20044k = new C8653r(40);

    /* JADX INFO: renamed from: n */
    public final C8815n f20047n = new C8815n();

    public C8650o(C8659x c8659x) {
        this.f20034a = c8659x;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts.InterfaceC8643h
    /* JADX INFO: renamed from: a */
    public final void mo21165a() {
        AbstractC8813l.m21331a(this.f20039f);
        C8653r c8653r = this.f20040g;
        c8653r.f20067b = false;
        c8653r.f20068c = false;
        C8653r c8653r2 = this.f20041h;
        c8653r2.f20067b = false;
        c8653r2.f20068c = false;
        C8653r c8653r3 = this.f20042i;
        c8653r3.f20067b = false;
        c8653r3.f20068c = false;
        C8653r c8653r4 = this.f20043j;
        c8653r4.f20067b = false;
        c8653r4.f20068c = false;
        C8653r c8653r5 = this.f20044k;
        c8653r5.f20067b = false;
        c8653r5.f20068c = false;
        C8649n c8649n = this.f20037d;
        c8649n.f20026f = false;
        c8649n.f20027g = false;
        c8649n.f20028h = false;
        c8649n.f20029i = false;
        c8649n.f20030j = false;
        this.f20045l = 0L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts.InterfaceC8643h
    /* JADX INFO: renamed from: a */
    public final void mo21166a(InterfaceC8568j interfaceC8568j, C8639e0 c8639e0) {
        c8639e0.m21174a();
        c8639e0.m21175b();
        this.f20035b = c8639e0.f19937e;
        c8639e0.m21175b();
        C8538g c8538gMo21092a = interfaceC8568j.mo21092a(c8639e0.f19936d, 2);
        this.f20036c = c8538gMo21092a;
        this.f20037d = new C8649n(c8538gMo21092a);
        this.f20034a.m21185a(interfaceC8568j, c8639e0);
    }

    /* JADX WARN: Code duplicated, block: B:146:0x0303 A[PHI: r12 r15 r17 r18
  0x0303: PHI (r12v1 int) = (r12v0 int), (r12v0 int), (r12v0 int), (r12v4 int) binds: [B:37:0x00c5, B:39:0x00cb, B:41:0x00d1, B:35:0x009b] A[DONT_GENERATE, DONT_INLINE]
  0x0303: PHI (r15v2 int) = (r15v1 int), (r15v1 int), (r15v1 int), (r9v2 int) binds: [B:37:0x00c5, B:39:0x00cb, B:41:0x00d1, B:35:0x009b] A[DONT_GENERATE, DONT_INLINE]
  0x0303: PHI (r17v1 int) = (r17v0 int), (r17v0 int), (r17v0 int), (r17v3 int) binds: [B:37:0x00c5, B:39:0x00cb, B:41:0x00d1, B:35:0x009b] A[DONT_GENERATE, DONT_INLINE]
  0x0303: PHI (r18v1 long) = (r18v0 long), (r18v0 long), (r18v0 long), (r18v3 long) binds: [B:37:0x00c5, B:39:0x00cb, B:41:0x00d1, B:35:0x009b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:173:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:180:0x03c7  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts.InterfaceC8643h
    /* JADX INFO: renamed from: a */
    public final void mo21167a(C8815n c8815n) {
        long j;
        int i;
        int i2;
        int i3;
        float f;
        long j2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        while (true) {
            int i4 = c8815n.f20645c;
            int i5 = c8815n.f20644b;
            int i6 = i4 - i5;
            if (i6 <= 0) {
                return;
            }
            byte[] bArr = c8815n.f20643a;
            this.f20045l += (long) i6;
            this.f20036c.mo21049a(i6, c8815n);
            while (i5 < i4) {
                int iM21329a = AbstractC8813l.m21329a(bArr, i5, i4, this.f20039f);
                if (iM21329a == i4) {
                    m21180a(bArr, i5, i4);
                    return;
                }
                int i7 = iM21329a + 3;
                int i8 = (bArr[i7] & 126) >> 1;
                int i9 = iM21329a - i5;
                if (i9 > 0) {
                    m21180a(bArr, i5, iM21329a);
                }
                int i10 = i4 - iM21329a;
                long j3 = this.f20045l - ((long) i10);
                int i11 = i9 < 0 ? -i9 : 0;
                long j4 = this.f20046m;
                if (this.f20038e) {
                    C8649n c8649n = this.f20037d;
                    i2 = 5;
                    if (c8649n.f20030j && c8649n.f20027g) {
                        c8649n.f20033m = c8649n.f20023c;
                        c8649n.f20030j = false;
                    } else if (c8649n.f20028h || c8649n.f20027g) {
                        j = j4;
                        if (c8649n.f20029i) {
                            long j5 = c8649n.f20022b;
                            i = i10;
                            c8649n.f20021a.mo21051a(c8649n.f20032l, c8649n.f20033m ? 1 : 0, (int) (j5 - c8649n.f20031k), i + ((int) (j3 - j5)), null);
                        } else {
                            i = i10;
                        }
                        c8649n.f20031k = c8649n.f20022b;
                        c8649n.f20032l = c8649n.f20025e;
                        c8649n.f20029i = true;
                        c8649n.f20033m = c8649n.f20023c;
                        i3 = 16;
                    }
                    j = j4;
                    i = i10;
                    i3 = 16;
                    i11 = i11;
                } else {
                    j = j4;
                    i = i10;
                    i2 = 5;
                    i11 = i11;
                    this.f20040g.m21182a(i11);
                    this.f20041h.m21182a(i11);
                    this.f20042i.m21182a(i11);
                    C8653r c8653r = this.f20040g;
                    if (c8653r.f20068c) {
                        C8653r c8653r2 = this.f20041h;
                        if (c8653r2.f20068c) {
                            C8653r c8653r3 = this.f20042i;
                            if (c8653r3.f20068c) {
                                InterfaceC8629r interfaceC8629r = this.f20036c;
                                String str = this.f20035b;
                                int i12 = c8653r.f20070e;
                                byte[] bArr2 = new byte[c8653r2.f20070e + i12 + c8653r3.f20070e];
                                System.arraycopy(c8653r.f20069d, 0, bArr2, 0, i12);
                                System.arraycopy(c8653r2.f20069d, 0, bArr2, c8653r.f20070e, c8653r2.f20070e);
                                System.arraycopy(c8653r3.f20069d, 0, bArr2, c8653r.f20070e + c8653r2.f20070e, c8653r3.f20070e);
                                C8816o c8816o = new C8816o(c8653r2.f20069d, 0, c8653r2.f20070e);
                                c8816o.m21365d(44);
                                int i13 = 3;
                                int iM21360b = c8816o.m21360b(3);
                                c8816o.m21367f();
                                c8816o.m21365d(88);
                                c8816o.m21365d(8);
                                int i14 = 0;
                                for (int i15 = 0; i15 < iM21360b; i15++) {
                                    if (c8816o.m21362c()) {
                                        i14 += 89;
                                    }
                                    if (c8816o.m21362c()) {
                                        i14 += 8;
                                    }
                                }
                                c8816o.m21365d(i14);
                                int i16 = 2;
                                if (iM21360b > 0) {
                                    c8816o.m21365d((8 - iM21360b) * 2);
                                }
                                c8816o.m21364d();
                                int iM21364d = c8816o.m21364d();
                                if (iM21364d == 3) {
                                    c8816o.m21367f();
                                }
                                int iM21364d2 = c8816o.m21364d();
                                int iM21364d3 = c8816o.m21364d();
                                if (c8816o.m21362c()) {
                                    int iM21364d4 = c8816o.m21364d();
                                    int iM21364d5 = c8816o.m21364d();
                                    int iM21364d6 = c8816o.m21364d();
                                    int iM21364d7 = c8816o.m21364d();
                                    iM21364d2 -= (iM21364d4 + iM21364d5) * ((iM21364d == 1 || iM21364d == 2) ? 2 : 1);
                                    iM21364d3 -= (iM21364d6 + iM21364d7) * (iM21364d == 1 ? 2 : 1);
                                }
                                int i17 = iM21364d2;
                                int i18 = iM21364d3;
                                c8816o.m21364d();
                                c8816o.m21364d();
                                int iM21364d8 = c8816o.m21364d();
                                for (int i19 = c8816o.m21362c() ? 0 : iM21360b; i19 <= iM21360b; i19++) {
                                    c8816o.m21364d();
                                    c8816o.m21364d();
                                    c8816o.m21364d();
                                }
                                c8816o.m21364d();
                                c8816o.m21364d();
                                c8816o.m21364d();
                                c8816o.m21364d();
                                c8816o.m21364d();
                                c8816o.m21364d();
                                if (c8816o.m21362c() && c8816o.m21362c()) {
                                    int i20 = 0;
                                    while (i20 < 4) {
                                        for (int i21 = 0; i21 < 6; i21 += i20 == i13 ? i13 : 1) {
                                            if (c8816o.m21362c()) {
                                                int iMin = Math.min(64, 1 << ((i20 << 1) + 4));
                                                if (i20 > 1) {
                                                    c8816o.m21366e();
                                                }
                                                for (int i22 = 0; i22 < iMin; i22++) {
                                                    c8816o.m21366e();
                                                }
                                                i13 = 3;
                                            } else {
                                                c8816o.m21364d();
                                            }
                                        }
                                        i20++;
                                        i16 = 2;
                                    }
                                }
                                c8816o.m21365d(i16);
                                if (c8816o.m21362c()) {
                                    c8816o.m21365d(8);
                                    c8816o.m21364d();
                                    c8816o.m21364d();
                                    c8816o.m21367f();
                                }
                                int iM21364d9 = c8816o.m21364d();
                                boolean zM21362c = false;
                                int i23 = 0;
                                int i24 = 0;
                                while (i24 < iM21364d9) {
                                    if (i24 != 0) {
                                        zM21362c = c8816o.m21362c();
                                    }
                                    if (zM21362c) {
                                        c8816o.m21367f();
                                        c8816o.m21364d();
                                        for (int i25 = 0; i25 <= i23; i25++) {
                                            if (c8816o.m21362c()) {
                                                c8816o.m21367f();
                                            }
                                        }
                                    } else {
                                        int iM21364d10 = c8816o.m21364d();
                                        int iM21364d11 = c8816o.m21364d();
                                        int i26 = iM21364d10 + iM21364d11;
                                        for (int i27 = 0; i27 < iM21364d10; i27++) {
                                            c8816o.m21364d();
                                            c8816o.m21367f();
                                        }
                                        for (int i28 = 0; i28 < iM21364d11; i28++) {
                                            c8816o.m21364d();
                                            c8816o.m21367f();
                                        }
                                        i23 = i26;
                                    }
                                    i24++;
                                    bArr2 = bArr2;
                                }
                                byte[] bArr3 = bArr2;
                                if (c8816o.m21362c()) {
                                    for (int i29 = 0; i29 < c8816o.m21364d(); i29++) {
                                        c8816o.m21365d(iM21364d8 + 5);
                                    }
                                }
                                c8816o.m21365d(2);
                                if (c8816o.m21362c() && c8816o.m21362c()) {
                                    int iM21360b2 = c8816o.m21360b(8);
                                    if (iM21360b2 == 255) {
                                        i3 = 16;
                                        int iM21360b3 = c8816o.m21360b(16);
                                        int iM21360b4 = c8816o.m21360b(16);
                                        if (iM21360b3 != 0 && iM21360b4 != 0) {
                                            f = iM21360b3 / iM21360b4;
                                        }
                                    } else {
                                        i3 = 16;
                                        float[] fArr = AbstractC8813l.f20636b;
                                        if (iM21360b2 < 17) {
                                            f = fArr[iM21360b2];
                                        } else {
                                            Log.w("H265Reader", "Unexpected aspect_ratio_idc value: " + iM21360b2);
                                        }
                                    }
                                    interfaceC8629r.mo21053a(C8708o.m21264a(str, "video/hevc", -1, i17, i18, Collections.singletonList(bArr3), -1, f, null, -1, null, null));
                                    this.f20038e = true;
                                } else {
                                    i3 = 16;
                                }
                                f = 1.0f;
                                interfaceC8629r.mo21053a(C8708o.m21264a(str, "video/hevc", -1, i17, i18, Collections.singletonList(bArr3), -1, f, null, -1, null, null));
                                this.f20038e = true;
                            } else {
                                i3 = 16;
                            }
                        } else {
                            i3 = 16;
                        }
                    } else {
                        i3 = 16;
                    }
                }
                if (this.f20043j.m21182a(i11)) {
                    C8653r c8653r4 = this.f20043j;
                    int iM21328a = AbstractC8813l.m21328a(c8653r4.f20070e, c8653r4.f20069d);
                    C8815n c8815n2 = this.f20047n;
                    c8815n2.f20643a = this.f20043j.f20069d;
                    c8815n2.f20645c = iM21328a;
                    c8815n2.f20644b = 0;
                    c8815n2.m21347e(i2);
                    j2 = j;
                    AbstractC8744a.m21280a(j2, this.f20047n, this.f20034a.f20104b);
                } else {
                    j2 = j;
                }
                if (this.f20044k.m21182a(i11)) {
                    C8653r c8653r5 = this.f20044k;
                    int iM21328a2 = AbstractC8813l.m21328a(c8653r5.f20070e, c8653r5.f20069d);
                    C8815n c8815n3 = this.f20047n;
                    c8815n3.f20643a = this.f20044k.f20069d;
                    c8815n3.f20645c = iM21328a2;
                    c8815n3.f20644b = 0;
                    c8815n3.m21347e(5);
                    AbstractC8744a.m21280a(j2, this.f20047n, this.f20034a.f20104b);
                }
                long j6 = this.f20046m;
                if (this.f20038e) {
                    C8649n c8649n2 = this.f20037d;
                    c8649n2.f20027g = false;
                    c8649n2.f20028h = false;
                    c8649n2.f20025e = j6;
                    c8649n2.f20024d = 0;
                    c8649n2.f20022b = j3;
                    if (i8 >= 32) {
                        if (c8649n2.f20030j || !c8649n2.f20029i) {
                            z = false;
                        } else {
                            z = false;
                            c8649n2.f20021a.mo21051a(c8649n2.f20032l, c8649n2.f20033m ? 1 : 0, (int) (j3 - c8649n2.f20031k), i, null);
                            c8649n2.f20029i = false;
                        }
                        if (i8 <= 34) {
                            z2 = true;
                            c8649n2.f20028h = !c8649n2.f20030j;
                            c8649n2.f20030j = true;
                        }
                        if (i8 >= i3 || i8 > 21) {
                            z3 = z;
                        } else {
                            z3 = z2;
                        }
                        c8649n2.f20023c = z3;
                        if (!z3 || i8 <= 9) {
                            z4 = z2;
                        } else {
                            z4 = z;
                        }
                        c8649n2.f20026f = z4;
                    } else {
                        i3 = i3;
                        z = false;
                    }
                    z2 = true;
                    if (i8 >= i3) {
                        z3 = z;
                    } else {
                        z3 = z;
                    }
                    c8649n2.f20023c = z3;
                    if (z3) {
                        z4 = z2;
                    } else {
                        z4 = z2;
                    }
                    c8649n2.f20026f = z4;
                } else {
                    this.f20040g.m21183b(i8);
                    this.f20041h.m21183b(i8);
                    this.f20042i.m21183b(i8);
                }
                this.f20043j.m21183b(i8);
                this.f20044k.m21183b(i8);
                i5 = i7;
                i4 = i4;
                bArr = bArr;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts.InterfaceC8643h
    /* JADX INFO: renamed from: a */
    public final void mo21168a(boolean z, long j) {
        this.f20046m = j;
    }

    /* JADX INFO: renamed from: a */
    public final void m21180a(byte[] bArr, int i, int i2) {
        if (this.f20038e) {
            C8649n c8649n = this.f20037d;
            if (c8649n.f20026f) {
                int i3 = c8649n.f20024d;
                int i4 = (i + 2) - i3;
                if (i4 < i2) {
                    c8649n.f20027g = (bArr[i4] & 128) != 0;
                    c8649n.f20026f = false;
                } else {
                    c8649n.f20024d = (i2 - i) + i3;
                }
            }
        } else {
            this.f20040g.m21181a(bArr, i, i2);
            this.f20041h.m21181a(bArr, i, i2);
            this.f20042i.m21181a(bArr, i, i2);
        }
        this.f20043j.m21181a(bArr, i, i2);
        this.f20044k.m21181a(bArr, i, i2);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts.InterfaceC8643h
    /* JADX INFO: renamed from: b */
    public final void mo21169b() {
    }
}
