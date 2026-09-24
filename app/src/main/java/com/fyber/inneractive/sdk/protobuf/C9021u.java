package com.fyber.inneractive.sdk.protobuf;

import com.google.common.base.Ascii;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.u */
/* JADX INFO: loaded from: classes4.dex */
public final class C9021u extends AbstractC9031w {

    /* JADX INFO: renamed from: e */
    public final InputStream f21122e;

    /* JADX INFO: renamed from: f */
    public final byte[] f21123f;

    /* JADX INFO: renamed from: g */
    public int f21124g;

    /* JADX INFO: renamed from: h */
    public int f21125h;

    /* JADX INFO: renamed from: i */
    public int f21126i;

    /* JADX INFO: renamed from: j */
    public int f21127j;

    /* JADX INFO: renamed from: k */
    public int f21128k;

    /* JADX INFO: renamed from: l */
    public int f21129l = Integer.MAX_VALUE;

    public C9021u(InputStream inputStream) {
        Charset charset = AbstractC8972l1.f21064a;
        if (inputStream == null) {
            throw new NullPointerException("input");
        }
        this.f21122e = inputStream;
        this.f21123f = new byte[4096];
        this.f21124g = 0;
        this.f21126i = 0;
        this.f21128k = 0;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: a */
    public final int mo21715a() {
        int i = this.f21129l;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - (this.f21128k + this.f21126i);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: a */
    public final void mo21716a(int i) throws C8984n1 {
        if (this.f21127j != i) {
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
        this.f21129l = iMo21722d;
        m21774z();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: b */
    public final int mo21719b() {
        return this.f21128k + this.f21126i;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: c */
    public final void mo21720c(int i) {
        this.f21129l = i;
        m21774z();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: c */
    public final boolean mo21721c() {
        return this.f21126i == this.f21124g && !m21770k(1);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: d */
    public final int mo21722d(int i) throws C8984n1 {
        if (i < 0) {
            throw new C8984n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = this.f21128k + this.f21126i + i;
        int i3 = this.f21129l;
        if (i2 > i3) {
            throw new C8984n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f21129l = i2;
        m21774z();
        return i3;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: d */
    public final boolean mo21723d() {
        return m21773y() != 0;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: e */
    public final C9000q mo21724e() throws IOException {
        int iMo21734m = mo21734m();
        int i = this.f21124g;
        int i2 = this.f21126i;
        if (iMo21734m <= i - i2 && iMo21734m > 0) {
            byte[] bArr = this.f21123f;
            C9000q c9000q = AbstractC9011s.f21106b;
            AbstractC9011s.m21712a(i2, i2 + iMo21734m, bArr.length);
            C9000q c9000q2 = new C9000q(AbstractC9011s.f21107c.mo21667a(bArr, i2, iMo21734m));
            this.f21126i += iMo21734m;
            return c9000q2;
        }
        if (iMo21734m == 0) {
            return AbstractC9011s.f21106b;
        }
        byte[] bArrM21766g = m21766g(iMo21734m);
        if (bArrM21766g != null) {
            int length = bArrM21766g.length;
            AbstractC9011s.m21712a(0, length, bArrM21766g.length);
            return new C9000q(AbstractC9011s.f21107c.mo21667a(bArrM21766g, 0, length));
        }
        int i3 = this.f21126i;
        int i4 = this.f21124g;
        int length2 = i4 - i3;
        this.f21128k += i4;
        this.f21126i = 0;
        this.f21124g = 0;
        ArrayList<byte[]> arrayListM21767h = m21767h(iMo21734m - length2);
        byte[] bArr2 = new byte[iMo21734m];
        System.arraycopy(this.f21123f, i3, bArr2, 0, length2);
        for (byte[] bArr3 : arrayListM21767h) {
            System.arraycopy(bArr3, 0, bArr2, length2, bArr3.length);
            length2 += bArr3.length;
        }
        C9000q c9000q3 = AbstractC9011s.f21106b;
        return new C9000q(bArr2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: e */
    public final boolean mo21725e(int i) throws C8984n1 {
        int iMo21741t;
        int i2 = i & 7;
        int i3 = 0;
        if (i2 == 0) {
            if (this.f21124g - this.f21126i >= 10) {
                while (i3 < 10) {
                    byte[] bArr = this.f21123f;
                    int i4 = this.f21126i;
                    this.f21126i = i4 + 1;
                    if (bArr[i4] < 0) {
                        i3++;
                    }
                }
                throw new C8984n1("CodedInputStream encountered a malformed varint.");
            }
            while (i3 < 10) {
                if (this.f21126i == this.f21124g) {
                    m21768i(1);
                }
                byte[] bArr2 = this.f21123f;
                int i5 = this.f21126i;
                this.f21126i = i5 + 1;
                if (bArr2[i5] < 0) {
                    i3++;
                }
            }
            throw new C8984n1("CodedInputStream encountered a malformed varint.");
            return true;
        }
        if (i2 == 1) {
            m21769j(8);
            return true;
        }
        if (i2 == 2) {
            m21769j(mo21734m());
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
            m21769j(4);
            return true;
        }
        int i6 = C8984n1.f21076a;
        throw new C8978m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: f */
    public final double mo21726f() {
        return Double.longBitsToDouble(m21772x());
    }

    /* JADX INFO: renamed from: f */
    public final byte[] m21765f(int i) throws IOException {
        byte[] bArrM21766g = m21766g(i);
        if (bArrM21766g != null) {
            return bArrM21766g;
        }
        int i2 = this.f21126i;
        int i3 = this.f21124g;
        int length = i3 - i2;
        this.f21128k += i3;
        this.f21126i = 0;
        this.f21124g = 0;
        ArrayList<byte[]> arrayListM21767h = m21767h(i - length);
        byte[] bArr = new byte[i];
        System.arraycopy(this.f21123f, i2, bArr, 0, length);
        for (byte[] bArr2 : arrayListM21767h) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: g */
    public final int mo21728g() {
        return mo21734m();
    }

    /* JADX INFO: renamed from: g */
    public final byte[] m21766g(int i) throws IOException {
        if (i == 0) {
            return AbstractC8972l1.f21065b;
        }
        if (i < 0) {
            throw new C8984n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i2 = this.f21128k;
        int i3 = this.f21126i;
        int i4 = i2 + i3 + i;
        if (i4 - this.f21147c > 0) {
            throw new C8984n1("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i5 = this.f21129l;
        if (i4 > i5) {
            m21769j((i5 - i2) - i3);
            throw new C8984n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i6 = this.f21124g - i3;
        int i7 = i - i6;
        if (i7 >= 4096 && i7 > this.f21122e.available()) {
            return null;
        }
        byte[] bArr = new byte[i];
        System.arraycopy(this.f21123f, this.f21126i, bArr, 0, i6);
        this.f21128k += this.f21124g;
        this.f21126i = 0;
        this.f21124g = 0;
        while (i6 < i) {
            int i8 = this.f21122e.read(bArr, i6, i - i6);
            if (i8 == -1) {
                throw new C8984n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.f21128k += i8;
            i6 += i8;
        }
        return bArr;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: h */
    public final int mo21729h() {
        return m21771w();
    }

    /* JADX INFO: renamed from: h */
    public final ArrayList m21767h(int i) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i > 0) {
            int iMin = Math.min(i, 4096);
            byte[] bArr = new byte[iMin];
            int i2 = 0;
            while (i2 < iMin) {
                int i3 = this.f21122e.read(bArr, i2, iMin - i2);
                if (i3 == -1) {
                    throw new C8984n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.f21128k += i3;
                i2 += i3;
            }
            i -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: i */
    public final long mo21730i() {
        return m21772x();
    }

    /* JADX INFO: renamed from: i */
    public final void m21768i(int i) throws C8984n1 {
        if (m21770k(i)) {
            return;
        }
        if (i <= (this.f21147c - this.f21128k) - this.f21126i) {
            throw new C8984n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new C8984n1("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: j */
    public final float mo21731j() {
        return Float.intBitsToFloat(m21771w());
    }

    /* JADX INFO: renamed from: j */
    public final void m21769j(int i) throws C8984n1 {
        int i2 = this.f21124g;
        int i3 = this.f21126i;
        int i4 = i2 - i3;
        if (i <= i4 && i >= 0) {
            this.f21126i = i3 + i;
            return;
        }
        if (i < 0) {
            throw new C8984n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i5 = this.f21128k;
        int i6 = i5 + i3;
        int i7 = i6 + i;
        int i8 = this.f21129l;
        if (i7 > i8) {
            m21769j((i8 - i5) - i3);
            throw new C8984n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f21128k = i6;
        this.f21124g = 0;
        this.f21126i = 0;
        while (i4 < i) {
            try {
                long j = i - i4;
                long jSkip = this.f21122e.skip(j);
                if (jSkip < 0 || jSkip > j) {
                    throw new IllegalStateException(this.f21122e.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                }
                if (jSkip == 0) {
                    break;
                } else {
                    i4 += (int) jSkip;
                }
            } catch (Throwable th) {
                this.f21128k += i4;
                m21774z();
                throw th;
            }
        }
        this.f21128k += i4;
        m21774z();
        if (i4 >= i) {
            return;
        }
        int i9 = this.f21124g;
        int i10 = i9 - this.f21126i;
        this.f21126i = i9;
        m21768i(1);
        while (true) {
            int i11 = i - i10;
            int i12 = this.f21124g;
            if (i11 <= i12) {
                this.f21126i = i11;
                return;
            } else {
                i10 += i12;
                this.f21126i = i12;
                m21768i(1);
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: k */
    public final int mo21732k() {
        return mo21734m();
    }

    /* JADX INFO: renamed from: k */
    public final boolean m21770k(int i) throws IOException {
        int i2 = this.f21126i;
        int i3 = i2 + i;
        int i4 = this.f21124g;
        if (i3 <= i4) {
            throw new IllegalStateException("refillBuffer() called when " + i + " bytes were already available in buffer");
        }
        int i5 = this.f21147c;
        int i6 = this.f21128k;
        if (i > (i5 - i6) - i2 || i6 + i2 + i > this.f21129l) {
            return false;
        }
        if (i2 > 0) {
            if (i4 > i2) {
                byte[] bArr = this.f21123f;
                System.arraycopy(bArr, i2, bArr, 0, i4 - i2);
            }
            this.f21128k += i2;
            this.f21124g -= i2;
            this.f21126i = 0;
        }
        InputStream inputStream = this.f21122e;
        byte[] bArr2 = this.f21123f;
        int i7 = this.f21124g;
        int i8 = inputStream.read(bArr2, i7, Math.min(bArr2.length - i7, (this.f21147c - this.f21128k) - i7));
        if (i8 == 0 || i8 < -1 || i8 > this.f21123f.length) {
            throw new IllegalStateException(this.f21122e.getClass() + "#read(byte[]) returned invalid result: " + i8 + "\nThe InputStream implementation is buggy.");
        }
        if (i8 <= 0) {
            return false;
        }
        this.f21124g += i8;
        m21774z();
        if (this.f21124g >= i) {
            return true;
        }
        return m21770k(i);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: l */
    public final long mo21733l() {
        return m21773y();
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00a0 A[PHI: r3
  0x00a0: PHI (r3v13 int) = (r3v12 int), (r3v15 int) binds: [B:25:0x0053, B:29:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: m */
    public final int mo21734m() throws C8984n1 {
        int i;
        int i2 = this.f21126i;
        int i3 = this.f21124g;
        if (i3 != i2) {
            byte[] bArr = this.f21123f;
            int i4 = i2 + 1;
            byte b = bArr[i2];
            if (b >= 0) {
                this.f21126i = i4;
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
                this.f21126i = i5;
                return i;
            }
        }
        long j = 0;
        for (int i14 = 0; i14 < 64; i14 += 7) {
            if (this.f21126i == this.f21124g) {
                m21768i(1);
            }
            byte[] bArr2 = this.f21123f;
            int i15 = this.f21126i;
            this.f21126i = i15 + 1;
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
        return m21771w();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: o */
    public final long mo21736o() {
        return m21772x();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: p */
    public final int mo21737p() {
        return AbstractC9031w.m21818b(mo21734m());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: q */
    public final long mo21738q() {
        return AbstractC9031w.m21817a(m21773y());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: r */
    public final String mo21739r() throws C8984n1 {
        int iMo21734m = mo21734m();
        if (iMo21734m > 0) {
            int i = this.f21124g;
            int i2 = this.f21126i;
            if (iMo21734m <= i - i2) {
                String str = new String(this.f21123f, i2, iMo21734m, AbstractC8972l1.f21064a);
                this.f21126i += iMo21734m;
                return str;
            }
        }
        if (iMo21734m == 0) {
            return "";
        }
        if (iMo21734m > this.f21124g) {
            return new String(m21765f(iMo21734m), AbstractC8972l1.f21064a);
        }
        m21768i(iMo21734m);
        String str2 = new String(this.f21123f, this.f21126i, iMo21734m, AbstractC8972l1.f21064a);
        this.f21126i += iMo21734m;
        return str2;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: s */
    public final String mo21740s() throws IOException {
        byte[] bArrM21765f;
        int iMo21734m = mo21734m();
        int i = this.f21126i;
        int i2 = this.f21124g;
        if (iMo21734m <= i2 - i && iMo21734m > 0) {
            bArrM21765f = this.f21123f;
            this.f21126i = i + iMo21734m;
        } else {
            if (iMo21734m == 0) {
                return "";
            }
            i = 0;
            if (iMo21734m <= i2) {
                m21768i(iMo21734m);
                bArrM21765f = this.f21123f;
                this.f21126i = iMo21734m;
            } else {
                bArrM21765f = m21765f(iMo21734m);
            }
        }
        return AbstractC8927d4.f21001a.mo21507a(bArrM21765f, i, iMo21734m);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9031w
    /* JADX INFO: renamed from: t */
    public final int mo21741t() throws C8984n1 {
        if (mo21721c()) {
            this.f21127j = 0;
            return 0;
        }
        int iMo21734m = mo21734m();
        this.f21127j = iMo21734m;
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
        return m21773y();
    }

    /* JADX INFO: renamed from: w */
    public final int m21771w() throws C8984n1 {
        int i = this.f21126i;
        if (this.f21124g - i < 4) {
            m21768i(4);
            i = this.f21126i;
        }
        byte[] bArr = this.f21123f;
        this.f21126i = i + 4;
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: x */
    public final long m21772x() throws C8984n1 {
        int i = this.f21126i;
        if (this.f21124g - i < 8) {
            m21768i(8);
            i = this.f21126i;
        }
        byte[] bArr = this.f21123f;
        this.f21126i = i + 8;
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* JADX INFO: renamed from: y */
    public final long m21773y() throws C8984n1 {
        long j;
        long j2;
        long j3;
        int i = this.f21126i;
        int i2 = this.f21124g;
        long j4 = 0;
        if (i2 != i) {
            byte[] bArr = this.f21123f;
            int i3 = i + 1;
            byte b = bArr[i];
            if (b >= 0) {
                this.f21126i = i3;
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
                this.f21126i = i4;
                return j;
            }
        }
        for (int i11 = 0; i11 < 64; i11 += 7) {
            if (this.f21126i == this.f21124g) {
                m21768i(1);
            }
            byte[] bArr2 = this.f21123f;
            int i12 = this.f21126i;
            this.f21126i = i12 + 1;
            byte b2 = bArr2[i12];
            j4 |= ((long) (b2 & 127)) << i11;
            if ((b2 & 128) == 0) {
                return j4;
            }
        }
        throw new C8984n1("CodedInputStream encountered a malformed varint.");
    }

    /* JADX INFO: renamed from: z */
    public final void m21774z() {
        int i = this.f21124g + this.f21125h;
        this.f21124g = i;
        int i2 = this.f21128k + i;
        int i3 = this.f21129l;
        if (i2 <= i3) {
            this.f21125h = 0;
            return;
        }
        int i4 = i2 - i3;
        this.f21125h = i4;
        this.f21124g = i - i4;
    }
}
