package com.facebook.ads.redexgen.core;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ar */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4944Ar implements InterfaceC7534rY {
    public final List<InterfaceC7535rZ> A00 = new ArrayList();

    @Override // com.facebook.ads.redexgen.core.InterfaceC7534rY
    public final InterfaceC7535rZ A6i(int i) {
        this.A00.get(i);
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator<InterfaceC7535rZ> iterator() {
        return this.A00.iterator();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC7534rY
    public final int size() {
        return this.A00.size();
    }
}
