package com.facebook.ads.redexgen.core;

import android.content.Context;
import android.view.View;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.eB */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C6746eB implements InterfaceC6269WS {
    @Override // com.facebook.ads.redexgen.core.InterfaceC6269WS
    public final void AIZ(Throwable th, Object obj) {
        if (obj instanceof InterfaceC6063T4) {
            C6902gi adContext = ((InterfaceC6063T4) obj).A6m();
            if (adContext != null) {
                adContext.A0Q(th);
                return;
            }
            return;
        }
        if (!(obj instanceof View)) {
            return;
        }
        Context context = ((View) obj).getContext();
        if (!(context instanceof C6902gi)) {
            return;
        }
        ((C6902gi) context).A0Q(th);
    }
}
