package com.mbridge.msdk.thrid.okio;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okio.t */
/* JADX INFO: compiled from: Timeout.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13810t {

    /* JADX INFO: renamed from: d */
    public static final C13810t f39349d = new a();

    /* JADX INFO: renamed from: a */
    private boolean f39350a;

    /* JADX INFO: renamed from: b */
    private long f39351b;

    /* JADX INFO: renamed from: c */
    private long f39352c;

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okio.t$a */
    /* JADX INFO: compiled from: Timeout.java */
    static class a extends C13810t {
        a() {
        }

        @Override // com.mbridge.msdk.thrid.okio.C13810t
        /* JADX INFO: renamed from: a */
        public C13810t mo40930a(long j) {
            return this;
        }

        @Override // com.mbridge.msdk.thrid.okio.C13810t
        /* JADX INFO: renamed from: a */
        public C13810t mo40931a(long j, TimeUnit timeUnit) {
            return this;
        }

        @Override // com.mbridge.msdk.thrid.okio.C13810t
        /* JADX INFO: renamed from: e */
        public void mo40935e() throws IOException {
        }
    }

    /* JADX INFO: renamed from: a */
    public C13810t mo40929a() {
        this.f39350a = false;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C13810t mo40930a(long j) {
        this.f39350a = true;
        this.f39351b = j;
        return this;
    }

    /* JADX INFO: renamed from: a */
    public C13810t mo40931a(long j, TimeUnit timeUnit) {
        if (j < 0) {
            throw new IllegalArgumentException("timeout < 0: " + j);
        }
        if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        }
        this.f39352c = timeUnit.toNanos(j);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public C13810t mo40932b() {
        this.f39352c = 0L;
        return this;
    }

    /* JADX INFO: renamed from: c */
    public long mo40933c() {
        if (this.f39350a) {
            return this.f39351b;
        }
        throw new IllegalStateException("No deadline");
    }

    /* JADX INFO: renamed from: d */
    public boolean mo40934d() {
        return this.f39350a;
    }

    /* JADX INFO: renamed from: e */
    public void mo40935e() throws IOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
        if (this.f39350a && this.f39351b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    /* JADX INFO: renamed from: f */
    public long m40966f() {
        return this.f39352c;
    }
}
