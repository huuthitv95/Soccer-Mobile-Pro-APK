package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.q4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3997q4 extends AbstractC3791h2 implements InterfaceC3778gc {

    /* JADX INFO: renamed from: b */
    public final String f15850b;

    /* JADX INFO: renamed from: c */
    public final List f15851c;

    /* JADX INFO: renamed from: d */
    public final String f15852d;

    /* JADX INFO: renamed from: e */
    public final String f15853e;

    /* JADX INFO: renamed from: f */
    public final String f15854f;

    /* JADX INFO: renamed from: g */
    public final String f15855g;

    /* JADX INFO: renamed from: h */
    public final Mediation f15856h;

    public C3997q4(String auctionId, List impressionIds, String str, String str2, String str3, String str4, Mediation mediation) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(impressionIds, "impressionIds");
        this.f15850b = auctionId;
        this.f15851c = impressionIds;
        this.f15852d = str;
        this.f15853e = str2;
        this.f15854f = str3;
        this.f15855g = str4;
        this.f15856h = mediation;
    }

    public /* synthetic */ C3997q4(String str, List list, String str2, String str3, String str4, String str5, Mediation mediation, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, mediation);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3806hh
    /* JADX INFO: renamed from: b */
    public Map mo16812b() {
        Pair[] pairArr = new Pair[3];
        pairArr[0] = TuplesKt.m43482to("CB_ERROR", AbstractC3801hc.m17872a(this.f15852d, this.f15855g));
        String str = this.f15853e;
        if (str == null) {
            str = "";
        }
        pairArr[1] = TuplesKt.m43482to("CB_ERROR_CODE", str);
        String str2 = this.f15854f;
        pairArr[2] = TuplesKt.m43482to("CB_ERROR_CONSTANT", str2 != null ? str2 : "");
        return MapsKt.plus(MapsKt.mapOf(pairArr), AbstractC3801hc.m17873a(this));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3997q4)) {
            return false;
        }
        C3997q4 c3997q4 = (C3997q4) obj;
        return Intrinsics.areEqual(this.f15850b, c3997q4.f15850b) && Intrinsics.areEqual(this.f15851c, c3997q4.f15851c) && Intrinsics.areEqual(this.f15852d, c3997q4.f15852d) && Intrinsics.areEqual(this.f15853e, c3997q4.f15853e) && Intrinsics.areEqual(this.f15854f, c3997q4.f15854f) && Intrinsics.areEqual(this.f15855g, c3997q4.f15855g) && Intrinsics.areEqual(this.f15856h, c3997q4.f15856h);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3778gc
    public Mediation getMediation() {
        return this.f15856h;
    }

    public int hashCode() {
        int iHashCode = ((this.f15850b.hashCode() * 31) + this.f15851c.hashCode()) * 31;
        String str = this.f15852d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f15853e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f15854f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f15855g;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Mediation mediation = this.f15856h;
        return iHashCode5 + (mediation != null ? mediation.hashCode() : 0);
    }

    public String toString() {
        return "CloseEventPayload(auctionId=" + this.f15850b + ", impressionIds=" + this.f15851c + ", errorString=" + this.f15852d + ", errorCode=" + this.f15853e + ", errorConstant=" + this.f15854f + ", errorCauseDescription=" + this.f15855g + ", mediation=" + this.f15856h + ")";
    }
}
