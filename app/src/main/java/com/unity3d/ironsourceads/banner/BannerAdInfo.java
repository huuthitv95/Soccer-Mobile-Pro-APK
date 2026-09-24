package com.unity3d.ironsourceads.banner;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class BannerAdInfo {

    /* JADX INFO: renamed from: a */
    private final String f41390a;

    /* JADX INFO: renamed from: b */
    private final String f41391b;

    public BannerAdInfo(String instanceId, String adId) {
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        Intrinsics.checkNotNullParameter(adId, "adId");
        this.f41390a = instanceId;
        this.f41391b = adId;
    }

    public static /* synthetic */ BannerAdInfo copy$default(BannerAdInfo bannerAdInfo, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bannerAdInfo.f41390a;
        }
        if ((i & 2) != 0) {
            str2 = bannerAdInfo.f41391b;
        }
        return bannerAdInfo.copy(str, str2);
    }

    public final String component1() {
        return this.f41390a;
    }

    public final String component2() {
        return this.f41391b;
    }

    public final BannerAdInfo copy(String instanceId, String adId) {
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        Intrinsics.checkNotNullParameter(adId, "adId");
        return new BannerAdInfo(instanceId, adId);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BannerAdInfo)) {
            return false;
        }
        BannerAdInfo bannerAdInfo = (BannerAdInfo) obj;
        return Intrinsics.areEqual(this.f41390a, bannerAdInfo.f41390a) && Intrinsics.areEqual(this.f41391b, bannerAdInfo.f41391b);
    }

    public final String getAdId() {
        return this.f41391b;
    }

    public final String getInstanceId() {
        return this.f41390a;
    }

    public int hashCode() {
        return (this.f41390a.hashCode() * 31) + this.f41391b.hashCode();
    }

    public String toString() {
        return "[instanceId: '" + this.f41390a + "', adId: '" + this.f41391b + "']";
    }
}
