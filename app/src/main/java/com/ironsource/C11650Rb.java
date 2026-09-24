package com.ironsource;

import android.content.Context;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.Rb */
/* JADX INFO: loaded from: classes6.dex */
public final class C11650Rb extends AbstractC11353B implements NativeAdListener {

    /* JADX INFO: renamed from: x */
    private AdapterNativeAdData f25578x;

    /* JADX INFO: renamed from: y */
    private AdapterNativeAdViewBinder f25579y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11650Rb(C11707V0 adTools, C11371C instanceData, C11479I adInstancePayload, InterfaceC11425F listener) {
        super(adTools, instanceData, adInstancePayload, listener);
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        Intrinsics.checkNotNullParameter(adInstancePayload, "adInstancePayload");
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.ironsource.AbstractC11353B
    /* JADX INFO: renamed from: A */
    protected void mo25334A() {
        if (!(m25347g() instanceof AdapterNativeAdInterface)) {
            IronLog.INTERNAL.error(m25335a("adapter not instance of AdapterNativeAdInterface"));
            return;
        }
        AdData adDataM25349i = m25349i();
        if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
            IronLog.INTERNAL.error(m25335a("activity must not be null"));
            m25346f().m33047e().m34220h().m27986g("activity must not be null");
            return;
        }
        Object objM25347g = m25347g();
        Intrinsics.checkNotNull(objM25347g, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface<com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener>");
        Context activeContext = ContextProvider.getInstance().getActiveContext();
        Intrinsics.checkNotNullExpressionValue(activeContext, "getInstance().activeContext");
        ((AdapterNativeAdInterface) objM25347g).loadAd(adDataM25349i, activeContext, this);
    }

    /* JADX INFO: renamed from: I */
    public final AdapterNativeAdData m27373I() {
        return this.f25578x;
    }

    /* JADX INFO: renamed from: J */
    public final AdapterNativeAdViewBinder m27374J() {
        return this.f25579y;
    }

    @Override // com.ironsource.AbstractC11353B
    /* JADX INFO: renamed from: a */
    public void mo25338a(InterfaceC11515K adInstancePresenter) {
        Intrinsics.checkNotNullParameter(adInstancePresenter, "adInstancePresenter");
        adInstancePresenter.mo25764a(this);
    }

    @Override // com.ironsource.AbstractC11353B
    /* JADX INFO: renamed from: b */
    public void mo25342b() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m25356q());
        if (m25347g() == null) {
            ironLog.warning("adapter == null");
            return;
        }
        try {
            if (m25347g() instanceof AdapterNativeAdInterface) {
                Object objM25347g = m25347g();
                Intrinsics.checkNotNull(objM25347g, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface<*>");
                ((AdapterNativeAdInterface) objM25347g).destroyAd(m25349i());
            } else {
                ironLog.error(m25335a("adapter not instance of AdapterNativeAdInterface"));
            }
        } catch (Throwable th) {
            C12317m4.m32153d().m32155a(th);
            String str = "destroyNativeAd - exception = " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(m25335a(str));
            m25346f().m33047e().m34220h().m27986g(str);
        }
        super.mo25342b();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener
    public void onAdLoadSuccess(AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder nativeAdViewBinder) {
        Intrinsics.checkNotNullParameter(adapterNativeAdData, "adapterNativeAdData");
        Intrinsics.checkNotNullParameter(nativeAdViewBinder, "nativeAdViewBinder");
        this.f25578x = adapterNativeAdData;
        this.f25579y = nativeAdViewBinder;
        super.onAdLoadSuccess();
    }

    /* JADX INFO: renamed from: a */
    public final void m27375a(C11527Kb nativeAdBinder) {
        Intrinsics.checkNotNullParameter(nativeAdBinder, "nativeAdBinder");
        nativeAdBinder.m26284a(this.f25578x);
        nativeAdBinder.m26285a(this.f25579y);
    }
}
