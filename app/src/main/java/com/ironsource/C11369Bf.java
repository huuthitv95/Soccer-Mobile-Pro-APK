package com.ironsource;

import android.webkit.JavascriptInterface;
import com.unity3d.mediation.LevelPlay;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.Bf */
/* JADX INFO: loaded from: classes6.dex */
public final class C11369Bf {

    /* JADX INFO: renamed from: a */
    private final C12572vf f23992a;

    /* JADX INFO: renamed from: b */
    private final InterfaceC11387Cf f23993b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC11631Q8 f23994c;

    public C11369Bf(C12572vf adsManager, InterfaceC11631Q8 uiLifeCycleListener, InterfaceC11387Cf javaScriptEvaluator) {
        Intrinsics.checkNotNullParameter(adsManager, "adsManager");
        Intrinsics.checkNotNullParameter(uiLifeCycleListener, "uiLifeCycleListener");
        Intrinsics.checkNotNullParameter(javaScriptEvaluator, "javaScriptEvaluator");
        this.f23992a = adsManager;
        this.f23993b = javaScriptEvaluator;
        this.f23994c = uiLifeCycleListener;
    }

    /* JADX INFO: renamed from: a */
    private final void m25511a(String str, LevelPlay.AdFormat adFormat, List<? extends Object> list) {
        this.f23993b.mo25585a(str, adFormat, list);
    }

    @JavascriptInterface
    public final void addBannerAdToScreen(double d) {
        this.f23992a.m33973a(d);
    }

    @JavascriptInterface
    public final void closeTestSuite() {
        destroyBannerAd();
        this.f23994c.onClosed();
    }

    @JavascriptInterface
    public final void destroyBannerAd() {
        this.f23992a.m33972a();
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @JavascriptInterface
    public final void isInterstitialReady() {
        m25511a("isInterstitialReady", LevelPlay.AdFormat.INTERSTITIAL, C11549Lf.f25085a.m26441a(Boolean.valueOf(this.f23992a.m33977c())));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @JavascriptInterface
    public final void isRewardedVideoReady() {
        m25511a("isRewardedVideoReady", LevelPlay.AdFormat.REWARDED, C11549Lf.f25085a.m26441a(Boolean.valueOf(this.f23992a.m33978d())));
    }

    @JavascriptInterface
    public final void loadBannerAd(String adNetwork, boolean z, boolean z2, String description, int i, int i2) {
        Intrinsics.checkNotNullParameter(adNetwork, "adNetwork");
        Intrinsics.checkNotNullParameter(description, "description");
        loadBannerAd(null, adNetwork, z, z2, description, i, i2);
    }

    @JavascriptInterface
    public final void loadInterstitialAd(String adNetwork, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(adNetwork, "adNetwork");
        loadInterstitialAd(null, adNetwork, z, z2);
    }

    @JavascriptInterface
    public final void loadRewardedVideoAd(String adNetwork, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(adNetwork, "adNetwork");
        loadRewardedVideoAd(null, adNetwork, z, z2);
    }

    @JavascriptInterface
    public final void onDataLoaded() {
        this.f23994c.onUIReady();
    }

    @JavascriptInterface
    public final void showInterstitialAd() {
        this.f23992a.m33979e();
    }

    @JavascriptInterface
    public final void showRewardedVideoAd() {
        this.f23992a.m33980f();
    }

    @JavascriptInterface
    public final void loadBannerAd(String str, String adNetwork, boolean z, boolean z2, String description, int i, int i2) {
        Intrinsics.checkNotNullParameter(adNetwork, "adNetwork");
        Intrinsics.checkNotNullParameter(description, "description");
        this.f23992a.m33975a(new C11405Df(adNetwork, z, Boolean.valueOf(z2), str), description, i, i2);
    }

    @JavascriptInterface
    public final void loadInterstitialAd(String str, String adNetwork, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(adNetwork, "adNetwork");
        this.f23992a.m33974a(new C11405Df(adNetwork, z, Boolean.valueOf(z2), str));
    }

    @JavascriptInterface
    public final void loadRewardedVideoAd(String str, String adNetwork, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(adNetwork, "adNetwork");
        this.f23992a.m33976b(new C11405Df(adNetwork, z, Boolean.valueOf(z2), str));
    }
}
