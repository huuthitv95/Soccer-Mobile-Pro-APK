package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.ia */
/* JADX INFO: loaded from: classes3.dex */
public final class C3822ia extends AbstractC3791h2 implements InterfaceC3778gc {

    /* JADX INFO: renamed from: b */
    public final String f14574b;

    /* JADX INFO: renamed from: c */
    public final List f14575c;

    /* JADX INFO: renamed from: d */
    public final String f14576d;

    /* JADX INFO: renamed from: e */
    public final String f14577e;

    /* JADX INFO: renamed from: f */
    public final String f14578f;

    /* JADX INFO: renamed from: g */
    public final String f14579g;

    /* JADX INFO: renamed from: h */
    public final Mediation f14580h;

    public C3822ia(String auctionId, List impressionIds, String str, String str2, String str3, String str4, Mediation mediation) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(impressionIds, "impressionIds");
        this.f14574b = auctionId;
        this.f14575c = impressionIds;
        this.f14576d = str;
        this.f14577e = str2;
        this.f14578f = str3;
        this.f14579g = str4;
        this.f14580h = mediation;
    }

    public /* synthetic */ C3822ia(String str, List list, String str2, String str3, String str4, String str5, Mediation mediation, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, mediation);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3806hh
    /* JADX INFO: renamed from: b */
    public Map mo16812b() {
        Pair[] pairArr = new Pair[3];
        pairArr[0] = TuplesKt.m43482to("CB_ERROR", AbstractC3801hc.m17872a(this.f14576d, this.f14579g));
        String str = this.f14577e;
        if (str == null) {
            str = "";
        }
        pairArr[1] = TuplesKt.m43482to("CB_ERROR_CODE", str);
        String str2 = this.f14578f;
        pairArr[2] = TuplesKt.m43482to("CB_ERROR_CONSTANT", str2 != null ? str2 : "");
        return MapsKt.plus(MapsKt.mapOf(pairArr), AbstractC3801hc.m17873a(this));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3822ia)) {
            return false;
        }
        C3822ia c3822ia = (C3822ia) obj;
        return Intrinsics.areEqual(this.f14574b, c3822ia.f14574b) && Intrinsics.areEqual(this.f14575c, c3822ia.f14575c) && Intrinsics.areEqual(this.f14576d, c3822ia.f14576d) && Intrinsics.areEqual(this.f14577e, c3822ia.f14577e) && Intrinsics.areEqual(this.f14578f, c3822ia.f14578f) && Intrinsics.areEqual(this.f14579g, c3822ia.f14579g) && Intrinsics.areEqual(this.f14580h, c3822ia.f14580h);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3778gc
    public Mediation getMediation() {
        return this.f14580h;
    }

    public int hashCode() {
        int iHashCode = ((this.f14574b.hashCode() * 31) + this.f14575c.hashCode()) * 31;
        String str = this.f14576d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f14577e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f14578f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f14579g;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Mediation mediation = this.f14580h;
        return iHashCode5 + (mediation != null ? mediation.hashCode() : 0);
    }

    public String toString() {
        return "ImpressionEventPayload(auctionId=" + this.f14574b + ", impressionIds=" + this.f14575c + ", errorString=" + this.f14576d + ", errorCode=" + this.f14577e + ", errorConstant=" + this.f14578f + ", errorCauseDescription=" + this.f14579g + ", mediation=" + this.f14580h + ")";
    }
}
