package com.fyber.inneractive.sdk.protobuf;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.o1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8990o1 implements Iterator {

    /* JADX INFO: renamed from: a */
    public final Iterator f21085a;

    public C8990o1(Iterator it) {
        this.f21085a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f21085a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Map.Entry entry = (Map.Entry) this.f21085a.next();
        entry.getValue();
        return entry;
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f21085a.remove();
    }
}
