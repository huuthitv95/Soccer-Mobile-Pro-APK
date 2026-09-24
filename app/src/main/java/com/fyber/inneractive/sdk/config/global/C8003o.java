package com.fyber.inneractive.sdk.config.global;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.global.o */
/* JADX INFO: loaded from: classes4.dex */
public final class C8003o implements InterfaceC8002n {

    /* JADX INFO: renamed from: a */
    public final JSONObject f17771a;

    public C8003o(JSONObject jSONObject) {
        this.f17771a = jSONObject;
    }

    @Override // com.fyber.inneractive.sdk.config.global.InterfaceC8002n
    /* JADX INFO: renamed from: a */
    public final Integer mo20416a(String str) {
        if (this.f17771a.has(str)) {
            try {
                return Integer.valueOf(this.f17771a.getInt(str));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.config.global.InterfaceC8002n
    /* JADX INFO: renamed from: a */
    public final String mo20417a(String str, String str2) {
        return this.f17771a.optString(str, str2);
    }

    @Override // com.fyber.inneractive.sdk.config.global.InterfaceC8002n
    /* JADX INFO: renamed from: a */
    public final Map mo20430a() {
        HashMap map = new HashMap();
        Iterator<String> itKeys = this.f17771a.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                map.put(next, this.f17771a.get(next));
            } catch (Exception unused) {
            }
        }
        return map;
    }

    @Override // com.fyber.inneractive.sdk.config.global.InterfaceC8002n
    /* JADX INFO: renamed from: b */
    public final String mo20419b(String str) {
        if (this.f17771a.has(str)) {
            try {
                return this.f17771a.getString(str);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.config.global.InterfaceC8002n
    /* JADX INFO: renamed from: c */
    public final Boolean mo20420c(String str) {
        if (this.f17771a.has(str)) {
            try {
                return Boolean.valueOf(this.f17771a.getBoolean(str));
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final String toString() {
        JSONObject jSONObject = this.f17771a;
        return jSONObject != null ? jSONObject.toString() : "no params";
    }
}
