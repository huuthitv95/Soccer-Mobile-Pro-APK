package com.fyber.inneractive.sdk.protobuf;

import java.util.ListIterator;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.p3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8998p3 implements ListIterator {

    /* JADX INFO: renamed from: a */
    public final ListIterator f21090a;

    public C8998p3(C9010r3 c9010r3, int i) {
        this.f21090a = c9010r3.f21105a.listIterator(i);
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        return this.f21090a.hasNext();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f21090a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        return (String) this.f21090a.next();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f21090a.nextIndex();
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        return (String) this.f21090a.previous();
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f21090a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
