package com.chartboost.sdk.impl;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.ti */
/* JADX INFO: loaded from: classes3.dex */
public final class C4077ti {
    /* JADX INFO: renamed from: a */
    public final String m19502a(JSONObject jSONObject) {
        String strOptString = jSONObject != null ? jSONObject.optString("url", "") : null;
        return strOptString == null ? "" : strOptString;
    }

    /* JADX INFO: renamed from: b */
    public final C3884l3 m19503b(JSONObject jSONObject) {
        return new C3884l3(m19502a(jSONObject), m19504c(jSONObject));
    }

    /* JADX INFO: renamed from: c */
    public final Boolean m19504c(JSONObject jSONObject) {
        if (jSONObject != null) {
            return AbstractC4193z2.m20093a(jSONObject, "shouldDismiss");
        }
        return null;
    }
}
