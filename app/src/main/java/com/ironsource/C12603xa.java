package com.ironsource;

import android.app.Activity;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.mediation.C12514R;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.mediation.LevelPlayAdInfo;
import com.unity3d.mediation.LevelPlayAdSize;
import com.unity3d.mediation.banner.LevelPlayBannerAdView;
import com.unity3d.mediation.banner.LevelPlayBannerAdViewListener;
import java.util.UUID;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.xa */
/* JADX INFO: loaded from: classes6.dex */
public final class C12603xa implements InterfaceC12631z2 {

    /* JADX INFO: renamed from: n */
    public static final a f33167n = new a(null);

    /* JADX INFO: renamed from: a */
    private final UUID f33168a;

    /* JADX INFO: renamed from: b */
    private final String f33169b;

    /* JADX INFO: renamed from: c */
    private final C11726W2 f33170c;

    /* JADX INFO: renamed from: d */
    private final LevelPlayBannerAdView.Config f33171d;

    /* JADX INFO: renamed from: e */
    private final C12414p0 f33172e;

    /* JADX INFO: renamed from: f */
    private final InterfaceC11614P8 f33173f;

    /* JADX INFO: renamed from: g */
    private final LevelPlayAdSize f33174g;

    /* JADX INFO: renamed from: h */
    private LevelPlayBannerAdViewListener f33175h;

    /* JADX INFO: renamed from: i */
    private final String f33176i;

    /* JADX INFO: renamed from: j */
    private C12549ua f33177j;

    /* JADX INFO: renamed from: k */
    private Boolean f33178k;

    /* JADX INFO: renamed from: l */
    private C12135cd f33179l;

    /* JADX INFO: renamed from: m */
    private boolean f33180m;

    /* JADX INFO: renamed from: com.ironsource.xa$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final Pair<String, LevelPlayBannerAdView.Config> m34176a(Context context, AttributeSet attributeSet) {
            Intrinsics.checkNotNullParameter(context, "context");
            String str = "";
            if (attributeSet == null) {
                return TuplesKt.m43482to("", LevelPlayBannerAdView.Config.Companion.empty());
            }
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C12514R.styleable.LevelPlayBannerAdView);
            Intrinsics.checkNotNullExpressionValue(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…le.LevelPlayBannerAdView)");
            try {
                LevelPlayBannerAdView.Config.Builder builder = new LevelPlayBannerAdView.Config.Builder();
                if (typedArrayObtainStyledAttributes.hasValue(C12514R.styleable.LevelPlayBannerAdView_bidFloor)) {
                    builder.setBidFloor(typedArrayObtainStyledAttributes.getFloat(C12514R.styleable.LevelPlayBannerAdView_bidFloor, -1.0f));
                }
                String string = typedArrayObtainStyledAttributes.getString(C12514R.styleable.LevelPlayBannerAdView_adSize);
                if (string != null) {
                    builder.setAdSize(LevelPlayAdSize.Companion.createAdSize$mediationsdk_release(string));
                }
                String string2 = typedArrayObtainStyledAttributes.getString(C12514R.styleable.LevelPlayBannerAdView_adUnitId);
                if (string2 != null) {
                    str = string2;
                }
                return TuplesKt.m43482to(str, builder.build());
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }

        private a() {
        }
    }

    public C12603xa(UUID adId, String adUnitId, C11726W2 bannerContainer, LevelPlayBannerAdView.Config config, C12414p0 adTools) {
        Intrinsics.checkNotNullParameter(adId, "adId");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(bannerContainer, "bannerContainer");
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        this.f33168a = adId;
        this.f33169b = adUnitId;
        this.f33170c = bannerContainer;
        this.f33171d = config;
        this.f33172e = adTools;
        this.f33173f = C11455Gb.f24351s.m25905d().mo25838A();
        LevelPlayAdSize adSize = config.getAdSize();
        this.f33174g = adSize == null ? LevelPlayAdSize.BANNER : adSize;
        String placementName = config.getPlacementName();
        this.f33176i = placementName == null ? "" : placementName;
        adTools.m33047e().m34212a(new C12377n(IronSource.EnumC12328a.BANNER, adId, adUnitId));
        Double bidFloor = config.getBidFloor();
        if (bidFloor != null) {
            adTools.m33047e().m34218f().m26769a(bidFloor.doubleValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m34143a(final C12603xa this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (!this$0.f33180m) {
            IronLog.INTERNAL.warning(C12414p0.m33033a(this$0.f33172e, "Banner not loaded", (String) null, 2, (Object) null));
            return;
        }
        if (this$0.f33177j == null) {
            IronLog.INTERNAL.warning(C12414p0.m33033a(this$0.f33172e, "Banner already destroyed", (String) null, 2, (Object) null));
            return;
        }
        C12461rb.m33222a(this$0.f33172e, new Runnable() { // from class: com.ironsource.xa$$ExternalSyntheticLambda9
            @Override // java.lang.Runnable
            public final void run() {
                C12603xa.m34150b(this.f$0);
            }
        }, 0L, 2, (Object) null);
        C12549ua c12549ua = this$0.f33177j;
        if (c12549ua != null) {
            c12549ua.m33902c();
        }
        this$0.f33177j = null;
        this$0.f33178k = null;
        this$0.f33175h = null;
    }

    /* JADX INFO: renamed from: h */
    private final boolean m34157h() {
        if (this.f33169b.length() == 0) {
            String string = this.f33168a.toString();
            Intrinsics.checkNotNullExpressionValue(string, "adId.toString()");
            mo34158a(new LevelPlayAdError(string, this.f33169b, LevelPlayAdError.ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED, "Ad unit ID should be specified"));
            return false;
        }
        if (!this.f33172e.m33049g()) {
            String string2 = this.f33168a.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "adId.toString()");
            mo34158a(new LevelPlayAdError(string2, this.f33169b, LevelPlayAdError.ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK, "load must be called after init success callback"));
            return false;
        }
        C11666Sa c11666SaMo25856a = C11455Gb.f24351s.m25905d().mo25844f().mo25856a();
        if (c11666SaMo25856a != null && c11666SaMo25856a.m27464a(this.f33169b, LevelPlay.AdFormat.BANNER)) {
            return true;
        }
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this.f33175h;
        if (levelPlayBannerAdViewListener != null) {
            String string3 = this.f33168a.toString();
            Intrinsics.checkNotNullExpressionValue(string3, "adId.toString()");
            levelPlayBannerAdViewListener.onAdLoadFailed(new LevelPlayAdError(string3, this.f33169b, LevelPlayAdError.ERROR_CODE_INVALID_AD_UNIT_ID, "Invalid ad unit id"));
        }
        return false;
    }

    /* JADX INFO: renamed from: b */
    public final void m34163b() {
        IronLog.API.info("LevelPlayBannerAdView.destroyBanner()");
        this.f33172e.m33245d(new Runnable() { // from class: com.ironsource.xa$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C12603xa.m34143a(this.f$0);
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public final UUID m34165c() {
        return this.f33168a;
    }

    /* JADX INFO: renamed from: d */
    public final LevelPlayAdSize m34167d() {
        return this.f33174g;
    }

    /* JADX INFO: renamed from: e */
    public final String m34169e() {
        return this.f33169b;
    }

    /* JADX INFO: renamed from: f */
    public final LevelPlayBannerAdViewListener m34171f() {
        return this.f33175h;
    }

    /* JADX INFO: renamed from: g */
    public final String m34172g() {
        return this.f33176i;
    }

    /* JADX INFO: renamed from: i */
    public final void m34173i() {
        IronLog.API.info("LevelPlayBannerAdView.loadAd()");
        this.f33172e.m33245d(new Runnable() { // from class: com.ironsource.xa$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                C12603xa.m34153c(this.f$0);
            }
        });
    }

    /* JADX INFO: renamed from: j */
    public final void m34174j() {
        Unit unit;
        IronLog.API.info("LevelPlayBannerAdView.pauseAutoRefresh()");
        final C12549ua c12549ua = this.f33177j;
        if (c12549ua != null) {
            this.f33172e.m33245d(new Runnable() { // from class: com.ironsource.xa$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    C12603xa.m34144a(this.f$0, c12549ua);
                }
            });
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.f33178k = Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m34175k() {
        Unit unit;
        IronLog.API.info("LevelPlayBannerAdView.resumeAutoRefresh()");
        final C12549ua c12549ua = this.f33177j;
        if (c12549ua != null) {
            this.f33172e.m33245d(new Runnable() { // from class: com.ironsource.xa$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    C12603xa.m34151b(this.f$0, c12549ua);
                }
            });
            unit = Unit.INSTANCE;
        } else {
            unit = null;
        }
        if (unit == null) {
            this.f33178k = Boolean.TRUE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final void m34153c(C12603xa this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.f33180m) {
            IronLog.INTERNAL.warning(C12414p0.m33033a(this$0.f33172e, "Banner load already called", (String) null, 2, (Object) null));
            return;
        }
        this$0.f33180m = true;
        if (this$0.m34157h()) {
            C12549ua c12549uaM34142a = this$0.m34142a();
            this$0.f33177j = c12549uaM34142a;
            Boolean bool = this$0.f33178k;
            if (bool != null) {
                if (bool.booleanValue()) {
                    c12549uaM34142a.m33905f();
                } else {
                    c12549uaM34142a.m33903d();
                }
            }
            c12549uaM34142a.m33900b();
        }
    }

    @Override // com.ironsource.InterfaceC12631z2
    /* JADX INFO: renamed from: d */
    public void mo34168d(final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f33172e.m33246e(new Runnable() { // from class: com.ironsource.xa$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C12603xa.m34147a(adInfo, this);
            }
        });
    }

    @Override // com.ironsource.InterfaceC12631z2
    /* JADX INFO: renamed from: e */
    public void mo34170e(final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f33172e.m33246e(new Runnable() { // from class: com.ironsource.xa$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                C12603xa.m34154c(adInfo, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final void m34150b(C12603xa this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f33170c.removeAllViews();
        ViewParent parent = this$0.f33170c.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this$0.f33170c);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final void m34155d(LevelPlayAdInfo adInfo, C12603xa this$0) {
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdScreenDismissed() adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.f33175h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdCollapsed(adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final void m34156e(LevelPlayAdInfo adInfo, C12603xa this$0) {
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdScreenPresented() adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.f33175h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdExpanded(adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final void m34151b(C12603xa this$0, C12549ua it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "$it");
        this$0.f33172e.m33047e().m34218f().m26774c();
        it.m33905f();
    }

    @Override // com.ironsource.InterfaceC12631z2
    /* JADX INFO: renamed from: b */
    public void mo34164b(final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f33172e.m33246e(new Runnable() { // from class: com.ironsource.xa$$ExternalSyntheticLambda8
            @Override // java.lang.Runnable
            public final void run() {
                C12603xa.m34152b(adInfo, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final void m34152b(LevelPlayAdInfo adInfo, C12603xa this$0) {
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdDisplayed() adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.f33175h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdDisplayed(adInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final void m34154c(LevelPlayAdInfo adInfo, C12603xa this$0) {
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdLeftApplication() adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.f33175h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdLeftApplication(adInfo);
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m34162a(final LevelPlayBannerAdViewListener levelPlayBannerAdViewListener) {
        IronLog.API.info("LevelPlayBannerAdView.setBannerListener()");
        this.f33172e.m33245d(new Runnable() { // from class: com.ironsource.xa$$ExternalSyntheticLambda11
            @Override // java.lang.Runnable
            public final void run() {
                C12603xa.m34145a(this.f$0, levelPlayBannerAdViewListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m34145a(C12603xa this$0, LevelPlayBannerAdViewListener levelPlayBannerAdViewListener) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f33175h = levelPlayBannerAdViewListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m34144a(C12603xa this$0, C12549ua it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "$it");
        this$0.f33172e.m33047e().m34218f().m26773b();
        it.m33903d();
    }

    @Override // com.ironsource.InterfaceC12631z2
    /* JADX INFO: renamed from: c */
    public void mo34166c(final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f33172e.m33246e(new Runnable() { // from class: com.ironsource.xa$$ExternalSyntheticLambda12
            @Override // java.lang.Runnable
            public final void run() {
                C12603xa.m34155d(adInfo, this);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    private final C12549ua m34142a() {
        C12135cd c12135cd;
        this.f33179l = this.f33172e.m33035a(this.f33176i);
        Context context = this.f33170c.getContext();
        if (context instanceof Activity) {
            ContextProvider.getInstance().updateActivity((Activity) context);
        }
        UUID uuid = this.f33168a;
        String str = this.f33169b;
        C12135cd c12135cd2 = this.f33179l;
        C12135cd c12135cd3 = null;
        if (c12135cd2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bannerPlacement");
            c12135cd = null;
        } else {
            c12135cd = c12135cd2;
        }
        C11500J2 c11500j2 = new C11500J2(uuid, str, c12135cd, this.f33174g, null, null, this.f33173f.mo25736a(), this.f33171d.getBidFloor(), 48, null);
        this.f33172e.m33047e().m34212a(new C11390D0(this.f33172e, c11500j2, null, 4, null));
        ISBannerSize iSBannerSizeM33036a = this.f33172e.m33036a(c11500j2.m26169i());
        C12616y5 c12616y5M33047e = this.f33172e.m33047e();
        C12414p0 c12414p0 = this.f33172e;
        C12135cd c12135cd4 = this.f33179l;
        if (c12135cd4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("bannerPlacement");
        } else {
            c12135cd3 = c12135cd4;
        }
        c12616y5M33047e.m34212a(new C11760Y2(c12414p0, iSBannerSizeM33036a, c12135cd3.m32814c()));
        return new C12549ua(this, this.f33172e, c11500j2, this.f33170c);
    }

    public /* synthetic */ C12603xa(UUID uuid, String str, C11726W2 c11726w2, LevelPlayBannerAdView.Config config, C12414p0 c12414p0, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C12546u7.f32555a.m33891a() : uuid, str, c11726w2, config, (i & 16) != 0 ? new C12414p0(IronSource.EnumC12328a.BANNER, C11426F0.b.MEDIATION) : c12414p0);
    }

    @Override // com.ironsource.InterfaceC12631z2
    /* JADX INFO: renamed from: a */
    public void mo34161a(final LevelPlayAdInfo adInfo, final boolean z) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f33172e.m33246e(new Runnable() { // from class: com.ironsource.xa$$ExternalSyntheticLambda10
            @Override // java.lang.Runnable
            public final void run() {
                C12603xa.m34149a(z, adInfo, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m34149a(boolean z, LevelPlayAdInfo adInfo, C12603xa this$0) {
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdLoaded() isReload: " + z + " adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.f33175h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdLoaded(adInfo);
        }
    }

    @Override // com.ironsource.InterfaceC12631z2
    /* JADX INFO: renamed from: a */
    public void mo34158a(final LevelPlayAdError levelPlayAdError) {
        if (levelPlayAdError != null) {
            this.f33172e.m33246e(new Runnable() { // from class: com.ironsource.xa$$ExternalSyntheticLambda6
                @Override // java.lang.Runnable
                public final void run() {
                    C12603xa.m34146a(levelPlayAdError, this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m34146a(LevelPlayAdError it, C12603xa this$0) {
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdLoadFailed() error: " + it);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.f33175h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdLoadFailed(it);
        }
    }

    @Override // com.ironsource.InterfaceC12631z2
    /* JADX INFO: renamed from: a */
    public void mo34160a(final LevelPlayAdInfo adInfo, final LevelPlayAdError levelPlayAdError) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        if (levelPlayAdError != null) {
            this.f33172e.m33246e(new Runnable() { // from class: com.ironsource.xa$$ExternalSyntheticLambda13
                @Override // java.lang.Runnable
                public final void run() {
                    C12603xa.m34148a(adInfo, levelPlayAdError, this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m34148a(LevelPlayAdInfo adInfo, LevelPlayAdError it, C12603xa this$0) {
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Intrinsics.checkNotNullParameter(it, "$it");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdDisplayFailed() adInfo " + adInfo + " error: " + it);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.f33175h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdDisplayFailed(adInfo, it);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m34147a(LevelPlayAdInfo adInfo, C12603xa this$0) {
        Intrinsics.checkNotNullParameter(adInfo, "$adInfo");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("LevelPlayBannerAdViewListener.onBannerAdClicked() adInfo: " + adInfo);
        LevelPlayBannerAdViewListener levelPlayBannerAdViewListener = this$0.f33175h;
        if (levelPlayBannerAdViewListener != null) {
            levelPlayBannerAdViewListener.onAdClicked(adInfo);
        }
    }

    @Override // com.ironsource.InterfaceC12631z2
    /* JADX INFO: renamed from: a */
    public void mo34159a(final LevelPlayAdInfo adInfo) {
        Intrinsics.checkNotNullParameter(adInfo, "adInfo");
        this.f33172e.m33246e(new Runnable() { // from class: com.ironsource.xa$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                C12603xa.m34156e(adInfo, this);
            }
        });
    }
}
