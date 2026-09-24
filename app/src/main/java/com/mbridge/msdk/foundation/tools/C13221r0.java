package com.mbridge.msdk.foundation.tools;

import com.ironsource.C11341A5;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.r0 */
/* JADX INFO: compiled from: SameMVEncoder.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13221r0 {

    /* JADX INFO: renamed from: a */
    private static final char[] f36367a = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', AbstractJsonLexerKt.UNICODE_ESC, 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '/'};

    /* JADX INFO: renamed from: b */
    private static final byte[] f36368b = new byte[128];

    /* JADX INFO: renamed from: c */
    private static Map<Character, Character> f36369c;

    /* JADX INFO: renamed from: d */
    private static char[] f36370d;

    static {
        HashMap map = new HashMap();
        f36369c = map;
        map.put('A', 'v');
        f36369c.put('B', 'S');
        f36369c.put('C', 'o');
        f36369c.put('D', 'a');
        f36369c.put('E', 'j');
        f36369c.put('F', 'c');
        f36369c.put('G', '7');
        f36369c.put('H', 'd');
        f36369c.put('I', 'R');
        f36369c.put('J', 'z');
        f36369c.put('K', 'p');
        f36369c.put('L', 'W');
        f36369c.put('M', 'i');
        f36369c.put('N', 'f');
        f36369c.put('O', 'G');
        f36369c.put('P', 'y');
        f36369c.put('Q', 'N');
        f36369c.put('R', 'x');
        f36369c.put('S', 'Z');
        f36369c.put('T', 'n');
        f36369c.put('U', 'V');
        f36369c.put('V', '5');
        f36369c.put('W', 'k');
        f36369c.put('X', '+');
        f36369c.put('Y', 'D');
        f36369c.put('Z', 'H');
        f36369c.put('a', 'L');
        f36369c.put('b', 'Y');
        f36369c.put('c', 'h');
        f36369c.put('d', 'J');
        f36369c.put('e', '4');
        f36369c.put('f', '6');
        f36369c.put('g', 'l');
        f36369c.put('h', 't');
        f36369c.put('i', '0');
        f36369c.put('j', 'U');
        f36369c.put('k', '3');
        f36369c.put('l', 'Q');
        f36369c.put('m', 'r');
        f36369c.put('n', 'g');
        f36369c.put('o', 'E');
        f36369c.put('p', Character.valueOf(AbstractJsonLexerKt.UNICODE_ESC));
        f36369c.put('q', 'q');
        f36369c.put('r', '8');
        f36369c.put('s', 's');
        f36369c.put('t', 'w');
        f36369c.put(Character.valueOf(AbstractJsonLexerKt.UNICODE_ESC), '/');
        f36369c.put('v', 'X');
        f36369c.put('w', 'M');
        f36369c.put('x', 'e');
        f36369c.put('y', 'B');
        f36369c.put('z', 'A');
        f36369c.put('0', 'T');
        f36369c.put('1', '2');
        f36369c.put('2', 'F');
        f36369c.put('3', 'b');
        f36369c.put('4', '9');
        f36369c.put('5', 'P');
        f36369c.put('6', '1');
        f36369c.put('7', 'O');
        f36369c.put('8', 'I');
        f36369c.put('9', 'K');
        f36369c.put('+', 'm');
        f36369c.put('/', 'C');
        f36370d = new char[64];
        int i = 0;
        while (true) {
            char[] cArr = f36367a;
            if (i >= cArr.length) {
                break;
            }
            f36370d[i] = f36369c.get(Character.valueOf(cArr[i])).charValue();
            i++;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr = f36368b;
            if (i2 >= bArr.length) {
                break;
            }
            bArr[i2] = 127;
            i2++;
        }
        int i3 = 0;
        while (true) {
            char[] cArr2 = f36370d;
            if (i3 >= cArr2.length) {
                return;
            }
            f36368b[cArr2[i3]] = (byte) i3;
            i3++;
        }
    }

    /* JADX INFO: renamed from: a */
    private static int m37821a(char[] cArr, byte[] bArr, int i) {
        try {
            char c = cArr[3];
            char c2 = c == '=' ? (char) 2 : (char) 3;
            char c3 = cArr[2];
            if (c3 == '=') {
                c2 = 1;
            }
            byte[] bArr2 = f36368b;
            byte b = bArr2[cArr[0]];
            byte b2 = bArr2[cArr[1]];
            byte b3 = bArr2[c3];
            byte b4 = bArr2[c];
            if (c2 == 1) {
                bArr[i] = (byte) (((b2 >> 4) & 3) | ((b << 2) & 252));
                return 1;
            }
            if (c2 == 2) {
                bArr[i] = (byte) ((3 & (b2 >> 4)) | ((b << 2) & 252));
                bArr[i + 1] = (byte) (((b2 << 4) & 240) | ((b3 >> 2) & 15));
                return 2;
            }
            if (c2 != 3) {
                throw new RuntimeException("Internal Error");
            }
            bArr[i] = (byte) (((b << 2) & 252) | ((b2 >> 4) & 3));
            bArr[i + 1] = (byte) (((b2 << 4) & 240) | ((b3 >> 2) & 15));
            bArr[i + 2] = (byte) (((b3 << 6) & 192) | (b4 & 63));
            return 3;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m37825b(String str) {
        byte[] bArrM37824a = m37824a(str);
        if (bArrM37824a == null || bArrM37824a.length <= 0) {
            return null;
        }
        return new String(bArrM37824a);
    }

    /* JADX INFO: renamed from: c */
    public static String m37826c(String str) {
        return m37822a(str.getBytes());
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003d A[Catch: Exception -> 0x005b, TryCatch #0 {Exception -> 0x005b, blocks: (B:2:0x0000, B:5:0x0009, B:7:0x0019, B:9:0x001d, B:13:0x002c, B:15:0x0032, B:17:0x0037, B:23:0x004c, B:19:0x003d, B:21:0x0044, B:10:0x0023, B:27:0x0055), top: B:31:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x0044 A[Catch: Exception -> 0x005b, TryCatch #0 {Exception -> 0x005b, blocks: (B:2:0x0000, B:5:0x0009, B:7:0x0019, B:9:0x001d, B:13:0x002c, B:15:0x0032, B:17:0x0037, B:23:0x004c, B:19:0x003d, B:21:0x0044, B:10:0x0023, B:27:0x0055), top: B:31:0x0000 }] */
    /* JADX WARN: Code duplicated, block: B:22:0x004b  */
    /* JADX INFO: renamed from: a */
    public static byte[] m37824a(String str) {
        int i;
        int i2;
        try {
            int length = str.length();
            char[] cArr = new char[length < 259 ? length : 259];
            int i3 = ((length >> 2) * 3) + 3;
            byte[] bArr = new byte[i3];
            int i4 = 0;
            int iM37821a = 0;
            int i5 = 0;
            while (i4 < length) {
                int i6 = i4 + 256;
                if (i6 <= length) {
                    str.getChars(i4, i6, cArr, i5);
                    i = i5 + 256;
                } else {
                    str.getChars(i4, length, cArr, i5);
                    i = (length - i4) + i5;
                }
                int i7 = i5;
                while (i5 < i) {
                    char c = cArr[i5];
                    if (c != '=') {
                        byte[] bArr2 = f36368b;
                        if (c < bArr2.length && bArr2[c] != 127) {
                            i2 = i7 + 1;
                            cArr[i7] = c;
                            if (i2 == 4) {
                                iM37821a += m37821a(cArr, bArr, iM37821a);
                                i7 = 0;
                            } else {
                                i7 = i2;
                            }
                        }
                    } else {
                        i2 = i7 + 1;
                        cArr[i7] = c;
                        if (i2 == 4) {
                            iM37821a += m37821a(cArr, bArr, iM37821a);
                            i7 = 0;
                        } else {
                            i7 = i2;
                        }
                    }
                    i5++;
                }
                i4 = i6;
                i5 = i7;
            }
            if (iM37821a == i3) {
                return bArr;
            }
            byte[] bArr3 = new byte[iM37821a];
            System.arraycopy(bArr, 0, bArr3, 0, iM37821a);
            return bArr3;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m37822a(byte[] bArr) {
        return m37823a(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: a */
    public static String m37823a(byte[] bArr, int i, int i2) {
        if (i2 <= 0) {
            return "";
        }
        try {
            char[] cArr = new char[((i2 / 3) << 2) + 4];
            int i3 = 0;
            while (i2 >= 3) {
                int i4 = ((bArr[i] & 255) << 16) + ((bArr[i + 1] & 255) << 8) + (bArr[i + 2] & 255);
                char[] cArr2 = f36370d;
                cArr[i3] = cArr2[i4 >> 18];
                cArr[i3 + 1] = cArr2[(i4 >> 12) & 63];
                int i5 = i3 + 3;
                cArr[i3 + 2] = cArr2[(i4 >> 6) & 63];
                i3 += 4;
                cArr[i5] = cArr2[i4 & 63];
                i += 3;
                i2 -= 3;
            }
            if (i2 == 1) {
                int i6 = bArr[i] & 255;
                char[] cArr3 = f36370d;
                cArr[i3] = cArr3[i6 >> 2];
                cArr[i3 + 1] = cArr3[(i6 << 4) & 63];
                int i7 = i3 + 3;
                cArr[i3 + 2] = C11341A5.f23808U;
                i3 += 4;
                cArr[i7] = C11341A5.f23808U;
            } else if (i2 == 2) {
                int i8 = ((bArr[i] & 255) << 8) + (bArr[i + 1] & 255);
                char[] cArr4 = f36370d;
                cArr[i3] = cArr4[i8 >> 10];
                cArr[i3 + 1] = cArr4[(i8 >> 4) & 63];
                int i9 = i3 + 3;
                cArr[i3 + 2] = cArr4[(i8 << 2) & 63];
                i3 += 4;
                cArr[i9] = C11341A5.f23808U;
            }
            return new String(cArr, 0, i3);
        } catch (Exception unused) {
            return null;
        }
    }
}
