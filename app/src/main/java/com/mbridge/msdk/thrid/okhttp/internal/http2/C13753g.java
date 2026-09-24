package com.mbridge.msdk.thrid.okhttp.internal.http2;

import com.mbridge.msdk.thrid.okhttp.internal.AbstractRunnableC13722b;
import com.mbridge.msdk.thrid.okhttp.internal.C13723c;
import com.mbridge.msdk.thrid.okhttp.internal.platform.C13767g;
import com.mbridge.msdk.thrid.okio.C13793c;
import com.mbridge.msdk.thrid.okio.C13796f;
import com.mbridge.msdk.thrid.okio.InterfaceC13794d;
import com.mbridge.msdk.thrid.okio.InterfaceC13795e;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.http2.g */
/* JADX INFO: compiled from: Http2Connection.java */
/* JADX INFO: loaded from: classes7.dex */
public final class C13753g implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: A */
    static final /* synthetic */ boolean f38966A = true;

    /* JADX INFO: renamed from: z */
    private static final ExecutorService f38967z = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), C13723c.m40279a("OkHttp Http2Connection", true));

    /* JADX INFO: renamed from: a */
    final boolean f38968a;

    /* JADX INFO: renamed from: b */
    final j f38969b;

    /* JADX INFO: renamed from: d */
    final String f38971d;

    /* JADX INFO: renamed from: e */
    int f38972e;

    /* JADX INFO: renamed from: f */
    int f38973f;

    /* JADX INFO: renamed from: g */
    private boolean f38974g;

    /* JADX INFO: renamed from: h */
    private final ScheduledExecutorService f38975h;

    /* JADX INFO: renamed from: i */
    private final ExecutorService f38976i;

    /* JADX INFO: renamed from: j */
    final InterfaceC13758l f38977j;

    /* JADX INFO: renamed from: s */
    long f38986s;

    /* JADX INFO: renamed from: u */
    final C13759m f38988u;

    /* JADX INFO: renamed from: v */
    final Socket f38989v;

    /* JADX INFO: renamed from: w */
    final C13756j f38990w;

    /* JADX INFO: renamed from: x */
    final l f38991x;

    /* JADX INFO: renamed from: y */
    final Set<Integer> f38992y;

    /* JADX INFO: renamed from: c */
    final Map<Integer, C13755i> f38970c = new LinkedHashMap();

    /* JADX INFO: renamed from: k */
    private long f38978k = 0;

    /* JADX INFO: renamed from: l */
    private long f38979l = 0;

    /* JADX INFO: renamed from: m */
    private long f38980m = 0;

    /* JADX INFO: renamed from: n */
    private long f38981n = 0;

    /* JADX INFO: renamed from: o */
    private long f38982o = 0;

    /* JADX INFO: renamed from: p */
    private long f38983p = 0;

    /* JADX INFO: renamed from: q */
    private long f38984q = 0;

    /* JADX INFO: renamed from: r */
    long f38985r = 0;

    /* JADX INFO: renamed from: t */
    C13759m f38987t = new C13759m();

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.http2.g$a */
    /* JADX INFO: compiled from: Http2Connection.java */
    class a extends AbstractRunnableC13722b {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f38993b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ EnumC13748b f38994c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, Object[] objArr, int i, EnumC13748b enumC13748b) {
            super(str, objArr);
            this.f38993b = i;
            this.f38994c = enumC13748b;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.AbstractRunnableC13722b
        /* JADX INFO: renamed from: b */
        public void mo40263b() {
            try {
                C13753g.this.m40491b(this.f38993b, this.f38994c);
            } catch (IOException unused) {
                C13753g.this.m40478h();
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.http2.g$b */
    /* JADX INFO: compiled from: Http2Connection.java */
    class b extends AbstractRunnableC13722b {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f38996b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ long f38997c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(String str, Object[] objArr, int i, long j) {
            super(str, objArr);
            this.f38996b = i;
            this.f38997c = j;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.AbstractRunnableC13722b
        /* JADX INFO: renamed from: b */
        public void mo40263b() {
            try {
                C13753g.this.f38990w.m40564a(this.f38996b, this.f38997c);
            } catch (IOException unused) {
                C13753g.this.m40478h();
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.http2.g$c */
    /* JADX INFO: compiled from: Http2Connection.java */
    class c extends AbstractRunnableC13722b {
        c(String str, Object... objArr) {
            super(str, objArr);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.AbstractRunnableC13722b
        /* JADX INFO: renamed from: b */
        public void mo40263b() {
            C13753g.this.m40490a(false, 2, 0);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.http2.g$d */
    /* JADX INFO: compiled from: Http2Connection.java */
    class d extends AbstractRunnableC13722b {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f39000b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ List f39001c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, Object[] objArr, int i, List list) {
            super(str, objArr);
            this.f39000b = i;
            this.f39001c = list;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.AbstractRunnableC13722b
        /* JADX INFO: renamed from: b */
        public void mo40263b() {
            if (C13753g.this.f38977j.mo40583a(this.f39000b, this.f39001c)) {
                try {
                    C13753g.this.f38990w.m40565a(this.f39000b, EnumC13748b.CANCEL);
                    synchronized (C13753g.this) {
                        try {
                            C13753g.this.f38992y.remove(Integer.valueOf(this.f39000b));
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                } catch (IOException unused) {
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.http2.g$e */
    /* JADX INFO: compiled from: Http2Connection.java */
    class e extends AbstractRunnableC13722b {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f39003b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ List f39004c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ boolean f39005d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, Object[] objArr, int i, List list, boolean z) {
            super(str, objArr);
            this.f39003b = i;
            this.f39004c = list;
            this.f39005d = z;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.AbstractRunnableC13722b
        /* JADX INFO: renamed from: b */
        public void mo40263b() {
            boolean zMo40584a = C13753g.this.f38977j.mo40584a(this.f39003b, this.f39004c, this.f39005d);
            if (zMo40584a) {
                try {
                    C13753g.this.f38990w.m40565a(this.f39003b, EnumC13748b.CANCEL);
                } catch (IOException unused) {
                    return;
                }
            }
            if (zMo40584a || this.f39005d) {
                synchronized (C13753g.this) {
                    try {
                        C13753g.this.f38992y.remove(Integer.valueOf(this.f39003b));
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.http2.g$f */
    /* JADX INFO: compiled from: Http2Connection.java */
    class f extends AbstractRunnableC13722b {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f39007b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ C13793c f39008c;

        /* JADX INFO: renamed from: d */
        final /* synthetic */ int f39009d;

        /* JADX INFO: renamed from: e */
        final /* synthetic */ boolean f39010e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, Object[] objArr, int i, C13793c c13793c, int i2, boolean z) {
            super(str, objArr);
            this.f39007b = i;
            this.f39008c = c13793c;
            this.f39009d = i2;
            this.f39010e = z;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.AbstractRunnableC13722b
        /* JADX INFO: renamed from: b */
        public void mo40263b() {
            try {
                boolean zMo40582a = C13753g.this.f38977j.mo40582a(this.f39007b, this.f39008c, this.f39009d, this.f39010e);
                if (zMo40582a) {
                    C13753g.this.f38990w.m40565a(this.f39007b, EnumC13748b.CANCEL);
                }
                if (zMo40582a || this.f39010e) {
                    synchronized (C13753g.this) {
                        C13753g.this.f38992y.remove(Integer.valueOf(this.f39007b));
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.http2.g$g */
    /* JADX INFO: compiled from: Http2Connection.java */
    class g extends AbstractRunnableC13722b {

        /* JADX INFO: renamed from: b */
        final /* synthetic */ int f39012b;

        /* JADX INFO: renamed from: c */
        final /* synthetic */ EnumC13748b f39013c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, Object[] objArr, int i, EnumC13748b enumC13748b) {
            super(str, objArr);
            this.f39012b = i;
            this.f39013c = enumC13748b;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.AbstractRunnableC13722b
        /* JADX INFO: renamed from: b */
        public void mo40263b() {
            C13753g.this.f38977j.mo40581a(this.f39012b, this.f39013c);
            synchronized (C13753g.this) {
                C13753g.this.f38992y.remove(Integer.valueOf(this.f39012b));
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.http2.g$h */
    /* JADX INFO: compiled from: Http2Connection.java */
    public static class h {

        /* JADX INFO: renamed from: a */
        Socket f39015a;

        /* JADX INFO: renamed from: b */
        String f39016b;

        /* JADX INFO: renamed from: c */
        InterfaceC13795e f39017c;

        /* JADX INFO: renamed from: d */
        InterfaceC13794d f39018d;

        /* JADX INFO: renamed from: e */
        j f39019e = j.f39024a;

        /* JADX INFO: renamed from: f */
        InterfaceC13758l f39020f = InterfaceC13758l.f39087a;

        /* JADX INFO: renamed from: g */
        boolean f39021g;

        /* JADX INFO: renamed from: h */
        int f39022h;

        public h(boolean z) {
            this.f39021g = z;
        }

        /* JADX INFO: renamed from: a */
        public h m40501a(int i) {
            this.f39022h = i;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public h m40502a(j jVar) {
            this.f39019e = jVar;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public h m40503a(Socket socket, String str, InterfaceC13795e interfaceC13795e, InterfaceC13794d interfaceC13794d) {
            this.f39015a = socket;
            this.f39016b = str;
            this.f39017c = interfaceC13795e;
            this.f39018d = interfaceC13794d;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public C13753g m40504a() {
            return new C13753g(this);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.http2.g$i */
    /* JADX INFO: compiled from: Http2Connection.java */
    final class i extends AbstractRunnableC13722b {
        i() {
            super("OkHttp %s ping", C13753g.this.f38971d);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.AbstractRunnableC13722b
        /* JADX INFO: renamed from: b */
        public void mo40263b() {
            boolean z;
            synchronized (C13753g.this) {
                if (C13753g.this.f38979l < C13753g.this.f38978k) {
                    z = true;
                } else {
                    C13753g.m40474e(C13753g.this);
                    z = false;
                }
            }
            if (z) {
                C13753g.this.m40478h();
            } else {
                C13753g.this.m40490a(false, 1, 0);
            }
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.http2.g$j */
    /* JADX INFO: compiled from: Http2Connection.java */
    public static abstract class j {

        /* JADX INFO: renamed from: a */
        public static final j f39024a = new a();

        /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.http2.g$j$a */
        /* JADX INFO: compiled from: Http2Connection.java */
        static class a extends j {
            a() {
            }

            @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.C13753g.j
            /* JADX INFO: renamed from: a */
            public void mo40326a(C13755i c13755i) throws IOException {
                c13755i.m40537a(EnumC13748b.REFUSED_STREAM);
            }
        }

        /* JADX INFO: renamed from: a */
        public void mo40325a(C13753g c13753g) {
        }

        /* JADX INFO: renamed from: a */
        public abstract void mo40326a(C13755i c13755i) throws IOException;
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.http2.g$k */
    /* JADX INFO: compiled from: Http2Connection.java */
    final class k extends AbstractRunnableC13722b {

        /* JADX INFO: renamed from: b */
        final boolean f39025b;

        /* JADX INFO: renamed from: c */
        final int f39026c;

        /* JADX INFO: renamed from: d */
        final int f39027d;

        k(boolean z, int i, int i2) {
            super("OkHttp %s ping %08x%08x", C13753g.this.f38971d, Integer.valueOf(i), Integer.valueOf(i2));
            this.f39025b = z;
            this.f39026c = i;
            this.f39027d = i2;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.AbstractRunnableC13722b
        /* JADX INFO: renamed from: b */
        public void mo40263b() {
            C13753g.this.m40490a(this.f39025b, this.f39026c, this.f39027d);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.http2.g$l */
    /* JADX INFO: compiled from: Http2Connection.java */
    class l extends AbstractRunnableC13722b implements C13754h.b {

        /* JADX INFO: renamed from: b */
        final C13754h f39029b;

        /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.http2.g$l$a */
        /* JADX INFO: compiled from: Http2Connection.java */
        class a extends AbstractRunnableC13722b {

            /* JADX INFO: renamed from: b */
            final /* synthetic */ C13755i f39031b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(String str, Object[] objArr, C13755i c13755i) {
                super(str, objArr);
                this.f39031b = c13755i;
            }

            @Override // com.mbridge.msdk.thrid.okhttp.internal.AbstractRunnableC13722b
            /* JADX INFO: renamed from: b */
            public void mo40263b() {
                try {
                    C13753g.this.f38969b.mo40326a(this.f39031b);
                } catch (IOException e) {
                    C13767g.m40635d().mo40606a(4, "Http2Connection.Listener failure for " + C13753g.this.f38971d, e);
                    try {
                        this.f39031b.m40537a(EnumC13748b.PROTOCOL_ERROR);
                    } catch (IOException unused) {
                    }
                }
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.http2.g$l$b */
        /* JADX INFO: compiled from: Http2Connection.java */
        class b extends AbstractRunnableC13722b {

            /* JADX INFO: renamed from: b */
            final /* synthetic */ boolean f39033b;

            /* JADX INFO: renamed from: c */
            final /* synthetic */ C13759m f39034c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(String str, Object[] objArr, boolean z, C13759m c13759m) {
                super(str, objArr);
                this.f39033b = z;
                this.f39034c = c13759m;
            }

            @Override // com.mbridge.msdk.thrid.okhttp.internal.AbstractRunnableC13722b
            /* JADX INFO: renamed from: b */
            public void mo40263b() {
                l.this.m40515b(this.f39033b, this.f39034c);
            }
        }

        /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.http2.g$l$c */
        /* JADX INFO: compiled from: Http2Connection.java */
        class c extends AbstractRunnableC13722b {
            c(String str, Object... objArr) {
                super(str, objArr);
            }

            @Override // com.mbridge.msdk.thrid.okhttp.internal.AbstractRunnableC13722b
            /* JADX INFO: renamed from: b */
            public void mo40263b() {
                C13753g c13753g = C13753g.this;
                c13753g.f38969b.mo40325a(c13753g);
            }
        }

        l(C13754h c13754h) {
            super("OkHttp %s", C13753g.this.f38971d);
            this.f39029b = c13754h;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.C13754h.b
        /* JADX INFO: renamed from: a */
        public void mo40505a() {
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.C13754h.b
        /* JADX INFO: renamed from: a */
        public void mo40506a(int i, int i2, int i3, boolean z) {
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.C13754h.b
        /* JADX INFO: renamed from: a */
        public void mo40507a(int i, int i2, List<C13749c> list) throws Throwable {
            C13753g.this.m40485a(i2, list);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.C13754h.b
        /* JADX INFO: renamed from: a */
        public void mo40508a(int i, long j) {
            if (i == 0) {
                synchronized (C13753g.this) {
                    C13753g c13753g = C13753g.this;
                    c13753g.f38986s += j;
                    c13753g.notifyAll();
                }
                return;
            }
            C13755i c13755iM40480a = C13753g.this.m40480a(i);
            if (c13755iM40480a != null) {
                synchronized (c13755iM40480a) {
                    c13755iM40480a.m40536a(j);
                }
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.C13754h.b
        /* JADX INFO: renamed from: a */
        public void mo40509a(int i, EnumC13748b enumC13748b) {
            if (C13753g.this.m40493b(i)) {
                C13753g.this.m40483a(i, enumC13748b);
                return;
            }
            C13755i c13755iM40494c = C13753g.this.m40494c(i);
            if (c13755iM40494c != null) {
                c13755iM40494c.m40544d(enumC13748b);
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.C13754h.b
        /* JADX INFO: renamed from: a */
        public void mo40510a(int i, EnumC13748b enumC13748b, C13796f c13796f) {
            C13755i[] c13755iArr;
            c13796f.mo40923j();
            synchronized (C13753g.this) {
                c13755iArr = (C13755i[]) C13753g.this.f38970c.values().toArray(new C13755i[C13753g.this.f38970c.size()]);
                C13753g.this.f38974g = true;
            }
            for (C13755i c13755i : c13755iArr) {
                if (c13755i.m40541c() > i && c13755i.m40546f()) {
                    c13755i.m40544d(EnumC13748b.REFUSED_STREAM);
                    C13753g.this.m40494c(c13755i.m40541c());
                }
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.C13754h.b
        /* JADX INFO: renamed from: a */
        public void mo40511a(boolean z, int i, int i2) {
            if (!z) {
                try {
                    C13753g.this.f38975h.execute(C13753g.this.new k(true, i, i2));
                    return;
                } catch (RejectedExecutionException unused) {
                    return;
                }
            }
            synchronized (C13753g.this) {
                try {
                    if (i == 1) {
                        C13753g.m40471c(C13753g.this);
                    } else if (i == 2) {
                        C13753g.m40477h(C13753g.this);
                    } else if (i == 3) {
                        C13753g.m40479i(C13753g.this);
                        C13753g.this.notifyAll();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.C13754h.b
        /* JADX INFO: renamed from: a */
        public void mo40512a(boolean z, int i, int i2, List<C13749c> list) {
            if (C13753g.this.m40493b(i)) {
                C13753g.this.m40492b(i, list, z);
                return;
            }
            synchronized (C13753g.this) {
                C13755i c13755iM40480a = C13753g.this.m40480a(i);
                if (c13755iM40480a != null) {
                    c13755iM40480a.m40539a(list);
                    if (z) {
                        c13755iM40480a.m40549i();
                        return;
                    }
                    return;
                }
                if (C13753g.this.f38974g) {
                    return;
                }
                C13753g c13753g = C13753g.this;
                if (i <= c13753g.f38972e) {
                    return;
                }
                if (i % 2 == c13753g.f38973f % 2) {
                    return;
                }
                C13755i c13755i = new C13755i(i, C13753g.this, false, z, C13723c.m40292b(list));
                C13753g c13753g2 = C13753g.this;
                c13753g2.f38972e = i;
                c13753g2.f38970c.put(Integer.valueOf(i), c13755i);
                C13753g.f38967z.execute(new a("OkHttp %s stream %d", new Object[]{C13753g.this.f38971d, Integer.valueOf(i)}, c13755i));
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.C13754h.b
        /* JADX INFO: renamed from: a */
        public void mo40513a(boolean z, int i, InterfaceC13795e interfaceC13795e, int i2) throws IOException {
            if (C13753g.this.m40493b(i)) {
                C13753g.this.m40484a(i, interfaceC13795e, i2, z);
                return;
            }
            C13755i c13755iM40480a = C13753g.this.m40480a(i);
            if (c13755iM40480a == null) {
                C13753g.this.m40495c(i, EnumC13748b.PROTOCOL_ERROR);
                long j = i2;
                C13753g.this.m40497g(j);
                interfaceC13795e.skip(j);
                return;
            }
            c13755iM40480a.m40538a(interfaceC13795e, i2);
            if (z) {
                c13755iM40480a.m40549i();
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.http2.C13754h.b
        /* JADX INFO: renamed from: a */
        public void mo40514a(boolean z, C13759m c13759m) {
            try {
                C13753g.this.f38975h.execute(new b("OkHttp %s ACK Settings", new Object[]{C13753g.this.f38971d}, z, c13759m));
            } catch (RejectedExecutionException unused) {
            }
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.AbstractRunnableC13722b
        /* JADX INFO: renamed from: b */
        protected void mo40263b() throws Throwable {
            Throwable th;
            EnumC13748b enumC13748b;
            EnumC13748b enumC13748b2 = EnumC13748b.INTERNAL_ERROR;
            try {
                try {
                    this.f39029b.m40529a(this);
                    while (this.f39029b.m40530a(false, (C13754h.b) this)) {
                    }
                    enumC13748b = EnumC13748b.NO_ERROR;
                    try {
                        try {
                            C13753g.this.m40488a(enumC13748b, EnumC13748b.CANCEL);
                        } catch (IOException unused) {
                            EnumC13748b enumC13748b3 = EnumC13748b.PROTOCOL_ERROR;
                            C13753g.this.m40488a(enumC13748b3, enumC13748b3);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            C13753g.this.m40488a(enumC13748b, enumC13748b2);
                        } catch (IOException unused2) {
                        }
                        C13723c.m40282a(this.f39029b);
                        throw th;
                    }
                } catch (IOException unused3) {
                }
            } catch (IOException unused4) {
                enumC13748b = enumC13748b2;
            } catch (Throwable th3) {
                th = th3;
                enumC13748b = enumC13748b2;
                C13753g.this.m40488a(enumC13748b, enumC13748b2);
                C13723c.m40282a(this.f39029b);
                throw th;
            }
            C13723c.m40282a(this.f39029b);
        }

        /* JADX INFO: renamed from: b */
        void m40515b(boolean z, C13759m c13759m) {
            C13755i[] c13755iArr;
            long j;
            synchronized (C13753g.this.f38990w) {
                synchronized (C13753g.this) {
                    int iM40591c = C13753g.this.f38988u.m40591c();
                    if (z) {
                        C13753g.this.f38988u.m40587a();
                    }
                    C13753g.this.f38988u.m40588a(c13759m);
                    int iM40591c2 = C13753g.this.f38988u.m40591c();
                    c13755iArr = null;
                    if (iM40591c2 == -1 || iM40591c2 == iM40591c) {
                        j = 0;
                    } else {
                        j = iM40591c2 - iM40591c;
                        if (!C13753g.this.f38970c.isEmpty()) {
                            c13755iArr = (C13755i[]) C13753g.this.f38970c.values().toArray(new C13755i[C13753g.this.f38970c.size()]);
                        }
                    }
                }
                try {
                    C13753g c13753g = C13753g.this;
                    c13753g.f38990w.m40567a(c13753g.f38988u);
                } catch (IOException unused) {
                    C13753g.this.m40478h();
                }
            }
            if (c13755iArr != null) {
                for (C13755i c13755i : c13755iArr) {
                    synchronized (c13755i) {
                        c13755i.m40536a(j);
                    }
                }
            }
            C13753g.f38967z.execute(new c("OkHttp %s settings", C13753g.this.f38971d));
        }
    }

    C13753g(h hVar) {
        C13759m c13759m = new C13759m();
        this.f38988u = c13759m;
        this.f38992y = new LinkedHashSet();
        this.f38977j = hVar.f39020f;
        boolean z = hVar.f39021g;
        this.f38968a = z;
        this.f38969b = hVar.f39019e;
        int i2 = z ? 1 : 2;
        this.f38973f = i2;
        if (z) {
            this.f38973f = i2 + 2;
        }
        if (z) {
            this.f38987t.m40586a(7, 16777216);
        }
        String str = hVar.f39016b;
        this.f38971d = str;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, C13723c.m40279a(C13723c.m40272a("OkHttp %s Writer", str), false));
        this.f38975h = scheduledThreadPoolExecutor;
        if (hVar.f39022h != 0) {
            i iVar = new i();
            long j2 = hVar.f39022h;
            scheduledThreadPoolExecutor.scheduleAtFixedRate(iVar, j2, j2, TimeUnit.MILLISECONDS);
        }
        this.f38976i = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), C13723c.m40279a(C13723c.m40272a("OkHttp %s Push Observer", str), true));
        c13759m.m40586a(7, 65535);
        c13759m.m40586a(5, 16384);
        this.f38986s = c13759m.m40591c();
        this.f38989v = hVar.f39015a;
        this.f38990w = new C13756j(hVar.f39018d, z);
        this.f38991x = new l(new C13754h(hVar.f39017c, z));
    }

    /* JADX INFO: renamed from: a */
    private C13755i m40466a(int i2, List<C13749c> list, boolean z) throws Throwable {
        Throwable th;
        boolean z2 = !z;
        synchronized (this.f38990w) {
            try {
                try {
                    try {
                        synchronized (this) {
                            try {
                                if (this.f38973f > 1073741823) {
                                    try {
                                        m40487a(EnumC13748b.REFUSED_STREAM);
                                    } catch (Throwable th2) {
                                        th = th2;
                                    }
                                }
                                if (this.f38974g) {
                                    throw new C13747a();
                                }
                                int i3 = this.f38973f;
                                this.f38973f = i3 + 2;
                                C13755i c13755i = new C13755i(i3, this, z2, false, null);
                                boolean z3 = !z || this.f38986s == 0 || c13755i.f39050b == 0;
                                if (c13755i.m40547g()) {
                                    this.f38970c.put(Integer.valueOf(i3), c13755i);
                                }
                                if (i2 == 0) {
                                    this.f38990w.m40569a(z2, i3, i2, list);
                                } else {
                                    if (this.f38968a) {
                                        throw new IllegalArgumentException("client streams shouldn't have associated stream IDs");
                                    }
                                    this.f38990w.m40563a(i2, i3, list);
                                }
                                if (z3) {
                                    this.f38990w.flush();
                                }
                                return c13755i;
                            } catch (Throwable th3) {
                                th = th3;
                                th = th;
                            }
                            throw th;
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        throw th;
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    private synchronized void m40467a(AbstractRunnableC13722b abstractRunnableC13722b) {
        if (!this.f38974g) {
            this.f38976i.execute(abstractRunnableC13722b);
        }
    }

    /* JADX INFO: renamed from: c */
    static /* synthetic */ long m40471c(C13753g c13753g) {
        long j2 = c13753g.f38979l;
        c13753g.f38979l = 1 + j2;
        return j2;
    }

    /* JADX INFO: renamed from: e */
    static /* synthetic */ long m40474e(C13753g c13753g) {
        long j2 = c13753g.f38978k;
        c13753g.f38978k = 1 + j2;
        return j2;
    }

    /* JADX INFO: renamed from: h */
    static /* synthetic */ long m40477h(C13753g c13753g) {
        long j2 = c13753g.f38981n;
        c13753g.f38981n = 1 + j2;
        return j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public void m40478h() {
        try {
            EnumC13748b enumC13748b = EnumC13748b.PROTOCOL_ERROR;
            m40488a(enumC13748b, enumC13748b);
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: i */
    static /* synthetic */ long m40479i(C13753g c13753g) {
        long j2 = c13753g.f38983p;
        c13753g.f38983p = 1 + j2;
        return j2;
    }

    /* JADX INFO: renamed from: a */
    synchronized C13755i m40480a(int i2) {
        return this.f38970c.get(Integer.valueOf(i2));
    }

    /* JADX INFO: renamed from: a */
    public C13755i m40481a(List<C13749c> list, boolean z) throws IOException {
        return m40466a(0, list, z);
    }

    /* JADX INFO: renamed from: a */
    void m40482a(int i2, long j2) {
        try {
            this.f38975h.execute(new b("OkHttp Window Update %s stream %d", new Object[]{this.f38971d, Integer.valueOf(i2)}, i2, j2));
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX INFO: renamed from: a */
    void m40483a(int i2, EnumC13748b enumC13748b) {
        m40467a(new g("OkHttp %s Push Reset[%s]", new Object[]{this.f38971d, Integer.valueOf(i2)}, i2, enumC13748b));
    }

    /* JADX INFO: renamed from: a */
    void m40484a(int i2, InterfaceC13795e interfaceC13795e, int i3, boolean z) throws IOException {
        C13793c c13793c = new C13793c();
        long j2 = i3;
        interfaceC13795e.mo40889e(j2);
        interfaceC13795e.mo40427b(c13793c, j2);
        if (c13793c.size() == j2) {
            m40467a(new f("OkHttp %s Push Data[%s]", new Object[]{this.f38971d, Integer.valueOf(i2)}, i2, c13793c, i3, z));
            return;
        }
        throw new IOException(c13793c.size() + " != " + i3);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:23:0x0046
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX INFO: renamed from: a */
    void m40485a(int r9, java.util.List<com.mbridge.msdk.thrid.okhttp.internal.http2.C13749c> r10) throws java.lang.Throwable {
        /*
            r8 = this;
            monitor-enter(r8)
            java.util.Set<java.lang.Integer> r0 = r8.f38992y     // Catch: java.lang.Throwable -> L41
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L41
            boolean r0 = r0.contains(r1)     // Catch: java.lang.Throwable -> L41
            if (r0 == 0) goto L18
            com.mbridge.msdk.thrid.okhttp.internal.http2.b r10 = com.mbridge.msdk.thrid.okhttp.internal.http2.EnumC13748b.PROTOCOL_ERROR     // Catch: java.lang.Throwable -> L14
            r8.m40495c(r9, r10)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L14
            return
        L14:
            r0 = move-exception
            r9 = r0
            r3 = r8
            goto L44
        L18:
            java.util.Set<java.lang.Integer> r0 = r8.f38992y     // Catch: java.lang.Throwable -> L41
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L41
            r0.add(r1)     // Catch: java.lang.Throwable -> L41
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L41
            com.mbridge.msdk.thrid.okhttp.internal.http2.g$d r2 = new com.mbridge.msdk.thrid.okhttp.internal.http2.g$d     // Catch: java.util.concurrent.RejectedExecutionException -> L3f
            java.lang.String r4 = "OkHttp %s Push Request[%s]"
            java.lang.String r0 = r8.f38971d     // Catch: java.util.concurrent.RejectedExecutionException -> L3f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)     // Catch: java.util.concurrent.RejectedExecutionException -> L3f
            r3 = 2
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch: java.util.concurrent.RejectedExecutionException -> L3f
            r3 = 0
            r5[r3] = r0     // Catch: java.util.concurrent.RejectedExecutionException -> L3f
            r0 = 1
            r5[r0] = r1     // Catch: java.util.concurrent.RejectedExecutionException -> L3f
            r3 = r8
            r6 = r9
            r7 = r10
            r2.<init>(r4, r5, r6, r7)     // Catch: java.util.concurrent.RejectedExecutionException -> L40
            r8.m40467a(r2)     // Catch: java.util.concurrent.RejectedExecutionException -> L40
            return
        L3f:
            r3 = r8
        L40:
            return
        L41:
            r0 = move-exception
            r3 = r8
        L43:
            r9 = r0
        L44:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L46
            throw r9
        L46:
            r0 = move-exception
            goto L43
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okhttp.internal.http2.C13753g.m40485a(int, java.util.List):void");
    }

    /* JADX INFO: renamed from: a */
    public void m40486a(int i2, boolean z, C13793c c13793c, long j2) throws IOException {
        long j3;
        int iMin;
        long j4;
        if (j2 == 0) {
            this.f38990w.m40570a(z, i2, c13793c, 0);
            return;
        }
        while (j2 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        j3 = this.f38986s;
                        if (j3 <= 0) {
                            if (!this.f38970c.containsKey(Integer.valueOf(i2))) {
                                throw new IOException("stream closed");
                            }
                            wait();
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
                iMin = Math.min((int) Math.min(j2, j3), this.f38990w.m40574h());
                j4 = iMin;
                this.f38986s -= j4;
            }
            j2 -= j4;
            this.f38990w.m40570a(z && j2 == 0, i2, c13793c, iMin);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m40487a(EnumC13748b enumC13748b) throws IOException {
        synchronized (this.f38990w) {
            synchronized (this) {
                if (this.f38974g) {
                    return;
                }
                this.f38974g = true;
                this.f38990w.m40566a(this.f38972e, enumC13748b, C13723c.f38771a);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    void m40488a(EnumC13748b enumC13748b, EnumC13748b enumC13748b2) throws IOException {
        if (!f38966A && Thread.holdsLock(this)) {
            throw new AssertionError();
        }
        C13755i[] c13755iArr = null;
        try {
            m40487a(enumC13748b);
            e = null;
        } catch (IOException e2) {
            e = e2;
        }
        synchronized (this) {
            if (!this.f38970c.isEmpty()) {
                c13755iArr = (C13755i[]) this.f38970c.values().toArray(new C13755i[this.f38970c.size()]);
                this.f38970c.clear();
            }
        }
        if (c13755iArr != null) {
            for (C13755i c13755i : c13755iArr) {
                try {
                    c13755i.m40537a(enumC13748b2);
                } catch (IOException e3) {
                    if (e != null) {
                        e = e3;
                    }
                }
            }
        }
        try {
            this.f38990w.close();
        } catch (IOException e4) {
            if (e == null) {
                e = e4;
            }
        }
        try {
            this.f38989v.close();
        } catch (IOException e5) {
            e = e5;
        }
        this.f38975h.shutdown();
        this.f38976i.shutdown();
        if (e != null) {
            throw e;
        }
    }

    /* JADX INFO: renamed from: a */
    void m40489a(boolean z) throws IOException {
        if (z) {
            this.f38990w.m40573d();
            this.f38990w.m40572b(this.f38987t);
            int iM40591c = this.f38987t.m40591c();
            if (iM40591c != 65535) {
                this.f38990w.m40564a(0, iM40591c - 65535);
            }
        }
        new Thread(this.f38991x).start();
    }

    /* JADX INFO: renamed from: a */
    void m40490a(boolean z, int i2, int i3) {
        try {
            this.f38990w.m40568a(z, i2, i3);
        } catch (IOException unused) {
            m40478h();
        }
    }

    /* JADX INFO: renamed from: b */
    void m40491b(int i2, EnumC13748b enumC13748b) throws IOException {
        this.f38990w.m40565a(i2, enumC13748b);
    }

    /* JADX INFO: renamed from: b */
    void m40492b(int i2, List<C13749c> list, boolean z) {
        try {
            try {
                m40467a(new e("OkHttp %s Push Headers[%s]", new Object[]{this.f38971d, Integer.valueOf(i2)}, i2, list, z));
            } catch (RejectedExecutionException unused) {
            }
        } catch (RejectedExecutionException unused2) {
        }
    }

    /* JADX INFO: renamed from: b */
    boolean m40493b(int i2) {
        return i2 != 0 && (i2 & 1) == 0;
    }

    /* JADX INFO: renamed from: c */
    synchronized C13755i m40494c(int i2) {
        C13755i c13755iRemove;
        c13755iRemove = this.f38970c.remove(Integer.valueOf(i2));
        notifyAll();
        return c13755iRemove;
    }

    /* JADX INFO: renamed from: c */
    void m40495c(int i2, EnumC13748b enumC13748b) {
        try {
            this.f38975h.execute(new a("OkHttp %s stream %d", new Object[]{this.f38971d, Integer.valueOf(i2)}, i2, enumC13748b));
        } catch (RejectedExecutionException unused) {
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        m40488a(EnumC13748b.NO_ERROR, EnumC13748b.CANCEL);
    }

    /* JADX INFO: renamed from: f */
    public synchronized boolean m40496f(long j2) {
        if (this.f38974g) {
            return false;
        }
        return this.f38981n >= this.f38980m || j2 < this.f38984q;
    }

    public void flush() throws IOException {
        this.f38990w.flush();
    }

    /* JADX INFO: renamed from: g */
    synchronized void m40497g(long j2) {
        long j3 = this.f38985r + j2;
        this.f38985r = j3;
        if (j3 >= this.f38987t.m40591c() / 2) {
            m40482a(0, this.f38985r);
            this.f38985r = 0L;
        }
    }

    /* JADX INFO: renamed from: k */
    public synchronized int m40498k() {
        return this.f38988u.m40590b(Integer.MAX_VALUE);
    }

    /* JADX INFO: renamed from: l */
    void m40499l() {
        synchronized (this) {
            long j2 = this.f38981n;
            long j3 = this.f38980m;
            if (j2 < j3) {
                return;
            }
            this.f38980m = j3 + 1;
            this.f38984q = System.nanoTime() + 1000000000;
            try {
                this.f38975h.execute(new c("OkHttp %s ping", this.f38971d));
            } catch (RejectedExecutionException unused) {
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public void m40500m() throws IOException {
        m40489a(true);
    }
}
