package com.mbridge.msdk.thrid.okhttp;

import com.mbridge.msdk.thrid.okhttp.internal.AbstractC13721a;
import com.mbridge.msdk.thrid.okhttp.internal.C13723c;
import com.mbridge.msdk.thrid.okhttp.internal.cache.InterfaceC13726c;
import com.mbridge.msdk.thrid.okhttp.internal.connection.C13729c;
import com.mbridge.msdk.thrid.okhttp.internal.connection.C13730d;
import com.mbridge.msdk.thrid.okhttp.internal.connection.C13733g;
import com.mbridge.msdk.thrid.okhttp.internal.platform.C13767g;
import com.mbridge.msdk.thrid.okhttp.internal.proxy.C13768a;
import com.mbridge.msdk.thrid.okhttp.internal.tls.AbstractC13771c;
import com.mbridge.msdk.thrid.okhttp.internal.tls.C13772d;
import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.v */
/* JADX INFO: compiled from: OkHttpClient.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13786v implements Cloneable {

    /* JADX INFO: renamed from: A */
    static final List<EnumC13787w> f39204A = C13723c.m40277a(EnumC13787w.HTTP_2, EnumC13787w.HTTP_1_1);

    /* JADX INFO: renamed from: B */
    static final List<C13774j> f39205B = C13723c.m40277a(C13774j.f39133h, C13774j.f39135j);

    /* JADX INFO: renamed from: a */
    final C13777m f39206a;

    /* JADX INFO: renamed from: b */
    @Nullable
    final Proxy f39207b;

    /* JADX INFO: renamed from: c */
    final List<EnumC13787w> f39208c;

    /* JADX INFO: renamed from: d */
    final List<C13774j> f39209d;

    /* JADX INFO: renamed from: e */
    final List<InterfaceC13784t> f39210e;

    /* JADX INFO: renamed from: f */
    final List<InterfaceC13784t> f39211f;

    /* JADX INFO: renamed from: g */
    final AbstractC13779o.c f39212g;

    /* JADX INFO: renamed from: h */
    final ProxySelector f39213h;

    /* JADX INFO: renamed from: i */
    final InterfaceC13776l f39214i;

    /* JADX INFO: renamed from: j */
    final SocketFactory f39215j;

    /* JADX INFO: renamed from: k */
    final SSLSocketFactory f39216k;

    /* JADX INFO: renamed from: l */
    final AbstractC13771c f39217l;

    /* JADX INFO: renamed from: m */
    final HostnameVerifier f39218m;

    /* JADX INFO: renamed from: n */
    final C13717f f39219n;

    /* JADX INFO: renamed from: o */
    final InterfaceC13710b f39220o;

    /* JADX INFO: renamed from: p */
    final InterfaceC13710b f39221p;

    /* JADX INFO: renamed from: q */
    final C13720i f39222q;

    /* JADX INFO: renamed from: r */
    final InterfaceC13778n f39223r;

    /* JADX INFO: renamed from: s */
    final boolean f39224s;

    /* JADX INFO: renamed from: t */
    final boolean f39225t;

    /* JADX INFO: renamed from: u */
    final boolean f39226u;

    /* JADX INFO: renamed from: v */
    final int f39227v;

    /* JADX INFO: renamed from: w */
    final int f39228w;

    /* JADX INFO: renamed from: x */
    final int f39229x;

    /* JADX INFO: renamed from: y */
    final int f39230y;

    /* JADX INFO: renamed from: z */
    final int f39231z;

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.v$a */
    /* JADX INFO: compiled from: OkHttpClient.java */
    static class a extends AbstractC13721a {
        a() {
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.AbstractC13721a
        /* JADX INFO: renamed from: a */
        public int mo40252a(C13709a0.a aVar) {
            return aVar.f38583c;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.AbstractC13721a
        /* JADX INFO: renamed from: a */
        public C13729c mo40253a(C13720i c13720i, C13708a c13708a, C13733g c13733g, C13713c0 c13713c0) {
            return c13720i.m40248a(c13708a, c13733g, c13713c0);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.AbstractC13721a
        /* JADX INFO: renamed from: a */
        public C13730d mo40254a(C13720i c13720i) {
            return c13720i.f38766e;
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.AbstractC13721a
        @Nullable
        /* JADX INFO: renamed from: a */
        public IOException mo40255a(InterfaceC13714d interfaceC13714d, @Nullable IOException iOException) {
            return ((C13788x) interfaceC13714d).m40816a(iOException);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.AbstractC13721a
        /* JADX INFO: renamed from: a */
        public Socket mo40256a(C13720i c13720i, C13708a c13708a, C13733g c13733g) {
            return c13720i.m40249a(c13708a, c13733g);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.AbstractC13721a
        /* JADX INFO: renamed from: a */
        public void mo40257a(C13774j c13774j, SSLSocket sSLSocket, boolean z) {
            c13774j.m40654a(sSLSocket, z);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.AbstractC13721a
        /* JADX INFO: renamed from: a */
        public void mo40258a(C13782r.a aVar, String str) {
            aVar.m40710a(str);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.AbstractC13721a
        /* JADX INFO: renamed from: a */
        public void mo40259a(C13782r.a aVar, String str, String str2) {
            aVar.m40714b(str, str2);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.AbstractC13721a
        /* JADX INFO: renamed from: a */
        public boolean mo40260a(C13708a c13708a, C13708a c13708a2) {
            return c13708a.m40154a(c13708a2);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.AbstractC13721a
        /* JADX INFO: renamed from: a */
        public boolean mo40261a(C13720i c13720i, C13729c c13729c) {
            return c13720i.m40250a(c13729c);
        }

        @Override // com.mbridge.msdk.thrid.okhttp.internal.AbstractC13721a
        /* JADX INFO: renamed from: b */
        public void mo40262b(C13720i c13720i, C13729c c13729c) {
            c13720i.m40251b(c13729c);
        }
    }

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.v$b */
    /* JADX INFO: compiled from: OkHttpClient.java */
    public static final class b {

        /* JADX INFO: renamed from: a */
        C13777m f39232a;

        /* JADX INFO: renamed from: b */
        @Nullable
        Proxy f39233b;

        /* JADX INFO: renamed from: c */
        List<EnumC13787w> f39234c;

        /* JADX INFO: renamed from: d */
        List<C13774j> f39235d;

        /* JADX INFO: renamed from: e */
        final List<InterfaceC13784t> f39236e;

        /* JADX INFO: renamed from: f */
        final List<InterfaceC13784t> f39237f;

        /* JADX INFO: renamed from: g */
        AbstractC13779o.c f39238g;

        /* JADX INFO: renamed from: h */
        ProxySelector f39239h;

        /* JADX INFO: renamed from: i */
        InterfaceC13776l f39240i;

        /* JADX INFO: renamed from: j */
        SocketFactory f39241j;

        /* JADX INFO: renamed from: k */
        @Nullable
        SSLSocketFactory f39242k;

        /* JADX INFO: renamed from: l */
        @Nullable
        AbstractC13771c f39243l;

        /* JADX INFO: renamed from: m */
        HostnameVerifier f39244m;

        /* JADX INFO: renamed from: n */
        C13717f f39245n;

        /* JADX INFO: renamed from: o */
        InterfaceC13710b f39246o;

        /* JADX INFO: renamed from: p */
        InterfaceC13710b f39247p;

        /* JADX INFO: renamed from: q */
        C13720i f39248q;

        /* JADX INFO: renamed from: r */
        InterfaceC13778n f39249r;

        /* JADX INFO: renamed from: s */
        boolean f39250s;

        /* JADX INFO: renamed from: t */
        boolean f39251t;

        /* JADX INFO: renamed from: u */
        boolean f39252u;

        /* JADX INFO: renamed from: v */
        int f39253v;

        /* JADX INFO: renamed from: w */
        int f39254w;

        /* JADX INFO: renamed from: x */
        int f39255x;

        /* JADX INFO: renamed from: y */
        int f39256y;

        /* JADX INFO: renamed from: z */
        int f39257z;

        public b() {
            this.f39236e = new ArrayList();
            this.f39237f = new ArrayList();
            this.f39232a = new C13777m();
            this.f39234c = C13786v.f39204A;
            this.f39235d = C13786v.f39205B;
            this.f39238g = AbstractC13779o.factory(AbstractC13779o.NONE);
            ProxySelector proxySelector = ProxySelector.getDefault();
            this.f39239h = proxySelector;
            if (proxySelector == null) {
                this.f39239h = new C13768a();
            }
            this.f39240i = InterfaceC13776l.f39157a;
            this.f39241j = SocketFactory.getDefault();
            this.f39244m = C13772d.f39129a;
            this.f39245n = C13717f.f38630c;
            InterfaceC13710b interfaceC13710b = InterfaceC13710b.f38593a;
            this.f39246o = interfaceC13710b;
            this.f39247p = interfaceC13710b;
            this.f39248q = new C13720i();
            this.f39249r = InterfaceC13778n.f39166a;
            this.f39250s = true;
            this.f39251t = true;
            this.f39252u = true;
            this.f39253v = 0;
            this.f39254w = 10000;
            this.f39255x = 10000;
            this.f39256y = 10000;
            this.f39257z = 0;
        }

        b(C13786v c13786v) {
            ArrayList arrayList = new ArrayList();
            this.f39236e = arrayList;
            ArrayList arrayList2 = new ArrayList();
            this.f39237f = arrayList2;
            this.f39232a = c13786v.f39206a;
            this.f39233b = c13786v.f39207b;
            this.f39234c = c13786v.f39208c;
            this.f39235d = c13786v.f39209d;
            arrayList.addAll(c13786v.f39210e);
            arrayList2.addAll(c13786v.f39211f);
            this.f39238g = c13786v.f39212g;
            this.f39239h = c13786v.f39213h;
            this.f39240i = c13786v.f39214i;
            this.f39241j = c13786v.f39215j;
            this.f39242k = c13786v.f39216k;
            this.f39243l = c13786v.f39217l;
            this.f39244m = c13786v.f39218m;
            this.f39245n = c13786v.f39219n;
            this.f39246o = c13786v.f39220o;
            this.f39247p = c13786v.f39221p;
            this.f39248q = c13786v.f39222q;
            this.f39249r = c13786v.f39223r;
            this.f39250s = c13786v.f39224s;
            this.f39251t = c13786v.f39225t;
            this.f39252u = c13786v.f39226u;
            this.f39253v = c13786v.f39227v;
            this.f39254w = c13786v.f39228w;
            this.f39255x = c13786v.f39229x;
            this.f39256y = c13786v.f39230y;
            this.f39257z = c13786v.f39231z;
        }

        /* JADX INFO: renamed from: a */
        public b m40798a(long j, TimeUnit timeUnit) {
            this.f39253v = C13723c.m40267a("timeout", j, timeUnit);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public b m40799a(C13720i c13720i) {
            if (c13720i == null) {
                throw new NullPointerException("connectionPool == null");
            }
            this.f39248q = c13720i;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public b m40800a(C13777m c13777m) {
            if (c13777m == null) {
                throw new IllegalArgumentException("dispatcher == null");
            }
            this.f39232a = c13777m;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public b m40801a(InterfaceC13778n interfaceC13778n) {
            if (interfaceC13778n == null) {
                throw new NullPointerException("dns == null");
            }
            this.f39249r = interfaceC13778n;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public b m40802a(AbstractC13779o abstractC13779o) {
            if (abstractC13779o == null) {
                throw new NullPointerException("eventListener == null");
            }
            this.f39238g = AbstractC13779o.factory(abstractC13779o);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public b m40803a(List<EnumC13787w> list) {
            ArrayList arrayList = new ArrayList(list);
            EnumC13787w enumC13787w = EnumC13787w.H2_PRIOR_KNOWLEDGE;
            if (!arrayList.contains(enumC13787w) && !arrayList.contains(EnumC13787w.HTTP_1_1)) {
                throw new IllegalArgumentException("protocols must contain h2_prior_knowledge or http/1.1: " + arrayList);
            }
            if (arrayList.contains(enumC13787w) && arrayList.size() > 1) {
                throw new IllegalArgumentException("protocols containing h2_prior_knowledge cannot use other protocols: " + arrayList);
            }
            if (arrayList.contains(EnumC13787w.HTTP_1_0)) {
                throw new IllegalArgumentException("protocols must not contain http/1.0: " + arrayList);
            }
            if (arrayList.contains(null)) {
                throw new IllegalArgumentException("protocols must not contain null");
            }
            arrayList.remove(EnumC13787w.SPDY_3);
            this.f39234c = Collections.unmodifiableList(arrayList);
            return this;
        }

        /* JADX INFO: renamed from: a */
        public b m40804a(HostnameVerifier hostnameVerifier) {
            if (hostnameVerifier == null) {
                throw new NullPointerException("hostnameVerifier == null");
            }
            this.f39244m = hostnameVerifier;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public b m40805a(boolean z) {
            this.f39251t = z;
            return this;
        }

        /* JADX INFO: renamed from: a */
        public C13786v m40806a() {
            return new C13786v(this);
        }

        /* JADX INFO: renamed from: b */
        public b m40807b(long j, TimeUnit timeUnit) {
            this.f39254w = C13723c.m40267a("timeout", j, timeUnit);
            return this;
        }

        /* JADX INFO: renamed from: b */
        public b m40808b(boolean z) {
            this.f39252u = z;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public b m40809c(long j, TimeUnit timeUnit) {
            this.f39257z = C13723c.m40267a("interval", j, timeUnit);
            return this;
        }

        /* JADX INFO: renamed from: d */
        public b m40810d(long j, TimeUnit timeUnit) {
            this.f39255x = C13723c.m40267a("timeout", j, timeUnit);
            return this;
        }

        /* JADX INFO: renamed from: e */
        public b m40811e(long j, TimeUnit timeUnit) {
            this.f39256y = C13723c.m40267a("timeout", j, timeUnit);
            return this;
        }
    }

    static {
        AbstractC13721a.f38769a = new a();
    }

    public C13786v() {
        this(new b());
    }

    C13786v(b bVar) {
        boolean z;
        this.f39206a = bVar.f39232a;
        this.f39207b = bVar.f39233b;
        this.f39208c = bVar.f39234c;
        List<C13774j> list = bVar.f39235d;
        this.f39209d = list;
        this.f39210e = C13723c.m40276a(bVar.f39236e);
        this.f39211f = C13723c.m40276a(bVar.f39237f);
        this.f39212g = bVar.f39238g;
        this.f39213h = bVar.f39239h;
        this.f39214i = bVar.f39240i;
        this.f39215j = bVar.f39241j;
        Iterator<C13774j> it = list.iterator();
        loop0: while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                } else {
                    z = (z || it.next().m40656b()) ? true : z;
                }
            }
        }
        SSLSocketFactory sSLSocketFactory = bVar.f39242k;
        if (sSLSocketFactory == null && z) {
            X509TrustManager x509TrustManagerM40280a = C13723c.m40280a();
            this.f39216k = m40769a(x509TrustManagerM40280a);
            this.f39217l = AbstractC13771c.m40645a(x509TrustManagerM40280a);
        } else {
            this.f39216k = sSLSocketFactory;
            this.f39217l = bVar.f39243l;
        }
        if (this.f39216k != null) {
            C13767g.m40635d().mo40619a(this.f39216k);
        }
        this.f39218m = bVar.f39244m;
        this.f39219n = bVar.f39245n.m40233a(this.f39217l);
        this.f39220o = bVar.f39246o;
        this.f39221p = bVar.f39247p;
        this.f39222q = bVar.f39248q;
        this.f39223r = bVar.f39249r;
        this.f39224s = bVar.f39250s;
        this.f39225t = bVar.f39251t;
        this.f39226u = bVar.f39252u;
        this.f39227v = bVar.f39253v;
        this.f39228w = bVar.f39254w;
        this.f39229x = bVar.f39255x;
        this.f39230y = bVar.f39256y;
        this.f39231z = bVar.f39257z;
        if (this.f39210e.contains(null)) {
            throw new IllegalStateException("Null interceptor: " + this.f39210e);
        }
        if (this.f39211f.contains(null)) {
            throw new IllegalStateException("Null network interceptor: " + this.f39211f);
        }
    }

    /* JADX INFO: renamed from: a */
    private static SSLSocketFactory m40769a(X509TrustManager x509TrustManager) {
        try {
            SSLContext sSLContextMo40611e = C13767g.m40635d().mo40611e();
            sSLContextMo40611e.init(null, new TrustManager[]{x509TrustManager}, null);
            return sSLContextMo40611e.getSocketFactory();
        } catch (GeneralSecurityException e) {
            throw C13723c.m40269a("No System TLS", (Exception) e);
        }
    }

    /* JADX INFO: renamed from: A */
    public SocketFactory m40770A() {
        return this.f39215j;
    }

    /* JADX INFO: renamed from: B */
    public SSLSocketFactory m40771B() {
        return this.f39216k;
    }

    /* JADX INFO: renamed from: C */
    public int m40772C() {
        return this.f39230y;
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC13710b m40773a() {
        return this.f39221p;
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC13714d m40774a(C13789y c13789y) {
        return C13788x.m40814a(this, c13789y, false);
    }

    /* JADX INFO: renamed from: b */
    public int m40775b() {
        return this.f39227v;
    }

    /* JADX INFO: renamed from: c */
    public C13717f m40776c() {
        return this.f39219n;
    }

    /* JADX INFO: renamed from: e */
    public int m40777e() {
        return this.f39228w;
    }

    /* JADX INFO: renamed from: f */
    public C13720i m40778f() {
        return this.f39222q;
    }

    /* JADX INFO: renamed from: g */
    public List<C13774j> m40779g() {
        return this.f39209d;
    }

    /* JADX INFO: renamed from: i */
    public InterfaceC13776l m40780i() {
        return this.f39214i;
    }

    /* JADX INFO: renamed from: j */
    public C13777m m40781j() {
        return this.f39206a;
    }

    /* JADX INFO: renamed from: k */
    public InterfaceC13778n m40782k() {
        return this.f39223r;
    }

    /* JADX INFO: renamed from: l */
    public AbstractC13779o.c m40783l() {
        return this.f39212g;
    }

    /* JADX INFO: renamed from: m */
    public boolean m40784m() {
        return this.f39225t;
    }

    /* JADX INFO: renamed from: n */
    public boolean m40785n() {
        return this.f39224s;
    }

    /* JADX INFO: renamed from: o */
    public HostnameVerifier m40786o() {
        return this.f39218m;
    }

    /* JADX INFO: renamed from: p */
    public List<InterfaceC13784t> m40787p() {
        return this.f39210e;
    }

    /* JADX INFO: renamed from: q */
    InterfaceC13726c m40788q() {
        return null;
    }

    /* JADX INFO: renamed from: r */
    public List<InterfaceC13784t> m40789r() {
        return this.f39211f;
    }

    /* JADX INFO: renamed from: s */
    public b m40790s() {
        return new b(this);
    }

    /* JADX INFO: renamed from: t */
    public int m40791t() {
        return this.f39231z;
    }

    /* JADX INFO: renamed from: u */
    public List<EnumC13787w> m40792u() {
        return this.f39208c;
    }

    @Nullable
    /* JADX INFO: renamed from: v */
    public Proxy m40793v() {
        return this.f39207b;
    }

    /* JADX INFO: renamed from: w */
    public InterfaceC13710b m40794w() {
        return this.f39220o;
    }

    /* JADX INFO: renamed from: x */
    public ProxySelector m40795x() {
        return this.f39213h;
    }

    /* JADX INFO: renamed from: y */
    public int m40796y() {
        return this.f39229x;
    }

    /* JADX INFO: renamed from: z */
    public boolean m40797z() {
        return this.f39226u;
    }
}
