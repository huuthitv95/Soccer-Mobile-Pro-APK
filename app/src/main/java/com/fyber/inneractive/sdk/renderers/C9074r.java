package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveAdViewVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveContentController;
import com.fyber.inneractive.sdk.external.InneractiveNativeVideoContentController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.VideoContentListener;
import com.fyber.inneractive.sdk.flow.AbstractC8236x;
import com.fyber.inneractive.sdk.flow.C8219t0;
import com.fyber.inneractive.sdk.interfaces.InterfaceC8263d;
import com.fyber.inneractive.sdk.p278ui.controller.InterfaceC9124b;
import com.fyber.inneractive.sdk.player.AbstractC8846f;
import com.fyber.inneractive.sdk.player.C8876t;
import com.fyber.inneractive.sdk.player.controller.AbstractC8476q;
import com.fyber.inneractive.sdk.player.controller.C8478s;
import com.fyber.inneractive.sdk.player.p277ui.AbstractC8881e;
import com.fyber.inneractive.sdk.player.p277ui.InterfaceC8889m;
import com.fyber.inneractive.sdk.util.AbstractC9166l0;
import com.fyber.inneractive.sdk.util.C9172n0;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.InterfaceC9169m0;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.renderers.r */
/* JADX INFO: loaded from: classes4.dex */
public class C9074r extends AbstractC9059e implements InterfaceC8263d, InneractiveNativeVideoContentController.Renderer, InterfaceC9169m0 {

    /* JADX INFO: renamed from: l */
    public FrameLayout f21235l;

    /* JADX INFO: renamed from: m */
    public InterfaceC8889m f21236m;

    /* JADX INFO: renamed from: n */
    public VideoContentListener f21237n;

    /* JADX INFO: renamed from: p */
    public ViewGroup f21239p;

    /* JADX INFO: renamed from: q */
    public AbstractC9062f0 f21240q;

    /* JADX INFO: renamed from: t */
    public RunnableC9072p f21243t;

    /* JADX INFO: renamed from: o */
    public final C9071o f21238o = new C9071o(this);

    /* JADX INFO: renamed from: r */
    public float f21241r = 0.0f;

    /* JADX INFO: renamed from: s */
    public final Rect f21242s = new Rect();

    /* JADX INFO: renamed from: u */
    public boolean f21244u = false;

    /* JADX INFO: renamed from: v */
    public final C9073q f21245v = new C9073q(this);

    /* JADX INFO: renamed from: I */
    public void mo21862I() {
        AbstractC8236x abstractC8236x = this.f17958b;
        if (abstractC8236x != null) {
            C8219t0 c8219t0 = (C8219t0) abstractC8236x;
            if (c8219t0.f18322j) {
                return;
            }
            c8219t0.f18322j = true;
            m20475E();
        }
    }

    /* JADX INFO: renamed from: a */
    public VideoContentListener mo21863a(InneractiveContentController inneractiveContentController) {
        if (inneractiveContentController instanceof InneractiveAdViewVideoContentController) {
            return (VideoContentListener) ((InneractiveAdViewVideoContentController) inneractiveContentController).getEventsListener();
        }
        IAlog.m21950f("%sContent controller expected to be InneractiveFullscreenVideoContentController and is %s", IAlog.m21943a(this), inneractiveContentController != null ? inneractiveContentController.getClass().getSimpleName() : AbstractJsonLexerKt.NULL);
        return null;
    }

    /* JADX INFO: renamed from: a */
    public AbstractC9062f0 mo21864a(C8876t c8876t) {
        if (c8876t == null || c8876t.f20853f == null) {
            return null;
        }
        return new C9051a(c8876t);
    }

    @Override // com.fyber.inneractive.sdk.util.InterfaceC9169m0
    /* JADX INFO: renamed from: a */
    public final void mo21858a(float f, Rect rect) {
        ViewGroup viewGroup;
        ViewGroup viewGroup2;
        if (this.f21241r == f && this.f21242s.equals(rect)) {
            return;
        }
        this.f21241r = f;
        this.f21242s.set(rect);
        InterfaceC9124b interfaceC9124b = this.f21202k;
        if (interfaceC9124b != null) {
            ((C8478s) interfaceC9124b).f18886D = false;
            ((AbstractC8881e) this.f21236m).m21430f();
            ((C8478s) this.f21202k).mo20861a(f);
        }
        if (f <= 0.0f) {
            RunnableC9072p runnableC9072p = this.f21243t;
            if (runnableC9072p == null || (viewGroup = this.f21239p) == null) {
                return;
            }
            viewGroup.removeCallbacks(runnableC9072p);
            this.f21243t = null;
            return;
        }
        RunnableC9072p runnableC9072p2 = this.f21243t;
        if (runnableC9072p2 != null && (viewGroup2 = this.f21239p) != null) {
            viewGroup2.removeCallbacks(runnableC9072p2);
            this.f21243t = null;
        }
        RunnableC9072p runnableC9072p3 = new RunnableC9072p(this);
        this.f21243t = runnableC9072p3;
        ViewGroup viewGroup3 = this.f21239p;
        if (viewGroup3 != null) {
            viewGroup3.postDelayed(runnableC9072p3, 100L);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC8263d
    /* JADX INFO: renamed from: a */
    public final void mo20656a(int i) {
    }

    /* JADX INFO: renamed from: a */
    public void mo20657a(ViewGroup viewGroup) {
        AbstractC8236x abstractC8236x;
        InneractiveAdSpot inneractiveAdSpot = this.f17957a;
        if (inneractiveAdSpot == null) {
            IAlog.m21950f("%sYou must set the spot to render before calling renderAd", IAlog.m21943a(this));
            return;
        }
        this.f21239p = viewGroup;
        if (inneractiveAdSpot != null) {
            InneractiveUnitController selectedUnitController = inneractiveAdSpot.getSelectedUnitController();
            if (mo21865a(selectedUnitController)) {
                this.f21237n = mo21863a(selectedUnitController.getSelectedContentController());
            } else {
                IAlog.m21950f("%sWrong type of unit controller found. Expecting InneractiveAdViewUnitController", IAlog.m21943a(this));
            }
        }
        this.f21244u = false;
        this.f21235l = new FrameLayout(viewGroup.getContext());
        AbstractC8236x abstractC8236x2 = this.f17958b;
        C8876t c8876t = abstractC8236x2 != null ? ((C8219t0) abstractC8236x2).f18321i : null;
        Context context = viewGroup.getContext();
        AbstractC9062f0 abstractC9062f0Mo21864a = mo21864a(c8876t);
        this.f21240q = abstractC9062f0Mo21864a;
        if (abstractC9062f0Mo21864a == null || (abstractC8236x = this.f17958b) == null) {
            return;
        }
        this.f21236m = abstractC9062f0Mo21864a.mo21854a(context, ((C8219t0) abstractC8236x).f18375c);
        this.f21202k = (C8478s) this.f21240q.mo21853a(this.f17957a, (C8219t0) this.f17958b);
        ViewGroup viewGroup2 = this.f21239p;
        if (viewGroup2 != null) {
            viewGroup2.addView(this.f21235l, new ViewGroup.LayoutParams(-1, -2));
            this.f21239p.setLayoutTransition(null);
        }
        this.f21235l.addView((View) this.f21236m, new FrameLayout.LayoutParams(-2, -2, 17));
        C8478s c8478s = (C8478s) this.f21202k;
        C9073q c9073q = this.f21245v;
        c8478s.getClass();
        c8478s.f18903g = c9073q;
        C8478s c8478s2 = (C8478s) this.f21202k;
        this.f21240q.mo21856b();
        c8478s2.mo20852b(false);
        this.f21240q.mo21855a(this.f21238o);
        ViewGroup viewGroup3 = this.f21239p;
        if (viewGroup3 != null) {
            C9172n0 c9172n0 = AbstractC9166l0.f21461a;
            c9172n0.getClass();
            c9172n0.m21982a(viewGroup3.getContext(), viewGroup3, this);
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean mo21865a(InneractiveUnitController inneractiveUnitController) {
        return inneractiveUnitController instanceof InneractiveAdViewUnitController;
    }

    /* JADX INFO: renamed from: a */
    public boolean mo20658a(AbstractC8236x abstractC8236x) {
        return abstractC8236x instanceof C8219t0;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC8263d
    /* JADX INFO: renamed from: b */
    public final boolean mo20659b(View view) {
        return view != null && view.equals(this.f21239p);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC8263d
    /* JADX INFO: renamed from: d */
    public final int mo20660d() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8076b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public void destroy() {
        this.f21237n = null;
        mo20665s();
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC8263d
    /* JADX INFO: renamed from: l */
    public final void mo20661l() {
        InterfaceC9124b interfaceC9124b = this.f21202k;
        if (interfaceC9124b != null) {
            ((C8478s) interfaceC9124b).mo20852b(false);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC8263d
    /* JADX INFO: renamed from: n */
    public final int mo20662n() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC8263d
    /* JADX INFO: renamed from: p */
    public final void mo20663p() {
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveNativeVideoContentController.Renderer
    public final void pauseVideo() {
        InterfaceC9124b interfaceC9124b = this.f21202k;
        if (interfaceC9124b != null) {
            ((C8478s) interfaceC9124b).mo20919z();
        }
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveNativeVideoContentController.Renderer
    public final void playVideo() {
        InterfaceC9124b interfaceC9124b = this.f21202k;
        if (interfaceC9124b != null) {
            ((C8478s) interfaceC9124b).m20913c(0);
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC8263d
    /* JADX INFO: renamed from: q */
    public final void mo20664q() {
        AbstractC8476q abstractC8476q;
        InterfaceC9124b interfaceC9124b = this.f21202k;
        if (interfaceC9124b != null) {
            C8478s c8478s = (C8478s) interfaceC9124b;
            c8478s.getClass();
            IAlog.m21945a("%sfullscreenExited called", IAlog.m21943a(c8478s));
            c8478s.f18887E = false;
            c8478s.m20916j(c8478s.f18886D);
            AbstractC8846f abstractC8846f = c8478s.f18897a;
            if (abstractC8846f == null || (abstractC8476q = abstractC8846f.f20772a) == null) {
                return;
            }
            c8478s.mo20901a(abstractC8476q.f18871e);
            c8478s.mo20900a(c8478s.f18897a.f20772a.mo20841b());
        }
    }

    @Override // com.fyber.inneractive.sdk.interfaces.InterfaceC8263d
    /* JADX INFO: renamed from: s */
    public final void mo20665s() {
        ViewGroup viewGroup;
        RunnableC9072p runnableC9072p = this.f21243t;
        if (runnableC9072p != null && (viewGroup = this.f21239p) != null) {
            viewGroup.removeCallbacks(runnableC9072p);
            this.f21243t = null;
        }
        AbstractC9166l0.f21461a.m21983a(this.f21239p);
        IAlog.m21945a("%sunbind called. root is %s", IAlog.m21943a(this), this.f21239p);
        if (this.f21202k != null) {
            IAlog.m21945a("%sdestroying video ui controller", IAlog.m21943a(this));
            C8478s c8478s = (C8478s) this.f21202k;
            c8478s.getClass();
            c8478s.f18903g = null;
            ((C8478s) this.f21202k).destroy();
            this.f21202k = null;
        }
        if (this.f21236m != null) {
            ViewGroup viewGroup2 = this.f21239p;
            if (viewGroup2 != null) {
                viewGroup2.setLayoutTransition(null);
                this.f21239p.removeView(this.f21235l);
            }
            this.f21236m.destroy();
            this.f21236m = null;
        }
        this.f21235l = null;
        this.f21240q = null;
        this.f21239p = null;
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8076b0
    /* JADX INFO: renamed from: w */
    public final Context mo20490w() {
        return m20483c((View) this.f21239p);
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8076b0
    /* JADX INFO: renamed from: x */
    public View mo20491x() {
        return this.f21235l;
    }
}
