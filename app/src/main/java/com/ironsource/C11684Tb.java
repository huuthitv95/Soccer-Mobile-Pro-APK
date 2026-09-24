package com.ironsource;

import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.internal.InternalNativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.logger.IronSourceError;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.Tb */
/* JADX INFO: loaded from: classes6.dex */
public final class C11684Tb extends AbstractC11534L0 {

    /* JADX INFO: renamed from: a */
    private final InternalNativeAdListener f25814a;

    public C11684Tb(InternalNativeAdListener mNativeAdListener) {
        Intrinsics.checkNotNullParameter(mNativeAdListener, "mNativeAdListener");
        this.f25814a = mNativeAdListener;
    }

    @Override // com.ironsource.AbstractC11534L0
    /* JADX INFO: renamed from: a */
    public void mo26320a(AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder nativeAdViewBinder, AdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adapterNativeAdData, "adapterNativeAdData");
        Intrinsics.checkNotNullParameter(nativeAdViewBinder, "nativeAdViewBinder");
        this.f25814a.onNativeAdLoaded(adInfo, adapterNativeAdData, nativeAdViewBinder);
    }

    @Override // com.ironsource.AbstractC11534L0
    /* JADX INFO: renamed from: d */
    public void mo26329d(AdInfo adInfo) {
        this.f25814a.onNativeAdImpression(adInfo);
    }

    @Override // com.ironsource.AbstractC11534L0
    /* JADX INFO: renamed from: a */
    public void mo26322a(IronSourceError ironSourceError) {
        this.f25814a.onNativeAdLoadFailed(ironSourceError);
    }

    @Override // com.ironsource.AbstractC11534L0
    /* JADX INFO: renamed from: a */
    public void mo26319a(C12135cd placement, AdInfo adInfo) {
        Intrinsics.checkNotNullParameter(placement, "placement");
        this.f25814a.onNativeAdClicked(adInfo);
    }
}
