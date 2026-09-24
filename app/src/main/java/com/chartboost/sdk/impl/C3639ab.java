package com.chartboost.sdk.impl;

import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.ab */
/* JADX INFO: loaded from: classes3.dex */
public final class C3639ab extends AbstractC3791h2 {

    /* JADX INFO: renamed from: b */
    public final String f13459b;

    /* JADX INFO: renamed from: c */
    public final String f13460c;

    /* JADX INFO: renamed from: d */
    public final String f13461d;

    /* JADX INFO: renamed from: e */
    public final String f13462e;

    /* JADX INFO: renamed from: f */
    public final String f13463f;

    public C3639ab(String str, String str2, String str3, String str4, String str5) {
        this.f13459b = str;
        this.f13460c = str2;
        this.f13461d = str3;
        this.f13462e = str4;
        this.f13463f = str5;
    }

    public /* synthetic */ C3639ab(String str, String str2, String str3, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3806hh
    /* JADX INFO: renamed from: b */
    public Map mo16812b() {
        Pair[] pairArr = new Pair[3];
        pairArr[0] = TuplesKt.m43482to("CB_ERROR", AbstractC3801hc.m17872a(this.f13460c, this.f13463f));
        String str = this.f13461d;
        if (str == null) {
            str = "";
        }
        pairArr[1] = TuplesKt.m43482to("CB_ERROR_CODE", str);
        String str2 = this.f13462e;
        pairArr[2] = TuplesKt.m43482to("CB_ERROR_CONSTANT", str2 != null ? str2 : "");
        return MapsKt.mapOf(pairArr);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3639ab)) {
            return false;
        }
        C3639ab c3639ab = (C3639ab) obj;
        return Intrinsics.areEqual(this.f13459b, c3639ab.f13459b) && Intrinsics.areEqual(this.f13460c, c3639ab.f13460c) && Intrinsics.areEqual(this.f13461d, c3639ab.f13461d) && Intrinsics.areEqual(this.f13462e, c3639ab.f13462e) && Intrinsics.areEqual(this.f13463f, c3639ab.f13463f);
    }

    public int hashCode() {
        String str = this.f13459b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f13460c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f13461d;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f13462e;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f13463f;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "InitializationEventPayload(auctionId=" + this.f13459b + ", errorString=" + this.f13460c + ", errorCode=" + this.f13461d + ", errorConstant=" + this.f13462e + ", errorCauseDescription=" + this.f13463f + ")";
    }
}
