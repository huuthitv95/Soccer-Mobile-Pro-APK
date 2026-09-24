package com.chartboost.sdk.ads;

import com.chartboost.sdk.Mediation;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Deprecated;
import kotlin.Metadata;

/* JADX INFO: renamed from: com.chartboost.sdk.ads.Ad */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(m43474d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001J\b\u0010\n\u001a\u00020\u000bH&J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\r\u001a\u00020\u000bH&J\b\u0010\u000e\u001a\u00020\u000fH'J\b\u0010\u0010\u001a\u00020\u000bH&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\u0082\u0001\u0003\u0011\u0012\u0013¨\u0006\u0014"}, m43475d2 = {"Lcom/chartboost/sdk/ads/Ad;", "", FirebaseAnalytics.Param.LOCATION, "", "getLocation", "()Ljava/lang/String;", "mediation", "Lcom/chartboost/sdk/Mediation;", "getMediation", "()Lcom/chartboost/sdk/Mediation;", "cache", "", "bidResponse", "clearCache", "isCached", "", "show", "Lcom/chartboost/sdk/ads/Banner;", "Lcom/chartboost/sdk/ads/Interstitial;", "Lcom/chartboost/sdk/ads/Rewarded;", "ChartboostMonetization-9.11.1_productionRelease"}, m43476k = 1, m43477mv = {1, 9, 0}, m43479xi = 48)
public interface InterfaceC3614Ad {
    void cache();

    void cache(String bidResponse);

    void clearCache();

    String getLocation();

    Mediation getMediation();

    @Deprecated(message = "The isCached() API will be removed in a future SDK release. Additional condition checks have been added to cache() and show() calls making this API redundant.")
    boolean isCached();

    void show();
}
