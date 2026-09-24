package com.iab.omid.library.chartboost.publisher;

import android.webkit.WebView;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.iab.omid.library.chartboost.adsession.AdEvents;
import com.iab.omid.library.chartboost.adsession.AdSessionConfiguration;
import com.iab.omid.library.chartboost.adsession.AdSessionContext;
import com.iab.omid.library.chartboost.adsession.C11021a;
import com.iab.omid.library.chartboost.adsession.ErrorType;
import com.iab.omid.library.chartboost.adsession.VerificationScriptResource;
import com.iab.omid.library.chartboost.adsession.media.MediaEvents;
import com.iab.omid.library.chartboost.internal.C11035g;
import com.iab.omid.library.chartboost.internal.C11036h;
import com.iab.omid.library.chartboost.utils.C11046a;
import com.iab.omid.library.chartboost.utils.C11047b;
import com.iab.omid.library.chartboost.utils.C11048c;
import com.iab.omid.library.chartboost.utils.C11051f;
import com.iab.omid.library.chartboost.weakreference.C11068b;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class AdSessionStatePublisher {

    /* JADX INFO: renamed from: a */
    private String f23009a;

    /* JADX INFO: renamed from: b */
    private C11068b f23010b;

    /* JADX INFO: renamed from: c */
    private AdEvents f23011c;

    /* JADX INFO: renamed from: d */
    private MediaEvents f23012d;

    /* JADX INFO: renamed from: e */
    private EnumC11043a f23013e;

    /* JADX INFO: renamed from: f */
    private long f23014f;

    /* JADX INFO: renamed from: com.iab.omid.library.chartboost.publisher.AdSessionStatePublisher$a */
    enum EnumC11043a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher(String str) {
        m23791a();
        this.f23009a = str;
        this.f23010b = new C11068b(null);
    }

    /* JADX INFO: renamed from: a */
    public void m23791a() {
        this.f23014f = C11051f.m23853b();
        this.f23013e = EnumC11043a.AD_STATE_IDLE;
    }

    /* JADX INFO: renamed from: a */
    public void m23792a(float f) {
        C11036h.m23753a().m23755a(getWebView(), this.f23009a, f);
    }

    /* JADX INFO: renamed from: a */
    void m23793a(WebView webView) {
        this.f23010b = new C11068b(webView);
    }

    /* JADX INFO: renamed from: a */
    public void m23794a(AdEvents adEvents) {
        this.f23011c = adEvents;
    }

    /* JADX INFO: renamed from: a */
    public void m23795a(AdSessionConfiguration adSessionConfiguration) {
        C11036h.m23753a().m23759a(getWebView(), this.f23009a, adSessionConfiguration.toJsonObject());
    }

    /* JADX INFO: renamed from: a */
    public void m23796a(ErrorType errorType, String str) {
        C11036h.m23753a().m23756a(getWebView(), this.f23009a, errorType, str);
    }

    /* JADX INFO: renamed from: a */
    public void mo23797a(C11021a c11021a, AdSessionContext adSessionContext) {
        m23798a(c11021a, adSessionContext, null);
    }

    /* JADX INFO: renamed from: a */
    protected void m23798a(C11021a c11021a, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String strM23677c = c11021a.m23677c();
        JSONObject jSONObject2 = new JSONObject();
        C11048c.m23833a(jSONObject2, "environment", MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        C11048c.m23833a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        C11048c.m23833a(jSONObject2, "deviceInfo", C11047b.m23824d());
        C11048c.m23833a(jSONObject2, "deviceCategory", C11046a.m23819a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C11048c.m23833a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C11048c.m23833a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, adSessionContext.getPartner().getName());
        C11048c.m23833a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, adSessionContext.getPartner().getVersion());
        C11048c.m23833a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C11048c.m23833a(jSONObject4, "libraryVersion", "1.5.7-Chartboost");
        C11048c.m23833a(jSONObject4, RemoteConfigConstants.RequestFieldKey.APP_ID, C11035g.m23750b().m23751a().getApplicationContext().getPackageName());
        C11048c.m23833a(jSONObject2, MBridgeConstans.DYNAMIC_VIEW_WX_APP, jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            C11048c.m23833a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            C11048c.m23833a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        if (adSessionContext.getUniversalAdId() != null) {
            C11048c.m23833a(jSONObject2, "universalAdId", adSessionContext.getUniversalAdId());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource verificationScriptResource : adSessionContext.getVerificationScriptResources()) {
            C11048c.m23833a(jSONObject5, verificationScriptResource.getVendorKey(), verificationScriptResource.getVerificationParameters());
        }
        C11036h.m23753a().m23760a(getWebView(), strM23677c, jSONObject2, jSONObject5, jSONObject);
    }

    /* JADX INFO: renamed from: a */
    public void m23799a(MediaEvents mediaEvents) {
        this.f23012d = mediaEvents;
    }

    /* JADX INFO: renamed from: a */
    public void m23800a(String str) {
        m23802a(str, (JSONObject) null);
    }

    /* JADX INFO: renamed from: a */
    public void m23801a(String str, long j) {
        if (j >= this.f23014f) {
            EnumC11043a enumC11043a = this.f23013e;
            EnumC11043a enumC11043a2 = EnumC11043a.AD_STATE_NOTVISIBLE;
            if (enumC11043a != enumC11043a2) {
                this.f23013e = enumC11043a2;
                C11036h.m23753a().m23766b(getWebView(), this.f23009a, str);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m23802a(String str, JSONObject jSONObject) {
        C11036h.m23753a().m23758a(getWebView(), this.f23009a, str, jSONObject);
    }

    /* JADX INFO: renamed from: a */
    public void m23803a(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C11048c.m23833a(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        C11036h.m23753a().m23763a(getWebView(), jSONObject);
    }

    /* JADX INFO: renamed from: a */
    public void m23804a(JSONObject jSONObject) {
        C11036h.m23753a().m23767b(getWebView(), this.f23009a, jSONObject);
    }

    /* JADX INFO: renamed from: a */
    public void m23805a(boolean z) {
        if (m23811e()) {
            C11036h.m23753a().m23768c(getWebView(), this.f23009a, z ? "foregrounded" : "backgrounded");
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo23806b() {
        this.f23010b.clear();
    }

    /* JADX INFO: renamed from: b */
    public void m23807b(String str, long j) {
        if (j >= this.f23014f) {
            this.f23013e = EnumC11043a.AD_STATE_VISIBLE;
            C11036h.m23753a().m23766b(getWebView(), this.f23009a, str);
        }
    }

    /* JADX INFO: renamed from: b */
    public void m23808b(boolean z) {
        if (m23811e()) {
            C11036h.m23753a().m23757a(getWebView(), this.f23009a, z ? "locked" : "unlocked");
        }
    }

    /* JADX INFO: renamed from: c */
    public AdEvents m23809c() {
        return this.f23011c;
    }

    /* JADX INFO: renamed from: d */
    public MediaEvents m23810d() {
        return this.f23012d;
    }

    /* JADX INFO: renamed from: e */
    public boolean m23811e() {
        return this.f23010b.get() != null;
    }

    /* JADX INFO: renamed from: f */
    public void m23812f() {
        C11036h.m23753a().m23754a(getWebView(), this.f23009a);
    }

    /* JADX INFO: renamed from: g */
    public void m23813g() {
        C11036h.m23753a().m23765b(getWebView(), this.f23009a);
    }

    public WebView getWebView() {
        return this.f23010b.get();
    }

    /* JADX INFO: renamed from: h */
    public void m23814h() {
        m23804a((JSONObject) null);
    }

    /* JADX INFO: renamed from: i */
    public void mo23815i() {
    }
}
