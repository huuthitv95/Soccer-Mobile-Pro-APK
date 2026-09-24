package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.vg */
/* JADX INFO: loaded from: classes3.dex */
public final class C4119vg extends AbstractC3791h2 implements InterfaceC3778gc {

    /* JADX INFO: renamed from: b */
    public final String f16619b;

    /* JADX INFO: renamed from: c */
    public final List f16620c;

    /* JADX INFO: renamed from: d */
    public final String f16621d;

    /* JADX INFO: renamed from: e */
    public final String f16622e;

    /* JADX INFO: renamed from: f */
    public final String f16623f;

    /* JADX INFO: renamed from: g */
    public final String f16624g;

    /* JADX INFO: renamed from: h */
    public final Mediation f16625h;

    public C4119vg(String auctionId, List impressionIds, String str, String str2, String str3, String str4, Mediation mediation) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(impressionIds, "impressionIds");
        this.f16619b = auctionId;
        this.f16620c = impressionIds;
        this.f16621d = str;
        this.f16622e = str2;
        this.f16623f = str3;
        this.f16624g = str4;
        this.f16625h = mediation;
    }

    public /* synthetic */ C4119vg(String str, List list, String str2, String str3, String str4, String str5, Mediation mediation, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, list, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, mediation);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3806hh
    /* JADX INFO: renamed from: b */
    public Map mo16812b() {
        Pair[] pairArr = new Pair[3];
        pairArr[0] = TuplesKt.m43482to("CB_ERROR", AbstractC3801hc.m17872a(this.f16621d, this.f16623f));
        String str = this.f16622e;
        if (str == null) {
            str = "";
        }
        pairArr[1] = TuplesKt.m43482to("CB_ERROR_CODE", str);
        String str2 = this.f16624g;
        pairArr[2] = TuplesKt.m43482to("CB_ERROR_CONSTANT", str2 != null ? str2 : "");
        return MapsKt.plus(MapsKt.mapOf(pairArr), AbstractC3801hc.m17873a(this));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4119vg)) {
            return false;
        }
        C4119vg c4119vg = (C4119vg) obj;
        return Intrinsics.areEqual(this.f16619b, c4119vg.f16619b) && Intrinsics.areEqual(this.f16620c, c4119vg.f16620c) && Intrinsics.areEqual(this.f16621d, c4119vg.f16621d) && Intrinsics.areEqual(this.f16622e, c4119vg.f16622e) && Intrinsics.areEqual(this.f16623f, c4119vg.f16623f) && Intrinsics.areEqual(this.f16624g, c4119vg.f16624g) && Intrinsics.areEqual(this.f16625h, c4119vg.f16625h);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3778gc
    public Mediation getMediation() {
        return this.f16625h;
    }

    public int hashCode() {
        int iHashCode = ((this.f16619b.hashCode() * 31) + this.f16620c.hashCode()) * 31;
        String str = this.f16621d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f16622e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f16623f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f16624g;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Mediation mediation = this.f16625h;
        return iHashCode5 + (mediation != null ? mediation.hashCode() : 0);
    }

    public String toString() {
        return "ShowEventPayload(auctionId=" + this.f16619b + ", impressionIds=" + this.f16620c + ", errorString=" + this.f16621d + ", errorCode=" + this.f16622e + ", errorCauseDescription=" + this.f16623f + ", errorConstant=" + this.f16624g + ", mediation=" + this.f16625h + ")";
    }
}
