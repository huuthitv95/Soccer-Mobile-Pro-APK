package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.os.StrictMode;
import android.view.ViewGroup;
import androidx.core.view.ViewCompat;
import androidx.lifecycle.Lifecycle;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.adview.AppLovinFullscreenAdViewObserver;
import com.applovin.adview.AppLovinFullscreenImmersiveActivity;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.p025ad.AbstractC1736b;
import com.applovin.impl.sdk.p025ad.AppLovinAdImpl;
import com.applovin.impl.sdk.p025ad.C1735a;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.applovin.impl.p2 */
/* JADX INFO: loaded from: classes3.dex */
public class C1679p2 implements AppLovinInterstitialAdDialog {

    /* JADX INFO: renamed from: a */
    protected final C1748l f2514a;

    /* JADX INFO: renamed from: b */
    private final WeakReference f2515b;

    /* JADX INFO: renamed from: c */
    private final Map f2516c = Collections.synchronizedMap(new HashMap());

    /* JADX INFO: renamed from: d */
    private volatile AppLovinAdLoadListener f2517d;

    /* JADX INFO: renamed from: e */
    private volatile AppLovinAdDisplayListener f2518e;

    /* JADX INFO: renamed from: f */
    private volatile AppLovinAdVideoPlaybackListener f2519f;

    /* JADX INFO: renamed from: g */
    private volatile AppLovinAdClickListener f2520g;

    /* JADX INFO: renamed from: h */
    private volatile AbstractC1736b f2521h;

    /* JADX INFO: renamed from: com.applovin.impl.p2$a */
    class a implements AppLovinAdLoadListener {
        a() {
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void adReceived(AppLovinAd appLovinAd) {
            C1679p2.this.m3858b(appLovinAd);
            C1679p2.this.showAndRender(appLovinAd);
        }

        @Override // com.applovin.sdk.AppLovinAdLoadListener
        public void failedToReceiveAd(int i) {
            C1679p2.this.m3854b(i);
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.p2$b */
    class b implements AbstractC1819y1.g {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Activity f2523a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ AppLovinFullscreenAdViewObserver f2524b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ ViewGroup f2525c;

        b(Activity activity, AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver, ViewGroup viewGroup) {
            this.f2523a = activity;
            this.f2524b = appLovinFullscreenAdViewObserver;
            this.f2525c = viewGroup;
        }

        @Override // com.applovin.impl.AbstractC1819y1.g
        /* JADX INFO: renamed from: a */
        public void mo1754a(AbstractC1819y1 abstractC1819y1) {
            if (AbstractC1525d.m2250d(this.f2523a)) {
                C1768p.m5167h("InterstitialAdDialogWrapper", "Failed to show interstitial: attempting to show ad when parent activity is finishing");
                C1679p2.m3857b(C1679p2.this.f2521h, C1679p2.this.f2518e, "Failed to show interstitial: attempting to show ad when parent activity is finishing", null, this.f2524b);
                HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", "invalidActivity");
                CollectionUtils.putStringIfValid("error_message", "Failed to show interstitial: attempting to show ad when parent activity is finishing", mapHashMap);
                C1679p2.this.f2514a.m4830g().m2526a(C1548f2.f1474F, C1679p2.this.f2521h, mapHashMap);
                return;
            }
            this.f2524b.setPresenter(abstractC1819y1);
            try {
                abstractC1819y1.mo2084a(this.f2525c);
            } catch (Throwable th) {
                String str = "Failed to show interstitial: presenter threw exception " + th;
                C1768p.m5167h("InterstitialAdDialogWrapper", str);
                C1679p2.m3857b(C1679p2.this.f2521h, C1679p2.this.f2518e, str, th, this.f2524b);
                HashMap<String, String> mapHashMap2 = CollectionUtils.hashMap("source", "presentContainerView");
                CollectionUtils.putStringIfValid("error_message", str, mapHashMap2);
                CollectionUtils.putStringIfValid("top_main_method", th.toString(), mapHashMap2);
                C1679p2.this.f2514a.m4830g().m2526a(C1548f2.f1474F, C1679p2.this.f2521h, mapHashMap2);
            }
        }

        @Override // com.applovin.impl.AbstractC1819y1.g
        /* JADX INFO: renamed from: a */
        public void mo1755a(String str, Throwable th) {
            C1679p2.m3857b(C1679p2.this.f2521h, C1679p2.this.f2518e, str, th, this.f2524b);
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("source", "renderInterstitialAdView");
            CollectionUtils.putStringIfValid("error_message", str, mapHashMap);
            CollectionUtils.putStringIfValid("top_main_method", th.toString(), mapHashMap);
            C1679p2.this.f2514a.m4830g().m2526a(C1548f2.f1474F, C1679p2.this.f2521h, mapHashMap);
        }
    }

    public C1679p2(AppLovinSdk appLovinSdk, Context context) {
        if (appLovinSdk == null) {
            throw new IllegalArgumentException("No sdk specified");
        }
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        this.f2514a = appLovinSdk.m5807a();
        this.f2515b = new WeakReference(context);
    }

    /* JADX INFO: renamed from: a */
    private String m3838a(AppLovinAd appLovinAd, AppLovinAd appLovinAd2, Context context) {
        if (context == null) {
            C1768p.m5167h("InterstitialAdDialogWrapper", "Failed to show interstitial: stale activity reference provided");
            return "Failed to show interstitial: stale activity reference provided";
        }
        if (appLovinAd == null) {
            C1768p.m5167h("InterstitialAdDialogWrapper", "Unable to retrieve the loaded ad: " + appLovinAd2);
            return "Unable to retrieve the loaded ad";
        }
        if (!((AppLovinAdImpl) appLovinAd).hasShown() || !((Boolean) this.f2514a.m4801a(C1831z4.f3752K1)).booleanValue()) {
            return null;
        }
        C1768p.m5167h("InterstitialAdDialogWrapper", "Attempting to show ad again: " + appLovinAd);
        return "Attempting to show ad again";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m3839a(int i) {
        if (this.f2517d != null) {
            this.f2517d.failedToReceiveAd(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m3841a(ViewGroup viewGroup, Activity activity, AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver) {
        this.f2514a.m4782Q();
        if (C1768p.m5160a()) {
            this.f2514a.m4782Q().m5171a("InterstitialAdDialogWrapper", "Presenting ad in a containerView(" + viewGroup + ")");
        }
        viewGroup.setBackgroundColor(ViewCompat.MEASURED_STATE_MASK);
        AbstractC1819y1.m5621a(this.f2521h, this.f2520g, this.f2518e, this.f2519f, this.f2516c, this.f2514a, activity, new b(activity, appLovinFullscreenAdViewObserver, viewGroup));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m3842a(Lifecycle lifecycle, AppLovinAd appLovinAd, ViewGroup viewGroup, Activity activity) {
        m3846a((AbstractC1736b) appLovinAd, viewGroup, new AppLovinFullscreenAdViewObserver(lifecycle, this), activity);
    }

    /* JADX INFO: renamed from: a */
    private void m3845a(AbstractC1736b abstractC1736b, final Context context) {
        this.f2514a.m4828f().m4430a(abstractC1736b);
        this.f2521h = abstractC1736b;
        long jM3860g = m3860g();
        this.f2514a.m4782Q();
        if (C1768p.m5160a()) {
            this.f2514a.m4782Q().m5171a("InterstitialAdDialogWrapper", "Presenting ad with delay " + jM3860g + "ms...");
        }
        if (((Boolean) this.f2514a.m4801a(C1831z4.f3871Z0)).booleanValue()) {
            this.f2514a.m4834i().m4633a(this.f2521h);
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.applovin.impl.p2$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m3840a(context);
            }
        }, jM3860g);
    }

    /* JADX INFO: renamed from: a */
    private void m3846a(AbstractC1736b abstractC1736b, final ViewGroup viewGroup, final AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver, final Activity activity) {
        this.f2514a.m4828f().m4430a(abstractC1736b);
        this.f2521h = abstractC1736b;
        long jM3860g = m3860g();
        this.f2514a.m4782Q();
        if (C1768p.m5160a()) {
            this.f2514a.m4782Q().m5171a("InterstitialAdDialogWrapper", "Presenting ad with delay " + jM3860g + "ms...");
        }
        if (((Boolean) this.f2514a.m4801a(C1831z4.f3871Z0)).booleanValue()) {
            this.f2514a.m4834i().m4633a(this.f2521h);
        }
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: com.applovin.impl.p2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m3841a(viewGroup, activity, appLovinFullscreenAdViewObserver);
            }
        }, jM3860g);
    }

    /* JADX INFO: renamed from: a */
    public static void m3847a(AbstractC1736b abstractC1736b, AppLovinAdDisplayListener appLovinAdDisplayListener, String str, Throwable th, AppLovinFullscreenActivity appLovinFullscreenActivity) {
        C1768p.m5164c("InterstitialAdDialogWrapper", str, th);
        if (appLovinAdDisplayListener instanceof InterfaceC1659n2) {
            AbstractC1793v2.m5389a(appLovinAdDisplayListener, str);
        } else {
            AbstractC1793v2.m5419b(appLovinAdDisplayListener, abstractC1736b);
        }
        if (appLovinFullscreenActivity != null) {
            appLovinFullscreenActivity.dismiss("failed_to_display_ad");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m3849a(AppLovinAd appLovinAd) {
        if (this.f2517d != null) {
            this.f2517d.adReceived(appLovinAd);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3850a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f2514a.m4840l().loadNextAd(AppLovinAdSize.INTERSTITIAL, appLovinAdLoadListener);
    }

    /* JADX INFO: renamed from: a */
    private void m3851a(String str, String str2, AppLovinAd appLovinAd) {
        if (this.f2518e != null) {
            if (this.f2518e instanceof InterfaceC1659n2) {
                ((InterfaceC1659n2) this.f2518e).onAdDisplayFailed(str2);
            } else {
                this.f2518e.adHidden(appLovinAd);
            }
        }
        Map mapM2787a = AbstractC1568h2.m2787a((AppLovinAdImpl) appLovinAd);
        CollectionUtils.putStringIfValid("source", str, mapM2787a);
        CollectionUtils.putStringIfValid("error_message", str2, mapM2787a);
        this.f2514a.m4830g().m2682d(C1548f2.f1474F, mapM2787a);
    }

    /* JADX INFO: renamed from: a */
    private void m3852a(List list, C1735a c1735a) {
        this.f2514a.m4782Q();
        if (C1768p.m5160a()) {
            this.f2514a.m4782Q().m5171a("InterstitialAdDialogWrapper", "Restoring original URLs for missing non-required cached resources: " + list);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        c1735a.m4439a(list);
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("duration_ms", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        CollectionUtils.putStringIfValid("details", list.toString(), mapHashMap);
        this.f2514a.m4830g().m2526a(C1548f2.f1484K, c1735a, mapHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m3854b(final int i) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.p2$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m3839a(i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void m3840a(Context context) {
        Intent intent = new Intent(context, (Class<?>) (this.f2521h.m4481F0() ? AppLovinFullscreenImmersiveActivity.class : AppLovinFullscreenActivity.class));
        intent.putExtra("com.applovin.interstitial.sdk_key", this.f2514a.m4839k0());
        AppLovinFullscreenActivity.parentInterstitialWrapper = this;
        if (this.f2514a.m4826e().m2143a() == null && ((Boolean) this.f2514a.m4801a(C1831z4.f4021q2)).booleanValue()) {
            intent.addFlags(8388608);
        }
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        if (context instanceof Activity) {
            context.startActivity(intent);
            ((Activity) context).overridePendingTransition(0, 0);
        } else {
            intent.addFlags(268435456);
            context.startActivity(intent);
        }
        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void m3856b(AbstractC1736b abstractC1736b) {
        this.f2514a.m4782Q();
        if (C1768p.m5160a()) {
            this.f2514a.m4782Q().m5171a("InterstitialAdDialogWrapper", "Re-showing the current ad after app launch.");
        }
        showAndRender(abstractC1736b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static void m3857b(AbstractC1736b abstractC1736b, AppLovinAdDisplayListener appLovinAdDisplayListener, String str, Throwable th, AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver) {
        appLovinFullscreenAdViewObserver.onDestroy();
        m3847a(abstractC1736b, appLovinAdDisplayListener, str, th, (AppLovinFullscreenActivity) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m3858b(final AppLovinAd appLovinAd) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.p2$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m3849a(appLovinAd);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    private Context m3859e() {
        return (Context) this.f2515b.get();
    }

    /* JADX INFO: renamed from: g */
    private long m3860g() {
        String str = this.f2514a.m4847p0().getExtraParameters().get("fullscreen_ad_display_delay_enabled");
        if (str == null || Boolean.parseBoolean(str)) {
            return Math.max(0L, ((Long) this.f2514a.m4801a(C1831z4.f3856X1)).longValue());
        }
        return 0L;
    }

    /* JADX INFO: renamed from: a */
    public void m3861a() {
        this.f2520g = null;
        this.f2517d = null;
        this.f2519f = null;
        this.f2518e = null;
    }

    /* JADX INFO: renamed from: a */
    protected boolean m3862a(AbstractC1736b abstractC1736b) {
        List listM4041a = AbstractC1701q7.m4041a(!abstractC1736b.mo4248y0(), abstractC1736b, this.f2514a, C1748l.m4756p());
        if (listM4041a.isEmpty()) {
            return false;
        }
        if (((Boolean) this.f2514a.m4801a(C1831z4.f3855X0)).booleanValue() && !AbstractC1701q7.m4070a(listM4041a, abstractC1736b)) {
            m3852a(listM4041a, (C1735a) abstractC1736b);
            return false;
        }
        String str = "Missing ad resources: " + listM4041a;
        if (((Boolean) this.f2514a.m4801a(C1831z4.f3860X5)).booleanValue()) {
            C1768p.m5167h("InterstitialAdDialogWrapper", "Failing ad display due to missing resources: " + listM4041a);
            m3851a("missingCachedAdResources", str, abstractC1736b);
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("error_message", str);
            CollectionUtils.putStringIfValid("details", "Failing ad display", mapHashMap);
            this.f2514a.m4764E().m2678a(C1548f2.f1503T0, "missingCachedAdResources", mapHashMap);
            return true;
        }
        C1768p.m5167h("InterstitialAdDialogWrapper", "Streaming ad due to missing ad resources: " + listM4041a);
        abstractC1736b.mo4221A0();
        HashMap<String, String> mapHashMap2 = CollectionUtils.hashMap("error_message", str);
        CollectionUtils.putStringIfValid("details", "Streaming ad", mapHashMap2);
        this.f2514a.m4764E().m2678a(C1548f2.f1503T0, "missingCachedAdResources", mapHashMap2);
        return false;
    }

    /* JADX INFO: renamed from: b */
    public AppLovinAdClickListener m3863b() {
        return this.f2520g;
    }

    /* JADX INFO: renamed from: c */
    public AppLovinAdDisplayListener m3864c() {
        return this.f2518e;
    }

    /* JADX INFO: renamed from: d */
    public AppLovinAdVideoPlaybackListener m3865d() {
        return this.f2519f;
    }

    /* JADX INFO: renamed from: f */
    public AbstractC1736b m3866f() {
        return this.f2521h;
    }

    /* JADX INFO: renamed from: h */
    public Map m3867h() {
        return this.f2516c;
    }

    /* JADX INFO: renamed from: i */
    public boolean m3868i() {
        final AbstractC1736b abstractC1736b = this.f2521h;
        if (abstractC1736b == null) {
            return false;
        }
        abstractC1736b.m4550n0();
        abstractC1736b.setHasShown(false);
        AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.p2$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m3856b(abstractC1736b);
            }
        });
        return true;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdClickListener(AppLovinAdClickListener appLovinAdClickListener) {
        this.f2520g = appLovinAdClickListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdDisplayListener(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f2518e = appLovinAdDisplayListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdLoadListener(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f2517d = appLovinAdLoadListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setAdVideoPlaybackListener(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.f2519f = appLovinAdVideoPlaybackListener;
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void setExtraInfo(String str, Object obj) {
        if (str == null) {
            throw new IllegalArgumentException("No key specified");
        }
        this.f2516c.put(str, obj);
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void show() {
        m3850a(new a());
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void showAndRender(AppLovinAd appLovinAd) {
        if (appLovinAd.getType() != AppLovinAdType.INCENTIVIZED) {
            Map mapM2787a = AbstractC1568h2.m2787a((AppLovinAdImpl) appLovinAd);
            CollectionUtils.putStringIfValid("source", "showInterstitialAd", mapM2787a);
            this.f2514a.m4830g().m2682d(C1548f2.f1468C, mapM2787a);
        }
        AppLovinAd appLovinAdM4026a = AbstractC1701q7.m4026a(appLovinAd, this.f2514a);
        Context contextM3859e = m3859e();
        String strM3838a = m3838a(appLovinAdM4026a, appLovinAd, contextM3859e);
        if (StringUtils.isValidString(strM3838a)) {
            m3851a("interstitialAdShowFailed", strM3838a, appLovinAd);
        } else {
            if (((Boolean) this.f2514a.m4801a(C1831z4.f3892b6)).booleanValue() && m3862a((AbstractC1736b) appLovinAdM4026a)) {
                return;
            }
            m3845a((AbstractC1736b) appLovinAdM4026a, contextM3859e);
        }
    }

    @Override // com.applovin.adview.AppLovinInterstitialAdDialog
    public void showAndRender(AppLovinAd appLovinAd, final ViewGroup viewGroup, final Lifecycle lifecycle) {
        if (appLovinAd.getType() != AppLovinAdType.INCENTIVIZED) {
            Map mapM2787a = AbstractC1568h2.m2787a((AppLovinAdImpl) appLovinAd);
            CollectionUtils.putStringIfValid("source", "showInterstitialAdView", mapM2787a);
            this.f2514a.m4830g().m2682d(C1548f2.f1468C, mapM2787a);
        }
        if (viewGroup == null || lifecycle == null) {
            C1768p.m5167h("InterstitialAdDialogWrapper", "Failed to show interstitial: attempting to show ad with null container view or lifecycle object");
            m3851a("interstitialAdShowFailed", "Failed to show interstitial: attempting to show ad with null container view or lifecycle object", appLovinAd);
            return;
        }
        final AppLovinAd appLovinAdM4026a = AbstractC1701q7.m4026a(appLovinAd, this.f2514a);
        final Activity activityM4861w0 = this.f2514a.m4861w0();
        String strM3838a = m3838a(appLovinAdM4026a, appLovinAd, activityM4861w0);
        if (StringUtils.isValidString(strM3838a)) {
            m3851a("interstitialAdShowFailed", strM3838a, appLovinAd);
        } else {
            if (((Boolean) this.f2514a.m4801a(C1831z4.f3892b6)).booleanValue() && m3862a((AbstractC1736b) appLovinAdM4026a)) {
                return;
            }
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.p2$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m3842a(lifecycle, appLovinAdM4026a, viewGroup, activityM4861w0);
                }
            });
        }
    }

    public String toString() {
        return "AppLovinInterstitialAdDialog{}";
    }
}
