package com.digitalturbine.ignite.authenticator.utils.concurency;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.digitalturbine.ignite.authenticator.utils.concurency.a */
/* JADX INFO: loaded from: classes3.dex */
public final class ThreadFactoryC4263a implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final AtomicInteger f17350a = new AtomicInteger(1);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, "ConcurrencyUtil#" + this.f17350a.getAndIncrement());
    }
}
