package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts;

import android.util.Pair;
import com.fyber.inneractive.sdk.player.exoplayer2.C8708o;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8568j;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC8629r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC8813l;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C8815n;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.j */
/* JADX INFO: loaded from: classes4.dex */
public final class C8645j implements InterfaceC8643h {

    /* JADX INFO: renamed from: n */
    public static final double[] f19959n = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: a */
    public String f19960a;

    /* JADX INFO: renamed from: b */
    public InterfaceC8629r f19961b;

    /* JADX INFO: renamed from: c */
    public boolean f19962c;

    /* JADX INFO: renamed from: d */
    public long f19963d;

    /* JADX INFO: renamed from: e */
    public final boolean[] f19964e = new boolean[4];

    /* JADX INFO: renamed from: f */
    public final C8644i f19965f = new C8644i();

    /* JADX INFO: renamed from: g */
    public boolean f19966g;

    /* JADX INFO: renamed from: h */
    public long f19967h;

    /* JADX INFO: renamed from: i */
    public long f19968i;

    /* JADX INFO: renamed from: j */
    public boolean f19969j;

    /* JADX INFO: renamed from: k */
    public boolean f19970k;

    /* JADX INFO: renamed from: l */
    public long f19971l;

    /* JADX INFO: renamed from: m */
    public long f19972m;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts.InterfaceC8643h
    /* JADX INFO: renamed from: a */
    public final void mo21165a() {
        AbstractC8813l.m21331a(this.f19964e);
        C8644i c8644i = this.f19965f;
        c8644i.f19955a = false;
        c8644i.f19956b = 0;
        c8644i.f19957c = 0;
        this.f19969j = false;
        this.f19966g = false;
        this.f19967h = 0L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts.InterfaceC8643h
    /* JADX INFO: renamed from: a */
    public final void mo21166a(InterfaceC8568j interfaceC8568j, C8639e0 c8639e0) {
        c8639e0.m21174a();
        c8639e0.m21175b();
        this.f19960a = c8639e0.f19937e;
        c8639e0.m21175b();
        this.f19961b = interfaceC8568j.mo21092a(c8639e0.f19936d, 2);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0107  */
    /* JADX WARN: Code duplicated, block: B:50:0x010b  */
    /* JADX WARN: Code duplicated, block: B:52:0x011b  */
    /* JADX WARN: Code duplicated, block: B:54:0x012c  */
    /* JADX WARN: Multi-variable type inference failed */
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
        boolean z;
        float f;
        int i;
        float f2;
        int i2;
        long j;
        double[] dArr;
        double d;
        int i3;
        int i4;
        int i5 = c8815n.f20644b;
        int i6 = c8815n.f20645c;
        byte[] bArr = c8815n.f20643a;
        int i7 = i6 - i5;
        this.f19967h += (long) i7;
        this.f19961b.mo21049a(i7, c8815n);
        int i8 = i5;
        while (true) {
            int iM21329a = AbstractC8813l.m21329a(bArr, i5, i6, this.f19964e);
            if (iM21329a == i6) {
                break;
            }
            int i9 = iM21329a + 3;
            boolean z2 = c8815n.f20643a[i9] & 255;
            if (!this.f19962c) {
                int i10 = iM21329a - i8;
                if (i10 > 0) {
                    C8644i c8644i = this.f19965f;
                    if (c8644i.f19955a) {
                        byte[] bArr2 = c8644i.f19958d;
                        int length = bArr2.length;
                        int i11 = c8644i.f19956b + i10;
                        if (length < i11) {
                            c8644i.f19958d = Arrays.copyOf(bArr2, i11 * 2);
                        }
                        System.arraycopy(bArr, i8, c8644i.f19958d, c8644i.f19956b, i10);
                        c8644i.f19956b += i10;
                    }
                }
                int i12 = i10 < 0 ? -i10 : 0;
                C8644i c8644i2 = this.f19965f;
                if (c8644i2.f19955a) {
                    if (c8644i2.f19957c == 0 && z2 == 181) {
                        c8644i2.f19957c = c8644i2.f19956b;
                    } else {
                        int i13 = c8644i2.f19956b - i12;
                        c8644i2.f19956b = i13;
                        c8644i2.f19955a = false;
                        String str = this.f19960a;
                        byte[] bArrCopyOf = Arrays.copyOf(c8644i2.f19958d, i13);
                        int i14 = bArrCopyOf[4] & 255;
                        byte b = bArrCopyOf[5];
                        int i15 = (i14 << 4) | ((b & 255) >> 4);
                        int i16 = ((b & Ascii.f22499SI) << 8) | (bArrCopyOf[6] & 255);
                        int i17 = (bArrCopyOf[7] & 240) >> 4;
                        if (i17 == 2) {
                            f = i16 * 4;
                            i = i15 * 3;
                        } else if (i17 != 3) {
                            if (i17 != 4) {
                                f2 = 1.0f;
                            } else {
                                f = i16 * Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
                                i = i15 * 100;
                            }
                            C8708o c8708oM21264a = C8708o.m21264a(str, "video/mpeg2", -1, i15, i16, Collections.singletonList(bArrCopyOf), -1, f2, null, -1, null, null);
                            i2 = (bArrCopyOf[7] & Ascii.f22499SI) - 1;
                            if (i2 >= 0) {
                                dArr = f19959n;
                                if (i2 < 8) {
                                    d = dArr[i2];
                                    byte b2 = bArrCopyOf[c8644i2.f19957c + 9];
                                    i3 = (b2 & 96) >> 5;
                                    i4 = b2 & Ascii.f22502US;
                                    if (i3 != i4) {
                                        d *= (((double) i3) + 1.0d) / ((double) (i4 + 1));
                                    }
                                    j = (long) (1000000.0d / d);
                                } else {
                                    j = 0;
                                }
                            } else {
                                j = 0;
                            }
                            Pair pairCreate = Pair.create(c8708oM21264a, Long.valueOf(j));
                            this.f19961b.mo21053a((C8708o) pairCreate.first);
                            this.f19963d = ((Long) pairCreate.second).longValue();
                            this.f19962c = true;
                        } else {
                            f = i16 * 16;
                            i = i15 * 9;
                        }
                        f2 = f / i;
                        C8708o c8708oM21264a2 = C8708o.m21264a(str, "video/mpeg2", -1, i15, i16, Collections.singletonList(bArrCopyOf), -1, f2, null, -1, null, null);
                        i2 = (bArrCopyOf[7] & Ascii.f22499SI) - 1;
                        if (i2 >= 0) {
                            dArr = f19959n;
                            if (i2 < 8) {
                                d = dArr[i2];
                                byte b3 = bArrCopyOf[c8644i2.f19957c + 9];
                                i3 = (b3 & 96) >> 5;
                                i4 = b3 & Ascii.f22502US;
                                if (i3 != i4) {
                                    d *= (((double) i3) + 1.0d) / ((double) (i4 + 1));
                                }
                                j = (long) (1000000.0d / d);
                            } else {
                                j = 0;
                            }
                        } else {
                            j = 0;
                        }
                        Pair pairCreate2 = Pair.create(c8708oM21264a2, Long.valueOf(j));
                        this.f19961b.mo21053a((C8708o) pairCreate2.first);
                        this.f19963d = ((Long) pairCreate2.second).longValue();
                        this.f19962c = true;
                    }
                } else if (z2 == 179) {
                    c8644i2.f19955a = true;
                }
            }
            if (this.f19962c && (z2 == 184 || z2 == 0)) {
                int i18 = i6 - iM21329a;
                if (this.f19966g) {
                    this.f19961b.mo21051a(this.f19972m, this.f19970k ? 1 : 0, ((int) (this.f19967h - this.f19971l)) - i18, i18, null);
                    z = false;
                    this.f19970k = false;
                } else {
                    z = false;
                }
                if (z2 == 184) {
                    this.f19966g = z;
                    this.f19970k = true;
                } else {
                    this.f19972m = this.f19969j ? this.f19968i : this.f19972m + this.f19963d;
                    this.f19971l = this.f19967h - ((long) i18);
                    this.f19969j = false;
                    this.f19966g = true;
                }
            }
            i8 = iM21329a;
            i5 = i9;
        }
        if (this.f19962c) {
            return;
        }
        C8644i c8644i3 = this.f19965f;
        if (c8644i3.f19955a) {
            int i19 = i6 - i8;
            byte[] bArr3 = c8644i3.f19958d;
            int length2 = bArr3.length;
            int i20 = c8644i3.f19956b + i19;
            if (length2 < i20) {
                c8644i3.f19958d = Arrays.copyOf(bArr3, i20 * 2);
            }
            System.arraycopy(bArr, i8, c8644i3.f19958d, c8644i3.f19956b, i19);
            c8644i3.f19956b += i19;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts.InterfaceC8643h
    /* JADX INFO: renamed from: a */
    public final void mo21168a(boolean z, long j) {
        boolean z2 = j != -9223372036854775807L;
        this.f19969j = z2;
        if (z2) {
            this.f19968i = j;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p276ts.InterfaceC8643h
    /* JADX INFO: renamed from: b */
    public final void mo21169b() {
    }
}
