package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.rewarded.RewardedAd;
import com.unity3d.ironsourceads.rewarded.RewardedAdLoaderListener;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.Nd */
/* JADX INFO: loaded from: classes6.dex */
public final class C11583Nd implements InterfaceC11706V<RewardedAd> {

    /* JADX INFO: renamed from: a */
    private final InterfaceC11621Pf f25244a;

    /* JADX INFO: renamed from: b */
    private final RewardedAdLoaderListener f25245b;

    public C11583Nd(InterfaceC11621Pf threadManager, RewardedAdLoaderListener publisherListener) {
        Intrinsics.checkNotNullParameter(threadManager, "threadManager");
        Intrinsics.checkNotNullParameter(publisherListener, "publisherListener");
        this.f25244a = threadManager;
        this.f25245b = publisherListener;
    }

    @Override // com.ironsource.InterfaceC11706V
    /* JADX INFO: renamed from: b */
    public void mo26684b(final IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        IronLog.CALLBACK.info("RewardedAdLoaderListener.onRewardedAdLoadFailed error: " + error);
        this.f25244a.mo27215a(new Runnable() { // from class: com.ironsource.Nd$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C11583Nd.m26681a(this.f$0, error);
            }
        });
    }

    @Override // com.ironsource.InterfaceC11706V
    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo26683a(final RewardedAd adObject) {
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        this.f25244a.mo27215a(new Runnable() { // from class: com.ironsource.Nd$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C11583Nd.m26682a(adObject, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m26682a(RewardedAd adObject, C11583Nd this$0) {
        Intrinsics.checkNotNullParameter(adObject, "$adObject");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("RewardedAdLoaderListener.onRewardedAdLoaded adInfo: " + adObject.getAdInfo());
        this$0.f25245b.onRewardedAdLoaded(adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m26681a(C11583Nd this$0, IronSourceError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        this$0.f25245b.onRewardedAdLoadFailed(error);
    }
}
