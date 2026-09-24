package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.chartboost.sdk.Chartboost;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ge */
/* JADX INFO: loaded from: classes6.dex */
public final class C11975ge extends AbstractC11980gj {

    /* JADX INFO: renamed from: ﮐ */
    private static int f28992 = 1;

    /* JADX INFO: renamed from: ﺙ */
    private static int f28993 = 0;

    /* JADX INFO: renamed from: ﻐ */
    private static int f28994 = -234295307;

    /* JADX INFO: renamed from: ﻛ */
    private static int f28995 = 62;

    /* JADX INFO: renamed from: ｋ */
    private static short[] f28996 = null;

    /* JADX INFO: renamed from: ﾇ */
    private static int f28997 = 392503294;

    /* JADX INFO: renamed from: ﾒ */
    private static byte[] f28998 = {-33, 52, 49, 53, 56, -37, 55, 36, -52, Ascii.DLE, 32, -10, 50, -60, 112, -113, 52, 49, 53, 56, -37, 55, 36, -52, 48, 0, -12, -53, 57, -52, -64, -59, -63, -52, 47, -61, -48, 56, -60};

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﾇ */
    public final String mo30211() {
        int i = 2 % 2;
        int i2 = f28993 + 29;
        f28992 = i2 % 128;
        String strIntern = (i2 % 2 == 0 ? m30225((-392503294) >>> (ViewConfiguration.getWindowTouchSlop() >>> 9), (short) (ViewConfiguration.getScrollDefaultDelay() * Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE), 234295407 >>> (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (byte) (70 >>> (KeyEvent.getMaxKeyCode() * 47)), Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE << (ViewConfiguration.getGlobalActionKeyTimeout() > 1L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 1L ? 0 : -1))) : m30225((ViewConfiguration.getWindowTouchSlop() >> 8) - 392503294, (short) (ViewConfiguration.getScrollDefaultDelay() >> 16), 234295407 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (byte) ((KeyEvent.getMaxKeyCode() >> 16) + 53), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 64)).intern();
        int i3 = f28992 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f28993 = i3 % 128;
        if (i3 % 2 == 0) {
            return strIntern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo30212() {
        int i = 2 % 2;
        int i2 = f28993 + 101;
        int i3 = i2 % 128;
        f28992 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 89;
        f28993 = i5 % 128;
        if (i5 % 2 == 0) {
            return Chartboost.class;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ｋ */
    public final AbstractC11840be mo30210() {
        int i = 2 % 2;
        C11848bm c11848bm = new C11848bm(mo30209());
        int i2 = f28992 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f28993 = i2 % 128;
        int i3 = i2 % 2;
        return c11848bm;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﻛ */
    public final String mo30209() {
        int i = 2 % 2;
        int i2 = f28993 + 53;
        f28992 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m30225((-409280481) - Color.rgb(0, 0, 0), (short) ('0' - AndroidCharacter.getMirror('0')), 234295406 - View.combineMeasuredStates(0, 0), (byte) (TextUtils.getCapsMode("", 0, 0) - 63), (-63) - (ViewConfiguration.getTapTimeout() >> 16)).intern();
        int i4 = f28993 + 51;
        f28992 = i4 % 128;
        int i5 = i4 % 2;
        return strIntern;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static String m30225(int i, short s, int i2, byte b, int i3) {
        String string;
        synchronized (C12086m.f29832) {
            StringBuilder sb = new StringBuilder();
            int i4 = f28995;
            int i5 = i3 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f28998;
                if (bArr != null) {
                    i5 = (byte) (bArr[f28997 + i] + i4);
                } else {
                    i5 = (short) (f28996[f28997 + i] + i4);
                }
            }
            if (i5 > 0) {
                C12086m.f29836 = ((i + i5) - 2) + f28997 + i6;
                C12086m.f29833 = b;
                C12086m.f29837 = (char) (i2 + f28994);
                sb.append(C12086m.f29837);
                C12086m.f29834 = C12086m.f29837;
                C12086m.f29835 = 1;
                while (C12086m.f29835 < i5) {
                    byte[] bArr2 = f28998;
                    if (bArr2 != null) {
                        int i7 = C12086m.f29836;
                        C12086m.f29836 = i7 - 1;
                        C12086m.f29837 = (char) (C12086m.f29834 + (((byte) (bArr2[i7] + s)) ^ C12086m.f29833));
                    } else {
                        short[] sArr = f28996;
                        int i8 = C12086m.f29836;
                        C12086m.f29836 = i8 - 1;
                        C12086m.f29837 = (char) (C12086m.f29834 + (((short) (sArr[i8] + s)) ^ C12086m.f29833));
                    }
                    sb.append(C12086m.f29837);
                    C12086m.f29834 = C12086m.f29837;
                    C12086m.f29835++;
                }
            }
            string = sb.toString();
        }
        return string;
    }
}
