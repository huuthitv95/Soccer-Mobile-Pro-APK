package com.unity3d.ironsourceads.rewarded;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class RewardedAdInfo {

    /* JADX INFO: renamed from: a */
    private final String f41435a;

    /* JADX INFO: renamed from: b */
    private final String f41436b;

    public RewardedAdInfo(String instanceId, String adId) {
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        Intrinsics.checkNotNullParameter(adId, "adId");
        this.f41435a = instanceId;
        this.f41436b = adId;
    }

    public final String getAdId() {
        return this.f41436b;
    }

    public final String getInstanceId() {
        return this.f41435a;
    }

    public String toString() {
        return "[instanceId: '" + this.f41435a + "', adId: '" + this.f41436b + "']";
    }
}
