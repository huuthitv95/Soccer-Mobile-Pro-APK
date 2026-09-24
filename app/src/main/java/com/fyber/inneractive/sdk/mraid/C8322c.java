package com.fyber.inneractive.sdk.mraid;

import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.factories.InterfaceC8068g;
import com.fyber.inneractive.sdk.interfaces.InterfaceC8265f;
import com.fyber.inneractive.sdk.renderers.C9078v;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.mraid.c */
/* JADX INFO: loaded from: classes4.dex */
public final class C8322c implements InterfaceC8068g {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ IAMraidKit f18590a;

    public C8322c(IAMraidKit iAMraidKit) {
        this.f18590a = iAMraidKit;
    }

    @Override // com.fyber.inneractive.sdk.factories.InterfaceC8068g
    /* JADX INFO: renamed from: a */
    public final boolean mo20468a(InneractiveAdSpot inneractiveAdSpot) {
        return this.f18590a.isMRaidSpotContent(inneractiveAdSpot);
    }

    @Override // com.fyber.inneractive.sdk.factories.InterfaceC8068g
    /* JADX INFO: renamed from: b */
    public final InterfaceC8265f mo20469b(InneractiveAdSpot inneractiveAdSpot) {
        return new C9078v();
    }
}
