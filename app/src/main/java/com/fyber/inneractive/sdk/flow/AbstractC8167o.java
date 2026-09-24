package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.external.NativeAdUnitController;
import com.fyber.inneractive.sdk.interfaces.InterfaceC8260a;
import com.fyber.inneractive.sdk.interfaces.InterfaceC8261b;
import com.fyber.inneractive.sdk.interfaces.InterfaceC8262c;
import com.fyber.inneractive.sdk.metrics.C8284c;
import com.fyber.inneractive.sdk.metrics.C8285d;
import com.fyber.inneractive.sdk.network.AbstractC8394m;
import com.fyber.inneractive.sdk.response.AbstractC9087e;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.o */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8167o implements InterfaceC8260a, InterfaceC8261b {

    /* JADX INFO: renamed from: a */
    public InterfaceC8262c f18184a;

    /* JADX INFO: renamed from: b */
    public InterfaceC8135n f18185b;

    /* JADX INFO: renamed from: c */
    public C8006r f18186c;

    /* JADX INFO: renamed from: d */
    public AbstractC8394m f18187d;

    /* JADX INFO: renamed from: e */
    public final String f18188e;

    /* JADX INFO: renamed from: f */
    public boolean f18189f = false;

    public AbstractC8167o(String str) {
        this.f18188e = str;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC8260a
    /* JADX INFO: renamed from: a */
    public void mo20578a(InneractiveAdRequest inneractiveAdRequest) {
        AbstractC8236x abstractC8236x;
        AbstractC8176s0 abstractC8176s0;
        AbstractC9087e abstractC9087e;
        IAlog.m21949e("%sgot onAdLoaded!", mo20561d());
        InterfaceC8262c interfaceC8262c = this.f18184a;
        if (interfaceC8262c != null) {
            InterfaceC8135n interfaceC8135n = this.f18185b;
            if (interfaceC8135n == null || (abstractC8236x = ((AbstractC8129k) interfaceC8262c).f18091c) == null) {
                IAlog.m21946b("%sgot onAdLoaded! but content or listener is null", mo20561d());
            } else {
                C8082e0 c8082e0 = (C8082e0) interfaceC8135n;
                if (c8082e0.f17979a.f18086n.get()) {
                    IAlog.m21945a("%s: onAdLoaded: spot is already destroyed", C8124h0.m20543a(c8082e0.f17979a));
                    C8124h0 c8124h0 = c8082e0.f17979a;
                    C8169p c8169p = c8124h0.f18084l;
                    c8124h0.m20547a(abstractC8236x);
                } else {
                    if (abstractC8236x == null) {
                        IAlog.m21946b("%sgot onAdLoaded but adContent is null", C8124h0.m20543a(c8082e0.f17979a));
                    } else {
                        C8124h0 c8124h1 = c8082e0.f17979a;
                        if (c8124h1.f18082j || (abstractC8176s0 = c8124h1.f18078f) == null || !abstractC8176s0.supportsRefresh()) {
                            C8124h0 c8124h2 = c8082e0.f17979a;
                            c8124h2.f18077e = abstractC8236x;
                            abstractC8236x.f18373a = inneractiveAdRequest;
                            Iterator it = c8124h2.f18079g.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    AbstractC8176s0 abstractC8176s1 = (AbstractC8176s0) it.next();
                                    if (abstractC8176s1.supports(c8124h2)) {
                                        c8124h2.f18078f = abstractC8176s1;
                                        C8124h0 c8124h3 = c8082e0.f17979a;
                                        InneractiveAdSpot.RequestListener requestListener = c8124h3.f18074b;
                                        if (requestListener != null) {
                                            if (requestListener instanceof InneractiveAdSpot.NativeAdRequestListener) {
                                                InneractiveAdSpot.NativeAdRequestListener nativeAdRequestListener = (InneractiveAdSpot.NativeAdRequestListener) requestListener;
                                                AbstractC8176s0 abstractC8176s2 = c8124h3.f18078f;
                                                if ((abstractC8236x instanceof C8235w0) && (abstractC8176s2 instanceof NativeAdUnitController)) {
                                                    C8235w0 c8235w0 = (C8235w0) abstractC8236x;
                                                    c8235w0.f18370v = (NativeAdUnitController) abstractC8176s2;
                                                    nativeAdRequestListener.onInneractiveSuccessfulNativeAdRequest(c8124h3, c8235w0);
                                                } else {
                                                    IAlog.m21946b("%s: Invalid native response: controller or/and content mismatch", IAlog.m21943a(c8124h3));
                                                    nativeAdRequestListener.onInneractiveFailedAdRequest(c8124h3, InneractiveErrorCode.ERROR_CONFIGURATION_MISMATCH);
                                                }
                                            } else {
                                                requestListener.onInneractiveSuccessfulAdRequest(c8124h3);
                                            }
                                        }
                                        c8082e0.f17979a.f18082j = false;
                                    }
                                } else {
                                    c8082e0.f17979a.f18077e.destroy();
                                    IAlog.m21945a("%sCannot find appropriate unit controller for unit: %s", C8124h0.m20543a(c8082e0.f17979a), c8082e0.f17979a.f18077e.f18376d);
                                    C8133m c8133m = c8082e0.f17979a.f18080h;
                                    AbstractC9087e abstractC9087eM20584c = c8133m != null ? c8133m.m20584c() : null;
                                    c8082e0.m20497a(inneractiveAdRequest, abstractC9087eM20584c, new InneractiveInfrastructureError(InneractiveErrorCode.INVALID_INPUT, EnumC8125i.COULD_NOT_SELECT_UNIT_CONTROLLER, new Exception("Cannot find appropriate unit controller for unit: " + c8082e0.f17979a.f18077e.f18376d)));
                                    C8124h0 c8124h4 = c8082e0.f17979a;
                                    c8124h4.f18077e = null;
                                    c8124h4.f18082j = false;
                                }
                            }
                        } else if (c8082e0.f17979a.f18078f.canRefreshAd()) {
                            C8124h0 c8124h5 = c8082e0.f17979a;
                            c8124h5.f18077e = abstractC8236x;
                            abstractC8236x.f18373a = inneractiveAdRequest;
                            InterfaceC8122g0 interfaceC8122g0 = c8124h5.f18081i;
                            if (interfaceC8122g0 != null) {
                                interfaceC8122g0.onAdRefreshed(c8124h5);
                            } else {
                                AbstractC8176s0 abstractC8176s3 = c8124h5.f18078f;
                                if (abstractC8176s3 instanceof InneractiveAdViewUnitController) {
                                    ((InneractiveAdViewUnitController) abstractC8176s3).onAdRefreshed(c8124h5);
                                }
                            }
                        } else {
                            IAlog.m21945a("%sad loaded successfully, but the selected unit controller has rejected the refresh!", C8124h0.m20543a(c8082e0.f17979a));
                            C8124h0 c8124h6 = c8082e0.f17979a;
                            c8124h6.f18081i.onAdRefreshFailed(c8124h6, InneractiveErrorCode.CANCELLED);
                        }
                    }
                    String str = c8082e0.f17979a.f18073a;
                    C8285d c8285d = C8285d.f18476d;
                    c8285d.m20685a(str).mo20691e();
                    c8285d.m20685a(str).mo20688b();
                    C8124h0 c8124h7 = c8082e0.f17979a;
                    AbstractC8236x abstractC8236x2 = c8124h7.f18077e;
                    if (abstractC8236x2 != null && (abstractC9087e = abstractC8236x2.f18374b) != null && abstractC9087e.f21314n != null) {
                        AbstractC8236x abstractC8236x3 = c8124h7.f18077e;
                        AbstractC9087e abstractC9087e2 = abstractC8236x3.f18374b;
                        new C8284c(abstractC9087e2, c8124h7.f18075c, c8124h7.f18073a, abstractC9087e2.f21314n, abstractC8236x3.f18375c.m20435b()).m20684a();
                    }
                }
            }
            this.f18184a = null;
        }
        mo20583b(inneractiveAdRequest);
    }

    /* JADX INFO: renamed from: a */
    public void mo20579a(InneractiveAdRequest inneractiveAdRequest, AbstractC9087e abstractC9087e) {
    }

    /* JADX INFO: renamed from: a */
    public final void m20580a(InneractiveAdRequest inneractiveAdRequest, AbstractC9087e abstractC9087e, InneractiveInfrastructureError inneractiveInfrastructureError) {
        if (IAlog.f21426a <= 3) {
            Thread.dumpStack();
        }
        IAlog.m21949e("%sgot onAdRequestFailed! with: %s", mo20561d(), inneractiveInfrastructureError.getErrorCode());
        if (this.f18185b != null) {
            if (abstractC9087e != null && abstractC9087e.f21309i != null) {
                inneractiveInfrastructureError.setCause(new Exception(abstractC9087e.f21309i + ": " + abstractC9087e.f21310j));
            }
            ((C8082e0) this.f18185b).m20497a(inneractiveAdRequest, abstractC9087e, inneractiveInfrastructureError);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC8260a
    /* JADX INFO: renamed from: a */
    public final void mo20581a(InneractiveInfrastructureError inneractiveInfrastructureError) {
        AbstractC8236x abstractC8236x;
        IAlog.m21949e("%sgot onFailedLoading! with: %s", mo20561d(), inneractiveInfrastructureError);
        InterfaceC8262c interfaceC8262c = this.f18184a;
        InneractiveAdRequest inneractiveAdRequest = (interfaceC8262c == null || (abstractC8236x = ((AbstractC8129k) interfaceC8262c).f18091c) == null) ? null : abstractC8236x.f18373a;
        AbstractC9087e abstractC9087eM20584c = m20584c();
        IAlog.m21949e("%sgot handleFailedLoading! with: %s", mo20561d(), inneractiveInfrastructureError);
        InterfaceC8135n interfaceC8135n = this.f18185b;
        if (interfaceC8135n != null) {
            ((C8082e0) interfaceC8135n).m20497a(inneractiveAdRequest, abstractC9087eM20584c, inneractiveInfrastructureError);
        }
        if (inneractiveInfrastructureError.getFyberMarketplaceAdLoadFailureReason() != EnumC8125i.NATIVE_AD_PARSING_ERROR) {
            mo20579a(inneractiveAdRequest, abstractC9087eM20584c);
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo20582a(boolean z) {
        this.f18189f = true;
        InterfaceC8262c interfaceC8262c = this.f18184a;
        if (interfaceC8262c == null || !z) {
            return;
        }
        interfaceC8262c.cancel();
        AbstractC8129k abstractC8129k = (AbstractC8129k) this.f18184a;
        if (abstractC8129k.f18091c != null) {
            abstractC8129k.f18091c.destroy();
        }
        this.f18184a = null;
    }

    /* JADX INFO: renamed from: b */
    public void mo20583b(InneractiveAdRequest inneractiveAdRequest) {
    }

    /* JADX INFO: renamed from: c */
    public final AbstractC9087e m20584c() {
        InterfaceC8262c interfaceC8262c = this.f18184a;
        if (interfaceC8262c == null) {
            return null;
        }
        AbstractC8129k abstractC8129k = (AbstractC8129k) interfaceC8262c;
        return abstractC8129k.f18091c != null ? abstractC8129k.f18091c.f18374b : abstractC8129k.f18090b;
    }

    /* JADX INFO: renamed from: d */
    public String mo20561d() {
        return IAlog.m21943a(this);
    }
}
