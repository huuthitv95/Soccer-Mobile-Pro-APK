package com.fyber.inneractive.sdk.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.p1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8996p1 extends AbstractC8916c implements InterfaceC9002q1, RandomAccess {

    /* JADX INFO: renamed from: b */
    public final ArrayList f21086b;

    static {
        new C8996p1(10).f20989a = false;
    }

    public C8996p1(int i) {
        this.f21086b = new ArrayList(i);
    }

    public C8996p1(ArrayList arrayList) {
        this.f21086b = arrayList;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9002q1
    /* JADX INFO: renamed from: a */
    public final InterfaceC9002q1 mo21694a() {
        return this.f20989a ? new C9010r3(this) : this;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9002q1
    /* JADX INFO: renamed from: a */
    public final Object mo21695a(int i) {
        return this.f21086b.get(i);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9002q1
    /* JADX INFO: renamed from: a */
    public final void mo21696a(AbstractC9011s abstractC9011s) {
        m21521c();
        this.f21086b.add(abstractC9011s);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        m21521c();
        this.f21086b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8916c, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m21521c();
        if (collection instanceof InterfaceC9002q1) {
            collection = ((InterfaceC9002q1) collection).mo21697b();
        }
        boolean zAddAll = this.f21086b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8916c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(this.f21086b.size(), collection);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC8966k1
    /* JADX INFO: renamed from: b */
    public final InterfaceC8966k1 mo21502b(int i) {
        if (i < this.f21086b.size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.f21086b);
        return new C8996p1(arrayList);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC9002q1
    /* JADX INFO: renamed from: b */
    public final List mo21697b() {
        return Collections.unmodifiableList(this.f21086b);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8916c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m21521c();
        this.f21086b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        Object obj = this.f21086b.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof AbstractC9011s) {
            AbstractC9011s abstractC9011s = (AbstractC9011s) obj;
            String strM21714f = abstractC9011s.m21714f();
            if (abstractC9011s.mo21702c()) {
                this.f21086b.set(i, strM21714f);
            }
            return strM21714f;
        }
        byte[] bArr = (byte[]) obj;
        String strM21665a = AbstractC8972l1.m21665a(bArr);
        if (AbstractC8927d4.f21001a.m21852b(bArr, 0, bArr.length)) {
            this.f21086b.set(i, strM21665a);
        }
        return strM21665a;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC8916c, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        m21521c();
        Object objRemove = this.f21086b.remove(i);
        ((AbstractList) this).modCount++;
        if (objRemove instanceof String) {
            return (String) objRemove;
        }
        return objRemove instanceof AbstractC9011s ? ((AbstractC9011s) objRemove).m21714f() : AbstractC8972l1.m21665a((byte[]) objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        m21521c();
        Object obj2 = this.f21086b.set(i, (String) obj);
        if (obj2 instanceof String) {
            return (String) obj2;
        }
        return obj2 instanceof AbstractC9011s ? ((AbstractC9011s) obj2).m21714f() : AbstractC8972l1.m21665a((byte[]) obj2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21086b.size();
    }
}
