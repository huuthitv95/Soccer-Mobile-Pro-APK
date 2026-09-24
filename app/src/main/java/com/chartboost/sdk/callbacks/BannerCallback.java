package com.chartboost.sdk.callbacks;

import com.chartboost.sdk.events.ExpirationEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m43474d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m43475d2 = {"Lcom/chartboost/sdk/callbacks/BannerCallback;", "Lcom/chartboost/sdk/callbacks/AdCallback;", "ChartboostMonetization-9.11.1_productionRelease"}, m43476k = 1, m43477mv = {1, 9, 0}, m43479xi = 48)
public interface BannerCallback extends AdCallback {

    @Metadata(m43476k = 3, m43477mv = {1, 9, 0}, m43479xi = 48)
    public static final class DefaultImpls {
        public static void onAdExpired(BannerCallback bannerCallback, ExpirationEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            AdCallback.DefaultImpls.onAdExpired(bannerCallback, event);
        }
    }
}
