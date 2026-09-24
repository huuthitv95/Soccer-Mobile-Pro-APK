package com.mbridge.msdk.thrid.okhttp.internal.tls;

import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.tls.a */
/* JADX INFO: compiled from: BasicCertificateChainCleaner.java */
/* JADX INFO: loaded from: classes7.dex */
public final class C13769a extends AbstractC13771c {

    /* JADX INFO: renamed from: a */
    private final InterfaceC13773e f39127a;

    public C13769a(InterfaceC13773e interfaceC13773e) {
        this.f39127a = interfaceC13773e;
    }

    /* JADX INFO: renamed from: a */
    private boolean m40644a(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!x509Certificate.getIssuerDN().equals(x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.tls.AbstractC13771c
    /* JADX INFO: renamed from: a */
    public List<Certificate> mo40612a(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
        X509Certificate x509Certificate;
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add(arrayDeque.removeFirst());
        boolean z = false;
        for (int i = 0; i < 9; i++) {
            X509Certificate x509Certificate2 = (X509Certificate) arrayList.get(arrayList.size() - 1);
            X509Certificate x509CertificateMo40613a = this.f39127a.mo40613a(x509Certificate2);
            if (x509CertificateMo40613a != null) {
                if (arrayList.size() > 1 || !x509Certificate2.equals(x509CertificateMo40613a)) {
                    arrayList.add(x509CertificateMo40613a);
                }
                if (m40644a(x509CertificateMo40613a, x509CertificateMo40613a)) {
                    return arrayList;
                }
                z = true;
            } else {
                Iterator it = arrayDeque.iterator();
                do {
                    if (!it.hasNext()) {
                        if (!z) {
                            throw new SSLPeerUnverifiedException("Failed to find a trusted cert that signed " + x509Certificate2);
                        }
                        return arrayList;
                    }
                    x509Certificate = (X509Certificate) it.next();
                } while (!m40644a(x509Certificate2, x509Certificate));
                it.remove();
                arrayList.add(x509Certificate);
            }
        }
        throw new SSLPeerUnverifiedException("Certificate chain too long: " + arrayList);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof C13769a) && ((C13769a) obj).f39127a.equals(this.f39127a);
    }

    public int hashCode() {
        return this.f39127a.hashCode();
    }
}
