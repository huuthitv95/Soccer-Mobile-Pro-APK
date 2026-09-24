package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.m8 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12321m8 implements InterfaceC12300l8, InterfaceC12300l8.a {

    /* JADX INFO: renamed from: a */
    private JSONObject f30959a = new JSONObject();

    /* JADX INFO: renamed from: b */
    private JSONObject f30960b = new JSONObject();

    /* JADX INFO: renamed from: c */
    private JSONObject f30961c = new JSONObject();

    /* JADX INFO: renamed from: e */
    private final Object m32215e(String str) {
        if (this.f30961c.has(str)) {
            return this.f30961c.get(str);
        }
        if (this.f30960b.has(str)) {
            return this.f30960b.get(str);
        }
        if (this.f30959a.has(str)) {
            return this.f30959a.get(str);
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC12300l8
    /* JADX INFO: renamed from: a */
    public JSONObject mo32059a(String configKey) {
        Intrinsics.checkNotNullParameter(configKey, "configKey");
        Object objM32215e = m32215e(configKey);
        if (objM32215e instanceof JSONObject) {
            return (JSONObject) objM32215e;
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC12300l8
    /* JADX INFO: renamed from: b */
    public Integer mo32060b(String configKey) {
        Intrinsics.checkNotNullParameter(configKey, "configKey");
        Object objM32215e = m32215e(configKey);
        if (objM32215e instanceof Integer) {
            return (Integer) objM32215e;
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC12300l8
    /* JADX INFO: renamed from: c */
    public Boolean mo32061c(String configKey) {
        Intrinsics.checkNotNullParameter(configKey, "configKey");
        Object objM32215e = m32215e(configKey);
        if (objM32215e instanceof Boolean) {
            return (Boolean) objM32215e;
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC12300l8
    /* JADX INFO: renamed from: d */
    public String mo32062d(String configKey) {
        Intrinsics.checkNotNullParameter(configKey, "configKey");
        Object objM32215e = m32215e(configKey);
        if (objM32215e instanceof String) {
            return (String) objM32215e;
        }
        return null;
    }

    @Override // com.ironsource.InterfaceC12300l8.a
    /* JADX INFO: renamed from: a */
    public void mo32063a(JSONObject controllerConfig) {
        Intrinsics.checkNotNullParameter(controllerConfig, "controllerConfig");
        this.f30959a = controllerConfig;
        JSONObject jSONObjectOptJSONObject = controllerConfig.optJSONObject(C11744X3.a.f26165b);
        if (jSONObjectOptJSONObject == null) {
            jSONObjectOptJSONObject = new JSONObject();
        }
        this.f30960b = jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2 = this.f30959a.optJSONObject(C11744X3.a.f26166c);
        if (jSONObjectOptJSONObject2 == null) {
            jSONObjectOptJSONObject2 = new JSONObject();
        }
        this.f30961c = jSONObjectOptJSONObject2;
    }
}
