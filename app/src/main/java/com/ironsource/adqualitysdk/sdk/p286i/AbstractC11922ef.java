package com.ironsource.adqualitysdk.sdk.p286i;

import com.google.android.exoplayer2.C9415C;
import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ef */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC11922ef extends AbstractC11919ec {

    /* JADX INFO: renamed from: ﻐ */
    private static int f28781 = 1;

    /* JADX INFO: renamed from: ﻛ */
    private static int f28782;

    /* JADX INFO: renamed from: ﾒ */
    private static char[] f28783 = {16};

    /* JADX INFO: renamed from: ｋ */
    private AbstractC11919ec f28784;

    /* JADX INFO: renamed from: ﾇ */
    private AbstractC11919ec f28785;

    /* JADX INFO: renamed from: ﾒ */
    public abstract String mo30164();

    public AbstractC11922ef(AbstractC11919ec abstractC11919ec, AbstractC11919ec abstractC11919ec2, C11904do c11904do) {
        super(c11904do);
        this.f28784 = abstractC11919ec;
        this.f28785 = abstractC11919ec2;
    }

    /* JADX INFO: renamed from: ｋ */
    public final AbstractC11919ec m30162() {
        int i = 2 % 2;
        int i2 = f28782;
        int i3 = i2 + 79;
        f28781 = i3 % 128;
        int i4 = i3 % 2;
        AbstractC11919ec abstractC11919ec = this.f28784;
        int i5 = i2 + 115;
        f28781 = i5 % 128;
        int i6 = i5 % 2;
        return abstractC11919ec;
    }

    /* JADX INFO: renamed from: ﾇ */
    public final AbstractC11919ec m30163() {
        int i = 2 % 2;
        int i2 = f28781;
        int i3 = i2 + 43;
        f28782 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            super.hashCode();
            throw null;
        }
        AbstractC11919ec abstractC11919ec = this.f28785;
        int i4 = i2 + 9;
        f28782 = i4 % 128;
        if (i4 % 2 == 0) {
            return abstractC11919ec;
        }
        throw null;
    }

    public String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f28784);
        sb.append(m30161(new int[]{0, 1, 0, 0}, "\u0000", true).intern());
        sb.append(mo30164());
        sb.append(m30161(new int[]{0, 1, 0, 0}, "\u0000", true).intern());
        sb.append(this.f28785);
        String string = sb.toString();
        int i2 = f28781 + 11;
        f28782 = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (r3.equals(r7.f28784) == false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        if (r7.f28784 != null) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        r3 = r6.f28785;
        r7 = r7.f28785;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0048, code lost:
    
        if (r3 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
    
        r7 = r3.equals(r7);
        r1 = com.ironsource.adqualitysdk.sdk.p286i.AbstractC11922ef.f28781 + 95;
        com.ironsource.adqualitysdk.sdk.p286i.AbstractC11922ef.f28782 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0057, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        if (r7 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.ironsource.adqualitysdk.sdk.p286i.AbstractC11922ef.f28781
            int r1 = r1 + 117
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.p286i.AbstractC11922ef.f28782 = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L5c
            r1 = 1
            if (r6 != r7) goto L19
            int r2 = r2 + 61
            int r7 = r2 % 128
            com.ironsource.adqualitysdk.sdk.p286i.AbstractC11922ef.f28781 = r7
            int r2 = r2 % r0
            return r1
        L19:
            r2 = 0
            if (r7 == 0) goto L5b
            java.lang.Class r3 = r6.getClass()
            java.lang.Class r4 = r7.getClass()
            if (r3 == r4) goto L27
            goto L5b
        L27:
            com.ironsource.adqualitysdk.sdk.i.ef r7 = (com.ironsource.adqualitysdk.sdk.p286i.AbstractC11922ef) r7
            com.ironsource.adqualitysdk.sdk.i.ec r3 = r6.f28784
            if (r3 == 0) goto L3f
            int r4 = com.ironsource.adqualitysdk.sdk.p286i.AbstractC11922ef.f28782
            int r4 = r4 + 63
            int r5 = r4 % 128
            com.ironsource.adqualitysdk.sdk.p286i.AbstractC11922ef.f28781 = r5
            int r4 = r4 % r0
            com.ironsource.adqualitysdk.sdk.i.ec r4 = r7.f28784
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L44
            goto L43
        L3f:
            com.ironsource.adqualitysdk.sdk.i.ec r3 = r7.f28784
            if (r3 == 0) goto L44
        L43:
            return r2
        L44:
            com.ironsource.adqualitysdk.sdk.i.ec r3 = r6.f28785
            com.ironsource.adqualitysdk.sdk.i.ec r7 = r7.f28785
            if (r3 == 0) goto L58
            boolean r7 = r3.equals(r7)
            int r1 = com.ironsource.adqualitysdk.sdk.p286i.AbstractC11922ef.f28781
            int r1 = r1 + 95
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.p286i.AbstractC11922ef.f28782 = r2
            int r1 = r1 % r0
            return r7
        L58:
            if (r7 != 0) goto L5b
            return r1
        L5b:
            return r2
        L5c:
            r7 = 0
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p286i.AbstractC11922ef.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002b  */
    /* JADX WARN: Code duplicated, block: B:9:0x001b  */
    public int hashCode() {
        int iHashCode;
        int i = 2 % 2;
        int i2 = f28781 + 37;
        f28782 = i2 % 128;
        int iHashCode2 = 0;
        if (i2 % 2 != 0) {
            int i3 = 87 / 0;
            if (this.f28784 != null) {
                iHashCode = this.f28784.hashCode();
                int i4 = f28782 + 109;
                f28781 = i4 % 128;
                int i5 = i4 % 2;
            } else {
                iHashCode = 0;
            }
        } else if (this.f28784 != null) {
            iHashCode = this.f28784.hashCode();
            int i6 = f28782 + 109;
            f28781 = i6 % 128;
            int i7 = i6 % 2;
        } else {
            iHashCode = 0;
        }
        int i8 = iHashCode * 31;
        AbstractC11919ec abstractC11919ec = this.f28785;
        if (abstractC11919ec != null) {
            iHashCode2 = abstractC11919ec.hashCode();
            int i9 = f28781 + 43;
            f28782 = i9 % 128;
            int i10 = i9 % 2;
        }
        return i8 + iHashCode2;
    }

    /* JADX INFO: renamed from: ｋ */
    private static String m30161(int[] iArr, String str, boolean z) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes(C9415C.ISO88591_NAME);
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (C12024i.f29270) {
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            char[] cArr = new char[i2];
            System.arraycopy(f28783, i, cArr, 0, i2);
            if (bArr != null) {
                char[] cArr2 = new char[i2];
                C12024i.f29269 = 0;
                char c = 0;
                while (C12024i.f29269 < i2) {
                    if (bArr[C12024i.f29269] == 1) {
                        cArr2[C12024i.f29269] = (char) (((cArr[C12024i.f29269] << 1) + 1) - c);
                    } else {
                        cArr2[C12024i.f29269] = (char) ((cArr[C12024i.f29269] << 1) - c);
                    }
                    c = cArr2[C12024i.f29269];
                    C12024i.f29269++;
                }
                cArr = cArr2;
            }
            if (i4 > 0) {
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr, 0, cArr3, 0, i2);
                int i5 = i2 - i4;
                System.arraycopy(cArr3, 0, cArr, i5, i4);
                System.arraycopy(cArr3, i4, cArr, 0, i5);
            }
            if (z) {
                char[] cArr4 = new char[i2];
                C12024i.f29269 = 0;
                while (C12024i.f29269 < i2) {
                    cArr4[C12024i.f29269] = cArr[(i2 - C12024i.f29269) - 1];
                    C12024i.f29269++;
                }
                cArr = cArr4;
            }
            if (i3 > 0) {
                C12024i.f29269 = 0;
                while (C12024i.f29269 < i2) {
                    cArr[C12024i.f29269] = (char) (cArr[C12024i.f29269] - iArr[2]);
                    C12024i.f29269++;
                }
            }
            str2 = new String(cArr);
        }
        return str2;
    }
}
