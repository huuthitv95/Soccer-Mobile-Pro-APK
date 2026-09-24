package com.fyber.inneractive.sdk.player.cache;

import java.io.Closeable;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.cache.k */
/* JADX INFO: loaded from: classes4.dex */
public final class C8449k implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: a */
    public final InputStream f18804a;

    /* JADX INFO: renamed from: b */
    public final Charset f18805b;

    /* JADX INFO: renamed from: c */
    public byte[] f18806c;

    /* JADX INFO: renamed from: d */
    public int f18807d;

    /* JADX INFO: renamed from: e */
    public int f18808e;

    public C8449k(FileInputStream fileInputStream) {
        Charset charset = AbstractC8450l.f18809a;
        charset.getClass();
        if (!charset.equals(charset)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f18804a = fileInputStream;
        this.f18805b = charset;
        this.f18806c = new byte[8192];
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX INFO: renamed from: a */
    public final String m20832a() {
        int i;
        synchronized (this.f18804a) {
            byte[] bArr = this.f18806c;
            if (bArr == null) {
                throw new IOException("LineReader is closed");
            }
            if (this.f18807d >= this.f18808e) {
                int i2 = this.f18804a.read(bArr, 0, bArr.length);
                if (i2 == -1) {
                    throw new EOFException();
                }
                this.f18807d = 0;
                this.f18808e = i2;
            }
            for (int i3 = this.f18807d; i3 != this.f18808e; i3++) {
                byte[] bArr2 = this.f18806c;
                if (bArr2[i3] == 10) {
                    int i4 = this.f18807d;
                    if (i3 != i4) {
                        i = i3 - 1;
                        if (bArr2[i] != 13) {
                            i = i3;
                        }
                    } else {
                        i = i3;
                    }
                    String str = new String(bArr2, i4, i - i4, this.f18805b.name());
                    this.f18807d = i3 + 1;
                    return str;
                }
            }
            C8448j c8448j = new C8448j(this, (this.f18808e - this.f18807d) + 80);
            while (true) {
                byte[] bArr3 = this.f18806c;
                int i5 = this.f18807d;
                c8448j.write(bArr3, i5, this.f18808e - i5);
                this.f18808e = -1;
                InputStream inputStream = this.f18804a;
                byte[] bArr4 = this.f18806c;
                int i6 = inputStream.read(bArr4, 0, bArr4.length);
                if (i6 == -1) {
                    throw new EOFException();
                }
                this.f18807d = 0;
                this.f18808e = i6;
                for (int i7 = 0; i7 != this.f18808e; i7++) {
                    byte[] bArr5 = this.f18806c;
                    if (bArr5[i7] == 10) {
                        int i8 = this.f18807d;
                        if (i7 != i8) {
                            c8448j.write(bArr5, i8, i7 - i8);
                        }
                        this.f18807d = i7 + 1;
                        return c8448j.toString();
                    }
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.f18804a) {
            if (this.f18806c != null) {
                this.f18806c = null;
                this.f18804a.close();
            }
        }
    }
}
