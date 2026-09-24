package com.chartboost.sdk.impl;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.wa */
/* JADX INFO: loaded from: classes3.dex */
public final class C4135wa {

    /* JADX INFO: renamed from: c */
    public static final a f16723c = new a(null);

    /* JADX INFO: renamed from: a */
    public final String f16724a;

    /* JADX INFO: renamed from: b */
    public final String f16725b;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.wa$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C4135wa m19781a(JSONObject jsonObject) throws JSONException {
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            String strOptString = jsonObject.optString("clickthrough_url", "https://docs.chartboost.com/opt-out");
            Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
            String string = jsonObject.getString("image_url");
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return new C4135wa(strOptString, string);
        }
    }

    public C4135wa(String clickthroughUrl, String imageUrl) {
        Intrinsics.checkNotNullParameter(clickthroughUrl, "clickthroughUrl");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.f16724a = clickthroughUrl;
        this.f16725b = imageUrl;
    }

    /* JADX INFO: renamed from: a */
    public final String m19779a() {
        return this.f16724a;
    }

    /* JADX INFO: renamed from: b */
    public final String m19780b() {
        return this.f16725b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4135wa)) {
            return false;
        }
        C4135wa c4135wa = (C4135wa) obj;
        return Intrinsics.areEqual(this.f16724a, c4135wa.f16724a) && Intrinsics.areEqual(this.f16725b, c4135wa.f16725b);
    }

    public int hashCode() {
        return (this.f16724a.hashCode() * 31) + this.f16725b.hashCode();
    }

    public String toString() {
        return "InfoIconModel(clickthroughUrl=" + this.f16724a + ", imageUrl=" + this.f16725b + ")";
    }
}
