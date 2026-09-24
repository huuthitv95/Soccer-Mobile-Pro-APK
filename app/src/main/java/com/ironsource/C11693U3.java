package com.ironsource;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.U3 */
/* JADX INFO: loaded from: classes6.dex */
public class C11693U3 {

    /* JADX INFO: renamed from: a */
    public static final String f25847a = "NETWORK_TYPE_WIFI";

    /* JADX INFO: renamed from: b */
    public static final String f25848b = "NETWORK_TYPE_VPN";

    /* JADX INFO: renamed from: c */
    public static final String f25849c = "NETWORK_TYPE_ETHERNET";

    /* JADX INFO: renamed from: d */
    public static final String f25850d = "NETWORK_TYPE_UNKNOWN";

    /* JADX INFO: renamed from: e */
    public static final String f25851e = "notReachable";

    /* JADX INFO: renamed from: f */
    public static final String f25852f = "PHONE_TYPE_NONE";

    /* JADX INFO: renamed from: g */
    public static final String f25853g = "NETWORK_TYPE_GPRS";

    /* JADX INFO: renamed from: h */
    public static final String f25854h = "NETWORK_TYPE_EDGE";

    /* JADX INFO: renamed from: i */
    public static final String f25855i = "NETWORK_TYPE_UMTS";

    /* JADX INFO: renamed from: j */
    public static final String f25856j = "NETWORK_TYPE_CDMA";

    /* JADX INFO: renamed from: k */
    public static final String f25857k = "NETWORK_TYPE_EVDO_0";

    /* JADX INFO: renamed from: l */
    public static final String f25858l = "NETWORK_TYPE_EVDO_A";

    /* JADX INFO: renamed from: m */
    public static final String f25859m = "NETWORK_TYPE_1xRTT";

    /* JADX INFO: renamed from: n */
    public static final String f25860n = "NETWORK_TYPE_HSDPA";

    /* JADX INFO: renamed from: o */
    public static final String f25861o = "NETWORK_TYPE_HSUPA";

    /* JADX INFO: renamed from: p */
    public static final String f25862p = "NETWORK_TYPE_HSPA";

    /* JADX INFO: renamed from: q */
    public static final String f25863q = "NETWORK_TYPE_IDEN";

    /* JADX INFO: renamed from: r */
    public static final String f25864r = "NETWORK_TYPE_EVDO_B";

    /* JADX INFO: renamed from: s */
    public static final String f25865s = "NETWORK_TYPE_LTE";

    /* JADX INFO: renamed from: t */
    public static final String f25866t = "NETWORK_TYPE_EHRPD";

    /* JADX INFO: renamed from: u */
    public static final String f25867u = "NETWORK_TYPE_HSPAP";

    /* JADX INFO: renamed from: v */
    public static final String f25868v = "NETWORK_TYPE_GSM";

    /* JADX INFO: renamed from: w */
    public static final String f25869w = "NETWORK_TYPE_TD_SCDMA";

    /* JADX INFO: renamed from: x */
    public static final String f25870x = "NETWORK_TYPE_IWLAN";

    /* JADX INFO: renamed from: y */
    public static final String f25871y = "NETWORK_TYPE_LTE_CA";

    /* JADX INFO: renamed from: z */
    public static final String f25872z = "NETWORK_TYPE_NR";

    /* JADX INFO: renamed from: c */
    private static String m27578c(Context context) {
        String strM27500a = C11676T3.m27500a(context);
        return TextUtils.isEmpty(strM27500a) ? "none" : strM27500a;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m27580e(Context context) {
        return m27577b(context, m27571a(context)).equals("vpn");
    }

    /* JADX INFO: renamed from: b */
    public static String m27576b(Context context) {
        return m27574a(m27571a(context), context);
    }

    /* JADX INFO: renamed from: a */
    public static String m27574a(Network network, Context context) {
        if (context == null) {
            return "none";
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        if (network != null && connectivityManager != null) {
            try {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                if (networkCapabilities == null) {
                    return m27578c(context);
                }
                if (networkCapabilities.hasTransport(1)) {
                    return C11676T3.f25719b;
                }
                if (networkCapabilities.hasTransport(0)) {
                    return C11676T3.f25718a;
                }
                return m27578c(context);
            } catch (Exception e) {
                C12317m4.m32153d().m32155a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }
        return "none";
    }

    /* JADX INFO: renamed from: d */
    public static String m27579d(Context context) {
        ConnectivityManager connectivityManager;
        NetworkInfo activeNetworkInfo;
        if (context != null && (connectivityManager = (ConnectivityManager) context.getSystemService("connectivity")) != null) {
            Network networkM27572a = m27572a(connectivityManager);
            if (networkM27572a == null) {
                return f25851e;
            }
            try {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(networkM27572a);
                if (networkCapabilities == null) {
                    return f25850d;
                }
                if (networkCapabilities.hasTransport(1)) {
                    return f25847a;
                }
                if (networkCapabilities.hasTransport(0) && (activeNetworkInfo = connectivityManager.getActiveNetworkInfo()) != null) {
                    return m27573a(activeNetworkInfo.getSubtype());
                }
            } catch (Throwable th) {
                C12317m4.m32153d().m32155a(th);
                IronLog.INTERNAL.error("Error getting network capabilities: " + th);
            }
        }
        return f25850d;
    }

    /* JADX INFO: renamed from: b */
    private static String m27577b(Context context, Network network) {
        NetworkCapabilities networkCapabilities;
        if (network == null || context == null) {
            return "";
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) != null) {
                if (networkCapabilities.hasTransport(1)) {
                    return C11676T3.f25719b;
                }
                if (networkCapabilities.hasTransport(0)) {
                    return C11676T3.f25724g;
                }
                if (networkCapabilities.hasTransport(4)) {
                    return "vpn";
                }
                if (networkCapabilities.hasTransport(3)) {
                    return C11676T3.f25722e;
                }
                if (networkCapabilities.hasTransport(5)) {
                    return C11676T3.f25725h;
                }
                if (networkCapabilities.hasTransport(6)) {
                    return C11676T3.f25726i;
                }
                return networkCapabilities.hasTransport(2) ? C11676T3.f25721d : "";
            }
            return "";
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    public static Network m27571a(Context context) {
        if (context == null) {
            return null;
        }
        return m27572a((ConnectivityManager) context.getSystemService("connectivity"));
    }

    /* JADX INFO: renamed from: a */
    public static JSONObject m27575a(Context context, Network network) {
        NetworkCapabilities networkCapabilities;
        if (context == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        if (network != null) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
                if (connectivityManager != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(network)) != null) {
                    jSONObject.put("networkCapabilities", networkCapabilities.toString());
                    jSONObject.put("downloadSpeed", networkCapabilities.getLinkDownstreamBandwidthKbps());
                    jSONObject.put("uploadSpeed", networkCapabilities.getLinkUpstreamBandwidthKbps());
                    jSONObject.put(C11744X3.j.f26473v, m27580e(context));
                    return jSONObject;
                }
            } catch (Exception e) {
                C12317m4.m32153d().m32155a(e);
                IronLog.INTERNAL.error(e.toString());
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    private static String m27573a(int i) {
        switch (i) {
            case 0:
                return f25852f;
            case 1:
                return f25853g;
            case 2:
                return f25854h;
            case 3:
                return f25855i;
            case 4:
                return f25856j;
            case 5:
                return f25857k;
            case 6:
                return f25858l;
            case 7:
                return f25859m;
            case 8:
                return f25860n;
            case 9:
                return f25861o;
            case 10:
                return f25862p;
            case 11:
                return f25863q;
            case 12:
                return f25864r;
            case 13:
                return f25865s;
            case 14:
                return f25866t;
            case 15:
                return f25867u;
            case 16:
                return f25868v;
            case 17:
                return f25869w;
            case 18:
                return f25870x;
            case 19:
                return f25871y;
            case 20:
                return f25872z;
            default:
                return f25850d;
        }
    }

    /* JADX INFO: renamed from: a */
    private static Network m27572a(ConnectivityManager connectivityManager) {
        try {
            return connectivityManager.getActiveNetwork();
        } catch (Throwable th) {
            C12317m4.m32153d().m32155a(th);
            return null;
        }
    }
}
