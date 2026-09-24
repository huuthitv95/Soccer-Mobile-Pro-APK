package com.fyber.inneractive.sdk.util;

import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.util.j */
/* JADX INFO: loaded from: classes4.dex */
public final class C9159j {

    /* JADX INFO: renamed from: a */
    public final ConcurrentLinkedQueue f21456a = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: b */
    public final InterfaceC9156i f21457b;

    public C9159j(int i, InterfaceC9156i interfaceC9156i) {
        for (int i2 = 0; i2 < i; i2++) {
            this.f21456a.offer(interfaceC9156i.mo21857a());
        }
        this.f21457b = interfaceC9156i;
    }
}
