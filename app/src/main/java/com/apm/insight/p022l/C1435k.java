package com.apm.insight.p022l;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.apm.insight.p021k.C1418e;
import com.ironsource.C11676T3;

/* JADX INFO: renamed from: com.apm.insight.l.k */
/* JADX INFO: compiled from: Net.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1435k {

    /* JADX INFO: renamed from: com.apm.insight.l.k$1, reason: invalid class name */
    /* JADX INFO: compiled from: Net.java */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f739a;

        static {
            int[] iArr = new int[C1418e.b.values().length];
            f739a = iArr;
            try {
                iArr[C1418e.b.WIFI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f739a[C1418e.b.MOBILE_2G.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f739a[C1418e.b.MOBILE_3G.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f739a[C1418e.b.MOBILE_4G.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f739a[C1418e.b.MOBILE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f739a[C1418e.b.MOBILE_5G.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static String m1404a(Context context) {
        return m1405a(m1407c(context));
    }

    /* JADX INFO: renamed from: a */
    private static String m1405a(C1418e.b bVar) {
        try {
            switch (AnonymousClass1.f739a[bVar.ordinal()]) {
                case 1:
                    return C11676T3.f25719b;
                case 2:
                    return "2g";
                case 3:
                    return C11676T3.f25718a;
                case 4:
                    return "4g";
                case 5:
                    return "mobile";
                case 6:
                    return "5g";
                default:
                    return "";
            }
        } catch (Exception unused) {
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public static boolean m1406b(Context context) {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            return (connectivityManager == null || (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) == null || !activeNetworkInfo.isAvailable()) ? false : true;
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: c */
    private static C1418e.b m1407c(Context context) {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager == null) {
                return C1418e.b.NONE;
            }
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null && activeNetworkInfo.isAvailable()) {
                int type = activeNetworkInfo.getType();
                if (1 == type) {
                    return C1418e.b.WIFI;
                }
                if (type != 0) {
                    return C1418e.b.MOBILE;
                }
                int networkType = ((TelephonyManager) context.getSystemService("phone")).getNetworkType();
                if (networkType != 3) {
                    if (networkType == 20) {
                        return C1418e.b.MOBILE_5G;
                    }
                    if (networkType != 5 && networkType != 6) {
                        switch (networkType) {
                            case 8:
                            case 9:
                            case 10:
                                break;
                            default:
                                switch (networkType) {
                                    case 12:
                                    case 14:
                                    case 15:
                                        break;
                                    case 13:
                                        return C1418e.b.MOBILE_4G;
                                    default:
                                        return C1418e.b.MOBILE;
                                }
                                break;
                        }
                    }
                }
                return C1418e.b.MOBILE_3G;
            }
            return C1418e.b.NONE;
        } catch (Throwable unused) {
            return C1418e.b.MOBILE;
        }
    }
}
