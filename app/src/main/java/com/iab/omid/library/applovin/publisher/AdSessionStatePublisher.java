package com.iab.omid.library.applovin.publisher;

import android.webkit.WebView;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.iab.omid.library.applovin.adsession.AdEvents;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.C10919a;
import com.iab.omid.library.applovin.adsession.ErrorType;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.iab.omid.library.applovin.adsession.media.MediaEvents;
import com.iab.omid.library.applovin.internal.C10933g;
import com.iab.omid.library.applovin.internal.C10934h;
import com.iab.omid.library.applovin.utils.C10944a;
import com.iab.omid.library.applovin.utils.C10945b;
import com.iab.omid.library.applovin.utils.C10946c;
import com.iab.omid.library.applovin.utils.C10949f;
import com.iab.omid.library.applovin.weakreference.C10966b;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class AdSessionStatePublisher {

    /* JADX INFO: renamed from: a */
    private String f22739a;

    /* JADX INFO: renamed from: b */
    private C10966b f22740b;

    /* JADX INFO: renamed from: c */
    private AdEvents f22741c;

    /* JADX INFO: renamed from: d */
    private MediaEvents f22742d;

    /* JADX INFO: renamed from: e */
    private EnumC10941a f22743e;

    /* JADX INFO: renamed from: f */
    private long f22744f;

    /* JADX INFO: renamed from: com.iab.omid.library.applovin.publisher.AdSessionStatePublisher$a */
    enum EnumC10941a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher(String str) {
        m23291a();
        this.f22739a = str;
        this.f22740b = new C10966b(null);
    }

    /* JADX INFO: renamed from: a */
    public void m23291a() {
        this.f22744f = C10949f.m23352b();
        this.f22743e = EnumC10941a.AD_STATE_IDLE;
    }

    /* JADX INFO: renamed from: a */
    public void m23292a(float f) {
        C10934h.m23253a().m23255a(getWebView(), this.f22739a, f);
    }

    /* JADX INFO: renamed from: a */
    void m23293a(WebView webView) {
        this.f22740b = new C10966b(webView);
    }

    /* JADX INFO: renamed from: a */
    public void m23294a(AdEvents adEvents) {
        this.f22741c = adEvents;
    }

    /* JADX INFO: renamed from: a */
    public void m23295a(AdSessionConfiguration adSessionConfiguration) {
        C10934h.m23253a().m23259a(getWebView(), this.f22739a, adSessionConfiguration.toJsonObject());
    }

    /* JADX INFO: renamed from: a */
    public void m23296a(ErrorType errorType, String str) {
        C10934h.m23253a().m23256a(getWebView(), this.f22739a, errorType, str);
    }

    /* JADX INFO: renamed from: a */
    public void mo23297a(C10919a c10919a, AdSessionContext adSessionContext) {
        m23298a(c10919a, adSessionContext, null);
    }

    /* JADX INFO: renamed from: a */
    protected void m23298a(C10919a c10919a, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String strM23181c = c10919a.m23181c();
        JSONObject jSONObject2 = new JSONObject();
        C10946c.m23332a(jSONObject2, "environment", MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        C10946c.m23332a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        C10946c.m23332a(jSONObject2, "deviceInfo", C10945b.m23323d());
        C10946c.m23332a(jSONObject2, "deviceCategory", C10944a.m23318a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C10946c.m23332a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C10946c.m23332a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, adSessionContext.getPartner().getName());
        C10946c.m23332a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, adSessionContext.getPartner().getVersion());
        C10946c.m23332a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C10946c.m23332a(jSONObject4, "libraryVersion", "1.5.3-Applovin");
        C10946c.m23332a(jSONObject4, RemoteConfigConstants.RequestFieldKey.APP_ID, C10933g.m23250b().m23251a().getApplicationContext().getPackageName());
        C10946c.m23332a(jSONObject2, MBridgeConstans.DYNAMIC_VIEW_WX_APP, jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            C10946c.m23332a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            C10946c.m23332a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource verificationScriptResource : adSessionContext.getVerificationScriptResources()) {
            C10946c.m23332a(jSONObject5, verificationScriptResource.getVendorKey(), verificationScriptResource.getVerificationParameters());
        }
        C10934h.m23253a().m23260a(getWebView(), strM23181c, jSONObject2, jSONObject5, jSONObject);
    }

    /* JADX INFO: renamed from: a */
    public void m23299a(MediaEvents mediaEvents) {
        this.f22742d = mediaEvents;
    }

    /* JADX INFO: renamed from: a */
    public void m23300a(String str) {
        m23302a(str, (JSONObject) null);
    }

    /* JADX INFO: renamed from: a */
    public void m23301a(String str, long j) {
        if (j >= this.f22744f) {
            EnumC10941a enumC10941a = this.f22743e;
            EnumC10941a enumC10941a2 = EnumC10941a.AD_STATE_NOTVISIBLE;
            if (enumC10941a != enumC10941a2) {
                this.f22743e = enumC10941a2;
                C10934h.m23253a().m23266b(getWebView(), this.f22739a, str);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m23302a(String str, JSONObject jSONObject) {
        C10934h.m23253a().m23258a(getWebView(), this.f22739a, str, jSONObject);
    }

    /* JADX INFO: renamed from: a */
    public void m23303a(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C10946c.m23332a(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        C10934h.m23253a().m23263a(getWebView(), jSONObject);
    }

    /* JADX INFO: renamed from: a */
    public void m23304a(JSONObject jSONObject) {
        C10934h.m23253a().m23267b(getWebView(), this.f22739a, jSONObject);
    }

    /* JADX INFO: renamed from: a */
    public void m23305a(boolean z) {
        if (m23311e()) {
            C10934h.m23253a().m23268c(getWebView(), this.f22739a, z ? "foregrounded" : "backgrounded");
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo23306b() {
        this.f22740b.clear();
    }

    /* JADX INFO: renamed from: b */
    public void m23307b(String str, long j) {
        if (j >= this.f22744f) {
            this.f22743e = EnumC10941a.AD_STATE_VISIBLE;
            C10934h.m23253a().m23266b(getWebView(), this.f22739a, str);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m23308b(boolean z) {
        if (m23311e()) {
            C10934h.m23253a().m23257a(getWebView(), this.f22739a, z ? "locked" : "unlocked");
        }
    }

    /* JADX INFO: renamed from: c */
    public AdEvents m23309c() {
        return this.f22741c;
    }

    /* JADX INFO: renamed from: d */
    public MediaEvents m23310d() {
        return this.f22742d;
    }

    /* JADX INFO: renamed from: e */
    public boolean m23311e() {
        return this.f22740b.get() != null;
    }

    /* JADX INFO: renamed from: f */
    public void m23312f() {
        C10934h.m23253a().m23254a(getWebView(), this.f22739a);
    }

    /* JADX INFO: renamed from: g */
    public void m23313g() {
        C10934h.m23253a().m23265b(getWebView(), this.f22739a);
    }

    public WebView getWebView() {
        return this.f22740b.get();
    }

    /* JADX INFO: renamed from: h */
    public void m23314h() {
        m23304a((JSONObject) null);
    }

    /* JADX INFO: renamed from: i */
    public void mo23315i() {
    }
}
