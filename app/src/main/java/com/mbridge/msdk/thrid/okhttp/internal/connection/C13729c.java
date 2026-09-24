package com.mbridge.msdk.thrid.okhttp.internal.connection;

import com.facebook.internal.security.CertificateUtil;
import com.google.common.net.HttpHeaders;
import com.mbridge.msdk.thrid.okhttp.AbstractC13779o;
import com.mbridge.msdk.thrid.okhttp.AbstractC13790z;
import com.mbridge.msdk.thrid.okhttp.C13708a;
import com.mbridge.msdk.thrid.okhttp.C13709a0;
import com.mbridge.msdk.thrid.okhttp.C13713c0;
import com.mbridge.msdk.thrid.okhttp.C13717f;
import com.mbridge.msdk.thrid.okhttp.C13720i;
import com.mbridge.msdk.thrid.okhttp.C13774j;
import com.mbridge.msdk.thrid.okhttp.C13781q;
import com.mbridge.msdk.thrid.okhttp.C13783s;
import com.mbridge.msdk.thrid.okhttp.C13786v;
import com.mbridge.msdk.thrid.okhttp.C13789y;
import com.mbridge.msdk.thrid.okhttp.EnumC13787w;
import com.mbridge.msdk.thrid.okhttp.InterfaceC13714d;
import com.mbridge.msdk.thrid.okhttp.InterfaceC13719h;
import com.mbridge.msdk.thrid.okhttp.InterfaceC13784t;
import com.mbridge.msdk.thrid.okhttp.internal.AbstractC13721a;
import com.mbridge.msdk.thrid.okhttp.internal.C13723c;
import com.mbridge.msdk.thrid.okhttp.internal.C13734d;
import com.mbridge.msdk.thrid.okhttp.internal.http.C13739e;
import com.mbridge.msdk.thrid.okhttp.internal.http.InterfaceC13737c;
import com.mbridge.msdk.thrid.okhttp.internal.http1.C13746a;
import com.mbridge.msdk.thrid.okhttp.internal.http2.C13752f;
import com.mbridge.msdk.thrid.okhttp.internal.http2.C13753g;
import com.mbridge.msdk.thrid.okhttp.internal.http2.C13755i;
import com.mbridge.msdk.thrid.okhttp.internal.http2.EnumC13748b;
import com.mbridge.msdk.thrid.okhttp.internal.platform.C13767g;
import com.mbridge.msdk.thrid.okhttp.internal.tls.C13772d;
import com.mbridge.msdk.thrid.okio.C13802l;
import com.mbridge.msdk.thrid.okio.C13810t;
import com.mbridge.msdk.thrid.okio.InterfaceC13794d;
import com.mbridge.msdk.thrid.okio.InterfaceC13795e;
import com.mbridge.msdk.thrid.okio.InterfaceC13809s;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.connection.c */
/* JADX INFO: compiled from: RealConnection.java */
/* JADX INFO: loaded from: classes7.dex */
public final class C13729c extends C13753g.j implements InterfaceC13719h {

    /* JADX INFO: renamed from: b */
    private final C13720i f38811b;

    /* JADX INFO: renamed from: c */
    private final C13713c0 f38812c;

    /* JADX INFO: renamed from: d */
    private Socket f38813d;

    /* JADX INFO: renamed from: e */
    private Socket f38814e;

    /* JADX INFO: renamed from: f */
    private C13781q f38815f;

    /* JADX INFO: renamed from: g */
    private EnumC13787w f38816g;

    /* JADX INFO: renamed from: h */
    private C13753g f38817h;

    /* JADX INFO: renamed from: i */
    private InterfaceC13795e f38818i;

    /* JADX INFO: renamed from: j */
    private InterfaceC13794d f38819j;

    /* JADX INFO: renamed from: k */
    public boolean f38820k;

    /* JADX INFO: renamed from: l */
    public int f38821l;

    /* JADX INFO: renamed from: m */
    public int f38822m = 1;

    /* JADX INFO: renamed from: n */
    public final List<Reference<C13733g>> f38823n = new ArrayList();

    /* JADX INFO: renamed from: o */
    public long f38824o = Long.MAX_VALUE;

    public C13729c(C13720i c13720i, C13713c0 c13713c0) {
        this.f38811b = c13720i;
        this.f38812c = c13713c0;
    }

    /* JADX INFO: renamed from: a */
    private C13789y m40316a(int i, int i2, C13789y c13789y, C13783s c13783s) throws IOException {
        String str = "CONNECT " + C13723c.m40270a(c13783s, true) + " HTTP/1.1";
        while (true) {
            C13746a c13746a = new C13746a(null, null, this.f38818i, this.f38819j);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            this.f38818i.mo40428b().mo40931a(i, timeUnit);
            this.f38819j.mo40429b().mo40931a(i2, timeUnit);
            c13746a.m40420a(c13789y.m40827c(), str);
            c13746a.mo40374a();
            C13709a0 c13709a0M40191a = c13746a.mo40371a(false).m40188a(c13789y).m40191a();
            long jM40382a = C13739e.m40382a(c13709a0M40191a);
            if (jM40382a == -1) {
                jM40382a = 0;
            }
            InterfaceC13809s interfaceC13809sM40422b = c13746a.m40422b(jM40382a);
            C13723c.m40293b(interfaceC13809sM40422b, Integer.MAX_VALUE, timeUnit);
            interfaceC13809sM40422b.close();
            int iM40169k = c13709a0M40191a.m40169k();
            if (iM40169k == 200) {
                if (this.f38818i.mo40865a().mo40892f() && this.f38819j.mo40865a().mo40892f()) {
                    return null;
                }
                throw new IOException("TLS tunnel buffered too many bytes!");
            }
            if (iM40169k != 407) {
                throw new IOException("Unexpected response code for CONNECT: " + c13709a0M40191a.m40169k());
            }
            C13789y c13789yMo40196a = this.f38812c.m40220a().m40160g().mo40196a(this.f38812c, c13709a0M40191a);
            if (c13789yMo40196a == null) {
                throw new IOException("Failed to authenticate with proxy");
            }
            if ("close".equalsIgnoreCase(c13709a0M40191a.m40166b(HttpHeaders.CONNECTION))) {
                return c13789yMo40196a;
            }
            c13789y = c13789yMo40196a;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m40317a(int i) throws IOException {
        this.f38814e.setSoTimeout(0);
        C13753g c13753gM40504a = new C13753g.h(true).m40503a(this.f38814e, this.f38812c.m40220a().m40164k().m40738g(), this.f38818i, this.f38819j).m40502a(this).m40501a(i).m40504a();
        this.f38817h = c13753gM40504a;
        c13753gM40504a.m40500m();
    }

    /* JADX INFO: renamed from: a */
    private void m40318a(int i, int i2, int i3, InterfaceC13714d interfaceC13714d, AbstractC13779o abstractC13779o) throws IOException {
        C13789y c13789yM40322e = m40322e();
        C13783s c13783sM40831g = c13789yM40322e.m40831g();
        for (int i4 = 0; i4 < 21; i4++) {
            m40319a(i, i2, interfaceC13714d, abstractC13779o);
            c13789yM40322e = m40316a(i2, i3, c13789yM40322e, c13783sM40831g);
            if (c13789yM40322e == null) {
                return;
            }
            C13723c.m40284a(this.f38813d);
            this.f38813d = null;
            this.f38819j = null;
            this.f38818i = null;
            abstractC13779o.connectEnd(interfaceC13714d, this.f38812c.m40223d(), this.f38812c.m40221b(), null);
        }
    }

    /* JADX INFO: renamed from: a */
    private void m40319a(int i, int i2, InterfaceC13714d interfaceC13714d, AbstractC13779o abstractC13779o) throws IOException {
        Proxy proxyM40221b = this.f38812c.m40221b();
        this.f38813d = (proxyM40221b.type() == Proxy.Type.DIRECT || proxyM40221b.type() == Proxy.Type.HTTP) ? this.f38812c.m40220a().m40162i().createSocket() : new Socket(proxyM40221b);
        abstractC13779o.connectStart(interfaceC13714d, this.f38812c.m40223d(), proxyM40221b);
        this.f38813d.setSoTimeout(i2);
        try {
            C13767g.m40635d().mo40608a(this.f38813d, this.f38812c.m40223d(), i);
            try {
                this.f38818i = C13802l.m40944a(C13802l.m40950b(this.f38813d));
                this.f38819j = C13802l.m40943a(C13802l.m40946a(this.f38813d));
            } catch (NullPointerException e) {
                if ("throw with null exception".equals(e.getMessage())) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.f38812c.m40223d());
            connectException.initCause(e2);
            throw connectException;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m40320a(C13728b c13728b) throws Throwable {
        C13708a c13708aM40220a = this.f38812c.m40220a();
        SSLSocket sSLSocket = null;
        try {
            try {
                SSLSocket sSLSocket2 = (SSLSocket) c13708aM40220a.m40163j().createSocket(this.f38813d, c13708aM40220a.m40164k().m40738g(), c13708aM40220a.m40164k().m40741j(), true);
                try {
                    C13774j c13774jM40314a = c13728b.m40314a(sSLSocket2);
                    if (c13774jM40314a.m40657c()) {
                        C13767g.m40635d().mo40597a(sSLSocket2, c13708aM40220a.m40164k().m40738g(), c13708aM40220a.m40158e());
                    }
                    sSLSocket2.startHandshake();
                    SSLSession session = sSLSocket2.getSession();
                    C13781q c13781qM40697a = C13781q.m40697a(session);
                    if (c13708aM40220a.m40157d().verify(c13708aM40220a.m40164k().m40738g(), session)) {
                        c13708aM40220a.m40153a().m40235a(c13708aM40220a.m40164k().m40738g(), c13781qM40697a.m40699b());
                        String strMo40598b = c13774jM40314a.m40657c() ? C13767g.m40635d().mo40598b(sSLSocket2) : null;
                        this.f38814e = sSLSocket2;
                        this.f38818i = C13802l.m40944a(C13802l.m40950b(sSLSocket2));
                        this.f38819j = C13802l.m40943a(C13802l.m40946a(this.f38814e));
                        this.f38815f = c13781qM40697a;
                        this.f38816g = strMo40598b != null ? EnumC13787w.m40812a(strMo40598b) : EnumC13787w.HTTP_1_1;
                        C13767g.m40635d().mo40622a(sSLSocket2);
                        return;
                    }
                    List<Certificate> listM40699b = c13781qM40697a.m40699b();
                    if (listM40699b.isEmpty()) {
                        throw new SSLPeerUnverifiedException("Hostname " + c13708aM40220a.m40164k().m40738g() + " not verified (no certificates)");
                    }
                    X509Certificate x509Certificate = (X509Certificate) listM40699b.get(0);
                    throw new SSLPeerUnverifiedException("Hostname " + c13708aM40220a.m40164k().m40738g() + " not verified:\n    certificate: " + C13717f.m40231a((Certificate) x509Certificate) + "\n    DN: " + x509Certificate.getSubjectDN().getName() + "\n    subjectAltNames: " + C13772d.m40646a(x509Certificate));
                } catch (AssertionError e) {
                    e = e;
                    if (!C13723c.m40286a(e)) {
                        throw e;
                    }
                    throw new IOException(e);
                } catch (Throwable th) {
                    th = th;
                    sSLSocket = sSLSocket2;
                    if (sSLSocket != null) {
                        C13767g.m40635d().mo40622a(sSLSocket);
                    }
                    C13723c.m40284a((Socket) sSLSocket);
                    throw th;
                }
            } catch (AssertionError e2) {
                e = e2;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* JADX INFO: renamed from: a */
    private void m40321a(C13728b c13728b, int i, InterfaceC13714d interfaceC13714d, AbstractC13779o abstractC13779o) throws Throwable {
        if (this.f38812c.m40220a().m40163j() != null) {
            abstractC13779o.secureConnectStart(interfaceC13714d);
            m40320a(c13728b);
            abstractC13779o.secureConnectEnd(interfaceC13714d, this.f38815f);
            if (this.f38816g == EnumC13787w.HTTP_2) {
                m40317a(i);
                return;
            }
            return;
        }
        List<EnumC13787w> listM40158e = this.f38812c.m40220a().m40158e();
        EnumC13787w enumC13787w = EnumC13787w.H2_PRIOR_KNOWLEDGE;
        if (!listM40158e.contains(enumC13787w)) {
            this.f38814e = this.f38813d;
            this.f38816g = EnumC13787w.HTTP_1_1;
        } else {
            this.f38814e = this.f38813d;
            this.f38816g = enumC13787w;
            m40317a(i);
        }
    }

    /* JADX INFO: renamed from: e */
    private C13789y m40322e() throws IOException {
        C13789y c13789yM40839a = new C13789y.a().m40834a(this.f38812c.m40220a().m40164k()).m40837a("CONNECT", (AbstractC13790z) null).m40843b(HttpHeaders.HOST, C13723c.m40270a(this.f38812c.m40220a().m40164k(), true)).m40843b("Proxy-Connection", HttpHeaders.KEEP_ALIVE).m40843b("User-Agent", C13734d.m40368a()).m40839a();
        C13789y c13789yMo40196a = this.f38812c.m40220a().m40160g().mo40196a(this.f38812c, new C13709a0.a().m40188a(c13789yM40839a).m40187a(EnumC13787w.HTTP_1_1).m40181a(407).m40189a("Preemptive Authenticate").m40184a(C13723c.f38773c).m40192b(-1L).m40182a(-1L).m40193b(HttpHeaders.PROXY_AUTHENTICATE, "OkHttp-Preemptive").m40191a());
        return c13789yMo40196a != null ? c13789yMo40196a : c13789yM40839a;
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC13737c m40323a(C13786v c13786v, InterfaceC13784t.a aVar, C13733g c13733g) throws SocketException {
        if (this.f38817h != null) {
            return new C13752f(c13786v, aVar, c13733g, this.f38817h);
        }
        this.f38814e.setSoTimeout(aVar.mo40395b());
        C13810t c13810tMo40428b = this.f38818i.mo40428b();
        long jMo40395b = aVar.mo40395b();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c13810tMo40428b.mo40931a(jMo40395b, timeUnit);
        this.f38819j.mo40429b().mo40931a(aVar.mo40396c(), timeUnit);
        return new C13746a(c13786v, c13733g, this.f38818i, this.f38819j);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.InterfaceC13719h
    /* JADX INFO: renamed from: a */
    public EnumC13787w mo40243a() {
        return this.f38816g;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0126  */
    /* JADX WARN: Code duplicated, block: B:59:0x012c  */
    /* JADX WARN: Code duplicated, block: B:61:0x0131  */
    /* JADX WARN: Code duplicated, block: B:81:0x0139 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:82:0x0139 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:83:? A[LOOP:0: B:71:0x007f->B:83:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [com.mbridge.msdk.thrid.okhttp.internal.connection.c] */
    /* JADX WARN: Type inference failed for: r1v11, types: [com.mbridge.msdk.thrid.okhttp.o] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.mbridge.msdk.thrid.okhttp.o] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX INFO: renamed from: a */
    public void m40324a(int i, int i2, int i3, int i4, boolean z, InterfaceC13714d interfaceC13714d, AbstractC13779o abstractC13779o) throws Throwable {
        EnumC13787w enumC13787w;
        ?? r1;
        InterfaceC13714d interfaceC13714d2;
        IOException iOException;
        boolean zMo40610b;
        if (this.f38816g != null) {
            throw new IllegalStateException("already connected");
        }
        List<C13774j> listM40155b = this.f38812c.m40220a().m40155b();
        C13728b c13728b = new C13728b(listM40155b);
        if (this.f38812c.m40220a().m40163j() != null) {
            List<EnumC13787w> listM40158e = this.f38812c.m40220a().m40158e();
            enumC13787w = EnumC13787w.H2_PRIOR_KNOWLEDGE;
            if (listM40158e.contains(enumC13787w)) {
                r1 = enumC13787w;
                throw new C13731e(new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS"));
            }
        } else {
            if (!listM40155b.contains(C13774j.f39135j)) {
                throw new C13731e(new UnknownServiceException("CLEARTEXT communication not enabled for client"));
            }
            String strM40738g = this.f38812c.m40220a().m40164k().m40738g();
            zMo40610b = C13767g.m40635d().mo40610b(strM40738g);
            if (!zMo40610b) {
                r1 = zMo40610b;
                throw new C13731e(new UnknownServiceException("CLEARTEXT communication to " + strM40738g + " not permitted by network security policy"));
            }
        }
        r1 = enumC13787w;
        r1 = zMo40610b;
        C13731e c13731e = null;
        while (true) {
            try {
                try {
                    if (this.f38812c.m40222c()) {
                        try {
                            m40318a(i, i2, i3, interfaceC13714d, abstractC13779o);
                            interfaceC13714d2 = interfaceC13714d;
                            r1 = abstractC13779o;
                            if (this.f38813d != null) {
                                break;
                            } else {
                                break;
                            }
                        } catch (IOException e) {
                            e = e;
                            interfaceC13714d2 = interfaceC13714d;
                            r1 = abstractC13779o;
                            iOException = e;
                            C13723c.m40284a(this.f38814e);
                            C13723c.m40284a(this.f38813d);
                            this.f38814e = null;
                            this.f38813d = null;
                            this.f38818i = null;
                            this.f38819j = null;
                            this.f38815f = null;
                            this.f38816g = null;
                            this.f38817h = null;
                            r1.connectFailed(interfaceC13714d2, this.f38812c.m40223d(), this.f38812c.m40221b(), null, iOException);
                            if (c13731e == null) {
                                c13731e = new C13731e(iOException);
                            } else {
                                c13731e.m40336a(iOException);
                            }
                            if (z) {
                                throw c13731e;
                            }
                            if (c13728b.m40315a(iOException)) {
                                throw c13731e;
                            }
                        }
                    } else {
                        interfaceC13714d2 = interfaceC13714d;
                        AbstractC13779o abstractC13779o2 = abstractC13779o;
                        m40319a(i, i2, interfaceC13714d2, abstractC13779o2);
                        r1 = abstractC13779o2;
                    }
                    try {
                        m40321a(c13728b, i4, interfaceC13714d2, r1);
                        r1.connectEnd(interfaceC13714d2, this.f38812c.m40223d(), this.f38812c.m40221b(), this.f38816g);
                        break;
                    } catch (IOException e2) {
                        e = e2;
                        iOException = e;
                        C13723c.m40284a(this.f38814e);
                        C13723c.m40284a(this.f38813d);
                        this.f38814e = null;
                        this.f38813d = null;
                        this.f38818i = null;
                        this.f38819j = null;
                        this.f38815f = null;
                        this.f38816g = null;
                        this.f38817h = null;
                        r1.connectFailed(interfaceC13714d2, this.f38812c.m40223d(), this.f38812c.m40221b(), null, iOException);
                        if (c13731e == null) {
                            c13731e = new C13731e(iOException);
                        } else {
                            c13731e.m40336a(iOException);
                        }
                        if (z) {
                            throw c13731e;
                        }
                        if (c13728b.m40315a(iOException)) {
                            throw c13731e;
                        }
                    }
                } catch (IOException e3) {
                    e = e3;
                }
            } catch (IOException e4) {
                e = e4;
                interfaceC13714d2 = interfaceC13714d;
                r1 = abstractC13779o;
            }
        }
        if (this.f38812c.m40222c() && this.f38813d == null) {
            throw new C13731e(new ProtocolException("Too many tunnel connections attempted: 21"));
        }
        if (this.f38817h != null) {
            synchronized (this.f38811b) {
                this.f38822m = this.f38817h.m40498k();
            }
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.C13753g.j
    /* JADX INFO: renamed from: a */
    public void mo40325a(C13753g c13753g) {
        synchronized (this.f38811b) {
            this.f38822m = c13753g.m40498k();
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.C13753g.j
    /* JADX INFO: renamed from: a */
    public void mo40326a(C13755i c13755i) throws IOException {
        c13755i.m40537a(EnumC13748b.REFUSED_STREAM);
    }

    /* JADX INFO: renamed from: a */
    public boolean m40327a(C13708a c13708a, @Nullable C13713c0 c13713c0) {
        if (this.f38823n.size() >= this.f38822m || this.f38820k || !AbstractC13721a.f38769a.mo40260a(this.f38812c.m40220a(), c13708a)) {
            return false;
        }
        if (c13708a.m40164k().m40738g().equals(mo40245c().m40220a().m40164k().m40738g())) {
            return true;
        }
        if (this.f38817h == null || c13713c0 == null || c13713c0.m40221b().type() != Proxy.Type.DIRECT || this.f38812c.m40221b().type() != Proxy.Type.DIRECT || !this.f38812c.m40223d().equals(c13713c0.m40223d()) || c13713c0.m40220a().m40157d() != C13772d.f39129a || !m40328a(c13708a.m40164k())) {
            return false;
        }
        try {
            c13708a.m40153a().m40235a(c13708a.m40164k().m40738g(), mo40244b().m40699b());
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m40328a(C13783s c13783s) {
        if (c13783s.m40741j() != this.f38812c.m40220a().m40164k().m40741j()) {
            return false;
        }
        if (c13783s.m40738g().equals(this.f38812c.m40220a().m40164k().m40738g())) {
            return true;
        }
        return this.f38815f != null && C13772d.f39129a.m40651a(c13783s.m40738g(), (X509Certificate) this.f38815f.m40699b().get(0));
    }

    /* JADX INFO: renamed from: a */
    public boolean m40329a(boolean z) {
        if (this.f38814e.isClosed() || this.f38814e.isInputShutdown() || this.f38814e.isOutputShutdown()) {
            return false;
        }
        C13753g c13753g = this.f38817h;
        if (c13753g != null) {
            return c13753g.m40496f(System.nanoTime());
        }
        if (z) {
            try {
                int soTimeout = this.f38814e.getSoTimeout();
                try {
                    this.f38814e.setSoTimeout(1);
                    if (this.f38818i.mo40892f()) {
                        this.f38814e.setSoTimeout(soTimeout);
                        return false;
                    }
                    this.f38814e.setSoTimeout(soTimeout);
                    return true;
                } catch (Throwable th) {
                    this.f38814e.setSoTimeout(soTimeout);
                    throw th;
                }
            } catch (SocketTimeoutException unused) {
            } catch (IOException unused2) {
                return false;
            }
        }
        return true;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.InterfaceC13719h
    /* JADX INFO: renamed from: b */
    public C13781q mo40244b() {
        return this.f38815f;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.InterfaceC13719h
    /* JADX INFO: renamed from: c */
    public C13713c0 mo40245c() {
        return this.f38812c;
    }

    /* JADX INFO: renamed from: d */
    public void m40330d() {
        C13723c.m40284a(this.f38813d);
    }

    /* JADX INFO: renamed from: f */
    public boolean m40331f() {
        return this.f38817h != null;
    }

    /* JADX INFO: renamed from: g */
    public Socket m40332g() {
        return this.f38814e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        sb.append(this.f38812c.m40220a().m40164k().m40738g());
        sb.append(CertificateUtil.DELIMITER);
        sb.append(this.f38812c.m40220a().m40164k().m40741j());
        sb.append(", proxy=");
        sb.append(this.f38812c.m40221b());
        sb.append(" hostAddress=");
        sb.append(this.f38812c.m40223d());
        sb.append(" cipherSuite=");
        C13781q c13781q = this.f38815f;
        sb.append(c13781q != null ? c13781q.m40698a() : "none");
        sb.append(" protocol=");
        sb.append(this.f38816g);
        sb.append(AbstractJsonLexerKt.END_OBJ);
        return sb.toString();
    }
}
