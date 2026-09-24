package com.bykv.p028vk.openvk.preload.geckox.buffer.stream;

import com.bykv.p028vk.openvk.preload.geckox.buffer.InterfaceC1913a;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.buffer.stream.a */
/* JADX INFO: compiled from: BufferInputStream.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1917a extends InputStream implements AutoCloseable {

    /* JADX INFO: renamed from: a */
    private InterfaceC1913a f4373a;

    /* JADX INFO: renamed from: b */
    private long f4374b;

    public C1917a(InterfaceC1913a interfaceC1913a) {
        this.f4373a = interfaceC1913a;
    }

    @Override // java.io.InputStream
    public final int available() throws IOException {
        long jMo5975b = this.f4373a.mo5975b() - this.f4373a.mo5977c();
        if (jMo5975b > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) jMo5975b;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i) {
        this.f4374b = i;
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        return this.f4373a.mo5978d();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return this.f4373a.mo5973b(bArr);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        return this.f4373a.mo5974b(bArr, i, i2);
    }

    @Override // java.io.InputStream
    public final synchronized void reset() throws IOException {
        this.f4373a.mo5976b(this.f4374b);
    }

    @Override // java.io.InputStream
    public final long skip(long j) throws IOException {
        return this.f4373a.mo5969a(j);
    }
}
