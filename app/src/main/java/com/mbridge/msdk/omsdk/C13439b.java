package com.mbridge.msdk.omsdk;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebView;
import com.iab.omid.library.mmadbridge.Omid;
import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.iab.omid.library.mmadbridge.adsession.AdSessionConfiguration;
import com.iab.omid.library.mmadbridge.adsession.AdSessionContext;
import com.iab.omid.library.mmadbridge.adsession.CreativeType;
import com.iab.omid.library.mmadbridge.adsession.ImpressionType;
import com.iab.omid.library.mmadbridge.adsession.Owner;
import com.iab.omid.library.mmadbridge.adsession.Partner;
import com.iab.omid.library.mmadbridge.adsession.VerificationScriptResource;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.DomainNameUtils;
import com.mbridge.msdk.foundation.same.directory.C13098e;
import com.mbridge.msdk.foundation.same.directory.EnumC13096c;
import com.mbridge.msdk.foundation.same.net.handler.AbstractC13115a;
import com.mbridge.msdk.foundation.same.net.wrapper.C13126e;
import com.mbridge.msdk.foundation.same.report.C13146h;
import com.mbridge.msdk.foundation.tools.C13215o0;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.out.MBConfiguration;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.omsdk.b */
/* JADX INFO: compiled from: OmsdkUtils.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13439b {

    /* JADX INFO: renamed from: a */
    public static final String f37388a = DomainNameUtils.VERIFICATION_URL;

    /* JADX INFO: renamed from: com.mbridge.msdk.omsdk.b$a */
    /* JADX INFO: compiled from: OmsdkUtils.java */
    class a extends AbstractC13115a {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Context f37389b;

        a(Context context) {
            this.f37389b = context;
        }

        @Override // com.mbridge.msdk.foundation.same.net.handler.AbstractC13115a
        /* JADX INFO: renamed from: a */
        public void mo37204a(String str) {
            C13219q0.m37813a("OMSDK", "fetch OMJSContent failed, errorCode = " + str);
            new C13146h(this.f37389b).m37370a("", "", "", "", "fetch OM failed, request failed");
        }

        @Override // com.mbridge.msdk.foundation.same.net.handler.AbstractC13115a
        /* JADX INFO: renamed from: b */
        public void mo37205b(String str) {
            MBridgeConstans.OMID_JS_SERVICE_CONTENT = str;
            C13439b.m38953b(str);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.omsdk.b$b */
    /* JADX INFO: compiled from: OmsdkUtils.java */
    class b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f37390a;

        b(String str) {
            this.f37390a = str;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            try {
                File file = new File(C13098e.m37149b(EnumC13096c.MBRIDGE_OTHER), "/omsdk/om_js_content.txt");
                if (file.exists()) {
                    file.delete();
                }
                C13215o0.m37795a(this.f37390a.getBytes(), file);
            } catch (Exception e) {
                C13219q0.m37813a("OMSDK", e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.omsdk.b$c */
    /* JADX INFO: compiled from: OmsdkUtils.java */
    class c extends AbstractC13115a {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ Context f37391b;

        c(Context context) {
            this.f37391b = context;
        }

        @Override // com.mbridge.msdk.foundation.same.net.handler.AbstractC13115a
        /* JADX INFO: renamed from: a */
        public void mo37204a(String str) {
            C13219q0.m37813a("OMSDK", "fetch OMJSH5Content failed, errorCode = " + str);
            new C13146h(this.f37391b).m37370a("", "", "", "", "fetch OM H5 failed, request failed");
        }

        @Override // com.mbridge.msdk.foundation.same.net.handler.AbstractC13115a
        /* JADX INFO: renamed from: b */
        public void mo37205b(String str) {
            MBridgeConstans.OMID_JS_H5_CONTENT = str;
            C13439b.m38955c(str);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.omsdk.b$d */
    /* JADX INFO: compiled from: OmsdkUtils.java */
    class d implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ String f37392a;

        d(String str) {
            this.f37392a = str;
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            try {
                File file = new File(C13098e.m37149b(EnumC13096c.MBRIDGE_OTHER), "/omsdk/om_js_h5_content.txt");
                if (file.exists()) {
                    file.delete();
                }
                C13215o0.m37795a(this.f37392a.getBytes(), file);
            } catch (Exception e) {
                C13219q0.m37813a("OMSDK", e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static AdSession m38946a(Context context, boolean z, String str, String str2, String str3, String str4, String str5, String str6) {
        Context context2;
        String str7;
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_CONTENT)) {
            MBridgeConstans.OMID_JS_SERVICE_CONTENT = m38947a();
        }
        AdSession adSessionCreateAdSession = null;
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_CONTENT) || TextUtils.isEmpty(str)) {
            C13219q0.m37813a("OMSDK", "createNativeAdSession: TextUtils.isEmpty(omid) = " + TextUtils.isEmpty(str) + " TextUtils.isEmpty(MIntegralConstans.OMID_JS_SERVICE_CONTENT) = " + TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_CONTENT));
            new C13146h(context).m37370a(str2, str6, str3, str4, "failed, OMID_JS_SERVICE_CONTENT null or omid null");
            return null;
        }
        try {
            try {
                m38950a(context);
                try {
                    Partner partnerCreatePartner = Partner.createPartner("Mintegral", MBConfiguration.SDK_VERSION);
                    CreativeType creativeType = z ? CreativeType.NATIVE_DISPLAY : CreativeType.VIDEO;
                    ImpressionType impressionType = ImpressionType.BEGIN_TO_RENDER;
                    Owner owner = Owner.NATIVE;
                    AdSessionConfiguration adSessionConfigurationCreateAdSessionConfiguration = AdSessionConfiguration.createAdSessionConfiguration(creativeType, impressionType, owner, z ? Owner.NONE : owner, false);
                    context2 = context;
                    try {
                        try {
                            str7 = str2;
                            try {
                                adSessionCreateAdSession = AdSession.createAdSession(adSessionConfigurationCreateAdSessionConfiguration, AdSessionContext.createNativeAdSessionContext(partnerCreatePartner, MBridgeConstans.OMID_JS_SERVICE_CONTENT, m38949a(str, context2, str2, str3, str4, str6), str5, str7));
                                C13219q0.m37813a("OMSDK", "adSession create success");
                                return adSessionCreateAdSession;
                            } catch (IllegalArgumentException e) {
                                e = e;
                                C13219q0.m37816b("OMSDK", e.getMessage());
                                new C13146h(context2).m37370a(str2, str6, str3, str4, "failed, exception " + e.getMessage());
                                return adSessionCreateAdSession;
                            } catch (Exception e2) {
                                e = e2;
                                C13219q0.m37816b("OMSDK", e.getMessage());
                                new C13146h(context2).m37370a(str7, str6, str3, str4, "failed, exception " + e.getMessage());
                                return adSessionCreateAdSession;
                            }
                        } catch (IllegalArgumentException e3) {
                            e = e3;
                            C13219q0.m37816b("OMSDK", e.getMessage());
                            new C13146h(context2).m37370a(str2, str6, str3, str4, "failed, exception " + e.getMessage());
                            return adSessionCreateAdSession;
                        } catch (Exception e4) {
                            e = e4;
                            str7 = str2;
                            C13219q0.m37816b("OMSDK", e.getMessage());
                            new C13146h(context2).m37370a(str7, str6, str3, str4, "failed, exception " + e.getMessage());
                            return adSessionCreateAdSession;
                        }
                    } catch (IllegalArgumentException e5) {
                        e = e5;
                    } catch (Exception e6) {
                        e = e6;
                        str7 = str2;
                    }
                } catch (IllegalArgumentException e7) {
                    e = e7;
                    context2 = context;
                }
            } catch (Exception e8) {
                e = e8;
                context2 = context;
            }
        } catch (IllegalArgumentException e9) {
            e = e9;
            context2 = context;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m38954c(Context context) {
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_H5_URL)) {
            MBridgeConstans.OMID_JS_H5_CONTENT = "";
            new C13146h(context).m37370a("", "", "", "", "fetch OM failed, OMID_JS_H5_URL null");
        } else {
            if (context == null) {
                return;
            }
            try {
                new C13438a(context.getApplicationContext()).get(0, MBridgeConstans.OMID_JS_H5_URL, (C13126e) null, new c(context), "om_sdk", 60000L);
            } catch (Exception e) {
                C13219q0.m37816b("OMSDK", e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public static String m38951b() {
        try {
            File file = new File(C13098e.m37149b(EnumC13096c.MBRIDGE_OTHER), "/omsdk/om_js_h5_content.txt");
            return file.exists() ? C13215o0.m37805e(file) : "";
        } catch (Exception e) {
            C13219q0.m37813a("OMSDK", e.getMessage());
            return "";
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m38952b(Context context) {
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_URL)) {
            MBridgeConstans.OMID_JS_SERVICE_CONTENT = "";
            new C13146h(context).m37370a("", "", "", "", "fetch OM failed, OMID_JS_SERVICE_URL null");
        } else {
            if (context == null) {
                return;
            }
            try {
                new C13438a(context.getApplicationContext()).get(0, MBridgeConstans.OMID_JS_SERVICE_URL, (C13126e) null, new a(context), "om_sdk", 60000L);
            } catch (Exception e) {
                C13219q0.m37816b("OMSDK", e.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m38955c(String str) {
        new Thread(new d(str)).start();
    }

    /* JADX INFO: renamed from: b */
    public static void m38953b(String str) {
        new Thread(new b(str)).start();
    }

    /* JADX INFO: renamed from: a */
    public static String m38947a() {
        try {
            return C13215o0.m37805e(new File(C13098e.m37149b(EnumC13096c.MBRIDGE_OTHER), "/omsdk/om_js_content.txt"));
        } catch (Exception e) {
            C13219q0.m37813a("OMSDK", e.getMessage());
            return "";
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m38950a(Context context) {
        if (Omid.isActive()) {
            return;
        }
        Omid.activate(context);
    }

    /* JADX INFO: renamed from: a */
    private static List<VerificationScriptResource> m38949a(String str, Context context, String str2, String str3, String str4, String str5) {
        MalformedURLException malformedURLException;
        IllegalArgumentException illegalArgumentException;
        VerificationScriptResource verificationScriptResourceCreateVerificationScriptResourceWithParameters;
        ArrayList arrayList = new ArrayList();
        try {
            try {
                try {
                    JSONArray jSONArray = new JSONArray(str);
                    if (str != null) {
                        for (int i = 0; i < jSONArray.length(); i++) {
                            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i);
                            String strOptString = jSONObjectOptJSONObject.optString("vkey", "");
                            URL url = new URL(jSONObjectOptJSONObject.optString("et_url", ""));
                            String strOptString2 = jSONObjectOptJSONObject.optString("verification_p", "");
                            if (TextUtils.isEmpty(strOptString2)) {
                                if (TextUtils.isEmpty(strOptString)) {
                                    verificationScriptResourceCreateVerificationScriptResourceWithParameters = VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url);
                                } else {
                                    verificationScriptResourceCreateVerificationScriptResourceWithParameters = VerificationScriptResource.createVerificationScriptResourceWithoutParameters(url);
                                }
                            } else {
                                verificationScriptResourceCreateVerificationScriptResourceWithParameters = VerificationScriptResource.createVerificationScriptResourceWithParameters(strOptString, url, strOptString2);
                            }
                            arrayList.add(verificationScriptResourceCreateVerificationScriptResourceWithParameters);
                        }
                    }
                } catch (IllegalArgumentException e) {
                    illegalArgumentException = e;
                    C13219q0.m37816b("OMSDK", illegalArgumentException.getMessage());
                    IllegalArgumentException illegalArgumentException2 = illegalArgumentException;
                    new C13146h(context).m37370a(str2, str5, str3, str4, "failed, exception " + illegalArgumentException2.getMessage());
                } catch (MalformedURLException e2) {
                    malformedURLException = e2;
                    C13219q0.m37816b("OMSDK", malformedURLException.getMessage());
                    MalformedURLException malformedURLException2 = malformedURLException;
                    new C13146h(context).m37370a(str2, str5, str3, str4, "failed, exception " + malformedURLException2.getMessage());
                }
            } catch (JSONException e3) {
                C13219q0.m37816b("OMSDK", e3.getMessage());
                new C13146h(context).m37370a(str2, str5, str3, str4, "failed, exception " + e3.getMessage());
            }
        } catch (IllegalArgumentException e4) {
            illegalArgumentException = e4;
        } catch (MalformedURLException e5) {
            malformedURLException = e5;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public static AdSession m38945a(Context context, WebView webView, String str, CampaignEx campaignEx) {
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_CONTENT)) {
            MBridgeConstans.OMID_JS_SERVICE_CONTENT = m38947a();
        }
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_H5_CONTENT)) {
            MBridgeConstans.OMID_JS_H5_CONTENT = m38951b();
        }
        if (!TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_CONTENT) && !TextUtils.isEmpty(campaignEx.getOmid())) {
            return m38944a(context, webView, (String) null, CreativeType.DEFINED_BY_JAVASCRIPT);
        }
        C13219q0.m37813a("OMSDK", "createNativeAdSession: TextUtils.isEmpty(omid) = " + TextUtils.isEmpty(campaignEx.getOmid()) + " TextUtils.isEmpty(MIntegralConstans.OMID_JS_SERVICE_CONTENT) = " + TextUtils.isEmpty(MBridgeConstans.OMID_JS_SERVICE_CONTENT));
        new C13146h(context).m37370a(campaignEx.getRequestId(), campaignEx.getRequestIdNotice(), campaignEx.getId(), campaignEx.getCampaignUnitId(), "failed, OMID_JS_SERVICE_CONTENT null or omid null");
        return null;
    }

    /* JADX INFO: renamed from: a */
    public static AdSession m38944a(Context context, WebView webView, String str, CreativeType creativeType) {
        m38950a(context);
        AdSession adSessionCreateAdSession = AdSession.createAdSession(AdSessionConfiguration.createAdSessionConfiguration(CreativeType.HTML_DISPLAY, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NONE, false), AdSessionContext.createHtmlAdSessionContext(Partner.createPartner("Mintegral", MBConfiguration.SDK_VERSION), webView, null, str));
        adSessionCreateAdSession.registerAdView(webView);
        return adSessionCreateAdSession;
    }

    /* JADX INFO: renamed from: a */
    public static String m38948a(String str) {
        if (TextUtils.isEmpty(MBridgeConstans.OMID_JS_H5_CONTENT)) {
            MBridgeConstans.OMID_JS_H5_CONTENT = m38951b();
        }
        return TextUtils.isEmpty(str) ? str : str.replace("/*OMSDK_INSERT_HERE*/", MBridgeConstans.OMID_JS_H5_CONTENT).replace("[INSERT RESOURCE URL]", f37388a);
    }
}
