package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.K5 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11521K5 {

    /* JADX INFO: renamed from: a */
    private final JSONObject f24818a;

    public C11521K5(JSONObject jSONObject) {
        this.f24818a = jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public final Boolean m26256a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        JSONObject jSONObject = this.f24818a;
        Object objOpt = jSONObject != null ? jSONObject.opt(key) : null;
        if (objOpt instanceof Boolean) {
            return (Boolean) objOpt;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final Integer m26257b(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        JSONObject jSONObject = this.f24818a;
        Object objOpt = jSONObject != null ? jSONObject.opt(key) : null;
        if (objOpt instanceof Integer) {
            return (Integer) objOpt;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public final String m26258c(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        JSONObject jSONObject = this.f24818a;
        Object objOpt = jSONObject != null ? jSONObject.opt(key) : null;
        if (objOpt instanceof String) {
            return (String) objOpt;
        }
        return null;
    }
}
