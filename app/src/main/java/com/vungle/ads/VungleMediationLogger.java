package com.vungle.ads;

import com.vungle.ads.internal.protos.Sdk;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: VungleMediationLogger.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007¨\u0006\t"}, m43475d2 = {"Lcom/vungle/ads/VungleMediationLogger;", "", "()V", "logError", "", "ad", "Lcom/vungle/ads/VungleAdType;", "message", "", "vungle-ads_release"}, m43476k = 1, m43477mv = {1, 7, 1}, m43479xi = 48)
public final class VungleMediationLogger {
    public static final VungleMediationLogger INSTANCE = new VungleMediationLogger();

    private VungleMediationLogger() {
    }

    @JvmStatic
    public static final void logError(VungleAdType ad, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        AnalyticsClient.INSTANCE.logError$vungle_ads_release(Sdk.SDKError.Reason.MEDIATION_ERROR, message, ad != null ? VungleMediationLoggerKt.getAdLogEntry(ad) : null);
    }
}
