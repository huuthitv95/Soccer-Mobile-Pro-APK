package com.mbridge.msdk.thrid.okhttp;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.thrid.okhttp.internal.C13723c;
import java.io.IOException;
import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.q */
/* JADX INFO: compiled from: Handshake.java */
/* JADX INFO: loaded from: classes7.dex */
public final class C13781q {

    /* JADX INFO: renamed from: a */
    private final EnumC13715d0 f39174a;

    /* JADX INFO: renamed from: b */
    private final C13718g f39175b;

    /* JADX INFO: renamed from: c */
    private final List<Certificate> f39176c;

    /* JADX INFO: renamed from: d */
    private final List<Certificate> f39177d;

    private C13781q(EnumC13715d0 enumC13715d0, C13718g c13718g, List<Certificate> list, List<Certificate> list2) {
        this.f39174a = enumC13715d0;
        this.f39175b = c13718g;
        this.f39176c = list;
        this.f39177d = list2;
    }

    /* JADX INFO: renamed from: a */
    public static C13781q m40697a(SSLSession sSLSession) throws IOException {
        Certificate[] peerCertificates;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite == null) {
            throw new IllegalStateException("cipherSuite == null");
        }
        if ("SSL_NULL_WITH_NULL_NULL".equals(cipherSuite)) {
            throw new IOException("cipherSuite == SSL_NULL_WITH_NULL_NULL");
        }
        C13718g c13718gM40238a = C13718g.m40238a(cipherSuite);
        String protocol = sSLSession.getProtocol();
        if (protocol == null) {
            throw new IllegalStateException("tlsVersion == null");
        }
        if ("NONE".equals(protocol)) {
            throw new IOException("tlsVersion == NONE");
        }
        EnumC13715d0 enumC13715d0M40227a = EnumC13715d0.m40227a(protocol);
        try {
            peerCertificates = sSLSession.getPeerCertificates();
        } catch (SSLPeerUnverifiedException unused) {
            peerCertificates = null;
        }
        List listM40277a = peerCertificates != null ? C13723c.m40277a(peerCertificates) : Collections.EMPTY_LIST;
        Certificate[] localCertificates = sSLSession.getLocalCertificates();
        return new C13781q(enumC13715d0M40227a, c13718gM40238a, listM40277a, localCertificates != null ? C13723c.m40277a(localCertificates) : Collections.EMPTY_LIST);
    }

    /* JADX INFO: renamed from: a */
    public C13718g m40698a() {
        return this.f39175b;
    }

    /* JADX INFO: renamed from: b */
    public List<Certificate> m40699b() {
        return this.f39176c;
    }

    /* JADX INFO: renamed from: c */
    public EnumC13715d0 m40700c() {
        return this.f39174a;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C13781q)) {
            return false;
        }
        C13781q c13781q = (C13781q) obj;
        return this.f39174a.equals(c13781q.f39174a) && this.f39175b.equals(c13781q.f39175b) && this.f39176c.equals(c13781q.f39176c) && this.f39177d.equals(c13781q.f39177d);
    }

    public int hashCode() {
        return ((((((this.f39174a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f39175b.hashCode()) * 31) + this.f39176c.hashCode()) * 31) + this.f39177d.hashCode();
    }
}
