package com.bytedance.sdk.component.p160lr.p161ri.p162lr;

import java.util.Arrays;

/* JADX INFO: loaded from: classes3.dex */
final class xha extends C2655ka {

    /* JADX INFO: renamed from: mj */
    final transient int[] f7565mj;
    final transient byte[][] xha;

    xha(C2658ri c2658ri, int i) {
        super(null);
        jbs.m9940ri(c2658ri.f7563lr, 0L, i);
        C2653fi c2653fi = c2658ri.f7564ri;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            if (c2653fi.f7551ik == c2653fi.f7553lr) {
                throw new AssertionError("s.limit == s.pos");
            }
            i3 += c2653fi.f7551ik - c2653fi.f7553lr;
            i4++;
            c2653fi = c2653fi.f7549di;
        }
        this.xha = new byte[i4][];
        this.f7565mj = new int[i4 * 2];
        C2653fi c2653fi2 = c2658ri.f7564ri;
        int i5 = 0;
        while (i2 < i) {
            this.xha[i5] = c2653fi2.f7554ri;
            i2 += c2653fi2.f7551ik - c2653fi2.f7553lr;
            if (i2 > i) {
                i2 = i;
            }
            int[] iArr = this.f7565mj;
            iArr[i5] = i2;
            iArr[this.xha.length + i5] = c2653fi2.f7553lr;
            c2653fi2.f7552ka = true;
            i5++;
            c2653fi2 = c2653fi2.f7549di;
        }
    }

    /* JADX INFO: renamed from: fi */
    private C2655ka m9972fi() {
        return new C2655ka(mo9946ka());
    }

    /* JADX INFO: renamed from: lr */
    private int m9973lr(int i) {
        int iBinarySearch = Arrays.binarySearch(this.f7565mj, 0, this.xha.length, i + 1);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    @Override // com.bytedance.sdk.component.p160lr.p161ri.p162lr.C2655ka
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2655ka) {
            C2655ka c2655ka = (C2655ka) obj;
            if (c2655ka.mo9945ik() == mo9945ik() && mo9952ri(0, c2655ka, 0, mo9945ik())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.p160lr.p161ri.p162lr.C2655ka
    public int hashCode() {
        int i = this.f7560fi;
        if (i != 0) {
            return i;
        }
        int length = this.xha.length;
        int i2 = 0;
        int i3 = 1;
        int i4 = 0;
        while (i2 < length) {
            byte[] bArr = this.xha[i2];
            int[] iArr = this.f7565mj;
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
        this.f7560fi = i3;
        return i3;
    }

    @Override // com.bytedance.sdk.component.p160lr.p161ri.p162lr.C2655ka
    /* JADX INFO: renamed from: ik */
    public int mo9945ik() {
        return this.f7565mj[this.xha.length - 1];
    }

    @Override // com.bytedance.sdk.component.p160lr.p161ri.p162lr.C2655ka
    /* JADX INFO: renamed from: ka */
    public byte[] mo9946ka() {
        int[] iArr = this.f7565mj;
        byte[][] bArr = this.xha;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.f7565mj;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            System.arraycopy(this.xha[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    @Override // com.bytedance.sdk.component.p160lr.p161ri.p162lr.C2655ka
    /* JADX INFO: renamed from: lr */
    public String mo9947lr() {
        return m9972fi().mo9947lr();
    }

    @Override // com.bytedance.sdk.component.p160lr.p161ri.p162lr.C2655ka
    /* JADX INFO: renamed from: ri */
    public byte mo9948ri(int i) {
        jbs.m9940ri(this.f7565mj[this.xha.length - 1], i, 1L);
        int iM9973lr = m9973lr(i);
        int i2 = iM9973lr == 0 ? 0 : this.f7565mj[iM9973lr - 1];
        int[] iArr = this.f7565mj;
        byte[][] bArr = this.xha;
        return bArr[iM9973lr][(i - i2) + iArr[bArr.length + iM9973lr]];
    }

    @Override // com.bytedance.sdk.component.p160lr.p161ri.p162lr.C2655ka
    /* JADX INFO: renamed from: ri */
    public C2655ka mo9950ri(int i, int i2) {
        return m9972fi().mo9950ri(i, i2);
    }

    @Override // com.bytedance.sdk.component.p160lr.p161ri.p162lr.C2655ka
    /* JADX INFO: renamed from: ri */
    public String mo9951ri() {
        return m9972fi().mo9951ri();
    }

    @Override // com.bytedance.sdk.component.p160lr.p161ri.p162lr.C2655ka
    /* JADX INFO: renamed from: ri */
    public boolean mo9952ri(int i, C2655ka c2655ka, int i2, int i3) {
        if (i < 0 || i > mo9945ik() - i3) {
            return false;
        }
        int iM9973lr = m9973lr(i);
        while (i3 > 0) {
            int i4 = iM9973lr == 0 ? 0 : this.f7565mj[iM9973lr - 1];
            int iMin = Math.min(i3, ((this.f7565mj[iM9973lr] - i4) + i4) - i);
            int[] iArr = this.f7565mj;
            byte[][] bArr = this.xha;
            if (!c2655ka.mo9953ri(i2, bArr[iM9973lr], (i - i4) + iArr[bArr.length + iM9973lr], iMin)) {
                return false;
            }
            i += iMin;
            i2 += iMin;
            i3 -= iMin;
            iM9973lr++;
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.p160lr.p161ri.p162lr.C2655ka
    /* JADX INFO: renamed from: ri */
    public boolean mo9953ri(int i, byte[] bArr, int i2, int i3) {
        if (i < 0 || i > mo9945ik() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int iM9973lr = m9973lr(i);
        while (i3 > 0) {
            int i4 = iM9973lr == 0 ? 0 : this.f7565mj[iM9973lr - 1];
            int iMin = Math.min(i3, ((this.f7565mj[iM9973lr] - i4) + i4) - i);
            int[] iArr = this.f7565mj;
            byte[][] bArr2 = this.xha;
            if (!jbs.m9942ri(bArr2[iM9973lr], (i - i4) + iArr[bArr2.length + iM9973lr], bArr, i2, iMin)) {
                return false;
            }
            i += iMin;
            i2 += iMin;
            i3 -= iMin;
            iM9973lr++;
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.p160lr.p161ri.p162lr.C2655ka
    public String toString() {
        return m9972fi().toString();
    }
}
