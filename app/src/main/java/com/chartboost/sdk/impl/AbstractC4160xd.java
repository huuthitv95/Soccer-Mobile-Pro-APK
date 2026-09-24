package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.xd */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4160xd {
    /* JADX INFO: renamed from: a */
    public static final List m19958a(JSONObject jSONObject) {
        List<JSONObject> listAsListSkipNull;
        C4034rj c4034rj;
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("verification");
        if (jSONArrayOptJSONArray == null || (listAsListSkipNull = AbstractC3912m8.asListSkipNull(jSONArrayOptJSONArray)) == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (JSONObject jSONObject2 : listAsListSkipNull) {
            try {
                String string = jSONObject2.getString("url");
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                String string2 = jSONObject2.getString("vendor");
                Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                String string3 = jSONObject2.getString("params");
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
                c4034rj = new C4034rj(string, string2, string3);
            } catch (Exception unused) {
                c4034rj = null;
            }
            if (c4034rj != null) {
                arrayList.add(c4034rj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static final C4138wd m19959b(JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
        List listM19958a = m19958a(config);
        JSONObject jSONObjectOptJSONObject = config.optJSONObject("viewabilitySettings");
        return jSONObjectOptJSONObject != null ? new C4138wd(config.optBoolean("enabled", false), config.optBoolean("verificationEnabled", false), jSONObjectOptJSONObject.optInt("minVisibleDips", 1), jSONObjectOptJSONObject.optInt("minVisibleDurationMs", 0), jSONObjectOptJSONObject.optLong("visibilityCheckIntervalMs", 100L), jSONObjectOptJSONObject.optInt("traversalLimit", 25), listM19958a) : new C4138wd(config.optBoolean("enabled", false), config.optBoolean("verificationEnabled", false), 0, 0, 0L, 0, listM19958a, 60, null);
    }
}
