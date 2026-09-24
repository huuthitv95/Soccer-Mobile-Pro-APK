package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.vungle.ads.internal.protos.Sdk;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ej */
/* JADX INFO: loaded from: classes6.dex */
public final class C11926ej extends AbstractC11925ei {

    /* JADX INFO: renamed from: ﻛ */
    private static int f28802 = 1;

    /* JADX INFO: renamed from: ｋ */
    private static int f28803 = 137;

    /* JADX INFO: renamed from: ﾒ */
    private static int f28804;

    /* JADX INFO: renamed from: ﾇ */
    private AbstractC11919ec f28805;

    public C11926ej(AbstractC11919ec abstractC11919ec, AbstractC11919ec abstractC11919ec2, AbstractC11919ec abstractC11919ec3, C11904do c11904do) {
        super(abstractC11919ec, abstractC11919ec2, c11904do);
        this.f28805 = abstractC11919ec3;
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x017f: RETURN (r5 I:com.ironsource.adqualitysdk.sdk.i.ds), block:B:39:0x017f */
    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11919ec
    /* JADX INFO: renamed from: ﾇ */
    public final C11908ds mo30123(C11907dr c11907dr, C11877co c11877co) {
        C11908ds c11908ds;
        int i = 2 % 2;
        int i2 = f28802 + 49;
        f28804 = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 != 0) {
                m30168().m30156(c11907dr, c11877co);
                m30171().m30156(c11907dr, c11877co);
                boolean z = m30169().m30156(c11907dr, c11877co).m30066() instanceof JSONObject;
                super.hashCode();
                throw null;
            }
            C11908ds c11908dsM30156 = m30168().m30156(c11907dr, c11877co);
            C11908ds c11908dsM30157 = m30171().m30156(c11907dr, c11877co);
            Object objM30066 = m30169().m30156(c11907dr, c11877co).m30066();
            if (objM30066 instanceof JSONObject) {
                int i3 = f28802 + 107;
                f28804 = i3 % 128;
                int i4 = i3 % 2;
                ((JSONObject) objM30066).put((String) c11908dsM30156.m30066(), c11908dsM30157.m30066());
                return c11908dsM30157;
            }
            if (objM30066 instanceof JSONArray) {
                ((JSONArray) objM30066).put(c11908dsM30156.m30063().intValue(), c11908dsM30157.m30066());
                return c11908dsM30157;
            }
            if (!(!(objM30066 instanceof Map))) {
                ((Map) objM30066).put(c11908dsM30156.m30066(), c11908dsM30157.m30066());
                return c11908dsM30157;
            }
            if (objM30066 instanceof List) {
                int i5 = f28802 + 103;
                f28804 = i5 % 128;
                int i6 = i5 % 2;
                ((List) objM30066).set(c11908dsM30156.m30063().intValue(), c11908dsM30157.m30066());
                return c11908dsM30157;
            }
            if (objM30066.getClass().isArray()) {
                ((Object[]) objM30066)[c11908dsM30156.m30063().intValue()] = c11908dsM30157.m30066();
                return c11908dsM30157;
            }
            String strM29666 = c11877co.m29666();
            StringBuilder sb = new StringBuilder();
            sb.append(m30170("\u0013\u0002ﾽ\u000f\f\u000f\u000f￢ﾽ\u000b\f\u0006\u0010\u0010\u0002\u000f\r\u0015\u0002ﾽ\u0011\u0012\rﾽ\u0011\r\u0006\u000f\u0000\u0010\uffff\u0012\u0010ﾽ\u0004\u000b\u0006\u0011\ufffe\u0012\t\ufffe", (KeyEvent.getMaxKeyCode() >> 16) + 42, true, Color.green(0) + 8, 236 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern());
            sb.append(this);
            sb.append(m30154());
            sb.append(m30170("ￄ\u0019\u0012\u0017\u0019\u0014\u0014\u0013\u0016\u0018\t\bￄ\u0013\u0006\u000e\t\u0007\u0018ￄ\uffdeￄ\u0018\u0016\u001d\r\u0012\u000bￄ\u0018\u0013ￄ\u0019\u0017\tￄ\uffff\u0001ￄ\u0013\u0012", View.resolveSize(0, 0) + 41, false, (ViewConfiguration.getJumpTapTimeout() >> 16) + 20, 228 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern());
            sb.append(objM30066);
            C11875cm.m29607(strM29666, sb.toString(), null);
            int i7 = f28802 + 35;
            f28804 = i7 % 128;
            int i8 = i7 % 2;
            return c11908dsM30157;
        } catch (Exception e) {
            String strM29667 = c11877co.m29666();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m30170("\u0013\u0002ﾽ\u000f\f\u000f\u000f￢ﾽ\u000b\f\u0006\u0010\u0010\u0002\u000f\r\u0015\u0002ﾽ\u0011\u0012\rﾽ\u0011\r\u0006\u000f\u0000\u0010\uffff\u0012\u0010ﾽ\u0004\u000b\u0006\u0011\ufffe\u0012\t\ufffe", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 42, true, 8 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 235).intern());
            sb2.append(this);
            sb2.append(m30154());
            C11875cm.m29607(strM29667, sb2.toString(), e);
            return c11908ds;
        }
    }

    /* JADX INFO: renamed from: ﾒ */
    private AbstractC11919ec m30171() {
        int i = 2 % 2;
        int i2 = f28802 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        int i3 = i2 % 128;
        f28804 = i3;
        int i4 = i2 % 2;
        AbstractC11919ec abstractC11919ec = this.f28805;
        int i5 = i3 + 103;
        f28802 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 57 / 0;
        }
        return abstractC11919ec;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11925ei
    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(m30170("\ufff7\u0014\ufff7", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2, true, 3 - Color.blue(0), ((byte) KeyEvent.getModifierMetaStateMask()) + 179).intern());
        sb.append(m30171().toString());
        String string = sb.toString();
        int i2 = f28804 + 69;
        f28802 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 78 / 0;
        }
        return string;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        r1 = r1 + 17;
        com.ironsource.adqualitysdk.sdk.p286i.C11926ej.f28802 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0022, code lost:
    
        if ((r1 % 2) != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0024, code lost:
    
        r5 = 47 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        if (getClass() == r7.getClass()) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003a, code lost:
    
        if (getClass() == r7.getClass()) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0041, code lost:
    
        if (super.equals(r7) == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0043, code lost:
    
        r1 = r6.f28805;
        r7 = ((com.ironsource.adqualitysdk.sdk.p286i.C11926ej) r7).f28805;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0049, code lost:
    
        if (r1 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004f, code lost:
    
        return r1.equals(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
    
        if (r7 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        r7 = com.ironsource.adqualitysdk.sdk.p286i.C11926ej.f28804 + 105;
        com.ironsource.adqualitysdk.sdk.p286i.C11926ej.f28802 = r7 % 128;
        r7 = r7 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005b, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0013, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0016, code lost:
    
        if (r6 == r7) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0018, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        if (r7 == null) goto L27;
     */
    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11925ei
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.ironsource.adqualitysdk.sdk.p286i.C11926ej.f28804
            int r2 = r1 + 87
            int r3 = r2 % 128
            com.ironsource.adqualitysdk.sdk.p286i.C11926ej.f28802 = r3
            int r2 = r2 % r0
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L16
            r2 = 41
            int r2 = r2 / r4
            if (r6 != r7) goto L19
            goto L18
        L16:
            if (r6 != r7) goto L19
        L18:
            return r3
        L19:
            if (r7 == 0) goto L5c
            int r1 = r1 + 17
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.p286i.C11926ej.f28802 = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L32
            java.lang.Class r1 = r6.getClass()
            java.lang.Class r2 = r7.getClass()
            r5 = 47
            int r5 = r5 / r4
            if (r1 == r2) goto L3d
            goto L5c
        L32:
            java.lang.Class r1 = r6.getClass()
            java.lang.Class r2 = r7.getClass()
            if (r1 == r2) goto L3d
            goto L5c
        L3d:
            boolean r1 = super.equals(r7)
            if (r1 == 0) goto L5c
            com.ironsource.adqualitysdk.sdk.i.ej r7 = (com.ironsource.adqualitysdk.sdk.p286i.C11926ej) r7
            com.ironsource.adqualitysdk.sdk.i.ec r1 = r6.f28805
            com.ironsource.adqualitysdk.sdk.i.ec r7 = r7.f28805
            if (r1 == 0) goto L50
            boolean r7 = r1.equals(r7)
            return r7
        L50:
            if (r7 != 0) goto L5c
            int r7 = com.ironsource.adqualitysdk.sdk.p286i.C11926ej.f28804
            int r7 = r7 + 105
            int r1 = r7 % 128
            com.ironsource.adqualitysdk.sdk.p286i.C11926ej.f28802 = r1
            int r7 = r7 % r0
            return r3
        L5c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p286i.C11926ej.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Code duplicated, block: B:10:0x002a A[PHI: r1
  0x002a: PHI (r1v9 int) = (r1v5 int), (r1v11 int) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:12:0x0035  */
    /* JADX WARN: Code duplicated, block: B:9:0x0023 A[PHI: r1
  0x0023: PHI (r1v6 int) = (r1v5 int), (r1v11 int) binds: [B:8:0x0021, B:5:0x0016] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11925ei
    public final int hashCode() {
        int iHashCode;
        int iHashCode2;
        int i;
        int i2 = 2 % 2;
        int i3 = f28804 + 49;
        f28802 = i3 % 128;
        if (i3 % 2 != 0) {
            iHashCode = super.hashCode() * 31;
            if (this.f28805 != null) {
                iHashCode2 = this.f28805.hashCode();
            } else {
                i = f28802 + 57;
                f28804 = i % 128;
                if (i % 2 != 0) {
                    int i4 = 4 % 3;
                }
                iHashCode2 = 0;
            }
        } else {
            iHashCode = super.hashCode() / 4;
            if (this.f28805 != null) {
                iHashCode2 = this.f28805.hashCode();
            } else {
                i = f28802 + 57;
                f28804 = i % 128;
                if (i % 2 != 0) {
                    int i5 = 4 % 3;
                }
                iHashCode2 = 0;
            }
        }
        return iHashCode + iHashCode2;
    }

    /* JADX INFO: renamed from: ｋ */
    private static String m30170(String str, int i, boolean z, int i2, int i3) {
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
                cArr2[i4] = (char) (cArr2[i4] - f28803);
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
