package com.fyber.marketplace.fairbid.impl;

import android.app.Application;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.RunnableC7946a0;
import com.fyber.inneractive.sdk.util.AbstractC9174o;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.marketplace.fairbid.bridge.MarketplaceAdLoadError;
import com.fyber.marketplace.fairbid.bridge.MarketplaceAdLoadListener;
import com.fyber.marketplace.fairbid.bridge.MarketplaceBridgeAd;

/* JADX INFO: renamed from: com.fyber.marketplace.fairbid.impl.m */
/* JADX INFO: loaded from: classes4.dex */
public final class C9292m implements IAConfigManager.OnConfigurationReadyAndValidListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MarketplaceBridgeAd f21746a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ MarketplaceAdLoadListener f21747b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ C9293n f21748c;

    public C9292m(C9293n c9293n, MarketplaceBridgeAd marketplaceBridgeAd, MarketplaceAdLoadListener marketplaceAdLoadListener) {
        this.f21748c = c9293n;
        this.f21746a = marketplaceBridgeAd;
        this.f21747b = marketplaceAdLoadListener;
    }

    @Override // com.fyber.inneractive.sdk.config.IAConfigManager.OnConfigurationReadyAndValidListener
    public final void onConfigurationReadyAndValid(IAConfigManager iAConfigManager, boolean z, Exception exc) {
        IAConfigManager.removeListener(this);
        if (!IAConfigManager.m20378d()) {
            MarketplaceAdLoadListener marketplaceAdLoadListener = this.f21747b;
            if (marketplaceAdLoadListener != null) {
                marketplaceAdLoadListener.onAdLoadFailed(MarketplaceAdLoadError.FMP_NOT_READY_TO_LOAD_ADS);
                return;
            }
            return;
        }
        this.f21748c.getClass();
        IAlog.m21945a("maybeInitOmidSdk", new Object[0]);
        if (IAConfigManager.m20380f()) {
            Application application = AbstractC9174o.f21470a;
            IAlog.m21947c("initOmidSdk", new Object[0]);
            AbstractC9183r.f21477a.execute(new RunnableC7946a0(IAConfigManager.f17654M, application));
        }
        this.f21746a.load();
    }
}
