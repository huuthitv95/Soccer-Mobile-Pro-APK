package com.bytedance.sdk.openadsdk.p231fi;

import android.text.TextUtils;
import com.bytedance.sdk.component.p165mj.p166lr.AbstractRunnableC2676ik;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAdLoadListener;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerRequest;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.api.factory.IADLoader;
import com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAdLoadListener;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialRequest;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeAdLoadListener;
import com.bytedance.sdk.openadsdk.api.nativeAd.PAGNativeRequest;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenAdLoadListener;
import com.bytedance.sdk.openadsdk.api.open.PAGAppOpenRequest;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAdLoadListener;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedRequest;
import com.bytedance.sdk.openadsdk.component.p183ik.C2966lr;
import com.bytedance.sdk.openadsdk.component.p185lr.C2978ri;
import com.bytedance.sdk.openadsdk.component.reward.C2985bu;
import com.bytedance.sdk.openadsdk.component.reward.C2987di;
import com.bytedance.sdk.openadsdk.component.reward.jbs;
import com.bytedance.sdk.openadsdk.component.reward.slm;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.jbs.xha;
import com.bytedance.sdk.openadsdk.p252ri.C3513ri;
import com.bytedance.sdk.openadsdk.p252ri.p253fi.C3494lr;
import com.bytedance.sdk.openadsdk.p252ri.p254ik.C3497ri;
import com.bytedance.sdk.openadsdk.p252ri.p255ka.C3499ri;
import com.bytedance.sdk.openadsdk.p252ri.p256lr.C3501fi;
import com.bytedance.sdk.openadsdk.p252ri.p258ri.C3515ri;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.bytedance.sdk.openadsdk.utils.C3578lr;
import com.bytedance.sdk.openadsdk.utils.C3583qd;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.fi.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3368ri implements IADTypeLoaderFactory {
    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGBannerRequest, PAGBannerAdLoadListener> createBannerAdLoader() {
        return new IADLoader<PAGBannerRequest, PAGBannerAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.fi.ri.2
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, final PAGBannerRequest pAGBannerRequest, PAGBannerAdLoadListener pAGBannerAdLoadListener) {
                if (C3513ri.m15921ri(str, pAGBannerRequest, pAGBannerAdLoadListener)) {
                    return;
                }
                AdSlot.Builder codeId = new AdSlot.Builder().setCodeId(str);
                C3513ri.m15919ri(codeId, pAGBannerRequest);
                if (!TextUtils.isEmpty(pAGBannerRequest.getAdString())) {
                    codeId.withBid(pAGBannerRequest.getAdString());
                }
                final PAGBannerSize adSize = pAGBannerRequest != null ? pAGBannerRequest.getAdSize() : null;
                if (adSize != null) {
                    if (adSize.getType() == 3) {
                        codeId.setExpressViewAcceptedSize(adSize.getWidth(), adSize.getMaxHeight());
                    } else {
                        codeId.setExpressViewAcceptedSize(adSize.getWidth(), adSize.getHeight());
                    }
                    codeId.setBannerType(adSize.getType());
                }
                final AdSlot adSlotBuild = codeId.setRequestExtraMap(pAGBannerRequest.getExtraInfo()).build();
                final C3515ri c3515ri = new C3515ri(pAGBannerAdLoadListener);
                C3513ri.m15918ri(new AbstractRunnableC2676ik("loadBannerExpressAd") { // from class: com.bytedance.sdk.openadsdk.fi.ri.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!C3299nr.m14639ka().slm() && C3571ig.igq()) {
                            c3515ri.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (C3513ri.m15920ri(c3515ri)) {
                            return;
                        }
                        PAGBannerSize pAGBannerSize = adSize;
                        if (pAGBannerSize != null && ((pAGBannerSize.getType() == 2 || adSize.getType() == 3) && TextUtils.isEmpty(pAGBannerRequest.getAdString()))) {
                            int iM16586ka = C3583qd.m16586ka(C3299nr.m14642ri());
                            int iXha = C3583qd.xha(C3299nr.m14642ri());
                            int height = adSize.getType() == 2 ? adSize.getHeight() : adSize.getMaxHeight();
                            if (adSize.getWidth() > iM16586ka || adSize.getWidth() <= 0 || height > iXha || height < 0) {
                                c3515ri.onError(-19, "The banner size invalid width=" + adSize.getWidth() + ",height=" + height);
                                return;
                            }
                        }
                        AdSlot adSlot = adSlotBuild;
                        if (adSlot == null) {
                            c3515ri.onError(-4, "adslot is null");
                        } else {
                            adSlot.setDurationSlotType(1);
                            xha.m13749ri(C3299nr.m14642ri()).m13760ri(adSlotBuild, 1, c3515ri);
                        }
                    }
                }, c3515ri, adSlotBuild);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGInterstitialRequest, PAGInterstitialAdLoadListener> createInterstitialAdLoader() {
        return new IADLoader<PAGInterstitialRequest, PAGInterstitialAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.fi.ri.5
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, PAGInterstitialRequest pAGInterstitialRequest, PAGInterstitialAdLoadListener pAGInterstitialAdLoadListener) {
                if (C3513ri.m15921ri(str, pAGInterstitialRequest, pAGInterstitialAdLoadListener)) {
                    return;
                }
                AdSlot.Builder codeId = new AdSlot.Builder().setRequestExtraMap(pAGInterstitialRequest.getExtraInfo()).setCodeId(str);
                C3513ri.m15919ri(codeId, pAGInterstitialRequest);
                if (!TextUtils.isEmpty(pAGInterstitialRequest.getAdString())) {
                    codeId.withBid(pAGInterstitialRequest.getAdString());
                }
                final AdSlot adSlotBuild = codeId.build();
                final C3497ri c3497ri = new C3497ri(pAGInterstitialAdLoadListener);
                C3513ri.m15918ri(new AbstractRunnableC2676ik("loadInterstitialAd") { // from class: com.bytedance.sdk.openadsdk.fi.ri.5.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!C3299nr.m14639ka().slm() && C3571ig.igq()) {
                            c3497ri.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (C3513ri.m15920ri(c3497ri)) {
                            return;
                        }
                        AdSlot adSlot = adSlotBuild;
                        if (adSlot == null) {
                            c3497ri.onError(-4, "adslot is null");
                            return;
                        }
                        try {
                            adSlot.setDurationSlotType(8);
                            if (C3578lr.m16535lr()) {
                                com.bytedance.sdk.openadsdk.component.reward.xha.m12322ri(C3299nr.m14642ri()).m11795ri(adSlotBuild, new C2966lr(c3497ri));
                            } else {
                                C2987di.m11663ri(C3299nr.m14642ri()).m11674ri(adSlotBuild, new C2966lr(c3497ri));
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }, c3497ri, adSlotBuild);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGNativeRequest, PAGNativeAdLoadListener> createNativeAdLoader() {
        return new IADLoader<PAGNativeRequest, PAGNativeAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.fi.ri.3
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, PAGNativeRequest pAGNativeRequest, PAGNativeAdLoadListener pAGNativeAdLoadListener) {
                if (C3513ri.m15921ri(str, pAGNativeRequest, pAGNativeAdLoadListener)) {
                    return;
                }
                final C3501fi c3501fi = new C3501fi(pAGNativeAdLoadListener);
                AdSlot.Builder builderWithBid = new AdSlot.Builder().setCodeId(str).withBid(pAGNativeRequest != null ? pAGNativeRequest.getAdString() : null);
                C3513ri.m15919ri(builderWithBid, pAGNativeRequest);
                final AdSlot adSlotBuild = builderWithBid.setRequestExtraMap(pAGNativeRequest.getExtraInfo()).build();
                C3513ri.m15918ri(new AbstractRunnableC2676ik("loadFeedAd") { // from class: com.bytedance.sdk.openadsdk.fi.ri.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!C3299nr.m14639ka().slm() && C3571ig.igq()) {
                            c3501fi.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (C3513ri.m15920ri(c3501fi)) {
                            return;
                        }
                        AdSlot adSlot = adSlotBuild;
                        if (adSlot == null) {
                            c3501fi.onError(-4, "adslot is null");
                            return;
                        }
                        try {
                            adSlot.setDurationSlotType(5);
                            C2978ri.m11582ri().m11585ri(C3299nr.m14642ri(), adSlotBuild, c3501fi);
                        } catch (Throwable unused) {
                        }
                    }
                }, c3501fi, adSlotBuild);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGAppOpenRequest, PAGAppOpenAdLoadListener> createOpenAdLoader() {
        return new IADLoader<PAGAppOpenRequest, PAGAppOpenAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.fi.ri.1

            /* JADX INFO: renamed from: lr */
            private int f11943lr;

            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, PAGAppOpenRequest pAGAppOpenRequest, PAGAppOpenAdLoadListener pAGAppOpenAdLoadListener) {
                if (C3513ri.m15921ri(str, pAGAppOpenRequest, pAGAppOpenAdLoadListener)) {
                    return;
                }
                AdSlot.Builder builder = new AdSlot.Builder();
                C3513ri.m15919ri(builder, pAGAppOpenRequest);
                if (!TextUtils.isEmpty(pAGAppOpenRequest.getAdString())) {
                    builder.withBid(pAGAppOpenRequest.getAdString());
                }
                final AdSlot adSlotBuild = builder.setCodeId(str).setRequestExtraMap(pAGAppOpenRequest.getExtraInfo()).build();
                if (pAGAppOpenRequest != null) {
                    this.f11943lr = pAGAppOpenRequest.getTimeout();
                }
                final C3499ri c3499ri = new C3499ri(pAGAppOpenAdLoadListener);
                C3513ri.m15918ri(new AbstractRunnableC2676ik("loadSplashAd") { // from class: com.bytedance.sdk.openadsdk.fi.ri.1.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            if (!C3299nr.m14639ka().slm() && C3571ig.igq()) {
                                c3499ri.onError(-18, "Blind mode does not allow requesting ads");
                                return;
                            }
                            if (C3513ri.m15920ri(c3499ri)) {
                                return;
                            }
                            AdSlot adSlot = adSlotBuild;
                            if (adSlot == null) {
                                c3499ri.onError(-4, "adslot is null");
                            } else {
                                adSlot.setDurationSlotType(3);
                                com.bytedance.sdk.openadsdk.component.xha.m12337ri(C3299nr.m14642ri()).m12347ri(adSlotBuild, c3499ri, AnonymousClass1.this.f11943lr);
                            }
                        } catch (Throwable th) {
                            C2707ac.m10206ri("ADNFactory", "open component maybe not exist, please check", th);
                        }
                    }
                }, c3499ri, adSlotBuild);
            }
        };
    }

    @Override // com.bytedance.sdk.openadsdk.api.factory.IADTypeLoaderFactory
    public IADLoader<PAGRewardedRequest, PAGRewardedAdLoadListener> createRewardAdLoader() {
        return new IADLoader<PAGRewardedRequest, PAGRewardedAdLoadListener>() { // from class: com.bytedance.sdk.openadsdk.fi.ri.4
            @Override // com.bytedance.sdk.openadsdk.api.factory.IADLoader
            /* JADX INFO: renamed from: ri, reason: merged with bridge method [inline-methods] */
            public void loadAd(String str, PAGRewardedRequest pAGRewardedRequest, PAGRewardedAdLoadListener pAGRewardedAdLoadListener) {
                if (C3513ri.m15921ri(str, pAGRewardedRequest, pAGRewardedAdLoadListener)) {
                    return;
                }
                AdSlot.Builder codeId = new AdSlot.Builder().setCodeId(str);
                if (!TextUtils.isEmpty(pAGRewardedRequest.getAdString())) {
                    codeId.withBid(pAGRewardedRequest.getAdString());
                }
                C3513ri.m15919ri(codeId, pAGRewardedRequest);
                final AdSlot adSlotBuild = codeId.setRequestExtraMap(pAGRewardedRequest.getExtraInfo()).build();
                final C3494lr c3494lr = new C3494lr(pAGRewardedAdLoadListener);
                C3513ri.m15918ri(new AbstractRunnableC2676ik("loadRewardVideoAd") { // from class: com.bytedance.sdk.openadsdk.fi.ri.4.1
                    @Override // java.lang.Runnable
                    public void run() {
                        if (!C3299nr.m14639ka().slm() && C3571ig.igq()) {
                            c3494lr.onError(-18, "Blind mode does not allow requesting ads");
                            return;
                        }
                        if (C3513ri.m15920ri(c3494lr)) {
                            return;
                        }
                        AdSlot adSlot = adSlotBuild;
                        if (adSlot == null) {
                            c3494lr.onError(-4, "adslot is null");
                            return;
                        }
                        try {
                            adSlot.setDurationSlotType(7);
                            if (C3578lr.m16535lr()) {
                                C2985bu.m11638ri(C3299nr.m14642ri()).m11795ri(adSlotBuild, new jbs(c3494lr));
                            } else {
                                slm.m12192ri(C3299nr.m14642ri()).m12203ri(adSlotBuild, new jbs(c3494lr));
                            }
                        } catch (Throwable unused) {
                        }
                    }
                }, c3494lr, adSlotBuild);
            }
        };
    }
}
