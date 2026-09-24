package com.applovin.impl;

import com.applovin.mediation.MaxAdFormat;
import java.util.Map;

/* JADX INFO: renamed from: com.applovin.impl.c3 */
/* JADX INFO: loaded from: classes3.dex */
public class C1519c3 {

    /* JADX INFO: renamed from: a */
    private final String f1275a;

    /* JADX INFO: renamed from: b */
    private final MaxAdFormat f1276b;

    /* JADX INFO: renamed from: c */
    private final Map f1277c;

    /* JADX INFO: renamed from: d */
    private final Map f1278d;

    /* JADX INFO: renamed from: e */
    private final Map f1279e;

    /* JADX INFO: renamed from: f */
    private final C1565h f1280f;

    public C1519c3(String str, MaxAdFormat maxAdFormat, Map map, Map map2, Map map3, C1565h c1565h) {
        this.f1275a = str;
        this.f1276b = maxAdFormat;
        this.f1277c = map;
        this.f1278d = map2;
        this.f1279e = map3;
        this.f1280f = c1565h;
    }

    /* JADX INFO: renamed from: a */
    public MaxAdFormat m2191a() {
        return this.f1276b;
    }

    /* JADX INFO: renamed from: a */
    protected boolean m2192a(Object obj) {
        return obj instanceof C1519c3;
    }

    /* JADX INFO: renamed from: b */
    public String m2193b() {
        return this.f1275a;
    }

    /* JADX INFO: renamed from: c */
    public Map m2194c() {
        return this.f1279e;
    }

    /* JADX INFO: renamed from: d */
    public Map m2195d() {
        return this.f1278d;
    }

    /* JADX INFO: renamed from: e */
    public Map m2196e() {
        return this.f1277c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1519c3)) {
            return false;
        }
        C1519c3 c1519c3 = (C1519c3) obj;
        if (!c1519c3.m2192a(this)) {
            return false;
        }
        String strM2193b = m2193b();
        String strM2193b2 = c1519c3.m2193b();
        if (strM2193b != null ? !strM2193b.equals(strM2193b2) : strM2193b2 != null) {
            return false;
        }
        MaxAdFormat maxAdFormatM2191a = m2191a();
        MaxAdFormat maxAdFormatM2191a2 = c1519c3.m2191a();
        if (maxAdFormatM2191a != null ? !maxAdFormatM2191a.equals(maxAdFormatM2191a2) : maxAdFormatM2191a2 != null) {
            return false;
        }
        Map mapM2196e = m2196e();
        Map mapM2196e2 = c1519c3.m2196e();
        if (mapM2196e != null ? !mapM2196e.equals(mapM2196e2) : mapM2196e2 != null) {
            return false;
        }
        Map mapM2195d = m2195d();
        Map mapM2195d2 = c1519c3.m2195d();
        if (mapM2195d != null ? !mapM2195d.equals(mapM2195d2) : mapM2195d2 != null) {
            return false;
        }
        Map mapM2194c = m2194c();
        Map mapM2194c2 = c1519c3.m2194c();
        if (mapM2194c != null ? !mapM2194c.equals(mapM2194c2) : mapM2194c2 != null) {
            return false;
        }
        C1565h c1565hM2197f = m2197f();
        C1565h c1565hM2197f2 = c1519c3.m2197f();
        return c1565hM2197f != null ? c1565hM2197f.equals(c1565hM2197f2) : c1565hM2197f2 == null;
    }

    /* JADX INFO: renamed from: f */
    public C1565h m2197f() {
        return this.f1280f;
    }

    public int hashCode() {
        String strM2193b = m2193b();
        int iHashCode = strM2193b == null ? 43 : strM2193b.hashCode();
        MaxAdFormat maxAdFormatM2191a = m2191a();
        int iHashCode2 = ((iHashCode + 59) * 59) + (maxAdFormatM2191a == null ? 43 : maxAdFormatM2191a.hashCode());
        Map mapM2196e = m2196e();
        int iHashCode3 = (iHashCode2 * 59) + (mapM2196e == null ? 43 : mapM2196e.hashCode());
        Map mapM2195d = m2195d();
        int iHashCode4 = (iHashCode3 * 59) + (mapM2195d == null ? 43 : mapM2195d.hashCode());
        Map mapM2194c = m2194c();
        int iHashCode5 = (iHashCode4 * 59) + (mapM2194c == null ? 43 : mapM2194c.hashCode());
        C1565h c1565hM2197f = m2197f();
        return (iHashCode5 * 59) + (c1565hM2197f != null ? c1565hM2197f.hashCode() : 43);
    }

    public String toString() {
        return "MediatedAdRequestParameters(adUnitId=" + m2193b() + ", adFormat=" + m2191a() + ")";
    }
}
