package com.google.common.p284io;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes6.dex */
@ElementTypesAreNonnullByDefault
final class MultiInputStream extends InputStream implements AutoCloseable {

    /* JADX INFO: renamed from: in */
    @CheckForNull
    private InputStream f22571in;

    /* JADX INFO: renamed from: it */
    private Iterator<? extends ByteSource> f22572it;

    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    public MultiInputStream(Iterator<? extends ByteSource> it) throws IOException {
        this.f22572it = (Iterator) Preconditions.checkNotNull(it);
        advance();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.f22571in;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.f22571in = null;
            }
        }
    }

    private void advance() throws IOException {
        close();
        if (this.f22572it.hasNext()) {
            this.f22571in = this.f22572it.next().openStream();
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        InputStream inputStream = this.f22571in;
        if (inputStream == null) {
            return 0;
        }
        return inputStream.available();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        while (true) {
            InputStream inputStream = this.f22571in;
            if (inputStream == null) {
                return -1;
            }
            int i = inputStream.read();
            if (i != -1) {
                return i;
            }
            advance();
        }
    }

    @Override // java.io.InputStream
    public int read(byte[] b, int off, int len) throws IOException {
        Preconditions.checkNotNull(b);
        while (true) {
            InputStream inputStream = this.f22571in;
            if (inputStream == null) {
                return -1;
            }
            int i = inputStream.read(b, off, len);
            if (i != -1) {
                return i;
            }
            advance();
        }
    }

    @Override // java.io.InputStream
    public long skip(long n) throws IOException {
        InputStream inputStream = this.f22571in;
        if (inputStream == null || n <= 0) {
            return 0L;
        }
        long jSkip = inputStream.skip(n);
        if (jSkip != 0) {
            return jSkip;
        }
        if (read() == -1) {
            return 0L;
        }
        return this.f22571in.skip(n - 1) + 1;
    }
}
