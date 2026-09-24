package com.mbridge.msdk.thrid.okio;

import java.io.IOException;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okio.h */
/* JADX INFO: compiled from: ForwardingSource.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractC13798h implements InterfaceC13809s, AutoCloseable {

    /* JADX INFO: renamed from: a */
    private final InterfaceC13809s f39314a;

    public AbstractC13798h(InterfaceC13809s interfaceC13809s) {
        if (interfaceC13809s == null) {
            throw new IllegalArgumentException("delegate == null");
        }
        this.f39314a = interfaceC13809s;
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13809s
    /* JADX INFO: renamed from: b */
    public C13810t mo40428b() {
        return this.f39314a.mo40428b();
    }

    @Override // com.mbridge.msdk.thrid.okio.InterfaceC13809s, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f39314a.close();
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC13809s m40927d() {
        return this.f39314a;
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f39314a.toString() + ")";
    }
}
