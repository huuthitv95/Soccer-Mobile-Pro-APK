package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.interstitial.InterstitialAd;
import com.unity3d.ironsourceads.interstitial.InterstitialAdLoaderListener;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.x9 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12602x9 implements InterfaceC11706V<InterstitialAd> {

    /* JADX INFO: renamed from: a */
    private final InterfaceC11621Pf f33165a;

    /* JADX INFO: renamed from: b */
    private final InterstitialAdLoaderListener f33166b;

    public C12602x9(InterfaceC11621Pf threadManager, InterstitialAdLoaderListener publisherListener) {
        Intrinsics.checkNotNullParameter(threadManager, "threadManager");
        Intrinsics.checkNotNullParameter(publisherListener, "publisherListener");
        this.f33165a = threadManager;
        this.f33166b = publisherListener;
    }

    @Override // com.ironsource.InterfaceC11706V
    /* JADX INFO: renamed from: b */
    public void mo26684b(final IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f33165a.mo27215a(new Runnable() { // from class: com.ironsource.x9$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C12602x9.m34140a(error, this);
            }
        });
    }

    @Override // com.ironsource.InterfaceC11706V
    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo26683a(final InterstitialAd adObject) {
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        this.f33165a.mo27215a(new Runnable() { // from class: com.ironsource.x9$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C12602x9.m34141a(adObject, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m34141a(InterstitialAd adObject, C12602x9 this$0) {
        Intrinsics.checkNotNullParameter(adObject, "$adObject");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("InterstitialAdLoaderListener.onInterstitialAdLoaded adInfo: " + adObject.getAdInfo());
        this$0.f33166b.onInterstitialAdLoaded(adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m34140a(IronSourceError error, C12602x9 this$0) {
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("InterstitialAdLoaderListener.onInterstitialAdLoadFailed error: " + error);
        this$0.f33166b.onInterstitialAdLoadFailed(error);
    }
}
