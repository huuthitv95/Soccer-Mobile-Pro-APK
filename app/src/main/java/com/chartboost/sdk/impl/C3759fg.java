package com.chartboost.sdk.impl;

import android.os.Build;
import com.chartboost.sdk.ads.InterfaceC3614Ad;
import com.chartboost.sdk.ads.Rewarded;
import com.chartboost.sdk.callbacks.AdCallback;
import com.chartboost.sdk.callbacks.RewardedCallback;
import com.chartboost.sdk.events.CacheError;
import com.chartboost.sdk.events.CacheEvent;
import com.chartboost.sdk.events.ShowError;
import com.chartboost.sdk.events.ShowEvent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.fg */
/* JADX INFO: loaded from: classes3.dex */
public final class C3759fg extends AbstractC3696d {

    /* JADX INFO: renamed from: l */
    public final InterfaceC3945ni f14243l;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.fg$a */
    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public static final a f14244b = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(Build.VERSION.SDK_INT);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.fg$b */
    public static final class b extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ RewardedCallback f14245b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Rewarded f14246c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(RewardedCallback rewardedCallback, Rewarded rewarded) {
            super(0);
            this.f14245b = rewardedCallback;
            this.f14246c = rewarded;
        }

        /* JADX INFO: renamed from: a */
        public final void m17733a() {
            this.f14245b.onAdLoaded(new CacheEvent(null, this.f14246c), new CacheError(CacheError.Code.SESSION_NOT_STARTED, null, 2, null));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m17733a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.fg$c */
    public static final class c extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ RewardedCallback f14247b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Rewarded f14248c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(RewardedCallback rewardedCallback, Rewarded rewarded) {
            super(0);
            this.f14247b = rewardedCallback;
            this.f14248c = rewarded;
        }

        /* JADX INFO: renamed from: a */
        public final void m17734a() {
            this.f14247b.onAdShown(new ShowEvent(null, this.f14248c), new ShowError(ShowError.Code.SESSION_NOT_STARTED, null, 2, null));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m17734a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.fg$d */
    public static final class d extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ RewardedCallback f14249b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Rewarded f14250c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(RewardedCallback rewardedCallback, Rewarded rewarded) {
            super(0);
            this.f14249b = rewardedCallback;
            this.f14250c = rewarded;
        }

        /* JADX INFO: renamed from: a */
        public final void m17735a() {
            this.f14249b.onAdShown(new ShowEvent(null, this.f14250c), new ShowError(ShowError.Code.NO_CACHED_AD, null, 2, null));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m17735a();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3759fg(C3720e0 adUnitLoader, C3904m0 adUnitRenderer, InterfaceC3945ni uiPoster, AtomicReference sdkConfig, ScheduledExecutorService backgroundExecutorService, C3719e adApiCallbackSender, C4031rg session, C3768g2 base64Wrapper, InterfaceC3911m7 eventTracker, Function0 androidVersion) {
        super(adUnitLoader, adUnitRenderer, sdkConfig, backgroundExecutorService, adApiCallbackSender, session, base64Wrapper, eventTracker, androidVersion);
        Intrinsics.checkNotNullParameter(adUnitLoader, "adUnitLoader");
        Intrinsics.checkNotNullParameter(adUnitRenderer, "adUnitRenderer");
        Intrinsics.checkNotNullParameter(uiPoster, "uiPoster");
        Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
        Intrinsics.checkNotNullParameter(backgroundExecutorService, "backgroundExecutorService");
        Intrinsics.checkNotNullParameter(adApiCallbackSender, "adApiCallbackSender");
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(androidVersion, "androidVersion");
        this.f14243l = uiPoster;
    }

    public /* synthetic */ C3759fg(C3720e0 c3720e0, C3904m0 c3904m0, InterfaceC3945ni interfaceC3945ni, AtomicReference atomicReference, ScheduledExecutorService scheduledExecutorService, C3719e c3719e, C4031rg c4031rg, C3768g2 c3768g2, InterfaceC3911m7 interfaceC3911m7, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c3720e0, c3904m0, interfaceC3945ni, atomicReference, scheduledExecutorService, c3719e, c4031rg, c3768g2, interfaceC3911m7, (i & 512) != 0 ? a.f14244b : function0);
    }

    /* JADX INFO: renamed from: a */
    public final void m17729a(Rewarded ad, RewardedCallback callback) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(callback, "callback");
        m17730a(ad, callback, (String) null);
    }

    /* JADX INFO: renamed from: a */
    public final void m17730a(Rewarded ad, RewardedCallback callback, String str) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (!m17240g(ad.getLocation())) {
            m17227a(ad.getLocation(), ad, callback, str);
        } else {
            this.f14243l.mo18805a(new b(callback, ad));
            m17222a(InterfaceC3807hi.a.FINISH_FAILURE, "Invalid configuration. Check logs for more details.", AbstractC3628a0.c.f13430g, ad.getLocation());
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m17731b(Rewarded ad, RewardedCallback callback) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (m17240g(ad.getLocation())) {
            this.f14243l.mo18805a(new c(callback, ad));
            m17222a(InterfaceC3807hi.i.FINISH_FAILURE, "Invalid configuration. Check logs for more details.", AbstractC3628a0.c.f13430g, ad.getLocation());
        } else if (m17234b()) {
            m17221a((InterfaceC3614Ad) ad, (AdCallback) callback);
        } else {
            this.f14243l.mo18805a(new d(callback, ad));
        }
    }
}
