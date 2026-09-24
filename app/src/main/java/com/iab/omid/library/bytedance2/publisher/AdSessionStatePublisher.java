package com.iab.omid.library.bytedance2.publisher;

import android.webkit.WebView;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.iab.omid.library.bytedance2.adsession.AdEvents;
import com.iab.omid.library.bytedance2.adsession.AdSessionConfiguration;
import com.iab.omid.library.bytedance2.adsession.AdSessionContext;
import com.iab.omid.library.bytedance2.adsession.C10970a;
import com.iab.omid.library.bytedance2.adsession.ErrorType;
import com.iab.omid.library.bytedance2.adsession.VerificationScriptResource;
import com.iab.omid.library.bytedance2.adsession.media.MediaEvents;
import com.iab.omid.library.bytedance2.internal.C10984g;
import com.iab.omid.library.bytedance2.internal.C10985h;
import com.iab.omid.library.bytedance2.utils.C10994a;
import com.iab.omid.library.bytedance2.utils.C10995b;
import com.iab.omid.library.bytedance2.utils.C10996c;
import com.iab.omid.library.bytedance2.utils.C10999f;
import com.iab.omid.library.bytedance2.weakreference.C11016b;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class AdSessionStatePublisher {

    /* JADX INFO: renamed from: a */
    private String f22869a;

    /* JADX INFO: renamed from: b */
    private C11016b f22870b;

    /* JADX INFO: renamed from: c */
    private AdEvents f22871c;

    /* JADX INFO: renamed from: d */
    private MediaEvents f22872d;

    /* JADX INFO: renamed from: e */
    private EnumC10991a f22873e;

    /* JADX INFO: renamed from: f */
    private long f22874f;

    /* JADX INFO: renamed from: com.iab.omid.library.bytedance2.publisher.AdSessionStatePublisher$a */
    enum EnumC10991a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher(String str) {
        m23537a();
        this.f22869a = str;
        this.f22870b = new C11016b(null);
    }

    /* JADX INFO: renamed from: a */
    public void m23537a() {
        this.f22874f = C10999f.m23596b();
        this.f22873e = EnumC10991a.AD_STATE_IDLE;
    }

    /* JADX INFO: renamed from: a */
    public void m23538a(float f) {
        C10985h.m23506a().m23508a(getWebView(), this.f22869a, f);
    }

    /* JADX INFO: renamed from: a */
    void m23539a(WebView webView) {
        this.f22870b = new C11016b(webView);
    }

    /* JADX INFO: renamed from: a */
    public void m23540a(AdEvents adEvents) {
        this.f22871c = adEvents;
    }

    /* JADX INFO: renamed from: a */
    public void m23541a(AdSessionConfiguration adSessionConfiguration) {
        C10985h.m23506a().m23512a(getWebView(), this.f22869a, adSessionConfiguration.toJsonObject());
    }

    /* JADX INFO: renamed from: a */
    public void m23542a(ErrorType errorType, String str) {
        C10985h.m23506a().m23509a(getWebView(), this.f22869a, errorType, str);
    }

    /* JADX INFO: renamed from: a */
    public void mo23543a(C10970a c10970a, AdSessionContext adSessionContext) {
        m23544a(c10970a, adSessionContext, null);
    }

    /* JADX INFO: renamed from: a */
    protected void m23544a(C10970a c10970a, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = c10970a.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        C10996c.m23577a(jSONObject2, "environment", MBridgeConstans.DYNAMIC_VIEW_WX_APP);
        C10996c.m23577a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        C10996c.m23577a(jSONObject2, "deviceInfo", C10995b.m23568d());
        C10996c.m23577a(jSONObject2, "deviceCategory", C10994a.m23563a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        C10996c.m23577a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        C10996c.m23577a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER, adSessionContext.getPartner().getName());
        C10996c.m23577a(jSONObject3, HandleInvocationsFromAdViewer.KEY_OM_PARTNER_VERSION, adSessionContext.getPartner().getVersion());
        C10996c.m23577a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        C10996c.m23577a(jSONObject4, "libraryVersion", "1.4.12-Bytedance2");
        C10996c.m23577a(jSONObject4, RemoteConfigConstants.RequestFieldKey.APP_ID, C10984g.m23503b().m23504a().getApplicationContext().getPackageName());
        C10996c.m23577a(jSONObject2, MBridgeConstans.DYNAMIC_VIEW_WX_APP, jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            C10996c.m23577a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            C10996c.m23577a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource verificationScriptResource : adSessionContext.getVerificationScriptResources()) {
            C10996c.m23577a(jSONObject5, verificationScriptResource.getVendorKey(), verificationScriptResource.getVerificationParameters());
        }
        C10985h.m23506a().m23513a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    /* JADX INFO: renamed from: a */
    public void m23545a(MediaEvents mediaEvents) {
        this.f22872d = mediaEvents;
    }

    /* JADX INFO: renamed from: a */
    public void m23546a(String str) {
        m23548a(str, (JSONObject) null);
    }

    /* JADX INFO: renamed from: a */
    public void m23547a(String str, long j) {
        if (j >= this.f22874f) {
            EnumC10991a enumC10991a = this.f22873e;
            EnumC10991a enumC10991a2 = EnumC10991a.AD_STATE_NOTVISIBLE;
            if (enumC10991a != enumC10991a2) {
                this.f22873e = enumC10991a2;
                C10985h.m23506a().m23510a(getWebView(), this.f22869a, str);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m23548a(String str, JSONObject jSONObject) {
        C10985h.m23506a().m23511a(getWebView(), this.f22869a, str, jSONObject);
    }

    /* JADX INFO: renamed from: a */
    public void m23549a(Date date) {
        if (date == null) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        C10996c.m23577a(jSONObject, "timestamp", Long.valueOf(date.getTime()));
        C10985h.m23506a().m23516a(getWebView(), jSONObject);
    }

    /* JADX INFO: renamed from: a */
    public void m23550a(JSONObject jSONObject) {
        C10985h.m23506a().m23520b(getWebView(), this.f22869a, jSONObject);
    }

    /* JADX INFO: renamed from: a */
    public void m23551a(boolean z) {
        if (m23556e()) {
            C10985h.m23506a().m23519b(getWebView(), this.f22869a, z ? "foregrounded" : "backgrounded");
        }
    }

    /* JADX INFO: renamed from: b */
    public void mo23552b() {
        this.f22870b.clear();
    }

    /* JADX INFO: renamed from: b */
    public void m23553b(String str, long j) {
        if (j >= this.f22874f) {
            this.f22873e = EnumC10991a.AD_STATE_VISIBLE;
            C10985h.m23506a().m23510a(getWebView(), this.f22869a, str);
        }
    }

    /* JADX INFO: renamed from: c */
    public AdEvents m23554c() {
        return this.f22871c;
    }

    /* JADX INFO: renamed from: d */
    public MediaEvents m23555d() {
        return this.f22872d;
    }

    /* JADX INFO: renamed from: e */
    public boolean m23556e() {
        return this.f22870b.get() != null;
    }

    /* JADX INFO: renamed from: f */
    public void m23557f() {
        C10985h.m23506a().m23507a(getWebView(), this.f22869a);
    }

    /* JADX INFO: renamed from: g */
    public void m23558g() {
        C10985h.m23506a().m23518b(getWebView(), this.f22869a);
    }

    public WebView getWebView() {
        return this.f22870b.get();
    }

    /* JADX INFO: renamed from: h */
    public void m23559h() {
        m23550a((JSONObject) null);
    }

    /* JADX INFO: renamed from: i */
    public void mo23560i() {
    }
}
