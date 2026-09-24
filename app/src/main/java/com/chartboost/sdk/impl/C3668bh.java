package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.bh */
/* JADX INFO: loaded from: classes3.dex */
public final class C3668bh extends AbstractC3791h2 implements InterfaceC3778gc {

    /* JADX INFO: renamed from: b */
    public final String f13586b;

    /* JADX INFO: renamed from: c */
    public final String f13587c;

    /* JADX INFO: renamed from: d */
    public final String f13588d;

    /* JADX INFO: renamed from: e */
    public final String f13589e;

    /* JADX INFO: renamed from: f */
    public final String f13590f;

    /* JADX INFO: renamed from: g */
    public final Mediation f13591g;

    public C3668bh(String str, String str2, String str3, String str4, String str5, Mediation mediation) {
        this.f13586b = str;
        this.f13587c = str2;
        this.f13588d = str3;
        this.f13589e = str4;
        this.f13590f = str5;
        this.f13591g = mediation;
    }

    public /* synthetic */ C3668bh(String str, String str2, String str3, String str4, String str5, Mediation mediation, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, mediation);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3806hh
    /* JADX INFO: renamed from: b */
    public Map mo16812b() {
        Pair[] pairArr = new Pair[3];
        pairArr[0] = TuplesKt.m43482to("CB_ERROR", AbstractC3801hc.m17872a(this.f13587c, this.f13590f));
        String str = this.f13588d;
        if (str == null) {
            str = "";
        }
        pairArr[1] = TuplesKt.m43482to("CB_ERROR_CODE", str);
        String str2 = this.f13589e;
        pairArr[2] = TuplesKt.m43482to("CB_ERROR_CONSTANT", str2 != null ? str2 : "");
        return MapsKt.plus(MapsKt.mapOf(pairArr), AbstractC3801hc.m17873a(this));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3668bh)) {
            return false;
        }
        C3668bh c3668bh = (C3668bh) obj;
        return Intrinsics.areEqual(this.f13586b, c3668bh.f13586b) && Intrinsics.areEqual(this.f13587c, c3668bh.f13587c) && Intrinsics.areEqual(this.f13588d, c3668bh.f13588d) && Intrinsics.areEqual(this.f13589e, c3668bh.f13589e) && Intrinsics.areEqual(this.f13590f, c3668bh.f13590f) && Intrinsics.areEqual(this.f13591g, c3668bh.f13591g);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3778gc
    public Mediation getMediation() {
        return this.f13591g;
    }

    public int hashCode() {
        String str = this.f13586b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f13587c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f13588d;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f13589e;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f13590f;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Mediation mediation = this.f13591g;
        return iHashCode5 + (mediation != null ? mediation.hashCode() : 0);
    }

    public String toString() {
        return "StartEventPayload(auctionId=" + this.f13586b + ", errorString=" + this.f13587c + ", errorCode=" + this.f13588d + ", errorConstant=" + this.f13589e + ", errorCauseDescription=" + this.f13590f + ", mediation=" + this.f13591g + ")";
    }
}
