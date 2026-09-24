package com.fyber.inneractive.sdk.protobuf;

import java.util.Iterator;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.q3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9004q3 implements Iterator {

    /* JADX INFO: renamed from: a */
    public final Iterator f21098a;

    public C9004q3(C9010r3 c9010r3) {
        this.f21098a = c9010r3.f21105a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f21098a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return (String) this.f21098a.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
