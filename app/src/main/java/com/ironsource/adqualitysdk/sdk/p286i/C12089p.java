package com.ironsource.adqualitysdk.sdk.p286i;

import android.graphics.Color;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.p */
/* JADX INFO: loaded from: classes6.dex */
public final class C12089p {

    /* JADX INFO: renamed from: ﻐ */
    private static final Handler f29841;

    /* JADX INFO: renamed from: ﻛ */
    private static final Handler f29842;

    /* JADX INFO: renamed from: ｋ */
    private static int f29843 = 1;

    /* JADX INFO: renamed from: ﾇ */
    private static int[] f29844;

    /* JADX INFO: renamed from: ﾒ */
    private static int f29845;

    /* JADX INFO: renamed from: ﾇ */
    static void m30941() {
        f29844 = new int[]{-443795192, 750787441, 1561717886, -1559161573, 1468192661, -1470290504, -132979317, -353349384, -1228114646, -1529791656, -1455033308, -1898208385, -986726125, 404117054, -1771341673, 1573738289, -1511595121, -1686038760};
    }

    static {
        m30941();
        f29842 = new Handler(Looper.getMainLooper());
        f29841 = m30932();
        int i = f29843 + 67;
        f29845 = i % 128;
        int i2 = i % 2;
    }

    /* JADX INFO: renamed from: ｋ */
    public static Handler m30937() {
        int i = 2 % 2;
        int i2 = f29845 + 99;
        int i3 = i2 % 128;
        f29843 = i3;
        int i4 = i2 % 2;
        Handler handler = f29842;
        int i5 = i3 + 63;
        f29845 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 15 / 0;
        }
        return handler;
    }

    /* JADX INFO: renamed from: ｋ */
    public static void m30938(AbstractRunnableC12044it abstractRunnableC12044it) {
        int i = 2 % 2;
        int i2 = f29843 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f29845 = i2 % 128;
        int i3 = i2 % 2;
        if (m30936()) {
            abstractRunnableC12044it.run();
            int i4 = f29843 + 111;
            f29845 = i4 % 128;
            int i5 = i4 % 2;
            return;
        }
        m30943(abstractRunnableC12044it);
    }

    /* JADX INFO: renamed from: ﾒ */
    public static void m30943(AbstractRunnableC12044it abstractRunnableC12044it) {
        int i = 2 % 2;
        int i2 = f29845 + 17;
        f29843 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                m30937().post(abstractRunnableC12044it);
            } else {
                m30937().post(abstractRunnableC12044it);
                throw null;
            }
        } catch (Error unused) {
            C12085l.m30915(m30940(new int[]{1839499658, 1222058342, 2018443995, 966529846, 1904069654, 1674842609}, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 12).intern(), m30940(new int[]{-118178163, 974822026, -2010079367, -55380410, -768361140, 380245522, -389812997, -118409192, 1342367526, -1313222261, -2114753619, 118990514, -1316752114, 1962404929, 414355933, -2057725754}, TextUtils.getTrimmedLength("") + 29).intern(), false);
        }
    }

    /* JADX INFO: renamed from: ｋ */
    public static void m30939(AbstractRunnableC12044it abstractRunnableC12044it, long j) {
        int i = 2 % 2;
        int i2 = f29845 + 3;
        f29843 = i2 % 128;
        Object obj = null;
        try {
            if (i2 % 2 != 0) {
                m30937().postDelayed(abstractRunnableC12044it, j);
                int i3 = f29845 + 45;
                f29843 = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
                return;
            }
            m30937().postDelayed(abstractRunnableC12044it, j);
            super.hashCode();
            throw null;
        } catch (Error unused) {
            C12085l.m30915(m30940(new int[]{1839499658, 1222058342, 2018443995, 966529846, 1904069654, 1674842609}, 11 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), m30940(new int[]{-118178163, 974822026, -2010079367, -55380410, -768361140, 380245522, 451875677, -216142061, -1076921709, -1317357198, 322590879, 1255484783, 1342367526, -1313222261, -2114753619, 118990514, -1316752114, 1962404929, 414355933, -2057725754}, View.resolveSize(0, 0) + 37).intern(), false);
        }
    }

    /* JADX INFO: renamed from: ﻛ */
    public static void m30935(AbstractRunnableC12044it abstractRunnableC12044it) {
        int i = 2 % 2;
        int i2 = f29843 + 63;
        f29845 = i2 % 128;
        if (i2 % 2 == 0) {
            if (m30936()) {
                m30933(abstractRunnableC12044it);
                int i3 = f29845 + 7;
                f29843 = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 20 / 0;
                    return;
                }
                return;
            }
            abstractRunnableC12044it.run();
            return;
        }
        m30936();
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ */
    public static void m30933(AbstractRunnableC12044it abstractRunnableC12044it) {
        int i = 2 % 2;
        int i2 = f29845 + 35;
        f29843 = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                m30942().post(abstractRunnableC12044it);
                int i3 = 63 / 0;
            } else {
                m30942().post(abstractRunnableC12044it);
            }
        } catch (Error unused) {
            C12085l.m30915(m30940(new int[]{1839499658, 1222058342, 2018443995, 966529846, 1904069654, 1674842609}, 12 - TextUtils.indexOf("", "", 0, 0)).intern(), m30940(new int[]{-118178163, 974822026, -2010079367, -55380410, 1165684879, 1759434909, 739355506, 1458395652, 1998549127, 1289653670, -1269625631, -2132319365, -520016704, 1796758376, -272648995, -151719092, 1755981597, -1976509769}, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 35).intern(), false);
        }
    }

    /* JADX INFO: renamed from: ﻐ */
    public static void m30934(AbstractRunnableC12044it abstractRunnableC12044it, long j) {
        int i = 2 % 2;
        int i2 = f29845 + 45;
        f29843 = i2 % 128;
        try {
            if (i2 % 2 != 0) {
                m30942().postDelayed(abstractRunnableC12044it, j);
                int i3 = f29845 + 49;
                f29843 = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            m30942().postDelayed(abstractRunnableC12044it, j);
            throw null;
        } catch (Error unused) {
            C12085l.m30915(m30940(new int[]{1839499658, 1222058342, 2018443995, 966529846, 1904069654, 1674842609}, Color.green(0) + 12).intern(), m30940(new int[]{-118178163, 974822026, -2010079367, -55380410, 1165684879, 1759434909, 739355506, 1458395652, 1998549127, 1289653670, -1269625631, -2132319365, -520016704, 1796758376, -272648995, -151719092, 1755981597, -1976509769}, 36 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), false);
        }
    }

    /* JADX INFO: renamed from: ﾒ */
    public static Handler m30942() {
        Handler handler;
        int i = 2 % 2;
        int i2 = f29843 + 85;
        int i3 = i2 % 128;
        f29845 = i3;
        if (i2 % 2 != 0) {
            handler = f29841;
            int i4 = 3 / 0;
        } else {
            handler = f29841;
        }
        int i5 = i3 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        f29843 = i5 % 128;
        int i6 = i5 % 2;
        return handler;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0030, code lost:
    
        if ((r1 % 2) == 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0032, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x001a, code lost:
    
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0025, code lost:
    
        if (android.os.Looper.myLooper() == android.os.Looper.getMainLooper()) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0027, code lost:
    
        r1 = com.ironsource.adqualitysdk.sdk.p286i.C12089p.f29845 + 115;
        com.ironsource.adqualitysdk.sdk.p286i.C12089p.f29843 = r1 % 128;
     */
    /* JADX INFO: renamed from: ﻛ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m30936() {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.ironsource.adqualitysdk.sdk.p286i.C12089p.f29845
            int r1 = r1 + 7
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.p286i.C12089p.f29843 = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L1d
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r4 = 79
            int r4 = r4 / r2
            if (r1 != r3) goto L36
            goto L27
        L1d:
            android.os.Looper r1 = android.os.Looper.myLooper()
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            if (r1 != r3) goto L36
        L27:
            int r1 = com.ironsource.adqualitysdk.sdk.p286i.C12089p.f29845
            int r1 = r1 + 115
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.p286i.C12089p.f29843 = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L34
            r0 = 1
            return r0
        L34:
            r0 = 0
            throw r0
        L36:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.p286i.C12089p.m30936():boolean");
    }

    /* JADX INFO: renamed from: ﻐ */
    private static Handler m30932() {
        int i = 2 % 2;
        try {
            HandlerThread handlerThread = new HandlerThread(m30940(new int[]{874258229, 1777719765, -692498666, -155401472, 1706004002, -1850606082}, 10 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern());
            for (int i2 = 0; i2 < 3; i2++) {
                try {
                    handlerThread.start();
                    Handler handler = new Handler(handlerThread.getLooper());
                    int i3 = f29845 + 55;
                    f29843 = i3 % 128;
                    int i4 = i3 % 2;
                    return handler;
                } catch (Error unused) {
                    C12085l.m30915(m30940(new int[]{1839499658, 1222058342, 2018443995, 966529846, 1904069654, 1674842609}, Process.getGidForName("") + 13).intern(), m30940(new int[]{-118178163, 974822026, -2010079367, -55380410, 1587679077, -40004683, -1639101902, -1626370095, -1098113774, 954630657, -1802387498, 1042298100, -766812724, -1380909676, 1956635335, -931843359, -1171276604, -240770497, 1631685690, 1204666759, 611133330, 369410388, 469909890, -1618840646}, (ViewConfiguration.getEdgeSlop() >> 16) + 48).intern(), true);
                }
            }
            return null;
        } catch (Error unused2) {
            C12085l.m30915(m30940(new int[]{1839499658, 1222058342, 2018443995, 966529846, 1904069654, 1674842609}, MotionEvent.axisFromString("") + 13).intern(), m30940(new int[]{-118178163, 974822026, -2010079367, -55380410, 1587679077, -40004683, -1639101902, -1626370095, -1098113774, 954630657, -1802387498, 1042298100, -766812724, -1380909676, 1956635335, -931843359, 811327768, 1579943655}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 35).intern(), true);
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾇ */
    private static String m30940(int[] iArr, int i) {
        String str;
        synchronized (C11835b.f27464) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f29844.clone();
            C11835b.f27462 = 0;
            while (C11835b.f27462 < iArr.length) {
                cArr[0] = (char) (iArr[C11835b.f27462] >> 16);
                cArr[1] = (char) iArr[C11835b.f27462];
                cArr[2] = (char) (iArr[C11835b.f27462 + 1] >> 16);
                cArr[3] = (char) iArr[C11835b.f27462 + 1];
                C11835b.f27463 = (cArr[0] << 16) + cArr[1];
                C11835b.f27461 = (cArr[2] << 16) + cArr[3];
                C11835b.m28718(iArr2);
                for (int i2 = 0; i2 < 16; i2++) {
                    int i3 = C11835b.f27463 ^ iArr2[i2];
                    C11835b.f27463 = i3;
                    C11835b.f27461 = C11835b.m28717(i3) ^ C11835b.f27461;
                    int i4 = C11835b.f27463;
                    C11835b.f27463 = C11835b.f27461;
                    C11835b.f27461 = i4;
                }
                int i5 = C11835b.f27463;
                C11835b.f27463 = C11835b.f27461;
                C11835b.f27461 = i5;
                C11835b.f27461 = i5 ^ iArr2[16];
                C11835b.f27463 ^= iArr2[17];
                int i6 = C11835b.f27463;
                int i7 = C11835b.f27461;
                cArr[0] = (char) (C11835b.f27463 >>> 16);
                cArr[1] = (char) C11835b.f27463;
                cArr[2] = (char) (C11835b.f27461 >>> 16);
                cArr[3] = (char) C11835b.f27461;
                C11835b.m28718(iArr2);
                cArr2[C11835b.f27462 << 1] = cArr[0];
                cArr2[(C11835b.f27462 << 1) + 1] = cArr[1];
                cArr2[(C11835b.f27462 << 1) + 2] = cArr[2];
                cArr2[(C11835b.f27462 << 1) + 3] = cArr[3];
                C11835b.f27462 += 2;
            }
            str = new String(cArr2, 0, i);
        }
        return str;
    }
}
