package com.mbridge.msdk.thrid.okhttp;

import com.mbridge.msdk.thrid.okhttp.internal.C13723c;
import com.mbridge.msdk.thrid.okio.C13793c;
import com.mbridge.msdk.thrid.okio.InterfaceC13795e;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.b0 */
/* JADX INFO: compiled from: ResponseBody.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC13711b0 implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.b0$a */
    /* JADX INFO: compiled from: ResponseBody.java */
    static class a extends AbstractC13711b0 {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ C13785u f38594a;

        /* JADX INFO: renamed from: b */
        final /* synthetic */ long f38595b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ InterfaceC13795e f38596c;

        a(C13785u c13785u, long j, InterfaceC13795e interfaceC13795e) {
            this.f38594a = c13785u;
            this.f38595b = j;
            this.f38596c = interfaceC13795e;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.AbstractC13711b0
        /* JADX INFO: renamed from: k */
        public long mo40201k() {
            return this.f38595b;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.AbstractC13711b0
        @Nullable
        /* JADX INFO: renamed from: l */
        public C13785u mo40202l() {
            return this.f38594a;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.AbstractC13711b0
        /* JADX INFO: renamed from: m */
        public InterfaceC13795e mo40203m() {
            return this.f38596c;
        }
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC13711b0 m40197a(@Nullable C13785u c13785u, long j, InterfaceC13795e interfaceC13795e) {
        if (interfaceC13795e != null) {
            return new a(c13785u, j, interfaceC13795e);
        }
        throw new NullPointerException("source == null");
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC13711b0 m40198a(@Nullable C13785u c13785u, byte[] bArr) {
        return m40197a(c13785u, bArr.length, new C13793c().write(bArr));
    }

    /* JADX INFO: renamed from: h */
    private Charset m40199h() {
        C13785u c13785uMo40202l = mo40202l();
        return c13785uMo40202l != null ? c13785uMo40202l.m40768a(C13723c.f38780j) : C13723c.f38780j;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C13723c.m40282a(mo40203m());
    }

    /* JADX INFO: renamed from: d */
    public final InputStream m40200d() {
        return mo40203m().mo40898j();
    }

    /* JADX INFO: renamed from: k */
    public abstract long mo40201k();

    @Nullable
    /* JADX INFO: renamed from: l */
    public abstract C13785u mo40202l();

    /* JADX INFO: renamed from: m */
    public abstract InterfaceC13795e mo40203m();

    /* JADX INFO: renamed from: n */
    public final String m40204n() throws IOException {
        InterfaceC13795e interfaceC13795eMo40203m = mo40203m();
        try {
            return interfaceC13795eMo40203m.mo40876a(C13723c.m40275a(interfaceC13795eMo40203m, m40199h()));
        } finally {
            C13723c.m40282a(interfaceC13795eMo40203m);
        }
    }
}
