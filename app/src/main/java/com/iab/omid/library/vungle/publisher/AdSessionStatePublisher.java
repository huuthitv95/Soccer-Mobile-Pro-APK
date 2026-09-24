package com.iab.omid.library.vungle.publisher;

import android.webkit.WebView;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.iab.omid.library.vungle.adsession.AdEvents;
import com.iab.omid.library.vungle.adsession.AdSessionConfiguration;
import com.iab.omid.library.vungle.adsession.AdSessionContext;
import com.iab.omid.library.vungle.adsession.C11271a;
import com.iab.omid.library.vungle.adsession.ErrorType;
import com.iab.omid.library.vungle.adsession.VerificationScriptResource;
import com.iab.omid.library.vungle.adsession.media.MediaEvents;
import com.iab.omid.library.vungle.attestation.InterfaceC11273b;
import com.iab.omid.library.vungle.internal.C11296g;
import com.iab.omid.library.vungle.internal.C11297h;
import com.iab.omid.library.vungle.utils.C11310a;
import com.iab.omid.library.vungle.utils.C11311b;
import com.iab.omid.library.vungle.utils.C11312c;
import com.iab.omid.library.vungle.utils.C11313d;
import com.iab.omid.library.vungle.utils.C11315f;
import com.iab.omid.library.vungle.weakreference.C11332b;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class AdSessionStatePublisher {

    /* JADX INFO: renamed from: a */
    private String f23706a;

    /* JADX INFO: renamed from: b */
    private C11332b f23707b;

    /* JADX INFO: renamed from: c */
    private AdEvents f23708c;

    /* JADX INFO: renamed from: d */
    private MediaEvents f23709d;

    /* JADX INFO: renamed from: e */
    private EnumC11307a f23710e;

    /* JADX INFO: renamed from: f */
    private long f23711f;

    /* JADX INFO: renamed from: com.iab.omid.library.vungle.publisher.AdSessionStatePublisher$a */
    enum EnumC11307a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher(String str) {
        m25082a();
        this.f23706a = str;
        this.f23707b = new C11332b(null);
    }

    /* JADX INFO: renamed from: a */
    private JSONArray m25078a(List<InterfaceC11273b> list) {
        JSONArray jSONArray = new JSONArray();
        for (InterfaceC11273b interfaceC11273b : list) {
            Iterator<String> it = interfaceC11273b.mo24950c().iterator();
            while (it.hasNext()) {
                jSONArray.put(m25079a(interfaceC11273b, it.next()));
            }
        }
        return jSONArray;
    }

    /* JADX INFO: renamed from: a */
    private JSONObject m25079a(InterfaceC11273b interfaceC11273b, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mechanism", interfaceC11273b.mo24947a());
        jSONObject.put("executionEnvironment", interfaceC11273b.mo24949b().toString());
        jSONObject.put("version", str);
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    private JSONObject m25080a(JSONArray jSONArray) {
        JSONObject jSONObject = new JSONObject();
        C11312c.m25131a(jSONObject, "supportedAttestationMechanisms", jSONArray);
        return jSONObject;
    }

    /* JADX INFO: renamed from: a */
    private void m25081a(JSONObject jSONObject) {
        C11297h.m25032a().m25047b(getWebView(), jSONObject);
    }

    /* JADX INFO: renamed from: a */
    public void m25082a() {
        this.f23711f = C11315f.m25154b();
        this.f23710e = EnumC11307a.AD_STATE_IDLE;
    }

    /* JADX INFO: renamed from: a */
    public void m25083a(float f) {
        C11297h.m25032a().m25034a(getWebView(), this.f23706a, f);
    }

    /* JADX INFO: renamed from: a */
    void m25084a(WebView webView) {
        this.f23707b = new C11332b(webView);
    }

    /* JADX INFO: renamed from: a */
    public void m25085a(AdEvents adEvents) {
        this.f23708c = adEvents;
    }

    /* JADX INFO: renamed from: a */
    public void m25086a(AdSessionConfiguration adSessionConfiguration) {
        C11297h.m25032a().m25038a(getWebView(), this.f23706a, adSessionConfiguration.toJsonObject());
    }

    /* JADX INFO: renamed from: a */
    public void m25087a(ErrorType errorType, String str) {
        C11297h.m25032a().m25035a(getWebView(), this.f23706a, errorType, str);
    }

    /* JADX INFO: renamed from: a */
    public void mo25088a(C11271a c11271a, AdSessionContext adSessionContext) {
        m25089a(c11271a, adSessionContext, null);
    }

    /* JADX INFO: renamed from: a */
    protected void m25089a(C11271a c11271a, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String strM24933c = c11271a.m24933c();
        JSONObject jSONObject2 = new JSONObject();
        C11312c.m25131a(jSONObject2, "environment", MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        C11312c.m25131a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        C11312c.m25131a(jSONObject2, "deviceInfo", C11311b.m25122d());
        C11312c.m25131a(jSONObject2, "deviceCategory", C11310a.m25117a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C11312c.m25131a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C11312c.m25131a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, adSessionContext.getPartner().getName());
        C11312c.m25131a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, adSessionContext.getPartner().getVersion());
        C11312c.m25131a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C11312c.m25131a(jSONObject4, "libraryVersion", "1.6.2-Vungle");
        C11312c.m25131a(jSONObject4, RemoteConfigConstants.RequestFieldKey.APP_ID, C11296g.m25029b().m25030a().getApplicationContext().getPackageName());
        C11312c.m25131a(jSONObject2, MBridgeConstans.DYNAMIC_VIEW_WX_APP, jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            C11312c.m25131a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            C11312c.m25131a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        if (adSessionContext.getUniversalAdId() != null) {
            C11312c.m25131a(jSONObject2, "universalAdId", adSessionContext.getUniversalAdId());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource verificationScriptResource : adSessionContext.getVerificationScriptResources()) {
            C11312c.m25131a(jSONObject5, verificationScriptResource.getVendorKey(), verificationScriptResource.getVerificationParameters());
        }
        C11297h.m25032a().m25039a(getWebView(), strM24933c, jSONObject2, jSONObject5, jSONObject);
    }

    /* JADX INFO: renamed from: a */
    public void m25090a(MediaEvents mediaEvents) {
        this.f23709d = mediaEvents;
    }

    /* JADX INFO: renamed from: a */
    public void m25091a(String str) {
        m25093a(str, (JSONObject) null);
    }

    /* JADX INFO: renamed from: a */
    public void m25092a(String str, long j) {
        if (j >= this.f23711f) {
            EnumC11307a enumC11307a = this.f23710e;
            EnumC11307a enumC11307a2 = EnumC11307a.AD_STATE_NOTVISIBLE;
            if (enumC11307a != enumC11307a2) {
                this.f23710e = enumC11307a2;
                C11297h.m25032a().m25045b(getWebView(), this.f23706a, str);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m25093a(String str, JSONObject jSONObject) {
        C11297h.m25032a().m25037a(getWebView(), this.f23706a, str, jSONObject);
    }

    /* JADX INFO: renamed from: a */
    public void m25094a(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C11312c.m25131a(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        C11297h.m25032a().m25042a(getWebView(), jSONObject);
    }

    /* JADX INFO: renamed from: a */
    public void m25095a(boolean z) {
        if (m25103e()) {
            C11297h.m25032a().m25048c(getWebView(), this.f23706a, z ? "foregrounded" : "backgrounded");
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo25096b() {
        this.f23707b.clear();
    }

    /* JADX INFO: renamed from: b */
    public void m25097b(String str, long j) {
        if (j >= this.f23711f) {
            this.f23710e = EnumC11307a.AD_STATE_VISIBLE;
            C11297h.m25032a().m25045b(getWebView(), this.f23706a, str);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m25098b(List<InterfaceC11273b> list) {
        try {
            m25081a(m25080a(m25078a(list)));
        } catch (JSONException e) {
            C11313d.m25147a("Error creating JSON object publishSupportedAttestationMechanisms", e);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m25099b(JSONObject jSONObject) {
        C11297h.m25032a().m25046b(getWebView(), this.f23706a, jSONObject);
    }

    /* JADX INFO: renamed from: b */
    public void m25100b(boolean z) {
        if (m25103e()) {
            C11297h.m25032a().m25036a(getWebView(), this.f23706a, z ? "locked" : "unlocked");
        }
    }

    /* JADX INFO: renamed from: c */
    public AdEvents m25101c() {
        return this.f23708c;
    }

    /* JADX INFO: renamed from: d */
    public MediaEvents m25102d() {
        return this.f23709d;
    }

    /* JADX INFO: renamed from: e */
    public boolean m25103e() {
        return this.f23707b.get() != null;
    }

    /* JADX INFO: renamed from: f */
    public void m25104f() {
        C11297h.m25032a().m25033a(getWebView(), this.f23706a);
    }

    /* JADX INFO: renamed from: g */
    public void m25105g() {
        C11297h.m25032a().m25044b(getWebView(), this.f23706a);
    }

    public WebView getWebView() {
        return this.f23707b.get();
    }

    /* JADX INFO: renamed from: h */
    public void m25106h() {
        m25099b((JSONObject) null);
    }

    /* JADX INFO: renamed from: i */
    public void mo25107i() {
    }
}
