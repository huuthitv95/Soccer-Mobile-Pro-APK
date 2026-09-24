package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ea */
/* JADX INFO: loaded from: classes6.dex */
public final class C11917ea extends AbstractC11919ec {

    /* JADX INFO: renamed from: ﮐ */
    private static int f28748 = 0;

    /* JADX INFO: renamed from: ﱟ */
    private static short[] f28749 = null;

    /* JADX INFO: renamed from: ﻏ */
    private static int f28750 = 1;

    /* JADX INFO: renamed from: ﻐ */
    private static int f28751 = -1117361102;

    /* JADX INFO: renamed from: ﻛ */
    private static int f28752 = -712269078;

    /* JADX INFO: renamed from: ｋ */
    private static byte[] f28753 = {-69, -16, 9, Ascii.f22503VT, -21, 86, -78, -1, -4, 9, 74, -71, -7, 5, -11, 0, Ascii.f22499SI, -14, 83, -82, 3, -3, 0, 45, -12, -26, Ascii.SUB, -2, 0, 0, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ﾇ */
    private static int f28754 = 35;

    /* JADX INFO: renamed from: ﾒ */
    private Map<String, AbstractC11919ec> f28755;

    public C11917ea(Map<String, AbstractC11919ec> map, C11904do c11904do) {
        super(c11904do);
        this.f28755 = new HashMap();
        for (String str : map.keySet()) {
            this.f28755.put(C11914dy.m30142(str), map.get(str));
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11919ec
    /* JADX INFO: renamed from: ﾇ */
    public final C11908ds mo30123(C11907dr c11907dr, C11877co c11877co) {
        int i = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        Iterator<String> it = this.f28755.keySet().iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                C11908ds c11908ds = new C11908ds(jSONObject);
                int i2 = f28748 + 11;
                f28750 = i2 % 128;
                if (i2 % 2 != 0) {
                    return c11908ds;
                }
                throw null;
            }
            int i3 = f28748 + 83;
            f28750 = i3 % 128;
            if (i3 % 2 == 0) {
                String next = it.next();
                jSONObject.put(next, this.f28755.get(next).m30156(c11907dr, c11877co).m30066());
                super.hashCode();
                throw null;
            }
            String next2 = it.next();
            try {
                jSONObject.put(next2, this.f28755.get(next2).m30156(c11907dr, c11877co).m30066());
            } catch (JSONException e) {
                String strM29666 = c11877co.m29666();
                StringBuilder sb = new StringBuilder();
                sb.append(m30146(1117361102 - (ViewConfiguration.getFadingEdgeLength() >> 16), (short) (ImageFormat.getBitsPerPixel(0) + 1), 712269147 - (ViewConfiguration.getEdgeSlop() >> 16), (byte) (Process.getGidForName("") + 1), (ViewConfiguration.getWindowTouchSlop() >> 8) - 10).intern());
                sb.append(m30154());
                C11875cm.m29607(strM29666, sb.toString(), e);
            }
            String strM29667 = c11877co.m29666();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m30146(1117361102 - (ViewConfiguration.getFadingEdgeLength() >> 16), (short) (ImageFormat.getBitsPerPixel(0) + 1), 712269147 - (ViewConfiguration.getEdgeSlop() >> 16), (byte) (Process.getGidForName("") + 1), (ViewConfiguration.getWindowTouchSlop() >> 8) - 10).intern());
            sb2.append(m30154());
            C11875cm.m29607(strM29667, sb2.toString(), e);
        }
    }

    public final String toString() {
        int i = 2;
        int i2 = 2 % 2;
        StringBuilder sb = new StringBuilder();
        int i3 = 1117361126;
        sb.append(m30146(Gravity.getAbsoluteGravity(0, 0) + 1117361126, (short) ExpandableListView.getPackedPositionType(0L), 712269201 - KeyEvent.keyCodeFromString(""), (byte) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getDoubleTapTimeout() >> 16) - 34).intern());
        int i4 = f28748 + 89;
        f28750 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 3 % 3;
        }
        boolean z = true;
        for (String str : this.f28755.keySet()) {
            if (!z) {
                int i6 = f28750 + 77;
                f28748 = i6 % 128;
                int i7 = i6 % i;
                sb.append(m30146(i3 - ExpandableListView.getPackedPositionType(0L), (short) ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getWindowTouchSlop() >> 8) + 712269122, (byte) TextUtils.indexOf("", ""), (-33) - (KeyEvent.getMaxKeyCode() >> 16)).intern());
            }
            sb.append(m30146((ViewConfiguration.getFadingEdgeLength() >> 16) + 1117361127, (short) (ViewConfiguration.getLongPressTimeout() >> 16), 712269112 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), (byte) Color.blue(0), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 35).intern());
            sb.append(str);
            sb.append(m30146((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 1117361127, (short) (MotionEvent.axisFromString("") + 1), 712269113 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (byte) (1 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), (-31) - KeyEvent.getDeadChar(0, 0)).intern());
            sb.append(this.f28755.get(str));
            z = false;
            i = 2;
            i3 = 1117361126;
        }
        sb.append(m30146(1117361130 - TextUtils.getOffsetAfter("", 0), (short) (ViewConfiguration.getKeyRepeatDelay() >> 16), 712269203 - KeyEvent.getDeadChar(0, 0), (byte) (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getScrollBarFadeDuration() >> 16) - 34).intern());
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        if (getClass() != r7.getClass()) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (getClass() != r7.getClass()) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        r7 = (com.ironsource.adqualitysdk.sdk.p286i.C11917ea) r7;
        r3 = r6.f28755;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003f, code lost:
    
        if (r3 == null) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
    
        r1 = com.ironsource.adqualitysdk.sdk.p286i.C11917ea.f28748 + 87;
        com.ironsource.adqualitysdk.sdk.p286i.C11917ea.f28750 = r1 % 128;
        r1 = r1 % 2;
        r7 = r7.f28755;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
    
        if (r1 == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0052, code lost:
    
        return r3.equals(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0053, code lost:
    
        r3.equals(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005a, code lost:
    
        if (r7.f28755 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005d, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.ironsource.adqualitysdk.sdk.p286i.C11917ea.f28748
            int r2 = r1 + 107
            int r3 = r2 % 128
            com.ironsource.adqualitysdk.sdk.p286i.C11917ea.f28750 = r3
            int r2 = r2 % r0
            r2 = 1
            if (r6 != r7) goto L16
            int r1 = r1 + r2
            int r7 = r1 % 128
            com.ironsource.adqualitysdk.sdk.p286i.C11917ea.f28750 = r7
            int r1 = r1 % r0
            return r2
        L16:
            r1 = 0
            if (r7 == 0) goto L5e
            int r3 = r3 + 67
            int r4 = r3 % 128
            com.ironsource.adqualitysdk.sdk.p286i.C11917ea.f28748 = r4
            int r3 = r3 % r0
            if (r3 == 0) goto L30
            java.lang.Class r3 = r6.getClass()
            java.lang.Class r4 = r7.getClass()
            r5 = 51
            int r5 = r5 / r1
            if (r3 == r4) goto L3b
            goto L5e
        L30:
            java.lang.Class r3 = r6.getClass()
            java.lang.Class r4 = r7.getClass()
            if (r3 == r4) goto L3b
            goto L5e
        L3b:
            com.ironsource.adqualitysdk.sdk.i.ea r7 = (com.ironsource.adqualitysdk.sdk.p286i.C11917ea) r7
            java.util.Map<java.lang.String, com.ironsource.adqualitysdk.sdk.i.ec> r3 = r6.f28755
            if (r3 == 0) goto L58
            int r1 = com.ironsource.adqualitysdk.sdk.p286i.C11917ea.f28748
            int r1 = r1 + 87
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.p286i.C11917ea.f28750 = r2
            int r1 = r1 % r0
            java.util.Map<java.lang.String, com.ironsource.adqualitysdk.sdk.i.ec> r7 = r7.f28755
            if (r1 == 0) goto L53
            boolean r7 = r3.equals(r7)
            return r7
        L53:
            r3.equals(r7)
            r7 = 0
            throw r7
        L58:
            java.util.Map<java.lang.String, com.ironsource.adqualitysdk.sdk.i.ec> r7 = r7.f28755
            if (r7 != 0) goto L5d
            return r2
        L5d:
            return r1
        L5e:
            int r7 = com.ironsource.adqualitysdk.sdk.p286i.C11917ea.f28748
            int r7 = r7 + 121
            int r2 = r7 % 128
            com.ironsource.adqualitysdk.sdk.p286i.C11917ea.f28750 = r2
            int r7 = r7 % r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p286i.C11917ea.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = f28750 + 55;
        int i3 = i2 % 128;
        f28748 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        Map<String, AbstractC11919ec> map = this.f28755;
        if (map == null) {
            return 0;
        }
        int i4 = i3 + 95;
        f28750 = i4 % 128;
        int i5 = i4 % 2;
        int iHashCode = map.hashCode();
        int i6 = f28748 + 7;
        f28750 = i6 % 128;
        int i7 = i6 % 2;
        return iHashCode;
    }

    /* JADX INFO: renamed from: ﻛ */
    private static String m30146(int i, short s, int i2, byte b, int i3) {
        String string;
        synchronized (C12086m.f29832) {
            StringBuilder sb = new StringBuilder();
            int i4 = f28754;
            int i5 = i3 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f28753;
                if (bArr != null) {
                    i5 = (byte) (bArr[f28751 + i] + i4);
                } else {
                    i5 = (short) (f28749[f28751 + i] + i4);
                }
            }
            if (i5 > 0) {
                C12086m.f29836 = ((i + i5) - 2) + f28751 + i6;
                C12086m.f29833 = b;
                C12086m.f29837 = (char) (i2 + f28752);
                sb.append(C12086m.f29837);
                C12086m.f29834 = C12086m.f29837;
                C12086m.f29835 = 1;
                while (C12086m.f29835 < i5) {
                    byte[] bArr2 = f28753;
                    if (bArr2 != null) {
                        int i7 = C12086m.f29836;
                        C12086m.f29836 = i7 - 1;
                        C12086m.f29837 = (char) (C12086m.f29834 + (((byte) (bArr2[i7] + s)) ^ C12086m.f29833));
                    } else {
                        short[] sArr = f28749;
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
