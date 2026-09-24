package com.fyber.inneractive.sdk.renderers;

import com.fyber.inneractive.sdk.p278ui.controller.InterfaceC9124b;
import com.fyber.inneractive.sdk.player.InterfaceC8487e;
import com.fyber.inneractive.sdk.player.controller.C8478s;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.renderers.o */
/* JADX INFO: loaded from: classes4.dex */
public final class C9071o implements InterfaceC8487e {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C9074r f21232a;

    public C9071o(C9074r c9074r) {
        this.f21232a = c9074r;
    }

    @Override // com.fyber.inneractive.sdk.player.InterfaceC8487e
    /* JADX INFO: renamed from: a */
    public final void mo20950a() {
        InterfaceC9124b interfaceC9124b = this.f21232a.f21202k;
        if (interfaceC9124b != null) {
            ((C8478s) interfaceC9124b).mo20852b(false);
            ((C8478s) this.f21232a.f21202k).m20949y();
        }
    }
}
