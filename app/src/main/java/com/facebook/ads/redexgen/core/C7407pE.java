package com.facebook.ads.redexgen.core;

import android.content.Context;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.pE */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@Deprecated
public final class C7407pE implements InterfaceC46335Y {
    public final Context A00;
    public final InterfaceC46335Y A01;
    public final InterfaceC46545t A02;

    public C7407pE(Context context, InterfaceC46545t interfaceC46545t, InterfaceC46335Y interfaceC46335Y) {
        this.A00 = context.getApplicationContext();
        this.A02 = interfaceC46545t;
        this.A01 = interfaceC46335Y;
    }

    public C7407pE(Context context, String str, InterfaceC46545t interfaceC46545t) {
        this(context, interfaceC46545t, new C4915AO().A01(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.InterfaceC46335Y
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final C4916AP A5I() {
        C4916AP c4916ap = new C4916AP(this.A00, this.A01.A5I());
        if (this.A02 != null) {
            c4916ap.A43(this.A02);
        }
        return c4916ap;
    }
}
