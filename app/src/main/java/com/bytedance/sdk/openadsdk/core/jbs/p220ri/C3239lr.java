package com.bytedance.sdk.openadsdk.core.jbs.p220ri;

import android.text.TextUtils;
import com.bykv.p028vk.openvk.p049ri.p050ri.p058ri.p061ik.C1997lr;
import com.bytedance.sdk.component.adexpress.p126ri.p127ik.C2517lr;
import com.bytedance.sdk.component.adexpress.p126ri.p128lr.C2523lr;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.core.C3089aw;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.core.C3304qt;
import com.bytedance.sdk.openadsdk.core.dzy;
import com.bytedance.sdk.openadsdk.core.model.C3286nr;
import com.bytedance.sdk.openadsdk.core.model.C3287oh;
import com.bytedance.sdk.openadsdk.core.model.tan;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p200co.p216ri.C3183lr;
import com.bytedance.sdk.openadsdk.core.p200co.xha.InterfaceC3185ik;
import com.facebook.internal.NativeProtocol;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.ironsource.C11540L6;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.jbs.ri.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C3239lr {

    /* JADX INFO: renamed from: lr */
    private static String f10884lr = "";

    /* JADX INFO: renamed from: ri */
    public static String f10885ri = "https://pag_open_icon_id/appicon.png";

    /* JADX INFO: renamed from: ik */
    private static JSONObject m13701ik(wjv wjvVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            dzy.m13392ri(jSONObject, wjvVar);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ik */
    public static boolean m13702ik() {
        return true;
    }

    /* JADX INFO: renamed from: lr */
    private static String m13703lr(wjv.C3296ri c3296ri) {
        C2517lr c2517lrM9107ik;
        if (c3296ri == null) {
            return "";
        }
        String strXha = c3296ri.xha();
        return (!TextUtils.isEmpty(strXha) || (c2517lrM9107ik = C2523lr.m9107ik(c3296ri.m14589ka())) == null) ? strXha : c2517lrM9107ik.m9024fi();
    }

    /* JADX INFO: renamed from: lr */
    public static Map<String, String> m13704lr(wjv wjvVar) {
        HashMap map = null;
        if (wjvVar == null) {
            return null;
        }
        List<C3286nr> listRbz = wjvVar.rbz();
        if (listRbz != null && listRbz.size() > 0) {
            map = new HashMap();
            for (C3286nr c3286nr : listRbz) {
                if (c3286nr != null) {
                    map.put(c3286nr.m14220ri(), c3286nr.xha());
                }
            }
            C3286nr c3286nrM14391fb = wjvVar.m14391fb();
            if (c3286nrM14391fb != null) {
                map.put(c3286nrM14391fb.m14220ri(), c3286nrM14391fb.xha());
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: lr */
    public static JSONObject m13705lr() {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("language", C3089aw.m12375lr());
            jSONObject.put("xSetting", jSONObject2);
            JSONObject jSONObject3 = new JSONObject();
            dzy.m13376lr(jSONObject3);
            jSONObject3.put(C11540L6.f24917H, "android");
            jSONObject.put("xAppInfo", jSONObject3);
            return jSONObject;
        } catch (Exception e) {
            C2707ac.m10196ik("TemplateUtils", e.getMessage());
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: ri */
    public static String m13706ri() {
        return f10884lr;
    }

    /* JADX INFO: renamed from: ri */
    private static String m13707ri(wjv.C3296ri c3296ri) {
        return c3296ri != null ? c3296ri.m14593mj() : "";
    }

    /* JADX INFO: renamed from: ri */
    public static String m13708ri(wjv wjvVar, String str) {
        List<C3286nr> listRbz;
        if (wjvVar != null && (listRbz = wjvVar.rbz()) != null && listRbz.size() > 0) {
            for (C3286nr c3286nr : listRbz) {
                if (c3286nr != null && TextUtils.equals(str, c3286nr.m14220ri())) {
                    return c3286nr.xha();
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: ri */
    public static JSONObject m13709ri(float f, float f2, boolean z, wjv wjvVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C11540L6.f24917H, "android");
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("width", f);
            jSONObject2.put("height", f2);
            if (z) {
                jSONObject2.put("isLandscape", true);
            }
            jSONObject.put("AdSize", jSONObject2);
            jSONObject.put("creative", m13717ri(false, wjvVar));
            jSONObject.put("template_Plugin", m13703lr(wjvVar.sez()));
            jSONObject.put("diff_template_Plugin", m13707ri(wjvVar.sez()));
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ri */
    public static JSONObject m13710ri(float f, float f2, boolean z, wjv wjvVar, String str) {
        if (wjvVar == null) {
            return null;
        }
        try {
            JSONObject jSONObjectM13714ri = m13714ri(wjvVar, true, true);
            if (jSONObjectM13714ri == null) {
                return null;
            }
            try {
                m13718ri(jSONObjectM13714ri, wjvVar, str);
                JSONObject jSONObjectM13373lr = dzy.m13373lr(wjvVar);
                jSONObjectM13373lr.put("language", C3089aw.m12375lr());
                jSONObjectM13714ri.put("xSetting", jSONObjectM13373lr);
                jSONObjectM13714ri.put("xAdInfo", m13715ri(str, m13701ik(wjvVar), wjvVar));
                JSONObject jSONObject = new JSONObject();
                dzy.m13376lr(jSONObject);
                jSONObject.put(C11540L6.f24917H, "android");
                jSONObjectM13714ri.put("xAppInfo", jSONObject);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("width", f);
                jSONObject2.put("height", f2);
                if (z) {
                    jSONObject2.put("isLandscape", true);
                }
                jSONObjectM13714ri.put("xSize", jSONObject2);
                return jSONObjectM13714ri;
            } catch (Throwable unused) {
                return jSONObjectM13714ri;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ri */
    public static JSONObject m13711ri(float f, float f2, boolean z, wjv wjvVar, String str, InterfaceC3185ik interfaceC3185ik) {
        f10884lr = "";
        if (wjvVar == null) {
            return null;
        }
        try {
            JSONObject jSONObjectM13710ri = m13710ri(f, f2, z, wjvVar, str);
            if (interfaceC3185ik != null) {
                interfaceC3185ik.mo11837ri("adv3");
            }
            C3287oh c3287ohM14575zv = wjvVar.m14575zv();
            if (c3287ohM14575zv != null) {
                String strM14228ka = c3287ohM14575zv.m14228ka();
                if (TextUtils.isEmpty(strM14228ka)) {
                    String strM13308ri = C3183lr.m13301ri().m13308ri("adv3", c3287ohM14575zv.m14230ri(), c3287ohM14575zv.m14229lr());
                    if (TextUtils.isEmpty(strM13308ri)) {
                        String str2 = "local db data is null id is " + c3287ohM14575zv.m14230ri() + " md5 is " + c3287ohM14575zv.m14229lr();
                        f10884lr = str2;
                        if (interfaceC3185ik != null) {
                            interfaceC3185ik.mo11835ri(3, str2, "net");
                        }
                    } else {
                        jSONObjectM13710ri.put("xTemplate", new JSONObject(strM13308ri));
                        f10884lr = "getTemplate success by db data";
                        if (interfaceC3185ik != null) {
                            interfaceC3185ik.mo11832lr("local");
                            return jSONObjectM13710ri;
                        }
                    }
                } else {
                    jSONObjectM13710ri.put("xTemplate", new JSONObject(strM14228ka));
                    f10884lr = "getTemplate success by local data";
                    if (interfaceC3185ik != null) {
                        interfaceC3185ik.mo11832lr("local");
                        return jSONObjectM13710ri;
                    }
                }
            }
            return jSONObjectM13710ri;
        } catch (Exception e) {
            String str3 = "load template exception " + e.getMessage();
            f10884lr = str3;
            if (interfaceC3185ik != null) {
                interfaceC3185ik.mo11835ri(3, str3, "net");
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: ri */
    public static JSONObject m13712ri(wjv wjvVar) {
        return m13713ri(wjvVar, false, (JSONObject) null);
    }

    /* JADX INFO: renamed from: ri */
    public static JSONObject m13713ri(wjv wjvVar, boolean z, JSONObject jSONObject) {
        JSONObject jSONObjectM13714ri = null;
        if (wjvVar == null) {
            return null;
        }
        try {
            jSONObjectM13714ri = m13714ri(wjvVar, false, z);
            if (jSONObjectM13714ri == null) {
                jSONObjectM13714ri = new JSONObject();
            }
            JSONObject jSONObject2 = new JSONObject();
            dzy.m13376lr(jSONObject2);
            jSONObject2.put(C11540L6.f24917H, "android");
            jSONObjectM13714ri.put("xAppInfo", jSONObject2);
            if (jSONObject != null) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObjectM13714ri.put(next, jSONObject.get(next));
                }
            }
            JSONObject jSONObjectM13373lr = dzy.m13373lr(wjvVar);
            jSONObjectM13373lr.put("language", C3089aw.m12375lr());
            jSONObjectM13714ri.put("xSetting", jSONObjectM13373lr);
            return jSONObjectM13714ri;
        } catch (Throwable th) {
            th.getMessage();
            return jSONObjectM13714ri;
        }
    }

    /* JADX INFO: renamed from: ri */
    private static JSONObject m13714ri(wjv wjvVar, boolean z, boolean z2) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObject = null;
        if (wjvVar != null) {
            try {
                String strM14536tt = wjvVar.m14536tt();
                if (strM14536tt != null) {
                    JSONObject jSONObject2 = new JSONObject(strM14536tt);
                    JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray("creatives");
                    if (z || z2) {
                        JSONObject jSONObject3 = (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= wjvVar.m14414ik() || (jSONObjectOptJSONObject = jSONArrayOptJSONArray.optJSONObject(wjvVar.m14414ik())) == null) ? null : new JSONObject(jSONObjectOptJSONObject.toString());
                        if (jSONObject3 == null) {
                            return null;
                        }
                        jSONObject = jSONObject3;
                    } else {
                        jSONObject = new JSONObject();
                    }
                    if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 1) {
                        jSONArrayOptJSONArray.remove(0);
                        jSONObject.put("xRestCreatives", jSONArrayOptJSONArray);
                    }
                    jSONObject2.remove("creatives");
                    jSONObject.put("xRestResponse", jSONObject2);
                }
            } catch (Throwable th) {
                C2707ac.m10206ri("TemplateUtils", "filterTemplateInfo", th);
                return jSONObject;
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ri */
    private static JSONObject m13715ri(String str, JSONObject jSONObject, wjv wjvVar) {
        if (wjvVar != null) {
            try {
                if ("open_ad".equals(str)) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put(NativeProtocol.BRIDGE_ARG_APP_NAME_STRING, C3304qt.m14669lr().m14693mj());
                    int iJbs = C3304qt.m14669lr().jbs();
                    if (iJbs != 0) {
                        int iHpn = wjvVar.hpn();
                        if (9 == iHpn) {
                            jSONObject2.put("app_icon", f10885ri);
                        } else if (10 == iHpn) {
                            jSONObject2.put("app_icon", "@".concat(String.valueOf(iJbs)));
                        }
                    }
                    jSONObject.put("open_app_info", jSONObject2);
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ri */
    public static JSONObject m13716ri(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject2 != null) {
            JSONObject jSONObject3 = new JSONObject();
            if (jSONObject == null) {
                return jSONObject3;
            }
            try {
                JSONArray jSONArrayOptJSONArray = jSONObject2.optJSONArray(UserMetadata.KEYDATA_FILENAME);
                if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                    for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
                        String strOptString = jSONArrayOptJSONArray.optString(i);
                        if (jSONObject.has(strOptString)) {
                            jSONObject3.put(strOptString, jSONObject.opt(strOptString));
                        }
                    }
                    jSONObject3.put("xSetting", jSONObject.opt("xSetting"));
                    jSONObject3.put("xAdInfo", jSONObject.opt("xAdInfo"));
                    jSONObject3.put("xAppInfo", jSONObject.opt("xAppInfo"));
                    jSONObject3.put("xSize", jSONObject.opt("xSize"));
                    jSONObject3.put("dynamic_configs", jSONObject.opt("dynamic_configs"));
                    jSONObject3.put("xTemplate", jSONObject.opt("xTemplate"));
                    jSONObject3.put("xRestCreatives", jSONObject.opt("xRestCreatives"));
                    jSONObject3.put("xRestResponse", jSONObject.opt("xRestResponse"));
                    return jSONObject3;
                }
            } catch (Exception unused) {
            }
        }
        return jSONObject;
    }

    /* JADX INFO: renamed from: ri */
    public static JSONObject m13717ri(boolean z, wjv wjvVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("button_text", wjvVar.skk());
            if (wjvVar.m14391fb() != null) {
                if (wjvVar.m14391fb() == null || TextUtils.isEmpty(wjvVar.m14391fb().m14220ri())) {
                    jSONObject.put("icon", "");
                } else {
                    jSONObject.put("icon", wjvVar.m14391fb().m14220ri());
                }
            }
            JSONArray jSONArray = new JSONArray();
            if (wjvVar.rbz() != null) {
                for (int i = 0; i < wjvVar.rbz().size(); i++) {
                    C3286nr c3286nr = wjvVar.rbz().get(i);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("height", c3286nr.m14215ik());
                    jSONObject2.put("width", c3286nr.m14217lr());
                    jSONObject2.put("url", c3286nr.m14220ri());
                    jSONArray.put(jSONObject2);
                }
            }
            jSONObject.put("image", jSONArray);
            jSONObject.put("image_mode", wjvVar.m14552vz());
            jSONObject.put("interaction_type", wjvVar.adz());
            jSONObject.put("interaction_method", wjvVar.m14567zb());
            jSONObject.put("is_compliance_template", m13702ik());
            jSONObject.put("title", wjvVar.m14559xh());
            jSONObject.put("description", wjvVar.m14535tq());
            jSONObject.put("source", wjvVar.tpb());
            JSONObject jSONObject3 = new JSONObject();
            tan tanVarM14526su = wjvVar.m14526su();
            if (tanVarM14526su == null) {
                tanVarM14526su = new tan();
            }
            jSONObject3.put("ceiling_time", tanVarM14526su.m14310ka());
            jSONObject3.put("ceiling_ratio", tanVarM14526su.m14306fi());
            jSONObject3.put("expand_ratio", tanVarM14526su.m14304di());
            jSONObject.put("interaction_params", jSONObject3);
            if (wjvVar.tyz() != null) {
                jSONObject.put("comment_num", wjvVar.tyz().m14068fi());
                jSONObject.put("score", wjvVar.tyz().m14071ka());
                jSONObject.put(CampaignEx.JSON_KEY_APP_SIZE, wjvVar.tyz().m14067di());
                jSONObject.put(MBridgeConstans.DYNAMIC_VIEW_WX_APP, wjvVar.tyz().m14076mj());
            }
            C1997lr c1997lrM14389eu = wjvVar.m14389eu();
            if (c1997lrM14389eu != null) {
                JSONObject jSONObjectM6356nr = c1997lrM14389eu.m6356nr();
                jSONObjectM6356nr.put("video_duration", c1997lrM14389eu.m6339di() * ((double) c1997lrM14389eu.m6365uq()));
                jSONObject.put("video", jSONObjectM6356nr);
            }
            if (wjvVar.sez() != null) {
                jSONObject.put("dynamic_creative", wjvVar.sez().jbs());
            }
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ri */
    private static void m13718ri(JSONObject jSONObject, wjv wjvVar, String str) {
        if (wjvVar == null || jSONObject == null) {
            return;
        }
        try {
            if (jSONObject.has("h265_video")) {
                jSONObject.remove("h265_video");
            }
            C1997lr c1997lrM14389eu = wjvVar.m14389eu();
            if (c1997lrM14389eu != null) {
                JSONObject jSONObjectM6356nr = c1997lrM14389eu.m6356nr();
                jSONObjectM6356nr.put("video_duration", c1997lrM14389eu.m6339di() * ((double) c1997lrM14389eu.m6365uq()));
                jSONObject.put("video", jSONObjectM6356nr);
            } else if ("open_ad".equals(str)) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("video_duration", C3299nr.m14639ka().wjv(String.valueOf(wjvVar.m14545ur())));
                jSONObject.put("video", jSONObject2);
            }
        } catch (Exception e) {
            e.getMessage();
        }
    }
}
