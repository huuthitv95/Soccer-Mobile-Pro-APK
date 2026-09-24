package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.fq */
/* JADX INFO: loaded from: classes6.dex */
public final class C11960fq extends AbstractC11961fr {

    /* JADX INFO: renamed from: ﱟ */
    private static int f28907 = 0;

    /* JADX INFO: renamed from: ﱡ */
    private static int f28908 = 1;

    /* JADX INFO: renamed from: ﻏ */
    private static char f28909 = 0;

    /* JADX INFO: renamed from: ｋ */
    private static long f28910 = -6158777393187284451L;

    /* JADX INFO: renamed from: ﾇ */
    private static int f28911;

    /* JADX INFO: renamed from: ﻐ */
    private AbstractC11961fr f28912;

    /* JADX INFO: renamed from: ﻛ */
    private AbstractC11961fr f28913;

    /* JADX INFO: renamed from: ﾒ */
    private AbstractC11919ec f28914;

    public C11960fq(AbstractC11919ec abstractC11919ec, AbstractC11961fr abstractC11961fr, AbstractC11961fr abstractC11961fr2) {
        this.f28914 = abstractC11919ec;
        this.f28913 = abstractC11961fr;
        this.f28912 = abstractC11961fr2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11961fr
    /* JADX INFO: renamed from: ｋ */
    public final C11908ds mo30195(C11907dr c11907dr, C11877co c11877co) {
        int i = 2 % 2;
        int i2 = f28907 + 51;
        f28908 = i2 % 128;
        int i3 = i2 % 2;
        if (!this.f28914.m30156(c11907dr, c11877co).m30065()) {
            AbstractC11961fr abstractC11961fr = this.f28912;
            if (abstractC11961fr != null) {
                int i4 = f28907 + 67;
                f28908 = i4 % 128;
                int i5 = i4 % 2;
                return abstractC11961fr.mo30195(c11907dr, c11877co);
            }
            return new C11908ds(Boolean.FALSE);
        }
        return this.f28913.mo30195(c11907dr, c11877co);
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(m30205("ৡ㽁缾턋", (char) (3620 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), "騝汝ꂗꪇ", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1, "\u19acꦖ┓\ue00e").intern());
        sb.append(this.f28914);
        sb.append(m30205("밀", (char) (TextUtils.indexOf("", "", 0) + 57082), "騝汝ꂗꪇ", Color.red(0) - 505044055, "ꥴ\ue5a3\ufae1쳞").intern());
        if (this.f28913 instanceof C11954fk) {
            int i2 = f28907 + 5;
            f28908 = i2 % 128;
            int i3 = i2 % 2;
            sb.append(m30205("뵛", (char) (Process.getGidForName("") + 57998), "騝汝ꂗꪇ", TextUtils.getCapsMode("", 0, 0) + 1504251823, "꽌ꤏ赙Ӣ").intern());
        } else {
            sb.append(m30205("꺨", (char) (50653 - TextUtils.indexOf("", "", 0, 0)), "騝汝ꂗꪇ", 47799781 - (Process.myPid() >> 22), "\ue558\u67502ૅ").intern());
        }
        sb.append(this.f28913);
        AbstractC11961fr abstractC11961fr = this.f28912;
        if (abstractC11961fr != null) {
            int i4 = f28908 + 3;
            f28907 = i4 % 128;
            int i5 = i4 % 2;
            if (abstractC11961fr instanceof C11954fk) {
                sb.append(m30205("뵛", (char) ((ViewConfiguration.getTouchSlop() >> 8) + 57997), "騝汝ꂗꪇ", TextUtils.indexOf("", "", 0) + 1504251823, "꽌ꤏ赙Ӣ").intern());
                int i6 = f28907 + 47;
                f28908 = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 3 / 5;
                }
            } else {
                sb.append(m30205("꺨", (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 50653), "騝汝ꂗꪇ", (Process.getElapsedCpuTime() > r6 ? 1 : (Process.getElapsedCpuTime() == r6 ? 0 : -1)) + 47799780, "\ue558\u67502ૅ").intern());
                int i8 = f28907 + 53;
                f28908 = i8 % 128;
                int i9 = i8 % 2;
            }
            sb.append(m30205("掍ꌩ᠄땤", (char) (10021 - TextUtils.indexOf("", "")), "騝汝ꂗꪇ", Color.alpha(0), "빽࡛△긧").intern());
            if (this.f28912 instanceof C11954fk) {
                sb.append(m30205("뵛", (char) (ImageFormat.getBitsPerPixel(0) + 57998), "騝汝ꂗꪇ", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1504251823, "꽌ꤏ赙Ӣ").intern());
            } else {
                sb.append(m30205("꺨", (char) (50654 - (SystemClock.elapsedRealtime() > 0 ? 1 : (SystemClock.elapsedRealtime() == 0 ? 0 : -1))), "騝汝ꂗꪇ", 47799781 - TextUtils.indexOf("", "", 0), "\ue558\u67502ૅ").intern());
            }
            sb.append(this.f28912);
        }
        String string = sb.toString();
        int i10 = f28907 + 107;
        f28908 = i10 % 128;
        int i11 = i10 % 2;
        return string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002d, code lost:
    
        if (r3.equals(r8.f28914) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003b, code lost:
    
        if (r8.f28914 != null) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003d, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003e, code lost:
    
        r3 = r7.f28913;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0040, code lost:
    
        if (r3 == null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        if (r3.equals(r8.f28913) != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004d, code lost:
    
        if (r8.f28913 == null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004f, code lost:
    
        r8 = com.ironsource.adqualitysdk.sdk.p286i.C11960fq.f28907 + 93;
        com.ironsource.adqualitysdk.sdk.p286i.C11960fq.f28908 = r8 % 128;
        r8 = r8 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0058, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0059, code lost:
    
        r3 = r7.f28912;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005b, code lost:
    
        if (r3 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005d, code lost:
    
        r1 = com.ironsource.adqualitysdk.sdk.p286i.C11960fq.f28908 + 59;
        com.ironsource.adqualitysdk.sdk.p286i.C11960fq.f28907 = r1 % 128;
        r1 = r1 % 2;
        r8 = r8.f28912;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0068, code lost:
    
        if (r1 != 0) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006e, code lost:
    
        return r3.equals(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006f, code lost:
    
        r3.equals(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0072, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0075, code lost:
    
        if (r8.f28912 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0077, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            r1 = 1
            if (r7 != r8) goto L7
            return r1
        L7:
            r2 = 0
            if (r8 == 0) goto L78
            java.lang.Class r3 = r7.getClass()
            java.lang.Class r4 = r8.getClass()
            if (r3 == r4) goto L15
            goto L78
        L15:
            com.ironsource.adqualitysdk.sdk.i.fq r8 = (com.ironsource.adqualitysdk.sdk.p286i.C11960fq) r8
            com.ironsource.adqualitysdk.sdk.i.ec r3 = r7.f28914
            r4 = 0
            if (r3 == 0) goto L39
            int r5 = com.ironsource.adqualitysdk.sdk.p286i.C11960fq.f28908
            int r5 = r5 + 65
            int r6 = r5 % 128
            com.ironsource.adqualitysdk.sdk.p286i.C11960fq.f28907 = r6
            int r5 = r5 % r0
            if (r5 != 0) goto L30
            com.ironsource.adqualitysdk.sdk.i.ec r5 = r8.f28914
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L3e
            goto L3d
        L30:
            com.ironsource.adqualitysdk.sdk.i.ec r8 = r8.f28914
            r3.equals(r8)
            super.hashCode()
            throw r4
        L39:
            com.ironsource.adqualitysdk.sdk.i.ec r3 = r8.f28914
            if (r3 == 0) goto L3e
        L3d:
            return r2
        L3e:
            com.ironsource.adqualitysdk.sdk.i.fr r3 = r7.f28913
            if (r3 == 0) goto L4b
            com.ironsource.adqualitysdk.sdk.i.fr r5 = r8.f28913
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L59
            goto L4f
        L4b:
            com.ironsource.adqualitysdk.sdk.i.fr r3 = r8.f28913
            if (r3 == 0) goto L59
        L4f:
            int r8 = com.ironsource.adqualitysdk.sdk.p286i.C11960fq.f28907
            int r8 = r8 + 93
            int r1 = r8 % 128
            com.ironsource.adqualitysdk.sdk.p286i.C11960fq.f28908 = r1
            int r8 = r8 % r0
            return r2
        L59:
            com.ironsource.adqualitysdk.sdk.i.fr r3 = r7.f28912
            if (r3 == 0) goto L73
            int r1 = com.ironsource.adqualitysdk.sdk.p286i.C11960fq.f28908
            int r1 = r1 + 59
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.p286i.C11960fq.f28907 = r2
            int r1 = r1 % r0
            com.ironsource.adqualitysdk.sdk.i.fr r8 = r8.f28912
            if (r1 != 0) goto L6f
            boolean r8 = r3.equals(r8)
            return r8
        L6f:
            r3.equals(r8)
            throw r4
        L73:
            com.ironsource.adqualitysdk.sdk.i.fr r8 = r8.f28912
            if (r8 != 0) goto L78
            return r1
        L78:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p286i.C11960fq.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i = 2 % 2;
        AbstractC11919ec abstractC11919ec = this.f28914;
        int iHashCode3 = 0;
        if (abstractC11919ec != null) {
            iHashCode = abstractC11919ec.hashCode();
            int i2 = f28907 + 81;
            f28908 = i2 % 128;
            int i3 = i2 % 2;
        } else {
            iHashCode = 0;
        }
        int i4 = iHashCode * 31;
        AbstractC11961fr abstractC11961fr = this.f28913;
        if (abstractC11961fr != null) {
            int i5 = f28908 + 73;
            f28907 = i5 % 128;
            if (i5 % 2 != 0) {
                abstractC11961fr.hashCode();
                throw null;
            }
            iHashCode2 = abstractC11961fr.hashCode();
            int i6 = f28908 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
            f28907 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 4 / 2;
            }
        } else {
            iHashCode2 = 0;
        }
        int i8 = (i4 + iHashCode2) * 31;
        AbstractC11961fr abstractC11961fr2 = this.f28912;
        if (abstractC11961fr2 != null) {
            int i9 = f28908 + 55;
            f28907 = i9 % 128;
            int i10 = i9 % 2;
            iHashCode3 = abstractC11961fr2.hashCode();
        } else {
            int i11 = f28907 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
            f28908 = i11 % 128;
            int i12 = i11 % 2;
        }
        return i8 + iHashCode3;
    }

    /* JADX INFO: renamed from: ﻛ */
    private static String m30205(String str, char c, String str2, int i, String str3) {
        String str4;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
        }
        char[] cArr3 = (char[]) charArray3;
        synchronized (C12051j.f29510) {
            char[] cArr4 = (char[]) cArr.clone();
            char[] cArr5 = (char[]) cArr2.clone();
            cArr4[0] = (char) (c ^ cArr4[0]);
            cArr5[2] = (char) (cArr5[2] + ((char) i));
            int length = cArr3.length;
            char[] cArr6 = new char[length];
            C12051j.f29511 = 0;
            while (C12051j.f29511 < length) {
                int i2 = (C12051j.f29511 + 2) % 4;
                int i3 = (C12051j.f29511 + 3) % 4;
                C12051j.f29509 = (char) (((cArr4[C12051j.f29511 % 4] * 32718) + cArr5[i2]) % 65535);
                cArr5[i3] = (char) (((cArr4[i3] * 32718) + cArr5[i2]) / 65535);
                cArr4[i3] = C12051j.f29509;
                cArr6[C12051j.f29511] = (char) (((((long) (cArr4[i3] ^ cArr3[C12051j.f29511])) ^ f28910) ^ ((long) f28911)) ^ ((long) f28909));
                C12051j.f29511++;
            }
            str4 = new String(cArr6);
        }
        return str4;
    }
}
