package com.mbridge.msdk.thrid.okhttp.internal.http;

import com.mbridge.msdk.thrid.okhttp.AbstractC13779o;
import com.mbridge.msdk.thrid.okhttp.C13709a0;
import com.mbridge.msdk.thrid.okhttp.C13789y;
import com.mbridge.msdk.thrid.okhttp.InterfaceC13714d;
import com.mbridge.msdk.thrid.okhttp.InterfaceC13719h;
import com.mbridge.msdk.thrid.okhttp.InterfaceC13784t;
import com.mbridge.msdk.thrid.okhttp.internal.connection.C13729c;
import com.mbridge.msdk.thrid.okhttp.internal.connection.C13733g;
import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okhttp.internal.http.g */
/* JADX INFO: compiled from: RealInterceptorChain.java */
/* JADX INFO: loaded from: classes7.dex */
public final class C13741g implements InterfaceC13784t.a {

    /* JADX INFO: renamed from: a */
    private final List<InterfaceC13784t> f38862a;

    /* JADX INFO: renamed from: b */
    private final C13733g f38863b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC13737c f38864c;

    /* JADX INFO: renamed from: d */
    private final C13729c f38865d;

    /* JADX INFO: renamed from: e */
    private final int f38866e;

    /* JADX INFO: renamed from: f */
    private final C13789y f38867f;

    /* JADX INFO: renamed from: g */
    private final InterfaceC13714d f38868g;

    /* JADX INFO: renamed from: h */
    private final AbstractC13779o f38869h;

    /* JADX INFO: renamed from: i */
    private final int f38870i;

    /* JADX INFO: renamed from: j */
    private final int f38871j;

    /* JADX INFO: renamed from: k */
    private final int f38872k;

    /* JADX INFO: renamed from: l */
    private int f38873l;

    public C13741g(List<InterfaceC13784t> list, C13733g c13733g, InterfaceC13737c interfaceC13737c, C13729c c13729c, int i, C13789y c13789y, InterfaceC13714d interfaceC13714d, AbstractC13779o abstractC13779o, int i2, int i3, int i4) {
        this.f38862a = list;
        this.f38865d = c13729c;
        this.f38863b = c13733g;
        this.f38864c = interfaceC13737c;
        this.f38866e = i;
        this.f38867f = c13789y;
        this.f38868g = interfaceC13714d;
        this.f38869h = abstractC13779o;
        this.f38870i = i2;
        this.f38871j = i3;
        this.f38872k = i4;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.InterfaceC13784t.a
    /* JADX INFO: renamed from: a */
    public int mo40392a() {
        return this.f38870i;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.InterfaceC13784t.a
    /* JADX INFO: renamed from: a */
    public C13709a0 mo40393a(C13789y c13789y) throws IOException {
        return m40394a(c13789y, this.f38863b, this.f38864c, this.f38865d);
    }

    /* JADX INFO: renamed from: a */
    public C13709a0 m40394a(C13789y c13789y, C13733g c13733g, InterfaceC13737c interfaceC13737c, C13729c c13729c) throws IOException {
        if (this.f38866e >= this.f38862a.size()) {
            throw new AssertionError();
        }
        this.f38873l++;
        if (this.f38864c != null && !this.f38865d.m40328a(c13789y.m40831g())) {
            throw new IllegalStateException("network interceptor " + this.f38862a.get(this.f38866e - 1) + " must retain the same host and port");
        }
        if (this.f38864c != null && this.f38873l > 1) {
            throw new IllegalStateException("network interceptor " + this.f38862a.get(this.f38866e - 1) + " must call proceed() exactly once");
        }
        C13741g c13741g = new C13741g(this.f38862a, c13733g, interfaceC13737c, c13729c, this.f38866e + 1, c13789y, this.f38868g, this.f38869h, this.f38870i, this.f38871j, this.f38872k);
        InterfaceC13784t interfaceC13784t = this.f38862a.get(this.f38866e);
        C13709a0 c13709a0Mo40305a = interfaceC13784t.mo40305a(c13741g);
        if (interfaceC13737c != null && this.f38866e + 1 < this.f38862a.size() && c13741g.f38873l != 1) {
            throw new IllegalStateException("network interceptor " + interfaceC13784t + " must call proceed() exactly once");
        }
        if (c13709a0Mo40305a == null) {
            throw new NullPointerException("interceptor " + interfaceC13784t + " returned null");
        }
        if (c13709a0Mo40305a.m40167d() != null) {
            return c13709a0Mo40305a;
        }
        throw new IllegalStateException("interceptor " + interfaceC13784t + " returned a response with no body");
    }

    @Override // com.mbridge.msdk.thrid.okhttp.InterfaceC13784t.a
    /* JADX INFO: renamed from: b */
    public int mo40395b() {
        return this.f38871j;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.InterfaceC13784t.a
    /* JADX INFO: renamed from: c */
    public int mo40396c() {
        return this.f38872k;
    }

    @Override // com.mbridge.msdk.thrid.okhttp.InterfaceC13784t.a
    /* JADX INFO: renamed from: d */
    public C13789y mo40397d() {
        return this.f38867f;
    }

    /* JADX INFO: renamed from: e */
    public InterfaceC13714d m40398e() {
        return this.f38868g;
    }

    /* JADX INFO: renamed from: f */
    public InterfaceC13719h m40399f() {
        return this.f38865d;
    }

    /* JADX INFO: renamed from: g */
    public AbstractC13779o m40400g() {
        return this.f38869h;
    }

    /* JADX INFO: renamed from: h */
    public InterfaceC13737c m40401h() {
        return this.f38864c;
    }

    /* JADX INFO: renamed from: i */
    public C13733g m40402i() {
        return this.f38863b;
    }
}
