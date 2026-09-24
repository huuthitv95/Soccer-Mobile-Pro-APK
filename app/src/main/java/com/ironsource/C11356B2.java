package com.ironsource;

import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C12366o;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface;
import com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.LevelPlayAdInfo;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.B2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11356B2 extends AbstractC11353B implements BannerAdListener {

    /* JADX INFO: renamed from: x */
    private WeakReference<InterfaceC11392D2> f23887x;

    /* JADX INFO: renamed from: y */
    private View f23888y;

    /* JADX INFO: renamed from: z */
    private FrameLayout.LayoutParams f23889z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11356B2(C11707V0 adTools, C11371C instanceData, C11479I adInstancePayload, InterfaceC11392D2 listener) {
        super(adTools, instanceData, adInstancePayload, listener);
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        Intrinsics.checkNotNullParameter(adInstancePayload, "adInstancePayload");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f23887x = new WeakReference<>(listener);
    }

    /* JADX INFO: renamed from: I */
    private final ISBannerSize m25381I() {
        C11707V0 c11707v0M25346f = m25346f();
        AbstractC12593x0 abstractC12593x0M25527i = m25354n().m25527i();
        Intrinsics.checkNotNull(abstractC12593x0M25527i, "null cannot be cast to non-null type com.unity3d.mediation.internal.ads.controllers.adunits.data.BannerAdUnitData");
        return c11707v0M25346f.m33036a(((C11554M2) abstractC12593x0M25527i).mo26467b().m26169i());
    }

    /* JADX INFO: renamed from: J */
    private final void m25382J() {
        C12135cd c12135cdM25350j = m25350j();
        if (c12135cdM25350j != null) {
            m25346f().m33047e().m34211a().m26700f(c12135cdM25350j.m32814c());
        }
        InterfaceC11392D2 interfaceC11392D2 = this.f23887x.get();
        if (interfaceC11392D2 != null) {
            interfaceC11392D2.mo25595a(this);
        }
    }

    /* JADX INFO: renamed from: K */
    private final void m25383K() {
        C12135cd c12135cdM25350j = m25350j();
        if (c12135cdM25350j != null) {
            m25346f().m33047e().m34211a().m26697c(c12135cdM25350j.m32814c());
        }
        InterfaceC11392D2 interfaceC11392D2 = this.f23887x.get();
        if (interfaceC11392D2 != null) {
            interfaceC11392D2.mo25596b(this);
        }
    }

    /* JADX INFO: renamed from: L */
    private final void m25384L() {
        C12135cd c12135cdM25350j = m25350j();
        if (c12135cdM25350j != null) {
            m25346f().m33047e().m34211a().m26702h(c12135cdM25350j.m32814c());
        }
        InterfaceC11392D2 interfaceC11392D2 = this.f23887x.get();
        if (interfaceC11392D2 != null) {
            interfaceC11392D2.mo25597c(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public static final void m25391d(C11356B2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m25384L();
    }

    @Override // com.ironsource.AbstractC11353B
    /* JADX INFO: renamed from: A */
    protected void mo25334A() {
        if (!(m25347g() instanceof AdapterBannerInterface)) {
            IronLog.INTERNAL.error(m25335a("adapter not instance of AdapterBannerInterface"));
            return;
        }
        AdData adDataM25349i = m25349i();
        ISBannerSize iSBannerSizeM25381I = m25381I();
        Map<String, Object> adUnitData = adDataM25349i.getAdUnitData();
        Intrinsics.checkNotNullExpressionValue(adUnitData, "adData.adUnitData");
        adUnitData.put(C11518K2.f24806t, new C12366o(ContextProvider.getInstance().getApplicationContext(), iSBannerSizeM25381I));
        Object objM25347g = m25347g();
        Intrinsics.checkNotNull(objM25347g, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface<com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener>");
        ((AdapterBannerInterface) objM25347g).loadAd(adDataM25349i, ContextProvider.getInstance().getCurrentActiveActivity(), iSBannerSizeM25381I, this);
    }

    @Override // com.ironsource.AbstractC11353B
    /* JADX INFO: renamed from: a */
    public void mo25338a(InterfaceC11515K adInstancePresenter) {
        Intrinsics.checkNotNullParameter(adInstancePresenter, "adInstancePresenter");
        adInstancePresenter.mo25763a(this);
    }

    @Override // com.ironsource.AbstractC11353B
    /* JADX INFO: renamed from: b */
    public void mo25342b() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m25356q());
        C12461rb.m33222a(m25346f(), new Runnable() { // from class: com.ironsource.B2$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                C11356B2.m25385a(this.f$0);
            }
        }, 0L, 2, (Object) null);
        if (m25347g() == null) {
            ironLog.warning("adapter == null");
        } else {
            mo25343c();
            super.mo25342b();
        }
    }

    @Override // com.ironsource.AbstractC11353B
    /* JADX INFO: renamed from: c */
    public void mo25343c() {
        try {
            if (!(m25347g() instanceof AdapterBannerInterface)) {
                IronLog.INTERNAL.error(m25335a("adapter not instance of AdapterBannerInterface"));
                return;
            }
            Object objM25347g = m25347g();
            Intrinsics.checkNotNull(objM25347g, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface<*>");
            ((AdapterBannerInterface) objM25347g).destroyAd(m25349i());
        } catch (Throwable th) {
            C12317m4.m32153d().m32155a(th);
            String str = "destroyBanner - exception = " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(m25335a(str));
            m25346f().m33047e().m34220h().m27986g(str);
        }
    }

    @Override // com.ironsource.AbstractC11353B
    /* JADX INFO: renamed from: e */
    public LevelPlayAdInfo mo25345e() {
        String string = m25354n().m25527i().mo26467b().m31569b().toString();
        Intrinsics.checkNotNullExpressionValue(string, "instanceData.adUnitData.…roperties.adId.toString()");
        String strM31570c = m25354n().m25527i().mo26467b().m31570c();
        String string2 = m25354n().m25526h().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "instanceData.adFormat.toString()");
        C12434q2 c12434q2M25532n = m25354n().m25532n();
        AbstractC12593x0 abstractC12593x0M25527i = m25354n().m25527i();
        Intrinsics.checkNotNull(abstractC12593x0M25527i, "null cannot be cast to non-null type com.unity3d.mediation.internal.ads.controllers.adunits.data.BannerAdUnitData");
        return new LevelPlayAdInfo(string, strM31570c, string2, c12434q2M25532n, ((C11554M2) abstractC12593x0M25527i).mo26467b().m26169i(), m25354n().m25527i().m34082l(), MapsKt.toMap(m25352l()));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLeftApplication() {
        m25340a(new Runnable() { // from class: com.ironsource.B2$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                C11356B2.m25389b(this.f$0);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public /* synthetic */ void onAdLeftApplication(Map map) {
        onAdLeftApplication();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLoadSuccess(View adView, FrameLayout.LayoutParams frameLayoutParams) {
        Intrinsics.checkNotNullParameter(adView, "adView");
        Intrinsics.checkNotNullParameter(frameLayoutParams, "frameLayoutParams");
        onAdLoadSuccess(adView, frameLayoutParams, new LinkedHashMap());
    }

    @Override // com.ironsource.AbstractC11353B, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened(final Map<String, Object> extraData) {
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        m25340a(new Runnable() { // from class: com.ironsource.B2$$ExternalSyntheticLambda7
            @Override // java.lang.Runnable
            public final void run() {
                C11356B2.m25388a(this.f$0, extraData);
            }
        });
        super.onAdOpened(extraData);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenDismissed() {
        m25340a(new Runnable() { // from class: com.ironsource.B2$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                C11356B2.m25390c(this.f$0);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public /* synthetic */ void onAdScreenDismissed(Map map) {
        onAdScreenDismissed();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenPresented() {
        m25340a(new Runnable() { // from class: com.ironsource.B2$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                C11356B2.m25391d(this.f$0);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public /* synthetic */ void onAdScreenPresented(Map map) {
        onAdScreenPresented();
    }

    /* JADX INFO: renamed from: a */
    public final void m25393a(final InterfaceC12308lg viewBinder) {
        Intrinsics.checkNotNullParameter(viewBinder, "viewBinder");
        C12461rb.m33222a(m25346f(), new Runnable() { // from class: com.ironsource.B2$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                C11356B2.m25387a(this.f$0, viewBinder);
            }
        }, 0L, 2, (Object) null);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLoadSuccess(final View adView, final FrameLayout.LayoutParams frameLayoutParams, Map<String, Object> extraData) {
        Intrinsics.checkNotNullParameter(adView, "adView");
        Intrinsics.checkNotNullParameter(frameLayoutParams, "frameLayoutParams");
        Intrinsics.checkNotNullParameter(extraData, "extraData");
        C12461rb.m33222a(m25346f(), new Runnable() { // from class: com.ironsource.B2$$ExternalSyntheticLambda6
            @Override // java.lang.Runnable
            public final void run() {
                C11356B2.m25386a(this.f$0, adView, frameLayoutParams);
            }
        }, 0L, 2, (Object) null);
        super.onAdLoadSuccess(extraData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m25387a(final C11356B2 this$0, InterfaceC12308lg viewBinder) {
        FrameLayout.LayoutParams layoutParams;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(viewBinder, "$viewBinder");
        View view = this$0.f23888y;
        if (view == null || (layoutParams = this$0.f23889z) == null) {
            return;
        }
        viewBinder.mo27792a(view, layoutParams, this$0.m25346f());
        IronLog.INTERNAL.verbose(C12414p0.m33033a(this$0.m25346f(), "Bind banner view", (String) null, 2, (Object) null));
        this$0.m25346f().m33245d(new Runnable() { // from class: com.ironsource.B2$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                C11356B2.m25392e(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m25385a(C11356B2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.f23888y = null;
        this$0.f23889z = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m25386a(C11356B2 this$0, View adView, FrameLayout.LayoutParams frameLayoutParams) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adView, "$adView");
        Intrinsics.checkNotNullParameter(frameLayoutParams, "$frameLayoutParams");
        this$0.f23888y = adView;
        this$0.f23889z = frameLayoutParams;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public static final void m25392e(C11356B2 this$0) {
        String strM32814c;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        C11587O c11587oM34211a = this$0.m25346f().m33047e().m34211a();
        C12135cd c12135cdM25350j = this$0.m25350j();
        if (c12135cdM25350j == null || (strM32814c = c12135cdM25350j.m32814c()) == null) {
            strM32814c = "";
        }
        c11587oM34211a.m26704j(strM32814c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c */
    public static final void m25390c(C11356B2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m25383K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m25388a(C11356B2 this$0, Map extraData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(extraData, "$extraData");
        this$0.m25352l().putAll(extraData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b */
    public static final void m25389b(C11356B2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m25382J();
    }
}
