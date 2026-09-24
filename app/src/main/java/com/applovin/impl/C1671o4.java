package com.applovin.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.Set;

/* JADX INFO: renamed from: com.applovin.impl.o4 */
/* JADX INFO: loaded from: classes3.dex */
public class C1671o4 implements Set, RandomAccess {

    /* JADX INFO: renamed from: a */
    private final ArrayList f2463a = new ArrayList();

    /* JADX INFO: renamed from: b */
    private final HashSet f2464b = new HashSet();

    /* JADX INFO: renamed from: a */
    public Comparable m3738a() {
        return (Comparable) this.f2463a.get(size() - 1);
    }

    /* JADX INFO: renamed from: a */
    public Comparable m3739a(int i) {
        return (Comparable) this.f2463a.get(i);
    }

    /* JADX INFO: renamed from: a */
    public void m3740a(int i, Comparable comparable) {
        this.f2464b.remove((Comparable) this.f2463a.get(i));
        this.f2463a.set(i, comparable);
        this.f2464b.add(comparable);
    }

    @Override // java.util.Set, java.util.Collection
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public boolean add(Comparable comparable) {
        if (contains(comparable)) {
            return false;
        }
        if (isEmpty() || comparable.compareTo(m3738a()) > 0) {
            this.f2463a.add(comparable);
        } else {
            this.f2463a.add(m3742b(comparable), comparable);
        }
        return this.f2464b.add(comparable);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (add((Comparable) it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    /* JADX INFO: renamed from: b */
    public int m3742b(Comparable comparable) {
        int iBinarySearch = Collections.binarySearch(this.f2463a, comparable);
        if (iBinarySearch < 0) {
            return ~iBinarySearch;
        }
        Comparable comparableM3739a = m3739a(iBinarySearch);
        while (iBinarySearch >= 0 && comparableM3739a == m3739a(iBinarySearch)) {
            iBinarySearch--;
        }
        return iBinarySearch + 1;
    }

    /* JADX INFO: renamed from: b */
    public Comparable m3743b(int i) {
        Comparable comparable = (Comparable) this.f2463a.remove(i);
        this.f2464b.remove(comparable);
        return comparable;
    }

    /* JADX INFO: renamed from: c */
    public int m3744c(Comparable comparable) {
        int iBinarySearch = Collections.binarySearch(this.f2463a, comparable);
        if (iBinarySearch < 0) {
            return ~iBinarySearch;
        }
        Comparable comparableM3739a = m3739a(iBinarySearch);
        while (iBinarySearch < size() && comparableM3739a == m3739a(iBinarySearch)) {
            iBinarySearch++;
        }
        return iBinarySearch;
    }

    @Override // java.util.Set, java.util.Collection
    public void clear() {
        this.f2463a.clear();
        this.f2464b.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean contains(Object obj) {
        return this.f2464b.contains(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean containsAll(Collection collection) {
        return this.f2464b.containsAll(collection);
    }

    /* JADX INFO: renamed from: d */
    public int m3745d(Comparable comparable) {
        if (comparable == null || !contains(comparable)) {
            return -1;
        }
        return m3742b(comparable);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean isEmpty() {
        return this.f2463a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return this.f2463a.iterator();
    }

    @Override // java.util.Set, java.util.Collection
    public boolean remove(Object obj) {
        int iM3745d = m3745d((Comparable) obj);
        if (iM3745d == -1) {
            return false;
        }
        this.f2463a.remove(iM3745d);
        return this.f2464b.remove(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public boolean removeAll(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            boolean z = false;
            while (it.hasNext()) {
                if (remove(it.next()) || z) {
                    z = true;
                }
            }
            return z;
        }
    }

    @Override // java.util.Set, java.util.Collection
    public boolean retainAll(Collection collection) {
        boolean z = false;
        for (int size = size() - 1; size >= 0; size--) {
            Comparable comparable = (Comparable) this.f2463a.get(size);
            if (!collection.contains(comparable)) {
                this.f2463a.remove(size);
                this.f2464b.remove(comparable);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Set, java.util.Collection
    public int size() {
        return this.f2463a.size();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray() {
        return this.f2463a.toArray();
    }

    @Override // java.util.Set, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        return this.f2463a.toArray(objArr);
    }
}
