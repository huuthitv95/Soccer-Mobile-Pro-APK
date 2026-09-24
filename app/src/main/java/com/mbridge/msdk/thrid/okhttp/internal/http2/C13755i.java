package com.mbridge.msdk.thrid.okhttp.internal.http2;

import com.mbridge.msdk.thrid.okhttp.C13782r;
import com.mbridge.msdk.thrid.okhttp.internal.C13723c;
import com.mbridge.msdk.thrid.okio.C13791a;
import com.mbridge.msdk.thrid.okio.C13793c;
import com.mbridge.msdk.thrid.okio.C13810t;
import com.mbridge.msdk.thrid.okio.InterfaceC13795e;
import com.mbridge.msdk.thrid.okio.InterfaceC13808r;
import com.mbridge.msdk.thrid.okio.InterfaceC13809s;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.http2.i */
/* JADX INFO: compiled from: Http2Stream.java */
/* JADX INFO: loaded from: classes7.dex */
public final class C13755i {

    /* JADX INFO: renamed from: l */
    static final /* synthetic */ boolean f39048l = true;

    /* JADX INFO: renamed from: a */
    long f39049a = 0;

    /* JADX INFO: renamed from: b */
    long f39050b;

    /* JADX INFO: renamed from: c */
    final int f39051c;

    /* JADX INFO: renamed from: d */
    final C13753g f39052d;

    /* JADX INFO: renamed from: e */
    private final Deque<C13782r> f39053e;

    /* JADX INFO: renamed from: f */
    private boolean f39054f;

    /* JADX INFO: renamed from: g */
    private final b f39055g;

    /* JADX INFO: renamed from: h */
    final a f39056h;

    /* JADX INFO: renamed from: i */
    final c f39057i;

    /* JADX INFO: renamed from: j */
    final c f39058j;

    /* JADX INFO: renamed from: k */
    EnumC13748b f39059k;

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.http2.i$a */
    /* JADX INFO: compiled from: Http2Stream.java */
    final class a implements InterfaceC13808r, AutoCloseable {

        /* JADX INFO: renamed from: e */
        static final /* synthetic */ boolean f39060e = true;

        /* JADX INFO: renamed from: a */
        private final C13793c f39061a = new C13793c();

        /* JADX INFO: renamed from: b */
        boolean f39062b;

        /* JADX INFO: renamed from: c */
        boolean f39063c;

        a() {
        }

        /* JADX INFO: renamed from: a */
        private void m40553a(boolean z) throws IOException {
            C13755i c13755i;
            long jMin;
            C13755i c13755i2;
            synchronized (C13755i.this) {
                C13755i.this.f39058j.m40858h();
                while (true) {
                    try {
                        c13755i = C13755i.this;
                        if (c13755i.f39050b > 0 || this.f39063c || this.f39062b || c13755i.f39059k != null) {
                            break;
                        } else {
                            c13755i.m40551k();
                        }
                    } catch (Throwable th) {
                        C13755i.this.f39058j.m40558k();
                        throw th;
                    }
                }
                c13755i.f39058j.m40558k();
                C13755i.this.m40540b();
                jMin = Math.min(C13755i.this.f39050b, this.f39061a.size());
                c13755i2 = C13755i.this;
                c13755i2.f39050b -= jMin;
            }
            c13755i2.f39058j.m40858h();
            try {
                C13755i c13755i3 = C13755i.this;
                c13755i3.f39052d.m40486a(c13755i3.f39051c, z && jMin == this.f39061a.size(), this.f39061a, jMin);
            } finally {
                C13755i.this.f39058j.m40558k();
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.InterfaceC13808r
        /* JADX INFO: renamed from: a */
        public void mo40370a(C13793c c13793c, long j) throws IOException {
            if (!f39060e && Thread.holdsLock(C13755i.this)) {
                throw new AssertionError();
            }
            this.f39061a.mo40370a(c13793c, j);
            while (this.f39061a.size() >= 16384) {
                m40553a(false);
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.InterfaceC13808r
        /* JADX INFO: renamed from: b */
        public C13810t mo40429b() {
            return C13755i.this.f39058j;
        }

        @Override // com.mbridge.msdk.thrid.okio.InterfaceC13808r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (!f39060e && Thread.holdsLock(C13755i.this)) {
                throw new AssertionError();
            }
            synchronized (C13755i.this) {
                if (this.f39062b) {
                    return;
                }
                if (!C13755i.this.f39056h.f39063c) {
                    if (this.f39061a.size() > 0) {
                        while (this.f39061a.size() > 0) {
                            m40553a(true);
                        }
                    } else {
                        C13755i c13755i = C13755i.this;
                        c13755i.f39052d.m40486a(c13755i.f39051c, true, (C13793c) null, 0L);
                    }
                }
                synchronized (C13755i.this) {
                    this.f39062b = true;
                }
                C13755i.this.f39052d.flush();
                C13755i.this.m40535a();
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.InterfaceC13808r, java.io.Flushable
        public void flush() throws IOException {
            if (!f39060e && Thread.holdsLock(C13755i.this)) {
                throw new AssertionError();
            }
            synchronized (C13755i.this) {
                C13755i.this.m40540b();
            }
            while (this.f39061a.size() > 0) {
                m40553a(false);
                C13755i.this.f39052d.flush();
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.http2.i$b */
    /* JADX INFO: compiled from: Http2Stream.java */
    private final class b implements InterfaceC13809s, AutoCloseable {

        /* JADX INFO: renamed from: g */
        static final /* synthetic */ boolean f39065g = true;

        /* JADX INFO: renamed from: a */
        private final C13793c f39066a = new C13793c();

        /* JADX INFO: renamed from: b */
        private final C13793c f39067b = new C13793c();

        /* JADX INFO: renamed from: c */
        private final long f39068c;

        /* JADX INFO: renamed from: d */
        boolean f39069d;

        /* JADX INFO: renamed from: e */
        boolean f39070e;

        b(long j) {
            this.f39068c = j;
        }

        /* JADX INFO: renamed from: f */
        private void m40554f(long j) {
            if (!f39065g && Thread.holdsLock(C13755i.this)) {
                throw new AssertionError();
            }
            C13755i.this.f39052d.m40497g(j);
        }

        /* JADX INFO: renamed from: a */
        void m40555a(InterfaceC13795e interfaceC13795e, long j) throws IOException {
            boolean z;
            boolean z2;
            boolean z3;
            long size;
            if (!f39065g && Thread.holdsLock(C13755i.this)) {
                throw new AssertionError();
            }
            while (j > 0) {
                synchronized (C13755i.this) {
                    z = this.f39070e;
                    z2 = true;
                    z3 = this.f39067b.size() + j > this.f39068c;
                }
                if (z3) {
                    interfaceC13795e.skip(j);
                    C13755i.this.m40542c(EnumC13748b.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z) {
                    interfaceC13795e.skip(j);
                    return;
                }
                long jMo40427b = interfaceC13795e.mo40427b(this.f39066a, j);
                if (jMo40427b == -1) {
                    throw new EOFException();
                }
                j -= jMo40427b;
                synchronized (C13755i.this) {
                    if (this.f39069d) {
                        size = this.f39066a.size();
                        this.f39066a.m40899k();
                    } else {
                        if (this.f39067b.size() != 0) {
                            z2 = false;
                        }
                        this.f39067b.m40864a(this.f39066a);
                        if (z2) {
                            C13755i.this.notifyAll();
                        }
                        size = 0;
                    }
                }
                if (size > 0) {
                    m40554f(size);
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:35:0x008e  */
        /* JADX WARN: Code duplicated, block: B:37:0x0092 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:38:0x0094 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:39:0x0095  */
        @Override // com.mbridge.msdk.thrid.okio.InterfaceC13809s
        /* JADX INFO: renamed from: b */
        public long mo40427b(C13793c c13793c, long j) throws IOException {
            EnumC13748b enumC13748b;
            long jMo40427b;
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: " + j);
            }
            while (true) {
                synchronized (C13755i.this) {
                    C13755i.this.f39057i.m40858h();
                    try {
                        C13755i c13755i = C13755i.this;
                        enumC13748b = c13755i.f39059k;
                        if (enumC13748b == null) {
                            enumC13748b = null;
                        }
                        if (this.f39069d) {
                            throw new IOException("stream closed");
                        }
                        if (!c13755i.f39053e.isEmpty()) {
                            C13755i.m40533b(C13755i.this);
                        }
                        if (this.f39067b.size() > 0) {
                            C13793c c13793c2 = this.f39067b;
                            jMo40427b = c13793c2.mo40427b(c13793c, Math.min(j, c13793c2.size()));
                            C13755i c13755i2 = C13755i.this;
                            long j2 = c13755i2.f39049a + jMo40427b;
                            c13755i2.f39049a = j2;
                            if (enumC13748b != null || j2 < c13755i2.f39052d.f38987t.m40591c() / 2) {
                                break;
                                break;
                            }
                            C13755i c13755i3 = C13755i.this;
                            c13755i3.f39052d.m40482a(c13755i3.f39051c, c13755i3.f39049a);
                            C13755i.this.f39049a = 0L;
                            break;
                        }
                        if (this.f39070e || enumC13748b != null) {
                            jMo40427b = -1;
                            break;
                        }
                        C13755i.this.m40551k();
                        C13755i.this.f39057i.m40558k();
                    } catch (Throwable th) {
                        C13755i.this.f39057i.m40558k();
                        throw th;
                    }
                }
                if (jMo40427b != -1) {
                    m40554f(jMo40427b);
                    return jMo40427b;
                }
                if (enumC13748b == null) {
                    return -1L;
                }
                throw new C13760n(enumC13748b);
            }
            C13755i.this.f39057i.m40558k();
            if (jMo40427b != -1) {
                m40554f(jMo40427b);
                return jMo40427b;
            }
            if (enumC13748b == null) {
                return -1L;
            }
            throw new C13760n(enumC13748b);
        }

        @Override // com.mbridge.msdk.thrid.okio.InterfaceC13809s
        /* JADX INFO: renamed from: b */
        public C13810t mo40428b() {
            return C13755i.this.f39057i;
        }

        @Override // com.mbridge.msdk.thrid.okio.InterfaceC13809s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            long size;
            synchronized (C13755i.this) {
                this.f39069d = true;
                size = this.f39067b.size();
                this.f39067b.m40899k();
                if (!C13755i.this.f39053e.isEmpty()) {
                    C13755i.m40533b(C13755i.this);
                }
                C13755i.this.notifyAll();
            }
            if (size > 0) {
                m40554f(size);
            }
            C13755i.this.m40535a();
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.http2.i$c */
    /* JADX INFO: compiled from: Http2Stream.java */
    class c extends C13791a {
        c() {
        }

        @Override // com.mbridge.msdk.thrid.okio.C13791a
        /* JADX INFO: renamed from: b */
        protected IOException mo40556b(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        @Override // com.mbridge.msdk.thrid.okio.C13791a
        /* JADX INFO: renamed from: j */
        protected void mo40557j() {
            C13755i.this.m40542c(EnumC13748b.CANCEL);
            C13755i.this.f39052d.m40499l();
        }

        /* JADX INFO: renamed from: k */
        public void m40558k() throws IOException {
            if (m40859i()) {
                throw mo40556b((IOException) null);
            }
        }
    }

    C13755i(int i, C13753g c13753g, boolean z, boolean z2, @Nullable C13782r c13782r) {
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f39053e = arrayDeque;
        this.f39057i = new c();
        this.f39058j = new c();
        this.f39059k = null;
        if (c13753g == null) {
            throw new NullPointerException("connection == null");
        }
        this.f39051c = i;
        this.f39052d = c13753g;
        this.f39050b = c13753g.f38988u.m40591c();
        b bVar = new b(c13753g.f38987t.m40591c());
        this.f39055g = bVar;
        a aVar = new a();
        this.f39056h = aVar;
        bVar.f39070e = z2;
        aVar.f39063c = z;
        if (c13782r != null) {
            arrayDeque.add(c13782r);
        }
        if (m40546f() && c13782r != null) {
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        }
        if (!m40546f() && c13782r == null) {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    /* JADX INFO: renamed from: b */
    static /* synthetic */ C13749c.a m40533b(C13755i c13755i) {
        c13755i.getClass();
        return null;
    }

    /* JADX INFO: renamed from: b */
    private boolean m40534b(EnumC13748b enumC13748b) {
        if (!f39048l && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            if (this.f39059k != null) {
                return false;
            }
            if (this.f39055g.f39070e && this.f39056h.f39063c) {
                return false;
            }
            this.f39059k = enumC13748b;
            notifyAll();
            this.f39052d.m40494c(this.f39051c);
            return true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0028  */
    /* JADX INFO: renamed from: a */
    void m40535a() throws IOException {
        boolean z;
        boolean zM40547g;
        if (!f39048l && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            b bVar = this.f39055g;
            if (bVar.f39070e || !bVar.f39069d) {
                z = false;
            } else {
                a aVar = this.f39056h;
                if (aVar.f39063c || aVar.f39062b) {
                    z = true;
                } else {
                    z = false;
                }
            }
            zM40547g = m40547g();
        }
        if (z) {
            m40537a(EnumC13748b.CANCEL);
        } else {
            if (zM40547g) {
                return;
            }
            this.f39052d.m40494c(this.f39051c);
        }
    }

    /* JADX INFO: renamed from: a */
    void m40536a(long j) {
        this.f39050b += j;
        if (j > 0) {
            notifyAll();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m40537a(EnumC13748b enumC13748b) throws IOException {
        if (m40534b(enumC13748b)) {
            this.f39052d.m40491b(this.f39051c, enumC13748b);
        }
    }

    /* JADX INFO: renamed from: a */
    void m40538a(InterfaceC13795e interfaceC13795e, int i) throws IOException {
        if (!f39048l && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        this.f39055g.m40555a(interfaceC13795e, i);
    }

    /* JADX INFO: renamed from: a */
    void m40539a(List<C13749c> list) {
        boolean zM40547g;
        if (!f39048l && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            this.f39054f = true;
            this.f39053e.add(C13723c.m40292b(list));
            zM40547g = m40547g();
            notifyAll();
        }
        if (zM40547g) {
            return;
        }
        this.f39052d.m40494c(this.f39051c);
    }

    /* JADX INFO: renamed from: b */
    void m40540b() throws IOException {
        a aVar = this.f39056h;
        if (aVar.f39062b) {
            throw new IOException("stream closed");
        }
        if (aVar.f39063c) {
            throw new IOException("stream finished");
        }
        if (this.f39059k != null) {
            throw new C13760n(this.f39059k);
        }
    }

    /* JADX INFO: renamed from: c */
    public int m40541c() {
        return this.f39051c;
    }

    /* JADX INFO: renamed from: c */
    public void m40542c(EnumC13748b enumC13748b) {
        if (m40534b(enumC13748b)) {
            this.f39052d.m40495c(this.f39051c, enumC13748b);
        }
    }

    /* JADX INFO: renamed from: d */
    public InterfaceC13808r m40543d() {
        synchronized (this) {
            if (!this.f39054f && !m40546f()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f39056h;
    }

    /* JADX INFO: renamed from: d */
    synchronized void m40544d(EnumC13748b enumC13748b) {
        if (this.f39059k == null) {
            this.f39059k = enumC13748b;
            notifyAll();
        }
    }

    /* JADX INFO: renamed from: e */
    public InterfaceC13809s m40545e() {
        return this.f39055g;
    }

    /* JADX INFO: renamed from: f */
    public boolean m40546f() {
        return this.f39052d.f38968a == ((this.f39051c & 1) == 1);
    }

    /* JADX INFO: renamed from: g */
    public synchronized boolean m40547g() {
        if (this.f39059k != null) {
            return false;
        }
        b bVar = this.f39055g;
        if (bVar.f39070e || bVar.f39069d) {
            a aVar = this.f39056h;
            if ((aVar.f39063c || aVar.f39062b) && this.f39054f) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: h */
    public C13810t m40548h() {
        return this.f39057i;
    }

    /* JADX INFO: renamed from: i */
    void m40549i() {
        boolean zM40547g;
        if (!f39048l && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        synchronized (this) {
            this.f39055g.f39070e = true;
            zM40547g = m40547g();
            notifyAll();
        }
        if (zM40547g) {
            return;
        }
        this.f39052d.m40494c(this.f39051c);
    }

    /* JADX INFO: renamed from: j */
    public synchronized C13782r m40550j() throws IOException {
        this.f39057i.m40858h();
        while (this.f39053e.isEmpty() && this.f39059k == null) {
            try {
                m40551k();
            } catch (Throwable th) {
                this.f39057i.m40558k();
                throw th;
            }
        }
        this.f39057i.m40558k();
        if (this.f39053e.isEmpty()) {
            throw new C13760n(this.f39059k);
        }
        return this.f39053e.removeFirst();
    }

    /* JADX INFO: renamed from: k */
    void m40551k() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    /* JADX INFO: renamed from: l */
    public C13810t m40552l() {
        return this.f39058j;
    }
}
