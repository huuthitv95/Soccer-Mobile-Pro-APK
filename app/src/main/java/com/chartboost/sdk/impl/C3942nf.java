package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.nf */
/* JADX INFO: loaded from: classes3.dex */
public final class C3942nf extends AbstractC3791h2 implements InterfaceC3778gc {

    /* JADX INFO: renamed from: b */
    public final String f15516b;

    /* JADX INFO: renamed from: c */
    public final String f15517c;

    /* JADX INFO: renamed from: d */
    public final String f15518d;

    /* JADX INFO: renamed from: e */
    public final String f15519e;

    /* JADX INFO: renamed from: f */
    public final String f15520f;

    /* JADX INFO: renamed from: g */
    public final String f15521g;

    /* JADX INFO: renamed from: h */
    public final Mediation f15522h;

    public C3942nf(String auctionId, String impressionId, String str, String str2, String str3, String str4, Mediation mediation) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(impressionId, "impressionId");
        this.f15516b = auctionId;
        this.f15517c = impressionId;
        this.f15518d = str;
        this.f15519e = str2;
        this.f15520f = str3;
        this.f15521g = str4;
        this.f15522h = mediation;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3806hh
    /* JADX INFO: renamed from: b */
    public Map mo16812b() {
        Pair[] pairArr = new Pair[3];
        pairArr[0] = TuplesKt.m43482to("CB_ERROR", AbstractC3801hc.m17872a(this.f15518d, this.f15521g));
        String str = this.f15519e;
        if (str == null) {
            str = "";
        }
        pairArr[1] = TuplesKt.m43482to("CB_ERROR_CODE", str);
        String str2 = this.f15520f;
        pairArr[2] = TuplesKt.m43482to("CB_ERROR_CONSTANT", str2 != null ? str2 : "");
        return MapsKt.plus(MapsKt.mapOf(pairArr), AbstractC3801hc.m17873a(this));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3942nf)) {
            return false;
        }
        C3942nf c3942nf = (C3942nf) obj;
        return Intrinsics.areEqual(this.f15516b, c3942nf.f15516b) && Intrinsics.areEqual(this.f15517c, c3942nf.f15517c) && Intrinsics.areEqual(this.f15518d, c3942nf.f15518d) && Intrinsics.areEqual(this.f15519e, c3942nf.f15519e) && Intrinsics.areEqual(this.f15520f, c3942nf.f15520f) && Intrinsics.areEqual(this.f15521g, c3942nf.f15521g) && Intrinsics.areEqual(this.f15522h, c3942nf.f15522h);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3778gc
    public Mediation getMediation() {
        return this.f15522h;
    }

    public int hashCode() {
        int iHashCode = ((this.f15516b.hashCode() * 31) + this.f15517c.hashCode()) * 31;
        String str = this.f15518d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f15519e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f15520f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f15521g;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Mediation mediation = this.f15522h;
        return iHashCode5 + (mediation != null ? mediation.hashCode() : 0);
    }

    public String toString() {
        return "RenderEventPayload(auctionId=" + this.f15516b + ", impressionId=" + this.f15517c + ", errorString=" + this.f15518d + ", errorCode=" + this.f15519e + ", errorConstant=" + this.f15520f + ", errorCauseDescription=" + this.f15521g + ", mediation=" + this.f15522h + ")";
    }
}
