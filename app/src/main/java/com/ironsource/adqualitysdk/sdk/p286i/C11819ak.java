package com.ironsource.adqualitysdk.sdk.p286i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.ak */
/* JADX INFO: loaded from: classes6.dex */
public final class C11819ak {

    /* JADX INFO: renamed from: ﺙ */
    private static int f27139 = 1;

    /* JADX INFO: renamed from: ﻏ */
    private static int f27140 = 0;

    /* JADX INFO: renamed from: ﻐ */
    private static int f27141 = 106;

    /* JADX INFO: renamed from: ﻛ */
    private static int f27142 = -897436517;

    /* JADX INFO: renamed from: ｋ */
    private static short[] f27143 = null;

    /* JADX INFO: renamed from: ﾇ */
    private static int f27144 = -1910551736;

    /* JADX INFO: renamed from: ﾒ */
    private static byte[] f27145 = {-92, -37, -77, -45, -89, -85, -117, -5, -79, -32, -47, -13, -47, -54, -48, -28, -65, -18, -47, -35, -51, -40, -48, -48, -33, -16, -114, -16, -7, -13, 127, -30, -107, -16, -124, -12, -21, -13, -13, -126, -7, 124, 101, -44, 108, -41, 101, 126, -79, 105, 120, -44, -45, 103, -40, -43, -102, -68, 95, -44, -34, -121, 116, Ascii.DLE, 108, 97, -39, 108, -45, 102, -99, Ascii.SYN, 101, -44, 108, -41, 101, -34, -47, 105, 120, -44, -45, 103, -40, -43, 122, -36, 95, -44, -34, 103, -108, Ascii.f22493FS, 126, -49, -48, -43, 100, -36, 101, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ﻐ */
    public static Object m28440(Context context) {
        int i = 2 % 2;
        int i2 = f27140 + 37;
        f27139 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        try {
            return C12079ka.m30829(m28443(), m28441(1910551736 - (Process.myTid() >> 22), (short) ((-68) - KeyEvent.keyCodeFromString("")), 897436620 - (Process.myTid() >> 22), (byte) (146 - AndroidCharacter.getMirror('0')), TextUtils.lastIndexOf("", '0') - 94).intern(), Arrays.asList(context)).invoke(null, context);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            int i4 = f27139 + 77;
            f27140 = i4 % 128;
            if (i4 % 2 == 0) {
                return null;
            }
            super.hashCode();
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ */
    public static void m28442(Object obj, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        int i = 2 % 2;
        int i2 = f27140 + 89;
        f27139 = i2 % 128;
        int i3 = i2 % 2;
        try {
            C12079ka.m30829(obj, m28441(1910551745 - TextUtils.lastIndexOf("", '0', 0), (short) ((-89) - TextUtils.indexOf("", "", 0)), 897436631 - Color.green(0), (byte) (117 - (ViewConfiguration.getJumpTapTimeout() >> 16)), Color.green(0) - 90).intern(), Arrays.asList(broadcastReceiver, intentFilter)).invoke(obj, broadcastReceiver, intentFilter);
            int i4 = f27139 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
            f27140 = i4 % 128;
            int i5 = i4 % 2;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* JADX INFO: renamed from: ｋ */
    public static void m28444(Object obj, BroadcastReceiver broadcastReceiver) {
        int i = 2 % 2;
        int i2 = f27140 + 71;
        f27139 = i2 % 128;
        int i3 = i2 % 2;
        try {
            C12079ka.m30829(obj, m28441(TextUtils.lastIndexOf("", '0') + 1910551762, (short) ((-58) - Color.alpha(0)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 897436634, (byte) ((-69) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))), Color.alpha(0) - 88).intern(), Arrays.asList(broadcastReceiver)).invoke(obj, broadcastReceiver);
            int i4 = f27140 + 25;
            f27139 = i4 % 128;
            int i5 = i4 % 2;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* JADX INFO: renamed from: ｋ */
    public static Class m28443() {
        int i = 2 % 2;
        int i2 = f27140 + 17;
        f27139 = i2 % 128;
        int i3 = i2 % 2;
        Class clsM30818 = C12079ka.m30818(m28441((ViewConfiguration.getDoubleTapTimeout() >> 16) + 1910551778, (short) (Process.getGidForName("") - 30), 897436615 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (byte) (75 - ((Process.getThreadPriority(0) + 20) >> 6)), View.MeasureSpec.getMode(0) - 46).intern(), false);
        int i4 = f27140 + 59;
        f27139 = i4 % 128;
        if (i4 % 2 != 0) {
            return clsM30818;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ */
    private static String m28441(int i, short s, int i2, byte b, int i3) {
        String string;
        synchronized (C12086m.f29832) {
            StringBuilder sb = new StringBuilder();
            int i4 = f27141;
            int i5 = i3 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f27145;
                if (bArr != null) {
                    i5 = (byte) (bArr[f27144 + i] + i4);
                } else {
                    i5 = (short) (f27143[f27144 + i] + i4);
                }
            }
            if (i5 > 0) {
                C12086m.f29836 = ((i + i5) - 2) + f27144 + i6;
                C12086m.f29833 = b;
                C12086m.f29837 = (char) (i2 + f27142);
                sb.append(C12086m.f29837);
                C12086m.f29834 = C12086m.f29837;
                C12086m.f29835 = 1;
                while (C12086m.f29835 < i5) {
                    byte[] bArr2 = f27145;
                    if (bArr2 != null) {
                        int i7 = C12086m.f29836;
                        C12086m.f29836 = i7 - 1;
                        C12086m.f29837 = (char) (C12086m.f29834 + (((byte) (bArr2[i7] + s)) ^ C12086m.f29833));
                    } else {
                        short[] sArr = f27143;
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
