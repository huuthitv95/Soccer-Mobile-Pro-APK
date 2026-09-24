package com.ironsource;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.G5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11449G5 {

    /* JADX INFO: renamed from: a */
    private final ArrayList<String> f24341a = new ArrayList<>(new C11431F5().m25768a());

    /* JADX INFO: renamed from: b */
    private final C11576N6 f24342b = new C11576N6();

    /* JADX INFO: renamed from: a */
    public final JSONObject m25837a() throws JSONException {
        JSONObject jSONObjectM26658a = this.f24342b.m26658a(this.f24341a);
        Intrinsics.checkNotNullExpressionValue(jSONObjectM26658a, "mGlobalDataReader.getDataByKeys(mEventsKeyList)");
        return jSONObjectM26658a;
    }
}
