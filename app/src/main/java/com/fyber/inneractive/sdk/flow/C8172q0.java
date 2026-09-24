package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.C8028r0;
import com.fyber.inneractive.sdk.config.InterfaceC8041s0;
import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.measurement.tracker.AbstractC8280e;
import com.fyber.inneractive.sdk.measurement.tracker.RunnableC8278c;
import com.fyber.inneractive.sdk.p278ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C9270v0;
import com.iab.omid.library.fyber.adsession.AdSession;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.q0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8172q0 extends AbstractC8234w {

    /* JADX INFO: renamed from: i */
    public IAmraidWebViewController f18206i;

    public C8172q0(InterfaceC8041s0 interfaceC8041s0, C8006r c8006r) {
        super(interfaceC8041s0, c8006r);
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8236x
    /* JADX INFO: renamed from: b */
    public final boolean mo20599b() {
        InterfaceC8041s0 interfaceC8041s0 = this.f18376d;
        if (interfaceC8041s0 == null) {
            return false;
        }
        C8028r0 c8028r0 = (C8028r0) interfaceC8041s0;
        if (c8028r0.f17813c == null || c8028r0.f17813c.f17798b == null) {
            return false;
        }
        return c8028r0.f17813c.f17798b.isFullscreenUnit();
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8236x
    /* JADX INFO: renamed from: d */
    public final boolean mo20600d() {
        IAmraidWebViewController iAmraidWebViewController = this.f18206i;
        return (iAmraidWebViewController == null || iAmraidWebViewController.f21565b == null) ? false : true;
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8236x
    public final void destroy() {
        AdSession adSession;
        if (this.f18353g != null && mo20599b()) {
            C9270v0 c9270v0 = this.f18353g;
            c9270v0.f21701y = true;
            c9270v0.f21675D = false;
            c9270v0.f21678b.f18414h.remove(c9270v0);
            c9270v0.f21685i = null;
            IAlog.m21945a("destroy internalStoreWebpageController", new Object[0]);
            this.f18353g = null;
        }
        IAmraidWebViewController iAmraidWebViewController = this.f18206i;
        if (iAmraidWebViewController != null) {
            AbstractC8280e abstractC8280e = iAmraidWebViewController.f21622I;
            if (abstractC8280e != null && (adSession = abstractC8280e.f18458a) != null) {
                try {
                    adSession.finish();
                } catch (Throwable unused) {
                }
                AbstractC9183r.f21478b.postDelayed(new RunnableC8278c(abstractC8280e), 1000);
                abstractC8280e.f18458a = null;
                abstractC8280e.f18459b = null;
            }
            this.f18206i.mo21936e();
            this.f18206i = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8236x
    public boolean isVideoAd() {
        return false;
    }
}
