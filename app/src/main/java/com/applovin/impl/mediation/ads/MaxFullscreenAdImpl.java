package com.applovin.impl.mediation.ads;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.applovin.impl.AbstractC1482a3;
import com.applovin.impl.AbstractC1568h2;
import com.applovin.impl.AbstractC1701q7;
import com.applovin.impl.AbstractC1776t3;
import com.applovin.impl.AbstractC1793v2;
import com.applovin.impl.AbstractC1821y3;
import com.applovin.impl.C1511b5;
import com.applovin.impl.C1539e3;
import com.applovin.impl.C1548f2;
import com.applovin.impl.C1552f6;
import com.applovin.impl.C1576i0;
import com.applovin.impl.C1585j;
import com.applovin.impl.C1788u6;
import com.applovin.impl.C1792v1;
import com.applovin.impl.C1830z3;
import com.applovin.impl.C1831z4;
import com.applovin.impl.EnumC1575i;
import com.applovin.impl.InterfaceC1783u1;
import com.applovin.impl.mediation.C1646b;
import com.applovin.impl.mediation.MaxErrorImpl;
import com.applovin.impl.sdk.C1734a;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class MaxFullscreenAdImpl extends AbstractC1644a implements C1734a.a, C1585j.b {

    /* JADX INFO: renamed from: a */
    private final InterfaceC1635a f2165a;

    /* JADX INFO: renamed from: b */
    private final WeakReference f2166b;

    /* JADX INFO: renamed from: c */
    private final C1636b f2167c;

    /* JADX INFO: renamed from: d */
    private final C1646b f2168d;

    /* JADX INFO: renamed from: e */
    private final Object f2169e;

    /* JADX INFO: renamed from: f */
    private C1539e3 f2170f;

    /* JADX INFO: renamed from: g */
    private EnumC1637c f2171g;

    /* JADX INFO: renamed from: h */
    private final AtomicBoolean f2172h;

    /* JADX INFO: renamed from: i */
    private final AtomicBoolean f2173i;

    /* JADX INFO: renamed from: j */
    private C1576i0 f2174j;

    /* JADX INFO: renamed from: k */
    private long f2175k;

    /* JADX INFO: renamed from: l */
    private boolean f2176l;

    /* JADX INFO: renamed from: m */
    private EnumC1638d f2177m;

    /* JADX INFO: renamed from: n */
    private String f2178n;

    /* JADX INFO: renamed from: o */
    private String f2179o;

    /* JADX INFO: renamed from: p */
    private String f2180p;

    /* JADX INFO: renamed from: q */
    private WeakReference f2181q;

    /* JADX INFO: renamed from: r */
    private WeakReference f2182r;

    /* JADX INFO: renamed from: s */
    private WeakReference f2183s;

    /* JADX INFO: renamed from: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$a */
    public interface InterfaceC1635a {
        Activity getActivity();
    }

    /* JADX INFO: renamed from: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$b */
    protected class C1636b implements MaxAdListener, MaxAdRevenueListener, AbstractC1644a.a {
        protected C1636b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public /* synthetic */ void m3380a(C1539e3 c1539e3) {
            if (c1539e3.m1863x().get()) {
                return;
            }
            MaxFullscreenAdImpl.this.sdk.m4784R().m2095a(C1548f2.f1565t0, c1539e3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public /* synthetic */ void m3381a(C1539e3 c1539e3, MaxAd maxAd) {
            if (MaxFullscreenAdImpl.this.f2177m == EnumC1638d.NONE) {
                C1768p c1768p = MaxFullscreenAdImpl.this.logger;
                if (C1768p.m5160a()) {
                    MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                    maxFullscreenAdImpl.logger.m5171a(maxFullscreenAdImpl.tag, "MaxAdListener.onAdLoaded(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.adListener);
                }
                AbstractC1793v2.m5456f(MaxFullscreenAdImpl.this.adListener, maxAd, true);
                return;
            }
            C1768p c1768p2 = MaxFullscreenAdImpl.this.logger;
            if (C1768p.m5160a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl2 = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl2.logger.m5171a(maxFullscreenAdImpl2.tag, "Attempting ad failover from: " + MaxFullscreenAdImpl.this.f2177m.m3387b());
            }
            c1539e3.m2473j(MaxFullscreenAdImpl.this.f2180p);
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("details", MaxFullscreenAdImpl.this.f2180p);
            CollectionUtils.putStringIfValid("source", MaxFullscreenAdImpl.this.f2177m.m3387b(), mapHashMap);
            MaxFullscreenAdImpl.this.sdk.m4784R().m2098a(C1548f2.f1577z0, c1539e3, mapHashMap);
            MaxFullscreenAdImpl.this.m3376h();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public /* synthetic */ void m3382a(MaxAd maxAd) {
            MaxFullscreenAdImpl.this.m3346a(maxAd);
            C1768p c1768p = MaxFullscreenAdImpl.this.logger;
            if (C1768p.m5160a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.m5171a(maxFullscreenAdImpl.tag, "MaxAdListener.onAdHidden(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            AbstractC1793v2.m5451e(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public /* synthetic */ void m3383a(MaxAd maxAd, boolean z, C1539e3 c1539e3, MaxError maxError) {
            MaxFullscreenAdImpl.this.m3346a(maxAd);
            if (!z ? MaxFullscreenAdImpl.this.m3363c(c1539e3) : false) {
                return;
            }
            C1768p c1768p = MaxFullscreenAdImpl.this.logger;
            if (C1768p.m5160a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.m5171a(maxFullscreenAdImpl.tag, "MaxAdListener.onAdDisplayFailed(ad=" + maxAd + ", error=" + maxError + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            AbstractC1793v2.m5372a(MaxFullscreenAdImpl.this.adListener, maxAd, maxError, true);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: a */
        public /* synthetic */ void m3384a(String str, MaxError maxError) {
            C1768p c1768p = MaxFullscreenAdImpl.this.logger;
            if (C1768p.m5160a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.m5171a(maxFullscreenAdImpl.tag, "MaxAdListener.onAdLoadFailed(adUnitId=" + str + ", error=" + maxError + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            AbstractC1793v2.m5377a(MaxFullscreenAdImpl.this.adListener, str, maxError, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdClicked(MaxAd maxAd) {
            C1768p c1768p = MaxFullscreenAdImpl.this.logger;
            if (C1768p.m5160a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.m5171a(maxFullscreenAdImpl.tag, "MaxAdListener.onAdClicked(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            AbstractC1793v2.m5375a(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayFailed(final MaxAd maxAd, final MaxError maxError) {
            final C1539e3 c1539e3 = (C1539e3) maxAd;
            MaxFullscreenAdImpl.this.m3368e();
            EnumC1638d enumC1638d = MaxFullscreenAdImpl.this.f2177m;
            EnumC1638d enumC1638d2 = EnumC1638d.NONE;
            final boolean z = enumC1638d != enumC1638d2;
            if (z) {
                C1768p c1768p = MaxFullscreenAdImpl.this.logger;
                if (C1768p.m5160a()) {
                    MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                    maxFullscreenAdImpl.logger.m5174b(maxFullscreenAdImpl.tag, "Ad failover failed from: " + MaxFullscreenAdImpl.this.f2177m.m3387b());
                }
                HashMap<String, String> mapHashMap = CollectionUtils.hashMap("details", c1539e3.m2484x0());
                CollectionUtils.putStringIfValid("source", MaxFullscreenAdImpl.this.f2177m.m3387b(), mapHashMap);
                MaxFullscreenAdImpl.this.sdk.m4784R().m2098a(C1548f2.f1467B0, c1539e3, mapHashMap);
                MaxFullscreenAdImpl.this.f2177m = enumC1638d2;
            }
            MaxFullscreenAdImpl.this.m3341a(EnumC1637c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$b$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m3383a(maxAd, z, c1539e3, maxError);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdDisplayed(MaxAd maxAd) {
            final C1539e3 c1539e3 = (C1539e3) maxAd;
            EnumC1638d enumC1638d = MaxFullscreenAdImpl.this.f2177m;
            EnumC1638d enumC1638d2 = EnumC1638d.NONE;
            if (enumC1638d != enumC1638d2) {
                C1768p c1768p = MaxFullscreenAdImpl.this.logger;
                if (C1768p.m5160a()) {
                    MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                    maxFullscreenAdImpl.logger.m5171a(maxFullscreenAdImpl.tag, "Ad failover succeeded from: " + MaxFullscreenAdImpl.this.f2177m.m3387b());
                }
                HashMap<String, String> mapHashMap = CollectionUtils.hashMap("details", c1539e3.m2484x0());
                CollectionUtils.putStringIfValid("source", MaxFullscreenAdImpl.this.f2177m.m3387b(), mapHashMap);
                MaxFullscreenAdImpl.this.sdk.m4784R().m2098a(C1548f2.f1465A0, c1539e3, mapHashMap);
                MaxFullscreenAdImpl.this.f2177m = enumC1638d2;
            }
            MaxFullscreenAdImpl.this.sdk.m4828f().m4430a(c1539e3);
            MaxFullscreenAdImpl.this.m3355b((AbstractC1482a3) c1539e3);
            MaxFullscreenAdImpl.this.m3374g();
            Integer num = (Integer) MaxFullscreenAdImpl.this.sdk.m4801a(AbstractC1776t3.f3366r8);
            if (num.intValue() > 0) {
                MaxFullscreenAdImpl.this.sdk.m4853s0().m2610b(new C1788u6(MaxFullscreenAdImpl.this.sdk, "ReportAdHiddenCallbackNotCalled", new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$b$$ExternalSyntheticLambda4
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m3380a(c1539e3);
                    }
                }), C1552f6.b.TIMEOUT, TimeUnit.SECONDS.toMillis(num.intValue()));
            }
            C1768p c1768p2 = MaxFullscreenAdImpl.this.logger;
            if (C1768p.m5160a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl2 = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl2.logger.m5171a(maxFullscreenAdImpl2.tag, "MaxAdListener.onAdDisplayed(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.adListener);
            }
            AbstractC1793v2.m5435c(MaxFullscreenAdImpl.this.adListener, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdHidden(final MaxAd maxAd) {
            MaxFullscreenAdImpl.this.f2177m = EnumC1638d.NONE;
            MaxFullscreenAdImpl.this.m3368e();
            MaxFullscreenAdImpl.this.m3341a(EnumC1637c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$b$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m3382a(maxAd);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoadFailed(final String str, final MaxError maxError) {
            MaxFullscreenAdImpl.this.m3370f();
            MaxFullscreenAdImpl.this.m3341a(EnumC1637c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$b$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m3384a(str, maxError);
                }
            });
        }

        @Override // com.applovin.mediation.MaxAdListener
        public void onAdLoaded(final MaxAd maxAd) {
            C1539e3 c1539e3;
            synchronized (MaxFullscreenAdImpl.this.f2169e) {
                c1539e3 = MaxFullscreenAdImpl.this.f2170f;
            }
            MaxFullscreenAdImpl.this.sdk.m4773J().m5144a(MaxFullscreenAdImpl.this.adUnitId);
            final C1539e3 c1539e4 = (C1539e3) maxAd;
            MaxFullscreenAdImpl.this.m3365d(c1539e4);
            if (!MaxFullscreenAdImpl.this.f2172h.compareAndSet(true, false)) {
                MaxFullscreenAdImpl.this.m3341a(EnumC1637c.READY, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$b$$ExternalSyntheticLambda1
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m3381a(c1539e4, maxAd);
                    }
                });
                return;
            }
            MaxFullscreenAdImpl.this.extraParameters.remove("expired_ad_ad_unit_id");
            if (MaxFullscreenAdImpl.this.f2173i.compareAndSet(true, false)) {
                MaxFullscreenAdImpl.this.m3376h();
            }
            C1768p c1768p = MaxFullscreenAdImpl.this.logger;
            if (C1768p.m5160a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.m5171a(maxFullscreenAdImpl.tag, "MaxAdListener.onExpiredAdReloaded(expiredAd=" + c1539e3 + ", newAd=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.expirationListener);
            }
            AbstractC1793v2.m5369a(MaxFullscreenAdImpl.this.expirationListener, (MaxAd) c1539e3, maxAd, true);
        }

        @Override // com.applovin.mediation.MaxAdRequestListener
        public void onAdRequestStarted(String str) {
            C1768p c1768p = MaxFullscreenAdImpl.this.logger;
            if (C1768p.m5160a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.m5171a(maxFullscreenAdImpl.tag, "MaxAdRequestListener.onAdRequestStarted(adUnitId=" + str + "), listener=" + MaxFullscreenAdImpl.this.requestListener);
            }
            AbstractC1793v2.m5379a(MaxFullscreenAdImpl.this.requestListener, str, true);
        }

        @Override // com.applovin.mediation.MaxAdRevenueListener
        public void onAdRevenuePaid(MaxAd maxAd) {
            C1768p c1768p = MaxFullscreenAdImpl.this.logger;
            if (C1768p.m5160a()) {
                MaxFullscreenAdImpl maxFullscreenAdImpl = MaxFullscreenAdImpl.this;
                maxFullscreenAdImpl.logger.m5171a(maxFullscreenAdImpl.tag, "MaxAdRevenueListener.onAdRevenuePaid(ad=" + maxAd + "), listener=" + MaxFullscreenAdImpl.this.revenueListener);
            }
            AbstractC1793v2.m5381a(MaxFullscreenAdImpl.this.revenueListener, maxAd, true);
        }
    }

    /* JADX INFO: renamed from: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$c */
    public enum EnumC1637c {
        IDLE,
        LOADING,
        READY,
        SHOWING,
        DESTROYED
    }

    /* JADX INFO: renamed from: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$d */
    private enum EnumC1638d {
        NONE("none"),
        FAILOVER_CACHE("failover_cache"),
        PRELOADED_ADS_QUEUE("preloaded_ads_queue");


        /* JADX INFO: renamed from: a */
        private final String f2195a;

        EnumC1638d(String str) {
            this.f2195a = str;
        }

        /* JADX INFO: renamed from: b */
        public String m3387b() {
            return this.f2195a;
        }
    }

    public MaxFullscreenAdImpl(String str, MaxAdFormat maxAdFormat, InterfaceC1635a interfaceC1635a, String str2, C1748l c1748l, Context context) {
        super(str, maxAdFormat, str2, c1748l);
        this.f2169e = new Object();
        this.f2170f = null;
        this.f2171g = EnumC1637c.IDLE;
        this.f2172h = new AtomicBoolean();
        this.f2173i = new AtomicBoolean();
        this.f2177m = EnumC1638d.NONE;
        this.f2181q = new WeakReference(null);
        this.f2182r = new WeakReference(null);
        this.f2183s = new WeakReference(null);
        this.f2165a = interfaceC1635a;
        this.f2167c = createAdListenerWrapper();
        this.f2168d = new C1646b(c1748l);
        this.f2166b = new WeakReference(context);
        c1748l.m4838k().m2946a(this);
        C1768p.m5166g(str2, "Created new " + str2 + " (" + this + ")");
    }

    /* JADX INFO: renamed from: a */
    private void m3338a() {
        C1539e3 c1539e3;
        synchronized (this.f2169e) {
            c1539e3 = this.f2170f;
            this.f2170f = null;
        }
        this.sdk.m4797Z().destroyAd(c1539e3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m3339a(Activity activity, Context context, EnumC1575i enumC1575i) {
        Context context2;
        Context contextM4861w0 = activity;
        if (activity != null) {
            context2 = contextM4861w0;
        } else if (context != null) {
            context2 = context;
        } else {
            contextM4861w0 = this.sdk.m4861w0() != null ? this.sdk.m4861w0() : C1748l.m4756p();
            context2 = contextM4861w0;
        }
        this.sdk.m4797Z().loadAd(this.adUnitId, null, this.adFormat, enumC1575i, this.localExtraParameters, this.extraParameters, context2, this.f2167c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m3340a(C1539e3 c1539e3) {
        this.f2167c.onAdLoaded(c1539e3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m3341a(EnumC1637c enumC1637c, Runnable runnable) {
        boolean z;
        EnumC1637c enumC1637c2 = this.f2171g;
        synchronized (this.f2169e) {
            EnumC1637c enumC1637c3 = EnumC1637c.IDLE;
            if (enumC1637c2 != enumC1637c3) {
                EnumC1637c enumC1637c4 = EnumC1637c.LOADING;
                if (enumC1637c2 == enumC1637c4) {
                    if (enumC1637c != enumC1637c3) {
                        if (enumC1637c == enumC1637c4) {
                            C1768p.m5167h(this.tag, "An ad is already loading");
                        } else if (enumC1637c != EnumC1637c.READY) {
                            if (enumC1637c == EnumC1637c.SHOWING) {
                                C1768p.m5167h(this.tag, "An ad is not ready to be shown yet");
                            } else if (enumC1637c != EnumC1637c.DESTROYED) {
                                if (C1768p.m5160a()) {
                                    this.logger.m5174b(this.tag, "Unable to transition to: " + enumC1637c);
                                }
                            }
                        }
                        z = false;
                    }
                    z = true;
                } else {
                    EnumC1637c enumC1637c5 = EnumC1637c.READY;
                    if (enumC1637c2 == enumC1637c5) {
                        if (enumC1637c != enumC1637c3) {
                            if (enumC1637c == enumC1637c4) {
                                C1768p.m5167h(this.tag, "An ad is already loaded");
                            } else if (enumC1637c == enumC1637c5) {
                                if (C1768p.m5160a()) {
                                    this.logger.m5174b(this.tag, "An ad is already marked as ready");
                                }
                            } else if (enumC1637c != EnumC1637c.SHOWING && enumC1637c != EnumC1637c.DESTROYED) {
                                if (C1768p.m5160a()) {
                                    this.logger.m5174b(this.tag, "Unable to transition to: " + enumC1637c);
                                }
                            }
                            z = false;
                        }
                        z = true;
                    } else {
                        EnumC1637c enumC1637c6 = EnumC1637c.SHOWING;
                        if (enumC1637c2 == enumC1637c6) {
                            if (enumC1637c != enumC1637c3) {
                                if (enumC1637c == enumC1637c4) {
                                    C1768p.m5167h(this.tag, "Can not load another ad while the ad is showing");
                                } else if (enumC1637c == enumC1637c5) {
                                    if (C1768p.m5160a()) {
                                        this.logger.m5174b(this.tag, "An ad is already showing, ignoring");
                                    }
                                } else if (enumC1637c == enumC1637c6) {
                                    C1768p.m5167h(this.tag, "The ad is already showing, not showing another one");
                                } else if (enumC1637c != EnumC1637c.DESTROYED) {
                                    if (C1768p.m5160a()) {
                                        this.logger.m5174b(this.tag, "Unable to transition to: " + enumC1637c);
                                    }
                                }
                            }
                            z = true;
                        } else if (enumC1637c2 == EnumC1637c.DESTROYED) {
                            C1768p.m5167h(this.tag, "No operations are allowed on a destroyed instance");
                        } else if (C1768p.m5160a()) {
                            this.logger.m5174b(this.tag, "Unknown state: " + this.f2171g);
                        }
                        z = false;
                    }
                }
            } else if (enumC1637c == EnumC1637c.LOADING || enumC1637c == EnumC1637c.DESTROYED) {
                z = true;
            } else {
                if (enumC1637c == EnumC1637c.SHOWING) {
                    C1768p.m5167h(this.tag, "No ad is loading or loaded");
                } else if (C1768p.m5160a()) {
                    this.logger.m5174b(this.tag, "Unable to transition to: " + enumC1637c);
                }
                z = false;
            }
            if (z) {
                if (C1768p.m5160a()) {
                    this.logger.m5171a(this.tag, "Transitioning from " + this.f2171g + " to " + enumC1637c + "...");
                }
                this.f2171g = enumC1637c;
            } else {
                if (C1768p.m5160a()) {
                    this.logger.m5178k(this.tag, "Not allowed to transition from " + this.f2171g + " to " + enumC1637c);
                }
                HashMap<String, String> mapHashMap = CollectionUtils.hashMap("ad_unit_id", this.adUnitId);
                CollectionUtils.putStringIfValid(FirebaseAnalytics.Param.AD_FORMAT, this.adFormat.getLabel(), mapHashMap);
                CollectionUtils.putStringIfValid("details", "current_state=" + this.f2171g + ",target_state=" + enumC1637c, mapHashMap);
                this.sdk.m4764E().m2678a(C1548f2.f1537h1, "stateTransitionFailed", mapHashMap);
            }
        }
        if (z) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3342a(EnumC1638d enumC1638d, C1539e3 c1539e3) {
        if (C1768p.m5160a()) {
            this.logger.m5171a(this.tag, "Failover ad missing from: " + enumC1638d.m3387b());
        }
        this.sdk.m4784R().m2098a(C1548f2.f1575y0, c1539e3, CollectionUtils.hashMap("source", enumC1638d.m3387b()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m3346a(MaxAd maxAd) {
        this.sdk.m4828f().m4430a((C1539e3) maxAd);
        this.f2168d.m3416a();
        m3338a();
        this.sdk.m4824c0().m5180a((AbstractC1482a3) maxAd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m3347a(Long l) {
        this.f2175k += l.longValue();
        this.sdk.m4851r0().m2215b(C1511b5.f1161S, Long.valueOf(this.f2175k));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m3348a(String str) {
        if (this.f2173i.compareAndSet(true, false)) {
            C1768p.m5167h(this.tag, "Failed to show an ad. Failed to load an ad in time to show.");
            this.sdk.m4773J().m5150c(this.adUnitId);
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-24, "Failed to show an ad. Failed to load an ad in time to show.");
            C1830z3 c1830z3 = new C1830z3(this.adUnitId, this.adFormat, str);
            if (C1768p.m5160a()) {
                this.logger.m5171a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + c1830z3 + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
            }
            AbstractC1793v2.m5372a(this.adListener, (MaxAd) c1830z3, (MaxError) maxErrorImpl, true);
            if (this.f2170f != null) {
                this.sdk.m4797Z().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.f2170f);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private void m3349a(String str, String str2) {
        this.f2168d.m3418e(this.f2170f);
        this.f2170f.m3212g(str);
        this.f2170f.m3210f(str2);
        this.f2178n = str;
        this.f2179o = str2;
        this.f2180p = this.f2170f.getNetworkName();
        this.sdk.m4866z().m2560d(this.f2170f);
        if (C1768p.m5160a()) {
            this.logger.m5171a(this.tag, "Showing ad for '" + this.adUnitId + "'; loaded ad: " + this.f2170f + "...");
        }
        m3409a((AbstractC1482a3) this.f2170f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m3350a(String str, String str2, Activity activity) {
        m3349a(str, str2);
        this.f2176l = false;
        this.f2181q = new WeakReference(activity);
        this.sdk.m4797Z().showFullscreenAd(this.f2170f, activity, this.localExtraParameters, this.extraParameters, this.f2167c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public /* synthetic */ void m3351a(String str, String str2, Activity activity, ViewGroup viewGroup, Lifecycle lifecycle) {
        m3349a(str, str2);
        this.f2176l = true;
        this.f2181q = new WeakReference(activity);
        this.f2182r = new WeakReference(viewGroup);
        this.f2183s = new WeakReference(lifecycle);
        this.sdk.m4797Z().showFullscreenAd(this.f2170f, viewGroup, lifecycle, activity, this.localExtraParameters, this.extraParameters, this.f2167c);
    }

    /* JADX INFO: renamed from: a */
    private boolean m3352a(Activity activity, final String str) {
        if (activity == null && MaxAdFormat.APP_OPEN != this.adFormat) {
            throw new IllegalArgumentException("Attempting to show ad without a valid activity.");
        }
        if (this.f2171g == EnumC1637c.DESTROYED) {
            boolean zM4092c = AbstractC1701q7.m4092c(this.sdk);
            this.sdk.m4764E().m2678a(C1548f2.f1515Z0, "attemptingToShowDestroyedAd", CollectionUtils.hashMap("details", "debug=" + zM4092c));
            if (zM4092c) {
                throw new IllegalStateException("Attempting to show ad that is destroyed for ad unit ID: " + this.adUnitId);
            }
        }
        if (!isReady()) {
            String str2 = "Attempting to show ad before it is ready - please check ad readiness using " + this.tag + "#isReady()";
            C1768p.m5167h(this.tag, str2);
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-24, str2);
            C1830z3 c1830z3 = new C1830z3(this.adUnitId, this.adFormat, str);
            if (C1768p.m5160a()) {
                this.logger.m5171a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + c1830z3 + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
            }
            AbstractC1793v2.m5372a(this.adListener, (MaxAd) c1830z3, (MaxError) maxErrorImpl, true);
            if (this.f2170f != null) {
                this.sdk.m4797Z().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.f2170f);
            }
            return false;
        }
        Long l = (Long) this.sdk.m4801a(AbstractC1776t3.f3342X7);
        Long l2 = (Long) this.sdk.m4801a(AbstractC1776t3.f3335Q7);
        if (l.longValue() > 0 && (this.f2170f.getTimeToLiveMillis() < l2.longValue() || this.f2172h.get())) {
            this.f2173i.set(true);
            this.sdk.m4853s0().m2605a(new C1788u6(this.sdk, "handleShowOnLoadTimeoutError", new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m3348a(str);
                }
            }), C1552f6.b.TIMEOUT, l.longValue());
            return false;
        }
        if (AbstractC1701q7.m4017a(C1748l.m4756p()) != 0 && this.sdk.m4847p0().shouldFailAdDisplayIfDontKeepActivitiesIsEnabled()) {
            if (AbstractC1701q7.m4092c(this.sdk)) {
                throw new IllegalStateException("Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
            }
            if (((Boolean) this.sdk.m4801a(AbstractC1776t3.f3356l8)).booleanValue()) {
                C1768p.m5167h(this.tag, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                MaxErrorImpl maxErrorImpl2 = new MaxErrorImpl(-5602, "Ad failed to display! Please disable the \"Don't Keep Activities\" setting in your developer settings!");
                if (C1768p.m5160a()) {
                    this.logger.m5171a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + this.f2170f + ", error=" + maxErrorImpl2 + "), listener=" + this.adListener);
                }
                AbstractC1793v2.m5372a(this.adListener, (MaxAd) this.f2170f, (MaxError) maxErrorImpl2, true);
                this.sdk.m4797Z().processAdDisplayErrorPostbackForUserError(maxErrorImpl2, this.f2170f);
                return false;
            }
        }
        if (!this.sdk.m4773J().m5152e() && !this.sdk.m4773J().m5151d()) {
            return true;
        }
        C1768p.m5167h(this.tag, "Attempting to show ad when another fullscreen ad is already showing");
        MaxErrorImpl maxErrorImpl3 = new MaxErrorImpl(-23, "Attempting to show ad when another fullscreen ad is already showing");
        if (C1768p.m5160a()) {
            this.logger.m5171a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + this.f2170f + ", error=" + maxErrorImpl3 + "), listener=" + this.adListener);
        }
        AbstractC1793v2.m5372a(this.adListener, (MaxAd) this.f2170f, (MaxError) maxErrorImpl3, true);
        this.sdk.m4797Z().processAdDisplayErrorPostbackForUserError(maxErrorImpl3, this.f2170f);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public void m3355b(AbstractC1482a3 abstractC1482a3) {
        if (((Boolean) this.sdk.m4801a(C1831z4.f3705E2)).booleanValue()) {
            List listM3198b = abstractC1482a3.m3198b("mappk_urls");
            if (CollectionUtils.isEmpty(listM3198b)) {
                return;
            }
            JSONObject jSONObject = new JSONObject();
            JsonUtils.putLong(jSONObject, "timestamp_ms", System.currentTimeMillis());
            JsonUtils.putJsonArray(jSONObject, "app_killed_urls", new JSONArray((Collection) listM3198b));
            JsonUtils.putJSONObject(jSONObject, "ad_info", new JSONObject(AbstractC1568h2.m2785a(abstractC1482a3)));
            JsonUtils.putJSONObject(jSONObject, "user_info", new JSONObject(AbstractC1821y3.m5699a(abstractC1482a3, this.sdk)));
            this.sdk.m4851r0().m2215b(C1511b5.f1160R, jSONObject.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void m3356b(final C1539e3 c1539e3) {
        this.f2177m = EnumC1638d.FAILOVER_CACHE;
        c1539e3.m1816B().m3569c().m3285a(this.f2167c);
        m3341a(EnumC1637c.LOADING, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m3340a(c1539e3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public /* synthetic */ void m3358b(String str) {
        C1539e3 c1539e3 = this.f2170f;
        m3346a((MaxAd) c1539e3);
        MaxErrorImpl maxErrorImpl = new MaxErrorImpl(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, str);
        if (C1768p.m5160a()) {
            this.logger.m5171a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + c1539e3 + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
        }
        AbstractC1793v2.m5372a(this.adListener, (MaxAd) c1539e3, (MaxError) maxErrorImpl, true);
        this.sdk.m4797Z().processAdDisplayErrorPostbackForUserError(maxErrorImpl, c1539e3);
    }

    /* JADX INFO: renamed from: b */
    private boolean m3359b() {
        return this.sdk.m4787T() != null ? this.sdk.m4787T().m3491e(this.adUnitId) : this.sdk.m4785S().m3440d(this.adUnitId);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public /* synthetic */ void m3360c() {
        synchronized (this.f2169e) {
            if (this.f2170f != null) {
                if (C1768p.m5160a()) {
                    this.logger.m5171a(this.tag, "Destroying ad for '" + this.adUnitId + "'; current ad: " + this.f2170f + "...");
                }
                this.sdk.m4797Z().destroyAd(this.f2170f);
            }
        }
        this.sdk.m4838k().m2947b(this);
        this.f2168d.m3416a();
        C1576i0 c1576i0 = this.f2174j;
        if (c1576i0 != null) {
            c1576i0.m2854a();
            this.f2174j = null;
        }
        super.destroy();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public /* synthetic */ void m3362c(String str) {
        C1539e3 c1539e3 = this.f2170f;
        m3346a((MaxAd) c1539e3);
        MaxErrorImpl maxErrorImpl = new MaxErrorImpl(MaxAdapterError.ERROR_CODE_AD_DISPLAY_FAILED, str);
        if (C1768p.m5160a()) {
            this.logger.m5171a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + c1539e3 + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
        }
        AbstractC1793v2.m5372a(this.adListener, (MaxAd) c1539e3, (MaxError) maxErrorImpl, true);
        this.sdk.m4797Z().processAdDisplayErrorPostbackForUserError(maxErrorImpl, c1539e3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public boolean m3363c(C1539e3 c1539e3) {
        if (m3369e(c1539e3)) {
            return true;
        }
        return m3372f(c1539e3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public /* synthetic */ void m3364d() {
        this.f2177m = EnumC1638d.PRELOADED_ADS_QUEUE;
        loadAd();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public void m3365d(C1539e3 c1539e3) {
        if (!this.sdk.m4828f().m4431a(c1539e3, this)) {
            if (C1768p.m5160a()) {
                this.logger.m5171a(this.tag, "Loaded an expired ad, running expire logic...");
            }
            onAdExpired(c1539e3);
            return;
        }
        if (C1768p.m5160a()) {
            this.logger.m5171a(this.tag, "Handle ad loaded for regular ad: " + c1539e3);
        }
        this.f2170f = c1539e3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public void m3368e() {
        if (((Boolean) this.sdk.m4801a(C1831z4.f3705E2)).booleanValue()) {
            this.sdk.m4851r0().m2214b(C1511b5.f1160R);
        }
        if (this.f2174j != null) {
            this.sdk.m4851r0().m2214b(C1511b5.f1161S);
            this.f2174j.m2854a();
            this.f2174j = null;
        }
    }

    /* JADX INFO: renamed from: e */
    private boolean m3369e(C1539e3 c1539e3) {
        if (!c1539e3.m2469D0()) {
            return false;
        }
        C1792v1 c1792v1M4770H = this.sdk.m4770H();
        final C1539e3 c1539e3M5361a = c1792v1M4770H.m5361a(this.adUnitId);
        if (c1539e3M5361a == null) {
            m3342a(EnumC1638d.FAILOVER_CACHE, c1539e3);
            return false;
        }
        if (c1539e3M5361a.m1822H() < c1539e3.m1824J()) {
            if (C1768p.m5160a()) {
                this.logger.m5171a(this.tag, "The failover ad's eCPM does not exceed floor value");
            }
            this.sdk.m4784R().m2095a(C1548f2.f1477G0, c1539e3);
            return false;
        }
        if (C1768p.m5160a()) {
            this.logger.m5171a(this.tag, "Loading ad from failover cache");
        }
        c1792v1M4770H.m5363b(c1539e3M5361a);
        if (c1539e3M5361a.m1831R().endsWith("load")) {
            this.f2167c.onAdRevenuePaid(c1539e3M5361a);
        }
        AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m3356b(c1539e3M5361a);
            }
        });
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public void m3370f() {
        C1539e3 c1539e3;
        if (this.f2172h.compareAndSet(true, false)) {
            synchronized (this.f2169e) {
                c1539e3 = this.f2170f;
                this.f2170f = null;
            }
            this.sdk.m4797Z().destroyAd(c1539e3);
            this.extraParameters.remove("expired_ad_ad_unit_id");
        }
    }

    /* JADX INFO: renamed from: f */
    private boolean m3372f(C1539e3 c1539e3) {
        if (!c1539e3.m2470E0()) {
            return false;
        }
        if (m3359b()) {
            AppLovinSdkUtils.runOnUiThread(true, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m3364d();
                }
            });
            return true;
        }
        m3342a(EnumC1638d.PRELOADED_ADS_QUEUE, c1539e3);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public void m3374g() {
        final Long l = (Long) this.sdk.m4801a(C1831z4.f3713F2);
        if (l.longValue() <= 0) {
            return;
        }
        this.f2174j = C1576i0.m2852a(l.longValue(), true, this.sdk, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m3347a(l);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public void m3376h() {
        Activity activityM4861w0 = (Activity) this.f2181q.get();
        if (activityM4861w0 == null) {
            activityM4861w0 = this.sdk.m4861w0();
        }
        Activity activity = activityM4861w0;
        if (this.f2176l) {
            showAd(this.f2178n, this.f2179o, (ViewGroup) this.f2182r.get(), (Lifecycle) this.f2183s.get(), activity);
        } else {
            showAd(this.f2178n, this.f2179o, activity);
        }
    }

    protected C1636b createAdListenerWrapper() {
        return new C1636b();
    }

    @Override // com.applovin.impl.mediation.ads.AbstractC1644a
    public void destroy() {
        m3341a(EnumC1637c.DESTROYED, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m3360c();
            }
        });
    }

    public boolean isLoading() {
        boolean z;
        synchronized (this.f2169e) {
            z = this.f2171g == EnumC1637c.LOADING;
        }
        return z;
    }

    public boolean isReady() {
        boolean z;
        synchronized (this.f2169e) {
            C1539e3 c1539e3 = this.f2170f;
            z = c1539e3 != null && c1539e3.m1845a0() && this.f2171g == EnumC1637c.READY;
        }
        if (!z) {
            this.sdk.m4773J().m5150c(this.adUnitId);
        }
        return z;
    }

    public boolean isShowing() {
        boolean z;
        synchronized (this.f2169e) {
            z = this.f2171g == EnumC1637c.SHOWING;
        }
        return z;
    }

    public void loadAd() {
        loadAd(EnumC1575i.PUBLISHER_INITIATED);
    }

    public void loadAd(final EnumC1575i enumC1575i) {
        if (C1768p.m5160a()) {
            this.logger.m5171a(this.tag, "Loading ad for '" + this.adUnitId + "'...");
        }
        if (this.f2171g == EnumC1637c.DESTROYED) {
            boolean zM4092c = AbstractC1701q7.m4092c(this.sdk);
            this.sdk.m4764E().m2678a(C1548f2.f1515Z0, "attemptingToLoadDestroyedAd", CollectionUtils.hashMap("details", "debug=" + zM4092c));
            if (zM4092c) {
                throw new IllegalStateException("Failed to load new ad - this instance is already destroyed for ad unit ID: " + this.adUnitId);
            }
        }
        if (!isReady()) {
            InterfaceC1635a interfaceC1635a = this.f2165a;
            final Activity activity = interfaceC1635a != null ? interfaceC1635a.getActivity() : null;
            final Context context = (Context) this.f2166b.get();
            m3341a(EnumC1637c.LOADING, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m3339a(activity, context, enumC1575i);
                }
            });
            return;
        }
        if (C1768p.m5160a()) {
            this.logger.m5171a(this.tag, "An ad is already loaded for '" + this.adUnitId + "'");
        }
        if (C1768p.m5160a()) {
            this.logger.m5171a(this.tag, "MaxAdListener.onAdLoaded(ad=" + this.f2170f + "), listener=" + this.adListener);
        }
        AbstractC1793v2.m5456f(this.adListener, (MaxAd) this.f2170f, true);
    }

    @Override // com.applovin.impl.sdk.C1734a.a
    public void onAdExpired(InterfaceC1783u1 interfaceC1783u1) {
        if (C1768p.m5160a()) {
            this.logger.m5171a(this.tag, "Ad expired " + getAdUnitId());
        }
        this.f2172h.set(true);
        InterfaceC1635a interfaceC1635a = this.f2165a;
        Activity activity = interfaceC1635a != null ? interfaceC1635a.getActivity() : null;
        if (activity == null && (activity = this.sdk.m4826e().m2145b()) == null) {
            m3370f();
            this.f2167c.onAdLoadFailed(this.adUnitId, MaxAdapterError.MISSING_ACTIVITY);
        } else {
            this.extraParameters.put("expired_ad_ad_unit_id", getAdUnitId());
            this.sdk.m4797Z().loadAd(this.adUnitId, null, this.adFormat, EnumC1575i.EXPIRED, this.localExtraParameters, this.extraParameters, activity, this.f2167c);
        }
    }

    @Override // com.applovin.impl.C1585j.b
    public void onCreativeIdGenerated(String str, String str2) {
        C1539e3 c1539e3 = this.f2170f;
        if (c1539e3 == null || !c1539e3.m1833T().equalsIgnoreCase(str)) {
            return;
        }
        this.f2170f.m1852h(str2);
        AbstractC1793v2.m5416b(this.adReviewListener, str2, this.f2170f);
    }

    public void showAd(final String str, final String str2, final Activity activity) {
        C1539e3 c1539e3;
        List listM2927b = this.sdk.m4857u0().m2927b();
        if (!this.sdk.m4857u0().m2929d() || listM2927b == null || (c1539e3 = this.f2170f) == null || listM2927b.contains(c1539e3.m3200c())) {
            if (activity == null) {
                activity = this.sdk.m4861w0();
            }
            if (m3352a(activity, str)) {
                m3341a(EnumC1637c.SHOWING, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$$ExternalSyntheticLambda9
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m3350a(str, str2, activity);
                    }
                });
                return;
            }
            return;
        }
        final String str3 = "Attempting to show ad from <" + this.f2170f.m3200c() + "> which is not in the list of selected ad networks " + listM2927b;
        C1768p.m5167h(this.tag, str3);
        m3341a(EnumC1637c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m3358b(str3);
            }
        });
    }

    public void showAd(final String str, final String str2, final ViewGroup viewGroup, final Lifecycle lifecycle, Activity activity) {
        C1539e3 c1539e3;
        if (viewGroup == null || lifecycle == null) {
            C1768p.m5167h(this.tag, "Attempting to show ad with null containerView or lifecycle.");
            MaxErrorImpl maxErrorImpl = new MaxErrorImpl(-1, "Attempting to show ad with null containerView or lifecycle.");
            if (C1768p.m5160a()) {
                this.logger.m5171a(this.tag, "MaxAdListener.onAdDisplayFailed(ad=" + this.f2170f + ", error=" + maxErrorImpl + "), listener=" + this.adListener);
            }
            AbstractC1793v2.m5372a(this.adListener, (MaxAd) this.f2170f, (MaxError) maxErrorImpl, true);
            this.sdk.m4797Z().processAdDisplayErrorPostbackForUserError(maxErrorImpl, this.f2170f);
            return;
        }
        if (!viewGroup.isShown() && ((Boolean) this.sdk.m4801a(AbstractC1776t3.f3357m8)).booleanValue()) {
            C1768p.m5167h(this.tag, "Attempting to show ad when containerView and/or its ancestors are not visible");
            MaxErrorImpl maxErrorImpl2 = new MaxErrorImpl(-1, "Attempting to show ad when containerView and/or its ancestors are not visible");
            AbstractC1793v2.m5372a(this.adListener, (MaxAd) this.f2170f, (MaxError) maxErrorImpl2, true);
            this.sdk.m4797Z().processAdDisplayErrorPostbackForUserError(maxErrorImpl2, this.f2170f);
            return;
        }
        List listM2927b = this.sdk.m4857u0().m2927b();
        if (!this.sdk.m4857u0().m2929d() || listM2927b == null || (c1539e3 = this.f2170f) == null || listM2927b.contains(c1539e3.m3200c())) {
            if (activity == null) {
                activity = this.sdk.m4861w0();
            }
            final Activity activity2 = activity;
            if (m3352a(activity2, str)) {
                m3341a(EnumC1637c.SHOWING, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$$ExternalSyntheticLambda2
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f$0.m3351a(str, str2, activity2, viewGroup, lifecycle);
                    }
                });
                return;
            }
            return;
        }
        final String str3 = "Attempting to show ad from <" + this.f2170f.m3200c() + "> which is not in the list of selected ad networks " + listM2927b;
        C1768p.m5167h(this.tag, str3);
        m3341a(EnumC1637c.IDLE, new Runnable() { // from class: com.applovin.impl.mediation.ads.MaxFullscreenAdImpl$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m3362c(str3);
            }
        });
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.tag);
        sb.append("{adUnitId='");
        sb.append(this.adUnitId);
        sb.append("', adListener=");
        Object obj = this.adListener;
        if (obj == this.f2165a) {
            obj = "this";
        }
        sb.append(obj);
        sb.append(", revenueListener=");
        sb.append(this.revenueListener);
        sb.append(", requestListener");
        sb.append(this.requestListener);
        sb.append(", adReviewListener");
        sb.append(this.adReviewListener);
        sb.append(", isReady=");
        sb.append(isReady());
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}
