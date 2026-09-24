package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.nb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3938nb extends AbstractC3791h2 implements InterfaceC3778gc {

    /* JADX INFO: renamed from: b */
    public final String f15491b;

    /* JADX INFO: renamed from: c */
    public final List f15492c;

    /* JADX INFO: renamed from: d */
    public final String f15493d;

    /* JADX INFO: renamed from: e */
    public final String f15494e;

    /* JADX INFO: renamed from: f */
    public final String f15495f;

    /* JADX INFO: renamed from: g */
    public final String f15496g;

    /* JADX INFO: renamed from: h */
    public final Long f15497h;

    /* JADX INFO: renamed from: i */
    public final String f15498i;

    /* JADX INFO: renamed from: j */
    public final Mediation f15499j;

    public C3938nb(String auctionId, List impressionIds, String str, String str2, String str3, String str4, Long l, String str5, Mediation mediation) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(impressionIds, "impressionIds");
        this.f15491b = auctionId;
        this.f15492c = impressionIds;
        this.f15493d = str;
        this.f15494e = str2;
        this.f15495f = str3;
        this.f15496g = str4;
        this.f15497h = l;
        this.f15498i = str5;
        this.f15499j = mediation;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3806hh
    /* JADX INFO: renamed from: b */
    public Map mo16812b() {
        String string;
        Pair[] pairArr = new Pair[5];
        pairArr[0] = TuplesKt.m43482to("CB_ERROR", AbstractC3801hc.m17872a(this.f15493d, this.f15496g));
        String str = this.f15494e;
        if (str == null) {
            str = "";
        }
        pairArr[1] = TuplesKt.m43482to("CB_ERROR_CODE", str);
        String str2 = this.f15495f;
        if (str2 == null) {
            str2 = "";
        }
        pairArr[2] = TuplesKt.m43482to("CB_ERROR_CONSTANT", str2);
        Long l = this.f15497h;
        if (l == null || (string = l.toString()) == null) {
            string = "";
        }
        pairArr[3] = TuplesKt.m43482to("CB_LATENCY", string);
        String str3 = this.f15498i;
        pairArr[4] = TuplesKt.m43482to("CB_BASE64_ADM", str3 != null ? str3 : "");
        return MapsKt.plus(MapsKt.mapOf(pairArr), AbstractC3801hc.m17873a(this));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3938nb)) {
            return false;
        }
        C3938nb c3938nb = (C3938nb) obj;
        return Intrinsics.areEqual(this.f15491b, c3938nb.f15491b) && Intrinsics.areEqual(this.f15492c, c3938nb.f15492c) && Intrinsics.areEqual(this.f15493d, c3938nb.f15493d) && Intrinsics.areEqual(this.f15494e, c3938nb.f15494e) && Intrinsics.areEqual(this.f15495f, c3938nb.f15495f) && Intrinsics.areEqual(this.f15496g, c3938nb.f15496g) && Intrinsics.areEqual(this.f15497h, c3938nb.f15497h) && Intrinsics.areEqual(this.f15498i, c3938nb.f15498i) && Intrinsics.areEqual(this.f15499j, c3938nb.f15499j);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3778gc
    public Mediation getMediation() {
        return this.f15499j;
    }

    public int hashCode() {
        int iHashCode = ((this.f15491b.hashCode() * 31) + this.f15492c.hashCode()) * 31;
        String str = this.f15493d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f15494e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f15495f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f15496g;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Long l = this.f15497h;
        int iHashCode6 = (iHashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        String str5 = this.f15498i;
        int iHashCode7 = (iHashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Mediation mediation = this.f15499j;
        return iHashCode7 + (mediation != null ? mediation.hashCode() : 0);
    }

    public String toString() {
        return "LoadEventPayload(auctionId=" + this.f15491b + ", impressionIds=" + this.f15492c + ", errorString=" + this.f15493d + ", errorCode=" + this.f15494e + ", errorConstant=" + this.f15495f + ", errorCauseDescription=" + this.f15496g + ", duration=" + this.f15497h + ", adm=" + this.f15498i + ", mediation=" + this.f15499j + ")";
    }
}
