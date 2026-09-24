package com.bytedance.sdk.component.p165mj.p166lr;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.bytedance.sdk.component.mj.lr.fi */
/* JADX INFO: loaded from: classes3.dex */
public class ThreadFactoryC2675fi implements ThreadFactory {

    /* JADX INFO: renamed from: ik */
    public static volatile boolean f7638ik;

    /* JADX INFO: renamed from: ka */
    private final AtomicInteger f7639ka = new AtomicInteger(1);

    /* JADX INFO: renamed from: lr */
    protected final String f7640lr;

    /* JADX INFO: renamed from: ri */
    protected final ThreadGroup f7641ri;

    public ThreadFactoryC2675fi(String str) {
        this.f7641ri = new ThreadGroup("pag_g_".concat(String.valueOf(str)));
        this.f7640lr = m10050ri(str);
    }

    /* JADX INFO: renamed from: ri */
    public static String m10050ri(String str) {
        return "pag_".concat(String.valueOf(str));
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        if (f7638ik) {
            return null;
        }
        Thread threadM10051ri = m10051ri(this.f7641ri, runnable, this.f7640lr + "_" + this.f7639ka.getAndIncrement());
        if (threadM10051ri.isDaemon()) {
            threadM10051ri.setDaemon(false);
        }
        return threadM10051ri;
    }

    /* JADX INFO: renamed from: ri */
    protected Thread m10051ri(ThreadGroup threadGroup, Runnable runnable, String str) {
        return new Thread(threadGroup, runnable, str);
    }
}
