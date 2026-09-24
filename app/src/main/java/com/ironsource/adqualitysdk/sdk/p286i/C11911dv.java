package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.dv */
/* JADX INFO: loaded from: classes6.dex */
public final class C11911dv extends AbstractC11919ec {

    /* JADX INFO: renamed from: ﻐ */
    private static int f28711 = 1;

    /* JADX INFO: renamed from: ﻛ */
    private static int f28712 = 106;

    /* JADX INFO: renamed from: ｋ */
    private static int f28713;

    /* JADX INFO: renamed from: ﾇ */
    private C11931eo f28714;

    /* JADX INFO: renamed from: ﾒ */
    private AbstractC11919ec f28715;

    public C11911dv(C11931eo c11931eo, AbstractC11919ec abstractC11919ec, C11904do c11904do) {
        super(c11904do);
        this.f28714 = c11931eo;
        this.f28715 = abstractC11919ec;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11919ec
    /* JADX INFO: renamed from: ﾇ */
    public final C11908ds mo30123(C11907dr c11907dr, C11877co c11877co) {
        int i = 2 % 2;
        int i2 = f28711 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f28713 = i2 % 128;
        if (i2 % 2 != 0) {
            C11908ds c11908dsM30156 = this.f28715.m30156(c11907dr, c11877co);
            c11907dr.m30053(this.f28714.m30179(), c11908dsM30156.m30066());
            int i3 = 98 / 0;
            return c11908dsM30156;
        }
        C11908ds c11908dsM30157 = this.f28715.m30156(c11907dr, c11877co);
        c11907dr.m30053(this.f28714.m30179(), c11908dsM30157.m30066());
        return c11908dsM30157;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f28714);
        sb.append(m30122("\u0014\ufff7\ufff7", 3 - TextUtils.indexOf("", "", 0, 0), false, 2 - Color.alpha(0), 147 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern());
        sb.append(this.f28715);
        String string = sb.toString();
        int i2 = f28711 + 21;
        f28713 = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (r7 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        r1 = r1 + 23;
        com.ironsource.adqualitysdk.sdk.p286i.C11911dv.f28713 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0031, code lost:
    
        if (getClass() == r7.getClass()) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        r7 = (com.ironsource.adqualitysdk.sdk.p286i.C11911dv) r7;
        r1 = r6.f28714;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0038, code lost:
    
        if (r1 == null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        r2 = com.ironsource.adqualitysdk.sdk.p286i.C11911dv.f28713 + 107;
        com.ironsource.adqualitysdk.sdk.p286i.C11911dv.f28711 = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0049, code lost:
    
        if (r1.equals(r7.f28714) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x004e, code lost:
    
        if (r7.f28714 == null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0051, code lost:
    
        r0 = r6.f28715;
        r7 = r7.f28715;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (r0 == null) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        return r0.equals(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        if (r7 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005e, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005f, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        r1 = r1 + 43;
        com.ironsource.adqualitysdk.sdk.p286i.C11911dv.f28713 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.ironsource.adqualitysdk.sdk.p286i.C11911dv.f28711
            int r2 = r1 + 119
            int r3 = r2 % 128
            com.ironsource.adqualitysdk.sdk.p286i.C11911dv.f28713 = r3
            int r2 = r2 % r0
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L16
            r2 = 50
            int r2 = r2 / r4
            if (r6 != r7) goto L20
            goto L18
        L16:
            if (r6 != r7) goto L20
        L18:
            int r1 = r1 + 43
            int r7 = r1 % 128
            com.ironsource.adqualitysdk.sdk.p286i.C11911dv.f28713 = r7
            int r1 = r1 % r0
            return r3
        L20:
            if (r7 == 0) goto L5f
            int r1 = r1 + 23
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.p286i.C11911dv.f28713 = r2
            int r1 = r1 % r0
            java.lang.Class r1 = r6.getClass()
            java.lang.Class r2 = r7.getClass()
            if (r1 == r2) goto L34
            goto L5f
        L34:
            com.ironsource.adqualitysdk.sdk.i.dv r7 = (com.ironsource.adqualitysdk.sdk.p286i.C11911dv) r7
            com.ironsource.adqualitysdk.sdk.i.eo r1 = r6.f28714
            if (r1 == 0) goto L4c
            int r2 = com.ironsource.adqualitysdk.sdk.p286i.C11911dv.f28713
            int r2 = r2 + 107
            int r5 = r2 % 128
            com.ironsource.adqualitysdk.sdk.p286i.C11911dv.f28711 = r5
            int r2 = r2 % r0
            com.ironsource.adqualitysdk.sdk.i.eo r0 = r7.f28714
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L51
            goto L50
        L4c:
            com.ironsource.adqualitysdk.sdk.i.eo r0 = r7.f28714
            if (r0 == 0) goto L51
        L50:
            return r4
        L51:
            com.ironsource.adqualitysdk.sdk.i.ec r0 = r6.f28715
            com.ironsource.adqualitysdk.sdk.i.ec r7 = r7.f28715
            if (r0 == 0) goto L5c
            boolean r7 = r0.equals(r7)
            return r7
        L5c:
            if (r7 != 0) goto L5f
            return r3
        L5f:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p286i.C11911dv.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = f28713 + 105;
        f28711 = i2 % 128;
        int i3 = i2 % 2;
        C11931eo c11931eo = this.f28714;
        int iHashCode = 0;
        int iHashCode2 = (c11931eo != null ? c11931eo.hashCode() : 0) * 31;
        AbstractC11919ec abstractC11919ec = this.f28715;
        if (abstractC11919ec != null) {
            int i4 = f28713 + 45;
            f28711 = i4 % 128;
            int i5 = i4 % 2;
            iHashCode = abstractC11919ec.hashCode();
        }
        return iHashCode2 + iHashCode;
    }

    /* JADX INFO: renamed from: ﾇ */
    public final C11931eo m30124() {
        int i = 2 % 2;
        int i2 = f28711;
        int i3 = i2 + 109;
        f28713 = i3 % 128;
        int i4 = i3 % 2;
        C11931eo c11931eo = this.f28714;
        int i5 = i2 + 107;
        f28713 = i5 % 128;
        if (i5 % 2 == 0) {
            return c11931eo;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    private static String m30122(String str, int i, boolean z, int i2, int i3) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C11889d.f28479) {
            char[] cArr2 = new char[i];
            C11889d.f28481 = 0;
            while (C11889d.f28481 < i) {
                C11889d.f28480 = cArr[C11889d.f28481];
                cArr2[C11889d.f28481] = (char) (C11889d.f28480 + i3);
                int i4 = C11889d.f28481;
                cArr2[i4] = (char) (cArr2[i4] - f28712);
                C11889d.f28481++;
            }
            if (i2 > 0) {
                C11889d.f28478 = i2;
                char[] cArr3 = new char[i];
                System.arraycopy(cArr2, 0, cArr3, 0, i);
                System.arraycopy(cArr3, 0, cArr2, i - C11889d.f28478, C11889d.f28478);
                System.arraycopy(cArr3, C11889d.f28478, cArr2, 0, i - C11889d.f28478);
            }
            if (z) {
                char[] cArr4 = new char[i];
                C11889d.f28481 = 0;
                while (C11889d.f28481 < i) {
                    cArr4[C11889d.f28481] = cArr2[(i - C11889d.f28481) - 1];
                    C11889d.f28481++;
                }
                cArr2 = cArr4;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }
}
