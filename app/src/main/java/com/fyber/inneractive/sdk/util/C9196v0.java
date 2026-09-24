package com.fyber.inneractive.sdk.util;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.util.v0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9196v0 extends BufferedInputStream {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AtomicInteger f21497a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9196v0(InputStream inputStream, AtomicInteger atomicInteger) {
        super(inputStream);
        this.f21497a = atomicInteger;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) {
        int i3;
        i3 = super.read(bArr, i, i2);
        if (i3 != -1) {
            this.f21497a.getAndAdd(i3);
        }
        return i3;
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        this.f21497a.set(0);
        super.reset();
    }

    @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j) {
        long jSkip;
        jSkip = super.skip(j);
        this.f21497a.addAndGet((int) jSkip);
        return jSkip;
    }
}
