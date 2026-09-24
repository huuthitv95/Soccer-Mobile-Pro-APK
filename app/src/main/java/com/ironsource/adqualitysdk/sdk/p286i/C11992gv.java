package com.ironsource.adqualitysdk.sdk.p286i;

import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.tapjoy.Tapjoy;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.gv */
/* JADX INFO: loaded from: classes6.dex */
public final class C11992gv extends AbstractC11980gj {

    /* JADX INFO: renamed from: ﺙ */
    private static int f29072 = 0;

    /* JADX INFO: renamed from: ﻏ */
    private static int f29073 = 1;

    /* JADX INFO: renamed from: ﻐ */
    private static short[] f29074 = null;

    /* JADX INFO: renamed from: ﻛ */
    private static int f29075 = 124;

    /* JADX INFO: renamed from: ｋ */
    private static byte[] f29076 = {-107, 116, 123, -124, 113, 115, 88, -53, 116, 123, -124, 113, -109, 56, -65, -128, 114, -118, 43, 36, -37, 46, -52};

    /* JADX INFO: renamed from: ﾇ */
    private static int f29077 = -28890249;

    /* JADX INFO: renamed from: ﾒ */
    private static int f29078 = 1637849733;

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﾇ */
    public final String mo30211() {
        int i = 2 % 2;
        int i2 = f29072 + 41;
        f29073 = i2 % 128;
        int i3 = i2 % 2;
        String strIntern = m30245((Process.myTid() >> 22) - 1637849733, (short) (ViewConfiguration.getKeyRepeatDelay() >> 16), Gravity.getAbsoluteGravity(0, 0) + 28890348, (byte) (174 - AndroidCharacter.getMirror('0')), View.MeasureSpec.getMode(0) - 125).intern();
        int i4 = f29073 + 67;
        f29072 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 95 / 0;
        }
        return strIntern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo30212() {
        Class<Tapjoy> cls;
        int i = 2 % 2;
        int i2 = f29072 + 87;
        int i3 = i2 % 128;
        f29073 = i3;
        if (i2 % 2 == 0) {
            cls = Tapjoy.class;
            int i4 = 63 / 0;
        } else {
            cls = Tapjoy.class;
        }
        int i5 = i3 + 37;
        f29072 = i5 % 128;
        int i6 = i5 % 2;
        return cls;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ｋ */
    public final AbstractC11840be mo30210() {
        int i = 2 % 2;
        C11865cc c11865cc = new C11865cc(mo30209());
        int i2 = f29073 + 39;
        f29072 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 33 / 0;
        }
        return c11865cc;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﻛ */
    public final String mo30209() {
        int i = 2 % 2;
        int i2 = f29073 + 103;
        f29072 = i2 % 128;
        return (i2 % 2 != 0 ? m30245(ExpandableListView.getPackedPositionType(1L) * (-1637849716), (short) TextUtils.indexOf("", "", 0, 1), 28890364 % ExpandableListView.getPackedPositionChild(1L), (byte) (KeyEvent.getDeadChar(0, 1) + 85), 88 - TextUtils.indexOf("", "")) : m30245(ExpandableListView.getPackedPositionType(0L) - 1637849716, (short) TextUtils.indexOf("", "", 0, 0), 28890364 - ExpandableListView.getPackedPositionChild(0L), (byte) (33 - KeyEvent.getDeadChar(0, 0)), (-125) - TextUtils.indexOf("", ""))).intern();
    }

    /* JADX INFO: renamed from: ﻛ */
    private static String m30245(int i, short s, int i2, byte b, int i3) {
        String string;
        synchronized (C12086m.f29832) {
            StringBuilder sb = new StringBuilder();
            int i4 = f29075;
            int i5 = i3 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f29076;
                if (bArr != null) {
                    i5 = (byte) (bArr[f29078 + i] + i4);
                } else {
                    i5 = (short) (f29074[f29078 + i] + i4);
                }
            }
            if (i5 > 0) {
                C12086m.f29836 = ((i + i5) - 2) + f29078 + i6;
                C12086m.f29833 = b;
                C12086m.f29837 = (char) (i2 + f29077);
                sb.append(C12086m.f29837);
                C12086m.f29834 = C12086m.f29837;
                C12086m.f29835 = 1;
                while (C12086m.f29835 < i5) {
                    byte[] bArr2 = f29076;
                    if (bArr2 != null) {
                        int i7 = C12086m.f29836;
                        C12086m.f29836 = i7 - 1;
                        C12086m.f29837 = (char) (C12086m.f29834 + (((byte) (bArr2[i7] + s)) ^ C12086m.f29833));
                    } else {
                        short[] sArr = f29074;
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
