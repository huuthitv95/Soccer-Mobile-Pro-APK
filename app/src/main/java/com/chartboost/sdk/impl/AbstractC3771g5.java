package com.chartboost.sdk.impl;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.g5 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3771g5 {
    /* JADX INFO: renamed from: a */
    public static final NetworkCapabilities m17759a(Context context, Network network) {
        ConnectivityManager connectivityManagerM17763b;
        Object objM44946constructorimpl;
        if (context == null || (connectivityManagerM17763b = m17763b(context)) == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            if (network == null) {
                network = connectivityManagerM17763b.getActiveNetwork();
            }
            objM44946constructorimpl = Result.m44946constructorimpl(connectivityManagerM17763b.getNetworkCapabilities(network));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM44949exceptionOrNullimpl = Result.m44949exceptionOrNullimpl(objM44946constructorimpl);
        if (thM44949exceptionOrNullimpl != null) {
            C4048sb.m19407a("Cannot retrieve network capabilities", thM44949exceptionOrNullimpl);
        }
        return (NetworkCapabilities) (Result.m44952isFailureimpl(objM44946constructorimpl) ? null : objM44946constructorimpl);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ NetworkCapabilities m17760a(Context context, Network network, int i, Object obj) {
        if ((i & 1) != 0) {
            network = null;
        }
        return m17759a(context, network);
    }

    /* JADX INFO: renamed from: a */
    public static final NetworkInfo m17761a(Context context) {
        ConnectivityManager connectivityManagerM17763b;
        Object objM44946constructorimpl;
        if (context == null || (connectivityManagerM17763b = m17763b(context)) == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            objM44946constructorimpl = Result.m44946constructorimpl(connectivityManagerM17763b.getActiveNetworkInfo());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM44949exceptionOrNullimpl = Result.m44949exceptionOrNullimpl(objM44946constructorimpl);
        if (thM44949exceptionOrNullimpl != null) {
            C4048sb.m19407a("Cannot retrieve active network info", thM44949exceptionOrNullimpl);
        }
        return (NetworkInfo) (Result.m44952isFailureimpl(objM44946constructorimpl) ? null : objM44946constructorimpl);
    }

    /* JADX INFO: renamed from: a */
    public static final EnumC4050sd m17762a(int i, int i2) {
        if (i != 0) {
            return i != 1 ? EnumC4050sd.UNKNOWN : EnumC4050sd.WIFI;
        }
        if (i2 == 20) {
            return EnumC4050sd.CELLULAR_5G;
        }
        switch (i2) {
            case 1:
            case 2:
            case 4:
            case 7:
            case 11:
                return EnumC4050sd.CELLULAR_2G;
            case 3:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
            case 12:
            case 14:
            case 15:
                return EnumC4050sd.CELLULAR_3G;
            case 13:
                return EnumC4050sd.CELLULAR_4G;
            default:
                return EnumC4050sd.CELLULAR_UNKNOWN;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final ConnectivityManager m17763b(Context context) {
        Object objM44946constructorimpl;
        if (context == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            Object systemService = context.getSystemService("connectivity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            objM44946constructorimpl = Result.m44946constructorimpl((ConnectivityManager) systemService);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(th));
        }
        Throwable thM44949exceptionOrNullimpl = Result.m44949exceptionOrNullimpl(objM44946constructorimpl);
        if (thM44949exceptionOrNullimpl != null) {
            C4048sb.m19407a("Cannot retrieve connectivity manager", thM44949exceptionOrNullimpl);
        }
        return (ConnectivityManager) (Result.m44952isFailureimpl(objM44946constructorimpl) ? null : objM44946constructorimpl);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m17764c(Context context) {
        NetworkInfo networkInfoM17761a = m17761a(context);
        return networkInfoM17761a != null && networkInfoM17761a.isConnected() && networkInfoM17761a.getType() == 0;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m17765d(Context context) {
        NetworkInfo networkInfoM17761a = m17761a(context);
        NetworkCapabilities networkCapabilitiesM17760a = m17760a(context, null, 1, null);
        if (networkCapabilitiesM17760a != null) {
            return networkCapabilitiesM17760a.hasCapability(16);
        }
        return networkInfoM17761a != null && networkInfoM17761a.isConnected();
    }

    /* JADX INFO: renamed from: e */
    public static final boolean m17766e(Context context) {
        NetworkInfo networkInfoM17761a = m17761a(context);
        return networkInfoM17761a != null && networkInfoM17761a.isConnected() && networkInfoM17761a.getType() == 1;
    }

    /* JADX INFO: renamed from: f */
    public static final int m17767f(Context context) {
        NetworkInfo networkInfoM17761a = m17761a(context);
        if (networkInfoM17761a == null || !networkInfoM17761a.isConnected()) {
            return 0;
        }
        return networkInfoM17761a.getSubtype();
    }

    /* JADX INFO: renamed from: g */
    public static final EnumC4050sd m17768g(Context context) {
        NetworkInfo networkInfoM17761a = m17761a(context);
        if (networkInfoM17761a != null) {
            EnumC4050sd enumC4050sdM17762a = networkInfoM17761a.isConnected() ? m17762a(networkInfoM17761a.getType(), networkInfoM17761a.getSubtype()) : EnumC4050sd.UNKNOWN;
            if (enumC4050sdM17762a != null) {
                return enumC4050sdM17762a;
            }
        }
        return EnumC4050sd.UNKNOWN;
    }
}
