package com.mbridge.msdk.thrid.okhttp.internal.cache;

import com.google.common.net.HttpHeaders;
import com.mbridge.msdk.thrid.okhttp.AbstractC13711b0;
import com.mbridge.msdk.thrid.okhttp.C13709a0;
import com.mbridge.msdk.thrid.okhttp.C13782r;
import com.mbridge.msdk.thrid.okhttp.C13789y;
import com.mbridge.msdk.thrid.okhttp.EnumC13787w;
import com.mbridge.msdk.thrid.okhttp.InterfaceC13784t;
import com.mbridge.msdk.thrid.okhttp.internal.AbstractC13721a;
import com.mbridge.msdk.thrid.okhttp.internal.C13723c;
import java.io.IOException;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.cache.a */
/* JADX INFO: compiled from: CacheInterceptor.java */
/* JADX INFO: loaded from: classes7.dex */
public final class C13724a implements InterfaceC13784t {
    public C13724a(InterfaceC13726c interfaceC13726c) {
    }

    /* JADX INFO: renamed from: a */
    private static C13709a0 m40301a(C13709a0 c13709a0) {
        return (c13709a0 == null || c13709a0.m40167d() == null) ? c13709a0 : c13709a0.m40174p().m40184a((AbstractC13711b0) null).m40191a();
    }

    /* JADX INFO: renamed from: a */
    private static C13782r m40302a(C13782r c13782r, C13782r c13782r2) {
        C13782r.a aVar = new C13782r.a();
        int iM40706b = c13782r.m40706b();
        for (int i = 0; i < iM40706b; i++) {
            String strM40705a = c13782r.m40705a(i);
            String strM40707b = c13782r.m40707b(i);
            if ((!HttpHeaders.WARNING.equalsIgnoreCase(strM40705a) || !strM40707b.startsWith("1")) && (m40303a(strM40705a) || !m40304b(strM40705a) || c13782r2.m40708b(strM40705a) == null)) {
                AbstractC13721a.f38769a.mo40259a(aVar, strM40705a, strM40707b);
            }
        }
        int iM40706b2 = c13782r2.m40706b();
        for (int i2 = 0; i2 < iM40706b2; i2++) {
            String strM40705a2 = c13782r2.m40705a(i2);
            if (!m40303a(strM40705a2) && m40304b(strM40705a2)) {
                AbstractC13721a.f38769a.mo40259a(aVar, strM40705a2, c13782r2.m40707b(i2));
            }
        }
        return aVar.m40712a();
    }

    /* JADX INFO: renamed from: a */
    static boolean m40303a(String str) {
        return HttpHeaders.CONTENT_LENGTH.equalsIgnoreCase(str) || HttpHeaders.CONTENT_ENCODING.equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str);
    }

    /* JADX INFO: renamed from: b */
    static boolean m40304b(String str) {
        return (HttpHeaders.CONNECTION.equalsIgnoreCase(str) || HttpHeaders.KEEP_ALIVE.equalsIgnoreCase(str) || HttpHeaders.PROXY_AUTHENTICATE.equalsIgnoreCase(str) || HttpHeaders.PROXY_AUTHORIZATION.equalsIgnoreCase(str) || HttpHeaders.f22577TE.equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || HttpHeaders.TRANSFER_ENCODING.equalsIgnoreCase(str) || HttpHeaders.UPGRADE.equalsIgnoreCase(str)) ? false : true;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.InterfaceC13784t
    /* JADX INFO: renamed from: a */
    public C13709a0 mo40305a(InterfaceC13784t.a aVar) throws IOException {
        C13725b c13725bM40312c = new C13725b.a(System.currentTimeMillis(), aVar.mo40397d(), null).m40312c();
        C13789y c13789y = c13725bM40312c.f38792a;
        C13709a0 c13709a0 = c13725bM40312c.f38793b;
        if (c13789y == null && c13709a0 == null) {
            return new C13709a0.a().m40188a(aVar.mo40397d()).m40187a(EnumC13787w.HTTP_1_1).m40181a(504).m40189a("Unsatisfiable Request (only-if-cached)").m40184a(C13723c.f38773c).m40192b(-1L).m40182a(System.currentTimeMillis()).m40191a();
        }
        if (c13789y == null) {
            return c13709a0.m40174p().m40183a(m40301a(c13709a0)).m40191a();
        }
        C13709a0 c13709a0Mo40393a = aVar.mo40393a(c13789y);
        if (c13709a0 != null) {
            if (c13709a0Mo40393a.m40169k() == 304) {
                c13709a0.m40174p().m40186a(m40302a(c13709a0.m40171m(), c13709a0Mo40393a.m40171m())).m40192b(c13709a0Mo40393a.m40178t()).m40182a(c13709a0Mo40393a.m40176r()).m40183a(m40301a(c13709a0)).m40194c(m40301a(c13709a0Mo40393a)).m40191a();
                c13709a0Mo40393a.m40167d().close();
                throw null;
            }
            C13723c.m40282a(c13709a0.m40167d());
        }
        return c13709a0Mo40393a.m40174p().m40183a(m40301a(c13709a0)).m40194c(m40301a(c13709a0Mo40393a)).m40191a();
    }
}
