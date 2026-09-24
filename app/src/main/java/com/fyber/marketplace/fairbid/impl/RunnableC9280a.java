package com.fyber.marketplace.fairbid.impl;

import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.response.EnumC9083a;
import com.fyber.marketplace.fairbid.bridge.MarketplaceAdLoadListener;
import java.util.Map;

/* JADX INFO: renamed from: com.fyber.marketplace.fairbid.impl.a */
/* JADX INFO: loaded from: classes4.dex */
public final class RunnableC9280a implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ MarketplaceAdLoadListener f21721a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ EnumC9083a f21722b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f21723c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ Map f21724d;

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ InneractiveUnitController f21725e;

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ AbstractC9284e f21726f;

    public RunnableC9280a(AbstractC9284e abstractC9284e, MarketplaceAdLoadListener marketplaceAdLoadListener, EnumC9083a enumC9083a, String str, Map map, InneractiveUnitController inneractiveUnitController) {
        this.f21726f = abstractC9284e;
        this.f21721a = marketplaceAdLoadListener;
        this.f21722b = enumC9083a;
        this.f21723c = str;
        this.f21724d = map;
        this.f21725e = inneractiveUnitController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC9284e.access$000(this.f21726f, this.f21725e, this.f21721a, this.f21726f.parseResponseData(this.f21721a, this.f21722b, this.f21723c, this.f21724d), this.f21726f.getAdContentLoader(this.f21721a, this.f21722b));
    }
}
