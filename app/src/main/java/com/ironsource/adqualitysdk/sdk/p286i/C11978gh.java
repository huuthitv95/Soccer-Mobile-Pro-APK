package com.ironsource.adqualitysdk.sdk.p286i;

import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.facebook.ads.AdSettings;
import com.google.common.base.Ascii;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.gh */
/* JADX INFO: loaded from: classes6.dex */
public final class C11978gh extends AbstractC11980gj {

    /* JADX INFO: renamed from: ﻛ */
    private static int f29007 = 0;

    /* JADX INFO: renamed from: ﾒ */
    private static int f29010 = 1;

    /* JADX INFO: renamed from: ﾇ */
    private static char[] f29009 = {15436, 29213, 41208, 55062, 1341, 48031, 60002, 6337, 20133, 64773, 13282, 25019, 36957, 50935, 30045, 43823, 55761, 2115, 48833, 60571, 8974, 20986, 34725, 13853, 25849, 39773, 51502, 37242, 57120, 3525, 31342, 43018, 5794, 18269, 46588};

    /* JADX INFO: renamed from: ｋ */
    private static long f29008 = -1044168895191101859L;

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﾇ */
    public final String mo30211() {
        String strM30228;
        int i = 2 % 2;
        int i2 = f29007 + 83;
        f29010 = i2 % 128;
        if (i2 % 2 == 0) {
            SystemClock.elapsedRealtime();
            strM30228 = m30228(0, (char) (13207 >>> (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 82 - ((byte) KeyEvent.getModifierMetaStateMask()));
        } else {
            strM30228 = m30228(1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (15408 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 26 - ((byte) KeyEvent.getModifierMetaStateMask()));
        }
        String strIntern = strM30228.intern();
        int i3 = f29010 + 17;
        f29007 = i3 % 128;
        if (i3 % 2 == 0) {
            return strIntern;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo30212() {
        int i = 2 % 2;
        int i2 = f29007 + 23;
        int i3 = i2 % 128;
        f29010 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 15;
        f29007 = i5 % 128;
        if (i5 % 2 == 0) {
            return AdSettings.class;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ｋ */
    public final AbstractC11840be mo30210() {
        int i = 2 % 2;
        C11850bo c11850bo = new C11850bo(mo30209());
        int i2 = f29007 + 19;
        f29010 = i2 % 128;
        int i3 = i2 % 2;
        return c11850bo;
    }

    @Override // com.ironsource.adqualitysdk.sdk.p286i.AbstractC11980gj
    /* JADX INFO: renamed from: ﻛ */
    public final String mo30209() {
        int trimmedLength;
        char modifierMetaStateMask;
        int pressedStateDuration;
        int i = 2 % 2;
        int i2 = f29007 + 113;
        f29010 = i2 % 128;
        if (i2 % 2 == 0) {
            trimmedLength = 43 << TextUtils.getTrimmedLength("");
            modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.ESC);
            pressedStateDuration = (ViewConfiguration.getPressedStateDuration() % 120) + 77;
        } else {
            trimmedLength = TextUtils.getTrimmedLength("") + 27;
            modifierMetaStateMask = (char) (37147 - ((byte) KeyEvent.getModifierMetaStateMask()));
            pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 8;
        }
        return m30228(trimmedLength, modifierMetaStateMask, pressedStateDuration).intern();
    }

    /* JADX INFO: renamed from: ﾇ */
    private static String m30228(int i, char c, int i2) {
        String str;
        synchronized (C11862c.f28047) {
            char[] cArr = new char[i2];
            C11862c.f28048 = 0;
            while (C11862c.f28048 < i2) {
                cArr[C11862c.f28048] = (char) ((((long) f29009[C11862c.f28048 + i]) ^ (((long) C11862c.f28048) * f29008)) ^ ((long) c));
                C11862c.f28048++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
