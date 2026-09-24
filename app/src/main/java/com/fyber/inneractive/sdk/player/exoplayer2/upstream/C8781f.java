package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.SystemClock;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.f */
/* JADX INFO: loaded from: classes4.dex */
public final class C8781f implements InterfaceC8783h {

    /* JADX INFO: renamed from: a */
    public final ContentResolver f20531a;

    /* JADX INFO: renamed from: b */
    public final C8788m f20532b;

    /* JADX INFO: renamed from: c */
    public Uri f20533c;

    /* JADX INFO: renamed from: d */
    public AssetFileDescriptor f20534d;

    /* JADX INFO: renamed from: e */
    public FileInputStream f20535e;

    /* JADX INFO: renamed from: f */
    public long f20536f;

    /* JADX INFO: renamed from: g */
    public boolean f20537g;

    public C8781f(Context context, C8788m c8788m) {
        this.f20531a = context.getContentResolver();
        this.f20532b = c8788m;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8783h
    /* JADX INFO: renamed from: a */
    public final long mo20829a(C8786k c8786k) throws C8779e {
        try {
            Uri uri = c8786k.f20545a;
            this.f20533c = uri;
            AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor = this.f20531a.openAssetFileDescriptor(uri, "r");
            this.f20534d = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor == null) {
                throw new FileNotFoundException("Could not open file descriptor for: " + this.f20533c);
            }
            this.f20535e = new FileInputStream(this.f20534d.getFileDescriptor());
            long startOffset = this.f20534d.getStartOffset();
            if (this.f20535e.skip(c8786k.f20547c + startOffset) - startOffset != c8786k.f20547c) {
                throw new EOFException();
            }
            long j = c8786k.f20548d;
            if (j != -1) {
                this.f20536f = j;
            } else {
                long length = this.f20534d.getLength();
                this.f20536f = length;
                if (length == -1) {
                    long jAvailable = this.f20535e.available();
                    this.f20536f = jAvailable;
                    if (jAvailable == 0) {
                        this.f20536f = -1L;
                    }
                }
            }
            this.f20537g = true;
            C8788m c8788m = this.f20532b;
            if (c8788m != null) {
                synchronized (c8788m) {
                    if (c8788m.f20557b == 0) {
                        c8788m.f20558c = SystemClock.elapsedRealtime();
                    }
                    c8788m.f20557b++;
                }
            }
            return this.f20536f;
        } catch (IOException e) {
            throw new C8779e(e);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8783h
    /* JADX INFO: renamed from: a */
    public final Uri mo20830a() {
        return this.f20533c;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x003d */
    /* JADX WARN: Bottom block not found for handler: all -> 0x005f */
    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8783h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void close() {
        /*
            r4 = this;
            r0 = 0
            r4.f20533c = r0
            r1 = 0
            java.io.FileInputStream r2 = r4.f20535e     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L3f
            if (r2 == 0) goto Lb
            r2.close()     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L3f
        Lb:
            r4.f20535e = r0
            android.content.res.AssetFileDescriptor r2 = r4.f20534d     // Catch: java.lang.Throwable -> L24 java.io.IOException -> L26
            if (r2 == 0) goto L14
            r2.close()     // Catch: java.lang.Throwable -> L24 java.io.IOException -> L26
        L14:
            r4.f20534d = r0
            boolean r0 = r4.f20537g
            if (r0 == 0) goto L23
            r4.f20537g = r1
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.m r0 = r4.f20532b
            if (r0 == 0) goto L23
            r0.m21310a()
        L23:
            return
        L24:
            r2 = move-exception
            goto L2d
        L26:
            r2 = move-exception
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.e r3 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.e     // Catch: java.lang.Throwable -> L24
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L24
            throw r3     // Catch: java.lang.Throwable -> L24
        L2d:
            r4.f20534d = r0
            boolean r0 = r4.f20537g
            if (r0 == 0) goto L3c
            r4.f20537g = r1
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.m r0 = r4.f20532b
            if (r0 == 0) goto L3c
            r0.m21310a()
        L3c:
            throw r2
        L3d:
            r2 = move-exception
            goto L46
        L3f:
            r2 = move-exception
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.e r3 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.e     // Catch: java.lang.Throwable -> L3d
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L3d
            throw r3     // Catch: java.lang.Throwable -> L3d
        L46:
            r4.f20535e = r0
            android.content.res.AssetFileDescriptor r3 = r4.f20534d     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L61
            if (r3 == 0) goto L4f
            r3.close()     // Catch: java.lang.Throwable -> L5f java.io.IOException -> L61
        L4f:
            r4.f20534d = r0
            boolean r0 = r4.f20537g
            if (r0 == 0) goto L5e
            r4.f20537g = r1
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.m r0 = r4.f20532b
            if (r0 == 0) goto L5e
            r0.m21310a()
        L5e:
            throw r2
        L5f:
            r2 = move-exception
            goto L68
        L61:
            r2 = move-exception
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.e r3 = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.e     // Catch: java.lang.Throwable -> L5f
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L5f
            throw r3     // Catch: java.lang.Throwable -> L5f
        L68:
            r4.f20534d = r0
            boolean r0 = r4.f20537g
            if (r0 == 0) goto L77
            r4.f20537g = r1
            com.fyber.inneractive.sdk.player.exoplayer2.upstream.m r0 = r4.f20532b
            if (r0 == 0) goto L77
            r0.m21310a()
        L77:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.upstream.C8781f.close():void");
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8783h
    public final int read(byte[] bArr, int i, int i2) throws C8779e {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f20536f;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new C8779e(e);
            }
        }
        int i3 = this.f20535e.read(bArr, i, i2);
        if (i3 == -1) {
            if (this.f20536f == -1) {
                return -1;
            }
            throw new C8779e(new EOFException());
        }
        long j2 = this.f20536f;
        if (j2 != -1) {
            this.f20536f = j2 - ((long) i3);
        }
        C8788m c8788m = this.f20532b;
        if (c8788m == null) {
            return i3;
        }
        synchronized (c8788m) {
            c8788m.f20559d += (long) i3;
        }
        return i3;
    }
}
