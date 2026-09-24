package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import android.os.SystemClock;
import com.google.firebase.sessions.settings.RemoteSettings;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.d */
/* JADX INFO: loaded from: classes4.dex */
public final class C8777d implements InterfaceC8783h {

    /* JADX INFO: renamed from: a */
    public final AssetManager f20517a;

    /* JADX INFO: renamed from: b */
    public final C8788m f20518b;

    /* JADX INFO: renamed from: c */
    public Uri f20519c;

    /* JADX INFO: renamed from: d */
    public InputStream f20520d;

    /* JADX INFO: renamed from: e */
    public long f20521e;

    /* JADX INFO: renamed from: f */
    public boolean f20522f;

    public C8777d(Context context, C8788m c8788m) {
        this.f20517a = context.getAssets();
        this.f20518b = c8788m;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8783h
    /* JADX INFO: renamed from: a */
    public final long mo20829a(C8786k c8786k) throws C8762c {
        try {
            Uri uri = c8786k.f20545a;
            this.f20519c = uri;
            String path = uri.getPath();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith(RemoteSettings.FORWARD_SLASH_STRING)) {
                path = path.substring(1);
            }
            InputStream inputStreamOpen = this.f20517a.open(path, 1);
            this.f20520d = inputStreamOpen;
            if (inputStreamOpen.skip(c8786k.f20547c) < c8786k.f20547c) {
                throw new EOFException();
            }
            long j = c8786k.f20548d;
            if (j != -1) {
                this.f20521e = j;
            } else {
                long jAvailable = this.f20520d.available();
                this.f20521e = jAvailable;
                if (jAvailable == 2147483647L) {
                    this.f20521e = -1L;
                }
            }
            this.f20522f = true;
            C8788m c8788m = this.f20518b;
            if (c8788m != null) {
                synchronized (c8788m) {
                    if (c8788m.f20557b == 0) {
                        c8788m.f20558c = SystemClock.elapsedRealtime();
                    }
                    c8788m.f20557b++;
                }
            }
            return this.f20521e;
        } catch (IOException e) {
            throw new C8762c(e);
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8783h
    /* JADX INFO: renamed from: a */
    public final Uri mo20830a() {
        return this.f20519c;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8783h
    public final void close() {
        this.f20519c = null;
        try {
            try {
                InputStream inputStream = this.f20520d;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.f20520d = null;
                if (this.f20522f) {
                    this.f20522f = false;
                    C8788m c8788m = this.f20518b;
                    if (c8788m != null) {
                        c8788m.m21310a();
                    }
                }
            } catch (IOException e) {
                throw new C8762c(e);
            }
        } catch (Throwable th) {
            this.f20520d = null;
            if (this.f20522f) {
                this.f20522f = false;
                C8788m c8788m2 = this.f20518b;
                if (c8788m2 != null) {
                    c8788m2.m21310a();
                }
            }
            throw th;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8783h
    public final int read(byte[] bArr, int i, int i2) throws C8762c {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f20521e;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new C8762c(e);
            }
        }
        int i3 = this.f20520d.read(bArr, i, i2);
        if (i3 == -1) {
            if (this.f20521e == -1) {
                return -1;
            }
            throw new C8762c(new EOFException());
        }
        long j2 = this.f20521e;
        if (j2 != -1) {
            this.f20521e = j2 - ((long) i3);
        }
        C8788m c8788m = this.f20518b;
        if (c8788m == null) {
            return i3;
        }
        synchronized (c8788m) {
            c8788m.f20559d += (long) i3;
        }
        return i3;
    }
}
