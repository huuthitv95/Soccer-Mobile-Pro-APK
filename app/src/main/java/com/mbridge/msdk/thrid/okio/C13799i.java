package com.mbridge.msdk.thrid.okio;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okio.i */
/* JADX INFO: compiled from: ForwardingTimeout.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13799i extends C13810t {

    /* JADX INFO: renamed from: e */
    private C13810t f39315e;

    public C13799i(C13810t c13810t) {
        if (c13810t == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f39315e = c13810t;
    }

    /* JADX INFO: renamed from: a */
    public final C13799i m40928a(C13810t c13810t) {
        if (c13810t == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f39315e = c13810t;
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.C13810t
    /* JADX INFO: renamed from: a */
    public C13810t mo40929a() {
        return this.f39315e.mo40929a();
    }

    @Override // com.mbridge.msdk.thrid.okio.C13810t
    /* JADX INFO: renamed from: a */
    public C13810t mo40930a(long j) {
        return this.f39315e.mo40930a(j);
    }

    @Override // com.mbridge.msdk.thrid.okio.C13810t
    /* JADX INFO: renamed from: a */
    public C13810t mo40931a(long j, TimeUnit timeUnit) {
        return this.f39315e.mo40931a(j, timeUnit);
    }

    @Override // com.mbridge.msdk.thrid.okio.C13810t
    /* JADX INFO: renamed from: b */
    public C13810t mo40932b() {
        return this.f39315e.mo40932b();
    }

    @Override // com.mbridge.msdk.thrid.okio.C13810t
    /* JADX INFO: renamed from: c */
    public long mo40933c() {
        return this.f39315e.mo40933c();
    }

    @Override // com.mbridge.msdk.thrid.okio.C13810t
    /* JADX INFO: renamed from: d */
    public boolean mo40934d() {
        return this.f39315e.mo40934d();
    }

    @Override // com.mbridge.msdk.thrid.okio.C13810t
    /* JADX INFO: renamed from: e */
    public void mo40935e() throws IOException {
        this.f39315e.mo40935e();
    }

    /* JADX INFO: renamed from: g */
    public final C13810t m40936g() {
        return this.f39315e;
    }
}
