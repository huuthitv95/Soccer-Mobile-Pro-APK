package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.flow.AbstractC8221u0;
import com.fyber.inneractive.sdk.flow.C8219t0;
import com.fyber.inneractive.sdk.player.C8876t;
import com.fyber.inneractive.sdk.player.InterfaceC8487e;
import com.fyber.inneractive.sdk.player.controller.C8465g;
import com.fyber.inneractive.sdk.player.controller.InterfaceC8455b;
import com.fyber.inneractive.sdk.player.p277ui.C8882f;
import com.fyber.inneractive.sdk.player.p277ui.C8885i;
import com.fyber.inneractive.sdk.player.p277ui.InterfaceC8889m;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.renderers.f */
/* JADX INFO: loaded from: classes4.dex */
public final class C9061f extends AbstractC9062f0 {
    public C9061f(C8876t c8876t) {
        super(c8876t);
    }

    @Override // com.fyber.inneractive.sdk.renderers.AbstractC9062f0
    /* JADX INFO: renamed from: a */
    public final InterfaceC8455b mo21853a(InneractiveAdSpot inneractiveAdSpot, C8219t0 c8219t0) {
        if (this.f21205a == null) {
            Object selectedUnitController = inneractiveAdSpot.getSelectedUnitController();
            this.f21205a = new C8465g(this.f21207c, this.f21206b, inneractiveAdSpot.getAdContent().f18376d, c8219t0.f18375c, selectedUnitController instanceof AbstractC8221u0 ? ((AbstractC8221u0) selectedUnitController).isOverlayOutside() : false, IAConfigManager.f17654M.f17679k || c8219t0.f18378f, mo21866a());
        }
        return this.f21205a;
    }

    @Override // com.fyber.inneractive.sdk.renderers.AbstractC9062f0
    /* JADX INFO: renamed from: a */
    public final InterfaceC8889m mo21854a(Context context, C8006r c8006r) {
        if (this.f21206b == null) {
            this.f21206b = new C8885i(context, new C8882f(), this.f21207c, c8006r, mo21866a());
        }
        return this.f21206b;
    }

    @Override // com.fyber.inneractive.sdk.renderers.AbstractC9062f0
    /* JADX INFO: renamed from: a */
    public final void mo21855a(InterfaceC8487e interfaceC8487e) {
        this.f21207c.getClass();
        interfaceC8487e.mo20950a();
    }

    @Override // com.fyber.inneractive.sdk.renderers.AbstractC9062f0
    /* JADX INFO: renamed from: b */
    public final void mo21856b() {
        this.f21207c.getClass();
    }
}
