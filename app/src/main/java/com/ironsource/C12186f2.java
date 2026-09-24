package com.ironsource;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.f2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12186f2 {

    /* JADX INFO: renamed from: a */
    private final C11540L6.a f30364a;

    /* JADX INFO: renamed from: b */
    private final ArrayList<String> f30365b = new ArrayList<>(new C12142d2().m31279a());

    /* JADX INFO: renamed from: c */
    private final C11576N6 f30366c = new C11576N6();

    public C12186f2(C11540L6.a aVar) {
        this.f30364a = aVar;
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m31405a() {
        C11540L6.a aVar = this.f30364a;
        JSONObject jSONObjectM26659a = aVar != null ? this.f30366c.m26659a(this.f30365b, aVar) : null;
        if (jSONObjectM26659a == null) {
            jSONObjectM26659a = this.f30366c.m26658a(this.f30365b);
            Intrinsics.checkNotNullExpressionValue(jSONObjectM26659a, "mGlobalDataReader.getDataByKeys(mAuctionKeyList)");
        }
        return m31404a(jSONObjectM26659a);
    }

    /* JADX INFO: renamed from: a */
    private final JSONObject m31404a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectM26732b = C11594O6.m26732b(jSONObject.optJSONObject(C11540L6.f25016u));
        if (jSONObjectM26732b != null) {
            jSONObject.put(C11540L6.f25016u, jSONObjectM26732b);
        }
        return jSONObject;
    }
}
