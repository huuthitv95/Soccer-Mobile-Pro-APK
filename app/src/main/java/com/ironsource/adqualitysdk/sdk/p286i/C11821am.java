package com.ironsource.adqualitysdk.sdk.p286i;

import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.common.base.Ascii;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.am */
/* JADX INFO: loaded from: classes6.dex */
public final class C11821am {

    /* JADX INFO: renamed from: ﱟ */
    private static int f27169 = 0;

    /* JADX INFO: renamed from: ﱡ */
    private static int f27170 = 1;

    /* JADX INFO: renamed from: ﻐ */
    private static int f27171 = 42;

    /* JADX INFO: renamed from: ﻛ */
    private static int f27172 = 1989301761;

    /* JADX INFO: renamed from: ｋ */
    private static byte[] f27173 = {-29, -13, 3, 10, 3, -21, Ascii.f22503VT, -5, 5, 10, -18, Ascii.f22490CR, 3};

    /* JADX INFO: renamed from: ﾇ */
    private static short[] f27174 = null;

    /* JADX INFO: renamed from: ﾒ */
    private static int f27175 = -560836838;

    /* JADX INFO: renamed from: ｋ */
    public static boolean m28461(Map<String, String> map, String str) {
        int i;
        int i2 = 2 % 2;
        if (map.containsKey(str)) {
            return false;
        }
        int size = map.size();
        if (!(!m28460(map))) {
            int i3 = f27170 + 47;
            f27169 = i3 % 128;
            int i4 = i3 % 2;
            i = 1;
        } else {
            i = 0;
        }
        if (size >= 5 + i) {
            return true;
        }
        int i5 = f27169 + 45;
        f27170 = i5 % 128;
        if (i5 % 2 != 0) {
            return false;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ */
    private static boolean m28460(Map<String, String> map) {
        int i = 2 % 2;
        int i2 = f27169 + 45;
        f27170 = i2 % 128;
        int i3 = i2 % 2;
        boolean zContainsKey = map.containsKey(m28459(TextUtils.indexOf("", "") + 560836838, (short) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), KeyEvent.getDeadChar(0, 0) - 1989301664, (byte) (Process.myPid() >> 22), (-43) - KeyEvent.keyCodeFromString("")).intern());
        int i4 = f27169 + 63;
        f27170 = i4 % 128;
        if (i4 % 2 != 0) {
            return zContainsKey;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ */
    public static boolean m28462(String str) {
        int i = 2 % 2;
        int i2 = f27170 + 113;
        f27169 = i2 % 128;
        int i3 = i2 % 2;
        boolean zEquals = m28459(560836838 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (short) KeyEvent.normalizeMetaState(0), (-1989301664) - View.resolveSizeAndState(0, 0, 0), (byte) (ViewConfiguration.getDoubleTapTimeout() >> 16), (-42) - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern().equals(str);
        int i4 = f27170 + 63;
        f27169 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 83 / 0;
        }
        return zEquals;
    }

    /* JADX INFO: renamed from: ﾒ */
    public static boolean m28463(String str, String str2) {
        int i = 2 % 2;
        if (!C12081kc.m30857(str, 64)) {
            return false;
        }
        int i2 = f27170 + 53;
        f27169 = i2 % 128;
        if (i2 % 2 != 0) {
            if (!C12081kc.m30857(str2, 114)) {
                return false;
            }
        } else if (!C12081kc.m30857(str2, 64)) {
            return false;
        }
        int i3 = f27170;
        int i4 = i3 + 55;
        f27169 = i4 % 128;
        int i5 = i4 % 2;
        int i6 = i3 + 9;
        f27169 = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    /* JADX INFO: renamed from: ﻛ */
    private static String m28459(int i, short s, int i2, byte b, int i3) {
        String string;
        synchronized (C12086m.f29832) {
            StringBuilder sb = new StringBuilder();
            int i4 = f27171;
            int i5 = i3 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f27173;
                if (bArr != null) {
                    i5 = (byte) (bArr[f27175 + i] + i4);
                } else {
                    i5 = (short) (f27174[f27175 + i] + i4);
                }
            }
            if (i5 > 0) {
                C12086m.f29836 = ((i + i5) - 2) + f27175 + i6;
                C12086m.f29833 = b;
                C12086m.f29837 = (char) (i2 + f27172);
                sb.append(C12086m.f29837);
                C12086m.f29834 = C12086m.f29837;
                C12086m.f29835 = 1;
                while (C12086m.f29835 < i5) {
                    byte[] bArr2 = f27173;
                    if (bArr2 != null) {
                        int i7 = C12086m.f29836;
                        C12086m.f29836 = i7 - 1;
                        C12086m.f29837 = (char) (C12086m.f29834 + (((byte) (bArr2[i7] + s)) ^ C12086m.f29833));
                    } else {
                        short[] sArr = f27174;
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
