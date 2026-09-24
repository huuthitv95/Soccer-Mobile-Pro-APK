package com.chartboost.sdk.events;

import com.chartboost.sdk.ads.InterfaceC3614Ad;
import com.ironsource.C12538u;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m43474d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B!\b\u0000\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m43475d2 = {"Lcom/chartboost/sdk/events/RewardEvent;", "Lcom/chartboost/sdk/events/AdEvent;", "adID", "", "ad", "Lcom/chartboost/sdk/ads/Ad;", C12538u.f32489j, "", "(Ljava/lang/String;Lcom/chartboost/sdk/ads/Ad;I)V", "getAd", "()Lcom/chartboost/sdk/ads/Ad;", "getAdID", "()Ljava/lang/String;", "getReward", "()I", "ChartboostMonetization-9.11.1_productionRelease"}, m43476k = 1, m43477mv = {1, 9, 0}, m43479xi = 48)
public final class RewardEvent implements AdEvent {
    private final InterfaceC3614Ad ad;
    private final String adID;
    private final int reward;

    public RewardEvent(String str, InterfaceC3614Ad ad, int i) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        this.adID = str;
        this.ad = ad;
        this.reward = i;
    }

    @Override // com.chartboost.sdk.events.AdEvent
    public InterfaceC3614Ad getAd() {
        return this.ad;
    }

    @Override // com.chartboost.sdk.events.AdEvent
    public String getAdID() {
        return this.adID;
    }

    public final int getReward() {
        return this.reward;
    }
}
