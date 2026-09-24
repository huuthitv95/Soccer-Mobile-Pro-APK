package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import com.fyber.inneractive.sdk.config.AbstractC7945a;
import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.flow.AbstractC8221u0;
import com.fyber.inneractive.sdk.flow.C8219t0;
import com.fyber.inneractive.sdk.player.C8876t;
import com.fyber.inneractive.sdk.player.InterfaceC8487e;
import com.fyber.inneractive.sdk.player.controller.C8478s;
import com.fyber.inneractive.sdk.player.controller.InterfaceC8455b;
import com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s;
import com.fyber.inneractive.sdk.player.p277ui.C8884h;
import com.fyber.inneractive.sdk.player.p277ui.C8885i;
import com.fyber.inneractive.sdk.player.p277ui.C8891o;
import com.fyber.inneractive.sdk.player.p277ui.InterfaceC8889m;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.renderers.a */
/* JADX INFO: loaded from: classes4.dex */
public class C9051a extends AbstractC9062f0 {
    public C9051a(C8876t c8876t) {
        super(c8876t);
    }

    @Override // com.fyber.inneractive.sdk.renderers.AbstractC9062f0
    /* JADX INFO: renamed from: a */
    public InterfaceC8455b mo21853a(InneractiveAdSpot inneractiveAdSpot, C8219t0 c8219t0) {
        if (this.f21205a == null) {
            Object selectedUnitController = inneractiveAdSpot.getSelectedUnitController();
            this.f21205a = new C8478s(this.f21207c, (C8891o) this.f21206b, AbstractC7945a.m20382a(inneractiveAdSpot.getAdContent().f18374b.f21313m), c8219t0.f18375c, selectedUnitController instanceof AbstractC8221u0 ? ((AbstractC8221u0) selectedUnitController).isOverlayOutside() : false, mo21866a());
        }
        return this.f21205a;
    }

    @Override // com.fyber.inneractive.sdk.renderers.AbstractC9062f0
    /* JADX INFO: renamed from: a */
    public InterfaceC8889m mo21854a(Context context, C8006r c8006r) {
        AbstractC8902s abstractC8902s = this.f21206b;
        return abstractC8902s == null ? new C8885i(context, new C8884h(), this.f21207c, c8006r, mo21866a()) : abstractC8902s;
    }

    @Override // com.fyber.inneractive.sdk.renderers.AbstractC9062f0
    /* JADX INFO: renamed from: a */
    public final void mo21855a(InterfaceC8487e interfaceC8487e) {
    }

    @Override // com.fyber.inneractive.sdk.renderers.AbstractC9062f0
    /* JADX INFO: renamed from: b */
    public final void mo21856b() {
        this.f21207c.getClass();
    }
}
