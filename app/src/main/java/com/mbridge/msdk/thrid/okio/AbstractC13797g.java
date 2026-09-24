package com.mbridge.msdk.thrid.okio;

import java.io.IOException;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okio.g */
/* JADX INFO: compiled from: ForwardingSink.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC13797g implements InterfaceC13808r, AutoCloseable {

    /* JADX INFO: renamed from: a */
    private final InterfaceC13808r f39313a;

    public AbstractC13797g(InterfaceC13808r interfaceC13808r) {
        if (interfaceC13808r == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f39313a = interfaceC13808r;
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13808r
    /* JADX INFO: renamed from: a */
    public void mo40370a(C13793c c13793c, long j) throws IOException {
        this.f39313a.mo40370a(c13793c, j);
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13808r
    /* JADX INFO: renamed from: b */
    public C13810t mo40429b() {
        return this.f39313a.mo40429b();
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13808r, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f39313a.close();
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13808r, java.io.Flushable
    public void flush() throws IOException {
        this.f39313a.flush();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f39313a.toString() + ")";
    }
}
