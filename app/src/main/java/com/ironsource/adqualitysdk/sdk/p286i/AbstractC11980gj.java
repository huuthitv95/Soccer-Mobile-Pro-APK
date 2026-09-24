package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.gj */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC11980gj {

    /* JADX INFO: renamed from: ﻐ */
    private static int f29017 = 1;

    /* JADX INFO: renamed from: ﻛ */
    private static int f29018 = 0;

    /* JADX INFO: renamed from: ﾒ */
    private static int f29019 = 145;

    /* JADX INFO: renamed from: ﻛ */
    public abstract String mo30209();

    /* JADX INFO: renamed from: ｋ */
    public abstract AbstractC11840be mo30210();

    /* JADX INFO: renamed from: ﾇ */
    public abstract String mo30211();

    /* JADX INFO: renamed from: ﾒ */
    public abstract Class mo30212();

    /* JADX INFO: renamed from: ﻐ */
    public final C12053jb.a m30231() {
        int i = 2 % 2;
        int i2 = f29017 + 63;
        f29018 = i2 % 128;
        int i3 = i2 % 2;
        if (!AbstractC11823ao.m28472().mo28487().m28562()) {
            StringBuilder sb = new StringBuilder();
            sb.append(m30230("\b\r￼\ufffe\u0007\u0007\b￼\uffc8\f\u000b", KeyEvent.getDeadChar(0, 0) + 11, true, 8 - (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getJumpTapTimeout() >> 16) + 248).intern());
            sb.append(mo30209());
            return new C12053jb.a(sb.toString(), m30230("\uffff\u0006�", TextUtils.indexOf("", "", 0) + 3, false, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 194 - KeyEvent.getDeadChar(0, 0)).intern());
        }
        String strM28560 = AbstractC11823ao.m28472().mo28487().m28560(mo30209());
        if (!TextUtils.isEmpty(strM28560)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m30230("\b\r￼\ufffe\u0007\u0007\b￼\uffc8\f\u000b", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 10, true, 8 - TextUtils.indexOf("", ""), ExpandableListView.getPackedPositionChild(0L) + 249).intern());
            sb2.append(mo30209());
            C12053jb.e eVar = new C12053jb.e(sb2.toString(), m30230("\uffff\u0006�", KeyEvent.normalizeMetaState(0) + 3, false, 1 - Color.red(0), 194 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern(), strM28560);
            int i4 = f29018 + 71;
            f29017 = i4 % 128;
            int i5 = i4 % 2;
            return eVar;
        }
        int i6 = f29018 + 105;
        f29017 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 53 / 0;
        }
        return null;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static String m30230(String str, int i, boolean z, int i2, int i3) {
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
                cArr2[i4] = (char) (cArr2[i4] - f29019);
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
