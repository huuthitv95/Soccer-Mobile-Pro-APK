package com.ironsource;

import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.C12357j;
import com.ironsource.mediationsdk.C12366o;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBannerInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBindAdViewInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.BaseAdAdapter;
import com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener;
import com.ironsource.mediationsdk.adunit.adapter.listener.BannerAdListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.K2 */
/* JADX INFO: loaded from: classes6.dex */
public class C11518K2 extends AbstractC12259j3<InterfaceC12521t0> implements BannerAdListener, InterfaceC11408E0 {

    /* JADX INFO: renamed from: t */
    public static final String f24806t = "bannerLayout";

    /* JADX INFO: renamed from: u */
    public static final String f24807u = "bannerSize";

    /* JADX INFO: renamed from: r */
    private final C12366o f24808r;

    /* JADX INFO: renamed from: s */
    private final boolean f24809s;

    /* JADX INFO: renamed from: com.ironsource.K2$a */
    class a extends AbstractRunnableC11754Xd {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ View f24810b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ FrameLayout.LayoutParams f24811c;

        a(View view, FrameLayout.LayoutParams layoutParams) {
            this.f24810b = view;
            this.f24811c = layoutParams;
        }

        @Override // com.ironsource.AbstractRunnableC11754Xd
        /* JADX INFO: renamed from: a */
        public void mo25366a() {
            C11518K2.this.m26247a(this.f24810b, this.f24811c);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.K2$b */
    class b extends AbstractRunnableC11754Xd {
        b() {
        }

        @Override // com.ironsource.AbstractRunnableC11754Xd
        /* JADX INFO: renamed from: a */
        public void mo25366a() {
            C11518K2.this.m26246J();
        }
    }

    public C11518K2(InterfaceC12326md interfaceC12326md, C12378n0 c12378n0, BaseAdAdapter<?, AdapterAdViewListener> baseAdAdapter, C12366o c12366o, C12135cd c12135cd, boolean z, C12434q2 c12434q2, InterfaceC12521t0 interfaceC12521t0) {
        super(interfaceC12326md, c12378n0, baseAdAdapter, new C12159e1(c12378n0.m32796g(), c12378n0.m32796g().getBannerSettings(), IronSource.EnumC12328a.BANNER), c12434q2, interfaceC12521t0);
        this.f24808r = c12366o;
        this.f30615g = c12135cd;
        this.f24809s = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public void m26246J() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m31819d());
        if (m31837y()) {
            super.onAdOpened();
        } else {
            if (this.f30613e == AbstractC12259j3.h.FAILED) {
                return;
            }
            ironLog.error(String.format("unexpected onAdOpened for %s, state - %s", m31826k(), this.f30613e));
            if (this.f30612d != null) {
                this.f30612d.f24292j.m27996q(String.format("unexpected onAdOpened, state - %s", this.f30613e));
            }
        }
    }

    @Override // com.ironsource.AbstractC12259j3
    /* JADX INFO: renamed from: G */
    protected void mo26248G() {
        Object obj = this.f30611c;
        if (obj instanceof AdapterBannerInterface) {
            ((AdapterBannerInterface) obj).loadAd(this.f30619k, ContextProvider.getInstance().getCurrentActiveActivity(), this.f24808r.getSize(), this);
        } else {
            IronLog.INTERNAL.error(m31814a("adapter not instance of AdapterBannerInterface"));
        }
    }

    @Override // com.ironsource.AbstractC12259j3
    /* JADX INFO: renamed from: O */
    protected boolean mo26249O() {
        return false;
    }

    /* JADX INFO: renamed from: P */
    public void m26250P() {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose(m31826k());
        m31816a(AbstractC12259j3.h.NONE);
        Object obj = this.f30611c;
        if (obj == null) {
            ironLog.warning("mAdapter == null");
            return;
        }
        try {
            if (obj instanceof AdapterBannerInterface) {
                ((AdapterBannerInterface) obj).destroyAd(this.f30619k);
            } else {
                ironLog.error(m31814a("adapter not instance of AdapterBannerInterface"));
            }
        } catch (Throwable th) {
            C12317m4.m32153d().m32155a(th);
            String str = "destroyBanner - exception = " + th.getLocalizedMessage() + " state = " + this.f30613e;
            IronLog.INTERNAL.error(m31814a(str));
            C11426F0 c11426f0 = this.f30612d;
            if (c11426f0 != null) {
                c11426f0.f24292j.m27986g(str);
            }
        }
        C11426F0 c11426f1 = this.f30612d;
        if (c11426f1 != null) {
            c11426f1.f24288f.m33945a(m31832r().intValue());
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m26251Q() {
        Object obj = this.f30611c;
        if (obj instanceof AdapterBindAdViewInterface) {
            ((AdapterBindAdViewInterface) obj).onAdViewBound(this.f30619k);
        }
    }

    /* JADX INFO: renamed from: R */
    public void m26252R() {
        Object obj = this.f30611c;
        if (obj instanceof AdapterBindAdViewInterface) {
            ((AdapterBindAdViewInterface) obj).onAdViewWillBind(this.f30619k);
        }
    }

    @Override // com.ironsource.AbstractC12259j3
    /* JADX INFO: renamed from: a */
    protected AdData mo26253a(String str, Map<String, Object> map) {
        return new AdData(str, m31831q(), mo26254a(map));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLeftApplication() {
        C11426F0 c11426f0;
        C12135cd c12135cd = this.f30615g;
        if (c12135cd != null && (c11426f0 = this.f30612d) != null) {
            c11426f0.f24291i.m26700f(c12135cd.m32814c());
        }
        Listener listener = this.f30610b;
        if (listener != 0) {
            ((InterfaceC12521t0) listener).m27551c(this);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public /* synthetic */ void onAdLeftApplication(Map map) {
        onAdLeftApplication();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdLoadSuccess(View view, FrameLayout.LayoutParams layoutParams) {
        if (m31834u().mo31718c()) {
            m31834u().mo31711a(new a(view, layoutParams));
        } else {
            m26247a(view, layoutParams);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public /* synthetic */ void onAdLoadSuccess(View view, FrameLayout.LayoutParams layoutParams, Map map) {
        onAdLoadSuccess(view, layoutParams);
    }

    @Override // com.ironsource.AbstractC12259j3, com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdOpened() {
        if (m31834u().mo31718c()) {
            m31834u().mo31711a(new b());
        } else {
            m26246J();
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenDismissed() {
        C11426F0 c11426f0;
        C12135cd c12135cd = this.f30615g;
        if (c12135cd != null && (c11426f0 = this.f30612d) != null) {
            c11426f0.f24291i.m26697c(c12135cd.m32814c());
        }
        Listener listener = this.f30610b;
        if (listener != 0) {
            ((InterfaceC12521t0) listener).m27550b(this);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public /* synthetic */ void onAdScreenDismissed(Map map) {
        onAdScreenDismissed();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public void onAdScreenPresented() {
        C11426F0 c11426f0;
        C12135cd c12135cd = this.f30615g;
        if (c12135cd != null && (c11426f0 = this.f30612d) != null) {
            c11426f0.f24291i.m26702h(c12135cd.m32814c());
        }
        Listener listener = this.f30610b;
        if (listener != 0) {
            ((InterfaceC12521t0) listener).m27552f(this);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdViewListener
    public /* synthetic */ void onAdScreenPresented(Map map) {
        onAdScreenPresented();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.listener.AdapterAdListener
    public void onAdShowFailed(int i, String str) {
    }

    @Override // com.ironsource.AbstractC12259j3
    /* JADX INFO: renamed from: v */
    protected boolean mo26255v() {
        return this.f24809s;
    }

    @Override // com.ironsource.AbstractC12259j3
    /* JADX INFO: renamed from: a */
    protected Map<String, Object> mo26254a(Map<String, Object> map) {
        Map<String, Object> mapMo26254a = super.mo26254a(map);
        C12378n0 c12378n0 = this.f30609a;
        if (c12378n0 != null && this.f24808r != null && TextUtils.isEmpty(c12378n0.m32796g().getCustomNetwork())) {
            mapMo26254a.put(f24806t, this.f24808r);
        }
        return mapMo26254a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m26247a(View view, FrameLayout.LayoutParams layoutParams) {
        Listener listener;
        super.onAdLoadSuccess();
        if (!m31837y() || (listener = this.f30610b) == 0) {
            return;
        }
        ((InterfaceC12521t0) listener).m33715a(this, view, layoutParams);
    }

    @Override // com.ironsource.AbstractC12259j3, com.ironsource.InterfaceC11408E0
    /* JADX INFO: renamed from: a */
    public Map<String, Object> mo25594a(EnumC11372C0 enumC11372C0) {
        Map<String, Object> mapMo25594a = super.mo25594a(enumC11372C0);
        C12366o c12366o = this.f24808r;
        if (c12366o != null && !c12366o.m32581b()) {
            C12357j.m32540a(mapMo25594a, this.f24808r.getSize());
        }
        if (this.f30615g != null) {
            mapMo25594a.put("placement", m31825j());
        }
        return mapMo25594a;
    }
}
