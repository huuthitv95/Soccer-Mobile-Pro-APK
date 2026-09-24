package com.ironsource.adqualitysdk.sdk.p286i;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Calendar;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.jr */
/* JADX INFO: loaded from: classes6.dex */
public class C12069jr {

    /* JADX INFO: renamed from: ﭖ */
    private static int f29711 = 1;

    /* JADX INFO: renamed from: ﱟ */
    private static short[] f29713 = null;

    /* JADX INFO: renamed from: ﱡ */
    private static int f29714 = 1484095025;

    /* JADX INFO: renamed from: ﺙ */
    private static int f29715 = 0;

    /* JADX INFO: renamed from: ｋ */
    private static int f29717 = 14;

    /* JADX INFO: renamed from: ﾒ */
    private static int f29718 = 116247015;

    /* JADX INFO: renamed from: ﻐ */
    private Context f29719;

    /* JADX INFO: renamed from: ﻛ */
    private C11827as f29720;

    /* JADX INFO: renamed from: ﾇ */
    private long f29721;

    /* JADX INFO: renamed from: ﻏ */
    private static byte[] f29716 = {-8, 67, 73, 10, 47, 62, -11, 108, 102, -12, -10, -12, 103, -9, -101, -99, 116, -118, -2, -38, -64, -54, -50, -34, -49, -56, -66, -44, -38, -63, -7, -61, -62, -59, -42, -66, -43, -10, -17, -60, -29};

    /* JADX INFO: renamed from: ﮐ */
    private static int[] f29712 = {-1438618623, 954049866, 271288992, -1476790379, 1454442854, -1511492761, -271392053, 2076449585, -874550256, -439811823, -1416135823, -528540436, -414630812, 1282447610, 187954014, -297429983, 1218151447, -28898111};

    public C12069jr(Context context, C11827as c11827as, long j) {
        this.f29719 = context;
        this.f29720 = c11827as;
        this.f29721 = j;
        new C11985go(context);
    }

    /* JADX INFO: renamed from: ﻛ */
    public JSONObject mo28325(JSONObject jSONObject, boolean z, boolean z2, boolean z3) throws JSONException {
        int i = 2 % 2;
        int i2 = f29711 + 95;
        f29715 = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        JSONObject jSONObjectM30816 = C12077jz.m30816(jSONObject == null ? new JSONObject() : jSONObject);
        jSONObjectM30816.put(m30731((ViewConfiguration.getScrollBarFadeDuration() >> 16) - 116247015, (short) ((ViewConfiguration.getTapTimeout() >> 16) - 47), View.MeasureSpec.getSize(0) - 1484094928, (byte) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 16).intern(), this.f29720.m28578());
        String strM28569 = this.f29720.m28569();
        if (!TextUtils.isEmpty(strM28569)) {
            jSONObjectM30816.put(m30730(new int[]{1624718973, 1454870340}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 4).intern(), strM28569);
        }
        if (z2) {
            int i3 = f29711 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
            f29715 = i3 % 128;
            int i4 = i3 % 2;
            if (this.f29721 > 0) {
                jSONObjectM30816.put(m30730(new int[]{1136368932, 981395875}, 5 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern(), this.f29721);
            }
            jSONObjectM30816.put(m30730(new int[]{-1577553005, 1068369933, -61901030, -478064151}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 4).intern(), this.f29720.m28575());
            jSONObjectM30816.put(m30731((-116247009) - TextUtils.getTrimmedLength(""), (short) ((-97) - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), TextUtils.lastIndexOf("", '0', 0, 0) - 1484094924, (byte) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), (-15) - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), this.f29720.m28565());
            jSONObjectM30816.put(m30730(new int[]{248541345, 1058421264}, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 3).intern(), this.f29720.m28576());
            jSONObjectM30816.put(m30731((-116247006) - (Process.myPid() >> 22), (short) (View.combineMeasuredStates(0, 0) - 8), 33396 - AndroidCharacter.getMirror('0'), (byte) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (-14) - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern(), this.f29720.m28568());
            jSONObjectM30816.put(m30731((-116247004) - KeyEvent.keyCodeFromString(""), (short) ((-97) - (ViewConfiguration.getWindowTouchSlop() >> 8)), (-1484094909) - TextUtils.indexOf("", ""), (byte) (KeyEvent.getMaxKeyCode() >> 16), (-15) - (ViewConfiguration.getTapTimeout() >> 16)).intern(), ((double) Calendar.getInstance().getTimeZone().getRawOffset()) / 3600000.0d);
            jSONObjectM30816.put(m30731((-116247003) - TextUtils.indexOf((CharSequence) "", '0', 0), (short) (TextUtils.indexOf("", "") + 114), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 1484094909, (byte) (ViewConfiguration.getFadingEdgeLength() >> 16), (-16) - TextUtils.lastIndexOf("", '0', 0, 0)).intern(), IronSourceAdQuality.getSDKVersion());
            jSONObjectM30816.put(m30730(new int[]{2109156017, -1272012178}, 1 - (ViewConfiguration.getTouchSlop() >> 8)).intern(), C12076jy.m30794());
            jSONObjectM30816.put(m30730(new int[]{1525934720, 1744623290, -1475634380, -1894323427}, 5 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern(), Build.MODEL);
            jSONObjectM30816.put(m30731((-116246997) - (ViewConfiguration.getScrollDefaultDelay() >> 16), (short) (50 - TextUtils.lastIndexOf("", '0', 0)), (-1484094916) - Drawable.resolveOpacity(0, 0), (byte) ExpandableListView.getPackedPositionGroup(0L), (-15) - View.resolveSizeAndState(0, 0, 0)).intern(), Build.MANUFACTURER);
            jSONObjectM30816.put(m30730(new int[]{-1533619723, -668388050, 679995344, 1541114559}, KeyEvent.getDeadChar(0, 0) + 8).intern(), m30731((ViewConfiguration.getScrollBarSize() >> 8) - 116246985, (short) (AndroidCharacter.getMirror('0') + '\b'), (ViewConfiguration.getScrollBarSize() >> 8) - 1484094928, (byte) (ImageFormat.getBitsPerPixel(0) + 1), (-15) - Color.argb(0, 0, 0, 0)).intern());
            jSONObjectM30816.put(m30730(new int[]{-234332142, 309906683}, 4 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern(), C12074jw.m30761());
            C12076jy.m30796(this.f29719, jSONObjectM30816);
            C12074jw.m30775(this.f29719, jSONObjectM30816);
            C12074jw.m30776(this.f29719, jSONObjectM30816, z3);
            C12074jw.m30769(jSONObjectM30816);
            C12074jw.m30760(jSONObjectM30816);
            jSONObjectM30816.put(m30731((-116246979) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (short) (38 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 1484094915, (byte) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), View.resolveSize(0, 0) - 15).intern(), z);
            C12074jw.m30759(this.f29719, jSONObjectM30816);
            C12074jw.m30778(jSONObjectM30816);
            try {
                JSONObject jSONObject2 = new JSONObject(this.f29720.m28566());
                jSONObject2.remove(m30730(new int[]{-1299449894, -1739200165, 372418675, 1246618855, 1916139043, -1887240978, 1521391681, 817497927}, 13 - (ViewConfiguration.getScrollBarSize() >> 8)).intern());
                if (jSONObject2.length() > 0) {
                    int i5 = f29715 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
                    f29711 = i5 % 128;
                    int i6 = i5 % 2;
                    jSONObjectM30816.putOpt(m30730(new int[]{618820, -1998277438}, Color.rgb(0, 0, 0) + 16777220).intern(), jSONObject2);
                }
            } catch (Exception e) {
                C12085l.m30922(m30730(new int[]{-401695718, -1457840411, -245129921, 236430093, 1176286346, -1655680041, -1957410374, 992865241, -346144382, -867249972, -1195887415, -323854566, -1910830498, 126022807}, TextUtils.indexOf("", "", 0, 0) + 25).intern(), m30730(new int[]{1656093771, -1326217244, -1282530399, 2123923806, 820029736, -1450162908, -1111226807, 1669400842, -11251320, -1646763449, 712051763, 938694481, 618241035, -675893310, 1072838729, -302835838, -945688323, -147519589}, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 35).intern(), e);
            }
        }
        int i7 = f29715 + 91;
        f29711 = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 84 / 0;
        }
        return jSONObjectM30816;
    }

    /* JADX INFO: renamed from: ﻐ */
    public final C11827as m30732() {
        int i = 2 % 2;
        int i2 = f29711 + 31;
        f29715 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.f29720;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    private static String m30731(int i, short s, int i2, byte b, int i3) {
        String string;
        synchronized (C12086m.f29832) {
            StringBuilder sb = new StringBuilder();
            int i4 = f29717;
            int i5 = i3 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f29716;
                if (bArr != null) {
                    i5 = (byte) (bArr[f29718 + i] + i4);
                } else {
                    i5 = (short) (f29713[f29718 + i] + i4);
                }
            }
            if (i5 > 0) {
                C12086m.f29836 = ((i + i5) - 2) + f29718 + i6;
                C12086m.f29833 = b;
                C12086m.f29837 = (char) (i2 + f29714);
                sb.append(C12086m.f29837);
                C12086m.f29834 = C12086m.f29837;
                C12086m.f29835 = 1;
                while (C12086m.f29835 < i5) {
                    byte[] bArr2 = f29716;
                    if (bArr2 != null) {
                        int i7 = C12086m.f29836;
                        C12086m.f29836 = i7 - 1;
                        C12086m.f29837 = (char) (C12086m.f29834 + (((byte) (bArr2[i7] + s)) ^ C12086m.f29833));
                    } else {
                        short[] sArr = f29713;
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

    /* JADX INFO: renamed from: ﻛ */
    private static String m30730(int[] iArr, int i) {
        String str;
        synchronized (C11835b.f27464) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f29712.clone();
            C11835b.f27462 = 0;
            while (C11835b.f27462 < iArr.length) {
                cArr[0] = (char) (iArr[C11835b.f27462] >> 16);
                cArr[1] = (char) iArr[C11835b.f27462];
                cArr[2] = (char) (iArr[C11835b.f27462 + 1] >> 16);
                cArr[3] = (char) iArr[C11835b.f27462 + 1];
                C11835b.f27463 = (cArr[0] << 16) + cArr[1];
                C11835b.f27461 = (cArr[2] << 16) + cArr[3];
                C11835b.m28718(iArr2);
                for (int i2 = 0; i2 < 16; i2++) {
                    int i3 = C11835b.f27463 ^ iArr2[i2];
                    C11835b.f27463 = i3;
                    C11835b.f27461 = C11835b.m28717(i3) ^ C11835b.f27461;
                    int i4 = C11835b.f27463;
                    C11835b.f27463 = C11835b.f27461;
                    C11835b.f27461 = i4;
                }
                int i5 = C11835b.f27463;
                C11835b.f27463 = C11835b.f27461;
                C11835b.f27461 = i5;
                C11835b.f27461 = i5 ^ iArr2[16];
                C11835b.f27463 ^= iArr2[17];
                int i6 = C11835b.f27463;
                int i7 = C11835b.f27461;
                cArr[0] = (char) (C11835b.f27463 >>> 16);
                cArr[1] = (char) C11835b.f27463;
                cArr[2] = (char) (C11835b.f27461 >>> 16);
                cArr[3] = (char) C11835b.f27461;
                C11835b.m28718(iArr2);
                cArr2[C11835b.f27462 << 1] = cArr[0];
                cArr2[(C11835b.f27462 << 1) + 1] = cArr[1];
                cArr2[(C11835b.f27462 << 1) + 2] = cArr[2];
                cArr2[(C11835b.f27462 << 1) + 3] = cArr[3];
                C11835b.f27462 += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}
