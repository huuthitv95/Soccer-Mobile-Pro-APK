package com.bytedance.sdk.openadsdk.p175ay.p177ri;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.C2723mj;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ay.ri.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2899ri {

    /* JADX INFO: renamed from: lr */
    private static HandlerThread f8650lr;

    /* JADX INFO: renamed from: ri */
    private static Handler f8651ri;

    /* JADX INFO: renamed from: ri */
    public static Handler m11161ri() {
        try {
            HandlerThread handlerThread = f8650lr;
            if (handlerThread == null || !handlerThread.isAlive()) {
                synchronized (C2899ri.class) {
                    HandlerThread handlerThread2 = f8650lr;
                    if (handlerThread2 == null || !handlerThread2.isAlive()) {
                        f8650lr = C2723mj.m10250ri("pag_ev");
                        f8651ri = new Handler(f8650lr.getLooper());
                    }
                }
            } else if (f8651ri == null) {
                synchronized (C2899ri.class) {
                    if (f8651ri == null) {
                        f8651ri = new Handler(f8650lr.getLooper());
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return f8651ri;
    }
}
