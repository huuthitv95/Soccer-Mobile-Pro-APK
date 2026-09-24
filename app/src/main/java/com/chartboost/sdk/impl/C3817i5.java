package com.chartboost.sdk.impl;

import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.i5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3817i5 implements InterfaceC4054sh {
    @Override // com.chartboost.sdk.impl.InterfaceC4054sh
    /* JADX INFO: renamed from: a */
    public JSONObject mo17960a() throws JSONException {
        String strM17025e = C3678c4.f13658b.m17025e();
        String strM17775b = C3773g7.f14286a.m17775b();
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("app_id", strM17025e);
        jSONObject.put("app_version", strM17775b);
        jSONObject.put("load-id", string);
        jSONObject.put("load_id", string);
        jSONObject.put("sdk", "Chartboost-Android-SDK");
        jSONObject.put("sdk_version", "9.11.1");
        return jSONObject;
    }
}
