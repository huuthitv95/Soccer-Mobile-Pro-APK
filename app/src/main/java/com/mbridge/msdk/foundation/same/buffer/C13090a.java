package com.mbridge.msdk.foundation.same.buffer;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.mbridge.msdk.foundation.same.buffer.a */
/* JADX INFO: compiled from: LruReplaceTempCache.java */
/* JADX INFO: loaded from: classes6.dex */
public class C13090a {

    /* JADX INFO: renamed from: a */
    private final LinkedHashMap<String, JSONObject> f35887a;

    /* JADX INFO: renamed from: b */
    private final int f35888b;

    /* JADX INFO: renamed from: c */
    private int f35889c;

    public C13090a(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f35888b = i;
        this.f35887a = new LinkedHashMap<>(0, 0.75f, true);
    }

    /* JADX INFO: renamed from: b */
    private int m37098b(String str, JSONObject jSONObject) {
        return 1;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m37101a(String str, JSONObject jSONObject) {
        if (str == null || jSONObject == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            this.f35889c += m37098b(str, jSONObject);
            JSONObject jSONObjectPut = this.f35887a.put(str, jSONObject);
            if (jSONObjectPut != null) {
                this.f35889c -= m37098b(str, jSONObjectPut);
            }
        }
        m37097a(this.f35888b);
        return true;
    }

    public final synchronized String toString() {
        return String.format("LruCache[maxSize=%d]", Integer.valueOf(this.f35888b));
    }

    /* JADX INFO: renamed from: a */
    public final JSONObject m37100a(String str) {
        JSONObject jSONObject;
        if (str != null) {
            synchronized (this) {
                jSONObject = this.f35887a.get(str);
            }
            return jSONObject;
        }
        throw new NullPointerException("key == null");
    }

    /* JADX INFO: renamed from: a */
    public Collection<String> m37099a() {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f35887a.keySet());
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: a */
    private void m37097a(int i) {
        while (true) {
            synchronized (this) {
                if (this.f35889c < 0 || (this.f35887a.isEmpty() && this.f35889c != 0)) {
                    break;
                }
                if (this.f35889c > i && !this.f35887a.isEmpty()) {
                    Map.Entry<String, JSONObject> next = this.f35887a.entrySet().iterator().next();
                    if (next == null) {
                        return;
                    }
                    String key = next.getKey();
                    try {
                        int iM37098b = m37098b(key, next.getValue());
                        this.f35887a.remove(key);
                        this.f35889c -= iM37098b;
                    } catch (Throwable unused) {
                    }
                }
                return;
            }
        }
        throw new IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
    }
}
