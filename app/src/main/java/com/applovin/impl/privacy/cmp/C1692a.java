package com.applovin.impl.privacy.cmp;

import android.app.Activity;
import android.os.Bundle;
import com.applovin.impl.AbstractC1701q7;
import com.applovin.impl.C1548f2;
import com.applovin.impl.C1616m0;
import com.applovin.impl.C1831z4;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.ump.ConsentDebugSettings;
import com.google.android.ump.ConsentForm;
import com.google.android.ump.ConsentInformation;
import com.google.android.ump.ConsentRequestParameters;
import com.google.android.ump.FormError;
import com.google.android.ump.UserMessagingPlatform;
import java.util.HashMap;

/* JADX INFO: renamed from: com.applovin.impl.privacy.cmp.a */
/* JADX INFO: loaded from: classes3.dex */
public class C1692a {

    /* JADX INFO: renamed from: a */
    private final C1748l f2572a;

    /* JADX INFO: renamed from: b */
    private final C1768p f2573b;

    /* JADX INFO: renamed from: c */
    private ConsentForm f2574c;

    /* JADX INFO: renamed from: d */
    private int f2575d;

    /* JADX INFO: renamed from: com.applovin.impl.privacy.cmp.a$a */
    public interface a {
        void onFlowHidden(Bundle bundle);

        void onFlowLoadFailed(CmpErrorImpl cmpErrorImpl);

        void onFlowLoaded(Bundle bundle);

        void onFlowShowFailed(CmpErrorImpl cmpErrorImpl);
    }

    public C1692a(C1748l c1748l) {
        this.f2572a = c1748l;
        this.f2573b = c1748l.m4782Q();
        ConsentInformation consentInformation = UserMessagingPlatform.getConsentInformation(C1748l.m4756p());
        m3931a("Initializing with SDK Version: " + m3938b() + ", consentStatus: " + consentInformation.getConsentStatus() + ", consentFormAvailable: " + consentInformation.isConsentFormAvailable());
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0016  */
    /* JADX INFO: renamed from: a */
    private CmpErrorImpl m3923a(FormError formError, String str) {
        AppLovinCmpError.Code code = AppLovinCmpError.Code.UNSPECIFIED;
        int errorCode = formError.getErrorCode();
        if (errorCode == 1 || errorCode == 2) {
            code = AppLovinCmpError.Code.FORM_UNAVAILABLE;
        } else if (errorCode == 3) {
            code = AppLovinCmpError.Code.INTEGRATION_ERROR;
        } else if (errorCode == 4) {
            code = AppLovinCmpError.Code.FORM_UNAVAILABLE;
        }
        return new CmpErrorImpl(code, str, formError.getErrorCode(), formError.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m3924a(Activity activity, final a aVar) {
        ConsentInformation consentInformation = UserMessagingPlatform.getConsentInformation(activity);
        boolean zIsConsentFormAvailable = consentInformation.isConsentFormAvailable();
        int consentStatus = consentInformation.getConsentStatus();
        m3931a("Loaded parameters consentStatus: " + consentStatus + ", consentFormAvailable: " + zIsConsentFormAvailable);
        if (!zIsConsentFormAvailable) {
            m3934b("Failed to load form.");
            aVar.onFlowLoadFailed(new CmpErrorImpl(AppLovinCmpError.Code.FORM_UNAVAILABLE, "Consent form unavailable"));
            return;
        }
        if (consentStatus == 2) {
            m3931a("Successfully requested consent info");
            m3931a("Loading consent form...");
            UserMessagingPlatform.loadConsentForm(activity, new UserMessagingPlatform.OnConsentFormLoadSuccessListener() { // from class: com.applovin.impl.privacy.cmp.a$$ExternalSyntheticLambda5
                @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener
                public final void onConsentFormLoadSuccess(ConsentForm consentForm) {
                    this.f$0.m3926a(aVar, consentForm);
                }
            }, new UserMessagingPlatform.OnConsentFormLoadFailureListener() { // from class: com.applovin.impl.privacy.cmp.a$$ExternalSyntheticLambda6
                @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener
                public final void onConsentFormLoadFailure(FormError formError) {
                    this.f$0.m3927a(aVar, formError);
                }
            });
            return;
        }
        m3934b("Failed to load with consent status: " + consentStatus);
        aVar.onFlowLoadFailed(new CmpErrorImpl(AppLovinCmpError.Code.FORM_NOT_REQUIRED, "Consent form not required for consent status: " + consentStatus));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m3925a(final C1616m0 c1616m0, final a aVar, final FormError formError) {
        if (formError == null) {
            m3931a("Consent form finished showing");
            aVar.onFlowHidden(null);
            return;
        }
        String strValueOf = String.valueOf(formError.getErrorCode());
        String message = formError.getMessage();
        HashMap map = new HashMap(2);
        map.put("error_code", strValueOf);
        map.put("error_message", message);
        this.f2572a.m4764E().m2678a(C1548f2.f1507V0, "googleConsentFormDismissed", map);
        if (m3935c(strValueOf)) {
            m3931a("Consent form was dismissed due to error: " + message);
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.privacy.cmp.a$$ExternalSyntheticLambda7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m3930a(formError, c1616m0, aVar);
                }
            });
            return;
        }
        m3934b("Failed to show with error: " + message);
        aVar.onFlowShowFailed(m3923a(formError, "Consent form show failed"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m3926a(a aVar, ConsentForm consentForm) {
        m3931a("Successfully loaded consent form");
        this.f2574c = consentForm;
        aVar.onFlowLoaded(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m3927a(a aVar, FormError formError) {
        m3934b("Failed to load with error: " + formError.getMessage());
        aVar.onFlowLoadFailed(m3923a(formError, "Consent form load failed"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m3928a(a aVar, FormError formError, C1616m0 c1616m0, ConsentForm consentForm) {
        m3931a("Successfully re-loaded consent form");
        this.f2574c = consentForm;
        Activity activityM4861w0 = this.f2572a.m4861w0();
        if (activityM4861w0 == null) {
            aVar.onFlowShowFailed(m3923a(formError, "Consent form show failed"));
        } else {
            m3939b(activityM4861w0, c1616m0, aVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m3929a(a aVar, FormError formError, FormError formError2) {
        m3934b("Retry to load failed with error: " + formError2.getMessage());
        aVar.onFlowShowFailed(m3923a(formError, "Consent form show failed"));
    }

    /* JADX INFO: renamed from: a */
    private void m3931a(String str) {
        if (C1768p.m5160a()) {
            this.f2573b.m5171a("GoogleCmpAdapter", str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void m3932b(a aVar, FormError formError) {
        m3934b("Failed to request consent info with error: " + formError.getMessage());
        aVar.onFlowLoadFailed(m3923a(formError, "Consent info update failed"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void m3930a(final FormError formError, final C1616m0 c1616m0, final a aVar) {
        m3931a("Retrying to load and show consent form...");
        this.f2575d++;
        UserMessagingPlatform.loadConsentForm(C1748l.m4756p(), new UserMessagingPlatform.OnConsentFormLoadSuccessListener() { // from class: com.applovin.impl.privacy.cmp.a$$ExternalSyntheticLambda2
            @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadSuccessListener
            public final void onConsentFormLoadSuccess(ConsentForm consentForm) {
                this.f$0.m3928a(aVar, formError, c1616m0, consentForm);
            }
        }, new UserMessagingPlatform.OnConsentFormLoadFailureListener() { // from class: com.applovin.impl.privacy.cmp.a$$ExternalSyntheticLambda3
            @Override // com.google.android.ump.UserMessagingPlatform.OnConsentFormLoadFailureListener
            public final void onConsentFormLoadFailure(FormError formError2) {
                this.f$0.m3929a(aVar, formError, formError2);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    private void m3934b(String str) {
        if (C1768p.m5160a()) {
            this.f2573b.m5174b("GoogleCmpAdapter", str);
        }
    }

    /* JADX INFO: renamed from: c */
    private boolean m3935c(String str) {
        if (!this.f2572a.m4821c(C1831z4.f3920e7).contains(str)) {
            return false;
        }
        Integer num = (Integer) this.f2572a.m4801a(C1831z4.f3911d7);
        return num.intValue() < 0 || this.f2575d < num.intValue();
    }

    /* JADX INFO: renamed from: a */
    public void m3936a() {
        if (this.f2574c != null) {
            this.f2574c = null;
        }
        this.f2575d = 0;
    }

    /* JADX INFO: renamed from: a */
    public void m3937a(final Activity activity, C1616m0 c1616m0, final a aVar) {
        ConsentRequestParameters.Builder builder = new ConsentRequestParameters.Builder();
        if (AbstractC1701q7.m4092c(this.f2572a) && c1616m0.m3167a() == AppLovinSdkConfiguration.ConsentFlowUserGeography.GDPR) {
            builder.setConsentDebugSettings(new ConsentDebugSettings.Builder(activity).setForceTesting(true).setDebugGeography(1).addTestDeviceHashedId(StringUtils.emptyIfNull(this.f2572a.m4847p0().getExtraParameters().get("google_test_device_hashed_id"))).build());
        }
        UserMessagingPlatform.getConsentInformation(activity).requestConsentInfoUpdate(activity, builder.build(), new ConsentInformation.OnConsentInfoUpdateSuccessListener() { // from class: com.applovin.impl.privacy.cmp.a$$ExternalSyntheticLambda0
            @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateSuccessListener
            public final void onConsentInfoUpdateSuccess() {
                this.f$0.m3924a(activity, aVar);
            }
        }, new ConsentInformation.OnConsentInfoUpdateFailureListener() { // from class: com.applovin.impl.privacy.cmp.a$$ExternalSyntheticLambda1
            @Override // com.google.android.ump.ConsentInformation.OnConsentInfoUpdateFailureListener
            public final void onConsentInfoUpdateFailure(FormError formError) {
                this.f$0.m3932b(aVar, formError);
            }
        });
    }

    /* JADX INFO: renamed from: b */
    public String m3938b() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public void m3939b(Activity activity, final C1616m0 c1616m0, final a aVar) {
        if (this.f2574c == null) {
            m3934b("Failed to show - not ready yet");
            aVar.onFlowShowFailed(new CmpErrorImpl(AppLovinCmpError.Code.FORM_UNAVAILABLE, "Consent form not ready"));
        } else {
            m3931a("Showing consent form...");
            this.f2574c.show(activity, new ConsentForm.OnConsentFormDismissedListener() { // from class: com.applovin.impl.privacy.cmp.a$$ExternalSyntheticLambda4
                @Override // com.google.android.ump.ConsentForm.OnConsentFormDismissedListener
                public final void onConsentFormDismissed(FormError formError) {
                    this.f$0.m3925a(c1616m0, aVar, formError);
                }
            });
        }
    }

    /* JADX INFO: renamed from: c */
    public void m3940c() {
        m3931a("Resetting consent information");
        UserMessagingPlatform.getConsentInformation(C1748l.m4756p()).reset();
    }

    /* JADX INFO: renamed from: d */
    public boolean m3941d() {
        return true;
    }

    /* JADX INFO: renamed from: e */
    public boolean m3942e() {
        return true;
    }
}
