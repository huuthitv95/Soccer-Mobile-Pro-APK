package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.eg */
/* JADX INFO: loaded from: classes3.dex */
public final class C3736eg extends AbstractC3791h2 implements InterfaceC3778gc {

    /* JADX INFO: renamed from: b */
    public final String f14085b;

    /* JADX INFO: renamed from: c */
    public final List f14086c;

    /* JADX INFO: renamed from: d */
    public final boolean f14087d;

    /* JADX INFO: renamed from: e */
    public final String f14088e;

    /* JADX INFO: renamed from: f */
    public final String f14089f;

    /* JADX INFO: renamed from: g */
    public final String f14090g;

    /* JADX INFO: renamed from: h */
    public final String f14091h;

    /* JADX INFO: renamed from: i */
    public final Mediation f14092i;

    public C3736eg(String auctionId, List impressionIds, boolean z, String str, String str2, String str3, String str4, Mediation mediation) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(impressionIds, "impressionIds");
        this.f14085b = auctionId;
        this.f14086c = impressionIds;
        this.f14087d = z;
        this.f14088e = str;
        this.f14089f = str2;
        this.f14090g = str3;
        this.f14091h = str4;
        this.f14092i = mediation;
    }

    public /* synthetic */ C3736eg(String str, List list, boolean z, String str2, String str3, String str4, String str5, Mediation mediation, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, z, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, mediation);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3806hh
    /* JADX INFO: renamed from: b */
    public Map mo16812b() {
        Pair[] pairArr = new Pair[4];
        pairArr[0] = TuplesKt.m43482to("CB_REWARD_SKIPPED", String.valueOf(this.f14087d));
        pairArr[1] = TuplesKt.m43482to("CB_ERROR", AbstractC3801hc.m17872a(this.f14088e, this.f14091h));
        String str = this.f14089f;
        if (str == null) {
            str = "";
        }
        pairArr[2] = TuplesKt.m43482to("CB_ERROR_CODE", str);
        String str2 = this.f14090g;
        pairArr[3] = TuplesKt.m43482to("CB_ERROR_CONSTANT", str2 != null ? str2 : "");
        return MapsKt.plus(MapsKt.mapOf(pairArr), AbstractC3801hc.m17873a(this));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3736eg)) {
            return false;
        }
        C3736eg c3736eg = (C3736eg) obj;
        return Intrinsics.areEqual(this.f14085b, c3736eg.f14085b) && Intrinsics.areEqual(this.f14086c, c3736eg.f14086c) && this.f14087d == c3736eg.f14087d && Intrinsics.areEqual(this.f14088e, c3736eg.f14088e) && Intrinsics.areEqual(this.f14089f, c3736eg.f14089f) && Intrinsics.areEqual(this.f14090g, c3736eg.f14090g) && Intrinsics.areEqual(this.f14091h, c3736eg.f14091h) && Intrinsics.areEqual(this.f14092i, c3736eg.f14092i);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3778gc
    public Mediation getMediation() {
        return this.f14092i;
    }

    public int hashCode() {
        int iHashCode = ((((this.f14085b.hashCode() * 31) + this.f14086c.hashCode()) * 31) + UByte$$ExternalSyntheticBackport0.m43487m(this.f14087d)) * 31;
        String str = this.f14088e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f14089f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f14090g;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f14091h;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Mediation mediation = this.f14092i;
        return iHashCode5 + (mediation != null ? mediation.hashCode() : 0);
    }

    public String toString() {
        return "RewardEventPayload(auctionId=" + this.f14085b + ", impressionIds=" + this.f14086c + ", rewardSkipped=" + this.f14087d + ", errorString=" + this.f14088e + ", errorCode=" + this.f14089f + ", errorConstant=" + this.f14090g + ", errorCauseDescription=" + this.f14091h + ", mediation=" + this.f14092i + ")";
    }
}
