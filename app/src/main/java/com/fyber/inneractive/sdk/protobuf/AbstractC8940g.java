package com.fyber.inneractive.sdk.protobuf;

import com.google.common.base.Ascii;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.g */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8940g {
    /* JADX INFO: renamed from: a */
    public static int m21542a(int i, byte[] bArr) {
        return ((bArr[i + 3] & 255) << 24) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
    }

    /* JADX INFO: renamed from: a */
    public static int m21543a(int i, byte[] bArr, int i2, int i3, C8934f c8934f) {
        if ((i >>> 3) == 0) {
            throw new C8984n1("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            return m21557e(bArr, i2, c8934f);
        }
        if (i4 == 1) {
            return i2 + 8;
        }
        if (i4 == 2) {
            return m21556d(bArr, i2, c8934f) + c8934f.f21012a;
        }
        if (i4 != 3) {
            if (i4 == 5) {
                return i2 + 4;
            }
            throw new C8984n1("Protocol message contained an invalid tag (zero).");
        }
        int i5 = (i & (-8)) | 4;
        int i6 = 0;
        while (i2 < i3) {
            i2 = m21556d(bArr, i2, c8934f);
            i6 = c8934f.f21012a;
            if (i6 == i5) {
                break;
            }
            i2 = m21543a(i6, bArr, i2, i3, c8934f);
        }
        if (i2 > i3 || i6 != i5) {
            throw new C8984n1("Failed to parse the message.");
        }
        return i2;
    }

    /* JADX INFO: renamed from: a */
    public static int m21544a(int i, byte[] bArr, int i2, int i3, InterfaceC8966k1 interfaceC8966k1, C8934f c8934f) throws C8984n1 {
        int iM21556d = m21556d(bArr, i2, c8934f);
        int i4 = c8934f.f21012a;
        if (i4 < 0) {
            throw new C8984n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i4 == 0) {
            interfaceC8966k1.add("");
        } else {
            interfaceC8966k1.add(new String(bArr, iM21556d, i4, AbstractC8972l1.f21064a));
            iM21556d += i4;
        }
        while (iM21556d < i3) {
            int iM21546a = iM21556d + 1;
            byte b = bArr[iM21556d];
            if (b >= 0) {
                c8934f.f21012a = b;
            } else {
                iM21546a = m21546a(b, bArr, iM21546a, c8934f);
            }
            if (i != c8934f.f21012a) {
                break;
            }
            iM21556d = iM21546a + 1;
            byte b2 = bArr[iM21546a];
            if (b2 >= 0) {
                c8934f.f21012a = b2;
            } else {
                iM21556d = m21546a(b2, bArr, iM21556d, c8934f);
            }
            int i5 = c8934f.f21012a;
            if (i5 < 0) {
                throw new C8984n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i5 == 0) {
                interfaceC8966k1.add("");
            } else {
                interfaceC8966k1.add(new String(bArr, iM21556d, i5, AbstractC8972l1.f21064a));
                iM21556d += i5;
            }
        }
        return iM21556d;
    }

    /* JADX INFO: renamed from: a */
    public static int m21545a(int i, byte[] bArr, int i2, int i3, C8986n3 c8986n3, C8934f c8934f) {
        if ((i >>> 3) == 0) {
            throw new C8984n1("Protocol message contained an invalid tag (zero).");
        }
        int i4 = i & 7;
        if (i4 == 0) {
            int iM21557e = m21557e(bArr, i2, c8934f);
            c8986n3.m21688a(i, Long.valueOf(c8934f.f21013b));
            return iM21557e;
        }
        if (i4 == 1) {
            c8986n3.m21688a(i, Long.valueOf(m21553b(i2, bArr)));
            return i2 + 8;
        }
        if (i4 == 2) {
            int iM21556d = m21556d(bArr, i2, c8934f);
            int i5 = c8934f.f21012a;
            if (i5 < 0) {
                throw new C8984n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i5 > bArr.length - iM21556d) {
                throw new C8984n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (i5 == 0) {
                c8986n3.m21688a(i, AbstractC9011s.f21106b);
            } else {
                AbstractC9011s.m21712a(iM21556d, iM21556d + i5, bArr.length);
                c8986n3.m21688a(i, new C9000q(AbstractC9011s.f21107c.mo21667a(bArr, iM21556d, i5)));
            }
            return iM21556d + i5;
        }
        if (i4 != 3) {
            if (i4 != 5) {
                throw new C8984n1("Protocol message contained an invalid tag (zero).");
            }
            c8986n3.m21688a(i, Integer.valueOf(m21542a(i2, bArr)));
            return i2 + 4;
        }
        C8986n3 c8986n4 = new C8986n3();
        int i6 = (i & (-8)) | 4;
        int i7 = 0;
        while (i2 < i3) {
            int iM21556d2 = m21556d(bArr, i2, c8934f);
            int i8 = c8934f.f21012a;
            if (i8 == i6) {
                i7 = i8;
                i2 = iM21556d2;
                break;
            }
            i2 = m21545a(i8, bArr, iM21556d2, i3, c8986n4, c8934f);
            i7 = i8;
        }
        if (i2 > i3 || i7 != i6) {
            throw new C8984n1("Failed to parse the message.");
        }
        c8986n3.m21688a(i, c8986n4);
        return i2;
    }

    /* JADX INFO: renamed from: a */
    public static int m21546a(int i, byte[] bArr, int i2, C8934f c8934f) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b = bArr[i2];
        if (b >= 0) {
            c8934f.f21012a = i3 | (b << 7);
            return i4;
        }
        int i5 = i3 | ((b & 127) << 7);
        int i6 = i2 + 2;
        byte b2 = bArr[i4];
        if (b2 >= 0) {
            c8934f.f21012a = i5 | (b2 << Ascii.f22500SO);
            return i6;
        }
        int i7 = i5 | ((b2 & 127) << 14);
        int i8 = i2 + 3;
        byte b3 = bArr[i6];
        if (b3 >= 0) {
            c8934f.f21012a = i7 | (b3 << Ascii.NAK);
            return i8;
        }
        int i9 = i7 | ((b3 & 127) << 21);
        int i10 = i2 + 4;
        byte b4 = bArr[i8];
        if (b4 >= 0) {
            c8934f.f21012a = i9 | (b4 << Ascii.f22493FS);
            return i10;
        }
        int i11 = i9 | ((b4 & 127) << 28);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] >= 0) {
                c8934f.f21012a = i11;
                return i12;
            }
            i10 = i12;
        }
    }

    /* JADX INFO: renamed from: a */
    public static int m21547a(InterfaceC9019t2 interfaceC9019t2, byte[] bArr, int i, int i2, int i3, C8934f c8934f) {
        C8955i2 c8955i2 = (C8955i2) interfaceC9019t2;
        Object objMo21629a = c8955i2.mo21629a();
        int iM21628a = c8955i2.m21628a(objMo21629a, bArr, i, i2, i3, c8934f);
        c8955i2.mo21652c(objMo21629a);
        c8934f.f21014c = objMo21629a;
        return iM21628a;
    }

    /* JADX INFO: renamed from: a */
    public static int m21548a(InterfaceC9019t2 interfaceC9019t2, byte[] bArr, int i, int i2, C8934f c8934f) {
        int iM21546a = i + 1;
        int i3 = bArr[i];
        if (i3 < 0) {
            iM21546a = m21546a(i3, bArr, iM21546a, c8934f);
            i3 = c8934f.f21012a;
        }
        int i4 = iM21546a;
        if (i3 < 0 || i3 > i2 - i4) {
            throw new C8984n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        Object objMo21629a = interfaceC9019t2.mo21629a();
        int i5 = i4 + i3;
        interfaceC9019t2.mo21638a(objMo21629a, bArr, i4, i5, c8934f);
        interfaceC9019t2.mo21652c(objMo21629a);
        c8934f.f21014c = objMo21629a;
        return i5;
    }

    /* JADX INFO: renamed from: a */
    public static int m21549a(byte[] bArr, int i, C8934f c8934f) {
        int iM21556d = m21556d(bArr, i, c8934f);
        int i2 = c8934f.f21012a;
        if (i2 < 0) {
            throw new C8984n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 > bArr.length - iM21556d) {
            throw new C8984n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        if (i2 == 0) {
            c8934f.f21014c = AbstractC9011s.f21106b;
            return iM21556d;
        }
        int i3 = iM21556d + i2;
        AbstractC9011s.m21712a(iM21556d, i3, bArr.length);
        c8934f.f21014c = new C9000q(AbstractC9011s.f21107c.mo21667a(bArr, iM21556d, i2));
        return i3;
    }

    /* JADX INFO: renamed from: a */
    public static int m21550a(byte[] bArr, int i, InterfaceC8966k1 interfaceC8966k1, C8934f c8934f) {
        C8906a1 c8906a1 = (C8906a1) interfaceC8966k1;
        int iM21556d = m21556d(bArr, i, c8934f);
        int i2 = c8934f.f21012a + iM21556d;
        while (iM21556d < i2) {
            int i3 = iM21556d + 1;
            byte b = bArr[iM21556d];
            if (b >= 0) {
                c8934f.f21012a = b;
                iM21556d = i3;
            } else {
                iM21556d = m21546a(b, bArr, i3, c8934f);
            }
            c8906a1.m21503c(c8934f.f21012a);
        }
        if (iM21556d == i2) {
            return iM21556d;
        }
        throw new C8984n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    /* JADX INFO: renamed from: b */
    public static int m21551b(int i, byte[] bArr, int i2, int i3, InterfaceC8966k1 interfaceC8966k1, C8934f c8934f) throws C8984n1 {
        int iM21556d = m21556d(bArr, i2, c8934f);
        int i4 = c8934f.f21012a;
        if (i4 < 0) {
            throw new C8984n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i4 == 0) {
            interfaceC8966k1.add("");
        } else {
            int i5 = iM21556d + i4;
            if (!AbstractC8927d4.f21001a.m21852b(bArr, iM21556d, i5)) {
                throw new C8984n1("Protocol message had invalid UTF-8.");
            }
            interfaceC8966k1.add(new String(bArr, iM21556d, i4, AbstractC8972l1.f21064a));
            iM21556d = i5;
        }
        while (iM21556d < i3) {
            int iM21546a = iM21556d + 1;
            byte b = bArr[iM21556d];
            if (b >= 0) {
                c8934f.f21012a = b;
            } else {
                iM21546a = m21546a(b, bArr, iM21546a, c8934f);
            }
            if (i != c8934f.f21012a) {
                break;
            }
            iM21556d = iM21546a + 1;
            byte b2 = bArr[iM21546a];
            if (b2 >= 0) {
                c8934f.f21012a = b2;
            } else {
                iM21556d = m21546a(b2, bArr, iM21556d, c8934f);
            }
            int i6 = c8934f.f21012a;
            if (i6 < 0) {
                throw new C8984n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
            if (i6 == 0) {
                interfaceC8966k1.add("");
            } else {
                int i7 = iM21556d + i6;
                if (!AbstractC8927d4.f21001a.m21852b(bArr, iM21556d, i7)) {
                    throw new C8984n1("Protocol message had invalid UTF-8.");
                }
                interfaceC8966k1.add(new String(bArr, iM21556d, i6, AbstractC8972l1.f21064a));
                iM21556d = i7;
            }
        }
        return iM21556d;
    }

    /* JADX INFO: renamed from: b */
    public static int m21552b(byte[] bArr, int i, C8934f c8934f) {
        int iM21556d = m21556d(bArr, i, c8934f);
        int i2 = c8934f.f21012a;
        if (i2 < 0) {
            throw new C8984n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 == 0) {
            c8934f.f21014c = "";
            return iM21556d;
        }
        c8934f.f21014c = new String(bArr, iM21556d, i2, AbstractC8972l1.f21064a);
        return iM21556d + i2;
    }

    /* JADX INFO: renamed from: b */
    public static long m21553b(int i, byte[] bArr) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }

    /* JADX INFO: renamed from: c */
    public static int m21554c(int i, byte[] bArr, int i2, int i3, InterfaceC8966k1 interfaceC8966k1, C8934f c8934f) {
        C8906a1 c8906a1 = (C8906a1) interfaceC8966k1;
        int iM21556d = m21556d(bArr, i2, c8934f);
        c8906a1.m21503c(c8934f.f21012a);
        while (iM21556d < i3) {
            int iM21546a = iM21556d + 1;
            byte b = bArr[iM21556d];
            if (b >= 0) {
                c8934f.f21012a = b;
            } else {
                iM21546a = m21546a(b, bArr, iM21546a, c8934f);
            }
            if (i != c8934f.f21012a) {
                break;
            }
            iM21556d = iM21546a + 1;
            byte b2 = bArr[iM21546a];
            if (b2 >= 0) {
                c8934f.f21012a = b2;
            } else {
                iM21556d = m21546a(b2, bArr, iM21556d, c8934f);
            }
            c8906a1.m21503c(c8934f.f21012a);
        }
        return iM21556d;
    }

    /* JADX INFO: renamed from: c */
    public static int m21555c(byte[] bArr, int i, C8934f c8934f) throws C8984n1 {
        int iM21556d = m21556d(bArr, i, c8934f);
        int i2 = c8934f.f21012a;
        if (i2 < 0) {
            throw new C8984n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        if (i2 == 0) {
            c8934f.f21014c = "";
            return iM21556d;
        }
        c8934f.f21014c = AbstractC8927d4.f21001a.mo21507a(bArr, iM21556d, i2);
        return iM21556d + i2;
    }

    /* JADX INFO: renamed from: d */
    public static int m21556d(byte[] bArr, int i, C8934f c8934f) {
        int i2 = i + 1;
        byte b = bArr[i];
        if (b < 0) {
            return m21546a(b, bArr, i2, c8934f);
        }
        c8934f.f21012a = b;
        return i2;
    }

    /* JADX INFO: renamed from: e */
    public static int m21557e(byte[] bArr, int i, C8934f c8934f) {
        int i2 = i + 1;
        long j = bArr[i];
        if (j >= 0) {
            c8934f.f21013b = j;
            return i2;
        }
        int i3 = i + 2;
        byte b = bArr[i2];
        long j2 = (j & 127) | (((long) (b & 127)) << 7);
        int i4 = 7;
        while (b < 0) {
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b2 & 127)) << i4;
            b = b2;
            i3 = i5;
        }
        c8934f.f21013b = j2;
        return i3;
    }
}
