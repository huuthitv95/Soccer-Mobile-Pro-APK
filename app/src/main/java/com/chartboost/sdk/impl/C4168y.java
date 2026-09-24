package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.UByte$$ExternalSyntheticBackport0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.y */
/* JADX INFO: loaded from: classes3.dex */
public final class C4168y {

    /* JADX INFO: renamed from: m */
    public static final a f16983m = new a(null);

    /* JADX INFO: renamed from: n */
    public static final EnumC3960ob f16984n = EnumC3960ob.SEQUENTIAL;

    /* JADX INFO: renamed from: a */
    public final String f16985a;

    /* JADX INFO: renamed from: b */
    public final C4135wa f16986b;

    /* JADX INFO: renamed from: c */
    public final C3929n2 f16987c;

    /* JADX INFO: renamed from: d */
    public final C3929n2 f16988d;

    /* JADX INFO: renamed from: e */
    public final int f16989e;

    /* JADX INFO: renamed from: f */
    public final Integer f16990f;

    /* JADX INFO: renamed from: g */
    public final int f16991g;

    /* JADX INFO: renamed from: h */
    public final boolean f16992h;

    /* JADX INFO: renamed from: i */
    public final List f16993i;

    /* JADX INFO: renamed from: j */
    public final boolean f16994j;

    /* JADX INFO: renamed from: k */
    public final int f16995k;

    /* JADX INFO: renamed from: l */
    public final EnumC3960ob f16996l;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.y$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C4168y m20010a(JSONObject jsonObject, String auctionId) throws JSONException {
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            Intrinsics.checkNotNullParameter(auctionId, "auctionId");
            List listM19028a = C3978p7.m19028a(jsonObject.optJSONArray("event_trackers"));
            C4135wa.a aVar = C4135wa.f16723c;
            JSONObject jSONObject = jsonObject.getJSONObject("info_icon");
            Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
            C4135wa c4135waM19781a = aVar.m19781a(jSONObject);
            C3929n2.a aVar2 = C3929n2.f15419d;
            return new C4168y(auctionId, c4135waM19781a, aVar2.m18711a(jsonObject.optJSONObject("top_left_button_group")), aVar2.m18711a(jsonObject.optJSONObject("top_right_button_group")), jsonObject.optInt("expiration", 3600), Integer.valueOf(jsonObject.optInt("reward_duration", -1)), jsonObject.optInt("click_browser", 0), jsonObject.optBoolean("resolve_redirections", true), listM19028a, jsonObject.optBoolean("default_muted", false), jsonObject.optInt("load_timeout", 30), EnumC3960ob.f15653c.m18906a(jsonObject.optInt("load_mode", C4168y.f16984n.m18905c())));
        }
    }

    public C4168y(String auctionId, C4135wa infoIcon, C3929n2 c3929n2, C3929n2 c3929n3, int i, Integer num, int i2, boolean z, List eventTrackers, boolean z2, int i3, EnumC3960ob loadMode) {
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(infoIcon, "infoIcon");
        Intrinsics.checkNotNullParameter(eventTrackers, "eventTrackers");
        Intrinsics.checkNotNullParameter(loadMode, "loadMode");
        this.f16985a = auctionId;
        this.f16986b = infoIcon;
        this.f16987c = c3929n2;
        this.f16988d = c3929n3;
        this.f16989e = i;
        this.f16990f = num;
        this.f16991g = i2;
        this.f16992h = z;
        this.f16993i = eventTrackers;
        this.f16994j = z2;
        this.f16995k = i3;
        this.f16996l = loadMode;
    }

    /* JADX INFO: renamed from: b */
    public final String m20000b() {
        return this.f16985a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m20001c() {
        return this.f16994j;
    }

    /* JADX INFO: renamed from: d */
    public final List m20002d() {
        return this.f16993i;
    }

    /* JADX INFO: renamed from: e */
    public final int m20003e() {
        return this.f16989e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4168y)) {
            return false;
        }
        C4168y c4168y = (C4168y) obj;
        return Intrinsics.areEqual(this.f16985a, c4168y.f16985a) && Intrinsics.areEqual(this.f16986b, c4168y.f16986b) && Intrinsics.areEqual(this.f16987c, c4168y.f16987c) && Intrinsics.areEqual(this.f16988d, c4168y.f16988d) && this.f16989e == c4168y.f16989e && Intrinsics.areEqual(this.f16990f, c4168y.f16990f) && this.f16991g == c4168y.f16991g && this.f16992h == c4168y.f16992h && Intrinsics.areEqual(this.f16993i, c4168y.f16993i) && this.f16994j == c4168y.f16994j && this.f16995k == c4168y.f16995k && this.f16996l == c4168y.f16996l;
    }

    /* JADX INFO: renamed from: f */
    public final C4135wa m20004f() {
        return this.f16986b;
    }

    /* JADX INFO: renamed from: g */
    public final EnumC3960ob m20005g() {
        return this.f16996l;
    }

    /* JADX INFO: renamed from: h */
    public final int m20006h() {
        return this.f16995k;
    }

    public int hashCode() {
        int iHashCode = ((this.f16985a.hashCode() * 31) + this.f16986b.hashCode()) * 31;
        C3929n2 c3929n2 = this.f16987c;
        int iHashCode2 = (iHashCode + (c3929n2 == null ? 0 : c3929n2.hashCode())) * 31;
        C3929n2 c3929n3 = this.f16988d;
        int iHashCode3 = (((iHashCode2 + (c3929n3 == null ? 0 : c3929n3.hashCode())) * 31) + this.f16989e) * 31;
        Integer num = this.f16990f;
        return ((((((((((((iHashCode3 + (num != null ? num.hashCode() : 0)) * 31) + this.f16991g) * 31) + UByte$$ExternalSyntheticBackport0.m43487m(this.f16992h)) * 31) + this.f16993i.hashCode()) * 31) + UByte$$ExternalSyntheticBackport0.m43487m(this.f16994j)) * 31) + this.f16995k) * 31) + this.f16996l.hashCode();
    }

    /* JADX INFO: renamed from: i */
    public final Integer m20007i() {
        return this.f16990f;
    }

    /* JADX INFO: renamed from: j */
    public final C3929n2 m20008j() {
        return this.f16987c;
    }

    /* JADX INFO: renamed from: k */
    public final C3929n2 m20009k() {
        return this.f16988d;
    }

    public String toString() {
        return "AdMarkupConfig(auctionId=" + this.f16985a + ", infoIcon=" + this.f16986b + ", topLeftButtonGroup=" + this.f16987c + ", topRightButtonGroup=" + this.f16988d + ", expiration=" + this.f16989e + ", rewardDuration=" + this.f16990f + ", clickBrowser=" + this.f16991g + ", resolveRedirections=" + this.f16992h + ", eventTrackers=" + this.f16993i + ", defaultMuted=" + this.f16994j + ", loadTimeoutSeconds=" + this.f16995k + ", loadMode=" + this.f16996l + ")";
    }
}
