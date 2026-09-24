package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.ads.Rewarded;
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
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.gg */
/* JADX INFO: loaded from: classes3.dex */
public final class C3782gg extends AbstractC3837j2 {

    /* JADX INFO: renamed from: o */
    public final RewardedCallback f14329o;

    /* JADX INFO: renamed from: p */
    public final InterfaceC3880l f14330p;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.gg$a */
    public static final class a extends Lambda implements Function0 {
        public a() {
            super(0);
        }

        /* JADX INFO: renamed from: a */
        public final void m17810a() {
            RewardedCallback rewardedCallback = (RewardedCallback) C3782gg.this.m18159k();
            C4026rb c4026rbM18828f = C3782gg.this.m18156g().m18828f();
            rewardedCallback.onRewardEarned(new RewardEvent(c4026rbM18828f != null ? c4026rbM18828f.m19330b() : null, C3782gg.this.m18155e(), 0));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m17810a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.gg$b */
    public static final class b implements RewardedCallback {
        public b() {
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdClicked(ClickEvent event, ClickError clickError) {
            Intrinsics.checkNotNullParameter(event, "event");
            C3782gg.this.m18143a(event, clickError);
        }

        @Override // com.chartboost.sdk.callbacks.DismissibleAdCallback
        public void onAdDismiss(DismissEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            ((RewardedCallback) C3782gg.this.m18159k()).onAdDismiss(event);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdExpired(ExpirationEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            C3782gg.this.m18144a(event);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdLoaded(CacheEvent event, CacheError cacheError) {
            Intrinsics.checkNotNullParameter(event, "event");
            C3782gg.this.m18142a(event, cacheError);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdRequestedToShow(ShowEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            C3782gg.this.m18146a(event);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdShown(ShowEvent event, ShowError showError) {
            Intrinsics.checkNotNullParameter(event, "event");
            C3782gg.this.m18147a(event, showError);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onImpressionRecorded(ImpressionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            C3782gg.this.m18145a(event);
        }

        @Override // com.chartboost.sdk.callbacks.RewardedCallback
        public void onRewardEarned(RewardEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            ((RewardedCallback) C3782gg.this.m18159k()).onRewardEarned(event);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3782gg(C3759fg api, RewardedCallback callback, Rewarded rewarded, InterfaceC3703d6 dependencyContainer) {
        super(rewarded, api, callback, dependencyContainer, new C3834j(EnumC4036s.REWARDED, null, 2, null));
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(rewarded, "rewarded");
        Intrinsics.checkNotNullParameter(dependencyContainer, "dependencyContainer");
        this.f14329o = new b();
        this.f14330p = m18141a((DismissibleAdCallback) m18159k(), new a());
    }

    @Override // com.chartboost.sdk.impl.AbstractC3837j2
    /* JADX INFO: renamed from: a */
    public void mo17605a(String str) {
        ((C3759fg) m18157h()).m17730a((Rewarded) m18155e(), mo17609i(), str);
    }

    @Override // com.chartboost.sdk.impl.AbstractC3837j2
    /* JADX INFO: renamed from: b */
    public Object mo17606b(Context context, Continuation continuation) {
        ((C3759fg) m18157h()).m17731b((Rewarded) m18155e(), mo17609i());
        Result.Companion companion = Result.INSTANCE;
        return Result.m44946constructorimpl(null);
    }

    @Override // com.chartboost.sdk.impl.AbstractC3837j2
    /* JADX INFO: renamed from: f */
    public InterfaceC3880l mo17608f() {
        return this.f14330p;
    }

    @Override // com.chartboost.sdk.impl.AbstractC3837j2
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public RewardedCallback mo17609i() {
        return this.f14329o;
    }
}
