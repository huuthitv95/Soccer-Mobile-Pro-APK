package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveContentController;
import com.fyber.inneractive.sdk.external.InneractiveUnitController;
import com.fyber.inneractive.sdk.util.AbstractC9195v;
import com.fyber.inneractive.sdk.util.IAlog;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.s0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC8176s0 implements InneractiveUnitController {
    protected WeakReference<InterfaceC8126i0> mAdSpot;
    protected Set<InneractiveContentController> mContentControllers = new HashSet();
    protected InneractiveUnitController.EventsListener mEventsListener;
    protected InneractiveContentController mSelectedContentController;

    @Override // com.fyber.inneractive.sdk.external.InneractiveUnitController
    public void addContentController(InneractiveContentController inneractiveContentController) {
        this.mContentControllers.add(inneractiveContentController);
    }

    public boolean canRefreshAd() {
        return supportsRefresh();
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveUnitController
    public void destroy() {
        Iterator<InneractiveContentController> it = this.mContentControllers.iterator();
        while (it.hasNext()) {
            it.next().destroy();
        }
        this.mContentControllers.clear();
        this.mSelectedContentController = null;
        this.mAdSpot = null;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveUnitController
    public InneractiveAdSpot getAdSpot() {
        return (InterfaceC8126i0) AbstractC9195v.m22024a(this.mAdSpot);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveUnitController
    public InneractiveUnitController.EventsListener getEventsListener() {
        return this.mEventsListener;
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveUnitController
    public InneractiveContentController getSelectedContentController() {
        return this.mSelectedContentController;
    }

    public String logPrefix() {
        return IAlog.m21943a(this);
    }

    public void selectContentController() {
        InneractiveAdSpot inneractiveAdSpot = (InneractiveAdSpot) AbstractC9195v.m22024a(this.mAdSpot);
        if (inneractiveAdSpot == null) {
            IAlog.m21950f("selectContentController called, but ad spot is null", new Object[0]);
            return;
        }
        for (InneractiveContentController inneractiveContentController : this.mContentControllers) {
            AbstractC8128j0 abstractC8128j0 = (AbstractC8128j0) inneractiveContentController;
            if (abstractC8128j0.canControl(inneractiveAdSpot)) {
                this.mSelectedContentController = inneractiveContentController;
                abstractC8128j0.setAdSpot(inneractiveAdSpot);
            }
        }
    }

    public void setAdSpot(InterfaceC8126i0 interfaceC8126i0) {
        this.mAdSpot = new WeakReference<>(interfaceC8126i0);
    }

    @Override // com.fyber.inneractive.sdk.external.InneractiveUnitController
    public void setEventsListener(InneractiveUnitController.EventsListener eventsListener) {
        this.mEventsListener = eventsListener;
    }

    public abstract boolean supports(InneractiveAdSpot inneractiveAdSpot);

    public abstract boolean supportsRefresh();
}
