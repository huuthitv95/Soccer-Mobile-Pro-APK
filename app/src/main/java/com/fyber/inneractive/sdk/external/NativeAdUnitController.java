package com.fyber.inneractive.sdk.external;

import android.content.Context;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.C7809R;
import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.factories.AbstractC8071j;
import com.fyber.inneractive.sdk.flow.AbstractC8176s0;
import com.fyber.inneractive.sdk.flow.AbstractC8236x;
import com.fyber.inneractive.sdk.flow.C8121g;
import com.fyber.inneractive.sdk.flow.C8235w0;
import com.fyber.inneractive.sdk.flow.InterfaceC8126i0;
import com.fyber.inneractive.sdk.flow.nativead.InterfaceC8137a;
import com.fyber.inneractive.sdk.interfaces.InterfaceC8263d;
import com.fyber.inneractive.sdk.nativead.C8354d;
import com.fyber.inneractive.sdk.p278ui.IFyberAdIdentifier;
import com.fyber.inneractive.sdk.renderers.C9056c0;
import com.fyber.inneractive.sdk.renderers.C9060e0;
import com.fyber.inneractive.sdk.renderers.InterfaceViewTreeObserverOnWindowFocusChangeListenerC9081y;
import com.fyber.inneractive.sdk.response.AbstractC9087e;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class NativeAdUnitController extends AbstractC8176s0 implements InterfaceC8137a {

    /* JADX INFO: renamed from: a */
    public final HashSet f17936a = new HashSet();

    /* JADX INFO: renamed from: b */
    public ViewGroup f17937b;

    /* JADX INFO: renamed from: a */
    public final void m20462a() {
        ViewGroup viewGroup = this.f17937b;
        if (viewGroup != null) {
            this.f17937b = null;
            IAlog.m21945a("%s: unbindView called with %s", logPrefix(), viewGroup);
            IAlog.m21945a("%s: spot is %s", logPrefix(), getAdSpot());
            for (InneractiveAdRenderer inneractiveAdRenderer : new HashSet(this.f17936a)) {
                if (inneractiveAdRenderer instanceof InterfaceC8263d) {
                    InterfaceC8263d interfaceC8263d = (InterfaceC8263d) inneractiveAdRenderer;
                    if (interfaceC8263d.mo20659b(viewGroup)) {
                        IAlog.m21945a("%s: unbindView unbinding renderer %s", logPrefix(), inneractiveAdRenderer);
                        interfaceC8263d.mo20665s();
                        break;
                    }
                }
            }
        }
        Iterator it = new HashSet(this.f17936a).iterator();
        while (it.hasNext()) {
            ((InneractiveAdRenderer) it.next()).destroy();
        }
        this.f17936a.clear();
        this.f17937b = null;
        super.destroy();
    }

    @Override // com.fyber.inneractive.sdk.flow.nativead.InterfaceC8137a
    public void bind(MediaView mediaView) {
        InterfaceViewTreeObserverOnWindowFocusChangeListenerC9081y c9056c0;
        C8006r c8006r;
        IAlog.m21945a("%s: bindView called with parent: %s", logPrefix(), mediaView);
        InneractiveAdSpot adSpot = getAdSpot();
        AbstractC9087e abstractC9087e = null;
        if (adSpot != null) {
            Iterator it = new HashSet(this.f17936a).iterator();
            while (true) {
                if (!it.hasNext()) {
                    this.f17937b = mediaView;
                    Iterator it2 = AbstractC8071j.f17953a.f17954a.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            c9056c0 = null;
                            break;
                        }
                        ((C8354d) it2.next()).getClass();
                        if (adSpot.getAdContent() instanceof C8235w0) {
                            AbstractC8236x adContent = adSpot.getAdContent();
                            if (!(adContent instanceof C8235w0) || !adContent.isVideoAd()) {
                                c9056c0 = new C9056c0();
                                break;
                            } else {
                                c9056c0 = new C9060e0();
                                break;
                            }
                        }
                    }
                    if (c9056c0 == null) {
                        IAlog.m21950f("%s: Could not find a renderer for the given spot!", logPrefix());
                        break;
                    }
                    ((C8235w0) adSpot.getAdContent()).f18369u.f18140b = c9056c0;
                    c9056c0.initialize(adSpot);
                    selectContentController();
                    c9056c0.mo21859b(mediaView);
                    this.f17936a.add(c9056c0);
                    IAlog.m21945a("%s: created renderer %s", logPrefix(), c9056c0);
                    break;
                }
                InneractiveAdRenderer inneractiveAdRenderer = (InneractiveAdRenderer) it.next();
                if (inneractiveAdRenderer instanceof InterfaceC8263d) {
                    InterfaceC8263d interfaceC8263d = (InterfaceC8263d) inneractiveAdRenderer;
                    if (interfaceC8263d.mo20659b(mediaView)) {
                        interfaceC8263d.mo20661l();
                        IAlog.m21945a("%s: bindView returning an already attached renderer %s", logPrefix(), interfaceC8263d);
                        break;
                    }
                }
            }
        } else {
            IAlog.m21950f("NativeAdUnitController was not attached to an ad spot", new Object[0]);
        }
        InterfaceC8126i0 interfaceC8126i0 = this.mAdSpot.get();
        if (interfaceC8126i0 == null || interfaceC8126i0.getAdContent() == null) {
            c8006r = null;
        } else {
            AbstractC8236x adContent2 = interfaceC8126i0.getAdContent();
            abstractC9087e = adContent2.f18374b;
            c8006r = adContent2.f18375c;
        }
        View viewCreatePrivacyView = createPrivacyView(mediaView.getContext(), abstractC9087e, c8006r);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 83;
        mediaView.addView(viewCreatePrivacyView, layoutParams);
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8176s0
    public boolean canRefreshAd() {
        return false;
    }

    public View createPrivacyView(Context context, AbstractC9087e abstractC9087e, C8006r c8006r) {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(C7809R.layout.ia_layout_fyber_ad_identifier_relative, (ViewGroup) null, false);
        C8121g c8121g = new C8121g(context, false, null, abstractC9087e, c8006r);
        IFyberAdIdentifier.Corner corner = IFyberAdIdentifier.Corner.BOTTOM_LEFT;
        IFyberAdIdentifier iFyberAdIdentifier = c8121g.f18072d;
        iFyberAdIdentifier.f21412k = corner;
        iFyberAdIdentifier.mo21932a(viewGroup);
        viewGroup.setVisibility(0);
        return viewGroup;
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8176s0, com.fyber.inneractive.sdk.external.InneractiveUnitController
    public void destroy() {
        if (Looper.myLooper() == null || Looper.getMainLooper() != Looper.myLooper()) {
            AbstractC9183r.f21478b.post(new RunnableC8061h(this));
        } else {
            m20462a();
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8176s0
    public boolean supports(InneractiveAdSpot inneractiveAdSpot) {
        return inneractiveAdSpot.getAdContent() instanceof NativeAdContent;
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8176s0
    public boolean supportsRefresh() {
        return false;
    }
}
