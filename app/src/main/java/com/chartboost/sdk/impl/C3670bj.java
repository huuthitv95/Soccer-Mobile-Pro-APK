package com.chartboost.sdk.impl;

import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.bj */
/* JADX INFO: loaded from: classes3.dex */
public final class C3670bj {

    /* JADX INFO: renamed from: g */
    public static final a f13594g = new a(null);

    /* JADX INFO: renamed from: a */
    public final boolean f13595a;

    /* JADX INFO: renamed from: b */
    public final C3840j5 f13596b;

    /* JADX INFO: renamed from: c */
    public final boolean f13597c;

    /* JADX INFO: renamed from: d */
    public final C3976p5 f13598d;

    /* JADX INFO: renamed from: e */
    public final int f13599e;

    /* JADX INFO: renamed from: f */
    public final boolean f13600f;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.bj$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C3670bj m16956a(JSONObject jsonObject) {
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            JSONObject jSONObjectOptJSONObject = jsonObject.optJSONObject("endcard_countdown");
            return new C3670bj(jsonObject.optBoolean("video_clickthrough_enabled", true), jSONObjectOptJSONObject != null ? C3840j5.f14871c.m18188a(jSONObjectOptJSONObject) : null, jsonObject.optBoolean("show_endcard", true), C3976p5.f15784e.m19026a(jsonObject.optJSONObject("cta")), jsonObject.optInt("endcard_ignore_safe_area", 0), jsonObject.optBoolean("endcard_optional", true));
        }
    }

    public C3670bj(boolean z, C3840j5 c3840j5, boolean z2, C3976p5 c3976p5, int i, boolean z3) {
        this.f13595a = z;
        this.f13596b = c3840j5;
        this.f13597c = z2;
        this.f13598d = c3976p5;
        this.f13599e = i;
        this.f13600f = z3;
    }

    /* JADX INFO: renamed from: a */
    public final C3976p5 m16950a() {
        return this.f13598d;
    }

    /* JADX INFO: renamed from: b */
    public final C3840j5 m16951b() {
        return this.f13596b;
    }

    /* JADX INFO: renamed from: c */
    public final int m16952c() {
        return this.f13599e;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m16953d() {
        return this.f13600f;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m16954e() {
        return this.f13597c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3670bj)) {
            return false;
        }
        C3670bj c3670bj = (C3670bj) obj;
        return this.f13595a == c3670bj.f13595a && Intrinsics.areEqual(this.f13596b, c3670bj.f13596b) && this.f13597c == c3670bj.f13597c && Intrinsics.areEqual(this.f13598d, c3670bj.f13598d) && this.f13599e == c3670bj.f13599e && this.f13600f == c3670bj.f13600f;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m16955f() {
        return this.f13595a;
    }

    public int hashCode() {
        int iM43487m = UByte$$ExternalSyntheticBackport0.m43487m(this.f13595a) * 31;
        C3840j5 c3840j5 = this.f13596b;
        int iHashCode = (((iM43487m + (c3840j5 == null ? 0 : c3840j5.hashCode())) * 31) + UByte$$ExternalSyntheticBackport0.m43487m(this.f13597c)) * 31;
        C3976p5 c3976p5 = this.f13598d;
        return ((((iHashCode + (c3976p5 != null ? c3976p5.hashCode() : 0)) * 31) + this.f13599e) * 31) + UByte$$ExternalSyntheticBackport0.m43487m(this.f13600f);
    }

    public String toString() {
        return "VASTConfig(videoClickthroughEnabled=" + this.f13595a + ", endCardCountdown=" + this.f13596b + ", showEndCard=" + this.f13597c + ", callToAction=" + this.f13598d + ", endCardIgnoreSafeAreaFlags=" + this.f13599e + ", endcardOptional=" + this.f13600f + ")";
    }
}
