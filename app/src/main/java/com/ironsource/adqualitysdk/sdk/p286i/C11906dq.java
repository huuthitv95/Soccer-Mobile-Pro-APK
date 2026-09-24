package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.p300io.encoding.Base64;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.dq */
/* JADX INFO: loaded from: classes6.dex */
public class C11906dq {

    /* JADX INFO: renamed from: ﮐ */
    private static int f28648 = 1;

    /* JADX INFO: renamed from: ﱟ */
    private static byte[] f28649 = {119, 48, -108, -52, -20, -28, -20, 35, 53, 36, Base64.padSymbol, 40, 123, -25, 39, 51, 38, 47, 63, Ascii.f22502US, -128, -34, 49, 43, 48, 91, -67, -124, 50, -123, 42, 33, -121, -25, -97, 92, 38, -102, -23, -103, 96, 63, -116, -13, 98, 88, -105, -107, -11, -106, -111, -100, -13, 33, 88, -111, -33, -112, -25, -100, 41, 4, -61, -45, -75, -68, -66, -62, -49, 110, Ascii.DC4, -61, -81, 126, Ascii.NAK, -61, -70, -71, -56, -56, -78, -51, -79, -127, 0, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ﱡ */
    private static short[] f28650 = null;

    /* JADX INFO: renamed from: ﺙ */
    private static int f28651 = 0;

    /* JADX INFO: renamed from: ﻏ */
    private static int f28652 = 956398482;

    /* JADX INFO: renamed from: ﻛ */
    private static int f28653 = 83;

    /* JADX INFO: renamed from: ｋ */
    private static int f28654 = -2042868703;

    /* JADX INFO: renamed from: ﻐ */
    private AbstractC11961fr f28655;

    /* JADX INFO: renamed from: ﾇ */
    private String f28656;

    /* JADX INFO: renamed from: ﾒ */
    private String[] f28657;

    /* JADX INFO: renamed from: ﾇ */
    public final String m30049() {
        int i = 2 % 2;
        int i2 = f28651 + 7;
        f28648 = i2 % 128;
        int i3 = i2 % 2;
        String str = this.f28656;
        if (i3 == 0) {
            int i4 = 29 / 0;
        }
        return str;
    }

    public C11906dq(String str, String str2, JSONObject jSONObject) {
        this.f28656 = C11914dy.m30142(str2);
        List listM30805 = C12077jz.m30805(jSONObject.optJSONArray(m30047(2042868704 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (short) ((-87) - Color.argb(0, 0, 0, 0)), (Process.myPid() >> 22) - 956398385, (byte) (44 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), Gravity.getAbsoluteGravity(0, 0) - 79).intern()), new C12077jz.a<String>() { // from class: com.ironsource.adqualitysdk.sdk.i.dq.3
            @Override // com.ironsource.adqualitysdk.sdk.p286i.C12077jz.a
            /* JADX INFO: renamed from: ﾒ */
            public final /* synthetic */ String mo28537(JSONArray jSONArray, int i) {
                return C11914dy.m30142(jSONArray.optString(i));
            }
        });
        String[] strArr = new String[listM30805.size()];
        this.f28657 = strArr;
        listM30805.toArray(strArr);
        try {
            this.f28655 = new C11910du(str, str2).m30116(C11909dt.m30067(str, str2, jSONObject.optString(m30047(2042868706 - Color.alpha(0), (short) (22 - Color.alpha(0)), (ViewConfiguration.getLongPressTimeout() >> 16) - 956398384, (byte) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) - 9), (ViewConfiguration.getJumpTapTimeout() >> 16) - 79).intern())));
        } catch (Throwable th) {
            StringBuilder sb = new StringBuilder();
            sb.append(m30047((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2042868709, (short) ((-48) - TextUtils.lastIndexOf("", '0')), View.MeasureSpec.makeMeasureSpec(0, 0) - 956398413, (byte) (1 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), (-62) - Color.blue(0)).intern());
            sb.append(this.f28656);
            C11875cm.m29607(str, sb.toString(), th);
        }
    }

    /* JADX INFO: renamed from: ﾇ */
    public final C11908ds m30048(C11907dr c11907dr, C11877co c11877co, List<Object> list) {
        int i = 2 % 2;
        C11907dr c11907dr2 = new C11907dr(m30046(c11877co, list, Arrays.asList(this.f28657)), c11907dr.m30056());
        AbstractC11961fr abstractC11961fr = this.f28655;
        if (abstractC11961fr == null) {
            String strM29666 = c11877co.m29666();
            StringBuilder sb = new StringBuilder();
            sb.append(m30047(TextUtils.indexOf((CharSequence) "", '0', 0) + 2042868730, (short) ((-90) - ExpandableListView.getPackedPositionGroup(0L)), (-956398405) - Gravity.getAbsoluteGravity(0, 0), (byte) ((-33) - TextUtils.indexOf("", "")), (-76) - (ViewConfiguration.getTouchSlop() >> 8)).intern());
            sb.append(this.f28656);
            sb.append(m30047(2042868735 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), (short) (View.MeasureSpec.makeMeasureSpec(0, 0) + 58), Color.alpha(0) - 956398450, (byte) (View.combineMeasuredStates(0, 0) - 44), (-70) - MotionEvent.axisFromString("")).intern());
            C11875cm.m29607(strM29666, sb.toString(), null);
            int i2 = f28648 + 11;
            f28651 = i2 % 128;
            int i3 = i2 % 2;
            return null;
        }
        int i4 = f28651 + 61;
        f28648 = i4 % 128;
        if (i4 % 2 != 0) {
            return abstractC11961fr.mo30195(c11907dr2, c11877co);
        }
        int i5 = 48 / 0;
        return abstractC11961fr.mo30195(c11907dr2, c11877co);
    }

    /* JADX INFO: renamed from: ﻐ */
    private Map<String, Object> m30046(C11877co c11877co, List<Object> list, List<String> list2) {
        int i = 2 % 2;
        int i2 = f28651 + 51;
        f28648 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 0;
        if (list.size() != list2.size()) {
            String strM29666 = c11877co.m29666();
            StringBuilder sb = new StringBuilder();
            sb.append(this.f28656);
            sb.append(m30047(2042868749 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (short) (65 - TextUtils.indexOf((CharSequence) "", '0')), Color.argb(0, 0, 0, 0) - 956398450, (byte) (Color.red(0) + 38), ExpandableListView.getPackedPositionChild(0L) - 65).intern());
            sb.append(list2.size());
            sb.append(m30047(Color.green(0) + 2042868764, (short) (KeyEvent.getDeadChar(0, 0) + 62), (-956398450) - Color.argb(0, 0, 0, 0), (byte) ((ViewConfiguration.getPressedStateDuration() >> 16) - 2), (-59) - View.resolveSize(0, 0)).intern());
            sb.append(list.size());
            C11875cm.m29607(strM29666, sb.toString(), null);
            return null;
        }
        HashMap map = new HashMap();
        while (i4 < list.size()) {
            int i5 = f28651 + 57;
            f28648 = i5 % 128;
            if (i5 % 2 == 0) {
                map.put(list2.get(i4), list.get(i4));
            } else {
                map.put(list2.get(i4), list.get(i4));
                i4++;
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: ﻛ */
    private static String m30047(int i, short s, int i2, byte b, int i3) {
        String string;
        synchronized (C12086m.f29832) {
            StringBuilder sb = new StringBuilder();
            int i4 = f28653;
            int i5 = i3 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f28649;
                if (bArr != null) {
                    i5 = (byte) (bArr[f28654 + i] + i4);
                } else {
                    i5 = (short) (f28650[f28654 + i] + i4);
                }
            }
            if (i5 > 0) {
                C12086m.f29836 = ((i + i5) - 2) + f28654 + i6;
                C12086m.f29833 = b;
                C12086m.f29837 = (char) (i2 + f28652);
                sb.append(C12086m.f29837);
                C12086m.f29834 = C12086m.f29837;
                C12086m.f29835 = 1;
                while (C12086m.f29835 < i5) {
                    byte[] bArr2 = f28649;
                    if (bArr2 != null) {
                        int i7 = C12086m.f29836;
                        C12086m.f29836 = i7 - 1;
                        C12086m.f29837 = (char) (C12086m.f29834 + (((byte) (bArr2[i7] + s)) ^ C12086m.f29833));
                    } else {
                        short[] sArr = f28650;
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
