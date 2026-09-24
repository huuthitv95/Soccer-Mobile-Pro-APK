package com.mbridge.msdk.thrid.okhttp;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.thrid.okhttp.internal.C13723c;
import java.util.Arrays;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLSocket;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.j */
/* JADX INFO: compiled from: ConnectionSpec.java */
/* JADX INFO: loaded from: classes7.dex */
public final class C13774j {

    /* JADX INFO: renamed from: e */
    private static final C13718g[] f39130e;

    /* JADX INFO: renamed from: f */
    private static final C13718g[] f39131f;

    /* JADX INFO: renamed from: g */
    public static final C13774j f39132g;

    /* JADX INFO: renamed from: h */
    public static final C13774j f39133h;

    /* JADX INFO: renamed from: i */
    public static final C13774j f39134i;

    /* JADX INFO: renamed from: j */
    public static final C13774j f39135j;

    /* JADX INFO: renamed from: a */
    final boolean f39136a;

    /* JADX INFO: renamed from: b */
    final boolean f39137b;

    /* JADX INFO: renamed from: c */
    @Nullable
    final String[] f39138c;

    /* JADX INFO: renamed from: d */
    @Nullable
    final String[] f39139d;

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.j$a */
    /* JADX INFO: compiled from: ConnectionSpec.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        boolean f39140a;

        /* JADX INFO: renamed from: b */
        @Nullable
        String[] f39141b;

        /* JADX INFO: renamed from: c */
        @Nullable
        String[] f39142c;

        /* JADX INFO: renamed from: d */
        boolean f39143d;

        public a(C13774j c13774j) {
            this.f39140a = c13774j.f39136a;
            this.f39141b = c13774j.f39138c;
            this.f39142c = c13774j.f39139d;
            this.f39143d = c13774j.f39137b;
        }

        a(boolean z) {
            this.f39140a = z;
        }

        /* JADX INFO: renamed from: a */
        public a m40659a(boolean z) {
            if (!this.f39140a) {
                throw new IllegalStateException("no TLS extensions for cleartext connections");
            }
            this.f39143d = z;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public a m40660a(EnumC13715d0... enumC13715d0Arr) {
            if (!this.f39140a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            String[] strArr = new String[enumC13715d0Arr.length];
            for (int i = 0; i < enumC13715d0Arr.length; i++) {
                strArr[i] = enumC13715d0Arr[i].f38629a;
            }
            return m40664b(strArr);
        }

        /* JADX INFO: renamed from: a */
        public a m40661a(C13718g... c13718gArr) {
            if (!this.f39140a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            String[] strArr = new String[c13718gArr.length];
            for (int i = 0; i < c13718gArr.length; i++) {
                strArr[i] = c13718gArr[i].f38759a;
            }
            return m40662a(strArr);
        }

        /* JADX INFO: renamed from: a */
        public a m40662a(String... strArr) {
            if (!this.f39140a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
            this.f39141b = (String[]) strArr.clone();
            return this;
        }

        /* JADX INFO: renamed from: a */
        public C13774j m40663a() {
            return new C13774j(this);
        }

        /* JADX INFO: renamed from: b */
        public a m40664b(String... strArr) {
            if (!this.f39140a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            }
            if (strArr.length == 0) {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
            this.f39142c = (String[]) strArr.clone();
            return this;
        }
    }

    static {
        C13718g c13718g = C13718g.f38730n1;
        C13718g c13718g2 = C13718g.f38733o1;
        C13718g c13718g3 = C13718g.f38736p1;
        C13718g c13718g4 = C13718g.f38739q1;
        C13718g c13718g5 = C13718g.f38742r1;
        C13718g c13718g6 = C13718g.f38689Z0;
        C13718g c13718g7 = C13718g.f38700d1;
        C13718g c13718g8 = C13718g.f38691a1;
        C13718g c13718g9 = C13718g.f38703e1;
        C13718g c13718g10 = C13718g.f38721k1;
        C13718g c13718g11 = C13718g.f38718j1;
        C13718g[] c13718gArr = {c13718g, c13718g2, c13718g3, c13718g4, c13718g5, c13718g6, c13718g7, c13718g8, c13718g9, c13718g10, c13718g11};
        f39130e = c13718gArr;
        C13718g[] c13718gArr2 = {c13718g, c13718g2, c13718g3, c13718g4, c13718g5, c13718g6, c13718g7, c13718g8, c13718g9, c13718g10, c13718g11, C13718g.f38659K0, C13718g.f38661L0, C13718g.f38714i0, C13718g.f38717j0, C13718g.f38650G, C13718g.f38658K, C13718g.f38719k};
        f39131f = c13718gArr2;
        a aVarM40661a = new a(true).m40661a(c13718gArr);
        EnumC13715d0 enumC13715d0 = EnumC13715d0.TLS_1_3;
        EnumC13715d0 enumC13715d1 = EnumC13715d0.TLS_1_2;
        f39132g = aVarM40661a.m40660a(enumC13715d0, enumC13715d1).m40659a(true).m40663a();
        a aVarM40661a2 = new a(true).m40661a(c13718gArr2);
        EnumC13715d0 enumC13715d2 = EnumC13715d0.TLS_1_0;
        f39133h = aVarM40661a2.m40660a(enumC13715d0, enumC13715d1, EnumC13715d0.TLS_1_1, enumC13715d2).m40659a(true).m40663a();
        f39134i = new a(true).m40661a(c13718gArr2).m40660a(enumC13715d2).m40659a(true).m40663a();
        f39135j = new a(false).m40663a();
    }

    C13774j(a aVar) {
        this.f39136a = aVar.f39140a;
        this.f39138c = aVar.f39141b;
        this.f39139d = aVar.f39142c;
        this.f39137b = aVar.f39143d;
    }

    /* JADX INFO: renamed from: b */
    private C13774j m40652b(SSLSocket sSLSocket, boolean z) {
        String[] strArrM40289a = this.f39138c != null ? C13723c.m40289a(C13718g.f38692b, sSLSocket.getEnabledCipherSuites(), this.f39138c) : sSLSocket.getEnabledCipherSuites();
        String[] strArrM40289a2 = this.f39139d != null ? C13723c.m40289a(C13723c.f38787q, sSLSocket.getEnabledProtocols(), this.f39139d) : sSLSocket.getEnabledProtocols();
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        int iM40268a = C13723c.m40268a(C13718g.f38692b, supportedCipherSuites, "TLS_FALLBACK_SCSV");
        if (z && iM40268a != -1) {
            strArrM40289a = C13723c.m40290a(strArrM40289a, supportedCipherSuites[iM40268a]);
        }
        return new a(this).m40662a(strArrM40289a).m40664b(strArrM40289a2).m40663a();
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public List<C13718g> m40653a() {
        String[] strArr = this.f39138c;
        if (strArr != null) {
            return C13718g.m40240a(strArr);
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    void m40654a(SSLSocket sSLSocket, boolean z) {
        C13774j c13774jM40652b = m40652b(sSLSocket, z);
        String[] strArr = c13774jM40652b.f39139d;
        if (strArr != null) {
            sSLSocket.setEnabledProtocols(strArr);
        }
        String[] strArr2 = c13774jM40652b.f39138c;
        if (strArr2 != null) {
            sSLSocket.setEnabledCipherSuites(strArr2);
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m40655a(SSLSocket sSLSocket) {
        if (!this.f39136a) {
            return false;
        }
        String[] strArr = this.f39139d;
        if (strArr != null && !C13723c.m40295b(C13723c.f38787q, strArr, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        String[] strArr2 = this.f39138c;
        return strArr2 == null || C13723c.m40295b(C13718g.f38692b, strArr2, sSLSocket.getEnabledCipherSuites());
    }

    /* JADX INFO: renamed from: b */
    public boolean m40656b() {
        return this.f39136a;
    }

    /* JADX INFO: renamed from: c */
    public boolean m40657c() {
        return this.f39137b;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public List<EnumC13715d0> m40658d() {
        String[] strArr = this.f39139d;
        if (strArr != null) {
            return EnumC13715d0.m40228a(strArr);
        }
        return null;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C13774j)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C13774j c13774j = (C13774j) obj;
        boolean z = this.f39136a;
        if (z != c13774j.f39136a) {
            return false;
        }
        return !z || (Arrays.equals(this.f39138c, c13774j.f39138c) && Arrays.equals(this.f39139d, c13774j.f39139d) && this.f39137b == c13774j.f39137b);
    }

    public int hashCode() {
        if (this.f39136a) {
            return ((((Arrays.hashCode(this.f39138c) + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + Arrays.hashCode(this.f39139d)) * 31) + (!this.f39137b ? 1 : 0);
        }
        return 17;
    }

    public String toString() {
        if (!this.f39136a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + (this.f39138c != null ? m40653a().toString() : "[all enabled]") + ", tlsVersions=" + (this.f39139d != null ? m40658d().toString() : "[all enabled]") + ", supportsTlsExtensions=" + this.f39137b + ")";
    }
}
