package com.applovin.impl;

import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.applovin.impl.z */
/* JADX INFO: loaded from: classes3.dex */
public class C1826z {

    /* JADX INFO: renamed from: a */
    private final Map f3655a;

    /* JADX INFO: renamed from: b */
    private final List f3656b;

    public C1826z(Map map, List list) {
        this.f3655a = map;
        this.f3656b = list;
    }

    /* JADX INFO: renamed from: a */
    public Map m5728a() {
        return this.f3655a;
    }

    /* JADX INFO: renamed from: a */
    protected boolean m5729a(Object obj) {
        return obj instanceof C1826z;
    }

    /* JADX INFO: renamed from: b */
    public List m5730b() {
        return this.f3656b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1826z)) {
            return false;
        }
        C1826z c1826z = (C1826z) obj;
        if (!c1826z.m5729a(this)) {
            return false;
        }
        Map mapM5728a = m5728a();
        Map mapM5728a2 = c1826z.m5728a();
        if (mapM5728a != null ? !mapM5728a.equals(mapM5728a2) : mapM5728a2 != null) {
            return false;
        }
        List listM5730b = m5730b();
        List listM5730b2 = c1826z.m5730b();
        return listM5730b != null ? listM5730b.equals(listM5730b2) : listM5730b2 == null;
    }

    public int hashCode() {
        Map mapM5728a = m5728a();
        int iHashCode = mapM5728a == null ? 43 : mapM5728a.hashCode();
        List listM5730b = m5730b();
        return ((iHashCode + 59) * 59) + (listM5730b != null ? listM5730b.hashCode() : 43);
    }

    public String toString() {
        return "AppAdsTxt(domainEntries=" + m5728a() + ", invalidEntries=" + m5730b() + ")";
    }
}
