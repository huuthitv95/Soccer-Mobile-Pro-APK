package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.of */
/* JADX INFO: loaded from: classes6.dex */
public class C12411of {

    /* JADX INFO: renamed from: a */
    private final JSONObject f31656a;

    public C12411of(JSONObject jSONObject) {
        this.f31656a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public boolean m33004a() {
        return this.f31656a.optBoolean("uxt", false);
    }

    /* JADX INFO: renamed from: b */
    public boolean m33005b() {
        return this.f31656a.optBoolean(C11744X3.a.f26178o, false);
    }

    /* JADX INFO: renamed from: c */
    public boolean m33006c() {
        return this.f31656a.optBoolean(C11744X3.a.f26179p, false);
    }

    /* JADX INFO: renamed from: d */
    public boolean m33007d() {
        return this.f31656a.optBoolean(C11744X3.a.f26175l, false);
    }

    /* JADX INFO: renamed from: e */
    public boolean m33008e() {
        return this.f31656a.optBoolean(C11744X3.a.f26177n, false);
    }
}
