package com.mbridge.msdk.thrid.okio;

import java.util.Arrays;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okio.q */
/* JADX INFO: compiled from: SegmentedByteString.java */
/* JADX INFO: loaded from: classes7.dex */
final class C13807q extends C13796f {

    /* JADX INFO: renamed from: f */
    final transient byte[][] f39347f;

    /* JADX INFO: renamed from: g */
    final transient int[] f39348g;

    C13807q(C13793c c13793c, int i) {
        super(null);
        C13811u.m40969a(c13793c.f39306b, 0L, i);
        C13805o c13805o = c13793c.f39305a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = c13805o.f39340c;
            int i6 = c13805o.f39339b;
            if (i5 == i6) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += i5 - i6;
            i4++;
            c13805o = c13805o.f39343f;
        }
        this.f39347f = new byte[i4][];
        this.f39348g = new int[i4 * 2];
        C13805o c13805o2 = c13793c.f39305a;
        int i7 = 0;
        while (i2 < i) {
            byte[][] bArr = this.f39347f;
            bArr[i7] = c13805o2.f39338a;
            int i8 = c13805o2.f39340c;
            int i9 = c13805o2.f39339b;
            i2 += i8 - i9;
            if (i2 > i) {
                i2 = i;
            }
            int[] iArr = this.f39348g;
            iArr[i7] = i2;
            iArr[bArr.length + i7] = i9;
            c13805o2.f39341d = true;
            i7++;
            c13805o2 = c13805o2.f39343f;
        }
    }

    /* JADX INFO: renamed from: b */
    private int m40964b(int i) {
        int iBinarySearch = Arrays.binarySearch(this.f39348g, 0, this.f39347f.length, i + 1);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    /* JADX INFO: renamed from: n */
    private C13796f m40965n() {
        return new C13796f(mo40925l());
    }

    @Override // com.mbridge.msdk.thrid.okio.C13796f
    /* JADX INFO: renamed from: a */
    public byte mo40912a(int i) {
        C13811u.m40969a(this.f39348g[this.f39347f.length - 1], i, 1L);
        int iM40964b = m40964b(i);
        int i2 = iM40964b == 0 ? 0 : this.f39348g[iM40964b - 1];
        int[] iArr = this.f39348g;
        byte[][] bArr = this.f39347f;
        return bArr[iM40964b][(i - i2) + iArr[bArr.length + iM40964b]];
    }

    @Override // com.mbridge.msdk.thrid.okio.C13796f
    /* JADX INFO: renamed from: a */
    public C13796f mo40914a(int i, int i2) {
        return m40965n().mo40914a(i, i2);
    }

    @Override // com.mbridge.msdk.thrid.okio.C13796f
    /* JADX INFO: renamed from: a */
    void mo40915a(C13793c c13793c) {
        int length = this.f39347f.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f39348g;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            C13805o c13805o = new C13805o(this.f39347f[i], i3, (i3 + i4) - i2, true, false);
            C13805o c13805o2 = c13793c.f39305a;
            if (c13805o2 == null) {
                c13805o.f39344g = c13805o;
                c13805o.f39343f = c13805o;
                c13793c.f39305a = c13805o;
            } else {
                c13805o2.f39344g.m40957a(c13805o);
            }
            i++;
            i2 = i4;
        }
        c13793c.f39306b += (long) i2;
    }

    @Override // com.mbridge.msdk.thrid.okio.C13796f
    /* JADX INFO: renamed from: a */
    public boolean mo40916a(int i, C13796f c13796f, int i2, int i3) {
        if (i < 0 || i > mo40923j() - i3) {
            return false;
        }
        int iM40964b = m40964b(i);
        while (i3 > 0) {
            int i4 = iM40964b == 0 ? 0 : this.f39348g[iM40964b - 1];
            int iMin = Math.min(i3, ((this.f39348g[iM40964b] - i4) + i4) - i);
            int[] iArr = this.f39348g;
            byte[][] bArr = this.f39347f;
            if (!c13796f.mo40917a(i2, bArr[iM40964b], (i - i4) + iArr[bArr.length + iM40964b], iMin)) {
                return false;
            }
            i += iMin;
            i2 += iMin;
            i3 -= iMin;
            iM40964b++;
        }
        return true;
    }

    @Override // com.mbridge.msdk.thrid.okio.C13796f
    /* JADX INFO: renamed from: a */
    public boolean mo40917a(int i, byte[] bArr, int i2, int i3) {
        if (i < 0 || i > mo40923j() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int iM40964b = m40964b(i);
        while (i3 > 0) {
            int i4 = iM40964b == 0 ? 0 : this.f39348g[iM40964b - 1];
            int iMin = Math.min(i3, ((this.f39348g[iM40964b] - i4) + i4) - i);
            int[] iArr = this.f39348g;
            byte[][] bArr2 = this.f39347f;
            if (!C13811u.m40971a(bArr2[iM40964b], (i - i4) + iArr[bArr2.length + iM40964b], bArr, i2, iMin)) {
                return false;
            }
            i += iMin;
            i2 += iMin;
            i3 -= iMin;
            iM40964b++;
        }
        return true;
    }

    @Override // com.mbridge.msdk.thrid.okio.C13796f
    /* JADX INFO: renamed from: d */
    public String mo40919d() {
        return m40965n().mo40919d();
    }

    @Override // com.mbridge.msdk.thrid.okio.C13796f
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C13796f) {
            C13796f c13796f = (C13796f) obj;
            if (c13796f.mo40923j() == mo40923j() && mo40916a(0, c13796f, 0, mo40923j())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.mbridge.msdk.thrid.okio.C13796f
    /* JADX INFO: renamed from: g */
    public String mo40920g() {
        return m40965n().mo40920g();
    }

    @Override // com.mbridge.msdk.thrid.okio.C13796f
    /* JADX INFO: renamed from: h */
    public C13796f mo40921h() {
        return m40965n().mo40921h();
    }

    @Override // com.mbridge.msdk.thrid.okio.C13796f
    public int hashCode() {
        int i = this.f39311b;
        if (i != 0) {
            return i;
        }
        int length = this.f39347f.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            byte[] bArr = this.f39347f[i2];
            int[] iArr = this.f39348g;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i4) + i5;
            while (i5 < i7) {
                i3 = (i3 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i4 = i6;
        }
        this.f39311b = i3;
        return i3;
    }

    @Override // com.mbridge.msdk.thrid.okio.C13796f
    /* JADX INFO: renamed from: i */
    public C13796f mo40922i() {
        return m40965n().mo40922i();
    }

    @Override // com.mbridge.msdk.thrid.okio.C13796f
    /* JADX INFO: renamed from: j */
    public int mo40923j() {
        return this.f39348g[this.f39347f.length - 1];
    }

    @Override // com.mbridge.msdk.thrid.okio.C13796f
    /* JADX INFO: renamed from: k */
    public C13796f mo40924k() {
        return m40965n().mo40924k();
    }

    @Override // com.mbridge.msdk.thrid.okio.C13796f
    /* JADX INFO: renamed from: l */
    public byte[] mo40925l() {
        int[] iArr = this.f39348g;
        byte[][] bArr = this.f39347f;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.f39348g;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            System.arraycopy(this.f39347f[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    @Override // com.mbridge.msdk.thrid.okio.C13796f
    /* JADX INFO: renamed from: m */
    public String mo40926m() {
        return m40965n().mo40926m();
    }

    @Override // com.mbridge.msdk.thrid.okio.C13796f
    public String toString() {
        return m40965n().toString();
    }
}
