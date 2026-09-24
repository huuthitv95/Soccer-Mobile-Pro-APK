package com.mbridge.msdk.tracker.network.toolbox;

import android.os.SystemClock;
import com.ironsource.C11401Db;
import com.mbridge.msdk.tracker.network.AbstractC13831b0;
import com.mbridge.msdk.tracker.network.AbstractC13850t;
import com.mbridge.msdk.tracker.network.C13828a;
import com.mbridge.msdk.tracker.network.C13829a0;
import com.mbridge.msdk.tracker.network.C13833c0;
import com.mbridge.msdk.tracker.network.C13834d;
import com.mbridge.msdk.tracker.network.C13837g;
import com.mbridge.msdk.tracker.network.C13845o;
import com.mbridge.msdk.tracker.network.C13846p;
import com.mbridge.msdk.tracker.network.C13847q;
import com.mbridge.msdk.tracker.network.C13848r;
import com.mbridge.msdk.tracker.network.C13870y;
import com.mbridge.msdk.tracker.network.C13871z;
import com.mbridge.msdk.tracker.network.InterfaceC13830b;
import com.mbridge.msdk.tracker.network.InterfaceC13869x;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.mbridge.msdk.tracker.network.toolbox.k */
/* JADX INFO: compiled from: NetworkUtility.java */
/* JADX INFO: loaded from: classes7.dex */
final class C13861k {

    /* JADX INFO: renamed from: com.mbridge.msdk.tracker.network.toolbox.k$b */
    /* JADX INFO: compiled from: NetworkUtility.java */
    static class b {

        /* JADX INFO: renamed from: a */
        final String f39574a;

        /* JADX INFO: renamed from: b */
        final AbstractC13831b0 f39575b;

        private b(String str, AbstractC13831b0 abstractC13831b0) {
            this.f39574a = str;
            this.f39575b = abstractC13831b0;
        }
    }

    /* JADX INFO: renamed from: a */
    static C13847q m41305a(AbstractC13850t<?> abstractC13850t, long j, List<C13837g> list) {
        InterfaceC13830b.a aVarM41234d = abstractC13850t.m41234d();
        if (aVarM41234d == null) {
            return new C13847q(304, null, true, j, list);
        }
        return new C13847q(304, aVarM41234d.f39426a, true, j, C13856f.m41269a(list, aVarM41234d));
    }

    /* JADX INFO: renamed from: a */
    static b m41306a(AbstractC13850t<?> abstractC13850t, IOException iOException, long j, C13857g c13857g, byte[] bArr) throws AbstractC13831b0 {
        if (iOException instanceof SocketTimeoutException) {
            return new b("socket", new C13871z());
        }
        if (iOException instanceof MalformedURLException) {
            throw new C13828a("Bad URL " + abstractC13850t.m41248t());
        }
        if (c13857g == null) {
            if (abstractC13850t.m41214A()) {
                return new b("connection", new C13848r());
            }
            throw new C13848r(iOException);
        }
        int iM41275d = c13857g.m41275d();
        C13833c0.m41096c("Unexpected response code %d for %s", Integer.valueOf(iM41275d), abstractC13850t.m41248t());
        if (bArr == null) {
            C13845o c13845o = new C13845o();
            c13845o.m41089a(iM41275d);
            return new b("network", c13845o);
        }
        C13847q c13847q = new C13847q(iM41275d, bArr, false, SystemClock.elapsedRealtime() - j, c13857g.m41274c());
        if (iM41275d >= 400 && iM41275d <= 499) {
            C13834d c13834d = new C13834d(c13847q);
            c13834d.m41089a(iM41275d);
            throw c13834d;
        }
        C13870y c13870y = new C13870y(c13847q);
        c13870y.m41089a(iM41275d);
        if (iM41275d < 500 || iM41275d > 599 || !abstractC13850t.m41215B()) {
            throw c13870y;
        }
        return new b(C11401Db.f24216a, c13870y);
    }

    /* JADX INFO: renamed from: a */
    static void m41307a(long j, AbstractC13850t<?> abstractC13850t, byte[] bArr, int i) {
        if (j > 3000) {
            C13833c0.m41095b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", abstractC13850t, Long.valueOf(j), bArr != null ? Integer.valueOf(bArr.length) : AbstractJsonLexerKt.NULL, Integer.valueOf(i), Integer.valueOf(abstractC13850t.mo41113o().mo41101c()));
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m41308a(C13846p c13846p) {
        if (c13846p != null) {
            c13846p.m41178c(0L);
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m41309a(C13846p c13846p, int i) {
        if (c13846p != null) {
            c13846p.m41178c(c13846p.m41139B() + ((long) i));
        }
    }

    /* JADX INFO: renamed from: a */
    static void m41310a(AbstractC13850t<?> abstractC13850t, b bVar) throws AbstractC13831b0 {
        if (abstractC13850t == null) {
            throw new C13829a0("request is null when retrying");
        }
        if (bVar == null) {
            throw new C13829a0("retry info is null when retrying");
        }
        InterfaceC13869x interfaceC13869xMo41113o = abstractC13850t.mo41113o();
        if (interfaceC13869xMo41113o == null) {
            throw bVar.f39575b;
        }
        if (!interfaceC13869xMo41113o.mo41099a(bVar.f39575b)) {
            throw bVar.f39575b;
        }
    }

    /* JADX INFO: renamed from: a */
    static byte[] m41311a(InputStream inputStream, int i, C13853c c13853c, C13846p c13846p) throws Throwable {
        byte[] bArrM41261a;
        C13864n c13864n = new C13864n(c13853c, i);
        m41308a(c13846p);
        try {
            bArrM41261a = c13853c.m41261a(1024);
            while (true) {
                try {
                    int i2 = inputStream.read(bArrM41261a);
                    if (i2 == -1) {
                        break;
                    }
                    c13864n.write(bArrM41261a, 0, i2);
                    m41309a(c13846p, i2);
                } catch (Throwable th) {
                    th = th;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                            C13833c0.m41097d("Error occurred when closing InputStream", new Object[0]);
                        }
                    }
                    c13853c.m41260a(bArrM41261a);
                    c13864n.close();
                    throw th;
                }
            }
            byte[] byteArray = c13864n.toByteArray();
            try {
                inputStream.close();
            } catch (IOException unused2) {
                C13833c0.m41097d("Error occurred when closing InputStream", new Object[0]);
            }
            c13853c.m41260a(bArrM41261a);
            c13864n.close();
            return byteArray;
        } catch (Throwable th2) {
            th = th2;
            bArrM41261a = null;
        }
    }
}
