package com.mbridge.msdk.thrid.okhttp.internal.connection;

import com.mbridge.msdk.thrid.okhttp.AbstractC13779o;
import com.mbridge.msdk.thrid.okhttp.C13708a;
import com.mbridge.msdk.thrid.okhttp.C13713c0;
import com.mbridge.msdk.thrid.okhttp.C13720i;
import com.mbridge.msdk.thrid.okhttp.C13786v;
import com.mbridge.msdk.thrid.okhttp.InterfaceC13714d;
import com.mbridge.msdk.thrid.okhttp.InterfaceC13784t;
import com.mbridge.msdk.thrid.okhttp.internal.AbstractC13721a;
import com.mbridge.msdk.thrid.okhttp.internal.C13723c;
import com.mbridge.msdk.thrid.okhttp.internal.http.InterfaceC13737c;
import com.mbridge.msdk.thrid.okhttp.internal.http2.C13747a;
import com.mbridge.msdk.thrid.okhttp.internal.http2.C13760n;
import com.mbridge.msdk.thrid.okhttp.internal.http2.EnumC13748b;
import java.io.IOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.List;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.connection.g */
/* JADX INFO: compiled from: StreamAllocation.java */
/* JADX INFO: loaded from: classes7.dex */
public final class C13733g {

    /* JADX INFO: renamed from: o */
    static final /* synthetic */ boolean f38838o = true;

    /* JADX INFO: renamed from: a */
    public final C13708a f38839a;

    /* JADX INFO: renamed from: b */
    private C13732f.a f38840b;

    /* JADX INFO: renamed from: c */
    private C13713c0 f38841c;

    /* JADX INFO: renamed from: d */
    private final C13720i f38842d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC13714d f38843e;

    /* JADX INFO: renamed from: f */
    public final AbstractC13779o f38844f;

    /* JADX INFO: renamed from: g */
    private final Object f38845g;

    /* JADX INFO: renamed from: h */
    private final C13732f f38846h;

    /* JADX INFO: renamed from: i */
    private int f38847i;

    /* JADX INFO: renamed from: j */
    private C13729c f38848j;

    /* JADX INFO: renamed from: k */
    private boolean f38849k;

    /* JADX INFO: renamed from: l */
    private boolean f38850l;

    /* JADX INFO: renamed from: m */
    private boolean f38851m;

    /* JADX INFO: renamed from: n */
    private InterfaceC13737c f38852n;

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.connection.g$a */
    /* JADX INFO: compiled from: StreamAllocation.java */
    public static final class a extends WeakReference<C13733g> {

        /* JADX INFO: renamed from: a */
        public final Object f38853a;

        a(C13733g c13733g, Object obj) {
            super(c13733g);
            this.f38853a = obj;
        }
    }

    public C13733g(C13720i c13720i, C13708a c13708a, InterfaceC13714d interfaceC13714d, AbstractC13779o abstractC13779o, Object obj) {
        this.f38842d = c13720i;
        this.f38839a = c13708a;
        this.f38843e = interfaceC13714d;
        this.f38844f = abstractC13779o;
        this.f38846h = new C13732f(c13708a, m40355i(), interfaceC13714d, abstractC13779o);
        this.f38845g = obj;
    }

    /* JADX INFO: renamed from: a */
    private C13729c m40350a(int i, int i2, int i3, int i4, boolean z) throws Throwable {
        C13729c c13729c;
        Socket socketM40354g;
        C13729c c13729c2;
        Socket socketMo40256a;
        C13713c0 c13713c0M40349c;
        boolean z2;
        boolean z3;
        C13729c c13729c3;
        C13732f.a aVar;
        synchronized (this.f38842d) {
            if (this.f38850l) {
                throw new IllegalStateException("released");
            }
            if (this.f38852n != null) {
                throw new IllegalStateException("codec != null");
            }
            if (this.f38851m) {
                throw new IOException("Canceled");
            }
            c13729c = this.f38848j;
            socketM40354g = m40354g();
            c13729c2 = this.f38848j;
            socketMo40256a = null;
            if (c13729c2 != null) {
                c13729c = null;
            } else {
                c13729c2 = null;
            }
            if (!this.f38849k) {
                c13729c = null;
            }
            if (c13729c2 == null) {
                AbstractC13721a.f38769a.mo40253a(this.f38842d, this.f38839a, this, null);
                C13729c c13729c4 = this.f38848j;
                if (c13729c4 != null) {
                    z2 = true;
                    c13729c2 = c13729c4;
                    c13713c0M40349c = null;
                } else {
                    c13713c0M40349c = this.f38841c;
                }
            } else {
                c13713c0M40349c = null;
            }
            z2 = false;
        }
        C13723c.m40284a(socketM40354g);
        if (c13729c != null) {
            this.f38844f.connectionReleased(this.f38843e, c13729c);
        }
        if (z2) {
            this.f38844f.connectionAcquired(this.f38843e, c13729c2);
        }
        if (c13729c2 != null) {
            this.f38841c = this.f38848j.mo40245c();
            return c13729c2;
        }
        if (c13713c0M40349c != null || ((aVar = this.f38840b) != null && aVar.m40348b())) {
            z3 = false;
        } else {
            this.f38840b = this.f38846h.m40346c();
            z3 = true;
        }
        synchronized (this.f38842d) {
            if (this.f38851m) {
                throw new IOException("Canceled");
            }
            if (z3) {
                List<C13713c0> listM40347a = this.f38840b.m40347a();
                int size = listM40347a.size();
                for (int i5 = 0; i5 < size; i5++) {
                    C13713c0 c13713c0 = listM40347a.get(i5);
                    AbstractC13721a.f38769a.mo40253a(this.f38842d, this.f38839a, this, c13713c0);
                    C13729c c13729c5 = this.f38848j;
                    if (c13729c5 != null) {
                        this.f38841c = c13713c0;
                        z2 = true;
                        c13729c2 = c13729c5;
                        break;
                    }
                }
            }
            if (!z2) {
                if (c13713c0M40349c == null) {
                    c13713c0M40349c = this.f38840b.m40349c();
                }
                this.f38841c = c13713c0M40349c;
                this.f38847i = 0;
                c13729c2 = new C13729c(this.f38842d, c13713c0M40349c);
                m40358a(c13729c2, false);
            }
            c13729c3 = c13729c2;
        }
        if (z2) {
            this.f38844f.connectionAcquired(this.f38843e, c13729c3);
            return c13729c3;
        }
        c13729c3.m40324a(i, i2, i3, i4, z, this.f38843e, this.f38844f);
        m40355i().m40333a(c13729c3.mo40245c());
        synchronized (this.f38842d) {
            this.f38849k = true;
            AbstractC13721a.f38769a.mo40262b(this.f38842d, c13729c3);
            if (c13729c3.m40331f()) {
                socketMo40256a = AbstractC13721a.f38769a.mo40256a(this.f38842d, this.f38839a, this);
                c13729c3 = this.f38848j;
            }
        }
        C13723c.m40284a(socketMo40256a);
        this.f38844f.connectionAcquired(this.f38843e, c13729c3);
        return c13729c3;
    }

    /* JADX INFO: renamed from: a */
    private C13729c m40351a(int i, int i2, int i3, int i4, boolean z, boolean z2) throws Throwable {
        while (true) {
            C13729c c13729cM40350a = m40350a(i, i2, i3, i4, z);
            boolean z3 = z;
            int i5 = i4;
            int i6 = i3;
            int i7 = i2;
            int i8 = i;
            synchronized (this.f38842d) {
                if (c13729cM40350a.f38821l == 0 && !c13729cM40350a.m40331f()) {
                    return c13729cM40350a;
                }
                if (c13729cM40350a.m40329a(z2)) {
                    return c13729cM40350a;
                }
                m40365e();
                i = i8;
                i2 = i7;
                i3 = i6;
                i4 = i5;
                z = z3;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0059  */
    /* JADX INFO: renamed from: a */
    private Socket m40352a(boolean z, boolean z2, boolean z3) {
        Socket socketM40332g;
        if (!f38838o && !Thread.holdsLock(this.f38842d)) {
            throw new AssertionError();
        }
        if (z3) {
            this.f38852n = null;
        }
        if (z2) {
            this.f38850l = true;
        }
        C13729c c13729c = this.f38848j;
        if (c13729c != null) {
            if (z) {
                c13729c.f38820k = true;
            }
            if (this.f38852n == null && (this.f38850l || c13729c.f38820k)) {
                m40353a(c13729c);
                if (this.f38848j.f38823n.isEmpty()) {
                    this.f38848j.f38824o = System.nanoTime();
                    if (AbstractC13721a.f38769a.mo40261a(this.f38842d, this.f38848j)) {
                        socketM40332g = this.f38848j.m40332g();
                    } else {
                        socketM40332g = null;
                    }
                } else {
                    socketM40332g = null;
                }
                this.f38848j = null;
                return socketM40332g;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    private void m40353a(C13729c c13729c) {
        int size = c13729c.f38823n.size();
        for (int i = 0; i < size; i++) {
            if (c13729c.f38823n.get(i).get() == this) {
                c13729c.f38823n.remove(i);
                return;
            }
        }
        throw new IllegalStateException();
    }

    /* JADX INFO: renamed from: g */
    private Socket m40354g() {
        if (!f38838o && !Thread.holdsLock(this.f38842d)) {
            throw new AssertionError();
        }
        C13729c c13729c = this.f38848j;
        if (c13729c == null || !c13729c.f38820k) {
            return null;
        }
        return m40352a(false, false, true);
    }

    /* JADX INFO: renamed from: i */
    private C13730d m40355i() {
        return AbstractC13721a.f38769a.mo40254a(this.f38842d);
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC13737c m40356a(C13786v c13786v, InterfaceC13784t.a aVar, boolean z) {
        try {
            InterfaceC13737c interfaceC13737cM40323a = m40351a(aVar.mo40392a(), aVar.mo40395b(), aVar.mo40396c(), c13786v.m40791t(), c13786v.m40797z(), z).m40323a(c13786v, aVar, this);
            synchronized (this.f38842d) {
                this.f38852n = interfaceC13737cM40323a;
            }
            return interfaceC13737cM40323a;
        } catch (IOException e) {
            throw new C13731e(e);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m40357a() {
        InterfaceC13737c interfaceC13737c;
        C13729c c13729c;
        synchronized (this.f38842d) {
            this.f38851m = true;
            interfaceC13737c = this.f38852n;
            c13729c = this.f38848j;
        }
        if (interfaceC13737c != null) {
            interfaceC13737c.cancel();
        } else if (c13729c != null) {
            c13729c.m40330d();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m40358a(C13729c c13729c, boolean z) {
        if (!f38838o && !Thread.holdsLock(this.f38842d)) {
            throw new AssertionError();
        }
        if (this.f38848j != null) {
            throw new IllegalStateException();
        }
        this.f38848j = c13729c;
        this.f38849k = z;
        c13729c.f38823n.add(new a(this, this.f38845g));
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0046  */
    /* JADX INFO: renamed from: a */
    public void m40359a(IOException iOException) {
        C13729c c13729c;
        boolean z;
        Socket socketM40352a;
        synchronized (this.f38842d) {
            c13729c = null;
            if (iOException instanceof C13760n) {
                EnumC13748b enumC13748b = ((C13760n) iOException).f39090a;
                if (enumC13748b == EnumC13748b.REFUSED_STREAM) {
                    int i = this.f38847i + 1;
                    this.f38847i = i;
                    if (i > 1) {
                        this.f38841c = null;
                        z = true;
                    } else {
                        z = false;
                    }
                } else if (enumC13748b != EnumC13748b.CANCEL) {
                    this.f38841c = null;
                    z = true;
                } else {
                    z = false;
                }
            } else {
                C13729c c13729c2 = this.f38848j;
                if (c13729c2 == null || (c13729c2.m40331f() && !(iOException instanceof C13747a))) {
                    z = false;
                } else {
                    if (this.f38848j.f38821l == 0) {
                        C13713c0 c13713c0 = this.f38841c;
                        if (c13713c0 != null && iOException != null) {
                            this.f38846h.m40344a(c13713c0, iOException);
                        }
                        this.f38841c = null;
                    }
                    z = true;
                }
            }
            C13729c c13729c3 = this.f38848j;
            socketM40352a = m40352a(z, false, true);
            if (this.f38848j == null && this.f38849k) {
                c13729c = c13729c3;
            }
        }
        C13723c.m40284a(socketM40352a);
        if (c13729c != null) {
            this.f38844f.connectionReleased(this.f38843e, c13729c);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m40360a(boolean z, InterfaceC13737c interfaceC13737c, long j, IOException iOException) {
        C13729c c13729c;
        Socket socketM40352a;
        boolean z2;
        this.f38844f.responseBodyEnd(this.f38843e, j);
        synchronized (this.f38842d) {
            if (interfaceC13737c != null) {
                if (interfaceC13737c == this.f38852n) {
                    if (!z) {
                        this.f38848j.f38821l++;
                    }
                    c13729c = this.f38848j;
                    socketM40352a = m40352a(z, false, true);
                    if (this.f38848j != null) {
                        c13729c = null;
                    }
                    z2 = this.f38850l;
                }
            }
            throw new IllegalStateException("expected " + this.f38852n + " but was " + interfaceC13737c);
        }
        C13723c.m40284a(socketM40352a);
        if (c13729c != null) {
            this.f38844f.connectionReleased(this.f38843e, c13729c);
        }
        if (iOException != null) {
            this.f38844f.callFailed(this.f38843e, AbstractC13721a.f38769a.mo40255a(this.f38843e, iOException));
        } else if (z2) {
            AbstractC13721a.f38769a.mo40255a(this.f38843e, (IOException) null);
            this.f38844f.callEnd(this.f38843e);
        }
    }

    /* JADX INFO: renamed from: b */
    public InterfaceC13737c m40361b() {
        InterfaceC13737c interfaceC13737c;
        synchronized (this.f38842d) {
            interfaceC13737c = this.f38852n;
        }
        return interfaceC13737c;
    }

    /* JADX INFO: renamed from: b */
    public Socket m40362b(C13729c c13729c) {
        if (!f38838o && !Thread.holdsLock(this.f38842d)) {
            throw new AssertionError();
        }
        if (this.f38852n != null || this.f38848j.f38823n.size() != 1) {
            throw new IllegalStateException();
        }
        Reference<C13733g> reference = this.f38848j.f38823n.get(0);
        Socket socketM40352a = m40352a(true, false, false);
        this.f38848j = c13729c;
        c13729c.f38823n.add(reference);
        return socketM40352a;
    }

    /* JADX INFO: renamed from: c */
    public synchronized C13729c m40363c() {
        return this.f38848j;
    }

    /* JADX INFO: renamed from: d */
    public boolean m40364d() {
        if (this.f38841c != null) {
            return true;
        }
        C13732f.a aVar = this.f38840b;
        return (aVar != null && aVar.m40348b()) || this.f38846h.m40345a();
    }

    /* JADX INFO: renamed from: e */
    public void m40365e() {
        C13729c c13729c;
        Socket socketM40352a;
        synchronized (this.f38842d) {
            c13729c = this.f38848j;
            socketM40352a = m40352a(true, false, false);
            if (this.f38848j != null) {
                c13729c = null;
            }
        }
        C13723c.m40284a(socketM40352a);
        if (c13729c != null) {
            this.f38844f.connectionReleased(this.f38843e, c13729c);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m40366f() {
        C13729c c13729c;
        Socket socketM40352a;
        synchronized (this.f38842d) {
            c13729c = this.f38848j;
            socketM40352a = m40352a(false, true, false);
            if (this.f38848j != null) {
                c13729c = null;
            }
        }
        C13723c.m40284a(socketM40352a);
        if (c13729c != null) {
            AbstractC13721a.f38769a.mo40255a(this.f38843e, (IOException) null);
            this.f38844f.connectionReleased(this.f38843e, c13729c);
            this.f38844f.callEnd(this.f38843e);
        }
    }

    /* JADX INFO: renamed from: h */
    public C13713c0 m40367h() {
        return this.f38841c;
    }

    public String toString() {
        C13729c c13729cM40363c = m40363c();
        return c13729cM40363c != null ? c13729cM40363c.toString() : this.f38839a.toString();
    }
}
