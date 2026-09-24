package com.applovin.impl;

import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1749m;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.network.C1762a;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.facebook.devicerequests.internal.DeviceRequestsHelper;
import com.ironsource.C11540L6;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.l5 */
/* JADX INFO: loaded from: classes3.dex */
class C1611l5 extends AbstractRunnableC1601k5 {

    /* JADX INFO: renamed from: com.applovin.impl.l5$a */
    class a extends AbstractC1673o6 {
        a(C1762a c1762a, C1748l c1748l) {
            super(c1762a, c1748l);
        }

        @Override // com.applovin.impl.AbstractC1673o6, com.applovin.impl.C1704r0.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo3137a(String str, int i, String str2, JSONObject jSONObject) {
            AbstractC1714s0.m4311a(i, this.f1969a);
        }

        @Override // com.applovin.impl.AbstractC1673o6, com.applovin.impl.C1704r0.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo3139a(String str, JSONObject jSONObject, int i) {
            C1611l5.this.m3135a(jSONObject);
        }
    }

    C1611l5(C1748l c1748l) {
        super("TaskApiSubmitData", c1748l);
    }

    /* JADX INFO: renamed from: a */
    private void m3134a(Map map, JSONObject jSONObject) {
        a aVar = new a(C1762a.m5013a(this.f1969a).mo5045b(AbstractC1714s0.m4320b("2.0/device", this.f1969a)).mo5039a(AbstractC1714s0.m4309a("2.0/device", this.f1969a)).mo5046b(map).mo5041a(jSONObject).mo5049c("POST").mo5047b(((Boolean) this.f1969a.m4801a(C1831z4.f3804Q5)).booleanValue()).mo5038a((Object) new JSONObject()).mo5036a(((Integer) this.f1969a.m4801a(C1831z4.f3898c3)).intValue()).mo5037a(AbstractC1804w4.a.m5546a(((Integer) this.f1969a.m4801a(C1831z4.f4096z5)).intValue())).mo5043a(), this.f1969a);
        aVar.m3767c(C1831z4.f3994n0);
        aVar.m3766b(C1831z4.f4003o0);
        this.f1969a.m4853s0().m2603a(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m3135a(JSONObject jSONObject) {
        JSONObject jSONObject2 = JsonUtils.getJSONObject(JsonUtils.getJSONArray(jSONObject, "results", new JSONArray()), 0, new JSONObject());
        this.f1969a.m4849q0().m1876a(C1831z4.f3921f, JsonUtils.getString(jSONObject2, "device_id", ""));
        this.f1969a.m4849q0().m1876a(C1831z4.f3957j, JsonUtils.getString(jSONObject2, "device_token", ""));
        AbstractC1714s0.m4312a(jSONObject2, this.f1969a);
    }

    /* JADX INFO: renamed from: b */
    private void m3136b(JSONObject jSONObject) {
        C1749m c1749mM4759B = this.f1969a.m4759B();
        Map mapM4947p = c1749mM4759B.m4947p();
        AbstractC1701q7.m4059a(C11540L6.f24917H, "type", mapM4947p);
        AbstractC1701q7.m4059a("api_level", "sdk_version", mapM4947p);
        JsonUtils.putObject(jSONObject, DeviceRequestsHelper.DEVICE_INFO_PARAM, new JSONObject(mapM4947p));
        Map mapM4933G = c1749mM4759B.m4933G();
        AbstractC1701q7.m4059a("sdk_version", "applovin_sdk_version", mapM4933G);
        AbstractC1701q7.m4059a("ia", "installed_at", mapM4933G);
        JsonUtils.putObject(jSONObject, "app_info", new JSONObject(mapM4933G));
    }

    @Override // java.lang.Runnable
    public void run() {
        if (C1768p.m5160a()) {
            this.f1971c.m5175d(this.f1970b, "Submitting user data...");
        }
        Map mapM4322c = AbstractC1714s0.m4322c(this.f1969a);
        JSONObject jSONObject = new JSONObject();
        m3136b(jSONObject);
        if (((Boolean) this.f1969a.m4801a(C1831z4.f3740I5)).booleanValue() || ((Boolean) this.f1969a.m4801a(C1831z4.f3692C5)).booleanValue()) {
            JsonUtils.putAll(jSONObject, (Map<String, ?>) mapM4322c);
            mapM4322c = null;
        }
        m3134a(mapM4322c, jSONObject);
    }
}
