package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.media3.common.PlaybackException;
import com.google.android.exoplayer2.C9415C;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import com.vungle.ads.internal.protos.Sdk;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ia */
/* JADX INFO: loaded from: classes6.dex */
public final class C12025ia<T> extends C11886cx implements InterfaceC11870ch, InterfaceC12018hu<T> {

    /* JADX INFO: renamed from: ףּ */
    private static int f29271 = 1;

    /* JADX INFO: renamed from: ﭸ */
    private static int f29274 = 0;

    /* JADX INFO: renamed from: ﱟ */
    private static int f29278 = 827655619;

    /* JADX INFO: renamed from: ﱡ */
    private static int f29279 = 105;

    /* JADX INFO: renamed from: ﺙ */
    private static int f29280 = 866897508;

    /* JADX INFO: renamed from: ﻏ */
    private static short[] f29281;

    /* JADX INFO: renamed from: ﻐ */
    private InterfaceC12018hu f29282;

    /* JADX INFO: renamed from: ﻛ */
    private Object f29283;

    /* JADX INFO: renamed from: ｋ */
    private Field f29284;

    /* JADX INFO: renamed from: ﾇ */
    private Map f29285;

    /* JADX INFO: renamed from: ﾒ */
    private Collection f29286;

    /* JADX INFO: renamed from: ﮐ */
    private static byte[] f29277 = {-97, Ascii.f22498RS, -25, -27, -27, Ascii.f22492FF, -31, Ascii.DLE, -92, -109, 106, -103, 125, -110, -107, 108, -111, SignedBytes.MAX_POWER_OF_TWO, -93, 99, -110, -100, 112, 107, -91, 117, -99, 123, 96, -83, 123, -118, -96, 67, 76, -74, 84, 84, -103, 74, -69};

    /* JADX INFO: renamed from: ﮌ */
    private static boolean f29276 = true;

    /* JADX INFO: renamed from: ﭖ */
    private static boolean f29272 = true;

    /* JADX INFO: renamed from: ﭴ */
    private static int f29273 = 254;

    /* JADX INFO: renamed from: ﮉ */
    private static char[] f29275 = {369, 355, 370, 340, 351, 362, 371, 359, 324, 354, 357, 321, 365, 353, 364, 327};

    C12025ia(Field field, Object obj, InterfaceC12018hu interfaceC12018hu) {
        this.f29284 = field;
        this.f29283 = obj;
        this.f29282 = interfaceC12018hu;
    }

    C12025ia(Collection collection, Object obj, InterfaceC12018hu interfaceC12018hu) {
        this.f29286 = collection;
        this.f29283 = obj;
        this.f29282 = interfaceC12018hu;
    }

    C12025ia(Map map, Object obj, InterfaceC12018hu interfaceC12018hu) {
        this.f29285 = map;
        this.f29283 = obj;
        this.f29282 = interfaceC12018hu;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12018hu
    /* JADX INFO: renamed from: ﻐ */
    public final T mo30359() {
        int i = 2 % 2;
        int i2 = f29271 + 55;
        f29274 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        if (!m30464()) {
            if (m30465() || m30466()) {
                T t = (T) this.f29283;
                int i4 = f29274 + 61;
                f29271 = i4 % 128;
                if (i4 % 2 != 0) {
                    return t;
                }
                throw null;
            }
        } else {
            int i5 = f29271 + 85;
            f29274 = i5 % 128;
            int i6 = i5 % 2;
            try {
                return (T) this.f29284.get(this.f29283);
            } catch (Exception unused) {
            }
        }
        int i7 = f29271 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f29274 = i7 % 128;
        if (i7 % 2 == 0) {
            return null;
        }
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    private void m30463(T t) {
        int i = 2 % 2;
        int i2 = f29274 + 9;
        f29271 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            if (m30464()) {
                int i3 = f29271 + 87;
                f29274 = i3 % 128;
                int i4 = i3 % 2;
                try {
                    this.f29284.set(this.f29283, t);
                    int i5 = f29271 + 103;
                    f29274 = i5 % 128;
                    if (i5 % 2 != 0) {
                        throw null;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            return;
        }
        m30464();
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC12018hu
    /* JADX INFO: renamed from: ﻛ */
    public final Field mo30360() {
        int i = 2 % 2;
        int i2 = f29271 + 61;
        int i3 = i2 % 128;
        f29274 = i3;
        int i4 = i2 % 2;
        Field field = this.f29284;
        int i5 = i3 + 111;
        f29271 = i5 % 128;
        int i6 = i5 % 2;
        return field;
    }

    /* JADX INFO: renamed from: ｋ */
    private boolean m30464() {
        int i = 2 % 2;
        if (this.f29284 != null) {
            int i2 = f29271 + 15;
            f29274 = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = f29274 + 29;
        f29271 = i4 % 128;
        int i5 = i4 % 2;
        return false;
    }

    /* JADX INFO: renamed from: ﾇ */
    private boolean m30465() {
        int i = 2 % 2;
        int i2 = f29271 + 47;
        int i3 = i2 % 128;
        f29274 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this.f29286 != null) {
            return true;
        }
        int i4 = i3 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f29271 = i4 % 128;
        if (i4 % 2 != 0) {
            return false;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ */
    private boolean m30466() {
        int i = 2 % 2;
        if (this.f29285 == null) {
            return false;
        }
        int i2 = f29271;
        int i3 = i2 + 45;
        f29274 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
        f29274 = i5 % 128;
        if (i5 % 2 == 0) {
            return true;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻏ */
    private Collection m30460() {
        int i = 2 % 2;
        int i2 = f29274;
        int i3 = i2 + 97;
        f29271 = i3 % 128;
        int i4 = i3 % 2;
        Collection collection = this.f29286;
        int i5 = i2 + 33;
        f29271 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 21 / 0;
        }
        return collection;
    }

    /* JADX INFO: renamed from: ﱟ */
    private Map m30458() {
        int i = 2 % 2;
        int i2 = f29271 + 23;
        f29274 = i2 % 128;
        int i3 = i2 % 2;
        Map map = this.f29285;
        if (i3 != 0) {
            int i4 = 69 / 0;
        }
        return map;
    }

    /* JADX INFO: renamed from: ﱡ */
    private InterfaceC12018hu m30459() {
        int i = 2 % 2;
        int i2 = f29271;
        int i3 = i2 + 97;
        f29274 = i3 % 128;
        int i4 = i3 % 2;
        InterfaceC12018hu interfaceC12018hu = this.f29282;
        int i5 = i2 + 27;
        f29274 = i5 % 128;
        int i6 = i5 % 2;
        return interfaceC12018hu;
    }

    /* JADX INFO: renamed from: ﮐ */
    private Object m30457() {
        int i = 2 % 2;
        int i2 = f29271;
        int i3 = i2 + 23;
        f29274 = i3 % 128;
        int i4 = i3 % 2;
        Object obj = this.f29283;
        int i5 = i2 + 11;
        f29274 = i5 % 128;
        int i6 = i5 % 2;
        return obj;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:36:0x01e4  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ironsource.adqualitysdk.sdk.p286i.InterfaceC11870ch
    /* JADX INFO: renamed from: ﻐ */
    public final Object mo28830(String str, List<Object> list, InterfaceC11874cl interfaceC11874cl) {
        int i = 2 % 2;
        byte b = 6;
        switch (str.hashCode()) {
            case -2039060844:
                if (!str.equals(m30462((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) - 866897501, (short) Color.alpha(0), Drawable.resolveOpacity(0, 0) - 827655516, (byte) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 108), (-106) - ExpandableListView.getPackedPositionGroup(0L)).intern())) {
                    b = -1;
                } else {
                    b = 5;
                }
                break;
            case -1661939189:
                if (!str.equals(m30461(null, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 126, null, "\u0082\u008e\u008f\u0085\u0083\u0081\u008f\u0090\u0083\u0082\u008b").intern())) {
                    b = -1;
                } else {
                    int i2 = f29271 + 65;
                    f29274 = i2 % 128;
                    int i3 = i2 % 2;
                    b = 9;
                }
                break;
            case -1249356250:
                if (str.equals(m30462((-866897482) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (short) (ViewConfiguration.getScrollBarSize() >> 8), (-827655516) - TextUtils.indexOf("", ""), (byte) ((ViewConfiguration.getEdgeSlop() >> 16) + 116), TextUtils.lastIndexOf("", '0') + PlaybackException.ERROR_CODE_PARENTAL_CONTROL_RESTRICTED).intern())) {
                    b = 7;
                } else {
                    b = -1;
                }
                break;
            case 100472786:
                if (!str.equals(m30462(TextUtils.indexOf("", "", 0, 0) - 866897487, (short) (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getEdgeSlop() >> 16) - 827655514, (byte) ((AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 126), (-106) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern())) {
                    b = -1;
                }
                break;
            case 429960040:
                if (!str.equals(m30461(null, 127 - ((Process.getThreadPriority(0) + 20) >> 6), null, "\u008f\u008d\u0088\u0083\u008e\u0082\u0086\u0086\u008d\u008c\u0081\u0088").intern())) {
                    b = -1;
                } else {
                    int i4 = f29271 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
                    f29274 = i4 % 128;
                    int i5 = i4 % 2;
                    b = 4;
                }
                break;
            case 700591008:
                if (!str.equals(m30462(Drawable.resolveOpacity(0, 0) - 866897476, (short) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), KeyEvent.normalizeMetaState(0) - 827655516, (byte) (70 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (-106) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))).intern())) {
                    b = -1;
                } else {
                    int i6 = f29274 + 53;
                    f29271 = i6 % 128;
                    int i7 = i6 % 2;
                    b = 8;
                }
                break;
            case 1406685743:
                if (!str.equals(m30461(null, Gravity.getAbsoluteGravity(0, 0) + 127, null, "\u0082\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern())) {
                    b = -1;
                } else {
                    int i8 = f29271 + 63;
                    f29274 = i8 % 128;
                    int i9 = i8 % 2;
                    b = 1;
                }
                break;
            case 1953253188:
                if (!str.equals(m30461(null, 127 - Drawable.resolveOpacity(0, 0), null, "\u008a\u0086\u0082\u0088\u0089\u0083\u0082\u008b").intern())) {
                    b = -1;
                } else {
                    b = 3;
                }
                break;
            case 1967798203:
                if (!str.equals(m30462((-866897509) - TextUtils.lastIndexOf("", '0'), (short) (ViewConfiguration.getScrollDefaultDelay() >> 16), (-827655516) - TextUtils.getOffsetBefore("", 0), (byte) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 18), (-106) - (Process.myPid() >> 22)).intern())) {
                    b = -1;
                } else {
                    int i10 = f29274 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
                    f29271 = i10 % 128;
                    int i11 = i10 % 2;
                    b = 0;
                }
                break;
            case 2058833392:
                if (!str.equals(m30461(null, TextUtils.indexOf((CharSequence) "", '0', 0) + 128, null, "\u008a\u0086\u0082\u0088\u0089\u0081\u0088").intern())) {
                    b = -1;
                } else {
                    int i12 = f29274 + 107;
                    f29271 = i12 % 128;
                    int i13 = i12 % 2;
                    b = 2;
                }
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                return mo30359();
            case 1:
                m30463(m29851(list, 0, Object.class));
                return null;
            case 2:
                return Boolean.valueOf(m30464());
            case 3:
                return mo30360();
            case 4:
                return Boolean.valueOf(m30465());
            case 5:
                return m30460();
            case 6:
                return Boolean.valueOf(m30466());
            case 7:
                return m30458();
            case 8:
                InterfaceC12018hu interfaceC12018huM30459 = m30459();
                int i14 = f29274 + 79;
                f29271 = i14 % 128;
                if (i14 % 2 == 0) {
                    int i15 = 14 / 0;
                }
                return interfaceC12018huM30459;
            case 9:
                return m30457();
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: ｋ */
    private static String m30462(int i, short s, int i2, byte b, int i3) {
        String string;
        synchronized (C12086m.f29832) {
            StringBuilder sb = new StringBuilder();
            int i4 = f29279;
            int i5 = i3 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f29277;
                if (bArr != null) {
                    i5 = (byte) (bArr[f29280 + i] + i4);
                } else {
                    i5 = (short) (f29281[f29280 + i] + i4);
                }
            }
            if (i5 > 0) {
                C12086m.f29836 = ((i + i5) - 2) + f29280 + i6;
                C12086m.f29833 = b;
                C12086m.f29837 = (char) (i2 + f29278);
                sb.append(C12086m.f29837);
                C12086m.f29834 = C12086m.f29837;
                C12086m.f29835 = 1;
                while (C12086m.f29835 < i5) {
                    byte[] bArr2 = f29277;
                    if (bArr2 != null) {
                        int i7 = C12086m.f29836;
                        C12086m.f29836 = i7 - 1;
                        C12086m.f29837 = (char) (C12086m.f29834 + (((byte) (bArr2[i7] + s)) ^ C12086m.f29833));
                    } else {
                        short[] sArr = f29281;
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
    private static String m30461(String str, int i, int[] iArr, String str2) throws UnsupportedEncodingException {
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes(C9415C.ISO88591_NAME);
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (C12088o.f29838) {
            char[] cArr2 = f29275;
            int i2 = f29273;
            if (f29272) {
                int length = bArr.length;
                C12088o.f29839 = length;
                char[] cArr3 = new char[length];
                C12088o.f29840 = 0;
                while (C12088o.f29840 < C12088o.f29839) {
                    cArr3[C12088o.f29840] = (char) (cArr2[bArr[(C12088o.f29839 - 1) - C12088o.f29840] + i] - i2);
                    C12088o.f29840++;
                }
                return new String(cArr3);
            }
            if (f29276) {
                int length2 = cArr.length;
                C12088o.f29839 = length2;
                char[] cArr4 = new char[length2];
                C12088o.f29840 = 0;
                while (C12088o.f29840 < C12088o.f29839) {
                    cArr4[C12088o.f29840] = (char) (cArr2[cArr[(C12088o.f29839 - 1) - C12088o.f29840] - i] - i2);
                    C12088o.f29840++;
                }
                return new String(cArr4);
            }
            int length3 = iArr.length;
            C12088o.f29839 = length3;
            char[] cArr5 = new char[length3];
            C12088o.f29840 = 0;
            while (C12088o.f29840 < C12088o.f29839) {
                cArr5[C12088o.f29840] = (char) (cArr2[iArr[(C12088o.f29839 - 1) - C12088o.f29840] - i] - i2);
                C12088o.f29840++;
            }
            return new String(cArr5);
        }
    }
}
