package com.mbridge.msdk.thrid.okhttp.internal.connection;

import com.facebook.internal.security.CertificateUtil;
import com.mbridge.msdk.thrid.okhttp.AbstractC13779o;
import com.mbridge.msdk.thrid.okhttp.C13708a;
import com.mbridge.msdk.thrid.okhttp.C13713c0;
import com.mbridge.msdk.thrid.okhttp.C13783s;
import com.mbridge.msdk.thrid.okhttp.InterfaceC13714d;
import com.mbridge.msdk.thrid.okhttp.internal.C13723c;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.connection.f */
/* JADX INFO: compiled from: RouteSelector.java */
/* JADX INFO: loaded from: classes7.dex */
public final class C13732f {

    /* JADX INFO: renamed from: a */
    private final C13708a f38828a;

    /* JADX INFO: renamed from: b */
    private final C13730d f38829b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC13714d f38830c;

    /* JADX INFO: renamed from: d */
    private final AbstractC13779o f38831d;

    /* JADX INFO: renamed from: f */
    private int f38833f;

    /* JADX INFO: renamed from: e */
    private List<Proxy> f38832e = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: g */
    private List<InetSocketAddress> f38834g = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: h */
    private final List<C13713c0> f38835h = new ArrayList();

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.connection.f$a */
    /* JADX INFO: compiled from: RouteSelector.java */
    public static final class a {

        /* JADX INFO: renamed from: a */
        private final List<C13713c0> f38836a;

        /* JADX INFO: renamed from: b */
        private int f38837b = 0;

        a(List<C13713c0> list) {
            this.f38836a = list;
        }

        /* JADX INFO: renamed from: a */
        public List<C13713c0> m40347a() {
            return new ArrayList(this.f38836a);
        }

        /* JADX INFO: renamed from: b */
        public boolean m40348b() {
            return this.f38837b < this.f38836a.size();
        }

        /* JADX INFO: renamed from: c */
        public C13713c0 m40349c() {
            if (!m40348b()) {
                throw new NoSuchElementException();
            }
            List<C13713c0> list = this.f38836a;
            int i = this.f38837b;
            this.f38837b = i + 1;
            return list.get(i);
        }
    }

    public C13732f(C13708a c13708a, C13730d c13730d, InterfaceC13714d interfaceC13714d, AbstractC13779o abstractC13779o) {
        this.f38828a = c13708a;
        this.f38829b = c13730d;
        this.f38830c = interfaceC13714d;
        this.f38831d = abstractC13779o;
        m40340a(c13708a.m40164k(), c13708a.m40159f());
    }

    /* JADX INFO: renamed from: a */
    static String m40339a(InetSocketAddress inetSocketAddress) {
        InetAddress address = inetSocketAddress.getAddress();
        return address == null ? inetSocketAddress.getHostName() : address.getHostAddress();
    }

    /* JADX INFO: renamed from: a */
    private void m40340a(C13783s c13783s, Proxy proxy) {
        if (proxy != null) {
            this.f38832e = Collections.singletonList(proxy);
        } else {
            List<Proxy> listSelect = this.f38828a.m40161h().select(c13783s.m40745n());
            this.f38832e = (listSelect == null || listSelect.isEmpty()) ? C13723c.m40277a(Proxy.NO_PROXY) : C13723c.m40276a(listSelect);
        }
        this.f38833f = 0;
    }

    /* JADX INFO: renamed from: a */
    private void m40341a(Proxy proxy) throws IOException {
        String strM40738g;
        int iM40741j;
        this.f38834g = new ArrayList();
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            strM40738g = this.f38828a.m40164k().m40738g();
            iM40741j = this.f38828a.m40164k().m40741j();
        } else {
            SocketAddress socketAddressAddress = proxy.address();
            if (!(socketAddressAddress instanceof InetSocketAddress)) {
                throw new IllegalArgumentException("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass());
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
            strM40738g = m40339a(inetSocketAddress);
            iM40741j = inetSocketAddress.getPort();
        }
        if (iM40741j < 1 || iM40741j > 65535) {
            throw new SocketException("No route to " + strM40738g + CertificateUtil.DELIMITER + iM40741j + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            this.f38834g.add(InetSocketAddress.createUnresolved(strM40738g, iM40741j));
            return;
        }
        this.f38831d.dnsStart(this.f38830c, strM40738g);
        List<InetAddress> listMo40689a = this.f38828a.m40156c().mo40689a(strM40738g);
        if (listMo40689a.isEmpty()) {
            throw new UnknownHostException(this.f38828a.m40156c() + " returned no addresses for " + strM40738g);
        }
        this.f38831d.dnsEnd(this.f38830c, strM40738g, listMo40689a);
        int size = listMo40689a.size();
        for (int i = 0; i < size; i++) {
            this.f38834g.add(new InetSocketAddress(listMo40689a.get(i), iM40741j));
        }
    }

    /* JADX INFO: renamed from: b */
    private boolean m40342b() {
        return this.f38833f < this.f38832e.size();
    }

    /* JADX INFO: renamed from: d */
    private Proxy m40343d() throws IOException {
        if (!m40342b()) {
            throw new SocketException("No route to " + this.f38828a.m40164k().m40738g() + "; exhausted proxy configurations: " + this.f38832e);
        }
        List<Proxy> list = this.f38832e;
        int i = this.f38833f;
        this.f38833f = i + 1;
        Proxy proxy = list.get(i);
        m40341a(proxy);
        return proxy;
    }

    /* JADX INFO: renamed from: a */
    public void m40344a(C13713c0 c13713c0, IOException iOException) {
        if (c13713c0.m40221b().type() != Proxy.Type.DIRECT && this.f38828a.m40161h() != null) {
            this.f38828a.m40161h().connectFailed(this.f38828a.m40164k().m40745n(), c13713c0.m40221b().address(), iOException);
        }
        this.f38829b.m40334b(c13713c0);
    }

    /* JADX INFO: renamed from: a */
    public boolean m40345a() {
        return m40342b() || !this.f38835h.isEmpty();
    }

    /* JADX INFO: renamed from: c */
    public a m40346c() throws IOException {
        if (!m40345a()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (m40342b()) {
            Proxy proxyM40343d = m40343d();
            int size = this.f38834g.size();
            for (int i = 0; i < size; i++) {
                C13713c0 c13713c0 = new C13713c0(this.f38828a, proxyM40343d, this.f38834g.get(i));
                if (this.f38829b.m40335c(c13713c0)) {
                    this.f38835h.add(c13713c0);
                } else {
                    arrayList.add(c13713c0);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.addAll(this.f38835h);
            this.f38835h.clear();
        }
        return new a(arrayList);
    }
}
