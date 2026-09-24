package com.chartboost.sdk.impl;

import com.ironsource.C12538u;
import com.unity3d.ads.core.data.model.exception.GatewayException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.k7 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3865k7 {

    /* JADX INFO: renamed from: f */
    public static final a f15032f = new a(null);

    /* JADX INFO: renamed from: a */
    public final String f15033a;

    /* JADX INFO: renamed from: b */
    public final String f15034b;

    /* JADX INFO: renamed from: c */
    public final String f15035c;

    /* JADX INFO: renamed from: d */
    public final String f15036d;

    /* JADX INFO: renamed from: e */
    public final String f15037e;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.k7$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C3865k7 m18360a(JSONObject jsonObject) throws JSONException {
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            String string = jsonObject.getString("type");
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            String string2 = jsonObject.getString("http_method");
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
            String string3 = jsonObject.getString("url");
            Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            String strOptString = jsonObject.optString("body");
            Intrinsics.checkNotNull(strOptString);
            if (strOptString.length() <= 0) {
                strOptString = null;
            }
            String strOptString2 = jsonObject.optString("content_type");
            Intrinsics.checkNotNull(strOptString2);
            return new C3865k7(string, string2, string3, strOptString, strOptString2.length() > 0 ? strOptString2 : null);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.k7$b */
    public enum b {
        RENDER("render"),
        CLICK("click"),
        ENGAGEMENT("engagement"),
        CLOSE("close"),
        EXPIRATION("expiration"),
        IMPRESSION("impression"),
        LOAD("load"),
        REWARD(C12538u.f32489j),
        SHOW("show"),
        SKIP("skip"),
        INITIALIZATION(GatewayException.GATEWAY_RESPONSE_DEPTH_INITIALIZATION);


        /* JADX INFO: renamed from: o */
        public static final /* synthetic */ EnumEntries f15050o = EnumEntriesKt.enumEntries(m18361a());

        /* JADX INFO: renamed from: b */
        public final String f15051b;

        b(String str) {
            this.f15051b = str;
        }

        /* JADX INFO: renamed from: b */
        public final String m18362b() {
            return this.f15051b;
        }
    }

    public C3865k7(String type, String httpMethod, String url, String str, String str2) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(httpMethod, "httpMethod");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f15033a = type;
        this.f15034b = httpMethod;
        this.f15035c = url;
        this.f15036d = str;
        this.f15037e = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m18355a() {
        return this.f15036d;
    }

    /* JADX INFO: renamed from: b */
    public final String m18356b() {
        return this.f15037e;
    }

    /* JADX INFO: renamed from: c */
    public final String m18357c() {
        return this.f15034b;
    }

    /* JADX INFO: renamed from: d */
    public final String m18358d() {
        return this.f15033a;
    }

    /* JADX INFO: renamed from: e */
    public final String m18359e() {
        return this.f15035c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3865k7)) {
            return false;
        }
        C3865k7 c3865k7 = (C3865k7) obj;
        return Intrinsics.areEqual(this.f15033a, c3865k7.f15033a) && Intrinsics.areEqual(this.f15034b, c3865k7.f15034b) && Intrinsics.areEqual(this.f15035c, c3865k7.f15035c) && Intrinsics.areEqual(this.f15036d, c3865k7.f15036d) && Intrinsics.areEqual(this.f15037e, c3865k7.f15037e);
    }

    public int hashCode() {
        int iHashCode = ((((this.f15033a.hashCode() * 31) + this.f15034b.hashCode()) * 31) + this.f15035c.hashCode()) * 31;
        String str = this.f15036d;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f15037e;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "EventTracker(type=" + this.f15033a + ", httpMethod=" + this.f15034b + ", url=" + this.f15035c + ", body=" + this.f15036d + ", contentType=" + this.f15037e + ")";
    }
}
