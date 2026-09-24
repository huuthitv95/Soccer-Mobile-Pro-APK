package com.fyber.inneractive.sdk.util;

import java.nio.ByteBuffer;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.util.f */
/* JADX INFO: loaded from: classes4.dex */
public final class C9147f {

    /* JADX INFO: renamed from: b */
    public static final C9147f f21448b = new C9147f();

    /* JADX INFO: renamed from: a */
    public final ConcurrentLinkedQueue f21449a = new ConcurrentLinkedQueue();

    public C9147f() {
        for (int i = 0; i < 2; i++) {
            this.f21449a.offer(ByteBuffer.allocateDirect(16384));
        }
    }
}
