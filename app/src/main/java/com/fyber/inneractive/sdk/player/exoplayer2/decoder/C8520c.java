package com.fyber.inneractive.sdk.player.exoplayer2.decoder;

import java.nio.ByteBuffer;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.decoder.c */
/* JADX INFO: loaded from: classes4.dex */
public final class C8520c {

    /* JADX INFO: renamed from: a */
    public int f19102a;

    /* JADX INFO: renamed from: c */
    public ByteBuffer f19104c;

    /* JADX INFO: renamed from: d */
    public long f19105d;

    /* JADX INFO: renamed from: b */
    public final C8519b f19103b = new C8519b();

    /* JADX INFO: renamed from: e */
    public final int f19106e = 0;

    /* JADX INFO: renamed from: a */
    public final ByteBuffer m21016a(int i) {
        int i2 = this.f19106e;
        if (i2 == 1) {
            return ByteBuffer.allocate(i);
        }
        if (i2 == 2) {
            return ByteBuffer.allocateDirect(i);
        }
        ByteBuffer byteBuffer = this.f19104c;
        throw new IllegalStateException("Buffer too small (" + (byteBuffer == null ? 0 : byteBuffer.capacity()) + " < " + i + ")");
    }

    /* JADX INFO: renamed from: a */
    public final void m21017a() {
        this.f19102a = 0;
        ByteBuffer byteBuffer = this.f19104c;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
    }

    /* JADX INFO: renamed from: b */
    public final boolean m21018b(int i) {
        return (this.f19102a & i) == i;
    }
}
