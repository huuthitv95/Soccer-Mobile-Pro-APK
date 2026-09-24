package com.mbridge.msdk.thrid.okhttp.internal.tls;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.tls.b */
/* JADX INFO: compiled from: BasicTrustRootIndex.java */
/* JADX INFO: loaded from: classes7.dex */
public final class C13770b implements InterfaceC13773e {

    /* JADX INFO: renamed from: a */
    private final Map<X500Principal, Set<X509Certificate>> f39128a = new LinkedHashMap();

    public C13770b(X509Certificate... x509CertificateArr) {
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Set<X509Certificate> linkedHashSet = this.f39128a.get(subjectX500Principal);
            if (linkedHashSet == null) {
                linkedHashSet = new LinkedHashSet<>(1);
                this.f39128a.put(subjectX500Principal, linkedHashSet);
            }
            linkedHashSet.add(x509Certificate);
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.tls.InterfaceC13773e
    /* JADX INFO: renamed from: a */
    public X509Certificate mo40613a(X509Certificate x509Certificate) {
        Set<X509Certificate> set = this.f39128a.get(x509Certificate.getIssuerX500Principal());
        if (set == null) {
            return null;
        }
        for (X509Certificate x509Certificate2 : set) {
            try {
                x509Certificate.verify(x509Certificate2.getPublicKey());
                return x509Certificate2;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C13770b) && ((C13770b) obj).f39128a.equals(this.f39128a);
    }

    public int hashCode() {
        return this.f39128a.hashCode();
    }
}
