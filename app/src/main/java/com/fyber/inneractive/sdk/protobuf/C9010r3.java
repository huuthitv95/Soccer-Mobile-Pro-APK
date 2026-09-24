package com.fyber.inneractive.sdk.protobuf;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.r3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9010r3 extends AbstractList implements InterfaceC9002q1, RandomAccess {

    /* JADX INFO: renamed from: a */
    public final InterfaceC9002q1 f21105a;

    public C9010r3(InterfaceC9002q1 interfaceC9002q1) {
        this.f21105a = interfaceC9002q1;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9002q1
    /* JADX INFO: renamed from: a */
    public final InterfaceC9002q1 mo21694a() {
        return this;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9002q1
    /* JADX INFO: renamed from: a */
    public final Object mo21695a(int i) {
        return this.f21105a.mo21695a(i);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9002q1
    /* JADX INFO: renamed from: a */
    public final void mo21696a(AbstractC9011s abstractC9011s) {
        throw new UnsupportedOperationException();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9002q1
    /* JADX INFO: renamed from: b */
    public final List mo21697b() {
        return this.f21105a.mo21697b();
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        return (String) this.f21105a.get(i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        return new C9004q3(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        return new C8998p3(this, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21105a.size();
    }
}
