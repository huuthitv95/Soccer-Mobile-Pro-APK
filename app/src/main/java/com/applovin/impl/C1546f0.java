package com.applovin.impl;

import java.util.Map;

/* JADX INFO: renamed from: com.applovin.impl.f0 */
/* JADX INFO: loaded from: classes3.dex */
public class C1546f0 {

    /* JADX INFO: renamed from: a */
    private final String f1442a;

    /* JADX INFO: renamed from: b */
    private final Map f1443b;

    /* JADX INFO: renamed from: c */
    private final Map f1444c;

    /* JADX INFO: renamed from: d */
    private final String f1445d;

    public C1546f0(String str, Map map, Map map2, String str2) {
        this.f1442a = str;
        this.f1443b = map;
        this.f1444c = map2;
        this.f1445d = str2;
    }

    /* JADX INFO: renamed from: a */
    public String m2528a() {
        return this.f1445d;
    }

    /* JADX INFO: renamed from: a */
    protected boolean m2529a(Object obj) {
        return obj instanceof C1546f0;
    }

    /* JADX INFO: renamed from: b */
    public String m2530b() {
        return this.f1442a;
    }

    /* JADX INFO: renamed from: c */
    public Map m2531c() {
        return this.f1444c;
    }

    /* JADX INFO: renamed from: d */
    public Map m2532d() {
        return this.f1443b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1546f0)) {
            return false;
        }
        C1546f0 c1546f0 = (C1546f0) obj;
        if (!c1546f0.m2529a(this)) {
            return false;
        }
        String strM2530b = m2530b();
        String strM2530b2 = c1546f0.m2530b();
        if (strM2530b != null ? !strM2530b.equals(strM2530b2) : strM2530b2 != null) {
            return false;
        }
        Map mapM2532d = m2532d();
        Map mapM2532d2 = c1546f0.m2532d();
        if (mapM2532d != null ? !mapM2532d.equals(mapM2532d2) : mapM2532d2 != null) {
            return false;
        }
        Map mapM2531c = m2531c();
        Map mapM2531c2 = c1546f0.m2531c();
        if (mapM2531c != null ? !mapM2531c.equals(mapM2531c2) : mapM2531c2 != null) {
            return false;
        }
        String strM2528a = m2528a();
        String strM2528a2 = c1546f0.m2528a();
        return strM2528a != null ? strM2528a.equals(strM2528a2) : strM2528a2 == null;
    }

    public int hashCode() {
        String strM2530b = m2530b();
        int iHashCode = strM2530b == null ? 43 : strM2530b.hashCode();
        Map mapM2532d = m2532d();
        int iHashCode2 = ((iHashCode + 59) * 59) + (mapM2532d == null ? 43 : mapM2532d.hashCode());
        Map mapM2531c = m2531c();
        int iHashCode3 = (iHashCode2 * 59) + (mapM2531c == null ? 43 : mapM2531c.hashCode());
        String strM2528a = m2528a();
        return (iHashCode3 * 59) + (strM2528a != null ? strM2528a.hashCode() : 43);
    }

    public String toString() {
        return "AxonEventModel(eventName=" + m2530b() + ", parameters=" + m2532d() + ", options=" + m2531c() + ", errorMessage=" + m2528a() + ")";
    }
}
