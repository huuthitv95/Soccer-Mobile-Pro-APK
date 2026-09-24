package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.banner.BannerAdLoaderListener;
import com.unity3d.ironsourceads.banner.BannerAdView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.c3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12125c3 implements InterfaceC11706V<BannerAdView> {

    /* JADX INFO: renamed from: a */
    private final InterfaceC11621Pf f30163a;

    /* JADX INFO: renamed from: b */
    private final BannerAdLoaderListener f30164b;

    public C12125c3(InterfaceC11621Pf threadManager, BannerAdLoaderListener publisherListener) {
        Intrinsics.checkNotNullParameter(threadManager, "threadManager");
        Intrinsics.checkNotNullParameter(publisherListener, "publisherListener");
        this.f30163a = threadManager;
        this.f30164b = publisherListener;
    }

    @Override // com.ironsource.InterfaceC11706V
    /* JADX INFO: renamed from: b */
    public void mo26684b(final IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f30163a.mo27215a(new Runnable() { // from class: com.ironsource.c3$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C12125c3.m31254a(error, this);
            }
        });
    }

    @Override // com.ironsource.InterfaceC11706V
    /* JADX INFO: renamed from: a, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo26683a(final BannerAdView adObject) {
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        this.f30163a.mo27215a(new Runnable() { // from class: com.ironsource.c3$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C12125c3.m31255a(adObject, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m31255a(BannerAdView adObject, C12125c3 this$0) {
        Intrinsics.checkNotNullParameter(adObject, "$adObject");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("BannerAdLoaderListener.onBannerAdLoaded adInfo: " + adObject.getAdInfo());
        this$0.f30164b.onBannerAdLoaded(adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m31254a(IronSourceError error, C12125c3 this$0) {
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("BannerAdLoaderListener.onBannerAdLoadFailed error: " + error);
        this$0.f30164b.onBannerAdLoadFailed(error);
    }
}
