package com.bytedance.sdk.openadsdk.component.p184ka;

import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.p165mj.p166lr.AbstractRunnableC2676ik;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.component.xha.C3087ri;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3332vr;
import com.bytedance.sdk.openadsdk.core.model.C3289ri;
import com.bytedance.sdk.openadsdk.core.model.hcw;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.p236ka.C3414ik;
import com.bytedance.sdk.openadsdk.slm.C3521ka;
import com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr;
import com.bytedance.sdk.openadsdk.slm.p261ri.C3531ka;
import com.bytedance.sdk.openadsdk.slm.p261ri.InterfaceC3530ik;
import com.bytedance.sdk.openadsdk.utils.C3582pv;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.ironsource.C12434q2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.component.ka.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2976ri {
    /* JADX INFO: renamed from: lr */
    public static void m11561lr(wjv wjvVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("openad_creative_type", wjv.m14332fi(wjvVar) ? "video_normal_ad" : "image_normal_ad");
        } catch (JSONException e) {
            C2707ac.m10206ri("TTAppOpenAdReport", "reportCacheLoss json error", e);
        }
        C3414ik.m15511ik(wjvVar, "cache_loss", jSONObject);
    }

    /* JADX INFO: renamed from: lr */
    public static void m11562lr(wjv wjvVar, long j, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("size", wjvVar.m14389eu().m6342fi());
            jSONObject.put("video_duration", wjvVar.m14389eu().m6339di());
            jSONObject.put(C12434q2.f31749u, z ? 1 : 2);
        } catch (JSONException unused) {
        }
        C3414ik.m15546ri(wjvVar, "download_video_duration", j, jSONObject, (JSONObject) null);
    }

    /* JADX INFO: renamed from: ri */
    public static void m11563ri(final int i, final int i2, final hcw hcwVar) {
        C3521ka.m15952ri("openad_load_ad_timeout", false, new InterfaceC3522lr() { // from class: com.bytedance.sdk.openadsdk.component.ka.ri.1
            @Override // com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr
            /* JADX INFO: renamed from: ri */
            public InterfaceC3530ik mo11574ri() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("timeout_type", i);
                jSONObject.put("user_timeout_time", i2);
                hcw hcwVar2 = hcwVar;
                if (hcwVar2 != null) {
                    jSONObject.put("start_type", hcwVar2.m14156qt() == 1);
                    jSONObject.put("load_index", hcwVar.m14156qt());
                }
                jSONObject.put("start_type_backup", C3087ri.m12352ka());
                jSONObject.put("app_running_time", C3087ri.m12353lr());
                return C3531ka.m15967lr().m15985ri("openad_load_ad_timeout").m15980lr(jSONObject.toString());
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public static void m11564ri(final hcw hcwVar, final int i, final int i2) {
        if (hcwVar == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        C3521ka.m15952ri("app_running_time", false, new InterfaceC3522lr() { // from class: com.bytedance.sdk.openadsdk.component.ka.ri.3
            @Override // com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr
            /* JADX INFO: renamed from: ri */
            public InterfaceC3530ik mo11574ri() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("app_running_time", hcwVar.jbs());
                jSONObject.put("loaded_app_running_time", C3087ri.m12353lr());
                jSONObject.put("load_time", hcwVar.m14157ri().m16570ka());
                jSONObject.put("load_from", i);
                jSONObject.put("load_result", i2);
                int iM14156qt = hcwVar.m14156qt();
                jSONObject.put("load_index", iM14156qt);
                if (iM14156qt == 1) {
                    jSONObject.put("init_to_ad_load_time", SystemClock.elapsedRealtime() - C3332vr.f11695ik);
                }
                return C3531ka.m15967lr().m15985ri("app_running_time").m15980lr(jSONObject.toString());
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public static void m11565ri(wjv wjvVar) {
        C3414ik.m15511ik(wjvVar, "cache_expire", (JSONObject) null);
    }

    /* JADX INFO: renamed from: ri */
    public static void m11566ri(wjv wjvVar, int i, int i2, float f) {
        JSONObject jSONObject = new JSONObject();
        try {
            m11573ri(jSONObject, wjvVar);
            jSONObject.put("openad_creative_type", wjv.m14332fi(wjvVar) ? "video_normal_ad" : "image_normal_ad");
            jSONObject.put("total_time", f);
            C3414ik.m15567ri(jSONObject, i2, i);
        } catch (JSONException e) {
            C2707ac.m10206ri("TTAppOpenAdReport", "reportSkip json error", e);
        }
        C3414ik.m15546ri(wjvVar, "skip", i, jSONObject, (JSONObject) null);
    }

    /* JADX INFO: renamed from: ri */
    public static void m11567ri(wjv wjvVar, int i, int i2, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cache_lib", i);
            jSONObject.put("cache_replace", z ? 1 : 0);
            jSONObject.put("cache_refresh_scene", i2);
            if (i2 == 0) {
                jSONObject.put("cache_preload", 0);
            } else {
                jSONObject.put("cache_preload", 1);
            }
            jSONObject.put("aoa_cache_count", C3087ri.m12355mj());
            C3414ik.m15546ri(wjvVar, "cache_refresh", -1L, (JSONObject) null, jSONObject);
        } catch (JSONException e) {
            C2707ac.m10206ri("TTAppOpenAdReport", "reportCacheRefresh json error", e);
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m11568ri(wjv wjvVar, int i, hcw hcwVar) {
        JSONObject jSONObject = new JSONObject();
        long jM14147di = 0;
        try {
            jSONObject.put("openad_creative_type", wjv.m14332fi(wjvVar) ? "video_normal_ad" : "image_normal_ad");
            jSONObject.put("open_ad_cache_type", i);
            if (hcwVar != null) {
                hcwVar.m14154lr(C3582pv.m16567lr());
                m11573ri(jSONObject, wjvVar);
                jSONObject.put("client_start_time", hcwVar.m14151lr());
                jSONObject.put("sever_time", hcwVar.m14150ka());
                jSONObject.put("network_time", hcwVar.m14149ik());
                jSONObject.put("client_end_time", hcwVar.m14148fi());
                jSONObject.put("download_resource_duration", hcwVar.xha());
                jSONObject.put("resource_source", hcwVar.m14155mj());
                jSONObject.put("is_bidding", hcwVar.f11272ri ? 1 : 0);
                if (hcwVar.f11272ri) {
                    jSONObject.put("load_wait_time", hcwVar.f11269lr);
                }
                jM14147di = hcwVar.m14147di();
            }
        } catch (JSONException e) {
            C2707ac.m10206ri("TTAppOpenAdReport", "reportLoadNetDuration json error", e);
        }
        C3414ik.m15546ri(wjvVar, "load_net_duration", jM14147di, jSONObject, (JSONObject) null);
    }

    /* JADX INFO: renamed from: ri */
    public static void m11569ri(wjv wjvVar, long j) {
        JSONObject jSONObject = new JSONObject();
        try {
            m11573ri(jSONObject, wjvVar);
            jSONObject.put("openad_creative_type", wjv.m14332fi(wjvVar) ? "video_normal_ad" : "image_normal_ad");
        } catch (JSONException unused) {
            C2707ac.m10196ik("TTAppOpenAdReport", "reportLoadCacheDuration json error");
        }
        C3414ik.m15546ri(wjvVar, "load_cache_duration", j, jSONObject, (JSONObject) null);
    }

    /* JADX INFO: renamed from: ri */
    public static void m11570ri(wjv wjvVar, long j, float f, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            m11573ri(jSONObject, wjvVar);
            jSONObject.put("openad_creative_type", wjv.m14332fi(wjvVar) ? "video_normal_ad" : "image_normal_ad");
            if (z) {
                double d = f;
                jSONObject.put("video_duration", d);
                jSONObject.put("video_percent", (int) (((j * 1.0d) / 10.0d) / d));
            } else {
                jSONObject.put("image_duration", f);
            }
        } catch (JSONException e) {
            C2707ac.m10206ri("TTAppOpenAdReport", "reportDestroy json error", e);
        }
        C3414ik.m15511ik(wjvVar, "destroy", jSONObject);
    }

    /* JADX INFO: renamed from: ri */
    public static void m11571ri(wjv wjvVar, long j, boolean z) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C12434q2.f31749u, z ? 1 : 2);
        } catch (JSONException unused) {
        }
        C3414ik.m15546ri(wjvVar, "download_image_duration", j, jSONObject, (JSONObject) null);
    }

    /* JADX INFO: renamed from: ri */
    public static void m11572ri(final String str, final int i, final int i2, final boolean z) {
        dzy.m16401lr(new AbstractRunnableC2676ik("opencache") { // from class: com.bytedance.sdk.openadsdk.component.ka.ri.2
            @Override // java.lang.Runnable
            public void run() {
                C3289ri c3289riM14245lr;
                try {
                    if (TextUtils.isEmpty(str)) {
                        return;
                    }
                    JSONObject jSONObject = new JSONObject(str);
                    if (jSONObject.has("cypher")) {
                        jSONObject = C3299nr.m14638ik().mo12637ri(jSONObject);
                    }
                    if (jSONObject == null || !jSONObject.has("creatives") || (c3289riM14245lr = C3289ri.m14245lr(jSONObject)) == null || !c3289riM14245lr.m14249fi()) {
                        return;
                    }
                    C2976ri.m11567ri(c3289riM14245lr.m14248di(), i, i2, z);
                } catch (Throwable unused) {
                }
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000c  */
    /* JADX INFO: renamed from: ri */
    private static void m11573ri(JSONObject jSONObject, wjv wjvVar) {
        int i;
        if (wjvVar != null) {
            try {
                if (wjvVar.ory()) {
                    i = 1;
                } else {
                    i = 0;
                }
            } catch (JSONException e) {
                C2707ac.m10196ik("TTAppOpenAdReport", e.getMessage());
                return;
            }
        } else {
            i = 0;
        }
        jSONObject.put("is_icon_only", i);
    }
}
