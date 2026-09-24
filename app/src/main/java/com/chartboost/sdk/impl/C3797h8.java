package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.h8 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3797h8 extends AbstractC3791h2 implements InterfaceC3778gc {

    /* JADX INFO: renamed from: b */
    public final String f14387b;

    /* JADX INFO: renamed from: c */
    public final List f14388c;

    /* JADX INFO: renamed from: d */
    public final String f14389d;

    /* JADX INFO: renamed from: e */
    public final String f14390e;

    /* JADX INFO: renamed from: f */
    public final String f14391f;

    /* JADX INFO: renamed from: g */
    public final String f14392g;

    /* JADX INFO: renamed from: h */
    public final Mediation f14393h;

    public C3797h8(String auctionId, List impressionIds, String str, String str2, String str3, String str4, Mediation mediation) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(impressionIds, "impressionIds");
        this.f14387b = auctionId;
        this.f14388c = impressionIds;
        this.f14389d = str;
        this.f14390e = str2;
        this.f14391f = str3;
        this.f14392g = str4;
        this.f14393h = mediation;
    }

    public /* synthetic */ C3797h8(String str, List list, String str2, String str3, String str4, String str5, Mediation mediation, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, mediation);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3806hh
    /* JADX INFO: renamed from: b */
    public Map mo16812b() {
        Pair[] pairArr = new Pair[3];
        pairArr[0] = TuplesKt.m43482to("CB_ERROR", AbstractC3801hc.m17872a(this.f14389d, this.f14392g));
        String str = this.f14390e;
        if (str == null) {
            str = "";
        }
        pairArr[1] = TuplesKt.m43482to("CB_ERROR_CODE", str);
        String str2 = this.f14391f;
        pairArr[2] = TuplesKt.m43482to("CB_ERROR_CONSTANT", str2 != null ? str2 : "");
        return MapsKt.plus(MapsKt.mapOf(pairArr), AbstractC3801hc.m17873a(this));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3797h8)) {
            return false;
        }
        C3797h8 c3797h8 = (C3797h8) obj;
        return Intrinsics.areEqual(this.f14387b, c3797h8.f14387b) && Intrinsics.areEqual(this.f14388c, c3797h8.f14388c) && Intrinsics.areEqual(this.f14389d, c3797h8.f14389d) && Intrinsics.areEqual(this.f14390e, c3797h8.f14390e) && Intrinsics.areEqual(this.f14391f, c3797h8.f14391f) && Intrinsics.areEqual(this.f14392g, c3797h8.f14392g) && Intrinsics.areEqual(this.f14393h, c3797h8.f14393h);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3778gc
    public Mediation getMediation() {
        return this.f14393h;
    }

    public int hashCode() {
        int iHashCode = ((this.f14387b.hashCode() * 31) + this.f14388c.hashCode()) * 31;
        String str = this.f14389d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f14390e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f14391f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f14392g;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Mediation mediation = this.f14393h;
        return iHashCode5 + (mediation != null ? mediation.hashCode() : 0);
    }

    public String toString() {
        return "ExpirationEventPayload(auctionId=" + this.f14387b + ", impressionIds=" + this.f14388c + ", errorString=" + this.f14389d + ", errorCode=" + this.f14390e + ", errorConstant=" + this.f14391f + ", errorCauseDescription=" + this.f14392g + ", mediation=" + this.f14393h + ")";
    }
}
