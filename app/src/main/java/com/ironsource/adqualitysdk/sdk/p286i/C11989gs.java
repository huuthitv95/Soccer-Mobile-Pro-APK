package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import com.vungle.ads.internal.protos.Sdk;
import net.pubnative.lite.sdk.HyBid;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.gs */
/* JADX INFO: loaded from: classes6.dex */
public final class C11989gs extends AbstractC11980gj {

    /* JADX INFO: renamed from: ﱡ */
    private static int f29055 = 0;

    /* JADX INFO: renamed from: ﻏ */
    private static int f29056 = 1;

    /* JADX INFO: renamed from: ﻐ */
    private static int f29057 = 548036188;

    /* JADX INFO: renamed from: ﻛ */
    private static int f29058 = -1425425183;

    /* JADX INFO: renamed from: ｋ */
    private static byte[] f29059 = {-9, -101, -57, 105, -47, -70, 99, -89, -111, -27, 105, -111, -85, -99, -34, 105, -113, -83, -107, -77, -109, -84, -115, -91, -30, 90, -81, -105, -28, 78, 108, 84, 114, 82, 107, 76, 100};

    /* JADX INFO: renamed from: ﾇ */
    private static int f29060 = 37;

    /* JADX INFO: renamed from: ﾒ */
    private static short[] f29061;

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﾇ */
    public final String mo30211() {
        int i = 2 % 2;
        int i2 = f29056 + 1;
        f29055 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m30241((ViewConfiguration.getLongPressTimeout() >> 16) + 1425425183, (short) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 95), ExpandableListView.getPackedPositionChild(0L) - 548036077, (byte) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), TextUtils.indexOf("", "", 0) - 38).intern();
        int i4 = f29055 + 105;
        f29056 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 90 / 0;
        }
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo30212() {
        int i = 2 % 2;
        int i2 = f29056;
        int i3 = i2 + 11;
        f29055 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 99;
        f29055 = i5 % 128;
        if (i5 % 2 == 0) {
            return HyBid.class;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ｋ */
    public final AbstractC11840be mo30210() {
        int i = 2 % 2;
        C11861bz c11861bz = new C11861bz(mo30209());
        int i2 = f29056 + 37;
        f29055 = i2 % 128;
        int i3 = i2 % 2;
        return c11861bz;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﻛ */
    public final String mo30209() {
        int i = 2 % 2;
        int i2 = f29056 + 51;
        f29055 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m30241(1425425211 - TextUtils.getOffsetBefore("", 0), (short) ((-95) - (ViewConfiguration.getFadingEdgeLength() >> 16)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) - 548036076, (byte) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), (-38) - (Process.myPid() >> 22)).intern();
        int i4 = f29055 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f29056 = i4 % 128;
        int i5 = i4 % 2;
        return strIntern;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static String m30241(int i, short s, int i2, byte b, int i3) {
        String string;
        synchronized (C12086m.f29832) {
            StringBuilder sb = new StringBuilder();
            int i4 = f29060;
            int i5 = i3 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f29059;
                if (bArr != null) {
                    i5 = (byte) (bArr[f29058 + i] + i4);
                } else {
                    i5 = (short) (f29061[f29058 + i] + i4);
                }
            }
            if (i5 > 0) {
                C12086m.f29836 = ((i + i5) - 2) + f29058 + i6;
                C12086m.f29833 = b;
                C12086m.f29837 = (char) (i2 + f29057);
                sb.append(C12086m.f29837);
                C12086m.f29834 = C12086m.f29837;
                C12086m.f29835 = 1;
                while (C12086m.f29835 < i5) {
                    byte[] bArr2 = f29059;
                    if (bArr2 != null) {
                        int i7 = C12086m.f29836;
                        C12086m.f29836 = i7 - 1;
                        C12086m.f29837 = (char) (C12086m.f29834 + (((byte) (bArr2[i7] + s)) ^ C12086m.f29833));
                    } else {
                        short[] sArr = f29061;
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
