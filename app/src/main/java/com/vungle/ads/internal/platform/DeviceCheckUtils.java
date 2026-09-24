package com.vungle.ads.internal.platform;

import android.content.Context;
import android.hardware.SensorManager;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.ProxyInfo;
import android.net.Uri;
import android.os.Build;
import android.provider.Settings;
import com.facebook.share.internal.MessengerShareContentUtility;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: compiled from: DeviceCheckUtils.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\f\u001a\u00020\b*\u0004\u0018\u00010\rH\u0002¨\u0006\u000e"}, m43475d2 = {"Lcom/vungle/ads/internal/platform/DeviceCheckUtils;", "", "()V", "getSensorCount", "", "context", "Landroid/content/Context;", "hasSystemAlertWindowPermission", "", "isEmulator", "isProxyEnabled", "isVpnConnected", "isEnabled", "Landroid/net/ProxyInfo;", "vungle-ads_release"}, m43476k = 1, m43477mv = {1, 7, 1}, m43479xi = 48)
public final class DeviceCheckUtils {
    public static final DeviceCheckUtils INSTANCE = new DeviceCheckUtils();

    private DeviceCheckUtils() {
    }

    private final boolean isEnabled(ProxyInfo proxyInfo) {
        if (proxyInfo == null) {
            return false;
        }
        String host = proxyInfo.getHost();
        return (host != null && host.length() > 0 && proxyInfo.getPort() > 0) || (proxyInfo.getPacFileUrl() != null && !Intrinsics.areEqual(proxyInfo.getPacFileUrl(), Uri.EMPTY));
    }

    public final int getSensorCount(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = context.getSystemService("sensor");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        return ((SensorManager) systemService).getSensorList(-1).size();
    }

    public final boolean hasSystemAlertWindowPermission(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return Settings.canDrawOverlays(context);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    /* JADX WARN: Code duplicated, block: B:16:0x0033  */
    /* JADX WARN: Code duplicated, block: B:21:0x0043  */
    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    /* JADX WARN: Code duplicated, block: B:6:0x0013  */
    public final boolean isEmulator() {
        String lowerCase;
        String lowerCase2;
        String lowerCase3;
        String lowerCase4;
        String lowerCase5;
        String str = Build.FINGERPRINT;
        String str2 = "";
        if (str != null) {
            lowerCase = str.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (lowerCase == null) {
                lowerCase = "";
            }
        } else {
            lowerCase = "";
        }
        String str3 = Build.MODEL;
        if (str3 != null) {
            lowerCase2 = str3.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (lowerCase2 == null) {
                lowerCase2 = "";
            }
        } else {
            lowerCase2 = "";
        }
        String str4 = Build.PRODUCT;
        if (str4 != null) {
            lowerCase3 = str4.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (lowerCase3 == null) {
                lowerCase3 = "";
            }
        } else {
            lowerCase3 = "";
        }
        String str5 = Build.BRAND;
        if (str5 != null) {
            lowerCase4 = str5.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase4, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (lowerCase4 == null) {
                lowerCase4 = "";
            }
        } else {
            lowerCase4 = "";
        }
        String str6 = Build.MANUFACTURER;
        if (str6 != null) {
            lowerCase5 = str6.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase5, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (lowerCase5 == null) {
                lowerCase5 = "";
            }
        } else {
            lowerCase5 = "";
        }
        String str7 = Build.BOARD;
        if (str7 != null) {
            String lowerCase6 = str7.toLowerCase(Locale.ROOT);
            Intrinsics.checkNotNullExpressionValue(lowerCase6, "this as java.lang.String).toLowerCase(Locale.ROOT)");
            if (lowerCase6 != null) {
                str2 = lowerCase6;
            }
        }
        String[] SUPPORTED_ABIS = Build.SUPPORTED_ABIS;
        Intrinsics.checkNotNullExpressionValue(SUPPORTED_ABIS, "SUPPORTED_ABIS");
        String lowerCase7 = ArraysKt.joinToString$default(SUPPORTED_ABIS, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null).toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase7, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        String str8 = lowerCase;
        if (StringsKt.contains$default((CharSequence) str8, (CharSequence) MessengerShareContentUtility.TEMPLATE_GENERIC_TYPE, false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str8, (CharSequence) "emulator", false, 2, (Object) null)) {
            return true;
        }
        String str9 = lowerCase2;
        if (StringsKt.contains$default((CharSequence) str9, (CharSequence) "google_sdk", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str9, (CharSequence) "emulator", false, 2, (Object) null)) {
            return true;
        }
        String str10 = lowerCase3;
        return StringsKt.contains$default((CharSequence) str10, (CharSequence) "sdk", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str10, (CharSequence) "vbox", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) lowerCase4, (CharSequence) MessengerShareContentUtility.TEMPLATE_GENERIC_TYPE, false, 2, (Object) null) || StringsKt.contains$default((CharSequence) lowerCase5, (CharSequence) "genymotion", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) str2, (CharSequence) "nox", false, 2, (Object) null) || StringsKt.contains$default((CharSequence) lowerCase7, (CharSequence) "x86", false, 2, (Object) null);
    }

    public final boolean isProxyEnabled(Context context) {
        Object objM44946constructorimpl;
        boolean zIsEnabled;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Result.Companion companion = Result.INSTANCE;
            DeviceCheckUtils deviceCheckUtils = this;
            Object systemService = context.getSystemService("connectivity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork == null) {
                zIsEnabled = false;
            } else {
                Intrinsics.checkNotNullExpressionValue(activeNetwork, "cm.activeNetwork ?: return@runCatching false");
                LinkProperties linkProperties = connectivityManager.getLinkProperties(activeNetwork);
                zIsEnabled = isEnabled(linkProperties != null ? linkProperties.getHttpProxy() : null);
            }
            objM44946constructorimpl = Result.m44946constructorimpl(Boolean.valueOf(zIsEnabled));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m44952isFailureimpl(objM44946constructorimpl)) {
            objM44946constructorimpl = false;
        }
        return ((Boolean) objM44946constructorimpl).booleanValue();
    }

    public final boolean isVpnConnected(Context context) {
        Object objM44946constructorimpl;
        boolean z;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Result.Companion companion = Result.INSTANCE;
            DeviceCheckUtils deviceCheckUtils = this;
            Object systemService = context.getSystemService("connectivity");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
            ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
            Network[] allNetworks = connectivityManager.getAllNetworks();
            Intrinsics.checkNotNullExpressionValue(allNetworks, "cm.allNetworks");
            Network[] networkArr = allNetworks;
            int length = networkArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = false;
                    break;
                }
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(networkArr[i]);
                if (networkCapabilities != null) {
                    z = true;
                    if (networkCapabilities.hasTransport(4)) {
                        break;
                    }
                }
                i++;
            }
            objM44946constructorimpl = Result.m44946constructorimpl(Boolean.valueOf(z));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m44952isFailureimpl(objM44946constructorimpl)) {
            objM44946constructorimpl = false;
        }
        return ((Boolean) objM44946constructorimpl).booleanValue();
    }
}
