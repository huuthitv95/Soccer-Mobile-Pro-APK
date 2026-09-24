package com.mbridge.msdk.thrid.okhttp.internal.http;

import com.google.common.net.HttpHeaders;
import com.mbridge.msdk.thrid.okhttp.C13709a0;
import com.mbridge.msdk.thrid.okhttp.C13789y;
import com.mbridge.msdk.thrid.okhttp.InterfaceC13784t;
import com.mbridge.msdk.thrid.okhttp.internal.C13723c;
import com.mbridge.msdk.thrid.okhttp.internal.connection.C13729c;
import com.mbridge.msdk.thrid.okhttp.internal.connection.C13733g;
import com.mbridge.msdk.thrid.okio.AbstractC13797g;
import com.mbridge.msdk.thrid.okio.C13793c;
import com.mbridge.msdk.thrid.okio.C13802l;
import com.mbridge.msdk.thrid.okio.InterfaceC13794d;
import com.mbridge.msdk.thrid.okio.InterfaceC13808r;
import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.http.b */
/* JADX INFO: compiled from: CallServerInterceptor.java */
/* JADX INFO: loaded from: classes7.dex */
public final class C13736b implements InterfaceC13784t {

    /* JADX INFO: renamed from: a */
    private final boolean f38855a;

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.http.b$a */
    /* JADX INFO: compiled from: CallServerInterceptor.java */
    static final class a extends AbstractC13797g {

        /* JADX INFO: renamed from: b */
        long f38856b;

        a(InterfaceC13808r interfaceC13808r) {
            super(interfaceC13808r);
        }

        @Override // com.mbridge.msdk.thrid.okio.AbstractC13797g, com.mbridge.msdk.thrid.okio.InterfaceC13808r
        /* JADX INFO: renamed from: a */
        public void mo40370a(C13793c c13793c, long j) throws IOException {
            super.mo40370a(c13793c, j);
            this.f38856b += j;
        }
    }

    public C13736b(boolean z) {
        this.f38855a = z;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.InterfaceC13784t
    /* JADX INFO: renamed from: a */
    public C13709a0 mo40305a(InterfaceC13784t.a aVar) throws IOException {
        C13741g c13741g = (C13741g) aVar;
        InterfaceC13737c interfaceC13737cM40401h = c13741g.m40401h();
        C13733g c13733gM40402i = c13741g.m40402i();
        C13729c c13729c = (C13729c) c13741g.m40399f();
        C13789y c13789yMo40397d = c13741g.mo40397d();
        long jCurrentTimeMillis = System.currentTimeMillis();
        c13741g.m40400g().requestHeadersStart(c13741g.m40398e());
        interfaceC13737cM40401h.mo40375a(c13789yMo40397d);
        c13741g.m40400g().requestHeadersEnd(c13741g.m40398e(), c13789yMo40397d);
        C13709a0.a aVarMo40371a = null;
        if (C13740f.m40388a(c13789yMo40397d.m40829e()) && c13789yMo40397d.m40824a() != null) {
            if ("100-continue".equalsIgnoreCase(c13789yMo40397d.m40825a(HttpHeaders.EXPECT))) {
                interfaceC13737cM40401h.mo40376b();
                c13741g.m40400g().responseHeadersStart(c13741g.m40398e());
                aVarMo40371a = interfaceC13737cM40401h.mo40371a(true);
            }
            if (aVarMo40371a == null) {
                c13741g.m40400g().requestBodyStart(c13741g.m40398e());
                a aVar2 = new a(interfaceC13737cM40401h.mo40373a(c13789yMo40397d, c13789yMo40397d.m40824a().mo40692a()));
                InterfaceC13794d interfaceC13794dM40943a = C13802l.m40943a(aVar2);
                c13789yMo40397d.m40824a().mo40693a(interfaceC13794dM40943a);
                interfaceC13794dM40943a.close();
                c13741g.m40400g().requestBodyEnd(c13741g.m40398e(), aVar2.f38856b);
            } else if (!c13729c.m40331f()) {
                c13733gM40402i.m40365e();
            }
        }
        interfaceC13737cM40401h.mo40374a();
        if (aVarMo40371a == null) {
            c13741g.m40400g().responseHeadersStart(c13741g.m40398e());
            aVarMo40371a = interfaceC13737cM40401h.mo40371a(false);
        }
        C13709a0 c13709a0M40191a = aVarMo40371a.m40188a(c13789yMo40397d).m40185a(c13733gM40402i.m40363c().mo40244b()).m40192b(jCurrentTimeMillis).m40182a(System.currentTimeMillis()).m40191a();
        int iM40169k = c13709a0M40191a.m40169k();
        if (iM40169k == 100) {
            c13709a0M40191a = interfaceC13737cM40401h.mo40371a(false).m40188a(c13789yMo40397d).m40185a(c13733gM40402i.m40363c().mo40244b()).m40192b(jCurrentTimeMillis).m40182a(System.currentTimeMillis()).m40191a();
            iM40169k = c13709a0M40191a.m40169k();
        }
        c13741g.m40400g().responseHeadersEnd(c13741g.m40398e(), c13709a0M40191a);
        C13709a0 c13709a0M40191a2 = (this.f38855a && iM40169k == 101) ? c13709a0M40191a.m40174p().m40184a(C13723c.f38773c).m40191a() : c13709a0M40191a.m40174p().m40184a(interfaceC13737cM40401h.mo40372a(c13709a0M40191a)).m40191a();
        if ("close".equalsIgnoreCase(c13709a0M40191a2.m40177s().m40825a(HttpHeaders.CONNECTION)) || "close".equalsIgnoreCase(c13709a0M40191a2.m40166b(HttpHeaders.CONNECTION))) {
            c13733gM40402i.m40365e();
        }
        if ((iM40169k != 204 && iM40169k != 205) || c13709a0M40191a2.m40167d().mo40201k() <= 0) {
            return c13709a0M40191a2;
        }
        throw new ProtocolException("HTTP " + iM40169k + " had non-zero Content-Length: " + c13709a0M40191a2.m40167d().mo40201k());
    }
}
