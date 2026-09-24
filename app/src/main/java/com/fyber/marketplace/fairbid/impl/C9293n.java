package com.fyber.marketplace.fairbid.impl;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.serverapi.C9114c;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters;
import com.fyber.marketplace.fairbid.bridge.MarketplaceBannerListener;
import com.fyber.marketplace.fairbid.bridge.MarketplaceBridge;
import com.fyber.marketplace.fairbid.bridge.MarketplaceInterstitialListener;
import com.fyber.marketplace.fairbid.bridge.MarketplaceOnUserAgentAvailableListener;
import com.fyber.marketplace.fairbid.bridge.MarketplaceRewardedListener;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.marketplace.fairbid.impl.n */
/* JADX INFO: loaded from: classes4.dex */
public final class C9293n extends MarketplaceBridge {

    /* JADX INFO: renamed from: c */
    public final C9286g f21749c = new C9286g(new C9114c(C8006r.m20431a()));

    /* JADX INFO: renamed from: d */
    public boolean f21750d = false;

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceBridge
    public final MarketplaceAuctionParameters getAuctionParameters() {
        C9286g c9286g = this.f21749c;
        c9286g.f21737c = "";
        return c9286g;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceBridge
    public final MarketplaceAuctionParameters getAuctionParameters(String str) {
        C9286g c9286g = this.f21749c;
        c9286g.f21737c = str;
        return c9286g;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceBridge
    public final boolean isMuted() {
        return this.f21750d;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceBridge
    public final void loadBannerAd(String str, JSONObject jSONObject, Map map, MarketplaceBannerListener marketplaceBannerListener) {
        IAlog.m21945a("Request Banner with spotId = %s", str);
        IAConfigManager.addListener(new C9292m(this, new C9289j(str, jSONObject, map, this.f21750d, marketplaceBannerListener, this.f21749c), marketplaceBannerListener));
        IAConfigManager.m20375a();
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceBridge
    public final void loadInterstitialAd(String str, JSONObject jSONObject, Map map, MarketplaceInterstitialListener marketplaceInterstitialListener) {
        IAlog.m21945a("Request Interstitial with spotId = %s", str);
        IAConfigManager.addListener(new C9292m(this, new C9295p(str, jSONObject, map, this.f21750d, marketplaceInterstitialListener, this.f21749c), marketplaceInterstitialListener));
        IAConfigManager.m20375a();
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceBridge
    public final void loadRewardedAd(String str, JSONObject jSONObject, Map map, MarketplaceRewardedListener marketplaceRewardedListener) {
        IAlog.m21945a("Request Interstitial with spotId = %s", str);
        IAConfigManager.addListener(new C9292m(this, new C9296q(str, jSONObject, map, this.f21750d, marketplaceRewardedListener, this.f21749c), marketplaceRewardedListener));
        IAConfigManager.m20375a();
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceBridge
    public final String requestUserAgent(MarketplaceOnUserAgentAvailableListener marketplaceOnUserAgentAvailableListener) {
        AbstractC9183r.f21477a.execute(new RunnableC9291l(marketplaceOnUserAgentAvailableListener));
        return IAConfigManager.f17654M.f17692x.m22016a();
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceBridge
    public final void setMuted(boolean z) {
        this.f21750d = z;
    }
}
