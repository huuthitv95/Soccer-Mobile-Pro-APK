package com.apm.insight.p021k;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.apm.insight.k.f */
/* JADX INFO: compiled from: DataWithoutCloseStream.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1419f extends DataOutputStream implements AutoCloseable {
    public C1419f(OutputStream outputStream) {
        super(outputStream);
    }

    /* JADX INFO: renamed from: a */
    public final void m1253a() throws IOException {
        super.close();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }
}
