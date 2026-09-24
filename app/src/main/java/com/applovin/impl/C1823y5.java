package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.network.C1762a;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.ironsource.C11540L6;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.y5 */
/* JADX INFO: loaded from: classes3.dex */
public class C1823y5 extends AbstractRunnableC1601k5 {

    /* JADX INFO: renamed from: g */
    private final C1704r0.e f3650g;

    /* JADX INFO: renamed from: com.applovin.impl.y5$a */
    class a extends AbstractC1673o6 {
        a(C1762a c1762a, C1748l c1748l, boolean z) {
            super(c1762a, c1748l, z);
        }

        @Override // com.applovin.impl.AbstractC1673o6, com.applovin.impl.C1704r0.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo3137a(String str, int i, String str2, JSONObject jSONObject) {
            C1823y5.this.f3650g.mo3137a(str, i, str2, jSONObject);
        }

        @Override // com.applovin.impl.AbstractC1673o6, com.applovin.impl.C1704r0.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo3139a(String str, JSONObject jSONObject, int i) {
            C1823y5.this.f3650g.mo3139a(str, jSONObject, i);
        }
    }

    public C1823y5(C1704r0.e eVar, C1748l c1748l) {
        super("TaskFetchMediationDebuggerInfo", c1748l, true);
        this.f3650g = eVar;
    }

    /* JADX INFO: renamed from: a */
    private JSONObject m5715a(Context context) {
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putJsonArrayIfValid(jSONObject, "installed_mediation_adapters", AbstractC1821y3.m5704b(this.f1969a));
        JsonUtils.putBoolean(jSONObject, "is_tablet", AppLovinSdkUtils.isTablet(context));
        AbstractC1790v.a aVarM4945f = this.f1969a.m4759B().m4945f();
        JsonUtils.putStringIfValid(jSONObject, "dnt_code", aVarM4945f.m5328b().m5331b());
        JsonUtils.putStringIfValid(jSONObject, "idfa", aVarM4945f.m5323a());
        Map mapM4843m0 = this.f1969a.m4843m0();
        if (!CollectionUtils.isEmpty(mapM4843m0)) {
            JsonUtils.putJSONObject(jSONObject, "segments", new JSONObject(mapM4843m0));
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: e */
    protected Map m5716e() {
        HashMap map = new HashMap();
        map.put("sdk_version", AppLovinSdk.VERSION);
        if (!((Boolean) this.f1969a.m4801a(C1831z4.f3999n5)).booleanValue()) {
            map.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f1969a.m4839k0());
        }
        Map mapM4933G = this.f1969a.m4759B().m4933G();
        map.put("package_name", String.valueOf(mapM4933G.get("package_name")));
        map.put("app_version", String.valueOf(mapM4933G.get("app_version")));
        Map mapM4938N = this.f1969a.m4759B().m4938N();
        map.put(C11540L6.f24917H, String.valueOf(mapM4938N.get(C11540L6.f24917H)));
        map.put(C11540L6.f24911F, String.valueOf(mapM4938N.get(C11540L6.f24911F)));
        return map;
    }

    @Override // java.lang.Runnable
    public void run() {
        Map mapM5716e = m5716e();
        JSONObject jSONObjectM5715a = m5715a(m3080a());
        if (((Boolean) this.f1969a.m4801a(C1831z4.f3716F5)).booleanValue() || ((Boolean) this.f1969a.m4801a(C1831z4.f3692C5)).booleanValue()) {
            JsonUtils.putAll(jSONObjectM5715a, (Map<String, ?>) mapM5716e);
            mapM5716e = null;
        }
        a aVar = new a(C1762a.m5013a(this.f1969a).mo5049c("POST").mo5045b(AbstractC1660n3.m3626i(this.f1969a)).mo5039a(AbstractC1660n3.m3625h(this.f1969a)).mo5046b(mapM5716e).mo5041a(jSONObjectM5715a).mo5038a((Object) new JSONObject()).mo5048c(((Long) this.f1969a.m4801a(AbstractC1776t3.f3373v7)).intValue()).mo5037a(AbstractC1804w4.a.m5546a(((Integer) this.f1969a.m4801a(C1831z4.f4056u5)).intValue())).mo5043a(), this.f1969a, m3087d());
        aVar.m3767c(AbstractC1776t3.f3365r7);
        aVar.m3766b(AbstractC1776t3.f3367s7);
        this.f1969a.m4853s0().m2603a(aVar);
    }
}
