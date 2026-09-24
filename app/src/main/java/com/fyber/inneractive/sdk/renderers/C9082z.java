package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import com.fyber.inneractive.sdk.config.AbstractC7945a;
import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.flow.C8219t0;
import com.fyber.inneractive.sdk.player.C8876t;
import com.fyber.inneractive.sdk.player.controller.AbstractC8485z;
import com.fyber.inneractive.sdk.player.controller.C8458c0;
import com.fyber.inneractive.sdk.player.controller.InterfaceC8455b;
import com.fyber.inneractive.sdk.player.p277ui.C8884h;
import com.fyber.inneractive.sdk.player.p277ui.C8903t;
import com.fyber.inneractive.sdk.player.p277ui.InterfaceC8889m;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.renderers.z */
/* JADX INFO: loaded from: classes4.dex */
public final class C9082z extends C9051a {
    public C9082z(C8876t c8876t) {
        super(c8876t);
    }

    @Override // com.fyber.inneractive.sdk.renderers.C9051a, com.fyber.inneractive.sdk.renderers.AbstractC9062f0
    /* JADX INFO: renamed from: a */
    public final InterfaceC8455b mo21853a(InneractiveAdSpot inneractiveAdSpot, C8219t0 c8219t0) {
        AbstractC8485z abstractC8485z = this.f21205a;
        if (abstractC8485z != null) {
            return abstractC8485z;
        }
        this.f21205a = new C8458c0(this.f21207c, (C8903t) this.f21206b, AbstractC7945a.m20382a(inneractiveAdSpot.getAdContent().f18374b.f21313m), c8219t0.f18375c);
        return super.mo21853a(inneractiveAdSpot, c8219t0);
    }

    @Override // com.fyber.inneractive.sdk.renderers.C9051a, com.fyber.inneractive.sdk.renderers.AbstractC9062f0
    /* JADX INFO: renamed from: a */
    public final InterfaceC8889m mo21854a(Context context, C8006r c8006r) {
        if (this.f21206b == null) {
            this.f21206b = new C8903t(context, new C8884h(), c8006r);
        }
        return this.f21206b;
    }

    @Override // com.fyber.inneractive.sdk.renderers.AbstractC9062f0
    /* JADX INFO: renamed from: a */
    public final String mo21866a() {
        return null;
    }
}
