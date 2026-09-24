package com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4;

import android.util.Log;
import android.util.Pair;
import android.util.SparseArray;
import com.fyber.inneractive.sdk.player.exoplayer2.AbstractC8673m;
import com.fyber.inneractive.sdk.player.exoplayer2.C8708o;
import com.fyber.inneractive.sdk.player.exoplayer2.C8711r;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C8523c;
import com.fyber.inneractive.sdk.player.exoplayer2.drm.C8524d;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8526a;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8527b;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8538g;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8607o;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C8627p;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8568j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8628q;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8629r;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.AbstractC8551l;
import com.fyber.inneractive.sdk.player.exoplayer2.text.cea.AbstractC8744a;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8813l;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8827z;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8815n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8823v;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;
import java.util.UUID;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.mp4.m */
/* JADX INFO: loaded from: classes4.dex */
public final class C8596m implements InterfaceC8567i {

    /* JADX INFO: renamed from: A */
    public static final int f19663A = AbstractC8827z.m21379a("seig");

    /* JADX INFO: renamed from: B */
    public static final byte[] f19664B = {-94, 57, 79, 82, 90, -101, 79, Ascii.DC4, -94, 68, 108, 66, 124, 100, -115, -12};

    /* JADX INFO: renamed from: f */
    public final C8823v f19670f;

    /* JADX INFO: renamed from: l */
    public int f19676l;

    /* JADX INFO: renamed from: m */
    public long f19677m;

    /* JADX INFO: renamed from: o */
    public C8815n f19679o;

    /* JADX INFO: renamed from: p */
    public long f19680p;

    /* JADX INFO: renamed from: q */
    public int f19681q;

    /* JADX INFO: renamed from: t */
    public C8595l f19684t;

    /* JADX INFO: renamed from: u */
    public int f19685u;

    /* JADX INFO: renamed from: v */
    public int f19686v;

    /* JADX INFO: renamed from: w */
    public int f19687w;

    /* JADX INFO: renamed from: x */
    public boolean f19688x;

    /* JADX INFO: renamed from: y */
    public InterfaceC8568j f19689y;

    /* JADX INFO: renamed from: z */
    public boolean f19690z;

    /* JADX INFO: renamed from: g */
    public final C8815n f19671g = new C8815n(16);

    /* JADX INFO: renamed from: b */
    public final C8815n f19666b = new C8815n(AbstractC8813l.f20635a);

    /* JADX INFO: renamed from: c */
    public final C8815n f19667c = new C8815n(5);

    /* JADX INFO: renamed from: d */
    public final C8815n f19668d = new C8815n();

    /* JADX INFO: renamed from: e */
    public final C8815n f19669e = new C8815n(1);

    /* JADX INFO: renamed from: h */
    public final byte[] f19672h = new byte[16];

    /* JADX INFO: renamed from: i */
    public final Stack f19673i = new Stack();

    /* JADX INFO: renamed from: j */
    public final LinkedList f19674j = new LinkedList();

    /* JADX INFO: renamed from: a */
    public final SparseArray f19665a = new SparseArray();

    /* JADX INFO: renamed from: r */
    public long f19682r = -9223372036854775807L;

    /* JADX INFO: renamed from: s */
    public long f19683s = -9223372036854775807L;

    /* JADX INFO: renamed from: k */
    public int f19675k = 0;

    /* JADX INFO: renamed from: n */
    public int f19678n = 0;

    public C8596m(C8823v c8823v) {
        this.f19670f = c8823v;
    }

    /* JADX INFO: renamed from: a */
    public static C8524d m21133a(ArrayList arrayList) {
        int size = arrayList.size();
        ArrayList arrayList2 = null;
        for (int i = 0; i < size; i++) {
            C8585b c8585b = (C8585b) arrayList.get(i);
            if (c8585b.f19620a == AbstractC8586c.f19564V) {
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                }
                byte[] bArr = c8585b.f19527P0.f20643a;
                UUID uuidM21143a = AbstractC8600q.m21143a(bArr);
                if (uuidM21143a == null) {
                    Log.w("FragmentedMp4Extractor", "Skipped pssh atom (failed to extract uuid)");
                } else {
                    arrayList2.add(new C8523c(uuidM21143a, "video/mp4", bArr));
                }
            }
        }
        if (arrayList2 == null) {
            return null;
        }
        return new C8524d(false, (C8523c[]) arrayList2.toArray(new C8523c[arrayList2.size()]));
    }

    /* JADX INFO: renamed from: a */
    public static void m21134a(C8815n c8815n, int i, C8604u c8604u) throws C8711r {
        c8815n.m21347e(i + 8);
        int iM21340b = c8815n.m21340b();
        int i2 = AbstractC8586c.f19570b;
        if ((iM21340b & 1) != 0) {
            throw new C8711r("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean z = (iM21340b & 2) != 0;
        int iM21355m = c8815n.m21355m();
        if (iM21355m != c8604u.f19759e) {
            StringBuilder sbM21088a = AbstractC8551l.m21088a("Length mismatch: ", iM21355m, ", ");
            sbM21088a.append(c8604u.f19759e);
            throw new C8711r(sbM21088a.toString());
        }
        Arrays.fill(c8604u.f19767m, 0, iM21355m, z);
        int i3 = c8815n.f20645c - c8815n.f20644b;
        C8815n c8815n2 = c8604u.f19770p;
        if (c8815n2 == null || c8815n2.f20645c < i3) {
            c8604u.f19770p = new C8815n(i3);
        }
        c8604u.f19769o = i3;
        c8604u.f19766l = true;
        c8604u.f19771q = true;
        c8815n.m21339a(c8604u.f19770p.f20643a, 0, i3);
        c8604u.f19770p.m21347e(0);
        c8604u.f19771q = false;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i
    /* JADX INFO: renamed from: a */
    public final int mo21035a(C8527b c8527b, C8607o c8607o) throws InterruptedException, C8711r, EOFException {
        char c;
        long j;
        byte[] bArr;
        int i;
        int iMo21046a;
        int i2;
        long jM21356n;
        long jM21356n2;
        while (true) {
            int i3 = this.f19675k;
            char c2 = 2;
            int i4 = 1;
            boolean z = false;
            if (i3 != 0) {
                int i5 = 4;
                if (i3 != 1) {
                    long j2 = Long.MAX_VALUE;
                    if (i3 != 2) {
                        if (i3 == 3) {
                            if (this.f19684t == null) {
                                SparseArray sparseArray = this.f19665a;
                                int size = sparseArray.size();
                                int i6 = 0;
                                C8595l c8595l = null;
                                while (i6 < size) {
                                    C8595l c8595l2 = (C8595l) sparseArray.valueAt(i6);
                                    char c3 = c2;
                                    int i7 = c8595l2.f19662g;
                                    C8604u c8604u = c8595l2.f19656a;
                                    if (i7 != c8604u.f19758d) {
                                        long j3 = c8604u.f19760f[i7];
                                        if (j3 < j2) {
                                            j2 = j3;
                                            c8595l = c8595l2;
                                        }
                                    }
                                    i6++;
                                    c2 = c3;
                                }
                                c = c2;
                                if (c8595l == null) {
                                    int i8 = (int) (this.f19680p - c8527b.f19124c);
                                    if (i8 < 0) {
                                        throw new C8711r("Offset to end of mdat was negative.");
                                    }
                                    c8527b.m21023a(i8);
                                    this.f19675k = 0;
                                    this.f19678n = 0;
                                } else {
                                    int i9 = (int) (c8595l.f19656a.f19760f[c8595l.f19662g] - c8527b.f19124c);
                                    if (i9 < 0) {
                                        Log.w("FragmentedMp4Extractor", "Ignoring negative offset to sample data.");
                                        i9 = 0;
                                    }
                                    c8527b.m21023a(i9);
                                    this.f19684t = c8595l;
                                }
                            } else {
                                c = 2;
                            }
                            C8595l c8595l3 = this.f19684t;
                            C8604u c8604u2 = c8595l3.f19656a;
                            int[] iArr = c8604u2.f19762h;
                            int i10 = c8595l3.f19660e;
                            this.f19685u = iArr[i10];
                            if (c8604u2.f19766l) {
                                C8815n c8815n = c8604u2.f19770p;
                                int i11 = c8604u2.f19755a.f19650a;
                                C8603t c8603t = c8604u2.f19768n;
                                if (c8603t == null) {
                                    c8603t = c8595l3.f19658c.f19749h[i11];
                                }
                                int i12 = c8603t.f19753a;
                                boolean z2 = c8604u2.f19767m[i10];
                                C8815n c8815n2 = this.f19669e;
                                c8815n2.f20643a[0] = (byte) ((z2 ? 128 : 0) | i12);
                                c8815n2.m21347e(0);
                                InterfaceC8629r interfaceC8629r = c8595l3.f19657b;
                                interfaceC8629r.mo21049a(1, this.f19669e);
                                interfaceC8629r.mo21049a(i12, c8815n);
                                if (z2) {
                                    int iM21357o = c8815n.m21357o();
                                    c8815n.m21347e(c8815n.f20644b - 2);
                                    int i13 = (iM21357o * 6) + 2;
                                    interfaceC8629r.mo21049a(i13, c8815n);
                                    i2 = i12 + 1 + i13;
                                } else {
                                    i2 = i12 + 1;
                                }
                                this.f19686v = i2;
                                this.f19685u += i2;
                            } else {
                                this.f19686v = 0;
                            }
                            if (this.f19684t.f19658c.f19748g == 1) {
                                this.f19685u -= 8;
                                c8527b.m21023a(8);
                            }
                            this.f19675k = 4;
                            this.f19687w = 0;
                        } else {
                            c = 2;
                        }
                        C8595l c8595l4 = this.f19684t;
                        C8604u c8604u3 = c8595l4.f19656a;
                        C8602s c8602s = c8595l4.f19658c;
                        InterfaceC8629r interfaceC8629r2 = c8595l4.f19657b;
                        int i14 = c8595l4.f19660e;
                        int i15 = c8602s.f19752k;
                        if (i15 == 0) {
                            j = 1000;
                            while (true) {
                                int i16 = this.f19686v;
                                int i17 = this.f19685u;
                                if (i16 >= i17) {
                                    break;
                                }
                                this.f19686v += interfaceC8629r2.mo21046a(c8527b, i17 - i16, false);
                            }
                        } else {
                            byte[] bArr2 = this.f19667c.f20643a;
                            bArr2[0] = 0;
                            bArr2[1] = 0;
                            bArr2[c] = 0;
                            int i18 = i15 + 1;
                            int i19 = 4 - i15;
                            while (this.f19686v < this.f19685u) {
                                int i20 = this.f19687w;
                                if (i20 == 0) {
                                    c8527b.m21027b(bArr2, i19, i18, z);
                                    this.f19667c.m21347e(z ? 1 : 0);
                                    this.f19687w = this.f19667c.m21355m() - i4;
                                    this.f19666b.m21347e(z ? 1 : 0);
                                    interfaceC8629r2.mo21049a(i5, this.f19666b);
                                    interfaceC8629r2.mo21049a(i4, this.f19667c);
                                    this.f19688x = z;
                                    this.f19686v += 5;
                                    this.f19685u += i19;
                                } else {
                                    if (this.f19688x) {
                                        this.f19668d.m21343c(i20);
                                        c8527b.m21027b(this.f19668d.f20643a, z ? 1 : 0, this.f19687w, z);
                                        interfaceC8629r2.mo21049a(this.f19687w, this.f19668d);
                                        iMo21046a = this.f19687w;
                                        C8815n c8815n3 = this.f19668d;
                                        int iM21328a = AbstractC8813l.m21328a(c8815n3.f20645c, c8815n3.f20643a);
                                        this.f19668d.m21347e("video/hevc".equals(c8602s.f19747f.f20295f) ? 1 : 0);
                                        this.f19668d.m21345d(iM21328a);
                                        AbstractC8744a.m21280a((c8604u3.f19764j[i14] + ((long) c8604u3.f19763i[i14])) * 1000, this.f19668d, null);
                                    } else {
                                        iMo21046a = interfaceC8629r2.mo21046a(c8527b, i20, z ? 1 : 0);
                                    }
                                    this.f19686v += iMo21046a;
                                    this.f19687w -= iMo21046a;
                                    i5 = i5;
                                    i4 = i4;
                                    z = false;
                                }
                            }
                            j = 1000;
                        }
                        long jM21370a = (c8604u3.f19764j[i14] + ((long) c8604u3.f19763i[i14])) * j;
                        boolean z3 = c8604u3.f19766l;
                        int i21 = (z3 ? 1073741824 : 0) | (c8604u3.f19765k[i14] ? 1 : 0);
                        int i22 = c8604u3.f19755a.f19650a;
                        if (z3) {
                            C8603t c8603t2 = c8604u3.f19768n;
                            bArr = c8603t2 != null ? c8603t2.f19754b : c8602s.f19749h[i22].f19754b;
                        } else {
                            bArr = null;
                        }
                        C8823v c8823v = this.f19670f;
                        if (c8823v != null) {
                            jM21370a = c8823v.m21370a(jM21370a);
                        }
                        interfaceC8629r2.mo21051a(jM21370a, i21, this.f19685u, 0, bArr);
                        if (!this.f19674j.isEmpty()) {
                            C8594k c8594k = (C8594k) this.f19674j.removeFirst();
                            this.f19681q -= c8594k.f19655b;
                            long j4 = c8594k.f19654a;
                            throw null;
                        }
                        C8595l c8595l5 = this.f19684t;
                        c8595l5.f19660e++;
                        int i23 = c8595l5.f19661f + 1;
                        c8595l5.f19661f = i23;
                        int[] iArr2 = c8604u3.f19761g;
                        int i24 = c8595l5.f19662g;
                        if (i23 == iArr2[i24]) {
                            c8595l5.f19662g = i24 + 1;
                            i = 0;
                            c8595l5.f19661f = 0;
                            this.f19684t = null;
                        } else {
                            i = 0;
                        }
                        this.f19675k = 3;
                        return i;
                    }
                    int size2 = this.f19665a.size();
                    C8595l c8595l6 = null;
                    for (int i25 = 0; i25 < size2; i25++) {
                        C8604u c8604u4 = ((C8595l) this.f19665a.valueAt(i25)).f19656a;
                        if (c8604u4.f19771q) {
                            long j5 = c8604u4.f19757c;
                            if (j5 < j2) {
                                c8595l6 = (C8595l) this.f19665a.valueAt(i25);
                                j2 = j5;
                            }
                        }
                    }
                    if (c8595l6 == null) {
                        this.f19675k = 3;
                    } else {
                        int i26 = (int) (j2 - c8527b.f19124c);
                        if (i26 < 0) {
                            throw new C8711r("Offset to encryption data was negative.");
                        }
                        c8527b.m21023a(i26);
                        C8604u c8604u5 = c8595l6.f19656a;
                        c8527b.m21027b(c8604u5.f19770p.f20643a, 0, c8604u5.f19769o, false);
                        c8604u5.f19770p.m21347e(0);
                        c8604u5.f19771q = false;
                    }
                } else {
                    int i27 = ((int) this.f19677m) - this.f19678n;
                    C8815n c8815n4 = this.f19679o;
                    if (c8815n4 != null) {
                        c8527b.m21027b(c8815n4.f20643a, 8, i27, false);
                        int i28 = this.f19676l;
                        C8815n c8815n5 = this.f19679o;
                        C8585b c8585b = new C8585b(i28, c8815n5);
                        long j6 = c8527b.f19124c;
                        if (!this.f19673i.isEmpty()) {
                            ((C8584a) this.f19673i.peek()).f19525Q0.add(c8585b);
                        } else if (i28 == AbstractC8586c.f19530B) {
                            c8815n5.m21347e(8);
                            int iM21340b = (c8815n5.m21340b() >> 24) & 255;
                            c8815n5.m21347e(c8815n5.f20644b + 4);
                            long jM21353k = c8815n5.m21353k();
                            if (iM21340b == 0) {
                                jM21356n = c8815n5.m21353k();
                                jM21356n2 = c8815n5.m21353k();
                            } else {
                                jM21356n = c8815n5.m21356n();
                                jM21356n2 = c8815n5.m21356n();
                            }
                            long j7 = jM21356n2 + j6;
                            long j8 = jM21356n;
                            long j9 = j7;
                            long jM21382a = AbstractC8827z.m21382a(j8, 1000000L, jM21353k);
                            c8815n5.m21347e(c8815n5.f20644b + 2);
                            int iM21357o2 = c8815n5.m21357o();
                            int[] iArr3 = new int[iM21357o2];
                            long[] jArr = new long[iM21357o2];
                            long[] jArr2 = new long[iM21357o2];
                            long[] jArr3 = new long[iM21357o2];
                            long jM21382a2 = jM21382a;
                            long j10 = j8;
                            int i29 = 0;
                            while (i29 < iM21357o2) {
                                int iM21340b2 = c8815n5.m21340b();
                                if ((iM21340b2 & Integer.MIN_VALUE) != 0) {
                                    throw new C8711r("Unhandled indirect reference");
                                }
                                long jM21353k2 = c8815n5.m21353k();
                                iArr3[i29] = iM21340b2 & Integer.MAX_VALUE;
                                jArr[i29] = j9;
                                jArr3[i29] = jM21382a2;
                                long j11 = j10 + jM21353k2;
                                long[] jArr4 = jArr2;
                                long[] jArr5 = jArr3;
                                int i30 = i29;
                                jM21382a2 = AbstractC8827z.m21382a(j11, 1000000L, jM21353k);
                                jArr4[i30] = jM21382a2 - jArr5[i30];
                                c8815n5.m21347e(c8815n5.f20644b + 4);
                                long j12 = j9 + ((long) iArr3[i30]);
                                i29 = i30 + 1;
                                j10 = j11;
                                jArr2 = jArr4;
                                jArr3 = jArr5;
                                j9 = j12;
                            }
                            Pair pairCreate = Pair.create(Long.valueOf(jM21382a), new C8526a(iArr3, jArr, jArr2, jArr3));
                            this.f19683s = ((Long) pairCreate.first).longValue();
                            this.f19689y.mo21093a((InterfaceC8628q) pairCreate.second);
                            this.f19690z = true;
                        } else {
                            int i31 = AbstractC8586c.f19541G0;
                        }
                    } else {
                        c8527b.m21023a(i27);
                    }
                    m21135a(c8527b.f19124c);
                }
            } else {
                if (this.f19678n == 0) {
                    if (!c8527b.m21027b(this.f19671g.f20643a, 0, 8, true)) {
                        return -1;
                    }
                    this.f19678n = 8;
                    this.f19671g.m21347e(0);
                    this.f19677m = this.f19671g.m21353k();
                    this.f19676l = this.f19671g.m21340b();
                }
                if (this.f19677m == 1) {
                    c8527b.m21027b(this.f19671g.f20643a, 8, 8, false);
                    this.f19678n += 8;
                    this.f19677m = this.f19671g.m21356n();
                }
                long j13 = this.f19677m;
                long j14 = this.f19678n;
                if (j13 < j14) {
                    throw new C8711r("Atom size less than header length (unsupported).");
                }
                long j15 = c8527b.f19124c - j14;
                if (this.f19676l == AbstractC8586c.f19550L) {
                    int size3 = this.f19665a.size();
                    for (int i32 = 0; i32 < size3; i32++) {
                        C8604u c8604u6 = ((C8595l) this.f19665a.valueAt(i32)).f19656a;
                        c8604u6.getClass();
                        c8604u6.f19757c = j15;
                        c8604u6.f19756b = j15;
                    }
                }
                int i33 = this.f19676l;
                if (i33 == AbstractC8586c.f19584i) {
                    this.f19684t = null;
                    this.f19680p = j15 + this.f19677m;
                    if (!this.f19690z) {
                        this.f19689y.mo21093a(new C8627p(this.f19682r));
                        this.f19690z = true;
                    }
                    this.f19675k = 2;
                } else if (i33 == AbstractC8586c.f19532C || i33 == AbstractC8586c.f19536E || i33 == AbstractC8586c.f19538F || i33 == AbstractC8586c.f19540G || i33 == AbstractC8586c.f19542H || i33 == AbstractC8586c.f19550L || i33 == AbstractC8586c.f19552M || i33 == AbstractC8586c.f19554N || i33 == AbstractC8586c.f19559Q) {
                    long j16 = (c8527b.f19124c + this.f19677m) - 8;
                    this.f19673i.add(new C8584a(this.f19676l, j16));
                    if (this.f19677m == this.f19678n) {
                        m21135a(j16);
                    } else {
                        this.f19675k = 0;
                        this.f19678n = 0;
                    }
                } else if (i33 == AbstractC8586c.f19562T || i33 == AbstractC8586c.f19561S || i33 == AbstractC8586c.f19534D || i33 == AbstractC8586c.f19530B || i33 == AbstractC8586c.f19563U || i33 == AbstractC8586c.f19614x || i33 == AbstractC8586c.f19616y || i33 == AbstractC8586c.f19558P || i33 == AbstractC8586c.f19618z || i33 == AbstractC8586c.f19528A || i33 == AbstractC8586c.f19564V || i33 == AbstractC8586c.f19575d0 || i33 == AbstractC8586c.f19577e0 || i33 == AbstractC8586c.f19585i0 || i33 == AbstractC8586c.f19583h0 || i33 == AbstractC8586c.f19579f0 || i33 == AbstractC8586c.f19581g0 || i33 == AbstractC8586c.f19560R || i33 == AbstractC8586c.f19556O || i33 == AbstractC8586c.f19541G0) {
                    if (this.f19678n != 8) {
                        throw new C8711r("Leaf atom defines extended atom size (unsupported).");
                    }
                    long j17 = this.f19677m;
                    if (j17 > 2147483647L) {
                        throw new C8711r("Leaf atom with length > 2147483647 (unsupported).");
                    }
                    C8815n c8815n6 = new C8815n((int) j17);
                    this.f19679o = c8815n6;
                    System.arraycopy(this.f19671g.f20643a, 0, c8815n6.f20643a, 0, 8);
                    this.f19675k = 1;
                } else {
                    if (this.f19677m > 2147483647L) {
                        throw new C8711r("Skipping atom with length > 2147483647 (unsupported).");
                    }
                    this.f19679o = null;
                    this.f19675k = 1;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:240:0x05a5  */
    /* JADX WARN: Code duplicated, block: B:252:0x05e1  */
    /* JADX INFO: renamed from: a */
    public final void m21135a(long j) throws C8711r {
        C8602s c8602sM21131a;
        int i;
        SparseArray sparseArray;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j2;
        while (!this.f19673i.isEmpty() && ((C8584a) this.f19673i.peek()).f19524P0 == j) {
            C8584a c8584a = (C8584a) this.f19673i.pop();
            int i7 = c8584a.f19620a;
            int i8 = 12;
            int i9 = 8;
            int i10 = 1;
            if (i7 == AbstractC8586c.f19532C) {
                C8524d c8524dM21133a = m21133a(c8584a.f19525Q0);
                C8584a c8584aM21121b = c8584a.m21121b(AbstractC8586c.f19554N);
                SparseArray sparseArray2 = new SparseArray();
                int size = c8584aM21121b.f19525Q0.size();
                long jM21353k = -9223372036854775807L;
                int i11 = 0;
                while (i11 < size) {
                    C8585b c8585b = (C8585b) c8584aM21121b.f19525Q0.get(i11);
                    int i12 = c8585b.f19620a;
                    if (i12 == AbstractC8586c.f19618z) {
                        C8815n c8815n = c8585b.f19527P0;
                        c8815n.m21347e(i8);
                        i = i10;
                        Pair pairCreate = Pair.create(Integer.valueOf(c8815n.m21340b()), new C8593j(c8815n.m21355m() - i10, c8815n.m21355m(), c8815n.m21355m(), c8815n.m21340b()));
                        sparseArray2.put(((Integer) pairCreate.first).intValue(), (C8593j) pairCreate.second);
                    } else {
                        i = i10;
                        if (i12 == AbstractC8586c.f19556O) {
                            C8815n c8815n2 = c8585b.f19527P0;
                            c8815n2.m21347e(8);
                            jM21353k = ((c8815n2.m21340b() >> 24) & 255) == 0 ? c8815n2.m21353k() : c8815n2.m21356n();
                        }
                    }
                    i11++;
                    i10 = i;
                    i8 = 12;
                }
                SparseArray sparseArray3 = new SparseArray();
                int size2 = c8584a.f19526R0.size();
                for (int i13 = 0; i13 < size2; i13++) {
                    C8584a c8584a2 = (C8584a) c8584a.f19526R0.get(i13);
                    if (c8584a2.f19620a == AbstractC8586c.f19536E && (c8602sM21131a = AbstractC8592i.m21131a(c8584a2, c8584a.m21122c(AbstractC8586c.f19534D), jM21353k, c8524dM21133a, false)) != null) {
                        sparseArray3.put(c8602sM21131a.f19742a, c8602sM21131a);
                    }
                }
                int size3 = sparseArray3.size();
                if (this.f19665a.size() == 0) {
                    for (int i14 = 0; i14 < size3; i14++) {
                        C8602s c8602s = (C8602s) sparseArray3.valueAt(i14);
                        C8538g c8538gMo21092a = this.f19689y.mo21092a(i14, c8602s.f19743b);
                        C8595l c8595l = new C8595l(c8538gMo21092a);
                        C8593j c8593j = (C8593j) sparseArray2.get(c8602s.f19742a);
                        c8595l.f19658c = c8602s;
                        c8593j.getClass();
                        c8595l.f19659d = c8593j;
                        c8538gMo21092a.mo21053a(c8602s.f19747f);
                        c8595l.m21132a();
                        this.f19665a.put(c8602s.f19742a, c8595l);
                        this.f19682r = Math.max(this.f19682r, c8602s.f19746e);
                    }
                    this.f19689y.mo21096b();
                } else {
                    if (this.f19665a.size() != size3) {
                        throw new IllegalStateException();
                    }
                    for (int i15 = 0; i15 < size3; i15++) {
                        C8602s c8602s2 = (C8602s) sparseArray3.valueAt(i15);
                        C8595l c8595l2 = (C8595l) this.f19665a.get(c8602s2.f19742a);
                        C8593j c8593j2 = (C8593j) sparseArray2.get(c8602s2.f19742a);
                        c8595l2.getClass();
                        c8595l2.f19658c = c8602s2;
                        c8593j2.getClass();
                        c8595l2.f19659d = c8593j2;
                        c8595l2.f19657b.mo21053a(c8602s2.f19747f);
                        c8595l2.m21132a();
                    }
                }
            } else {
                int i16 = 1;
                if (i7 == AbstractC8586c.f19550L) {
                    SparseArray sparseArray4 = this.f19665a;
                    byte[] bArr = this.f19672h;
                    int size4 = c8584a.f19526R0.size();
                    int i17 = 0;
                    while (i17 < size4) {
                        C8584a c8584a3 = (C8584a) c8584a.f19526R0.get(i17);
                        if (c8584a3.f19620a == AbstractC8586c.f19552M) {
                            C8815n c8815n3 = c8584a3.m21122c(AbstractC8586c.f19616y).f19527P0;
                            c8815n3.m21347e(i9);
                            int iM21340b = c8815n3.m21340b();
                            C8595l c8595l3 = (C8595l) sparseArray4.get(c8815n3.m21340b());
                            if (c8595l3 == null) {
                                c8595l3 = null;
                            } else {
                                if ((iM21340b & 1) != 0) {
                                    long jM21356n = c8815n3.m21356n();
                                    C8604u c8604u = c8595l3.f19656a;
                                    c8604u.f19756b = jM21356n;
                                    c8604u.f19757c = jM21356n;
                                }
                                C8593j c8593j3 = c8595l3.f19659d;
                                c8595l3.f19656a.f19755a = new C8593j((iM21340b & 2) != 0 ? c8815n3.m21355m() - 1 : c8593j3.f19650a, (iM21340b & 8) != 0 ? c8815n3.m21355m() : c8593j3.f19651b, (iM21340b & 16) != 0 ? c8815n3.m21355m() : c8593j3.f19652c, (iM21340b & 32) != 0 ? c8815n3.m21355m() : c8593j3.f19653d);
                            }
                            if (c8595l3 == null) {
                                sparseArray = sparseArray4;
                                i2 = size4;
                                i3 = i17;
                                i4 = i9;
                                i5 = i16;
                            } else {
                                C8604u c8604u2 = c8595l3.f19656a;
                                long jM21356n2 = c8604u2.f19772r;
                                c8595l3.m21132a();
                                int i18 = AbstractC8586c.f19614x;
                                if (c8584a3.m21122c(i18) != null) {
                                    C8815n c8815n4 = c8584a3.m21122c(i18).f19527P0;
                                    c8815n4.m21347e(i9);
                                    jM21356n2 = ((c8815n4.m21340b() >> 24) & 255) == i16 ? c8815n4.m21356n() : c8815n4.m21353k();
                                }
                                ArrayList arrayList = c8584a3.f19525Q0;
                                int size5 = arrayList.size();
                                int i19 = 0;
                                int i20 = 0;
                                int i21 = 0;
                                while (i20 < size5) {
                                    SparseArray sparseArray5 = sparseArray4;
                                    C8585b c8585b2 = (C8585b) arrayList.get(i20);
                                    int i22 = size4;
                                    int i23 = i17;
                                    if (c8585b2.f19620a == AbstractC8586c.f19528A) {
                                        C8815n c8815n5 = c8585b2.f19527P0;
                                        c8815n5.m21347e(12);
                                        int iM21355m = c8815n5.m21355m();
                                        if (iM21355m > 0) {
                                            i19 += iM21355m;
                                            i21++;
                                        }
                                    }
                                    i20++;
                                    size4 = i22;
                                    sparseArray4 = sparseArray5;
                                    i17 = i23;
                                }
                                sparseArray = sparseArray4;
                                i2 = size4;
                                i3 = i17;
                                c8595l3.f19662g = 0;
                                c8595l3.f19661f = 0;
                                c8595l3.f19660e = 0;
                                C8604u c8604u3 = c8595l3.f19656a;
                                c8604u3.f19758d = i21;
                                c8604u3.f19759e = i19;
                                int[] iArr = c8604u3.f19761g;
                                if (iArr == null || iArr.length < i21) {
                                    c8604u3.f19760f = new long[i21];
                                    c8604u3.f19761g = new int[i21];
                                }
                                int[] iArr2 = c8604u3.f19762h;
                                if (iArr2 == null || iArr2.length < i19) {
                                    int i24 = (i19 * Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE) / 100;
                                    c8604u3.f19762h = new int[i24];
                                    c8604u3.f19763i = new int[i24];
                                    c8604u3.f19764j = new long[i24];
                                    c8604u3.f19765k = new boolean[i24];
                                    c8604u3.f19767m = new boolean[i24];
                                }
                                int i25 = 0;
                                int i26 = 0;
                                int i27 = 0;
                                while (i25 < size5) {
                                    long jM21382a = 0;
                                    C8585b c8585b3 = (C8585b) arrayList.get(i25);
                                    if (c8585b3.f19620a == AbstractC8586c.f19528A) {
                                        int i28 = i26 + 1;
                                        C8815n c8815n6 = c8585b3.f19527P0;
                                        c8815n6.m21347e(8);
                                        int iM21340b2 = c8815n6.m21340b();
                                        C8602s c8602s3 = c8595l3.f19658c;
                                        C8604u c8604u4 = c8595l3.f19656a;
                                        int i29 = i26;
                                        C8593j c8593j4 = c8604u4.f19755a;
                                        int i30 = i27;
                                        c8604u4.f19761g[i29] = c8815n6.m21355m();
                                        long[] jArr = c8604u4.f19760f;
                                        j2 = jM21356n2;
                                        long j3 = c8604u4.f19756b;
                                        jArr[i29] = j3;
                                        if ((iM21340b2 & 1) != 0) {
                                            jArr[i29] = j3 + ((long) c8815n6.m21340b());
                                        }
                                        boolean z = (iM21340b2 & 4) != 0;
                                        int iM21355m2 = c8593j4.f19653d;
                                        if (z) {
                                            iM21355m2 = c8815n6.m21355m();
                                        }
                                        boolean z2 = (iM21340b2 & 256) != 0;
                                        boolean z3 = z;
                                        boolean z4 = (iM21340b2 & 512) != 0;
                                        boolean z5 = (iM21340b2 & 1024) != 0;
                                        boolean z6 = (iM21340b2 & 2048) != 0;
                                        boolean z7 = z5;
                                        long[] jArr2 = c8602s3.f19750i;
                                        if (jArr2 != null && jArr2.length == 1 && jArr2[0] == 0) {
                                            jM21382a = AbstractC8827z.m21382a(c8602s3.f19751j[0], 1000L, c8602s3.f19744c);
                                        }
                                        int[] iArr3 = c8604u4.f19762h;
                                        int[] iArr4 = c8604u4.f19763i;
                                        int i31 = iM21355m2;
                                        long[] jArr3 = c8604u4.f19764j;
                                        boolean[] zArr = c8604u4.f19765k;
                                        int i32 = i30 + c8604u4.f19761g[i29];
                                        long j4 = c8602s3.f19744c;
                                        long j5 = i29 > 0 ? c8604u4.f19772r : j2;
                                        while (i30 < i32) {
                                            int iM21355m3 = z2 ? c8815n6.m21355m() : c8593j4.f19651b;
                                            int iM21355m4 = z4 ? c8815n6.m21355m() : c8593j4.f19652c;
                                            int iM21340b3 = (i30 == 0 && z3) ? i31 : z7 ? c8815n6.m21340b() : c8593j4.f19653d;
                                            if (z6) {
                                                iArr4[i30] = (int) (((long) (c8815n6.m21340b() * 1000)) / j4);
                                            } else {
                                                iArr4[i30] = 0;
                                            }
                                            long j6 = j5;
                                            jArr3[i30] = AbstractC8827z.m21382a(j5, 1000L, j4) - jM21382a;
                                            iArr3[i30] = iM21355m4;
                                            zArr[i30] = ((iM21340b3 >> 16) & 1) == 0;
                                            j5 = j6 + ((long) iM21355m3);
                                            i30++;
                                            c8593j4 = c8593j4;
                                            i32 = i32;
                                        }
                                        c8604u4.f19772r = j5;
                                        i26 = i28;
                                        i27 = i32;
                                    } else {
                                        j2 = jM21356n2;
                                    }
                                    i25++;
                                    jM21356n2 = j2;
                                    arrayList = arrayList;
                                }
                                C8585b c8585bM21122c = c8584a3.m21122c(AbstractC8586c.f19575d0);
                                if (c8585bM21122c != null) {
                                    C8603t c8603t = c8595l3.f19658c.f19749h[c8604u2.f19755a.f19650a];
                                    C8815n c8815n7 = c8585bM21122c.f19527P0;
                                    int i33 = c8603t.f19753a;
                                    c8815n7.m21347e(8);
                                    if ((c8815n7.m21340b() & 1) == 1) {
                                        c8815n7.m21347e(c8815n7.f20644b + 8);
                                    }
                                    int iM21352j = c8815n7.m21352j();
                                    int iM21355m5 = c8815n7.m21355m();
                                    if (iM21355m5 != c8604u2.f19759e) {
                                        StringBuilder sbM21088a = AbstractC8551l.m21088a("Length mismatch: ", iM21355m5, ", ");
                                        sbM21088a.append(c8604u2.f19759e);
                                        throw new C8711r(sbM21088a.toString());
                                    }
                                    if (iM21352j == 0) {
                                        boolean[] zArr2 = c8604u2.f19767m;
                                        i6 = 0;
                                        for (int i34 = 0; i34 < iM21355m5; i34++) {
                                            int iM21352j2 = c8815n7.m21352j();
                                            i6 += iM21352j2;
                                            zArr2[i34] = iM21352j2 > i33;
                                        }
                                    } else {
                                        i6 = iM21352j * iM21355m5;
                                        Arrays.fill(c8604u2.f19767m, 0, iM21355m5, iM21352j > i33);
                                    }
                                    C8815n c8815n8 = c8604u2.f19770p;
                                    if (c8815n8 == null || c8815n8.f20645c < i6) {
                                        c8604u2.f19770p = new C8815n(i6);
                                    }
                                    c8604u2.f19769o = i6;
                                    c8604u2.f19766l = true;
                                    c8604u2.f19771q = true;
                                }
                                C8585b c8585bM21122c2 = c8584a3.m21122c(AbstractC8586c.f19577e0);
                                if (c8585bM21122c2 != null) {
                                    C8815n c8815n9 = c8585bM21122c2.f19527P0;
                                    c8815n9.m21347e(8);
                                    int iM21340b4 = c8815n9.m21340b();
                                    if ((iM21340b4 & 1) == 1) {
                                        c8815n9.m21347e(c8815n9.f20644b + 8);
                                    }
                                    int iM21355m6 = c8815n9.m21355m();
                                    if (iM21355m6 != 1) {
                                        throw new C8711r(AbstractC8673m.m21221a("Unexpected saio entry count: ", iM21355m6));
                                    }
                                    c8604u2.f19757c += ((iM21340b4 >> 24) & 255) == 0 ? c8815n9.m21353k() : c8815n9.m21356n();
                                }
                                C8585b c8585bM21122c3 = c8584a3.m21122c(AbstractC8586c.f19585i0);
                                if (c8585bM21122c3 != null) {
                                    m21134a(c8585bM21122c3.f19527P0, 0, c8604u2);
                                }
                                C8585b c8585bM21122c4 = c8584a3.m21122c(AbstractC8586c.f19579f0);
                                C8585b c8585bM21122c5 = c8584a3.m21122c(AbstractC8586c.f19581g0);
                                if (c8585bM21122c4 == null || c8585bM21122c5 == null) {
                                    i5 = 1;
                                } else {
                                    C8815n c8815n10 = c8585bM21122c4.f19527P0;
                                    C8815n c8815n11 = c8585bM21122c5.f19527P0;
                                    c8815n10.m21347e(8);
                                    int iM21340b5 = c8815n10.m21340b();
                                    int iM21340b6 = c8815n10.m21340b();
                                    int i35 = f19663A;
                                    if (iM21340b6 != i35) {
                                        i5 = 1;
                                    } else {
                                        i5 = 1;
                                        if (((iM21340b5 >> 24) & 255) == 1) {
                                            c8815n10.m21347e(c8815n10.f20644b + 4);
                                        }
                                        if (c8815n10.m21340b() != 1) {
                                            throw new C8711r("Entry count in sbgp != 1 (unsupported).");
                                        }
                                        c8815n11.m21347e(8);
                                        int iM21340b7 = c8815n11.m21340b();
                                        if (c8815n11.m21340b() == i35) {
                                            int i36 = (iM21340b7 >> 24) & 255;
                                            if (i36 == 1) {
                                                if (c8815n11.m21353k() == 0) {
                                                    throw new C8711r("Variable length decription in sgpd found (unsupported)");
                                                }
                                            } else if (i36 >= 2) {
                                                c8815n11.m21347e(c8815n11.f20644b + 4);
                                            }
                                            if (c8815n11.m21353k() != 1) {
                                                throw new C8711r("Entry count in sgpd != 1 (unsupported).");
                                            }
                                            c8815n11.m21347e(c8815n11.f20644b + 2);
                                            i5 = 1;
                                            if (c8815n11.m21352j() == 1) {
                                                int iM21352j3 = c8815n11.m21352j();
                                                byte[] bArr2 = new byte[16];
                                                c8815n11.m21339a(bArr2, 0, 16);
                                                c8604u2.f19766l = true;
                                                c8604u2.f19768n = new C8603t(iM21352j3, bArr2);
                                            }
                                        }
                                    }
                                }
                                int size6 = c8584a3.f19525Q0.size();
                                for (int i37 = 0; i37 < size6; i37++) {
                                    C8585b c8585b4 = (C8585b) c8584a3.f19525Q0.get(i37);
                                    if (c8585b4.f19620a == AbstractC8586c.f19583h0) {
                                        C8815n c8815n12 = c8585b4.f19527P0;
                                        c8815n12.m21347e(8);
                                        c8815n12.m21339a(bArr, 0, 16);
                                        if (Arrays.equals(bArr, f19664B)) {
                                            m21134a(c8815n12, 16, c8604u2);
                                        }
                                    }
                                }
                                i4 = 8;
                            }
                        } else {
                            sparseArray = sparseArray4;
                            i2 = size4;
                            i3 = i17;
                            i4 = i9;
                            i5 = i16;
                        }
                        i17 = i3 + 1;
                        i16 = i5;
                        i9 = i4;
                        size4 = i2;
                        sparseArray4 = sparseArray;
                    }
                    C8524d c8524dM21133a2 = m21133a(c8584a.f19525Q0);
                    if (c8524dM21133a2 != null) {
                        int i38 = 0;
                        for (int size7 = this.f19665a.size(); i38 < size7; size7 = size7) {
                            C8595l c8595l4 = (C8595l) this.f19665a.valueAt(i38);
                            InterfaceC8629r interfaceC8629r = c8595l4.f19657b;
                            C8708o c8708o = c8595l4.f19658c.f19747f;
                            interfaceC8629r.mo21053a(new C8708o(c8708o.f20290a, c8708o.f20294e, c8708o.f20295f, c8708o.f20292c, c8708o.f20291b, c8708o.f20296g, c8708o.f20299j, c8708o.f20300k, c8708o.f20301l, c8708o.f20302m, c8708o.f20303n, c8708o.f20305p, c8708o.f20304o, c8708o.f20306q, c8708o.f20307r, c8708o.f20308s, c8708o.f20309t, c8708o.f20310u, c8708o.f20311v, c8708o.f20313x, c8708o.f20314y, c8708o.f20315z, c8708o.f20312w, c8708o.f20297h, c8524dM21133a2, c8708o.f20293d));
                            i38++;
                        }
                    }
                } else if (!this.f19673i.isEmpty()) {
                    ((C8584a) this.f19673i.peek()).f19526R0.add(c8584a);
                }
            }
        }
        this.f19675k = 0;
        this.f19678n = 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i
    /* JADX INFO: renamed from: a */
    public final void mo21036a(long j, long j2) {
        int size = this.f19665a.size();
        for (int i = 0; i < size; i++) {
            ((C8595l) this.f19665a.valueAt(i)).m21132a();
        }
        this.f19674j.clear();
        this.f19681q = 0;
        this.f19673i.clear();
        this.f19675k = 0;
        this.f19678n = 0;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i
    /* JADX INFO: renamed from: a */
    public final void mo21037a(InterfaceC8568j interfaceC8568j) {
        this.f19689y = interfaceC8568j;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8567i
    /* JADX INFO: renamed from: a */
    public final boolean mo21038a(C8527b c8527b) {
        return AbstractC8601r.m21144a(c8527b, true);
    }
}
