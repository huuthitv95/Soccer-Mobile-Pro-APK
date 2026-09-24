package com.fyber.inneractive.sdk.protobuf;

import com.google.common.base.Ascii;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.c4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8921c4 extends AbstractC9050z3 {
    /* JADX INFO: renamed from: a */
    public static int m21527a(byte[] bArr, int i, long j, int i2) {
        if (i2 == 0) {
            AbstractC9050z3 abstractC9050z3 = AbstractC8927d4.f21001a;
            if (i > -12) {
                return -1;
            }
            return i;
        }
        if (i2 == 1) {
            return AbstractC8927d4.m21531a(i, AbstractC9040x3.f21172c.mo21761b(bArr, AbstractC9040x3.f21175f + j));
        }
        if (i2 != 2) {
            throw new AssertionError();
        }
        AbstractC9035w3 abstractC9035w3 = AbstractC9040x3.f21172c;
        long j2 = AbstractC9040x3.f21175f;
        return AbstractC8927d4.m21532a(i, abstractC9035w3.mo21761b(bArr, j2 + j), abstractC9035w3.mo21761b(bArr, j + 1 + j2));
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9050z3
    /* JADX INFO: renamed from: a */
    public final int mo21506a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        long j;
        long j2;
        long j3;
        long j4;
        int i3;
        char cCharAt;
        long j5 = i;
        long j6 = ((long) i2) + j5;
        int length = charSequence.length();
        if (length > i2 || bArr.length - i2 < i) {
            throw new ArrayIndexOutOfBoundsException("Failed writing " + charSequence.charAt(length - 1) + " at index " + (i + i2));
        }
        int i4 = 0;
        while (true) {
            j = 1;
            if (i4 >= length || (cCharAt = charSequence.charAt(i4)) >= 128) {
                break;
            }
            AbstractC9040x3.f21172c.mo21756a((Object) bArr, AbstractC9040x3.f21175f + j5, (byte) cCharAt);
            i4++;
            j5 = 1 + j5;
        }
        if (i4 == length) {
            return (int) j5;
        }
        while (i4 < length) {
            char cCharAt2 = charSequence.charAt(i4);
            if (cCharAt2 >= 128 || j5 >= j6) {
                j2 = j;
                if (cCharAt2 >= 2048 || j5 > j6 - 2) {
                    j3 = j6;
                    if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || j5 > j3 - 3) {
                        if (j5 > j3 - 4) {
                            if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i3 = i4 + 1) == length || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i3)))) {
                                throw new C8915b4(i4, length);
                            }
                            throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + j5);
                        }
                        int i5 = i4 + 1;
                        if (i5 != length) {
                            char cCharAt3 = charSequence.charAt(i5);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                AbstractC9035w3 abstractC9035w3 = AbstractC9040x3.f21172c;
                                long j7 = AbstractC9040x3.f21175f;
                                abstractC9035w3.mo21756a((Object) bArr, j7 + j5, (byte) ((codePoint >>> 18) | 240));
                                abstractC9035w3.mo21756a((Object) bArr, j7 + j5 + j2, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j8 = j5 + 3;
                                abstractC9035w3.mo21756a((Object) bArr, j7 + j5 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                j5 += 4;
                                abstractC9035w3.mo21756a((Object) bArr, j7 + j8, (byte) ((codePoint & 63) | 128));
                                i4 = i5;
                            } else {
                                i4 = i5;
                            }
                        }
                        throw new C8915b4(i4 - 1, length);
                    }
                    AbstractC9035w3 abstractC9035w4 = AbstractC9040x3.f21172c;
                    long j9 = AbstractC9040x3.f21175f;
                    abstractC9035w4.mo21756a((Object) bArr, j9 + j5, (byte) ((cCharAt2 >>> '\f') | 480));
                    abstractC9035w4.mo21756a((Object) bArr, j9 + j5 + j2, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                    abstractC9035w4.mo21756a((Object) bArr, j9 + j5 + 2, (byte) ((cCharAt2 & '?') | 128));
                    j4 = j5 + 3;
                } else {
                    long j10 = j5 + j2;
                    AbstractC9035w3 abstractC9035w5 = AbstractC9040x3.f21172c;
                    long j11 = AbstractC9040x3.f21175f;
                    j3 = j6;
                    abstractC9035w5.mo21756a((Object) bArr, j11 + j5, (byte) ((cCharAt2 >>> 6) | 960));
                    j5 += 2;
                    abstractC9035w5.mo21756a((Object) bArr, j11 + j10, (byte) ((cCharAt2 & '?') | 128));
                }
                i4++;
                j = j2;
                j6 = j3;
            } else {
                j4 = j5 + j;
                j2 = j;
                AbstractC9040x3.f21172c.mo21756a((Object) bArr, AbstractC9040x3.f21175f + j5, (byte) cCharAt2);
                j3 = j6;
            }
            j5 = j4;
            i4++;
            j = j2;
            j6 = j3;
        }
        return (int) j5;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9050z3
    /* JADX INFO: renamed from: a */
    public final String mo21507a(byte[] bArr, int i, int i2) throws C8984n1 {
        if ((i | i2 | ((bArr.length - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        int i3 = i + i2;
        char[] cArr = new char[i2];
        int i4 = 0;
        while (i < i3) {
            byte bMo21761b = AbstractC9040x3.f21172c.mo21761b(bArr, AbstractC9040x3.f21175f + ((long) i));
            if (!AbstractC9045y3.m21846a(bMo21761b)) {
                break;
            }
            i++;
            cArr[i4] = (char) bMo21761b;
            i4++;
        }
        int i5 = i4;
        while (i < i3) {
            int i6 = i + 1;
            AbstractC9035w3 abstractC9035w3 = AbstractC9040x3.f21172c;
            long j = AbstractC9040x3.f21175f;
            byte bMo21761b2 = abstractC9035w3.mo21761b(bArr, ((long) i) + j);
            if (AbstractC9045y3.m21846a(bMo21761b2)) {
                cArr[i5] = (char) bMo21761b2;
                i5++;
                i = i6;
                while (i < i3) {
                    byte bMo21761b3 = AbstractC9040x3.f21172c.mo21761b(bArr, AbstractC9040x3.f21175f + ((long) i));
                    if (!AbstractC9045y3.m21846a(bMo21761b3)) {
                        break;
                    }
                    i++;
                    cArr[i5] = (char) bMo21761b3;
                    i5++;
                }
            } else if (bMo21761b2 < -32) {
                if (i6 >= i3) {
                    throw new C8984n1("Protocol message had invalid UTF-8.");
                }
                i += 2;
                AbstractC9045y3.m21845a(bMo21761b2, abstractC9035w3.mo21761b(bArr, j + ((long) i6)), cArr, i5);
                i5++;
            } else if (bMo21761b2 < -16) {
                if (i6 >= i3 - 1) {
                    throw new C8984n1("Protocol message had invalid UTF-8.");
                }
                int i7 = i + 2;
                i += 3;
                AbstractC9045y3.m21844a(bMo21761b2, abstractC9035w3.mo21761b(bArr, ((long) i6) + j), abstractC9035w3.mo21761b(bArr, j + ((long) i7)), cArr, i5);
                i5++;
            } else {
                if (i6 >= i3 - 2) {
                    throw new C8984n1("Protocol message had invalid UTF-8.");
                }
                byte bMo21761b4 = abstractC9035w3.mo21761b(bArr, ((long) i6) + j);
                int i8 = i + 3;
                byte bMo21761b5 = abstractC9035w3.mo21761b(bArr, ((long) (i + 2)) + j);
                i += 4;
                AbstractC9045y3.m21843a(bMo21761b2, bMo21761b4, bMo21761b5, abstractC9035w3.mo21761b(bArr, j + ((long) i8)), cArr, i5);
                i5 += 2;
            }
        }
        return new String(cArr, 0, i5);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9050z3
    /* JADX INFO: renamed from: b */
    public final String mo21508b(ByteBuffer byteBuffer, int i, int i2) throws C8984n1 {
        long j;
        if ((i | i2 | ((byteBuffer.limit() - i) - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        long j2 = AbstractC9040x3.f21172c.f21158a.getLong(byteBuffer, AbstractC9040x3.f21176g) + ((long) i);
        long j3 = ((long) i2) + j2;
        char[] cArr = new char[i2];
        int i3 = 0;
        while (true) {
            j = 1;
            if (j2 >= j3) {
                break;
            }
            byte bMo21754a = AbstractC9040x3.f21172c.mo21754a(j2);
            if (!AbstractC9045y3.m21846a(bMo21754a)) {
                break;
            }
            j2++;
            cArr[i3] = (char) bMo21754a;
            i3++;
        }
        int i4 = i3;
        while (j2 < j3) {
            long j4 = j2 + j;
            AbstractC9035w3 abstractC9035w3 = AbstractC9040x3.f21172c;
            byte bMo21754a2 = abstractC9035w3.mo21754a(j2);
            if (AbstractC9045y3.m21846a(bMo21754a2)) {
                cArr[i4] = (char) bMo21754a2;
                j2 = j4;
                i4++;
                while (j2 < j3) {
                    byte bMo21754a3 = AbstractC9040x3.f21172c.mo21754a(j2);
                    if (!AbstractC9045y3.m21846a(bMo21754a3)) {
                        break;
                    }
                    j2 += j;
                    cArr[i4] = (char) bMo21754a3;
                    i4++;
                }
            } else if (bMo21754a2 < -32) {
                if (j4 >= j3) {
                    throw new C8984n1("Protocol message had invalid UTF-8.");
                }
                j2 += 2;
                AbstractC9045y3.m21845a(bMo21754a2, abstractC9035w3.mo21754a(j4), cArr, i4);
                i4++;
            } else if (bMo21754a2 < -16) {
                if (j4 >= j3 - j) {
                    throw new C8984n1("Protocol message had invalid UTF-8.");
                }
                long j5 = j2 + 2;
                j2 += 3;
                AbstractC9045y3.m21844a(bMo21754a2, abstractC9035w3.mo21754a(j4), abstractC9035w3.mo21754a(j5), cArr, i4);
                i4++;
            } else {
                if (j4 >= j3 - 2) {
                    throw new C8984n1("Protocol message had invalid UTF-8.");
                }
                byte bMo21754a4 = abstractC9035w3.mo21754a(j4);
                long j6 = j2 + 3;
                byte bMo21754a5 = abstractC9035w3.mo21754a(j2 + 2);
                j2 += 4;
                AbstractC9045y3.m21843a(bMo21754a2, bMo21754a4, bMo21754a5, abstractC9035w3.mo21754a(j6), cArr, i4);
                i4 += 2;
                j = 1;
            }
        }
        return new String(cArr, 0, i4);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9050z3
    /* JADX INFO: renamed from: c */
    public final int mo21509c(byte[] bArr, int i, int i2) {
        int i3;
        long j;
        if ((i | i2 | (bArr.length - i2)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
        }
        long j2 = i;
        int i4 = (int) (((long) i2) - j2);
        long j3 = 1;
        if (i4 >= 16) {
            i3 = 0;
            long j4 = j2;
            while (true) {
                if (i3 >= i4) {
                    i3 = i4;
                    break;
                }
                long j5 = j4 + 1;
                if (AbstractC9040x3.f21172c.mo21761b(bArr, j4 + AbstractC9040x3.f21175f) < 0) {
                    break;
                }
                i3++;
                j4 = j5;
            }
        } else {
            i3 = 0;
        }
        int i5 = i4 - i3;
        long j6 = j2 + ((long) i3);
        while (true) {
            byte b = 0;
            while (i5 > 0) {
                long j7 = j6 + j3;
                byte bMo21761b = AbstractC9040x3.f21172c.mo21761b(bArr, AbstractC9040x3.f21175f + j6);
                if (bMo21761b < 0) {
                    b = bMo21761b;
                    j6 = j7;
                    break;
                }
                i5--;
                b = bMo21761b;
                j6 = j7;
            }
            if (i5 == 0) {
                return 0;
            }
            int i6 = i5 - 1;
            if (b >= -32) {
                if (b >= -16) {
                    j = j3;
                    if (i6 < 3) {
                        return m21527a(bArr, b, j6, i6);
                    }
                    i5 -= 4;
                    long j8 = j6 + j;
                    AbstractC9035w3 abstractC9035w3 = AbstractC9040x3.f21172c;
                    long j9 = AbstractC9040x3.f21175f;
                    byte bMo21761b2 = abstractC9035w3.mo21761b(bArr, j9 + j6);
                    if (bMo21761b2 > -65 || (((bMo21761b2 + 112) + (b << Ascii.f22493FS)) >> 30) != 0) {
                        return -1;
                    }
                    long j10 = j6 + 2;
                    if (abstractC9035w3.mo21761b(bArr, j9 + j8) > -65) {
                        return -1;
                    }
                    j6 += 3;
                    if (abstractC9035w3.mo21761b(bArr, j9 + j10) > -65) {
                        return -1;
                    }
                } else {
                    if (i6 < 2) {
                        return m21527a(bArr, b, j6, i6);
                    }
                    i5 -= 3;
                    long j11 = j6 + j3;
                    AbstractC9035w3 abstractC9035w4 = AbstractC9040x3.f21172c;
                    long j12 = AbstractC9040x3.f21175f;
                    j = j3;
                    byte bMo21761b3 = abstractC9035w4.mo21761b(bArr, j12 + j6);
                    if (bMo21761b3 > -65) {
                        return -1;
                    }
                    if (b == -32 && bMo21761b3 < -96) {
                        return -1;
                    }
                    if (b == -19 && bMo21761b3 >= -96) {
                        return -1;
                    }
                    j6 += 2;
                    if (abstractC9035w4.mo21761b(bArr, j12 + j11) > -65) {
                        return -1;
                    }
                }
                j3 = j;
            } else {
                if (i6 == 0) {
                    return b;
                }
                i5 -= 2;
                if (b < -62) {
                    return -1;
                }
                long j13 = j6 + j3;
                if (AbstractC9040x3.f21172c.mo21761b(bArr, AbstractC9040x3.f21175f + j6) > -65) {
                    return -1;
                }
                j6 = j13;
            }
        }
    }
}
