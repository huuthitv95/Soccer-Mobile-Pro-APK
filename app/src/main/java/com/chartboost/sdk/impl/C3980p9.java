package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.p9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3980p9 implements InterfaceC4054sh {

    /* JADX INFO: renamed from: a */
    public final C4105v2 f15791a;

    public C3980p9(C4105v2 identity) {
        Intrinsics.checkNotNullParameter(identity, "identity");
        this.f15791a = identity;
    }

    @Override // com.chartboost.sdk.impl.InterfaceC4054sh
    /* JADX INFO: renamed from: a */
    public JSONObject mo17960a() throws JSONException {
        C3958o9 c3958o9M19635h = this.f15791a.m19635h();
        JSONObject jSONObject = new JSONObject();
        String strM18897d = c3958o9M19635h.m18897d();
        if (strM18897d != null) {
            jSONObject.put("appSetId", strM18897d);
        }
        String strM18897d2 = c3958o9M19635h.m18897d();
        if (strM18897d2 != null) {
            jSONObject.put("app_set_id", strM18897d2);
        }
        Integer numM18898e = c3958o9M19635h.m18898e();
        if (numM18898e != null) {
            jSONObject.put("appSetIdScope", numM18898e.intValue());
        }
        Integer numM18898e2 = c3958o9M19635h.m18898e();
        if (numM18898e2 != null) {
            jSONObject.put("app_set_id_scope", numM18898e2.intValue());
        }
        String strM18894a = c3958o9M19635h.m18894a();
        if (strM18894a != null) {
            jSONObject.put("ifa", strM18894a);
        }
        String strM18896c = c3958o9M19635h.m18896c();
        if (strM18896c != null) {
            jSONObject.put("instance_id", strM18896c);
        }
        return jSONObject;
    }
}
