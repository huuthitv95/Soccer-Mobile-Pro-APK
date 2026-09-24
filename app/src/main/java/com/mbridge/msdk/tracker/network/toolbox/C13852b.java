package com.mbridge.msdk.tracker.network.toolbox;

import android.os.SystemClock;
import android.text.TextUtils;
import com.mbridge.msdk.tracker.network.AbstractC13831b0;
import com.mbridge.msdk.tracker.network.AbstractC13850t;
import com.mbridge.msdk.tracker.network.C13837g;
import com.mbridge.msdk.tracker.network.C13846p;
import com.mbridge.msdk.tracker.network.C13847q;
import com.mbridge.msdk.tracker.network.InterfaceC13843m;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.mbridge.msdk.tracker.network.toolbox.b */
/* JADX INFO: compiled from: BasicNetwork.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13852b implements InterfaceC13843m {

    /* JADX INFO: renamed from: a */
    private final AbstractC13851a f39547a;

    /* JADX INFO: renamed from: b */
    protected final C13853c f39548b;

    public C13852b(AbstractC13851a abstractC13851a) {
        this(abstractC13851a, new C13853c(4096));
    }

    public C13852b(AbstractC13851a abstractC13851a, C13853c c13853c) {
        this.f39547a = abstractC13851a;
        this.f39548b = c13853c;
    }

    /* JADX INFO: renamed from: a */
    private static void m41256a(C13846p c13846p, int i) {
        if (c13846p != null) {
            try {
                c13846p.m41173b(i);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m41257a(C13846p c13846p, int i, Exception exc) {
        if (c13846p != null) {
            try {
                c13846p.m41168a(exc);
                c13846p.m41159a(i);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: b */
    private static C13846p m41258b(AbstractC13850t<?> abstractC13850t) {
        if (abstractC13850t == null) {
            return null;
        }
        try {
            if (!abstractC13850t.mo41108a() || TextUtils.isEmpty(abstractC13850t.m41248t())) {
                return null;
            }
            C13846p c13846p = new C13846p(abstractC13850t.m41244p(), abstractC13850t.m41237g() == 0 ? "GET" : "POST");
            c13846p.m41182d("queue");
            c13846p.m41185e(abstractC13850t.m41235d("local_id"));
            c13846p.m41169a(abstractC13850t.m41235d("ad_type"));
            c13846p.m41194i(abstractC13850t.m41246r());
            abstractC13850t.m41221a(c13846p);
            return c13846p;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0089  */
    /* JADX WARN: Code duplicated, block: B:32:0x008b  */
    @Override // com.mbridge.msdk.tracker.network.InterfaceC13843m
    /* JADX INFO: renamed from: a */
    public C13847q mo41125a(AbstractC13850t<?> abstractC13850t) throws AbstractC13831b0 {
        C13857g c13857gMo37409a;
        byte[] bArr;
        IOException iOException;
        int i;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        C13846p c13846pM41258b = m41258b(abstractC13850t);
        while (true) {
            List list = Collections.EMPTY_LIST;
            try {
                c13857gMo37409a = this.f39547a.mo37409a(abstractC13850t, C13856f.m41270a(abstractC13850t.m41234d()));
                try {
                    int iM41275d = c13857gMo37409a.m41275d();
                    m41256a(c13846pM41258b, iM41275d);
                    List<C13837g> listM41274c = c13857gMo37409a.m41274c();
                    if (iM41275d == 304) {
                        return C13861k.m41305a(abstractC13850t, SystemClock.elapsedRealtime() - jElapsedRealtime, listM41274c);
                    }
                    InputStream inputStreamM41272a = c13857gMo37409a.m41272a();
                    byte[] bArrM41311a = inputStreamM41272a != null ? C13861k.m41311a(inputStreamM41272a, c13857gMo37409a.m41273b(), this.f39548b, c13846pM41258b) : new byte[0];
                    try {
                        C13861k.m41307a(SystemClock.elapsedRealtime() - jElapsedRealtime, abstractC13850t, bArrM41311a, iM41275d);
                        if (iM41275d < 200 || iM41275d > 299) {
                            throw new IOException();
                        }
                        m41257a(c13846pM41258b, 1, null);
                        return new C13847q(iM41275d, bArrM41311a, false, SystemClock.elapsedRealtime() - jElapsedRealtime, listM41274c);
                    } catch (IOException e) {
                        iOException = e;
                        bArr = bArrM41311a;
                        if (TextUtils.equals(iOException.getMessage(), "timeout")) {
                            i = 3;
                        } else {
                            i = 2;
                        }
                        m41257a(c13846pM41258b, i, iOException);
                        C13861k.m41310a(abstractC13850t, C13861k.m41306a(abstractC13850t, iOException, jElapsedRealtime, c13857gMo37409a, bArr));
                    }
                } catch (IOException e2) {
                    e = e2;
                    bArr = null;
                    iOException = e;
                    if (TextUtils.equals(iOException.getMessage(), "timeout")) {
                        i = 3;
                    } else {
                        i = 2;
                    }
                    m41257a(c13846pM41258b, i, iOException);
                    C13861k.m41310a(abstractC13850t, C13861k.m41306a(abstractC13850t, iOException, jElapsedRealtime, c13857gMo37409a, bArr));
                }
            } catch (IOException e3) {
                e = e3;
                c13857gMo37409a = null;
                bArr = null;
            }
            m41257a(c13846pM41258b, i, iOException);
            C13861k.m41310a(abstractC13850t, C13861k.m41306a(abstractC13850t, iOException, jElapsedRealtime, c13857gMo37409a, bArr));
        }
    }
}
