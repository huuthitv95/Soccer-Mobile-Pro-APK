package com.ironsource.adqualitysdk.sdk.p286i;

import android.os.Process;
import android.text.TextUtils;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ew */
/* JADX INFO: loaded from: classes6.dex */
public final class C11939ew extends AbstractC11927ek {

    /* JADX INFO: renamed from: ﻐ */
    private static int f28831 = 1;

    /* JADX INFO: renamed from: ﻛ */
    private static char f28832 = 1;

    /* JADX INFO: renamed from: ｋ */
    private static int f28833;

    /* JADX INFO: renamed from: ﾇ */
    private static char[] f28834 = {'-'};

    public C11939ew(AbstractC11919ec abstractC11919ec, AbstractC11919ec abstractC11919ec2, C11904do c11904do) {
        super(abstractC11919ec, abstractC11919ec2, c11904do);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0024, code lost:
    
        if ((r6 instanceof java.lang.Double) != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        if ((r5 instanceof java.lang.Long) != false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
    
        r1 = r1 + 65;
        com.ironsource.adqualitysdk.sdk.p286i.C11939ew.f28831 = r1 % 128;
        r2 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0033, code lost:
    
        if ((r1 % 2) == 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        if ((!(r6 instanceof java.lang.Long)) == true) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003c, code lost:
    
        r5 = java.lang.Integer.valueOf(r5.intValue() - r6.intValue());
        r6 = com.ironsource.adqualitysdk.sdk.p286i.C11939ew.f28833 + 3;
        com.ironsource.adqualitysdk.sdk.p286i.C11939ew.f28831 = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if ((r6 % 2) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        super.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0058, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
    
        r5 = r6 instanceof java.lang.Long;
        super.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
    
        return java.lang.Long.valueOf(r5.longValue() - r6.longValue());
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001f, code lost:
    
        if ((r6 instanceof java.lang.Double) != false) goto L28;
     */
    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11927ek
    /* JADX INFO: renamed from: ﾇ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Number mo30172(java.lang.Number r5, java.lang.Number r6) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.ironsource.adqualitysdk.sdk.p286i.C11939ew.f28833
            int r1 = r1 + 109
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.p286i.C11939ew.f28831 = r2
            int r1 = r1 % r0
            boolean r1 = r5 instanceof java.lang.Double
            if (r1 != 0) goto L6d
            int r2 = r2 + 47
            int r1 = r2 % 128
            com.ironsource.adqualitysdk.sdk.p286i.C11939ew.f28833 = r1
            int r2 = r2 % r0
            if (r2 == 0) goto L22
            boolean r2 = r6 instanceof java.lang.Double
            r3 = 71
            int r3 = r3 / 0
            if (r2 == 0) goto L27
            goto L6d
        L22:
            boolean r2 = r6 instanceof java.lang.Double
            if (r2 == 0) goto L27
            goto L6d
        L27:
            boolean r2 = r5 instanceof java.lang.Long
            if (r2 != 0) goto L5f
            int r1 = r1 + 65
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.p286i.C11939ew.f28831 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L59
            boolean r1 = r6 instanceof java.lang.Long
            r3 = 1
            r1 = r1 ^ r3
            if (r1 == r3) goto L3c
            goto L5f
        L3c:
            int r5 = r5.intValue()
            int r6 = r6.intValue()
            int r5 = r5 - r6
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            int r6 = com.ironsource.adqualitysdk.sdk.p286i.C11939ew.f28833
            int r6 = r6 + 3
            int r1 = r6 % 128
            com.ironsource.adqualitysdk.sdk.p286i.C11939ew.f28831 = r1
            int r6 = r6 % r0
            if (r6 == 0) goto L55
            return r5
        L55:
            super.hashCode()
            throw r2
        L59:
            boolean r5 = r6 instanceof java.lang.Long
            super.hashCode()
            throw r2
        L5f:
            long r0 = r5.longValue()
            long r5 = r6.longValue()
            long r0 = r0 - r5
            java.lang.Long r5 = java.lang.Long.valueOf(r0)
            return r5
        L6d:
            double r0 = r5.doubleValue()
            double r5 = r6.doubleValue()
            double r0 = r0 - r5
            java.lang.Double r5 = java.lang.Double.valueOf(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p286i.C11939ew.mo30172(java.lang.Number, java.lang.Number):java.lang.Number");
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11922ef
    /* JADX INFO: renamed from: ﾒ */
    public final String mo30164() {
        int i;
        byte capsMode;
        int i2 = 2 % 2;
        int i3 = f28831 + 71;
        f28833 = i3 % 128;
        if (i3 % 2 != 0) {
            i = -Process.getGidForName("");
            capsMode = (byte) (55 % TextUtils.getCapsMode("", 1, 1));
        } else {
            i = -Process.getGidForName("");
            capsMode = (byte) (110 - TextUtils.getCapsMode("", 0, 0));
        }
        String strIntern = m30185("\u009b", i, capsMode).intern();
        int i4 = f28833 + 109;
        f28831 = i4 % 128;
        int i5 = i4 % 2;
        return strIntern;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static String m30185(String str, int i, byte b) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C11970g.f28961) {
            char[] cArr2 = f28834;
            char c = f28832;
            char[] cArr3 = new char[i];
            if (i % 2 != 0) {
                i--;
                cArr3[i] = (char) (cArr[i] - b);
            }
            if (i > 1) {
                C11970g.f28962 = 0;
                while (C11970g.f28962 < i) {
                    C11970g.f28964 = cArr[C11970g.f28962];
                    C11970g.f28965 = cArr[C11970g.f28962 + 1];
                    if (C11970g.f28964 == C11970g.f28965) {
                        cArr3[C11970g.f28962] = (char) (C11970g.f28964 - b);
                        cArr3[C11970g.f28962 + 1] = (char) (C11970g.f28965 - b);
                    } else {
                        C11970g.f28963 = C11970g.f28964 / c;
                        C11970g.f28959 = C11970g.f28964 % c;
                        C11970g.f28966 = C11970g.f28965 / c;
                        C11970g.f28960 = C11970g.f28965 % c;
                        if (C11970g.f28959 == C11970g.f28960) {
                            C11970g.f28963 = ((C11970g.f28963 + c) - 1) % c;
                            C11970g.f28966 = ((C11970g.f28966 + c) - 1) % c;
                            int i2 = (C11970g.f28963 * c) + C11970g.f28959;
                            int i3 = (C11970g.f28966 * c) + C11970g.f28960;
                            cArr3[C11970g.f28962] = cArr2[i2];
                            cArr3[C11970g.f28962 + 1] = cArr2[i3];
                        } else if (C11970g.f28963 == C11970g.f28966) {
                            C11970g.f28959 = ((C11970g.f28959 + c) - 1) % c;
                            C11970g.f28960 = ((C11970g.f28960 + c) - 1) % c;
                            int i4 = (C11970g.f28963 * c) + C11970g.f28959;
                            int i5 = (C11970g.f28966 * c) + C11970g.f28960;
                            cArr3[C11970g.f28962] = cArr2[i4];
                            cArr3[C11970g.f28962 + 1] = cArr2[i5];
                        } else {
                            int i6 = (C11970g.f28963 * c) + C11970g.f28960;
                            int i7 = (C11970g.f28966 * c) + C11970g.f28959;
                            cArr3[C11970g.f28962] = cArr2[i6];
                            cArr3[C11970g.f28962 + 1] = cArr2[i7];
                        }
                    }
                    C11970g.f28962 += 2;
                }
            }
            str2 = new String(cArr3);
        }
        return str2;
    }
}
