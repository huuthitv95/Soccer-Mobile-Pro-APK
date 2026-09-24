package com.bytedance.sdk.openadsdk.core.p200co;

import android.text.TextUtils;
import com.bytedance.sdk.component.utils.C2707ac;
import com.bytedance.sdk.openadsdk.core.C3089aw;
import com.bytedance.sdk.openadsdk.core.C3304qt;
import com.bytedance.sdk.openadsdk.core.model.wjv;
import com.bytedance.sdk.openadsdk.core.p200co.p216ri.C3183lr;
import com.bytedance.sdk.openadsdk.core.p200co.xha.InterfaceC3185ik;
import com.facebook.internal.NativeProtocol;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.ironsource.C11540L6;
import com.ironsource.C11744X3;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.core.co.fi */
/* JADX INFO: loaded from: classes3.dex */
public class C3143fi {

    /* JADX INFO: renamed from: ri */
    private static String f10294ri = "";

    /* JADX INFO: renamed from: ik */
    private static JSONArray m13126ik(wjv wjvVar) {
        try {
            wjv.C3296ri c3296riSez = wjvVar.sez();
            if (c3296riSez == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(c3296riSez.jbs());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.putOpt("original_price", Double.valueOf(jSONObject.optDouble("original_price", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)));
            jSONObject2.putOpt("price_unit", jSONObject.optString("price_unit"));
            jSONObject2.putOpt(FirebaseAnalytics.Param.DISCOUNT, Double.valueOf(jSONObject.optDouble(FirebaseAnalytics.Param.DISCOUNT, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)));
            jSONObject2.putOpt("product_name", jSONObject.optString("dpa_product_name"));
            jSONObject2.putOpt("description", jSONObject.optString("dpa_description"));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("dpa_images");
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                jSONObject2.putOpt("image", jSONArrayOptJSONArray.get(0));
            }
            jSONObject2.putOpt("brand_name", jSONObject.optString("dpa_brand_name"));
            jSONObject2.putOpt("sale_price_i18n", Integer.valueOf(jSONObject.optInt("sale_price_i18n")));
            jSONObject2.putOpt("real_price", Double.valueOf(jSONObject.optDouble("real_price", FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE)));
            jSONObject2.put("button_text", wjvVar.skk());
            JSONArray jSONArray = new JSONArray();
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("dpa_related_products");
            if (jSONArrayOptJSONArray2 != null) {
                jSONArray.put(jSONObject2);
                for (int i = 0; i < jSONArrayOptJSONArray2.length(); i++) {
                    try {
                        JSONObject jSONObject3 = jSONArrayOptJSONArray2.getJSONObject(i);
                        jSONObject3.put("button_text", wjvVar.skk());
                        jSONArray.put(jSONObject3);
                    } catch (Throwable unused) {
                    }
                }
            }
            return jSONArray;
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* JADX INFO: renamed from: lr */
    public static boolean m13127lr(wjv wjvVar) {
        return wjvVar != null && wjvVar.hpn() == 10;
    }

    /* JADX INFO: renamed from: ri */
    public static String m13128ri() {
        return f10294ri;
    }

    /* JADX INFO: renamed from: ri */
    public static JSONObject m13129ri(wjv wjvVar, InterfaceC3185ik interfaceC3185ik) {
        JSONObject jSONObject;
        interfaceC3185ik.mo11837ri("ad");
        String strM14602vr = "";
        f10294ri = "";
        JSONObject jSONObject2 = null;
        try {
            wjv.C3296ri c3296riSez = wjvVar.sez();
            if (c3296riSez != null) {
                strM14602vr = c3296riSez.m14602vr();
                if (TextUtils.isEmpty(strM14602vr) && !TextUtils.isEmpty(c3296riSez.bgr()) && !TextUtils.isEmpty(c3296riSez.m14589ka())) {
                    strM14602vr = C3183lr.m13301ri().m13308ri("ad", c3296riSez.m14589ka(), c3296riSez.bgr());
                }
            }
            if (TextUtils.isEmpty(strM14602vr)) {
                String str = "local data is null id is " + c3296riSez.m14589ka() + " md5 is " + c3296riSez.bgr();
                f10294ri = str;
                interfaceC3185ik.mo11835ri(3, str, "net");
                return null;
            }
            try {
                jSONObject = new JSONObject(strM14602vr);
                try {
                    try {
                        f10294ri = "getTemplate success";
                        interfaceC3185ik.mo11832lr("local");
                        return jSONObject;
                    } catch (JSONException unused) {
                        String strConcat = "parse json exception data is ".concat(String.valueOf(strM14602vr));
                        f10294ri = strConcat;
                        interfaceC3185ik.mo11835ri(2, strConcat, "local");
                        return null;
                    }
                } catch (Throwable th) {
                    jSONObject2 = jSONObject;
                    th = th;
                    String str2 = "get template error " + th.getMessage();
                    f10294ri = str2;
                    interfaceC3185ik.mo11835ri(2, str2, "local");
                    return jSONObject2;
                }
            } catch (JSONException unused2) {
                jSONObject = null;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: ri */
    public static JSONObject m13130ri(wjv wjvVar, String str) {
        JSONObject jSONObjectM14361aw = wjvVar.m14361aw(false);
        try {
            jSONObjectM14361aw.put("show_dislike", wjvVar.nlk());
            jSONObjectM14361aw.put("language", C3089aw.m12375lr());
            if ("open_ad".equals(str)) {
                JSONObject jSONObject = new JSONObject();
                String strM14693mj = C3304qt.m14669lr().m14693mj();
                int iJbs = C3304qt.m14669lr().jbs();
                jSONObject.put(NativeProtocol.BRIDGE_ARG_APP_NAME_STRING, strM14693mj);
                jSONObject.put("app_icon_id", "@".concat(String.valueOf(iJbs)));
                jSONObjectM14361aw.put("open_app_info", jSONObject);
            }
            jSONObjectM14361aw.put(C11540L6.f24911F, C11744X3.f26142d);
            JSONArray jSONArrayM13126ik = m13126ik(wjvVar);
            if (jSONArrayM13126ik != null) {
                jSONObjectM14361aw.put("dpa_data", jSONArrayM13126ik);
                return jSONObjectM14361aw;
            }
        } catch (Throwable th) {
            C2707ac.m10197ik("UgenUtils", "parseUGenDataInfo exception", th.getMessage());
        }
        return jSONObjectM14361aw;
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m13131ri(int i) {
        return i == 10 || i == 9;
    }

    /* JADX INFO: renamed from: ri */
    public static boolean m13132ri(wjv wjvVar) {
        return wjvVar != null && wjvVar.hpn() == 7;
    }
}
