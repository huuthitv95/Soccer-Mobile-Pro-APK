package com.fyber.inneractive.sdk.flow.endcard;

import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.endcard.loaders.listeners.InterfaceC8106a;
import com.fyber.inneractive.sdk.web.AbstractC9238i;
import com.fyber.inneractive.sdk.web.InterfaceC9232g;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.flow.endcard.t */
/* JADX INFO: loaded from: classes4.dex */
public final class C8114t implements InterfaceC9232g {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ InterfaceC8106a f18050a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ C8115u f18051b;

    public C8114t(C8115u c8115u, InterfaceC8106a interfaceC8106a) {
        this.f18051b = c8115u;
        this.f18050a = interfaceC8106a;
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC9232g
    /* JADX INFO: renamed from: a */
    public final void mo20538a(AbstractC9238i abstractC9238i) {
        this.f18051b.f18057h.set(false);
        this.f18051b.f18058i.mo20538a(abstractC9238i);
        this.f18050a.mo20527a();
    }

    @Override // com.fyber.inneractive.sdk.web.InterfaceC9232g
    /* JADX INFO: renamed from: a */
    public final void mo20539a(AbstractC9238i abstractC9238i, InneractiveInfrastructureError inneractiveInfrastructureError) {
        this.f18051b.f18057h.set(false);
        this.f18051b.f18058i.mo20539a(abstractC9238i, inneractiveInfrastructureError);
        this.f18050a.mo20528a(inneractiveInfrastructureError.description());
    }
}
