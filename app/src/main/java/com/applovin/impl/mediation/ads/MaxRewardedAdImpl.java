package com.applovin.impl.mediation.ads;

import android.content.Context;
import com.applovin.impl.AbstractC1793v2;
import com.applovin.impl.C1539e3;
import com.applovin.impl.C1548f2;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;

/* JADX INFO: loaded from: classes3.dex */
public class MaxRewardedAdImpl extends MaxFullscreenAdImpl {

    /* JADX INFO: renamed from: com.applovin.impl.mediation.ads.MaxRewardedAdImpl$b */
    private class C1643b extends MaxFullscreenAdImpl.C1636b implements MaxRewardedAdListener {
        private C1643b() {
            super();
        }

        @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1636b, com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            MaxRewardedAdImpl.this.m3405a((C1539e3) maxAd, maxError);
            super.onAdDisplayFailed(maxAd, maxError);
        }

        @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl.C1636b, com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            MaxRewardedAdImpl.this.m3405a((C1539e3) maxAd, (MaxError) null);
            super.onAdHidden(maxAd);
        }

        @Override // com.applovin.mediation.MaxRewardedAdListener
        public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
            C1768p c1768p = MaxRewardedAdImpl.this.logger;
            if (C1768p.m5160a()) {
                MaxRewardedAdImpl maxRewardedAdImpl = MaxRewardedAdImpl.this;
                maxRewardedAdImpl.logger.m5171a(maxRewardedAdImpl.tag, "MaxRewardedAdListener.onUserRewarded(ad=" + maxAd + ", reward=" + maxReward + "), listener=" + MaxRewardedAdImpl.this.adListener);
            }
            AbstractC1793v2.m5374a(MaxRewardedAdImpl.this.adListener, maxAd, maxReward, true);
        }
    }

    public MaxRewardedAdImpl(String str, MaxAdFormat maxAdFormat, MaxFullscreenAdImpl.InterfaceC1635a interfaceC1635a, String str2, C1748l c1748l, Context context) {
        super(str, maxAdFormat, interfaceC1635a, str2, c1748l, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m3405a(C1539e3 c1539e3, MaxError maxError) {
        if (c1539e3.m2483w0().get() || !c1539e3.m2485y0().compareAndSet(false, true)) {
            return;
        }
        if (C1768p.m5160a()) {
            this.logger.m5171a(this.tag, "User not rewarded for ad: " + c1539e3 + " with error: " + maxError);
        }
        this.sdk.m4784R().m2096a(C1548f2.f1571w0, c1539e3, maxError);
    }

    @Override // com.applovin.impl.mediation.ads.MaxFullscreenAdImpl
    protected MaxFullscreenAdImpl.C1636b createAdListenerWrapper() {
        return new C1643b();
    }
}
