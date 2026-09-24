package com.applovin.impl;

import com.vungle.ads.internal.model.Cookie;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.applovin.impl.b5 */
/* JADX INFO: loaded from: classes3.dex */
public class C1511b5 {

    /* JADX INFO: renamed from: a */
    private final String f1187a;

    /* JADX INFO: renamed from: b */
    private final Class f1188b;

    /* JADX INFO: renamed from: c */
    public static final C1511b5 f1163c = new C1511b5("com.applovin.sdk.impl.isFirstRun", String.class);

    /* JADX INFO: renamed from: d */
    public static final C1511b5 f1164d = new C1511b5("com.applovin.sdk.launched_before", Boolean.class);

    /* JADX INFO: renamed from: e */
    public static final C1511b5 f1165e = new C1511b5("com.applovin.sdk.launch_count", Long.class);

    /* JADX INFO: renamed from: f */
    public static final C1511b5 f1166f = new C1511b5("com.applovin.sdk.last_launch_timestamp", Long.class);

    /* JADX INFO: renamed from: g */
    public static final C1511b5 f1167g = new C1511b5("com.applovin.sdk.latest_installed_version", String.class);

    /* JADX INFO: renamed from: h */
    public static final C1511b5 f1168h = new C1511b5("com.applovin.sdk.install_date", Long.class);

    /* JADX INFO: renamed from: i */
    public static final C1511b5 f1169i = new C1511b5("com.applovin.sdk.av", Boolean.class);

    /* JADX INFO: renamed from: j */
    public static final C1511b5 f1170j = new C1511b5("com.applovin.sdk.save_settings_with_sdk_key_agnostic_name", Boolean.class);

    /* JADX INFO: renamed from: k */
    public static final C1511b5 f1171k = new C1511b5("com.applovin.sdk.user_id", String.class);

    /* JADX INFO: renamed from: l */
    public static final C1511b5 f1172l = new C1511b5("com.applovin.sdk.compass_random_token", String.class);

    /* JADX INFO: renamed from: m */
    public static final C1511b5 f1173m = new C1511b5("com.applovin.sdk.applovin_random_token", String.class);

    /* JADX INFO: renamed from: n */
    public static final C1511b5 f1174n = new C1511b5("com.applovin.sdk.alart", String.class);

    /* JADX INFO: renamed from: o */
    public static final C1511b5 f1175o = new C1511b5("com.applovin.sdk.aleid", String.class);

    /* JADX INFO: renamed from: p */
    public static final C1511b5 f1176p = new C1511b5("com.applovin.sdk.device_test_group", String.class);

    /* JADX INFO: renamed from: q */
    public static final C1511b5 f1177q = new C1511b5("com.applovin.sdk.compliance.has_user_consent", Boolean.class);

    /* JADX INFO: renamed from: r */
    public static final C1511b5 f1178r = new C1511b5("com.applovin.sdk.compliance.is_age_restricted_user", Boolean.class);

    /* JADX INFO: renamed from: s */
    public static final C1511b5 f1179s = new C1511b5("com.applovin.sdk.compliance.is_do_not_sell", Boolean.class);

    /* JADX INFO: renamed from: t */
    public static final C1511b5 f1180t = new C1511b5("com.applovin.sdk.has_seen_but_not_accepted_privacy_policy", Boolean.class);

    /* JADX INFO: renamed from: u */
    public static final C1511b5 f1181u = new C1511b5("IABTCF_CmpSdkID", Object.class);

    /* JADX INFO: renamed from: v */
    public static final C1511b5 f1182v = new C1511b5("IABTCF_CmpSdkVersion", Object.class);

    /* JADX INFO: renamed from: w */
    public static final C1511b5 f1183w = new C1511b5(Cookie.IABTCF_GDPR_APPLIES, Object.class);

    /* JADX INFO: renamed from: x */
    public static final C1511b5 f1184x = new C1511b5("IABTCF_TCString", String.class);

    /* JADX INFO: renamed from: y */
    public static final C1511b5 f1185y = new C1511b5("IABTCF_AddtlConsent", String.class);

    /* JADX INFO: renamed from: z */
    public static final C1511b5 f1186z = new C1511b5("IABTCF_VendorConsents", String.class);

    /* JADX INFO: renamed from: A */
    public static final C1511b5 f1143A = new C1511b5("IABTCF_VendorLegitimateInterests", String.class);

    /* JADX INFO: renamed from: B */
    public static final C1511b5 f1144B = new C1511b5("IABTCF_PurposeConsents", String.class);

    /* JADX INFO: renamed from: C */
    public static final C1511b5 f1145C = new C1511b5("IABTCF_PurposeLegitimateInterests", String.class);

    /* JADX INFO: renamed from: D */
    public static final C1511b5 f1146D = new C1511b5("IABTCF_SpecialFeaturesOptIns", String.class);

    /* JADX INFO: renamed from: E */
    public static final C1511b5 f1147E = new C1511b5("com.applovin.sdk.impl.ad.persistence.queue", String.class);

    /* JADX INFO: renamed from: F */
    public static final C1511b5 f1148F = new C1511b5("com.applovin.sdk.mediation.signal_providers", String.class);

    /* JADX INFO: renamed from: G */
    public static final C1511b5 f1149G = new C1511b5("com.applovin.sdk.mediation.auto_init_adapters", String.class);

    /* JADX INFO: renamed from: H */
    public static final C1511b5 f1150H = new C1511b5("com.applovin.sdk.persisted_data", String.class);

    /* JADX INFO: renamed from: I */
    public static final C1511b5 f1151I = new C1511b5("com.applovin.sdk.mediation.test_mode_enabled", Boolean.class);

    /* JADX INFO: renamed from: J */
    public static final C1511b5 f1152J = new C1511b5("com.applovin.sdk.mediation.should_use_applovin_adaptive_sizing_formula", Boolean.class);

    /* JADX INFO: renamed from: K */
    public static final C1511b5 f1153K = new C1511b5("com.applovin.sdk.mediation.stats_per_ad_unit_since_install", String.class);

    /* JADX INFO: renamed from: L */
    public static final C1511b5 f1154L = new C1511b5("com.applovin.sdk.mediation.stats_per_ad_format_since_install", String.class);

    /* JADX INFO: renamed from: M */
    public static final C1511b5 f1155M = new C1511b5("com.applovin.sdk.user_agent", String.class);

    /* JADX INFO: renamed from: N */
    public static final C1511b5 f1156N = new C1511b5("com.applovin.sdk.last_fullscreen_ad_timestamp_ms", Long.class);

    /* JADX INFO: renamed from: O */
    public static final C1511b5 f1157O = new C1511b5("com.applovin.sdk.last_fullscreen_ad_duration_ms", Long.class);

    /* JADX INFO: renamed from: P */
    public static final C1511b5 f1158P = new C1511b5("com.applovin.sdk.app_killed_urls_from_last_ad", String.class);

    /* JADX INFO: renamed from: Q */
    public static final C1511b5 f1159Q = new C1511b5("com.applovin.sdk.app_killed_last_ad_data", String.class);

    /* JADX INFO: renamed from: R */
    public static final C1511b5 f1160R = new C1511b5("com.applovin.sdk.app_killed_last_mediated_ad_tracking_info", String.class);

    /* JADX INFO: renamed from: S */
    public static final C1511b5 f1161S = new C1511b5("com.applovin.sdk.last_mediated_fullscreen_ad_duration_ms", Long.class);

    /* JADX INFO: renamed from: T */
    public static final C1511b5 f1162T = new C1511b5("com.applovin.sdk.template_browser_package_name", String.class);

    public C1511b5(String str, Class cls) {
        this.f1187a = str;
        this.f1188b = cls;
    }

    /* JADX INFO: renamed from: a */
    public String m2109a() {
        return this.f1187a;
    }

    /* JADX INFO: renamed from: b */
    public Class m2110b() {
        return this.f1188b;
    }

    public String toString() {
        return "Key{name='" + this.f1187a + "', type=" + this.f1188b + AbstractJsonLexerKt.END_OBJ;
    }
}
