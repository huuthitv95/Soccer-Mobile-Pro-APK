package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.ads.Interstitial;
import com.chartboost.sdk.callbacks.DismissibleAdCallback;
import com.chartboost.sdk.callbacks.InterstitialCallback;
import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.CacheEvent;
import com.chartboost.sdk.events.ClickError;
import com.chartboost.sdk.events.ClickEvent;
import com.chartboost.sdk.events.DismissEvent;
import com.chartboost.sdk.events.ExpirationEvent;
import com.chartboost.sdk.events.ImpressionEvent;
import com.chartboost.sdk.events.ShowError;
import com.chartboost.sdk.events.ShowEvent;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.hb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3800hb extends AbstractC3837j2 {

    /* JADX INFO: renamed from: o */
    public final InterstitialCallback f14395o;

    /* JADX INFO: renamed from: p */
    public final InterfaceC3880l f14396p;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.hb$a */
    public static final class a implements InterstitialCallback {
        public a() {
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdClicked(ClickEvent event, ClickError clickError) {
            Intrinsics.checkNotNullParameter(event, "event");
            C3800hb.this.m18143a(event, clickError);
        }

        @Override // com.chartboost.sdk.callbacks.DismissibleAdCallback
        public void onAdDismiss(DismissEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            ((InterstitialCallback) C3800hb.this.m18159k()).onAdDismiss(event);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdExpired(ExpirationEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            C3800hb.this.m18144a(event);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdLoaded(CacheEvent event, CacheError cacheError) {
            Intrinsics.checkNotNullParameter(event, "event");
            C3800hb.this.m18142a(event, cacheError);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdRequestedToShow(ShowEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            C3800hb.this.m18146a(event);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onAdShown(ShowEvent event, ShowError showError) {
            Intrinsics.checkNotNullParameter(event, "event");
            C3800hb.this.m18147a(event, showError);
        }

        @Override // com.chartboost.sdk.callbacks.AdCallback
        public void onImpressionRecorded(ImpressionEvent event) {
            Intrinsics.checkNotNullParameter(event, "event");
            C3800hb.this.m18145a(event);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3800hb(C3777gb api, InterstitialCallback callback, Interstitial interstitial, InterfaceC3703d6 dependencyContainer) {
        super(interstitial, api, callback, dependencyContainer, new C3834j(EnumC4036s.INTERSTITIAL, null, 2, null));
        Intrinsics.checkNotNullParameter(api, "api");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(interstitial, "interstitial");
        Intrinsics.checkNotNullParameter(dependencyContainer, "dependencyContainer");
        this.f14395o = new a();
        this.f14396p = AbstractC3837j2.m18138a(this, (DismissibleAdCallback) m18159k(), (Function0) null, 2, (Object) null);
    }

    @Override // com.chartboost.sdk.impl.AbstractC3837j2
    /* JADX INFO: renamed from: a */
    public void mo17605a(String str) {
        ((C3777gb) m18157h()).m17800a((Interstitial) m18155e(), mo17609i(), str);
    }

    @Override // com.chartboost.sdk.impl.AbstractC3837j2
    /* JADX INFO: renamed from: b */
    public Object mo17606b(Context context, Continuation continuation) {
        ((C3777gb) m18157h()).m17801b((Interstitial) m18155e(), mo17609i());
        Result.Companion companion = Result.INSTANCE;
        return Result.m44946constructorimpl(null);
    }

    @Override // com.chartboost.sdk.impl.AbstractC3837j2
    /* JADX INFO: renamed from: f */
    public InterfaceC3880l mo17608f() {
        return this.f14396p;
    }

    @Override // com.chartboost.sdk.impl.AbstractC3837j2
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public InterstitialCallback mo17609i() {
        return this.f14395o;
    }
}
