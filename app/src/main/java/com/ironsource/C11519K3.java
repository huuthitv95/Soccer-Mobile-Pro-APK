package com.ironsource;

import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.K3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11519K3 implements InterfaceC11644R5 {

    /* JADX INFO: renamed from: a */
    private final JSONObject f24814a;

    /* JADX INFO: renamed from: com.ironsource.K3$a */
    public static final class a {

        /* JADX INFO: renamed from: a */
        public static final a f24815a = new a();

        /* JADX INFO: renamed from: b */
        public static final boolean f24816b = false;

        private a() {
        }
    }

    public C11519K3(JSONObject jSONObject) {
        this.f24814a = jSONObject == null ? new JSONObject() : jSONObject;
    }

    @Override // com.ironsource.InterfaceC11644R5
    /* JADX INFO: renamed from: b */
    public boolean mo26172b() {
        return this.f24814a.optBoolean("clickCheck", false);
    }
}
