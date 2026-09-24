package com.bytedance.sdk.openadsdk.utils;

import android.content.res.Configuration;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.bytedance.sdk.component.p165mj.p166lr.AbstractRunnableC2676ik;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.dw */
/* JADX INFO: loaded from: classes3.dex */
public class C3566dw {

    /* JADX INFO: renamed from: ik */
    private static String f13127ik = null;

    /* JADX INFO: renamed from: ka */
    private static volatile boolean f13128ka = true;

    /* JADX INFO: renamed from: lr */
    private static String f13129lr;

    /* JADX INFO: renamed from: ri */
    private static String f13130ri;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.utils.dw$ri */
    public static class ri extends AbstractRunnableC2676ik {

        /* JADX INFO: renamed from: ri */
        public static AtomicBoolean f13132ri = new AtomicBoolean(false);

        /* JADX INFO: renamed from: lr */
        private static final AtomicLong f13131lr = new AtomicLong(0);

        public ri(String str, int i) {
            super(str, i);
        }

        /* JADX INFO: renamed from: ri */
        public static void m16387ri() {
            if (f13132ri.get()) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            AtomicLong atomicLong = f13131lr;
            if (jCurrentTimeMillis - atomicLong.get() < 600000) {
                return;
            }
            atomicLong.set(jCurrentTimeMillis);
            dzy.m16396ik((Runnable) new ri("UpdateSimStatusTask", 5));
        }

        @Override // java.lang.Runnable
        public void run() {
            f13132ri.set(true);
            C3566dw.m16382fi();
            f13132ri.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: fi */
    public static void m16382fi() {
        String simOperatorName;
        String simOperator;
        String strSubstring;
        if (C3299nr.m14642ri() == null) {
            return;
        }
        f13128ka = true;
        try {
            TelephonyManager telephonyManager = (TelephonyManager) C3299nr.m14642ri().getSystemService("phone");
            try {
                int simState = telephonyManager.getSimState();
                if (simState == 0 || simState == 1) {
                    f13128ka = false;
                }
            } catch (Throwable th) {
                C2707ac.m10196ik("SimUtils", th.getMessage());
            }
            String str = null;
            try {
                simOperatorName = telephonyManager.getSimOperatorName();
            } catch (Throwable unused) {
                simOperatorName = null;
            }
            try {
                simOperator = telephonyManager.getNetworkOperator();
            } catch (Throwable unused2) {
                simOperator = null;
            }
            if (simOperator == null || simOperator.length() < 5) {
                try {
                    simOperator = telephonyManager.getSimOperator();
                } catch (Throwable unused3) {
                }
            }
            if (TextUtils.isEmpty(simOperator) || simOperator.length() <= 4) {
                strSubstring = null;
            } else {
                String strSubstring2 = simOperator.substring(0, 3);
                strSubstring = simOperator.substring(3);
                str = strSubstring2;
            }
            if (!TextUtils.isEmpty(simOperatorName)) {
                f13130ri = simOperatorName;
            }
            if (!TextUtils.isEmpty(str)) {
                f13129lr = str;
            }
            if (TextUtils.isEmpty(strSubstring)) {
                return;
            }
            f13127ik = strSubstring;
        } catch (Throwable unused4) {
        }
    }

    /* JADX INFO: renamed from: ik */
    public static String m16383ik() {
        ri.m16387ri();
        return f13127ik;
    }

    /* JADX INFO: renamed from: lr */
    public static String m16385lr() {
        try {
            ri.m16387ri();
            if (!f13128ka) {
                StringBuilder sb = new StringBuilder("getMCC");
                sb.append(f13128ka ? "Have SIM card" : "No SIM card, MCC returns null");
                C2707ac.m10196ik("MCC", sb.toString());
                return null;
            }
            Configuration configuration = C3299nr.m14642ri().getResources().getConfiguration();
            String strValueOf = configuration.mcc != 0 ? String.valueOf(configuration.mcc) : f13129lr;
            C2707ac.m10196ik("MCC", "config=" + configuration.mcc + ",sMCC=" + f13129lr);
            return strValueOf;
        } catch (Throwable th) {
            C2707ac.m10196ik("SimUtils", th.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: ri */
    public static String m16386ri() {
        ri.m16387ri();
        return f13130ri;
    }
}
