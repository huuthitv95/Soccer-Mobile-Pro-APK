package com.mbridge.msdk.foundation.tools;

import com.google.common.base.Ascii;
import java.nio.charset.StandardCharsets;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.tools.b0 */
/* JADX INFO: compiled from: FastBuffer.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13184b0 {

    /* JADX INFO: renamed from: a */
    public byte[] f36243a;

    /* JADX INFO: renamed from: b */
    public int f36244b;

    /* JADX INFO: renamed from: c */
    private char[] f36245c;

    public C13184b0(int i) {
        this(new byte[i], 0);
    }

    /* JADX INFO: renamed from: b */
    public static int m37603b(String str) {
        int length = str.length();
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i + 1;
            char cCharAt = str.charAt(i);
            if (cCharAt < 128) {
                i2++;
            } else if (cCharAt < 2048) {
                i2 += 2;
            } else if (cCharAt < 55296 || cCharAt > 57343) {
                i2 += 3;
            } else {
                i += 2;
                i2 += 4;
            }
            i = i3;
        }
        return i2;
    }

    /* JADX INFO: renamed from: f */
    public static int m37605f(int i) {
        if ((i >> 7) == 0) {
            return 1;
        }
        if ((i >> 14) == 0) {
            return 2;
        }
        if ((i >> 21) == 0) {
            return 3;
        }
        return (i >> 28) == 0 ? 4 : 5;
    }

    /* JADX INFO: renamed from: a */
    public byte m37606a() {
        byte[] bArr = this.f36243a;
        int i = this.f36244b;
        this.f36244b = i + 1;
        return bArr[i];
    }

    /* JADX INFO: renamed from: c */
    public float m37616c() {
        return Float.intBitsToFloat(m37619d());
    }

    /* JADX INFO: renamed from: d */
    public long m37620d(int i) {
        byte[] bArr = this.f36243a;
        long j = (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40);
        return (((long) bArr[i + 7]) << 56) | j | ((255 & ((long) bArr[i + 6])) << 48);
    }

    /* JADX INFO: renamed from: e */
    public long m37621e() {
        long jM37620d = m37620d(this.f36244b);
        this.f36244b += 8;
        return jM37620d;
    }

    /* JADX INFO: renamed from: f */
    public short m37623f() {
        byte[] bArr = this.f36243a;
        int i = this.f36244b;
        int i2 = i + 1;
        int i3 = bArr[i] & 255;
        this.f36244b = i + 2;
        return (short) ((bArr[i2] << 8) | i3);
    }

    /* JADX INFO: renamed from: g */
    public int m37624g() {
        byte[] bArr = this.f36243a;
        int i = this.f36244b;
        int i2 = i + 1;
        this.f36244b = i2;
        byte b = bArr[i];
        if ((b >> 7) == 0) {
            return b;
        }
        int i3 = i + 2;
        this.f36244b = i3;
        int i4 = (bArr[i2] << 7) | (b & 127);
        if ((i4 >> 14) == 0) {
            return i4;
        }
        int i5 = i + 3;
        this.f36244b = i5;
        int i6 = (i4 & 16383) | (bArr[i3] << Ascii.f22500SO);
        if ((i6 >> 21) == 0) {
            return i6;
        }
        int i7 = i + 4;
        this.f36244b = i7;
        int i8 = (i6 & 2097151) | (bArr[i5] << Ascii.NAK);
        if ((i8 >> 28) == 0) {
            return i8;
        }
        this.f36244b = i + 5;
        return (bArr[i7] << Ascii.f22493FS) | (i8 & 268435455);
    }

    /* JADX INFO: renamed from: h */
    public void m37626h(int i) {
        this.f36244b = m37617c(this.f36244b, i);
    }

    public C13184b0(byte[] bArr, int i) {
        this.f36245c = null;
        this.f36243a = bArr;
        this.f36244b = i;
    }

    /* JADX INFO: renamed from: c */
    private char[] m37604c(int i) {
        char[] cArr = this.f36245c;
        if (cArr == null) {
            if (i <= 256) {
                this.f36245c = new char[256];
            } else {
                this.f36245c = new char[2048];
            }
        } else if (cArr.length < i) {
            this.f36245c = new char[2048];
        }
        return this.f36245c;
    }

    /* JADX INFO: renamed from: a */
    long m37607a(int i, int i2) {
        long jM37620d = 0;
        if (i2 <= 0) {
            return 0L;
        }
        int i3 = i2 >> 3;
        int i4 = i2 & 7;
        int i5 = 0;
        int i6 = i;
        for (int i7 = 0; i7 < i3; i7++) {
            jM37620d ^= m37620d(i6);
            i6 += 8;
        }
        int i8 = i4 << 3;
        while (i5 < i8) {
            jM37620d ^= (((long) this.f36243a[i6]) & 255) << i5;
            i5 += 8;
            i6++;
        }
        int i9 = (i & 7) << 3;
        return (jM37620d >>> (64 - i9)) | (jM37620d << i9);
    }

    /* JADX INFO: renamed from: d */
    public int m37619d() {
        byte[] bArr = this.f36243a;
        int i = this.f36244b;
        int i2 = ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
        int i3 = i + 3;
        int i4 = i2 | ((bArr[i + 2] & 255) << 16);
        this.f36244b = i + 4;
        return (bArr[i3] << Ascii.CAN) | i4;
    }

    /* JADX INFO: renamed from: e */
    public String m37622e(int i) {
        if (i < 0) {
            return null;
        }
        if (i == 0) {
            return "";
        }
        String strM37601a = m37601a(i);
        this.f36244b += i;
        return strM37601a;
    }

    /* JADX INFO: renamed from: b */
    public byte[] m37615b(int i) {
        byte[] bArr = new byte[i];
        System.arraycopy(this.f36243a, this.f36244b, bArr, 0, i);
        this.f36244b += i;
        return bArr;
    }

    /* JADX INFO: renamed from: b */
    public double m37613b() {
        return Double.longBitsToDouble(m37621e());
    }

    /* JADX INFO: renamed from: b */
    public void m37614b(int i, int i2) {
        byte[] bArr = this.f36243a;
        bArr[i] = (byte) i2;
        bArr[i + 1] = (byte) (i2 >> 8);
        bArr[i + 2] = (byte) (i2 >> 16);
        bArr[i + 3] = (byte) (i2 >> 24);
    }

    /* JADX INFO: renamed from: a */
    private String m37601a(int i) {
        if (i > 2048) {
            return new String(this.f36243a, this.f36244b, i, StandardCharsets.UTF_8);
        }
        char[] cArrM37604c = m37604c(i);
        byte[] bArr = this.f36243a;
        int i2 = this.f36244b;
        int i3 = i + i2;
        int i4 = 0;
        while (i2 < i3) {
            int i5 = i2 + 1;
            byte b = bArr[i2];
            if (b > 0) {
                cArrM37604c[i4] = (char) b;
                i4++;
                i2 = i5;
            } else if (b < -32) {
                i2 += 2;
                cArrM37604c[i4] = (char) ((bArr[i5] & 63) | ((b & Ascii.f22502US) << 6));
                i4++;
            } else if (b < -16) {
                int i6 = i2 + 2;
                i2 += 3;
                cArrM37604c[i4] = (char) (((bArr[i5] & 63) << 6) | ((b & Ascii.f22499SI) << 12) | (bArr[i6] & 63));
                i4++;
            } else {
                byte b2 = bArr[i5];
                int i7 = i2 + 3;
                byte b3 = bArr[i2 + 2];
                i2 += 4;
                int i8 = ((b2 & 63) << 12) | ((b & 7) << 18) | ((b3 & 63) << 6) | (bArr[i7] & 63);
                int i9 = i4 + 1;
                cArrM37604c[i4] = (char) ((i8 >>> 10) + 55232);
                i4 += 2;
                cArrM37604c[i9] = (char) ((i8 & 1023) + 56320);
            }
        }
        if (i2 <= i3) {
            return new String(cArrM37604c, 0, i4);
        }
        throw new IllegalArgumentException("Invalid String");
    }

    /* JADX INFO: renamed from: g */
    public void m37625g(int i) {
        byte[] bArr = this.f36243a;
        int i2 = this.f36244b;
        bArr[i2] = (byte) i;
        bArr[i2 + 1] = (byte) (i >> 8);
        bArr[i2 + 2] = (byte) (i >> 16);
        this.f36244b = i2 + 4;
        bArr[i2 + 3] = (byte) (i >> 24);
    }

    public C13184b0(byte[] bArr) {
        this(bArr, 0);
    }

    /* JADX INFO: renamed from: c */
    public void m37618c(String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        m37602a(str);
    }

    /* JADX INFO: renamed from: c */
    public int m37617c(int i, int i2) {
        while ((i2 & (-128)) != 0) {
            this.f36243a[i] = (byte) ((i2 & 127) | 128);
            i2 >>>= 7;
            i++;
        }
        int i3 = i + 1;
        this.f36243a[i] = (byte) i2;
        return i3;
    }

    /* JADX INFO: renamed from: a */
    public final void m37608a(byte b) {
        byte[] bArr = this.f36243a;
        int i = this.f36244b;
        this.f36244b = i + 1;
        bArr[i] = b;
    }

    /* JADX INFO: renamed from: a */
    public void m37612a(byte[] bArr) {
        int length = bArr.length;
        if (length > 0) {
            System.arraycopy(bArr, 0, this.f36243a, this.f36244b, length);
            this.f36244b += length;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m37610a(long j) {
        m37609a(this.f36244b, j);
        this.f36244b += 8;
    }

    /* JADX INFO: renamed from: a */
    public void m37609a(int i, long j) {
        byte[] bArr = this.f36243a;
        bArr[i] = (byte) j;
        bArr[i + 1] = (byte) (j >> 8);
        bArr[i + 2] = (byte) (j >> 16);
        bArr[i + 3] = (byte) (j >> 24);
        bArr[i + 4] = (byte) (j >> 32);
        bArr[i + 5] = (byte) (j >> 40);
        bArr[i + 6] = (byte) (j >> 48);
        bArr[i + 7] = (byte) (j >> 56);
    }

    /* JADX INFO: renamed from: a */
    public void m37611a(short s) {
        byte[] bArr = this.f36243a;
        int i = this.f36244b;
        bArr[i] = (byte) s;
        this.f36244b = i + 2;
        bArr[i + 1] = (byte) (s >> 8);
    }

    /* JADX INFO: renamed from: a */
    private void m37602a(String str) {
        byte[] bArr = this.f36243a;
        int i = this.f36244b;
        int length = str.length();
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                bArr[i] = (byte) cCharAt;
                i++;
            } else if (cCharAt < 2048) {
                int i4 = i + 1;
                bArr[i] = (byte) ((cCharAt >>> 6) | 192);
                i += 2;
                bArr[i4] = (byte) ((cCharAt & '?') | 128);
            } else if (cCharAt >= 55296 && cCharAt <= 57343) {
                i2 += 2;
                int iCharAt = ((cCharAt << '\n') + str.charAt(i3)) - 56613888;
                bArr[i] = (byte) ((iCharAt >>> 18) | 240);
                bArr[i + 1] = (byte) (((iCharAt >>> 12) & 63) | 128);
                int i5 = i + 3;
                bArr[i + 2] = (byte) (((iCharAt >>> 6) & 63) | 128);
                i += 4;
                bArr[i5] = (byte) ((iCharAt & 63) | 128);
            } else {
                bArr[i] = (byte) ((cCharAt >>> '\f') | 224);
                int i6 = i + 2;
                bArr[i + 1] = (byte) (((cCharAt >>> 6) & 63) | 128);
                i += 3;
                bArr[i6] = (byte) ((cCharAt & '?') | 128);
            }
            i2 = i3;
        }
        this.f36244b = i;
    }
}
