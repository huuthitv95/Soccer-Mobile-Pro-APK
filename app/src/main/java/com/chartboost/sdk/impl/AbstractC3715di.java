package com.chartboost.sdk.impl;

import com.ironsource.C11341A5;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.di */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3715di {

    /* JADX INFO: renamed from: a */
    public static final List f13840a = CollectionsKt.emptyList();

    /* JADX INFO: renamed from: a */
    public static final List m17305a() {
        return f13840a;
    }

    /* JADX INFO: renamed from: a */
    public static final List m17306a(JSONObject jSONObject) {
        List listAsList;
        List listM18037a;
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("blacklist");
        return (jSONArrayOptJSONArray == null || (listAsList = AbstractC3912m8.asList(jSONArrayOptJSONArray)) == null || (listM18037a = AbstractC3830ii.m18037a(listAsList)) == null) ? f13840a : listM18037a;
    }

    /* JADX INFO: renamed from: b */
    public static final C3692ci m17307b(JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("tracking");
        if (jSONObjectOptJSONObject == null) {
            return new C3692ci(false, null, null, 0, 0, false, 0, 127, null);
        }
        boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("enabled", false);
        String strOptString = jSONObjectOptJSONObject.optString(C11341A5.f23827r, "https://ssp-events.chartboost.com/track/sdk");
        int iOptInt = jSONObjectOptJSONObject.optInt("eventLimit", 10);
        int iOptInt2 = jSONObjectOptJSONObject.optInt("windowDuration", 60);
        boolean zOptBoolean2 = jSONObjectOptJSONObject.optBoolean("persistenceEnabled", true);
        int iOptInt3 = jSONObjectOptJSONObject.optInt("persistenceMaxEvents", 100);
        List listM17306a = m17306a(jSONObjectOptJSONObject);
        Intrinsics.checkNotNull(strOptString);
        return new C3692ci(zOptBoolean, listM17306a, strOptString, iOptInt, iOptInt2, zOptBoolean2, iOptInt3);
    }
}
