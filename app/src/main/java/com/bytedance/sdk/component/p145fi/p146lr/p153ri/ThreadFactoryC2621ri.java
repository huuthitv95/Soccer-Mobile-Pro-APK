package com.bytedance.sdk.component.p145fi.p146lr.p153ri;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.bytedance.sdk.component.fi.lr.ri.ri */
/* JADX INFO: loaded from: classes3.dex */
public class ThreadFactoryC2621ri implements ThreadFactory {

    /* JADX INFO: renamed from: lr */
    private final AtomicInteger f7386lr = new AtomicInteger(1);

    /* JADX INFO: renamed from: ri */
    private final ThreadGroup f7387ri;

    public ThreadFactoryC2621ri(String str) {
        this.f7387ri = new ThreadGroup("tt_img_".concat(String.valueOf(str)));
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(this.f7387ri, runnable, "tt_img_" + this.f7386lr.getAndIncrement());
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }
}
