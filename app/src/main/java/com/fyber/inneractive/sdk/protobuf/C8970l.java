package com.fyber.inneractive.sdk.protobuf;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.l */
/* JADX INFO: loaded from: classes4.dex */
public final class C8970l implements Iterator {

    /* JADX INFO: renamed from: a */
    public int f21061a = 0;

    /* JADX INFO: renamed from: b */
    public final int f21062b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC9011s f21063c;

    public C8970l(AbstractC9011s abstractC9011s) {
        this.f21063c = abstractC9011s;
        this.f21062b = abstractC9011s.size();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f21061a < this.f21062b;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.f21061a;
        if (i >= this.f21062b) {
            throw new NoSuchElementException();
        }
        this.f21061a = i + 1;
        return Byte.valueOf(this.f21063c.mo21670d(i));
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
