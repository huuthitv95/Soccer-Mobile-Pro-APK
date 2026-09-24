package com.bytedance.sdk.component.adexpress.dynamic.p116fi;

import android.text.TextUtils;
import com.bytedance.sdk.component.adexpress.C2490ka;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2470di;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2471fi;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2472ik;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2473ka;
import com.bytedance.sdk.component.adexpress.dynamic.p119ka.C2475mj;
import com.bytedance.sdk.component.adexpress.p124ka.xha;
import com.bytedance.sdk.component.adexpress.p125lr.C2500aw;
import com.bytedance.sdk.component.adexpress.p126ri.p129ri.C2531ri;
import com.facebook.internal.NativeProtocol;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.ironsource.C11744X3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.fi.di */
/* JADX INFO: loaded from: classes3.dex */
public class C2432di {
    private static HashMap<String, String> xha;

    /* JADX INFO: renamed from: di */
    private C2473ka f6551di;

    /* JADX INFO: renamed from: fi */
    private C2434ik f6552fi;

    /* JADX INFO: renamed from: ik */
    private C2472ik f6553ik;

    /* JADX INFO: renamed from: ka */
    private ri f6554ka;

    /* JADX INFO: renamed from: lr */
    private JSONObject f6555lr;

    /* JADX INFO: renamed from: ri */
    private JSONObject f6556ri;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.dynamic.fi.di$ri */
    static class ri {

        /* JADX INFO: renamed from: ik */
        boolean f6557ik;

        /* JADX INFO: renamed from: lr */
        float f6558lr;

        /* JADX INFO: renamed from: ri */
        float f6559ri;

        /* JADX INFO: renamed from: ri */
        public static ri m8363ri(JSONObject jSONObject) {
            ri riVar = new ri();
            if (jSONObject != null) {
                riVar.f6559ri = (float) jSONObject.optDouble("width");
                riVar.f6558lr = (float) jSONObject.optDouble("height");
                riVar.f6557ik = jSONObject.optBoolean("isLandscape");
            }
            return riVar;
        }
    }

    static {
        HashMap<String, String> map = new HashMap<>();
        xha = map;
        map.put(MessengerShareContentUtility.SUBTITLE, "description");
        xha.put("source", "source|app.app_name");
        xha.put("screenshot", "dynamic_creative.screenshot");
    }

    public C2432di(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4) {
        this.f6556ri = jSONObject;
        this.f6555lr = jSONObject2;
        this.f6553ik = new C2472ik(jSONObject2);
        this.f6554ka = ri.m8363ri(jSONObject3);
        this.f6551di = C2473ka.m8606ri(jSONObject4);
    }

    /* JADX INFO: renamed from: lr */
    private void m8354lr(C2475mj c2475mj) {
        C2472ik c2472ik;
        Object objM8604ri;
        Object objM8604ri2;
        Object objM8604ri3;
        Object objM8604ri4;
        if (c2475mj == null || (c2472ik = this.f6553ik) == null || (objM8604ri = c2472ik.m8604ri("image.0.url")) == null) {
            return;
        }
        String strValueOf = String.valueOf(objM8604ri);
        if (TextUtils.isEmpty(strValueOf) || (objM8604ri2 = this.f6553ik.m8604ri("title")) == null) {
            return;
        }
        String strValueOf2 = String.valueOf(objM8604ri2);
        if (TextUtils.isEmpty(strValueOf2) || (objM8604ri3 = this.f6553ik.m8604ri("description")) == null) {
            return;
        }
        String strValueOf3 = String.valueOf(objM8604ri3);
        if (TextUtils.isEmpty(strValueOf3) || (objM8604ri4 = this.f6553ik.m8604ri("icon")) == null) {
            return;
        }
        String strValueOf4 = String.valueOf(objM8604ri4);
        if (TextUtils.isEmpty(strValueOf4)) {
            return;
        }
        Object objM8604ri5 = this.f6553ik.m8604ri("app.app_name");
        Object objM8604ri6 = this.f6553ik.m8604ri("source");
        if (objM8604ri5 == null && objM8604ri6 == null) {
            return;
        }
        if (objM8604ri5 == null) {
            objM8604ri5 = objM8604ri6;
        }
        String strValueOf5 = String.valueOf(objM8604ri5);
        if (TextUtils.isEmpty(strValueOf5)) {
            return;
        }
        c2475mj.m8634ri("imageUrl", strValueOf);
        c2475mj.m8634ri("title", strValueOf2);
        c2475mj.m8634ri("description", strValueOf3);
        c2475mj.m8634ri("icon", strValueOf4);
        c2475mj.m8634ri(NativeProtocol.BRIDGE_ARG_APP_NAME_STRING, strValueOf5);
        c2475mj.m8637ri(true);
    }

    /* JADX INFO: renamed from: ri */
    private String m8355ri() {
        Object objM8604ri;
        C2472ik c2472ik = this.f6553ik;
        return (c2472ik == null || (objM8604ri = c2472ik.m8604ri("adx_name")) == null) ? "" : String.valueOf(objM8604ri);
    }

    /* JADX INFO: renamed from: ri */
    private String m8356ri(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        for (String str2 : str.split("\\|")) {
            if (this.f6553ik.m8603lr(str2)) {
                String strValueOf = String.valueOf(this.f6553ik.m8604ri(str2));
                if (!TextUtils.isEmpty(strValueOf)) {
                    return strValueOf;
                }
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: ri */
    private void m8357ri(C2470di c2470di) {
        if (c2470di == null) {
            return;
        }
        String strM8487dw = c2470di.m8487dw();
        if (C2490ka.m8810lr()) {
            String strM8829ik = xha.m8829ik(C2490ka.m8811ri());
            if ("zh".equals(strM8829ik)) {
                strM8829ik = "cn";
            }
            if (!TextUtils.isEmpty(strM8829ik) && c2470di.m8481di() != null) {
                String strOptString = c2470di.m8481di().optString(strM8829ik);
                if (!TextUtils.isEmpty(strOptString)) {
                    strM8487dw = strOptString;
                }
            }
        }
        if (TextUtils.isEmpty(strM8487dw)) {
            return;
        }
        int iIndexOf = strM8487dw.indexOf("{{");
        int iIndexOf2 = strM8487dw.indexOf("}}");
        if (iIndexOf < 0 || iIndexOf2 < 0 || iIndexOf2 < iIndexOf) {
            c2470di.m8478co(strM8487dw);
            return;
        }
        String strM8356ri = m8356ri(strM8487dw.substring(iIndexOf + 2, iIndexOf2));
        StringBuilder sb = new StringBuilder(strM8487dw.substring(0, iIndexOf));
        if (!TextUtils.isEmpty(strM8356ri)) {
            sb.append(strM8356ri);
        }
        sb.append(strM8487dw.substring(iIndexOf2 + 2));
        c2470di.m8478co(sb.toString());
    }

    /* JADX INFO: renamed from: ri */
    private void m8358ri(C2471fi c2471fi, int i) {
        int iLastIndexOf;
        if (i == 5 || i == 15 || i == 50 || i == 154) {
            c2471fi.m8601ri("video");
            String strM8374ri = jbs.m8374ri("video");
            c2471fi.m8592fi().m8464ac(strM8374ri);
            String strM8375ri = jbs.m8375ri("video", "clickArea");
            if (!TextUtils.isEmpty(strM8375ri)) {
                c2471fi.m8592fi().m8578vr(strM8375ri);
                c2471fi.xha().m8578vr(strM8375ri);
            }
            c2471fi.xha().m8464ac(strM8374ri);
            c2471fi.m8598lr(strM8374ri);
            c2471fi.m8592fi().amj();
            return;
        }
        c2471fi.m8601ri("image");
        String strM8374ri2 = jbs.m8374ri("image");
        C2470di c2470diM8592fi = c2471fi.m8592fi();
        c2470diM8592fi.m8464ac(strM8374ri2);
        c2471fi.xha().m8464ac(strM8374ri2);
        String strM8375ri2 = jbs.m8375ri("image", "clickArea");
        if (!TextUtils.isEmpty(strM8375ri2)) {
            c2470diM8592fi.m8578vr(strM8375ri2);
            c2471fi.xha().m8578vr(strM8375ri2);
        }
        JSONObject jSONObjectRbz = c2470diM8592fi.rbz();
        if (jSONObjectRbz != null) {
            c2470diM8592fi.wjv(jSONObjectRbz.optString("imageLottieTosPath"));
            c2470diM8592fi.m8479co(jSONObjectRbz.optBoolean("animationsLoop"));
            c2470diM8592fi.m8567su(jSONObjectRbz.optInt("lottieAppNameMaxLength"));
            c2470diM8592fi.m8588zf(jSONObjectRbz.optInt("lottieAdDescMaxLength"));
            c2470diM8592fi.igq(jSONObjectRbz.optInt("lottieAdTitleMaxLength"));
        }
        c2471fi.m8598lr(strM8374ri2);
        if (strM8374ri2 != null && (iLastIndexOf = strM8374ri2.lastIndexOf(".")) > 0) {
            String strSubstring = strM8374ri2.substring(0, iLastIndexOf);
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("width", m8356ri(strSubstring + ".width"));
                jSONObject.put("height", m8356ri(strSubstring + ".height"));
            } catch (JSONException unused) {
            }
            c2471fi.m8594ik(jSONObject.toString());
        }
        c2470diM8592fi.bfa();
    }

    /* JADX INFO: renamed from: ri */
    private void m8359ri(C2475mj c2475mj) {
        if (c2475mj == null) {
            return;
        }
        float fMin = this.f6554ka.f6557ik ? this.f6554ka.f6559ri : Math.min(this.f6554ka.f6559ri, xha.m8832lr(C2490ka.m8811ri(), C2531ri.m9163ri().m9166ik() != null ? C2531ri.m9163ri().m9166ik().slm() : xha.m8835ri(C2490ka.m8811ri())));
        if (this.f6554ka.f6558lr == 0.0f) {
            c2475mj.m8615fi(fMin);
            c2475mj.m8627qt().m8592fi().m8552qt("auto");
            c2475mj.m8613di(0.0f);
        } else {
            c2475mj.m8615fi(fMin);
            c2475mj.m8613di(this.f6554ka.f6557ik ? this.f6554ka.f6558lr : Math.min(this.f6554ka.f6558lr, xha.m8832lr(C2490ka.m8811ri(), xha.m8831lr(C2490ka.m8811ri()))));
            c2475mj.m8627qt().m8592fi().m8552qt("fixed");
        }
    }

    /* JADX INFO: renamed from: ri */
    public C2475mj m8360ri(double d, int i, double d2, String str, C2500aw c2500aw) {
        JSONObject jSONObject;
        this.f6553ik.m8605ri();
        try {
            jSONObject = new JSONObject(this.f6551di.f6765lr);
        } catch (JSONException unused) {
            jSONObject = null;
        }
        C2475mj c2475mjM8362ri = m8362ri(C2435ka.m8382ri(this.f6556ri, jSONObject), (C2475mj) null);
        m8359ri(c2475mjM8362ri);
        C2433fi c2433fi = new C2433fi(d, i, d2, str, c2500aw);
        C2433fi.ri riVar = new C2433fi.ri();
        riVar.f6566ri = this.f6554ka.f6559ri;
        riVar.f6565lr = this.f6554ka.f6558lr;
        riVar.f6564ik = 0.0f;
        c2433fi.m8368ri(riVar);
        c2433fi.m8370ri(c2475mjM8362ri, 0.0f, 0.0f);
        c2433fi.m8367ri();
        if (c2433fi.f6563ri.f6772ka == 65536.0f) {
            return null;
        }
        return c2433fi.f6563ri.f6769di;
    }

    /* JADX INFO: renamed from: ri */
    public C2475mj m8361ri(JSONObject jSONObject) {
        JSONObject jSONObject2;
        String strOptString = jSONObject.optString("type");
        String strOptString2 = jSONObject.optString("id");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("values");
        jbs.m8379ri(strOptString, jSONObjectOptJSONObject);
        JSONObject jSONObjectM8376ri = jbs.m8376ri(strOptString, jbs.m8377ri(jSONObject.optJSONArray("sceneValues")), jSONObjectOptJSONObject);
        C2475mj c2475mj = new C2475mj();
        if (TextUtils.isEmpty(strOptString2)) {
            c2475mj.m8623lr(String.valueOf(c2475mj.hashCode()));
        } else {
            c2475mj.m8623lr(strOptString2);
        }
        if (jSONObjectOptJSONObject != null) {
            m8354lr(c2475mj);
            c2475mj.m8617ik((float) jSONObjectOptJSONObject.optDouble("x"));
            c2475mj.m8620ka((float) jSONObjectOptJSONObject.optDouble("y"));
            c2475mj.m8615fi((float) jSONObjectOptJSONObject.optDouble("width"));
            c2475mj.m8613di((float) jSONObjectOptJSONObject.optDouble("height"));
            c2475mj.xha(jSONObjectOptJSONObject.optInt("remainWidth"));
            C2471fi c2471fi = new C2471fi();
            c2471fi.m8601ri(strOptString);
            c2471fi.m8598lr(jSONObjectOptJSONObject.optString("data"));
            c2471fi.m8594ik(jSONObjectOptJSONObject.optString("dataExtraInfo"));
            C2470di c2470diM8460ri = C2470di.m8460ri(jSONObjectOptJSONObject);
            c2471fi.m8600ri(c2470diM8460ri);
            C2470di c2470diM8460ri2 = C2470di.m8460ri(jSONObjectM8376ri);
            if (c2470diM8460ri2 == null) {
                c2471fi.m8597lr(c2470diM8460ri);
            } else {
                c2471fi.m8597lr(c2470diM8460ri2);
            }
            m8357ri(c2470diM8460ri);
            m8357ri(c2470diM8460ri2);
            if (TextUtils.equals(strOptString, "video-image-budget") && (jSONObject2 = this.f6555lr) != null) {
                m8358ri(c2471fi, jSONObject2.optInt("image_mode"));
            }
            String strM8596lr = c2471fi.m8596lr();
            C2470di c2470diM8592fi = c2471fi.m8592fi();
            if (xha.containsKey(strM8596lr) && !c2470diM8592fi.m8585xm()) {
                c2470diM8592fi.m8464ac(xha.get(strM8596lr));
            }
            String strM8593ik = c2470diM8592fi.m8585xm() ? c2471fi.m8593ik() : m8356ri(c2471fi.m8593ik());
            if (C2490ka.m8810lr()) {
                if (TextUtils.equals(strM8596lr, "star") || TextUtils.equals(strM8596lr, "text_star")) {
                    strM8593ik = m8356ri("dynamic_creative.score_exact_i18n|");
                }
                if (TextUtils.equals(strM8596lr, "score-count") || TextUtils.equals(strM8596lr, "score-count-type-1") || TextUtils.equals(strM8596lr, "score-count-type-2")) {
                    strM8593ik = m8356ri("dynamic_creative.comment_num_i18n|");
                }
                if ("root".equals(strM8596lr) && c2470diM8460ri.adz()) {
                    strM8593ik = m8356ri("image.0.url");
                }
            }
            if (TextUtils.isEmpty(m8355ri()) || !(TextUtils.equals("logo-union", strOptString) || TextUtils.equals("logo", strOptString))) {
                c2471fi.m8598lr(strM8593ik);
            } else {
                c2471fi.m8598lr(strM8593ik + "adx:" + m8355ri());
            }
            c2475mj.m8631ri(c2471fi);
        }
        return c2475mj;
    }

    /* JADX INFO: renamed from: ri */
    public C2475mj m8362ri(JSONObject jSONObject, C2475mj c2475mj) {
        if (jSONObject == null) {
            return null;
        }
        String strOptString = jSONObject.optString("type");
        if (TextUtils.equals(strOptString, "custom-component-vessel")) {
            int iOptInt = jSONObject.optInt("componentId");
            if (this.f6551di != null) {
                C2434ik c2434ik = new C2434ik();
                this.f6552fi = c2434ik;
                JSONObject jSONObjectM8372ri = c2434ik.m8372ri(this.f6551di.f6766ri, iOptInt, jSONObject);
                if (jSONObjectM8372ri != null) {
                    jSONObject = jSONObjectM8372ri;
                }
            }
        }
        C2475mj c2475mjM8361ri = m8361ri(jSONObject);
        c2475mjM8361ri.m8632ri(c2475mj);
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("children");
        if (jSONArrayOptJSONArray == null) {
            c2475mjM8361ri.m8635ri((List<C2475mj>) null);
            return c2475mjM8361ri;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i = 0; i < jSONArrayOptJSONArray.length(); i++) {
            JSONArray jSONArrayOptJSONArray2 = jSONArrayOptJSONArray.optJSONArray(i);
            if (jSONArrayOptJSONArray2 != null) {
                ArrayList arrayList3 = new ArrayList();
                int iM8544pc = TextUtils.equals(strOptString, "tag-group") ? c2475mjM8361ri.m8627qt().m8592fi().m8544pc() : jSONArrayOptJSONArray2.length();
                for (int i2 = 0; i2 < iM8544pc; i2++) {
                    C2475mj c2475mjM8362ri = m8362ri(jSONArrayOptJSONArray2.optJSONObject(i2), c2475mjM8361ri);
                    if (C2490ka.m8810lr() && "skip-with-time".equals(c2475mjM8361ri.m8627qt().m8596lr()) && !C11744X3.i.f26348T.equals(c2475mjM8361ri.wjv()) && !TextUtils.isEmpty(c2475mjM8361ri.wjv())) {
                        c2475mjM8362ri.m8618ik(c2475mjM8361ri.wjv());
                    }
                    arrayList.add(c2475mjM8362ri);
                    arrayList3.add(c2475mjM8362ri);
                }
                arrayList2.add(arrayList3);
            }
        }
        if (arrayList.size() > 0) {
            c2475mjM8361ri.m8635ri(arrayList);
        }
        if (arrayList2.size() > 0) {
            c2475mjM8361ri.m8624lr(arrayList2);
        }
        return c2475mjM8361ri;
    }
}
