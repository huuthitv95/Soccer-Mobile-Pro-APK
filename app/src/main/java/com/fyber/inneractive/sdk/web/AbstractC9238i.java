package com.fyber.inneractive.sdk.web;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.graphics.Rect;
import android.os.Handler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.config.global.features.C7978f;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.AbstractC8236x;
import com.fyber.inneractive.sdk.measurement.tracker.AbstractC8280e;
import com.fyber.inneractive.sdk.measurement.tracker.RunnableC8278c;
import com.fyber.inneractive.sdk.response.AbstractC9087e;
import com.fyber.inneractive.sdk.util.AbstractC9161j1;
import com.fyber.inneractive.sdk.util.AbstractC9166l0;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.AbstractC9186s;
import com.fyber.inneractive.sdk.util.AbstractC9195v;
import com.fyber.inneractive.sdk.util.C9152g1;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.InterfaceC9169m0;
import com.fyber.inneractive.sdk.util.RunnableC9141d;
import com.fyber.inneractive.sdk.util.RunnableC9144e;
import com.iab.omid.library.fyber.adsession.AdSession;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.web.i */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9238i implements InterfaceC9241j, InterfaceC9169m0, InterfaceC9246l, InterfaceC9274x0 {

    /* JADX INFO: renamed from: b */
    public C9248m f21565b;

    /* JADX INFO: renamed from: c */
    public C9242j0 f21566c;

    /* JADX INFO: renamed from: d */
    public C9245k0 f21567d;

    /* JADX INFO: renamed from: f */
    public InterfaceC9232g f21569f;

    /* JADX INFO: renamed from: g */
    public InterfaceC9243j1 f21570g;

    /* JADX INFO: renamed from: j */
    public boolean f21573j;

    /* JADX INFO: renamed from: k */
    public final boolean f21574k;

    /* JADX INFO: renamed from: l */
    public InterfaceC9229f f21575l;

    /* JADX INFO: renamed from: m */
    public final RunnableC9223d f21576m;

    /* JADX INFO: renamed from: n */
    public final RunnableC9220c f21577n;

    /* JADX INFO: renamed from: o */
    public C9226e f21578o;

    /* JADX INFO: renamed from: p */
    public String f21579p;

    /* JADX INFO: renamed from: q */
    public String f21580q;

    /* JADX INFO: renamed from: r */
    public InneractiveAdRequest f21581r;

    /* JADX INFO: renamed from: s */
    public AbstractC8236x f21582s;

    /* JADX INFO: renamed from: t */
    public AbstractC9087e f21583t;

    /* JADX INFO: renamed from: a */
    public boolean f21564a = false;

    /* JADX INFO: renamed from: h */
    public float f21571h = 0.0f;

    /* JADX INFO: renamed from: i */
    public final Rect f21572i = new Rect();

    /* JADX INFO: renamed from: e */
    public final boolean f21568e = false;

    public AbstractC9238i(boolean z, C8006r c8006r) {
        this.f21574k = z;
        this.f21565b = m22058a(c8006r);
        AbstractC9240i1 abstractC9240i1 = (AbstractC9240i1) this;
        this.f21577n = new RunnableC9220c(abstractC9240i1);
        this.f21576m = new RunnableC9223d(abstractC9240i1);
    }

    /* JADX INFO: renamed from: a */
    public final C9248m m22058a(C8006r c8006r) {
        int i;
        int i2;
        C9248m c9248m = new C9248m();
        boolean zBooleanValue = false;
        int iMax = 2;
        if (c8006r != null) {
            C7978f c7978f = (C7978f) c8006r.m20432a(C7978f.class);
            Boolean boolMo20420c = c7978f.mo20420c("agg_res");
            zBooleanValue = boolMo20420c != null ? boolMo20420c.booleanValue() : false;
            Integer numMo20416a = c7978f.mo20416a("agg_res_ct");
            int iMax2 = Math.max(numMo20416a != null ? numMo20416a.intValue() : 500, 50);
            Integer numMo20416a2 = c7978f.mo20416a("agg_res_rt");
            int iMax3 = Math.max(numMo20416a2 != null ? numMo20416a2.intValue() : 500, 50);
            Integer numMo20416a3 = c7978f.mo20416a("agg_res_retries");
            iMax = Math.max(numMo20416a3 != null ? numMo20416a3.intValue() : 2, 1);
            i2 = iMax3;
            i = iMax2;
        } else {
            i = 500;
            i2 = 500;
        }
        C9245k0 c9245k0 = new C9245k0(this, zBooleanValue, i, i2, iMax);
        this.f21567d = c9245k0;
        c9248m.setWebViewClient(c9245k0);
        return c9248m;
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC9241j
    /* JADX INFO: renamed from: a */
    public void mo22044a() {
        InterfaceC9243j1 interfaceC9243j1 = this.f21570g;
        if (interfaceC9243j1 != null) {
            interfaceC9243j1.mo20921a();
        }
        mo22061b(true);
    }

    @Override // com.fyber.inneractive.sdk.util.InterfaceC9169m0
    /* JADX INFO: renamed from: a */
    public final void mo21858a(float f, Rect rect) {
        if (f == this.f21571h && rect.equals(this.f21572i)) {
            return;
        }
        this.f21571h = f;
        this.f21572i.set(rect);
        C9248m c9248m = this.f21565b;
        if (c9248m != null) {
            c9248m.m22084a();
        }
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC9241j
    /* JADX INFO: renamed from: a */
    public void mo22045a(WebView webView) {
    }

    /* JADX INFO: renamed from: a */
    public final void m22059a(InneractiveInfrastructureError inneractiveInfrastructureError) {
        InterfaceC9232g interfaceC9232g = this.f21569f;
        if (interfaceC9232g != null) {
            interfaceC9232g.mo20539a(this, inneractiveInfrastructureError);
        }
        mo22061b(true);
    }

    /* JADX INFO: renamed from: a */
    public final void m22060a(InterfaceC9229f interfaceC9229f) {
        IAlog.m21949e("IAWebViewController Web view click detected", new Object[0]);
        if (this.f21573j) {
            IAlog.m21949e("IAWebViewController Native click detected before web view request. Processing click", new Object[0]);
            interfaceC9229f.mo22057d();
            m22064i();
            return;
        }
        if (!this.f21574k) {
            RunnableC9223d runnableC9223d = this.f21576m;
            if (runnableC9223d != null) {
                AbstractC9183r.f21478b.removeCallbacks(runnableC9223d);
            }
            this.f21575l = null;
            interfaceC9229f.mo22057d();
            return;
        }
        IAlog.m21949e("IAWebViewController Native click was not detected yet. Caching click request and waiting", new Object[0]);
        RunnableC9223d runnableC9223d2 = this.f21576m;
        if (runnableC9223d2 != null) {
            AbstractC9183r.f21478b.removeCallbacks(runnableC9223d2);
        }
        this.f21575l = interfaceC9229f;
        if (this.f21576m != null) {
            AbstractC9183r.f21478b.postDelayed(this.f21576m, IAConfigManager.f17654M.f17688t.f17862b.m20443a("click_timeout", 1000, 1000));
        }
    }

    /* JADX INFO: renamed from: a */
    public void mo21933a(boolean z) {
        IAlog.m21945a("%sonWebViewVisibilityChanged called with: %s", IAlog.m21943a(this), Boolean.valueOf(z));
        InterfaceC9243j1 interfaceC9243j1 = this.f21570g;
        if (interfaceC9243j1 != null) {
            interfaceC9243j1.mo21867a(z);
        }
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC9241j
    /* JADX INFO: renamed from: a */
    public boolean mo21934a(WebView webView, String str) {
        IAlog.m21945a("%shandleUrl called with: %s", IAlog.m21943a(this), str);
        if (this.f21565b == null) {
            IAlog.m21945a("handleUrl: web view already destroyed. Cannot handle url", new Object[0]);
            return false;
        }
        if (AbstractC9161j1.m21972a(str)) {
            this.f21565b.loadUrl("chrome://crash");
            return true;
        }
        if (str != null && str.startsWith("data:")) {
            return false;
        }
        C9152g1 c9152g1Mo22062g = mo22062g();
        if (mo21935a(str, c9152g1Mo22062g)) {
            return true;
        }
        m22060a(new C9235h(this, str, c9152g1Mo22062g));
        return true;
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo21935a(String str, C9152g1 c9152g1);

    /* JADX INFO: renamed from: b */
    public void mo22061b(boolean z) {
        IAlog.m21945a("%s destroy is fatal: %b", IAlog.m21943a(this), Boolean.valueOf(z));
        C9226e c9226e = this.f21578o;
        if (c9226e != null && !c9226e.f21540a.isTerminated() && !c9226e.f21540a.isShutdown()) {
            C9226e c9226e2 = this.f21578o;
            c9226e2.f21545f = true;
            c9226e2.f21540a.shutdownNow();
            Handler handler = c9226e2.f21541b;
            if (handler != null) {
                RunnableC9141d runnableC9141d = c9226e2.f21543d;
                if (runnableC9141d != null) {
                    handler.removeCallbacks(runnableC9141d);
                }
                RunnableC9144e runnableC9144e = c9226e2.f21542c;
                if (runnableC9144e != null) {
                    c9226e2.f21541b.removeCallbacks(runnableC9144e);
                }
                c9226e2.f21541b = null;
            }
            this.f21578o = null;
        }
        C9248m c9248m = this.f21565b;
        if (c9248m != null) {
            AbstractC9166l0.f21461a.m21983a(c9248m);
            AbstractC9195v.m22027a(this.f21565b);
            this.f21565b.setWebChromeClient(null);
            if (mo21937f() == null) {
                this.f21565b.destroy();
            } else {
                AbstractC8280e abstractC8280eMo21937f = mo21937f();
                AdSession adSession = abstractC8280eMo21937f.f18458a;
                if (adSession != null) {
                    try {
                        adSession.finish();
                    } catch (Throwable unused) {
                    }
                    AbstractC9183r.f21478b.postDelayed(new RunnableC8278c(abstractC8280eMo21937f), z ? 0 : 1000);
                    abstractC8280eMo21937f.f18458a = null;
                    abstractC8280eMo21937f.f18459b = null;
                }
            }
        }
        C9245k0 c9245k0 = this.f21567d;
        if (c9245k0 != null) {
            c9245k0.f21638e = null;
        }
        RunnableC9220c runnableC9220c = this.f21577n;
        if (runnableC9220c != null) {
            AbstractC9183r.f21478b.removeCallbacks(runnableC9220c);
        }
        RunnableC9223d runnableC9223d = this.f21576m;
        if (runnableC9223d != null) {
            AbstractC9183r.f21478b.removeCallbacks(runnableC9223d);
        }
        this.f21570g = null;
        if (!z) {
            this.f21569f = null;
        }
        this.f21565b = null;
        this.f21566c = null;
        this.f21567d = null;
        this.f21582s = null;
        this.f21581r = null;
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC9241j
    /* JADX INFO: renamed from: d */
    public void mo22048d() {
    }

    /* JADX INFO: renamed from: e */
    public void mo21936e() {
        mo22061b(false);
    }

    /* JADX INFO: renamed from: f */
    public abstract AbstractC8280e mo21937f();

    /* JADX INFO: renamed from: g */
    public C9152g1 mo22062g() {
        C9248m c9248m = this.f21565b;
        return c9248m != null ? c9248m.getLastClickedLocation() : new C9152g1();
    }

    /* JADX INFO: renamed from: h */
    public void mo22063h() {
        C9248m c9248m = this.f21565b;
        if (c9248m == null) {
            return;
        }
        WebSettings settings = c9248m.getSettings();
        boolean z = true;
        settings.setJavaScriptEnabled(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setJavaScriptCanOpenWindowsAutomatically(true);
        if (!IAConfigManager.f17654M.f17685q && AbstractC9186s.m22012a()) {
            settings.setMixedContentMode(2);
        }
        if (this.f21568e) {
            settings.setMediaPlaybackRequiresUserGesture(false);
        }
        C9248m c9248m2 = this.f21565b;
        c9248m2.setHorizontalScrollBarEnabled(false);
        c9248m2.setHorizontalScrollbarOverlay(false);
        c9248m2.setVerticalScrollBarEnabled(false);
        c9248m2.setVerticalScrollbarOverlay(false);
        c9248m2.getSettings().setSupportZoom(false);
        this.f21565b.setFocusable(true);
        this.f21565b.setBackgroundColor(0);
        C9242j0 c9242j0 = new C9242j0();
        this.f21566c = c9242j0;
        this.f21565b.setWebChromeClient(c9242j0);
        try {
            Context context = this.f21565b.getContext();
            ApplicationInfo applicationInfo = context != null ? context.getApplicationInfo() : null;
            if (applicationInfo == null || (applicationInfo.flags & 2) == 0) {
                z = false;
            }
            WebView.setWebContentsDebuggingEnabled(z);
        } catch (Exception unused) {
            IAlog.m21945a("Could not set web contents debugging flag", new Object[0]);
        }
        this.f21565b.setListener(this);
    }

    /* JADX INFO: renamed from: i */
    public final void m22064i() {
        IAlog.m21945a("IAWebViewController resetClick()", new Object[0]);
        RunnableC9220c runnableC9220c = this.f21577n;
        if (runnableC9220c != null) {
            AbstractC9183r.f21478b.removeCallbacks(runnableC9220c);
        }
        RunnableC9223d runnableC9223d = this.f21576m;
        if (runnableC9223d != null) {
            AbstractC9183r.f21478b.removeCallbacks(runnableC9223d);
        }
        this.f21573j = false;
    }

    public void setAdContent(AbstractC8236x abstractC8236x) {
        this.f21582s = abstractC8236x;
    }

    public void setAdRequest(InneractiveAdRequest inneractiveAdRequest) {
        this.f21581r = inneractiveAdRequest;
    }

    public void setAdResponse(AbstractC9087e abstractC9087e) {
        this.f21583t = abstractC9087e;
    }

    public void setListener(InterfaceC9243j1 interfaceC9243j1) {
        this.f21570g = interfaceC9243j1;
    }
}
