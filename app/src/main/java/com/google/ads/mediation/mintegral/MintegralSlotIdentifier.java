package com.google.ads.mediation.mintegral;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: MintegralSlotIdentifier.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m43474d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m43475d2 = {"Lcom/google/ads/mediation/mintegral/MintegralSlotIdentifier;", "", "adUnitId", "", "placementId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getAdUnitId", "()Ljava/lang/String;", "getPlacementId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "mintegral_release"}, m43476k = 1, m43477mv = {2, 1, 0}, m43479xi = 48)
public final /* data */ class MintegralSlotIdentifier {
    private final String adUnitId;
    private final String placementId;

    public MintegralSlotIdentifier(String adUnitId, String placementId) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        this.adUnitId = adUnitId;
        this.placementId = placementId;
    }

    public static /* synthetic */ MintegralSlotIdentifier copy$default(MintegralSlotIdentifier mintegralSlotIdentifier, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = mintegralSlotIdentifier.adUnitId;
        }
        if ((i & 2) != 0) {
            str2 = mintegralSlotIdentifier.placementId;
        }
        return mintegralSlotIdentifier.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAdUnitId() {
        return this.adUnitId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPlacementId() {
        return this.placementId;
    }

    public final MintegralSlotIdentifier copy(String adUnitId, String placementId) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        return new MintegralSlotIdentifier(adUnitId, placementId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MintegralSlotIdentifier)) {
            return false;
        }
        MintegralSlotIdentifier mintegralSlotIdentifier = (MintegralSlotIdentifier) other;
        return Intrinsics.areEqual(this.adUnitId, mintegralSlotIdentifier.adUnitId) && Intrinsics.areEqual(this.placementId, mintegralSlotIdentifier.placementId);
    }

    public final String getAdUnitId() {
        return this.adUnitId;
    }

    public final String getPlacementId() {
        return this.placementId;
    }

    public int hashCode() {
        return (this.adUnitId.hashCode() * 31) + this.placementId.hashCode();
    }

    public String toString() {
        return "MintegralSlotIdentifier(adUnitId=" + this.adUnitId + ", placementId=" + this.placementId + ")";
    }
}
