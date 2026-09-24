package com.iab.omid.library.mmadbridge.publisher;

import android.webkit.WebView;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.iab.omid.library.mmadbridge.adsession.AdEvents;
import com.iab.omid.library.mmadbridge.adsession.AdSessionConfiguration;
import com.iab.omid.library.mmadbridge.adsession.AdSessionContext;
import com.iab.omid.library.mmadbridge.adsession.C11175a;
import com.iab.omid.library.mmadbridge.adsession.ErrorType;
import com.iab.omid.library.mmadbridge.adsession.VerificationScriptResource;
import com.iab.omid.library.mmadbridge.adsession.media.MediaEvents;
import com.iab.omid.library.mmadbridge.internal.C11189g;
import com.iab.omid.library.mmadbridge.internal.C11190h;
import com.iab.omid.library.mmadbridge.utils.C11200a;
import com.iab.omid.library.mmadbridge.utils.C11201b;
import com.iab.omid.library.mmadbridge.utils.C11202c;
import com.iab.omid.library.mmadbridge.utils.C11205f;
import com.iab.omid.library.mmadbridge.weakreference.C11222b;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class AdSessionStatePublisher {

    /* JADX INFO: renamed from: a */
    private String f23414a;

    /* JADX INFO: renamed from: b */
    private C11222b f23415b;

    /* JADX INFO: renamed from: c */
    private AdEvents f23416c;

    /* JADX INFO: renamed from: d */
    private MediaEvents f23417d;

    /* JADX INFO: renamed from: e */
    private EnumC11197a f23418e;

    /* JADX INFO: renamed from: f */
    private long f23419f;

    /* JADX INFO: renamed from: com.iab.omid.library.mmadbridge.publisher.AdSessionStatePublisher$a */
    enum EnumC11197a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher(String str) {
        m24554a();
        this.f23414a = str;
        this.f23415b = new C11222b(null);
    }

    /* JADX INFO: renamed from: a */
    public void m24554a() {
        this.f23419f = C11205f.m24615b();
        this.f23418e = EnumC11197a.AD_STATE_IDLE;
    }

    /* JADX INFO: renamed from: a */
    public void m24555a(float f) {
        C11190h.m24516a().m24518a(getWebView(), this.f23414a, f);
    }

    /* JADX INFO: renamed from: a */
    void m24556a(WebView webView) {
        this.f23415b = new C11222b(webView);
    }

    /* JADX INFO: renamed from: a */
    public void m24557a(AdEvents adEvents) {
        this.f23416c = adEvents;
    }

    /* JADX INFO: renamed from: a */
    public void m24558a(AdSessionConfiguration adSessionConfiguration) {
        C11190h.m24516a().m24522a(getWebView(), this.f23414a, adSessionConfiguration.toJsonObject());
    }

    /* JADX INFO: renamed from: a */
    public void m24559a(ErrorType errorType, String str) {
        C11190h.m24516a().m24519a(getWebView(), this.f23414a, errorType, str);
    }

    /* JADX INFO: renamed from: a */
    public void mo24560a(C11175a c11175a, AdSessionContext adSessionContext) {
        m24561a(c11175a, adSessionContext, null);
    }

    /* JADX INFO: renamed from: a */
    protected void m24561a(C11175a c11175a, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = c11175a.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        C11202c.m24595a(jSONObject2, "environment", MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        C11202c.m24595a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        C11202c.m24595a(jSONObject2, "deviceInfo", C11201b.m24586d());
        C11202c.m24595a(jSONObject2, "deviceCategory", C11200a.m24581a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C11202c.m24595a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C11202c.m24595a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, adSessionContext.getPartner().getName());
        C11202c.m24595a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, adSessionContext.getPartner().getVersion());
        C11202c.m24595a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C11202c.m24595a(jSONObject4, "libraryVersion", "1.4.13-Mmadbridge");
        C11202c.m24595a(jSONObject4, RemoteConfigConstants.RequestFieldKey.APP_ID, C11189g.m24513b().m24514a().getApplicationContext().getPackageName());
        C11202c.m24595a(jSONObject2, MBridgeConstans.DYNAMIC_VIEW_WX_APP, jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            C11202c.m24595a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            C11202c.m24595a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource verificationScriptResource : adSessionContext.getVerificationScriptResources()) {
            C11202c.m24595a(jSONObject5, verificationScriptResource.getVendorKey(), verificationScriptResource.getVerificationParameters());
        }
        C11190h.m24516a().m24523a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    /* JADX INFO: renamed from: a */
    public void m24562a(MediaEvents mediaEvents) {
        this.f23417d = mediaEvents;
    }

    /* JADX INFO: renamed from: a */
    public void m24563a(String str) {
        m24565a(str, (JSONObject) null);
    }

    /* JADX INFO: renamed from: a */
    public void m24564a(String str, long j) {
        if (j >= this.f23419f) {
            EnumC11197a enumC11197a = this.f23418e;
            EnumC11197a enumC11197a2 = EnumC11197a.AD_STATE_NOTVISIBLE;
            if (enumC11197a != enumC11197a2) {
                this.f23418e = enumC11197a2;
                C11190h.m24516a().m24529b(getWebView(), this.f23414a, str);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m24565a(String str, JSONObject jSONObject) {
        C11190h.m24516a().m24521a(getWebView(), this.f23414a, str, jSONObject);
    }

    /* JADX INFO: renamed from: a */
    public void m24566a(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C11202c.m24595a(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        C11190h.m24516a().m24526a(getWebView(), jSONObject);
    }

    /* JADX INFO: renamed from: a */
    public void m24567a(JSONObject jSONObject) {
        C11190h.m24516a().m24530b(getWebView(), this.f23414a, jSONObject);
    }

    /* JADX INFO: renamed from: a */
    public void m24568a(boolean z) {
        if (m24574e()) {
            C11190h.m24516a().m24531c(getWebView(), this.f23414a, z ? "foregrounded" : "backgrounded");
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo24569b() {
        this.f23415b.clear();
    }

    /* JADX INFO: renamed from: b */
    public void m24570b(String str, long j) {
        if (j >= this.f23419f) {
            this.f23418e = EnumC11197a.AD_STATE_VISIBLE;
            C11190h.m24516a().m24529b(getWebView(), this.f23414a, str);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m24571b(boolean z) {
        if (m24574e()) {
            C11190h.m24516a().m24520a(getWebView(), this.f23414a, z ? "locked" : "unlocked");
        }
    }

    /* JADX INFO: renamed from: c */
    public AdEvents m24572c() {
        return this.f23416c;
    }

    /* JADX INFO: renamed from: d */
    public MediaEvents m24573d() {
        return this.f23417d;
    }

    /* JADX INFO: renamed from: e */
    public boolean m24574e() {
        return this.f23415b.get() != null;
    }

    /* JADX INFO: renamed from: f */
    public void m24575f() {
        C11190h.m24516a().m24517a(getWebView(), this.f23414a);
    }

    /* JADX INFO: renamed from: g */
    public void m24576g() {
        C11190h.m24516a().m24528b(getWebView(), this.f23414a);
    }

    public WebView getWebView() {
        return this.f23415b.get();
    }

    /* JADX INFO: renamed from: h */
    public void m24577h() {
        m24567a((JSONObject) null);
    }

    /* JADX INFO: renamed from: i */
    public void mo24578i() {
    }
}
