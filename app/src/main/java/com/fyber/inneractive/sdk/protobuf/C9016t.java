package com.fyber.inneractive.sdk.protobuf;

import com.google.common.base.Ascii;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.t */
/* JADX INFO: loaded from: classes4.dex */
public final class C9016t extends AbstractC9031w {

    /* JADX INFO: renamed from: e */
    public final byte[] f21110e;

    /* JADX INFO: renamed from: f */
    public int f21111f;

    /* JADX INFO: renamed from: g */
    public int f21112g;

    /* JADX INFO: renamed from: h */
    public int f21113h;

    /* JADX INFO: renamed from: i */
    public final int f21114i;

    /* JADX INFO: renamed from: j */
    public int f21115j;

    /* JADX INFO: renamed from: k */
    public int f21116k = Integer.MAX_VALUE;

    public C9016t(byte[] bArr, int i, int i2, boolean z) {
        this.f21110e = bArr;
        this.f21111f = i2 + i;
        this.f21113h = i;
        this.f21114i = i;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: a */
    public final int mo21715a() {
        int i = this.f21116k;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.f21113h - this.f21114i);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: a */
    public final void mo21716a(int i) throws C8984n1 {
        if (this.f21115j != i) {
            throw new C8984n1("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: a */
    public final void mo21717a(int i, InterfaceC8919c2 interfaceC8919c2, C8947h0 c8947h0) throws IOException {
        int i2 = this.f21145a;
        if (i2 >= this.f21146b) {
            throw new C8984n1("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        this.f21145a = i2 + 1;
        ((AbstractC9017t0) interfaceC8919c2).m21750a(this, c8947h0);
        mo21716a((i << 3) | 4);
        this.f21145a--;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: a */
    public final void mo21718a(InterfaceC8919c2 interfaceC8919c2, C8947h0 c8947h0) throws IOException {
        int iMo21734m = mo21734m();
        if (this.f21145a >= this.f21146b) {
            throw new C8984n1("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iMo21722d = mo21722d(iMo21734m);
        this.f21145a++;
        ((AbstractC9017t0) interfaceC8919c2).m21750a(this, c8947h0);
        mo21716a(0);
        this.f21145a--;
        this.f21116k = iMo21722d;
        m21747z();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: b */
    public final int mo21719b() {
        return this.f21113h - this.f21114i;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: c */
    public final void mo21720c(int i) {
        this.f21116k = i;
        m21747z();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: c */
    public final boolean mo21721c() {
        return this.f21113h == this.f21111f;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: d */
    public final int mo21722d(int i) {
        if (i < 0) {
            throw new C8984n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = (this.f21113h - this.f21114i) + i;
        int i3 = this.f21116k;
        if (i2 > i3) {
            throw new C8984n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f21116k = i2;
        m21747z();
        return i3;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: d */
    public final boolean mo21723d() {
        return m21746y() != 0;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0040 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0042 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0044  */
    /* JADX WARN: Code duplicated, block: B:20:0x004e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0056  */
    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: e */
    public final C9000q mo21724e() throws C8984n1 {
        byte[] bArrCopyOfRange;
        int iMo21734m = mo21734m();
        if (iMo21734m > 0) {
            int i = this.f21111f;
            int i2 = this.f21113h;
            if (iMo21734m <= i - i2) {
                byte[] bArr = this.f21110e;
                C9000q c9000q = AbstractC9011s.f21106b;
                AbstractC9011s.m21712a(i2, i2 + iMo21734m, bArr.length);
                C9000q c9000q2 = new C9000q(AbstractC9011s.f21107c.mo21667a(bArr, i2, iMo21734m));
                this.f21113h += iMo21734m;
                return c9000q2;
            }
        }
        if (iMo21734m == 0) {
            return AbstractC9011s.f21106b;
        }
        if (iMo21734m > 0) {
            int i3 = this.f21111f;
            int i4 = this.f21113h;
            if (iMo21734m <= i3 - i4) {
                int i5 = iMo21734m + i4;
                this.f21113h = i5;
                bArrCopyOfRange = Arrays.copyOfRange(this.f21110e, i4, i5);
            } else {
                if (iMo21734m <= 0) {
                    throw new C8984n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                if (iMo21734m == 0) {
                    throw new C8984n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                }
                bArrCopyOfRange = AbstractC8972l1.f21065b;
            }
        } else {
            if (iMo21734m <= 0) {
                throw new C8984n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (iMo21734m == 0) {
                throw new C8984n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            bArrCopyOfRange = AbstractC8972l1.f21065b;
        }
        C9000q c9000q3 = AbstractC9011s.f21106b;
        return new C9000q(bArrCopyOfRange);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: e */
    public final boolean mo21725e(int i) throws C8984n1 {
        int iMo21741t;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.f21111f - this.f21113h >= 10) {
                while (i3 < 10) {
                    byte[] bArr = this.f21110e;
                    int i4 = this.f21113h;
                    this.f21113h = i4 + 1;
                    if (bArr[i4] < 0) {
                        i3++;
                    }
                }
                throw new C8984n1("CodedInputStream encountered a malformed varint.");
            }
            while (i3 < 10) {
                int i5 = this.f21113h;
                if (i5 == this.f21111f) {
                    throw new C8984n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                byte[] bArr2 = this.f21110e;
                this.f21113h = i5 + 1;
                if (bArr2[i5] < 0) {
                    i3++;
                }
            }
            throw new C8984n1("CodedInputStream encountered a malformed varint.");
            return true;
        }
        if (i2 == 1) {
            m21727f(8);
            return true;
        }
        if (i2 == 2) {
            m21727f(mo21734m());
            return true;
        }
        if (i2 == 3) {
            do {
                iMo21741t = mo21741t();
                if (iMo21741t == 0) {
                    break;
                }
            } while (mo21725e(iMo21741t));
            mo21716a(((i >>> 3) << 3) | 4);
            return true;
        }
        if (i2 == 4) {
            return false;
        }
        if (i2 == 5) {
            m21727f(4);
            return true;
        }
        int i6 = C8984n1.f21076a;
        throw new C8978m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: f */
    public final double mo21726f() {
        return Double.longBitsToDouble(m21745x());
    }

    /* JADX INFO: renamed from: f */
    public final void m21727f(int i) throws C8984n1 {
        if (i >= 0) {
            int i2 = this.f21111f;
            int i3 = this.f21113h;
            if (i <= i2 - i3) {
                this.f21113h = i3 + i;
                return;
            }
        }
        if (i >= 0) {
            throw new C8984n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new C8984n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: g */
    public final int mo21728g() {
        return mo21734m();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: h */
    public final int mo21729h() {
        return m21744w();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: i */
    public final long mo21730i() {
        return m21745x();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: j */
    public final float mo21731j() {
        return Float.intBitsToFloat(m21744w());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: k */
    public final int mo21732k() {
        return mo21734m();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: l */
    public final long mo21733l() {
        return m21746y();
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00a2 A[PHI: r3
  0x00a2: PHI (r3v11 int) = (r3v10 int), (r3v13 int) binds: [B:25:0x0053, B:29:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: m */
    public final int mo21734m() throws C8984n1 {
        int i;
        int i2 = this.f21113h;
        int i3 = this.f21111f;
        if (i3 != i2) {
            byte[] bArr = this.f21110e;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f21113h = i4;
                return b;
            }
            if (i3 - i4 >= 9) {
                int i5 = i2 + 2;
                int i6 = (bArr[i4] << 7) ^ b;
                if (i6 < 0) {
                    i = i6 ^ (-128);
                } else {
                    int i7 = i2 + 3;
                    int i8 = (bArr[i5] << Ascii.f22500SO) ^ i6;
                    if (i8 >= 0) {
                        i = i8 ^ 16256;
                    } else {
                        int i9 = i2 + 4;
                        int i10 = i8 ^ (bArr[i7] << Ascii.NAK);
                        if (i10 < 0) {
                            i = (-2080896) ^ i10;
                            i5 = i9;
                        } else {
                            i7 = i2 + 5;
                            byte b2 = bArr[i9];
                            int i11 = (i10 ^ (b2 << Ascii.f22493FS)) ^ 266354560;
                            if (b2 < 0) {
                                int i12 = i2 + 6;
                                if (bArr[i7] < 0) {
                                    i7 = i2 + 7;
                                    if (bArr[i12] < 0) {
                                        i12 = i2 + 8;
                                        if (bArr[i7] < 0) {
                                            i7 = i2 + 9;
                                            if (bArr[i12] < 0) {
                                                int i13 = i2 + 10;
                                                if (bArr[i7] >= 0) {
                                                    i7 = i13;
                                                }
                                            }
                                        } else {
                                            i7 = i12;
                                        }
                                    }
                                } else {
                                    i7 = i12;
                                }
                            }
                            i = i11;
                        }
                    }
                    i5 = i7;
                }
                this.f21113h = i5;
                return i;
            }
        }
        long j = 0;
        for (int i14 = 0; i14 < 64; i14 += 7) {
            int i15 = this.f21113h;
            if (i15 == this.f21111f) {
                throw new C8984n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            byte[] bArr2 = this.f21110e;
            this.f21113h = i15 + 1;
            byte b3 = bArr2[i15];
            j |= ((long) (b3 & 127)) << i14;
            if ((b3 & 128) == 0) {
                return (int) j;
            }
        }
        throw new C8984n1("CodedInputStream encountered a malformed varint.");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: n */
    public final int mo21735n() {
        return m21744w();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: o */
    public final long mo21736o() {
        return m21745x();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: p */
    public final int mo21737p() {
        return AbstractC9031w.m21818b(mo21734m());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: q */
    public final long mo21738q() {
        return AbstractC9031w.m21817a(m21746y());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: r */
    public final String mo21739r() throws C8984n1 {
        int iMo21734m = mo21734m();
        if (iMo21734m > 0) {
            int i = this.f21111f;
            int i2 = this.f21113h;
            if (iMo21734m <= i - i2) {
                String str = new String(this.f21110e, i2, iMo21734m, AbstractC8972l1.f21064a);
                this.f21113h += iMo21734m;
                return str;
            }
        }
        if (iMo21734m == 0) {
            return "";
        }
        if (iMo21734m < 0) {
            throw new C8984n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new C8984n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: s */
    public final String mo21740s() throws C8984n1 {
        int iMo21734m = mo21734m();
        if (iMo21734m > 0) {
            int i = this.f21111f;
            int i2 = this.f21113h;
            if (iMo21734m <= i - i2) {
                String strMo21507a = AbstractC8927d4.f21001a.mo21507a(this.f21110e, i2, iMo21734m);
                this.f21113h += iMo21734m;
                return strMo21507a;
            }
        }
        if (iMo21734m == 0) {
            return "";
        }
        if (iMo21734m <= 0) {
            throw new C8984n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new C8984n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: t */
    public final int mo21741t() throws C8984n1 {
        if (mo21721c()) {
            this.f21115j = 0;
            return 0;
        }
        int iMo21734m = mo21734m();
        this.f21115j = iMo21734m;
        if ((iMo21734m >>> 3) != 0) {
            return iMo21734m;
        }
        throw new C8984n1("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: u */
    public final int mo21742u() {
        return mo21734m();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: v */
    public final long mo21743v() {
        return m21746y();
    }

    /* JADX INFO: renamed from: w */
    public final int m21744w() throws C8984n1 {
        int i = this.f21113h;
        if (this.f21111f - i < 4) {
            throw new C8984n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.f21110e;
        this.f21113h = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: x */
    public final long m21745x() throws C8984n1 {
        int i = this.f21113h;
        if (this.f21111f - i < 8) {
            throw new C8984n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.f21110e;
        this.f21113h = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* JADX INFO: renamed from: y */
    public final long m21746y() throws C8984n1 {
        long j;
        long j2;
        long j3;
        int i = this.f21113h;
        int i2 = this.f21111f;
        long j4 = 0;
        if (i2 != i) {
            byte[] bArr = this.f21110e;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.f21113h = i3;
                return b;
            }
            if (i2 - i3 >= 9) {
                int i4 = i + 2;
                int i5 = (bArr[i3] << 7) ^ b;
                if (i5 < 0) {
                    j = i5 ^ (-128);
                } else {
                    int i6 = i + 3;
                    int i7 = (bArr[i4] << Ascii.f22500SO) ^ i5;
                    if (i7 >= 0) {
                        j = i7 ^ 16256;
                        i4 = i6;
                    } else {
                        int i8 = i + 4;
                        int i9 = i7 ^ (bArr[i6] << Ascii.NAK);
                        if (i9 < 0) {
                            j = (-2080896) ^ i9;
                        } else {
                            long j5 = i9;
                            i4 = i + 5;
                            long j6 = j5 ^ (((long) bArr[i8]) << 28);
                            if (j6 >= 0) {
                                j3 = 266354560;
                            } else {
                                i8 = i + 6;
                                long j7 = j6 ^ (((long) bArr[i4]) << 35);
                                if (j7 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    i4 = i + 7;
                                    j6 = j7 ^ (((long) bArr[i8]) << 42);
                                    if (j6 >= 0) {
                                        j3 = 4363953127296L;
                                    } else {
                                        i8 = i + 8;
                                        j7 = j6 ^ (((long) bArr[i4]) << 49);
                                        if (j7 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            i4 = i + 9;
                                            long j8 = (j7 ^ (((long) bArr[i8]) << 56)) ^ 71499008037633920L;
                                            if (j8 < 0) {
                                                int i10 = i + 10;
                                                if (bArr[i4] >= 0) {
                                                    i4 = i10;
                                                }
                                            }
                                            j = j8;
                                        }
                                    }
                                }
                                j = j7 ^ j2;
                            }
                            j = j3 ^ j6;
                        }
                        i4 = i8;
                    }
                }
                this.f21113h = i4;
                return j;
            }
        }
        for (int i11 = 0; i11 < 64; i11 += 7) {
            int i12 = this.f21113h;
            if (i12 == this.f21111f) {
                throw new C8984n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            byte[] bArr2 = this.f21110e;
            this.f21113h = i12 + 1;
            byte b2 = bArr2[i12];
            j4 |= ((long) (b2 & 127)) << i11;
            if ((b2 & 128) == 0) {
                return j4;
            }
        }
        throw new C8984n1("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: renamed from: z */
    public final void m21747z() {
        int i = this.f21111f + this.f21112g;
        this.f21111f = i;
        int i2 = i - this.f21114i;
        int i3 = this.f21116k;
        if (i2 <= i3) {
            this.f21112g = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f21112g = i4;
        this.f21111f = i - i4;
    }
}
