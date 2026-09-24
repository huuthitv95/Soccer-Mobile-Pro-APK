package com.fyber.inneractive.sdk.player.cache;

import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.cache.c */
/* JADX INFO: loaded from: classes4.dex */
public final class C8441c extends FilterOutputStream implements AutoCloseable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C8442d f18775a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C8441c(C8442d c8442d, FileOutputStream fileOutputStream) {
        super(fileOutputStream);
        this.f18775a = c8442d;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            ((FilterOutputStream) this).out.close();
        } catch (IOException unused) {
            this.f18775a.f18778c = true;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
    public final void flush() {
        try {
            ((FilterOutputStream) this).out.flush();
        } catch (IOException unused) {
            this.f18775a.f18778c = true;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) {
        try {
            ((FilterOutputStream) this).out.write(i);
        } catch (IOException unused) {
            this.f18775a.f18778c = true;
        }
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        try {
            ((FilterOutputStream) this).out.write(bArr, i, i2);
        } catch (IOException unused) {
            this.f18775a.f18778c = true;
        }
    }
}
