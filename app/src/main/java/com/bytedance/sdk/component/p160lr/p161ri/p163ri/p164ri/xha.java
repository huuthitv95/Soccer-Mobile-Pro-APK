package com.bytedance.sdk.component.p160lr.p161ri.p163ri.p164ri;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

/* JADX INFO: loaded from: classes3.dex */
public class xha extends InputStream implements AutoCloseable {

    /* JADX INFO: renamed from: lr */
    HttpURLConnection f7603lr;

    /* JADX INFO: renamed from: ri */
    InputStream f7604ri;

    public xha(InputStream inputStream, HttpURLConnection httpURLConnection) {
        this.f7604ri = inputStream;
        this.f7603lr = httpURLConnection;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        InputStream inputStream = this.f7604ri;
        if (inputStream != null) {
            return inputStream.available();
        }
        return 0;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.f7604ri;
        if (inputStream != null) {
            inputStream.close();
            this.f7604ri = null;
        }
        HttpURLConnection httpURLConnection = this.f7603lr;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            this.f7603lr = null;
        }
    }

    @Override // java.io.InputStream
    public synchronized void mark(int i) {
        InputStream inputStream = this.f7604ri;
        if (inputStream != null) {
            inputStream.mark(i);
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        InputStream inputStream = this.f7604ri;
        if (inputStream != null) {
            return inputStream.markSupported();
        }
        return false;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        InputStream inputStream = this.f7604ri;
        if (inputStream != null) {
            return inputStream.read();
        }
        return 0;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        InputStream inputStream = this.f7604ri;
        if (inputStream != null) {
            return inputStream.read(bArr);
        }
        return 0;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) throws IOException {
        InputStream inputStream = this.f7604ri;
        if (inputStream != null) {
            return inputStream.read(bArr, i, i2);
        }
        return 0;
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        InputStream inputStream = this.f7604ri;
        if (inputStream != null) {
            inputStream.reset();
        }
    }

    @Override // java.io.InputStream
    public long skip(long j) throws IOException {
        InputStream inputStream = this.f7604ri;
        if (inputStream != null) {
            return inputStream.skip(j);
        }
        return 0L;
    }
}
