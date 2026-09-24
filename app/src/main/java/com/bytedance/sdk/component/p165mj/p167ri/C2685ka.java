package com.bytedance.sdk.component.p165mj.p167ri;

import com.bytedance.sdk.component.p165mj.p167ri.InterfaceC2684ik;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: com.bytedance.sdk.component.mj.ri.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C2685ka<T extends InterfaceC2684ik> {

    /* JADX INFO: renamed from: lr */
    private BlockingQueue<T> f7670lr = new LinkedBlockingQueue();

    /* JADX INFO: renamed from: ri */
    private int f7671ri;

    private C2685ka(int i) {
        this.f7671ri = i;
    }

    /* JADX INFO: renamed from: ri */
    public static C2685ka m10085ri(int i) {
        return new C2685ka(i);
    }

    /* JADX INFO: renamed from: ri */
    public T m10086ri() {
        return this.f7670lr.poll();
    }

    /* JADX INFO: renamed from: ri */
    public boolean m10087ri(T t) {
        if (t == null) {
            return false;
        }
        t.mo10084ri();
        if (this.f7670lr.size() >= this.f7671ri) {
            return false;
        }
        return this.f7670lr.offer(t);
    }
}
