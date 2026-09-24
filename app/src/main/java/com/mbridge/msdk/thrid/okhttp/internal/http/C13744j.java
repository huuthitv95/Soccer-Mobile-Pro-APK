package com.mbridge.msdk.thrid.okhttp.internal.http;

import com.google.common.net.HttpHeaders;
import com.mbridge.msdk.thrid.okhttp.AbstractC13711b0;
import com.mbridge.msdk.thrid.okhttp.AbstractC13779o;
import com.mbridge.msdk.thrid.okhttp.AbstractC13790z;
import com.mbridge.msdk.thrid.okhttp.C13708a;
import com.mbridge.msdk.thrid.okhttp.C13709a0;
import com.mbridge.msdk.thrid.okhttp.C13713c0;
import com.mbridge.msdk.thrid.okhttp.C13717f;
import com.mbridge.msdk.thrid.okhttp.C13783s;
import com.mbridge.msdk.thrid.okhttp.C13786v;
import com.mbridge.msdk.thrid.okhttp.C13789y;
import com.mbridge.msdk.thrid.okhttp.InterfaceC13714d;
import com.mbridge.msdk.thrid.okhttp.InterfaceC13784t;
import com.mbridge.msdk.thrid.okhttp.internal.C13723c;
import com.mbridge.msdk.thrid.okhttp.internal.connection.C13731e;
import com.mbridge.msdk.thrid.okhttp.internal.connection.C13733g;
import com.mbridge.msdk.thrid.okhttp.internal.http2.C13747a;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.http.j */
/* JADX INFO: compiled from: RetryAndFollowUpInterceptor.java */
/* JADX INFO: loaded from: classes7.dex */
public final class C13744j implements InterfaceC13784t {

    /* JADX INFO: renamed from: a */
    private final C13786v f38877a;

    /* JADX INFO: renamed from: b */
    private final boolean f38878b;

    /* JADX INFO: renamed from: c */
    private volatile C13733g f38879c;

    /* JADX INFO: renamed from: d */
    private Object f38880d;

    /* JADX INFO: renamed from: e */
    private volatile boolean f38881e;

    public C13744j(C13786v c13786v, boolean z) {
        this.f38877a = c13786v;
        this.f38878b = z;
    }

    /* JADX INFO: renamed from: a */
    private int m40406a(C13709a0 c13709a0, int i) {
        String strM40166b = c13709a0.m40166b("Retry-After");
        if (strM40166b == null) {
            return i;
        }
        if (strM40166b.matches("\\d+")) {
            return Integer.valueOf(strM40166b).intValue();
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: renamed from: a */
    private C13708a m40407a(C13783s c13783s) {
        SSLSocketFactory sSLSocketFactoryM40771B;
        HostnameVerifier hostnameVerifierM40786o;
        C13717f c13717fM40776c;
        if (c13783s.m40739h()) {
            sSLSocketFactoryM40771B = this.f38877a.m40771B();
            hostnameVerifierM40786o = this.f38877a.m40786o();
            c13717fM40776c = this.f38877a.m40776c();
        } else {
            sSLSocketFactoryM40771B = null;
            hostnameVerifierM40786o = null;
            c13717fM40776c = null;
        }
        return new C13708a(c13783s.m40738g(), c13783s.m40741j(), this.f38877a.m40782k(), this.f38877a.m40770A(), sSLSocketFactoryM40771B, hostnameVerifierM40786o, c13717fM40776c, this.f38877a.m40794w(), this.f38877a.m40793v(), this.f38877a.m40792u(), this.f38877a.m40779g(), this.f38877a.m40795x());
    }

    /* JADX INFO: renamed from: a */
    private C13789y m40408a(C13709a0 c13709a0, C13713c0 c13713c0) throws IOException {
        String strM40166b;
        C13783s c13783sM40735e;
        if (c13709a0 == null) {
            throw new IllegalStateException();
        }
        int iM40169k = c13709a0.m40169k();
        String strM40829e = c13709a0.m40177s().m40829e();
        if (iM40169k == 307 || iM40169k == 308) {
            if (!strM40829e.equals("GET") && !strM40829e.equals("HEAD")) {
                return null;
            }
        } else {
            if (iM40169k == 401) {
                return this.f38877a.m40773a().mo40196a(c13713c0, c13709a0);
            }
            if (iM40169k == 503) {
                if ((c13709a0.m40175q() == null || c13709a0.m40175q().m40169k() != 503) && m40406a(c13709a0, Integer.MAX_VALUE) == 0) {
                    return c13709a0.m40177s();
                }
                return null;
            }
            if (iM40169k == 407) {
                if (c13713c0.m40221b().type() == Proxy.Type.HTTP) {
                    return this.f38877a.m40794w().mo40196a(c13713c0, c13709a0);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (iM40169k == 408) {
                if (!this.f38877a.m40797z()) {
                    return null;
                }
                c13709a0.m40177s().m40824a();
                if ((c13709a0.m40175q() == null || c13709a0.m40175q().m40169k() != 408) && m40406a(c13709a0, 0) <= 0) {
                    return c13709a0.m40177s();
                }
                return null;
            }
            switch (iM40169k) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        if (!this.f38877a.m40784m() || (strM40166b = c13709a0.m40166b(HttpHeaders.LOCATION)) == null || (c13783sM40735e = c13709a0.m40177s().m40831g().m40735e(strM40166b)) == null) {
            return null;
        }
        if (!c13783sM40735e.m40744m().equals(c13709a0.m40177s().m40831g().m40744m()) && !this.f38877a.m40785n()) {
            return null;
        }
        C13789y.a aVarM40830f = c13709a0.m40177s().m40830f();
        if (C13740f.m40388a(strM40829e)) {
            boolean zM40390c = C13740f.m40390c(strM40829e);
            if (C13740f.m40389b(strM40829e)) {
                aVarM40830f.m40837a("GET", (AbstractC13790z) null);
            } else {
                aVarM40830f.m40837a(strM40829e, zM40390c ? c13709a0.m40177s().m40824a() : null);
            }
            if (!zM40390c) {
                aVarM40830f.m40836a(HttpHeaders.TRANSFER_ENCODING);
                aVarM40830f.m40836a(HttpHeaders.CONTENT_LENGTH);
                aVarM40830f.m40836a("Content-Type");
            }
        }
        if (!m40409a(c13709a0, c13783sM40735e)) {
            aVarM40830f.m40836a(HttpHeaders.AUTHORIZATION);
        }
        return aVarM40830f.m40834a(c13783sM40735e).m40839a();
    }

    /* JADX INFO: renamed from: a */
    private boolean m40409a(C13709a0 c13709a0, C13783s c13783s) {
        C13783s c13783sM40831g = c13709a0.m40177s().m40831g();
        return c13783sM40831g.m40738g().equals(c13783s.m40738g()) && c13783sM40831g.m40741j() == c13783s.m40741j() && c13783sM40831g.m40744m().equals(c13783s.m40744m());
    }

    /* JADX INFO: renamed from: a */
    private boolean m40410a(IOException iOException, C13733g c13733g, boolean z, C13789y c13789y) {
        c13733g.m40359a(iOException);
        if (this.f38877a.m40797z()) {
            return !(z && m40411a(iOException, c13789y)) && m40412a(iOException, z) && c13733g.m40364d();
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    private boolean m40411a(IOException iOException, C13789y c13789y) {
        c13789y.m40824a();
        return iOException instanceof FileNotFoundException;
    }

    /* JADX INFO: renamed from: a */
    private boolean m40412a(IOException iOException, boolean z) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            return (iOException instanceof SocketTimeoutException) && !z;
        }
        return (((iOException instanceof SSLHandshakeException) && (iOException.getCause() instanceof CertificateException)) || (iOException instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.InterfaceC13784t
    /* JADX INFO: renamed from: a */
    public C13709a0 mo40305a(InterfaceC13784t.a aVar) throws IOException {
        C13789y c13789yMo40397d = aVar.mo40397d();
        C13741g c13741g = (C13741g) aVar;
        InterfaceC13714d interfaceC13714dM40398e = c13741g.m40398e();
        AbstractC13779o abstractC13779oM40400g = c13741g.m40400g();
        C13733g c13733g = new C13733g(this.f38877a.m40778f(), m40407a(c13789yMo40397d.m40831g()), interfaceC13714dM40398e, abstractC13779oM40400g, this.f38880d);
        this.f38879c = c13733g;
        C13733g c13733g2 = c13733g;
        int i = 0;
        C13709a0 c13709a0M40394a = null;
        C13789y c13789y = c13789yMo40397d;
        while (!this.f38881e) {
            try {
                try {
                    try {
                        c13709a0M40394a = c13741g.m40394a(c13789y, c13733g2, null, null);
                        if (c13709a0M40394a != null) {
                            c13709a0M40394a = c13709a0M40394a.m40174p().m40195d(c13709a0M40394a.m40174p().m40184a((AbstractC13711b0) null).m40191a()).m40191a();
                        }
                        try {
                            C13789y c13789yM40408a = m40408a(c13709a0M40394a, c13733g2.m40367h());
                            if (c13789yM40408a == null) {
                                c13733g2.m40366f();
                                return c13709a0M40394a;
                            }
                            C13723c.m40282a(c13709a0M40394a.m40167d());
                            int i2 = i + 1;
                            if (i2 > 20) {
                                c13733g2.m40366f();
                                throw new ProtocolException("Too many follow-up requests: " + i2);
                            }
                            c13789yM40408a.m40824a();
                            if (!m40409a(c13709a0M40394a, c13789yM40408a.m40831g())) {
                                c13733g2.m40366f();
                                C13733g c13733g3 = new C13733g(this.f38877a.m40778f(), m40407a(c13789yM40408a.m40831g()), interfaceC13714dM40398e, abstractC13779oM40400g, this.f38880d);
                                this.f38879c = c13733g3;
                                c13733g2 = c13733g3;
                            } else if (c13733g2.m40361b() != null) {
                                throw new IllegalStateException("Closing the body of " + c13709a0M40394a + " didn't close its backing stream. Bad interceptor?");
                            }
                            c13789y = c13789yM40408a;
                            i = i2;
                        } catch (IOException e) {
                            c13733g2.m40366f();
                            throw e;
                        }
                    } catch (C13731e e2) {
                        if (!m40410a(e2.m40338g(), c13733g2, false, c13789y)) {
                            throw e2.m40337d();
                        }
                    }
                } catch (IOException e3) {
                    if (!m40410a(e3, c13733g2, !(e3 instanceof C13747a), c13789y)) {
                        throw e3;
                    }
                }
            } catch (Throwable th) {
                c13733g2.m40359a((IOException) null);
                c13733g2.m40366f();
                throw th;
            }
        }
        c13733g2.m40366f();
        throw new IOException("Canceled");
    }

    /* JADX INFO: renamed from: a */
    public void m40413a() {
        this.f38881e = true;
        C13733g c13733g = this.f38879c;
        if (c13733g != null) {
            c13733g.m40357a();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m40414a(Object obj) {
        this.f38880d = obj;
    }

    /* JADX INFO: renamed from: b */
    public boolean m40415b() {
        return this.f38881e;
    }
}
