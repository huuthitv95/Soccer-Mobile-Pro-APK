package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.cache.session.C7916e;
import com.fyber.inneractive.sdk.cache.session.RunnableC7915d;
import com.fyber.inneractive.sdk.cache.session.enums.EnumC7917a;
import com.fyber.inneractive.sdk.cache.session.enums.EnumC7919c;
import com.fyber.inneractive.sdk.config.C8016l0;
import com.fyber.inneractive.sdk.config.C8028r0;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.InterfaceC8041s0;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdViewEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.flow.AbstractC8236x;
import com.fyber.inneractive.sdk.flow.C8172q0;
import com.fyber.inneractive.sdk.network.C8360b0;
import com.fyber.inneractive.sdk.network.C8435z0;
import com.fyber.inneractive.sdk.p278ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.response.AbstractC9087e;
import com.fyber.inneractive.sdk.util.AbstractC9174o;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.C9142d0;
import com.fyber.inneractive.sdk.util.C9152g1;
import com.fyber.inneractive.sdk.util.EnumC9150g;
import com.fyber.inneractive.sdk.util.EnumC9151g0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.InterfaceC9233g0;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.renderers.h */
/* JADX INFO: loaded from: classes4.dex */
public final class C9064h implements InterfaceC9233g0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C9070n f21209a;

    public C9064h(C9070n c9070n) {
        this.f21209a = c9070n;
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC9243j1
    /* JADX INFO: renamed from: a */
    public final C9142d0 mo20920a(String str, C9152g1 c9152g1) {
        InterfaceC8041s0 interfaceC8041s0;
        String str2;
        C9070n c9070n = this.f21209a;
        c9070n.getClass();
        IAlog.m21945a("%sweb view callback: onClicked", IAlog.m21943a(c9070n));
        ViewGroup viewGroup = this.f21209a.f21221p;
        Context context = (viewGroup == null || viewGroup.getContext() == null) ? AbstractC9174o.f21470a : this.f21209a.f21221p.getContext();
        if (context != null) {
            C9070n c9070n2 = this.f21209a;
            if (c9070n2.f17962f) {
                AbstractC8236x abstractC8236x = c9070n2.f17958b;
                AbstractC9087e abstractC9087e = abstractC8236x != null ? ((C8172q0) abstractC8236x).f18374b : null;
                if (abstractC9087e != null && (str2 = abstractC9087e.f21312l) != null && str2.trim().length() > 0) {
                    IAlog.m21948d("AD_CLICKED", new Object[0]);
                    C8435z0.m20813b(str2);
                }
                AbstractC8236x abstractC8236x2 = this.f21209a.f17958b;
                if (abstractC8236x2 != null && (interfaceC8041s0 = ((C8172q0) abstractC8236x2).f18376d) != null) {
                    C8028r0 c8028r0 = (C8028r0) interfaceC8041s0;
                    if (c8028r0.f17813c != null) {
                        EnumC7917a enumC7917a = EnumC7917a.CLICK;
                        EnumC7919c enumC7919c = c8028r0.f17813c.f17798b == UnitDisplayType.MRECT ? EnumC7919c.RECTANGLE_DISPLAY : EnumC7919c.BANNER_DISPLAY;
                        C7916e c7916e = IAConfigManager.f17654M.f17691w.f17888a;
                        if (c7916e != null) {
                            AbstractC9183r.f21477a.execute(new RunnableC7915d(c7916e, enumC7917a, enumC7919c));
                        }
                    }
                }
                return this.f21209a.m20479a(context, str, c9152g1, EnumC9150g.DISPLAY, false, null);
            }
        }
        return new C9142d0(EnumC9151g0.FAILED, new Exception("No context or no native click detected"));
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC9243j1
    /* JADX INFO: renamed from: a */
    public final void mo20921a() {
        this.f21209a.m20480a(new WebViewRendererProcessHasGoneError());
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC9218b0
    /* JADX INFO: renamed from: a */
    public final void mo20922a(IAmraidWebViewController.MraidVideoFailedToDisplayError mraidVideoFailedToDisplayError) {
        C9070n c9070n = this.f21209a;
        InneractiveUnitController.EventsListener eventsListener = c9070n.f17959c;
        if (eventsListener != null) {
            ((InneractiveAdViewEventsListener) eventsListener).onAdEnteredErrorState(c9070n.f17957a, mraidVideoFailedToDisplayError);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC9243j1
    /* JADX INFO: renamed from: a */
    public final void mo20923a(String str, String str2) {
        C9070n c9070n = this.f21209a;
        c9070n.getClass();
        IAlog.m21945a("%sweb view callback: onSuspiciousNoUserWebActionDetected", IAlog.m21943a(c9070n));
        ViewGroup viewGroup = this.f21209a.f21221p;
        if (viewGroup == null || viewGroup.getContext() == null) {
            return;
        }
        C9070n c9070n2 = this.f21209a;
        if (c9070n2.f21227v) {
            c9070n2.getClass();
            IAlog.m21945a("%sredirect already reported for this ad", IAlog.m21943a(c9070n2));
            return;
        }
        C8360b0.m20734a(c9070n2.f21221p.getContext(), str, str2, this.f21209a.f17958b);
        C9070n c9070n3 = this.f21209a;
        c9070n3.f21227v = true;
        c9070n3.getClass();
        IAlog.m21945a("%sreporting auto redirect", IAlog.m21943a(c9070n3));
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC9243j1
    /* JADX INFO: renamed from: a */
    public final void mo21867a(boolean z) {
        InterfaceC8041s0 interfaceC8041s0;
        C8016l0 c8016l0;
        C9070n c9070n = this.f21209a;
        c9070n.getClass();
        IAlog.m21945a("%sweb view callback: onVisibilityChanged: %s", IAlog.m21943a(c9070n), Boolean.valueOf(z));
        if (!z) {
            C9057d c9057d = this.f21209a.f21230y;
            if (c9057d != null && c9057d.f21197g) {
                c9057d.f21197g = false;
                AbstractC9183r.f21478b.removeCallbacks(c9057d.f21200j);
            }
            this.f21209a.m21877d(false);
            return;
        }
        C9070n c9070n2 = this.f21209a;
        if (c9070n2.f21220o) {
            C9057d c9057d2 = c9070n2.f21230y;
            if (c9057d2 != null && !c9057d2.f21198h && !c9057d2.f21197g && c9057d2.f21196f != 0) {
                c9057d2.f21196f = 0L;
                c9057d2.f21197g = true;
                c9057d2.m21860a();
            }
            this.f21209a.m21875N();
            return;
        }
        IAlog.m21945a("%sonShownForTheFirstTime called", IAlog.m21943a(c9070n2));
        AbstractC8236x abstractC8236x = c9070n2.f17958b;
        AbstractC9087e abstractC9087e = abstractC8236x != null ? ((C8172q0) abstractC8236x).f18374b : null;
        if (abstractC9087e != null) {
            IAmraidWebViewController iAmraidWebViewController = c9070n2.f21218m;
            if (iAmraidWebViewController != null) {
                iAmraidWebViewController.m22083l();
            }
            String str = abstractC9087e.f21311k;
            if (str != null && str.trim().length() > 0) {
                IAlog.m21949e("%sfiring impression!", IAlog.m21943a(c9070n2));
                IAlog.m21948d("AD_IMPRESSION", new Object[0]);
                C8435z0.m20813b(str);
            }
            c9070n2.m20475E();
        }
        long jM21872K = c9070n2.m21872K();
        c9070n2.f21216k = jM21872K;
        if (jM21872K != 0) {
            c9070n2.m21876a(true, jM21872K);
        }
        AbstractC8236x abstractC8236x2 = c9070n2.f17958b;
        if (abstractC8236x2 != null && (interfaceC8041s0 = ((C8172q0) abstractC8236x2).f18376d) != null && (c8016l0 = ((C8028r0) interfaceC8041s0).f17813c) != null) {
            EnumC7917a enumC7917a = EnumC7917a.IMPRESSION;
            EnumC7919c enumC7919c = c8016l0.f17798b == UnitDisplayType.MRECT ? EnumC7919c.RECTANGLE_DISPLAY : EnumC7919c.BANNER_DISPLAY;
            C7916e c7916e = IAConfigManager.f17654M.f17691w.f17888a;
            if (c7916e != null) {
                AbstractC9183r.f21477a.execute(new RunnableC7915d(c7916e, enumC7917a, enumC7919c));
            }
        }
        this.f21209a.f21220o = true;
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC9218b0
    /* JADX INFO: renamed from: a */
    public final void mo20924a(boolean z, Orientation orientation) {
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC9218b0
    /* JADX INFO: renamed from: a */
    public final boolean mo20925a(String str) {
        boolean zStartRichMediaIntent = InneractiveRichMediaVideoPlayerActivityCore.startRichMediaIntent(AbstractC9174o.m21989a(this.f21209a.mo20491x()), str);
        if (zStartRichMediaIntent) {
            C9070n c9070n = this.f21209a;
            if (c9070n.f17959c != null) {
                c9070n.m20484c(false);
            }
        }
        return zStartRichMediaIntent;
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC9233g0
    /* JADX INFO: renamed from: b */
    public final void mo21868b() {
        this.f21209a.m20478H();
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC9218b0
    /* JADX INFO: renamed from: b */
    public final void mo20926b(boolean z) {
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC9218b0
    /* JADX INFO: renamed from: c */
    public final void mo20927c() {
        this.f21209a.m21877d(true);
        C9070n c9070n = this.f21209a;
        c9070n.getClass();
        IAlog.m21945a("%sweb view callback: onResize", IAlog.m21943a(c9070n));
        C9070n c9070n2 = this.f21209a;
        InneractiveUnitController.EventsListener eventsListener = c9070n2.f17959c;
        if (eventsListener != null) {
            ((InneractiveAdViewEventsListener) eventsListener).onAdResized(c9070n2.f17957a);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC9218b0
    /* JADX INFO: renamed from: d */
    public final void mo20928d() {
        C9070n c9070n = this.f21209a;
        c9070n.getClass();
        IAlog.m21945a("%sweb view callback: onExpand", IAlog.m21943a(c9070n));
        C9070n c9070n2 = this.f21209a;
        InneractiveUnitController.EventsListener eventsListener = c9070n2.f17959c;
        if (eventsListener != null) {
            ((InneractiveAdViewEventsListener) eventsListener).onAdExpanded(c9070n2.f17957a);
        }
        C9070n c9070n3 = this.f21209a;
        c9070n3.getClass();
        IAlog.m21945a("%sweb view callback: onExpand", IAlog.m21943a(c9070n3));
        this.f21209a.m21877d(true);
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC9218b0
    /* JADX INFO: renamed from: e */
    public final void mo20929e() {
        C9070n c9070n = this.f21209a;
        c9070n.mo20490w();
        c9070n.m20484c(false);
        this.f21209a.m20476F();
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC9218b0
    public final void onClose() {
        C9070n c9070n = this.f21209a;
        c9070n.getClass();
        IAlog.m21945a("%sweb view callback: onClose", IAlog.m21943a(c9070n));
        C9070n c9070n2 = this.f21209a;
        InneractiveUnitController.EventsListener eventsListener = c9070n2.f17959c;
        if (eventsListener != null) {
            ((InneractiveAdViewEventsListener) eventsListener).onAdCollapsed(c9070n2.f17957a);
        }
        this.f21209a.m21875N();
        C9070n c9070n3 = this.f21209a;
        c9070n3.getClass();
        IAlog.m21945a("%sweb view callback: onClose", IAlog.m21943a(c9070n3));
    }
}
