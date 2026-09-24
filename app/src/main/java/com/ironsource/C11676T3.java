package com.ironsource;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.ironsource.mediationsdk.logger.IronLog;

/* JADX INFO: renamed from: com.ironsource.T3 */
/* JADX INFO: loaded from: classes6.dex */
public class C11676T3 {

    /* JADX INFO: renamed from: a */
    public static final String f25718a = "3g";

    /* JADX INFO: renamed from: b */
    public static final String f25719b = "wifi";

    /* JADX INFO: renamed from: c */
    public static final String f25720c = "none";

    /* JADX INFO: renamed from: d */
    public static final String f25721d = "bluetooth";

    /* JADX INFO: renamed from: e */
    public static final String f25722e = "ethernet";

    /* JADX INFO: renamed from: f */
    public static final String f25723f = "vpn";

    /* JADX INFO: renamed from: g */
    public static final String f25724g = "cellular";

    /* JADX INFO: renamed from: h */
    public static final String f25725h = "wifiAware";

    /* JADX INFO: renamed from: i */
    public static final String f25726i = "lowpan";

    /* JADX INFO: renamed from: a */
    public static String m27500a(Context context) {
        ConnectivityManager connectivityManager;
        StringBuilder sb = new StringBuilder();
        if (context != null && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null) {
            try {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                    String typeName = activeNetworkInfo.getTypeName();
                    int type = activeNetworkInfo.getType();
                    if (type == 0) {
                        sb.append(f25718a);
                    } else if (type == 1) {
                        sb.append(f25719b);
                    } else {
                        sb.append(typeName);
                    }
                }
            } catch (Exception e) {
                C12317m4.m32153d().m32155a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: b */
    public static int m27501b(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            return context.getResources().getConfiguration().mcc;
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
            return -1;
        }
    }

    /* JADX INFO: renamed from: c */
    public static int m27502c(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            return context.getResources().getConfiguration().mnc;
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
            return -1;
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m27503d(Context context) {
        if (context == null) {
            return "";
        }
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getNetworkOperator();
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
            return "";
        }
    }

    /* JADX INFO: renamed from: e */
    public static int m27504e(Context context) {
        PackageManager packageManager = context.getPackageManager();
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (Build.VERSION.SDK_INT < 24) {
                return -1;
            }
            if (packageManager.checkPermission("android.permission.READ_PHONE_STATE", context.getPackageName()) == 0 || packageManager.checkPermission("android.permission.READ_BASIC_PHONE_STATE", context.getPackageName()) == 0) {
                return telephonyManager.getDataNetworkType();
            }
            return -1;
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
            return -1;
        }
    }

    /* JADX INFO: renamed from: f */
    public static int m27505f(Context context) {
        if (context == null) {
            return -1;
        }
        try {
            return ((TelephonyManager) context.getSystemService("phone")).getPhoneType();
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
            return -1;
        }
    }

    /* JADX INFO: renamed from: g */
    public static String m27506g(Context context) {
        if (context == null) {
            return "";
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            return telephonyManager != null ? telephonyManager.getSimOperator() : "";
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
            return "";
        }
    }

    /* JADX INFO: renamed from: h */
    public static boolean m27507h(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null) {
            return false;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
            return false;
        }
    }

    /* JADX INFO: renamed from: i */
    public static boolean m27508i(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo networkInfo;
        return (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null || (networkInfo = connectivityManager.getNetworkInfo(0)) == null || !networkInfo.isConnected()) ? false : true;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m27509j(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo networkInfo;
        return (context == null || (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) == null || (networkInfo = connectivityManager.getNetworkInfo(1)) == null || !networkInfo.isConnected()) ? false : true;
    }
}
