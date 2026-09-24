package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.PointF;
import android.text.TextUtils;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.eh */
/* JADX INFO: loaded from: classes6.dex */
public final class C11924eh extends AbstractC11919ec {

    /* JADX INFO: renamed from: ﻐ */
    private static char[] f28790 = {'(', ')', '*', '+'};

    /* JADX INFO: renamed from: ﻛ */
    private static int f28791 = 1;

    /* JADX INFO: renamed from: ｋ */
    private static char f28792 = 2;

    /* JADX INFO: renamed from: ﾒ */
    private static int f28793;

    /* JADX INFO: renamed from: ﾇ */
    private AbstractC11919ec f28794;

    public C11924eh(AbstractC11919ec abstractC11919ec, C11904do c11904do) {
        super(c11904do);
        this.f28794 = abstractC11919ec;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11919ec
    /* JADX INFO: renamed from: ﾇ */
    public final C11908ds mo30123(C11907dr c11907dr, C11877co c11877co) {
        C11908ds c11908dsM30156;
        int i = 2 % 2;
        int i2 = f28793 + 77;
        f28791 = i2 % 128;
        if (i2 % 2 == 0) {
            c11908dsM30156 = this.f28794.m30156(c11907dr, c11877co);
            int i3 = 20 / 0;
        } else {
            c11908dsM30156 = this.f28794.m30156(c11907dr, c11877co);
        }
        int i4 = f28791 + 109;
        f28793 = i4 % 128;
        if (i4 % 2 == 0) {
            return c11908dsM30156;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(m30166("8", -TextUtils.lastIndexOf("", '0', 0), (byte) (View.MeasureSpec.makeMeasureSpec(0, 0) + 16)).intern());
        sb.append(this.f28794);
        sb.append(m30166(CampaignEx.JSON_KEY_AD_Q, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1, (byte) (View.combineMeasuredStates(0, 0) + 72)).intern());
        String string = sb.toString();
        int i2 = f28793 + 77;
        f28791 = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            int i2 = f28793 + 115;
            f28791 = i2 % 128;
            if (i2 % 2 == 0) {
                obj.getClass();
                throw null;
            }
            if (getClass() == obj.getClass()) {
                AbstractC11919ec abstractC11919ec = this.f28794;
                AbstractC11919ec abstractC11919ec2 = ((C11924eh) obj).f28794;
                if (abstractC11919ec != null) {
                    return abstractC11919ec.equals(abstractC11919ec2);
                }
                return abstractC11919ec2 == null;
            }
        }
        int i3 = f28793 + 23;
        f28791 = i3 % 128;
        int i4 = i3 % 2;
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if (r1 == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        return r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002c, code lost:
    
        r0.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x002f, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        r3 = r3 + 101;
        com.ironsource.adqualitysdk.sdk.p286i.C11924eh.f28793 = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0037, code lost:
    
        if ((r3 % 2) != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (r7.f28794 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r7.f28794 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        r1 = r1 + 41;
        com.ironsource.adqualitysdk.sdk.p286i.C11924eh.f28791 = r1 % 128;
        r1 = r1 % 2;
        r0 = r7.f28794;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            r7 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.ironsource.adqualitysdk.sdk.p286i.C11924eh.f28793
            int r2 = r1 + 43
            int r3 = r2 % 128
            com.ironsource.adqualitysdk.sdk.p286i.C11924eh.f28791 = r3
            int r2 = r2 % r0
            r4 = 0
            r5 = 0
            if (r2 != 0) goto L18
            com.ironsource.adqualitysdk.sdk.i.ec r2 = r7.f28794
            r6 = 18
            int r6 = r6 / r5
            if (r2 == 0) goto L30
            goto L1c
        L18:
            com.ironsource.adqualitysdk.sdk.i.ec r2 = r7.f28794
            if (r2 == 0) goto L30
        L1c:
            int r1 = r1 + 41
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.p286i.C11924eh.f28791 = r2
            int r1 = r1 % r0
            com.ironsource.adqualitysdk.sdk.i.ec r0 = r7.f28794
            if (r1 == 0) goto L2c
            int r0 = r0.hashCode()
            return r0
        L2c:
            r0.hashCode()
            throw r4
        L30:
            int r3 = r3 + 101
            int r1 = r3 % 128
            com.ironsource.adqualitysdk.sdk.p286i.C11924eh.f28793 = r1
            int r3 = r3 % r0
            if (r3 != 0) goto L3a
            return r5
        L3a:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p286i.C11924eh.hashCode():int");
    }

    /* JADX INFO: renamed from: ﾇ */
    private static String m30166(String str, int i, byte b) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C11970g.f28961) {
            char[] cArr2 = f28790;
            char c = f28792;
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
