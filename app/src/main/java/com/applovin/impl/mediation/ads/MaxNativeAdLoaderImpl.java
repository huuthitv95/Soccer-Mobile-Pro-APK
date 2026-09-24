package com.applovin.impl.mediation.ads;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.applovin.impl.AbstractC1482a3;
import com.applovin.impl.AbstractC1701q7;
import com.applovin.impl.AbstractC1776t3;
import com.applovin.impl.AbstractC1793v2;
import com.applovin.impl.AbstractRunnableC1601k5;
import com.applovin.impl.C1549f3;
import com.applovin.impl.C1552f6;
import com.applovin.impl.C1585j;
import com.applovin.impl.C1788u6;
import com.applovin.impl.EnumC1575i;
import com.applovin.impl.InterfaceC1783u1;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.sdk.C1734a;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes3.dex */
public class MaxNativeAdLoaderImpl extends AbstractC1644a implements C1734a.a, C1585j.b {
    public static final String KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE = "ad_request_type";

    /* JADX INFO: renamed from: a */
    private final C1641c f2196a;

    /* JADX INFO: renamed from: b */
    private String f2197b;

    /* JADX INFO: renamed from: c */
    private String f2198c;

    /* JADX INFO: renamed from: d */
    private EnumC1575i f2199d;

    /* JADX INFO: renamed from: e */
    private final Object f2200e;

    /* JADX INFO: renamed from: f */
    private MaxNativeAdListener f2201f;

    /* JADX INFO: renamed from: g */
    private final Map f2202g;

    /* JADX INFO: renamed from: h */
    private final Set f2203h;

    /* JADX INFO: renamed from: com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl$a */
    class RunnableC1639a implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ MaxNativeAd f2204a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ List f2205b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ ViewGroup f2206c;

        RunnableC1639a(MaxNativeAd maxNativeAd, List list, ViewGroup viewGroup) {
            this.f2204a = maxNativeAd;
            this.f2205b = list;
            this.f2206c = viewGroup;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2204a.prepareForInteraction(this.f2205b, this.f2206c)) {
                return;
            }
            C1768p.m5167h(MaxNativeAdLoaderImpl.this.tag, "Failed to prepare native ad for interaction...");
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl$b */
    class RunnableC1640b implements Runnable {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ MaxNativeAdView f2208a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ C1549f3 f2209b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ MaxNativeAd f2210c;

        RunnableC1640b(MaxNativeAdView maxNativeAdView, C1549f3 c1549f3, MaxNativeAd maxNativeAd) {
            this.f2208a = maxNativeAdView;
            this.f2209b = c1549f3;
            this.f2210c = maxNativeAd;
        }

        @Override // java.lang.Runnable
        public void run() {
            C1768p c1768p = MaxNativeAdLoaderImpl.this.logger;
            if (C1768p.m5160a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.m5171a(maxNativeAdLoaderImpl.tag, "Rendering native ad view: " + this.f2208a);
            }
            MaxNativeAdLoaderImpl.this.sdk.m4866z().m2560d(this.f2209b);
            this.f2208a.render(this.f2209b, MaxNativeAdLoaderImpl.this.f2196a, MaxNativeAdLoaderImpl.this.sdk);
            this.f2210c.setNativeAdView(this.f2208a);
            if (this.f2210c.prepareForInteraction(this.f2208a.getClickableViews(), this.f2208a)) {
                return;
            }
            this.f2210c.prepareViewForInteraction(this.f2208a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl$c */
    class C1641c implements AbstractC1644a.a {
        private C1641c() {
        }

        /* synthetic */ C1641c(MaxNativeAdLoaderImpl maxNativeAdLoaderImpl, RunnableC1639a runnableC1639a) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public /* synthetic */ void m3403a(MaxAd maxAd) {
            C1768p c1768p = MaxNativeAdLoaderImpl.this.logger;
            if (C1768p.m5160a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.m5171a(maxNativeAdLoaderImpl.tag, "Native ad loaded");
            }
            C1549f3 c1549f3 = (C1549f3) maxAd;
            c1549f3.m3212g(MaxNativeAdLoaderImpl.this.f2197b);
            c1549f3.m3210f(MaxNativeAdLoaderImpl.this.f2198c);
            synchronized (MaxNativeAdLoaderImpl.this.f2200e) {
                MaxNativeAdLoaderImpl.this.f2203h.add(c1549f3);
            }
            MaxNativeAdView maxNativeAdViewM3390a = MaxNativeAdLoaderImpl.this.m3390a(c1549f3.m1827N());
            if (maxNativeAdViewM3390a == null) {
                C1768p c1768p2 = MaxNativeAdLoaderImpl.this.logger;
                if (C1768p.m5160a()) {
                    MaxNativeAdLoaderImpl maxNativeAdLoaderImpl2 = MaxNativeAdLoaderImpl.this;
                    maxNativeAdLoaderImpl2.logger.m5171a(maxNativeAdLoaderImpl2.tag, "No native ad view to render. Returning the native ad to be rendered later.");
                }
                C1768p c1768p3 = MaxNativeAdLoaderImpl.this.logger;
                if (C1768p.m5160a()) {
                    MaxNativeAdLoaderImpl maxNativeAdLoaderImpl3 = MaxNativeAdLoaderImpl.this;
                    maxNativeAdLoaderImpl3.logger.m5171a(maxNativeAdLoaderImpl3.tag, "MaxNativeAdListener.onNativeAdLoaded(nativeAdView=null, nativeAd=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.f2201f);
                }
                AbstractC1793v2.m5385a(MaxNativeAdLoaderImpl.this.f2201f, (MaxNativeAdView) null, maxAd, true);
                MaxNativeAdLoaderImpl.this.m3391a(c1549f3);
                return;
            }
            m3404a(maxNativeAdViewM3390a);
            MaxNativeAdLoaderImpl.this.m3396a(maxNativeAdViewM3390a, c1549f3, c1549f3.getNativeAd());
            C1768p c1768p4 = MaxNativeAdLoaderImpl.this.logger;
            if (C1768p.m5160a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl4 = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl4.logger.m5171a(maxNativeAdLoaderImpl4.tag, "MaxNativeAdListener.onNativeAdLoaded(nativeAdView=" + maxNativeAdViewM3390a + ", nativeAd=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.f2201f);
            }
            AbstractC1793v2.m5385a(MaxNativeAdLoaderImpl.this.f2201f, maxNativeAdViewM3390a, maxAd, true);
            MaxNativeAdLoaderImpl.this.m3391a(c1549f3);
            MaxNativeAdLoaderImpl.this.m3395a(maxNativeAdViewM3390a);
        }

        /* JADX INFO: renamed from: a */
        private void m3404a(MaxNativeAdView maxNativeAdView) {
            C1549f3 c1549f3M3412b;
            C1645b adViewTracker = maxNativeAdView.getAdViewTracker();
            if (adViewTracker == null || (c1549f3M3412b = adViewTracker.m3412b()) == null) {
                return;
            }
            C1768p c1768p = MaxNativeAdLoaderImpl.this.logger;
            if (C1768p.m5160a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.m5171a(maxNativeAdLoaderImpl.tag, "Destroying previous ad");
            }
            MaxNativeAdLoaderImpl.this.destroy(c1549f3M3412b);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            C1768p c1768p = MaxNativeAdLoaderImpl.this.logger;
            if (C1768p.m5160a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.m5171a(maxNativeAdLoaderImpl.tag, "MaxNativeAdListener.onNativeAdClicked(nativeAd=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.f2201f);
            }
            AbstractC1793v2.m5384a(MaxNativeAdLoaderImpl.this.f2201f, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(MaxAd maxAd) {
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(String str, MaxError maxError) {
            MaxNativeAdLoaderImpl.this.m3390a(((MaxErrorImpl) maxError).getLoadTag());
            C1768p c1768p = MaxNativeAdLoaderImpl.this.logger;
            if (C1768p.m5160a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.m5171a(maxNativeAdLoaderImpl.tag, "MaxNativeAdListener.onNativeAdLoadFailed(adUnitId=" + str + ", error=" + maxError + "), listener=" + MaxNativeAdLoaderImpl.this.f2201f);
            }
            AbstractC1793v2.m5386a(MaxNativeAdLoaderImpl.this.f2201f, str, maxError, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(final MaxAd maxAd) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxNativeAdLoaderImpl$c$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m3403a(maxAd);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            C1768p c1768p = MaxNativeAdLoaderImpl.this.logger;
            if (C1768p.m5160a()) {
                MaxNativeAdLoaderImpl maxNativeAdLoaderImpl = MaxNativeAdLoaderImpl.this;
                maxNativeAdLoaderImpl.logger.m5171a(maxNativeAdLoaderImpl.tag, "MaxAdRevenueListener.onAdRevenuePaid(ad=" + maxAd + "), listener=" + MaxNativeAdLoaderImpl.this.revenueListener);
            }
            AbstractC1793v2.m5381a(MaxNativeAdLoaderImpl.this.revenueListener, maxAd, true);
        }
    }

    public MaxNativeAdLoaderImpl(String str, C1748l c1748l) {
        super(str, MaxAdFormat.NATIVE, "MaxNativeAdLoader", c1748l);
        this.f2196a = new C1641c(this, null);
        this.f2199d = EnumC1575i.PUBLISHER_INITIATED;
        this.f2200e = new Object();
        this.f2202g = new HashMap();
        this.f2203h = new HashSet();
        c1748l.m4838k().m2946a(this);
        if (C1768p.m5160a()) {
            this.logger.m5171a(this.tag, "Created new MaxNativeAdLoader (" + this + ")");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public MaxNativeAdView m3390a(String str) {
        MaxNativeAdView maxNativeAdView;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        synchronized (this.f2200e) {
            maxNativeAdView = (MaxNativeAdView) this.f2202g.remove(str);
        }
        return maxNativeAdView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m3391a(C1549f3 c1549f3) {
        if (c1549f3.m2578x0().get()) {
            return;
        }
        this.sdk.m4828f().m4431a(c1549f3, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m3395a(MaxNativeAdView maxNativeAdView) {
        C1645b adViewTracker = maxNativeAdView.getAdViewTracker();
        if (adViewTracker == null || !maxNativeAdView.isAttachedToWindow()) {
            return;
        }
        adViewTracker.m3413c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m3396a(MaxNativeAdView maxNativeAdView, C1549f3 c1549f3, MaxNativeAd maxNativeAd) {
        c1549f3.m2575a(maxNativeAdView);
        m3409a((AbstractC1482a3) c1549f3);
        RunnableC1640b runnableC1640b = new RunnableC1640b(maxNativeAdView, c1549f3, maxNativeAd);
        if (maxNativeAd.shouldPrepareViewForInteractionOnMainThread()) {
            AppLovinSdkUtils.runOnUiThread(runnableC1640b);
        } else {
            this.sdk.m4853s0().m2604a((AbstractRunnableC1601k5) new C1788u6(this.sdk, "renderMaxNativeAd", runnableC1640b), C1552f6.b.MEDIATION);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3397a(String str, MaxNativeAdView maxNativeAdView) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        synchronized (this.f2200e) {
            this.f2202g.put(str, maxNativeAdView);
        }
    }

    @Override // com.applovin.impl.mediation.ads.AbstractC1644a
    public void destroy() {
        this.f2201f = null;
        this.sdk.m4838k().m2947b(this);
        synchronized (this.f2200e) {
            this.f2202g.clear();
            this.f2203h.clear();
        }
        super.destroy();
    }

    public void destroy(MaxAd maxAd) {
        C1645b adViewTracker;
        if (!(maxAd instanceof C1549f3)) {
            if (C1768p.m5160a()) {
                this.logger.m5171a(this.tag, "Destroy failed on non-native ad(" + maxAd + ")");
                return;
            }
            return;
        }
        C1549f3 c1549f3 = (C1549f3) maxAd;
        if (c1549f3.m2573A0()) {
            if (C1768p.m5160a()) {
                this.logger.m5171a(this.tag, "Native ad (" + c1549f3 + ") has already been destroyed");
                return;
            }
            return;
        }
        synchronized (this.f2200e) {
            this.f2203h.remove(c1549f3);
        }
        MaxNativeAdView maxNativeAdViewM2576v0 = c1549f3.m2576v0();
        if (maxNativeAdViewM2576v0 != null && (adViewTracker = maxNativeAdViewM2576v0.getAdViewTracker()) != null && maxAd.equals(adViewTracker.m3412b())) {
            maxNativeAdViewM2576v0.recycle();
        }
        MaxNativeAd nativeAd = c1549f3.getNativeAd();
        if (nativeAd != null && nativeAd.getAdViewTracker() != null) {
            nativeAd.getAdViewTracker().m3411a();
        }
        this.sdk.m4828f().m4430a(c1549f3);
        this.sdk.m4797Z().destroyAd(c1549f3);
        if (this.sdk.m4787T() != null) {
            this.sdk.m4787T().m3489c(this.adUnitId, c1549f3.m1827N());
        } else {
            this.sdk.m4785S().m3439c(this.adUnitId, c1549f3.m1827N());
        }
    }

    public String getPlacement() {
        return this.f2197b;
    }

    public void handleNativeAdViewRendered(MaxAd maxAd) {
        MaxNativeAd nativeAd = ((C1549f3) maxAd).getNativeAd();
        if (nativeAd == null) {
            if (C1768p.m5160a()) {
                this.logger.m5174b(this.tag, "Failed to handle native ad rendered. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
                return;
            }
            return;
        }
        C1645b adViewTracker = nativeAd.getAdViewTracker();
        if (adViewTracker != null) {
            adViewTracker.m3413c();
        } else if (C1768p.m5160a()) {
            this.logger.m5174b(this.tag, "Failed to handle native ad rendered. Could not retrieve tracker. Ad might not have been registered via MaxNativeAdLoader.a(...).");
        }
    }

    public void loadAd(MaxNativeAdView maxNativeAdView) {
        if (C1768p.m5160a()) {
            this.logger.m5171a(this.tag, "Loading native ad for '" + this.adUnitId + "' into '" + maxNativeAdView + "' and notifying " + this.f2196a + "...");
        }
        this.extraParameters.put("integration_type", maxNativeAdView != null ? "custom_ad_view" : "no_ad_view");
        String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.US);
        m3397a(lowerCase, maxNativeAdView);
        this.sdk.m4797Z().loadAd(this.adUnitId, lowerCase, MaxAdFormat.NATIVE, this.f2199d, this.localExtraParameters, this.extraParameters, C1748l.m4756p(), this.f2196a);
    }

    @Override // com.applovin.impl.sdk.C1734a.a
    public void onAdExpired(InterfaceC1783u1 interfaceC1783u1) {
        if (C1768p.m5160a()) {
            this.logger.m5171a(this.tag, "Ad expired for ad unit id " + getAdUnitId());
        }
        if (C1768p.m5160a()) {
            this.logger.m5171a(this.tag, "MaxNativeAdListener.onNativeAdExpired(nativeAd=" + interfaceC1783u1 + "), listener=" + this.f2201f);
        }
        AbstractC1793v2.m5417b(this.f2201f, (MaxAd) interfaceC1783u1, true);
    }

    @Override // com.applovin.impl.C1585j.b
    public void onCreativeIdGenerated(String str, String str2) {
        C1549f3 c1549f3;
        Iterator it = this.f2203h.iterator();
        do {
            if (!it.hasNext()) {
                c1549f3 = null;
                break;
            }
            c1549f3 = (C1549f3) it.next();
        } while (!c1549f3.m1833T().equalsIgnoreCase(str));
        if (c1549f3 != null) {
            c1549f3.m1852h(str2);
            AbstractC1793v2.m5416b(this.adReviewListener, str2, c1549f3);
            synchronized (this.f2200e) {
                this.f2203h.remove(c1549f3);
            }
        }
    }

    public void registerClickableViews(List<View> list, ViewGroup viewGroup, MaxAd maxAd) {
        C1549f3 c1549f3 = (C1549f3) maxAd;
        MaxNativeAd nativeAd = c1549f3.getNativeAd();
        if (nativeAd == null) {
            if (C1768p.m5160a()) {
                this.logger.m5174b(this.tag, "Failed to register native ad. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
                return;
            }
            return;
        }
        c1549f3.m2574a(viewGroup);
        this.sdk.m4866z().m2560d(c1549f3);
        m3409a((AbstractC1482a3) c1549f3);
        nativeAd.setClickableViews(list);
        nativeAd.setAdViewTracker(new C1645b(c1549f3, viewGroup, this.f2196a, this.sdk));
        RunnableC1639a runnableC1639a = new RunnableC1639a(nativeAd, list, viewGroup);
        if (nativeAd.shouldPrepareViewForInteractionOnMainThread()) {
            AppLovinSdkUtils.runOnUiThread(runnableC1639a);
        } else {
            this.sdk.m4853s0().m2604a((AbstractRunnableC1601k5) new C1788u6(this.sdk, "renderMaxNativeAd", runnableC1639a), C1552f6.b.MEDIATION);
        }
    }

    public boolean render(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
        if (!(maxAd instanceof C1549f3)) {
            C1768p.m5167h(this.tag, "Failed to render native ad. `ad` needs to be of type `MediatedNativeAd` to render.");
            return false;
        }
        if (maxNativeAdView == null) {
            C1768p.m5167h(this.tag, "Failed to render native ad. `adView` to render cannot be null.");
            return false;
        }
        C1549f3 c1549f3 = (C1549f3) maxAd;
        MaxNativeAd nativeAd = c1549f3.getNativeAd();
        if (nativeAd == null) {
            if (C1768p.m5160a()) {
                this.logger.m5174b(this.tag, "Failed to render native ad. Could not retrieve MaxNativeAd. The ad may have already been destroyed.");
            }
            return false;
        }
        if (nativeAd.isExpired() && !((Boolean) this.sdk.m4801a(AbstractC1776t3.f3340V7)).booleanValue()) {
            C1768p.m5167h(this.tag, "Cancelled rendering for expired native ad. Check if an ad is expired before displaying using `MaxAd.getNativeAd().isExpired()`");
            return false;
        }
        m3396a(maxNativeAdView, c1549f3, nativeAd);
        m3395a(maxNativeAdView);
        return true;
    }

    public void setCustomData(String str) {
        AbstractC1701q7.m4081b(str, this.tag);
        this.f2198c = str;
    }

    @Override // com.applovin.impl.mediation.ads.AbstractC1644a
    public void setLocalExtraParameter(String str, Object obj) {
        super.setLocalExtraParameter(str, obj);
        if (KEY_EXTRA_PARAMETER_AD_REQUEST_TYPE.equalsIgnoreCase(str) && (obj instanceof EnumC1575i)) {
            this.f2199d = (EnumC1575i) obj;
        }
    }

    public void setNativeAdListener(MaxNativeAdListener maxNativeAdListener) {
        if (C1768p.m5160a()) {
            this.logger.m5171a(this.tag, "Setting native ad listener: " + maxNativeAdListener);
        }
        this.f2201f = maxNativeAdListener;
    }

    public void setPlacement(String str) {
        this.f2197b = str;
    }

    public String toString() {
        return "MaxNativeAdLoader{adUnitId='" + this.adUnitId + "', nativeAdListener=" + this.f2201f + ", revenueListener=" + this.revenueListener + AbstractJsonLexerKt.END_OBJ;
    }
}
