package com.facebook.ads.redexgen.core;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ap */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4942Ap implements InterfaceC7518rI {
    public final /* synthetic */ C4941Ao A00;

    public C4942Ap(C4941Ao c4941Ao) {
        this.A00 = c4941Ao;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7518rI
    public final void AFq() {
        ArrayList arrayList;
        synchronized (this.A00.A06) {
            arrayList = new ArrayList(this.A00.A06.size());
            for (Runnable runnable : this.A00.A06.values()) {
                if (runnable != null) {
                    arrayList.add(runnable);
                }
            }
            this.A00.A06.clear();
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        if (this.A00.A01 != null) {
            this.A00.A01.AFq();
        }
    }
}
