package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.je */
/* JADX INFO: loaded from: classes6.dex */
public final class C12270je {

    /* JADX INFO: renamed from: a */
    private final C11494Ie f30700a;

    /* JADX INFO: renamed from: b */
    private final C12481sd f30701b;

    /* JADX INFO: renamed from: c */
    private final C12588wd f30702c;

    /* JADX INFO: renamed from: d */
    private final C11591O3 f30703d;

    /* JADX INFO: renamed from: e */
    private final C11521K5 f30704e;

    public C12270je(C11494Ie fullResponse) {
        Intrinsics.checkNotNullParameter(fullResponse, "fullResponse");
        this.f30700a = fullResponse;
        JSONObject jSONObjectOptJSONObject = fullResponse.m26139j().optJSONObject(C12288ke.f30744a);
        this.f30701b = new C12481sd(jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject);
        JSONObject jSONObjectOptJSONObject2 = fullResponse.m26139j().optJSONObject(C12288ke.f30745b);
        this.f30702c = new C12588wd(jSONObjectOptJSONObject2 == null ? new JSONObject() : jSONObjectOptJSONObject2);
        JSONObject jSONObjectOptJSONObject3 = fullResponse.m26139j().optJSONObject("configurations");
        this.f30703d = new C11591O3(jSONObjectOptJSONObject3 == null ? new JSONObject() : jSONObjectOptJSONObject3);
        JSONObject jSONObjectOptJSONObject4 = fullResponse.m26139j().optJSONObject(C12288ke.f30747d);
        this.f30704e = new C11521K5(jSONObjectOptJSONObject4 == null ? new JSONObject() : jSONObjectOptJSONObject4);
    }

    /* JADX INFO: renamed from: a */
    public final C11591O3 m31895a() {
        return this.f30703d;
    }

    /* JADX INFO: renamed from: b */
    public final C11521K5 m31896b() {
        return this.f30704e;
    }

    /* JADX INFO: renamed from: c */
    public final C11494Ie m31897c() {
        return this.f30700a;
    }

    /* JADX INFO: renamed from: d */
    public final C12481sd m31898d() {
        return this.f30701b;
    }

    /* JADX INFO: renamed from: e */
    public final C12588wd m31899e() {
        return this.f30702c;
    }
}
