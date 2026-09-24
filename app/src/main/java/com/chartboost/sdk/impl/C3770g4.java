package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.g4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3770g4 extends AbstractC3791h2 implements InterfaceC3778gc {

    /* JADX INFO: renamed from: b */
    public final String f14261b;

    /* JADX INFO: renamed from: c */
    public final List f14262c;

    /* JADX INFO: renamed from: d */
    public final EnumC3953o4 f14263d;

    /* JADX INFO: renamed from: e */
    public final String f14264e;

    /* JADX INFO: renamed from: f */
    public final String f14265f;

    /* JADX INFO: renamed from: g */
    public final String f14266g;

    /* JADX INFO: renamed from: h */
    public final String f14267h;

    /* JADX INFO: renamed from: i */
    public final Mediation f14268i;

    public C3770g4(String auctionId, List impressionIds, EnumC3953o4 clickType, String str, String str2, String str3, String str4, Mediation mediation) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(impressionIds, "impressionIds");
        Intrinsics.checkNotNullParameter(clickType, "clickType");
        this.f14261b = auctionId;
        this.f14262c = impressionIds;
        this.f14263d = clickType;
        this.f14264e = str;
        this.f14265f = str2;
        this.f14266g = str3;
        this.f14267h = str4;
        this.f14268i = mediation;
    }

    public /* synthetic */ C3770g4(String str, List list, EnumC3953o4 enumC3953o4, String str2, String str3, String str4, String str5, Mediation mediation, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, enumC3953o4, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : str5, mediation);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3806hh
    /* JADX INFO: renamed from: b */
    public Map mo16812b() {
        Pair[] pairArr = new Pair[4];
        pairArr[0] = TuplesKt.m43482to("CB_CLICK_TYPE", this.f14263d.m18873b());
        pairArr[1] = TuplesKt.m43482to("CB_ERROR", AbstractC3801hc.m17872a(this.f14264e, this.f14267h));
        String str = this.f14265f;
        if (str == null) {
            str = "";
        }
        pairArr[2] = TuplesKt.m43482to("CB_ERROR_CODE", str);
        String str2 = this.f14266g;
        pairArr[3] = TuplesKt.m43482to("CB_ERROR_CONSTANT", str2 != null ? str2 : "");
        return MapsKt.plus(MapsKt.mapOf(pairArr), AbstractC3801hc.m17873a(this));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3770g4)) {
            return false;
        }
        C3770g4 c3770g4 = (C3770g4) obj;
        return Intrinsics.areEqual(this.f14261b, c3770g4.f14261b) && Intrinsics.areEqual(this.f14262c, c3770g4.f14262c) && this.f14263d == c3770g4.f14263d && Intrinsics.areEqual(this.f14264e, c3770g4.f14264e) && Intrinsics.areEqual(this.f14265f, c3770g4.f14265f) && Intrinsics.areEqual(this.f14266g, c3770g4.f14266g) && Intrinsics.areEqual(this.f14267h, c3770g4.f14267h) && Intrinsics.areEqual(this.f14268i, c3770g4.f14268i);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3778gc
    public Mediation getMediation() {
        return this.f14268i;
    }

    public int hashCode() {
        int iHashCode = ((((this.f14261b.hashCode() * 31) + this.f14262c.hashCode()) * 31) + this.f14263d.hashCode()) * 31;
        String str = this.f14264e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f14265f;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f14266g;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f14267h;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Mediation mediation = this.f14268i;
        return iHashCode5 + (mediation != null ? mediation.hashCode() : 0);
    }

    public String toString() {
        return "ClickEventPayload(auctionId=" + this.f14261b + ", impressionIds=" + this.f14262c + ", clickType=" + this.f14263d + ", errorString=" + this.f14264e + ", errorCode=" + this.f14265f + ", errorConstant=" + this.f14266g + ", errorCauseDescription=" + this.f14267h + ", mediation=" + this.f14268i + ")";
    }
}
