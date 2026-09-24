package com.mbridge.msdk.thrid.okhttp.internal.http;

import com.google.common.net.HttpHeaders;
import com.ironsource.C11341A5;
import com.mbridge.msdk.thrid.okhttp.AbstractC13790z;
import com.mbridge.msdk.thrid.okhttp.C13709a0;
import com.mbridge.msdk.thrid.okhttp.C13775k;
import com.mbridge.msdk.thrid.okhttp.C13785u;
import com.mbridge.msdk.thrid.okhttp.C13789y;
import com.mbridge.msdk.thrid.okhttp.InterfaceC13776l;
import com.mbridge.msdk.thrid.okhttp.InterfaceC13784t;
import com.mbridge.msdk.thrid.okhttp.internal.C13723c;
import com.mbridge.msdk.thrid.okhttp.internal.C13734d;
import com.mbridge.msdk.thrid.okio.C13800j;
import com.mbridge.msdk.thrid.okio.C13802l;
import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.http.a */
/* JADX INFO: compiled from: BridgeInterceptor.java */
/* JADX INFO: loaded from: classes7.dex */
public final class C13735a implements InterfaceC13784t {

    /* JADX INFO: renamed from: a */
    private final InterfaceC13776l f38854a;

    public C13735a(InterfaceC13776l interfaceC13776l) {
        this.f38854a = interfaceC13776l;
    }

    /* JADX INFO: renamed from: a */
    private String m40369a(List<C13775k> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            if (i > 0) {
                sb.append("; ");
            }
            C13775k c13775k = list.get(i);
            sb.append(c13775k.m40673a());
            sb.append(C11341A5.f23808U);
            sb.append(c13775k.m40675b());
        }
        return sb.toString();
    }

    @Override // com.mbridge.msdk.thrid.okhttp.InterfaceC13784t
    /* JADX INFO: renamed from: a */
    public C13709a0 mo40305a(InterfaceC13784t.a aVar) throws IOException {
        C13789y c13789yMo40397d = aVar.mo40397d();
        C13789y.a aVarM40830f = c13789yMo40397d.m40830f();
        AbstractC13790z abstractC13790zM40824a = c13789yMo40397d.m40824a();
        if (abstractC13790zM40824a != null) {
            C13785u c13785uMo40694b = abstractC13790zM40824a.mo40694b();
            if (c13785uMo40694b != null) {
                aVarM40830f.m40843b("Content-Type", c13785uMo40694b.toString());
            }
            long jMo40692a = abstractC13790zM40824a.mo40692a();
            if (jMo40692a != -1) {
                aVarM40830f.m40843b(HttpHeaders.CONTENT_LENGTH, Long.toString(jMo40692a));
                aVarM40830f.m40836a(HttpHeaders.TRANSFER_ENCODING);
            } else {
                aVarM40830f.m40843b(HttpHeaders.TRANSFER_ENCODING, "chunked");
                aVarM40830f.m40836a(HttpHeaders.CONTENT_LENGTH);
            }
        }
        boolean z = false;
        if (c13789yMo40397d.m40825a(HttpHeaders.HOST) == null) {
            aVarM40830f.m40843b(HttpHeaders.HOST, C13723c.m40270a(c13789yMo40397d.m40831g(), false));
        }
        if (c13789yMo40397d.m40825a(HttpHeaders.CONNECTION) == null) {
            aVarM40830f.m40843b(HttpHeaders.CONNECTION, HttpHeaders.KEEP_ALIVE);
        }
        if (c13789yMo40397d.m40825a(HttpHeaders.ACCEPT_ENCODING) == null && c13789yMo40397d.m40825a("Range") == null) {
            aVarM40830f.m40843b(HttpHeaders.ACCEPT_ENCODING, "gzip");
            z = true;
        }
        List<C13775k> listMo40676a = this.f38854a.mo40676a(c13789yMo40397d.m40831g());
        if (!listMo40676a.isEmpty()) {
            aVarM40830f.m40843b(HttpHeaders.COOKIE, m40369a(listMo40676a));
        }
        if (c13789yMo40397d.m40825a("User-Agent") == null) {
            aVarM40830f.m40843b("User-Agent", C13734d.m40368a());
        }
        C13709a0 c13709a0Mo40393a = aVar.mo40393a(aVarM40830f.m40839a());
        C13739e.m40385a(this.f38854a, c13789yMo40397d.m40831g(), c13709a0Mo40393a.m40171m());
        C13709a0.a aVarM40188a = c13709a0Mo40393a.m40174p().m40188a(c13789yMo40397d);
        if (z && "gzip".equalsIgnoreCase(c13709a0Mo40393a.m40166b(HttpHeaders.CONTENT_ENCODING)) && C13739e.m40387b(c13709a0Mo40393a)) {
            C13800j c13800j = new C13800j(c13709a0Mo40393a.m40167d().mo40203m());
            aVarM40188a.m40186a(c13709a0Mo40393a.m40171m().m40704a().m40713b(HttpHeaders.CONTENT_ENCODING).m40713b(HttpHeaders.CONTENT_LENGTH).m40712a());
            aVarM40188a.m40184a(new C13742h(c13709a0Mo40393a.m40166b("Content-Type"), -1L, C13802l.m40944a(c13800j)));
        }
        return aVarM40188a.m40191a();
    }
}
