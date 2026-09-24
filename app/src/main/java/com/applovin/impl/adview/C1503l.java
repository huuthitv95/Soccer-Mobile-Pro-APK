package com.applovin.impl.adview;

import android.webkit.WebSettings;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import kotlinx.coroutines.DebugKt;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.adview.l */
/* JADX INFO: loaded from: classes3.dex */
public final class C1503l {

    /* JADX INFO: renamed from: a */
    private final JSONObject f1124a;

    public C1503l(JSONObject jSONObject) {
        this.f1124a = jSONObject;
    }

    /* JADX INFO: renamed from: a */
    Integer m2038a() {
        String string = JsonUtils.getString(this.f1124a, "mixed_content_mode", null);
        if (StringUtils.isValidString(string)) {
            if ("always_allow".equalsIgnoreCase(string)) {
                return 0;
            }
            if ("never_allow".equalsIgnoreCase(string)) {
                return 1;
            }
            if ("compatibility_mode".equalsIgnoreCase(string)) {
                return 2;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    WebSettings.PluginState m2039b() {
        String string = JsonUtils.getString(this.f1124a, "plugin_state", null);
        if (StringUtils.isValidString(string)) {
            if (DebugKt.DEBUG_PROPERTY_VALUE_ON.equalsIgnoreCase(string)) {
                return WebSettings.PluginState.ON;
            }
            if ("on_demand".equalsIgnoreCase(string)) {
                return WebSettings.PluginState.ON_DEMAND;
            }
            if (DebugKt.DEBUG_PROPERTY_VALUE_OFF.equalsIgnoreCase(string)) {
                return WebSettings.PluginState.OFF;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    Boolean m2040c() {
        return JsonUtils.getBoolean(this.f1124a, "geolocation_enabled", null);
    }

    /* JADX INFO: renamed from: d */
    Boolean m2041d() {
        return JsonUtils.getBoolean(this.f1124a, "allow_content_access", null);
    }

    /* JADX INFO: renamed from: e */
    Boolean m2042e() {
        return JsonUtils.getBoolean(this.f1124a, "allow_file_access", null);
    }

    /* JADX INFO: renamed from: f */
    Boolean m2043f() {
        return JsonUtils.getBoolean(this.f1124a, "allow_file_access_from_file_urls", null);
    }

    /* JADX INFO: renamed from: g */
    Boolean m2044g() {
        return JsonUtils.getBoolean(this.f1124a, "allow_universal_access_from_file_urls", null);
    }

    /* JADX INFO: renamed from: h */
    Boolean m2045h() {
        return JsonUtils.getBoolean(this.f1124a, "display_zoom_controls", null);
    }

    /* JADX INFO: renamed from: i */
    Boolean m2046i() {
        return JsonUtils.getBoolean(this.f1124a, "load_with_overview_mode", null);
    }

    /* JADX INFO: renamed from: j */
    Boolean m2047j() {
        return JsonUtils.getBoolean(this.f1124a, "need_initial_focus", null);
    }

    /* JADX INFO: renamed from: k */
    Boolean m2048k() {
        return JsonUtils.getBoolean(this.f1124a, "offscreen_pre_raster", null);
    }

    /* JADX INFO: renamed from: l */
    Boolean m2049l() {
        return JsonUtils.getBoolean(this.f1124a, "save_form_data", null);
    }

    /* JADX INFO: renamed from: m */
    Boolean m2050m() {
        return JsonUtils.getBoolean(this.f1124a, "algorithmic_darkening_allowed", null);
    }

    /* JADX INFO: renamed from: n */
    Boolean m2051n() {
        return JsonUtils.getBoolean(this.f1124a, "block_network_image", null);
    }

    /* JADX INFO: renamed from: o */
    Boolean m2052o() {
        return JsonUtils.getBoolean(this.f1124a, "loads_images_automatically", null);
    }

    /* JADX INFO: renamed from: p */
    Boolean m2053p() {
        return JsonUtils.getBoolean(this.f1124a, "use_built_in_zoom_controls", null);
    }

    /* JADX INFO: renamed from: q */
    Boolean m2054q() {
        return JsonUtils.getBoolean(this.f1124a, "use_wide_view_port", null);
    }
}
