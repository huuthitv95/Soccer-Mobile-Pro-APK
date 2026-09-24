package com.fyber.inneractive.sdk.protobuf;

import com.google.common.base.Ascii;
import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.a4 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8909a4 extends AbstractC9050z3 {
    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9050z3
    /* JADX INFO: renamed from: a */
    public final int mo21506a(CharSequence charSequence, byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        char cCharAt;
        int length = charSequence.length();
        int i5 = i2 + i;
        int i6 = 0;
        while (i6 < length && (i4 = i6 + i) < i5 && (cCharAt = charSequence.charAt(i6)) < 128) {
            bArr[i4] = (byte) cCharAt;
            i6++;
        }
        if (i6 == length) {
            return i + length;
        }
        int i7 = i + i6;
        while (i6 < length) {
            char cCharAt2 = charSequence.charAt(i6);
            if (cCharAt2 < 128 && i7 < i5) {
                bArr[i7] = (byte) cCharAt2;
                i7++;
            } else if (cCharAt2 < 2048 && i7 <= i5 - 2) {
                int i8 = i7 + 1;
                bArr[i7] = (byte) ((cCharAt2 >>> 6) | 960);
                i7 += 2;
                bArr[i8] = (byte) ((cCharAt2 & '?') | 128);
            } else {
                if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i7 > i5 - 3) {
                    if (i7 > i5 - 4) {
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i3 = i6 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i3)))) {
                            throw new C8915b4(i6, length);
                        }
                        throw new ArrayIndexOutOfBoundsException("Failed writing " + cCharAt2 + " at index " + i7);
                    }
                    int i9 = i6 + 1;
                    if (i9 != charSequence.length()) {
                        char cCharAt3 = charSequence.charAt(i9);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i7] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i7 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i10 = i7 + 3;
                            bArr[i7 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i7 += 4;
                            bArr[i10] = (byte) ((codePoint & 63) | 128);
                            i6 = i9;
                        } else {
                            i6 = i9;
                        }
                    }
                    throw new C8915b4(i6 - 1, length);
                }
                bArr[i7] = (byte) ((cCharAt2 >>> '\f') | 480);
                int i11 = i7 + 2;
                bArr[i7 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                i7 += 3;
                bArr[i11] = (byte) ((cCharAt2 & '?') | 128);
            }
            i6++;
        }
        return i7;
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
            byte b = bArr[i];
            if (!AbstractC9045y3.m21846a(b)) {
                break;
            }
            i++;
            cArr[i4] = (char) b;
            i4++;
        }
        int i5 = i4;
        while (i < i3) {
            int i6 = i + 1;
            byte b2 = bArr[i];
            if (AbstractC9045y3.m21846a(b2)) {
                cArr[i5] = (char) b2;
                i5++;
                i = i6;
                while (i < i3) {
                    byte b3 = bArr[i];
                    if (!AbstractC9045y3.m21846a(b3)) {
                        break;
                    }
                    i++;
                    cArr[i5] = (char) b3;
                    i5++;
                }
            } else if (b2 < -32) {
                if (i6 >= i3) {
                    throw new C8984n1("Protocol message had invalid UTF-8.");
                }
                i += 2;
                AbstractC9045y3.m21845a(b2, bArr[i6], cArr, i5);
                i5++;
            } else if (b2 < -16) {
                if (i6 >= i3 - 1) {
                    throw new C8984n1("Protocol message had invalid UTF-8.");
                }
                int i7 = i + 2;
                i += 3;
                AbstractC9045y3.m21844a(b2, bArr[i6], bArr[i7], cArr, i5);
                i5++;
            } else {
                if (i6 >= i3 - 2) {
                    throw new C8984n1("Protocol message had invalid UTF-8.");
                }
                byte b4 = bArr[i6];
                int i8 = i + 3;
                byte b5 = bArr[i + 2];
                i += 4;
                AbstractC9045y3.m21843a(b2, b4, b5, bArr[i8], cArr, i5);
                i5 += 2;
            }
        }
        return new String(cArr, 0, i5);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9050z3
    /* JADX INFO: renamed from: b */
    public final String mo21508b(ByteBuffer byteBuffer, int i, int i2) {
        return AbstractC9050z3.m21851a(byteBuffer, i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0097 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:63:0x0098 A[RETURN] */
    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9050z3
    /* JADX INFO: renamed from: c */
    public final int mo21509c(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] >= 0) {
            i++;
        }
        if (i >= i2) {
            return 0;
        }
        while (i < i2) {
            int i3 = i + 1;
            byte b = bArr[i];
            if (b < 0) {
                if (b < -32) {
                    if (i3 >= i2) {
                        return b;
                    }
                    if (b >= -62) {
                        i += 2;
                        if (bArr[i3] > -65) {
                        }
                    }
                    return -1;
                }
                if (b < -16) {
                    if (i3 >= i2 - 1) {
                        int i4 = i2 - i3;
                        if (i4 == 0) {
                            if (b > -12) {
                                return -1;
                            }
                            return b;
                        }
                        if (i4 == 1) {
                            return AbstractC8927d4.m21531a(b, bArr[i3]);
                        }
                        if (i4 == 2) {
                            return AbstractC8927d4.m21532a(b, bArr[i3], bArr[i + 2]);
                        }
                        throw new AssertionError();
                    }
                    int i5 = i + 2;
                    byte b2 = bArr[i3];
                    if (b2 <= -65 && ((b != -32 || b2 >= -96) && (b != -19 || b2 < -96))) {
                        i += 3;
                        if (bArr[i5] > -65) {
                        }
                    }
                    return -1;
                }
                if (i3 >= i2 - 2) {
                    int i6 = i2 - i3;
                    if (i6 == 0) {
                        if (b > -12) {
                            return -1;
                        }
                        return b;
                    }
                    if (i6 == 1) {
                        return AbstractC8927d4.m21531a(b, bArr[i3]);
                    }
                    if (i6 == 2) {
                        return AbstractC8927d4.m21532a(b, bArr[i3], bArr[i + 2]);
                    }
                    throw new AssertionError();
                }
                int i7 = i + 2;
                byte b3 = bArr[i3];
                if (b3 <= -65) {
                    if ((((b3 + 112) + (b << Ascii.f22493FS)) >> 30) == 0) {
                        int i8 = i + 3;
                        if (bArr[i7] <= -65) {
                            i += 4;
                            if (bArr[i8] > -65) {
                            }
                        }
                    }
                }
                return -1;
            }
            i = i3;
        }
        return 0;
    }
}
