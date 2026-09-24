package com.applovin.impl;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.applovin.impl.h */
/* JADX INFO: loaded from: classes3.dex */
public class C1565h {

    /* JADX INFO: renamed from: a */
    private final int f1740a;

    /* JADX INFO: renamed from: b */
    private final int f1741b;

    /* JADX INFO: renamed from: c */
    private final int f1742c;

    /* JADX INFO: renamed from: d */
    private final int f1743d;

    public C1565h(int i, int i2, int i3, int i4) {
        this.f1740a = i;
        this.f1741b = i2;
        this.f1742c = i3;
        this.f1743d = i4;
    }

    /* JADX INFO: renamed from: a */
    public int m2764a() {
        return this.f1743d;
    }

    /* JADX INFO: renamed from: a */
    protected boolean m2765a(Object obj) {
        return obj instanceof C1565h;
    }

    /* JADX INFO: renamed from: b */
    public int m2766b() {
        return this.f1742c;
    }

    /* JADX INFO: renamed from: c */
    public int m2767c() {
        return this.f1741b;
    }

    /* JADX INFO: renamed from: d */
    public int m2768d() {
        return this.f1740a;
    }

    /* JADX INFO: renamed from: e */
    public Map m2769e() {
        HashMap map = new HashMap(4);
        map.put("asr_num", Integer.valueOf(this.f1740a));
        map.put("air_num", Integer.valueOf(this.f1741b));
        map.put("fsr_num", Integer.valueOf(this.f1742c));
        map.put("fir_num", Integer.valueOf(this.f1743d));
        return map;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1565h)) {
            return false;
        }
        C1565h c1565h = (C1565h) obj;
        return c1565h.m2765a(this) && m2768d() == c1565h.m2768d() && m2767c() == c1565h.m2767c() && m2766b() == c1565h.m2766b() && m2764a() == c1565h.m2764a();
    }

    public int hashCode() {
        return ((((((m2768d() + 59) * 59) + m2767c()) * 59) + m2766b()) * 59) + m2764a();
    }

    public String toString() {
        return "AdRequestNumberInfo(adUnitSessionAdRequestNumber=" + m2768d() + ", adUnitInstallAdRequestNumber=" + m2767c() + ", adFormatSessionAdRequestNumber=" + m2766b() + ", adFormatInstallAdRequestNumber=" + m2764a() + ")";
    }
}
