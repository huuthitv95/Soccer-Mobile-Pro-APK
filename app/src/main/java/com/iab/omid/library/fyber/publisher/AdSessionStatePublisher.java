package com.iab.omid.library.fyber.publisher;

import android.webkit.WebView;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.iab.omid.library.fyber.adsession.AdEvents;
import com.iab.omid.library.fyber.adsession.AdSessionConfiguration;
import com.iab.omid.library.fyber.adsession.AdSessionContext;
import com.iab.omid.library.fyber.adsession.C11073a;
import com.iab.omid.library.fyber.adsession.ErrorType;
import com.iab.omid.library.fyber.adsession.VerificationScriptResource;
import com.iab.omid.library.fyber.adsession.media.MediaEvents;
import com.iab.omid.library.fyber.internal.C11087g;
import com.iab.omid.library.fyber.internal.C11088h;
import com.iab.omid.library.fyber.utils.C11098a;
import com.iab.omid.library.fyber.utils.C11099b;
import com.iab.omid.library.fyber.utils.C11100c;
import com.iab.omid.library.fyber.utils.C11103f;
import com.iab.omid.library.fyber.weakreference.C11120b;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class AdSessionStatePublisher {

    /* JADX INFO: renamed from: a */
    private String f23144a;

    /* JADX INFO: renamed from: b */
    private C11120b f23145b;

    /* JADX INFO: renamed from: c */
    private AdEvents f23146c;

    /* JADX INFO: renamed from: d */
    private MediaEvents f23147d;

    /* JADX INFO: renamed from: e */
    private EnumC11095a f23148e;

    /* JADX INFO: renamed from: f */
    private long f23149f;

    /* JADX INFO: renamed from: com.iab.omid.library.fyber.publisher.AdSessionStatePublisher$a */
    enum EnumC11095a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher(String str) {
        m24048a();
        this.f23144a = str;
        this.f23145b = new C11120b(null);
    }

    /* JADX INFO: renamed from: a */
    public void m24048a() {
        this.f23149f = C11103f.m24109b();
        this.f23148e = EnumC11095a.AD_STATE_IDLE;
    }

    /* JADX INFO: renamed from: a */
    public void m24049a(float f) {
        C11088h.m24010a().m24012a(getWebView(), this.f23144a, f);
    }

    /* JADX INFO: renamed from: a */
    void m24050a(WebView webView) {
        this.f23145b = new C11120b(webView);
    }

    /* JADX INFO: renamed from: a */
    public void m24051a(AdEvents adEvents) {
        this.f23146c = adEvents;
    }

    /* JADX INFO: renamed from: a */
    public void m24052a(AdSessionConfiguration adSessionConfiguration) {
        C11088h.m24010a().m24016a(getWebView(), this.f23144a, adSessionConfiguration.toJsonObject());
    }

    /* JADX INFO: renamed from: a */
    public void m24053a(ErrorType errorType, String str) {
        C11088h.m24010a().m24013a(getWebView(), this.f23144a, errorType, str);
    }

    /* JADX INFO: renamed from: a */
    public void mo24054a(C11073a c11073a, AdSessionContext adSessionContext) {
        m24055a(c11073a, adSessionContext, null);
    }

    /* JADX INFO: renamed from: a */
    protected void m24055a(C11073a c11073a, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String strM23938c = c11073a.m23938c();
        JSONObject jSONObject2 = new JSONObject();
        C11100c.m24089a(jSONObject2, "environment", MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        C11100c.m24089a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        C11100c.m24089a(jSONObject2, "deviceInfo", C11099b.m24080d());
        C11100c.m24089a(jSONObject2, "deviceCategory", C11098a.m24075a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C11100c.m24089a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C11100c.m24089a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, adSessionContext.getPartner().getName());
        C11100c.m24089a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, adSessionContext.getPartner().getVersion());
        C11100c.m24089a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C11100c.m24089a(jSONObject4, "libraryVersion", "1.5.4-Fyber");
        C11100c.m24089a(jSONObject4, RemoteConfigConstants.RequestFieldKey.APP_ID, C11087g.m24007b().m24008a().getApplicationContext().getPackageName());
        C11100c.m24089a(jSONObject2, MBridgeConstans.DYNAMIC_VIEW_WX_APP, jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            C11100c.m24089a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            C11100c.m24089a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource verificationScriptResource : adSessionContext.getVerificationScriptResources()) {
            C11100c.m24089a(jSONObject5, verificationScriptResource.getVendorKey(), verificationScriptResource.getVerificationParameters());
        }
        C11088h.m24010a().m24017a(getWebView(), strM23938c, jSONObject2, jSONObject5, jSONObject);
    }

    /* JADX INFO: renamed from: a */
    public void m24056a(MediaEvents mediaEvents) {
        this.f23147d = mediaEvents;
    }

    /* JADX INFO: renamed from: a */
    public void m24057a(String str) {
        m24059a(str, (JSONObject) null);
    }

    /* JADX INFO: renamed from: a */
    public void m24058a(String str, long j) {
        if (j >= this.f23149f) {
            EnumC11095a enumC11095a = this.f23148e;
            EnumC11095a enumC11095a2 = EnumC11095a.AD_STATE_NOTVISIBLE;
            if (enumC11095a != enumC11095a2) {
                this.f23148e = enumC11095a2;
                C11088h.m24010a().m24023b(getWebView(), this.f23144a, str);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m24059a(String str, JSONObject jSONObject) {
        C11088h.m24010a().m24015a(getWebView(), this.f23144a, str, jSONObject);
    }

    /* JADX INFO: renamed from: a */
    public void m24060a(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C11100c.m24089a(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        C11088h.m24010a().m24020a(getWebView(), jSONObject);
    }

    /* JADX INFO: renamed from: a */
    public void m24061a(JSONObject jSONObject) {
        C11088h.m24010a().m24024b(getWebView(), this.f23144a, jSONObject);
    }

    /* JADX INFO: renamed from: a */
    public void m24062a(boolean z) {
        if (m24068e()) {
            C11088h.m24010a().m24025c(getWebView(), this.f23144a, z ? "foregrounded" : "backgrounded");
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo24063b() {
        this.f23145b.clear();
    }

    /* JADX INFO: renamed from: b */
    public void m24064b(String str, long j) {
        if (j >= this.f23149f) {
            this.f23148e = EnumC11095a.AD_STATE_VISIBLE;
            C11088h.m24010a().m24023b(getWebView(), this.f23144a, str);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m24065b(boolean z) {
        if (m24068e()) {
            C11088h.m24010a().m24014a(getWebView(), this.f23144a, z ? "locked" : "unlocked");
        }
    }

    /* JADX INFO: renamed from: c */
    public AdEvents m24066c() {
        return this.f23146c;
    }

    /* JADX INFO: renamed from: d */
    public MediaEvents m24067d() {
        return this.f23147d;
    }

    /* JADX INFO: renamed from: e */
    public boolean m24068e() {
        return this.f23145b.get() != null;
    }

    /* JADX INFO: renamed from: f */
    public void m24069f() {
        C11088h.m24010a().m24011a(getWebView(), this.f23144a);
    }

    /* JADX INFO: renamed from: g */
    public void m24070g() {
        C11088h.m24010a().m24022b(getWebView(), this.f23144a);
    }

    public WebView getWebView() {
        return this.f23145b.get();
    }

    /* JADX INFO: renamed from: h */
    public void m24071h() {
        m24061a((JSONObject) null);
    }

    /* JADX INFO: renamed from: i */
    public void mo24072i() {
    }
}
