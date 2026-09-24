package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.ogury.ad.OguryReward;
import com.vungle.ads.internal.protos.Sdk;
import io.presage.Presage;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.gu */
/* JADX INFO: loaded from: classes6.dex */
public final class C11991gu extends AbstractC11980gj {

    /* JADX INFO: renamed from: ﻛ */
    private static int f29065 = 151;

    /* JADX INFO: renamed from: ﾇ */
    private static int f29066 = 1;

    /* JADX INFO: renamed from: ﾒ */
    private static int f29067;

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﾇ */
    public final String mo30211() {
        int i = 2 % 2;
        int i2 = f29066 + 43;
        f29067 = i2 % 128;
        return (i2 % 2 != 0 ? m30243("\u0012\u0000\u0006\u0004\b\u000eￍ\u000f\u0011\u0004\u0012\u0000\u0006\u0004ￍ\uffef\u0011\u0004", 51 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), true, 4 << TextUtils.getOffsetAfter("", 1), 20756 / (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))) : m30243("\u0012\u0000\u0006\u0004\b\u000eￍ\u000f\u0011\u0004\u0012\u0000\u0006\u0004ￍ\uffef\u0011\u0004", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 17, false, 4 - TextUtils.getOffsetAfter("", 0), 249 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)))).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo30212() {
        int i = 2 % 2;
        int i2 = f29067;
        int i3 = i2 + 5;
        f29066 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 105;
        f29066 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 60 / 0;
        }
        return Presage.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ｋ */
    public final AbstractC11840be mo30210() {
        int i = 2 % 2;
        C11859bx c11859bx = new C11859bx(mo30209());
        int i2 = f29067 + 31;
        f29066 = i2 % 128;
        int i3 = i2 % 2;
        return c11859bx;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﻛ */
    public final String mo30209() {
        int i = 2 % 2;
        int i2 = f29067 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f29066 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m30243("\ufffe\b\u0001\u0004\ufff6", 5 - View.resolveSizeAndState(0, 0, 0), true, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 263).intern();
        int i4 = f29066 + 97;
        f29067 = i4 % 128;
        if (i4 % 2 == 0) {
            return strIntern;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.gu$e */
    public static class e extends AbstractC11980gj {

        /* JADX INFO: renamed from: ﻛ */
        private static int f29068 = 1;

        /* JADX INFO: renamed from: ｋ */
        private static int f29069;

        /* JADX INFO: renamed from: ﾇ */
        private static char[] f29070 = {19696, 21128, 28694, 6113, 13612, 54448, 64094, 39373, 48970, 24233, 31866, 523, 8653, 51000, 59052, 33834, 43937, 18782, 26857, 3690, 11764, 13174, 53529, 61595, 'o', 7699, 15517, 23342, 31145};

        /* JADX INFO: renamed from: ﾒ */
        private static long f29071 = -4241557821898154380L;

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
        /* JADX INFO: renamed from: ﾇ */
        public final String mo30211() {
            int iMyPid;
            char size;
            int iMakeMeasureSpec;
            int i = 2 % 2;
            int i2 = f29068 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
            f29069 = i2 % 128;
            if (i2 % 2 != 0) {
                iMyPid = Process.myPid() % 31;
                size = (char) (21227 >>> View.MeasureSpec.getSize(0));
                iMakeMeasureSpec = 92 << View.MeasureSpec.makeMeasureSpec(0, 0);
            } else {
                iMyPid = Process.myPid() >> 22;
                size = (char) (19603 - View.MeasureSpec.getSize(0));
                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 24;
            }
            String strIntern = m30244(iMyPid, size, iMakeMeasureSpec).intern();
            int i3 = f29069 + 99;
            f29068 = i3 % 128;
            if (i3 % 2 != 0) {
                return strIntern;
            }
            Object obj = null;
            super.hashCode();
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
        /* JADX INFO: renamed from: ﾒ */
        public final Class mo30212() {
            int i = 2 % 2;
            int i2 = f29068;
            int i3 = i2 + 75;
            f29069 = i3 % 128;
            Object obj = null;
            if (i3 % 2 != 0) {
                super.hashCode();
                throw null;
            }
            int i4 = i2 + 63;
            f29069 = i4 % 128;
            if (i4 % 2 == 0) {
                return OguryReward.class;
            }
            super.hashCode();
            throw null;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
        /* JADX INFO: renamed from: ｋ */
        public final AbstractC11840be mo30210() {
            int i = 2 % 2;
            C11863ca c11863ca = new C11863ca(mo30209());
            int i2 = f29068 + 91;
            f29069 = i2 % 128;
            int i3 = i2 % 2;
            return c11863ca;
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
        /* JADX INFO: renamed from: ﻛ */
        public final String mo30209() {
            int gidForName;
            char cRed;
            int iLastIndexOf;
            int i = 2 % 2;
            int i2 = f29069 + 81;
            f29068 = i2 % 128;
            if (i2 % 2 == 0) {
                gidForName = 18 >>> Process.getGidForName("");
                cRed = (char) Color.red(1);
                iLastIndexOf = 3 >>> TextUtils.lastIndexOf("", (char) 22);
            } else {
                gidForName = 23 - Process.getGidForName("");
                cRed = (char) Color.red(0);
                iLastIndexOf = 4 - TextUtils.lastIndexOf("", '0');
            }
            return m30244(gidForName, cRed, iLastIndexOf).intern();
        }

        /* JADX INFO: renamed from: ﾒ */
        private static String m30244(int i, char c, int i2) {
            String str;
            synchronized (C11862c.f28047) {
                char[] cArr = new char[i2];
                C11862c.f28048 = 0;
                while (C11862c.f28048 < i2) {
                    cArr[C11862c.f28048] = (char) ((((long) f29070[C11862c.f28048 + i]) ^ (((long) C11862c.f28048) * f29071)) ^ ((long) c));
                    C11862c.f28048++;
                }
                str = new String(cArr);
            }
            return str;
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    private static String m30243(String str, int i, boolean z, int i2, int i3) {
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
                cArr2[i4] = (char) (cArr2[i4] - f29065);
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
