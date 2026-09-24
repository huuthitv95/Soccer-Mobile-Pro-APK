package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.p300io.encoding.Base64;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.y */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC12098y<K, T> implements InterfaceC12090q<K, T> {

    /* JADX INFO: renamed from: ﱟ */
    private static short[] f30033 = null;

    /* JADX INFO: renamed from: ﱡ */
    private static int f30034 = 0;

    /* JADX INFO: renamed from: ﺙ */
    private static int f30035 = 1;

    /* JADX INFO: renamed from: ｋ */
    private static int f30037 = -51046376;

    /* JADX INFO: renamed from: ﾇ */
    private static int f30038 = -2096692905;

    /* JADX INFO: renamed from: ﾒ */
    private static int f30039 = 72;

    /* JADX INFO: renamed from: ﻐ */
    private InterfaceC12090q<K, T> f30040 = new InterfaceC12090q<K, T>() { // from class: com.ironsource.adqualitysdk.sdk.i.y.5
        @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
        /* JADX INFO: renamed from: ﻐ */
        public final void mo28225(JSONObject jSONObject, K k, T t) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
        /* JADX INFO: renamed from: ﻐ */
        public final void mo28226(JSONObject jSONObject, K k, Object obj, T t) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
        /* JADX INFO: renamed from: ﻛ */
        public final void mo28227(JSONObject jSONObject, K k, T t) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
        /* JADX INFO: renamed from: ﻛ */
        public final void mo28228(JSONObject jSONObject, K k, Object obj, T t) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
        /* JADX INFO: renamed from: ｋ */
        public final void mo28229(JSONObject jSONObject, K k, T t) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
        /* JADX INFO: renamed from: ﾇ */
        public final void mo28230(JSONObject jSONObject, K k, T t) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
        /* JADX INFO: renamed from: ﾒ */
        public final void mo28231(JSONObject jSONObject, K k, T t) {
        }

        @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
        /* JADX INFO: renamed from: ﾒ */
        public final void mo28232(JSONObject jSONObject, K k, Object obj, T t) {
        }
    };

    /* JADX INFO: renamed from: ﻛ */
    private InterfaceC12090q<K, T> f30041;

    /* JADX INFO: renamed from: ﮐ */
    private static byte[] f30032 = {-59, -117, -94, -79, 69, -88, -95, -96, 87, 88, Ascii.f22491EM, -31, 126, -61, 55, Ascii.f22498RS, Ascii.ESC, -23, Ascii.ESC, Ascii.f22493FS, -24, -94, 93, -62, -53, -46, Ascii.f22493FS, 95, -90, -21, -24, Ascii.f22491EM, 83, -87, -22, -17, Ascii.f22494GS, -17, -24, Ascii.f22493FS, 86, -87, 54, -58, -127, -88, -86, 82, 85, -70, 87, 68, Ascii.SYN, -2, 69, -85, -92, -62, -114, 78, 65, -89, 89, Ascii.f22490CR, -11, 72, 68, -59, 106, -86, -91, 67, -67, -23, Ascii.f22502US, 82, 87, -83, 82, -98, -58, -14, -6, Ascii.f22500SO, -47, 45, -2, 10, -5, 5, -2, -22, Ascii.ETB, -48, -69, -61, Base64.padSymbol};

    /* JADX INFO: renamed from: ﻏ */
    private static int f30036 = 90;

    /* JADX INFO: renamed from: ﻐ */
    protected abstract String mo28218(T t);

    /* JADX INFO: renamed from: ﻐ */
    public final void m31102(InterfaceC12090q<K, T> interfaceC12090q) {
        int i = 2 % 2;
        int i2 = f30034 + 55;
        f30035 = i2 % 128;
        int i3 = i2 % 2;
        this.f30041 = interfaceC12090q;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    private InterfaceC12090q<K, T> m31098() {
        int i = 2 % 2;
        int i2 = f30035 + 93;
        int i3 = i2 % 128;
        f30034 = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            InterfaceC12090q<K, T> interfaceC12090q = this.f30041;
            if (interfaceC12090q == null) {
                return this.f30040;
            }
            int i4 = i3 + 57;
            f30035 = i4 % 128;
            if (i4 % 2 != 0) {
                return interfaceC12090q;
            }
            throw null;
        }
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
    /* JADX INFO: renamed from: ﻛ */
    public void mo28227(JSONObject jSONObject, K k, T t) {
        int i = 2 % 2;
        int i2 = f30035 + 105;
        f30034 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject jSONObjectM31099 = m31099(jSONObject, t);
        m31101(m31100((short) Color.alpha(0), (byte) (93 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), View.resolveSize(0, 0) + 51046376, (-73) - ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getJumpTapTimeout() >> 16) + 2096692970).intern(), jSONObjectM31099);
        m31098().mo28227(jSONObjectM31099, k, t);
        int i4 = f30034 + 109;
        f30035 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
    /* JADX INFO: renamed from: ｋ */
    public void mo28229(JSONObject jSONObject, K k, T t) {
        int i = 2 % 2;
        int i2 = f30034 + 41;
        f30035 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject jSONObjectM31099 = m31099(jSONObject, t);
        m31101(m31097((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 19, 18 - TextUtils.indexOf("", ""), "\u0003\u0014\u0016\u001a\u0007ￂ\u0006\u0007\u001b\u0003\u000e\u0012\u0015\u000b\u0006ￂ\u0006￣ￜ", (ViewConfiguration.getLongPressTimeout() >> 16) + 184, true).intern(), jSONObjectM31099);
        m31098().mo28229(jSONObjectM31099, k, t);
        int i4 = f30035 + 49;
        f30034 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
    /* JADX INFO: renamed from: ﾒ */
    public final void mo28232(JSONObject jSONObject, K k, Object obj, T t) {
        int i = 2 % 2;
        int i2 = f30034 + 89;
        f30035 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject jSONObjectM31099 = m31099(jSONObject, t);
        m31101(m31100((short) TextUtils.indexOf("", ""), (byte) ((-31) - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 51046389 - (ViewConfiguration.getFadingEdgeLength() >> 16), (-72) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), Color.green(0) + 2096692970).intern(), jSONObjectM31099);
        m31098().mo28232(jSONObjectM31099, k, obj, t);
        int i4 = f30034 + 39;
        f30035 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
    /* JADX INFO: renamed from: ﻐ */
    public final void mo28226(JSONObject jSONObject, K k, Object obj, T t) {
        int i = 2 % 2;
        int i2 = f30034 + 59;
        f30035 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject jSONObjectM31099 = m31099(jSONObject, t);
        m31101(m31100((short) (ViewConfiguration.getLongPressTimeout() >> 16), (byte) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 20), ExpandableListView.getPackedPositionGroup(0L) + 51046400, (-73) - Drawable.resolveOpacity(0, 0), View.MeasureSpec.getMode(0) + 2096692970).intern(), jSONObjectM31099);
        m31098().mo28226(jSONObjectM31099, k, obj, t);
        int i4 = f30035 + 95;
        f30034 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 52 / 0;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
    /* JADX INFO: renamed from: ﻐ */
    public final void mo28225(JSONObject jSONObject, K k, T t) {
        int i = 2 % 2;
        int i2 = f30034 + 105;
        f30035 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject jSONObjectM31099 = m31099(jSONObject, t);
        m31101(m31097(Drawable.resolveOpacity(0, 0) + 9, View.getDefaultSize(0, 0) + 9, "￥\bￄ\u0007\u0010\u0013\u0017\t\b", 182 - Color.alpha(0), false).intern(), jSONObjectM31099);
        m31098().mo28225(jSONObjectM31099, k, t);
        int i4 = f30034 + 13;
        f30035 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
    /* JADX INFO: renamed from: ﾒ */
    public final void mo28231(JSONObject jSONObject, K k, T t) {
        int i = 2 % 2;
        int i2 = f30035 + 93;
        f30034 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject jSONObjectM31099 = m31099(jSONObject, t);
        m31101(m31100((short) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (byte) (87 - TextUtils.getCapsMode("", 0, 0)), 51046419 - ExpandableListView.getPackedPositionGroup(0L), (-73) - KeyEvent.keyCodeFromString(""), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2096693023).intern(), jSONObjectM31099);
        m31098().mo28231(jSONObjectM31099, k, t);
        int i4 = f30035 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f30034 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
    /* JADX INFO: renamed from: ﻛ */
    public final void mo28228(JSONObject jSONObject, K k, Object obj, T t) {
        int i = 2 % 2;
        int i2 = f30035 + 103;
        f30034 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject jSONObjectM31099 = m31099(jSONObject, t);
        m31101(m31100((short) TextUtils.getCapsMode("", 0, 0), (byte) (71 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 59473 - AndroidCharacter.getMirror('0'), TextUtils.indexOf((CharSequence) "", '0') - 72, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 2096692991).intern(), jSONObjectM31099);
        m31098().mo28228(jSONObjectM31099, k, obj, t);
        int i4 = f30034 + 11;
        f30035 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 20 / 0;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12090q
    /* JADX INFO: renamed from: ﾇ */
    public final void mo28230(JSONObject jSONObject, K k, T t) {
        int i = 2 % 2;
        int i2 = f30035 + 79;
        f30034 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject jSONObjectM31099 = m31099(jSONObject, t);
        m31101(m31100((short) KeyEvent.keyCodeFromString(""), (byte) ((-85) - TextUtils.indexOf((CharSequence) "", '0')), 51046443 - TextUtils.getTrimmedLength(""), (-73) - TextUtils.getTrimmedLength(""), (ViewConfiguration.getFadingEdgeLength() >> 16) + 2096692972).intern(), jSONObjectM31099);
        m31098().mo28230(jSONObjectM31099, k, t);
        int i4 = f30035 + 39;
        f30034 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﾒ */
    private void m31101(String str, JSONObject jSONObject) {
        int i = 2 % 2;
        String strIntern = m31100((short) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (byte) ((-13) - (ViewConfiguration.getWindowTouchSlop() >> 8)), KeyEvent.getDeadChar(0, 0) + 51046456, TextUtils.getTrimmedLength("") - 73, 2096692970 - TextUtils.indexOf("", "", 0, 0)).intern();
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append(m31100((short) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 1), (byte) (48 - (Process.myPid() >> 22)), Drawable.resolveOpacity(0, 0) + 51046470, Color.argb(0, 0, 0, 0) - 73, 2096692937 - ExpandableListView.getPackedPositionGroup(0L)).intern());
        sb.append(str);
        C12085l.m30918(strIntern, sb.toString(), jSONObject);
        int i2 = f30035 + 25;
        f30034 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: renamed from: ﻛ */
    private JSONObject m31099(JSONObject jSONObject, T t) {
        int i = 2 % 2;
        int i2 = f30034 + 71;
        f30035 = i2 % 128;
        int i3 = i2 % 2;
        try {
            if (!jSONObject.has(C12035ik.f29411)) {
                int i4 = f30035 + 63;
                f30034 = i4 % 128;
                int i5 = i4 % 2;
                jSONObject.put(C12035ik.f29411, mo28218(t));
            }
            if (!jSONObject.has(C12035ik.f29407)) {
                jSONObject.put(C12035ik.f29407, C12072ju.m30752());
                return jSONObject;
            }
        } catch (JSONException e) {
            C12085l.m30922(m31100((short) Drawable.resolveOpacity(0, 0), (byte) ((-13) - View.MeasureSpec.getSize(0)), 51046456 - (ViewConfiguration.getDoubleTapTimeout() >> 16), Process.getGidForName("") - 72, ((byte) KeyEvent.getModifierMetaStateMask()) + 2096692971).intern(), m31097((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 24, AndroidCharacter.getMirror('0') - '!', "ﾾ\u0005\f\u0007\u0012\uffff\u0003\u0010\u0001ﾾ\u0010\r\u0010\u0010￣\f\r\u0011\bﾾ\u0012\f\u0003\u0014\u0003", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 188, true).intern(), e);
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ｋ */
    private static String m31100(short s, byte b, int i, int i2, int i3) {
        String string;
        synchronized (C12086m.f29832) {
            StringBuilder sb = new StringBuilder();
            int i4 = f30039;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f30032;
                if (bArr != null) {
                    i5 = (byte) (bArr[f30037 + i] + i4);
                } else {
                    i5 = (short) (f30033[f30037 + i] + i4);
                }
            }
            if (i5 > 0) {
                C12086m.f29836 = ((i + i5) - 2) + f30037 + i6;
                C12086m.f29833 = b;
                C12086m.f29837 = (char) (i3 + f30038);
                sb.append(C12086m.f29837);
                C12086m.f29834 = C12086m.f29837;
                C12086m.f29835 = 1;
                while (C12086m.f29835 < i5) {
                    byte[] bArr2 = f30032;
                    if (bArr2 != null) {
                        int i7 = C12086m.f29836;
                        C12086m.f29836 = i7 - 1;
                        C12086m.f29837 = (char) (C12086m.f29834 + (((byte) (bArr2[i7] + s)) ^ C12086m.f29833));
                    } else {
                        short[] sArr = f30033;
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

    /* JADX INFO: renamed from: ﻐ */
    private static String m31097(int i, int i2, String str, int i3, boolean z) {
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
                cArr2[i4] = (char) (cArr2[i4] - f30036);
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
