package com.fyber.inneractive.sdk.video;

import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.factories.InterfaceC8062a;
import com.fyber.inneractive.sdk.flow.C8219t0;
import com.fyber.inneractive.sdk.interfaces.InterfaceC8263d;
import com.fyber.inneractive.sdk.renderers.C9074r;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.video.d */
/* JADX INFO: loaded from: classes4.dex */
public final class C9213d implements InterfaceC8062a {
    @Override // com.fyber.inneractive.sdk.factories.InterfaceC8062a
    /* JADX INFO: renamed from: a */
    public final InterfaceC8263d mo20463a() {
        return new C9074r();
    }

    @Override // com.fyber.inneractive.sdk.factories.InterfaceC8062a
    /* JADX INFO: renamed from: a */
    public final boolean mo20464a(InneractiveAdSpot inneractiveAdSpot) {
        return inneractiveAdSpot.getAdContent() != null && (inneractiveAdSpot.getAdContent() instanceof C8219t0);
    }
}
