package com.chartboost.sdk.impl;

import android.content.Context;
import android.view.View;
import com.chartboost.sdk.ads.Banner;
import com.chartboost.sdk.callbacks.BannerCallback;
import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.CacheEvent;
import com.chartboost.sdk.events.ChartboostError;
import com.chartboost.sdk.events.ClickError;
import com.chartboost.sdk.events.ClickEvent;
import com.chartboost.sdk.events.ExpirationEvent;
import com.chartboost.sdk.events.ImpressionEvent;
import com.chartboost.sdk.events.ShowError;
import com.chartboost.sdk.events.ShowEvent;
import java.net.URL;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.f2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3745f2 extends AbstractC3837j2 {

    /* JADX INFO: renamed from: o */
    public C3672bl f14133o;

    /* JADX INFO: renamed from: p */
    public final BannerCallback f14134p;

    /* JADX INFO: renamed from: q */
    public final InterfaceC3880l f14135q;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.f2$a */
    public static final class a implements BannerCallback {
        public a() {
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdClicked(ClickEvent event, ClickError clickError) {
            Intrinsics.checkNotNullParameter(event, "event");
            C3745f2.this.m18143a(event, clickError);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdExpired(ExpirationEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            C3745f2.this.m18144a(event);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdLoaded(CacheEvent event, CacheError cacheError) {
            Intrinsics.checkNotNullParameter(event, "event");
            C3745f2.this.m18142a(event, cacheError);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdRequestedToShow(ShowEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            C3745f2.this.m18146a(event);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdShown(ShowEvent event, ShowError showError) {
            Intrinsics.checkNotNullParameter(event, "event");
            C3745f2.this.m18147a(event, showError);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onImpressionRecorded(ImpressionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            C3745f2.this.m18145a(event);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3745f2(C3699d2 api, BannerCallback callback, Banner banner, InterfaceC3703d6 dependencyContainer) {
        super(banner, api, callback, dependencyContainer, new C3834j(EnumC4036s.BANNER, null, 2, null));
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(banner, "banner");
        Intrinsics.checkNotNullParameter(dependencyContainer, "dependencyContainer");
        this.f14134p = new a();
        this.f14135q = new AbstractC3837j2.b();
    }

    /* JADX INFO: renamed from: a */
    public static final void m17602a(C3745f2 this$0, ShowEvent showEvent) {
        Unit unit;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(showEvent, "$showEvent");
        this$0.m18165s();
        ((BannerCallback) this$0.m18159k()).onImpressionRecorded(new ImpressionEvent(showEvent.getAdID(), this$0.m18155e()));
        C4026rb c4026rbM18828f = this$0.m18156g().m18828f();
        if (c4026rbM18828f != null) {
            this$0.m18156g().m18825c(c4026rbM18828f);
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            C4048sb.m19417e("Cannot track impression: currentAd is null for location " + ((Banner) this$0.m18155e()).getLocation(), null, 2, null);
        }
    }

    @Override // com.chartboost.sdk.impl.AbstractC3837j2
    /* JADX INFO: renamed from: a */
    public void mo17603a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        ((C3699d2) m18157h()).m17244a((Banner) m18155e());
    }

    @Override // com.chartboost.sdk.impl.AbstractC3837j2
    /* JADX INFO: renamed from: a */
    public void mo17604a(View view, final ShowEvent showEvent) {
        Intrinsics.checkNotNullParameter(showEvent, "showEvent");
        Unit unit = null;
        if (view != null) {
            ((BannerCallback) m18159k()).onAdShown(showEvent, null);
            C3672bl c3672bl = this.f14133o;
            if (c3672bl != null) {
                c3672bl.m16980b();
            }
            Context context = ((Banner) m18155e()).getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            View viewM16988a = C3672bl.f13601r.m16988a(((Banner) m18155e()).getContext(), view);
            if (viewM16988a == null) {
                viewM16988a = view.getRootView();
            }
            View view2 = viewM16988a;
            Intrinsics.checkNotNull(view2);
            C3672bl c3672bl2 = new C3672bl(context, view, view2, 1, 0, 100L, 25, false, 128, null);
            this.f14133o = c3672bl2;
            c3672bl2.m16979a(new C3672bl.b() { // from class: com.chartboost.sdk.impl.f2$$ExternalSyntheticLambda0
                @Override // com.chartboost.sdk.impl.C3672bl.b
                /* JADX INFO: renamed from: a */
                public final void mo16989a() {
                    C3745f2.m17602a(this.f$0, showEvent);
                }
            });
            C3672bl c3672bl3 = this.f14133o;
            if (c3672bl3 != null) {
                c3672bl3.m16987i();
            }
            ((Banner) m18155e()).removeAllViews();
            ((Banner) m18155e()).addView(view);
            unit = Unit.INSTANCE;
        }
        if (unit == null) {
            m18149a(ChartboostError.Show.NoAd.INSTANCE, showEvent);
        }
    }

    @Override // com.chartboost.sdk.impl.AbstractC3837j2
    /* JADX INFO: renamed from: a */
    public void mo17605a(String str) {
        ((C3699d2) m18157h()).m17246a((Banner) m18155e(), mo17609i(), str);
    }

    @Override // com.chartboost.sdk.impl.AbstractC3837j2
    /* JADX INFO: renamed from: b */
    public Object mo17606b(Context context, Continuation continuation) {
        ((C3699d2) m18157h()).m17247b((Banner) m18155e(), mo17609i());
        Result.Companion companion = Result.INSTANCE;
        return Result.m44946constructorimpl(m18155e());
    }

    @Override // com.chartboost.sdk.impl.AbstractC3837j2, com.chartboost.sdk.impl.InterfaceC3752f9
    /* JADX INFO: renamed from: b */
    public void mo17607b() {
        C3672bl c3672bl = this.f14133o;
        if (c3672bl != null) {
            c3672bl.m16980b();
        }
        this.f14133o = null;
        ((C3699d2) m18157h()).m17248d();
        super.mo17607b();
    }

    @Override // com.chartboost.sdk.impl.AbstractC3837j2
    /* JADX INFO: renamed from: f */
    public InterfaceC3880l mo17608f() {
        return this.f14135q;
    }

    @Override // com.chartboost.sdk.impl.AbstractC3837j2
    /* JADX INFO: renamed from: l */
    public URL mo17610l() {
        return null;
    }

    @Override // com.chartboost.sdk.impl.AbstractC3837j2
    /* JADX INFO: renamed from: o */
    public void mo17611o() {
        BannerCallback bannerCallbackMo17609i = mo17609i();
        C4026rb c4026rbM18828f = m18156g().m18828f();
        bannerCallbackMo17609i.onAdLoaded(new CacheEvent(c4026rbM18828f != null ? c4026rbM18828f.m19330b() : null, m18155e()), null);
    }

    @Override // com.chartboost.sdk.impl.AbstractC3837j2
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public BannerCallback mo17609i() {
        return this.f14134p;
    }
}
