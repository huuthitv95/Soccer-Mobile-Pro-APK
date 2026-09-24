package com.ironsource;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.Y8 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11766Y8 {

    /* JADX INFO: renamed from: a */
    private final ArrayList<String> f26619a = new ArrayList<>(new C11749X8().m27942a());

    /* JADX INFO: renamed from: b */
    private final C11576N6 f26620b = new C11576N6();

    /* JADX INFO: renamed from: a */
    public final JSONObject m28018a() throws JSONException {
        JSONObject jSONObjectM26658a = this.f26620b.m26658a(this.f26619a);
        Intrinsics.checkNotNullExpressionValue(jSONObjectM26658a, "mGlobalDataReader.getDat…mInitDeferredDataKeyList)");
        return jSONObjectM26658a;
    }
}
