package com.applovin.impl;

import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.network.C1762a;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.t6 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1779t6 extends AbstractRunnableC1601k5 {

    /* JADX INFO: renamed from: com.applovin.impl.t6$a */
    class a extends AbstractC1673o6 {

        /* JADX INFO: renamed from: n */
        final /* synthetic */ C1704r0.e f3389n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C1762a c1762a, C1748l c1748l, C1704r0.e eVar) {
            super(c1762a, c1748l);
            this.f3389n = eVar;
        }

        @Override // com.applovin.impl.AbstractC1673o6, com.applovin.impl.C1704r0.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo3137a(String str, int i, String str2, JSONObject jSONObject) {
            this.f3389n.mo3137a(str, i, str2, jSONObject);
        }

        @Override // com.applovin.impl.AbstractC1673o6, com.applovin.impl.C1704r0.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo3139a(String str, JSONObject jSONObject, int i) {
            this.f3389n.mo3139a(str, jSONObject, i);
        }
    }

    protected AbstractC1779t6(String str, C1748l c1748l) {
        super(str, c1748l);
    }

    /* JADX INFO: renamed from: a */
    protected void mo3882a(int i) {
        AbstractC1714s0.m4311a(i, this.f1969a);
    }

    /* JADX INFO: renamed from: a */
    protected abstract void mo3883a(JSONObject jSONObject);

    /* JADX INFO: renamed from: a */
    void m5242a(JSONObject jSONObject, C1704r0.e eVar) {
        Map mapM4322c = AbstractC1714s0.m4322c(this.f1969a);
        if (((Boolean) this.f1969a.m4801a(C1831z4.f3748J5)).booleanValue() || ((Boolean) this.f1969a.m4801a(C1831z4.f3692C5)).booleanValue()) {
            JsonUtils.putAll(jSONObject, (Map<String, ?>) mapM4322c);
            mapM4322c = null;
        }
        a aVar = new a(C1762a.m5013a(this.f1969a).mo5045b(AbstractC1714s0.m4320b(mo3885f(), this.f1969a)).mo5039a(AbstractC1714s0.m4309a(mo3885f(), this.f1969a)).mo5046b(mapM4322c).mo5041a(jSONObject).mo5049c("POST").mo5047b(((Boolean) this.f1969a.m4801a(C1831z4.f3828T5)).booleanValue()).mo5038a((Object) new JSONObject()).mo5036a(mo4211g()).mo5037a(AbstractC1804w4.a.m5546a(((Integer) this.f1969a.m4801a(C1831z4.f3676A5)).intValue())).mo5043a(), this.f1969a, eVar);
        aVar.m3767c(C1831z4.f3994n0);
        aVar.m3766b(C1831z4.f4003o0);
        this.f1969a.m4853s0().m2603a(aVar);
    }

    /* JADX INFO: renamed from: e */
    protected JSONObject m5243e() {
        JSONObject jSONObject = new JSONObject();
        String strM3898e = this.f1969a.m4865y0().m3898e();
        if (((Boolean) this.f1969a.m4801a(C1831z4.f3714F3)).booleanValue() && StringUtils.isValidString(strM3898e)) {
            JsonUtils.putString(jSONObject, "cuid", strM3898e);
        }
        if (((Boolean) this.f1969a.m4801a(C1831z4.f3730H3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "compass_random_token", this.f1969a.m4858v());
        }
        if (((Boolean) this.f1969a.m4801a(C1831z4.f3746J3)).booleanValue()) {
            JsonUtils.putString(jSONObject, "applovin_random_token", this.f1969a.m4837j0());
        }
        mo3883a(jSONObject);
        return jSONObject;
    }

    /* JADX INFO: renamed from: f */
    protected abstract String mo3885f();

    /* JADX INFO: renamed from: g */
    protected abstract int mo4211g();
}
