package com.fyber.marketplace.fairbid.impl;

import com.fyber.marketplace.fairbid.bridge.MarketplaceAdLoadListener;
import com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters;
import com.fyber.marketplace.fairbid.bridge.MarketplaceFullscreenAd;
import com.fyber.marketplace.fairbid.bridge.MarketplaceInterstitialAd;
import com.fyber.marketplace.fairbid.bridge.MarketplaceInterstitialDisplayEventsListener;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.marketplace.fairbid.impl.p */
/* JADX INFO: loaded from: classes4.dex */
public final class C9295p extends AbstractC9294o implements MarketplaceInterstitialAd {
    public C9295p(String str, JSONObject jSONObject, Map<String, String> map, boolean z, MarketplaceAdLoadListener<MarketplaceFullscreenAd<MarketplaceInterstitialDisplayEventsListener>> marketplaceAdLoadListener, MarketplaceAuctionParameters marketplaceAuctionParameters) {
        super(str, jSONObject, map, z, marketplaceAdLoadListener, marketplaceAuctionParameters);
    }
}
