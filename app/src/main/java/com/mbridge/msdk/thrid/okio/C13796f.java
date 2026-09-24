package com.mbridge.msdk.thrid.okio;

import com.google.common.base.Ascii;
import com.ironsource.C11744X3;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okio.f */
/* JADX INFO: compiled from: ByteString.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13796f implements Serializable, Comparable<C13796f> {

    /* JADX INFO: renamed from: d */
    static final char[] f39308d = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: e */
    public static final C13796f f39309e = m40909a(new byte[0]);

    /* JADX INFO: renamed from: a */
    final byte[] f39310a;

    /* JADX INFO: renamed from: b */
    transient int f39311b;

    /* JADX INFO: renamed from: c */
    transient String f39312c;

    C13796f(byte[] bArr) {
        this.f39310a = bArr;
    }

    /* JADX INFO: renamed from: a */
    private static int m40906a(char c) {
        if (c >= '0' && c <= '9') {
            return c - '0';
        }
        if (c >= 'a' && c <= 'f') {
            return c - 'W';
        }
        if (c >= 'A' && c <= 'F') {
            return c - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c);
    }

    /* JADX INFO: renamed from: a */
    static int m40907a(String str, int i) {
        int length = str.length();
        int iCharCount = 0;
        int i2 = 0;
        while (iCharCount < length) {
            if (i2 == i) {
                return iCharCount;
            }
            int iCodePointAt = str.codePointAt(iCharCount);
            if ((Character.isISOControl(iCodePointAt) && iCodePointAt != 10 && iCodePointAt != 13) || iCodePointAt == 65533) {
                return -1;
            }
            i2++;
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str.length();
    }

    /* JADX INFO: renamed from: a */
    public static C13796f m40908a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("hex == null");
        }
        if (str.length() % 2 != 0) {
            throw new IllegalArgumentException("Unexpected hex string: " + str);
        }
        int length = str.length() / 2;
        byte[] bArr = new byte[length];
        for (int i = 0; i < length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) ((m40906a(str.charAt(i2)) << 4) + m40906a(str.charAt(i2 + 1)));
        }
        return m40909a(bArr);
    }

    /* JADX INFO: renamed from: a */
    public static C13796f m40909a(byte... bArr) {
        if (bArr != null) {
            return new C13796f((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    /* JADX INFO: renamed from: b */
    private C13796f m40910b(String str) {
        try {
            return m40909a(MessageDigest.getInstance(str).digest(this.f39310a));
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static C13796f m40911c(String str) {
        if (str == null) {
            throw new IllegalArgumentException("s == null");
        }
        C13796f c13796f = new C13796f(str.getBytes(C13811u.f39353a));
        c13796f.f39312c = str;
        return c13796f;
    }

    /* JADX INFO: renamed from: a */
    public byte mo40912a(int i) {
        return this.f39310a[i];
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(C13796f c13796f) {
        int iMo40923j = mo40923j();
        int iMo40923j2 = c13796f.mo40923j();
        int iMin = Math.min(iMo40923j, iMo40923j2);
        for (int i = 0; i < iMin; i++) {
            int iMo40912a = mo40912a(i) & 255;
            int iMo40912a2 = c13796f.mo40912a(i) & 255;
            if (iMo40912a != iMo40912a2) {
                return iMo40912a < iMo40912a2 ? -1 : 1;
            }
        }
        if (iMo40923j == iMo40923j2) {
            return 0;
        }
        return iMo40923j < iMo40923j2 ? -1 : 1;
    }

    /* JADX INFO: renamed from: a */
    public C13796f mo40914a(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f39310a;
        if (i2 > bArr.length) {
            throw new IllegalArgumentException("endIndex > length(" + this.f39310a.length + ")");
        }
        int i3 = i2 - i;
        if (i3 < 0) {
            throw new IllegalArgumentException("endIndex < beginIndex");
        }
        if (i == 0 && i2 == bArr.length) {
            return this;
        }
        byte[] bArr2 = new byte[i3];
        System.arraycopy(bArr, i, bArr2, 0, i3);
        return new C13796f(bArr2);
    }

    /* JADX INFO: renamed from: a */
    void mo40915a(C13793c c13793c) {
        byte[] bArr = this.f39310a;
        c13793c.write(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: a */
    public boolean mo40916a(int i, C13796f c13796f, int i2, int i3) {
        return c13796f.mo40917a(i2, this.f39310a, i, i3);
    }

    /* JADX INFO: renamed from: a */
    public boolean mo40917a(int i, byte[] bArr, int i2, int i3) {
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.f39310a;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && C13811u.m40971a(bArr2, i, bArr, i2, i3);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m40918b(C13796f c13796f) {
        return mo40916a(0, c13796f, 0, c13796f.mo40923j());
    }

    /* JADX INFO: renamed from: d */
    public String mo40919d() {
        return C13792b.m40860a(this.f39310a);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C13796f) {
            C13796f c13796f = (C13796f) obj;
            int iMo40923j = c13796f.mo40923j();
            byte[] bArr = this.f39310a;
            if (iMo40923j == bArr.length && c13796f.mo40917a(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: g */
    public String mo40920g() {
        byte[] bArr = this.f39310a;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f39308d;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & Ascii.f22499SI];
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: h */
    public C13796f mo40921h() {
        return m40910b(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
    }

    public int hashCode() {
        int i = this.f39311b;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.f39310a);
        this.f39311b = iHashCode;
        return iHashCode;
    }

    /* JADX INFO: renamed from: i */
    public C13796f mo40922i() {
        return m40910b("SHA-256");
    }

    /* JADX INFO: renamed from: j */
    public int mo40923j() {
        return this.f39310a.length;
    }

    /* JADX INFO: renamed from: k */
    public C13796f mo40924k() {
        int i = 0;
        while (true) {
            byte[] bArr = this.f39310a;
            if (i >= bArr.length) {
                return this;
            }
            byte b = bArr[i];
            if (b >= 65 && b <= 90) {
                byte[] bArr2 = (byte[]) bArr.clone();
                bArr2[i] = (byte) (b + 32);
                for (int i2 = i + 1; i2 < bArr2.length; i2++) {
                    byte b2 = bArr2[i2];
                    if (b2 >= 65 && b2 <= 90) {
                        bArr2[i2] = (byte) (b2 + 32);
                    }
                }
                return new C13796f(bArr2);
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: l */
    public byte[] mo40925l() {
        return (byte[]) this.f39310a.clone();
    }

    /* JADX INFO: renamed from: m */
    public String mo40926m() {
        String str = this.f39312c;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f39310a, C13811u.f39353a);
        this.f39312c = str2;
        return str2;
    }

    public String toString() {
        if (this.f39310a.length == 0) {
            return "[size=0]";
        }
        String strMo40926m = mo40926m();
        int iM40907a = m40907a(strMo40926m, 64);
        if (iM40907a == -1) {
            if (this.f39310a.length <= 64) {
                return "[hex=" + mo40920g() + C11744X3.j.f26440e;
            }
            return "[size=" + this.f39310a.length + " hex=" + mo40914a(0, 64).mo40920g() + "…]";
        }
        String strReplace = strMo40926m.substring(0, iM40907a).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (iM40907a >= strMo40926m.length()) {
            return "[text=" + strReplace + C11744X3.j.f26440e;
        }
        return "[size=" + this.f39310a.length + " text=" + strReplace + "…]";
    }
}
