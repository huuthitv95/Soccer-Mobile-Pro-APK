package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.drawable.Drawable;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.he */
/* JADX INFO: loaded from: classes6.dex */
public final class ViewOnClickListenerC12002he extends C11996gz<View.OnClickListener> implements View.OnClickListener {

    /* JADX INFO: renamed from: ﻐ */
    private static int f29131 = 1;

    /* JADX INFO: renamed from: ｋ */
    private static int f29133;

    /* JADX INFO: renamed from: ﾒ */
    private c f29135;

    /* JADX INFO: renamed from: ﾇ */
    private static char[] f29134 = {6200, 348, 10942, 21460, 32010, 26189, 36738, 43224, 53814, 64361, 58545, 3557, 14117, 20627, 31171, 25400, 35906, 46465, 57026, 63514, 57714, 2730, 13302, 23862, 30899, 25025, 18958, 13142, 7568, 1679, 61185, 51323, 45822, 39926, 33808, 28003, 22406, 12318, 6467, 905, 60611, 54541, 48713, 39067, 33202, 27184, 21366, 15750, 9954, 3874, 59799, 53978};

    /* JADX INFO: renamed from: ﻛ */
    private static long f29132 = 8280947155685677381L;

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.he$c */
    public interface c {
        /* JADX INFO: renamed from: ﻛ */
        void mo29844(ViewOnClickListenerC12002he viewOnClickListenerC12002he, View view);
    }

    public ViewOnClickListenerC12002he(View.OnClickListener onClickListener, c cVar) {
        super(onClickListener);
        this.f29135 = cVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = 2 % 2;
        try {
            this.f29135.mo29844(this, view);
            int i2 = f29131 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
            f29133 = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            C12080kb.m30845(m30257((-1) - TextUtils.lastIndexOf("", '0'), (char) (6263 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 'H' - AndroidCharacter.getMirror('0')).intern(), m30257(24 - (ViewConfiguration.getPressedStateDuration() >> 16), (char) (View.combineMeasuredStates(0, 0) + 30966), 28 - Drawable.resolveOpacity(0, 0)).intern(), th, false);
        }
        if (mo28813() != null) {
            int i4 = f29131 + 67;
            f29133 = i4 % 128;
            int i5 = i4 % 2;
            mo28813().onClick(view);
            if (i5 != 0) {
                int i6 = 33 / 0;
            }
        }
    }

    /* JADX INFO: renamed from: ﾇ */
    private static String m30257(int i, char c2, int i2) {
        String str;
        synchronized (C11862c.f28047) {
            char[] cArr = new char[i2];
            C11862c.f28048 = 0;
            while (C11862c.f28048 < i2) {
                cArr[C11862c.f28048] = (char) ((((long) f29134[C11862c.f28048 + i]) ^ (((long) C11862c.f28048) * f29132)) ^ ((long) c2));
                C11862c.f28048++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
