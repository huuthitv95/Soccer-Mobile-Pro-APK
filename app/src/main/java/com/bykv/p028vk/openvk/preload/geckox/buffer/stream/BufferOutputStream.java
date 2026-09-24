package com.bykv.p028vk.openvk.preload.geckox.buffer.stream;

import com.bykv.p028vk.openvk.preload.geckox.buffer.InterfaceC1913a;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class BufferOutputStream extends AbstractC1918b {
    private InterfaceC1913a mBuffer;

    public BufferOutputStream(InterfaceC1913a interfaceC1913a) {
        this.mBuffer = interfaceC1913a;
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        flush();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
    }

    @Override // java.io.OutputStream
    public void write(int i) throws IOException {
        this.mBuffer.mo5971a(i);
    }

    @Override // com.bykv.p028vk.openvk.preload.geckox.buffer.stream.AbstractC1918b
    public void write(long j, int i) throws IOException {
        synchronized (this) {
            this.mBuffer.mo5976b(j);
            this.mBuffer.mo5971a(i);
        }
    }

    @Override // com.bykv.p028vk.openvk.preload.geckox.buffer.stream.AbstractC1918b
    public void write(long j, byte[] bArr) throws IOException {
        synchronized (this) {
            this.mBuffer.mo5976b(j);
            this.mBuffer.mo5972a(bArr);
        }
    }

    @Override // com.bykv.p028vk.openvk.preload.geckox.buffer.stream.AbstractC1918b
    public void write(long j, byte[] bArr, int i, int i2) throws IOException {
        synchronized (this) {
            this.mBuffer.mo5976b(j);
            this.mBuffer.mo5968a(bArr, i, i2);
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) throws IOException {
        this.mBuffer.mo5972a(bArr);
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) throws IOException {
        this.mBuffer.mo5968a(bArr, i, i2);
    }
}
