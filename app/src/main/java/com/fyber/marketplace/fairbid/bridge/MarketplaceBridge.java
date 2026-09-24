package com.fyber.marketplace.fairbid.bridge;

import android.content.Context;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.marketplace.fairbid.impl.C9293n;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public abstract class MarketplaceBridge {

    /* JADX INFO: renamed from: a */
    public static volatile C9293n f21719a;

    /* JADX INFO: renamed from: b */
    public static final Object f21720b = new Object();

    public static void currentAudienceAppliesCoppa() {
        InneractiveAdManager.currentAudienceAppliesToCoppa();
    }

    public static void currentAudienceIsAChild() {
        InneractiveAdManager.currentAudienceIsAChild();
    }

    public static MarketplaceBridge getInstance() {
        C9293n c9293n;
        C9293n c9293n2 = f21719a;
        if (c9293n2 != null) {
            return c9293n2;
        }
        synchronized (f21720b) {
            c9293n = f21719a;
            if (c9293n == null) {
                c9293n = new C9293n();
                f21719a = c9293n;
            }
        }
        return c9293n;
    }

    public static String getVersion() {
        return InneractiveAdManager.getVersion();
    }

    public static MarketplaceBridge initialize(Context context, String str, String str2, boolean z) {
        InneractiveAdManager.initialize(context, str);
        IAConfigManager.f17654M.f17687s = str2;
        IAlog.f21426a = z ? 2 : 5;
        return getInstance();
    }

    public static boolean isChild() {
        return InneractiveAdManager.isCurrentUserAChild();
    }

    public abstract MarketplaceAuctionParameters getAuctionParameters();

    public abstract MarketplaceAuctionParameters getAuctionParameters(String str);

    public abstract boolean isMuted();

    public abstract void loadBannerAd(String str, JSONObject jSONObject, Map<String, String> map, MarketplaceBannerListener marketplaceBannerListener);

    public abstract void loadInterstitialAd(String str, JSONObject jSONObject, Map<String, String> map, MarketplaceInterstitialListener marketplaceInterstitialListener);

    public abstract void loadRewardedAd(String str, JSONObject jSONObject, Map<String, String> map, MarketplaceRewardedListener marketplaceRewardedListener);

    public abstract String requestUserAgent(MarketplaceOnUserAgentAvailableListener marketplaceOnUserAgentAvailableListener);

    public abstract void setMuted(boolean z);
}
