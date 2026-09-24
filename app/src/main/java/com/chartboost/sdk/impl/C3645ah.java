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

/* JADX INFO: renamed from: com.chartboost.sdk.impl.ah */
/* JADX INFO: loaded from: classes3.dex */
public final class C3645ah extends AbstractC3791h2 implements InterfaceC3778gc {

    /* JADX INFO: renamed from: b */
    public final String f13472b;

    /* JADX INFO: renamed from: c */
    public final List f13473c;

    /* JADX INFO: renamed from: d */
    public final boolean f13474d;

    /* JADX INFO: renamed from: e */
    public final String f13475e;

    /* JADX INFO: renamed from: f */
    public final String f13476f;

    /* JADX INFO: renamed from: g */
    public final String f13477g;

    /* JADX INFO: renamed from: h */
    public final String f13478h;

    /* JADX INFO: renamed from: i */
    public final Mediation f13479i;

    public C3645ah(String auctionId, List impressionIds, boolean z, String str, String str2, String str3, String str4, Mediation mediation) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(impressionIds, "impressionIds");
        this.f13472b = auctionId;
        this.f13473c = impressionIds;
        this.f13474d = z;
        this.f13475e = str;
        this.f13476f = str2;
        this.f13477g = str3;
        this.f13478h = str4;
        this.f13479i = mediation;
    }

    public /* synthetic */ C3645ah(String str, List list, boolean z, String str2, String str3, String str4, String str5, Mediation mediation, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, z, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, mediation);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3806hh
    /* JADX INFO: renamed from: b */
    public Map mo16812b() {
        Pair[] pairArr = new Pair[4];
        pairArr[0] = TuplesKt.m43482to("CB_USER_INITIATED", String.valueOf(this.f13474d));
        pairArr[1] = TuplesKt.m43482to("CB_ERROR", AbstractC3801hc.m17872a(this.f13475e, this.f13478h));
        String str = this.f13476f;
        if (str == null) {
            str = "";
        }
        pairArr[2] = TuplesKt.m43482to("CB_ERROR_CODE", str);
        String str2 = this.f13477g;
        pairArr[3] = TuplesKt.m43482to("CB_ERROR_CONSTANT", str2 != null ? str2 : "");
        return MapsKt.plus(MapsKt.mapOf(pairArr), AbstractC3801hc.m17873a(this));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3645ah)) {
            return false;
        }
        C3645ah c3645ah = (C3645ah) obj;
        return Intrinsics.areEqual(this.f13472b, c3645ah.f13472b) && Intrinsics.areEqual(this.f13473c, c3645ah.f13473c) && this.f13474d == c3645ah.f13474d && Intrinsics.areEqual(this.f13475e, c3645ah.f13475e) && Intrinsics.areEqual(this.f13476f, c3645ah.f13476f) && Intrinsics.areEqual(this.f13477g, c3645ah.f13477g) && Intrinsics.areEqual(this.f13478h, c3645ah.f13478h) && Intrinsics.areEqual(this.f13479i, c3645ah.f13479i);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3778gc
    public Mediation getMediation() {
        return this.f13479i;
    }

    public int hashCode() {
        int iHashCode = ((((this.f13472b.hashCode() * 31) + this.f13473c.hashCode()) * 31) + UByte$$ExternalSyntheticBackport0.m43487m(this.f13474d)) * 31;
        String str = this.f13475e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f13476f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f13477g;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f13478h;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Mediation mediation = this.f13479i;
        return iHashCode5 + (mediation != null ? mediation.hashCode() : 0);
    }

    public String toString() {
        return "SkipEventPayload(auctionId=" + this.f13472b + ", impressionIds=" + this.f13473c + ", userInitiatedSkip=" + this.f13474d + ", errorString=" + this.f13475e + ", errorCode=" + this.f13476f + ", errorConstant=" + this.f13477g + ", errorCauseDescription=" + this.f13478h + ", mediation=" + this.f13479i + ")";
    }
}
