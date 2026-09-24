package com.iab.omid.library.ironsrc.publisher;

import android.webkit.WebView;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.iab.omid.library.ironsrc.adsession.AdEvents;
import com.iab.omid.library.ironsrc.adsession.AdSessionConfiguration;
import com.iab.omid.library.ironsrc.adsession.AdSessionContext;
import com.iab.omid.library.ironsrc.adsession.C11124a;
import com.iab.omid.library.ironsrc.adsession.ErrorType;
import com.iab.omid.library.ironsrc.adsession.VerificationScriptResource;
import com.iab.omid.library.ironsrc.adsession.media.MediaEvents;
import com.iab.omid.library.ironsrc.internal.C11138g;
import com.iab.omid.library.ironsrc.internal.C11139h;
import com.iab.omid.library.ironsrc.utils.C11149a;
import com.iab.omid.library.ironsrc.utils.C11150b;
import com.iab.omid.library.ironsrc.utils.C11151c;
import com.iab.omid.library.ironsrc.utils.C11154f;
import com.iab.omid.library.ironsrc.weakreference.C11171b;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class AdSessionStatePublisher {

    /* JADX INFO: renamed from: a */
    private String f23279a;

    /* JADX INFO: renamed from: b */
    private C11171b f23280b;

    /* JADX INFO: renamed from: c */
    private AdEvents f23281c;

    /* JADX INFO: renamed from: d */
    private MediaEvents f23282d;

    /* JADX INFO: renamed from: e */
    private EnumC11146a f23283e;

    /* JADX INFO: renamed from: f */
    private long f23284f;

    /* JADX INFO: renamed from: com.iab.omid.library.ironsrc.publisher.AdSessionStatePublisher$a */
    enum EnumC11146a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher(String str) {
        m24301a();
        this.f23279a = str;
        this.f23280b = new C11171b(null);
    }

    /* JADX INFO: renamed from: a */
    public void m24301a() {
        this.f23284f = C11154f.m24362b();
        this.f23283e = EnumC11146a.AD_STATE_IDLE;
    }

    /* JADX INFO: renamed from: a */
    public void m24302a(float f) {
        C11139h.m24263a().m24265a(getWebView(), this.f23279a, f);
    }

    /* JADX INFO: renamed from: a */
    void m24303a(WebView webView) {
        this.f23280b = new C11171b(webView);
    }

    /* JADX INFO: renamed from: a */
    public void m24304a(AdEvents adEvents) {
        this.f23281c = adEvents;
    }

    /* JADX INFO: renamed from: a */
    public void m24305a(AdSessionConfiguration adSessionConfiguration) {
        C11139h.m24263a().m24269a(getWebView(), this.f23279a, adSessionConfiguration.toJsonObject());
    }

    /* JADX INFO: renamed from: a */
    public void m24306a(ErrorType errorType, String str) {
        C11139h.m24263a().m24266a(getWebView(), this.f23279a, errorType, str);
    }

    /* JADX INFO: renamed from: a */
    public void mo24307a(C11124a c11124a, AdSessionContext adSessionContext) {
        m24308a(c11124a, adSessionContext, null);
    }

    /* JADX INFO: renamed from: a */
    protected void m24308a(C11124a c11124a, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = c11124a.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        C11151c.m24342a(jSONObject2, "environment", MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        C11151c.m24342a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        C11151c.m24342a(jSONObject2, "deviceInfo", C11150b.m24333d());
        C11151c.m24342a(jSONObject2, "deviceCategory", C11149a.m24328a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C11151c.m24342a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C11151c.m24342a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, adSessionContext.getPartner().getName());
        C11151c.m24342a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, adSessionContext.getPartner().getVersion());
        C11151c.m24342a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C11151c.m24342a(jSONObject4, "libraryVersion", "1.5.2-Ironsrc");
        C11151c.m24342a(jSONObject4, RemoteConfigConstants.RequestFieldKey.APP_ID, C11138g.m24260b().m24261a().getApplicationContext().getPackageName());
        C11151c.m24342a(jSONObject2, MBridgeConstans.DYNAMIC_VIEW_WX_APP, jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            C11151c.m24342a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            C11151c.m24342a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource verificationScriptResource : adSessionContext.getVerificationScriptResources()) {
            C11151c.m24342a(jSONObject5, verificationScriptResource.getVendorKey(), verificationScriptResource.getVerificationParameters());
        }
        C11139h.m24263a().m24270a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    /* JADX INFO: renamed from: a */
    public void m24309a(MediaEvents mediaEvents) {
        this.f23282d = mediaEvents;
    }

    /* JADX INFO: renamed from: a */
    public void m24310a(String str) {
        m24312a(str, (JSONObject) null);
    }

    /* JADX INFO: renamed from: a */
    public void m24311a(String str, long j) {
        if (j >= this.f23284f) {
            EnumC11146a enumC11146a = this.f23283e;
            EnumC11146a enumC11146a2 = EnumC11146a.AD_STATE_NOTVISIBLE;
            if (enumC11146a != enumC11146a2) {
                this.f23283e = enumC11146a2;
                C11139h.m24263a().m24276b(getWebView(), this.f23279a, str);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m24312a(String str, JSONObject jSONObject) {
        C11139h.m24263a().m24268a(getWebView(), this.f23279a, str, jSONObject);
    }

    /* JADX INFO: renamed from: a */
    public void m24313a(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C11151c.m24342a(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        C11139h.m24263a().m24273a(getWebView(), jSONObject);
    }

    /* JADX INFO: renamed from: a */
    public void m24314a(JSONObject jSONObject) {
        C11139h.m24263a().m24277b(getWebView(), this.f23279a, jSONObject);
    }

    /* JADX INFO: renamed from: a */
    public void m24315a(boolean z) {
        if (m24321e()) {
            C11139h.m24263a().m24278c(getWebView(), this.f23279a, z ? "foregrounded" : "backgrounded");
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo24316b() {
        this.f23280b.clear();
    }

    /* JADX INFO: renamed from: b */
    public void m24317b(String str, long j) {
        if (j >= this.f23284f) {
            this.f23283e = EnumC11146a.AD_STATE_VISIBLE;
            C11139h.m24263a().m24276b(getWebView(), this.f23279a, str);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m24318b(boolean z) {
        if (m24321e()) {
            C11139h.m24263a().m24267a(getWebView(), this.f23279a, z ? "locked" : "unlocked");
        }
    }

    /* JADX INFO: renamed from: c */
    public AdEvents m24319c() {
        return this.f23281c;
    }

    /* JADX INFO: renamed from: d */
    public MediaEvents m24320d() {
        return this.f23282d;
    }

    /* JADX INFO: renamed from: e */
    public boolean m24321e() {
        return this.f23280b.get() != null;
    }

    /* JADX INFO: renamed from: f */
    public void m24322f() {
        C11139h.m24263a().m24264a(getWebView(), this.f23279a);
    }

    /* JADX INFO: renamed from: g */
    public void m24323g() {
        C11139h.m24263a().m24275b(getWebView(), this.f23279a);
    }

    public WebView getWebView() {
        return this.f23280b.get();
    }

    /* JADX INFO: renamed from: h */
    public void m24324h() {
        m24314a((JSONObject) null);
    }

    /* JADX INFO: renamed from: i */
    public void mo24325i() {
    }
}
