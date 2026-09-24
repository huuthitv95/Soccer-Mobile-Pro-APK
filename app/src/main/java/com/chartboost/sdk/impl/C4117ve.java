package com.chartboost.sdk.impl;

import com.chartboost.sdk.privacy.model.COPPA;
import com.chartboost.sdk.privacy.model.DataUseConsent;
import com.chartboost.sdk.privacy.model.GDPR;
import com.ironsource.C11794a2;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.ve */
/* JADX INFO: loaded from: classes3.dex */
public class C4117ve {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3758ff f16605a;

    /* JADX INFO: renamed from: b */
    public final C4089u8 f16606b;

    /* JADX INFO: renamed from: c */
    public final C3896lf f16607c;

    /* JADX INFO: renamed from: d */
    public final C4111v8 f16608d;

    /* JADX INFO: renamed from: e */
    public final C4133w8 f16609e;

    /* JADX INFO: renamed from: f */
    public final C3783gh f16610f;

    /* JADX INFO: renamed from: g */
    public final C4067t8 f16611g;

    /* JADX INFO: renamed from: h */
    public final String f16612h;

    /* JADX INFO: renamed from: i */
    public C3920mg.b f16613i;

    public C4117ve(InterfaceC3758ff interfaceC3758ff, C4089u8 c4089u8, C3896lf c3896lf, C4111v8 c4111v8, C4133w8 c4133w8, C3783gh c3783gh, C4067t8 c4067t8, String str) {
        this.f16605a = interfaceC3758ff;
        this.f16606b = c4089u8;
        this.f16607c = c3896lf;
        this.f16608d = c4111v8;
        this.f16609e = c4133w8;
        this.f16610f = c3783gh;
        this.f16611g = c4067t8;
        this.f16612h = str;
    }

    /* JADX INFO: renamed from: a */
    public int m19696a() {
        return m19703d().equals(GDPR.GDPR_CONSENT.BEHAVIORAL.getValue()) ? 1 : 0;
    }

    /* JADX INFO: renamed from: a */
    public DataUseConsent m19697a(String str) {
        C4089u8 c4089u8 = this.f16606b;
        if (c4089u8 != null) {
            return c4089u8.m19576a(str);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void m19698a(C3920mg.b bVar) {
        this.f16613i = bVar;
    }

    /* JADX INFO: renamed from: a */
    public void m19699a(DataUseConsent dataUseConsent) {
        InterfaceC3758ff interfaceC3758ff = this.f16605a;
        if (interfaceC3758ff != null) {
            interfaceC3758ff.mo17728a(dataUseConsent);
        }
    }

    /* JADX INFO: renamed from: b */
    public Integer m19700b() {
        COPPA coppa = (COPPA) m19697a(COPPA.COPPA_STANDARD);
        if (coppa != null) {
            return coppa.getConsent().booleanValue() ? 1 : 0;
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public void m19701b(String str) {
        C3896lf c3896lf = this.f16607c;
        if (c3896lf != null) {
            c3896lf.m18510a(str);
        }
    }

    /* JADX INFO: renamed from: c */
    public int m19702c() {
        return !m19703d().equals(C11794a2.f26725f) ? 1 : 0;
    }

    /* JADX INFO: renamed from: d */
    public String m19703d() {
        DataUseConsent dataUseConsentM19576a = this.f16606b.m19576a(GDPR.GDPR_STANDARD);
        return dataUseConsentM19576a == null ? C11794a2.f26725f : (String) dataUseConsentM19576a.getConsent();
    }

    /* JADX INFO: renamed from: e */
    public JSONObject m19704e() {
        List listM19705f = m19705f();
        C4111v8 c4111v8 = this.f16608d;
        if (c4111v8 == null || listM19705f == null) {
            return null;
        }
        return c4111v8.m19673a(listM19705f);
    }

    /* JADX INFO: renamed from: f */
    public List m19705f() {
        C3920mg.b bVar;
        C4133w8 c4133w8 = this.f16609e;
        if (c4133w8 == null || (bVar = this.f16613i) == null) {
            return null;
        }
        return c4133w8.m19768a(bVar);
    }

    /* JADX INFO: renamed from: g */
    public C4139we m19706g() {
        return new C4139we(Integer.valueOf(m19696a()), m19705f(), Integer.valueOf(m19702c()), m19700b(), m19704e(), m19703d(), this.f16610f.m17811a(), this.f16611g.m19463b(), this.f16611g.m19462a());
    }
}
