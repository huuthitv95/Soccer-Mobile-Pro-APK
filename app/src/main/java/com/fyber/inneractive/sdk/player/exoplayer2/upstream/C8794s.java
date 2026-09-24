package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.net.Uri;
import android.os.SystemClock;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.s */
/* JADX INFO: loaded from: classes4.dex */
public final class C8794s implements InterfaceC8783h {

    /* JADX INFO: renamed from: a */
    public final C8788m f20592a;

    /* JADX INFO: renamed from: b */
    public RandomAccessFile f20593b;

    /* JADX INFO: renamed from: c */
    public Uri f20594c;

    /* JADX INFO: renamed from: d */
    public long f20595d;

    /* JADX INFO: renamed from: e */
    public boolean f20596e;

    public C8794s(C8788m c8788m) {
        this.f20592a = c8788m;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8783h
    /* JADX INFO: renamed from: a */
    public final long mo20829a(C8786k c8786k) throws C8793r {
        try {
            this.f20594c = c8786k.f20545a;
            RandomAccessFile randomAccessFile = new RandomAccessFile(c8786k.f20545a.getPath(), "r");
            this.f20593b = randomAccessFile;
            randomAccessFile.seek(c8786k.f20547c);
            long length = c8786k.f20548d;
            if (length == -1) {
                length = this.f20593b.length() - c8786k.f20547c;
            }
            this.f20595d = length;
            if (length < 0) {
                throw new EOFException();
            }
            this.f20596e = true;
            C8788m c8788m = this.f20592a;
            if (c8788m != null) {
                synchronized (c8788m) {
                    if (c8788m.f20557b == 0) {
                        c8788m.f20558c = SystemClock.elapsedRealtime();
                    }
                    c8788m.f20557b++;
                }
            }
            return this.f20595d;
        } catch (IOException e) {
            throw new C8793r(e);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8783h
    /* JADX INFO: renamed from: a */
    public final Uri mo20830a() {
        return this.f20594c;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8783h
    public final void close() {
        this.f20594c = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.f20593b;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.f20593b = null;
                if (this.f20596e) {
                    this.f20596e = false;
                    C8788m c8788m = this.f20592a;
                    if (c8788m != null) {
                        c8788m.m21310a();
                    }
                }
            } catch (IOException e) {
                throw new C8793r(e);
            }
        } catch (Throwable th) {
            this.f20593b = null;
            if (this.f20596e) {
                this.f20596e = false;
                C8788m c8788m2 = this.f20592a;
                if (c8788m2 != null) {
                    c8788m2.m21310a();
                }
            }
            throw th;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8783h
    public final int read(byte[] bArr, int i, int i2) throws C8793r {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f20595d;
        if (j == 0) {
            return -1;
        }
        try {
            int i3 = this.f20593b.read(bArr, i, (int) Math.min(j, i2));
            if (i3 > 0) {
                long j2 = i3;
                this.f20595d -= j2;
                C8788m c8788m = this.f20592a;
                if (c8788m != null) {
                    synchronized (c8788m) {
                        c8788m.f20559d += j2;
                    }
                    return i3;
                }
            }
            return i3;
        } catch (IOException e) {
            throw new C8793r(e);
        }
    }
}
