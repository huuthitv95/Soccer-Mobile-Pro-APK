package com.mbridge.msdk.tracker.network.toolbox;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: com.mbridge.msdk.tracker.network.toolbox.n */
/* JADX INFO: compiled from: PoolingByteArrayOutputStream.java */
/* JADX INFO: loaded from: classes7.dex */
public class C13864n extends ByteArrayOutputStream implements AutoCloseable {

    /* JADX INFO: renamed from: a */
    private final C13853c f39577a;

    public C13864n(C13853c c13853c, int i) {
        this.f39577a = c13853c;
        ((ByteArrayOutputStream) this).buf = c13853c.m41261a(Math.max(i, 256));
    }

    /* JADX INFO: renamed from: a */
    private void m41318a(int i) {
        int i2 = ((ByteArrayOutputStream) this).count + i;
        if (i2 <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        byte[] bArrM41261a = this.f39577a.m41261a(i2 * 2);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, bArrM41261a, 0, ((ByteArrayOutputStream) this).count);
        this.f39577a.m41260a(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = bArrM41261a;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f39577a.m41260a(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public void finalize() {
        this.f39577a.m41260a(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(int i) {
        m41318a(1);
        super.write(i);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i, int i2) {
        m41318a(i2);
        if (bArr != null) {
            super.write(bArr, i, i2);
        }
    }
}
