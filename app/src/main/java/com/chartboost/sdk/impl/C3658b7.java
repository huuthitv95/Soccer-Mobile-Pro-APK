package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.b7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3658b7 extends AbstractC3791h2 implements InterfaceC3778gc {

    /* JADX INFO: renamed from: b */
    public final String f13541b;

    /* JADX INFO: renamed from: c */
    public final List f13542c;

    /* JADX INFO: renamed from: d */
    public final EnumC3681c7 f13543d;

    /* JADX INFO: renamed from: e */
    public final EnumC4020r5 f13544e;

    /* JADX INFO: renamed from: f */
    public final String f13545f;

    /* JADX INFO: renamed from: g */
    public final String f13546g;

    /* JADX INFO: renamed from: h */
    public final String f13547h;

    /* JADX INFO: renamed from: i */
    public final String f13548i;

    /* JADX INFO: renamed from: j */
    public final Mediation f13549j;

    public C3658b7(String auctionId, List impressionIds, EnumC3681c7 engagementType, EnumC4020r5 enumC4020r5, String str, String str2, String str3, String str4, Mediation mediation) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(impressionIds, "impressionIds");
        Intrinsics.checkNotNullParameter(engagementType, "engagementType");
        this.f13541b = auctionId;
        this.f13542c = impressionIds;
        this.f13543d = engagementType;
        this.f13544e = enumC4020r5;
        this.f13545f = str;
        this.f13546g = str2;
        this.f13547h = str3;
        this.f13548i = str4;
        this.f13549j = mediation;
    }

    public /* synthetic */ C3658b7(String str, List list, EnumC3681c7 enumC3681c7, EnumC4020r5 enumC4020r5, String str2, String str3, String str4, String str5, Mediation mediation, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, enumC3681c7, (i & 8) != 0 ? null : enumC4020r5, (i & 16) != 0 ? null : str2, (i & 32) != 0 ? null : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, mediation);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3806hh
    /* JADX INFO: renamed from: b */
    public Map mo16812b() {
        Pair[] pairArr = new Pair[5];
        pairArr[0] = TuplesKt.m43482to("CB_ENGAGEMENT_TYPE", this.f13543d.m17045b());
        EnumC4020r5 enumC4020r5 = this.f13544e;
        pairArr[1] = TuplesKt.m43482to("CB_CTA_TYPE", enumC4020r5 != null ? enumC4020r5.m19301b() : null);
        pairArr[2] = TuplesKt.m43482to("CB_ERROR", AbstractC3801hc.m17872a(this.f13545f, this.f13548i));
        String str = this.f13546g;
        if (str == null) {
            str = "";
        }
        pairArr[3] = TuplesKt.m43482to("CB_ERROR_CODE", str);
        String str2 = this.f13547h;
        pairArr[4] = TuplesKt.m43482to("CB_ERROR_CONSTANT", str2 != null ? str2 : "");
        return MapsKt.plus(MapsKt.mapOf(pairArr), AbstractC3801hc.m17873a(this));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3658b7)) {
            return false;
        }
        C3658b7 c3658b7 = (C3658b7) obj;
        return Intrinsics.areEqual(this.f13541b, c3658b7.f13541b) && Intrinsics.areEqual(this.f13542c, c3658b7.f13542c) && this.f13543d == c3658b7.f13543d && this.f13544e == c3658b7.f13544e && Intrinsics.areEqual(this.f13545f, c3658b7.f13545f) && Intrinsics.areEqual(this.f13546g, c3658b7.f13546g) && Intrinsics.areEqual(this.f13547h, c3658b7.f13547h) && Intrinsics.areEqual(this.f13548i, c3658b7.f13548i) && Intrinsics.areEqual(this.f13549j, c3658b7.f13549j);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3778gc
    public Mediation getMediation() {
        return this.f13549j;
    }

    public int hashCode() {
        int iHashCode = ((((this.f13541b.hashCode() * 31) + this.f13542c.hashCode()) * 31) + this.f13543d.hashCode()) * 31;
        EnumC4020r5 enumC4020r5 = this.f13544e;
        int iHashCode2 = (iHashCode + (enumC4020r5 == null ? 0 : enumC4020r5.hashCode())) * 31;
        String str = this.f13545f;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f13546g;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f13547h;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f13548i;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Mediation mediation = this.f13549j;
        return iHashCode6 + (mediation != null ? mediation.hashCode() : 0);
    }

    public String toString() {
        return "EngagementEventPayload(auctionId=" + this.f13541b + ", impressionIds=" + this.f13542c + ", engagementType=" + this.f13543d + ", ctaType=" + this.f13544e + ", errorString=" + this.f13545f + ", errorCode=" + this.f13546g + ", errorConstant=" + this.f13547h + ", errorCauseDescription=" + this.f13548i + ", mediation=" + this.f13549j + ")";
    }
}
