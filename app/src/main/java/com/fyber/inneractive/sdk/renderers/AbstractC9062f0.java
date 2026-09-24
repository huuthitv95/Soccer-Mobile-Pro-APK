package com.fyber.inneractive.sdk.renderers;

import android.content.Context;
import com.fyber.inneractive.sdk.config.global.C8006r;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.flow.C8219t0;
import com.fyber.inneractive.sdk.player.C8870n;
import com.fyber.inneractive.sdk.player.C8876t;
import com.fyber.inneractive.sdk.player.InterfaceC8487e;
import com.fyber.inneractive.sdk.player.controller.AbstractC8485z;
import com.fyber.inneractive.sdk.player.controller.InterfaceC8455b;
import com.fyber.inneractive.sdk.player.p277ui.AbstractC8902s;
import com.fyber.inneractive.sdk.player.p277ui.InterfaceC8889m;
import com.fyber.inneractive.sdk.response.AbstractC9087e;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.renderers.f0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9062f0 {

    /* JADX INFO: renamed from: a */
    public AbstractC8485z f21205a;

    /* JADX INFO: renamed from: b */
    public AbstractC8902s f21206b;

    /* JADX INFO: renamed from: c */
    public final C8870n f21207c;

    public AbstractC9062f0(C8876t c8876t) {
        this.f21207c = (C8870n) c8876t.f20853f;
    }

    /* JADX INFO: renamed from: a */
    public abstract InterfaceC8455b mo21853a(InneractiveAdSpot inneractiveAdSpot, C8219t0 c8219t0);

    /* JADX INFO: renamed from: a */
    public abstract InterfaceC8889m mo21854a(Context context, C8006r c8006r);

    /* JADX INFO: renamed from: a */
    public String mo21866a() {
        C8219t0 c8219t0;
        C8870n c8870n = this.f21207c;
        AbstractC9087e abstractC9087e = (c8870n == null || (c8219t0 = c8870n.f20773b) == null) ? null : c8219t0.f18374b;
        if (abstractC9087e != null) {
            return abstractC9087e.f21293C;
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo21855a(InterfaceC8487e interfaceC8487e);

    /* JADX INFO: renamed from: b */
    public abstract void mo21856b();
}
