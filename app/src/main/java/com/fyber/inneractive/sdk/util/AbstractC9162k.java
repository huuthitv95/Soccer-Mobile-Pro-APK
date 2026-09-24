package com.fyber.inneractive.sdk.util;

import android.os.Build;
import android.telephony.TelephonyManager;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.util.k */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9162k extends AbstractC9174o {
    /* JADX INFO: renamed from: i */
    public static String m21973i() {
        try {
            return ((TelephonyManager) AbstractC9174o.f21470a.getSystemService("phone")).getNetworkCountryIso();
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: j */
    public static String m21974j() {
        return Build.MANUFACTURER + " " + Build.MODEL;
    }

    /* JADX INFO: renamed from: k */
    public static int m21975k() {
        try {
            if (!AbstractC9174o.m21996a("android.permission.READ_PHONE_STATE")) {
                return 0;
            }
            TelephonyManager telephonyManager = (TelephonyManager) AbstractC9174o.f21470a.getSystemService("phone");
            return Build.VERSION.SDK_INT >= 24 ? telephonyManager.getDataNetworkType() : telephonyManager.getNetworkType();
        } catch (Throwable unused) {
            return 0;
        }
    }

    /* JADX INFO: renamed from: l */
    public static String m21976l() {
        try {
            return AbstractC9174o.f21470a.getPackageManager().getPackageInfo(AbstractC9174o.f21470a.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: m */
    public static boolean m21977m() {
        boolean z = (AbstractC9174o.f21470a.getResources().getConfiguration().screenLayout & 15) == 4;
        IAlog.m21949e("This device has a tablet resolution? %s", Boolean.valueOf(z));
        return z;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m21978n() {
        TelephonyManager telephonyManager = (TelephonyManager) AbstractC9174o.f21470a.getSystemService("phone");
        return telephonyManager != null && telephonyManager.getSimState() == 5;
    }
}
