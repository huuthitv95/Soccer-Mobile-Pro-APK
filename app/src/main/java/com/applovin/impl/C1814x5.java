package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.mediation.ads.AbstractC1644a;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.C1769q;
import com.applovin.impl.sdk.network.C1762a;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.C11794a2;
import com.mbridge.msdk.foundation.entity.AbstractC13068b;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.UUID;
import kotlin.UByte$$ExternalSyntheticBackport0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.x5 */
/* JADX INFO: loaded from: classes3.dex */
public class C1814x5 extends AbstractRunnableC1601k5 {

    /* JADX INFO: renamed from: g */
    private final C1519c3 f3557g;

    /* JADX INFO: renamed from: h */
    private final JSONArray f3558h;

    /* JADX INFO: renamed from: i */
    private final Context f3559i;

    /* JADX INFO: renamed from: j */
    private final AbstractC1644a.a f3560j;

    /* JADX INFO: renamed from: com.applovin.impl.x5$a */
    class a extends AbstractC1673o6 {

        /* JADX INFO: renamed from: n */
        final /* synthetic */ String f3561n;

        /* JADX INFO: renamed from: o */
        final /* synthetic */ MaxAdFormat f3562o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C1762a c1762a, C1748l c1748l, String str, MaxAdFormat maxAdFormat) {
            super(c1762a, c1748l);
            this.f3561n = str;
            this.f3562o = maxAdFormat;
        }

        @Override // com.applovin.impl.AbstractC1673o6, com.applovin.impl.C1704r0.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo3137a(String str, int i, String str2, JSONObject jSONObject) {
            C1814x5.this.m5580a(str, i, str2);
            this.f1969a.m4764E().m4330a("fetchMediatedAd", str, i, str2);
        }

        @Override // com.applovin.impl.AbstractC1673o6, com.applovin.impl.C1704r0.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo3139a(String str, JSONObject jSONObject, int i) {
            if (i != 200) {
                C1814x5.this.m5580a(str, i, null);
                return;
            }
            JsonUtils.putLong(jSONObject, "ad_fetch_latency_millis", this.f2476m.m4149a());
            JsonUtils.putLong(jSONObject, "ad_fetch_response_size", this.f2476m.m4150b());
            HashMap map = new HashMap(6);
            CollectionUtils.putStringIfValid("url", StringUtils.getHost(str), map);
            CollectionUtils.putStringIfValid(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, String.valueOf(i), map);
            CollectionUtils.putStringIfValid("ad_unit_id", this.f3561n, map);
            CollectionUtils.putStringIfValid(FirebaseAnalytics.Param.AD_FORMAT, this.f3562o.getLabel(), map);
            CollectionUtils.putStringIfValid("latency_ms", String.valueOf(this.f2476m.m4149a()), map);
            CollectionUtils.putStringIfValid("response_size", String.valueOf(this.f2476m.m4150b()), map);
            this.f1969a.m4784R().m2682d(C1548f2.f1539i0, map);
            C1814x5.this.m5582b(jSONObject);
        }
    }

    public C1814x5(C1519c3 c1519c3, JSONArray jSONArray, Context context, C1748l c1748l, AbstractC1644a.a aVar) {
        super("TaskFetchMediatedAd", c1748l, c1519c3.m2193b());
        this.f3557g = c1519c3;
        this.f3558h = jSONArray;
        this.f3559i = context;
        this.f3560j = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m5580a(String str, int i, String str2) {
        MaxErrorImpl maxErrorImpl;
        String strM2193b = this.f3557g.m2193b();
        if (C1768p.m5160a()) {
            this.f1971c.m5174b(this.f1970b, "Unable to fetch ad for ad unit " + strM2193b + ": server returned " + i);
        }
        if (i == -1009) {
            maxErrorImpl = new MaxErrorImpl(-1009, str2);
        } else if (i == -1001) {
            maxErrorImpl = new MaxErrorImpl(-1001, str2);
        } else {
            maxErrorImpl = StringUtils.isValidString(str2) ? new MaxErrorImpl(-1000, str2) : new MaxErrorImpl(-1);
        }
        HashMap map = new HashMap(5);
        CollectionUtils.putStringIfValid("url", StringUtils.getHost(str), map);
        CollectionUtils.putStringIfValid(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, String.valueOf(i), map);
        CollectionUtils.putStringIfValid("error_message", str2, map);
        CollectionUtils.putStringIfValid("ad_unit_id", strM2193b, map);
        CollectionUtils.putStringIfValid(FirebaseAnalytics.Param.AD_FORMAT, this.f3557g.m2191a().getLabel(), map);
        this.f1969a.m4784R().m2682d(C1548f2.f1542j0, map);
        AbstractC1793v2.m5376a(this.f3560j, strM2193b, maxErrorImpl);
    }

    /* JADX INFO: renamed from: a */
    private void m5581a(JSONObject jSONObject) {
        JSONObject jSONObject2;
        AbstractRunnableC1601k5 c1572h6;
        if (((Boolean) this.f1969a.m4801a(AbstractC1776t3.f3324G8)).booleanValue()) {
            jSONObject2 = jSONObject;
            c1572h6 = new C1582i6(this.f3557g, jSONObject2, this.f3559i, this.f1969a, this.f3560j);
        } else {
            jSONObject2 = jSONObject;
            c1572h6 = new C1572h6(this.f3557g, jSONObject, this.f3559i, this.f1969a, this.f3560j);
        }
        long j = JsonUtils.getLong(jSONObject2, "process_waterfall_delay_ms", -1L);
        if (j > 0) {
            this.f1969a.m4853s0().m2606a(c1572h6, C1552f6.b.MEDIATION, j, true);
        } else {
            this.f1969a.m4853s0().m2603a(c1572h6);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m5582b(JSONObject jSONObject) {
        try {
            AbstractC1714s0.m4323c(jSONObject, this.f1969a);
            AbstractC1714s0.m4321b(jSONObject, this.f1969a);
            AbstractC1714s0.m4312a(jSONObject, this.f1969a);
            AbstractC1660n3.m3623f(jSONObject, this.f1969a);
            AbstractC1660n3.m3621d(jSONObject, this.f1969a);
            AbstractC1660n3.m3622e(jSONObject, this.f1969a);
            AbstractC1660n3.m3624g(jSONObject, this.f1969a);
            this.f1969a.m4844n().m4686a();
            MaxAdFormat maxAdFormatM2191a = this.f3557g.m2191a();
            MaxAdFormat fromString = MaxAdFormat.formatFromString(JsonUtils.getString(jSONObject, FirebaseAnalytics.Param.AD_FORMAT, null));
            if (maxAdFormatM2191a == fromString) {
                m5581a(jSONObject);
                return;
            }
            String strM2193b = this.f3557g.m2193b();
            if (fromString == null) {
                if (C1768p.m5160a()) {
                    this.f1971c.m5174b(this.f1970b, "Mediated ad response is missing the ad format field for ad unit " + strM2193b);
                }
                if (jSONObject.has(AbstractC13068b.JSON_KEY_ADS)) {
                    HashMap map = new HashMap(3);
                    CollectionUtils.putStringIfValid("details", "Missing ad format field", map);
                    CollectionUtils.putStringIfValid("ad_unit_id", strM2193b, map);
                    CollectionUtils.putStringIfValid("mcode", JsonUtils.getString(jSONObject, "mcode", ""), map);
                    this.f1969a.m4764E().m2678a(C1548f2.f1537h1, this.f1970b, map);
                }
                this.f3560j.onAdLoadFailed(strM2193b, MaxAdapterError.NO_FILL);
                return;
            }
            String label = fromString.getLabel();
            String label2 = maxAdFormatM2191a.getLabel();
            String str = "Incorrect format (" + label + ") loaded for (" + label2 + ") ad. Please verify if the ad unit ID (" + strM2193b + ") is assigned to the correct ad format.";
            if (AbstractC1701q7.m4064a(maxAdFormatM2191a, fromString)) {
                C1768p.m5169j(this.f1970b, str);
                m5581a(jSONObject);
                return;
            }
            AbstractC1617m1.m3169a(str, new Object[0]);
            C1768p.m5167h(this.f1970b, str);
            this.f3560j.onAdLoadFailed(strM2193b, new MaxAdapterError(MaxAdapterError.INVALID_CONFIGURATION, 0, str));
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("ad_unit_id", strM2193b);
            CollectionUtils.putStringIfValid("name", label2, mapHashMap);
            CollectionUtils.putStringIfValid("details", label, mapHashMap);
            this.f1969a.m4764E().m2678a(C1548f2.f1515Z0, "incompatible_ad_format", mapHashMap);
        } catch (Throwable th) {
            if (C1768p.m5160a()) {
                this.f1971c.m5172a(this.f1970b, "Unable to process mediated ad response for ad unit " + this.f3557g.m2193b(), th);
            }
            throw new RuntimeException("Unable to process ad: " + th);
        }
    }

    /* JADX INFO: renamed from: c */
    private void m5583c(JSONObject jSONObject) {
        JSONObject andResetCustomPostBodyData = this.f1969a.m4797Z().getAndResetCustomPostBodyData();
        if (andResetCustomPostBodyData == null || !AbstractC1701q7.m4111h(C1748l.m4756p())) {
            return;
        }
        JsonUtils.putAll(jSONObject, andResetCustomPostBodyData);
    }

    /* JADX INFO: renamed from: d */
    private void m5584d(JSONObject jSONObject) {
        if (((Boolean) this.f1969a.m4801a(C1831z4.f3795P4)).booleanValue()) {
            C1803w3 c1803w3M4814a0 = this.f1969a.m4814a0();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            C1785u3 c1785u3 = C1785u3.f3406f;
            JsonUtils.putAll(jSONObject3, (Map<String, ?>) c1803w3M4814a0.m5524a(c1785u3, C1794v3.a.AD_UNIT_ID));
            JsonUtils.putJSONObject(jSONObject2, "arpau", jSONObject3);
            JSONObject jSONObject4 = new JSONObject();
            JsonUtils.putAll(jSONObject4, (Map<String, ?>) c1803w3M4814a0.m5524a(c1785u3, C1794v3.a.AD_FORMAT));
            JsonUtils.putJSONObject(jSONObject2, "arpaf", jSONObject4);
            JSONObject jSONObject5 = new JSONObject();
            JsonUtils.putAll(jSONObject5, (Map<String, ?>) c1803w3M4814a0.m5524a(C1785u3.f3407g, C1794v3.a.AD));
            JsonUtils.putJSONObject(jSONObject2, "ttdasipa_ms", jSONObject5);
            JsonUtils.putJSONObject(jSONObject, "mediation_stats", jSONObject2);
        }
    }

    /* JADX INFO: renamed from: e */
    private String m5585e() {
        return AbstractC1660n3.m3619a(this.f1969a);
    }

    /* JADX INFO: renamed from: e */
    private void m5586e(JSONObject jSONObject) throws JSONException {
        String strM2193b = this.f3557g.m2193b();
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("ad_unit_id", strM2193b);
        jSONObject2.put(FirebaseAnalytics.Param.AD_FORMAT, this.f3557g.m2191a().getLabel());
        Map map = CollectionUtils.map(this.f3557g.m2195d());
        C1769q c1769qM4824c0 = this.f1969a.m4824c0();
        CollectionUtils.putStringIfValid("previous_request_id", c1769qM4824c0.m5181b(strM2193b), map);
        CollectionUtils.putStringIfValid("previous_loaded_request_id", c1769qM4824c0.m5179a(strM2193b), map);
        C1769q.a aVarM5183c = c1769qM4824c0.m5183c(strM2193b);
        if (aVarM5183c != null) {
            if (Boolean.parseBoolean(this.f1969a.m4847p0().getExtraParameters().get("esc"))) {
                map.put("previous_winning_network", "APPLOVIN_NETWORK");
                map.put("previous_winning_network_name", "AppLovin");
            } else {
                map.put("previous_winning_network", aVarM5183c.m5185a());
                map.put("previous_winning_network_name", aVarM5183c.m5188c());
            }
            if (this.f1969a.m4787T() != null) {
                Queue<AbstractC1482a3> queueM3488c = this.f1969a.m4787T().m3488c(strM2193b);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (AbstractC1482a3 abstractC1482a3 : queueM3488c) {
                    arrayList.add(abstractC1482a3.m3200c());
                    arrayList2.add(abstractC1482a3.getNetworkName());
                }
                CollectionUtils.putStringIfValid("queued_ad_networks", UByte$$ExternalSyntheticBackport0.m43493m((CharSequence) ",", (Iterable) arrayList), map);
                CollectionUtils.putStringIfValid("queued_ad_network_names", UByte$$ExternalSyntheticBackport0.m43493m((CharSequence) ",", (Iterable) arrayList2), map);
            }
        }
        jSONObject2.put("extra_parameters", CollectionUtils.toJson(map));
        jSONObject.put("ad_info", jSONObject2);
    }

    /* JADX INFO: renamed from: f */
    private String m5587f() {
        return AbstractC1660n3.m3620b(this.f1969a);
    }

    /* JADX INFO: renamed from: f */
    private void m5588f(JSONObject jSONObject) {
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(C11794a2.f26724e, new JSONArray(this.f1969a.m4790V().m3518a()));
            jSONObject2.put("installed", AbstractC1821y3.m5704b(this.f1969a));
            jSONObject2.put("initialized", this.f1969a.m4789U().m3511b());
            jSONObject2.put("initialized_classnames", new JSONArray((Collection) this.f1969a.m4789U().m3507a()));
            jSONObject2.put("loaded_classnames", new JSONArray(this.f1969a.m4790V().m3521c()));
            jSONObject2.put("failed_classnames", new JSONArray(this.f1969a.m4790V().m3520b()));
            jSONObject.put("adapters_info", jSONObject2);
        } catch (Exception e) {
            if (C1768p.m5160a()) {
                this.f1971c.m5172a(this.f1970b, "Failed to populate adapter classNames", e);
            }
            throw new RuntimeException("Failed to populate classNames: " + e);
        }
    }

    /* JADX INFO: renamed from: g */
    private JSONObject m5589g() throws JSONException {
        Map mapM4941a = this.f1969a.m4759B().m4941a((Map) null, false, true);
        mapM4941a.putAll(this.f3557g.m2194c());
        JSONObject jSONObject = new JSONObject(mapM4941a);
        m5586e(jSONObject);
        m5592h(jSONObject);
        m5588f(jSONObject);
        m5583c(jSONObject);
        m5590g(jSONObject);
        m5584d(jSONObject);
        return jSONObject;
    }

    /* JADX INFO: renamed from: g */
    private void m5590g(JSONObject jSONObject) {
        JsonUtils.putObject(jSONObject, "sdk_extra_parameters", new JSONObject(this.f1969a.m4847p0().getExtraParameters()));
    }

    /* JADX INFO: renamed from: h */
    private Map m5591h() {
        HashMap map = new HashMap(4);
        map.put("AppLovin-Ad-Unit-Id", this.f3557g.m2193b());
        map.put("AppLovin-Ad-Format", this.f3557g.m2191a().getLabel());
        Map mapM2195d = this.f3557g.m2195d();
        CollectionUtils.putObjectToStringIfValid("AppLovin-Retry-Attempt", mapM2195d.get("retry_attempt"), map);
        CollectionUtils.putObjectToStringIfValid("AppLovin-Retry-Delay-Sec", mapM2195d.get("retry_delay_sec"), map);
        return map;
    }

    /* JADX INFO: renamed from: h */
    private void m5592h(JSONObject jSONObject) throws JSONException {
        JSONArray jSONArray = this.f3558h;
        if (jSONArray != null) {
            jSONObject.put("signal_data", jSONArray);
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        C1814x5 c1814x5;
        MaxAdFormat maxAdFormatM2191a = this.f3557g.m2191a();
        String strM2193b = this.f3557g.m2193b();
        if (C1768p.m5160a()) {
            this.f1971c.m5171a(this.f1970b, "Fetching next ad for " + maxAdFormatM2191a.getLabel() + " ad unit " + strM2193b);
        }
        AbstractC1618m2.m3176a();
        if (((Boolean) this.f1969a.m4801a(C1831z4.f3858X3)).booleanValue() && AbstractC1701q7.m4116k() && C1768p.m5160a()) {
            this.f1971c.m5171a(this.f1970b, "User is connected to a VPN");
        }
        this.f1969a.m4784R().m2099a(C1548f2.f1536h0, maxAdFormatM2191a, strM2193b, (MaxError) null);
        if (((Boolean) this.f1969a.m4801a(C1831z4.f3795P4)).booleanValue()) {
            C1803w3 c1803w3M4814a0 = this.f1969a.m4814a0();
            C1785u3 c1785u3 = C1785u3.f3406f;
            c1803w3M4814a0.m5525a(c1785u3, C1794v3.m5461a(strM2193b));
            c1803w3M4814a0.m5525a(c1785u3, C1794v3.m5460a(maxAdFormatM2191a));
        }
        AbstractC1701q7.m4048a(this.f1969a, this.f1970b);
        try {
            JSONObject jSONObjectM5589g = m5589g();
            HashMap map = new HashMap();
            if (!((Boolean) this.f1969a.m4801a(C1831z4.f3708E5)).booleanValue() && !((Boolean) this.f1969a.m4801a(C1831z4.f3692C5)).booleanValue()) {
                map.put("rid", UUID.randomUUID().toString());
            }
            if (!((Boolean) this.f1969a.m4801a(C1831z4.f3999n5)).booleanValue()) {
                map.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f1969a.m4839k0());
            }
            if (this.f1969a.m4857u0().m2928c()) {
                map.put("test_mode", "1");
            }
            List listM2927b = this.f1969a.m4857u0().m2927b();
            String str = this.f1969a.m4847p0().getExtraParameters().get("fan");
            if (listM2927b != null && !listM2927b.isEmpty()) {
                String strM43493m = UByte$$ExternalSyntheticBackport0.m43493m((CharSequence) ",", (Iterable) listM2927b);
                map.put("filter_ad_network", strM43493m);
                if (!this.f1969a.m4857u0().m2928c()) {
                    map.put("fhkZsVqYC7", "1");
                }
                if (this.f1969a.m4857u0().m2929d()) {
                    map.put("force_ad_network", strM43493m);
                }
            } else if (StringUtils.isValidString(str)) {
                map.put("filter_ad_network", str);
            }
            c1814x5 = this;
            try {
                a aVar = c1814x5.new a(C1762a.m5013a(this.f1969a).mo5049c("POST").mo5040a(m5591h()).mo5045b(m5587f()).mo5039a(m5585e()).mo5046b(map).mo5041a(jSONObjectM5589g).mo5047b(((Boolean) this.f1969a.m4801a(AbstractC1776t3.f3314B8)).booleanValue()).mo5038a((Object) new JSONObject()).mo5048c(((Long) this.f1969a.m4801a(AbstractC1776t3.f3371u7)).intValue()).mo5036a(((Integer) this.f1969a.m4801a(C1831z4.f3873Z2)).intValue()).mo5044b(((Long) this.f1969a.m4801a(AbstractC1776t3.f3369t7)).intValue()).mo5037a(AbstractC1804w4.a.m5546a(((Integer) this.f1969a.m4801a(C1831z4.f4048t5)).intValue())).m5053f(true).mo5043a(), this.f1969a, strM2193b, maxAdFormatM2191a);
                aVar.m3767c(AbstractC1776t3.f3365r7);
                aVar.m3766b(AbstractC1776t3.f3367s7);
                c1814x5.f1969a.m4853s0().m2603a(aVar);
            } catch (Throwable th) {
                th = th;
                if (C1768p.m5160a()) {
                    c1814x5.f1971c.m5172a(c1814x5.f1970b, "Unable to fetch ad for Ad Unit ID: " + strM2193b, th);
                }
                m5580a("", 0, th.getMessage());
            }
        } catch (Throwable th2) {
            th = th2;
            c1814x5 = this;
        }
    }
}
