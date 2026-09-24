package com.google.android.play.core.assetpacks;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Enumeration;

/* JADX INFO: renamed from: com.google.android.play.core.assetpacks.dr */
/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.2.1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C10047dr extends InputStream implements AutoCloseable {

    /* JADX INFO: renamed from: a */
    private final Enumeration f22294a;

    /* JADX INFO: renamed from: b */
    private InputStream f22295b;

    public C10047dr(Enumeration enumeration) throws IOException {
        this.f22294a = enumeration;
        m22663a();
    }

    /* JADX INFO: renamed from: a */
    final void m22663a() throws IOException {
        InputStream inputStream = this.f22295b;
        if (inputStream != null) {
            inputStream.close();
        }
        if (this.f22294a.hasMoreElements()) {
            this.f22295b = new FileInputStream((File) this.f22294a.nextElement());
        } else {
            this.f22295b = null;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        InputStream inputStream = this.f22295b;
        if (inputStream != null) {
            inputStream.close();
            this.f22295b = null;
        }
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        while (true) {
            InputStream inputStream = this.f22295b;
            if (inputStream == null) {
                return -1;
            }
            int i = inputStream.read();
            if (i != -1) {
                return i;
            }
            m22663a();
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.f22295b == null) {
            return -1;
        }
        bArr.getClass();
        if (i < 0 || i2 < 0 || i2 > bArr.length - i) {
            throw new IndexOutOfBoundsException();
        }
        if (i2 == 0) {
            return 0;
        }
        do {
            int i3 = this.f22295b.read(bArr, i, i2);
            if (i3 > 0) {
                return i3;
            }
            m22663a();
        } while (this.f22295b != null);
        return -1;
    }
}
