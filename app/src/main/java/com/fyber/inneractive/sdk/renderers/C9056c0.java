package com.fyber.inneractive.sdk.renderers;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.fyber.inneractive.sdk.click.InterfaceC7941o;
import com.fyber.inneractive.sdk.flow.AbstractC8236x;
import com.fyber.inneractive.sdk.flow.C8235w0;
import com.fyber.inneractive.sdk.flow.RunnableC8238y;
import com.fyber.inneractive.sdk.flow.nativead.trackers.C8163a;
import com.fyber.inneractive.sdk.p278ui.controller.C9123a;
import com.fyber.inneractive.sdk.p278ui.controller.InterfaceC9124b;
import com.fyber.inneractive.sdk.util.AbstractC9166l0;
import com.fyber.inneractive.sdk.util.AbstractC9174o;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.AbstractC9195v;
import com.fyber.inneractive.sdk.util.C9152g1;
import com.fyber.inneractive.sdk.util.C9172n0;
import com.fyber.inneractive.sdk.util.EnumC9150g;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.InterfaceC9169m0;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.renderers.c0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9056c0 extends AbstractC9059e implements InterfaceViewTreeObserverOnWindowFocusChangeListenerC9081y, InterfaceC9169m0 {

    /* JADX INFO: renamed from: l */
    public ViewGroup f21186l;

    /* JADX INFO: renamed from: n */
    public C8163a f21188n;

    /* JADX INFO: renamed from: o */
    public ImageView f21189o;

    /* JADX INFO: renamed from: m */
    public boolean f21187m = false;

    /* JADX INFO: renamed from: p */
    public final C9052a0 f21190p = new C9052a0(this);

    static {
        IAlog.m21942a(C9056c0.class);
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8076b0
    /* JADX INFO: renamed from: C */
    public final boolean mo20473C() {
        return false;
    }

    @Override // com.fyber.inneractive.sdk.util.InterfaceC9169m0
    /* JADX INFO: renamed from: a */
    public final void mo21858a(float f, Rect rect) {
        InterfaceC9124b interfaceC9124b = this.f21202k;
        if (interfaceC9124b != null) {
            ((C9123a) interfaceC9124b).mo20861a(f);
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.InterfaceC8147k
    /* JADX INFO: renamed from: a */
    public final void mo20568a(String str, boolean z, EnumC9150g enumC9150g, InterfaceC7941o interfaceC7941o) {
        if (!this.f21187m) {
            AbstractC9183r.f21478b.post(new RunnableC9054b0(this));
            InterfaceC9124b interfaceC9124b = this.f21202k;
            if (interfaceC9124b instanceof C9123a) {
                ((C9123a) interfaceC9124b).f21419b.set(true);
            }
        }
        AbstractC9183r.f21478b.post(new RunnableC8238y(this, AbstractC9174o.m21989a(mo20491x()), str, new C9152g1(), enumC9150g, z, interfaceC7941o));
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.trackers.InterfaceC8165c
    /* JADX INFO: renamed from: b */
    public final void mo20577b() {
        C8163a c8163a = this.f21188n;
        if (c8163a != null) {
            c8163a.m20574a();
        }
    }

    @Override // com.fyber.inneractive.sdk.renderers.InterfaceViewTreeObserverOnWindowFocusChangeListenerC9081y
    /* JADX INFO: renamed from: b */
    public final void mo21859b(ViewGroup viewGroup) {
        if (this.f17957a == null) {
            IAlog.m21950f("%sYou must set the spot to render before calling renderAd", IAlog.m21943a(this));
            return;
        }
        this.f21186l = viewGroup;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        ImageView imageView = new ImageView(this.f21186l.getContext());
        this.f21189o = imageView;
        imageView.setImageURI(((C8235w0) this.f17958b).f18361m);
        this.f21189o.getViewTreeObserver().addOnWindowFocusChangeListener(this);
        this.f21186l.setLayoutParams(layoutParams);
        this.f21186l.addView(this.f21189o, layoutParams);
        C9123a c9123a = new C9123a();
        this.f21202k = c9123a;
        c9123a.f21418a = this.f21190p;
        C9172n0 c9172n0 = AbstractC9166l0.f21461a;
        ViewGroup viewGroup2 = this.f21186l;
        c9172n0.getClass();
        c9172n0.m21982a(viewGroup2.getContext(), viewGroup2, this);
        m21861c(this.f21186l);
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8076b0, com.fyber.inneractive.sdk.external.InneractiveAdRenderer
    public final void destroy() {
        C8163a c8163a = this.f21188n;
        if (c8163a != null) {
            c8163a.m20574a();
            this.f21188n = null;
        }
        ImageView imageView = this.f21189o;
        if (imageView != null) {
            imageView.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
            this.f21189o = null;
        }
        AbstractC9166l0.f21461a.m21983a(this.f21186l);
        AbstractC9195v.m22027a(this.f21186l);
        this.f21186l = null;
        InterfaceC9124b interfaceC9124b = this.f21202k;
        if (interfaceC9124b != null) {
            ((C9123a) interfaceC9124b).f21418a = null;
        }
        super.destroy();
    }

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        AbstractC9166l0.f21461a.m21985b(AbstractC9174o.m21989a(mo20491x()).getApplicationContext());
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8076b0
    /* JADX INFO: renamed from: x */
    public final View mo20491x() {
        AbstractC8236x abstractC8236x = this.f17958b;
        if (abstractC8236x != null) {
            C8235w0 c8235w0 = (C8235w0) abstractC8236x;
            if (c8235w0.f18362n != null) {
                return c8235w0.f18362n;
            }
        }
        return this.f21186l;
    }
}
