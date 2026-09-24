package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts;

import com.fyber.inneractive.sdk.player.exoplayer2.C8708o;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8538g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8568j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8629r;
import com.fyber.inneractive.sdk.player.exoplayer2.text.cea.AbstractC8744a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8813l;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8811j;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8812k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8815n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8816o;
import com.google.common.base.Ascii;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.m */
/* JADX INFO: loaded from: classes4.dex */
public final class C8648m implements InterfaceC8643h {

    /* JADX INFO: renamed from: a */
    public final C8659x f20007a;

    /* JADX INFO: renamed from: b */
    public final boolean f20008b;

    /* JADX INFO: renamed from: c */
    public final boolean f20009c;

    /* JADX INFO: renamed from: g */
    public long f20013g;

    /* JADX INFO: renamed from: i */
    public String f20015i;

    /* JADX INFO: renamed from: j */
    public InterfaceC8629r f20016j;

    /* JADX INFO: renamed from: k */
    public C8647l f20017k;

    /* JADX INFO: renamed from: l */
    public boolean f20018l;

    /* JADX INFO: renamed from: m */
    public long f20019m;

    /* JADX INFO: renamed from: h */
    public final boolean[] f20014h = new boolean[3];

    /* JADX INFO: renamed from: d */
    public final C8653r f20010d = new C8653r(7);

    /* JADX INFO: renamed from: e */
    public final C8653r f20011e = new C8653r(8);

    /* JADX INFO: renamed from: f */
    public final C8653r f20012f = new C8653r(6);

    /* JADX INFO: renamed from: n */
    public final C8815n f20020n = new C8815n();

    public C8648m(C8659x c8659x, boolean z, boolean z2) {
        this.f20007a = c8659x;
        this.f20008b = z;
        this.f20009c = z2;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts.InterfaceC8643h
    /* JADX INFO: renamed from: a */
    public final void mo21165a() {
        AbstractC8813l.m21331a(this.f20014h);
        C8653r c8653r = this.f20010d;
        c8653r.f20067b = false;
        c8653r.f20068c = false;
        C8653r c8653r2 = this.f20011e;
        c8653r2.f20067b = false;
        c8653r2.f20068c = false;
        C8653r c8653r3 = this.f20012f;
        c8653r3.f20067b = false;
        c8653r3.f20068c = false;
        C8647l c8647l = this.f20017k;
        c8647l.f19999k = false;
        c8647l.f20003o = false;
        C8646k c8646k = c8647l.f20002n;
        c8646k.f19974b = false;
        c8646k.f19973a = false;
        this.f20013g = 0L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts.InterfaceC8643h
    /* JADX INFO: renamed from: a */
    public final void mo21166a(InterfaceC8568j interfaceC8568j, C8639e0 c8639e0) {
        c8639e0.m21174a();
        c8639e0.m21175b();
        this.f20015i = c8639e0.f19937e;
        c8639e0.m21175b();
        C8538g c8538gMo21092a = interfaceC8568j.mo21092a(c8639e0.f19936d, 2);
        this.f20016j = c8538gMo21092a;
        this.f20017k = new C8647l(c8538gMo21092a, this.f20008b, this.f20009c);
        this.f20007a.m21185a(interfaceC8568j, c8639e0);
    }

    /* JADX WARN: Code duplicated, block: B:110:0x0288  */
    /* JADX WARN: Code duplicated, block: B:29:0x007e  */
    /* JADX WARN: Code duplicated, block: B:94:0x0242  */
    /* JADX WARN: Code duplicated, block: B:96:0x0246  */
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
        int i;
        int i2;
        int i3;
        boolean z;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z2;
        boolean z3;
        int i8 = c8815n.f20644b;
        int i9 = c8815n.f20645c;
        byte[] bArr = c8815n.f20643a;
        int i10 = i9 - i8;
        this.f20013g += (long) i10;
        this.f20016j.mo21049a(i10, c8815n);
        while (true) {
            int iM21329a = AbstractC8813l.m21329a(bArr, i8, i9, this.f20014h);
            if (iM21329a == i9) {
                break;
            }
            int i11 = iM21329a + 3;
            int i12 = bArr[i11] & Ascii.f22502US;
            int i13 = iM21329a - i8;
            if (i13 > 0) {
                if (!this.f20018l || this.f20017k.f19991c) {
                    this.f20010d.m21181a(bArr, i8, iM21329a);
                    this.f20011e.m21181a(bArr, i8, iM21329a);
                }
                this.f20012f.m21181a(bArr, i8, iM21329a);
                this.f20017k.m21179a(bArr, i8, iM21329a);
            }
            int i14 = i9 - iM21329a;
            long j = this.f20013g - ((long) i14);
            int i15 = i13 < 0 ? -i13 : 0;
            long j2 = this.f20019m;
            if (!this.f20018l || this.f20017k.f19991c) {
                this.f20010d.m21182a(i15);
                this.f20011e.m21182a(i15);
                if (this.f20018l) {
                    i = i14;
                    i2 = i9;
                    C8653r c8653r = this.f20010d;
                    if (c8653r.f20068c) {
                        C8812k c8812kM21330a = AbstractC8813l.m21330a(c8653r.f20069d, 3, c8653r.f20070e);
                        this.f20017k.f19992d.append(c8812kM21330a.f20625a, c8812kM21330a);
                        C8653r c8653r2 = this.f20010d;
                        c8653r2.f20067b = false;
                        c8653r2.f20068c = false;
                    } else {
                        C8653r c8653r3 = this.f20011e;
                        if (c8653r3.f20068c) {
                            C8816o c8816o = new C8816o(c8653r3.f20069d, 3, c8653r3.f20070e);
                            c8816o.m21365d(8);
                            int iM21364d = c8816o.m21364d();
                            int iM21364d2 = c8816o.m21364d();
                            c8816o.m21367f();
                            this.f20017k.f19993e.append(iM21364d, new C8811j(c8816o.m21362c(), iM21364d, iM21364d2));
                            C8653r c8653r4 = this.f20011e;
                            c8653r4.f20067b = false;
                            c8653r4.f20068c = false;
                        }
                    }
                } else if (this.f20010d.f20068c && this.f20011e.f20068c) {
                    ArrayList arrayList = new ArrayList();
                    C8653r c8653r5 = this.f20010d;
                    arrayList.add(Arrays.copyOf(c8653r5.f20069d, c8653r5.f20070e));
                    C8653r c8653r6 = this.f20011e;
                    arrayList.add(Arrays.copyOf(c8653r6.f20069d, c8653r6.f20070e));
                    C8653r c8653r7 = this.f20010d;
                    C8812k c8812kM21330a2 = AbstractC8813l.m21330a(c8653r7.f20069d, 3, c8653r7.f20070e);
                    C8653r c8653r8 = this.f20011e;
                    i = i14;
                    C8816o c8816o2 = new C8816o(c8653r8.f20069d, 3, c8653r8.f20070e);
                    c8816o2.m21365d(8);
                    int iM21364d3 = c8816o2.m21364d();
                    int iM21364d4 = c8816o2.m21364d();
                    c8816o2.m21367f();
                    C8811j c8811j = new C8811j(c8816o2.m21362c(), iM21364d3, iM21364d4);
                    i2 = i9;
                    this.f20016j.mo21053a(C8708o.m21264a(this.f20015i, "video/avc", -1, c8812kM21330a2.f20626b, c8812kM21330a2.f20627c, arrayList, -1, c8812kM21330a2.f20628d, null, -1, null, null));
                    this.f20018l = true;
                    this.f20017k.f19992d.append(c8812kM21330a2.f20625a, c8812kM21330a2);
                    this.f20017k.f19993e.append(iM21364d3, c8811j);
                    C8653r c8653r9 = this.f20010d;
                    c8653r9.f20067b = false;
                    c8653r9.f20068c = false;
                    C8653r c8653r10 = this.f20011e;
                    c8653r10.f20067b = false;
                    c8653r10.f20068c = false;
                } else {
                    i = i14;
                    i2 = i9;
                }
            } else {
                i = i14;
                i2 = i9;
            }
            if (this.f20012f.m21182a(i15)) {
                C8653r c8653r11 = this.f20012f;
                int iM21328a = AbstractC8813l.m21328a(c8653r11.f20070e, c8653r11.f20069d);
                C8815n c8815n2 = this.f20020n;
                c8815n2.f20643a = this.f20012f.f20069d;
                c8815n2.f20645c = iM21328a;
                c8815n2.f20644b = 0;
                c8815n2.m21347e(4);
                AbstractC8744a.m21280a(j2, this.f20020n, this.f20007a.f20104b);
            }
            C8647l c8647l = this.f20017k;
            if (c8647l.f19997i == 9) {
                if (c8647l.f20003o) {
                    long j3 = c8647l.f19998j;
                    c8647l.f19989a.mo21051a(c8647l.f20005q, c8647l.f20006r ? 1 : 0, (int) (j3 - c8647l.f20004p), i + ((int) (j - j3)), null);
                }
                c8647l.f20004p = c8647l.f19998j;
                c8647l.f20005q = c8647l.f20000l;
                c8647l.f20006r = false;
                i3 = 1;
                c8647l.f20003o = true;
            } else {
                if (c8647l.f19991c) {
                    C8646k c8646k = c8647l.f20002n;
                    C8646k c8646k2 = c8647l.f20001m;
                    if (c8646k.f19973a && (!c8646k2.f19973a || c8646k.f19978f != c8646k2.f19978f || c8646k.f19979g != c8646k2.f19979g || c8646k.f19980h != c8646k2.f19980h || ((c8646k.f19981i && c8646k2.f19981i && c8646k.f19982j != c8646k2.f19982j) || (((i5 = c8646k.f19976d) != (i6 = c8646k2.f19976d) && (i5 == 0 || i6 == 0)) || (((i7 = c8646k.f19975c.f20632h) == 0 && c8646k2.f19975c.f20632h == 0 && (c8646k.f19985m != c8646k2.f19985m || c8646k.f19986n != c8646k2.f19986n)) || ((i7 == 1 && c8646k2.f19975c.f20632h == 1 && (c8646k.f19987o != c8646k2.f19987o || c8646k.f19988p != c8646k2.f19988p)) || (z2 = c8646k.f19983k) != (z3 = c8646k2.f19983k) || (z2 && z3 && c8646k.f19984l != c8646k2.f19984l))))))) {
                        if (c8647l.f20003o) {
                            long j4 = c8647l.f19998j;
                            c8647l.f19989a.mo21051a(c8647l.f20005q, c8647l.f20006r ? 1 : 0, (int) (j4 - c8647l.f20004p), i + ((int) (j - j4)), null);
                        }
                        c8647l.f20004p = c8647l.f19998j;
                        c8647l.f20005q = c8647l.f20000l;
                        c8647l.f20006r = false;
                        i3 = 1;
                        c8647l.f20003o = true;
                    }
                }
                i3 = 1;
            }
            boolean z4 = c8647l.f20006r;
            int i16 = c8647l.f19997i;
            if (i16 == 5) {
                z = true;
            } else {
                if (c8647l.f19990b && i16 == i3) {
                    C8646k c8646k3 = c8647l.f20002n;
                    if (c8646k3.f19974b && ((i4 = c8646k3.f19977e) == 7 || i4 == 2)) {
                        z = true;
                    }
                }
                z = false;
            }
            c8647l.f20006r = z4 | z;
            long j5 = this.f20019m;
            if (!this.f20018l || this.f20017k.f19991c) {
                this.f20010d.m21183b(i12);
                this.f20011e.m21183b(i12);
            }
            this.f20012f.m21183b(i12);
            C8647l c8647l2 = this.f20017k;
            c8647l2.f19997i = i12;
            c8647l2.f20000l = j5;
            c8647l2.f19998j = j;
            if ((c8647l2.f19990b && i12 == 1) || (c8647l2.f19991c && (i12 == 5 || i12 == 1 || i12 == 2))) {
                C8646k c8646k4 = c8647l2.f20001m;
                c8647l2.f20001m = c8647l2.f20002n;
                c8647l2.f20002n = c8646k4;
                c8646k4.f19974b = false;
                c8646k4.f19973a = false;
                c8647l2.f19996h = 0;
                c8647l2.f19999k = true;
            }
            i8 = i11;
            i9 = i2;
        }
        if (!this.f20018l || this.f20017k.f19991c) {
            this.f20010d.m21181a(bArr, i8, i9);
            this.f20011e.m21181a(bArr, i8, i9);
        }
        this.f20012f.m21181a(bArr, i8, i9);
        this.f20017k.m21179a(bArr, i8, i9);
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts.InterfaceC8643h
    /* JADX INFO: renamed from: a */
    public final void mo21168a(boolean z, long j) {
        this.f20019m = j;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts.InterfaceC8643h
    /* JADX INFO: renamed from: b */
    public final void mo21169b() {
    }
}
