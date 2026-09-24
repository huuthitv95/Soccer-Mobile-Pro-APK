package com.fyber.inneractive.sdk.protobuf;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.n3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8986n3 {

    /* JADX INFO: renamed from: f */
    public static final C8986n3 f21077f = new C8986n3(0, new int[0], new Object[0], false);

    /* JADX INFO: renamed from: a */
    public int f21078a;

    /* JADX INFO: renamed from: b */
    public int[] f21079b;

    /* JADX INFO: renamed from: c */
    public Object[] f21080c;

    /* JADX INFO: renamed from: d */
    public int f21081d;

    /* JADX INFO: renamed from: e */
    public boolean f21082e;

    public C8986n3() {
        this(0, new int[8], new Object[8], true);
    }

    public C8986n3(int i, int[] iArr, Object[] objArr, boolean z) {
        this.f21081d = -1;
        this.f21078a = i;
        this.f21079b = iArr;
        this.f21080c = objArr;
        this.f21082e = z;
    }

    /* JADX INFO: renamed from: a */
    public static C8986n3 m21686a(C8986n3 c8986n3, C8986n3 c8986n4) {
        int i = c8986n3.f21078a + c8986n4.f21078a;
        int[] iArrCopyOf = Arrays.copyOf(c8986n3.f21079b, i);
        System.arraycopy(c8986n4.f21079b, 0, iArrCopyOf, c8986n3.f21078a, c8986n4.f21078a);
        Object[] objArrCopyOf = Arrays.copyOf(c8986n3.f21080c, i);
        System.arraycopy(c8986n4.f21080c, 0, objArrCopyOf, c8986n3.f21078a, c8986n4.f21078a);
        return new C8986n3(i, iArrCopyOf, objArrCopyOf, true);
    }

    /* JADX INFO: renamed from: a */
    public final int m21687a() {
        int iM21514b;
        int i = this.f21081d;
        if (i != -1) {
            return i;
        }
        int iM21687a = 0;
        for (int i2 = 0; i2 < this.f21078a; i2++) {
            int i3 = this.f21079b[i2];
            int i4 = i3 >>> 3;
            int i5 = i3 & 7;
            if (i5 == 0) {
                iM21514b = AbstractC8911b0.m21514b(i4) + AbstractC8911b0.m21511a(((Long) this.f21080c[i2]).longValue());
            } else if (i5 == 1) {
                ((Long) this.f21080c[i2]).getClass();
                iM21514b = AbstractC8911b0.m21514b(i4) + 8;
            } else if (i5 != 2) {
                if (i5 == 3) {
                    iM21687a = ((C8986n3) this.f21080c[i2]).m21687a() + (AbstractC8911b0.m21514b(i4) * 2) + iM21687a;
                } else {
                    if (i5 != 5) {
                        int i6 = C8984n1.f21076a;
                        throw new IllegalStateException(new C8978m1());
                    }
                    ((Integer) this.f21080c[i2]).getClass();
                    iM21514b = AbstractC8911b0.m21514b(i4) + 4;
                }
            } else {
                iM21514b = AbstractC8911b0.m21512a((AbstractC9011s) this.f21080c[i2]) + AbstractC8911b0.m21514b(i4);
            }
            iM21687a = iM21514b + iM21687a;
        }
        this.f21081d = iM21687a;
        return iM21687a;
    }

    /* JADX INFO: renamed from: a */
    public final void m21688a(int i, Object obj) {
        if (!this.f21082e) {
            throw new UnsupportedOperationException();
        }
        int i2 = this.f21078a;
        int[] iArr = this.f21079b;
        if (i2 == iArr.length) {
            int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
            this.f21079b = Arrays.copyOf(iArr, i3);
            this.f21080c = Arrays.copyOf(this.f21080c, i3);
        }
        int[] iArr2 = this.f21079b;
        int i4 = this.f21078a;
        iArr2[i4] = i;
        this.f21080c[i4] = obj;
        this.f21078a = i4 + 1;
    }

    /* JADX INFO: renamed from: a */
    public final void m21689a(C8917c0 c8917c0) {
        if (this.f21078a == 0) {
            return;
        }
        c8917c0.getClass();
        for (int i = 0; i < this.f21078a; i++) {
            int i2 = this.f21079b[i];
            Object obj = this.f21080c[i];
            int i3 = i2 >>> 3;
            int i4 = i2 & 7;
            if (i4 == 0) {
                c8917c0.f20990a.mo21484b(i3, ((Long) obj).longValue());
            } else if (i4 == 1) {
                c8917c0.f20990a.mo21475a(i3, ((Long) obj).longValue());
            } else if (i4 == 2) {
                c8917c0.f20990a.mo21478a(i3, (AbstractC9011s) obj);
            } else if (i4 == 3) {
                c8917c0.f20990a.mo21489c(i3, 3);
                ((C8986n3) obj).m21689a(c8917c0);
                c8917c0.f20990a.mo21489c(i3, 4);
            } else {
                if (i4 != 5) {
                    int i5 = C8984n1.f21076a;
                    throw new RuntimeException(new C8978m1());
                }
                c8917c0.f20990a.mo21474a(i3, ((Integer) obj).intValue());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m21690a(int i, AbstractC9031w abstractC9031w) throws C8978m1 {
        int iMo21741t;
        if (!this.f21082e) {
            throw new UnsupportedOperationException();
        }
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            m21688a(i, Long.valueOf(abstractC9031w.mo21733l()));
            return true;
        }
        if (i3 == 1) {
            m21688a(i, Long.valueOf(abstractC9031w.mo21730i()));
            return true;
        }
        if (i3 == 2) {
            m21688a(i, abstractC9031w.mo21724e());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                return false;
            }
            if (i3 == 5) {
                m21688a(i, Integer.valueOf(abstractC9031w.mo21729h()));
                return true;
            }
            int i4 = C8984n1.f21076a;
            throw new C8978m1();
        }
        C8986n3 c8986n3 = new C8986n3();
        do {
            iMo21741t = abstractC9031w.mo21741t();
            if (iMo21741t == 0) {
                break;
            }
        } while (c8986n3.m21690a(iMo21741t, abstractC9031w));
        abstractC9031w.mo21716a((i2 << 3) | 4);
        m21688a(i, c8986n3);
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C8986n3)) {
            return false;
        }
        C8986n3 c8986n3 = (C8986n3) obj;
        int i = this.f21078a;
        if (i == c8986n3.f21078a) {
            int[] iArr = this.f21079b;
            int[] iArr2 = c8986n3.f21079b;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            Object[] objArr = this.f21080c;
            Object[] objArr2 = c8986n3.f21080c;
            int i3 = this.f21078a;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.f21078a;
        int i2 = (i + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        int[] iArr = this.f21079b;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        Object[] objArr = this.f21080c;
        int i6 = this.f21078a;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }
}
