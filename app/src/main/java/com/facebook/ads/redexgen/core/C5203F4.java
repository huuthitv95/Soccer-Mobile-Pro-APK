package com.facebook.ads.redexgen.core;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.F4 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5203F4 {
    public final CopyOnWriteArrayList<C5202F3> A00 = new CopyOnWriteArrayList<>();

    public final void A00(int i, long j, long j2) {
        Iterator<C5202F3> it = this.A00.iterator();
        if (it.hasNext()) {
            it.next();
            C5202F3.A02(null);
            throw null;
        }
    }
}
