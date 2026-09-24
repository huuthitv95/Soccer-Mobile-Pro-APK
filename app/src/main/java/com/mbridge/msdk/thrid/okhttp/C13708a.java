package com.mbridge.msdk.thrid.okhttp;

import androidx.webkit.ProxyConfig;
import com.facebook.internal.security.CertificateUtil;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.thrid.okhttp.internal.C13723c;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.annotation.Nullable;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.a */
/* JADX INFO: compiled from: Address.java */
/* JADX INFO: loaded from: classes7.dex */
public final class C13708a {

    /* JADX INFO: renamed from: a */
    final C13783s f38557a;

    /* JADX INFO: renamed from: b */
    final InterfaceC13778n f38558b;

    /* JADX INFO: renamed from: c */
    final SocketFactory f38559c;

    /* JADX INFO: renamed from: d */
    final InterfaceC13710b f38560d;

    /* JADX INFO: renamed from: e */
    final List<EnumC13787w> f38561e;

    /* JADX INFO: renamed from: f */
    final List<C13774j> f38562f;

    /* JADX INFO: renamed from: g */
    final ProxySelector f38563g;

    /* JADX INFO: renamed from: h */
    @Nullable
    final Proxy f38564h;

    /* JADX INFO: renamed from: i */
    @Nullable
    final SSLSocketFactory f38565i;

    /* JADX INFO: renamed from: j */
    @Nullable
    final HostnameVerifier f38566j;

    /* JADX INFO: renamed from: k */
    @Nullable
    final C13717f f38567k;

    public C13708a(String str, int i, InterfaceC13778n interfaceC13778n, SocketFactory socketFactory, @Nullable SSLSocketFactory sSLSocketFactory, @Nullable HostnameVerifier hostnameVerifier, @Nullable C13717f c13717f, InterfaceC13710b interfaceC13710b, @Nullable Proxy proxy, List<EnumC13787w> list, List<C13774j> list2, ProxySelector proxySelector) {
        this.f38557a = new C13783s.a().m40764f(sSLSocketFactory != null ? "https" : ProxyConfig.MATCH_HTTP).m40761b(str).m40756a(i).m40759a();
        if (interfaceC13778n == null) {
            throw new NullPointerException("dns == null");
        }
        this.f38558b = interfaceC13778n;
        if (socketFactory == null) {
            throw new NullPointerException("socketFactory == null");
        }
        this.f38559c = socketFactory;
        if (interfaceC13710b == null) {
            throw new NullPointerException("proxyAuthenticator == null");
        }
        this.f38560d = interfaceC13710b;
        if (list == null) {
            throw new NullPointerException("protocols == null");
        }
        this.f38561e = C13723c.m40276a(list);
        if (list2 == null) {
            throw new NullPointerException("connectionSpecs == null");
        }
        this.f38562f = C13723c.m40276a(list2);
        if (proxySelector == null) {
            throw new NullPointerException("proxySelector == null");
        }
        this.f38563g = proxySelector;
        this.f38564h = proxy;
        this.f38565i = sSLSocketFactory;
        this.f38566j = hostnameVerifier;
        this.f38567k = c13717f;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public C13717f m40153a() {
        return this.f38567k;
    }

    /* JADX INFO: renamed from: a */
    boolean m40154a(C13708a c13708a) {
        return this.f38558b.equals(c13708a.f38558b) && this.f38560d.equals(c13708a.f38560d) && this.f38561e.equals(c13708a.f38561e) && this.f38562f.equals(c13708a.f38562f) && this.f38563g.equals(c13708a.f38563g) && C13723c.m40287a(this.f38564h, c13708a.f38564h) && C13723c.m40287a(this.f38565i, c13708a.f38565i) && C13723c.m40287a(this.f38566j, c13708a.f38566j) && C13723c.m40287a(this.f38567k, c13708a.f38567k) && m40164k().m40741j() == c13708a.m40164k().m40741j();
    }

    /* JADX INFO: renamed from: b */
    public List<C13774j> m40155b() {
        return this.f38562f;
    }

    /* JADX INFO: renamed from: c */
    public InterfaceC13778n m40156c() {
        return this.f38558b;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public HostnameVerifier m40157d() {
        return this.f38566j;
    }

    /* JADX INFO: renamed from: e */
    public List<EnumC13787w> m40158e() {
        return this.f38561e;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C13708a)) {
            return false;
        }
        C13708a c13708a = (C13708a) obj;
        return this.f38557a.equals(c13708a.f38557a) && m40154a(c13708a);
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public Proxy m40159f() {
        return this.f38564h;
    }

    /* JADX INFO: renamed from: g */
    public InterfaceC13710b m40160g() {
        return this.f38560d;
    }

    /* JADX INFO: renamed from: h */
    public ProxySelector m40161h() {
        return this.f38563g;
    }

    public int hashCode() {
        int iHashCode = (((((((((((this.f38557a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f38558b.hashCode()) * 31) + this.f38560d.hashCode()) * 31) + this.f38561e.hashCode()) * 31) + this.f38562f.hashCode()) * 31) + this.f38563g.hashCode()) * 31;
        Proxy proxy = this.f38564h;
        int iHashCode2 = (iHashCode + (proxy != null ? proxy.hashCode() : 0)) * 31;
        SSLSocketFactory sSLSocketFactory = this.f38565i;
        int iHashCode3 = (iHashCode2 + (sSLSocketFactory != null ? sSLSocketFactory.hashCode() : 0)) * 31;
        HostnameVerifier hostnameVerifier = this.f38566j;
        int iHashCode4 = (iHashCode3 + (hostnameVerifier != null ? hostnameVerifier.hashCode() : 0)) * 31;
        C13717f c13717f = this.f38567k;
        return iHashCode4 + (c13717f != null ? c13717f.hashCode() : 0);
    }

    /* JADX INFO: renamed from: i */
    public SocketFactory m40162i() {
        return this.f38559c;
    }

    @Nullable
    /* JADX INFO: renamed from: j */
    public SSLSocketFactory m40163j() {
        return this.f38565i;
    }

    /* JADX INFO: renamed from: k */
    public C13783s m40164k() {
        return this.f38557a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        sb.append(this.f38557a.m40738g());
        sb.append(CertificateUtil.DELIMITER);
        sb.append(this.f38557a.m40741j());
        if (this.f38564h != null) {
            sb.append(", proxy=");
            sb.append(this.f38564h);
        } else {
            sb.append(", proxySelector=");
            sb.append(this.f38563g);
        }
        sb.append("}");
        return sb.toString();
    }
}
