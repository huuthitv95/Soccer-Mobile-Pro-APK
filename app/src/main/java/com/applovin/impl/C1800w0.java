package com.applovin.impl;

import androidx.core.app.NotificationCompat;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.facebook.internal.NativeProtocol;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.w0 */
/* JADX INFO: loaded from: classes3.dex */
public class C1800w0 {

    /* JADX INFO: renamed from: a */
    protected final C1748l f3486a;

    /* JADX INFO: renamed from: b */
    protected final JSONObject f3487b;

    /* JADX INFO: renamed from: com.applovin.impl.w0$a */
    public enum a {
        NONE(0),
        IS_AL_GDPR(1000),
        IS_ELIGIBLE_FOR_TERMS_AND_PRIVACY_POLICY_ALERT(1001),
        HAS_TERMS_OF_SERVICE_URI(1002);


        /* JADX INFO: renamed from: a */
        private final int f3493a;

        a(int i) {
            this.f3493a = i;
        }

        /* JADX INFO: renamed from: b */
        public int m5501b() {
            return this.f3493a;
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.w0$b */
    public enum b {
        ALERT,
        POST_ALERT,
        EVENT,
        REINIT,
        CMP_LOAD,
        CMP_SHOW,
        DECISION
    }

    public C1800w0(JSONObject jSONObject, C1748l c1748l) {
        this.f3486a = c1748l;
        this.f3487b = jSONObject;
    }

    /* JADX INFO: renamed from: a */
    private static a m5490a(String str) {
        if ("is_al_gdpr".equalsIgnoreCase(str)) {
            return a.IS_AL_GDPR;
        }
        if ("is_eligible_for_terms_and_privacy_policy_alert".equalsIgnoreCase(str)) {
            return a.IS_ELIGIBLE_FOR_TERMS_AND_PRIVACY_POLICY_ALERT;
        }
        return "has_terms_of_service_uri".equalsIgnoreCase(str) ? a.HAS_TERMS_OF_SERVICE_URI : a.NONE;
    }

    /* JADX INFO: renamed from: a */
    public static C1800w0 m5491a(JSONObject jSONObject, C1748l c1748l) {
        b bVarM5492c = m5492c(JsonUtils.getString(jSONObject, "type", null));
        if (bVarM5492c == b.ALERT) {
            return new C1809x0(jSONObject, c1748l);
        }
        return bVarM5492c == b.EVENT ? new C1827z0(jSONObject, c1748l) : new C1800w0(jSONObject, c1748l);
    }

    /* JADX INFO: renamed from: c */
    private static b m5492c(String str) {
        if ("alert".equalsIgnoreCase(str)) {
            return b.ALERT;
        }
        if ("post_alert".equalsIgnoreCase(str)) {
            return b.POST_ALERT;
        }
        if (NotificationCompat.CATEGORY_EVENT.equalsIgnoreCase(str)) {
            return b.EVENT;
        }
        if ("cmp_load".equalsIgnoreCase(str)) {
            return b.CMP_LOAD;
        }
        if ("cmp_show".equalsIgnoreCase(str)) {
            return b.CMP_SHOW;
        }
        if ("decision".equalsIgnoreCase(str)) {
            return b.DECISION;
        }
        if ("reinit".equalsIgnoreCase(str)) {
            return b.REINIT;
        }
        throw new IllegalArgumentException("Invalid type provided: " + str);
    }

    /* JADX INFO: renamed from: a */
    public int m5493a(Boolean bool) {
        int i = JsonUtils.getInt(this.f3487b, "destination_state_id", -1);
        if (i > 0) {
            return i;
        }
        if (bool != null) {
            return bool.booleanValue() ? JsonUtils.getInt(this.f3487b, "destination_state_id_true", -1) : JsonUtils.getInt(this.f3487b, "destination_state_id_false", -1);
        }
        throw new IllegalStateException("Decision needed for state: " + i);
    }

    /* JADX INFO: renamed from: a */
    public a m5494a() {
        return m5490a(m5495b());
    }

    /* JADX INFO: renamed from: b */
    public String m5495b() {
        return JsonUtils.getString(this.f3487b, "decision_type", null);
    }

    /* JADX INFO: renamed from: b */
    protected String m5496b(String str) {
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f3487b, str, (JSONObject) null);
        JSONArray jSONArray = JsonUtils.getJSONArray(jSONObject, "replacements", new JSONArray());
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            String string = JsonUtils.getObjectAtIndex(jSONArray, i, "").toString();
            if ("<APP_NAME>".equalsIgnoreCase(string)) {
                String str2 = (String) this.f3486a.m4759B().m4937M().get(NativeProtocol.BRIDGE_ARG_APP_NAME_STRING);
                if (StringUtils.isValidString(str2)) {
                    arrayList.add(str2);
                } else {
                    arrayList.add(C1748l.m4730a("THIS_APP"));
                }
            } else {
                arrayList.add(string);
            }
        }
        return C1748l.m4731a(JsonUtils.getString(jSONObject, "key", null), arrayList);
    }

    /* JADX INFO: renamed from: c */
    public int m5497c() {
        return JsonUtils.getInt(this.f3487b, "id", -1);
    }

    /* JADX INFO: renamed from: d */
    public b m5498d() {
        return m5492c(m5499e());
    }

    /* JADX INFO: renamed from: e */
    public String m5499e() {
        return JsonUtils.getString(this.f3487b, "type", null);
    }

    public String toString() {
        return "ConsentFlowState{id=" + m5497c() + ", type=" + m5498d() + "}";
    }
}
