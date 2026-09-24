package com.mbridge.msdk.thrid.okhttp.internal.tls;

import com.mbridge.msdk.thrid.okhttp.internal.platform.C13767g;
import java.security.cert.Certificate;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.tls.c */
/* JADX INFO: compiled from: CertificateChainCleaner.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC13771c {
    /* JADX INFO: renamed from: a */
    public static AbstractC13771c m40645a(X509TrustManager x509TrustManager) {
        return C13767g.m40635d().mo40604a(x509TrustManager);
    }

    /* JADX INFO: renamed from: a */
    public abstract List<Certificate> mo40612a(List<Certificate> list, String str) throws SSLPeerUnverifiedException;
}
