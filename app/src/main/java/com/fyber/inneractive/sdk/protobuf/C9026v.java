package com.fyber.inneractive.sdk.protobuf;

import com.google.common.base.Ascii;
import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.v */
/* JADX INFO: loaded from: classes4.dex */
public final class C9026v extends AbstractC9031w {

    /* JADX INFO: renamed from: e */
    public final ByteBuffer f21137e;

    /* JADX INFO: renamed from: f */
    public final long f21138f;

    /* JADX INFO: renamed from: g */
    public long f21139g;

    /* JADX INFO: renamed from: h */
    public long f21140h;

    /* JADX INFO: renamed from: i */
    public final long f21141i;

    /* JADX INFO: renamed from: j */
    public int f21142j;

    /* JADX INFO: renamed from: k */
    public int f21143k;

    /* JADX INFO: renamed from: l */
    public int f21144l = Integer.MAX_VALUE;

    public C9026v(ByteBuffer byteBuffer, boolean z) {
        this.f21137e = byteBuffer;
        AbstractC9035w3 abstractC9035w3 = AbstractC9040x3.f21172c;
        long j = abstractC9035w3.f21158a.getLong(byteBuffer, AbstractC9040x3.f21176g);
        this.f21138f = j;
        this.f21139g = ((long) byteBuffer.limit()) + j;
        long jPosition = j + ((long) byteBuffer.position());
        this.f21140h = jPosition;
        this.f21141i = jPosition;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: a */
    public final int mo21715a() {
        int i = this.f21144l;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - ((int) (this.f21140h - this.f21141i));
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: a */
    public final void mo21716a(int i) throws C8984n1 {
        if (this.f21143k != i) {
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
        this.f21144l = iMo21722d;
        m21815z();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: b */
    public final int mo21719b() {
        return (int) (this.f21140h - this.f21141i);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: c */
    public final void mo21720c(int i) {
        this.f21144l = i;
        m21815z();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: c */
    public final boolean mo21721c() {
        return this.f21140h == this.f21139g;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: d */
    public final int mo21722d(int i) throws C8984n1 {
        if (i < 0) {
            throw new C8984n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = i + ((int) (this.f21140h - this.f21141i));
        int i3 = this.f21144l;
        if (i2 > i3) {
            throw new C8984n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f21144l = i2;
        m21815z();
        return i3;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: d */
    public final boolean mo21723d() {
        return m21814y() != 0;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: e */
    public final C9000q mo21724e() throws C8984n1 {
        int iMo21734m = mo21734m();
        if (iMo21734m > 0) {
            long j = this.f21139g;
            long j2 = this.f21140h;
            if (iMo21734m <= ((int) (j - j2))) {
                byte[] bArr = new byte[iMo21734m];
                long j3 = iMo21734m;
                AbstractC9040x3.f21172c.mo21755a(j2, bArr, j3);
                this.f21140h += j3;
                C9000q c9000q = AbstractC9011s.f21106b;
                return new C9000q(bArr);
            }
        }
        if (iMo21734m == 0) {
            return AbstractC9011s.f21106b;
        }
        if (iMo21734m < 0) {
            throw new C8984n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new C8984n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: e */
    public final boolean mo21725e(int i) throws C8984n1 {
        int iMo21741t;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (((int) (this.f21139g - this.f21140h)) >= 10) {
                while (i3 < 10) {
                    long j = this.f21140h;
                    this.f21140h = j + 1;
                    if (AbstractC9040x3.f21172c.mo21754a(j) < 0) {
                        i3++;
                    }
                }
                throw new C8984n1("CodedInputStream encountered a malformed varint.");
            }
            while (i3 < 10) {
                long j2 = this.f21140h;
                if (j2 == this.f21139g) {
                    throw new C8984n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.f21140h = j2 + 1;
                if (AbstractC9040x3.f21172c.mo21754a(j2) < 0) {
                    i3++;
                }
            }
            throw new C8984n1("CodedInputStream encountered a malformed varint.");
            return true;
        }
        if (i2 == 1) {
            m21811f(8);
            return true;
        }
        if (i2 == 2) {
            m21811f(mo21734m());
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
            m21811f(4);
            return true;
        }
        int i4 = C8984n1.f21076a;
        throw new C8978m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: f */
    public final double mo21726f() {
        return Double.longBitsToDouble(m21813x());
    }

    /* JADX INFO: renamed from: f */
    public final void m21811f(int i) throws C8984n1 {
        if (i >= 0) {
            long j = this.f21139g;
            long j2 = this.f21140h;
            if (i <= ((int) (j - j2))) {
                this.f21140h = j2 + ((long) i);
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
        return m21812w();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: i */
    public final long mo21730i() {
        return m21813x();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: j */
    public final float mo21731j() {
        return Float.intBitsToFloat(m21812w());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: k */
    public final int mo21732k() {
        return mo21734m();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: l */
    public final long mo21733l() {
        return m21814y();
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00cc A[PHI: r6
  0x00cc: PHI (r6v9 long) = (r6v8 long), (r6v12 long) binds: [B:22:0x0064, B:26:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: m */
    public final int mo21734m() throws C8984n1 {
        int i;
        long j = this.f21140h;
        if (this.f21139g != j) {
            long j2 = j + 1;
            AbstractC9035w3 abstractC9035w3 = AbstractC9040x3.f21172c;
            byte bMo21754a = abstractC9035w3.mo21754a(j);
            if (bMo21754a >= 0) {
                this.f21140h = j2;
                return bMo21754a;
            }
            if (this.f21139g - j2 >= 9) {
                long j3 = 2 + j;
                int iMo21754a = (abstractC9035w3.mo21754a(j2) << 7) ^ bMo21754a;
                if (iMo21754a < 0) {
                    i = iMo21754a ^ (-128);
                } else {
                    long j4 = 3 + j;
                    int iMo21754a2 = iMo21754a ^ (abstractC9035w3.mo21754a(j3) << Ascii.f22500SO);
                    if (iMo21754a2 >= 0) {
                        i = iMo21754a2 ^ 16256;
                        j3 = j4;
                    } else {
                        j3 = 4 + j;
                        int iMo21754a3 = iMo21754a2 ^ (abstractC9035w3.mo21754a(j4) << Ascii.NAK);
                        if (iMo21754a3 < 0) {
                            i = (-2080896) ^ iMo21754a3;
                        } else {
                            long j5 = 5 + j;
                            byte bMo21754a2 = abstractC9035w3.mo21754a(j3);
                            int i2 = (iMo21754a3 ^ (bMo21754a2 << Ascii.f22493FS)) ^ 266354560;
                            if (bMo21754a2 < 0) {
                                j3 = 6 + j;
                                if (abstractC9035w3.mo21754a(j5) < 0) {
                                    j5 = 7 + j;
                                    if (abstractC9035w3.mo21754a(j3) < 0) {
                                        j3 = 8 + j;
                                        if (abstractC9035w3.mo21754a(j5) < 0) {
                                            long j6 = 9 + j;
                                            if (abstractC9035w3.mo21754a(j3) < 0) {
                                                long j7 = j + 10;
                                                if (abstractC9035w3.mo21754a(j6) >= 0) {
                                                    j3 = j7;
                                                }
                                            } else {
                                                j3 = j6;
                                            }
                                        }
                                    } else {
                                        j3 = j5;
                                    }
                                }
                            } else {
                                j3 = j5;
                            }
                            i = i2;
                        }
                    }
                }
                this.f21140h = j3;
                return i;
            }
        }
        long j8 = 0;
        for (int i3 = 0; i3 < 64; i3 += 7) {
            long j9 = this.f21140h;
            if (j9 == this.f21139g) {
                throw new C8984n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.f21140h = j9 + 1;
            byte bMo21754a3 = AbstractC9040x3.f21172c.mo21754a(j9);
            j8 |= ((long) (bMo21754a3 & 127)) << i3;
            if ((bMo21754a3 & 128) == 0) {
                return (int) j8;
            }
        }
        throw new C8984n1("CodedInputStream encountered a malformed varint.");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: n */
    public final int mo21735n() {
        return m21812w();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: o */
    public final long mo21736o() {
        return m21813x();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: p */
    public final int mo21737p() {
        return AbstractC9031w.m21818b(mo21734m());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: q */
    public final long mo21738q() {
        return AbstractC9031w.m21817a(m21814y());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: r */
    public final String mo21739r() throws C8984n1 {
        int iMo21734m = mo21734m();
        if (iMo21734m > 0) {
            long j = this.f21139g;
            long j2 = this.f21140h;
            if (iMo21734m <= ((int) (j - j2))) {
                byte[] bArr = new byte[iMo21734m];
                long j3 = iMo21734m;
                AbstractC9040x3.f21172c.mo21755a(j2, bArr, j3);
                String str = new String(bArr, AbstractC8972l1.f21064a);
                this.f21140h += j3;
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
        String strMo21508b;
        int iMo21734m = mo21734m();
        if (iMo21734m > 0) {
            long j = this.f21139g;
            long j2 = this.f21140h;
            if (iMo21734m <= ((int) (j - j2))) {
                int i = (int) (j2 - this.f21138f);
                ByteBuffer byteBuffer = this.f21137e;
                AbstractC9050z3 abstractC9050z3 = AbstractC8927d4.f21001a;
                abstractC9050z3.getClass();
                if (byteBuffer.hasArray()) {
                    strMo21508b = abstractC9050z3.mo21507a(byteBuffer.array(), byteBuffer.arrayOffset() + i, iMo21734m);
                } else {
                    strMo21508b = byteBuffer.isDirect() ? abstractC9050z3.mo21508b(byteBuffer, i, iMo21734m) : AbstractC9050z3.m21851a(byteBuffer, i, iMo21734m);
                }
                this.f21140h += (long) iMo21734m;
                return strMo21508b;
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
            this.f21143k = 0;
            return 0;
        }
        int iMo21734m = mo21734m();
        this.f21143k = iMo21734m;
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
        return m21814y();
    }

    /* JADX INFO: renamed from: w */
    public final int m21812w() throws C8984n1 {
        long j = this.f21140h;
        if (this.f21139g - j < 4) {
            throw new C8984n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f21140h = 4 + j;
        AbstractC9035w3 abstractC9035w3 = AbstractC9040x3.f21172c;
        return ((abstractC9035w3.mo21754a(j + 3) & 255) << 24) | (abstractC9035w3.mo21754a(j) & 255) | ((abstractC9035w3.mo21754a(1 + j) & 255) << 8) | ((abstractC9035w3.mo21754a(2 + j) & 255) << 16);
    }

    /* JADX INFO: renamed from: x */
    public final long m21813x() throws C8984n1 {
        long j = this.f21140h;
        if (this.f21139g - j < 8) {
            throw new C8984n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f21140h = 8 + j;
        AbstractC9035w3 abstractC9035w3 = AbstractC9040x3.f21172c;
        return ((((long) abstractC9035w3.mo21754a(j + 7)) & 255) << 56) | (((long) abstractC9035w3.mo21754a(j)) & 255) | ((((long) abstractC9035w3.mo21754a(1 + j)) & 255) << 8) | ((((long) abstractC9035w3.mo21754a(2 + j)) & 255) << 16) | ((((long) abstractC9035w3.mo21754a(3 + j)) & 255) << 24) | ((((long) abstractC9035w3.mo21754a(4 + j)) & 255) << 32) | ((((long) abstractC9035w3.mo21754a(5 + j)) & 255) << 40) | ((((long) abstractC9035w3.mo21754a(6 + j)) & 255) << 48);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000e  */
    /* JADX INFO: renamed from: y */
    public final long m21814y() throws C8984n1 {
        long j;
        long j2;
        int i;
        long j3 = this.f21140h;
        long j4 = 0;
        if (this.f21139g != j3) {
            long j5 = j3 + 1;
            AbstractC9035w3 abstractC9035w3 = AbstractC9040x3.f21172c;
            byte bMo21754a = abstractC9035w3.mo21754a(j3);
            if (bMo21754a >= 0) {
                this.f21140h = j5;
                return bMo21754a;
            }
            if (this.f21139g - j5 >= 9) {
                long j6 = 2 + j3;
                int iMo21754a = (abstractC9035w3.mo21754a(j5) << 7) ^ bMo21754a;
                if (iMo21754a >= 0) {
                    long j7 = 3 + j3;
                    int iMo21754a2 = iMo21754a ^ (abstractC9035w3.mo21754a(j6) << Ascii.f22500SO);
                    if (iMo21754a2 >= 0) {
                        j = iMo21754a2 ^ 16256;
                        j6 = j7;
                    } else {
                        j6 = 4 + j3;
                        int iMo21754a3 = iMo21754a2 ^ (abstractC9035w3.mo21754a(j7) << Ascii.NAK);
                        if (iMo21754a3 < 0) {
                            i = (-2080896) ^ iMo21754a3;
                        } else {
                            long j8 = j3 + 5;
                            long jMo21754a = ((long) iMo21754a3) ^ (((long) abstractC9035w3.mo21754a(j6)) << 28);
                            if (jMo21754a >= 0) {
                                j = 266354560 ^ jMo21754a;
                                j6 = j8;
                            } else {
                                long j9 = 6 + j3;
                                long jMo21754a2 = (((long) abstractC9035w3.mo21754a(j8)) << 35) ^ jMo21754a;
                                if (jMo21754a2 < 0) {
                                    j2 = -34093383808L;
                                } else {
                                    long j10 = 7 + j3;
                                    long jMo21754a3 = jMo21754a2 ^ (((long) abstractC9035w3.mo21754a(j9)) << 42);
                                    if (jMo21754a3 >= 0) {
                                        j = 4363953127296L ^ jMo21754a3;
                                        j6 = j10;
                                    } else {
                                        j9 = 8 + j3;
                                        jMo21754a2 = jMo21754a3 ^ (((long) abstractC9035w3.mo21754a(j10)) << 49);
                                        if (jMo21754a2 < 0) {
                                            j2 = -558586000294016L;
                                        } else {
                                            long j11 = 9 + j3;
                                            long jMo21754a4 = (jMo21754a2 ^ (((long) abstractC9035w3.mo21754a(j9)) << 56)) ^ 71499008037633920L;
                                            if (jMo21754a4 < 0) {
                                                long j12 = j3 + 10;
                                                if (abstractC9035w3.mo21754a(j11) >= 0) {
                                                    j6 = j12;
                                                }
                                            } else {
                                                j6 = j11;
                                            }
                                            j = jMo21754a4;
                                        }
                                    }
                                }
                                j = j2 ^ jMo21754a2;
                                j6 = j9;
                            }
                        }
                    }
                    this.f21140h = j6;
                    return j;
                }
                i = iMo21754a ^ (-128);
                j = i;
                this.f21140h = j6;
                return j;
            }
        }
        for (int i2 = 0; i2 < 64; i2 += 7) {
            long j13 = this.f21140h;
            if (j13 == this.f21139g) {
                throw new C8984n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.f21140h = j13 + 1;
            byte bMo21754a2 = AbstractC9040x3.f21172c.mo21754a(j13);
            j4 |= ((long) (bMo21754a2 & 127)) << i2;
            if ((bMo21754a2 & 128) == 0) {
                return j4;
            }
        }
        throw new C8984n1("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: renamed from: z */
    public final void m21815z() {
        long j = this.f21139g + ((long) this.f21142j);
        this.f21139g = j;
        int i = (int) (j - this.f21141i);
        int i2 = this.f21144l;
        if (i <= i2) {
            this.f21142j = 0;
            return;
        }
        int i3 = i - i2;
        this.f21142j = i3;
        this.f21139g = j - ((long) i3);
    }
}
