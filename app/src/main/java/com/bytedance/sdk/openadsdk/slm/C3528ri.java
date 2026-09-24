package com.bytedance.sdk.openadsdk.slm;

import com.bytedance.sdk.component.p165mj.p166lr.AbstractRunnableC2676ik;
import com.bytedance.sdk.openadsdk.core.C3330su;
import com.bytedance.sdk.openadsdk.utils.dzy;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.slm.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C3528ri {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ik */
    public static void m15962ik() {
        C3330su.m14969ri();
    }

    /* JADX INFO: renamed from: ri */
    public static void m15964ri() {
        if (dzy.m16391di()) {
            dzy.m16409ri(new AbstractRunnableC2676ik("DailyTaskHelper") { // from class: com.bytedance.sdk.openadsdk.slm.ri.1
                @Override // java.lang.Runnable
                public void run() {
                    C3528ri.m15962ik();
                }
            });
        } else {
            m15962ik();
        }
    }
}
