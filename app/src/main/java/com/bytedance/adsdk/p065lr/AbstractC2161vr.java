package com.bytedance.adsdk.p065lr;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.vr */
/* JADX INFO: loaded from: classes3.dex */
abstract class AbstractC2161vr<K, V> {

    /* JADX INFO: renamed from: lr */
    AbstractC2161vr<K, V>.lr f5357lr;

    /* JADX INFO: renamed from: com.bytedance.adsdk.lr.vr$lr */
    final class lr implements Set<K> {
        lr() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            AbstractC2161vr.this.mo7076ik();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return AbstractC2161vr.this.mo7079ri(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return AbstractC2161vr.m7175ri(AbstractC2161vr.this.mo7077lr(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return AbstractC2161vr.m7176ri(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int iMo7078ri = AbstractC2161vr.this.mo7078ri() - 1; iMo7078ri >= 0; iMo7078ri--) {
                Object objMo7080ri = AbstractC2161vr.this.mo7080ri(iMo7078ri, 0);
                iHashCode += objMo7080ri == null ? 0 : objMo7080ri.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return AbstractC2161vr.this.mo7078ri() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new ri(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int iMo7079ri = AbstractC2161vr.this.mo7079ri(obj);
            if (iMo7079ri < 0) {
                return false;
            }
            AbstractC2161vr.this.mo7081ri(iMo7079ri);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return AbstractC2161vr.m7174lr(AbstractC2161vr.this.mo7077lr(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return AbstractC2161vr.m7173ik(AbstractC2161vr.this.mo7077lr(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return AbstractC2161vr.this.mo7078ri();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return AbstractC2161vr.this.m7178lr(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) AbstractC2161vr.this.m7179ri(tArr, 0);
        }
    }

    /* JADX INFO: renamed from: com.bytedance.adsdk.lr.vr$ri */
    final class ri<T> implements Iterator<T> {

        /* JADX INFO: renamed from: ik */
        int f5360ik;

        /* JADX INFO: renamed from: ka */
        boolean f5361ka = false;

        /* JADX INFO: renamed from: lr */
        int f5362lr;

        /* JADX INFO: renamed from: ri */
        final int f5363ri;

        ri(int i) {
            this.f5363ri = i;
            this.f5362lr = AbstractC2161vr.this.mo7078ri();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f5360ik < this.f5362lr;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T t = (T) AbstractC2161vr.this.mo7080ri(this.f5360ik, this.f5363ri);
            this.f5360ik++;
            this.f5361ka = true;
            return t;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f5361ka) {
                throw new IllegalStateException();
            }
            int i = this.f5360ik - 1;
            this.f5360ik = i;
            this.f5362lr--;
            this.f5361ka = false;
            AbstractC2161vr.this.mo7081ri(i);
        }
    }

    AbstractC2161vr() {
    }

    /* JADX INFO: renamed from: ik */
    public static <K, V> boolean m7173ik(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    /* JADX INFO: renamed from: lr */
    public static <K, V> boolean m7174lr(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    /* JADX INFO: renamed from: ri */
    public static <K, V> boolean m7175ri(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ri */
    public static <T> boolean m7176ri(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size() && set.containsAll(set2)) {
                    return true;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ik */
    protected abstract void mo7076ik();

    /* JADX INFO: renamed from: ka */
    public Set<K> m7177ka() {
        if (this.f5357lr == null) {
            this.f5357lr = new lr();
        }
        return this.f5357lr;
    }

    /* JADX INFO: renamed from: lr */
    protected abstract Map<K, V> mo7077lr();

    /* JADX INFO: renamed from: lr */
    public Object[] m7178lr(int i) {
        int iMo7078ri = mo7078ri();
        Object[] objArr = new Object[iMo7078ri];
        for (int i2 = 0; i2 < iMo7078ri; i2++) {
            objArr[i2] = mo7080ri(i2, i);
        }
        return objArr;
    }

    /* JADX INFO: renamed from: ri */
    protected abstract int mo7078ri();

    /* JADX INFO: renamed from: ri */
    protected abstract int mo7079ri(Object obj);

    /* JADX INFO: renamed from: ri */
    protected abstract Object mo7080ri(int i, int i2);

    /* JADX INFO: renamed from: ri */
    protected abstract void mo7081ri(int i);

    /* JADX INFO: renamed from: ri */
    public <T> T[] m7179ri(T[] tArr, int i) {
        int iMo7078ri = mo7078ri();
        if (tArr.length < iMo7078ri) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), iMo7078ri));
        }
        for (int i2 = 0; i2 < iMo7078ri; i2++) {
            tArr[i2] = mo7080ri(i2, i);
        }
        if (tArr.length > iMo7078ri) {
            tArr[iMo7078ri] = null;
        }
        return tArr;
    }
}
