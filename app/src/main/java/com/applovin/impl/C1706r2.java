package com.applovin.impl;

/* JADX INFO: renamed from: com.applovin.impl.r2 */
/* JADX INFO: loaded from: classes3.dex */
public class C1706r2 {

    /* JADX INFO: renamed from: a */
    private String f2703a;

    /* JADX INFO: renamed from: b */
    private String f2704b;

    /* JADX INFO: renamed from: c */
    private int f2705c;

    /* JADX INFO: renamed from: d */
    private int f2706d;

    /* JADX INFO: renamed from: com.applovin.impl.r2$a */
    public static class a {

        /* JADX INFO: renamed from: a */
        private String f2707a;

        /* JADX INFO: renamed from: b */
        private String f2708b;

        /* JADX INFO: renamed from: c */
        private int f2709c;

        /* JADX INFO: renamed from: d */
        private int f2710d;

        a() {
        }

        /* JADX INFO: renamed from: a */
        public a m4170a(int i) {
            this.f2710d = i;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m4171a(String str) {
            this.f2708b = str;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public C1706r2 m4172a() {
            return new C1706r2(this.f2707a, this.f2708b, this.f2709c, this.f2710d);
        }

        /* JADX INFO: renamed from: b */
        public a m4173b(int i) {
            this.f2709c = i;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public a m4174b(String str) {
            this.f2707a = str;
            return this;
        }

        public String toString() {
            return "LicenseVerificationObject.LicenseVerificationObjectBuilder(signedData=" + this.f2707a + ", signature=" + this.f2708b + ", responseCode=" + this.f2709c + ", nonce=" + this.f2710d + ")";
        }
    }

    C1706r2(String str, String str2, int i, int i2) {
        this.f2703a = str;
        this.f2704b = str2;
        this.f2705c = i;
        this.f2706d = i2;
    }

    /* JADX INFO: renamed from: a */
    public static a m4164a() {
        return new a();
    }

    /* JADX INFO: renamed from: a */
    protected boolean m4165a(Object obj) {
        return obj instanceof C1706r2;
    }

    /* JADX INFO: renamed from: b */
    public int m4166b() {
        return this.f2706d;
    }

    /* JADX INFO: renamed from: c */
    public int m4167c() {
        return this.f2705c;
    }

    /* JADX INFO: renamed from: d */
    public String m4168d() {
        return this.f2704b;
    }

    /* JADX INFO: renamed from: e */
    public String m4169e() {
        return this.f2703a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C1706r2)) {
            return false;
        }
        C1706r2 c1706r2 = (C1706r2) obj;
        if (!c1706r2.m4165a(this) || m4167c() != c1706r2.m4167c() || m4166b() != c1706r2.m4166b()) {
            return false;
        }
        String strM4169e = m4169e();
        String strM4169e2 = c1706r2.m4169e();
        if (strM4169e != null ? !strM4169e.equals(strM4169e2) : strM4169e2 != null) {
            return false;
        }
        String strM4168d = m4168d();
        String strM4168d2 = c1706r2.m4168d();
        return strM4168d != null ? strM4168d.equals(strM4168d2) : strM4168d2 == null;
    }

    public int hashCode() {
        int iM4167c = ((m4167c() + 59) * 59) + m4166b();
        String strM4169e = m4169e();
        int iHashCode = (iM4167c * 59) + (strM4169e == null ? 43 : strM4169e.hashCode());
        String strM4168d = m4168d();
        return (iHashCode * 59) + (strM4168d != null ? strM4168d.hashCode() : 43);
    }

    public String toString() {
        return "LicenseVerificationObject(signedData=" + m4169e() + ", signature=" + m4168d() + ", responseCode=" + m4167c() + ", nonce=" + m4166b() + ")";
    }
}
