package com.bytedance.sdk.component.p145fi.p146lr.p147ik.p149ri;

import java.lang.ref.SoftReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.bytedance.sdk.component.fi.lr.ik.ri.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C2606ik<K, V> {

    /* JADX INFO: renamed from: lr */
    private int f7347lr;

    /* JADX INFO: renamed from: ri */
    private final LinkedHashMap<K, SoftReference<V>> f7348ri = new LinkedHashMap<>(0, 0.75f, true);

    public C2606ik(int i) {
        this.f7347lr = i;
    }

    /* JADX INFO: renamed from: ri */
    public synchronized V m9698ri(K k) {
        V v = null;
        if (k == null) {
            return null;
        }
        if (this.f7347lr <= 0) {
            return null;
        }
        SoftReference<V> softReference = this.f7348ri.get(k);
        if (softReference != null) {
            v = softReference.get();
            if (v != null) {
                return v;
            }
            this.f7348ri.remove(k);
        }
        return v;
    }

    /* JADX INFO: renamed from: ri */
    public synchronized void m9699ri(int i) {
        int size = this.f7348ri.size() - i;
        if (size > 0) {
            Iterator<Map.Entry<K, SoftReference<V>>> it = this.f7348ri.entrySet().iterator();
            for (int i2 = 0; i2 < size; i2++) {
                it.next();
                it.remove();
            }
        }
        if (i == 0) {
            return;
        }
        Iterator<Map.Entry<K, SoftReference<V>>> it2 = this.f7348ri.entrySet().iterator();
        while (it2.hasNext()) {
            if (it2.next().getValue().get() == null) {
                it2.remove();
            }
        }
    }

    /* JADX INFO: renamed from: ri */
    public synchronized void m9700ri(K k, V v) {
        if (this.f7347lr <= 0) {
            return;
        }
        if (k == null || v == null) {
            return;
        }
        this.f7348ri.put(k, new SoftReference<>(v));
        int size = this.f7348ri.size();
        int i = this.f7347lr;
        if (size > i) {
            m9699ri((int) (((double) i) * 0.7d));
        }
    }

    public final synchronized String toString() {
        return String.format("LruCache[maxCount=%d,size=%d]", Integer.valueOf(this.f7347lr), Integer.valueOf(this.f7348ri.size()));
    }
}
