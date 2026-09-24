package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.C9415C;
import com.vungle.ads.internal.protos.Sdk;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ap */
/* JADX INFO: loaded from: classes6.dex */
public final class C11824ap extends AbstractC11823ao.AnonymousClass3 {

    /* JADX INFO: renamed from: ｋ */
    private static int f27235 = 0;

    /* JADX INFO: renamed from: ﾇ */
    private static int f27236 = 1;

    /* JADX INFO: renamed from: ﻐ */
    private final int f27238 = (int) TimeUnit.SECONDS.toMillis(120);

    /* JADX INFO: renamed from: ﾒ */
    private static char[] f27237 = {150, 301, 300, 301, 301, 298, 300, '7', 'n', 'p', 'l', 'h', 'h', 'd', 'k', 's', '_', 144, '9', 's', 's', '9', 's'};

    /* JADX INFO: renamed from: ﻛ */
    private static int f27234 = 14;

    public C11824ap(C11829au c11829au) {
        m28543(new int[]{0, 7, 188, 0}, "\u0000\u0000\u0001\u0001\u0001\u0001\u0001", false).intern();
        m28543(new int[]{7, 9, 0, 3}, "\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000", false).intern();
        m28508(c11829au);
    }

    /* JADX INFO: renamed from: ﾇ */
    public final int m28552() {
        int i = 2 % 2;
        int i2 = f27235 + 103;
        f27236 = i2 % 128;
        int i3 = i2 % 2;
        int iOptInt = m28507().optInt(m28542("\u0005\ufff7\u0006", (ViewConfiguration.getScrollDefaultDelay() >> 16) + 3, true, 3 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 124 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern(), this.f27238);
        int i4 = f27236 + 57;
        f27235 = i4 % 128;
        int i5 = i4 % 2;
        return iOptInt;
    }

    /* JADX INFO: renamed from: ﻛ */
    public final int m28550() {
        int i = 2 % 2;
        int i2 = f27235 + 93;
        f27236 = i2 % 128;
        int i3 = i2 % 2;
        int iOptInt = m28507().optInt(m28542("\u0005\u0002\ufffa", (ViewConfiguration.getLongPressTimeout() >> 16) + 3, false, -TextUtils.indexOf((CharSequence) "", '0', 0), (KeyEvent.getMaxKeyCode() >> 16) + Sdk.SDKError.Reason.TPAT_ERROR_VALUE).intern(), 40);
        int i4 = f27236 + 85;
        f27235 = i4 % 128;
        if (i4 % 2 == 0) {
            return iOptInt;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ */
    public final int m28549() {
        int i = 2 % 2;
        int i2 = f27236 + 83;
        f27235 = i2 % 128;
        return i2 % 2 != 0 ? m28507().optInt(m28542("\ufffb\u0001\u0004", (ViewConfiguration.getWindowTouchSlop() % 110) + 2, false, (ViewConfiguration.getScrollFriction() > 1.0f ? 1 : (ViewConfiguration.getScrollFriction() == 1.0f ? 0 : -1)), 15095 % (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern(), 7655) : m28507().optInt(m28542("\ufffb\u0001\u0004", (ViewConfiguration.getWindowTouchSlop() >> 8) + 3, true, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), 129 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern(), 9850);
    }

    /* JADX INFO: renamed from: ﾒ */
    public final List<String> m28553() {
        int i = 2 % 2;
        List<String> listM28593 = m28506().m28593();
        listM28593.addAll(C12077jz.m30800(m28507(), m28542("\ufff6\b\u0004", 3 - (ViewConfiguration.getScrollDefaultDelay() >> 16), true, -TextUtils.lastIndexOf("", '0', 0, 0), (-16777090) - Color.rgb(0, 0, 0)).intern(), new ArrayList()));
        int i2 = f27235 + 97;
        f27236 = i2 % 128;
        int i3 = i2 % 2;
        return listM28593;
    }

    /* JADX INFO: renamed from: ｋ */
    public final List<String> m28551() {
        int i = 2 % 2;
        List<String> listM28585 = m28506().m28585();
        listM28585.addAll(C12077jz.m30800(m28507(), m28542("\ufff5\b\u0004", 4 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), true, 1 - Color.red(0), 174 - AndroidCharacter.getMirror('0')).intern(), new ArrayList()));
        int i2 = f27236 + 19;
        f27235 = i2 % 128;
        int i3 = i2 % 2;
        return listM28585;
    }

    /* JADX INFO: renamed from: ﺙ */
    public final String m28547() {
        JSONObject jSONObjectOptJSONObject;
        int i = 2 % 2;
        int i2 = f27235 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f27236 = i2 % 128;
        if (i2 % 2 != 0 ? (jSONObjectOptJSONObject = m28507().optJSONObject(m28542("\ufffb\u0001\u0004", (ViewConfiguration.getJumpTapTimeout() >> 16) + 3, true, Color.blue(0) + 3, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 126).intern())) == null : (jSONObjectOptJSONObject = m28507().optJSONObject(m28542("\ufffb\u0001\u0004", (ViewConfiguration.getJumpTapTimeout() + 56) * 4, false, Color.blue(0) + 3, 94 << (Process.getElapsedCpuTime() > 1L ? 1 : (Process.getElapsedCpuTime() == 1L ? 0 : -1))).intern())) == null) {
            return m28543(new int[]{0, 7, 188, 0}, "\u0000\u0000\u0001\u0001\u0001\u0001\u0001", false).intern();
        }
        int i3 = f27235 + 83;
        f27236 = i3 % 128;
        int i4 = i3 % 2;
        return jSONObjectOptJSONObject.optString(m28543(new int[]{16, 1, 79, 0}, "\u0001", true).intern(), m28543(new int[]{0, 7, 188, 0}, "\u0000\u0000\u0001\u0001\u0001\u0001\u0001", false).intern());
    }

    /* JADX INFO: renamed from: ﱡ */
    public final String m28546() {
        JSONObject jSONObjectOptJSONObject;
        int i = 2 % 2;
        int i2 = f27236 + 87;
        f27235 = i2 % 128;
        if (i2 % 2 == 0 ? (jSONObjectOptJSONObject = m28507().optJSONObject(m28542("\ufffb\u0001\u0004", 3 - (ViewConfiguration.getPressedStateDuration() >> 16), true, TextUtils.getOffsetAfter("", 0) + 3, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 128).intern())) != null : (jSONObjectOptJSONObject = m28507().optJSONObject(m28542("\ufffb\u0001\u0004", ViewConfiguration.getPressedStateDuration() + 114, true, 3 % TextUtils.getOffsetAfter("", 1), 31965 % (ExpandableListView.getPackedPositionForChild(1, 0) > 1L ? 1 : (ExpandableListView.getPackedPositionForChild(1, 0) == 1L ? 0 : -1))).intern())) != null) {
            return jSONObjectOptJSONObject.optString(m28543(new int[]{17, 1, 187, 0}, "\u0000", true).intern(), m28543(new int[]{7, 9, 0, 3}, "\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000", false).intern());
        }
        String strIntern = m28543(new int[]{7, 9, 0, 3}, "\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000", false).intern();
        int i3 = f27235 + 99;
        f27236 = i3 % 128;
        int i4 = i3 % 2;
        return strIntern;
    }

    /* JADX INFO: renamed from: ﻏ */
    public final long m28548() throws UnsupportedEncodingException {
        JSONObject jSONObjectM28507;
        String strM28543;
        int i = 2 % 2;
        int i2 = f27236 + 105;
        f27235 = i2 % 128;
        if (i2 % 2 != 0) {
            jSONObjectM28507 = m28507();
            strM28543 = m28543(new int[]{18, 3, 0, 3}, "\u0001\u0001\u0001", false);
        } else {
            jSONObjectM28507 = m28507();
            strM28543 = m28543(new int[]{18, 3, 0, 3}, "\u0001\u0001\u0001", true);
        }
        long jOptLong = jSONObjectM28507.optLong(strM28543.intern(), 0L);
        int i3 = f27236 + 89;
        f27235 = i3 % 128;
        int i4 = i3 % 2;
        return jOptLong;
    }

    /* JADX INFO: renamed from: ﱟ */
    public final long m28545() {
        int i = 2 % 2;
        int i2 = f27236 + 71;
        f27235 = i2 % 128;
        int i3 = i2 % 2;
        long jOptLong = m28507().optLong(m28543(new int[]{21, 2, 0, 0}, "\u0001\u0001", true).intern(), 0L);
        int i4 = f27236 + 57;
        f27235 = i4 % 128;
        if (i4 % 2 == 0) {
            return jOptLong;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ */
    public final long m28544() {
        int i = 2 % 2;
        int i2 = f27235 + 51;
        f27236 = i2 % 128;
        int i3 = i2 % 2;
        long jOptLong = m28507().optLong(m28542("\u0001\u0000", 2 - View.combineMeasuredStates(0, 0), true, 1 - Color.argb(0, 0, 0, 0), Drawable.resolveOpacity(0, 0) + 130).intern(), 0L);
        int i4 = f27235 + 113;
        f27236 = i4 % 128;
        if (i4 % 2 != 0) {
            return jOptLong;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ｋ */
    private static String m28543(int[] iArr, String str, boolean z) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes(C9415C.ISO88591_NAME);
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (C12024i.f29270) {
            int i = iArr[0];
            int i2 = iArr[1];
            int i3 = iArr[2];
            int i4 = iArr[3];
            char[] cArr = new char[i2];
            System.arraycopy(f27237, i, cArr, 0, i2);
            if (bArr != null) {
                char[] cArr2 = new char[i2];
                C12024i.f29269 = 0;
                char c = 0;
                while (C12024i.f29269 < i2) {
                    if (bArr[C12024i.f29269] == 1) {
                        cArr2[C12024i.f29269] = (char) (((cArr[C12024i.f29269] << 1) + 1) - c);
                    } else {
                        cArr2[C12024i.f29269] = (char) ((cArr[C12024i.f29269] << 1) - c);
                    }
                    c = cArr2[C12024i.f29269];
                    C12024i.f29269++;
                }
                cArr = cArr2;
            }
            if (i4 > 0) {
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr, 0, cArr3, 0, i2);
                int i5 = i2 - i4;
                System.arraycopy(cArr3, 0, cArr, i5, i4);
                System.arraycopy(cArr3, i4, cArr, 0, i5);
            }
            if (z) {
                char[] cArr4 = new char[i2];
                C12024i.f29269 = 0;
                while (C12024i.f29269 < i2) {
                    cArr4[C12024i.f29269] = cArr[(i2 - C12024i.f29269) - 1];
                    C12024i.f29269++;
                }
                cArr = cArr4;
            }
            if (i3 > 0) {
                C12024i.f29269 = 0;
                while (C12024i.f29269 < i2) {
                    cArr[C12024i.f29269] = (char) (cArr[C12024i.f29269] - iArr[2]);
                    C12024i.f29269++;
                }
            }
            str2 = new String(cArr);
        }
        return str2;
    }

    /* JADX INFO: renamed from: ｋ */
    private static String m28542(String str, int i, boolean z, int i2, int i3) {
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
                cArr2[i4] = (char) (cArr2[i4] - f27234);
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
