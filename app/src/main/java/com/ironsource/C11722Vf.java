package com.ironsource;

import android.content.Context;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.Vf */
/* JADX INFO: loaded from: classes6.dex */
public final class C11722Vf {

    /* JADX INFO: renamed from: a */
    private final String[] f26051a = C11705Uf.f25990a.m27631a();

    /* JADX INFO: renamed from: b */
    private final C11576N6 f26052b = new C11576N6();

    @Deprecated(level = DeprecationLevel.WARNING, message = "Use the new method getToken(context: Context)")
    /* JADX INFO: renamed from: a */
    public final JSONObject m27762a() throws JSONException {
        JSONObject jSONObjectM26660a = this.f26052b.m26660a(this.f26051a);
        Intrinsics.checkNotNullExpressionValue(jSONObjectM26660a, "mGlobalDataReader.getDataByKeys(mTokenKeyList)");
        return m27761a(jSONObjectM26660a);
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m27763a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        JSONObject jSONObjectM26657a = this.f26052b.m26657a(context, this.f26051a);
        Intrinsics.checkNotNullExpressionValue(jSONObjectM26657a, "mGlobalDataReader.getDat…s(context, mTokenKeyList)");
        return m27761a(jSONObjectM26657a);
    }

    /* JADX INFO: renamed from: a */
    private final JSONObject m27761a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObjectM26732b = C11594O6.m26732b(jSONObject.optJSONObject(C11540L6.f25016u));
        if (jSONObjectM26732b != null) {
            jSONObject.put(C11540L6.f25016u, jSONObjectM26732b);
        }
        return jSONObject;
    }
}
