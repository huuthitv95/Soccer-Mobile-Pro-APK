package com.ironsource;

import com.unity3d.ironsourceads.banner.BannerAdView;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.I2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11482I2 implements InterfaceC11464H2 {

    /* JADX INFO: renamed from: a */
    private final InterfaceC12469s1 f24468a;

    /* JADX INFO: renamed from: b */
    private final Executor f24469b;

    public C11482I2(InterfaceC12469s1 analytics, Executor callbackExecutor) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(callbackExecutor, "callbackExecutor");
        this.f24468a = analytics;
        this.f24469b = callbackExecutor;
    }

    @Override // com.ironsource.InterfaceC11464H2
    /* JADX INFO: renamed from: a */
    public BannerAdView mo25974a(C11471H9 adInstance, C12166e8 adContainer, C11759Y1 auctionDataReporter) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(adContainer, "adContainer");
        Intrinsics.checkNotNullParameter(auctionDataReporter, "auctionDataReporter");
        return new BannerAdView(new C11608P2(adInstance, adContainer, auctionDataReporter, this.f24468a, null, null, null, null, 240, null));
    }
}
