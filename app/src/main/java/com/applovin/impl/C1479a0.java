package com.applovin.impl;

/* JADX INFO: renamed from: com.applovin.impl.a0 */
/* JADX INFO: loaded from: classes3.dex */
public class C1479a0 {

    /* JADX INFO: renamed from: a */
    private final String f944a;

    /* JADX INFO: renamed from: b */
    private final String f945b;

    /* JADX INFO: renamed from: c */
    private final String f946c;

    /* JADX INFO: renamed from: d */
    private final String f947d;

    /* JADX INFO: renamed from: e */
    private final String f948e;

    /* JADX INFO: renamed from: f */
    private final int f949f;

    /* JADX INFO: renamed from: g */
    private final boolean f950g;

    public C1479a0(String str) {
        this(str, -1);
    }

    public C1479a0(String str, int i) {
        this.f948e = str;
        this.f949f = i;
        String[] strArrSplit = str.split(",");
        boolean z = strArrSplit.length == 3 || strArrSplit.length == 4;
        this.f950g = z;
        if (z) {
            this.f944a = m1760a(strArrSplit[0]);
            this.f945b = m1760a(strArrSplit[1]);
            this.f946c = m1760a(strArrSplit[2]);
            this.f947d = strArrSplit.length == 4 ? m1760a(strArrSplit[3]) : "";
            return;
        }
        this.f944a = "";
        this.f945b = "";
        this.f946c = "";
        this.f947d = "";
    }

    /* JADX INFO: renamed from: a */
    private String m1760a(String str) {
        return str.replace((char) 173, ' ').trim();
    }

    /* JADX INFO: renamed from: a */
    public String m1761a() {
        return this.f947d;
    }

    /* JADX INFO: renamed from: a */
    public boolean m1762a(C1479a0 c1479a0) {
        if (!c1479a0.m1764b().equals(this.f944a) || !c1479a0.m1765c().equals(this.f945b) || !c1479a0.m1767e().equals(this.f946c)) {
            return false;
        }
        if (c1479a0.m1761a().equals("")) {
            return true;
        }
        return c1479a0.m1761a().equals(this.f947d);
    }

    /* JADX INFO: renamed from: a */
    protected boolean m1763a(Object obj) {
        return obj instanceof C1479a0;
    }

    /* JADX INFO: renamed from: b */
    public String m1764b() {
        return this.f944a;
    }

    /* JADX INFO: renamed from: c */
    public String m1765c() {
        return this.f945b;
    }

    /* JADX INFO: renamed from: d */
    public String m1766d() {
        return this.f948e;
    }

    /* JADX INFO: renamed from: e */
    public String m1767e() {
        return this.f946c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1479a0)) {
            return false;
        }
        C1479a0 c1479a0 = (C1479a0) obj;
        if (!c1479a0.m1763a((Object) this)) {
            return false;
        }
        String strM1764b = m1764b();
        String strM1764b2 = c1479a0.m1764b();
        if (strM1764b != null ? !strM1764b.equals(strM1764b2) : strM1764b2 != null) {
            return false;
        }
        String strM1765c = m1765c();
        String strM1765c2 = c1479a0.m1765c();
        if (strM1765c != null ? !strM1765c.equals(strM1765c2) : strM1765c2 != null) {
            return false;
        }
        String strM1767e = m1767e();
        String strM1767e2 = c1479a0.m1767e();
        if (strM1767e != null ? !strM1767e.equals(strM1767e2) : strM1767e2 != null) {
            return false;
        }
        String strM1761a = m1761a();
        String strM1761a2 = c1479a0.m1761a();
        return strM1761a != null ? strM1761a.equals(strM1761a2) : strM1761a2 == null;
    }

    /* JADX INFO: renamed from: f */
    public int m1768f() {
        return this.f949f;
    }

    /* JADX INFO: renamed from: g */
    public boolean m1769g() {
        return this.f944a.equals("applovin.com");
    }

    /* JADX INFO: renamed from: h */
    public boolean m1770h() {
        return this.f950g;
    }

    public int hashCode() {
        String strM1764b = m1764b();
        int iHashCode = strM1764b == null ? 43 : strM1764b.hashCode();
        String strM1765c = m1765c();
        int iHashCode2 = ((iHashCode + 59) * 59) + (strM1765c == null ? 43 : strM1765c.hashCode());
        String strM1767e = m1767e();
        int iHashCode3 = (iHashCode2 * 59) + (strM1767e == null ? 43 : strM1767e.hashCode());
        String strM1761a = m1761a();
        return (iHashCode3 * 59) + (strM1761a != null ? strM1761a.hashCode() : 43);
    }

    public String toString() {
        return "AppAdsTxtEntry(domainName=" + m1764b() + ", publisherId=" + m1765c() + ", relationship=" + m1767e() + ", certificateAuthorityId=" + m1761a() + ", rawValue=" + m1766d() + ", rowNumber=" + m1768f() + ", valid=" + m1770h() + ")";
    }
}
