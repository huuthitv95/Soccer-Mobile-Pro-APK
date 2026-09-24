package com.bytedance.sdk.component.p160lr.p161ri.p163ri.p164ri;

import com.bytedance.sdk.component.p160lr.p161ri.AbstractC2650ka;
import com.bytedance.sdk.component.p160lr.p161ri.InterfaceC2651lr;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: com.bytedance.sdk.component.lr.ri.ri.ri.di */
/* JADX INFO: loaded from: classes3.dex */
public class C2663di extends AbstractC2650ka {

    /* JADX INFO: renamed from: ri */
    private ExecutorService f7578ri;

    /* JADX INFO: renamed from: lr */
    private List<InterfaceC2651lr> f7577lr = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: ik */
    private List<InterfaceC2651lr> f7575ik = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: ka */
    private AtomicInteger f7576ka = new AtomicInteger(64);

    public C2663di() {
        if (this.f7578ri == null) {
            this.f7578ri = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 20L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() { // from class: com.bytedance.sdk.component.lr.ri.ri.ri.di.1
                @Override // java.util.concurrent.ThreadFactory
                public Thread newThread(Runnable runnable) {
                    Thread thread = new Thread(runnable, "systemHttp Dispatcher");
                    thread.setDaemon(false);
                    thread.setPriority(10);
                    return thread;
                }
            });
        }
    }

    @Override // com.bytedance.sdk.component.p160lr.p161ri.AbstractC2650ka
    /* JADX INFO: renamed from: ik */
    public List<InterfaceC2651lr> mo9917ik() {
        return this.f7577lr;
    }

    @Override // com.bytedance.sdk.component.p160lr.p161ri.AbstractC2650ka
    /* JADX INFO: renamed from: ka */
    public List<InterfaceC2651lr> mo9918ka() {
        return this.f7575ik;
    }

    @Override // com.bytedance.sdk.component.p160lr.p161ri.AbstractC2650ka
    /* JADX INFO: renamed from: lr */
    public ExecutorService mo9919lr() {
        return this.f7578ri;
    }

    @Override // com.bytedance.sdk.component.p160lr.p161ri.AbstractC2650ka
    /* JADX INFO: renamed from: ri */
    public int mo9920ri() {
        return this.f7576ka.get();
    }

    @Override // com.bytedance.sdk.component.p160lr.p161ri.AbstractC2650ka
    /* JADX INFO: renamed from: ri */
    public void mo9921ri(int i) {
        this.f7576ka.set(i);
    }
}
