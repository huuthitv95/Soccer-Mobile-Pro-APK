package com.fyber.marketplace.fairbid.impl;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.AbstractC8129k;
import com.fyber.inneractive.sdk.interfaces.InterfaceC8260a;
import com.fyber.marketplace.fairbid.bridge.MarketplaceAdLoadError;

/* JADX INFO: renamed from: com.fyber.marketplace.fairbid.impl.b */
/* JADX INFO: loaded from: classes9.dex */
public final class C9281b implements InterfaceC8260a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ RunnableC9282c f21727a;

    public C9281b(RunnableC9282c runnableC9282c) {
        this.f21727a = runnableC9282c;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC8260a
    /* JADX INFO: renamed from: a */
    public final void mo20578a(InneractiveAdRequest inneractiveAdRequest) {
        RunnableC9282c runnableC9282c = this.f21727a;
        runnableC9282c.f21732e.adSpot = new C9290k(runnableC9282c.f21730c, ((AbstractC8129k) runnableC9282c.f21729b).f18091c);
        AbstractC9284e abstractC9284e = this.f21727a.f21732e;
        abstractC9284e.internalOnAdLoaded(abstractC9284e, abstractC9284e.adSpot);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC8260a
    /* JADX INFO: renamed from: a */
    public final void mo20581a(InneractiveInfrastructureError inneractiveInfrastructureError) {
        this.f21727a.f21731d.onAdLoadFailed(MarketplaceAdLoadError.FAILED_TO_LOAD_AD);
    }
}
