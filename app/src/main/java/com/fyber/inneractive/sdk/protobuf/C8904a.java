package com.fyber.inneractive.sdk.protobuf;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.a */
/* JADX INFO: loaded from: classes4.dex */
public final class C8904a extends FilterInputStream {

    /* JADX INFO: renamed from: a */
    public int f20971a;

    public C8904a(InputStream inputStream, int i) {
        super(inputStream);
        this.f20971a = i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return Math.min(super.available(), this.f20971a);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.f20971a <= 0) {
            return -1;
        }
        int i = super.read();
        if (i >= 0) {
            this.f20971a--;
        }
        return i;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.f20971a;
        if (i3 <= 0) {
            return -1;
        }
        int i4 = super.read(bArr, i, Math.min(i2, i3));
        if (i4 >= 0) {
            this.f20971a -= i4;
        }
        return i4;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        long jSkip = super.skip(Math.min(j, this.f20971a));
        if (jSkip >= 0) {
            this.f20971a = (int) (((long) this.f20971a) - jSkip);
        }
        return jSkip;
    }
}
