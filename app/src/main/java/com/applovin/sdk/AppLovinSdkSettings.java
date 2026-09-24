package com.applovin.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.applovin.impl.AbstractC1701q7;
import com.applovin.impl.C1548f2;
import com.applovin.impl.C1791v0;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1749m;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.facebook.internal.security.CertificateUtil;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class AppLovinSdkSettings {

    /* JADX INFO: renamed from: a */
    private boolean f4213a;

    /* JADX INFO: renamed from: b */
    private boolean f4214b;

    /* JADX INFO: renamed from: e */
    private String f4217e;

    /* JADX INFO: renamed from: f */
    private String f4218f;

    /* JADX INFO: renamed from: g */
    private String f4219g;

    /* JADX INFO: renamed from: j */
    private final AppLovinTermsAndPrivacyPolicyFlowSettings f4222j;

    /* JADX INFO: renamed from: k */
    private C1748l f4223k;

    /* JADX INFO: renamed from: l */
    private String f4224l;

    /* JADX INFO: renamed from: d */
    private boolean f4216d = true;

    /* JADX INFO: renamed from: h */
    private final Map f4220h = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: i */
    private final Map f4221i = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: c */
    private boolean f4215c = true;

    AppLovinSdkSettings(Context context) {
        this.f4224l = "";
        if (context == null) {
            C1768p.m5167h("AppLovinSdkSettings", "context cannot be null. Please provide a valid context.");
        }
        Context contextM4101e = AbstractC1701q7.m4101e(context);
        this.f4213a = AbstractC1701q7.m4120m(contextM4101e);
        this.f4222j = C1791v0.m5333a(contextM4101e);
        this.f4224l = contextM4101e.getPackageName();
        m5810a(contextM4101e);
    }

    /* JADX INFO: renamed from: a */
    private void m5810a(Context context) {
        int identifier = context.getResources().getIdentifier("applovin_settings", "raw", context.getPackageName());
        if (identifier == 0) {
            return;
        }
        String strM4028a = AbstractC1701q7.m4028a(identifier, context, (C1748l) null);
        this.f4220h.putAll(JsonUtils.tryToStringMap(StringUtils.isValidString(strM4028a) ? JsonUtils.jsonObjectFromJsonString(strM4028a, new JSONObject()) : new JSONObject()));
    }

    public void attachAppLovinSdk(C1748l c1748l) {
        this.f4223k = c1748l;
        if (StringUtils.isValidString(this.f4217e)) {
            c1748l.m4857u0().m2925a(Arrays.asList(this.f4217e.split(",")));
            this.f4217e = null;
        }
        if (this.f4218f != null) {
            c1748l.m4782Q();
            if (C1768p.m5160a()) {
                c1748l.m4782Q().m5171a("AppLovinSdkSettings", "Setting user id: " + this.f4218f);
            }
            c1748l.m4865y0().m3892a(this.f4218f);
            this.f4218f = null;
        }
        if (StringUtils.isValidString(this.f4219g)) {
            C1749m.m4901a(this.f4219g, c1748l);
            this.f4219g = null;
        }
        for (Map.Entry entry : this.f4221i.entrySet()) {
            c1748l.m4863x0().m2678a(C1548f2.f1544k, "preInitExtraParameter", CollectionUtils.hashMap("details", ((String) entry.getKey()) + CertificateUtil.DELIMITER + ((String) entry.getValue())));
        }
        this.f4221i.clear();
    }

    public Map<String, String> getExtraParameters() {
        Map<String, String> map;
        synchronized (this.f4220h) {
            map = CollectionUtils.map(this.f4220h);
        }
        return map;
    }

    public AppLovinTermsAndPrivacyPolicyFlowSettings getTermsAndPrivacyPolicyFlowSettings() {
        return this.f4222j;
    }

    public String getUserIdentifier() {
        C1748l c1748l = this.f4223k;
        return c1748l == null ? this.f4218f : c1748l.m4865y0().m3898e();
    }

    public boolean isCreativeDebuggerEnabled() {
        return this.f4215c;
    }

    public boolean isMuted() {
        return this.f4214b;
    }

    public boolean isVerboseLoggingEnabled() {
        return this.f4213a;
    }

    public void setCreativeDebuggerEnabled(boolean z) {
        C1768p.m5165e("AppLovinSdkSettings", "setCreativeDebuggerEnabled(creativeDebuggerEnabled=" + z + ")");
        if (this.f4215c == z) {
            return;
        }
        this.f4215c = z;
        C1748l c1748l = this.f4223k;
        if (c1748l == null) {
            return;
        }
        if (z) {
            c1748l.m4866z().m2563l();
        } else {
            c1748l.m4866z().m2562k();
        }
    }

    public void setExtraParameter(String str, String str2) {
        C1768p.m5165e("AppLovinSdkSettings", "setExtraParameter(key=" + str + ", value=" + str2 + ")");
        if (TextUtils.isEmpty(str)) {
            C1768p.m5167h("AppLovinSdkSettings", "Failed to set extra parameter for null or empty key: " + str);
            return;
        }
        String strTrim = str2 != null ? str2.trim() : null;
        if ("test_mode_network".equalsIgnoreCase(str)) {
            if (this.f4223k == null) {
                this.f4217e = strTrim;
            } else if (StringUtils.isValidString(strTrim)) {
                this.f4223k.m4857u0().m2925a(Arrays.asList(strTrim.split(",")));
            } else {
                this.f4223k.m4857u0().m2924a((String) null);
            }
        } else if ("fan".equals(str) || "esc".equals(str)) {
            if (!this.f4224l.startsWith("com.unity.")) {
                return;
            }
        } else if ("disable_all_logs".equals(str)) {
            C1768p.m5159a(Boolean.parseBoolean(strTrim));
        } else if ("package_name_override".equals(str)) {
            C1748l c1748l = this.f4223k;
            if (c1748l != null) {
                C1749m.m4901a(strTrim, c1748l);
            } else {
                this.f4219g = strTrim;
            }
        }
        if (this.f4223k != null) {
            this.f4223k.m4863x0().m2678a(C1548f2.f1544k, "postInitExtraParameter", CollectionUtils.hashMap("details", str + CertificateUtil.DELIMITER + str2));
        } else {
            this.f4221i.put(str, strTrim);
        }
        this.f4220h.put(str, strTrim);
    }

    public void setMuted(boolean z) {
        C1768p.m5165e("AppLovinSdkSettings", "setMuted(muted=" + z + ")");
        this.f4214b = z;
    }

    public void setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled(boolean z) {
        C1768p.m5165e("AppLovinSdkSettings", "setShouldFailAdDisplayIfDontKeepActivitiesIsEnabled(shouldFailAdDisplayIfDontKeepActivitiesIsEnabled=" + z + ")");
        this.f4216d = z;
    }

    public void setUserIdentifier(String str) {
        C1768p.m5165e("AppLovinSdkSettings", "setUserIdentifier(userIdentifier=" + str + ")");
        if (StringUtils.isValidString(str) && str.length() > AbstractC1701q7.m4094d(8)) {
            C1768p.m5167h("AppLovinSdk", "Provided user id longer than supported (" + str.length() + " bytes, " + AbstractC1701q7.m4094d(8) + " maximum)");
        }
        C1748l c1748l = this.f4223k;
        if (c1748l == null) {
            this.f4218f = str;
            return;
        }
        c1748l.m4782Q();
        if (C1768p.m5160a()) {
            this.f4223k.m4782Q().m5171a("AppLovinSdkSettings", "Setting user id: " + str);
        }
        this.f4223k.m4865y0().m3892a(str);
    }

    public void setVerboseLogging(boolean z) {
        C1768p.m5165e("AppLovinSdkSettings", "setVerboseLogging(isVerboseLoggingEnabled=" + z + ")");
        if (!AbstractC1701q7.m4118l()) {
            this.f4213a = z;
            return;
        }
        C1768p.m5167h("AppLovinSdkSettings", "Ignoring setting of verbose logging - it is configured from Android manifest already.");
        if (AbstractC1701q7.m4120m(null) != z) {
            C1768p.m5167h("AppLovinSdkSettings", "Attempted to programmatically set verbose logging flag to value different from value configured in Android Manifest.");
        }
    }

    public boolean shouldFailAdDisplayIfDontKeepActivitiesIsEnabled() {
        return this.f4216d;
    }

    public String toString() {
        return "AppLovinSdkSettings{isVerboseLoggingEnabled=" + this.f4213a + ", muted=" + this.f4214b + ", creativeDebuggerEnabled=" + this.f4215c + AbstractJsonLexerKt.END_OBJ;
    }
}
