package com.bytedance.adsdk.p065lr;

import com.ironsource.C11744X3;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class bgr<K, V> {

    /* JADX INFO: renamed from: di */
    private int f4674di;

    /* JADX INFO: renamed from: fi */
    private int f4675fi;

    /* JADX INFO: renamed from: ik */
    private int f4676ik;

    /* JADX INFO: renamed from: ka */
    private int f4677ka;

    /* JADX INFO: renamed from: lr */
    private int f4678lr;

    /* JADX INFO: renamed from: mj */
    private int f4679mj;

    /* JADX INFO: renamed from: ri */
    private final LinkedHashMap<K, V> f4680ri;
    private int xha;

    public bgr(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f4676ik = i;
        this.f4680ri = new LinkedHashMap<>(0, 0.75f, true);
    }

    /* JADX INFO: renamed from: ik */
    private int m6466ik(K k, V v) {
        int iM6467lr = m6467lr(k, v);
        if (iM6467lr >= 0) {
            return iM6467lr;
        }
        throw new IllegalStateException("Negative size: " + k + C11744X3.j.f26434b + v);
    }

    /* JADX INFO: renamed from: lr */
    protected int m6467lr(K k, V v) {
        return 1;
    }

    /* JADX INFO: renamed from: lr */
    protected V m6468lr(K k) {
        return null;
    }

    /* JADX INFO: renamed from: ri */
    public final V m6469ri(K k) {
        V vPut;
        if (k == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            V v = this.f4680ri.get(k);
            if (v != null) {
                this.xha++;
                return v;
            }
            this.f4679mj++;
            V vM6468lr = m6468lr(k);
            if (vM6468lr == null) {
                return null;
            }
            synchronized (this) {
                this.f4675fi++;
                vPut = this.f4680ri.put(k, vM6468lr);
                if (vPut != null) {
                    this.f4680ri.put(k, vPut);
                } else {
                    this.f4678lr += m6466ik(k, vM6468lr);
                }
            }
            if (vPut != null) {
                return vPut;
            }
            m6471ri(this.f4676ik);
            return vM6468lr;
        }
    }

    /* JADX INFO: renamed from: ri */
    public final V m6470ri(K k, V v) {
        V vPut;
        if (k == null || v == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f4677ka++;
            this.f4678lr += m6466ik(k, v);
            vPut = this.f4680ri.put(k, v);
            if (vPut != null) {
                this.f4678lr -= m6466ik(k, vPut);
            }
        }
        m6471ri(this.f4676ik);
        return vPut;
    }

    /* JADX INFO: renamed from: ri */
    public void m6471ri(int i) {
        while (true) {
            synchronized (this) {
                if (this.f4678lr < 0 || (this.f4680ri.isEmpty() && this.f4678lr != 0)) {
                    break;
                }
                if (this.f4678lr > i && !this.f4680ri.isEmpty()) {
                    Map.Entry<K, V> next = this.f4680ri.entrySet().iterator().next();
                    K key = next.getKey();
                    V value = next.getValue();
                    this.f4680ri.remove(key);
                    this.f4678lr -= m6466ik(key, value);
                    this.f4674di++;
                }
                return;
            }
        }
        throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
    }

    public final synchronized String toString() {
        int i;
        int i2;
        i = this.xha;
        i2 = this.f4679mj + i;
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.f4676ik), Integer.valueOf(this.xha), Integer.valueOf(this.f4679mj), Integer.valueOf(i2 != 0 ? (i * 100) / i2 : 0));
    }
}
