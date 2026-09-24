package com.fyber.inneractive.sdk.protobuf;

import com.ironsource.C11744X3;
import java.util.Map;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.b3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8914b3 implements Map.Entry, Comparable {

    /* JADX INFO: renamed from: a */
    public final Comparable f20986a;

    /* JADX INFO: renamed from: b */
    public Object f20987b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ AbstractC8932e3 f20988c;

    public C8914b3(AbstractC8932e3 abstractC8932e3, Comparable comparable, Object obj) {
        this.f20988c = abstractC8932e3;
        this.f20986a = comparable;
        this.f20987b = obj;
    }

    public C8914b3(AbstractC8932e3 abstractC8932e3, Map.Entry entry) {
        Comparable comparable = (Comparable) entry.getKey();
        Object value = entry.getValue();
        this.f20988c = abstractC8932e3;
        this.f20986a = comparable;
        this.f20987b = value;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f20986a.compareTo(((C8914b3) obj).f20986a);
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        boolean zEquals;
        boolean zEquals2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        Comparable comparable = this.f20986a;
        Object key = entry.getKey();
        if (comparable == null) {
            zEquals = key == null;
        } else {
            zEquals = comparable.equals(key);
        }
        if (zEquals) {
            Object obj2 = this.f20987b;
            Object value = entry.getValue();
            if (obj2 == null) {
                zEquals2 = value == null;
            } else {
                zEquals2 = obj2.equals(value);
            }
            if (zEquals2) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f20986a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f20987b;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Comparable comparable = this.f20986a;
        int iHashCode = comparable == null ? 0 : comparable.hashCode();
        Object obj = this.f20987b;
        return iHashCode ^ (obj != null ? obj.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        this.f20988c.m21536a();
        Object obj2 = this.f20987b;
        this.f20987b = obj;
        return obj2;
    }

    public final String toString() {
        return this.f20986a + C11744X3.j.f26434b + this.f20987b;
    }
}
