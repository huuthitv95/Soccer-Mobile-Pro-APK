package com.mbridge.msdk.thrid.okhttp;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.net.InetSocketAddress;
import java.net.Proxy;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.c0 */
/* JADX INFO: compiled from: Route.java */
/* JADX INFO: loaded from: classes7.dex */
public final class C13713c0 {

    /* JADX INFO: renamed from: a */
    final C13708a f38620a;

    /* JADX INFO: renamed from: b */
    final Proxy f38621b;

    /* JADX INFO: renamed from: c */
    final InetSocketAddress f38622c;

    public C13713c0(C13708a c13708a, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (c13708a == null) {
            throw new NullPointerException("address == null");
        }
        if (proxy == null) {
            throw new NullPointerException("proxy == null");
        }
        if (inetSocketAddress == null) {
            throw new NullPointerException("inetSocketAddress == null");
        }
        this.f38620a = c13708a;
        this.f38621b = proxy;
        this.f38622c = inetSocketAddress;
    }

    /* JADX INFO: renamed from: a */
    public C13708a m40220a() {
        return this.f38620a;
    }

    /* JADX INFO: renamed from: b */
    public Proxy m40221b() {
        return this.f38621b;
    }

    /* JADX INFO: renamed from: c */
    public boolean m40222c() {
        return this.f38620a.f38565i != null && this.f38621b.type() == Proxy.Type.HTTP;
    }

    /* JADX INFO: renamed from: d */
    public InetSocketAddress m40223d() {
        return this.f38622c;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof C13713c0)) {
            return false;
        }
        C13713c0 c13713c0 = (C13713c0) obj;
        return c13713c0.f38620a.equals(this.f38620a) && c13713c0.f38621b.equals(this.f38621b) && c13713c0.f38622c.equals(this.f38622c);
    }

    public int hashCode() {
        return ((((this.f38620a.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.f38621b.hashCode()) * 31) + this.f38622c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f38622c + "}";
    }
}
