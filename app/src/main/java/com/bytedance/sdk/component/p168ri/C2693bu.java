package com.bytedance.sdk.component.p168ri;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: com.bytedance.sdk.component.ri.bu */
/* JADX INFO: loaded from: classes3.dex */
public class C2693bu<K, V> {

    /* JADX INFO: renamed from: ri */
    private final Map<K, V> f7702ri = new HashMap();

    /* JADX INFO: renamed from: lr */
    private final Map<V, Set<K>> f7701lr = new HashMap();

    /* JADX INFO: renamed from: lr */
    public void m10131lr(K k) {
        Set<K> set;
        V vRemove = this.f7702ri.remove(k);
        if (vRemove == null || (set = this.f7701lr.get(vRemove)) == null) {
            return;
        }
        set.remove(k);
        if (set.isEmpty()) {
            this.f7701lr.remove(vRemove);
        }
    }

    /* JADX INFO: renamed from: ri */
    public V m10132ri(K k) {
        return this.f7702ri.get(k);
    }

    /* JADX INFO: renamed from: ri */
    public void m10133ri() {
        this.f7702ri.clear();
        this.f7701lr.clear();
    }

    /* JADX INFO: renamed from: ri */
    public void m10134ri(Set<K> set, V v) {
        for (K k : set) {
            if (this.f7702ri.containsKey(k)) {
                m10131lr(k);
            }
        }
        Set<K> hashSet = this.f7701lr.get(v);
        if (hashSet == null) {
            hashSet = new HashSet<>();
            this.f7701lr.put(v, hashSet);
        }
        hashSet.addAll(set);
        Iterator<K> it = set.iterator();
        while (it.hasNext()) {
            this.f7702ri.put(it.next(), v);
        }
    }
}
