package com.ironsource;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.c9 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12131c9 {

    /* JADX INFO: renamed from: a */
    private final ArrayList<String> f30171a = new ArrayList<>(new C11783Z8().m28066a());

    /* JADX INFO: renamed from: b */
    private final C11576N6 f30172b = new C11576N6();

    /* JADX INFO: renamed from: a */
    public final JSONObject m31267a() throws JSONException {
        JSONObject jSONObjectM26658a = this.f30172b.m26658a(this.f30171a);
        Intrinsics.checkNotNullExpressionValue(jSONObjectM26658a, "mGlobalDataReader.getDataByKeys(mInitKeyList)");
        return jSONObjectM26658a;
    }
}
