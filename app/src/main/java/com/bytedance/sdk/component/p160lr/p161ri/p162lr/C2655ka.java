package com.bytedance.sdk.component.p160lr.p161ri.p162lr;

import com.google.common.base.Ascii;
import com.ironsource.C11744X3;
import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Arrays;

/* JADX INFO: renamed from: com.bytedance.sdk.component.lr.ri.lr.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C2655ka implements Serializable, Comparable<C2655ka> {

    /* JADX INFO: renamed from: di */
    transient String f7559di;

    /* JADX INFO: renamed from: fi */
    transient int f7560fi;

    /* JADX INFO: renamed from: ka */
    final byte[] f7561ka;

    /* JADX INFO: renamed from: ri */
    static final char[] f7558ri = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: lr */
    public static final Charset f7557lr = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: ik */
    public static final C2655ka f7556ik = m9944ri(new byte[0]);

    C2655ka(byte[] bArr) {
        this.f7561ka = bArr;
    }

    /* JADX INFO: renamed from: ri */
    static int m9943ri(String str, int i) {
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

    /* JADX INFO: renamed from: ri */
    public static C2655ka m9944ri(byte... bArr) {
        if (bArr != null) {
            return new C2655ka((byte[]) bArr.clone());
        }
        throw new IllegalArgumentException("data == null");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C2655ka) {
            C2655ka c2655ka = (C2655ka) obj;
            int iMo9945ik = c2655ka.mo9945ik();
            byte[] bArr = this.f7561ka;
            if (iMo9945ik == bArr.length && c2655ka.mo9953ri(0, bArr, 0, bArr.length)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = this.f7560fi;
        if (i != 0) {
            return i;
        }
        int iHashCode = Arrays.hashCode(this.f7561ka);
        this.f7560fi = iHashCode;
        return iHashCode;
    }

    /* JADX INFO: renamed from: ik */
    public int mo9945ik() {
        return this.f7561ka.length;
    }

    /* JADX INFO: renamed from: ka */
    public byte[] mo9946ka() {
        return (byte[]) this.f7561ka.clone();
    }

    /* JADX INFO: renamed from: lr */
    public String mo9947lr() {
        byte[] bArr = this.f7561ka;
        char[] cArr = new char[bArr.length * 2];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            char[] cArr2 = f7558ri;
            cArr[i] = cArr2[(b >> 4) & 15];
            i += 2;
            cArr[i2] = cArr2[b & Ascii.f22499SI];
        }
        return new String(cArr);
    }

    /* JADX INFO: renamed from: ri */
    public byte mo9948ri(int i) {
        return this.f7561ka[i];
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
    public int compareTo(C2655ka c2655ka) {
        int iMo9945ik = mo9945ik();
        int iMo9945ik2 = c2655ka.mo9945ik();
        int iMin = Math.min(iMo9945ik, iMo9945ik2);
        for (int i = 0; i < iMin; i++) {
            int iMo9948ri = mo9948ri(i) & 255;
            int iMo9948ri2 = c2655ka.mo9948ri(i) & 255;
            if (iMo9948ri != iMo9948ri2) {
                return iMo9948ri < iMo9948ri2 ? -1 : 1;
            }
        }
        if (iMo9945ik == iMo9945ik2) {
            return 0;
        }
        return iMo9945ik < iMo9945ik2 ? -1 : 1;
    }

    /* JADX INFO: renamed from: ri */
    public C2655ka mo9950ri(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("beginIndex < 0");
        }
        byte[] bArr = this.f7561ka;
        if (i2 > bArr.length) {
            throw new IllegalArgumentException("endIndex > length(" + this.f7561ka.length + ")");
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
        return new C2655ka(bArr2);
    }

    /* JADX INFO: renamed from: ri */
    public String mo9951ri() {
        String str = this.f7559di;
        if (str != null) {
            return str;
        }
        String str2 = new String(this.f7561ka, f7557lr);
        this.f7559di = str2;
        return str2;
    }

    /* JADX INFO: renamed from: ri */
    public boolean mo9952ri(int i, C2655ka c2655ka, int i2, int i3) {
        return c2655ka.mo9953ri(i2, this.f7561ka, i, i3);
    }

    /* JADX INFO: renamed from: ri */
    public boolean mo9953ri(int i, byte[] bArr, int i2, int i3) {
        if (i < 0) {
            return false;
        }
        byte[] bArr2 = this.f7561ka;
        return i <= bArr2.length - i3 && i2 >= 0 && i2 <= bArr.length - i3 && jbs.m9942ri(bArr2, i, bArr, i2, i3);
    }

    public String toString() {
        if (this.f7561ka.length == 0) {
            return "[size=0]";
        }
        String strMo9951ri = mo9951ri();
        int iM9943ri = m9943ri(strMo9951ri, 64);
        if (iM9943ri == -1) {
            if (this.f7561ka.length <= 64) {
                return "[hex=" + mo9947lr() + C11744X3.j.f26440e;
            }
            return "[size=" + this.f7561ka.length + " hex=" + mo9950ri(0, 64).mo9947lr() + "…]";
        }
        String strReplace = strMo9951ri.substring(0, iM9943ri).replace("\\", "\\\\").replace("\n", "\\n").replace("\r", "\\r");
        if (iM9943ri >= strMo9951ri.length()) {
            return "[text=" + strReplace + C11744X3.j.f26440e;
        }
        return "[size=" + this.f7561ka.length + " text=" + strReplace + "…]";
    }
}
