package com.applovin.impl.mediation.ads;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.applovin.impl.AbstractC1482a3;
import com.applovin.impl.AbstractC1564g8;
import com.applovin.impl.AbstractC1677p0;
import com.applovin.impl.AbstractC1701q7;
import com.applovin.impl.AbstractC1713s;
import com.applovin.impl.AbstractC1776t3;
import com.applovin.impl.AbstractC1793v2;
import com.applovin.impl.AbstractRunnableC1601k5;
import com.applovin.impl.C1529d3;
import com.applovin.impl.C1548f2;
import com.applovin.impl.C1552f6;
import com.applovin.impl.C1574h8;
import com.applovin.impl.C1584i8;
import com.applovin.impl.C1585j;
import com.applovin.impl.C1788u6;
import com.applovin.impl.C1831z4;
import com.applovin.impl.EnumC1575i;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.sdk.C1743g;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxAdViewConfiguration;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class MaxAdViewImpl extends AbstractC1644a implements C1743g.a, C1584i8.a, C1585j.b {

    /* JADX INFO: renamed from: E */
    private static final Map f2130E = new HashMap();

    /* JADX INFO: renamed from: F */
    private static final Object f2131F = new Object();

    /* JADX INFO: renamed from: A */
    private boolean f2132A;

    /* JADX INFO: renamed from: B */
    private boolean f2133B;

    /* JADX INFO: renamed from: C */
    private boolean f2134C;

    /* JADX INFO: renamed from: D */
    private boolean f2135D;

    /* JADX INFO: renamed from: a */
    private final Context f2136a;

    /* JADX INFO: renamed from: b */
    private final MaxAdView f2137b;

    /* JADX INFO: renamed from: c */
    private final String f2138c;

    /* JADX INFO: renamed from: d */
    private final View f2139d;

    /* JADX INFO: renamed from: e */
    private long f2140e;

    /* JADX INFO: renamed from: f */
    private C1529d3 f2141f;

    /* JADX INFO: renamed from: g */
    private String f2142g;

    /* JADX INFO: renamed from: h */
    private String f2143h;

    /* JADX INFO: renamed from: i */
    private final MaxAdViewConfiguration f2144i;

    /* JADX INFO: renamed from: j */
    private final C1632b f2145j;

    /* JADX INFO: renamed from: k */
    private final C1634d f2146k;

    /* JADX INFO: renamed from: l */
    private final C1743g f2147l;

    /* JADX INFO: renamed from: m */
    private final C1574h8 f2148m;

    /* JADX INFO: renamed from: n */
    private final C1584i8 f2149n;

    /* JADX INFO: renamed from: o */
    private final Object f2150o;

    /* JADX INFO: renamed from: p */
    private final Object f2151p;

    /* JADX INFO: renamed from: q */
    private C1529d3 f2152q;

    /* JADX INFO: renamed from: r */
    private MaxAd f2153r;

    /* JADX INFO: renamed from: s */
    private boolean f2154s;

    /* JADX INFO: renamed from: t */
    private boolean f2155t;

    /* JADX INFO: renamed from: u */
    private boolean f2156u;

    /* JADX INFO: renamed from: v */
    private final AtomicBoolean f2157v;

    /* JADX INFO: renamed from: w */
    private boolean f2158w;

    /* JADX INFO: renamed from: x */
    private boolean f2159x;

    /* JADX INFO: renamed from: y */
    private boolean f2160y;

    /* JADX INFO: renamed from: z */
    private boolean f2161z;

    /* JADX INFO: renamed from: com.applovin.impl.mediation.ads.MaxAdViewImpl$b */
    private class C1632b extends AbstractC1633c {
        private C1632b() {
            super();
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            C1768p c1768p = MaxAdViewImpl.this.logger;
            if (C1768p.m5160a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                maxAdViewImpl.logger.m5171a(maxAdViewImpl.tag, "MaxAdListener.onAdLoadFailed(adUnitId=" + str + ", error=" + maxError + "), listener=" + MaxAdViewImpl.this.adListener);
            }
            AbstractC1793v2.m5377a(MaxAdViewImpl.this.adListener, str, maxError, true);
            MaxAdViewImpl.this.m3308a(maxError);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            if (MaxAdViewImpl.this.m3311a()) {
                C1768p c1768p = MaxAdViewImpl.this.logger;
                if (C1768p.m5160a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.m5171a(maxAdViewImpl.tag, "Precache ad with ad unit ID '" + MaxAdViewImpl.this.adUnitId + "' loaded after MaxAdView was destroyed. Destroying the ad.");
                }
                MaxAdViewImpl.this.sdk.m4797Z().destroyAd(maxAd);
                return;
            }
            C1529d3 c1529d3 = (C1529d3) maxAd;
            c1529d3.m3212g(MaxAdViewImpl.this.f2142g);
            c1529d3.m3210f(MaxAdViewImpl.this.f2143h);
            if (c1529d3.m1865z() == null) {
                MaxAdViewImpl.this.sdk.m4797Z().destroyAd(c1529d3);
                onAdLoadFailed(c1529d3.getAdUnitId(), new MaxErrorImpl(-5001, "Ad view not fully loaded"));
                return;
            }
            if (c1529d3.m2354z0()) {
                long jM2349u0 = c1529d3.m2349u0();
                MaxAdViewImpl.this.sdk.m4782Q();
                if (C1768p.m5160a()) {
                    MaxAdViewImpl.this.sdk.m4782Q().m5171a(MaxAdViewImpl.this.tag, "Scheduling banner ad refresh " + jM2349u0 + " milliseconds from now for '" + MaxAdViewImpl.this.adUnitId + "'...");
                }
                MaxAdViewImpl.this.f2147l.m4653a(jM2349u0);
                if (MaxAdViewImpl.this.f2147l.m4657g() || MaxAdViewImpl.this.f2156u) {
                    C1768p c1768p2 = MaxAdViewImpl.this.logger;
                    if (C1768p.m5160a()) {
                        MaxAdViewImpl maxAdViewImpl2 = MaxAdViewImpl.this;
                        maxAdViewImpl2.logger.m5171a(maxAdViewImpl2.tag, "Pausing ad refresh for publisher");
                    }
                    MaxAdViewImpl.this.f2147l.m4659j();
                }
            }
            C1768p c1768p3 = MaxAdViewImpl.this.logger;
            if (C1768p.m5160a()) {
                MaxAdViewImpl maxAdViewImpl3 = MaxAdViewImpl.this;
                maxAdViewImpl3.logger.m5171a(maxAdViewImpl3.tag, "MaxAdListener.onAdLoaded(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
            }
            AbstractC1793v2.m5456f(MaxAdViewImpl.this.adListener, maxAd, true);
            MaxAdViewImpl.this.m3324d(c1529d3);
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.mediation.ads.MaxAdViewImpl$c */
    private abstract class AbstractC1633c implements MaxAdListener, MaxAdViewAdListener, MaxAdRevenueListener, AbstractC1644a.a {
        private AbstractC1633c() {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f2152q)) {
                C1768p c1768p = MaxAdViewImpl.this.logger;
                if (C1768p.m5160a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.m5171a(maxAdViewImpl.tag, "MaxAdListener.onAdClicked(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                AbstractC1793v2.m5375a(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdCollapsed(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f2153r)) {
                MaxAdViewImpl.this.f2153r = null;
                if ((MaxAdViewImpl.this.f2152q.m2348A0() || MaxAdViewImpl.this.f2133B) && MaxAdViewImpl.this.f2154s) {
                    MaxAdViewImpl.this.f2154s = false;
                    MaxAdViewImpl.this.startAutoRefresh();
                }
                C1768p c1768p = MaxAdViewImpl.this.logger;
                if (C1768p.m5160a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.m5171a(maxAdViewImpl.tag, "MaxAdViewAdListener.onAdCollapsed(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                AbstractC1793v2.m5415b(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
            if (maxAd.equals(MaxAdViewImpl.this.f2152q)) {
                C1768p c1768p = MaxAdViewImpl.this.logger;
                if (C1768p.m5160a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.m5171a(maxAdViewImpl.tag, "MaxAdListener.onAdDisplayFailed(ad=" + maxAd + ", error=" + maxError + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                AbstractC1793v2.m5372a(MaxAdViewImpl.this.adListener, maxAd, maxError, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f2152q)) {
                C1768p c1768p = MaxAdViewImpl.this.logger;
                if (C1768p.m5160a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.m5171a(maxAdViewImpl.tag, "MaxAdListener.onAdDisplayed(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                AbstractC1793v2.m5435c(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdViewAdListener
        public void onAdExpanded(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f2152q)) {
                MaxAdViewImpl.this.f2153r = maxAd;
                if ((MaxAdViewImpl.this.f2152q.m2348A0() || MaxAdViewImpl.this.f2133B) && !MaxAdViewImpl.this.f2147l.m4657g()) {
                    MaxAdViewImpl.this.f2154s = true;
                    MaxAdViewImpl.this.stopAutoRefresh();
                }
                C1768p c1768p = MaxAdViewImpl.this.logger;
                if (C1768p.m5160a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.m5171a(maxAdViewImpl.tag, "MaxAdViewAdListener.onAdExpanded(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                AbstractC1793v2.m5444d(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
            if (maxAd.equals(MaxAdViewImpl.this.f2152q)) {
                C1768p c1768p = MaxAdViewImpl.this.logger;
                if (C1768p.m5160a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.m5171a(maxAdViewImpl.tag, "MaxAdListener.onAdHidden(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.adListener);
                }
                AbstractC1793v2.m5451e(MaxAdViewImpl.this.adListener, maxAd, true);
            }
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
            C1768p c1768p = MaxAdViewImpl.this.logger;
            if (C1768p.m5160a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                maxAdViewImpl.logger.m5171a(maxAdViewImpl.tag, "MaxAdRequestListener.onAdRequestStarted(adUnitId=" + str + "), listener=" + MaxAdViewImpl.this.requestListener);
            }
            AbstractC1793v2.m5379a(MaxAdViewImpl.this.requestListener, str, true);
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            C1768p c1768p = MaxAdViewImpl.this.logger;
            if (C1768p.m5160a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                maxAdViewImpl.logger.m5171a(maxAdViewImpl.tag, "MaxAdRevenueListener.onAdRevenuePaid(ad=" + maxAd + "), listener=" + MaxAdViewImpl.this.revenueListener);
            }
            AbstractC1793v2.m5381a(MaxAdViewImpl.this.revenueListener, maxAd, true);
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.mediation.ads.MaxAdViewImpl$d */
    private class C1634d extends AbstractC1633c {
        private C1634d() {
            super();
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            C1768p c1768p = MaxAdViewImpl.this.logger;
            if (C1768p.m5160a()) {
                MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                maxAdViewImpl.logger.m5171a(maxAdViewImpl.tag, "Failed to precache ad for refresh with error code: " + maxError.getCode());
            }
            MaxAdViewImpl.this.m3308a(maxError);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(MaxAd maxAd) {
            if (!MaxAdViewImpl.this.f2159x) {
                C1768p c1768p = MaxAdViewImpl.this.logger;
                if (C1768p.m5160a()) {
                    MaxAdViewImpl maxAdViewImpl = MaxAdViewImpl.this;
                    maxAdViewImpl.logger.m5171a(maxAdViewImpl.tag, "Successfully precached ad for refresh");
                }
                if (((Boolean) MaxAdViewImpl.this.sdk.m4801a(AbstractC1776t3.f3328J7)).booleanValue()) {
                    MaxAdViewImpl.this.m3315b(maxAd);
                    return;
                } else {
                    MaxAdViewImpl.this.m3307a(maxAd);
                    return;
                }
            }
            C1768p c1768p2 = MaxAdViewImpl.this.logger;
            if (C1768p.m5160a()) {
                MaxAdViewImpl maxAdViewImpl2 = MaxAdViewImpl.this;
                maxAdViewImpl2.logger.m5171a(maxAdViewImpl2.tag, "Ad with ad unit ID '" + MaxAdViewImpl.this.adUnitId + "' loaded after MaxAdView was destroyed. Destroying the ad.");
            }
            MaxAdViewImpl.this.sdk.m4797Z().destroyAd(maxAd);
        }
    }

    public MaxAdViewImpl(String str, MaxAdFormat maxAdFormat, MaxAdViewConfiguration maxAdViewConfiguration, MaxAdView maxAdView, View view, Context context) {
        super(str, maxAdFormat, "MaxAdView", AppLovinSdk.getInstance(context).m5807a());
        this.f2138c = UUID.randomUUID().toString().toLowerCase(Locale.US);
        this.f2140e = Long.MAX_VALUE;
        this.f2150o = new Object();
        this.f2151p = new Object();
        this.f2152q = null;
        this.f2153r = null;
        this.f2157v = new AtomicBoolean();
        this.f2159x = false;
        this.f2136a = context.getApplicationContext();
        this.f2137b = maxAdView;
        this.f2139d = view;
        this.f2145j = new C1632b();
        this.f2146k = new C1634d();
        this.f2147l = new C1743g(this.sdk, this);
        this.f2148m = new C1574h8(maxAdView, this.sdk);
        this.f2149n = new C1584i8(maxAdView, this.sdk, this);
        this.f2144i = maxAdViewConfiguration;
        this.sdk.m4838k().m2946a(this);
        if (maxAdViewConfiguration != null && maxAdViewConfiguration.getAdaptiveType() != MaxAdViewConfiguration.AdaptiveType.NONE) {
            setExtraParameter("adaptive_banner", Boolean.toString(true));
            setLocalExtraParameter("adaptive_banner_type", maxAdViewConfiguration.getAdaptiveType().toString());
            int adaptiveWidth = maxAdViewConfiguration.getAdaptiveWidth();
            if (adaptiveWidth > 0) {
                setLocalExtraParameter("adaptive_banner_width", Integer.valueOf(adaptiveWidth));
            }
            int inlineMaximumHeight = maxAdViewConfiguration.getInlineMaximumHeight();
            if (inlineMaximumHeight > 0) {
                setLocalExtraParameter("inline_adaptive_banner_max_height", Integer.valueOf(inlineMaximumHeight));
            }
        }
        m3309a(str);
        if (C1768p.m5160a()) {
            this.logger.m5171a(this.tag, "Created new MaxAdView (" + this + ")");
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3298a(long j) {
        if (!AbstractC1701q7.m4062a(j, ((Long) this.sdk.m4801a(AbstractC1776t3.f3333O7)).longValue()) || this.f2134C) {
            if (C1768p.m5160a()) {
                this.logger.m5171a(this.tag, "No undesired viewability flags matched or forcing precache - scheduling viewability");
            }
            this.f2155t = false;
            m3323d();
            return;
        }
        if (C1768p.m5160a()) {
            this.logger.m5171a(this.tag, "Undesired flags matched - current: " + Long.toBinaryString(j) + ", undesired: " + Long.toBinaryString(j));
        }
        if (C1768p.m5160a()) {
            this.logger.m5171a(this.tag, "Waiting for refresh timer to manually fire request");
        }
        this.f2155t = true;
    }

    /* JADX INFO: renamed from: a */
    private void m3299a(View view, C1529d3 c1529d3) {
        int iM2353y0 = c1529d3.m2353y0();
        int iM2351w0 = c1529d3.m2351w0();
        int iDpToPx = iM2353y0 == -1 ? -1 : AppLovinSdkUtils.dpToPx(view.getContext(), iM2353y0);
        int iDpToPx2 = iM2351w0 != -1 ? AppLovinSdkUtils.dpToPx(view.getContext(), iM2351w0) : -1;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new RelativeLayout.LayoutParams(iDpToPx, iDpToPx2);
        } else {
            layoutParams.width = iDpToPx;
            layoutParams.height = iDpToPx2;
        }
        if (layoutParams instanceof RelativeLayout.LayoutParams) {
            if (C1768p.m5160a()) {
                this.logger.m5171a(this.tag, "Pinning ad view to MAX ad view with width: " + iDpToPx + " and height: " + iDpToPx2 + ".");
            }
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            for (int i : AbstractC1564g8.m2758a(this.f2137b.getGravity(), 10, 14)) {
                layoutParams2.addRule(i);
            }
        }
        view.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m3300a(C1529d3 c1529d3) {
        long jM2848a = this.f2148m.m2848a(c1529d3);
        if (!c1529d3.m2986t0()) {
            m3301a(c1529d3, jM2848a);
        }
        m3298a(jM2848a);
    }

    /* JADX INFO: renamed from: a */
    private void m3301a(C1529d3 c1529d3, long j) {
        if (C1768p.m5160a()) {
            this.logger.m5171a(this.tag, "Scheduling viewability impression for ad...");
        }
        this.sdk.m4797Z().processViewabilityAdImpressionPostback(c1529d3, j, this.f2145j);
    }

    /* JADX INFO: renamed from: a */
    private void m3302a(final EnumC1575i enumC1575i, final AbstractC1644a.a aVar) {
        if (!m3311a()) {
            AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxAdViewImpl$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m3306a(aVar, enumC1575i);
                }
            });
            return;
        }
        boolean zM4092c = AbstractC1701q7.m4092c(this.sdk);
        this.sdk.m4764E().m2678a(C1548f2.f1515Z0, "attemptingToLoadDestroyedAdView", CollectionUtils.hashMap("details", "debug=" + zM4092c));
        if (!zM4092c) {
            C1768p.m5167h(this.tag, "Failed to load new ad - this instance is already destroyed");
        } else {
            throw new IllegalStateException("Failed to load new ad - this instance is already destroyed for ad unit ID: " + this.adUnitId);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m3306a(AbstractC1644a.a aVar, EnumC1575i enumC1575i) {
        int adaptiveWidth;
        C1529d3 c1529d3 = this.f2152q;
        if (c1529d3 != null) {
            long jM2848a = this.f2148m.m2848a(c1529d3);
            this.extraParameters.put("visible_ad_ad_unit_id", this.f2152q.getAdUnitId());
            this.extraParameters.put("viewability_flags", Long.valueOf(jM2848a));
        } else {
            this.extraParameters.remove("visible_ad_ad_unit_id");
            this.extraParameters.remove("viewability_flags");
        }
        int iPxToDp = AppLovinSdkUtils.pxToDp(this.f2137b.getContext(), this.f2137b.getWidth());
        int iPxToDp2 = AppLovinSdkUtils.pxToDp(this.f2137b.getContext(), this.f2137b.getHeight());
        this.extraParameters.put("viewport_width", Integer.valueOf(iPxToDp));
        this.extraParameters.put("viewport_height", Integer.valueOf(iPxToDp2));
        this.extraParameters.put("auto_refresh_stopped", Boolean.valueOf(this.f2147l.m4657g() || this.f2156u));
        this.extraParameters.put("auto_retries_disabled", Boolean.valueOf(this.f2161z));
        MaxAdViewConfiguration maxAdViewConfiguration = this.f2144i;
        if (maxAdViewConfiguration != null && (adaptiveWidth = maxAdViewConfiguration.getAdaptiveWidth()) > 0 && iPxToDp != adaptiveWidth) {
            C1768p.m5169j(this.tag, "The requested adaptive ad view width (" + adaptiveWidth + " dp) is different from the MaxAdView width (" + iPxToDp + " dp).");
        }
        if (C1768p.m5160a()) {
            this.logger.m5171a(this.tag, "Loading " + this.adFormat.getLabel().toLowerCase(Locale.ENGLISH) + " ad for '" + this.adUnitId + "' and notifying " + aVar + "...");
        }
        this.sdk.m4797Z().loadAd(this.adUnitId, this.f2138c, this.adFormat, enumC1575i, this.localExtraParameters, this.extraParameters, this.f2136a, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m3307a(MaxAd maxAd) {
        this.f2158w = false;
        if (!this.f2157v.compareAndSet(true, false)) {
            if (C1768p.m5160a()) {
                this.logger.m5171a(this.tag, "Saving precache ad...");
            }
            C1529d3 c1529d3 = (C1529d3) maxAd;
            this.f2141f = c1529d3;
            c1529d3.m3212g(this.f2142g);
            this.f2141f.m3210f(this.f2143h);
            return;
        }
        if (C1768p.m5160a()) {
            this.logger.m5171a(this.tag, "Rendering precache request ad: " + maxAd.getAdUnitId() + "...");
        }
        this.f2145j.onAdLoaded(maxAd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m3308a(MaxError maxError) {
        if (m3311a()) {
            if (C1768p.m5160a()) {
                this.logger.m5171a(this.tag, "Ad load failure with ad unit ID '" + this.adUnitId + "' occured after MaxAdView was destroyed.");
                return;
            }
            return;
        }
        if (this.sdk.m4821c(AbstractC1776t3.f3315C7).contains(String.valueOf(maxError.getCode()))) {
            this.sdk.m4782Q();
            if (C1768p.m5160a()) {
                this.sdk.m4782Q().m5171a(this.tag, "Ignoring banner ad refresh for error code " + maxError.getCode());
                return;
            }
            return;
        }
        if (!this.f2156u && !this.f2147l.m4657g()) {
            this.f2155t = true;
            this.f2158w = false;
            long jLongValue = ((Long) this.sdk.m4801a(AbstractC1776t3.f3313B7)).longValue();
            if (jLongValue >= 0) {
                this.sdk.m4782Q();
                if (C1768p.m5160a()) {
                    this.sdk.m4782Q().m5171a(this.tag, "Scheduling failed banner ad refresh " + jLongValue + " milliseconds from now for '" + this.adUnitId + "'...");
                }
                this.f2147l.m4653a(jLongValue);
                return;
            }
            return;
        }
        if (this.f2158w) {
            if (C1768p.m5160a()) {
                this.logger.m5171a(this.tag, "Refresh precache failed when auto-refresh is stopped");
            }
            this.f2158w = false;
        }
        if (this.f2157v.get()) {
            if (C1768p.m5160a()) {
                this.logger.m5171a(this.tag, "Refresh precache failed - MaxAdListener.onAdLoadFailed(adUnitId=" + this.adUnitId + ", error=" + maxError + "), listener=" + this.adListener);
            }
            AbstractC1793v2.m5377a(this.adListener, this.adUnitId, maxError, true);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3309a(String str) {
        int iIntValue;
        synchronized (f2131F) {
            Map map = f2130E;
            Integer num = (Integer) map.get(str);
            iIntValue = num != null ? 1 + num.intValue() : 1;
            map.put(str, Integer.valueOf(iIntValue));
        }
        if (iIntValue == ((Integer) this.sdk.m4801a(AbstractC1776t3.f3376w8)).intValue()) {
            C1768p.m5169j(this.tag, "You are creating multiple MaxAdView instances for ad unit (" + str + ")! For best ad performance, please use a single MaxAdView instance and call loadAd() to refresh.");
            this.sdk.m4764E().m2678a(C1548f2.f1515Z0, "excessiveAdViewAllocations", CollectionUtils.hashMap("ad_unit_id", str));
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3310a(String str, String str2) {
        if ("allow_pause_auto_refresh_immediately".equalsIgnoreCase(str)) {
            if (C1768p.m5160a()) {
                this.logger.m5171a(this.tag, "Updated allow immediate auto-refresh pause and ad load to: " + str2);
            }
            this.f2160y = Boolean.parseBoolean(str2);
            return;
        }
        if ("disable_auto_retries".equalsIgnoreCase(str)) {
            if (C1768p.m5160a()) {
                this.logger.m5171a(this.tag, "Updated disable auto-retries to: " + str2);
            }
            this.f2161z = Boolean.parseBoolean(str2);
            return;
        }
        if ("disable_precache".equalsIgnoreCase(str)) {
            if (C1768p.m5160a()) {
                this.logger.m5171a(this.tag, "Updated precached disabled to: " + str2);
            }
            this.f2132A = Boolean.parseBoolean(str2);
            return;
        }
        if ("should_stop_auto_refresh_on_ad_expand".equals(str)) {
            if (C1768p.m5160a()) {
                this.logger.m5171a(this.tag, "Updated should stop auto-refresh on ad expand to: " + str2);
            }
            this.f2133B = Boolean.parseBoolean(str2);
            return;
        }
        if ("force_precache".equals(str)) {
            if (C1768p.m5160a()) {
                this.logger.m5171a(this.tag, "Updated force precache to: " + str2);
            }
            this.f2134C = Boolean.parseBoolean(str2);
            return;
        }
        if ("adaptive_banner".equalsIgnoreCase(str)) {
            if (C1768p.m5160a()) {
                this.logger.m5171a(this.tag, "Updated is adaptive banner to: " + str2);
            }
            if (this.f2144i == null) {
                C1768p.m5167h(this.tag, "You configured adaptive banners incorrectly by setting extra parameters to the MaxAdView! Please configure adaptive banners via MaxAdViewConfiguration instead. Learn more: https://support.axon.ai/en/max/android/ad-formats/banner-and-mrec-ads#adaptive-banners");
            }
            this.f2135D = Boolean.parseBoolean(str2);
            setLocalExtraParameter(str, str2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public boolean m3311a() {
        boolean z;
        synchronized (this.f2150o) {
            z = this.f2159x;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void m3313b(final C1529d3 c1529d3) {
        View viewM1865z = c1529d3.m1865z();
        String str = viewM1865z == null ? "MaxAdView does not have a loaded ad view" : null;
        MaxAdView maxAdView = this.f2137b;
        if (maxAdView == null) {
            str = "MaxAdView does not have a parent view";
        }
        if (str != null) {
            if (C1768p.m5160a()) {
                this.logger.m5174b(this.tag, str);
            }
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-1, str);
            if (C1768p.m5160a()) {
                this.logger.m5171a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + c1529d3 + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
            }
            AbstractC1793v2.m5372a(this.adListener, (MaxAd) c1529d3, (MaxError) maxErrorImpl, true);
            this.sdk.m4797Z().processAdDisplayErrorPostbackForUserError(maxErrorImpl, c1529d3);
            return;
        }
        m3331h();
        m3409a((AbstractC1482a3) c1529d3);
        if (c1529d3.m2986t0()) {
            this.f2149n.m2938a(c1529d3);
        }
        maxAdView.setDescendantFocusability(393216);
        if (c1529d3.m2350v0() != Long.MAX_VALUE) {
            this.f2139d.setBackgroundColor((int) c1529d3.m2350v0());
        } else {
            long j = this.f2140e;
            if (j != Long.MAX_VALUE) {
                this.f2139d.setBackgroundColor((int) j);
            } else {
                this.f2139d.setBackgroundColor(0);
            }
        }
        maxAdView.addView(viewM1865z);
        m3299a(viewM1865z, c1529d3);
        this.sdk.m4866z().m2560d(c1529d3);
        m3320c(c1529d3);
        synchronized (this.f2150o) {
            this.f2152q = c1529d3;
        }
        if (C1768p.m5160a()) {
            this.logger.m5171a(this.tag, "Scheduling impression for ad manually...");
        }
        this.sdk.m4797Z().processRawAdImpression(c1529d3, this.f2145j);
        if (StringUtils.isValidString(this.f2152q.getAdReviewCreativeId())) {
            AbstractC1793v2.m5383a(this.adReviewListener, this.f2152q.getAdReviewCreativeId(), (MaxAd) this.f2152q, true);
        }
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxAdViewImpl$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m3300a(c1529d3);
            }
        }, c1529d3.m2352x0());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m3315b(MaxAd maxAd) {
        boolean zCompareAndSet;
        this.f2158w = false;
        synchronized (this.f2151p) {
            zCompareAndSet = this.f2157v.compareAndSet(true, false);
            if (!zCompareAndSet) {
                if (C1768p.m5160a()) {
                    this.logger.m5171a(this.tag, "Saving precache ad...");
                }
                C1529d3 c1529d3 = (C1529d3) maxAd;
                this.f2141f = c1529d3;
                c1529d3.m3212g(this.f2142g);
                this.f2141f.m3210f(this.f2143h);
            }
        }
        if (zCompareAndSet) {
            if (C1768p.m5160a()) {
                this.logger.m5171a(this.tag, "Rendering precache request ad: " + maxAd.getAdUnitId() + "...");
            }
            this.f2145j.onAdLoaded(maxAd);
        }
    }

    /* JADX INFO: renamed from: b */
    private boolean m3316b() {
        if (this.f2132A) {
            return false;
        }
        return ((Boolean) this.sdk.m4801a(AbstractC1776t3.f3334P7)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public /* synthetic */ void m3319c() {
        if (C1768p.m5160a()) {
            this.logger.m5171a(this.tag, "Loading ad for precache request...");
        }
        m3302a(EnumC1575i.SEQUENTIAL_OR_PRECACHE, this.f2146k);
    }

    /* JADX INFO: renamed from: c */
    private void m3320c(C1529d3 c1529d3) {
        int height = this.f2137b.getHeight();
        int width = this.f2137b.getWidth();
        if (height > 0 || width > 0) {
            int iPxToDp = AppLovinSdkUtils.pxToDp(this.f2136a, height);
            int iPxToDp2 = AppLovinSdkUtils.pxToDp(this.f2136a, width);
            MaxAdFormat format = c1529d3.getFormat();
            int height2 = (this.f2135D ? format.getAdaptiveSize(iPxToDp2, this.f2137b.getContext()) : format.getSize()).getHeight();
            int iMin = Math.min(format.getSize().getWidth(), AbstractC1677p0.m3800b(this.f2136a).x);
            if (iPxToDp < height2 || iPxToDp2 < iMin) {
                StringBuilder sb = new StringBuilder("\n**************************************************\n`MaxAdView` size ");
                sb.append(iPxToDp2);
                sb.append("x");
                sb.append(iPxToDp);
                sb.append(" dp smaller than required ");
                sb.append(this.f2135D ? "adaptive " : "");
                sb.append("size: ");
                sb.append(iMin);
                sb.append("x");
                sb.append(height2);
                sb.append(" dp\nSome mediated networks (e.g. Google Ad Manager) may not render correctly\n**************************************************\n");
                String string = sb.toString();
                if (C1768p.m5160a()) {
                    this.logger.m5174b("AppLovinSdk", string);
                }
                JSONObject jSONObject = new JSONObject();
                JsonUtils.putInt(jSONObject, "container_width_dp", iPxToDp2);
                JsonUtils.putInt(jSONObject, "container_height_dp", iPxToDp);
                JsonUtils.putInt(jSONObject, "required_width_dp", iMin);
                JsonUtils.putInt(jSONObject, "required_height_dp", height2);
                JsonUtils.putBoolean(jSONObject, "is_adaptive", this.f2135D);
                this.sdk.m4764E().m2679a(C1548f2.f1515Z0, "adViewContainerUndersized", CollectionUtils.hashMap("details", jSONObject.toString()), this.f2138c);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private void m3323d() {
        if (m3316b()) {
            if (C1768p.m5160a()) {
                this.logger.m5171a(this.tag, "Scheduling refresh precache request now");
            }
            this.f2158w = true;
            this.sdk.m4853s0().m2604a((AbstractRunnableC1601k5) new C1788u6(this.sdk, "loadMaxAdForPrecacheRequest", new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxAdViewImpl$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m3319c();
                }
            }), C1552f6.b.MEDIATION);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m3324d(final C1529d3 c1529d3) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxAdViewImpl$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m3313b(c1529d3);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    private void m3326e() {
        this.f2157v.set(false);
        if (this.f2141f != null) {
            m3333i();
            return;
        }
        if (!m3316b()) {
            if (C1768p.m5160a()) {
                this.logger.m5171a(this.tag, "Refreshing ad from network...");
            }
            loadAd(EnumC1575i.REFRESH);
        } else if (this.f2155t) {
            if (C1768p.m5160a()) {
                this.logger.m5171a(this.tag, "Refreshing ad from network due to viewability requirements not met for refresh request...");
            }
            loadAd(EnumC1575i.REFRESH);
        } else {
            if (C1768p.m5160a()) {
                this.logger.m5174b(this.tag, "Ignoring attempt to refresh ad - either still waiting for precache or did not attempt request due to visibility requirement not met");
            }
            this.f2157v.set(true);
        }
    }

    /* JADX INFO: renamed from: f */
    private void m3327f() {
        boolean z;
        boolean z2;
        synchronized (this.f2151p) {
            z = false;
            this.f2157v.set(false);
            z2 = this.f2141f != null;
            if (!z2) {
                if (m3316b()) {
                    if (!this.f2155t) {
                        if (C1768p.m5160a()) {
                            this.logger.m5174b(this.tag, "Ignoring attempt to refresh ad - either still waiting for precache or did not attempt request due to visibility requirement not met");
                        }
                        this.f2157v.set(true);
                    } else if (C1768p.m5160a()) {
                        this.logger.m5171a(this.tag, "Refreshing ad from network due to viewability requirements not met for refresh request...");
                    }
                } else if (C1768p.m5160a()) {
                    this.logger.m5171a(this.tag, "Refreshing ad from network...");
                }
                z = true;
            }
        }
        if (z2) {
            m3333i();
        } else if (z) {
            loadAd(EnumC1575i.REFRESH);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public void m3330g() {
        m3331h();
        if (this.f2141f != null) {
            this.sdk.m4797Z().destroyAd(this.f2141f);
        }
        synchronized (this.f2150o) {
            this.f2159x = true;
        }
        this.f2147l.m4652a();
        this.sdk.m4838k().m2947b(this);
        if (this.sdk.m4787T() != null) {
            this.sdk.m4787T().m3489c(this.adUnitId, this.f2138c);
        } else {
            this.sdk.m4785S().m3439c(this.adUnitId, this.f2138c);
        }
        super.destroy();
    }

    /* JADX INFO: renamed from: h */
    private void m3331h() {
        C1529d3 c1529d3;
        if (this.f2137b != null) {
            if (((Boolean) this.sdk.m4801a(C1831z4.f3853W6)).booleanValue()) {
                AbstractC1713s.m4306b(this.f2137b, this.f2139d);
            } else {
                AbstractC1713s.m4304a(this.f2137b, this.f2139d);
            }
        }
        this.f2149n.m2939b();
        synchronized (this.f2150o) {
            c1529d3 = this.f2152q;
        }
        MaxAd maxAd = this.f2153r;
        if (maxAd != null && maxAd.equals(c1529d3)) {
            if (C1768p.m5160a()) {
                this.logger.m5171a(this.tag, "Collapsing ad manually for removed ad.");
            }
            AbstractC1793v2.m5414b(this.f2145j, maxAd);
        }
        if (c1529d3 != null) {
            this.sdk.m4797Z().destroyAd(c1529d3);
        }
    }

    /* JADX INFO: renamed from: i */
    private void m3333i() {
        if (C1768p.m5160a()) {
            this.logger.m5171a(this.tag, "Rendering for cached ad: " + this.f2141f + "...");
        }
        this.f2145j.onAdLoaded(this.f2141f);
        this.f2141f = null;
    }

    @Override // com.applovin.impl.mediation.ads.AbstractC1644a
    public void destroy() {
        if (((Boolean) this.sdk.m4801a(AbstractC1776t3.f3329K7)).booleanValue()) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxAdViewImpl$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m3330g();
                }
            });
        } else {
            m3330g();
        }
    }

    public MaxAdFormat getAdFormat() {
        return this.adFormat;
    }

    public String getPlacement() {
        return this.f2142g;
    }

    public void loadAd() {
        loadAd(EnumC1575i.PUBLISHER_INITIATED);
    }

    public void loadAd(EnumC1575i enumC1575i) {
        if (C1768p.m5160a()) {
            this.logger.m5171a(this.tag, "" + this + " Loading ad for " + this.adUnitId + "...");
        }
        boolean z = this.f2160y || ((Boolean) this.sdk.m4801a(AbstractC1776t3.f3327I7)).booleanValue();
        if (z && !this.f2147l.m4657g() && this.f2147l.m4658h()) {
            C1768p.m5167h(this.tag, "Unable to load a new ad. An ad refresh has already been scheduled in " + TimeUnit.MILLISECONDS.toSeconds(this.f2147l.m4654b()) + " seconds.");
            return;
        }
        if (!z) {
            if (C1768p.m5160a()) {
                this.logger.m5171a(this.tag, "Loading ad...");
            }
            m3302a(enumC1575i, this.f2145j);
        } else if (this.f2141f != null) {
            if (C1768p.m5160a()) {
                this.logger.m5171a(this.tag, "Rendering cached ad");
            }
            m3333i();
        } else if (this.f2158w) {
            if (C1768p.m5160a()) {
                this.logger.m5171a(this.tag, "Waiting for precache ad to load to render");
            }
            this.f2157v.set(true);
        } else {
            if (C1768p.m5160a()) {
                this.logger.m5171a(this.tag, "Loading ad...");
            }
            m3302a(enumC1575i, this.f2145j);
        }
    }

    @Override // com.applovin.impl.sdk.C1743g.a
    public void onAdRefresh() {
        if (((Boolean) this.sdk.m4801a(AbstractC1776t3.f3328J7)).booleanValue()) {
            m3327f();
        } else {
            m3326e();
        }
    }

    @Override // com.applovin.impl.C1585j.b
    public void onCreativeIdGenerated(String str, String str2) {
        C1529d3 c1529d3 = this.f2152q;
        if (c1529d3 != null && c1529d3.m1833T().equalsIgnoreCase(str)) {
            this.f2152q.m1852h(str2);
            AbstractC1793v2.m5416b(this.adReviewListener, str2, this.f2152q);
            return;
        }
        C1529d3 c1529d4 = this.f2141f;
        if (c1529d4 == null || !c1529d4.m1833T().equalsIgnoreCase(str)) {
            return;
        }
        this.f2141f.m1852h(str2);
    }

    @Override // com.applovin.impl.C1584i8.a
    public void onLogVisibilityImpression() {
        m3301a(this.f2152q, this.f2148m.m2848a(this.f2152q));
    }

    public void onWindowVisibilityChanged(int i) {
        if (((Boolean) this.sdk.m4801a(AbstractC1776t3.f3323G7)).booleanValue() && this.f2147l.m4658h()) {
            if (AbstractC1564g8.m2762b(i)) {
                if (C1768p.m5160a()) {
                    this.logger.m5171a(this.tag, "Ad view visible");
                }
                this.f2147l.m4656d();
            } else {
                if (C1768p.m5160a()) {
                    this.logger.m5171a(this.tag, "Ad view hidden");
                }
                this.f2147l.m4655c();
            }
        }
    }

    public void setCustomData(String str) {
        if (this.f2152q != null && C1768p.m5160a()) {
            this.logger.m5178k(this.tag, "Setting custom data (" + str + ") for Ad Unit ID (" + this.adUnitId + ") after an ad has been loaded already.");
        }
        AbstractC1701q7.m4081b(str, this.tag);
        this.f2143h = str;
    }

    @Override // com.applovin.impl.mediation.ads.AbstractC1644a
    public void setExtraParameter(String str, String str2) {
        super.setExtraParameter(str, str2);
        m3310a(str, str2);
    }

    public void setPlacement(String str) {
        if (this.f2152q != null && C1768p.m5160a()) {
            this.logger.m5178k(this.tag, "Setting placement (" + str + ") for Ad Unit ID (" + this.adUnitId + ") after an ad has been loaded already.");
        }
        this.f2142g = str;
    }

    public void setPublisherBackgroundColor(int i) {
        this.f2140e = i;
    }

    public void startAutoRefresh() {
        this.f2156u = false;
        if (!this.f2147l.m4657g()) {
            if (C1768p.m5160a()) {
                this.logger.m5171a(this.tag, "Ignoring call to startAutoRefresh() - ad refresh is not paused");
                return;
            }
            return;
        }
        this.f2147l.m4660m();
        if (C1768p.m5160a()) {
            this.logger.m5171a(this.tag, "Resumed auto-refresh with remaining time: " + this.f2147l.m4654b() + "ms");
        }
    }

    public void stopAutoRefresh() {
        if (this.f2152q == null) {
            if (this.f2160y || ((Boolean) this.sdk.m4801a(AbstractC1776t3.f3327I7)).booleanValue()) {
                this.f2156u = true;
                return;
            } else {
                C1768p.m5169j(this.tag, "Stopping auto-refresh has no effect until after the first ad has been loaded.");
                return;
            }
        }
        if (C1768p.m5160a()) {
            this.logger.m5171a(this.tag, "Pausing auto-refresh with remaining time: " + this.f2147l.m4654b() + "ms");
        }
        this.f2147l.m4659j();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("MaxAdView{adUnitId='");
        sb.append(this.adUnitId);
        sb.append("', adListener=");
        Object obj = this.adListener;
        if (obj == this.f2137b) {
            obj = "this";
        }
        sb.append(obj);
        sb.append(", isDestroyed=");
        sb.append(m3311a());
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}
