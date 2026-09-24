package com.ironsource;

import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.r9 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12459r9 implements InterfaceC12158e0<InterstitialAd> {

    /* JADX INFO: renamed from: a */
    private final InterfaceC12469s1 f31822a;

    /* JADX INFO: renamed from: b */
    private final Executor f31823b;

    public C12459r9(InterfaceC12469s1 analytics, Executor callbackExecutor) {
        Intrinsics.checkNotNullParameter(analytics, "analytics");
        Intrinsics.checkNotNullParameter(callbackExecutor, "callbackExecutor");
        this.f31822a = analytics;
        this.f31823b = callbackExecutor;
    }

    @Override // com.ironsource.InterfaceC12158e0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public InterstitialAd mo25927a(C11471H9 adInstance, C11759Y1 auctionDataReporter) {
        Intrinsics.checkNotNullParameter(adInstance, "adInstance");
        Intrinsics.checkNotNullParameter(auctionDataReporter, "auctionDataReporter");
        return new InterstitialAd(new C12530t9(adInstance, new C12140d0(new C12587wc()), auctionDataReporter, this.f31822a, null, null, null, null, C12477s9.f31894a, 240, null));
    }
}
