package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.B1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11355B1 {

    /* JADX INFO: renamed from: a */
    private final C11383Cb f23881a;

    /* JADX INFO: renamed from: b */
    private final C11481I1 f23882b;

    /* JADX INFO: renamed from: c */
    private final boolean f23883c;

    /* JADX INFO: renamed from: d */
    private final C11427F1 f23884d;

    /* JADX INFO: renamed from: e */
    private final C11553M1 f23885e;

    /* JADX INFO: renamed from: f */
    private final C12630z1 f23886f;

    public C11355B1(JSONObject applicationConfigurations) {
        Intrinsics.checkNotNullParameter(applicationConfigurations, "applicationConfigurations");
        JSONObject jSONObjectOptJSONObject = applicationConfigurations.optJSONObject(C11391D1.f24191a);
        this.f23881a = new C11383Cb(jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject);
        JSONObject jSONObjectOptJSONObject2 = applicationConfigurations.optJSONObject("events");
        this.f23882b = new C11481I1(jSONObjectOptJSONObject2 == null ? new JSONObject() : jSONObjectOptJSONObject2);
        this.f23883c = applicationConfigurations.optBoolean(C11391D1.f24197g, false);
        JSONObject jSONObjectOptJSONObject3 = applicationConfigurations.optJSONObject(C11391D1.f24198h);
        this.f23884d = new C11427F1(jSONObjectOptJSONObject3 == null ? new JSONObject() : jSONObjectOptJSONObject3);
        JSONObject jSONObjectOptJSONObject4 = applicationConfigurations.optJSONObject("settings");
        this.f23885e = new C11553M1(jSONObjectOptJSONObject4 == null ? new JSONObject() : jSONObjectOptJSONObject4);
        JSONObject jSONObjectOptJSONObject5 = applicationConfigurations.optJSONObject(C11391D1.f24196f);
        this.f23886f = new C12630z1(jSONObjectOptJSONObject5 == null ? new JSONObject() : jSONObjectOptJSONObject5);
    }

    /* JADX INFO: renamed from: a */
    public final C12630z1 m25375a() {
        return this.f23886f;
    }

    /* JADX INFO: renamed from: b */
    public final C11427F1 m25376b() {
        return this.f23884d;
    }

    /* JADX INFO: renamed from: c */
    public final C11481I1 m25377c() {
        return this.f23882b;
    }

    /* JADX INFO: renamed from: d */
    public final C11553M1 m25378d() {
        return this.f23885e;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m25379e() {
        return this.f23883c;
    }

    /* JADX INFO: renamed from: f */
    public final C11383Cb m25380f() {
        return this.f23881a;
    }
}
