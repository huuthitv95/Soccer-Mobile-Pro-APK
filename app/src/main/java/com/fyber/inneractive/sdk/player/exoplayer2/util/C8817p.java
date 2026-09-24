package com.fyber.inneractive.sdk.player.exoplayer2.util;

import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.p */
/* JADX INFO: loaded from: classes4.dex */
public final class C8817p extends BufferedOutputStream implements AutoCloseable {

    /* JADX INFO: renamed from: a */
    public boolean f20650a;

    public C8817p(C8803b c8803b) {
        super(c8803b);
    }

    public C8817p(OutputStream outputStream, int i) {
        super(outputStream, i);
    }

    /* JADX INFO: renamed from: a */
    public final void m21368a(OutputStream outputStream) {
        if (!this.f20650a) {
            throw new IllegalStateException();
        }
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.f20650a = false;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        this.f20650a = true;
        flush();
        th = null;
        try {
            ((BufferedOutputStream) this).out.close();
        } catch (Throwable th) {
            if (th == null) {
                th = th;
            }
        }
        if (th == null) {
            return;
        }
        int i = AbstractC8827z.f20671a;
        throw th;
    }
}
