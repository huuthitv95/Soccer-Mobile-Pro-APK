package com.mbridge.msdk.thrid.okio;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;

/* JADX INFO: renamed from: com.mbridge.msdk.thrid.okio.r */
/* JADX INFO: compiled from: Sink.java */
/* JADX INFO: loaded from: classes7.dex */
public interface InterfaceC13808r extends Closeable, Flushable {
    /* JADX INFO: renamed from: a */
    void mo40370a(C13793c c13793c, long j) throws IOException;

    /* JADX INFO: renamed from: b */
    C13810t mo40429b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close() throws IOException;

    void flush() throws IOException;
}
