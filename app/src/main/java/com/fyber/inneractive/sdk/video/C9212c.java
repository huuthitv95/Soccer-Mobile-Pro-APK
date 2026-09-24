package com.fyber.inneractive.sdk.video;

import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.factories.InterfaceC8068g;
import com.fyber.inneractive.sdk.flow.C8219t0;
import com.fyber.inneractive.sdk.interfaces.InterfaceC8265f;
import com.fyber.inneractive.sdk.renderers.C9075s;
import com.fyber.inneractive.sdk.renderers.C9080x;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.video.c */
/* JADX INFO: loaded from: classes4.dex */
public final class C9212c implements InterfaceC8068g {
    @Override // com.fyber.inneractive.sdk.factories.InterfaceC8068g
    /* JADX INFO: renamed from: a */
    public final boolean mo20468a(InneractiveAdSpot inneractiveAdSpot) {
        return inneractiveAdSpot.getAdContent() != null && (inneractiveAdSpot.getAdContent() instanceof C8219t0);
    }

    @Override // com.fyber.inneractive.sdk.factories.InterfaceC8068g
    /* JADX INFO: renamed from: b */
    public final InterfaceC8265f mo20469b(InneractiveAdSpot inneractiveAdSpot) {
        InneractiveAdRequest inneractiveAdRequest = inneractiveAdSpot.getAdContent().f18373a;
        return (inneractiveAdSpot.getAdContent().mo20599b() && (inneractiveAdRequest == null || inneractiveAdRequest.getAllowFullscreen())) ? new C9080x() : new C9075s();
    }
}
