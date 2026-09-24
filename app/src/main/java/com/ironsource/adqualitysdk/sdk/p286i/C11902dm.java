package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.media3.common.PlaybackException;
import com.google.common.base.Ascii;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.dm */
/* JADX INFO: loaded from: classes6.dex */
public final class C11902dm {

    /* JADX INFO: renamed from: ﮐ */
    private static int f28612 = 0;

    /* JADX INFO: renamed from: ﱟ */
    private static short[] f28613 = null;

    /* JADX INFO: renamed from: ﱡ */
    private static int f28614 = 1;

    /* JADX INFO: renamed from: ﺙ */
    private static int f28615 = 946946527;

    /* JADX INFO: renamed from: ﻏ */
    private static byte[] f28616 = {77, 32, Ascii.f22494GS, 86, 56, 42, 71, 84, Ascii.CAN, -40, -27, -23, -74, -32, -52, -29, -40, -64, -114, -63, -106, -51, 0, 0, 0};

    /* JADX INFO: renamed from: ﻐ */
    private static int f28617 = 28;

    /* JADX INFO: renamed from: ｋ */
    private static int f28618 = -1291317942;

    /* JADX INFO: renamed from: ﻛ */
    private boolean f28619;

    /* JADX INFO: renamed from: ﾇ */
    private String f28620;

    /* JADX INFO: renamed from: ﾒ */
    private boolean f28621;

    public C11902dm(JSONObject jSONObject) {
        this.f28621 = jSONObject.optBoolean(m30026((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1291317941, (short) ((ViewConfiguration.getTapTimeout() >> 16) + 73), (ViewConfiguration.getPressedStateDuration() >> 16) - 946946418, (byte) (TextUtils.getOffsetBefore("", 0) + PlaybackException.ERROR_CODE_SKIP_LIMIT_REACHED), TextUtils.getCapsMode("", 0, 0) - 18).intern());
        this.f28619 = jSONObject.optBoolean(m30026(1291317952 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (short) (TextUtils.lastIndexOf("", '0', 0) - 87), (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 946946430, (byte) ((-122) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 20).intern());
        this.f28620 = C11914dy.m30142(jSONObject.optString(m30026(1291317958 - MotionEvent.axisFromString(""), (short) ((-46) - (ViewConfiguration.getPressedStateDuration() >> 16)), (-946946418) - (ViewConfiguration.getKeyRepeatDelay() >> 16), (byte) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 103), Color.blue(0) - 22).intern()));
    }

    /* JADX INFO: renamed from: ﾒ */
    public final boolean m30029() {
        int i = 2 % 2;
        int i2 = f28614;
        int i3 = i2 + 13;
        f28612 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.f28621;
        int i5 = i2 + 3;
        f28612 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    /* JADX INFO: renamed from: ﾇ */
    public final boolean m30028() {
        int i = 2 % 2;
        int i2 = f28612 + 55;
        int i3 = i2 % 128;
        f28614 = i3;
        int i4 = i2 % 2;
        boolean z = this.f28619;
        int i5 = i3 + 111;
        f28612 = i5 % 128;
        if (i5 % 2 == 0) {
            return z;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    public final String m30027() {
        int i = 2 % 2;
        int i2 = f28614 + 21;
        int i3 = i2 % 128;
        f28612 = i3;
        int i4 = i2 % 2;
        String str = this.f28620;
        int i5 = i3 + 53;
        f28614 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m30026(int i, short s, int i2, byte b, int i3) {
        String string;
        synchronized (C12086m.f29832) {
            StringBuilder sb = new StringBuilder();
            int i4 = f28617;
            int i5 = i3 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f28616;
                if (bArr != null) {
                    i5 = (byte) (bArr[f28618 + i] + i4);
                } else {
                    i5 = (short) (f28613[f28618 + i] + i4);
                }
            }
            if (i5 > 0) {
                C12086m.f29836 = ((i + i5) - 2) + f28618 + i6;
                C12086m.f29833 = b;
                C12086m.f29837 = (char) (i2 + f28615);
                sb.append(C12086m.f29837);
                C12086m.f29834 = C12086m.f29837;
                C12086m.f29835 = 1;
                while (C12086m.f29835 < i5) {
                    byte[] bArr2 = f28616;
                    if (bArr2 != null) {
                        int i7 = C12086m.f29836;
                        C12086m.f29836 = i7 - 1;
                        C12086m.f29837 = (char) (C12086m.f29834 + (((byte) (bArr2[i7] + s)) ^ C12086m.f29833));
                    } else {
                        short[] sArr = f28613;
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
