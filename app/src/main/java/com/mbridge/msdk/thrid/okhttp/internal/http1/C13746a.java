package com.mbridge.msdk.thrid.okhttp.internal.http1;

import android.support.v4.media.session.PlaybackStateCompat;
import com.google.common.net.HttpHeaders;
import com.mbridge.msdk.thrid.okhttp.AbstractC13711b0;
import com.mbridge.msdk.thrid.okhttp.C13709a0;
import com.mbridge.msdk.thrid.okhttp.C13782r;
import com.mbridge.msdk.thrid.okhttp.C13783s;
import com.mbridge.msdk.thrid.okhttp.C13786v;
import com.mbridge.msdk.thrid.okhttp.C13789y;
import com.mbridge.msdk.thrid.okhttp.internal.AbstractC13721a;
import com.mbridge.msdk.thrid.okhttp.internal.C13723c;
import com.mbridge.msdk.thrid.okhttp.internal.connection.C13729c;
import com.mbridge.msdk.thrid.okhttp.internal.connection.C13733g;
import com.mbridge.msdk.thrid.okhttp.internal.http.C13739e;
import com.mbridge.msdk.thrid.okhttp.internal.http.C13742h;
import com.mbridge.msdk.thrid.okhttp.internal.http.C13743i;
import com.mbridge.msdk.thrid.okhttp.internal.http.C13745k;
import com.mbridge.msdk.thrid.okhttp.internal.http.InterfaceC13737c;
import com.mbridge.msdk.thrid.okio.C13793c;
import com.mbridge.msdk.thrid.okio.C13799i;
import com.mbridge.msdk.thrid.okio.C13802l;
import com.mbridge.msdk.thrid.okio.C13810t;
import com.mbridge.msdk.thrid.okio.InterfaceC13794d;
import com.mbridge.msdk.thrid.okio.InterfaceC13795e;
import com.mbridge.msdk.thrid.okio.InterfaceC13808r;
import com.mbridge.msdk.thrid.okio.InterfaceC13809s;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.http1.a */
/* JADX INFO: compiled from: Http1Codec.java */
/* JADX INFO: loaded from: classes7.dex */
public final class C13746a implements InterfaceC13737c {

    /* JADX INFO: renamed from: a */
    final C13786v f38885a;

    /* JADX INFO: renamed from: b */
    final C13733g f38886b;

    /* JADX INFO: renamed from: c */
    final InterfaceC13795e f38887c;

    /* JADX INFO: renamed from: d */
    final InterfaceC13794d f38888d;

    /* JADX INFO: renamed from: e */
    int f38889e = 0;

    /* JADX INFO: renamed from: f */
    private long f38890f = PlaybackStateCompat.ACTION_SET_REPEAT_MODE;

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.http1.a$b */
    /* JADX INFO: compiled from: Http1Codec.java */
    private abstract class b implements InterfaceC13809s {

        /* JADX INFO: renamed from: a */
        protected final C13799i f38891a;

        /* JADX INFO: renamed from: b */
        protected boolean f38892b;

        /* JADX INFO: renamed from: c */
        protected long f38893c;

        private b() {
            this.f38891a = new C13799i(C13746a.this.f38887c.mo40428b());
            this.f38893c = 0L;
        }

        /* JADX INFO: renamed from: a */
        protected final void m40426a(boolean z, IOException iOException) throws IOException {
            C13746a c13746a = C13746a.this;
            int i = c13746a.f38889e;
            if (i == 6) {
                return;
            }
            if (i != 5) {
                throw new IllegalStateException("state: " + C13746a.this.f38889e);
            }
            c13746a.m40421a(this.f38891a);
            C13746a c13746a2 = C13746a.this;
            c13746a2.f38889e = 6;
            C13733g c13733g = c13746a2.f38886b;
            if (c13733g != null) {
                c13733g.m40360a(!z, c13746a2, this.f38893c, iOException);
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.InterfaceC13809s
        /* JADX INFO: renamed from: b */
        public long mo40427b(C13793c c13793c, long j) throws IOException {
            try {
                long jMo40427b = C13746a.this.f38887c.mo40427b(c13793c, j);
                if (jMo40427b > 0) {
                    this.f38893c += jMo40427b;
                }
                return jMo40427b;
            } catch (IOException e) {
                m40426a(false, e);
                throw e;
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.InterfaceC13809s
        /* JADX INFO: renamed from: b */
        public C13810t mo40428b() {
            return this.f38891a;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.http1.a$c */
    /* JADX INFO: compiled from: Http1Codec.java */
    private final class c implements InterfaceC13808r, AutoCloseable {

        /* JADX INFO: renamed from: a */
        private final C13799i f38895a;

        /* JADX INFO: renamed from: b */
        private boolean f38896b;

        c() {
            this.f38895a = new C13799i(C13746a.this.f38888d.mo40429b());
        }

        @Override // com.mbridge.msdk.thrid.okio.InterfaceC13808r
        /* JADX INFO: renamed from: a */
        public void mo40370a(C13793c c13793c, long j) throws IOException {
            if (this.f38896b) {
                throw new IllegalStateException("closed");
            }
            if (j == 0) {
                return;
            }
            C13746a.this.f38888d.mo40872a(j);
            C13746a.this.f38888d.mo40873a("\r\n");
            C13746a.this.f38888d.mo40370a(c13793c, j);
            C13746a.this.f38888d.mo40873a("\r\n");
        }

        @Override // com.mbridge.msdk.thrid.okio.InterfaceC13808r
        /* JADX INFO: renamed from: b */
        public C13810t mo40429b() {
            return this.f38895a;
        }

        @Override // com.mbridge.msdk.thrid.okio.InterfaceC13808r, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() throws IOException {
            if (this.f38896b) {
                return;
            }
            this.f38896b = true;
            C13746a.this.f38888d.mo40873a("0\r\n\r\n");
            C13746a.this.m40421a(this.f38895a);
            C13746a.this.f38889e = 3;
        }

        @Override // com.mbridge.msdk.thrid.okio.InterfaceC13808r, java.io.Flushable
        public synchronized void flush() throws IOException {
            if (this.f38896b) {
                return;
            }
            C13746a.this.f38888d.flush();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.http1.a$d */
    /* JADX INFO: compiled from: Http1Codec.java */
    private class d extends b {

        /* JADX INFO: renamed from: e */
        private final C13783s f38898e;

        /* JADX INFO: renamed from: f */
        private long f38899f;

        /* JADX INFO: renamed from: g */
        private boolean f38900g;

        d(C13783s c13783s) {
            super();
            this.f38899f = -1L;
            this.f38900g = true;
            this.f38898e = c13783s;
        }

        /* JADX INFO: renamed from: d */
        private void m40430d() throws IOException {
            if (this.f38899f != -1) {
                C13746a.this.f38887c.mo40883c();
            }
            try {
                this.f38899f = C13746a.this.f38887c.mo40896i();
                String strTrim = C13746a.this.f38887c.mo40883c().trim();
                if (this.f38899f < 0 || !(strTrim.isEmpty() || strTrim.startsWith(";"))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f38899f + strTrim + "\"");
                }
                if (this.f38899f == 0) {
                    this.f38900g = false;
                    C13739e.m40385a(C13746a.this.f38885a.m40780i(), this.f38898e, C13746a.this.m40425f());
                    m40426a(true, null);
                }
            } catch (NumberFormatException e) {
                throw new ProtocolException(e.getMessage());
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http1.C13746a.b, com.mbridge.msdk.thrid.okio.InterfaceC13809s
        /* JADX INFO: renamed from: b */
        public long mo40427b(C13793c c13793c, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            }
            if (this.f38892b) {
                throw new IllegalStateException("closed");
            }
            if (!this.f38900g) {
                return -1L;
            }
            long j2 = this.f38899f;
            if (j2 == 0 || j2 == -1) {
                m40430d();
                if (!this.f38900g) {
                    return -1L;
                }
            }
            long jMo40427b = super.mo40427b(c13793c, Math.min(j, this.f38899f));
            if (jMo40427b != -1) {
                this.f38899f -= jMo40427b;
                return jMo40427b;
            }
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            m40426a(false, protocolException);
            throw protocolException;
        }

        @Override // com.mbridge.msdk.thrid.okio.InterfaceC13809s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f38892b) {
                return;
            }
            if (this.f38900g && !C13723c.m40285a(this, 100, TimeUnit.MILLISECONDS)) {
                m40426a(false, null);
            }
            this.f38892b = true;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.http1.a$e */
    /* JADX INFO: compiled from: Http1Codec.java */
    private final class e implements InterfaceC13808r, AutoCloseable {

        /* JADX INFO: renamed from: a */
        private final C13799i f38902a;

        /* JADX INFO: renamed from: b */
        private boolean f38903b;

        /* JADX INFO: renamed from: c */
        private long f38904c;

        e(long j) {
            this.f38902a = new C13799i(C13746a.this.f38888d.mo40429b());
            this.f38904c = j;
        }

        @Override // com.mbridge.msdk.thrid.okio.InterfaceC13808r
        /* JADX INFO: renamed from: a */
        public void mo40370a(C13793c c13793c, long j) throws IOException {
            if (this.f38903b) {
                throw new IllegalStateException("closed");
            }
            C13723c.m40281a(c13793c.size(), 0L, j);
            if (j <= this.f38904c) {
                C13746a.this.f38888d.mo40370a(c13793c, j);
                this.f38904c -= j;
            } else {
                throw new ProtocolException("expected " + this.f38904c + " bytes but received " + j);
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.InterfaceC13808r
        /* JADX INFO: renamed from: b */
        public C13810t mo40429b() {
            return this.f38902a;
        }

        @Override // com.mbridge.msdk.thrid.okio.InterfaceC13808r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f38903b) {
                return;
            }
            this.f38903b = true;
            if (this.f38904c > 0) {
                throw new ProtocolException("unexpected end of stream");
            }
            C13746a.this.m40421a(this.f38902a);
            C13746a.this.f38889e = 3;
        }

        @Override // com.mbridge.msdk.thrid.okio.InterfaceC13808r, java.io.Flushable
        public void flush() throws IOException {
            if (this.f38903b) {
                return;
            }
            C13746a.this.f38888d.flush();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.http1.a$f */
    /* JADX INFO: compiled from: Http1Codec.java */
    private class f extends b {

        /* JADX INFO: renamed from: e */
        private long f38906e;

        f(long j) throws IOException {
            super();
            this.f38906e = j;
            if (j == 0) {
                m40426a(true, null);
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http1.C13746a.b, com.mbridge.msdk.thrid.okio.InterfaceC13809s
        /* JADX INFO: renamed from: b */
        public long mo40427b(C13793c c13793c, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            }
            if (this.f38892b) {
                throw new IllegalStateException("closed");
            }
            long j2 = this.f38906e;
            if (j2 == 0) {
                return -1L;
            }
            long jMo40427b = super.mo40427b(c13793c, Math.min(j2, j));
            if (jMo40427b == -1) {
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                m40426a(false, protocolException);
                throw protocolException;
            }
            long j3 = this.f38906e - jMo40427b;
            this.f38906e = j3;
            if (j3 == 0) {
                m40426a(true, null);
            }
            return jMo40427b;
        }

        @Override // com.mbridge.msdk.thrid.okio.InterfaceC13809s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f38892b) {
                return;
            }
            if (this.f38906e != 0 && !C13723c.m40285a(this, 100, TimeUnit.MILLISECONDS)) {
                m40426a(false, null);
            }
            this.f38892b = true;
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.http1.a$g */
    /* JADX INFO: compiled from: Http1Codec.java */
    private class g extends b {

        /* JADX INFO: renamed from: e */
        private boolean f38908e;

        g() {
            super();
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http1.C13746a.b, com.mbridge.msdk.thrid.okio.InterfaceC13809s
        /* JADX INFO: renamed from: b */
        public long mo40427b(C13793c c13793c, long j) throws IOException {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            }
            if (this.f38892b) {
                throw new IllegalStateException("closed");
            }
            if (this.f38908e) {
                return -1L;
            }
            long jMo40427b = super.mo40427b(c13793c, j);
            if (jMo40427b != -1) {
                return jMo40427b;
            }
            this.f38908e = true;
            m40426a(true, null);
            return -1L;
        }

        @Override // com.mbridge.msdk.thrid.okio.InterfaceC13809s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f38892b) {
                return;
            }
            if (!this.f38908e) {
                m40426a(false, null);
            }
            this.f38892b = true;
        }
    }

    public C13746a(C13786v c13786v, C13733g c13733g, InterfaceC13795e interfaceC13795e, InterfaceC13794d interfaceC13794d) {
        this.f38885a = c13786v;
        this.f38886b = c13733g;
        this.f38887c = interfaceC13795e;
        this.f38888d = interfaceC13794d;
    }

    /* JADX INFO: renamed from: e */
    private String m40417e() throws IOException {
        String strMo40886d = this.f38887c.mo40886d(this.f38890f);
        this.f38890f -= (long) strMo40886d.length();
        return strMo40886d;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.InterfaceC13737c
    /* JADX INFO: renamed from: a */
    public C13709a0.a mo40371a(boolean z) throws IOException {
        int i = this.f38889e;
        if (i != 1 && i != 3) {
            throw new IllegalStateException("state: " + this.f38889e);
        }
        try {
            C13745k c13745kM40416a = C13745k.m40416a(m40417e());
            C13709a0.a aVarM40186a = new C13709a0.a().m40187a(c13745kM40416a.f38882a).m40181a(c13745kM40416a.f38883b).m40189a(c13745kM40416a.f38884c).m40186a(m40425f());
            if (z && c13745kM40416a.f38883b == 100) {
                return null;
            }
            if (c13745kM40416a.f38883b == 100) {
                this.f38889e = 3;
                return aVarM40186a;
            }
            this.f38889e = 4;
            return aVarM40186a;
        } catch (EOFException e2) {
            IOException iOException = new IOException("unexpected end of stream on " + this.f38886b);
            iOException.initCause(e2);
            throw iOException;
        }
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.InterfaceC13737c
    /* JADX INFO: renamed from: a */
    public AbstractC13711b0 mo40372a(C13709a0 c13709a0) throws IOException {
        C13733g c13733g = this.f38886b;
        c13733g.f38844f.responseBodyStart(c13733g.f38843e);
        String strM40166b = c13709a0.m40166b("Content-Type");
        if (!C13739e.m40387b(c13709a0)) {
            return new C13742h(strM40166b, 0L, C13802l.m40944a(m40422b(0L)));
        }
        if ("chunked".equalsIgnoreCase(c13709a0.m40166b(HttpHeaders.TRANSFER_ENCODING))) {
            return new C13742h(strM40166b, -1L, C13802l.m40944a(m40419a(c13709a0.m40177s().m40831g())));
        }
        long jM40382a = C13739e.m40382a(c13709a0);
        return jM40382a != -1 ? new C13742h(strM40166b, jM40382a, C13802l.m40944a(m40422b(jM40382a))) : new C13742h(strM40166b, -1L, C13802l.m40944a(m40424d()));
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC13808r m40418a(long j) {
        if (this.f38889e == 1) {
            this.f38889e = 2;
            return new e(j);
        }
        throw new IllegalStateException("state: " + this.f38889e);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.InterfaceC13737c
    /* JADX INFO: renamed from: a */
    public InterfaceC13808r mo40373a(C13789y c13789y, long j) {
        if ("chunked".equalsIgnoreCase(c13789y.m40825a(HttpHeaders.TRANSFER_ENCODING))) {
            return m40423c();
        }
        if (j != -1) {
            return m40418a(j);
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC13809s m40419a(C13783s c13783s) throws IOException {
        if (this.f38889e == 4) {
            this.f38889e = 5;
            return new d(c13783s);
        }
        throw new IllegalStateException("state: " + this.f38889e);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.InterfaceC13737c
    /* JADX INFO: renamed from: a */
    public void mo40374a() throws IOException {
        this.f38888d.flush();
    }

    /* JADX INFO: renamed from: a */
    public void m40420a(C13782r c13782r, String str) throws IOException {
        if (this.f38889e != 0) {
            throw new IllegalStateException("state: " + this.f38889e);
        }
        this.f38888d.mo40873a(str).mo40873a("\r\n");
        int iM40706b = c13782r.m40706b();
        for (int i = 0; i < iM40706b; i++) {
            this.f38888d.mo40873a(c13782r.m40705a(i)).mo40873a(": ").mo40873a(c13782r.m40707b(i)).mo40873a("\r\n");
        }
        this.f38888d.mo40873a("\r\n");
        this.f38889e = 1;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.InterfaceC13737c
    /* JADX INFO: renamed from: a */
    public void mo40375a(C13789y c13789y) throws IOException {
        m40420a(c13789y.m40827c(), C13743i.m40404a(c13789y, this.f38886b.m40363c().mo40245c().m40221b().type()));
    }

    /* JADX INFO: renamed from: a */
    void m40421a(C13799i c13799i) {
        C13810t c13810tM40936g = c13799i.m40936g();
        c13799i.m40928a(C13810t.f39349d);
        c13810tM40936g.mo40929a();
        c13810tM40936g.mo40932b();
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC13809s m40422b(long j) throws IOException {
        if (this.f38889e == 4) {
            this.f38889e = 5;
            return new f(j);
        }
        throw new IllegalStateException("state: " + this.f38889e);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.InterfaceC13737c
    /* JADX INFO: renamed from: b */
    public void mo40376b() throws IOException {
        this.f38888d.flush();
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC13808r m40423c() {
        if (this.f38889e == 1) {
            this.f38889e = 2;
            return new c();
        }
        throw new IllegalStateException("state: " + this.f38889e);
    }

    @Override // com.mbridge.msdk.thrid.okhttp.internal.http.InterfaceC13737c
    public void cancel() {
        C13729c c13729cM40363c = this.f38886b.m40363c();
        if (c13729cM40363c != null) {
            c13729cM40363c.m40330d();
        }
    }

    /* JADX INFO: renamed from: d */
    public InterfaceC13809s m40424d() throws IOException {
        if (this.f38889e != 4) {
            throw new IllegalStateException("state: " + this.f38889e);
        }
        C13733g c13733g = this.f38886b;
        if (c13733g == null) {
            throw new IllegalStateException("streamAllocation == null");
        }
        this.f38889e = 5;
        c13733g.m40365e();
        return new g();
    }

    /* JADX INFO: renamed from: f */
    public C13782r m40425f() throws IOException {
        C13782r.a aVar = new C13782r.a();
        while (true) {
            String strM40417e = m40417e();
            if (strM40417e.length() == 0) {
                return aVar.m40712a();
            }
            AbstractC13721a.f38769a.mo40258a(aVar, strM40417e);
        }
    }
}
