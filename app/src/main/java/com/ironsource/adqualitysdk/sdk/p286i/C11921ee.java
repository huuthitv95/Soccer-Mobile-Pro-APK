package com.ironsource.adqualitysdk.sdk.p286i;

import android.view.MotionEvent;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ee */
/* JADX INFO: loaded from: classes6.dex */
public final class C11921ee extends AbstractC11919ec {

    /* JADX INFO: renamed from: ﻐ */
    private static long f28776 = -3484638910035826560L;

    /* JADX INFO: renamed from: ｋ */
    private static int f28777 = 1;

    /* JADX INFO: renamed from: ﾇ */
    private static int f28778;

    /* JADX INFO: renamed from: ﻛ */
    private AbstractC11919ec f28779;

    /* JADX INFO: renamed from: ﾒ */
    private String f28780;

    public C11921ee(AbstractC11919ec abstractC11919ec, String str, C11904do c11904do) {
        super(c11904do);
        this.f28779 = abstractC11919ec;
        this.f28780 = str;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11919ec
    /* JADX INFO: renamed from: ﾇ */
    public final C11908ds mo30123(C11907dr c11907dr, C11877co c11877co) {
        int i = 2 % 2;
        int i2 = f28778 + 53;
        f28777 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            Object objM30066 = this.f28779.m30156(c11907dr, c11877co).m30066();
            if (objM30066 instanceof C11877co) {
                return new C11908ds(((C11877co) objM30066).m29678(this.f28780));
            }
            try {
                C11908ds c11908ds = new C11908ds(objM30066.getClass().getDeclaredField(this.f28780).get(objM30066));
                int i3 = f28777 + 61;
                f28778 = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 96 / 0;
                }
                return c11908ds;
            } catch (Exception unused) {
                return new C11908ds(null);
            }
        }
        boolean z = this.f28779.m30156(c11907dr, c11877co).m30066() instanceof C11877co;
        super.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f28779.toString());
        sb.append(m30160("끜ᱎ塂ೲ끲", MotionEvent.axisFromString("") + 1).intern());
        sb.append(this.f28780);
        String string = sb.toString();
        int i2 = f28778 + 101;
        f28777 = i2 % 128;
        if (i2 % 2 != 0) {
            return string;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r3.equals(r7.f28779) == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004a, code lost:
    
        if (r7.f28779 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004c, code lost:
    
        r7 = com.ironsource.adqualitysdk.sdk.p286i.C11921ee.f28778 + 85;
        com.ironsource.adqualitysdk.sdk.p286i.C11921ee.f28777 = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0056, code lost:
    
        r3 = r6.f28780;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0058, code lost:
    
        if (r3 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005a, code lost:
    
        r1 = com.ironsource.adqualitysdk.sdk.p286i.C11921ee.f28777 + 37;
        com.ironsource.adqualitysdk.sdk.p286i.C11921ee.f28778 = r1 % 128;
        r1 = r1 % 2;
        r7 = r3.equals(r7.f28780);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0069, code lost:
    
        if (r1 == 0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006b, code lost:
    
        r0 = 38 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006e, code lost:
    
        return r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0071, code lost:
    
        if (r7.f28780 != null) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0073, code lost:
    
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
            r1 = 1
            if (r6 != r7) goto L10
            int r7 = com.ironsource.adqualitysdk.sdk.p286i.C11921ee.f28777
            int r7 = r7 + 121
            int r2 = r7 % 128
            com.ironsource.adqualitysdk.sdk.p286i.C11921ee.f28778 = r2
            int r7 = r7 % r0
            return r1
        L10:
            r2 = 0
            if (r7 == 0) goto L74
            int r3 = com.ironsource.adqualitysdk.sdk.p286i.C11921ee.f28777
            int r3 = r3 + 31
            int r4 = r3 % 128
            com.ironsource.adqualitysdk.sdk.p286i.C11921ee.f28778 = r4
            int r3 = r3 % r0
            java.lang.Class r3 = r6.getClass()
            java.lang.Class r4 = r7.getClass()
            if (r3 == r4) goto L27
            goto L74
        L27:
            com.ironsource.adqualitysdk.sdk.i.ee r7 = (com.ironsource.adqualitysdk.sdk.p286i.C11921ee) r7
            com.ironsource.adqualitysdk.sdk.i.ec r3 = r6.f28779
            if (r3 == 0) goto L48
            int r4 = com.ironsource.adqualitysdk.sdk.p286i.C11921ee.f28778
            int r4 = r4 + 71
            int r5 = r4 % 128
            com.ironsource.adqualitysdk.sdk.p286i.C11921ee.f28777 = r5
            int r4 = r4 % r0
            if (r4 == 0) goto L41
            com.ironsource.adqualitysdk.sdk.i.ec r4 = r7.f28779
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L56
            goto L4c
        L41:
            com.ironsource.adqualitysdk.sdk.i.ec r7 = r7.f28779
            r3.equals(r7)
            r7 = 0
            throw r7
        L48:
            com.ironsource.adqualitysdk.sdk.i.ec r3 = r7.f28779
            if (r3 == 0) goto L56
        L4c:
            int r7 = com.ironsource.adqualitysdk.sdk.p286i.C11921ee.f28778
            int r7 = r7 + 85
            int r1 = r7 % 128
            com.ironsource.adqualitysdk.sdk.p286i.C11921ee.f28777 = r1
            int r7 = r7 % r0
            return r2
        L56:
            java.lang.String r3 = r6.f28780
            if (r3 == 0) goto L6f
            int r1 = com.ironsource.adqualitysdk.sdk.p286i.C11921ee.f28777
            int r1 = r1 + 37
            int r4 = r1 % 128
            com.ironsource.adqualitysdk.sdk.p286i.C11921ee.f28778 = r4
            int r1 = r1 % r0
            java.lang.String r7 = r7.f28780
            boolean r7 = r3.equals(r7)
            if (r1 == 0) goto L6e
            r0 = 38
            int r0 = r0 / r2
        L6e:
            return r7
        L6f:
            java.lang.String r7 = r7.f28780
            if (r7 != 0) goto L74
            return r1
        L74:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p286i.C11921ee.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = f28777 + 77;
        f28778 = i2 % 128;
        int i3 = i2 % 2;
        AbstractC11919ec abstractC11919ec = this.f28779;
        int i4 = 0;
        int iHashCode = (abstractC11919ec != null ? abstractC11919ec.hashCode() : 0) * 31;
        String str = this.f28780;
        if (str != null) {
            int i5 = f28778 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
            f28777 = i5 % 128;
            int i6 = i5 % 2;
            int iHashCode2 = str.hashCode();
            if (i6 == 0) {
                int i7 = 13 / 0;
            }
            i4 = iHashCode2;
        }
        return iHashCode + i4;
    }

    /* JADX INFO: renamed from: ｋ */
    private static String m30160(String str, int i) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C11943f.f28848) {
            char[] cArrM30189 = C11943f.m30189(f28776, cArr, i);
            C11943f.f28846 = 4;
            while (C11943f.f28846 < cArrM30189.length) {
                C11943f.f28847 = C11943f.f28846 - 4;
                cArrM30189[C11943f.f28846] = (char) (((long) (cArrM30189[C11943f.f28846] ^ cArrM30189[C11943f.f28846 % 4])) ^ (((long) C11943f.f28847) * f28776));
                C11943f.f28846++;
            }
            str2 = new String(cArrM30189, 4, cArrM30189.length - 4);
        }
        return str2;
    }
}
