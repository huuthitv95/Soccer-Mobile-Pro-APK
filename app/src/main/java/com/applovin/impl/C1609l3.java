package com.applovin.impl;

import com.applovin.mediation.MaxAdFormat;

/* JADX INFO: renamed from: com.applovin.impl.l3 */
/* JADX INFO: loaded from: classes3.dex */
public class C1609l3 {

    /* JADX INFO: renamed from: a */
    private final String f2010a;

    /* JADX INFO: renamed from: b */
    private final MaxAdFormat f2011b;

    public C1609l3(String str, MaxAdFormat maxAdFormat) {
        this.f2010a = str;
        this.f2011b = maxAdFormat;
    }

    /* JADX INFO: renamed from: a */
    public static C1609l3 m3119a(String str) {
        String[] strArrSplit = str.split("-");
        return new C1609l3(strArrSplit[0], MaxAdFormat.formatFromString(strArrSplit[1]));
    }

    /* JADX INFO: renamed from: a */
    public MaxAdFormat m3120a() {
        return this.f2011b;
    }

    /* JADX INFO: renamed from: a */
    protected boolean m3121a(Object obj) {
        return obj instanceof C1609l3;
    }

    /* JADX INFO: renamed from: b */
    public String m3122b() {
        return this.f2010a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1609l3)) {
            return false;
        }
        C1609l3 c1609l3 = (C1609l3) obj;
        if (!c1609l3.m3121a(this)) {
            return false;
        }
        String strM3122b = m3122b();
        String strM3122b2 = c1609l3.m3122b();
        if (strM3122b != null ? !strM3122b.equals(strM3122b2) : strM3122b2 != null) {
            return false;
        }
        MaxAdFormat maxAdFormatM3120a = m3120a();
        MaxAdFormat maxAdFormatM3120a2 = c1609l3.m3120a();
        return maxAdFormatM3120a != null ? maxAdFormatM3120a.equals(maxAdFormatM3120a2) : maxAdFormatM3120a2 == null;
    }

    public int hashCode() {
        String strM3122b = m3122b();
        int iHashCode = strM3122b == null ? 43 : strM3122b.hashCode();
        MaxAdFormat maxAdFormatM3120a = m3120a();
        return ((iHashCode + 59) * 59) + (maxAdFormatM3120a != null ? maxAdFormatM3120a.hashCode() : 43);
    }

    public String toString() {
        return this.f2010a + "-" + this.f2011b.getLabel();
    }
}
