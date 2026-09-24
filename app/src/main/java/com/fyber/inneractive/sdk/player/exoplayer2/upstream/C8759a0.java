package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import java.io.IOException;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.a0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8759a0 extends IOException {
    public C8759a0(Throwable th) {
        super("Unexpected " + th.getClass().getSimpleName() + ": " + th.getMessage(), th);
    }
}
