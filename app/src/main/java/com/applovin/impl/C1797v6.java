package com.applovin.impl;

import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1749m;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.network.C1762a;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.ironsource.C11341A5;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.v6 */
/* JADX INFO: loaded from: classes3.dex */
public class C1797v6 extends AbstractRunnableC1601k5 {

    /* JADX INFO: renamed from: g */
    private final C1706r2 f3474g;

    /* JADX INFO: renamed from: h */
    private final Exception f3475h;

    /* JADX INFO: renamed from: com.applovin.impl.v6$a */
    class a extends AbstractC1673o6 {
        a(C1762a c1762a, C1748l c1748l) {
            super(c1762a, c1748l);
        }

        @Override // com.applovin.impl.AbstractC1673o6, com.applovin.impl.C1704r0.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo3137a(String str, int i, String str2, JSONObject jSONObject) {
            if (C1768p.m5160a()) {
                this.f1971c.m5174b(this.f1970b, "Failed to validate license: ");
            }
            if (!this.f1969a.m4821c(C1831z4.f3670A).contains(String.valueOf(i))) {
                C1521c5.m2207b(C1511b5.f1169i, Boolean.FALSE, C1748l.m4756p());
            }
            Map map = CollectionUtils.map("error_code", String.valueOf(i));
            CollectionUtils.putStringIfValid("error_message", str2, map);
            CollectionUtils.putStringIfValid("url", str, map);
            this.f1969a.m4863x0().m2682d(C1548f2.f1550m, map);
        }

        @Override // com.applovin.impl.AbstractC1673o6, com.applovin.impl.C1704r0.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo3139a(String str, JSONObject jSONObject, int i) {
            if (C1768p.m5160a()) {
                this.f1971c.m5171a(this.f1970b, "License Validation successful");
            }
            C1521c5.m2207b(C1511b5.f1169i, Boolean.FALSE, C1748l.m4756p());
            Map map = CollectionUtils.map(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, String.valueOf(i));
            CollectionUtils.putStringIfValid("url", str, map);
            this.f1969a.m4863x0().m2682d(C1548f2.f1547l, map);
        }
    }

    public C1797v6(C1748l c1748l, C1706r2 c1706r2, Exception exc) {
        super("TaskValidateLicense", c1748l);
        this.f3474g = c1706r2;
        this.f3475h = exc;
    }

    /* JADX INFO: renamed from: e */
    private String m5477e() {
        return AbstractC1714s0.m4310a((String) this.f1969a.m4801a(C1831z4.f4059v0), (String) this.f1969a.m4801a(C1831z4.f4067w0), this.f1969a);
    }

    /* JADX INFO: renamed from: f */
    private JSONObject m5478f() {
        JSONObject jSONObject = new JSONObject();
        AbstractC1790v.a aVarM4945f = this.f1969a.m4759B().m4945f();
        JsonUtils.putBoolean(jSONObject, "dnt", aVarM4945f.m5329c());
        JsonUtils.putString(jSONObject, "dnt_code", aVarM4945f.m5328b().m5331b());
        if (((Boolean) this.f1969a.m4801a(C1831z4.f3690C3)).booleanValue() && StringUtils.isValidString(aVarM4945f.m5323a())) {
            JsonUtils.putString(jSONObject, "idfa", aVarM4945f.m5323a());
        }
        C1749m.b bVarM4934H = this.f1969a.m4759B().m4934H();
        if (((Boolean) this.f1969a.m4801a(C1831z4.f3698D3)).booleanValue() && bVarM4934H != null) {
            JsonUtils.putString(jSONObject, "idfv", bVarM4934H.f3111a);
            JsonUtils.putInt(jSONObject, "idfv_scope", bVarM4934H.f3112b);
        }
        String strM3898e = this.f1969a.m4865y0().m3898e();
        if (((Boolean) this.f1969a.m4801a(C1831z4.f3706E3)).booleanValue() && StringUtils.isValidString(strM3898e)) {
            JsonUtils.putString(jSONObject, "cuid", strM3898e);
        }
        if (((Boolean) this.f1969a.m4801a(C1831z4.f3730H3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "compass_random_token", this.f1969a.m4858v());
        }
        if (((Boolean) this.f1969a.m4801a(C1831z4.f3746J3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "applovin_random_token", this.f1969a.m4837j0());
        }
        JsonUtils.putAll(jSONObject, (Map<String, ?>) this.f1969a.m4759B().m4944e());
        JSONObject jSONObject2 = new JSONObject();
        C1706r2 c1706r2 = this.f3474g;
        if (c1706r2 != null) {
            JsonUtils.putString(jSONObject2, "lsig", c1706r2.m4168d());
            JsonUtils.putString(jSONObject2, "lsigd", this.f3474g.m4169e());
            JsonUtils.putInt(jSONObject2, "r_code", this.f3474g.m4167c());
            JsonUtils.putInt(jSONObject2, C11341A5.f23826q, this.f3474g.m4166b());
        }
        Exception exc = this.f3475h;
        if (exc != null) {
            JsonUtils.putStringIfValid(jSONObject2, "lvfr", exc.toString());
        }
        JsonUtils.putObject(jSONObject, "lvd", jSONObject2);
        return jSONObject;
    }

    /* JADX INFO: renamed from: g */
    private String m5479g() {
        return AbstractC1714s0.m4310a((String) this.f1969a.m4801a(C1831z4.f4051u0), (String) this.f1969a.m4801a(C1831z4.f4067w0), this.f1969a);
    }

    @Override // java.lang.Runnable
    public void run() {
        a aVar = new a(C1762a.m5013a(this.f1969a).mo5045b(m5479g()).mo5039a(m5477e()).mo5041a(m5478f()).mo5049c("POST").mo5047b(((Boolean) this.f1969a.m4801a(C1831z4.f3836U5)).booleanValue()).mo5038a((Object) new JSONObject()).mo5036a(((Integer) this.f1969a.m4801a(C1831z4.f4070w3)).intValue()).mo5037a(AbstractC1804w4.a.m5546a(((Integer) this.f1969a.m4801a(C1831z4.f3684B5)).intValue())).mo5043a(), this.f1969a);
        aVar.m3767c(C1831z4.f4051u0);
        aVar.m3766b(C1831z4.f4059v0);
        this.f1969a.m4853s0().m2603a(aVar);
    }
}
