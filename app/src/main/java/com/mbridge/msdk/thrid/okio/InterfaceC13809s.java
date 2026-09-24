package com.mbridge.msdk.thrid.okio;

import java.io.Closeable;
import java.io.IOException;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okio.s */
/* JADX INFO: compiled from: Source.java */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC13809s extends Closeable {
    /* JADX INFO: renamed from: b */
    long mo40427b(C13793c c13793c, long j) throws IOException;

    /* JADX INFO: renamed from: b */
    C13810t mo40428b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;
}
