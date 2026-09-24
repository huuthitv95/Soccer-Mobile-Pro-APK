package com.fyber.inneractive.sdk.player.cache;

import android.net.Uri;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.C8786k;
import com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8783h;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.cache.h */
/* JADX INFO: loaded from: classes4.dex */
public final class C8446h implements InterfaceC8783h {

    /* JADX INFO: renamed from: a */
    public Uri f18802a;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8783h
    /* JADX INFO: renamed from: a */
    public final long mo20829a(C8786k c8786k) {
        new CountDownLatch(1);
        new AtomicReference();
        this.f18802a = c8786k.f20545a;
        throw null;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8783h
    /* JADX INFO: renamed from: a */
    public final Uri mo20830a() {
        return this.f18802a;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8783h
    public final void close() {
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.upstream.InterfaceC8783h
    public final int read(byte[] bArr, int i, int i2) {
        return -1;
    }
}
