package com.applovin.impl.mediation.debugger.p024ui.testmode;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Switch;
import android.widget.TextView;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.DTBAdResponse;
import com.applovin.impl.AbstractActivityC1680p3;
import com.applovin.impl.AbstractC1701q7;
import com.applovin.impl.C1559g3;
import com.applovin.impl.C1799w;
import com.applovin.impl.C1808x;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.ads.MaxAppOpenAd;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.applovin.mediation.ads.MaxRewardedAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.C1846R;
import com.ironsource.C11495If;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.applovin.impl.mediation.debugger.ui.testmode.a */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractActivityC1651a extends AbstractActivityC1680p3 implements MaxRewardedAdListener, MaxAdViewAdListener, AdControlButton.InterfaceC1649a, MaxAdRevenueListener, C1799w.a {

    /* JADX INFO: renamed from: a */
    private C1559g3 f2264a;

    /* JADX INFO: renamed from: b */
    private C1748l f2265b;

    /* JADX INFO: renamed from: c */
    private MaxAdView f2266c;

    /* JADX INFO: renamed from: d */
    private MaxAdView f2267d;

    /* JADX INFO: renamed from: e */
    private MaxInterstitialAd f2268e;

    /* JADX INFO: renamed from: f */
    private MaxAppOpenAd f2269f;

    /* JADX INFO: renamed from: g */
    private MaxRewardedAd f2270g;

    /* JADX INFO: renamed from: h */
    private MaxAd f2271h;

    /* JADX INFO: renamed from: i */
    private MaxNativeAdLoader f2272i;

    /* JADX INFO: renamed from: j */
    private List f2273j;

    /* JADX INFO: renamed from: k */
    private String f2274k;

    /* JADX INFO: renamed from: l */
    private AdControlButton f2275l;

    /* JADX INFO: renamed from: m */
    private AdControlButton f2276m;

    /* JADX INFO: renamed from: n */
    private AdControlButton f2277n;

    /* JADX INFO: renamed from: o */
    private AdControlButton f2278o;

    /* JADX INFO: renamed from: p */
    private AdControlButton f2279p;

    /* JADX INFO: renamed from: q */
    private AdControlButton f2280q;

    /* JADX INFO: renamed from: r */
    private Button f2281r;

    /* JADX INFO: renamed from: s */
    private Button f2282s;

    /* JADX INFO: renamed from: t */
    private FrameLayout f2283t;

    /* JADX INFO: renamed from: u */
    private FrameLayout f2284u;

    /* JADX INFO: renamed from: v */
    private Switch f2285v;

    /* JADX INFO: renamed from: w */
    private Switch f2286w;

    /* JADX INFO: renamed from: x */
    private Map f2287x;

    /* JADX INFO: renamed from: com.applovin.impl.mediation.debugger.ui.testmode.a$a */
    class a extends MaxNativeAdListener {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ MaxNativeAdView f2288a;

        a(MaxNativeAdView maxNativeAdView) {
            this.f2288a = maxNativeAdView;
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdClicked(MaxAd maxAd) {
            AbstractActivityC1651a.this.onAdClicked(maxAd);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoadFailed(String str, MaxError maxError) {
            AbstractActivityC1651a.this.onAdLoadFailed(str, maxError);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
            if (AbstractActivityC1651a.this.f2271h != null) {
                AbstractActivityC1651a.this.f2272i.destroy(AbstractActivityC1651a.this.f2271h);
            }
            AbstractActivityC1651a.this.f2271h = maxAd;
            AbstractActivityC1651a.this.f2272i.render(this.f2288a, maxAd);
            AbstractActivityC1651a.this.f2284u.removeAllViews();
            AbstractActivityC1651a.this.f2284u.addView(this.f2288a);
            AbstractActivityC1651a.this.onAdLoaded(maxAd);
        }
    }

    /* JADX INFO: renamed from: a */
    private AdControlButton m3455a(String str) {
        if (str.equals("test_mode_banner") || str.equals("test_mode_leader")) {
            return this.f2275l;
        }
        if (str.equals("test_mode_mrec")) {
            return this.f2276m;
        }
        if (str.equals("test_mode_interstitial")) {
            return this.f2277n;
        }
        if (str.equals("test_mode_app_open")) {
            return this.f2278o;
        }
        if (str.equals(this.f2274k)) {
            return this.f2279p;
        }
        if (str.equals("test_mode_native")) {
            return this.f2280q;
        }
        throw new IllegalArgumentException("Invalid test mode ad unit identifier provided " + str);
    }

    /* JADX INFO: renamed from: a */
    private void m3458a() {
        MaxAdFormat maxAdFormat;
        String str;
        boolean zIsTablet = AppLovinSdkUtils.isTablet(this);
        FrameLayout frameLayout = (FrameLayout) findViewById(C1846R.id.banner_ad_view_container);
        if (zIsTablet) {
            maxAdFormat = MaxAdFormat.LEADER;
            ((TextView) findViewById(C1846R.id.banner_label)).setText("Leader");
            str = "test_mode_leader";
        } else {
            maxAdFormat = MaxAdFormat.BANNER;
            str = "test_mode_banner";
        }
        if (!this.f2264a.m2715r().contains(maxAdFormat)) {
            findViewById(C1846R.id.banner_control_view).setVisibility(8);
            frameLayout.setVisibility(8);
            return;
        }
        MaxAdView maxAdView = new MaxAdView(str, maxAdFormat, this.f2265b.m4758A0(), this);
        this.f2266c = maxAdView;
        maxAdView.setExtraParameter("adaptive_banner", "false");
        this.f2266c.setExtraParameter("disable_auto_retries", "true");
        this.f2266c.setExtraParameter("disable_precache", "true");
        this.f2266c.setExtraParameter("allow_pause_auto_refresh_immediately", "true");
        this.f2266c.stopAutoRefresh();
        this.f2266c.setListener(this);
        frameLayout.addView(this.f2266c, new FrameLayout.LayoutParams(AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getWidth()), AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getHeight())));
        AdControlButton adControlButton = (AdControlButton) findViewById(C1846R.id.banner_control_button);
        this.f2275l = adControlButton;
        adControlButton.setOnClickListener(this);
        this.f2275l.setFormat(maxAdFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m3459a(View view) {
        this.f2283t.setVisibility(0);
        this.f2284u.setVisibility(8);
        this.f2281r.setBackgroundColor(-1);
        this.f2282s.setBackgroundColor(-3355444);
    }

    /* JADX INFO: renamed from: a */
    private void m3460a(MaxAdFormat maxAdFormat) {
        C1768p.m5166g("MaxDebuggerMultiAdActivity", "Loading test " + maxAdFormat.getDisplayName() + " Ad from " + this.f2264a.m2704g());
        MaxAdFormat maxAdFormat2 = MaxAdFormat.BANNER;
        boolean z = (maxAdFormat2 == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) && this.f2285v.isChecked();
        MaxAdFormat maxAdFormat3 = MaxAdFormat.MREC;
        boolean z2 = maxAdFormat3 == maxAdFormat && this.f2286w.isChecked();
        if (z || z2) {
            this.f2265b.m4857u0().m2924a(this.f2264a.m2720w());
        } else {
            this.f2265b.m4857u0().m2924a(getTestModeNetwork(maxAdFormat));
        }
        if (maxAdFormat2 == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            this.f2266c.loadAd();
            return;
        }
        if (maxAdFormat3 == maxAdFormat) {
            this.f2267d.loadAd();
            this.f2281r.callOnClick();
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f2268e.loadAd();
            return;
        }
        if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f2269f.loadAd();
            return;
        }
        if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f2270g.loadAd();
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f2272i.loadAd();
            this.f2282s.callOnClick();
        }
    }

    /* JADX INFO: renamed from: b */
    private void m3462b() {
        List listM2715r = this.f2264a.m2715r();
        MaxAdFormat maxAdFormat = MaxAdFormat.INTERSTITIAL;
        if (!listM2715r.contains(maxAdFormat)) {
            findViewById(C1846R.id.interstitial_control_view).setVisibility(8);
            return;
        }
        MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd("test_mode_interstitial", this.f2265b.m4758A0(), this);
        this.f2268e = maxInterstitialAd;
        maxInterstitialAd.setExtraParameter("disable_auto_retries", "true");
        this.f2268e.setListener(this);
        AdControlButton adControlButton = (AdControlButton) findViewById(C1846R.id.interstitial_control_button);
        this.f2277n = adControlButton;
        adControlButton.setOnClickListener(this);
        this.f2277n.setFormat(maxAdFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void m3463b(View view) {
        this.f2284u.setVisibility(0);
        this.f2283t.setVisibility(8);
        this.f2282s.setBackgroundColor(-1);
        this.f2281r.setBackgroundColor(-3355444);
    }

    /* JADX INFO: renamed from: b */
    private void m3464b(MaxAdFormat maxAdFormat) {
        C1768p.m5166g("MaxDebuggerMultiAdActivity", "Showing test " + maxAdFormat.getDisplayName() + " Ad from " + this.f2264a.m2704g());
        if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f2268e.showAd();
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f2269f.showAd();
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f2270g.showAd();
        }
    }

    /* JADX INFO: renamed from: c */
    private void m3466c() {
        this.f2283t = (FrameLayout) findViewById(C1846R.id.mrec_ad_view_container);
        List listM2715r = this.f2264a.m2715r();
        MaxAdFormat maxAdFormat = MaxAdFormat.MREC;
        if (!listM2715r.contains(maxAdFormat)) {
            findViewById(C1846R.id.mrec_control_view).setVisibility(8);
            this.f2283t.setVisibility(8);
            return;
        }
        MaxAdView maxAdView = new MaxAdView("test_mode_mrec", maxAdFormat, this.f2265b.m4758A0(), this);
        this.f2267d = maxAdView;
        maxAdView.setExtraParameter("disable_auto_retries", "true");
        this.f2267d.setExtraParameter("disable_precache", "true");
        this.f2267d.setExtraParameter("allow_pause_auto_refresh_immediately", "true");
        this.f2267d.stopAutoRefresh();
        this.f2267d.setListener(this);
        this.f2283t.addView(this.f2267d, new FrameLayout.LayoutParams(-1, -1));
        AdControlButton adControlButton = (AdControlButton) findViewById(C1846R.id.mrec_control_button);
        this.f2276m = adControlButton;
        adControlButton.setOnClickListener(this);
        this.f2276m.setFormat(maxAdFormat);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public /* synthetic */ void m3467c(View view) {
        this.f2266c.removeAllViews();
        this.f2275l.setControlState(AdControlButton.EnumC1650b.LOAD);
    }

    /* JADX INFO: renamed from: d */
    private void m3468d() {
        this.f2284u = (FrameLayout) findViewById(C1846R.id.native_ad_view_container);
        if (!this.f2264a.m2696I()) {
            findViewById(C1846R.id.native_control_view).setVisibility(8);
            this.f2284u.setVisibility(8);
            return;
        }
        MaxNativeAdView maxNativeAdView = new MaxNativeAdView(new MaxNativeAdViewBinder.Builder(C1846R.layout.max_native_ad_template_1).setTitleTextViewId(C1846R.id.applovin_native_title_text_view).setAdvertiserTextViewId(C1846R.id.applovin_native_advertiser_text_view).setBodyTextViewId(C1846R.id.applovin_native_body_text_view).setCallToActionButtonId(C1846R.id.applovin_native_cta_button).setIconImageViewId(C1846R.id.applovin_native_icon_image_view).setOptionsContentViewGroupId(C1846R.id.applovin_native_options_view).setStarRatingContentViewGroupId(C1846R.id.applovin_native_star_rating_view).setMediaContentViewGroupId(C1846R.id.applovin_native_media_content_view).build(), this);
        MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader("test_mode_native");
        this.f2272i = maxNativeAdLoader;
        maxNativeAdLoader.setExtraParameter("disable_auto_retries", "true");
        this.f2272i.setNativeAdListener(new a(maxNativeAdView));
        this.f2272i.setRevenueListener(this);
        AdControlButton adControlButton = (AdControlButton) findViewById(C1846R.id.native_control_button);
        this.f2280q = adControlButton;
        adControlButton.setOnClickListener(this);
        this.f2280q.setFormat(MaxAdFormat.NATIVE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public /* synthetic */ void m3469d(View view) {
        this.f2267d.removeAllViews();
        this.f2276m.setControlState(AdControlButton.EnumC1650b.LOAD);
    }

    /* JADX INFO: renamed from: e */
    private void m3470e() {
        List listM2715r = this.f2264a.m2715r();
        MaxAdFormat maxAdFormat = MaxAdFormat.REWARDED;
        if (!listM2715r.contains(maxAdFormat)) {
            findViewById(C1846R.id.rewarded_control_view).setVisibility(8);
            return;
        }
        String str = "test_mode_rewarded_" + this.f2264a.m2710m();
        this.f2274k = str;
        MaxRewardedAd maxRewardedAd = MaxRewardedAd.getInstance(str, this.f2265b.m4758A0(), this);
        this.f2270g = maxRewardedAd;
        maxRewardedAd.setExtraParameter("disable_auto_retries", "true");
        this.f2270g.setListener(this);
        AdControlButton adControlButton = (AdControlButton) findViewById(C1846R.id.rewarded_control_button);
        this.f2279p = adControlButton;
        adControlButton.setOnClickListener(this);
        this.f2279p.setFormat(maxAdFormat);
    }

    @Override // com.applovin.impl.AbstractActivityC1680p3
    protected C1748l getSdk() {
        return this.f2265b;
    }

    public String getTestModeNetwork(MaxAdFormat maxAdFormat) {
        return (this.f2264a.m2721x() == null || !this.f2264a.m2721x().containsKey(maxAdFormat)) ? this.f2264a.m2710m() : (String) this.f2264a.m2721x().get(maxAdFormat);
    }

    public void initialize(C1559g3 c1559g3) {
        this.f2264a = c1559g3;
        this.f2265b = c1559g3.m2712o();
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdClicked(MaxAd maxAd) {
        AbstractC1701q7.m4055a(C11495If.f24687f, maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdCollapsed(MaxAd maxAd) {
        AbstractC1701q7.m4055a("onAdCollapsed", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        m3455a(maxAd.getAdUnitId()).setControlState(AdControlButton.EnumC1650b.LOAD);
        AbstractC1701q7.m4057a("Failed to display " + maxAd.getFormat().getDisplayName(), "MAX Error\nCode: " + maxError.getCode() + "\nMessage: " + maxError.getMessage() + "\n\n" + maxAd.getNetworkName() + " Display Error\nCode: " + maxError.getMediatedNetworkErrorCode() + "\nMessage: " + maxError.getMediatedNetworkErrorMessage(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayed(MaxAd maxAd) {
        AbstractC1701q7.m4055a("onAdDisplayed", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdExpanded(MaxAd maxAd) {
        AbstractC1701q7.m4055a("onAdExpanded", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdHidden(MaxAd maxAd) {
        AbstractC1701q7.m4055a("onAdHidden", maxAd, this);
    }

    @Override // com.applovin.impl.C1799w.a
    public void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.BANNER == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            this.f2266c.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.MREC == maxAdFormat) {
            this.f2267d.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f2268e.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f2269f.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f2270g.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f2272i.setLocalExtraParameter("amazon_ad_error", adError);
        }
        m3460a(maxAdFormat);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(String str, MaxError maxError) {
        AdControlButton adControlButtonM3455a = m3455a(str);
        adControlButtonM3455a.setControlState(AdControlButton.EnumC1650b.LOAD);
        AbstractC1701q7.m4049a(maxError, adControlButtonM3455a.getFormat().getLabel(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(MaxAd maxAd) {
        AdControlButton adControlButtonM3455a = m3455a(maxAd.getAdUnitId());
        if (maxAd.getFormat().isAdViewAd() || maxAd.getFormat().equals(MaxAdFormat.NATIVE)) {
            adControlButtonM3455a.setControlState(AdControlButton.EnumC1650b.LOAD);
        } else {
            adControlButtonM3455a.setControlState(AdControlButton.EnumC1650b.SHOW);
        }
    }

    @Override // com.applovin.impl.C1799w.a
    public void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.BANNER == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            this.f2266c.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.MREC == maxAdFormat) {
            this.f2267d.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f2268e.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f2269f.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f2270g.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f2272i.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        }
        m3460a(maxAdFormat);
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        AbstractC1701q7.m4055a("onAdRevenuePaid", maxAd, this);
    }

    @Override // com.applovin.impl.mediation.debugger.p024ui.testmode.AdControlButton.InterfaceC1649a
    public void onClick(AdControlButton adControlButton) {
        MaxAdFormat format = adControlButton.getFormat();
        AdControlButton.EnumC1650b enumC1650b = AdControlButton.EnumC1650b.LOAD;
        if (enumC1650b != adControlButton.getControlState()) {
            if (AdControlButton.EnumC1650b.SHOW == adControlButton.getControlState()) {
                adControlButton.setControlState(enumC1650b);
                m3464b(format);
                return;
            }
            return;
        }
        adControlButton.setControlState(AdControlButton.EnumC1650b.LOADING);
        Map map = this.f2287x;
        if (map == null || map.get(format) == null) {
            m3460a(format);
        } else {
            ((C1799w) this.f2287x.get(format)).m5489a();
        }
    }

    @Override // com.applovin.impl.AbstractActivityC1680p3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f2264a == null) {
            C1768p.m5167h("MaxDebuggerMultiAdActivity", "Failed to initialize activity with a network model.");
            return;
        }
        setContentView(C1846R.layout.mediation_debugger_multi_ad_activity);
        setTitle(this.f2264a.m2704g() + " Test Ads");
        this.f2273j = this.f2265b.m4857u0().m2927b();
        m3458a();
        m3466c();
        m3462b();
        m3470e();
        m3468d();
        findViewById(C1846R.id.app_open_ad_control_view).setVisibility(8);
        this.f2281r = (Button) findViewById(C1846R.id.show_mrec_button);
        this.f2282s = (Button) findViewById(C1846R.id.show_native_button);
        if (this.f2264a.m2696I() && this.f2264a.m2715r().contains(MaxAdFormat.MREC)) {
            this.f2284u.setVisibility(8);
            this.f2281r.setBackgroundColor(-1);
            this.f2282s.setBackgroundColor(-3355444);
            this.f2281r.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.a$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f$0.m3459a(view);
                }
            });
            this.f2282s.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.a$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f$0.m3463b(view);
                }
            });
        } else {
            this.f2281r.setVisibility(8);
            this.f2282s.setVisibility(8);
        }
        this.f2285v = (Switch) findViewById(C1846R.id.native_banner_switch);
        this.f2286w = (Switch) findViewById(C1846R.id.native_mrec_switch);
        if (this.f2264a.m2697J()) {
            this.f2285v.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.a$$ExternalSyntheticLambda2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f$0.m3467c(view);
                }
            });
            this.f2286w.setOnClickListener(new View.OnClickListener() { // from class: com.applovin.impl.mediation.debugger.ui.testmode.a$$ExternalSyntheticLambda3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f$0.m3469d(view);
                }
            });
        } else {
            this.f2285v.setVisibility(8);
            this.f2286w.setVisibility(8);
        }
        if (!StringUtils.isValidString(this.f2264a.m2702e()) || this.f2264a.m2701d() == null || this.f2264a.m2701d().size() <= 0) {
            return;
        }
        AdRegistration.getInstance(this.f2264a.m2702e(), this);
        AdRegistration.enableTesting(true);
        AdRegistration.enableLogging(true);
        HashMap map = new HashMap(this.f2264a.m2701d().size());
        for (MaxAdFormat maxAdFormat : this.f2264a.m2701d().keySet()) {
            map.put(maxAdFormat, new C1799w((C1808x) this.f2264a.m2701d().get(maxAdFormat), maxAdFormat, getApplicationContext(), this));
        }
        this.f2287x = map;
    }

    @Override // com.applovin.impl.AbstractActivityC1680p3, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        this.f2265b.m4857u0().m2925a(this.f2273j);
        MaxAdView maxAdView = this.f2266c;
        if (maxAdView != null) {
            maxAdView.destroy();
        }
        MaxAdView maxAdView2 = this.f2267d;
        if (maxAdView2 != null) {
            maxAdView2.destroy();
        }
        MaxInterstitialAd maxInterstitialAd = this.f2268e;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.f2270g;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
        }
        MaxNativeAdLoader maxNativeAdLoader = this.f2272i;
        if (maxNativeAdLoader != null) {
            MaxAd maxAd = this.f2271h;
            if (maxAd != null) {
                maxNativeAdLoader.destroy(maxAd);
            }
            this.f2272i.destroy();
        }
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
        AbstractC1701q7.m4055a("onUserRewarded", maxAd, this);
    }
}
