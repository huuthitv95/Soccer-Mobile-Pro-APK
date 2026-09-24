package com.applovin.impl.privacy.consentFlow;

import android.net.Uri;
import com.applovin.impl.sdk.C1768p;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class TermsAndPrivacyPolicyFlowSettingsImpl implements AppLovinTermsAndPrivacyPolicyFlowSettings {

    /* JADX INFO: renamed from: a */
    private boolean f2576a;

    /* JADX INFO: renamed from: b */
    private boolean f2577b;

    /* JADX INFO: renamed from: c */
    private AppLovinSdkConfiguration.ConsentFlowUserGeography f2578c;

    /* JADX INFO: renamed from: d */
    private Uri f2579d;

    /* JADX INFO: renamed from: e */
    private Uri f2580e;

    public TermsAndPrivacyPolicyFlowSettingsImpl(boolean z, boolean z2, AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography, Uri uri, Uri uri2) {
        this.f2576a = z;
        this.f2577b = z2;
        this.f2578c = consentFlowUserGeography;
        this.f2579d = uri;
        this.f2580e = uri2;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public AppLovinSdkConfiguration.ConsentFlowUserGeography getDebugUserGeography() {
        return this.f2578c;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public Uri getPrivacyPolicyUri() {
        return this.f2579d;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public Uri getTermsOfServiceUri() {
        return this.f2580e;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public boolean isEnabled() {
        return this.f2576a;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public void setDebugUserGeography(AppLovinSdkConfiguration.ConsentFlowUserGeography consentFlowUserGeography) {
        C1768p.m5166g("ConsentFlowSettingsImpl", "Setting user debug geography: " + consentFlowUserGeography);
        this.f2578c = consentFlowUserGeography;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public void setEnabled(boolean z) {
        C1768p.m5166g("ConsentFlowSettingsImpl", "Setting Terms and Privacy Policy Flow enabled: " + z);
        this.f2576a = z;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public void setPrivacyPolicyUri(Uri uri) {
        C1768p.m5166g("ConsentFlowSettingsImpl", "Setting privacy policy: " + uri);
        this.f2579d = uri;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public void setShowTermsAndPrivacyPolicyAlertInGdpr(boolean z) {
        C1768p.m5166g("ConsentFlowSettingsImpl", "Setting show Terms and Privacy Policy alert in GDPR: " + z);
        this.f2577b = z;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public void setTermsOfServiceUri(Uri uri) {
        C1768p.m5166g("ConsentFlowSettingsImpl", "Setting terms of service: " + uri);
        this.f2580e = uri;
    }

    @Override // com.applovin.sdk.AppLovinTermsAndPrivacyPolicyFlowSettings
    public boolean shouldShowTermsAndPrivacyPolicyAlertInGdpr() {
        return this.f2577b;
    }

    public String toString() {
        return "ConsentFlowSettings{isEnabled=" + this.f2576a + ", privacyPolicyUri=" + this.f2579d + ", termsOfServiceUri=" + this.f2580e + AbstractJsonLexerKt.END_OBJ;
    }
}
