package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.u */
/* JADX INFO: loaded from: classes6.dex */
public final class C12094u {

    /* JADX INFO: renamed from: ﮐ */
    private static byte[] f29933 = {-24, -71, -73, 112, 82, -85, 88, -66, 66, -90, -81, 92, -85, -88, -37, -24, -30, Ascii.SYN, 9, -49, Ascii.f22502US, 17, -23, Ascii.ETB, -17, Ascii.f22503VT, 56, -57, Ascii.f22491EM, -25, -14, 6, Ascii.f22491EM, -47, 10, Ascii.CAN, -1, 35, -58, Ascii.CAN, -10, -7, -23, -45, 39, 56, -16, 43, 57, -34, 2, -25, 57, -41, 56, -39, 40};

    /* JADX INFO: renamed from: ﱟ */
    private static int f29934 = 0;

    /* JADX INFO: renamed from: ﱡ */
    private static int f29935 = 1;

    /* JADX INFO: renamed from: ﺙ */
    private static short[] f29936 = null;

    /* JADX INFO: renamed from: ﻏ */
    private static int f29937 = -690389600;

    /* JADX INFO: renamed from: ﻛ */
    private static int f29938 = 38;

    /* JADX INFO: renamed from: ﾇ */
    private static int f29939 = -188301002;

    /* JADX INFO: renamed from: ﻐ */
    private Map<String, C12096w> f29940 = new HashMap();

    /* JADX INFO: renamed from: ﾒ */
    private Map<String, ViewOnLayoutChangeListenerC11811ac> f29942 = new HashMap();

    /* JADX INFO: renamed from: ｋ */
    private Map<String, C11810ab> f29941 = new HashMap();

    /* JADX INFO: renamed from: ﻛ */
    static /* synthetic */ Map m31013(C12094u c12094u) {
        int i = 2 % 2;
        int i2 = f29935 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        int i3 = i2 % 128;
        f29934 = i3;
        int i4 = i2 % 2;
        Map<String, C11810ab> map = c12094u.f29941;
        int i5 = i3 + 113;
        f29935 = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    /* JADX INFO: renamed from: ﾇ */
    static /* synthetic */ String m31015(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f29934 + 85;
        f29935 = i2 % 128;
        int i3 = i2 % 2;
        String strM31012 = m31012(jSONObject);
        int i4 = f29935 + 23;
        f29934 = i4 % 128;
        int i5 = i4 % 2;
        return strM31012;
    }

    /* JADX INFO: renamed from: ﾇ */
    static /* synthetic */ Map m31016(C12094u c12094u) {
        int i = 2 % 2;
        int i2 = f29935;
        int i3 = i2 + 25;
        f29934 = i3 % 128;
        int i4 = i3 % 2;
        Map<String, C12096w> map = c12094u.f29940;
        int i5 = i2 + 13;
        f29934 = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    /* JADX INFO: renamed from: ﾒ */
    static /* synthetic */ Map m31017(C12094u c12094u) {
        int i = 2 % 2;
        int i2 = f29934 + 27;
        int i3 = i2 % 128;
        f29935 = i3;
        int i4 = i2 % 2;
        Map<String, ViewOnLayoutChangeListenerC11811ac> map = c12094u.f29942;
        int i5 = i3 + 105;
        f29934 = i5 % 128;
        int i6 = i5 % 2;
        return map;
    }

    /* JADX INFO: renamed from: ﻛ */
    public final void m31021(final JSONObject jSONObject, final C12087n c12087n, final AbstractC12059jh abstractC12059jh, final InterfaceC12043is interfaceC12043is) {
        int i = 2 % 2;
        C12089p.m30938(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.u.3
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28224() {
                String strM31015 = C12094u.m31015(jSONObject);
                C12096w c12096w = (C12096w) C12094u.m31016(C12094u.this).get(strM31015);
                if (c12096w == null) {
                    c12096w = new C12096w(jSONObject, interfaceC12043is);
                    C12094u.m31016(C12094u.this).put(strM31015, c12096w);
                } else {
                    c12096w.m31072(interfaceC12043is);
                    c12096w.m31052(jSONObject);
                }
                c12096w.m31102((InterfaceC12090q) c12087n);
                c12096w.m31054(abstractC12059jh);
            }
        });
        int i2 = f29934 + 113;
        f29935 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ */
    public final void m31018() {
        int i = 2 % 2;
        C12089p.m30938(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.u.1
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28224() {
                ArrayList arrayList = new ArrayList(C12094u.m31016(C12094u.this).values());
                C12094u.m31016(C12094u.this).clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C12096w) it.next()).m31049();
                }
            }
        });
        int i2 = f29934 + 85;
        f29935 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ */
    public final void m31023(final JSONObject jSONObject, final C12095v c12095v) {
        int i = 2 % 2;
        C12089p.m30938(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.u.5
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28224() {
                String strM31015 = C12094u.m31015(jSONObject);
                ViewOnLayoutChangeListenerC11811ac viewOnLayoutChangeListenerC11811ac = (ViewOnLayoutChangeListenerC11811ac) C12094u.m31017(C12094u.this).get(strM31015);
                if (viewOnLayoutChangeListenerC11811ac == null) {
                    viewOnLayoutChangeListenerC11811ac = new ViewOnLayoutChangeListenerC11811ac(jSONObject);
                    C12094u.m31017(C12094u.this).put(strM31015, viewOnLayoutChangeListenerC11811ac);
                } else {
                    viewOnLayoutChangeListenerC11811ac.m28274(jSONObject);
                }
                viewOnLayoutChangeListenerC11811ac.m31102((InterfaceC12090q) c12095v);
            }
        });
        int i2 = f29934 + 5;
        f29935 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: renamed from: ﾒ */
    public final void m31024() {
        int i = 2 % 2;
        C12089p.m30938(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.u.4
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28224() {
                ArrayList arrayList = new ArrayList(C12094u.m31017(C12094u.this).values());
                C12094u.m31017(C12094u.this).clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((ViewOnLayoutChangeListenerC11811ac) it.next()).m28278();
                }
            }
        });
        int i2 = f29935 + 67;
        f29934 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ */
    public final void m31019(JSONObject jSONObject, C12093t c12093t) {
        int i = 2 % 2;
        int i2 = f29934 + 105;
        f29935 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        m31022(jSONObject, c12093t, null);
        if (i3 != 0) {
            return;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    public final void m31022(final JSONObject jSONObject, final C12093t c12093t, final InterfaceC12042ir interfaceC12042ir) {
        int i = 2 % 2;
        C12089p.m30938(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.u.2
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28224() {
                String strM31015 = C12094u.m31015(jSONObject);
                C11810ab c11810ab = (C11810ab) C12094u.m31013(C12094u.this).get(strM31015);
                if (c11810ab == null) {
                    c11810ab = new C11810ab(jSONObject, interfaceC12042ir);
                    C12094u.m31013(C12094u.this).put(strM31015, c11810ab);
                } else {
                    c11810ab.m28220(jSONObject, interfaceC12042ir);
                }
                c11810ab.m31102((InterfaceC12090q) c12093t);
            }
        });
        int i2 = f29934 + 23;
        f29935 = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    public final void m31020() {
        int i = 2 % 2;
        C12089p.m30938(new AbstractRunnableC12044it() { // from class: com.ironsource.adqualitysdk.sdk.i.u.10
            @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractRunnableC12044it
            /* JADX INFO: renamed from: ﻛ */
            public final void mo28224() {
                ArrayList arrayList = new ArrayList(C12094u.m31013(C12094u.this).values());
                C12094u.m31013(C12094u.this).clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((C11810ab) it.next()).m28221();
                }
            }
        });
        int i2 = f29934 + 25;
        f29935 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m31012(JSONObject jSONObject) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(jSONObject.optString(m31014((short) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (byte) ((-83) - View.MeasureSpec.getMode(0)), View.resolveSizeAndState(0, 0, 0) + 188301002, (ViewConfiguration.getLongPressTimeout() >> 16) - 39, (ViewConfiguration.getFadingEdgeLength() >> 16) + 690389705).intern()));
        sb.append(m31014((short) (ViewConfiguration.getLongPressTimeout() >> 16), (byte) (Color.alpha(0) + 15), (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 188301015, (-39) - Drawable.resolveOpacity(0, 0), 690389646 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern());
        sb.append(jSONObject.optString(m31014((short) Color.green(0), (byte) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 26), View.MeasureSpec.makeMeasureSpec(0, 0) + 188301017, (-39) - (ViewConfiguration.getLongPressTimeout() >> 16), (KeyEvent.getMaxKeyCode() >> 16) + 690389697).intern()));
        sb.append(jSONObject.optString(m31014((short) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (byte) (TextUtils.indexOf((CharSequence) "", '0', 0) + 11), 171523815 - Color.rgb(0, 0, 0), (-38) - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), MotionEvent.axisFromString("") + 690389719).intern()));
        sb.append(jSONObject.optString(m31014((short) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), (byte) (43 - ((Process.getThreadPriority(0) + 20) >> 6)), 188301045 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), ImageFormat.getBitsPerPixel(0) - 38, 690389697 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern()));
        String string = sb.toString();
        int i2 = f29935 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f29934 = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    /* JADX INFO: renamed from: ｋ */
    private static String m31014(short s, byte b, int i, int i2, int i3) {
        String string;
        synchronized (C12086m.f29832) {
            StringBuilder sb = new StringBuilder();
            int i4 = f29938;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f29933;
                if (bArr != null) {
                    i5 = (byte) (bArr[f29939 + i] + i4);
                } else {
                    i5 = (short) (f29936[f29939 + i] + i4);
                }
            }
            if (i5 > 0) {
                C12086m.f29836 = ((i + i5) - 2) + f29939 + i6;
                C12086m.f29833 = b;
                C12086m.f29837 = (char) (i3 + f29937);
                sb.append(C12086m.f29837);
                C12086m.f29834 = C12086m.f29837;
                C12086m.f29835 = 1;
                while (C12086m.f29835 < i5) {
                    byte[] bArr2 = f29933;
                    if (bArr2 != null) {
                        int i7 = C12086m.f29836;
                        C12086m.f29836 = i7 - 1;
                        C12086m.f29837 = (char) (C12086m.f29834 + (((byte) (bArr2[i7] + s)) ^ C12086m.f29833));
                    } else {
                        short[] sArr = f29936;
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
