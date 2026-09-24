package com.fyber.inneractive.sdk.bidder.adm;

import android.text.TextUtils;
import android.util.Base64;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.CreativeType;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.factories.AbstractC8065d;
import com.fyber.inneractive.sdk.factories.InterfaceC8066e;
import com.fyber.inneractive.sdk.flow.C8078c0;
import com.fyber.inneractive.sdk.ignite.EnumC8253m;
import com.fyber.inneractive.sdk.network.C8375f1;
import com.fyber.inneractive.sdk.response.AbstractC9084b;
import com.fyber.inneractive.sdk.response.AbstractC9087e;
import com.fyber.inneractive.sdk.response.EnumC9083a;
import com.fyber.inneractive.sdk.response.InterfaceC9092j;
import com.fyber.inneractive.sdk.util.AbstractC9162k;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Locale;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.bidder.adm.y */
/* JADX INFO: loaded from: classes4.dex */
public final class C7854y implements InterfaceC9092j {

    /* JADX INFO: renamed from: a */
    public AdmParametersOuterClass$AdmParameters f17514a;

    /* JADX INFO: renamed from: b */
    public final String f17515b;

    /* JADX INFO: renamed from: c */
    public String f17516c;

    /* JADX INFO: renamed from: d */
    public final String f17517d;

    public C7854y(String str, String str2) {
        this.f17515b = str;
        this.f17517d = str2;
    }

    @Override // com.fyber.inneractive.sdk.response.InterfaceC9092j
    /* JADX INFO: renamed from: a */
    public final String mo20333a() {
        return this.f17516c;
    }

    /* JADX INFO: renamed from: a */
    public final void m20334a(C8078c0 c8078c0, C8006r c8006r) {
        try {
            AdmParametersOuterClass$AdmParameters from = AdmParametersOuterClass$AdmParameters.parseFrom(Base64.decode(this.f17515b, 0));
            this.f17514a = from;
            if (from != null) {
                c8078c0.m20494a();
            }
            m20336b(c8078c0, c8006r);
        } catch (Exception e) {
            IAlog.m21950f("failed to parse ad markup payload %s", e.getMessage());
            AbstractC9183r.f21478b.post(new RunnableC7850u(c8078c0, e));
        }
    }

    /* JADX WARN: Code duplicated, block: B:161:0x0320  */
    @Override // com.fyber.inneractive.sdk.response.InterfaceC9092j
    /* JADX INFO: renamed from: a */
    public final void mo20335a(AbstractC9084b abstractC9084b) {
        int i;
        EnumC8253m enumC8253m;
        abstractC9084b.f21280a.f21291A = true;
        IAConfigManager.f17654M.f17691w.f17893f = true;
        ImpressionData impressionData = new ImpressionData();
        AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters = this.f17514a;
        if (admParametersOuterClass$AdmParameters == null) {
            return;
        }
        int iMo20330a = admParametersOuterClass$AdmParameters.getAdType().mo20330a();
        if (this.f17514a.hasErrorMessage()) {
            this.f17514a.getErrorMessage();
        }
        String sessionId = this.f17514a.hasSessionId() ? this.f17514a.getSessionId() : null;
        Long lValueOf = this.f17514a.hasContentId() ? Long.valueOf(this.f17514a.getContentId()) : null;
        if (this.f17514a.hasPublisherId()) {
            this.f17514a.getPublisherId();
        }
        Integer numValueOf = this.f17514a.hasAdWidth() ? Integer.valueOf(this.f17514a.getAdWidth()) : null;
        Integer numValueOf2 = this.f17514a.hasAdHeight() ? Integer.valueOf(this.f17514a.getAdHeight()) : null;
        String sdkImpressionUrl = this.f17514a.hasSdkImpressionUrl() ? this.f17514a.getSdkImpressionUrl() : null;
        String sdkClickUrl = this.f17514a.hasSdkClickUrl() ? this.f17514a.getSdkClickUrl() : null;
        Integer numValueOf3 = this.f17514a.hasAdExpirationInterval() ? Integer.valueOf(this.f17514a.getAdExpirationInterval()) : null;
        String adCompletionUrl = this.f17514a.hasAdCompletionUrl() ? this.f17514a.getAdCompletionUrl() : null;
        abstractC9084b.f21281b = this.f17514a.hasAdUnitId() ? this.f17514a.getAdUnitId() : null;
        String strName = this.f17514a.getAdUnitType().name();
        Locale locale = Locale.US;
        strName.toLowerCase(locale);
        String lowerCase = this.f17514a.hasAdUnitId() ? this.f17514a.getAdUnitDisplayType().name().toLowerCase(locale) : null;
        String adNetworkName = this.f17514a.hasAdNetworkName() ? this.f17514a.getAdNetworkName() : null;
        Long lValueOf2 = this.f17514a.hasAdNetworkId() ? Long.valueOf(this.f17514a.getAdNetworkId()) : null;
        String creativeId = this.f17514a.hasCreativeId() ? this.f17514a.getCreativeId() : null;
        Long l = lValueOf;
        String adDomain = this.f17514a.hasAdDomain() ? this.f17514a.getAdDomain() : null;
        Integer num = numValueOf;
        String appBundleId = this.f17514a.hasAppBundleId() ? this.f17514a.getAppBundleId() : null;
        Integer num2 = numValueOf2;
        String campaignId = this.f17514a.hasCampaignId() ? this.f17514a.getCampaignId() : null;
        Integer num3 = numValueOf3;
        String string = this.f17514a.hasPricingValue() ? Double.toString(this.f17514a.getPricingValue()) : null;
        String str = lowerCase;
        String strValueOf = this.f17514a.hasSpotId() ? String.valueOf(this.f17514a.getSpotId()) : null;
        impressionData.setCpmValue(string);
        impressionData.setCurrency("USD");
        if (this.f17514a.hasMrcData()) {
            int pixelPercent = this.f17514a.getMrcData().hasPixelPercent() ? this.f17514a.getMrcData().getPixelPercent() : 0;
            int pixelDuration = this.f17514a.getMrcData().hasPixelDuration() ? this.f17514a.getMrcData().getPixelDuration() : -1;
            String pixelImpressionUrl = this.f17514a.getMrcData().hasPixelImpressionUrl() ? this.f17514a.getMrcData().getPixelImpressionUrl() : null;
            AbstractC9087e abstractC9087e = abstractC9084b.f21280a;
            abstractC9087e.f21319s = pixelPercent;
            abstractC9087e.f21320t = pixelDuration;
            abstractC9087e.f21321u = pixelImpressionUrl;
        }
        Boolean boolValueOf = this.f17514a.hasSkipMode() ? Boolean.valueOf(this.f17514a.getSkipMode()) : null;
        if (abstractC9084b.mo21888b()) {
            abstractC9084b.f21280a.f21317q = this.f17514a.toString();
        }
        abstractC9084b.f21280a.m21892a(num3 != null ? num3.toString() : "");
        impressionData.setImpressionId(sessionId);
        impressionData.setDemandSource(adNetworkName);
        abstractC9084b.f21280a.f21304d = l != null ? l.toString() : "";
        abstractC9084b.f21280a.getClass();
        abstractC9084b.f21280a.getClass();
        AbstractC9087e abstractC9087e2 = abstractC9084b.f21280a;
        abstractC9087e2.f21324x = appBundleId;
        abstractC9087e2.f21325y = this.f17517d;
        abstractC9087e2.f21326z = strValueOf;
        if (lValueOf2 != null) {
            impressionData.setDemandId(lValueOf2);
        }
        AbstractC9087e abstractC9087e3 = abstractC9084b.f21280a;
        abstractC9087e3.f21307g = iMo20330a;
        if (num != null) {
            abstractC9087e3.f21305e = num.intValue();
        }
        if (num2 != null) {
            abstractC9084b.f21280a.f21306f = num2.intValue();
        }
        AbstractC9087e abstractC9087e4 = abstractC9084b.f21280a;
        abstractC9087e4.f21311k = sdkImpressionUrl;
        abstractC9087e4.f21312l = sdkClickUrl;
        abstractC9087e4.f21315o = adCompletionUrl;
        abstractC9087e4.f21313m = abstractC9084b.f21281b;
        try {
            abstractC9087e4.f21314n = UnitDisplayType.fromValue(str);
        } catch (IllegalArgumentException unused) {
            abstractC9084b.f21280a.f21314n = UnitDisplayType.INTERSTITIAL;
        }
        if (!TextUtils.isEmpty(creativeId)) {
            impressionData.setCreativeId(creativeId);
        }
        if (!TextUtils.isEmpty(adDomain)) {
            impressionData.setAdvertiserDomain(adDomain);
        }
        if (!TextUtils.isEmpty(campaignId)) {
            impressionData.setCampaignId(campaignId);
        }
        impressionData.setCountry(AbstractC9162k.m21973i());
        abstractC9084b.f21280a.f21318r = impressionData;
        if (boolValueOf == null) {
            i = -1;
        } else {
            i = boolValueOf.booleanValue() ? 1 : 0;
        }
        abstractC9084b.f21280a.f21322v = i;
        String igniteInstallUrl = this.f17514a.hasIgniteInstallUrl() ? this.f17514a.getIgniteInstallUrl() : null;
        if (!TextUtils.isEmpty(igniteInstallUrl)) {
            abstractC9084b.f21280a.f21294D = igniteInstallUrl;
        }
        AbstractC9087e abstractC9087e5 = abstractC9084b.f21280a;
        EnumC8253m enumC8253m2 = EnumC8253m.NONE;
        AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters2 = this.f17514a;
        if (admParametersOuterClass$AdmParameters2 == null) {
            enumC8253m = enumC8253m2;
        } else {
            EnumC7843n igniteMode = admParametersOuterClass$AdmParameters2.hasIgniteMode() ? this.f17514a.getIgniteMode() : null;
            if (igniteMode == null || igniteMode.equals(EnumC7843n.NONE)) {
                enumC8253m = enumC8253m2;
            } else {
                enumC8253m = igniteMode.equals(EnumC7843n.SINGLETAP) ? EnumC8253m.SINGLE_TAP : EnumC8253m.TRUE_SINGLE_TAP;
            }
        }
        if (enumC8253m != null) {
            enumC8253m2 = enumC8253m;
        } else {
            abstractC9087e5.getClass();
        }
        abstractC9087e5.f21295E = enumC8253m2;
        String igniteLauncherActivity = this.f17514a.hasIgniteLauncherActivity() ? this.f17514a.getIgniteLauncherActivity() : null;
        if (!TextUtils.isEmpty(igniteLauncherActivity)) {
            abstractC9084b.f21280a.f21296F = igniteLauncherActivity;
        }
        Boolean boolValueOf2 = this.f17514a.hasBrandBidderDontShowEndcard() ? Boolean.valueOf(this.f17514a.getBrandBidderDontShowEndcard()) : null;
        if (boolValueOf2 != null) {
            abstractC9084b.f21280a.f21292B = boolValueOf2.booleanValue() ? "1" : "0";
        }
        String brandBidderCtaText = this.f17514a.getBrandBidderCtaText();
        if (!TextUtils.isEmpty(brandBidderCtaText)) {
            abstractC9084b.f21280a.f21293C = brandBidderCtaText;
        }
        Boolean boolValueOf3 = this.f17514a.hasMraidVideoOMSignal() ? Boolean.valueOf(this.f17514a.getMraidVideoOMSignal()) : null;
        if (boolValueOf3 != null) {
            abstractC9084b.f21280a.f21297G = boolValueOf3.booleanValue();
        }
        abstractC9084b.f21280a.f21300J = CreativeType.fromValue(this.f17514a.getCreativeType());
    }

    /* JADX INFO: renamed from: b */
    public final void m20336b(C8078c0 c8078c0, C8006r c8006r) {
        AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters = this.f17514a;
        AbstractC9087e abstractC9087e = null;
        String markupUrl = (admParametersOuterClass$AdmParameters == null || !admParametersOuterClass$AdmParameters.hasMarkupUrl()) ? null : this.f17514a.getMarkupUrl();
        if (TextUtils.isEmpty(markupUrl)) {
            AbstractC9183r.f21478b.post(new RunnableC7853x(c8078c0));
            return;
        }
        try {
            AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters2 = this.f17514a;
            int iMo20330a = admParametersOuterClass$AdmParameters2 != null ? admParametersOuterClass$AdmParameters2.getAdType().mo20330a() : EnumC7832c.OTHER.mo20330a();
            EnumC9083a enumC9083aM21884a = EnumC9083a.m21884a(iMo20330a);
            if (enumC9083aM21884a == null) {
                enumC9083aM21884a = EnumC9083a.RETURNED_ADTYPE_MRAID;
            }
            InterfaceC8066e interfaceC8066e = (InterfaceC8066e) AbstractC8065d.f17949a.f17950a.get(enumC9083aM21884a);
            AbstractC9084b abstractC9084bMo20466b = interfaceC8066e != null ? interfaceC8066e.mo20466b() : null;
            if (abstractC9084bMo20466b != null) {
                abstractC9084bMo20466b.f21280a = abstractC9084bMo20466b.mo21885a();
                mo20335a(abstractC9084bMo20466b);
                abstractC9087e = abstractC9084bMo20466b.f21280a;
            } else {
                IAlog.m21945a("failed parse adm network request with no input stream - received ad type %s does not have an appropriate parser", Integer.valueOf(iMo20330a));
            }
        } catch (Exception e) {
            IAlog.m21944a("failed parse adm network request with no input stream", e, new Object[0]);
        }
        AbstractC9087e abstractC9087e2 = abstractC9087e;
        C8375f1 c8375f1 = new C8375f1(new C7851v(this, c8078c0, abstractC9087e2), markupUrl, this, c8006r, abstractC9087e2);
        c8375f1.f18714d = new C7852w(this);
        IAConfigManager.f17654M.f17686r.m20768a(c8375f1);
    }
}
