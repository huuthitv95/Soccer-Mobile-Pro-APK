package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.View;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.cm */
/* JADX INFO: loaded from: classes6.dex */
public final class C11875cm {

    /* JADX INFO: renamed from: ｋ */
    private static int f28187 = 1;

    /* JADX INFO: renamed from: ﾒ */
    private static int f28189;

    /* JADX INFO: renamed from: ﻛ */
    private static char[] f28186 = {'S', 35943, 6182, 42175, 'S', 35943, 6182, 42160};

    /* JADX INFO: renamed from: ﾇ */
    private static long f28188 = -3838434128913658827L;

    /* JADX INFO: renamed from: ﻐ */
    public static void m29606(String str, String str2) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(m29608(View.combineMeasuredStates(0, 0), (char) View.MeasureSpec.getMode(0), Color.alpha(0) + 4).intern());
        sb.append(str);
        C12085l.m30920(sb.toString(), str2);
        int i2 = f28189 + 89;
        f28187 = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX INFO: renamed from: ﻐ */
    public static void m29607(String str, String str2, Throwable th) {
        int i = 2 % 2;
        int i2 = f28187 + 105;
        f28189 = i2 % 128;
        int i3 = i2 % 2;
        m29609(str, str2, th);
        int i4 = f28187 + 83;
        f28189 = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX INFO: renamed from: ﾒ */
    private static void m29609(String str, String str2, Throwable th) {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(m29608(5 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), 4 - TextUtils.getTrimmedLength("")).intern());
        sb.append(str);
        C12080kb.m30848(sb.toString(), str2, Integer.toHexString(str2.hashCode()), th, null, false);
        int i2 = f28187 + 17;
        f28189 = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    private static String m29608(int i, char c, int i2) {
        String str;
        synchronized (C11862c.f28047) {
            char[] cArr = new char[i2];
            C11862c.f28048 = 0;
            while (C11862c.f28048 < i2) {
                cArr[C11862c.f28048] = (char) ((((long) f28186[C11862c.f28048 + i]) ^ (((long) C11862c.f28048) * f28188)) ^ ((long) c));
                C11862c.f28048++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
