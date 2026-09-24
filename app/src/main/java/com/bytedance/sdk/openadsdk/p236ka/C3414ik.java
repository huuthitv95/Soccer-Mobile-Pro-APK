package com.bytedance.sdk.openadsdk.p236ka;

import android.app.Application;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.adjust.sdk.Constants;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.bykv.p028vk.openvk.preload.falconx.loader.ILoader;
import com.bytedance.sdk.component.p165mj.p166lr.AbstractRunnableC2676ik;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.component.utils.jbs;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.bgr.C2901ri;
import com.bytedance.sdk.openadsdk.component.xha.C3087ri;
import com.bytedance.sdk.openadsdk.core.C3089aw;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3332vr;
import com.bytedance.sdk.openadsdk.core.C3365zf;
import com.bytedance.sdk.openadsdk.core.model.C3277co;
import com.bytedance.sdk.openadsdk.core.model.C3279dw;
import com.bytedance.sdk.openadsdk.core.model.C3287oh;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p190aw.p192lr.C3099ik;
import com.bytedance.sdk.openadsdk.core.p200co.p215mj.C3180ri;
import com.bytedance.sdk.openadsdk.core.p223mj.C3270ik;
import com.bytedance.sdk.openadsdk.core.p226sf.C3324ik;
import com.bytedance.sdk.openadsdk.core.p226sf.p227ri.C3328ri;
import com.bytedance.sdk.openadsdk.core.settings.C3322sf;
import com.bytedance.sdk.openadsdk.p175ay.C2896ri;
import com.bytedance.sdk.openadsdk.p236ka.p242lr.InterfaceC3426ri;
import com.bytedance.sdk.openadsdk.p236ka.p243ri.C3435lr;
import com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri;
import com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr;
import com.bytedance.sdk.openadsdk.slm.p261ri.C3532lr;
import com.bytedance.sdk.openadsdk.slm.p261ri.C3533ri;
import com.bytedance.sdk.openadsdk.utils.C3571ig;
import com.bytedance.sdk.openadsdk.utils.C3582pv;
import com.bytedance.sdk.openadsdk.utils.C3583qd;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.dzy;
import com.bytedance.sdk.openadsdk.xha.C3611lr;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ironsource.C11744X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.pgl.ssdk.ces.out.DungeonFlag;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ka.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C3414ik {

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ka.ik$ri */
    public static class ri {
        /* JADX INFO: renamed from: ri */
        public static void m15569ri(final int i, final int i2, final int i3, final int i4, final wjv wjvVar, String str, final int i5) {
            if (str == null || TextUtils.isEmpty(wjvVar.mvf())) {
                return;
            }
            C3414ik.m15532ri(System.currentTimeMillis(), wjvVar, str, "landing_page_resource_detail", new C3527ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.ri.4
                @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
                /* JADX INFO: renamed from: ik */
                public JSONObject mo11121ik() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("next_url", wjvVar.smj());
                        jSONObject.put("channel_name", wjvVar.mvf());
                        jSONObject.put("preload_status", i <= 0 ? 0 : 2);
                        jSONObject.put("first_page", i5);
                        jSONObject.put("preload_h5_type", wjvVar.m14474qd());
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("channel_response", i);
                        jSONObject2.put("failResourceCount", i2);
                        jSONObject2.put("successCount", i3);
                        jSONObject2.put("failCount", i4);
                        jSONObject.put("resource_info", jSONObject2);
                        return jSONObject;
                    } catch (Throwable th) {
                        Log.d("TTAD.AdEvent", "Gecko.localResHitRate error", th);
                        return jSONObject;
                    }
                }
            });
        }

        /* JADX INFO: renamed from: ri */
        public static void m15570ri(final int i, final int i2, wjv wjvVar) {
            String strM16476ri = C3571ig.m16476ri(wjvVar);
            if (strM16476ri == null) {
                return;
            }
            C3414ik.m15532ri(System.currentTimeMillis(), wjvVar, strM16476ri + "_landingpage", "local_res_hit_rate", new C3527ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.ri.2
                @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
                /* JADX INFO: renamed from: ik */
                public JSONObject mo11121ik() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("all_times", i2);
                        jSONObject.put("hit_times", i);
                        return jSONObject;
                    } catch (Throwable th) {
                        Log.d("TTAD.AdEvent", "Gecko.localResHitRate error", th);
                        return jSONObject;
                    }
                }
            });
        }

        /* JADX INFO: renamed from: ri */
        public static void m15571ri(final long j, final wjv wjvVar, String str, final ILoader iLoader, final String str2) {
            if (str == null) {
                return;
            }
            C3414ik.m15532ri(System.currentTimeMillis(), wjvVar, str, "landingpage_init", new C3527ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.ri.3
                @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
                /* JADX INFO: renamed from: ik */
                public JSONObject mo11121ik() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        int iM16747ri = C3611lr.m16744ri().m16747ri(iLoader, str2);
                        jSONObject.put("url", wjvVar.smj());
                        jSONObject.put("channel_name", wjvVar.mvf());
                        jSONObject.put("interceptor_status", (TextUtils.isEmpty(wjvVar.mvf()) || iM16747ri <= 0) ? 0 : 1);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("resource_count", iM16747ri);
                        jSONObject.put("resource_info", jSONObject2);
                        return jSONObject;
                    } catch (Throwable th) {
                        Log.d("TTAD.AdEvent", "Gecko.localResHitRate error", th);
                        return jSONObject;
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
                /* JADX INFO: renamed from: lr */
                public JSONObject mo10797lr() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("duration", j);
                        return jSONObject;
                    } catch (Throwable th) {
                        Log.d("TTAD.AdEvent", "Gecko.localResHitRate error", th);
                        return jSONObject;
                    }
                }

                @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
                /* JADX INFO: renamed from: ri */
                public JSONObject mo10798ri() {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(wjv.f11393lr, wjvVar.evm() ? 1 : 0);
                        return jSONObject;
                    } catch (Throwable unused) {
                        return null;
                    }
                }
            });
        }

        /* JADX INFO: renamed from: ri */
        public static void m15572ri(String str, final JSONObject jSONObject, wjv wjvVar) {
            String strM16476ri = C3571ig.m16476ri(wjvVar);
            if (strM16476ri == null) {
                return;
            }
            C3414ik.m15532ri(System.currentTimeMillis(), wjvVar, strM16476ri + "_landingpage", str, new C3527ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.ri.1
                @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
                /* JADX INFO: renamed from: ik */
                public JSONObject mo11121ik() {
                    return jSONObject;
                }
            });
        }
    }

    /* JADX INFO: renamed from: di */
    public static void m15503di(wjv wjvVar, String str, final JSONObject jSONObject) {
        m15532ri(System.currentTimeMillis(), wjvVar, str, "click_playable_button", new C3527ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.47
            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: ri */
            public JSONObject mo10798ri() {
                return jSONObject;
            }
        });
    }

    /* JADX INFO: renamed from: fi */
    public static void m15504fi(wjv wjvVar, final C3533ri c3533ri, final String str) {
        m15532ri(System.currentTimeMillis(), wjvVar, str, "web_behavior_click", new C3527ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.30
            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: ik */
            public JSONObject mo11121ik() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("arbi_current_url", c3533ri.m16010ik());
                    jSONObject.put("current_url_index", c3533ri.m16014ka());
                    jSONObject.put("arbi_start_x", c3533ri.m16007fi());
                    jSONObject.put("arbi_start_y", c3533ri.m16004di());
                    jSONObject.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_CLICK_DURATION, c3533ri.xha());
                    jSONObject.put("is_trigger_jump", c3533ri.m16021mj());
                    jSONObject.put("click_type", String.valueOf(c3533ri.tan()));
                } catch (Throwable th) {
                    C2707ac.m10197ik("TTAD.AdEvent", "onWebBehaviorClick", th.getMessage());
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: ri */
            public JSONObject mo10798ri() {
                try {
                    C3533ri c3533ri2 = c3533ri;
                    if (c3533ri2 == null || c3533ri2.m16026ri() == -1) {
                        return null;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("hit_type", c3533ri.m16026ri());
                    jSONObject.put("hit_extra", c3533ri.m16017lr());
                    return jSONObject;
                } catch (Throwable unused) {
                    return null;
                }
            }
        });
    }

    /* JADX INFO: renamed from: fi */
    public static void m15505fi(wjv wjvVar, String str, final JSONObject jSONObject) {
        m15532ri(System.currentTimeMillis(), wjvVar, str, "click_next_ad_button", new C3527ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.46
            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: ri */
            public JSONObject mo10798ri() {
                return jSONObject;
            }
        });
    }

    /* JADX INFO: renamed from: ik */
    public static void m15506ik(wjv wjvVar, final C3533ri c3533ri, final String str) {
        m15532ri(System.currentTimeMillis(), wjvVar, str, "web_behavior_stay", new C3527ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.28
            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: ik */
            public JSONObject mo11121ik() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("arbi_current_url", c3533ri.m16010ik());
                    jSONObject.put("current_url_index", c3533ri.m16014ka());
                    jSONObject.put("arbi_stay_duration", c3533ri.bgr());
                    jSONObject.put("browsing_percentage", c3533ri.m16031vr());
                    jSONObject.put("out_focus_scene", c3533ri.slm());
                } catch (Throwable th) {
                    C2707ac.m10197ik("TTAD.AdEvent", "onWebBehaviorStay", th.getMessage());
                }
                return jSONObject;
            }
        });
    }

    /* JADX INFO: renamed from: ik */
    public static void m15507ik(final wjv wjvVar, String str) {
        if (wjvVar == null || !wjv.m14334ik(wjvVar) || wjvVar.m14469pv() == null) {
            return;
        }
        m15532ri(System.currentTimeMillis(), wjvVar, str, CampaignEx.JSON_NATIVE_VIDEO_ENDCARD_SHOW, new C3527ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.25
            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: ik */
            public JSONObject mo11121ik() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.putOpt("url", wjvVar.m14469pv().m13270ik());
                    jSONObject.putOpt("id", wjvVar.m14469pv().m13276ri());
                    jSONObject.putOpt("md5", wjvVar.m14469pv().m13274lr());
                    if (wjvVar.m14389eu() != null) {
                        jSONObject.putOpt("render_type", Integer.valueOf(wjvVar.m14389eu().m6348ka()));
                    }
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    /* JADX INFO: renamed from: ik */
    public static void m15508ik(wjv wjvVar, String str, final int i) {
        if (i == 200) {
            return;
        }
        m15532ri(System.currentTimeMillis(), wjvVar, str, "check_meta_more", new C3527ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.8
            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: ik */
            public JSONObject mo11121ik() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", i);
                    jSONObject.put("check_url", C3322sf.m14819lr().wjv());
                    return jSONObject;
                } catch (Throwable th) {
                    C2707ac.m10197ik(th.toString(), new Object[0]);
                    return jSONObject;
                }
            }
        });
    }

    /* JADX INFO: renamed from: ik */
    public static void m15509ik(wjv wjvVar, String str, final long j) {
        m15532ri(System.currentTimeMillis(), wjvVar, str, "load_feeling_duration", new C3527ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.6
            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: lr */
            public JSONObject mo10797lr() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", j);
                } catch (Throwable th) {
                    C2707ac.m10196ik("TTAD.AdEvent", th.getMessage());
                }
                jSONObject.toString();
                return jSONObject;
            }
        });
    }

    /* JADX INFO: renamed from: ik */
    public static void m15510ik(wjv wjvVar, String str, String str2, final JSONObject jSONObject) {
        if (wjvVar == null || jSONObject == null) {
            return;
        }
        m15532ri(System.currentTimeMillis(), wjvVar, str, str2, new C3527ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.35
            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: ik */
            public JSONObject mo11121ik() {
                return jSONObject;
            }
        });
    }

    /* JADX INFO: renamed from: ik */
    public static void m15511ik(wjv wjvVar, String str, JSONObject jSONObject) {
        if (wjvVar == null) {
            return;
        }
        m15546ri(wjvVar, str, -1L, jSONObject, (JSONObject) null);
    }

    /* JADX INFO: renamed from: ka */
    public static void m15512ka(wjv wjvVar, final C3533ri c3533ri, final String str) {
        m15532ri(System.currentTimeMillis(), wjvVar, str, "web_behavior_scroll", new C3527ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.29
            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: ik */
            public JSONObject mo11121ik() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("arbi_current_url", c3533ri.m16010ik());
                    jSONObject.put("current_url_index", c3533ri.m16014ka());
                    jSONObject.put("trigger_scroll_x", c3533ri.jbs());
                    jSONObject.put("trigger_scroll_y", c3533ri.m16024qt());
                    jSONObject.put("arbi_offset_y", c3533ri.m16030sf());
                    jSONObject.put("scroll_type", c3533ri.m16003co());
                    jSONObject.put("scroll_duration", c3533ri.m16001aw());
                } catch (Throwable th) {
                    C2707ac.m10197ik("TTAD.AdEvent", "onWebBehaviorScroll", th.getMessage());
                }
                return jSONObject;
            }
        });
    }

    /* JADX INFO: renamed from: ka */
    public static void m15513ka(final wjv wjvVar, final String str, final int i) {
        m15532ri(System.currentTimeMillis(), wjvVar, str, "material_status", new C3527ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.13
            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: ri */
            public JSONObject mo10798ri() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("trigger_type", i);
                    jSONObject.put("image_mode", wjvVar.m14552vz());
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    /* JADX INFO: renamed from: ka */
    public static void m15514ka(wjv wjvVar, String str, final JSONObject jSONObject) {
        m15532ri(System.currentTimeMillis(), wjvVar, str, "show_next_ad_hint", new C3527ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.45
            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: ri */
            public JSONObject mo10798ri() {
                return jSONObject;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: lr */
    public static JSONObject m15515lr(wjv wjvVar, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        if (C3279dw.m14092lr(wjvVar) && wjvVar.m14534tp()) {
            try {
                jSONObject.put("is_new_playable", 1);
            } catch (Throwable th) {
                C2707ac.m10197ik(th.getMessage(), new Object[0]);
            }
        }
        m15566ri(jSONObject);
        m15526lr(jSONObject);
        return jSONObject;
    }

    /* JADX INFO: renamed from: lr */
    public static void m15516lr(final long j, final wjv wjvVar, String str, final String str2) {
        m15532ri(System.currentTimeMillis(), wjvVar, str, "endcard_feeling_duraion", new C3527ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.24
            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: ik */
            public JSONObject mo11121ik() {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (wjv.m14334ik(wjvVar)) {
                        if (wjvVar.m14469pv() != null) {
                            jSONObject.putOpt("url", wjvVar.m14469pv().m13270ik());
                            jSONObject.putOpt("id", wjvVar.m14469pv().m13276ri());
                            jSONObject.putOpt("md5", wjvVar.m14469pv().m13274lr());
                        }
                        jSONObject.putOpt(TypedValues.TransitionType.S_FROM, str2);
                        if (wjvVar.m14389eu() != null) {
                            jSONObject.putOpt("render_type", 7);
                            return jSONObject;
                        }
                    } else {
                        jSONObject.put("url", wjvVar.m14389eu().m6338co());
                        jSONObject.put("style_id", wjvVar.m14555xd());
                        if (wjvVar.m14389eu() != null) {
                            jSONObject.putOpt("render_type", 0);
                            return jSONObject;
                        }
                    }
                } catch (Exception e) {
                    C2707ac.m10197ik(e.getMessage(), new Object[0]);
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: lr */
            public JSONObject mo10797lr() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", j);
                    return jSONObject;
                } catch (Exception e) {
                    C2707ac.m10197ik(e.getMessage(), new Object[0]);
                    return jSONObject;
                }
            }
        });
    }

    /* JADX INFO: renamed from: lr */
    public static void m15517lr(wjv wjvVar, final C3533ri c3533ri, final String str) {
        m15532ri(System.currentTimeMillis(), wjvVar, str, "web_behavior_load", new C3527ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.27
            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: ik */
            public JSONObject mo11121ik() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("arbi_current_url", c3533ri.m16010ik());
                    jSONObject.put("current_url_index", c3533ri.m16014ka());
                    jSONObject.put("arbi_load_duration", c3533ri.m16023nr());
                } catch (Throwable th) {
                    C2707ac.m10197ik("TTAD.AdEvent", "onWebBehaviorLoad", th.getMessage());
                }
                return jSONObject;
            }
        });
    }

    /* JADX INFO: renamed from: lr */
    public static void m15518lr(final wjv wjvVar, String str) {
        m15532ri(System.currentTimeMillis(), wjvVar, str, "picture_click", new C3527ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.14
            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: ik */
            public JSONObject mo11121ik() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("ad_slot_type", wjvVar.lji());
                    jSONObject.put("interaction_method", wjvVar.m14567zb());
                    return jSONObject;
                } catch (Throwable th) {
                    C2707ac.m10197ik(th.toString(), new Object[0]);
                    return jSONObject;
                }
            }
        });
    }

    /* JADX INFO: renamed from: lr */
    public static void m15519lr(wjv wjvVar, String str, final int i) {
        m15532ri(System.currentTimeMillis(), wjvVar, str, "check_meta", new C3527ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.7
            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: ik */
            public JSONObject mo11121ik() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("error_code", i);
                    jSONObject.put("check_url", C3322sf.m14819lr().wjv());
                    return jSONObject;
                } catch (Throwable th) {
                    C2707ac.m10197ik(th.toString(), new Object[0]);
                    return jSONObject;
                }
            }
        });
    }

    /* JADX INFO: renamed from: lr */
    public static void m15520lr(wjv wjvVar, String str, int i, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("type", i);
        } catch (JSONException unused) {
        }
        m15522lr(wjvVar, str, "download_app_ad_track", jSONObject);
    }

    /* JADX INFO: renamed from: lr */
    public static void m15521lr(wjv wjvVar, String str, final long j) {
        if (wjvVar != null && j > 0 && j < 200000) {
            m15532ri(System.currentTimeMillis(), wjvVar, str, "video_click_duration", new C3527ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.3
                @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
                /* JADX INFO: renamed from: ik */
                public JSONObject mo11121ik() {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("video_click_duration_time", j);
                    } catch (Throwable unused) {
                    }
                    return jSONObject;
                }
            });
        }
    }

    /* JADX INFO: renamed from: lr */
    public static void m15522lr(wjv wjvVar, String str, String str2, final JSONObject jSONObject) {
        m15532ri(System.currentTimeMillis(), wjvVar, str, str2, new C3527ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.18
            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: ik */
            public JSONObject mo11121ik() {
                return jSONObject;
            }
        });
    }

    /* JADX INFO: renamed from: lr */
    public static void m15523lr(wjv wjvVar, String str, String str2, final JSONObject jSONObject, final long j) {
        if (wjvVar == null || jSONObject == null) {
            return;
        }
        m15532ri(System.currentTimeMillis(), wjvVar, str, str2, new C3527ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.34
            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: ik */
            public JSONObject mo11121ik() {
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: lr */
            public JSONObject mo10797lr() {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("duration", j);
                } catch (Throwable unused) {
                }
                return jSONObject2;
            }
        });
    }

    /* JADX INFO: renamed from: lr */
    public static void m15524lr(wjv wjvVar, String str, final JSONObject jSONObject) {
        m15532ri(System.currentTimeMillis(), wjvVar, str, C3423lr.f12368di, new C3527ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.37
            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: ri */
            public JSONObject mo10798ri() {
                return jSONObject;
            }
        });
    }

    /* JADX INFO: renamed from: lr */
    public static void m15525lr(wjv wjvVar, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        m15556ri(wjvVar, "activity_recreate", str, jSONObject, jSONObject2);
    }

    /* JADX INFO: renamed from: lr */
    private static void m15526lr(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            JSONObject jSONObjectM15615ri = C3427mj.m15615ri();
            if (jSONObjectM15615ri != null) {
                Iterator<String> itKeys = jSONObjectM15615ri.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject.put(next, jSONObjectM15615ri.get(next));
                }
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    public static JSONObject m15527ri(int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ad_show_order", i);
            return jSONObject;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m15529ri() {
        try {
            Class.forName(C3414ik.class.getName());
        } catch (ClassNotFoundException unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m15530ri(final long j, final wjv wjvVar, String str) {
        if (wjvVar == null || !wjv.m14334ik(wjvVar) || wjvVar.m14469pv() == null) {
            return;
        }
        m15532ri(System.currentTimeMillis(), wjvVar, str, "endcard_close", new C3527ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.31
            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: ik */
            public JSONObject mo11121ik() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.putOpt("url", wjvVar.m14469pv().m13270ik());
                    jSONObject.putOpt("id", wjvVar.m14469pv().m13276ri());
                    jSONObject.putOpt("md5", wjvVar.m14469pv().m13274lr());
                    if (wjvVar.m14389eu() != null) {
                        jSONObject.putOpt("render_type", Integer.valueOf(wjvVar.m14389eu().m6348ka()));
                        return jSONObject;
                    }
                } catch (Exception e) {
                    C2707ac.m10197ik(e.getMessage(), new Object[0]);
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: lr */
            public JSONObject mo10797lr() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", j);
                    return jSONObject;
                } catch (Exception e) {
                    C2707ac.m10197ik(e.getMessage(), new Object[0]);
                    return jSONObject;
                }
            }
        });
    }

    @DungeonFlag
    /* JADX INFO: renamed from: ri */
    public static void m15531ri(long j, wjv wjvVar, String str, String str2) {
        m15532ri(j, wjvVar, str, str2, (InterfaceC3526lr) null);
    }

    @DungeonFlag
    /* JADX INFO: renamed from: ri */
    public static void m15532ri(final long j, final wjv wjvVar, final String str, final String str2, final InterfaceC3526lr interfaceC3526lr) {
        if (wjvVar == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || m15568ri(wjvVar.bnj(), str2)) {
            return;
        }
        m15533ri(new AbstractRunnableC2676ik(str2) { // from class: com.bytedance.sdk.openadsdk.ka.ik.21
            @Override // java.lang.Runnable
            public void run() {
                JSONObject jSONObject;
                try {
                    InterfaceC3526lr interfaceC3526lr2 = interfaceC3526lr;
                    if (interfaceC3526lr2 != null) {
                        jSONObject = interfaceC3526lr2.mo10797lr();
                        if (jSONObject == null) {
                            try {
                                jSONObject = new JSONObject();
                            } catch (Exception unused) {
                            }
                        }
                    } else {
                        jSONObject = new JSONObject();
                    }
                    InterfaceC3526lr interfaceC3526lr3 = interfaceC3526lr;
                    if (interfaceC3526lr3 != null) {
                        JSONObject jSONObjectMo10798ri = interfaceC3526lr3.mo10798ri();
                        JSONObject jSONObjectMo11121ik = interfaceC3526lr.mo11121ik();
                        if (jSONObjectMo10798ri != null) {
                            if (jSONObjectMo11121ik == null) {
                                jSONObjectMo11121ik = new JSONObject();
                            }
                            jSONObjectMo11121ik.put("pag_json_data", jSONObjectMo10798ri.toString());
                            jSONObject.put("ad_extra_data", jSONObjectMo11121ik.toString());
                        } else if (jSONObjectMo11121ik != null) {
                            jSONObject.put("ad_extra_data", jSONObjectMo11121ik.toString());
                        }
                    }
                    jSONObject.putOpt("log_extra", wjvVar.yjg());
                    jSONObject.putOpt("ua_policy", Integer.valueOf(wjvVar.m14407hd()));
                } catch (Exception unused2) {
                    jSONObject = null;
                }
                new C3430ri.ri(j, wjvVar).m15651lr(str).m15649ik(str2).m15648fi(wjvVar.m14533tn()).m15652mj(wjvVar.m14392fe()).m15653ri(wjvVar.tyc()).m15654ri(wjvVar.m14358am()).m15655ri(jSONObject).xha(wjvVar.m14424jf()).m15656ri((InterfaceC3426ri) null);
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public static void m15533ri(final AbstractRunnableC2676ik abstractRunnableC2676ik) {
        if (abstractRunnableC2676ik == null) {
            return;
        }
        if (dzy.m16391di()) {
            jbs.m10235ri().post(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.ik.40
                @Override // java.lang.Runnable
                public void run() {
                    dzy.m16402lr(abstractRunnableC2676ik, 10);
                }
            });
        } else if (dzy.xha()) {
            abstractRunnableC2676ik.run();
        } else {
            dzy.m16402lr(abstractRunnableC2676ik, 10);
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m15534ri(wjv wjvVar) {
        if (TextUtils.isEmpty(C3089aw.m12377ri(C3299nr.m14642ri()))) {
            return;
        }
        C3435lr.m15671ri(C2896ri.m11141ri(wjvVar.amj(), true), 1, wjvVar.m14533tn());
    }

    /* JADX INFO: renamed from: ri */
    public static void m15535ri(wjv wjvVar, final C3533ri c3533ri, final String str) {
        m15532ri(System.currentTimeMillis(), wjvVar, str, "web_behavior_keyword", new C3527ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.26
            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: ik */
            public JSONObject mo11121ik() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("arbi_current_url", c3533ri.m16010ik());
                    jSONObject.put("keyword", c3533ri.m16002bu());
                } catch (Throwable th) {
                    C2707ac.m10197ik("TTAD.AdEvent", "onWebBehaviorKeyword", th.getMessage());
                }
                return jSONObject;
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public static void m15536ri(final wjv wjvVar, String str) {
        m15532ri(System.currentTimeMillis(), wjvVar, str, "endcard_load_start", new C3527ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.12
            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: ik */
            public JSONObject mo11121ik() {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (wjv.m14334ik(wjvVar)) {
                        if (wjvVar.m14469pv() != null) {
                            jSONObject.putOpt("url", wjvVar.m14469pv().m13270ik());
                            jSONObject.putOpt("id", wjvVar.m14469pv().m13276ri());
                            jSONObject.putOpt("md5", wjvVar.m14469pv().m13274lr());
                        }
                        if (wjvVar.m14389eu() != null) {
                            jSONObject.putOpt("render_type", 7);
                            return jSONObject;
                        }
                    } else {
                        jSONObject.putOpt("url", wjvVar.m14389eu().m6338co());
                        jSONObject.putOpt("style_id", wjvVar.m14555xd());
                        if (wjvVar.m14389eu() != null) {
                            jSONObject.putOpt("render_type", 0);
                            return jSONObject;
                        }
                    }
                } catch (Exception e) {
                    C2707ac.m10197ik(e.getMessage(), new Object[0]);
                }
                return jSONObject;
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public static void m15537ri(wjv wjvVar, String str, final int i) {
        m15532ri(System.currentTimeMillis(), wjvVar, str, "open_url_h5", new C3527ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.1
            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: ik */
            public JSONObject mo11121ik() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                    jSONObject.putOpt("preload_status", Integer.valueOf(i));
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public static void m15538ri(wjv wjvVar, final String str, final int i, final String str2, final float f) {
        m15532ri(System.currentTimeMillis(), wjvVar, str, C3423lr.f12372lr, new C3527ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.10
            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: ik */
            public JSONObject mo11121ik() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("index", i);
                    jSONObject.put("arbi_current_url", str2);
                    jSONObject.put("arbi_load_duration", f);
                } catch (Throwable th) {
                    C2707ac.m10197ik(th.toString(), new Object[0]);
                }
                return jSONObject;
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public static void m15539ri(wjv wjvVar, String str, final int i, final String str2, final int i2) {
        m15532ri(System.currentTimeMillis(), wjvVar, str, C3423lr.f12373ri, new C3527ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.9
            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: ik */
            public JSONObject mo11121ik() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("index", i);
                    jSONObject.put("arbi_current_url", str2);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: ri */
            public JSONObject mo10798ri() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("new_index", i2);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public static void m15540ri(wjv wjvVar, final String str, final int i, final String str2, final long j, final boolean z, final int i2, final long j2) {
        m15532ri(System.currentTimeMillis(), wjvVar, str, C3423lr.f12371ka, new C3527ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.4
            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: ik */
            public JSONObject mo11121ik() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("invisible_scene", i);
                    jSONObject.put("arbi_current_url", str2);
                    jSONObject.put("loading_visible_time", j);
                    jSONObject.put("arbi_trigger_start", z);
                    jSONObject.put("arbi_convert_count", i2);
                    jSONObject.put("loading_start_timestamp", j2);
                } catch (Throwable th) {
                    C2707ac.m10197ik(th.toString(), new Object[0]);
                }
                return jSONObject;
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public static void m15541ri(wjv wjvVar, final String str, final int i, final String str2, final String str3, final int i2) {
        m15532ri(System.currentTimeMillis(), wjvVar, str, C3423lr.f12370ik, new C3527ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.11
            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: ik */
            public JSONObject mo11121ik() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("index", i);
                    jSONObject.put("arbi_current_url", str2);
                    jSONObject.put(AppLovinWebViewActivity.INTENT_EXTRA_KEY_LOAD_URL, str3);
                    jSONObject.put("url_flag", i2);
                } catch (Throwable th) {
                    C2707ac.m10197ik(th.toString(), new Object[0]);
                }
                return jSONObject;
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public static void m15542ri(wjv wjvVar, String str, int i, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("type", i);
        } catch (JSONException unused) {
        }
        m15522lr(wjvVar, str, "open_ad_land_page_links", jSONObject);
    }

    /* JADX INFO: renamed from: ri */
    public static void m15543ri(final wjv wjvVar, String str, final long j) {
        m15532ri(System.currentTimeMillis(), wjvVar, str, "endcard_load_finish", new C3527ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.23
            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: ik */
            public JSONObject mo11121ik() {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (wjv.m14334ik(wjvVar)) {
                        if (wjvVar.m14469pv() != null) {
                            jSONObject.putOpt("url", wjvVar.m14469pv().m13270ik());
                            jSONObject.putOpt("id", wjvVar.m14469pv().m13276ri());
                            jSONObject.putOpt("md5", wjvVar.m14469pv().m13274lr());
                        }
                        if (wjvVar.m14389eu() != null) {
                            jSONObject.putOpt("render_type", 7);
                            return jSONObject;
                        }
                    } else {
                        jSONObject.putOpt("url", wjvVar.m14389eu().m6338co());
                        jSONObject.putOpt("style_id", wjvVar.m14555xd());
                        if (wjvVar.m14389eu() != null) {
                            jSONObject.putOpt("render_type", 0);
                            return jSONObject;
                        }
                    }
                } catch (Exception e) {
                    C2707ac.m10197ik(e.getMessage(), new Object[0]);
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: lr */
            public JSONObject mo10797lr() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", j);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public static void m15544ri(final wjv wjvVar, String str, final long j, final int i, final int i2) {
        m15532ri(System.currentTimeMillis(), wjvVar, str, "load", new C3527ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.44
            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: ik */
            public JSONObject mo11121ik() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                    jSONObject.putOpt("interaction_method", Integer.valueOf(wjvVar.m14567zb()));
                    jSONObject.put("first_page", i2);
                    jSONObject.put("preload_h5_type", wjvVar.m14474qd());
                    int i3 = i;
                    if (i3 >= 0) {
                        jSONObject.putOpt("preload_status", Integer.valueOf(i3));
                    }
                } catch (Exception unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: lr */
            public JSONObject mo10797lr() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", Math.min(j, 600000L));
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public static void m15545ri(final wjv wjvVar, String str, final long j, final int i, final String str2, final String str3) {
        m15532ri(System.currentTimeMillis(), wjvVar, str, "endcard_load_fail", new C3527ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.33
            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: ik */
            public JSONObject mo11121ik() {
                JSONObject jSONObject = new JSONObject();
                try {
                    if (wjv.m14334ik(wjvVar)) {
                        if (wjvVar.m14469pv() != null) {
                            jSONObject.putOpt("url", wjvVar.m14469pv().m13270ik());
                            jSONObject.putOpt("id", wjvVar.m14469pv().m13276ri());
                            jSONObject.putOpt("md5", wjvVar.m14469pv().m13274lr());
                        }
                        if (wjvVar.m14389eu() != null) {
                            jSONObject.putOpt("render_type", 7);
                        }
                    } else {
                        jSONObject.putOpt("url", wjvVar.m14389eu().m6338co());
                        jSONObject.putOpt("style_id", wjvVar.m14555xd());
                        if (!TextUtils.isEmpty(str3)) {
                            jSONObject.putOpt("error_url", str3);
                        }
                        if (wjvVar.m14389eu() != null) {
                            jSONObject.putOpt("render_type", 0);
                        }
                    }
                    jSONObject.put("error_code", i);
                    jSONObject.put("error_msg", str2);
                    return jSONObject;
                } catch (Exception e) {
                    C2707ac.m10197ik(e.getMessage(), new Object[0]);
                    return jSONObject;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: lr */
            public JSONObject mo10797lr() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", j);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public static void m15546ri(final wjv wjvVar, String str, final long j, final JSONObject jSONObject, final JSONObject jSONObject2) {
        m15532ri(System.currentTimeMillis(), wjvVar, "open_ad", str, new C3527ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.39
            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: ik */
            public JSONObject mo11121ik() {
                try {
                    JSONObject jSONObject3 = jSONObject;
                    return jSONObject3 != null ? jSONObject3 : new JSONObject();
                } catch (Exception unused) {
                    return null;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: lr */
            public JSONObject mo10797lr() {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    long j2 = j;
                    if (j2 != -1) {
                        jSONObject3.put("duration", j2);
                        return jSONObject3;
                    }
                } catch (Exception e) {
                    C2707ac.m10196ik("TTAD.AdEvent", e.getMessage());
                }
                return jSONObject3;
            }

            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: ri */
            public JSONObject mo10798ri() {
                JSONObject jSONObject3 = jSONObject2;
                if (jSONObject3 == null) {
                    jSONObject3 = new JSONObject();
                }
                try {
                    wjv wjvVar2 = wjvVar;
                    if (wjvVar2 != null) {
                        int iM14479qt = wjvVar2.m14479qt();
                        jSONObject3.putOpt("start_type", Integer.valueOf(iM14479qt == 1 ? 1 : 2));
                        jSONObject3.putOpt("load_index", Integer.valueOf(iM14479qt));
                        if (iM14479qt == 1) {
                            jSONObject3.putOpt("init_to_ad_load_time", Long.valueOf(SystemClock.elapsedRealtime() - C3332vr.f11695ik));
                        }
                    }
                    jSONObject3.putOpt("start_type_backup", Integer.valueOf(C3087ri.m12352ka()));
                    jSONObject3.putOpt("app_running_time", Long.valueOf(C3087ri.m12353lr()));
                    return jSONObject3;
                } catch (Exception e) {
                    e.getMessage();
                    return jSONObject3;
                }
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public static void m15547ri(wjv wjvVar, String str, final long j, final boolean z) {
        m15532ri(System.currentTimeMillis(), wjvVar, str, "lp_loading", new C3527ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.5
            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: ik */
            public JSONObject mo11121ik() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("if_lp_loading_success", z ? 1 : 2);
                    return jSONObject;
                } catch (Throwable th) {
                    C2707ac.m10197ik(th.toString(), new Object[0]);
                    return jSONObject;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: lr */
            public JSONObject mo10797lr() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", j);
                    return jSONObject;
                } catch (Throwable th) {
                    C2707ac.m10197ik(th.toString(), new Object[0]);
                    return jSONObject;
                }
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public static void m15548ri(final wjv wjvVar, final String str, final C3582pv c3582pv) {
        if (wjvVar == null) {
            return;
        }
        final long jM16570ka = c3582pv.m16570ka();
        m15532ri(System.currentTimeMillis(), wjvVar, str, "stay_duration", new C3527ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.2
            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: ik */
            public JSONObject mo11121ik() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("click_stay_time", jM16570ka);
                    jSONObject.put("click_time", c3582pv.f13204ri);
                    if (str.equals("open_ad")) {
                        jSONObject.put("is_icon_only", wjvVar.ory() ? 1 : 0);
                    }
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public static void m15549ri(wjv wjvVar, String str, final String str2, final int i) {
        m15532ri(System.currentTimeMillis(), wjvVar, str, "playable_track", new C3527ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.22
            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: ik */
            public JSONObject mo11121ik() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("playable_event", str2);
                } catch (Exception unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: ri */
            public JSONObject mo10798ri() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("is_new_playable", 1);
                    jSONObject.put("is_pre_render", i);
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public static void m15550ri(wjv wjvVar, String str, final String str2, final long j, final int i, JSONObject jSONObject, final xha xhaVar) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        final JSONObject jSONObject2 = jSONObject;
        m15532ri(System.currentTimeMillis(), wjvVar, str, str2, new C3527ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.17
            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: ik */
            public JSONObject mo11121ik() {
                xha xhaVar2;
                try {
                    if (("feed_break".equals(str2) || "feed_over".equals(str2)) && (xhaVar2 = xhaVar) != null) {
                        xhaVar2.m15722ri(jSONObject2);
                    }
                    return jSONObject2;
                } catch (Throwable unused) {
                    return null;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: lr */
            public JSONObject mo10797lr() {
                JSONObject jSONObject3 = new JSONObject();
                try {
                    jSONObject3.put("duration", j);
                    jSONObject3.put("percent", i);
                } catch (Throwable unused) {
                }
                return jSONObject3;
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public static void m15551ri(wjv wjvVar, String str, String str2, final long j, final JSONObject jSONObject) {
        if (wjvVar == null || jSONObject == null) {
            return;
        }
        m15532ri(System.currentTimeMillis(), wjvVar, str, str2, new C3527ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.32
            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: ik */
            public JSONObject mo11121ik() {
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: lr */
            public JSONObject mo10797lr() {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("duration", j);
                    return jSONObject2;
                } catch (Exception e) {
                    C2707ac.m10196ik("TTAD.AdEvent", e.getMessage());
                    return jSONObject2;
                }
            }
        });
    }

    @DungeonFlag
    /* JADX INFO: renamed from: ri */
    public static void m15552ri(final wjv wjvVar, final String str, final String str2, final String str3, final long j, final long j2, final JSONObject jSONObject, final boolean z) {
        if (wjvVar == null || m15568ri(wjvVar.bnj(), str3)) {
            return;
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        m15533ri(new AbstractRunnableC2676ik("sendJsAdEvent") { // from class: com.bytedance.sdk.openadsdk.ka.ik.38
            @Override // java.lang.Runnable
            public void run() {
                JSONArray jSONArrayOptJSONArray;
                String strTyc = wjvVar.tyc();
                if (jSONObject != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        String strOptString = jSONObject.optString("ad_extra_data");
                        if (!TextUtils.isEmpty(strOptString)) {
                            jSONObject2 = new JSONObject(strOptString);
                        }
                        if (!"click".equals(str3)) {
                            jSONObject2.put(C11744X3.i.f26328G, DeviceUtils.xha(C3299nr.m14642ri()).toString());
                        }
                        if ("click".equals(str3)) {
                            if (z) {
                                jSONObject2.put("click_scence", 1);
                            } else if (C3279dw.m14092lr(wjvVar)) {
                                jSONObject2.put("click_scence", 3);
                            }
                        }
                        if (wjvVar.m14534tp()) {
                            try {
                                JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("pag_json_data");
                                if (jSONObjectOptJSONObject == null) {
                                    jSONObjectOptJSONObject = new JSONObject();
                                }
                                jSONObjectOptJSONObject.put("is_new_playable", 1);
                                if (wjvVar.m14450mm()) {
                                    jSONObjectOptJSONObject.put("is_pre_render", 1);
                                }
                                jSONObject2.put("pag_json_data", jSONObjectOptJSONObject.toString());
                            } catch (Throwable unused) {
                            }
                        }
                        int i = 0;
                        if (C2901ri.m11164ik(wjvVar)) {
                            JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("pag_json_data");
                            if (jSONObjectOptJSONObject2 == null) {
                                jSONObjectOptJSONObject2 = new JSONObject();
                            }
                            jSONObjectOptJSONObject2.put("is_lp_pre_render", wjvVar.m14554wm() ? 1 : 0);
                            jSONObject2.put("pag_json_data", jSONObjectOptJSONObject2.toString());
                        }
                        jSONObject.put("ad_extra_data", jSONObject2.toString());
                        jSONObject.put(ViewHierarchyConstants.TAG_KEY, str2);
                        int iOptInt = jSONObject2.optInt("agg_request_type", -1);
                        if (z && iOptInt == 2) {
                            strTyc = jSONObject2.optString("app_log_url");
                        }
                        if ("click".equals(str3)) {
                            C3365zf.m15146ik(wjvVar);
                            float fFloatValue = Double.valueOf((System.currentTimeMillis() / 1000) - wjv.m14337lr(jSONObject.optString("log_extra"))).floatValue();
                            JSONObject jSONObject3 = jSONObject;
                            if (fFloatValue <= 0.0f) {
                                fFloatValue = 0.0f;
                            }
                            jSONObject3.putOpt("show_time", Float.valueOf(fFloatValue));
                            if (!TextUtils.isEmpty(C3089aw.m12377ri(C3299nr.m14642ri()))) {
                                if (z && iOptInt == 2) {
                                    JSONArray jSONArrayOptJSONArray2 = jSONObject2.optJSONArray("click_tracking_url");
                                    if (jSONArrayOptJSONArray2 != null) {
                                        ArrayList arrayList = new ArrayList();
                                        while (i < jSONArrayOptJSONArray2.length()) {
                                            arrayList.add(jSONArrayOptJSONArray2.optString(i));
                                            i++;
                                        }
                                        C3435lr.m15671ri(C2896ri.m11141ri(arrayList, true), 2, String.valueOf(j));
                                    }
                                } else {
                                    wjv wjvVar2 = wjvVar;
                                    if (wjvVar2 != null) {
                                        C3435lr.m15671ri(C2896ri.m11141ri(wjvVar2.bfa(), true), 2, wjvVar.m14533tn());
                                    }
                                }
                            }
                        } else if ("show".equals(str3) && !TextUtils.isEmpty(C3089aw.m12377ri(C3299nr.m14642ri())) && z && iOptInt == 2 && (jSONArrayOptJSONArray = jSONObject2.optJSONArray("show_tracking_url")) != null) {
                            ArrayList arrayList2 = new ArrayList();
                            while (i < jSONArrayOptJSONArray.length()) {
                                arrayList2.add(jSONArrayOptJSONArray.optString(i));
                                i++;
                            }
                            C3435lr.m15671ri(C2896ri.m11141ri(arrayList2, true), 1, String.valueOf(j));
                        }
                    } catch (Exception unused2) {
                    }
                }
                new C3430ri.ri(jCurrentTimeMillis, wjvVar).m15650ka(str).m15651lr(str2).m15649ik(str3).m15648fi(String.valueOf(j)).m15647di(String.valueOf(j2)).m15653ri(strTyc).m15654ri(wjvVar.m14358am()).m15655ri(jSONObject).m15652mj(wjvVar.m14392fe()).xha(wjvVar.m14424jf()).m15656ri((InterfaceC3426ri) null);
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public static void m15553ri(final wjv wjvVar, String str, String str2, final Map<String, Object> map) {
        m15532ri(System.currentTimeMillis(), wjvVar, str, str2, new C3527ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.20
            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: ik */
            public JSONObject mo11121ik() {
                JSONObject jSONObject = new JSONObject();
                try {
                    Map map2 = map;
                    if (map2 != null) {
                        for (Map.Entry entry : map2.entrySet()) {
                            jSONObject.put((String) entry.getKey(), entry.getValue());
                        }
                    }
                    jSONObject.put("dp_creative_type", wjvVar.m14565yv());
                } catch (Exception unused) {
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: lr */
            public JSONObject mo10797lr() {
                JSONObject jSONObject = new JSONObject();
                try {
                    Map map2 = map;
                    if (map2 != null) {
                        Object obj = map2.get("duration");
                        if (obj instanceof Long) {
                            jSONObject.put("duration", obj);
                        }
                    }
                } catch (Exception unused) {
                }
                return jSONObject;
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public static void m15554ri(wjv wjvVar, String str, String str2, final JSONObject jSONObject) {
        m15532ri(System.currentTimeMillis(), wjvVar, str, str2, new C3527ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.16
            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: ik */
            public JSONObject mo11121ik() {
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: lr */
            public JSONObject mo10797lr() {
                if (jSONObject == null) {
                    return null;
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    if (jSONObject.has("duration")) {
                        jSONObject2.put("duration", jSONObject.get("duration"));
                        return jSONObject2;
                    }
                } catch (Exception e) {
                    C2707ac.m10196ik("TTAD.AdEvent", e.getMessage());
                }
                return jSONObject2;
            }
        });
        if ("click".equals(str2)) {
            C3365zf.m15146ik(wjvVar);
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m15555ri(wjv wjvVar, String str, String str2, final JSONObject jSONObject, final long j) {
        m15532ri(System.currentTimeMillis(), wjvVar, str, str2, new C3527ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.19
            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: ik */
            public JSONObject mo11121ik() {
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: lr */
            public JSONObject mo10797lr() {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("duration", j);
                } catch (Exception unused) {
                }
                return jSONObject2;
            }
        });
    }

    @DungeonFlag
    /* JADX INFO: renamed from: ri */
    private static void m15556ri(final wjv wjvVar, final String str, final String str2, final JSONObject jSONObject, final JSONObject jSONObject2) {
        if (wjvVar == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (wjvVar.feb() && "show".equals(str)) {
            return;
        }
        if ("show".equals(str)) {
            wjvVar.m14482qt(true);
        }
        final long jCurrentTimeMillis = System.currentTimeMillis();
        m15533ri(new AbstractRunnableC2676ik("onShow") { // from class: com.bytedance.sdk.openadsdk.ka.ik.49
            @Override // java.lang.Runnable
            public void run() {
                final String strM14958ri;
                if (C3299nr.m14639ka().tan()) {
                    strM14958ri = C3328ri.m14957ri((Application) C3299nr.m14642ri()).m14958ri(str2, DeviceUtils.m16341ri(), wjvVar.m14545ur());
                } else {
                    strM14958ri = "none";
                }
                C3414ik.m15532ri(jCurrentTimeMillis, wjvVar, str2, str, new C3527ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.49.1
                    @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
                    /* JADX INFO: renamed from: ik */
                    public JSONObject mo11121ik() {
                        try {
                            if (jSONObject != null) {
                                jSONObject.put("interaction_method", wjvVar.m14567zb());
                                jSONObject.put("real_interaction_method", wjvVar.m14453nd());
                                jSONObject.put("video_skip_result", C3299nr.m14639ka().m14829aw(String.valueOf(wjvVar.m14545ur())));
                                jSONObject.put("au_show", strM14958ri);
                                return jSONObject;
                            }
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("interaction_method", wjvVar.m14567zb());
                            jSONObject3.put("real_interaction_method", wjvVar.m14453nd());
                            jSONObject3.put("video_skip_result", C3299nr.m14639ka().m14829aw(String.valueOf(wjvVar.m14545ur())));
                            jSONObject3.put("au_show", strM14958ri);
                            return jSONObject3;
                        } catch (Throwable unused) {
                            return null;
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
                    /* JADX INFO: renamed from: lr */
                    public JSONObject mo10797lr() {
                        Object obj;
                        try {
                            C3365zf.m15147lr(wjvVar);
                            JSONObject jSONObject3 = new JSONObject();
                            try {
                                jSONObject3.putOpt("log_extra", wjvVar.yjg());
                                float fFloatValue = Double.valueOf((System.currentTimeMillis() / 1000) - wjvVar.jfv()).floatValue();
                                if (fFloatValue <= 0.0f) {
                                    fFloatValue = 0.0f;
                                }
                                jSONObject3.putOpt("show_time", Float.valueOf(fFloatValue));
                                long jElapsedRealtime = SystemClock.elapsedRealtime() - wjvVar.jbs();
                                if (jElapsedRealtime > 0) {
                                    jSONObject3.put("duration", jElapsedRealtime);
                                }
                                jSONObject3.putOpt("ua_policy", Integer.valueOf(wjvVar.m14407hd()));
                                String strM14410id = wjvVar.m14410id();
                                if (!TextUtils.isEmpty(strM14410id) && !TextUtils.isEmpty(strM14410id)) {
                                    try {
                                        jSONObject3.put("ttdsp_price", Math.round(Float.parseFloat(strM14410id) * 100000.0f));
                                    } catch (Throwable th) {
                                        jSONObject3.put("ttdsp_price", 0);
                                        C2707ac.m10196ik("TTAD.AdEvent", th.getMessage());
                                    }
                                }
                                if (wjvVar.iyl() == null) {
                                    return jSONObject3;
                                }
                                try {
                                    Object obj2 = wjvVar.iyl().get(TTAdConstant.SDK_BIDDING_TYPE);
                                    if (obj2 == null || Integer.parseInt(obj2.toString()) != 2 || (obj = wjvVar.iyl().get("price")) == null) {
                                        return jSONObject3;
                                    }
                                    jSONObject3.put("ttdsp_price", Math.round(Double.parseDouble(obj.toString()) * 100000.0d));
                                    return jSONObject3;
                                } catch (Throwable th2) {
                                    C2707ac.m10206ri("TTAD.AdEvent", "client bidding price error: ", th2);
                                    return jSONObject3;
                                }
                                return jSONObject3;
                            } catch (Exception unused) {
                                return jSONObject3;
                            }
                        } catch (Exception unused2) {
                            return null;
                        }
                    }

                    @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
                    /* JADX INFO: renamed from: ri */
                    public JSONObject mo10798ri() {
                        return jSONObject2 == null ? C3414ik.m15515lr(wjvVar, new JSONObject()) : C3414ik.m15515lr(wjvVar, jSONObject2);
                    }
                });
                if ("show".equals(str)) {
                    if (!wjvVar.udw()) {
                        if (wjvVar.vgs()) {
                            C3099ik.m12502ri(wjvVar.amj(), new C3099ik.lr("show_urls", wjvVar));
                        } else {
                            C3414ik.m15534ri(wjvVar);
                        }
                    }
                    JSONObject jSONObject3 = jSONObject;
                    if (jSONObject3 != null) {
                        int iOptInt = jSONObject3.optInt("dynamic_show_type");
                        if (wjvVar.m14434kt() == 1 && (iOptInt == 7 || iOptInt == 10)) {
                            jbs.m10235ri().postDelayed(new Runnable() { // from class: com.bytedance.sdk.openadsdk.ka.ik.49.2
                                @Override // java.lang.Runnable
                                public void run() {
                                    JSONObject jSONObject4 = new JSONObject();
                                    try {
                                        jSONObject4.put("auto_click", true);
                                        C3414ik.m15522lr(wjvVar, str2, "click", jSONObject4);
                                    } catch (Exception unused) {
                                        C2707ac.m10196ik("TTAD.AdEvent", "ugen click exception");
                                    }
                                }
                            }, C3322sf.m14819lr().iph());
                        }
                    }
                    C3324ik.m14917ri(wjvVar, strM14958ri);
                }
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public static void m15557ri(wjv wjvVar, String str, final JSONObject jSONObject) {
        m15532ri(System.currentTimeMillis(), wjvVar, str, C3423lr.f12369fi, new C3527ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.36
            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: ri */
            public JSONObject mo10798ri() {
                return jSONObject;
            }
        });
    }

    @DungeonFlag
    /* JADX INFO: renamed from: ri */
    public static void m15558ri(wjv wjvVar, String str, JSONObject jSONObject, JSONObject jSONObject2) {
        m15556ri(wjvVar, "show", str, jSONObject, jSONObject2);
    }

    /* JADX INFO: renamed from: ri */
    public static void m15559ri(wjv wjvVar, String str, final boolean z, final boolean z2, final boolean z3, final boolean z4, final int i, final Map<String, Object> map) {
        m15532ri(System.currentTimeMillis(), wjvVar, str, "start_show_plb", new C3527ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.42
            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: ik */
            public JSONObject mo11121ik() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("isSkip", z);
                    jSONObject.put("force", z2);
                    jSONObject.put("isFromLandingPage", z3);
                    jSONObject.put("finishing", z4);
                    jSONObject.put(TypedValues.TransitionType.S_FROM, i);
                    Map map2 = map;
                    if (map2 != null) {
                        for (Map.Entry entry : map2.entrySet()) {
                            jSONObject.put((String) entry.getKey(), entry.getValue());
                        }
                    }
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public static void m15560ri(final wjv wjvVar, final boolean z, String str, final String str2, final long j, final String str3, final String str4, final int i, final String str5) {
        if (TextUtils.isEmpty(str4)) {
            return;
        }
        m15532ri(System.currentTimeMillis(), wjvVar, str, "load_ugen_template", new C3527ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.43
            /* JADX WARN: Code duplicated, block: B:19:0x003e  */
            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: ik */
            public JSONObject mo11121ik() {
                byte b;
                C3287oh c3287ohM14575zv;
                JSONObject jSONObject = new JSONObject();
                try {
                    String str6 = str4;
                    int iHashCode = str6.hashCode();
                    if (iHashCode != -1606803861) {
                        if (iHashCode != 3107) {
                            if (iHashCode == 2989536 && str6.equals("adv3")) {
                                b = 2;
                            } else {
                                b = -1;
                            }
                        } else if (str6.equals("ad")) {
                            b = 1;
                        } else {
                            b = -1;
                        }
                    } else if (str6.equals(CampaignEx.JSON_NATIVE_VIDEO_ENDCARD)) {
                        b = 0;
                    } else {
                        b = -1;
                    }
                    if (b != 0) {
                        if (b == 1) {
                            wjv.C3296ri c3296riSez = wjvVar.sez();
                            if (c3296riSez != null) {
                                jSONObject.putOpt("url", c3296riSez.m14579aw());
                                jSONObject.putOpt("id", c3296riSez.m14589ka());
                                jSONObject.putOpt("md5", c3296riSez.bgr());
                            }
                        } else if (b == 2 && (c3287ohM14575zv = wjvVar.m14575zv()) != null) {
                            jSONObject.putOpt("url", c3287ohM14575zv.m14227ik());
                            jSONObject.putOpt("id", c3287ohM14575zv.m14230ri());
                            jSONObject.putOpt("md5", c3287ohM14575zv.m14229lr());
                        }
                    } else if (z) {
                        C3180ri c3180riM14411ig = wjvVar.m14411ig();
                        if (c3180riM14411ig != null) {
                            jSONObject.putOpt("url", c3180riM14411ig.m13270ik());
                            jSONObject.putOpt("id", c3180riM14411ig.m13276ri());
                            jSONObject.putOpt("md5", c3180riM14411ig.m13274lr());
                        }
                    } else {
                        C3180ri c3180riM14469pv = wjvVar.m14469pv();
                        if (c3180riM14469pv != null) {
                            jSONObject.putOpt("url", c3180riM14469pv.m13270ik());
                            jSONObject.putOpt("id", c3180riM14469pv.m13276ri());
                            jSONObject.putOpt("md5", c3180riM14469pv.m13274lr());
                        }
                    }
                    jSONObject.put("ugen_status", str2);
                    jSONObject.put(TypedValues.TransitionType.S_FROM, str3);
                    jSONObject.put("ugen_scene", str4);
                    if (C11744X3.g.f26257e.equals(str2)) {
                        jSONObject.put("error_code", i);
                        jSONObject.put("error_msg", str5);
                        return jSONObject;
                    }
                } catch (Throwable th) {
                    try {
                        jSONObject.put("error_code", Sdk.SDKError.Reason.OMSDK_JS_WRITE_FAILED_VALUE);
                        jSONObject.put("error_msg", "send template error " + th.getMessage());
                    } catch (Throwable unused) {
                    }
                }
                return jSONObject;
            }

            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: lr */
            public JSONObject mo10797lr() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", j);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public static void m15561ri(final C3532lr c3532lr) {
        if (c3532lr == null || c3532lr.m15992lr() == null) {
            return;
        }
        final wjv wjvVarM15992lr = c3532lr.m15992lr();
        final int iAdz = wjvVarM15992lr.adz();
        if (iAdz == 2 || iAdz == 8 || (C3571ig.m16453ka(wjvVarM15992lr) && C3423lr.ri.f12378ka.equals(c3532lr.m15996ri()))) {
            m15532ri(System.currentTimeMillis(), wjvVarM15992lr, c3532lr.m15989ik(), "open_browser", new C3527ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.41
                @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
                /* JADX INFO: renamed from: ik */
                public JSONObject mo11121ik() {
                    JSONArray jSONArrayOptJSONArray;
                    JSONObject jSONObject = new JSONObject();
                    try {
                        int iM15991ka = c3532lr.m15991ka();
                        jSONObject.put("count", C3571ig.m16466qt(C3299nr.m14642ri()));
                        jSONObject.put("interceptor", iM15991ka);
                        jSONObject.put("success", c3532lr.m15988fi());
                        jSONObject.put("link", c3532lr.m15996ri());
                        jSONObject.put("interaction_type", iAdz);
                        jSONObject.put("real_interaction_type", c3532lr.xha());
                        if (c3532lr.m15991ka() == 9) {
                            jSONObject.put("is_act_signals_api_available", c3532lr.m15995mj());
                            jSONObject.put("is_act_signals_callback", c3532lr.jbs());
                        }
                        if (!TextUtils.isEmpty(c3532lr.m15987di())) {
                            jSONObject.put("exception_msg", c3532lr.m15987di());
                        }
                        if (iM15991ka == 2 || iM15991ka == 5) {
                            String strM14536tt = wjvVarM15992lr.m14536tt();
                            if (!TextUtils.isEmpty(strM14536tt) && (jSONArrayOptJSONArray = new JSONObject(strM14536tt).optJSONArray("creatives")) != null && jSONArrayOptJSONArray.length() > 0) {
                                jSONObject.put(Constants.REFERRER_API_META, jSONArrayOptJSONArray.optJSONObject(wjvVarM15992lr.m14414ik()));
                                return jSONObject;
                            }
                        }
                    } catch (Throwable th) {
                        C2707ac.m10196ik("TTAD.AdEvent", th.getMessage());
                    }
                    return jSONObject;
                }
            });
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m15562ri(String str, long j) {
        C3270ik.m13931ri(str, j);
    }

    @DungeonFlag
    /* JADX INFO: renamed from: ri */
    public static void m15563ri(final String str, final wjv wjvVar, final C3277co c3277co, final String str2, final boolean z, final Map<String, Object> map, final int i) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        m15533ri(new AbstractRunnableC2676ik("onClick") { // from class: com.bytedance.sdk.openadsdk.ka.ik.15
            @Override // java.lang.Runnable
            public void run() {
                wjv wjvVar2 = wjvVar;
                if (wjvVar2 == null) {
                    return;
                }
                C3414ik.m15532ri(jCurrentTimeMillis, wjvVar2, str2, str, new C3527ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.15.1
                    @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
                    /* JADX INFO: renamed from: lr */
                    public JSONObject mo10797lr() {
                        JSONObject jSONObject = new JSONObject();
                        try {
                            if (c3277co != null) {
                                JSONObject jSONObjectM14032ri = c3277co.m14032ri();
                                jSONObjectM14032ri.put("is_valid", z);
                                if (i > 0 && i <= 2) {
                                    jSONObjectM14032ri.put("user_behavior_type", i);
                                }
                                if (map != null) {
                                    if (map.containsKey("duration")) {
                                        jSONObject.put("duration", map.get("duration"));
                                    }
                                    for (Map.Entry entry : map.entrySet()) {
                                        if (!"duration".equals(entry.getKey())) {
                                            jSONObjectM14032ri.put((String) entry.getKey(), entry.getValue());
                                        }
                                    }
                                }
                                jSONObjectM14032ri.put("interaction_method", wjvVar.m14567zb());
                                if (str2.equals("open_ad")) {
                                    jSONObjectM14032ri.put("is_icon_only", wjvVar.ory() ? 1 : 0);
                                }
                                jSONObject.put("ad_extra_data", jSONObjectM14032ri.toString());
                            }
                            jSONObject.putOpt("log_extra", wjvVar.yjg());
                            float fFloatValue = Double.valueOf((System.currentTimeMillis() / 1000) - wjvVar.jfv()).floatValue();
                            if (fFloatValue <= 0.0f) {
                                fFloatValue = 0.0f;
                            }
                            jSONObject.putOpt("show_time", Float.valueOf(fFloatValue));
                            jSONObject.putOpt("ua_policy", Integer.valueOf(wjvVar.m14407hd()));
                        } catch (Exception unused) {
                        }
                        return jSONObject;
                    }
                });
                if (!TextUtils.isEmpty(C3089aw.m12377ri(C3299nr.m14642ri())) && "click".equals(str)) {
                    C3435lr.m15671ri(C2896ri.m11141ri(wjvVar.bfa(), true), 2, wjvVar.m14533tn());
                }
                if ("click".equals(str)) {
                    C3365zf.m15146ik(wjvVar);
                }
            }
        });
    }

    @DungeonFlag
    /* JADX INFO: renamed from: ri */
    public static void m15564ri(final String str, final wjv wjvVar, final String str2, final xha xhaVar) {
        if (wjvVar == null || xhaVar == null || !xhaVar.m15725ri()) {
            return;
        }
        m15532ri(System.currentTimeMillis(), wjvVar, str2, "ad_show_time", new C3527ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.50
            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: ik */
            public JSONObject mo11121ik() {
                try {
                    xha xhaVar2 = xhaVar;
                    if (xhaVar2 == null || xhaVar2.m15720lr() == null) {
                        return null;
                    }
                    JSONObject jSONObjectM15720lr = xhaVar.m15720lr();
                    if (str2.equals("open_ad")) {
                        jSONObjectM15720lr.put("is_icon_only", wjvVar.ory() ? 1 : 0);
                    }
                    return jSONObjectM15720lr;
                } catch (Throwable unused) {
                    return null;
                }
            }

            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: lr */
            public JSONObject mo10797lr() {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", str);
                } catch (Throwable unused) {
                }
                return jSONObject;
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    public static void m15565ri(String str, wjv wjvVar, String str2, final Map<String, Object> map) {
        m15532ri(System.currentTimeMillis(), wjvVar, str2, str, new C3527ri() { // from class: com.bytedance.sdk.openadsdk.ka.ik.48
            @Override // com.bytedance.sdk.openadsdk.slm.p260lr.C3527ri, com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3526lr
            /* JADX INFO: renamed from: ik */
            public JSONObject mo11121ik() {
                try {
                    if (map == null) {
                        return null;
                    }
                    JSONObject jSONObject = new JSONObject();
                    for (Map.Entry entry : map.entrySet()) {
                        jSONObject.put((String) entry.getKey(), entry.getValue());
                    }
                    return jSONObject;
                } catch (Exception unused) {
                    return null;
                }
            }
        });
    }

    /* JADX INFO: renamed from: ri */
    private static void m15566ri(JSONObject jSONObject) {
        try {
            jSONObject.put("screen_scale", C3583qd.m16576di(C3299nr.m14642ri()));
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m15567ri(JSONObject jSONObject, int i, int i2) {
        try {
            jSONObject.put("skip_show_time", i);
            jSONObject.put("skip_time", i2);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("skip_after_time", i2 - (i * 1000));
            jSONObject.put("pag_json_data", jSONObject2.toString());
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    private static boolean m15568ri(int i, String str) {
        int iM14859lr;
        try {
            Set<String> setM14848hd = C3322sf.m14819lr().m14848hd();
            if ((i == 1 && setM14848hd != null && setM14848hd.contains(str)) || (iM14859lr = C3322sf.m14819lr().m14859lr(str)) == 0) {
                return true;
            }
            return iM14859lr != 100 && ((int) ((Math.random() * 100.0d) + 1.0d)) > iM14859lr;
        } catch (Throwable th) {
            C2707ac.m10196ik("TTAD.AdEvent", th.getMessage());
            return false;
        }
    }
}
