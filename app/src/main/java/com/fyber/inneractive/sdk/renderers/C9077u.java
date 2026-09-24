package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore;
import com.fyber.inneractive.sdk.cache.session.C7916e;
import com.fyber.inneractive.sdk.cache.session.RunnableC7915d;
import com.fyber.inneractive.sdk.cache.session.enums.EnumC7917a;
import com.fyber.inneractive.sdk.cache.session.enums.EnumC7919c;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenAdEventsListener;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.WebViewRendererProcessHasGoneError;
import com.fyber.inneractive.sdk.flow.AbstractC8236x;
import com.fyber.inneractive.sdk.flow.C8136n0;
import com.fyber.inneractive.sdk.flow.C8172q0;
import com.fyber.inneractive.sdk.interfaces.InterfaceC8264e;
import com.fyber.inneractive.sdk.network.C8360b0;
import com.fyber.inneractive.sdk.network.C8435z0;
import com.fyber.inneractive.sdk.p278ui.IAmraidWebViewController;
import com.fyber.inneractive.sdk.response.AbstractC9087e;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.C9132a;
import com.fyber.inneractive.sdk.util.C9142d0;
import com.fyber.inneractive.sdk.util.C9152g1;
import com.fyber.inneractive.sdk.util.C9197v1;
import com.fyber.inneractive.sdk.util.EnumC9150g;
import com.fyber.inneractive.sdk.util.EnumC9151g0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C9248m;
import com.fyber.inneractive.sdk.web.InterfaceC9233g0;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.renderers.u */
/* JADX INFO: loaded from: classes4.dex */
public final class C9077u implements InterfaceC9233g0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C9078v f21248a;

    public C9077u(C9078v c9078v) {
        this.f21248a = c9078v;
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC9243j1
    /* JADX INFO: renamed from: a */
    public final C9142d0 mo20920a(String str, C9152g1 c9152g1) {
        String str2;
        C9078v c9078v = this.f21248a;
        c9078v.getClass();
        IAlog.m21945a("%sweb view callback: onClicked", IAlog.m21943a(c9078v));
        Context contextMo20490w = this.f21248a.mo20490w();
        C9078v c9078v2 = this.f21248a;
        InterfaceC8264e interfaceC8264e = c9078v2.f18192k;
        if (interfaceC8264e != null) {
            contextMo20490w = c9078v2.m20483c(interfaceC8264e.getLayout());
        }
        Context context = contextMo20490w;
        C9078v c9078v3 = this.f21248a;
        if (!c9078v3.f17962f) {
            return new C9142d0(EnumC9151g0.FAILED, new Exception("No context or no native click detected"));
        }
        AbstractC8236x abstractC8236x = c9078v3.f17958b;
        AbstractC9087e abstractC9087e = abstractC8236x == null ? null : ((C8172q0) abstractC8236x).f18374b;
        if (abstractC9087e != null && (str2 = abstractC9087e.f21312l) != null && str2.trim().length() > 0) {
            IAlog.m21948d("AD_CLICKED", new Object[0]);
            C8435z0.m20813b(str2);
        }
        C9078v c9078v4 = this.f21248a;
        EnumC7917a enumC7917a = EnumC7917a.CLICK;
        EnumC7919c enumC7919c = c9078v4.f21255G == UnitDisplayType.REWARDED ? EnumC7919c.REWARDED_DISPLAY : EnumC7919c.INTERSTITIAL_DISPLAY;
        C7916e c7916e = IAConfigManager.f17654M.f17691w.f17888a;
        if (c7916e != null) {
            AbstractC9183r.f21477a.execute(new RunnableC7915d(c7916e, enumC7917a, enumC7919c));
        }
        return this.f21248a.m20479a(context, str, c9152g1, EnumC9150g.DISPLAY, false, null);
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC9243j1
    /* JADX INFO: renamed from: a */
    public final void mo20921a() {
        this.f21248a.m20480a(new WebViewRendererProcessHasGoneError());
        this.f21248a.destroy();
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC9218b0
    /* JADX INFO: renamed from: a */
    public final void mo20922a(IAmraidWebViewController.MraidVideoFailedToDisplayError mraidVideoFailedToDisplayError) {
        this.f21248a.m20598e(false);
        C9078v c9078v = this.f21248a;
        InneractiveUnitController.EventsListener eventsListener = c9078v.f17959c;
        if (eventsListener != null) {
            ((InneractiveFullscreenAdEventsListener) eventsListener).onAdEnteredErrorState(c9078v.f17957a, mraidVideoFailedToDisplayError);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC9243j1
    /* JADX INFO: renamed from: a */
    public final void mo20923a(String str, String str2) {
        C9078v c9078v = this.f21248a;
        c9078v.getClass();
        IAlog.m21945a("%sweb view callback: onSuspiciousNoUserWebActionDetected", IAlog.m21943a(c9078v));
        InterfaceC8264e interfaceC8264e = this.f21248a.f18192k;
        if (interfaceC8264e == null || interfaceC8264e.getLayout() == null) {
            return;
        }
        C9078v c9078v2 = this.f21248a;
        if (c9078v2.f21253E) {
            c9078v2.getClass();
            IAlog.m21945a("%sredirect already reported for this ad", IAlog.m21943a(c9078v2));
            return;
        }
        C8360b0.m20734a(c9078v2.f18192k.getLayout().getContext(), str, str2, this.f21248a.f17958b);
        C9078v c9078v3 = this.f21248a;
        c9078v3.f21253E = true;
        c9078v3.getClass();
        IAlog.m21945a("%sreporting auto redirect", IAlog.m21943a(c9078v3));
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC9243j1
    /* JADX INFO: renamed from: a */
    public final void mo21867a(boolean z) {
        String str;
        if (z) {
            C9078v c9078v = this.f21248a;
            if (!c9078v.f21261y) {
                c9078v.f21261y = true;
                if (c9078v.f17958b != null) {
                    IAmraidWebViewController iAmraidWebViewController = c9078v.f21262z;
                    if (iAmraidWebViewController != null) {
                        iAmraidWebViewController.m22083l();
                    }
                    AbstractC9087e abstractC9087e = ((C8172q0) c9078v.f17958b).f18374b;
                    if (abstractC9087e != null && (str = abstractC9087e.f21311k) != null && str.trim().length() > 0) {
                        IAlog.m21949e("%sfiring impression!", IAlog.m21943a(c9078v));
                        IAlog.m21948d("AD_IMPRESSION", new Object[0]);
                        C8435z0.m20813b(str);
                    }
                    C9248m c9248m = c9078v.f21262z.f21565b;
                    if (c9248m != null) {
                        c9248m.m22085a("var forceReflow = function(elem){ elem = elem || document.documentElement; elem.style.zIndex = 2147483646; var width = elem.style.width, px = elem.offsetWidth+1; elem.style.width = px+'px'; setTimeout(function(){ elem.style.zIndex = 2147483646; elem.style.width = width; elem = null; }, 0); }; forceReflow(document.documentElement);");
                    }
                    EnumC7917a enumC7917a = EnumC7917a.IMPRESSION;
                    EnumC7919c enumC7919c = c9078v.f21255G == UnitDisplayType.REWARDED ? EnumC7919c.REWARDED_DISPLAY : EnumC7919c.INTERSTITIAL_DISPLAY;
                    C7916e c7916e = IAConfigManager.f17654M.f17691w.f17888a;
                    if (c7916e != null) {
                        AbstractC9183r.f21477a.execute(new RunnableC7915d(c7916e, enumC7917a, enumC7919c));
                    }
                    c9078v.m20475E();
                    c9078v.m20586J();
                }
            }
        }
        C9078v c9078v2 = this.f21248a;
        c9078v2.getClass();
        IAlog.m21945a("%sweb view callback: onVisibilityChanged: %s", IAlog.m21943a(c9078v2), Boolean.valueOf(z));
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC9218b0
    /* JADX INFO: renamed from: a */
    public final void mo20924a(boolean z, Orientation orientation) {
        InterfaceC8264e interfaceC8264e = this.f21248a.f18192k;
        if (interfaceC8264e != null) {
            interfaceC8264e.setActivityOrientation(z, orientation);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC9218b0
    /* JADX INFO: renamed from: a */
    public final boolean mo20925a(String str) {
        InterfaceC8264e interfaceC8264e = this.f21248a.f18192k;
        if (interfaceC8264e == null || interfaceC8264e.getLayout() == null) {
            return false;
        }
        C9078v c9078v = this.f21248a;
        boolean zStartRichMediaIntent = InneractiveRichMediaVideoPlayerActivityCore.startRichMediaIntent(c9078v.m20483c(c9078v.f18192k.getLayout()), str);
        if (zStartRichMediaIntent) {
            this.f21248a.m20484c(false);
        }
        return zStartRichMediaIntent;
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC9233g0
    /* JADX INFO: renamed from: b */
    public final void mo21868b() {
        this.f21248a.m20478H();
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC9218b0
    /* JADX INFO: renamed from: b */
    public final void mo20926b(boolean z) {
        if (z) {
            C9078v c9078v = this.f21248a;
            if (!c9078v.f18200s) {
                c9078v.f18200s = true;
                InterfaceC8264e interfaceC8264e = c9078v.f18192k;
                if (interfaceC8264e != null) {
                    c9078v.m20597d(interfaceC8264e.isCloseButtonDisplay());
                }
            }
            C9078v c9078v2 = this.f21248a;
            if (!c9078v2.f18198q) {
                c9078v2.f18198q = true;
                C9197v1 c9197v1 = new C9197v1(TimeUnit.MILLISECONDS, c9078v2.f18199r);
                c9078v2.f18194m = c9197v1;
                c9197v1.f21502e = new C8136n0(c9078v2);
                c9197v1.f21501d = false;
                c9197v1.f21500c.sendEmptyMessage(1932593528);
            }
            InterfaceC8264e interfaceC8264e2 = this.f21248a.f18192k;
            if (interfaceC8264e2 == null || !interfaceC8264e2.isCloseButtonDisplay()) {
                return;
            }
            C9078v c9078v3 = this.f21248a;
            c9078v3.f18197p = false;
            InterfaceC8264e interfaceC8264e3 = c9078v3.f18192k;
            if (interfaceC8264e3 != null) {
                interfaceC8264e3.disableCloseButton();
            }
            C9132a c9132a = c9078v3.f18203v;
            c9132a.f21432d = 0L;
            c9132a.f21433e = 0L;
            c9132a.f21434f = 0L;
            c9132a.f21430b = false;
        }
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC9218b0
    /* JADX INFO: renamed from: c */
    public final void mo20927c() {
        C9078v c9078v = this.f21248a;
        c9078v.getClass();
        IAlog.m21945a("%sweb view callback: onResize", IAlog.m21943a(c9078v));
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC9218b0
    /* JADX INFO: renamed from: d */
    public final void mo20928d() {
        C9078v c9078v = this.f21248a;
        c9078v.getClass();
        IAlog.m21945a("%sweb view callback: onExpand", IAlog.m21943a(c9078v));
        C9078v c9078v2 = this.f21248a;
        c9078v2.f21252D = true;
        c9078v2.m21879P();
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC9218b0
    /* JADX INFO: renamed from: e */
    public final void mo20929e() {
        C9078v c9078v = this.f21248a;
        c9078v.mo20490w();
        c9078v.m20484c(false);
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC9218b0
    public final void onClose() {
        C9078v c9078v = this.f21248a;
        c9078v.getClass();
        IAlog.m21945a("%sweb view callback: onClose", IAlog.m21943a(c9078v));
        C9078v c9078v2 = this.f21248a;
        if (c9078v2.f21252D) {
            c9078v2.f21252D = false;
            c9078v2.m21879P();
            return;
        }
        if (c9078v2.f21255G == UnitDisplayType.REWARDED) {
            c9078v2.m21878O();
        }
        InterfaceC8264e interfaceC8264e = this.f21248a.f18192k;
        if (interfaceC8264e != null) {
            interfaceC8264e.dismissAd(true);
        }
    }
}
