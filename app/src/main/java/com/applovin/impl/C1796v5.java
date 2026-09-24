package com.applovin.impl;

import android.app.ActivityManager;
import android.net.Uri;
import android.os.SystemClock;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1749m;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.network.C1762a;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.google.android.gms.security.ProviderInstaller;
import com.ironsource.C11540L6;
import com.ironsource.C11744X3;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import com.vungle.ads.internal.model.Cookie;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.v5 */
/* JADX INFO: loaded from: classes3.dex */
public class C1796v5 extends AbstractRunnableC1601k5 {

    /* JADX INFO: renamed from: j */
    private static final AtomicBoolean f3467j = new AtomicBoolean();

    /* JADX INFO: renamed from: g */
    private final int f3468g;

    /* JADX INFO: renamed from: h */
    private final Object f3469h;

    /* JADX INFO: renamed from: i */
    private b f3470i;

    /* JADX INFO: renamed from: com.applovin.impl.v5$a */
    class a extends AbstractC1673o6 {

        /* JADX INFO: renamed from: n */
        final /* synthetic */ long f3471n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C1762a c1762a, C1748l c1748l, boolean z, long j) {
            super(c1762a, c1748l, z);
            this.f3471n = j;
        }

        @Override // com.applovin.impl.AbstractC1673o6, com.applovin.impl.C1704r0.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo3137a(String str, int i, String str2, JSONObject jSONObject) {
            if (C1768p.m5160a()) {
                this.f1971c.m5174b(this.f1970b, "Unable to fetch basic SDK settings: server returned " + i);
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f3471n;
            C1796v5.this.m5469a(jSONObject != null ? jSONObject : new JSONObject());
            this.f1969a.m4863x0().m2682d(C1548f2.f1538i, C1796v5.this.m5467a(str, jElapsedRealtime, i, jSONObject, str2));
        }

        @Override // com.applovin.impl.AbstractC1673o6, com.applovin.impl.C1704r0.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void mo3139a(String str, JSONObject jSONObject, int i) {
            long jElapsedRealtime = SystemClock.elapsedRealtime() - this.f3471n;
            C1796v5.this.m5469a(jSONObject);
            this.f1969a.m4863x0().m2682d(C1548f2.f1535h, C1796v5.this.m5467a(str, jElapsedRealtime, i, jSONObject, null));
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.v5$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo4868a(JSONObject jSONObject);
    }

    /* JADX INFO: renamed from: com.applovin.impl.v5$c */
    private class c extends AbstractRunnableC1601k5 {
        public c(C1748l c1748l) {
            super("TaskTimeoutFetchBasicSettings", c1748l, true);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C1796v5.this.f3470i != null) {
                if (C1768p.m5160a()) {
                    this.f1971c.m5174b(this.f1970b, "Timing out fetch basic settings...");
                }
                C1796v5.this.m5469a(new JSONObject());
            }
        }
    }

    public C1796v5(int i, C1748l c1748l, b bVar) {
        super("TaskFetchBasicSettings", c1748l, true);
        this.f3469h = new Object();
        this.f3468g = i;
        this.f3470i = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public HashMap m5467a(String str, long j, int i, JSONObject jSONObject, String str2) {
        Uri uriBuild = Uri.parse(str).buildUpon().clearQuery().build();
        JSONObject jSONObject2 = new JSONObject();
        JsonUtils.putString(jSONObject2, C11744X3.j.f26410D, uriBuild.getHost());
        if (jSONObject != null) {
            JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "signal_providers", null);
            JSONArray jSONArray2 = JsonUtils.getJSONArray(jSONObject, "auto_init_adapters", null);
            if (jSONArray != null) {
                JsonUtils.putInt(jSONObject2, "signal_provider_count", jSONArray.length());
            }
            if (jSONArray2 != null) {
                JsonUtils.putInt(jSONObject2, "auto_init_adapter_count", jSONArray2.length());
            }
        }
        HashMap map = new HashMap();
        map.put("attempt_number", Integer.toString(this.f3468g));
        map.put("error_message", str2);
        map.put("url", uriBuild.toString());
        map.put("details", jSONObject2.toString());
        map.put("duration_ms", Long.toString(j));
        map.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, Integer.toString(i));
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m5469a(JSONObject jSONObject) {
        b bVar;
        synchronized (this.f3469h) {
            bVar = this.f3470i;
            this.f3470i = null;
        }
        if (bVar != null) {
            bVar.mo4868a(jSONObject);
        }
    }

    /* JADX INFO: renamed from: b */
    private HashMap m5470b(String str) {
        return m5467a(str, 0L, 0, null, null);
    }

    /* JADX INFO: renamed from: f */
    private String m5471f() {
        return AbstractC1714s0.m4310a((String) this.f1969a.m4801a(C1831z4.f3967k0), "5.0/i", m3084b());
    }

    /* JADX INFO: renamed from: g */
    private String m5472g() {
        return AbstractC1714s0.m4310a((String) this.f1969a.m4801a(C1831z4.f3958j0), "5.0/i", m3084b());
    }

    /* JADX INFO: renamed from: e */
    protected JSONObject m5473e() {
        JSONObject jSONObject = new JSONObject();
        try {
            C1748l c1748l = this.f1969a;
            C1831z4 c1831z4 = C1831z4.f3692C5;
            if (((Boolean) c1748l.m4801a(c1831z4)).booleanValue() || ((Boolean) this.f1969a.m4801a(c1831z4)).booleanValue()) {
                jSONObject.put("rid", UUID.randomUUID().toString());
            }
            jSONObject.put("sdk_version", AppLovinSdk.VERSION);
            JsonUtils.putStringIfValid(jSONObject, "ad_review_sdk_version", C1585j.m2942b());
            jSONObject.put("init_count", this.f3468g);
            jSONObject.put("server_installed_at", this.f1969a.m4801a(C1831z4.f4002o));
            if (this.f1969a.m4765E0()) {
                jSONObject.put("first_install", true);
            }
            if (!this.f1969a.m4760B0()) {
                jSONObject.put("first_install_v2", true);
            }
            JsonUtils.putStringIfValid(jSONObject, "process_name", AbstractC1701q7.m4089c(m3080a()));
            JsonUtils.putBooleanIfValid(jSONObject, "is_main_process", AbstractC1701q7.m4112i(m3080a()));
            JsonUtils.putStringIfValid(jSONObject, "plugin_version", (String) this.f1969a.m4801a(C1831z4.f3794P3));
            JsonUtils.putStringIfValid(jSONObject, "mediation_provider", this.f1969a.m4794X());
            JsonUtils.putStringIfValid(jSONObject, "mediation_provider_v2", this.f1969a.m4762D());
            jSONObject.put("installed_mediation_adapters", AbstractC1821y3.m5704b(this.f1969a));
            Map mapM4933G = this.f1969a.m4759B().m4933G();
            jSONObject.put("package_name", mapM4933G.get("package_name"));
            jSONObject.put("app_version", mapM4933G.get("app_version"));
            jSONObject.put("debug", mapM4933G.get("debug"));
            jSONObject.put("tg", mapM4933G.get("tg"));
            jSONObject.put("target_sdk", mapM4933G.get("target_sdk"));
            jSONObject.put(SDKAnalyticsEvents.PARAMETER_SESSION_ID, mapM4933G.get(SDKAnalyticsEvents.PARAMETER_SESSION_ID));
            List list = (List) mapM4933G.get("application_start_info");
            if (!CollectionUtils.isEmpty(list)) {
                JsonUtils.putJsonArray(jSONObject, "application_start_info", new JSONArray((Collection) list));
            }
            List list2 = (List) mapM4933G.get("application_exit_info");
            if (!CollectionUtils.isEmpty(list2)) {
                JsonUtils.putJsonArray(jSONObject, "application_exit_info", new JSONArray((Collection) list2));
            }
            List<String> adUnitIds = this.f1969a.m4776L() != null ? this.f1969a.m4776L().getAdUnitIds() : null;
            if (adUnitIds != null && adUnitIds.size() > 0) {
                List<String> listRemoveTrimmedEmptyStrings = CollectionUtils.removeTrimmedEmptyStrings(adUnitIds);
                jSONObject.put("ad_unit_ids", CollectionUtils.implode(listRemoveTrimmedEmptyStrings, listRemoveTrimmedEmptyStrings.size()));
            }
            jSONObject.put("IABTCF_TCString", mapM4933G.get("IABTCF_TCString"));
            jSONObject.put(Cookie.IABTCF_GDPR_APPLIES, mapM4933G.get(Cookie.IABTCF_GDPR_APPLIES));
            Object obj = mapM4933G.get("IABTCF_AddtlConsent");
            if (obj instanceof String) {
                JsonUtils.putStringIfValid(jSONObject, "IABTCF_AddtlConsent", (String) obj);
            }
            jSONObject.put("consent_flow_info", this.f1969a.m4864y().m5343b());
            Map mapM4938N = this.f1969a.m4759B().m4938N();
            jSONObject.put(C11540L6.f24917H, mapM4938N.get(C11540L6.f24917H));
            jSONObject.put(C11540L6.f24911F, mapM4938N.get(C11540L6.f24911F));
            jSONObject.put("locale", mapM4938N.get("locale"));
            jSONObject.put("brand", mapM4938N.get("brand"));
            jSONObject.put("brand_name", mapM4938N.get("brand_name"));
            jSONObject.put("hardware", mapM4938N.get("hardware"));
            jSONObject.put(C11540L6.f24899B, mapM4938N.get(C11540L6.f24899B));
            jSONObject.put("revision", mapM4938N.get("revision"));
            jSONObject.put("is_tablet", mapM4938N.get("is_tablet"));
            jSONObject.put("screen_size_in", mapM4938N.get("screen_size_in"));
            jSONObject.put("supported_abis", mapM4938N.get("supported_abis"));
            Object obj2 = mapM4938N.get("video_decoders");
            if (obj2 != null) {
                jSONObject.put("video_decoders", obj2);
            }
            if (((Boolean) this.f1969a.m4801a(C1831z4.f3882a4)).booleanValue()) {
                jSONObject.put("mtl", this.f1969a.m4846o0().getLastTrimMemoryLevel());
            }
            try {
                ActivityManager activityManager = (ActivityManager) C1748l.m4756p().getSystemService("activity");
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                if (activityManager != null) {
                    activityManager.getMemoryInfo(memoryInfo);
                    jSONObject.put("fm", memoryInfo.availMem);
                    jSONObject.put("tm", memoryInfo.totalMem);
                    jSONObject.put("lmt", memoryInfo.threshold);
                    jSONObject.put("lm", memoryInfo.lowMemory);
                }
            } catch (Throwable unused) {
            }
            AbstractC1790v.a aVarM4945f = this.f1969a.m4759B().m4945f();
            jSONObject.put("dnt", aVarM4945f.m5329c());
            jSONObject.put("dnt_code", aVarM4945f.m5328b().m5331b());
            Boolean boolM3959b = AbstractC1694q0.m3955c().m3959b(m3080a());
            if (((Boolean) this.f1969a.m4801a(C1831z4.f3754K3)).booleanValue() && StringUtils.isValidString(aVarM4945f.m5323a()) && !Boolean.TRUE.equals(boolM3959b)) {
                jSONObject.put("idfa", aVarM4945f.m5323a());
            }
            C1749m.b bVarM4934H = this.f1969a.m4759B().m4934H();
            if (((Boolean) this.f1969a.m4801a(C1831z4.f3698D3)).booleanValue() && bVarM4934H != null && !Boolean.TRUE.equals(boolM3959b)) {
                jSONObject.put("idfv", bVarM4934H.f3111a);
                jSONObject.put("idfv_scope", bVarM4934H.f3112b);
            }
            if (((Boolean) this.f1969a.m4801a(C1831z4.f3722G3)).booleanValue()) {
                jSONObject.put("compass_random_token", this.f1969a.m4858v());
            }
            if (((Boolean) this.f1969a.m4801a(C1831z4.f3738I3)).booleanValue()) {
                jSONObject.put("applovin_random_token", this.f1969a.m4837j0());
            }
            if (((Boolean) this.f1969a.m4801a(C1831z4.f3770M3)).booleanValue()) {
                JsonUtils.putStringIfValid(jSONObject, "art", this.f1969a.m4852s());
            }
            JsonUtils.putStringIfValid(jSONObject, "eventid", this.f1969a.m4766F());
            if (this.f1969a.m4857u0().m2928c()) {
                jSONObject.put("test_mode", true);
            }
            List listM2927b = this.f1969a.m4857u0().m2927b();
            if (listM2927b != null && !listM2927b.isEmpty()) {
                jSONObject.put("test_mode_networks", listM2927b);
            }
            jSONObject.put("sdk_extra_parameters", new JSONObject(this.f1969a.m4847p0().getExtraParameters()));
            Map mapM4843m0 = this.f1969a.m4843m0();
            if (!CollectionUtils.isEmpty(mapM4843m0)) {
                jSONObject.put("segments", new JSONObject(mapM4843m0));
            }
        } catch (JSONException e) {
            if (C1768p.m5160a()) {
                this.f1971c.m5172a(this.f1970b, "Failed to create JSON body", e);
            }
            this.f1969a.m4764E().m4329a(this.f1970b, "createJSONBody", e);
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: h */
    protected Map m5474h() {
        HashMap map = new HashMap();
        if (!((Boolean) this.f1969a.m4801a(C1831z4.f3700D5)).booleanValue() && !((Boolean) this.f1969a.m4801a(C1831z4.f3692C5)).booleanValue()) {
            map.put("rid", UUID.randomUUID().toString());
        }
        if (!((Boolean) this.f1969a.m4801a(C1831z4.f3999n5)).booleanValue()) {
            map.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f1969a.m4839k0());
        }
        CollectionUtils.putStringIfValid("connectEventKey", this.f1969a.m4850r(), map);
        Boolean boolM3959b = AbstractC1694q0.m3953b().m3959b(m3080a());
        if (boolM3959b != null) {
            map.put("huc", boolM3959b.toString());
        }
        Boolean boolM3959b2 = AbstractC1694q0.m3955c().m3959b(m3080a());
        if (boolM3959b2 != null) {
            map.put("aru", boolM3959b2.toString());
        }
        Boolean boolM3959b3 = AbstractC1694q0.m3948a().m3959b(m3080a());
        if (boolM3959b3 != null) {
            map.put("dns", boolM3959b3.toString());
        }
        return map;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (!AbstractC1677p0.m3813g() && f3467j.compareAndSet(false, true)) {
            try {
                ProviderInstaller.installIfNeeded(C1748l.m4756p());
            } catch (Throwable th) {
                if (C1768p.m5160a()) {
                    this.f1971c.m5172a(this.f1970b, "Cannot update security provider", th);
                }
            }
        }
        this.f1969a.m4863x0().m2682d(C1548f2.f1532g, m5470b(m5472g()));
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Map mapM5474h = m5474h();
        C1762a.a aVarMo5044b = C1762a.m5013a(this.f1969a).mo5045b(m5472g()).mo5039a(m5471f()).mo5046b(mapM5474h).mo5041a(m5473e()).mo5047b(((Boolean) this.f1969a.m4801a(C1831z4.f3796P5)).booleanValue()).mo5049c("POST").mo5038a((Object) new JSONObject()).mo5036a(((Integer) this.f1969a.m4801a(C1831z4.f3925f3)).intValue()).mo5044b(((Integer) this.f1969a.m4801a(C1831z4.f3952i3)).intValue());
        C1748l c1748l = this.f1969a;
        C1831z4 c1831z4 = C1831z4.f3916e3;
        C1762a c1762aMo5043a = aVarMo5044b.mo5048c(((Integer) c1748l.m4801a(c1831z4)).intValue()).m5052e(((Boolean) this.f1969a.m4801a(C1831z4.f4030r3)).booleanValue()).mo5037a(AbstractC1804w4.a.m5546a(((Integer) this.f1969a.m4801a(C1831z4.f4040s5)).intValue())).m5053f(true).mo5043a();
        this.f1969a.m4853s0().m2605a(new c(this.f1969a), C1552f6.b.TIMEOUT, ((long) ((Integer) this.f1969a.m4801a(c1831z4)).intValue()) + 250);
        a aVar = new a(c1762aMo5043a, this.f1969a, m3087d(), jElapsedRealtime);
        aVar.m3767c(C1831z4.f3958j0);
        aVar.m3766b(C1831z4.f3967k0);
        this.f1969a.m4853s0().m2603a(aVar);
    }
}
