package com.fyber.inneractive.sdk.player.exoplayer2.util;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.b */
/* JADX INFO: loaded from: classes4.dex */
public final class C8803b extends OutputStream implements AutoCloseable {

    /* JADX INFO: renamed from: a */
    public final FileOutputStream f20609a;

    /* JADX INFO: renamed from: b */
    public boolean f20610b = false;

    public C8803b(File file) {
        this.f20609a = new FileOutputStream(file);
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.f20610b) {
            return;
        }
        this.f20610b = true;
        this.f20609a.flush();
        try {
            this.f20609a.getFD().sync();
        } catch (IOException e) {
            Log.w("AtomicFile", "Failed to sync file descriptor:", e);
        }
        this.f20609a.close();
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        this.f20609a.flush();
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        this.f20609a.write(i);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        this.f20609a.write(bArr);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        this.f20609a.write(bArr, i, i2);
    }
}
