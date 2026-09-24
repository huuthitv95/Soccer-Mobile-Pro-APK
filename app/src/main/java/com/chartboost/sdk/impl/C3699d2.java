package com.chartboost.sdk.impl;

import android.os.Build;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.chartboost.sdk.ads.Banner;
import com.chartboost.sdk.ads.InterfaceC3614Ad;
import com.chartboost.sdk.callbacks.AdCallback;
import com.chartboost.sdk.callbacks.BannerCallback;
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

/* JADX INFO: renamed from: com.chartboost.sdk.impl.d2 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3699d2 extends AbstractC3696d {

    /* JADX INFO: renamed from: l */
    public final C3720e0 f13782l;

    /* JADX INFO: renamed from: m */
    public final C3904m0 f13783m;

    /* JADX INFO: renamed from: n */
    public final InterfaceC3945ni f13784n;

    /* JADX INFO: renamed from: o */
    public final AtomicReference f13785o;

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.d2$a */
    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public static final a f13786b = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(Build.VERSION.SDK_INT);
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.d2$b */
    public static final class b extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BannerCallback f13787b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Banner f13788c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(BannerCallback bannerCallback, Banner banner) {
            super(0);
            this.f13787b = bannerCallback;
            this.f13788c = banner;
        }

        /* JADX INFO: renamed from: a */
        public final void m17251a() {
            this.f13787b.onAdLoaded(new CacheEvent(null, this.f13788c), new CacheError(CacheError.Code.SESSION_NOT_STARTED, null, 2, null));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m17251a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.d2$c */
    public static final class c extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BannerCallback f13789b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Banner f13790c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(BannerCallback bannerCallback, Banner banner) {
            super(0);
            this.f13789b = bannerCallback;
            this.f13790c = banner;
        }

        /* JADX INFO: renamed from: a */
        public final void m17252a() {
            this.f13789b.onAdLoaded(new CacheEvent(null, this.f13790c), new CacheError(CacheError.Code.BANNER_DISABLED, null, 2, null));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m17252a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.d2$d */
    public static final class d extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BannerCallback f13791b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Banner f13792c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(BannerCallback bannerCallback, Banner banner) {
            super(0);
            this.f13791b = bannerCallback;
            this.f13792c = banner;
        }

        /* JADX INFO: renamed from: a */
        public final void m17253a() {
            this.f13791b.onAdShown(new ShowEvent(null, this.f13792c), new ShowError(ShowError.Code.SESSION_NOT_STARTED, null, 2, null));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m17253a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.d2$e */
    public static final class e extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BannerCallback f13793b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Banner f13794c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(BannerCallback bannerCallback, Banner banner) {
            super(0);
            this.f13793b = bannerCallback;
            this.f13794c = banner;
        }

        /* JADX INFO: renamed from: a */
        public final void m17254a() {
            this.f13793b.onAdShown(new ShowEvent(null, this.f13794c), new ShowError(ShowError.Code.BANNER_DISABLED, null, 2, null));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m17254a();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.d2$f */
    public static final class f extends Lambda implements Function0 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ BannerCallback f13795b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Banner f13796c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(BannerCallback bannerCallback, Banner banner) {
            super(0);
            this.f13795b = bannerCallback;
            this.f13796c = banner;
        }

        /* JADX INFO: renamed from: a */
        public final void m17255a() {
            this.f13795b.onAdShown(new ShowEvent(null, this.f13796c), new ShowError(ShowError.Code.NO_CACHED_AD, null, 2, null));
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m17255a();
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3699d2(C3720e0 adUnitLoader, C3904m0 adUnitRenderer, InterfaceC3945ni uiPoster, AtomicReference sdkConfig, ScheduledExecutorService backgroundExecutor, C3719e adApiCallbackSender, C4031rg session, C3768g2 base64Wrapper, InterfaceC3911m7 eventTracker, Function0 androidVersion) {
        super(adUnitLoader, adUnitRenderer, sdkConfig, backgroundExecutor, adApiCallbackSender, session, base64Wrapper, eventTracker, androidVersion);
        Intrinsics.checkNotNullParameter(adUnitLoader, "adUnitLoader");
        Intrinsics.checkNotNullParameter(adUnitRenderer, "adUnitRenderer");
        Intrinsics.checkNotNullParameter(uiPoster, "uiPoster");
        Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
        Intrinsics.checkNotNullParameter(backgroundExecutor, "backgroundExecutor");
        Intrinsics.checkNotNullParameter(adApiCallbackSender, "adApiCallbackSender");
        Intrinsics.checkNotNullParameter(session, "session");
        Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(androidVersion, "androidVersion");
        this.f13782l = adUnitLoader;
        this.f13783m = adUnitRenderer;
        this.f13784n = uiPoster;
        this.f13785o = sdkConfig;
    }

    public /* synthetic */ C3699d2(C3720e0 c3720e0, C3904m0 c3904m0, InterfaceC3945ni interfaceC3945ni, AtomicReference atomicReference, ScheduledExecutorService scheduledExecutorService, C3719e c3719e, C4031rg c4031rg, C3768g2 c3768g2, InterfaceC3911m7 interfaceC3911m7, Function0 function0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c3720e0, c3904m0, interfaceC3945ni, atomicReference, scheduledExecutorService, c3719e, c4031rg, c3768g2, interfaceC3911m7, (i & 512) != 0 ? a.f13786b : function0);
    }

    /* JADX INFO: renamed from: a */
    public final float m17243a(int i, DisplayMetrics displayMetrics) {
        return TypedValue.applyDimension(1, i, displayMetrics);
    }

    /* JADX INFO: renamed from: a */
    public final void m17244a(Banner banner) {
        Intrinsics.checkNotNullParameter(banner, "banner");
        if (banner.getLayoutParams() == null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 1;
            banner.setLayoutParams(layoutParams);
        }
        DisplayMetrics displayMetrics = banner.getResources().getDisplayMetrics();
        ViewGroup.LayoutParams layoutParams2 = banner.getLayoutParams();
        int bannerWidth = banner.getBannerWidth();
        Intrinsics.checkNotNull(displayMetrics);
        layoutParams2.width = (int) m17243a(bannerWidth, displayMetrics);
        banner.getLayoutParams().height = (int) m17243a(banner.getBannerHeight(), displayMetrics);
    }

    /* JADX INFO: renamed from: a */
    public final void m17245a(Banner ad, BannerCallback callback) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(callback, "callback");
        m17246a(ad, callback, (String) null);
    }

    /* JADX INFO: renamed from: a */
    public final void m17246a(Banner ad, BannerCallback callback, String str) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (m17240g(ad.getLocation())) {
            this.f13784n.mo18805a(new b(callback, ad));
            m17222a(InterfaceC3807hi.a.FINISH_FAILURE, "Invalid configuration. Check logs for more details.", AbstractC3628a0.a.f13428g, ad.getLocation());
        } else if (m17249e()) {
            m17227a(ad.getLocation(), ad, callback, str);
        } else {
            this.f13784n.mo18805a(new c(callback, ad));
        }
    }

    @Override // com.chartboost.sdk.impl.AbstractC3696d, com.chartboost.sdk.impl.InterfaceC3949o0
    /* JADX INFO: renamed from: a */
    public void mo17225a(String str) {
    }

    /* JADX INFO: renamed from: b */
    public final void m17247b(Banner ad, BannerCallback callback) {
        Intrinsics.checkNotNullParameter(ad, "ad");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (m17240g(ad.getLocation())) {
            this.f13784n.mo18805a(new d(callback, ad));
            m17222a(InterfaceC3807hi.i.FINISH_FAILURE, "Invalid configuration. Check logs for more details.", AbstractC3628a0.a.f13428g, ad.getLocation());
        } else if (!m17249e()) {
            this.f13784n.mo18805a(new e(callback, ad));
        } else if (m17234b()) {
            m17221a((InterfaceC3614Ad) ad, (AdCallback) callback);
        } else {
            this.f13784n.mo18805a(new f(callback, ad));
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m17248d() {
        this.f13783m.m18580E();
        this.f13782l.m17439b();
    }

    /* JADX INFO: renamed from: e */
    public final boolean m17249e() {
        C3920mg.a aVarM18662a;
        C3920mg c3920mg = (C3920mg) this.f13785o.get();
        if (c3920mg == null || (aVarM18662a = c3920mg.m18662a()) == null) {
            return true;
        }
        return aVarM18662a.m18676a();
    }
}
