package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.fyber.inneractive.sdk.click.InterfaceC7941o;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveContentController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.external.MediaView;
import com.fyber.inneractive.sdk.external.NativeAdContent;
import com.fyber.inneractive.sdk.external.NativeAdUnitController;
import com.fyber.inneractive.sdk.external.NativeAdVideoContentController;
import com.fyber.inneractive.sdk.external.VideoContentListener;
import com.fyber.inneractive.sdk.flow.AbstractC8236x;
import com.fyber.inneractive.sdk.flow.C8219t0;
import com.fyber.inneractive.sdk.flow.C8235w0;
import com.fyber.inneractive.sdk.flow.RunnableC8238y;
import com.fyber.inneractive.sdk.flow.nativead.trackers.C8163a;
import com.fyber.inneractive.sdk.model.vast.EnumC8315x;
import com.fyber.inneractive.sdk.p278ui.controller.InterfaceC9124b;
import com.fyber.inneractive.sdk.player.C8870n;
import com.fyber.inneractive.sdk.player.C8876t;
import com.fyber.inneractive.sdk.player.controller.AbstractC8476q;
import com.fyber.inneractive.sdk.player.controller.C8458c0;
import com.fyber.inneractive.sdk.player.controller.C8478s;
import com.fyber.inneractive.sdk.player.enums.VideoClickOrigin;
import com.fyber.inneractive.sdk.player.p277ui.AbstractC8881e;
import com.fyber.inneractive.sdk.player.p277ui.C8903t;
import com.fyber.inneractive.sdk.player.p277ui.InterfaceC8889m;
import com.fyber.inneractive.sdk.player.p277ui.RunnableC8880d;
import com.fyber.inneractive.sdk.util.AbstractC9166l0;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.C9152g1;
import com.fyber.inneractive.sdk.util.C9172n0;
import com.fyber.inneractive.sdk.util.EnumC9150g;
import com.fyber.inneractive.sdk.util.IAlog;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.renderers.e0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9060e0 extends C9074r implements InterfaceViewTreeObserverOnWindowFocusChangeListenerC9081y {

    /* JADX INFO: renamed from: w */
    public C8163a f21203w;

    /* JADX INFO: renamed from: x */
    public WeakReference f21204x;

    static {
        IAlog.m21942a(C9060e0.class);
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8076b0
    /* JADX INFO: renamed from: C */
    public final boolean mo20473C() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8076b0
    /* JADX INFO: renamed from: D */
    public final boolean mo20474D() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.renderers.C9074r
    /* JADX INFO: renamed from: I */
    public final void mo21862I() {
        AbstractC8236x abstractC8236x;
        C8870n c8870n;
        InneractiveAdSpot inneractiveAdSpot = this.f17957a;
        if (inneractiveAdSpot == null || inneractiveAdSpot.getAdContent() == null || (abstractC8236x = this.f17958b) == null || ((C8219t0) abstractC8236x).f18322j) {
            return;
        }
        IAlog.m21945a("%sTracking impression", IAlog.m21943a(this));
        C8163a c8163a = new C8163a((C8235w0) this.f17957a.getAdContent());
        this.f21203w = c8163a;
        c8163a.m20575a(this);
        AbstractC9062f0 abstractC9062f0 = this.f21240q;
        if (abstractC9062f0 != null && (c8870n = abstractC9062f0.f21207c) != null) {
            if (c8870n.f20841w.compareAndSet(false, true)) {
                c8870n.mo21401a(c8870n.f20834p, VideoClickOrigin.InvalidOrigin, EnumC8315x.EVENT_IMPRESSION, EnumC8315x.EVENT_START);
            } else {
                IAlog.m21945a("%sreportPlayStartEvents called, but start events was already reported", IAlog.m21943a(c8870n));
            }
        }
        super.mo21862I();
    }

    @Override // com.fyber.inneractive.sdk.renderers.C9074r
    /* JADX INFO: renamed from: a */
    public final VideoContentListener mo21863a(InneractiveContentController inneractiveContentController) {
        if (inneractiveContentController instanceof NativeAdVideoContentController) {
            return (VideoContentListener) ((NativeAdVideoContentController) inneractiveContentController).getEventsListener();
        }
        IAlog.m21950f("%s: Content controller expected to be NativeAdVideoContentController but it: %s", IAlog.m21943a(this), inneractiveContentController);
        return null;
    }

    @Override // com.fyber.inneractive.sdk.renderers.C9074r
    /* JADX INFO: renamed from: a */
    public final AbstractC9062f0 mo21864a(C8876t c8876t) {
        if (c8876t != null) {
            return new C9082z(c8876t);
        }
        return null;
    }

    @Override // com.fyber.inneractive.sdk.renderers.C9074r, com.fyber.inneractive.sdk.interfaces.InterfaceC8263d
    /* JADX INFO: renamed from: a */
    public final void mo20657a(ViewGroup viewGroup) {
        C8903t c8903t;
        C8870n c8870n;
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
        AbstractC8236x abstractC8236x = this.f17958b;
        Float fValueOf = null;
        C8876t c8876t = abstractC8236x != null ? ((C8219t0) abstractC8236x).f18321i : null;
        Context context = viewGroup.getContext();
        AbstractC9062f0 abstractC9062f0Mo21864a = mo21864a(c8876t);
        this.f21240q = abstractC9062f0Mo21864a;
        if (abstractC9062f0Mo21864a == null) {
            IAlog.m21950f("%s : can't render - video renderer is missing", IAlog.m21943a(this));
            return;
        }
        InterfaceC8889m interfaceC8889mMo21854a = abstractC9062f0Mo21864a.mo21854a(context, ((C8219t0) this.f17958b).f18375c);
        this.f21236m = interfaceC8889mMo21854a;
        if (interfaceC8889mMo21854a instanceof C8903t) {
            c8903t = (C8903t) interfaceC8889mMo21854a;
            c8903t.getViewTreeObserver().addOnWindowFocusChangeListener(this);
        } else {
            c8903t = null;
        }
        this.f21204x = new WeakReference(c8903t);
        this.f21202k = (C8478s) this.f21240q.mo21853a(this.f17957a, (C8219t0) this.f17958b);
        viewGroup.addView((View) this.f21236m, new ViewGroup.LayoutParams(-1, -1));
        C8478s c8478s = (C8478s) this.f21202k;
        C9073q c9073q = this.f21245v;
        c8478s.getClass();
        c8478s.f18903g = c9073q;
        C8478s c8478s2 = (C8478s) this.f21202k;
        this.f21240q.mo21856b();
        c8478s2.mo20852b(false);
        this.f21240q.mo21855a(this.f21238o);
        InneractiveAdSpot inneractiveAdSpot2 = this.f17957a;
        if (inneractiveAdSpot2 != null && (inneractiveAdSpot2.getAdContent() instanceof C8235w0)) {
            C8235w0 c8235w0 = (C8235w0) this.f17957a.getAdContent();
            AbstractC9062f0 abstractC9062f0 = this.f21240q;
            AbstractC8476q abstractC8476q = (abstractC9062f0 == null || (c8870n = abstractC9062f0.f21207c) == null) ? null : c8870n.f20772a;
            if (abstractC8476q != null && abstractC8476q.mo20846e() > 0 && abstractC8476q.mo20847f() > 0) {
                fValueOf = Float.valueOf(abstractC8476q.mo20847f() / abstractC8476q.mo20846e());
            }
            c8235w0.f18364p = fValueOf;
        }
        C9172n0 c9172n0 = AbstractC9166l0.f21461a;
        ViewGroup viewGroup2 = this.f21239p;
        c9172n0.getClass();
        c9172n0.m21982a(viewGroup2.getContext(), viewGroup2, this);
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.InterfaceC8147k
    /* JADX INFO: renamed from: a */
    public final void mo20568a(String str, boolean z, EnumC9150g enumC9150g, InterfaceC7941o interfaceC7941o) {
        AbstractC8236x abstractC8236x;
        InneractiveAdSpot inneractiveAdSpot = this.f17957a;
        if (inneractiveAdSpot != null && inneractiveAdSpot.getAdContent() != null && (abstractC8236x = this.f17958b) != null && !((C8219t0) abstractC8236x).f18322j) {
            InterfaceC9124b interfaceC9124b = this.f21202k;
            if (interfaceC9124b instanceof C8458c0) {
                ((C8458c0) interfaceC9124b).f18826F.set(true);
            }
            AbstractC9183r.f21478b.post(new RunnableC9058d0(this));
        }
        AbstractC9183r.f21478b.post(new RunnableC8238y(this, m20483c((View) this.f21239p), str, new C9152g1(), enumC9150g, z, interfaceC7941o));
    }

    @Override // com.fyber.inneractive.sdk.renderers.C9074r
    /* JADX INFO: renamed from: a */
    public final boolean mo21865a(InneractiveUnitController inneractiveUnitController) {
        return inneractiveUnitController instanceof NativeAdUnitController;
    }

    @Override // com.fyber.inneractive.sdk.renderers.C9074r, com.fyber.inneractive.sdk.interfaces.InterfaceC8263d
    /* JADX INFO: renamed from: a */
    public final boolean mo20658a(AbstractC8236x abstractC8236x) {
        return abstractC8236x instanceof NativeAdContent;
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.trackers.InterfaceC8165c
    /* JADX INFO: renamed from: b */
    public final void mo20577b() {
        C8163a c8163a = this.f21203w;
        if (c8163a != null) {
            c8163a.m20574a();
            this.f21203w = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.renderers.InterfaceViewTreeObserverOnWindowFocusChangeListenerC9081y
    /* JADX INFO: renamed from: b */
    public final void mo21859b(ViewGroup viewGroup) {
        InterfaceC8889m interfaceC8889m;
        mo20657a(viewGroup);
        ImageView imageViewM21861c = m21861c(viewGroup);
        if (imageViewM21861c == null || (interfaceC8889m = this.f21236m) == null) {
            return;
        }
        ((AbstractC8881e) interfaceC8889m).setWatermarkView(imageViewM21861c);
    }

    @Override // com.fyber.inneractive.sdk.renderers.C9074r, com.fyber.inneractive.sdk.flow.AbstractC8076b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final void destroy() {
        C8163a c8163a = this.f21203w;
        if (c8163a != null) {
            c8163a.m20574a();
            this.f21203w = null;
        }
        WeakReference weakReference = this.f21204x;
        C8903t c8903t = weakReference != null ? (C8903t) weakReference.get() : null;
        if (c8903t != null) {
            c8903t.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
        }
        AbstractC9166l0.f21461a.m21983a(this.f21239p);
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8076b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final void initialize(InneractiveAdSpot inneractiveAdSpot) {
        super.initialize(inneractiveAdSpot);
        if (inneractiveAdSpot.getAdContent() instanceof C8235w0) {
            this.f17958b = ((C8235w0) inneractiveAdSpot.getAdContent()).f18367s;
        }
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        AbstractC9166l0.f21461a.m21985b(m20483c((View) this.f21239p).getApplicationContext());
        WeakReference weakReference = this.f21204x;
        C8903t c8903t = weakReference != null ? (C8903t) weakReference.get() : null;
        if (c8903t != null) {
            AbstractC9183r.f21478b.postDelayed(new RunnableC8880d(c8903t, z), 500L);
        }
    }

    @Override // com.fyber.inneractive.sdk.renderers.C9074r, com.fyber.inneractive.sdk.flow.AbstractC8076b0
    /* JADX INFO: renamed from: x */
    public final View mo20491x() {
        InneractiveAdSpot inneractiveAdSpot = this.f17957a;
        MediaView mediaView = (inneractiveAdSpot == null || !(inneractiveAdSpot.getAdContent() instanceof C8235w0)) ? null : ((C8235w0) this.f17957a.getAdContent()).f18362n;
        return mediaView != null ? mediaView : this.f21239p;
    }
}
