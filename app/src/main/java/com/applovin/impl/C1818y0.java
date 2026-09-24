package com.applovin.impl;

import androidx.core.app.NotificationCompat;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.unity3d.ads.BuildConfig;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.y0 */
/* JADX INFO: loaded from: classes3.dex */
public class C1818y0 {

    /* JADX INFO: renamed from: a */
    private final JSONObject f3577a;

    /* JADX INFO: renamed from: com.applovin.impl.y0$a */
    public enum a {
        NEUTRAL,
        POSITIVE,
        NEGATIVE
    }

    private C1818y0(JSONObject jSONObject) {
        this.f3577a = jSONObject;
    }

    /* JADX INFO: renamed from: a */
    public static C1818y0 m5608a(JSONObject jSONObject, C1748l c1748l) {
        String string = JsonUtils.getString(JsonUtils.getJSONObject(jSONObject, "title", (JSONObject) null), "key", null);
        if ("TOS".equalsIgnoreCase(string) && c1748l.m4864y().m5348h() == null) {
            return null;
        }
        if ("PP".equalsIgnoreCase(string) && c1748l.m4864y().m5346f() == null) {
            return null;
        }
        return new C1818y0(jSONObject);
    }

    /* JADX INFO: renamed from: a */
    public int m5609a() {
        return JsonUtils.getInt(this.f3577a, "destination_state_id", -1);
    }

    /* JADX INFO: renamed from: b */
    public String m5610b() {
        return JsonUtils.getString(this.f3577a, NotificationCompat.CATEGORY_EVENT, null);
    }

    /* JADX INFO: renamed from: c */
    public a m5611c() {
        String string = JsonUtils.getString(this.f3577a, "style", null);
        if (BuildConfig.FLAVOR.equalsIgnoreCase(string)) {
            return a.POSITIVE;
        }
        return ("destructive".equalsIgnoreCase(string) || "cancel".equalsIgnoreCase(string)) ? a.NEGATIVE : a.NEUTRAL;
    }

    /* JADX INFO: renamed from: d */
    public String m5612d() {
        JSONObject jSONObject = JsonUtils.getJSONObject(this.f3577a, "title", (JSONObject) null);
        return C1748l.m4731a(JsonUtils.getString(jSONObject, "key", ""), JsonUtils.optList(JsonUtils.getJSONArray(jSONObject, "replacements", null), null));
    }

    public String toString() {
        return "ConsentFlowStateAlertAction{title=" + m5612d() + ", destinationStateId=" + m5609a() + ", event=" + m5610b() + "}";
    }
}
