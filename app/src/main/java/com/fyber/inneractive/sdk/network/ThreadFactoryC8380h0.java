package com.fyber.inneractive.sdk.network;

import java.util.Locale;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.network.h0 */
/* JADX INFO: loaded from: classes4.dex */
public final class ThreadFactoryC8380h0 implements ThreadFactory {

    /* JADX INFO: renamed from: a */
    public final AtomicInteger f18658a = new AtomicInteger(100);

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, String.format(Locale.ENGLISH, "FyberMarketplace-Network-%02d", Integer.valueOf(this.f18658a.getAndIncrement())));
    }
}
