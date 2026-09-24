package com.ironsource;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.j0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12256j0 {

    /* JADX INFO: renamed from: a */
    private final ArrayList<String> f30598a = new ArrayList<>(new C12238i0().m31655a());

    /* JADX INFO: renamed from: b */
    private final C11576N6 f30599b = new C11576N6();

    /* JADX INFO: renamed from: a */
    public final JSONObject m31774a() throws JSONException {
        JSONObject jSONObjectM26658a = this.f30599b.m26658a(this.f30598a);
        Intrinsics.checkNotNullExpressionValue(jSONObjectM26658a, "mGlobalDataReader.getDataByKeys(mAdQualityKeyList)");
        return jSONObjectM26658a;
    }
}
