package com.fyber.inneractive.sdk.external;

import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity;
import com.fyber.inneractive.sdk.config.C8016l0;
import com.fyber.inneractive.sdk.config.C8028r0;
import com.fyber.inneractive.sdk.config.C8043t0;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.factories.AbstractC8063b;
import com.fyber.inneractive.sdk.factories.AbstractC8069h;
import com.fyber.inneractive.sdk.factories.InterfaceC8062a;
import com.fyber.inneractive.sdk.factories.InterfaceC8068g;
import com.fyber.inneractive.sdk.flow.AbstractC8176s0;
import com.fyber.inneractive.sdk.flow.C8124h0;
import com.fyber.inneractive.sdk.flow.InterfaceC8122g0;
import com.fyber.inneractive.sdk.flow.InterfaceC8126i0;
import com.fyber.inneractive.sdk.flow.InterfaceC8174r0;
import com.fyber.inneractive.sdk.interfaces.InterfaceC8263d;
import com.fyber.inneractive.sdk.interfaces.InterfaceC8265f;
import com.fyber.inneractive.sdk.util.AbstractC9183r;
import com.fyber.inneractive.sdk.util.AbstractC9195v;
import com.fyber.inneractive.sdk.util.IAlog;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class InneractiveAdViewUnitController extends AbstractC8176s0 implements InterfaceC8122g0, InneractiveFullscreenAdActivity.FullScreenRendererProvider {
    public static final int DISABLED_REFRESH_INTERVAL = -1;

    /* JADX INFO: renamed from: a */
    public final HashSet f17918a;

    /* JADX INFO: renamed from: b */
    public boolean f17919b;

    /* JADX INFO: renamed from: c */
    public ViewGroup f17920c;

    /* JADX INFO: renamed from: d */
    public final int f17921d;
    protected int mAdContentHeight;
    protected int mAdContentWidth;

    public InneractiveAdViewUnitController() {
        this.f17919b = false;
        this.mAdContentWidth = -1;
        this.mAdContentHeight = -1;
        this.f17921d = 0;
        this.f17918a = new HashSet();
    }

    public InneractiveAdViewUnitController(int i) {
        this();
        if (i >= 30) {
            IAlog.m21945a("InneractiveAdViewUnitController: Overriding remote config refresh interval to: %d", Integer.valueOf(i));
            this.f17921d = i;
        } else {
            IAlog.m21945a("InneractiveAdViewUnitController: Overriding remote config refresh interval - value too low. Setting to default: %d -> %d", Integer.valueOf(i), 30);
            this.f17921d = 30;
        }
    }

    public InneractiveAdViewUnitController(boolean z) {
        this();
        if (z) {
            this.f17921d = -1;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m20460a() {
        this.f17919b = true;
        Iterator it = new HashSet(this.f17918a).iterator();
        while (it.hasNext()) {
            ((InneractiveAdRenderer) it.next()).destroy();
        }
        this.f17918a.clear();
        this.f17920c = null;
        super.destroy();
    }

    public void bindView(ViewGroup viewGroup) {
        InterfaceC8263d interfaceC8263dMo20463a;
        IAlog.m21945a("%sPPPP bindView called with parent: %s", logPrefix(), viewGroup);
        InneractiveAdSpot adSpot = getAdSpot();
        if (adSpot == null) {
            IAlog.m21950f("InneractiveFullscreenUnitController was not attached to an ad spot", new Object[0]);
            return;
        }
        IAlog.m21945a("%sPPPP bindView spot is %s", logPrefix(), adSpot);
        for (InneractiveAdRenderer inneractiveAdRenderer : new HashSet(this.f17918a)) {
            if (inneractiveAdRenderer instanceof InterfaceC8263d) {
                InterfaceC8263d interfaceC8263d = (InterfaceC8263d) inneractiveAdRenderer;
                if (interfaceC8263d.mo20659b(viewGroup)) {
                    interfaceC8263d.mo20661l();
                    IAlog.m21945a("%sPPPP bindAdToRenderer returning an already attached renderer %s", logPrefix(), interfaceC8263d);
                    return;
                }
            }
        }
        this.f17920c = viewGroup;
        Iterator it = AbstractC8063b.f17947a.f17948a.iterator();
        while (true) {
            if (!it.hasNext()) {
                interfaceC8263dMo20463a = null;
                break;
            }
            InterfaceC8062a interfaceC8062a = (InterfaceC8062a) it.next();
            if (interfaceC8062a.mo20464a(adSpot)) {
                interfaceC8263dMo20463a = interfaceC8062a.mo20463a();
                break;
            }
        }
        int i = this.f17921d;
        if (i != 0) {
            interfaceC8263dMo20463a.mo20656a(i);
        }
        if (interfaceC8263dMo20463a == null) {
            IAlog.m21950f("%sCould not find a renderer for the given spot! Did you add the appropriate module to your project?", logPrefix());
            return;
        }
        interfaceC8263dMo20463a.initialize(adSpot);
        selectContentController();
        interfaceC8263dMo20463a.mo20657a(viewGroup);
        this.f17918a.add(interfaceC8263dMo20463a);
        IAlog.m21945a("%sPPPP bindView created renderer %s", logPrefix(), interfaceC8263dMo20463a);
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8176s0
    public boolean canRefreshAd() {
        if (!supportsRefresh()) {
            return false;
        }
        Iterator it = this.f17918a.iterator();
        while (it.hasNext()) {
            if (!((InneractiveAdRenderer) it.next()).canRefreshAd()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8176s0, com.fyber.inneractive.sdk.external.InneractiveUnitController
    public void destroy() {
        if (Looper.myLooper() == null || Looper.getMainLooper() != Looper.myLooper()) {
            AbstractC9183r.f21478b.post(new RunnableC8059f(this));
        } else {
            m20460a();
        }
    }

    public int getAdContentHeight() {
        int iMo20662n;
        for (InneractiveAdRenderer inneractiveAdRenderer : this.f17918a) {
            if ((inneractiveAdRenderer instanceof InterfaceC8263d) && (iMo20662n = ((InterfaceC8263d) inneractiveAdRenderer).mo20662n()) > 0) {
                return iMo20662n;
            }
        }
        return this.mAdContentHeight;
    }

    public int getAdContentWidth() {
        int iMo20660d;
        for (InneractiveAdRenderer inneractiveAdRenderer : this.f17918a) {
            if ((inneractiveAdRenderer instanceof InterfaceC8263d) && (iMo20660d = ((InterfaceC8263d) inneractiveAdRenderer).mo20660d()) > 0) {
                return iMo20660d;
            }
        }
        return this.mAdContentWidth;
    }

    @Override // com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity.FullScreenRendererProvider
    public InterfaceC8265f getFullscreenRenderer() {
        InterfaceC8265f interfaceC8265fMo20469b;
        InneractiveAdSpot inneractiveAdSpot = (InneractiveAdSpot) AbstractC9195v.m22024a(this.mAdSpot);
        for (InterfaceC8068g interfaceC8068g : AbstractC8069h.f17951a.f17952a) {
            if (interfaceC8068g.mo20468a(inneractiveAdSpot)) {
                interfaceC8265fMo20469b = interfaceC8068g.mo20469b(inneractiveAdSpot);
                this.f17918a.add(interfaceC8265fMo20469b);
                return interfaceC8265fMo20469b;
            }
        }
        interfaceC8265fMo20469b = null;
        this.f17918a.add(interfaceC8265fMo20469b);
        return interfaceC8265fMo20469b;
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8176s0, com.fyber.inneractive.sdk.external.InneractiveUnitController
    public InneractiveContentController getSelectedContentController() {
        return this.mSelectedContentController;
    }

    @Override // com.fyber.inneractive.sdk.flow.InterfaceC8122g0
    public void onAdRefreshFailed(InneractiveAdSpot inneractiveAdSpot, InneractiveErrorCode inneractiveErrorCode) {
        for (InneractiveAdRenderer inneractiveAdRenderer : new HashSet(this.f17918a)) {
            if (inneractiveAdRenderer instanceof InterfaceC8263d) {
                ((InterfaceC8263d) inneractiveAdRenderer).mo20663p();
                return;
            }
        }
    }

    @Override // com.fyber.inneractive.sdk.flow.InterfaceC8122g0
    public void onAdRefreshed(InneractiveAdSpot inneractiveAdSpot) {
        InterfaceC8263d interfaceC8263d;
        Iterator it = new HashSet(this.f17918a).iterator();
        while (true) {
            if (!it.hasNext()) {
                interfaceC8263d = null;
                break;
            }
            InneractiveAdRenderer inneractiveAdRenderer = (InneractiveAdRenderer) it.next();
            if (inneractiveAdRenderer instanceof InterfaceC8263d) {
                interfaceC8263d = (InterfaceC8263d) inneractiveAdRenderer;
                if (interfaceC8263d.mo20658a(inneractiveAdSpot.getAdContent())) {
                    break;
                }
            }
        }
        if (interfaceC8263d != null) {
            interfaceC8263d.mo20657a((ViewGroup) null);
        } else {
            onAdRefreshFailed(inneractiveAdSpot, InneractiveErrorCode.SDK_INTERNAL_ERROR);
        }
        try {
            if (inneractiveAdSpot instanceof C8124h0) {
                int i = IAlog.f21426a;
                IAlog.m21948d("%s %s", "AD_REFRESH", ((C8124h0) inneractiveAdSpot).f18080h.f18187d.mo20773b());
            }
        } catch (Exception unused) {
        }
        IAlog.m21945a("InneractiveFullscreenUnitController onAdRefreshed called", new Object[0]);
    }

    public void refreshAd() {
        IAlog.m21945a("InneractiveFullscreenUnitController refreshAd called", new Object[0]);
        InneractiveAdSpot inneractiveAdSpot = (InneractiveAdSpot) AbstractC9195v.m22024a(this.mAdSpot);
        if (inneractiveAdSpot == null || !(inneractiveAdSpot instanceof InterfaceC8174r0)) {
            return;
        }
        ((InterfaceC8174r0) inneractiveAdSpot).mo20546a(this);
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8176s0
    public boolean supports(InneractiveAdSpot inneractiveAdSpot) {
        C8028r0 c8028r0 = (C8028r0) inneractiveAdSpot.getAdContent().f18376d;
        if (c8028r0.f17815e != null) {
            return false;
        }
        C8016l0 c8016l0 = c8028r0.f17813c;
        if (c8016l0 != null) {
            if (UnitDisplayType.BANNER.equals(c8016l0.f17798b) || UnitDisplayType.MRECT.equals(c8016l0.f17798b)) {
                return true;
            }
            if (UnitDisplayType.INTERSTITIAL.equals(c8016l0.f17798b)) {
                return inneractiveAdSpot.getCurrentProcessedRequest() != null && inneractiveAdSpot.getCurrentProcessedRequest().getAllowFullscreen();
            }
        }
        C8043t0 c8043t0 = c8028r0.f17816f;
        return c8043t0 != null && (UnitDisplayType.LANDSCAPE.equals(c8043t0.f17876j) || UnitDisplayType.SQUARE.equals(c8043t0.f17876j) || UnitDisplayType.MRECT.equals(c8043t0.f17876j));
    }

    @Override // com.fyber.inneractive.sdk.flow.AbstractC8176s0
    public boolean supportsRefresh() {
        return true;
    }

    public void unbindFullscreenRenderer(InterfaceC8265f interfaceC8265f) {
        WeakReference<InterfaceC8126i0> weakReference;
        IAlog.m21945a("%sremoving full screen ad renderer %s", logPrefix(), interfaceC8265f);
        HashSet hashSet = this.f17918a;
        if (hashSet != null) {
            hashSet.remove(interfaceC8265f);
        }
        if (this.f17919b) {
            return;
        }
        for (InneractiveAdRenderer inneractiveAdRenderer : new HashSet(this.f17918a)) {
            if (inneractiveAdRenderer instanceof InterfaceC8263d) {
                ((InterfaceC8263d) inneractiveAdRenderer).mo20664q();
                if (this.mEventsListener != null && (weakReference = this.mAdSpot) != null && weakReference.get() != null) {
                    ((InneractiveAdViewEventsListener) this.mEventsListener).onAdCollapsed(this.mAdSpot.get());
                }
            }
        }
    }

    public void unbindView(View view) {
        if (this.f17920c != view) {
            IAlog.m21950f("%s unbindView invoked with incorrect view, was - %s received - %s", logPrefix(), this.f17920c, view);
        } else {
            this.f17920c = null;
        }
        IAlog.m21945a("%sPPPP unbindView called with %s", logPrefix(), view);
        IAlog.m21945a("%sPPPP spot is %s", logPrefix(), this.mAdSpot);
        for (InneractiveAdRenderer inneractiveAdRenderer : new HashSet(this.f17918a)) {
            if (inneractiveAdRenderer instanceof InterfaceC8263d) {
                InterfaceC8263d interfaceC8263d = (InterfaceC8263d) inneractiveAdRenderer;
                if (interfaceC8263d.mo20659b(view)) {
                    IAlog.m21945a("%sPPPP unbindView unbinding renderer %s", logPrefix(), inneractiveAdRenderer);
                    interfaceC8263d.mo20665s();
                    this.f17918a.remove(interfaceC8263d);
                    return;
                }
            }
        }
    }
}
