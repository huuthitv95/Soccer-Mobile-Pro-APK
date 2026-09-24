package com.applovin.impl;

import android.webkit.WebView;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.CreativeType;
import com.iab.omid.library.applovin.adsession.ImpressionType;
import com.iab.omid.library.applovin.adsession.Owner;

/* JADX INFO: renamed from: com.applovin.impl.k4 */
/* JADX INFO: loaded from: classes3.dex */
public class C1600k4 extends AbstractC1570h4 {
    public C1600k4(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        super(appLovinNativeAdImpl);
    }

    @Override // com.applovin.impl.AbstractC1570h4
    /* JADX INFO: renamed from: a */
    protected AdSessionConfiguration mo2801a() {
        try {
            return AdSessionConfiguration.createAdSessionConfiguration(CreativeType.NATIVE_DISPLAY, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NONE, false);
        } catch (Throwable th) {
            if (!C1768p.m5160a()) {
                return null;
            }
            this.f1754c.m5172a(this.f1755d, "Failed to create ad session configuration", th);
            return null;
        }
    }

    @Override // com.applovin.impl.AbstractC1570h4
    /* JADX INFO: renamed from: a */
    protected AdSessionContext mo2802a(WebView webView) {
        try {
            return AdSessionContext.createNativeAdSessionContext(this.f1753b.m4831g0().m3128b(), this.f1753b.m4831g0().m3126a(), this.f1752a.getOpenMeasurementVerificationScriptResources(), this.f1752a.getOpenMeasurementContentUrl(), this.f1752a.getOpenMeasurementCustomReferenceData());
        } catch (Throwable th) {
            if (!C1768p.m5160a()) {
                return null;
            }
            this.f1754c.m5172a(this.f1755d, "Failed to create ad session context", th);
            return null;
        }
    }
}
