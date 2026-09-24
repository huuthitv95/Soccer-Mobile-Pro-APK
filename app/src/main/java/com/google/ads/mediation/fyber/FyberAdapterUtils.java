package com.google.ads.mediation.fyber;

import android.os.Bundle;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveUserConfig;

/* JADX INFO: loaded from: classes4.dex */
class FyberAdapterUtils {
    private FyberAdapterUtils() {
    }

    public static String getAdapterVersion() {
        return BuildConfig.ADAPTER_VERSION;
    }

    public static String getSdkVersion() {
        return InneractiveAdManager.getVersion();
    }

    static void updateFyberExtraParams(Bundle bundle) {
        if (bundle == null) {
            return;
        }
        InneractiveUserConfig inneractiveUserConfig = new InneractiveUserConfig();
        if (bundle.containsKey("age")) {
            inneractiveUserConfig.setAge(bundle.getInt("age", 0));
        }
        InneractiveAdManager.setUserParams(inneractiveUserConfig);
        if (bundle.containsKey(FyberMediationAdapter.KEY_MUTE_VIDEO)) {
            InneractiveAdManager.setMuteVideo(bundle.getBoolean(FyberMediationAdapter.KEY_MUTE_VIDEO, false));
        }
    }
}
