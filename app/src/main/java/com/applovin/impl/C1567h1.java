package com.applovin.impl;

import com.adjust.sdk.Constants;
import com.applovin.impl.sdk.utils.JsonUtils;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.h1 */
/* JADX INFO: loaded from: classes3.dex */
public class C1567h1 {

    /* JADX INFO: renamed from: a */
    private final JSONObject f1746a;

    public C1567h1(JSONObject jSONObject) {
        this.f1746a = jSONObject;
    }

    /* JADX INFO: renamed from: a */
    protected Integer m2775a() {
        return JsonUtils.getInteger(this.f1746a, "dark_mode_toolbar_color", null);
    }

    /* JADX INFO: renamed from: b */
    protected String m2776b() {
        return JsonUtils.getString(this.f1746a, "digital_asset_link_url", null);
    }

    /* JADX INFO: renamed from: c */
    protected Boolean m2777c() {
        return JsonUtils.getBoolean(this.f1746a, "instant_apps_enabled", null);
    }

    /* JADX INFO: renamed from: d */
    protected String m2778d() {
        return JsonUtils.getString(this.f1746a, Constants.REFERRER, null);
    }

    /* JADX INFO: renamed from: e */
    protected Integer m2779e() {
        return JsonUtils.getInteger(this.f1746a, "session_url_relation", null);
    }

    /* JADX INFO: renamed from: f */
    protected Integer m2780f() {
        return JsonUtils.getInteger(this.f1746a, "share_state", null);
    }

    /* JADX INFO: renamed from: g */
    protected Boolean m2781g() {
        return JsonUtils.getBoolean(this.f1746a, "should_show_title", null);
    }

    /* JADX INFO: renamed from: h */
    protected Integer m2782h() {
        return JsonUtils.getInteger(this.f1746a, "toolbar_color", null);
    }

    /* JADX INFO: renamed from: i */
    protected Boolean m2783i() {
        return JsonUtils.getBoolean(this.f1746a, "url_bar_hiding_enabled", null);
    }
}
