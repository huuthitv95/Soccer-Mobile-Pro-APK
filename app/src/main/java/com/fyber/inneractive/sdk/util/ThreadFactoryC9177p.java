package com.fyber.inneractive.sdk.util;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.util.p */
/* JADX INFO: loaded from: classes4.dex */
public final class ThreadFactoryC9177p implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final AtomicInteger f21473a = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "IAConcurrencyUtil#" + this.f21473a.getAndIncrement());
    }
}
