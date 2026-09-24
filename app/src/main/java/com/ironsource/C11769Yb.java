package com.ironsource;

import android.app.Activity;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Arrays;
import java.util.Map;
import kotlin.NotImplementedError;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* JADX INFO: renamed from: com.ironsource.Yb */
/* JADX INFO: loaded from: classes6.dex */
public final class C11769Yb extends AbstractC12259j3<InterfaceC11639R0> implements NativeAdListener, InterfaceC11408E0 {

    /* JADX INFO: renamed from: r */
    private AdapterNativeAdData f26644r;

    /* JADX INFO: renamed from: s */
    private AdapterNativeAdViewBinder f26645s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11769Yb(InterfaceC12326md threadInterface, C12378n0 adSmashData, BaseAdAdapter<?, AdapterAdListener> baseAdAdapter, C12135cd c12135cd, C12434q2 item, InterfaceC11639R0 interfaceC11639R0) {
        super(threadInterface, adSmashData, baseAdAdapter, new C12159e1(adSmashData.m32796g(), adSmashData.m32796g().getNativeAdSettings(), IronSource.EnumC12328a.NATIVE_AD), item, interfaceC11639R0);
        Intrinsics.checkNotNullParameter(threadInterface, "threadInterface");
        Intrinsics.checkNotNullParameter(adSmashData, "adSmashData");
        Intrinsics.checkNotNullParameter(item, "item");
        this.f30615g = c12135cd;
    }

    /* JADX INFO: renamed from: J */
    private final void m28046J() {
        C11756Xf c11756Xf;
        IronLog.INTERNAL.verbose(m31819d());
        if (m31837y()) {
            super.onAdOpened();
            return;
        }
        if (this.f30613e != AbstractC12259j3.h.FAILED) {
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            String str = String.format("unexpected onAdOpened for %s, state - %s", Arrays.copyOf(new Object[]{m31826k(), this.f30613e}, 2));
            Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
            C11426F0 c11426f0 = this.f30612d;
            if (c11426f0 == null || (c11756Xf = c11426f0.f24292j) == null) {
                return;
            }
            c11756Xf.m27996q(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m28048a(C11769Yb this$0, AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder nativeAdViewBinder) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(adapterNativeAdData, "$adapterNativeAdData");
        Intrinsics.checkNotNullParameter(nativeAdViewBinder, "$nativeAdViewBinder");
        this$0.m28049a(adapterNativeAdData, nativeAdViewBinder);
    }

    @Override // com.ironsource.AbstractC12259j3
    /* JADX INFO: renamed from: G */
    protected void mo26248G() {
        C11756Xf c11756Xf;
        if (!(this.f30611c instanceof AdapterNativeAdInterface)) {
            IronLog.INTERNAL.error(m31814a("adapter not instance of AdapterNativeAdInterface"));
            return;
        }
        if (ContextProvider.getInstance().getCurrentActiveActivity() == null) {
            IronLog.INTERNAL.error(m31814a("activity must not be null"));
            C11426F0 c11426f0 = this.f30612d;
            if (c11426f0 == null || (c11756Xf = c11426f0.f24292j) == null) {
                return;
            }
            c11756Xf.m27986g("activity must not be null");
            return;
        }
        Object obj = this.f30611c;
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface<com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener>");
        AdData mCurrentAdData = this.f30619k;
        Intrinsics.checkNotNullExpressionValue(mCurrentAdData, "mCurrentAdData");
        Activity currentActiveActivity = ContextProvider.getInstance().getCurrentActiveActivity();
        Intrinsics.checkNotNullExpressionValue(currentActiveActivity, "getInstance().currentActiveActivity");
        ((AdapterNativeAdInterface) obj).loadAd(mCurrentAdData, currentActiveActivity, this);
    }

    /* JADX INFO: renamed from: P */
    public final void m28050P() {
        C11756Xf c11756Xf;
        C12568vb c12568vb;
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m31826k());
        m31816a(AbstractC12259j3.h.NONE);
        Object obj = this.f30611c;
        if (obj == null) {
            ironLog.warning("mAdapter == null");
            return;
        }
        try {
            if (obj instanceof AdapterNativeAdInterface) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNativeAdInterface<*>");
                AdData mCurrentAdData = this.f30619k;
                Intrinsics.checkNotNullExpressionValue(mCurrentAdData, "mCurrentAdData");
                ((AdapterNativeAdInterface) obj).destroyAd(mCurrentAdData);
            } else {
                ironLog.error(m31814a("adapter not instance of AdapterNativeAdInterface"));
            }
        } catch (Throwable th) {
            C12317m4.m32153d().m32155a(th);
            String str = "destroyNativeAd - exception = " + th.getLocalizedMessage();
            IronLog.INTERNAL.error(m31814a(str));
            C11426F0 c11426f0 = this.f30612d;
            if (c11426f0 != null && (c11756Xf = c11426f0.f24292j) != null) {
                c11756Xf.m27986g(str);
            }
        }
        C11426F0 c11426f1 = this.f30612d;
        if (c11426f1 == null || (c12568vb = c11426f1.f24288f) == null) {
            return;
        }
        Integer sessionDepth = m31832r();
        Intrinsics.checkNotNullExpressionValue(sessionDepth, "sessionDepth");
        c12568vb.m33945a(sessionDepth.intValue());
    }

    /* JADX INFO: renamed from: Q */
    public final AdapterNativeAdData m28051Q() {
        return this.f26644r;
    }

    /* JADX INFO: renamed from: R */
    public final AdapterNativeAdViewBinder m28052R() {
        return this.f26645s;
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.listener.NativeAdListener
    public void onAdLoadSuccess(final AdapterNativeAdData adapterNativeAdData, final AdapterNativeAdViewBinder nativeAdViewBinder) {
        Intrinsics.checkNotNullParameter(adapterNativeAdData, "adapterNativeAdData");
        Intrinsics.checkNotNullParameter(nativeAdViewBinder, "nativeAdViewBinder");
        if (m31834u().mo31718c()) {
            m31834u().mo31711a(new Runnable() { // from class: com.ironsource.Yb$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    C11769Yb.m28048a(this.f$0, adapterNativeAdData, nativeAdViewBinder);
                }
            });
        } else {
            m28049a(adapterNativeAdData, nativeAdViewBinder);
        }
    }

    @Override // com.ironsource.AbstractC12259j3, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        if (m31834u().mo31718c()) {
            m31834u().mo31711a(new Runnable() { // from class: com.ironsource.Yb$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    C11769Yb.m28047a(this.f$0);
                }
            });
        } else {
            m28046J();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdShowFailed(int i, String str) {
        throw new NotImplementedError("An operation is not implemented: Not yet implemented");
    }

    /* JADX INFO: renamed from: a */
    private final void m28049a(AdapterNativeAdData adapterNativeAdData, AdapterNativeAdViewBinder adapterNativeAdViewBinder) {
        this.f26644r = adapterNativeAdData;
        this.f26645s = adapterNativeAdViewBinder;
        super.onAdLoadSuccess();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m28047a(C11769Yb this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m28046J();
    }

    @Override // com.ironsource.AbstractC12259j3, com.ironsource.InterfaceC11408E0
    /* JADX INFO: renamed from: a */
    public Map<String, Object> mo25594a(EnumC11372C0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        Map<String, Object> data = super.mo25594a(event);
        if (this.f30615g != null) {
            Intrinsics.checkNotNullExpressionValue(data, "data");
            data.put("placement", m31825j());
        }
        Intrinsics.checkNotNullExpressionValue(data, "data");
        return data;
    }
}
