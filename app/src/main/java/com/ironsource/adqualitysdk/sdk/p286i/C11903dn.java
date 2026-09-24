package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import kotlin.p300io.encoding.Base64;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.dn */
/* JADX INFO: loaded from: classes6.dex */
public final class C11903dn {

    /* JADX INFO: renamed from: ﭴ */
    private static int f28622 = 1;

    /* JADX INFO: renamed from: ﭸ */
    private static int f28623 = 0;

    /* JADX INFO: renamed from: ﮐ */
    private static short[] f28624 = null;

    /* JADX INFO: renamed from: ﱟ */
    private static int f28625 = -96985228;

    /* JADX INFO: renamed from: ﱡ */
    private static int f28626 = 1396835681;

    /* JADX INFO: renamed from: ﺙ */
    private static byte[] f28627 = {-64, -117, 115, -122, -119, 105, 125, -65, 36, -39, -37, 37, -41, -66, 102, 119, 117, -102, -64, -61, 45, 34, -59, 44, 63, -61, Base64.padSymbol, -3, -5, -22, -24, 39, -12, -26, -22};

    /* JADX INFO: renamed from: ﻏ */
    private static int f28628 = 71;

    /* JADX INFO: renamed from: ﻐ */
    private String f28629;

    /* JADX INFO: renamed from: ﻛ */
    private boolean f28630;

    /* JADX INFO: renamed from: ｋ */
    private String f28631;

    /* JADX INFO: renamed from: ﾇ */
    private String f28632;

    /* JADX INFO: renamed from: ﾒ */
    private String f28633;

    public C11903dn(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f28629 = jSONObject.optString(m30030(KeyEvent.normalizeMetaState(0) - 1396835681, (short) (ViewConfiguration.getScrollBarSize() >> 8), 96985346 - TextUtils.indexOf((CharSequence) "", '0'), (byte) ((-122) - Color.alpha(0)), (-72) - KeyEvent.getDeadChar(0, 0)).intern());
            this.f28632 = jSONObject.optString(m30030((ViewConfiguration.getEdgeSlop() >> 16) - 1396835674, (short) ExpandableListView.getPackedPositionGroup(0L), View.MeasureSpec.getSize(0) + 96985327, (byte) ((ViewConfiguration.getEdgeSlop() >> 16) - 37), Drawable.resolveOpacity(0, 0) - 72).intern());
            this.f28633 = jSONObject.optString(m30030((-1396835667) - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (short) ('0' - AndroidCharacter.getMirror('0')), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 96985328, (byte) ((ViewConfiguration.getLongPressTimeout() >> 16) - 119), (-72) - Color.green(0)).intern());
            this.f28631 = jSONObject.optString(m30030(View.resolveSize(0, 0) - 1396835663, (short) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 96985347 - TextUtils.getCapsMode("", 0, 0), (byte) ((-47) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), (-72) - KeyEvent.keyCodeFromString("")).intern());
            this.f28630 = jSONObject.optBoolean(m30030((-1396835657) - MotionEvent.axisFromString(""), (short) KeyEvent.getDeadChar(0, 0), 96985345 - View.resolveSize(0, 0), (byte) (20 - TextUtils.indexOf("", "", 0)), (-72) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern());
        }
    }

    /* JADX INFO: renamed from: ﻐ */
    public final String m30031() {
        int i = 2 % 2;
        int i2 = f28623;
        int i3 = i2 + 5;
        f28622 = i3 % 128;
        int i4 = i3 % 2;
        String str = this.f28629;
        int i5 = i2 + 111;
        f28622 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 25 / 0;
        }
        return str;
    }

    /* JADX INFO: renamed from: ﾇ */
    public final String m30034() {
        int i = 2 % 2;
        int i2 = f28622 + 75;
        f28623 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.f28632;
        if (i3 != 0) {
            int i4 = 35 / 0;
        }
        return str;
    }

    /* JADX INFO: renamed from: ｋ */
    public final String m30033() {
        String str;
        int i = 2 % 2;
        int i2 = f28623 + 79;
        int i3 = i2 % 128;
        f28622 = i3;
        if (i2 % 2 == 0) {
            str = this.f28633;
            int i4 = 41 / 0;
        } else {
            str = this.f28633;
        }
        int i5 = i3 + 1;
        f28623 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ﻛ */
    public final String m30032() {
        int i = 2 % 2;
        int i2 = f28623;
        int i3 = i2 + 41;
        f28622 = i3 % 128;
        if (i3 % 2 == 0) {
            throw null;
        }
        String str = this.f28631;
        int i4 = i2 + 29;
        f28622 = i4 % 128;
        if (i4 % 2 != 0) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ */
    public final boolean m30035() {
        boolean z;
        int i = 2 % 2;
        int i2 = f28623 + 97;
        int i3 = i2 % 128;
        f28622 = i3;
        if (i2 % 2 == 0) {
            z = this.f28630;
            int i4 = 49 / 0;
        } else {
            z = this.f28630;
        }
        int i5 = i3 + 21;
        f28623 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 39 / 0;
        }
        return z;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m30030(int i, short s, int i2, byte b, int i3) {
        String string;
        synchronized (C12086m.f29832) {
            StringBuilder sb = new StringBuilder();
            int i4 = f28628;
            int i5 = i3 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f28627;
                if (bArr != null) {
                    i5 = (byte) (bArr[f28626 + i] + i4);
                } else {
                    i5 = (short) (f28624[f28626 + i] + i4);
                }
            }
            if (i5 > 0) {
                C12086m.f29836 = ((i + i5) - 2) + f28626 + i6;
                C12086m.f29833 = b;
                C12086m.f29837 = (char) (i2 + f28625);
                sb.append(C12086m.f29837);
                C12086m.f29834 = C12086m.f29837;
                C12086m.f29835 = 1;
                while (C12086m.f29835 < i5) {
                    byte[] bArr2 = f28627;
                    if (bArr2 != null) {
                        int i7 = C12086m.f29836;
                        C12086m.f29836 = i7 - 1;
                        C12086m.f29837 = (char) (C12086m.f29834 + (((byte) (bArr2[i7] + s)) ^ C12086m.f29833));
                    } else {
                        short[] sArr = f28624;
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
