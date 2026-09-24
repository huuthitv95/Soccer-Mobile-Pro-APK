package com.mbridge.msdk.tracker.network.toolbox;

import com.google.common.net.HttpHeaders;
import com.mbridge.msdk.foundation.same.net.MBridgeHostnameVerifier;
import com.mbridge.msdk.thrid.okhttp.AbstractC13711b0;
import com.mbridge.msdk.thrid.okhttp.AbstractC13790z;
import com.mbridge.msdk.thrid.okhttp.C13709a0;
import com.mbridge.msdk.thrid.okhttp.C13720i;
import com.mbridge.msdk.thrid.okhttp.C13777m;
import com.mbridge.msdk.thrid.okhttp.C13782r;
import com.mbridge.msdk.thrid.okhttp.C13786v;
import com.mbridge.msdk.thrid.okhttp.C13789y;
import com.mbridge.msdk.thrid.okhttp.EnumC13787w;
import com.mbridge.msdk.thrid.okhttp.InterfaceC13778n;
import com.mbridge.msdk.thrid.okhttp.internal.C13723c;
import com.mbridge.msdk.tracker.network.AbstractC13850t;
import com.mbridge.msdk.tracker.network.C13837g;
import com.mbridge.msdk.tracker.network.C13846p;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.mbridge.msdk.tracker.network.toolbox.m */
/* JADX INFO: compiled from: OKHttpStack.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13863m extends AbstractC13851a {

    /* JADX INFO: renamed from: a */
    private final C13786v f39576a = m41313a();

    /* JADX INFO: renamed from: a */
    private int m41312a(AbstractC13711b0 abstractC13711b0) {
        if (abstractC13711b0 == null) {
            return 0;
        }
        if (abstractC13711b0.mo40201k() > 2147483647L) {
            return -1;
        }
        return (int) abstractC13711b0.mo40201k();
    }

    /* JADX INFO: renamed from: a */
    private C13786v m41313a() {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        C13777m c13777m = new C13777m(new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, timeUnit, new SynchronousQueue(), C13723c.m40279a("OkHttp Dispatcher", false)));
        c13777m.m40685b(50);
        c13777m.m40682a(256);
        C13786v.b bVar = new C13786v.b();
        bVar.m40810d(30L, timeUnit);
        bVar.m40807b(30L, timeUnit);
        bVar.m40811e(30L, timeUnit);
        bVar.m40808b(true);
        bVar.m40799a(new C13720i(32, 5L, TimeUnit.MINUTES));
        bVar.m40800a(c13777m);
        return bVar.m40806a();
    }

    /* JADX INFO: renamed from: a */
    private static AbstractC13790z m41314a(AbstractC13850t abstractC13850t) {
        byte[] bArrM41229b;
        if (abstractC13850t == null || (bArrM41229b = abstractC13850t.m41229b()) == null) {
            return null;
        }
        return AbstractC13790z.m40848a(null, bArrM41229b);
    }

    /* JADX INFO: renamed from: a */
    private static void m41315a(C13789y.a aVar, AbstractC13850t<?> abstractC13850t) throws IOException {
        switch (abstractC13850t.m41237g()) {
            case 0:
                aVar.m40844c();
                return;
            case 1:
                AbstractC13790z abstractC13790zM41314a = m41314a(abstractC13850t);
                if (abstractC13790zM41314a == null) {
                    throw new IOException("can't create request body for post");
                }
                aVar.m40845c(abstractC13790zM41314a);
                return;
            case 2:
                AbstractC13790z abstractC13790zM41314a2 = m41314a(abstractC13850t);
                if (abstractC13790zM41314a2 == null) {
                    throw new IOException("can't create request body for put");
                }
                aVar.m40847d(abstractC13790zM41314a2);
                return;
            case 3:
                aVar.m40840b();
                return;
            case 4:
                aVar.m40846d();
                return;
            case 5:
                aVar.m40837a("OPTIONS", (AbstractC13790z) null);
                return;
            case 6:
                aVar.m40837a("TRACE", (AbstractC13790z) null);
                return;
            case 7:
                AbstractC13790z abstractC13790zM41314a3 = m41314a(abstractC13850t);
                if (abstractC13790zM41314a3 == null) {
                    throw new IOException("can't create request body for patch");
                }
                aVar.m40841b(abstractC13790zM41314a3);
                return;
            default:
                throw new IllegalStateException("Unknown method type.");
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m41316a(C13846p c13846p, C13786v.b bVar) {
        if (c13846p == null || bVar == null) {
            return;
        }
        try {
            bVar.m40802a(new OKHTTPEventListener(c13846p));
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m41317a(AbstractC13850t<?> abstractC13850t, C13846p c13846p) {
        if (c13846p == null || abstractC13850t == null) {
            return;
        }
        try {
            c13846p.m41190g(abstractC13850t.m41242m());
        } catch (Exception unused) {
        }
    }

    @Override // com.mbridge.msdk.tracker.network.toolbox.AbstractC13851a
    /* JADX INFO: renamed from: a */
    public C13857g mo37409a(AbstractC13850t<?> abstractC13850t, Map<String, String> map) throws IOException {
        C13846p c13846pM41238h = abstractC13850t.m41238h();
        if (this.f39576a == null) {
            throw new IOException("okhttp client is null");
        }
        int iM41245q = abstractC13850t.m41245q() <= 0 ? 30000 : abstractC13850t.m41245q();
        long jM41246r = abstractC13850t.m41246r();
        String strM41263a = abstractC13850t.m41237g() == 0 ? C13854d.m41263a(abstractC13850t.m41248t(), abstractC13850t) : abstractC13850t.m41248t();
        if (c13846pM41238h != null) {
            c13846pM41238h.m41188f(strM41263a);
            long j = iM41245q;
            c13846pM41238h.m41184e(j);
            c13846pM41238h.m41187f(j);
            c13846pM41238h.m41196j(j);
            c13846pM41238h.m41160a(abstractC13850t.m41243n());
        }
        m41317a(abstractC13850t, c13846pM41238h);
        ArrayList arrayList = new ArrayList();
        arrayList.add(EnumC13787w.HTTP_1_1);
        arrayList.add(EnumC13787w.HTTP_2);
        C13786v.b bVarM40804a = this.f39576a.m40790s().m40803a(arrayList).m40804a(new MBridgeHostnameVerifier(strM41263a));
        long j2 = iM41245q;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        C13786v.b bVarM40798a = bVarM40804a.m40810d(j2, timeUnit).m40807b(j2, timeUnit).m40801a(c13846pM41238h == null ? InterfaceC13778n.f39166a : new C13860j(c13846pM41238h.m41145H(), c13846pM41238h.m41172b(), c13846pM41238h)).m40811e(j2, timeUnit).m40798a(Math.max(jM41246r, 0L), timeUnit);
        m41316a(c13846pM41238h, bVarM40798a);
        C13789y.a aVar = new C13789y.a();
        for (Map.Entry<String, String> entry : abstractC13850t.mo41111f().entrySet()) {
            aVar.m40838a(entry.getKey(), entry.getValue());
        }
        aVar.m40838a(HttpHeaders.CONNECTION, "close");
        m41315a(aVar, abstractC13850t);
        C13709a0 c13709a0Mo40225d = bVarM40798a.m40806a().m40774a(aVar.m40842b(strM41263a).m40839a()).mo40225d();
        C13782r c13782rM40171m = c13709a0Mo40225d.m40171m();
        ArrayList arrayList2 = new ArrayList();
        int iM40706b = c13782rM40171m.m40706b();
        for (int i = 0; i < iM40706b; i++) {
            String strM40705a = c13782rM40171m.m40705a(i);
            String strM40707b = c13782rM40171m.m40707b(i);
            if (strM40705a != null) {
                arrayList2.add(new C13837g(strM40705a, strM40707b));
            }
        }
        AbstractC13711b0 abstractC13711b0M40167d = c13709a0Mo40225d.m40167d();
        return abstractC13711b0M40167d == null ? new C13857g(c13709a0Mo40225d.m40169k(), arrayList2) : new C13857g(c13709a0Mo40225d.m40169k(), arrayList2, m41312a(abstractC13711b0M40167d), abstractC13711b0M40167d.m40200d());
    }
}
