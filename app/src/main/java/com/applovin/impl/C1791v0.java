package com.applovin.impl;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.URLUtil;
import com.applovin.communicator.AppLovinCommunicator;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import com.applovin.impl.privacy.consentFlow.TermsAndPrivacyPolicyFlowSettingsImpl;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkUtils;
import com.chartboost.sdk.privacy.model.GDPR;
import com.google.android.gms.ads.AdError;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.applovin.impl.v0 */
/* JADX INFO: loaded from: classes3.dex */
public class C1791v0 implements AppLovinCommunicatorSubscriber, AppLovinCommunicatorPublisher {

    /* JADX INFO: renamed from: a */
    private final C1748l f3448a;

    /* JADX INFO: renamed from: b */
    private final C1480a1 f3449b;

    /* JADX INFO: renamed from: com.applovin.impl.v0$a */
    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        static final /* synthetic */ int[] f3450a;

        static {
            int[] iArr = new int[AppLovinSdkConfiguration.ConsentFlowUserGeography.values().length];
            f3450a = iArr;
            try {
                iArr[AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3450a[AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3450a[AppLovinSdkConfiguration.ConsentFlowUserGeography.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.v0$b */
    public static class b {

        /* JADX INFO: renamed from: a */
        private boolean f3451a;

        /* JADX INFO: renamed from: b */
        private boolean f3452b;

        /* JADX INFO: renamed from: c */
        private boolean f3453c;

        /* JADX INFO: renamed from: d */
        private AppLovinCmpError f3454d;

        /* JADX INFO: renamed from: e */
        private C1773t0 f3455e;

        public b() {
        }

        public b(C1773t0 c1773t0) {
            this.f3455e = c1773t0;
        }

        /* JADX INFO: renamed from: a */
        protected void m5355a(C1773t0 c1773t0) {
            this.f3455e = c1773t0;
        }

        /* JADX INFO: renamed from: a */
        protected void m5356a(AppLovinCmpError appLovinCmpError) {
            this.f3454d = appLovinCmpError;
        }

        /* JADX INFO: renamed from: a */
        public boolean m5357a() {
            return this.f3453c;
        }

        /* JADX INFO: renamed from: b */
        public boolean m5358b() {
            return this.f3451a;
        }

        /* JADX INFO: renamed from: c */
        protected void m5359c() {
            this.f3453c = true;
            this.f3451a = true;
        }

        /* JADX INFO: renamed from: d */
        protected void m5360d() {
            this.f3452b = true;
            this.f3451a = true;
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.v0$c */
    public interface c {
        /* JADX INFO: renamed from: a */
        void mo4869a(b bVar);
    }

    public C1791v0(C1748l c1748l) {
        this.f3448a = c1748l;
        this.f3449b = new C1480a1(c1748l);
        if (AbstractC1701q7.m4117k(C1748l.m4756p())) {
            AppLovinCommunicator.getInstance(C1748l.m4756p()).subscribe(this, "start_sdk_consent_flow");
        }
    }

    /* JADX INFO: renamed from: a */
    private Uri m5332a() {
        return Uri.parse((String) this.f3448a.m4801a(this.f3448a.m4774J0() ? C1831z4.f3893b7 : C1831z4.f3885a7));
    }

    /* JADX INFO: renamed from: a */
    public static TermsAndPrivacyPolicyFlowSettingsImpl m5333a(Context context) {
        if (context == null) {
            C1768p.m5167h("ConsentFlowManager", "Failed to get default Terms and Privacy Policy flow settings.");
            return new TermsAndPrivacyPolicyFlowSettingsImpl(false, false, AppLovinSdkConfiguration.ConsentFlowUserGeography.UNKNOWN, null, null);
        }
        String strM4028a = AbstractC1701q7.m4028a(context.getResources().getIdentifier("applovin_settings", "raw", context.getPackageName()), context, (C1748l) null);
        JSONObject jSONObject = JsonUtils.getJSONObject(StringUtils.isValidString(strM4028a) ? JsonUtils.jsonObjectFromJsonString(strM4028a, new JSONObject()) : new JSONObject(), "consent_flow_settings", new JSONObject());
        Boolean bool = Boolean.FALSE;
        Boolean bool2 = JsonUtils.getBoolean(jSONObject, "consent_flow_enabled", bool);
        Boolean bool3 = JsonUtils.getBoolean(jSONObject, "consent_flow_show_terms_and_privacy_policy_alert_in_gdpr", bool);
        String string = JsonUtils.getString(jSONObject, "consent_flow_debug_user_geography", "");
        String string2 = JsonUtils.getString(jSONObject, "consent_flow_terms_of_service", null);
        Uri uri = URLUtil.isValidUrl(string2) ? Uri.parse(string2) : null;
        String string3 = JsonUtils.getString(jSONObject, "consent_flow_privacy_policy", null);
        return new TermsAndPrivacyPolicyFlowSettingsImpl(bool2.booleanValue(), bool3.booleanValue(), m5334a(string), URLUtil.isValidUrl(string3) ? Uri.parse(string3) : null, uri);
    }

    /* JADX INFO: renamed from: a */
    private static AppLovinSdkConfiguration.ConsentFlowUserGeography m5334a(String str) {
        if (GDPR.GDPR_STANDARD.equalsIgnoreCase(str)) {
            return AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
        }
        return "other".equalsIgnoreCase(str) ? AppLovinSdkConfiguration.ConsentFlowUserGeography.OTHER : AppLovinSdkConfiguration.ConsentFlowUserGeography.UNKNOWN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m5335a(Activity activity) {
        final Uri uriM5332a = m5332a();
        new AlertDialog.Builder(activity).setTitle("Missing Privacy Policy URL").setMessage("You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL").setNeutralButton("Go To Documentation", new DialogInterface.OnClickListener() { // from class: com.applovin.impl.v0$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f$0.m5336a(uriM5332a, dialogInterface, i);
            }
        }).setNegativeButton("DISMISS", new DialogInterface.OnClickListener() { // from class: com.applovin.impl.v0$$ExternalSyntheticLambda1
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                C1791v0.m5340b(uriM5332a, dialogInterface, i);
            }
        }).create().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m5336a(Uri uri, DialogInterface dialogInterface, int i) {
        AbstractC1664n7.m3685a(uri, C1748l.m4756p(), this.f3448a);
        throw new IllegalStateException("You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL Please refer to " + uri.toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m5337a(b bVar) {
        if (bVar.f3455e == null) {
            this.f3448a.m4818b(C1511b5.f1180t, Boolean.FALSE);
        }
        AppLovinCommunicator.getInstance(C1748l.m4756p()).getMessagingService().publish(new AppLovinCommunicatorMessage(new Bundle(), "sdk_consent_flow_finished", this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m5338a(c cVar, b bVar) {
        if (bVar.f3455e == null) {
            this.f3448a.m4818b(C1511b5.f1180t, Boolean.FALSE);
        }
        cVar.mo4869a(bVar);
    }

    /* JADX INFO: renamed from: b */
    private void m5339b(final Activity activity) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.v0$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m5335a(activity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m5340b(Uri uri, DialogInterface dialogInterface, int i) {
        throw new IllegalStateException("You cannot use the AppLovin SDK's consent flow without defining a Privacy Policy URL Please refer to " + uri.toString());
    }

    /* JADX INFO: renamed from: c */
    private TermsAndPrivacyPolicyFlowSettingsImpl m5341c() {
        return (TermsAndPrivacyPolicyFlowSettingsImpl) this.f3448a.m4847p0().getTermsAndPrivacyPolicyFlowSettings();
    }

    /* JADX INFO: renamed from: a */
    public void m5342a(Activity activity, final c cVar) {
        if (!m5350j()) {
            cVar.mo4869a(new b(new C1773t0(C1773t0.f3268c, "Failed to start consent flow. Please make sure that the consent flow is enabled.")));
        } else if (m5341c().getPrivacyPolicyUri() == null) {
            m5339b(activity);
        } else {
            this.f3449b.m1801a(activity, new c() { // from class: com.applovin.impl.v0$$ExternalSyntheticLambda3
                @Override // com.applovin.impl.C1791v0.c
                /* JADX INFO: renamed from: a */
                public final void mo4869a(C1791v0.b bVar) {
                    this.f$0.m5338a(cVar, bVar);
                }
            });
        }
    }

    /* JADX INFO: renamed from: b */
    public JSONObject m5343b() {
        TermsAndPrivacyPolicyFlowSettingsImpl termsAndPrivacyPolicyFlowSettingsImplM5341c = m5341c();
        Uri privacyPolicyUri = termsAndPrivacyPolicyFlowSettingsImplM5341c.getPrivacyPolicyUri();
        Uri termsOfServiceUri = termsAndPrivacyPolicyFlowSettingsImplM5341c.getTermsOfServiceUri();
        JSONObject jSONObject = new JSONObject();
        JsonUtils.putString(jSONObject, "enabled", String.valueOf(m5350j()));
        JsonUtils.putString(jSONObject, "privacy_policy_url", privacyPolicyUri != null ? privacyPolicyUri.toString() : "");
        JsonUtils.putString(jSONObject, "terms_of_service_url", termsOfServiceUri != null ? termsOfServiceUri.toString() : "");
        return jSONObject;
    }

    /* JADX INFO: renamed from: d */
    public AppLovinSdkConfiguration.ConsentFlowUserGeography m5344d() {
        return m5341c().getDebugUserGeography();
    }

    /* JADX INFO: renamed from: e */
    public String m5345e() {
        Object objM5346f = m5346f();
        Object objM5348h = m5348h();
        StringBuilder sb = new StringBuilder("\nConsent Flow Enabled - ");
        sb.append(m5350j());
        sb.append("\nTerms of Service - ");
        if (objM5348h == null) {
            objM5348h = AdError.UNDEFINED_DOMAIN;
        }
        sb.append(objM5348h);
        sb.append("\nPrivacy Policy - ");
        if (objM5346f == null) {
            objM5346f = AdError.UNDEFINED_DOMAIN;
        }
        sb.append(objM5346f);
        return sb.toString();
    }

    /* JADX INFO: renamed from: f */
    public Uri m5346f() {
        return m5341c().getPrivacyPolicyUri();
    }

    /* JADX INFO: renamed from: g */
    public String m5347g() {
        return "Migrate to the new Terms and Privacy Policy Flow by following these steps:\n\t1. Delete the 'terms_flow_settings' entry from your 'applovin_settings.xml' file.\n\t2. Follow the integration instructions in our documentation: " + m5332a();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public String getCommunicatorId() {
        return "consent_flow_manager";
    }

    /* JADX INFO: renamed from: h */
    public Uri m5348h() {
        return m5341c().getTermsOfServiceUri();
    }

    /* JADX INFO: renamed from: i */
    public boolean m5349i() {
        return this.f3449b.m1802a();
    }

    /* JADX INFO: renamed from: j */
    public boolean m5350j() {
        Map<String, String> extraParameters = this.f3448a.m4847p0().getExtraParameters();
        return extraParameters.containsKey("consent_flow_enabled") ? Boolean.parseBoolean(extraParameters.get("consent_flow_enabled")) : m5341c().isEnabled();
    }

    /* JADX INFO: renamed from: k */
    public boolean m5351k() {
        if (AbstractC1701q7.m4092c(this.f3448a)) {
            int i = a.f3450a[m5344d().ordinal()];
            if (i == 1) {
                return true;
            }
            if (i == 2) {
                return false;
            }
        }
        return this.f3448a.m4860w().getConsentFlowUserGeography() == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR;
    }

    /* JADX INFO: renamed from: l */
    public boolean m5352l() {
        return this.f3448a.m4847p0().getExtraParameters().containsKey("terms_flow_settings");
    }

    /* JADX INFO: renamed from: m */
    public boolean m5353m() {
        return m5341c().shouldShowTermsAndPrivacyPolicyAlertInGdpr();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        this.f3449b.m1801a(this.f3448a.m4861w0(), new c() { // from class: com.applovin.impl.v0$$ExternalSyntheticLambda2
            @Override // com.applovin.impl.C1791v0.c
            /* JADX INFO: renamed from: a */
            public final void mo4869a(C1791v0.b bVar) {
                this.f$0.m5337a(bVar);
            }
        });
    }
}
