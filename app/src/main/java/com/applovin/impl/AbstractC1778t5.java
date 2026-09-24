package com.applovin.impl;

import com.applovin.impl.sdk.AppLovinError;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.network.C1762a;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.AppLovinUtils;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.t5 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC1778t5 extends AbstractRunnableC1601k5 {

    /* JADX INFO: renamed from: g */
    protected final C1781u f3386g;

    /* JADX INFO: renamed from: h */
    private final String f3387h;

    /* JADX INFO: renamed from: com.applovin.impl.t5$a */
    class a extends AbstractC1673o6 {
        a(C1762a c1762a, C1748l c1748l) {
            super(c1762a, c1748l);
        }

        @Override // com.applovin.impl.AbstractC1673o6, com.applovin.impl.C1704r0.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo3137a(String str, int i, String str2, JSONObject jSONObject) {
            AbstractC1778t5.this.mo1883a(i, str2);
            this.f1969a.m4764E().m4330a("fetchAd", str, i, str2);
        }

        @Override // com.applovin.impl.AbstractC1673o6, com.applovin.impl.C1704r0.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo3139a(String str, JSONObject jSONObject, int i) {
            if (i != 200) {
                AbstractC1778t5.this.mo1883a(i, MaxAdapterError.NO_FILL.getErrorMessage());
                return;
            }
            JsonUtils.putLong(jSONObject, "ad_fetch_latency_millis", this.f2476m.m4149a());
            JsonUtils.putLong(jSONObject, "ad_fetch_response_size", this.f2476m.m4150b());
            HashMap map = new HashMap(5);
            CollectionUtils.putStringIfValid("url", StringUtils.getHost(str), map);
            CollectionUtils.putStringIfValid(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, String.valueOf(i), map);
            CollectionUtils.putStringIfValid("ad_zone_id", AbstractC1778t5.this.f3386g.m5264e(), map);
            CollectionUtils.putStringIfValid("latency_ms", String.valueOf(this.f2476m.m4149a()), map);
            CollectionUtils.putStringIfValid("response_size", String.valueOf(this.f2476m.m4150b()), map);
            this.f1969a.m4830g().m2682d(C1548f2.f1574y, map);
            AbstractC1778t5.this.m5239b(jSONObject);
        }
    }

    public AbstractC1778t5(C1781u c1781u, String str, C1748l c1748l) {
        super(str, c1748l);
        this.f3386g = c1781u;
        this.f3387h = c1748l.m4816b();
    }

    /* JADX INFO: renamed from: g */
    private Map m5238g() {
        HashMap map = new HashMap(3);
        map.put("AppLovin-Zone-Id", this.f3386g.m5264e());
        if (this.f3386g.m5265f() != null) {
            map.put("AppLovin-Ad-Size", this.f3386g.m5265f().getLabel());
        }
        if (this.f3386g.m5266g() != null) {
            map.put("AppLovin-Ad-Type", this.f3386g.m5266g().getLabel());
        }
        return map;
    }

    /* JADX INFO: renamed from: a */
    protected abstract AbstractRunnableC1601k5 mo1882a(JSONObject jSONObject);

    /* JADX INFO: renamed from: a */
    protected void mo1883a(int i, String str) {
        if (C1768p.m5160a()) {
            this.f1971c.m5174b(this.f1970b, "Unable to fetch " + this.f3386g + " ad: server returned " + i);
        }
        this.f1969a.m4830g().m2527a(C1548f2.f1576z, this.f3386g, new AppLovinError(i, str));
    }

    /* JADX INFO: renamed from: b */
    protected void m5239b(JSONObject jSONObject) {
        AbstractC1714s0.m4323c(jSONObject, this.f1969a);
        AbstractC1714s0.m4321b(jSONObject, this.f1969a);
        AbstractC1714s0.m4312a(jSONObject, this.f1969a);
        C1781u.m5254a(jSONObject);
        this.f1969a.m4853s0().m2603a(mo1882a(jSONObject));
    }

    /* JADX INFO: renamed from: e */
    protected abstract String mo1884e();

    /* JADX INFO: renamed from: f */
    protected abstract String mo1885f();

    /* JADX INFO: renamed from: h */
    protected Map mo2217h() {
        HashMap map = new HashMap(4);
        map.put(AppLovinUtils.ServerParameterKeys.ZONE_ID, this.f3386g.m5264e());
        if (this.f3386g.m5265f() != null) {
            map.put("size", this.f3386g.m5265f().getLabel());
        }
        if (this.f3386g.m5266g() != null) {
            map.put("require", this.f3386g.m5266g().getLabel());
        }
        return map;
    }

    @Override // java.lang.Runnable
    public void run() {
        AbstractC1804w4.a aVarM5546a;
        Map map;
        if (C1768p.m5160a()) {
            this.f1971c.m5171a(this.f1970b, "Fetching next ad of zone: " + this.f3386g);
        }
        if (((Boolean) this.f1969a.m4801a(C1831z4.f3858X3)).booleanValue() && AbstractC1701q7.m4116k() && C1768p.m5160a()) {
            this.f1971c.m5171a(this.f1970b, "User is connected to a VPN");
        }
        AbstractC1701q7.m4048a(this.f1969a, this.f1970b);
        this.f1969a.m4830g().m2527a(C1548f2.f1572x, this.f3386g, (AppLovinError) null);
        try {
            JSONObject andResetCustomPostBody = this.f1969a.m4840l().getAndResetCustomPostBody();
            String str = "POST";
            if (((Boolean) this.f1969a.m4801a(C1831z4.f3970k3)).booleanValue()) {
                aVarM5546a = AbstractC1804w4.a.m5546a(((Integer) this.f1969a.m4801a(C1831z4.f4064v5)).intValue());
                JSONObject jSONObject = new JSONObject(this.f1969a.m4759B().m4941a(mo2217h(), false, true));
                map = new HashMap();
                if (!((Boolean) this.f1969a.m4801a(C1831z4.f3724G5)).booleanValue() && !((Boolean) this.f1969a.m4801a(C1831z4.f3692C5)).booleanValue()) {
                    map.put("rid", UUID.randomUUID().toString());
                }
                if (!((Boolean) this.f1969a.m4801a(C1831z4.f3999n5)).booleanValue()) {
                    map.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f1969a.m4839k0());
                }
                JsonUtils.putAll(jSONObject, andResetCustomPostBody);
                andResetCustomPostBody = jSONObject;
            } else {
                AbstractC1804w4.a aVarM5546a2 = AbstractC1804w4.a.m5546a(((Integer) this.f1969a.m4801a(C1831z4.f4072w5)).intValue());
                Map mapM4042a = AbstractC1701q7.m4042a(this.f1969a.m4759B().m4941a(mo2217h(), false, false));
                if (!((Boolean) this.f1969a.m4801a(C1831z4.f3789O6)).booleanValue()) {
                    mapM4042a.remove("video_decoders");
                }
                if (andResetCustomPostBody == null) {
                    str = "GET";
                    andResetCustomPostBody = null;
                }
                aVarM5546a = aVarM5546a2;
                map = mapM4042a;
            }
            if (AbstractC1701q7.m4111h(m3080a()) || AbstractC1701q7.m4115j(m3080a())) {
                map.putAll(this.f1969a.m4840l().getAndResetCustomQueryParams());
            }
            if (StringUtils.isValidString(this.f3387h)) {
                map.put("sts", this.f3387h);
            }
            C1762a.a aVarM5053f = C1762a.m5013a(this.f1969a).mo5045b(mo1885f()).mo5039a(mo1884e()).mo5046b(map).mo5049c(str).mo5040a(m5238g()).mo5038a((Object) new JSONObject()).mo5036a(((Integer) this.f1969a.m4801a(C1831z4.f3873Z2)).intValue()).m5050c(((Boolean) this.f1969a.m4801a(C1831z4.f3881a3)).booleanValue()).m5051d(((Boolean) this.f1969a.m4801a(C1831z4.f3889b3)).booleanValue()).mo5048c(((Integer) this.f1969a.m4801a(C1831z4.f3865Y2)).intValue()).mo5037a(aVarM5546a).m5053f(true);
            if (andResetCustomPostBody != null) {
                aVarM5053f.mo5041a(andResetCustomPostBody);
                aVarM5053f.mo5047b(((Boolean) this.f1969a.m4801a(C1831z4.f3812R5)).booleanValue());
            }
            a aVar = new a(aVarM5053f.mo5043a(), this.f1969a);
            aVar.m3767c(C1831z4.f3976l0);
            aVar.m3766b(C1831z4.f3985m0);
            this.f1969a.m4853s0().m2603a(aVar);
        } catch (Throwable th) {
            if (C1768p.m5160a()) {
                this.f1971c.m5172a(this.f1970b, "Unable to fetch ad for zone id: " + this.f3386g, th);
            }
            mo1883a(0, th.getMessage());
        }
    }
}
