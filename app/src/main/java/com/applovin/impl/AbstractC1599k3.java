package com.applovin.impl;

import com.applovin.impl.mediation.ads.AbstractC1644a;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;

/* JADX INFO: renamed from: com.applovin.impl.k3 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1599k3 implements MaxAdListener, MaxRewardedAdListener, MaxAdViewAdListener, MaxAdRevenueListener, AbstractC1644a.a {

    /* JADX INFO: renamed from: a */
    private final AbstractC1644a.a f1968a;

    public AbstractC1599k3(AbstractC1644a.a aVar) {
        this.f1968a = aVar;
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdClicked(MaxAd maxAd) {
        AbstractC1793v2.m5370a((MaxAdListener) this.f1968a, maxAd);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdCollapsed(MaxAd maxAd) {
        AbstractC1793v2.m5414b(this.f1968a, maxAd);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        AbstractC1793v2.m5371a(this.f1968a, maxAd, maxError);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayed(MaxAd maxAd) {
        AbstractC1793v2.m5434c(this.f1968a, maxAd);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdExpanded(MaxAd maxAd) {
        AbstractC1793v2.m5443d(this.f1968a, maxAd);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdHidden(MaxAd maxAd) {
        AbstractC1793v2.m5450e(this.f1968a, maxAd);
    }

    @Override // com.applovin.mediation.MaxAdRequestListener
    public void onAdRequestStarted(String str) {
        AbstractC1793v2.m5378a(this.f1968a, str);
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        AbstractC1793v2.m5380a((MaxAdRevenueListener) this.f1968a, maxAd);
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
        AbstractC1793v2.m5373a(this.f1968a, maxAd, maxReward);
    }
}
