package com.chartboost.sdk.impl;

import com.chartboost.sdk.ads.Banner;
import com.chartboost.sdk.ads.InterfaceC3614Ad;
import com.chartboost.sdk.ads.Interstitial;
import com.chartboost.sdk.ads.Rewarded;
import com.chartboost.sdk.callbacks.AdCallback;
import com.chartboost.sdk.callbacks.DismissibleAdCallback;
import com.chartboost.sdk.callbacks.RewardedCallback;
import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.CacheEvent;
import com.chartboost.sdk.events.ClickError;
import com.chartboost.sdk.events.ClickEvent;
import com.chartboost.sdk.events.DismissEvent;
import com.chartboost.sdk.events.ExpirationEvent;
import com.chartboost.sdk.events.ImpressionEvent;
import com.chartboost.sdk.events.RewardEvent;
import com.chartboost.sdk.events.ShowError;
import com.chartboost.sdk.events.ShowEvent;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.e */
/* JADX INFO: loaded from: classes3.dex */
public final class C3719e {

    /* JADX INFO: renamed from: a */
    public final InterfaceC3945ni f13936a;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.e$a */
    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC3614Ad f13937b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AdCallback f13938c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f13939d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ CacheError f13940e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ C3719e f13941f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC3614Ad interfaceC3614Ad, AdCallback adCallback, String str, CacheError cacheError, C3719e c3719e) {
            super(0);
            this.f13937b = interfaceC3614Ad;
            this.f13938c = adCallback;
            this.f13939d = str;
            this.f13940e = cacheError;
            this.f13941f = c3719e;
        }

        /* JADX INFO: renamed from: a */
        public final void m17406a() {
            Unit unit;
            Unit unit2;
            InterfaceC3614Ad interfaceC3614Ad = this.f13937b;
            if (interfaceC3614Ad != null) {
                AdCallback adCallback = this.f13938c;
                String str = this.f13939d;
                CacheError cacheError = this.f13940e;
                C3719e c3719e = this.f13941f;
                if (adCallback != null) {
                    adCallback.onAdLoaded(new CacheEvent(str, interfaceC3614Ad), cacheError);
                    unit2 = Unit.INSTANCE;
                } else {
                    unit2 = null;
                }
                if (unit2 == null) {
                    C4048sb.m19413c("Callback missing for " + c3719e.m17397a(interfaceC3614Ad) + " on onAdLoaded", null, 2, null);
                }
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                C4048sb.m19411b("Ad is missing on onAdLoaded", (Throwable) null, 2, (Object) null);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m17406a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.e$b */
    public static final class b extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC3614Ad f13942b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AdCallback f13943c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f13944d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ ClickError f13945e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ C3719e f13946f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC3614Ad interfaceC3614Ad, AdCallback adCallback, String str, ClickError clickError, C3719e c3719e) {
            super(0);
            this.f13942b = interfaceC3614Ad;
            this.f13943c = adCallback;
            this.f13944d = str;
            this.f13945e = clickError;
            this.f13946f = c3719e;
        }

        /* JADX INFO: renamed from: a */
        public final void m17407a() {
            Unit unit;
            Unit unit2;
            InterfaceC3614Ad interfaceC3614Ad = this.f13942b;
            if (interfaceC3614Ad != null) {
                AdCallback adCallback = this.f13943c;
                String str = this.f13944d;
                ClickError clickError = this.f13945e;
                C3719e c3719e = this.f13946f;
                if (adCallback != null) {
                    adCallback.onAdClicked(new ClickEvent(str, interfaceC3614Ad), clickError);
                    unit2 = Unit.INSTANCE;
                } else {
                    unit2 = null;
                }
                if (unit2 == null) {
                    C4048sb.m19413c("Callback missing for " + c3719e.m17397a(interfaceC3614Ad) + " on onAdClicked", null, 2, null);
                }
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                C4048sb.m19411b("Ad is missing on onAdClicked", (Throwable) null, 2, (Object) null);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m17407a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.e$c */
    public static final class c extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AdCallback f13947b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC3614Ad f13948c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f13949d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AdCallback adCallback, InterfaceC3614Ad interfaceC3614Ad, String str) {
            super(0);
            this.f13947b = adCallback;
            this.f13948c = interfaceC3614Ad;
            this.f13949d = str;
        }

        /* JADX INFO: renamed from: a */
        public final void m17408a() {
            Unit unit;
            Unit unit2;
            AdCallback adCallback = this.f13947b;
            if (adCallback != null) {
                InterfaceC3614Ad interfaceC3614Ad = this.f13948c;
                String str = this.f13949d;
                if (adCallback instanceof DismissibleAdCallback) {
                    if (interfaceC3614Ad != null) {
                        ((DismissibleAdCallback) adCallback).onAdDismiss(new DismissEvent(str, interfaceC3614Ad));
                        unit2 = Unit.INSTANCE;
                    } else {
                        unit2 = null;
                    }
                    if (unit2 == null) {
                        C4048sb.m19411b("Ad is missing on onAdDismiss", (Throwable) null, 2, (Object) null);
                    }
                } else {
                    C4048sb.m19411b("Invalid ad type to send onAdDismiss", (Throwable) null, 2, (Object) null);
                }
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                C4048sb.m19411b("Missing callback on sendDismissCallbackOnMainThread", (Throwable) null, 2, (Object) null);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m17408a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.e$d */
    public static final class d extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AdCallback f13950b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ExpirationEvent f13951c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C3719e f13952d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AdCallback adCallback, ExpirationEvent expirationEvent, C3719e c3719e) {
            super(0);
            this.f13950b = adCallback;
            this.f13951c = expirationEvent;
            this.f13952d = c3719e;
        }

        /* JADX INFO: renamed from: a */
        public final void m17409a() {
            Unit unit;
            try {
                AdCallback adCallback = this.f13950b;
                if (adCallback != null) {
                    adCallback.onAdExpired(this.f13951c);
                    unit = Unit.INSTANCE;
                } else {
                    unit = null;
                }
                if (unit == null) {
                    C4048sb.m19413c("Callback missing for " + this.f13952d.m17397a(this.f13951c.getAd()) + " on onAdExpired", null, 2, null);
                }
            } catch (Exception e) {
                C4048sb.m19410b("Error delivering onAdExpired callback", e);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m17409a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.e$e */
    public static final class e extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC3614Ad f13953b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AdCallback f13954c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f13955d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C3719e f13956e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC3614Ad interfaceC3614Ad, AdCallback adCallback, String str, C3719e c3719e) {
            super(0);
            this.f13953b = interfaceC3614Ad;
            this.f13954c = adCallback;
            this.f13955d = str;
            this.f13956e = c3719e;
        }

        /* JADX INFO: renamed from: a */
        public final void m17410a() {
            Unit unit;
            Unit unit2;
            InterfaceC3614Ad interfaceC3614Ad = this.f13953b;
            if (interfaceC3614Ad != null) {
                AdCallback adCallback = this.f13954c;
                String str = this.f13955d;
                C3719e c3719e = this.f13956e;
                if (adCallback != null) {
                    adCallback.onImpressionRecorded(new ImpressionEvent(str, interfaceC3614Ad));
                    unit2 = Unit.INSTANCE;
                } else {
                    unit2 = null;
                }
                if (unit2 == null) {
                    C4048sb.m19413c("Callback missing for " + c3719e.m17397a(interfaceC3614Ad) + " on onImpressionRecorded", null, 2, null);
                }
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                C4048sb.m19411b("Ad is missing on onImpressionRecorded", (Throwable) null, 2, (Object) null);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m17410a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.e$f */
    public static final class f extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC3614Ad f13957b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AdCallback f13958c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f13959d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ C3719e f13960e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC3614Ad interfaceC3614Ad, AdCallback adCallback, String str, C3719e c3719e) {
            super(0);
            this.f13957b = interfaceC3614Ad;
            this.f13958c = adCallback;
            this.f13959d = str;
            this.f13960e = c3719e;
        }

        /* JADX INFO: renamed from: a */
        public final void m17411a() {
            Unit unit;
            Unit unit2;
            InterfaceC3614Ad interfaceC3614Ad = this.f13957b;
            if (interfaceC3614Ad != null) {
                AdCallback adCallback = this.f13958c;
                String str = this.f13959d;
                C3719e c3719e = this.f13960e;
                if (adCallback != null) {
                    adCallback.onAdRequestedToShow(new ShowEvent(str, interfaceC3614Ad));
                    unit2 = Unit.INSTANCE;
                } else {
                    unit2 = null;
                }
                if (unit2 == null) {
                    C4048sb.m19413c("Callback missing for " + c3719e.m17397a(interfaceC3614Ad) + " on onAdRequestedToShow", null, 2, null);
                }
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                C4048sb.m19411b("Ad is missing on onAdRequestedToShow", (Throwable) null, 2, (Object) null);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m17411a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.e$g */
    public static final class g extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ AdCallback f13961b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ InterfaceC3614Ad f13962c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f13963d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ int f13964e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(AdCallback adCallback, InterfaceC3614Ad interfaceC3614Ad, String str, int i) {
            super(0);
            this.f13961b = adCallback;
            this.f13962c = interfaceC3614Ad;
            this.f13963d = str;
            this.f13964e = i;
        }

        /* JADX INFO: renamed from: a */
        public final void m17412a() {
            Unit unit;
            Unit unit2;
            AdCallback adCallback = this.f13961b;
            if (adCallback != null) {
                InterfaceC3614Ad interfaceC3614Ad = this.f13962c;
                String str = this.f13963d;
                int i = this.f13964e;
                if (adCallback instanceof RewardedCallback) {
                    if (interfaceC3614Ad != null) {
                        ((RewardedCallback) adCallback).onRewardEarned(new RewardEvent(str, interfaceC3614Ad, i));
                        unit2 = Unit.INSTANCE;
                    } else {
                        unit2 = null;
                    }
                    if (unit2 == null) {
                        C4048sb.m19411b("Ad is missing on didEarnReward", (Throwable) null, 2, (Object) null);
                    }
                } else {
                    C4048sb.m19411b("Invalid ad type to send a reward", (Throwable) null, 2, (Object) null);
                }
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                C4048sb.m19411b("Missing callback on sendRewardCallbackOnMainThread", (Throwable) null, 2, (Object) null);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m17412a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.e$h */
    public static final class h extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ InterfaceC3614Ad f13965b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ AdCallback f13966c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f13967d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ ShowError f13968e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ C3719e f13969f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC3614Ad interfaceC3614Ad, AdCallback adCallback, String str, ShowError showError, C3719e c3719e) {
            super(0);
            this.f13965b = interfaceC3614Ad;
            this.f13966c = adCallback;
            this.f13967d = str;
            this.f13968e = showError;
            this.f13969f = c3719e;
        }

        /* JADX INFO: renamed from: a */
        public final void m17413a() {
            Unit unit;
            Unit unit2;
            InterfaceC3614Ad interfaceC3614Ad = this.f13965b;
            if (interfaceC3614Ad != null) {
                AdCallback adCallback = this.f13966c;
                String str = this.f13967d;
                ShowError showError = this.f13968e;
                C3719e c3719e = this.f13969f;
                if (adCallback != null) {
                    adCallback.onAdShown(new ShowEvent(str, interfaceC3614Ad), showError);
                    unit2 = Unit.INSTANCE;
                } else {
                    unit2 = null;
                }
                if (unit2 == null) {
                    C4048sb.m19413c("Callback missing for " + c3719e.m17397a(interfaceC3614Ad) + " on onAdShown", null, 2, null);
                }
                unit = Unit.INSTANCE;
            } else {
                unit = null;
            }
            if (unit == null) {
                C4048sb.m19411b("Ad is missing on onAdShown", (Throwable) null, 2, (Object) null);
            }
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m17413a();
            return Unit.INSTANCE;
        }
    }

    public C3719e(InterfaceC3945ni uiPoster) {
        Intrinsics.checkNotNullParameter(uiPoster, "uiPoster");
        this.f13936a = uiPoster;
    }

    /* JADX INFO: renamed from: a */
    public final String m17397a(InterfaceC3614Ad interfaceC3614Ad) {
        if (interfaceC3614Ad instanceof Interstitial) {
            return AbstractC3628a0.b.f13429g.m16771b();
        }
        if (interfaceC3614Ad instanceof Rewarded) {
            return AbstractC3628a0.c.f13430g.m16771b();
        }
        if (interfaceC3614Ad instanceof Banner) {
            return AbstractC3628a0.a.f13428g.m16771b();
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: a */
    public final void m17398a(ExpirationEvent event, AdCallback adCallback) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f13936a.mo18805a(new d(adCallback, event, this));
    }

    /* JADX INFO: renamed from: a */
    public final void m17399a(String str, InterfaceC3614Ad interfaceC3614Ad, AdCallback adCallback) {
        this.f13936a.mo18805a(new c(adCallback, interfaceC3614Ad, str));
    }

    /* JADX INFO: renamed from: a */
    public final void m17400a(String str, InterfaceC3614Ad interfaceC3614Ad, AdCallback adCallback, int i) {
        this.f13936a.mo18805a(new g(adCallback, interfaceC3614Ad, str, i));
    }

    /* JADX INFO: renamed from: a */
    public final void m17401a(String str, CacheError cacheError, InterfaceC3614Ad interfaceC3614Ad, AdCallback adCallback) {
        this.f13936a.mo18805a(new a(interfaceC3614Ad, adCallback, str, cacheError, this));
    }

    /* JADX INFO: renamed from: a */
    public final void m17402a(String str, ClickError clickError, InterfaceC3614Ad interfaceC3614Ad, AdCallback adCallback) {
        this.f13936a.mo18805a(new b(interfaceC3614Ad, adCallback, str, clickError, this));
    }

    /* JADX INFO: renamed from: a */
    public final void m17403a(String str, ShowError showError, InterfaceC3614Ad interfaceC3614Ad, AdCallback adCallback) {
        this.f13936a.mo18805a(new h(interfaceC3614Ad, adCallback, str, showError, this));
    }

    /* JADX INFO: renamed from: b */
    public final void m17404b(String str, InterfaceC3614Ad interfaceC3614Ad, AdCallback adCallback) {
        this.f13936a.mo18805a(new e(interfaceC3614Ad, adCallback, str, this));
    }

    /* JADX INFO: renamed from: c */
    public final void m17405c(String str, InterfaceC3614Ad interfaceC3614Ad, AdCallback adCallback) {
        this.f13936a.mo18805a(new f(interfaceC3614Ad, adCallback, str, this));
    }
}
