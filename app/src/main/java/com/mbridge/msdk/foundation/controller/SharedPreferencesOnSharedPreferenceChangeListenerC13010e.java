package com.mbridge.msdk.foundation.controller;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.vungle.ads.internal.model.Cookie;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.controller.e */
/* JADX INFO: compiled from: TCStringManager.java */
/* JADX INFO: loaded from: classes6.dex */
public class SharedPreferencesOnSharedPreferenceChangeListenerC13010e implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: i */
    private boolean f35546i;

    /* JADX INFO: renamed from: j */
    private boolean f35547j;

    /* JADX INFO: renamed from: k */
    private boolean f35548k;

    /* JADX INFO: renamed from: l */
    private boolean f35549l;

    /* JADX INFO: renamed from: m */
    private boolean f35550m;

    /* JADX INFO: renamed from: n */
    private boolean f35551n;

    /* JADX INFO: renamed from: o */
    private a f35552o;

    /* JADX INFO: renamed from: p */
    private final SharedPreferences f35553p;

    /* JADX INFO: renamed from: a */
    private String f35538a = "";

    /* JADX INFO: renamed from: b */
    private String f35539b = "";

    /* JADX INFO: renamed from: c */
    private String f35540c = "";

    /* JADX INFO: renamed from: d */
    private String f35541d = "";

    /* JADX INFO: renamed from: e */
    private String f35542e = "";

    /* JADX INFO: renamed from: f */
    private int f35543f = 0;

    /* JADX INFO: renamed from: g */
    private int f35544g = 0;

    /* JADX INFO: renamed from: h */
    private boolean f35545h = false;

    /* JADX INFO: renamed from: q */
    private List<String> f35554q = Arrays.asList(Cookie.IABTCF_GDPR_APPLIES, "IABTCF_TCString", "IABTCF_VendorConsents", "IABTCF_PurposeConsents", "IABTCF_AddtlConsent", "IABTCF_DisclosedVendors", "IABTCF_PolicyVersion");

    /* JADX INFO: renamed from: com.mbridge.msdk.foundation.controller.e$a */
    /* JADX INFO: compiled from: TCStringManager.java */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo36580a();
    }

    public SharedPreferencesOnSharedPreferenceChangeListenerC13010e(Context context) {
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(context.getApplicationContext());
        this.f35553p = defaultSharedPreferences;
        if (defaultSharedPreferences != null) {
            defaultSharedPreferences.registerOnSharedPreferenceChangeListener(this);
        }
        m36607a();
    }

    /* JADX INFO: renamed from: a */
    private void m36607a() {
        SharedPreferences sharedPreferences = this.f35553p;
        if (sharedPreferences != null) {
            m36618d(sharedPreferences.getString("IABTCF_TCString", ""));
            m36614b(this.f35553p.getInt(Cookie.IABTCF_GDPR_APPLIES, 0));
            m36616c(this.f35553p.getString("IABTCF_PurposeConsents", ""));
            m36619e(this.f35553p.getString("IABTCF_VendorConsents", ""));
            m36615b(this.f35553p.getString("IABTCF_AddtlConsent", ""));
            m36610a(this.f35553p.getInt("IABTCF_PolicyVersion", 0));
            m36620f(this.f35553p.getString("IABTCF_DisclosedVendors", ""));
        }
    }

    /* JADX INFO: renamed from: b */
    public String m36613b() {
        return this.f35538a;
    }

    /* JADX INFO: renamed from: c */
    public void m36616c(String str) {
        this.f35546i = m36609a(str, 1);
        this.f35547j = m36609a(str, 2);
        this.f35539b = str;
    }

    /* JADX INFO: renamed from: d */
    public void m36618d(String str) {
        this.f35538a = str;
    }

    /* JADX INFO: renamed from: e */
    public void m36619e(String str) {
        this.f35548k = m36609a(str, 867);
        this.f35540c = str;
    }

    /* JADX INFO: renamed from: f */
    public void m36620f(String str) {
        this.f35551n = m36609a(str, 867);
        this.f35542e = str;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:34:0x0061  */
    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            List<String> list = this.f35554q;
            if (list == null || list.contains(str)) {
                switch (str) {
                    case "IABTCF_TCString":
                        m36618d(sharedPreferences.getString("IABTCF_TCString", ""));
                        break;
                    case "IABTCF_gdprApplies":
                        m36614b(sharedPreferences.getInt(Cookie.IABTCF_GDPR_APPLIES, 0));
                        break;
                    case "IABTCF_PurposeConsents":
                        m36616c(sharedPreferences.getString("IABTCF_PurposeConsents", ""));
                        break;
                    case "IABTCF_VendorConsents":
                        m36619e(sharedPreferences.getString("IABTCF_VendorConsents", ""));
                        break;
                    case "IABTCF_AddtlConsent":
                        m36615b(sharedPreferences.getString("IABTCF_AddtlConsent", ""));
                        break;
                    case "IABTCF_PolicyVersion":
                        m36610a(sharedPreferences.getInt("IABTCF_PolicyVersion", 0));
                        break;
                    case "IABTCF_DisclosedVendors":
                        m36620f(sharedPreferences.getString("IABTCF_DisclosedVendors", ""));
                        break;
                }
                a aVar = this.f35552o;
                if (aVar != null) {
                    aVar.mo36580a();
                }
            }
        } catch (Throwable th) {
            C13219q0.m37816b("TCStringManager", th.getMessage());
        }
    }

    /* JADX INFO: renamed from: b */
    public void m36614b(int i) {
        this.f35543f = i;
    }

    /* JADX INFO: renamed from: b */
    public void m36615b(String str) {
        this.f35541d = str;
        if (TextUtils.isEmpty(str)) {
            this.f35549l = true;
            return;
        }
        if (MBridgeConstans.GOOGLE_ATP_ID == -1) {
            this.f35550m = false;
            return;
        }
        this.f35550m = true;
        try {
            String[] strArrSplit = str.split("~");
            if (strArrSplit.length > 1) {
                if (TextUtils.isEmpty(strArrSplit[1])) {
                    this.f35549l = false;
                } else {
                    this.f35549l = str.contains(String.valueOf(MBridgeConstans.GOOGLE_ATP_ID));
                }
            }
        } catch (Throwable th) {
            C13219q0.m37816b("TCStringManager", th.getMessage());
        }
    }

    /* JADX INFO: renamed from: c */
    public boolean m36617c() {
        if (this.f35543f == 0) {
            m36612a(true);
            return this.f35545h;
        }
        if (MBridgeConstans.VERIFY_ATP_CONSENT) {
            m36612a((this.f35548k || (this.f35550m && this.f35549l)) && this.f35546i && this.f35547j);
        } else if (this.f35544g >= 5) {
            m36612a(this.f35551n && this.f35548k && this.f35546i && this.f35547j);
        } else {
            m36612a(this.f35548k && this.f35546i && this.f35547j);
        }
        return this.f35545h;
    }

    /* JADX INFO: renamed from: a */
    public void m36611a(a aVar) {
        if (aVar != null) {
            this.f35552o = aVar;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m36610a(int i) {
        this.f35544g = i;
    }

    /* JADX INFO: renamed from: a */
    public void m36612a(boolean z) {
        this.f35545h = z;
    }

    /* JADX INFO: renamed from: a */
    private boolean m36608a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.matches("[01]+");
    }

    /* JADX INFO: renamed from: a */
    private boolean m36609a(String str, int i) {
        return m36608a(str) && i <= str.length() && i >= 1 && '1' == str.charAt(i - 1);
    }
}
