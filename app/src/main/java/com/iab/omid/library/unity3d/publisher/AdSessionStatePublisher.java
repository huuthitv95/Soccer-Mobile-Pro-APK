package com.iab.omid.library.unity3d.publisher;

import android.webkit.WebView;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.iab.omid.library.unity3d.adsession.AdEvents;
import com.iab.omid.library.unity3d.adsession.AdSessionConfiguration;
import com.iab.omid.library.unity3d.adsession.AdSessionContext;
import com.iab.omid.library.unity3d.adsession.C11224a;
import com.iab.omid.library.unity3d.adsession.ErrorType;
import com.iab.omid.library.unity3d.adsession.VerificationScriptResource;
import com.iab.omid.library.unity3d.adsession.media.MediaEvents;
import com.iab.omid.library.unity3d.internal.C11237f;
import com.iab.omid.library.unity3d.internal.C11238g;
import com.iab.omid.library.unity3d.utils.C11247a;
import com.iab.omid.library.unity3d.utils.C11248b;
import com.iab.omid.library.unity3d.utils.C11249c;
import com.iab.omid.library.unity3d.utils.C11252f;
import com.iab.omid.library.unity3d.weakreference.C11268b;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class AdSessionStatePublisher {

    /* JADX INFO: renamed from: a */
    private String f23543a;

    /* JADX INFO: renamed from: b */
    private C11268b f23544b;

    /* JADX INFO: renamed from: c */
    private AdEvents f23545c;

    /* JADX INFO: renamed from: d */
    private MediaEvents f23546d;

    /* JADX INFO: renamed from: e */
    private EnumC11244a f23547e;

    /* JADX INFO: renamed from: f */
    private long f23548f;

    /* JADX INFO: renamed from: com.iab.omid.library.unity3d.publisher.AdSessionStatePublisher$a */
    enum EnumC11244a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher(String str) {
        m24796a();
        this.f23543a = str;
        this.f23544b = new C11268b(null);
    }

    /* JADX INFO: renamed from: a */
    public void m24796a() {
        this.f23548f = C11252f.m24854b();
        this.f23547e = EnumC11244a.AD_STATE_IDLE;
    }

    /* JADX INFO: renamed from: a */
    public void m24797a(float f) {
        C11238g.m24765a().m24767a(getWebView(), this.f23543a, f);
    }

    /* JADX INFO: renamed from: a */
    void m24798a(WebView webView) {
        this.f23544b = new C11268b(webView);
    }

    /* JADX INFO: renamed from: a */
    public void m24799a(AdEvents adEvents) {
        this.f23545c = adEvents;
    }

    /* JADX INFO: renamed from: a */
    public void m24800a(AdSessionConfiguration adSessionConfiguration) {
        C11238g.m24765a().m24771a(getWebView(), this.f23543a, adSessionConfiguration.toJsonObject());
    }

    /* JADX INFO: renamed from: a */
    public void m24801a(ErrorType errorType, String str) {
        C11238g.m24765a().m24768a(getWebView(), this.f23543a, errorType, str);
    }

    /* JADX INFO: renamed from: a */
    public void mo24802a(C11224a c11224a, AdSessionContext adSessionContext) {
        m24803a(c11224a, adSessionContext, null);
    }

    /* JADX INFO: renamed from: a */
    protected void m24803a(C11224a c11224a, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = c11224a.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        C11249c.m24836a(jSONObject2, "environment", MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        C11249c.m24836a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        C11249c.m24836a(jSONObject2, "deviceInfo", C11248b.m24827d());
        C11249c.m24836a(jSONObject2, "deviceCategory", C11247a.m24822a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C11249c.m24836a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C11249c.m24836a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, adSessionContext.getPartner().getName());
        C11249c.m24836a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, adSessionContext.getPartner().getVersion());
        C11249c.m24836a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C11249c.m24836a(jSONObject4, "libraryVersion", "1.4.9-Unity3d");
        C11249c.m24836a(jSONObject4, RemoteConfigConstants.RequestFieldKey.APP_ID, C11237f.m24762b().m24763a().getApplicationContext().getPackageName());
        C11249c.m24836a(jSONObject2, MBridgeConstans.DYNAMIC_VIEW_WX_APP, jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            C11249c.m24836a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            C11249c.m24836a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource verificationScriptResource : adSessionContext.getVerificationScriptResources()) {
            C11249c.m24836a(jSONObject5, verificationScriptResource.getVendorKey(), verificationScriptResource.getVerificationParameters());
        }
        C11238g.m24765a().m24772a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    /* JADX INFO: renamed from: a */
    public void m24804a(MediaEvents mediaEvents) {
        this.f23546d = mediaEvents;
    }

    /* JADX INFO: renamed from: a */
    public void m24805a(String str) {
        m24807a(str, (JSONObject) null);
    }

    /* JADX INFO: renamed from: a */
    public void m24806a(String str, long j) {
        if (j >= this.f23548f) {
            EnumC11244a enumC11244a = this.f23547e;
            EnumC11244a enumC11244a2 = EnumC11244a.AD_STATE_NOTVISIBLE;
            if (enumC11244a != enumC11244a2) {
                this.f23547e = enumC11244a2;
                C11238g.m24765a().m24769a(getWebView(), this.f23543a, str);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m24807a(String str, JSONObject jSONObject) {
        C11238g.m24765a().m24770a(getWebView(), this.f23543a, str, jSONObject);
    }

    /* JADX INFO: renamed from: a */
    public void m24808a(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C11249c.m24836a(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        C11238g.m24765a().m24775a(getWebView(), jSONObject);
    }

    /* JADX INFO: renamed from: a */
    public void m24809a(JSONObject jSONObject) {
        C11238g.m24765a().m24779b(getWebView(), this.f23543a, jSONObject);
    }

    /* JADX INFO: renamed from: a */
    public void m24810a(boolean z) {
        if (m24815e()) {
            C11238g.m24765a().m24778b(getWebView(), this.f23543a, z ? "foregrounded" : "backgrounded");
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo24811b() {
        this.f23544b.clear();
    }

    /* JADX INFO: renamed from: b */
    public void m24812b(String str, long j) {
        if (j >= this.f23548f) {
            this.f23547e = EnumC11244a.AD_STATE_VISIBLE;
            C11238g.m24765a().m24769a(getWebView(), this.f23543a, str);
        }
    }

    /* JADX INFO: renamed from: c */
    public AdEvents m24813c() {
        return this.f23545c;
    }

    /* JADX INFO: renamed from: d */
    public MediaEvents m24814d() {
        return this.f23546d;
    }

    /* JADX INFO: renamed from: e */
    public boolean m24815e() {
        return this.f23544b.get() != null;
    }

    /* JADX INFO: renamed from: f */
    public void m24816f() {
        C11238g.m24765a().m24766a(getWebView(), this.f23543a);
    }

    /* JADX INFO: renamed from: g */
    public void m24817g() {
        C11238g.m24765a().m24777b(getWebView(), this.f23543a);
    }

    public WebView getWebView() {
        return this.f23544b.get();
    }

    /* JADX INFO: renamed from: h */
    public void m24818h() {
        m24809a((JSONObject) null);
    }

    /* JADX INFO: renamed from: i */
    public void mo24819i() {
    }
}
