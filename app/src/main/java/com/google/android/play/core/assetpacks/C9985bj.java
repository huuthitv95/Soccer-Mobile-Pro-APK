package com.google.android.play.core.assetpacks;

import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.bj */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
final class C9985bj extends InputStream implements AutoCloseable {

    /* JADX INFO: renamed from: a */
    private final InputStream f22072a;

    /* JADX INFO: renamed from: b */
    private long f22073b;

    C9985bj(InputStream inputStream, long j) {
        this.f22072a = inputStream;
        this.f22073b = j;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        this.f22072a.close();
        this.f22073b = 0L;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        long j = this.f22073b;
        if (j <= 0) {
            return -1;
        }
        this.f22073b = j - 1;
        return this.f22072a.read();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        long j = this.f22073b;
        if (j <= 0) {
            return -1;
        }
        int i3 = this.f22072a.read(bArr, i, (int) Math.min(i2, j));
        if (i3 != -1) {
            this.f22073b -= (long) i3;
        }
        return i3;
    }
}
