package com.mbridge.msdk.thrid.okhttp.internal.http2;

import com.google.common.net.HttpHeaders;
import com.mbridge.msdk.thrid.okhttp.AbstractC13711b0;
import com.mbridge.msdk.thrid.okhttp.C13709a0;
import com.mbridge.msdk.thrid.okhttp.C13782r;
import com.mbridge.msdk.thrid.okhttp.C13786v;
import com.mbridge.msdk.thrid.okhttp.C13789y;
import com.mbridge.msdk.thrid.okhttp.EnumC13787w;
import com.mbridge.msdk.thrid.okhttp.InterfaceC13784t;
import com.mbridge.msdk.thrid.okhttp.internal.AbstractC13721a;
import com.mbridge.msdk.thrid.okhttp.internal.C13723c;
import com.mbridge.msdk.thrid.okhttp.internal.connection.C13733g;
import com.mbridge.msdk.thrid.okhttp.internal.http.C13739e;
import com.mbridge.msdk.thrid.okhttp.internal.http.C13742h;
import com.mbridge.msdk.thrid.okhttp.internal.http.C13743i;
import com.mbridge.msdk.thrid.okhttp.internal.http.C13745k;
import com.mbridge.msdk.thrid.okhttp.internal.http.InterfaceC13737c;
import com.mbridge.msdk.thrid.okio.AbstractC13798h;
import com.mbridge.msdk.thrid.okio.C13793c;
import com.mbridge.msdk.thrid.okio.C13796f;
import com.mbridge.msdk.thrid.okio.C13802l;
import com.mbridge.msdk.thrid.okio.C13810t;
import com.mbridge.msdk.thrid.okio.InterfaceC13808r;
import com.mbridge.msdk.thrid.okio.InterfaceC13809s;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.http2.f */
/* JADX INFO: compiled from: Http2Codec.java */
/* JADX INFO: loaded from: classes7.dex */
public final class C13752f implements InterfaceC13737c {

    /* JADX INFO: renamed from: f */
    private static final List<String> f38956f = C13723c.m40277a("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority");

    /* JADX INFO: renamed from: g */
    private static final List<String> f38957g = C13723c.m40277a("connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade");

    /* JADX INFO: renamed from: a */
    private final InterfaceC13784t.a f38958a;

    /* JADX INFO: renamed from: b */
    final C13733g f38959b;

    /* JADX INFO: renamed from: c */
    private final C13753g f38960c;

    /* JADX INFO: renamed from: d */
    private C13755i f38961d;

    /* JADX INFO: renamed from: e */
    private final EnumC13787w f38962e;

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.http2.f$a */
    /* JADX INFO: compiled from: Http2Codec.java */
    class a extends AbstractC13798h {

        /* JADX INFO: renamed from: b */
        boolean f38963b;

        /* JADX INFO: renamed from: c */
        long f38964c;

        a(InterfaceC13809s interfaceC13809s) {
            super(interfaceC13809s);
            this.f38963b = false;
            this.f38964c = 0L;
        }

        /* JADX INFO: renamed from: a */
        private void m40465a(IOException iOException) {
            if (this.f38963b) {
                return;
            }
            this.f38963b = true;
            C13752f c13752f = C13752f.this;
            c13752f.f38959b.m40360a(false, c13752f, this.f38964c, iOException);
        }

        @Override // com.mbridge.msdk.thrid.okio.InterfaceC13809s
        /* JADX INFO: renamed from: b */
        public long mo40427b(C13793c c13793c, long j) throws IOException {
            try {
                long jMo40427b = m40927d().mo40427b(c13793c, j);
                if (jMo40427b > 0) {
                    this.f38964c += jMo40427b;
                }
                return jMo40427b;
            } catch (IOException e) {
                m40465a(e);
                throw e;
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.AbstractC13798h, com.mbridge.msdk.thrid.okio.InterfaceC13809s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            m40465a(null);
        }
    }

    public C13752f(C13786v c13786v, InterfaceC13784t.a aVar, C13733g c13733g, C13753g c13753g) {
        this.f38958a = aVar;
        this.f38959b = c13733g;
        this.f38960c = c13753g;
        List<EnumC13787w> listM40792u = c13786v.m40792u();
        EnumC13787w enumC13787w = EnumC13787w.H2_PRIOR_KNOWLEDGE;
        this.f38962e = listM40792u.contains(enumC13787w) ? enumC13787w : EnumC13787w.HTTP_2;
    }

    /* JADX INFO: renamed from: a */
    public static C13709a0.a m40463a(C13782r c13782r, EnumC13787w enumC13787w) throws IOException {
        C13782r.a aVar = new C13782r.a();
        int iM40706b = c13782r.m40706b();
        C13745k c13745kM40416a = null;
        for (int i = 0; i < iM40706b; i++) {
            String strM40705a = c13782r.m40705a(i);
            String strM40707b = c13782r.m40707b(i);
            if (strM40705a.equals(":status")) {
                c13745kM40416a = C13745k.m40416a("HTTP/1.1 " + strM40707b);
            } else if (!f38957g.contains(strM40705a)) {
                AbstractC13721a.f38769a.mo40259a(aVar, strM40705a, strM40707b);
            }
        }
        if (c13745kM40416a != null) {
            return new C13709a0.a().m40187a(enumC13787w).m40181a(c13745kM40416a.f38883b).m40189a(c13745kM40416a.f38884c).m40186a(aVar.m40712a());
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    /* JADX INFO: renamed from: b */
    public static List<C13749c> m40464b(C13789y c13789y) {
        C13782r c13782rM40827c = c13789y.m40827c();
        ArrayList arrayList = new ArrayList(c13782rM40827c.m40706b() + 4);
        arrayList.add(new C13749c(C13749c.f38925f, c13789y.m40829e()));
        arrayList.add(new C13749c(C13749c.f38926g, C13743i.m40403a(c13789y.m40831g())));
        String strM40825a = c13789y.m40825a(HttpHeaders.HOST);
        if (strM40825a != null) {
            arrayList.add(new C13749c(C13749c.f38928i, strM40825a));
        }
        arrayList.add(new C13749c(C13749c.f38927h, c13789y.m40831g().m40744m()));
        int iM40706b = c13782rM40827c.m40706b();
        for (int i = 0; i < iM40706b; i++) {
            C13796f c13796fM40911c = C13796f.m40911c(c13782rM40827c.m40705a(i).toLowerCase(Locale.US));
            if (!f38956f.contains(c13796fM40911c.mo40926m())) {
                arrayList.add(new C13749c(c13796fM40911c, c13782rM40827c.m40707b(i)));
            }
        }
        return arrayList;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.InterfaceC13737c
    /* JADX INFO: renamed from: a */
    public C13709a0.a mo40371a(boolean z) throws IOException {
        C13709a0.a aVarM40463a = m40463a(this.f38961d.m40550j(), this.f38962e);
        if (z && AbstractC13721a.f38769a.mo40252a(aVarM40463a) == 100) {
            return null;
        }
        return aVarM40463a;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.InterfaceC13737c
    /* JADX INFO: renamed from: a */
    public AbstractC13711b0 mo40372a(C13709a0 c13709a0) throws IOException {
        C13733g c13733g = this.f38959b;
        c13733g.f38844f.responseBodyStart(c13733g.f38843e);
        return new C13742h(c13709a0.m40166b("Content-Type"), C13739e.m40382a(c13709a0), C13802l.m40944a(new a(this.f38961d.m40545e())));
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.InterfaceC13737c
    /* JADX INFO: renamed from: a */
    public InterfaceC13808r mo40373a(C13789y c13789y, long j) {
        return this.f38961d.m40543d();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.InterfaceC13737c
    /* JADX INFO: renamed from: a */
    public void mo40374a() throws IOException {
        this.f38961d.m40543d().close();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.InterfaceC13737c
    /* JADX INFO: renamed from: a */
    public void mo40375a(C13789y c13789y) throws IOException {
        if (this.f38961d != null) {
            return;
        }
        C13755i c13755iM40481a = this.f38960c.m40481a(m40464b(c13789y), c13789y.m40824a() != null);
        this.f38961d = c13755iM40481a;
        C13810t c13810tM40548h = c13755iM40481a.m40548h();
        long jMo40395b = this.f38958a.mo40395b();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        c13810tM40548h.mo40931a(jMo40395b, timeUnit);
        this.f38961d.m40552l().mo40931a(this.f38958a.mo40396c(), timeUnit);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.InterfaceC13737c
    /* JADX INFO: renamed from: b */
    public void mo40376b() throws IOException {
        this.f38960c.flush();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.InterfaceC13737c
    public void cancel() {
        C13755i c13755i = this.f38961d;
        if (c13755i != null) {
            c13755i.m40542c(EnumC13748b.CANCEL);
        }
    }
}
