package com.applovin.impl;

import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.p025ad.AbstractC1736b;
import com.applovin.impl.sdk.p025ad.AppLovinAdImpl;
import com.applovin.impl.sdk.p025ad.C1737c;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.tiktok.appevents.edp.TTEDPEventConstants;
import java.lang.ref.SoftReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.applovin.impl.k2 */
/* JADX INFO: loaded from: classes3.dex */
public class C1598k2 {

    /* JADX INFO: renamed from: b */
    protected final C1748l f1950b;

    /* JADX INFO: renamed from: c */
    protected final AppLovinAdServiceImpl f1951c;

    /* JADX INFO: renamed from: d */
    private AppLovinAd f1952d;

    /* JADX INFO: renamed from: e */
    private String f1953e;

    /* JADX INFO: renamed from: f */
    private SoftReference f1954f;

    /* JADX INFO: renamed from: h */
    private volatile String f1956h;

    /* JADX INFO: renamed from: j */
    private volatile double f1958j;

    /* JADX INFO: renamed from: a */
    public final Map f1949a = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: g */
    private final Object f1955g = new Object();

    /* JADX INFO: renamed from: i */
    private volatile boolean f1957i = false;

    /* JADX INFO: renamed from: com.applovin.impl.k2$a */
    class a implements AppLovinAdRewardListener {
        a() {
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userOverQuota(AppLovinAd appLovinAd, Map map) {
            C1598k2.this.f1950b.m4782Q();
            if (C1768p.m5160a()) {
                C1598k2.this.f1950b.m4782Q().m5174b("IncentivizedAdController", "User over quota: " + map);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardRejected(AppLovinAd appLovinAd, Map map) {
            C1598k2.this.f1950b.m4782Q();
            if (C1768p.m5160a()) {
                C1598k2.this.f1950b.m4782Q().m5174b("IncentivizedAdController", "Reward rejected: " + map);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardVerified(AppLovinAd appLovinAd, Map map) {
            C1598k2.this.f1950b.m4782Q();
            if (C1768p.m5160a()) {
                C1598k2.this.f1950b.m4782Q().m5171a("IncentivizedAdController", "Reward validated: " + map);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void validationRequestFailed(AppLovinAd appLovinAd, int i) {
            C1598k2.this.f1950b.m4782Q();
            if (C1768p.m5160a()) {
                C1598k2.this.f1950b.m4782Q().m5174b("IncentivizedAdController", "Reward validation failed: " + i);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: com.applovin.impl.k2$b */
    class b implements AppLovinAdLoadListener {

        /* JADX INFO: renamed from: a */
        private final AppLovinAdLoadListener f1960a;

        b(AppLovinAdLoadListener appLovinAdLoadListener) {
            this.f1960a = appLovinAdLoadListener;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public /* synthetic */ void m3075a(int i) {
            try {
                this.f1960a.failedToReceiveAd(i);
            } catch (Throwable th) {
                C1768p.m5164c("AppLovinIncentivizedInterstitial", "Unable to notify listener about ad load failure", th);
                C1598k2.this.f1950b.m4764E().m4329a("IncentivizedAdController", "adLoadFailed", th);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public /* synthetic */ void m3076a(AppLovinAd appLovinAd) {
            try {
                this.f1960a.adReceived(appLovinAd);
            } catch (Throwable th) {
                C1768p.m5164c("AppLovinIncentivizedInterstitial", "Unable to notify ad listener about a newly loaded ad", th);
                C1598k2.this.f1950b.m4764E().m4329a("IncentivizedAdController", "adLoaded", th);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(final AppLovinAd appLovinAd) {
            C1598k2.this.f1952d = appLovinAd;
            if (this.f1960a != null) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.k2$b$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m3076a(appLovinAd);
                    }
                });
            }
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(final int i) {
            if (this.f1960a != null) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.k2$b$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m3075a(i);
                    }
                });
            }
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.k2$c */
    private class c implements InterfaceC1659n2, AppLovinAdVideoPlaybackListener, AppLovinAdRewardListener, AppLovinAdClickListener {

        /* JADX INFO: renamed from: a */
        private final AppLovinAd f1962a;

        /* JADX INFO: renamed from: b */
        private final AppLovinAdDisplayListener f1963b;

        /* JADX INFO: renamed from: c */
        private final AppLovinAdClickListener f1964c;

        /* JADX INFO: renamed from: d */
        private final AppLovinAdVideoPlaybackListener f1965d;

        /* JADX INFO: renamed from: e */
        private final AppLovinAdRewardListener f1966e;

        private c(AppLovinAd appLovinAd, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
            this.f1962a = appLovinAd;
            this.f1963b = appLovinAdDisplayListener;
            this.f1964c = appLovinAdClickListener;
            this.f1965d = appLovinAdVideoPlaybackListener;
            this.f1966e = appLovinAdRewardListener;
        }

        /* synthetic */ c(C1598k2 c1598k2, AppLovinAd appLovinAd, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener, a aVar) {
            this(appLovinAd, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        }

        /* JADX INFO: renamed from: a */
        private String m3077a(AbstractC1736b abstractC1736b, boolean z) {
            if (StringUtils.isValidString(abstractC1736b.m4564v())) {
                return abstractC1736b.m4564v();
            }
            if (z) {
                return "ad_display_failure";
            }
            return null;
        }

        /* JADX INFO: renamed from: a */
        private void m3078a(AbstractC1736b abstractC1736b, String str) {
            int i;
            C1598k2.this.f1950b.m4782Q();
            if (C1768p.m5160a()) {
                C1598k2.this.f1950b.m4782Q().m5171a("IncentivizedAdController", "Finishing direct ad...");
            }
            String strM3065b = C1598k2.this.m3065b();
            if (!StringUtils.isValidString(strM3065b) || !C1598k2.this.f1957i) {
                C1598k2.this.f1950b.m4782Q();
                if (C1768p.m5160a()) {
                    C1598k2.this.f1950b.m4782Q().m5174b("IncentivizedAdController", "Invalid reward state - result: " + strM3065b + " and wasFullyEngaged: " + C1598k2.this.f1957i);
                }
                C1598k2.this.f1950b.m4782Q();
                if (C1768p.m5160a()) {
                    C1598k2.this.f1950b.m4782Q().m5171a("IncentivizedAdController", "Cancelling any incoming reward requests for this ad");
                }
                abstractC1736b.m4531d();
                if (C1598k2.this.f1957i) {
                    C1598k2.this.f1950b.m4782Q();
                    if (C1768p.m5160a()) {
                        C1598k2.this.f1950b.m4782Q().m5174b("IncentivizedAdController", "User closed the ad after fully watching but reward validation task did not return on time");
                    }
                    str = "network_timeout";
                    i = AppLovinErrorCodes.INCENTIVIZED_SERVER_TIMEOUT;
                } else {
                    if (str == null) {
                        str = "unknown_early_dismissal_source";
                    }
                    C1598k2.this.f1950b.m4782Q();
                    if (C1768p.m5160a()) {
                        C1598k2.this.f1950b.m4782Q().m5174b("IncentivizedAdController", "Ad closed prematurely from source: " + str);
                    }
                    i = AppLovinErrorCodes.INCENTIVIZED_USER_CLOSED_VIDEO;
                }
                abstractC1736b.m4521a(C1698q4.m4009a(str));
                C1598k2.this.f1950b.m4782Q();
                if (C1768p.m5160a()) {
                    C1598k2.this.f1950b.m4782Q().m5171a("IncentivizedAdController", "Notifying listener of reward validation failure");
                }
                AbstractC1793v2.m5390a(this.f1966e, abstractC1736b, i);
                HashMap<String, String> mapHashMap = CollectionUtils.hashMap("details", String.valueOf(C1598k2.this.f1958j));
                CollectionUtils.putStringIfValid("source", str, mapHashMap);
                C1598k2.this.f1950b.m4830g().m2526a(C1548f2.f1482J, abstractC1736b, mapHashMap);
            }
            if (abstractC1736b.m4565v0().getAndSet(true)) {
                return;
            }
            C1598k2.this.f1950b.m4782Q();
            if (C1768p.m5160a()) {
                C1598k2.this.f1950b.m4782Q().m5171a("IncentivizedAdController", "Scheduling report rewarded ad...");
            }
            C1598k2.this.f1950b.m4853s0().m2604a((AbstractRunnableC1601k5) new C1683p6(abstractC1736b, C1598k2.this.f1950b), C1552f6.b.OTHER);
        }

        @Override // com.applovin.sdk.AppLovinAdClickListener
        public void adClicked(AppLovinAd appLovinAd) {
            AbstractC1793v2.m5387a(this.f1964c, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adDisplayed(AppLovinAd appLovinAd) {
            AbstractC1793v2.m5388a(this.f1963b, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdDisplayListener
        public void adHidden(AppLovinAd appLovinAd) {
            String str;
            AppLovinAd appLovinAdM4579f = appLovinAd instanceof C1737c ? ((C1737c) appLovinAd).m4579f() : appLovinAd;
            if (appLovinAdM4579f instanceof AbstractC1736b) {
                AbstractC1736b abstractC1736b = (AbstractC1736b) appLovinAdM4579f;
                m3078a(abstractC1736b, m3077a(abstractC1736b, false));
            } else {
                if (appLovinAdM4579f == null) {
                    str = "null/expired ad";
                } else {
                    str = "invalid ad of type: " + appLovinAdM4579f;
                }
                C1598k2.this.f1950b.m4782Q();
                if (C1768p.m5160a()) {
                    C1598k2.this.f1950b.m4782Q().m5174b("IncentivizedAdController", "Received `adHidden` callback for " + str);
                }
            }
            C1598k2.this.m3057a(appLovinAdM4579f);
            C1598k2.this.f1950b.m4782Q();
            if (C1768p.m5160a()) {
                C1598k2.this.f1950b.m4782Q().m5171a("IncentivizedAdController", "Notifying listener of rewarded ad dismissal");
            }
            AbstractC1793v2.m5419b(this.f1963b, appLovinAd);
        }

        @Override // com.applovin.impl.InterfaceC1659n2
        public void onAdDisplayFailed(String str) {
            String str2;
            AppLovinAd appLovinAdM4579f = this.f1962a;
            if (appLovinAdM4579f instanceof C1737c) {
                appLovinAdM4579f = ((C1737c) appLovinAdM4579f).m4579f();
            }
            boolean z = this.f1963b instanceof InterfaceC1659n2;
            if (appLovinAdM4579f instanceof AbstractC1736b) {
                AbstractC1736b abstractC1736b = (AbstractC1736b) appLovinAdM4579f;
                m3078a(abstractC1736b, m3077a(abstractC1736b, StringUtils.isValidString(str)));
            } else {
                if (appLovinAdM4579f == null) {
                    str2 = "null/expired ad";
                } else {
                    str2 = "invalid ad of type: " + appLovinAdM4579f;
                }
                C1598k2.this.f1950b.m4782Q();
                if (C1768p.m5160a()) {
                    C1768p c1768pM4782Q = C1598k2.this.f1950b.m4782Q();
                    StringBuilder sb = new StringBuilder("Received `");
                    sb.append(z ? "adDisplayFailed" : "adHidden");
                    sb.append("` callback for ");
                    sb.append(str2);
                    c1768pM4782Q.m5174b("IncentivizedAdController", sb.toString());
                }
            }
            C1598k2.this.m3057a(appLovinAdM4579f);
            if (z) {
                AbstractC1793v2.m5389a(this.f1963b, str);
            } else {
                AbstractC1793v2.m5419b(this.f1963b, this.f1962a);
            }
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userOverQuota(AppLovinAd appLovinAd, Map map) {
            C1598k2.this.m3062a("quota_exceeded");
            AbstractC1793v2.m5422b(this.f1966e, appLovinAd, map);
            C1598k2.this.f1950b.m4830g().m2526a(C1548f2.f1480I, (AbstractC1736b) appLovinAd, CollectionUtils.hashMap("error_message", "quota_exceeded"));
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardRejected(AppLovinAd appLovinAd, Map map) {
            C1598k2.this.m3062a("rejected");
            AbstractC1793v2.m5391a(this.f1966e, appLovinAd, map);
            C1598k2.this.f1950b.m4830g().m2526a(C1548f2.f1480I, (AbstractC1736b) appLovinAd, CollectionUtils.hashMap("error_message", "rejected"));
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void userRewardVerified(AppLovinAd appLovinAd, Map map) {
            C1598k2.this.m3062a("accepted");
            AbstractC1793v2.m5437c(this.f1966e, appLovinAd, map);
        }

        @Override // com.applovin.sdk.AppLovinAdRewardListener
        public void validationRequestFailed(AppLovinAd appLovinAd, int i) {
            C1598k2.this.m3062a("network_timeout");
            AbstractC1793v2.m5390a(this.f1966e, appLovinAd, i);
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("error_message", "network_timeout");
            mapHashMap.put(TTEDPEventConstants.EDP_EVENT_PROPERTY_PAY_CODE, String.valueOf(i));
            C1598k2.this.f1950b.m4830g().m2526a(C1548f2.f1480I, (AbstractC1736b) appLovinAd, mapHashMap);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackBegan(AppLovinAd appLovinAd) {
            AbstractC1793v2.m5392a(this.f1965d, appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
        public void videoPlaybackEnded(AppLovinAd appLovinAd, double d, boolean z) {
            AppLovinAd appLovinAdM4579f = appLovinAd instanceof C1737c ? ((C1737c) appLovinAd).m4579f() : appLovinAd;
            boolean z2 = true;
            boolean z3 = (appLovinAdM4579f instanceof AbstractC1736b) && ((AbstractC1736b) appLovinAdM4579f).m4476C0();
            C1598k2 c1598k2 = C1598k2.this;
            if (z3) {
                d = 100.0d;
            }
            c1598k2.f1958j = d;
            C1598k2 c1598k3 = C1598k2.this;
            if (!z && !z3) {
                z2 = false;
            }
            c1598k3.f1957i = z2;
            AbstractC1793v2.m5393a(this.f1965d, appLovinAd, C1598k2.this.f1958j, C1598k2.this.f1957i);
        }
    }

    public C1598k2(String str, AppLovinSdk appLovinSdk) {
        this.f1950b = appLovinSdk.m5807a();
        this.f1951c = (AppLovinAdServiceImpl) appLovinSdk.getAdService();
        this.f1953e = str;
    }

    /* JADX INFO: renamed from: a */
    private AppLovinAdRewardListener m3049a() {
        return new a();
    }

    /* JADX INFO: renamed from: a */
    private String m3051a(AppLovinAd appLovinAd, AppLovinAd appLovinAd2) {
        if (appLovinAd == null) {
            C1768p.m5167h("IncentivizedAdController", "Unable to retrieve the loaded ad. This can occur when attempting to show an expired ad.: " + appLovinAd2);
            return "Unable to retrieve the loaded ad. This can occur when attempting to show an expired ad.";
        }
        if (appLovinAd2.getType() == AppLovinAdType.INCENTIVIZED) {
            return null;
        }
        C1768p.m5167h("IncentivizedAdController", "Attempting to display ad with invalid ad type: " + appLovinAd2.getType());
        return "Attempting to display ad with invalid ad type";
    }

    /* JADX INFO: renamed from: a */
    private void m3054a(AppLovinAdImpl appLovinAdImpl, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        Map mapM2787a = AbstractC1568h2.m2787a(appLovinAdImpl);
        CollectionUtils.putStringIfValid("source", "showRewardedAd", mapM2787a);
        this.f1950b.m4830g().m2682d(C1548f2.f1468C, mapM2787a);
        c cVar = new c(this, appLovinAdImpl, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener, null);
        AppLovinAd appLovinAdM4026a = AbstractC1701q7.m4026a(appLovinAdImpl, this.f1950b);
        String strM3051a = m3051a(appLovinAdM4026a, appLovinAdImpl);
        if (StringUtils.isValidString(strM3051a)) {
            m3060a(appLovinAdImpl, strM3051a, cVar, cVar);
            return;
        }
        AppLovinInterstitialAdDialog appLovinInterstitialAdDialogCreate = AppLovinInterstitialAd.create(this.f1950b.m4758A0(), context);
        for (String str : this.f1949a.keySet()) {
            appLovinInterstitialAdDialogCreate.setExtraInfo(str, this.f1949a.get(str));
        }
        appLovinInterstitialAdDialogCreate.setAdDisplayListener(cVar);
        appLovinInterstitialAdDialogCreate.setAdVideoPlaybackListener(cVar);
        appLovinInterstitialAdDialogCreate.setAdClickListener(cVar);
        appLovinInterstitialAdDialogCreate.showAndRender(appLovinAdM4026a);
        m3056a((AbstractC1736b) appLovinAdM4026a, cVar);
    }

    /* JADX INFO: renamed from: a */
    private void m3055a(AppLovinAdImpl appLovinAdImpl, ViewGroup viewGroup, Lifecycle lifecycle, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        Map mapM2787a = AbstractC1568h2.m2787a(appLovinAdImpl);
        CollectionUtils.putStringIfValid("source", "showRewardedAdView", mapM2787a);
        this.f1950b.m4830g().m2682d(C1548f2.f1468C, mapM2787a);
        c cVar = new c(this, appLovinAdImpl, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener, null);
        AppLovinAd appLovinAdM4026a = AbstractC1701q7.m4026a(appLovinAdImpl, this.f1950b);
        String strM3051a = m3051a(appLovinAdM4026a, appLovinAdImpl);
        if (StringUtils.isValidString(strM3051a)) {
            m3060a(appLovinAdImpl, strM3051a, cVar, cVar);
            return;
        }
        AppLovinInterstitialAdDialog appLovinInterstitialAdDialogCreate = AppLovinInterstitialAd.create(this.f1950b.m4758A0(), context);
        for (String str : this.f1949a.keySet()) {
            appLovinInterstitialAdDialogCreate.setExtraInfo(str, this.f1949a.get(str));
        }
        appLovinInterstitialAdDialogCreate.setAdDisplayListener(cVar);
        appLovinInterstitialAdDialogCreate.setAdVideoPlaybackListener(cVar);
        appLovinInterstitialAdDialogCreate.setAdClickListener(cVar);
        appLovinInterstitialAdDialogCreate.showAndRender(appLovinAdM4026a, viewGroup, lifecycle);
        m3056a((AbstractC1736b) appLovinAdM4026a, cVar);
    }

    /* JADX INFO: renamed from: a */
    private void m3056a(AbstractC1736b abstractC1736b, AppLovinAdRewardListener appLovinAdRewardListener) {
        this.f1950b.m4853s0().m2604a((AbstractRunnableC1601k5) new C1806w6(abstractC1736b, appLovinAdRewardListener, this.f1950b), C1552f6.b.OTHER);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m3057a(AppLovinAd appLovinAd) {
        AppLovinAd appLovinAd2 = this.f1952d;
        if (appLovinAd2 == null) {
            return;
        }
        if (!(appLovinAd2 instanceof C1737c)) {
            if (appLovinAd == appLovinAd2) {
                this.f1952d = null;
            }
        } else {
            C1737c c1737c = (C1737c) appLovinAd2;
            if (c1737c.m4579f() == null || appLovinAd == c1737c.m4579f()) {
                this.f1952d = null;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3058a(AppLovinAd appLovinAd, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        AppLovinAdImpl appLovinAdImpl = appLovinAd != null ? (AppLovinAdImpl) appLovinAd : (AppLovinAdImpl) this.f1952d;
        if (appLovinAdImpl != null) {
            m3054a(appLovinAdImpl, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        } else {
            C1768p.m5167h("IncentivizedAdController", "Skipping incentivized video playback: user attempted to play an incentivized video before one was preloaded.");
            m3068e();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3059a(AppLovinAd appLovinAd, ViewGroup viewGroup, Lifecycle lifecycle, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        AppLovinAdImpl appLovinAdImpl = appLovinAd != null ? (AppLovinAdImpl) appLovinAd : (AppLovinAdImpl) this.f1952d;
        if (appLovinAdImpl != null) {
            m3055a(appLovinAdImpl, viewGroup, lifecycle, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
        } else {
            C1768p.m5167h("IncentivizedAdController", "Skipping incentivized video playback: user attempted to play an incentivized video before one was preloaded.");
            m3068e();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3060a(AppLovinAd appLovinAd, String str, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, InterfaceC1659n2 interfaceC1659n2) {
        AbstractC1793v2.m5393a(appLovinAdVideoPlaybackListener, appLovinAd, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, false);
        AbstractC1793v2.m5389a(interfaceC1659n2, str);
        Map mapM2787a = AbstractC1568h2.m2787a((AppLovinAdImpl) appLovinAd);
        CollectionUtils.putStringIfValid("source", "rewardedAdShowFailed", mapM2787a);
        CollectionUtils.putStringIfValid("error_message", str, mapM2787a);
        this.f1950b.m4830g().m2682d(C1548f2.f1474F, mapM2787a);
    }

    /* JADX INFO: renamed from: a */
    private void m3061a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f1951c.loadNextIncentivizedAd(this.f1953e, appLovinAdLoadListener);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m3062a(String str) {
        synchronized (this.f1955g) {
            this.f1956h = str;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public String m3065b() {
        String str;
        synchronized (this.f1955g) {
            str = this.f1956h;
        }
        return str;
    }

    /* JADX INFO: renamed from: e */
    private void m3068e() {
        AppLovinAdLoadListener appLovinAdLoadListener;
        SoftReference softReference = this.f1954f;
        if (softReference == null || (appLovinAdLoadListener = (AppLovinAdLoadListener) softReference.get()) == null) {
            return;
        }
        appLovinAdLoadListener.failedToReceiveAd(AppLovinErrorCodes.INCENTIVIZED_NO_AD_PRELOADED);
    }

    /* JADX INFO: renamed from: a */
    public void m3069a(String str, Object obj) {
        this.f1949a.put(str, obj);
    }

    /* JADX INFO: renamed from: b */
    public void m3070b(AppLovinAd appLovinAd, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        if (appLovinAdRewardListener == null) {
            appLovinAdRewardListener = m3049a();
        }
        m3058a(appLovinAd, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    /* JADX INFO: renamed from: b */
    public void m3071b(AppLovinAd appLovinAd, ViewGroup viewGroup, Lifecycle lifecycle, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        if (appLovinAdRewardListener == null) {
            appLovinAdRewardListener = m3049a();
        }
        m3059a(appLovinAd, viewGroup, lifecycle, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    /* JADX INFO: renamed from: b */
    public void m3072b(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f1950b.m4782Q();
        if (C1768p.m5160a()) {
            this.f1950b.m4782Q().m5171a("IncentivizedAdController", "User requested preload of incentivized ad...");
        }
        this.f1954f = new SoftReference(appLovinAdLoadListener);
        if (!m3074d()) {
            m3061a(new b(appLovinAdLoadListener));
            return;
        }
        C1768p.m5167h("IncentivizedAdController", "Attempted to call preloadAndNotify: while an ad was already loaded or currently being played. Do not call preloadAndNotify: again until the last ad has been closed (adHidden).");
        if (appLovinAdLoadListener != null) {
            appLovinAdLoadListener.adReceived(this.f1952d);
        }
    }

    /* JADX INFO: renamed from: c */
    public String m3073c() {
        return this.f1953e;
    }

    /* JADX INFO: renamed from: d */
    public boolean m3074d() {
        return this.f1952d != null;
    }
}
