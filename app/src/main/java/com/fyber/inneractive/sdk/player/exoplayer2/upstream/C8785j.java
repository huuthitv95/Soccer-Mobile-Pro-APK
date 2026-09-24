package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import java.io.InputStream;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.j */
/* JADX INFO: loaded from: classes4.dex */
public final class C8785j extends InputStream implements AutoCloseable {

    /* JADX INFO: renamed from: a */
    public final InterfaceC8783h f20539a;

    /* JADX INFO: renamed from: b */
    public final C8786k f20540b;

    /* JADX INFO: renamed from: f */
    public long f20544f;

    /* JADX INFO: renamed from: d */
    public boolean f20542d = false;

    /* JADX INFO: renamed from: e */
    public boolean f20543e = false;

    /* JADX INFO: renamed from: c */
    public final byte[] f20541c = new byte[1];

    public C8785j(InterfaceC8783h interfaceC8783h, C8786k c8786k) {
        this.f20539a = interfaceC8783h;
        this.f20540b = c8786k;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f20543e) {
            return;
        }
        this.f20539a.close();
        this.f20543e = true;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f20541c;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return this.f20541c[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (this.f20543e) {
            throw new IllegalStateException();
        }
        if (!this.f20542d) {
            this.f20539a.mo20829a(this.f20540b);
            this.f20542d = true;
        }
        int i3 = this.f20539a.read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        this.f20544f += (long) i3;
        return i3;
    }
}
