package com.mbridge.msdk.thrid.okhttp;

import com.facebook.internal.security.CertificateUtil;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.thrid.okhttp.internal.C13723c;
import com.mbridge.msdk.thrid.okhttp.internal.tls.AbstractC13771c;
import com.mbridge.msdk.thrid.okio.C13796f;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.f */
/* JADX INFO: compiled from: CertificatePinner.java */
/* JADX INFO: loaded from: classes7.dex */
public final class C13717f {

    /* JADX INFO: renamed from: c */
    public static final C13717f f38630c = new a().m40236a();

    /* JADX INFO: renamed from: a */
    private final Set<b> f38631a;

    /* JADX INFO: renamed from: b */
    @Nullable
    private final AbstractC13771c f38632b;

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.f$a */
    /* JADX INFO: compiled from: CertificatePinner.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final List<b> f38633a = new ArrayList();

        /* JADX INFO: renamed from: a */
        public C13717f m40236a() {
            return new C13717f(new LinkedHashSet(this.f38633a), null);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.f$b */
    /* JADX INFO: compiled from: CertificatePinner.java */
    static final class b {

        /* JADX INFO: renamed from: a */
        final String f38634a;

        /* JADX INFO: renamed from: b */
        final String f38635b;

        /* JADX INFO: renamed from: c */
        final String f38636c;

        /* JADX INFO: renamed from: d */
        final C13796f f38637d;

        /* JADX INFO: renamed from: a */
        boolean m40237a(String str) {
            if (!this.f38634a.startsWith("*.")) {
                return str.equals(this.f38635b);
            }
            int iIndexOf = str.indexOf(46);
            if ((str.length() - iIndexOf) - 1 != this.f38635b.length()) {
                return false;
            }
            String str2 = this.f38635b;
            return str.regionMatches(false, iIndexOf + 1, str2, 0, str2.length());
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f38634a.equals(bVar.f38634a) && this.f38636c.equals(bVar.f38636c) && this.f38637d.equals(bVar.f38637d);
        }

        public int hashCode() {
            return ((((this.f38634a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f38636c.hashCode()) * 31) + this.f38637d.hashCode();
        }

        public String toString() {
            return this.f38636c + this.f38637d.mo40919d();
        }
    }

    C13717f(Set<b> set, @Nullable AbstractC13771c abstractC13771c) {
        this.f38631a = set;
        this.f38632b = abstractC13771c;
    }

    /* JADX INFO: renamed from: a */
    static C13796f m40230a(X509Certificate x509Certificate) {
        return C13796f.m40909a(x509Certificate.getPublicKey().getEncoded()).mo40921h();
    }

    /* JADX INFO: renamed from: a */
    public static String m40231a(Certificate certificate) {
        if (!(certificate instanceof X509Certificate)) {
            throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
        }
        return "sha256/" + m40232b((X509Certificate) certificate).mo40919d();
    }

    /* JADX INFO: renamed from: b */
    static C13796f m40232b(X509Certificate x509Certificate) {
        return C13796f.m40909a(x509Certificate.getPublicKey().getEncoded()).mo40922i();
    }

    /* JADX INFO: renamed from: a */
    C13717f m40233a(@Nullable AbstractC13771c abstractC13771c) {
        return C13723c.m40287a(this.f38632b, abstractC13771c) ? this : new C13717f(this.f38631a, abstractC13771c);
    }

    /* JADX INFO: renamed from: a */
    List<b> m40234a(String str) {
        List<b> arrayList = Collections.EMPTY_LIST;
        for (b bVar : this.f38631a) {
            if (bVar.m40237a(str)) {
                if (arrayList.isEmpty()) {
                    arrayList = new ArrayList<>();
                }
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: a */
    public void m40235a(String str, List<Certificate> list) throws SSLPeerUnverifiedException {
        List<b> listM40234a = m40234a(str);
        if (listM40234a.isEmpty()) {
            return;
        }
        AbstractC13771c abstractC13771c = this.f38632b;
        if (abstractC13771c != null) {
            list = abstractC13771c.mo40612a(list, str);
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            X509Certificate x509Certificate = (X509Certificate) list.get(i);
            int size2 = listM40234a.size();
            C13796f c13796fM40232b = null;
            C13796f c13796fM40230a = null;
            for (int i2 = 0; i2 < size2; i2++) {
                b bVar = listM40234a.get(i2);
                if (bVar.f38636c.equals("sha256/")) {
                    if (c13796fM40232b == null) {
                        c13796fM40232b = m40232b(x509Certificate);
                    }
                    if (bVar.f38637d.equals(c13796fM40232b)) {
                        return;
                    }
                } else {
                    if (!bVar.f38636c.equals("sha1/")) {
                        throw new AssertionError("unsupported hashAlgorithm: " + bVar.f38636c);
                    }
                    if (c13796fM40230a == null) {
                        c13796fM40230a = m40230a(x509Certificate);
                    }
                    if (bVar.f38637d.equals(c13796fM40230a)) {
                        return;
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder("Certificate pinning failure!\n  Peer certificate chain:");
        int size3 = list.size();
        for (int i3 = 0; i3 < size3; i3++) {
            X509Certificate x509Certificate2 = (X509Certificate) list.get(i3);
            sb.append("\n    ");
            sb.append(m40231a((Certificate) x509Certificate2));
            sb.append(": ");
            sb.append(x509Certificate2.getSubjectDN().getName());
        }
        sb.append("\n  Pinned certificates for ");
        sb.append(str);
        sb.append(CertificateUtil.DELIMITER);
        int size4 = listM40234a.size();
        for (int i4 = 0; i4 < size4; i4++) {
            b bVar2 = listM40234a.get(i4);
            sb.append("\n    ");
            sb.append(bVar2);
        }
        throw new SSLPeerUnverifiedException(sb.toString());
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13717f)) {
            return false;
        }
        C13717f c13717f = (C13717f) obj;
        return C13723c.m40287a(this.f38632b, c13717f.f38632b) && this.f38631a.equals(c13717f.f38631a);
    }

    public int hashCode() {
        AbstractC13771c abstractC13771c = this.f38632b;
        return ((abstractC13771c != null ? abstractC13771c.hashCode() : 0) * 31) + this.f38631a.hashCode();
    }
}
