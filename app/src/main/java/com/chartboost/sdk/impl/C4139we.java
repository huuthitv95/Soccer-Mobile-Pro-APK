package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.we */
/* JADX INFO: loaded from: classes3.dex */
public final class C4139we {

    /* JADX INFO: renamed from: a */
    public final Integer f16733a;

    /* JADX INFO: renamed from: b */
    public final List f16734b;

    /* JADX INFO: renamed from: c */
    public final Integer f16735c;

    /* JADX INFO: renamed from: d */
    public final Integer f16736d;

    /* JADX INFO: renamed from: e */
    public final JSONObject f16737e;

    /* JADX INFO: renamed from: f */
    public final String f16738f;

    /* JADX INFO: renamed from: g */
    public final String f16739g;

    /* JADX INFO: renamed from: h */
    public final String f16740h;

    /* JADX INFO: renamed from: i */
    public final String f16741i;

    public C4139we(Integer num, List list, Integer num2, Integer num3, JSONObject jSONObject, String str, String str2, String str3, String str4) {
        this.f16733a = num;
        this.f16734b = list;
        this.f16735c = num2;
        this.f16736d = num3;
        this.f16737e = jSONObject;
        this.f16738f = str;
        this.f16739g = str2;
        this.f16740h = str3;
        this.f16741i = str4;
    }

    /* JADX INFO: renamed from: a */
    public final String m19791a() {
        return this.f16741i;
    }

    /* JADX INFO: renamed from: b */
    public final String m19792b() {
        return this.f16740h;
    }

    /* JADX INFO: renamed from: c */
    public final Integer m19793c() {
        return this.f16733a;
    }

    /* JADX INFO: renamed from: d */
    public final Integer m19794d() {
        return this.f16736d;
    }

    /* JADX INFO: renamed from: e */
    public final Integer m19795e() {
        return this.f16735c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4139we)) {
            return false;
        }
        C4139we c4139we = (C4139we) obj;
        return Intrinsics.areEqual(this.f16733a, c4139we.f16733a) && Intrinsics.areEqual(this.f16734b, c4139we.f16734b) && Intrinsics.areEqual(this.f16735c, c4139we.f16735c) && Intrinsics.areEqual(this.f16736d, c4139we.f16736d) && Intrinsics.areEqual(this.f16737e, c4139we.f16737e) && Intrinsics.areEqual(this.f16738f, c4139we.f16738f) && Intrinsics.areEqual(this.f16739g, c4139we.f16739g) && Intrinsics.areEqual(this.f16740h, c4139we.f16740h) && Intrinsics.areEqual(this.f16741i, c4139we.f16741i);
    }

    /* JADX INFO: renamed from: f */
    public final String m19796f() {
        return this.f16738f;
    }

    /* JADX INFO: renamed from: g */
    public final JSONObject m19797g() {
        return this.f16737e;
    }

    /* JADX INFO: renamed from: h */
    public final String m19798h() {
        return this.f16739g;
    }

    public int hashCode() {
        Integer num = this.f16733a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.f16734b;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num2 = this.f16735c;
        int iHashCode3 = (iHashCode2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.f16736d;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        JSONObject jSONObject = this.f16737e;
        int iHashCode5 = (iHashCode4 + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        String str = this.f16738f;
        int iHashCode6 = (iHashCode5 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f16739g;
        int iHashCode7 = (iHashCode6 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f16740h;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f16741i;
        return iHashCode8 + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i */
    public final List m19799i() {
        return this.f16734b;
    }

    public String toString() {
        return "PrivacyBodyFields(openRtbConsent=" + this.f16733a + ", whitelistedPrivacyStandardsList=" + this.f16734b + ", openRtbGdpr=" + this.f16735c + ", openRtbCoppa=" + this.f16736d + ", privacyListAsJson=" + this.f16737e + ", piDataUseConsent=" + this.f16738f + ", tcfString=" + this.f16739g + ", gppString=" + this.f16740h + ", gppSid=" + this.f16741i + ")";
    }
}
