package com.ironsource;

import com.unity3d.ironsourceads.rewarded.RewardedAd;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.Gd */
/* JADX INFO: loaded from: classes6.dex */
public final class C11457Gd implements InterfaceC12158e0<RewardedAd> {

    /* JADX INFO: renamed from: a */
    private final InterfaceC12469s1 f24390a;

    /* JADX INFO: renamed from: b */
    private final Executor f24391b;

    public C11457Gd(InterfaceC12469s1 analytics, Executor callbackExecutor) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(callbackExecutor, "callbackExecutor");
        this.f24390a = analytics;
        this.f24391b = callbackExecutor;
    }

    @Override // com.ironsource.InterfaceC12158e0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public RewardedAd mo25927a(C11471H9 adInstance, C11759Y1 auctionDataReporter) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(auctionDataReporter, "auctionDataReporter");
        return new RewardedAd(new C11511Jd(adInstance, new C12140d0(new C12587wc()), auctionDataReporter, this.f24390a, null, null, null, null, C11475Hd.f24442a, 240, null));
    }
}
