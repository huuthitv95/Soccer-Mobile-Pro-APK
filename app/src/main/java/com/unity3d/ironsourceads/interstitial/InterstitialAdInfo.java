package com.unity3d.ironsourceads.interstitial;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class InterstitialAdInfo {

    /* JADX INFO: renamed from: a */
    private final String f41422a;

    /* JADX INFO: renamed from: b */
    private final String f41423b;

    public InterstitialAdInfo(String instanceId, String adId) {
        Intrinsics.checkNotNullParameter(instanceId, "instanceId");
        Intrinsics.checkNotNullParameter(adId, "adId");
        this.f41422a = instanceId;
        this.f41423b = adId;
    }

    public final String getAdId() {
        return this.f41423b;
    }

    public final String getInstanceId() {
        return this.f41422a;
    }

    public String toString() {
        return "[instanceId: '" + this.f41422a + "', adId: '" + this.f41423b + "']";
    }
}
