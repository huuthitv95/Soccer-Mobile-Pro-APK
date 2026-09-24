package com.fyber.marketplace.fairbid.impl;

import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.C7971e;
import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.flow.AbstractC8129k;
import com.fyber.inneractive.sdk.interfaces.InterfaceC8262c;
import com.fyber.inneractive.sdk.response.AbstractC9087e;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.marketplace.fairbid.bridge.MarketplaceAdLoadListener;

/* JADX INFO: renamed from: com.fyber.marketplace.fairbid.impl.c */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC9282c implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AbstractC9087e f21728a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InterfaceC8262c f21729b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ InneractiveUnitController f21730c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ MarketplaceAdLoadListener f21731d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ AbstractC9284e f21732e;

    public RunnableC9282c(AbstractC9284e abstractC9284e, InneractiveUnitController inneractiveUnitController, MarketplaceAdLoadListener marketplaceAdLoadListener, AbstractC9087e abstractC9087e, InterfaceC8262c interfaceC8262c) {
        this.f21732e = abstractC9284e;
        this.f21728a = abstractC9087e;
        this.f21729b = interfaceC8262c;
        this.f21730c = inneractiveUnitController;
        this.f21731d = marketplaceAdLoadListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC9284e abstractC9284e = this.f21732e;
        C8006r featureProvider = abstractC9284e.mMarketplaceAuctionParameters.getFeatureProvider(abstractC9284e.mPlacementId);
        if (featureProvider == null) {
            featureProvider = C8006r.m20431a();
        }
        C8006r c8006r = featureProvider;
        AbstractC9087e abstractC9087e = this.f21728a;
        C7971e c7971e = new C7971e();
        ImpressionData impressionData = abstractC9087e.f21318r;
        c7971e.f17750a = impressionData != null ? impressionData.getDemandId() : null;
        try {
            c7971e.f17751b = Long.valueOf(IAConfigManager.f17654M.f17672d);
        } catch (NumberFormatException unused) {
            IAlog.m21945a("invalid publisherId", new Object[0]);
        }
        c8006r.m20433a(c7971e);
        InterfaceC8262c interfaceC8262c = this.f21729b;
        AbstractC9087e abstractC9087e2 = this.f21728a;
        boolean z = this.f21732e.mMuted;
        C9281b c9281b = new C9281b(this);
        AbstractC8129k abstractC8129k = (AbstractC8129k) interfaceC8262c;
        abstractC8129k.f18096h = z;
        abstractC8129k.m20550a(null, abstractC9087e2, c8006r, c9281b, null);
    }
}
