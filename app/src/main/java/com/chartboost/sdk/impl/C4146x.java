package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.x */
/* JADX INFO: loaded from: classes3.dex */
public final class C4146x {

    /* JADX INFO: renamed from: c */
    public static final a f16788c = new a(null);

    /* JADX INFO: renamed from: a */
    public final List f16789a;

    /* JADX INFO: renamed from: b */
    public final C4168y f16790b;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.x$a */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final C4146x m19829a(JSONObject jsonObject) throws JSONException {
            Intrinsics.checkNotNullParameter(jsonObject, "jsonObject");
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArray = jsonObject.getJSONArray("renderables");
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                C4008qf.a aVar = C4008qf.f15945p;
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                Intrinsics.checkNotNullExpressionValue(jSONObject, "getJSONObject(...)");
                arrayList.add(aVar.m19192a(jSONObject));
            }
            C4168y.a aVar2 = C4168y.f16983m;
            JSONObject jSONObject2 = jsonObject.getJSONObject("config");
            Intrinsics.checkNotNullExpressionValue(jSONObject2, "getJSONObject(...)");
            String string = jsonObject.getString("auction_id");
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
            return new C4146x(arrayList, aVar2.m20010a(jSONObject2, string));
        }
    }

    public C4146x(List renderables, C4168y admConfig) {
        Intrinsics.checkNotNullParameter(renderables, "renderables");
        Intrinsics.checkNotNullParameter(admConfig, "admConfig");
        this.f16789a = renderables;
        this.f16790b = admConfig;
    }

    /* JADX INFO: renamed from: a */
    public final C4168y m19827a() {
        return this.f16790b;
    }

    /* JADX INFO: renamed from: b */
    public final List m19828b() {
        return this.f16789a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4146x)) {
            return false;
        }
        C4146x c4146x = (C4146x) obj;
        return Intrinsics.areEqual(this.f16789a, c4146x.f16789a) && Intrinsics.areEqual(this.f16790b, c4146x.f16790b);
    }

    public int hashCode() {
        return (this.f16789a.hashCode() * 31) + this.f16790b.hashCode();
    }

    public String toString() {
        return "AdMarkup(renderables=" + this.f16789a + ", admConfig=" + this.f16790b + ")";
    }
}
