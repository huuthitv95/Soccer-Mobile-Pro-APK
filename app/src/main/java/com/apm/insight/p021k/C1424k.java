package com.apm.insight.p021k;

import java.io.IOException;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: renamed from: com.apm.insight.k.k */
/* JADX INFO: compiled from: ZipWithZipOutputStream.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1424k extends GZIPOutputStream implements AutoCloseable {
    public C1424k(OutputStream outputStream) throws IOException {
        super(outputStream);
    }

    /* JADX INFO: renamed from: a */
    public final void m1284a() throws IOException {
        super.close();
    }

    /* JADX INFO: renamed from: b */
    public final void m1285b() throws IOException {
        super.finish();
    }

    @Override // java.util.zip.DeflaterOutputStream, java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // java.util.zip.GZIPOutputStream, java.util.zip.DeflaterOutputStream
    public final void finish() throws IOException {
    }
}
