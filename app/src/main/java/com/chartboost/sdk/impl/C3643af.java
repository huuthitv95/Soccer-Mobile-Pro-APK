package com.chartboost.sdk.impl;

import android.content.SharedPreferences;
import com.chartboost.sdk.privacy.model.CCPA;
import com.chartboost.sdk.privacy.model.COPPA;
import com.chartboost.sdk.privacy.model.Custom;
import com.chartboost.sdk.privacy.model.DataUseConsent;
import com.chartboost.sdk.privacy.model.GDPR;
import com.chartboost.sdk.privacy.model.LGPD;
import com.ironsource.C11744X3;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.af */
/* JADX INFO: loaded from: classes3.dex */
public class C3643af {

    /* JADX INFO: renamed from: a */
    public final HashMap f13469a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final SharedPreferences f13470b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC3888l7 f13471c;

    public C3643af(SharedPreferences sharedPreferences, InterfaceC3888l7 interfaceC3888l7) {
        this.f13470b = sharedPreferences;
        this.f13471c = interfaceC3888l7;
        m16838b();
    }

    /* JADX INFO: renamed from: a */
    public HashMap m16833a() {
        return this.f13469a;
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m16834a(DataUseConsent dataUseConsent) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("privacyStandard", dataUseConsent.getPrivacyStandard());
            jSONObject.put(C11744X3.j.f26435b0, dataUseConsent.getConsent());
            return jSONObject;
        } catch (JSONException e) {
            e.printStackTrace();
            return jSONObject;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m16835a(SharedPreferences sharedPreferences, JSONArray jSONArray) {
        if (sharedPreferences == null || jSONArray == null) {
            return;
        }
        sharedPreferences.edit().putString("privacy_standards", jSONArray.toString()).apply();
    }

    /* JADX INFO: renamed from: a */
    public void m16836a(String str) {
        this.f13469a.remove(str);
        m16841c();
    }

    /* JADX INFO: renamed from: a */
    public final void m16837a(JSONException jSONException) {
        this.f13471c.mo43989track(C3954o5.m18875a(InterfaceC3807hi.d.DECODING_ERROR, jSONException.getMessage(), "", ""));
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0073  */
    /* JADX WARN: Code duplicated, block: B:50:0x00e7  */
    /* JADX INFO: renamed from: b */
    public final void m16838b() {
        byte b;
        DataUseConsent gdpr;
        SharedPreferences sharedPreferences = this.f13470b;
        if (sharedPreferences != null) {
            String string = sharedPreferences.getString("privacy_standards", "");
            if (string.isEmpty()) {
                return;
            }
            try {
                JSONArray jSONArray = new JSONArray(string);
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i);
                    String string2 = jSONObject.getString("privacyStandard");
                    String string3 = jSONObject.getString(C11744X3.j.f26435b0);
                    int iHashCode = string2.hashCode();
                    if (iHashCode != -1172350233) {
                        if (iHashCode != 3168159) {
                            if (iHashCode != 3319983) {
                                if (iHashCode == 94846581 && string2.equals(COPPA.COPPA_STANDARD)) {
                                    b = 2;
                                } else {
                                    b = -1;
                                }
                            } else if (string2.equals(LGPD.LGPD_STANDARD)) {
                                b = 3;
                            } else {
                                b = -1;
                            }
                        } else if (string2.equals(GDPR.GDPR_STANDARD)) {
                            b = 0;
                        } else {
                            b = -1;
                        }
                    } else if (string2.equals(CCPA.CCPA_STANDARD)) {
                        b = 1;
                    } else {
                        b = -1;
                    }
                    if (b == 0) {
                        GDPR.GDPR_CONSENT gdpr_consent = GDPR.GDPR_CONSENT.BEHAVIORAL;
                        if (gdpr_consent.getValue().equals(string3)) {
                            gdpr = new GDPR(gdpr_consent);
                        } else {
                            GDPR.GDPR_CONSENT gdpr_consent2 = GDPR.GDPR_CONSENT.NON_BEHAVIORAL;
                            if (gdpr_consent2.getValue().equals(string3)) {
                                gdpr = new GDPR(gdpr_consent2);
                            } else {
                                gdpr = null;
                            }
                        }
                    } else if (b == 1) {
                        CCPA.CCPA_CONSENT ccpa_consent = CCPA.CCPA_CONSENT.OPT_IN_SALE;
                        if (ccpa_consent.getValue().equals(string3)) {
                            gdpr = new CCPA(ccpa_consent);
                        } else {
                            CCPA.CCPA_CONSENT ccpa_consent2 = CCPA.CCPA_CONSENT.OPT_OUT_SALE;
                            if (ccpa_consent2.getValue().equals(string3)) {
                                gdpr = new CCPA(ccpa_consent2);
                            } else {
                                gdpr = null;
                            }
                        }
                    } else if (b != 2) {
                        gdpr = b != 3 ? new Custom(jSONObject.getString("privacyStandard"), jSONObject.getString(C11744X3.j.f26435b0)) : new LGPD(jSONObject.getBoolean(C11744X3.j.f26435b0));
                    } else {
                        gdpr = new COPPA(jSONObject.getBoolean(C11744X3.j.f26435b0));
                    }
                    if (gdpr != null) {
                        this.f13469a.put(gdpr.getPrivacyStandard(), gdpr);
                    } else {
                        m16840b(string2);
                        C4048sb.m19407a("Failed to load consent: " + string2, null);
                    }
                }
            } catch (JSONException e) {
                m16837a(e);
                e.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m16839b(DataUseConsent dataUseConsent) {
        C4048sb.m19407a("Added privacy standard: " + dataUseConsent.getPrivacyStandard() + " with consent: " + dataUseConsent.getConsent(), null);
        this.f13469a.put(dataUseConsent.getPrivacyStandard(), dataUseConsent);
        m16841c();
    }

    /* JADX INFO: renamed from: b */
    public final void m16840b(String str) {
        this.f13471c.mo43989track(C3954o5.m18875a(InterfaceC3807hi.d.PERSISTED_DATA_READING_ERROR, str, "", ""));
    }

    /* JADX INFO: renamed from: c */
    public final void m16841c() {
        if (this.f13470b != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator it = this.f13469a.values().iterator();
            while (it.hasNext()) {
                jSONArray.put(m16834a((DataUseConsent) it.next()));
            }
            m16835a(this.f13470b, jSONArray);
        }
    }
}
