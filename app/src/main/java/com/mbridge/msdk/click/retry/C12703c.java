package com.mbridge.msdk.click.retry;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.mbridge.msdk.click.retry.c */
/* JADX INFO: compiled from: WaitRetryLruMemoryCache.java */
/* JADX INFO: loaded from: classes4.dex */
public class C12703c {

    /* JADX INFO: renamed from: a */
    private final LinkedHashMap<String, C12702b> f33789a;

    /* JADX INFO: renamed from: b */
    private final int f33790b;

    /* JADX INFO: renamed from: c */
    private int f33791c;

    public C12703c(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f33790b = i;
        this.f33789a = new LinkedHashMap<>(0, 0.75f, true);
    }

    /* JADX INFO: renamed from: a */
    private void m34802a(int i) {
        while (true) {
            synchronized (this) {
                if (this.f33791c < 0 || (this.f33789a.isEmpty() && this.f33791c != 0)) {
                    break;
                }
                if (this.f33791c > i && !this.f33789a.isEmpty()) {
                    Map.Entry<String, C12702b> next = this.f33789a.entrySet().iterator().next();
                    if (next == null) {
                        return;
                    }
                    String key = next.getKey();
                    try {
                        int iM34803b = m34803b(key, next.getValue());
                        this.f33789a.remove(key);
                        this.f33791c -= iM34803b;
                    } catch (Throwable unused) {
                    }
                }
                return;
            }
        }
        throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
    }

    /* JADX INFO: renamed from: b */
    private int m34803b(String str, C12702b c12702b) {
        return 1;
    }

    /* JADX INFO: renamed from: a */
    public final C12702b m34804a(String str) {
        if (str == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            C12702b c12702b = this.f33789a.get(str);
            if (c12702b != null) {
                return c12702b;
            }
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public Collection<String> m34805a() {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f33789a.keySet());
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m34806a(String str, C12702b c12702b) {
        if (str == null || c12702b == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f33791c += m34803b(str, c12702b);
            C12702b c12702bPut = this.f33789a.put(str, c12702b);
            if (c12702bPut != null) {
                this.f33791c -= m34803b(str, c12702bPut);
            }
        }
        m34802a(this.f33790b);
        return true;
    }

    /* JADX INFO: renamed from: b */
    public final void m34807b(String str) {
        if (str == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            C12702b c12702bRemove = this.f33789a.remove(str);
            if (c12702bRemove != null) {
                this.f33791c -= m34803b(str, c12702bRemove);
            }
        }
    }

    public final synchronized String toString() {
        return String.format("LruCache[maxSize=%d]", Integer.valueOf(this.f33790b));
    }
}
