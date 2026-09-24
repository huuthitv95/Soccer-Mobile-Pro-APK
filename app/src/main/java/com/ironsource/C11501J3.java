package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.J3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11501J3 implements InterfaceC11644R5 {

    /* JADX INFO: renamed from: a */
    private final JSONObject f24715a;

    /* JADX INFO: renamed from: com.ironsource.J3$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final a f24716a = new a();

        /* JADX INFO: renamed from: b */
        public static final boolean f24717b = false;

        /* JADX INFO: renamed from: c */
        public static final String f24718c = "curlError";

        private a() {
        }
    }

    public C11501J3(JSONObject jSONObject) {
        this.f24715a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    @Override // com.ironsource.InterfaceC11644R5
    /* JADX INFO: renamed from: b */
    public boolean mo26172b() {
        return this.f24715a.optBoolean("enabled", false);
    }

    /* JADX INFO: renamed from: d */
    public final boolean m26173d() {
        return this.f24715a.optBoolean("closeActivity", true);
    }

    /* JADX INFO: renamed from: e */
    public final boolean m26174e() {
        return this.f24715a.optBoolean("reportController", true);
    }
}
