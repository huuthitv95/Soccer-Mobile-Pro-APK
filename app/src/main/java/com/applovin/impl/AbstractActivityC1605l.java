package com.applovin.impl;

import android.app.Activity;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.DTBAdResponse;
import com.applovin.impl.mediation.debugger.p024ui.testmode.AdControlButton;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
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
import java.util.List;

/* JADX INFO: renamed from: com.applovin.impl.l */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractActivityC1605l extends AbstractActivityC1680p3 implements AdControlButton.InterfaceC1649a, MaxRewardedAdListener, MaxAdViewAdListener, MaxAdRevenueListener, C1799w.a {

    /* JADX INFO: renamed from: a */
    private C1748l f1984a;

    /* JADX INFO: renamed from: b */
    private C1656n f1985b;

    /* JADX INFO: renamed from: c */
    private C1604k8 f1986c;

    /* JADX INFO: renamed from: d */
    private C1615m f1987d;

    /* JADX INFO: renamed from: e */
    private MaxAdView f1988e;

    /* JADX INFO: renamed from: f */
    private MaxInterstitialAd f1989f;

    /* JADX INFO: renamed from: g */
    private MaxAppOpenAd f1990g;

    /* JADX INFO: renamed from: h */
    private MaxRewardedAd f1991h;

    /* JADX INFO: renamed from: i */
    private MaxNativeAdView f1992i;

    /* JADX INFO: renamed from: j */
    private MaxNativeAdLoader f1993j;

    /* JADX INFO: renamed from: k */
    private MaxAd f1994k;

    /* JADX INFO: renamed from: l */
    private DialogC1703r f1995l;

    /* JADX INFO: renamed from: m */
    private List f1996m;

    /* JADX INFO: renamed from: n */
    private ListView f1997n;

    /* JADX INFO: renamed from: o */
    private View f1998o;

    /* JADX INFO: renamed from: p */
    private AdControlButton f1999p;

    /* JADX INFO: renamed from: q */
    private TextView f2000q;

    /* JADX INFO: renamed from: r */
    private C1799w f2001r;

    /* JADX INFO: renamed from: com.applovin.impl.l$a */
    class a extends MaxNativeAdListener {
        a() {
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdClicked(MaxAd maxAd) {
            AbstractActivityC1605l.this.onAdClicked(maxAd);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoadFailed(String str, MaxError maxError) {
            AbstractActivityC1605l.this.onAdLoadFailed(str, maxError);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
            if (AbstractActivityC1605l.this.f1994k != null) {
                AbstractActivityC1605l.this.f1993j.destroy(AbstractActivityC1605l.this.f1994k);
            }
            AbstractActivityC1605l.this.f1994k = maxAd;
            AbstractActivityC1605l.this.f1993j.render(AbstractActivityC1605l.this.f1992i, maxAd);
            AbstractActivityC1605l.this.onAdLoaded(maxAd);
        }
    }

    /* JADX INFO: renamed from: a */
    private String m3102a() {
        if (this.f1984a.m4857u0().m2928c()) {
            return "Not supported while Test Mode is enabled";
        }
        return this.f1987d.m3162j() != this.f1985b.m3612f() ? "This waterfall is not targeted for the current device" : "Tap to load an ad";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m3103a(DialogInterface dialogInterface) {
        this.f1995l = null;
    }

    /* JADX INFO: renamed from: a */
    private void m3104a(ViewGroup viewGroup, AppLovinSdkUtils.Size size) {
        if (this.f1995l != null) {
            return;
        }
        DialogC1703r dialogC1703r = new DialogC1703r(viewGroup, size, this);
        this.f1995l = dialogC1703r;
        dialogC1703r.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.applovin.impl.l$$ExternalSyntheticLambda0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f$0.m3103a(dialogInterface);
            }
        });
        this.f1995l.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m3105a(final C1748l c1748l, final C1656n c1656n, final C1666o c1666o, C1608l2 c1608l2, final C1775t2 c1775t2) {
        if (c1775t2 instanceof C1615m.b) {
            AbstractC1525d.m2246a(this, MaxDebuggerAdUnitDetailActivity.class, c1748l.m4826e(), new AbstractC1525d.b() { // from class: com.applovin.impl.l$$ExternalSyntheticLambda1
                @Override // com.applovin.impl.AbstractC1525d.b
                /* JADX INFO: renamed from: a */
                public final void mo2130a(Activity activity) {
                    AbstractActivityC1605l.m3106a(c1775t2, c1656n, c1666o, c1748l, (MaxDebuggerAdUnitDetailActivity) activity);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m3106a(C1775t2 c1775t2, C1656n c1656n, C1666o c1666o, C1748l c1748l, MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
        maxDebuggerAdUnitDetailActivity.initialize(c1656n, c1666o, ((C1615m.b) c1775t2).m3166v(), c1748l);
    }

    /* JADX INFO: renamed from: a */
    private void m3107a(MaxAdFormat maxAdFormat) {
        StringBuilder sb = new StringBuilder("Loading live ");
        sb.append(maxAdFormat.getDisplayName());
        sb.append(" Ad from ");
        C1604k8 c1604k8 = this.f1986c;
        sb.append(c1604k8 != null ? c1604k8.m3097b().m5504a() : this.f1987d.m3162j().m3713c());
        C1768p.m5166g("MaxDebuggerAdUnitDetailActivity", sb.toString());
        if (this.f1986c != null) {
            this.f1984a.m4857u0().m2925a(this.f1986c.m3097b().m5505b());
        }
        if (maxAdFormat.isAdViewAd()) {
            this.f1988e.setPlacement("[Mediation Debugger Live Ad]");
            this.f1988e.loadAd();
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.f1985b.m3607a()) {
            this.f1989f.loadAd();
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.f1985b.m3607a()) {
            this.f1990g.loadAd();
            return;
        }
        if (MaxAdFormat.REWARDED == this.f1985b.m3607a()) {
            this.f1991h.loadAd();
        } else if (MaxAdFormat.NATIVE != this.f1985b.m3607a()) {
            AbstractC1701q7.m4053a("Live ads currently unavailable for ad format", this);
        } else {
            this.f1993j.setPlacement("[Mediation Debugger Live Ad]");
            this.f1993j.loadAd();
        }
    }

    /* JADX INFO: renamed from: b */
    private void m3109b() {
        String strM3609c = this.f1985b.m3609c();
        if (this.f1985b.m3607a().isAdViewAd()) {
            MaxAdView maxAdView = new MaxAdView(strM3609c, this.f1985b.m3607a());
            this.f1988e = maxAdView;
            maxAdView.setExtraParameter("adaptive_banner", "false");
            this.f1988e.setExtraParameter("disable_auto_retries", "true");
            this.f1988e.setExtraParameter("disable_precache", "true");
            this.f1988e.setExtraParameter("allow_pause_auto_refresh_immediately", "true");
            this.f1988e.stopAutoRefresh();
            this.f1988e.setListener(this);
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.f1985b.m3607a()) {
            MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd(strM3609c);
            this.f1989f = maxInterstitialAd;
            maxInterstitialAd.setExtraParameter("disable_auto_retries", "true");
            this.f1989f.setListener(this);
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.f1985b.m3607a()) {
            MaxAppOpenAd maxAppOpenAd = new MaxAppOpenAd(strM3609c);
            this.f1990g = maxAppOpenAd;
            maxAppOpenAd.setExtraParameter("disable_auto_retries", "true");
            this.f1990g.setListener(this);
            return;
        }
        if (MaxAdFormat.REWARDED == this.f1985b.m3607a()) {
            MaxRewardedAd maxRewardedAd = MaxRewardedAd.getInstance(strM3609c);
            this.f1991h = maxRewardedAd;
            maxRewardedAd.setExtraParameter("disable_auto_retries", "true");
            this.f1991h.setListener(this);
            return;
        }
        if (MaxAdFormat.NATIVE == this.f1985b.m3607a()) {
            this.f1992i = new MaxNativeAdView(new MaxNativeAdViewBinder.Builder(C1846R.layout.max_native_ad_template_1).setTitleTextViewId(C1846R.id.applovin_native_title_text_view).setAdvertiserTextViewId(C1846R.id.applovin_native_advertiser_text_view).setBodyTextViewId(C1846R.id.applovin_native_body_text_view).setCallToActionButtonId(C1846R.id.applovin_native_cta_button).setIconImageViewId(C1846R.id.applovin_native_icon_image_view).setOptionsContentViewGroupId(C1846R.id.applovin_native_options_view).setStarRatingContentViewGroupId(C1846R.id.applovin_native_star_rating_view).setMediaContentViewGroupId(C1846R.id.applovin_native_media_content_view).build(), C1748l.m4756p());
            MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(strM3609c);
            this.f1993j = maxNativeAdLoader;
            maxNativeAdLoader.setExtraParameter("disable_auto_retries", "true");
            this.f1993j.setNativeAdListener(new a());
            this.f1993j.setRevenueListener(this);
        }
    }

    /* JADX INFO: renamed from: b */
    private void m3110b(MaxAdFormat maxAdFormat) {
        StringBuilder sb = new StringBuilder("Showing live ");
        sb.append(maxAdFormat.getDisplayName());
        sb.append(" Ad from ");
        C1604k8 c1604k8 = this.f1986c;
        sb.append(c1604k8 != null ? c1604k8.m3097b().m5504a() : this.f1987d.m3162j().m3713c());
        C1768p.m5166g("MaxDebuggerAdUnitDetailActivity", sb.toString());
        if (maxAdFormat.isAdViewAd()) {
            m3104a(this.f1988e, maxAdFormat.getSize());
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.f1985b.m3607a()) {
            this.f1989f.showAd("[Mediation Debugger Live Ad]");
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.f1985b.m3607a()) {
            this.f1990g.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.REWARDED == this.f1985b.m3607a()) {
            this.f1991h.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.NATIVE == this.f1985b.m3607a()) {
            m3104a(this.f1992i, MaxAdFormat.MREC.getSize());
        }
    }

    @Override // com.applovin.impl.AbstractActivityC1680p3
    protected C1748l getSdk() {
        return this.f1984a;
    }

    public void initialize(final C1656n c1656n, final C1666o c1666o, C1604k8 c1604k8, final C1748l c1748l) {
        List listM4190a;
        this.f1984a = c1748l;
        this.f1985b = c1656n;
        this.f1986c = c1604k8;
        this.f1996m = c1748l.m4857u0().m2927b();
        C1615m c1615m = new C1615m(c1656n, c1666o, c1604k8, this);
        this.f1987d = c1615m;
        c1615m.m5278a(new AbstractViewOnClickListenerC1784u2.a() { // from class: com.applovin.impl.l$$ExternalSyntheticLambda2
            @Override // com.applovin.impl.AbstractViewOnClickListenerC1784u2.a
            /* JADX INFO: renamed from: a */
            public final void mo2129a(C1608l2 c1608l2, C1775t2 c1775t2) {
                this.f$0.m3105a(c1748l, c1656n, c1666o, c1608l2, c1775t2);
            }
        });
        m3109b();
        if (c1656n.m3612f().m3716f()) {
            if ((c1604k8 != null && !c1604k8.m3097b().m5507d().m2690C()) || (listM4190a = c1748l.m4792W().m4190a(c1656n.m3609c())) == null || listM4190a.isEmpty()) {
                return;
            }
            this.f2001r = new C1799w(listM4190a, c1656n.m3607a(), getApplicationContext(), this);
        }
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
        this.f1999p.setControlState(AdControlButton.EnumC1650b.LOAD);
        this.f2000q.setText("");
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
        if (maxAdFormat.isAdViewAd()) {
            this.f1988e.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f1989f.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f1990g.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f1991h.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f1993j.setLocalExtraParameter("amazon_ad_error", adError);
        }
        m3107a(maxAdFormat);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(String str, MaxError maxError) {
        this.f1999p.setControlState(AdControlButton.EnumC1650b.LOAD);
        this.f2000q.setText("");
        if (204 == maxError.getCode()) {
            AbstractC1701q7.m4057a("No Fill", "No fills often happen in live environments. Please make sure to use the Mediation Debugger test mode before you go live.", this);
            return;
        }
        AbstractC1701q7.m4057a("", "Failed to load with error code: " + maxError.getCode(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(MaxAd maxAd) {
        this.f2000q.setText(maxAd.getNetworkName() + " ad loaded");
        this.f1999p.setControlState(AdControlButton.EnumC1650b.SHOW);
        if (maxAd.getFormat().isAdViewAd()) {
            m3104a(this.f1988e, maxAd.getFormat().getSize());
        } else if (MaxAdFormat.NATIVE == this.f1985b.m3607a()) {
            m3104a(this.f1992i, MaxAdFormat.MREC.getSize());
        }
    }

    @Override // com.applovin.impl.C1799w.a
    public void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            this.f1988e.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f1989f.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f1990g.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f1991h.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f1993j.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        }
        m3107a(maxAdFormat);
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        AbstractC1701q7.m4055a("onAdRevenuePaid", maxAd, this);
    }

    @Override // com.applovin.impl.mediation.debugger.p024ui.testmode.AdControlButton.InterfaceC1649a
    public void onClick(AdControlButton adControlButton) {
        if (this.f1984a.m4857u0().m2928c()) {
            AbstractC1701q7.m4057a("Not Supported", "Ad loads are not supported while Test Mode is enabled. Please restart the app.", this);
            return;
        }
        if (this.f1987d.m3162j() != this.f1985b.m3612f()) {
            AbstractC1701q7.m4057a("Not Supported", "You cannot load an ad from this waterfall because it does not target the current device. To load an ad, please select the targeted waterfall.", this);
            return;
        }
        MaxAdFormat maxAdFormatM3607a = this.f1985b.m3607a();
        AdControlButton.EnumC1650b enumC1650b = AdControlButton.EnumC1650b.LOAD;
        if (enumC1650b == adControlButton.getControlState()) {
            adControlButton.setControlState(AdControlButton.EnumC1650b.LOADING);
            C1799w c1799w = this.f2001r;
            if (c1799w != null) {
                c1799w.m5489a();
                return;
            } else {
                m3107a(maxAdFormatM3607a);
                return;
            }
        }
        if (AdControlButton.EnumC1650b.SHOW == adControlButton.getControlState()) {
            if (!maxAdFormatM3607a.isAdViewAd() && maxAdFormatM3607a != MaxAdFormat.NATIVE) {
                adControlButton.setControlState(enumC1650b);
            }
            m3110b(maxAdFormatM3607a);
        }
    }

    @Override // com.applovin.impl.AbstractActivityC1680p3, android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(C1846R.layout.mediation_debugger_ad_unit_detail_activity);
        setTitle(this.f1987d.m3163k());
        this.f1997n = (ListView) findViewById(C1846R.id.listView);
        this.f1998o = findViewById(C1846R.id.ad_presenter_view);
        this.f1999p = (AdControlButton) findViewById(C1846R.id.ad_control_button);
        this.f2000q = (TextView) findViewById(C1846R.id.status_textview);
        this.f1997n.setAdapter((ListAdapter) this.f1987d);
        this.f2000q.setText(m3102a());
        this.f2000q.setTypeface(Typeface.DEFAULT_BOLD);
        this.f1999p.setOnClickListener(this);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setPadding(0, 10, 0, 0);
        shapeDrawable.getPaint().setColor(-1);
        shapeDrawable.getPaint().setShadowLayer(10, 0.0f, -10, 855638016);
        shapeDrawable.setShape(new RectShape());
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable});
        layerDrawable.setLayerInset(0, 0, 10, 0, 0);
        this.f1998o.setBackground(layerDrawable);
    }

    @Override // com.applovin.impl.AbstractActivityC1680p3, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        if (this.f1986c != null) {
            this.f1984a.m4857u0().m2925a(this.f1996m);
        }
        MaxAdView maxAdView = this.f1988e;
        if (maxAdView != null) {
            maxAdView.destroy();
        }
        MaxInterstitialAd maxInterstitialAd = this.f1989f;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxAppOpenAd maxAppOpenAd = this.f1990g;
        if (maxAppOpenAd != null) {
            maxAppOpenAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.f1991h;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
        }
        MaxNativeAdLoader maxNativeAdLoader = this.f1993j;
        if (maxNativeAdLoader != null) {
            MaxAd maxAd = this.f1994k;
            if (maxAd != null) {
                maxNativeAdLoader.destroy(maxAd);
            }
            this.f1993j.destroy();
        }
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
        AbstractC1701q7.m4055a("onUserRewarded", maxAd, this);
    }
}
