package com.bytedance.sdk.component.adexpress.p124ka;

import com.bytedance.sdk.component.adexpress.p126ri.p129ri.C2531ri;
import com.bytedance.sdk.component.adexpress.p126ri.p129ri.InterfaceC2528ik;
import com.bytedance.sdk.component.p165mj.p166lr.AbstractRunnableC2676ik;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.ka.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C2495ka {
    /* JADX INFO: renamed from: lr */
    public static void m8819lr(AbstractRunnableC2676ik abstractRunnableC2676ik, int i) {
        if (abstractRunnableC2676ik == null) {
            return;
        }
        InterfaceC2528ik interfaceC2528ikM9166ik = C2531ri.m9163ri().m9166ik();
        ExecutorService executorServiceMo9144aw = interfaceC2528ikM9166ik != null ? interfaceC2528ikM9166ik.mo9144aw() : null;
        if (executorServiceMo9144aw != null) {
            abstractRunnableC2676ik.setPriority(i);
            executorServiceMo9144aw.execute(abstractRunnableC2676ik);
        }
    }

    /* JADX INFO: renamed from: ri */
    public static ScheduledFuture m8820ri(Runnable runnable, long j, TimeUnit timeUnit) {
        if (runnable == null) {
            return null;
        }
        InterfaceC2528ik interfaceC2528ikM9166ik = C2531ri.m9163ri().m9166ik();
        ScheduledExecutorService scheduledExecutorServiceMo9157vr = interfaceC2528ikM9166ik != null ? interfaceC2528ikM9166ik.mo9157vr() : null;
        if (scheduledExecutorServiceMo9157vr != null) {
            return scheduledExecutorServiceMo9157vr.schedule(runnable, j, timeUnit);
        }
        return null;
    }

    /* JADX INFO: renamed from: ri */
    public static void m8821ri(AbstractRunnableC2676ik abstractRunnableC2676ik, int i) {
        if (abstractRunnableC2676ik == null) {
            return;
        }
        InterfaceC2528ik interfaceC2528ikM9166ik = C2531ri.m9163ri().m9166ik();
        ExecutorService executorServiceBgr = interfaceC2528ikM9166ik != null ? interfaceC2528ikM9166ik.bgr() : null;
        if (executorServiceBgr != null) {
            abstractRunnableC2676ik.setPriority(i);
            executorServiceBgr.execute(abstractRunnableC2676ik);
        }
    }
}
