package com.fyber.inneractive.sdk.config;

import android.app.Application;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.util.AbstractC9174o;
import com.fyber.inneractive.sdk.util.IAlog;
import com.vungle.ads.internal.model.Cookie;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.config.g */
/* JADX INFO: loaded from: classes4.dex */
public final class C7965g {

    /* JADX INFO: renamed from: k */
    public SharedPreferences f17739k;

    /* JADX INFO: renamed from: l */
    public SharedPreferences f17740l;

    /* JADX INFO: renamed from: a */
    public Boolean f17729a = null;

    /* JADX INFO: renamed from: b */
    public Boolean f17730b = null;

    /* JADX INFO: renamed from: c */
    public Boolean f17731c = null;

    /* JADX INFO: renamed from: d */
    public String f17732d = null;

    /* JADX INFO: renamed from: e */
    public String f17733e = null;

    /* JADX INFO: renamed from: f */
    public InneractiveAdManager.GdprConsentSource f17734f = null;

    /* JADX INFO: renamed from: g */
    public String f17735g = null;

    /* JADX INFO: renamed from: h */
    public String f17736h = null;

    /* JADX INFO: renamed from: i */
    public Boolean f17737i = null;

    /* JADX INFO: renamed from: j */
    public Boolean f17738j = null;

    /* JADX INFO: renamed from: m */
    public Boolean f17741m = null;

    /* JADX INFO: renamed from: a */
    public final void m20399a() {
        IAlog.m21945a("Clearing GDPR Consent String and status", new Object[0]);
        if (AbstractC9174o.f21470a == null) {
            IAlog.m21950f("ClearGdprConsent was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
            return;
        }
        m20408g();
        this.f17729a = null;
        this.f17732d = null;
        SharedPreferences sharedPreferences = this.f17739k;
        if (sharedPreferences != null) {
            sharedPreferences.edit().remove("IAGdprConsentData").remove("IAGDPRBool").remove("IAGdprSource").apply();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m20400a(String str) {
        if (AbstractC9174o.f21470a != null) {
            m20408g();
            if (TextUtils.isEmpty(str)) {
                this.f17735g = str;
                SharedPreferences sharedPreferences = this.f17739k;
                if (sharedPreferences != null) {
                    sharedPreferences.edit().remove("keyUserID").apply();
                    return;
                }
                return;
            }
            if (str.length() > 512) {
                str = str.substring(0, 512);
            }
            SharedPreferences sharedPreferences2 = this.f17739k;
            if (sharedPreferences2 != null) {
                this.f17735g = str;
                sharedPreferences2.edit().putString("keyUserID", str).apply();
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m20401a(String str, String str2) {
        if (AbstractC9174o.f21470a == null) {
            return false;
        }
        m20408g();
        if (this.f17739k == null) {
            return false;
        }
        IAlog.m21945a("Saving %s value = %s to sharedPrefs", str, str2);
        this.f17739k.edit().putString(str, str2).apply();
        return true;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m20402a(boolean z, String str) {
        if (AbstractC9174o.f21470a == null) {
            return false;
        }
        m20408g();
        SharedPreferences sharedPreferences = this.f17739k;
        if (sharedPreferences == null) {
            return false;
        }
        sharedPreferences.edit().putBoolean(str, z).apply();
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m20403b() {
        IAlog.m21945a("Clearing LGPD consent status", new Object[0]);
        if (AbstractC9174o.f21470a == null) {
            IAlog.m21950f("clearLgpdConsentStatus was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
            return;
        }
        m20408g();
        this.f17737i = null;
        SharedPreferences sharedPreferences = this.f17739k;
        if (sharedPreferences != null) {
            sharedPreferences.edit().remove("IALgpdConsentStatus").apply();
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m20404c() {
        IAlog.m21945a("Clearing CCPA Consent String", new Object[0]);
        if (AbstractC9174o.f21470a == null) {
            IAlog.m21950f("clearUSPrivacyString was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
            return;
        }
        m20408g();
        this.f17736h = null;
        SharedPreferences sharedPreferences = this.f17739k;
        if (sharedPreferences != null) {
            sharedPreferences.edit().remove("IACCPAConsentData").apply();
        }
    }

    /* JADX INFO: renamed from: d */
    public final Boolean m20405d() {
        if (this.f17729a == null) {
            this.f17730b = m20409h();
        }
        if (AbstractC9174o.f21470a == null) {
            return null;
        }
        Boolean bool = this.f17729a;
        return bool == null ? this.f17730b : bool;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m20406e() {
        int i;
        Boolean bool = this.f17741m;
        if (bool != null) {
            return bool.booleanValue();
        }
        SharedPreferences sharedPreferences = this.f17740l;
        if (sharedPreferences == null) {
            return true;
        }
        this.f17741m = Boolean.TRUE;
        try {
            i = sharedPreferences.getInt(Cookie.IABTCF_GDPR_APPLIES, -1);
        } catch (Exception unused) {
            IAlog.m21945a("%sException caught when trying to read INT isGdprApplies from prefs", IAlog.m21943a(this));
            i = -1;
        }
        if (i != -1) {
            this.f17741m = Boolean.valueOf(i == 1);
        } else {
            try {
                this.f17741m = Boolean.valueOf(this.f17740l.getBoolean(Cookie.IABTCF_GDPR_APPLIES, true));
            } catch (Exception unused2) {
                IAlog.m21945a("%sException caught when trying to read BOOLEAN isGdprApplies from prefs", IAlog.m21943a(this));
            }
        }
        return this.f17741m.booleanValue();
    }

    /* JADX INFO: renamed from: f */
    public final boolean m20407f() {
        C8021o c8021o;
        SharedPreferences sharedPreferences;
        if (this.f17731c == null) {
            boolean z = true;
            if (m20406e()) {
                C8040s c8040s = IAConfigManager.f17654M.f17688t;
                if (c8040s != null && (c8021o = c8040s.f17862b) != null && c8021o.m20443a("TcfPurpose1", 1, Integer.MIN_VALUE) == 1 && (sharedPreferences = this.f17740l) != null) {
                    try {
                        String string = sharedPreferences.getString("IABTCF_PurposeConsents", null);
                        if (string == null || string.isEmpty() || string.charAt(0) != '0') {
                        }
                    } catch (Exception unused) {
                        IAlog.m21946b("%sException caught when trying to resolveIsIabGdprPurpose1Disabled from prefs", IAlog.m21943a(this));
                    }
                }
                this.f17731c = Boolean.valueOf(z);
            } else {
                IAlog.m21945a("%sGDPR does not apply - returning false for GDPR Purpose1Disabled", IAlog.m21943a(this));
            }
            z = false;
            this.f17731c = Boolean.valueOf(z);
        }
        return this.f17731c.booleanValue();
    }

    /* JADX INFO: renamed from: g */
    public final void m20408g() {
        Application application = AbstractC9174o.f21470a;
        if (application != null) {
            if (this.f17740l == null) {
                this.f17740l = application.getSharedPreferences(application.getPackageName() + "_preferences", 0);
            }
            if (this.f17739k == null) {
                SharedPreferences sharedPreferences = application.getSharedPreferences("IAConfigurationPreferences", 0);
                this.f17739k = sharedPreferences;
                if (sharedPreferences != null) {
                    this.f17741m = Boolean.valueOf(m20406e());
                    if (sharedPreferences.contains("IAGDPRBool")) {
                        this.f17729a = Boolean.valueOf(sharedPreferences.getBoolean("IAGDPRBool", false));
                    } else {
                        this.f17730b = m20409h();
                    }
                    if (sharedPreferences.contains("IAGdprConsentData")) {
                        this.f17732d = sharedPreferences.getString("IAGdprConsentData", null);
                    } else {
                        this.f17733e = m20410i();
                    }
                    if (sharedPreferences.contains("IACCPAConsentData")) {
                        this.f17736h = sharedPreferences.getString("IACCPAConsentData", null);
                    }
                    if (sharedPreferences.contains("IAGdprSource")) {
                        try {
                            this.f17734f = InneractiveAdManager.GdprConsentSource.valueOf(sharedPreferences.getString("IAGdprSource", InneractiveAdManager.GdprConsentSource.Internal.toString()));
                        } catch (Exception unused) {
                            this.f17734f = InneractiveAdManager.GdprConsentSource.Internal;
                        }
                    }
                    if (sharedPreferences.contains("IALgpdConsentStatus")) {
                        this.f17737i = Boolean.valueOf(sharedPreferences.getBoolean("IALgpdConsentStatus", false));
                    }
                    if (sharedPreferences.contains("keyUserID")) {
                        this.f17735g = sharedPreferences.getString("keyUserID", null);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final Boolean m20409h() {
        C8021o c8021o;
        SharedPreferences sharedPreferences;
        boolean z = false;
        if (!m20406e()) {
            IAlog.m21945a("%sGDPR does not apply - returning null for GDPR consent status", IAlog.m21943a(this));
            return null;
        }
        C8040s c8040s = IAConfigManager.f17654M.f17688t;
        if (c8040s != null && (c8021o = c8040s.f17862b) != null) {
            int iM20443a = c8021o.m20443a("TcfVendorId", 262, Integer.MIN_VALUE);
            if (iM20443a != 0 && (sharedPreferences = this.f17740l) != null) {
                try {
                    String string = sharedPreferences.getString("IABTCF_VendorConsents", null);
                    if (string == null) {
                        return null;
                    }
                    int i = (iM20443a >= 0 ? iM20443a : 262) - 1;
                    if (string.length() > i && string.charAt(i) == '1') {
                        z = true;
                    }
                    return Boolean.valueOf(z);
                } catch (Exception unused) {
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final String m20410i() {
        SharedPreferences sharedPreferences;
        if (!m20406e()) {
            IAlog.m21945a("%sGDPR does not apply - returning null for GDPR consent string", IAlog.m21943a(this));
            return null;
        }
        if (IAConfigManager.f17654M.f17688t.f17862b.m20443a("TcfVendorId", 262, Integer.MIN_VALUE) != 0 && (sharedPreferences = this.f17740l) != null && sharedPreferences.contains("IABTCF_TCString")) {
            try {
                return this.f17740l.getString("IABTCF_TCString", null);
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
