package com.bytedance.sdk.component.utils;

import android.os.HandlerThread;

/* JADX INFO: renamed from: com.bytedance.sdk.component.utils.mj */
/* JADX INFO: loaded from: classes3.dex */
public class C2723mj {

    /* JADX INFO: renamed from: lr */
    private static HandlerThread f7774lr;

    /* JADX INFO: renamed from: ri */
    public static volatile boolean f7775ri;

    /* JADX INFO: renamed from: ri */
    public static HandlerThread m10250ri(String str) {
        return m10251ri(str, 0);
    }

    /* JADX INFO: renamed from: ri */
    public static HandlerThread m10251ri(String str, int i) {
        if (f7775ri) {
            return f7774lr;
        }
        try {
            HandlerThread handlerThread = new HandlerThread(str, i) { // from class: com.bytedance.sdk.component.utils.mj.1

                /* JADX INFO: renamed from: ri */
                boolean f7776ri = false;

                @Override // java.lang.Thread
                public synchronized void start() {
                    if (this.f7776ri) {
                        return;
                    }
                    this.f7776ri = true;
                    super.start();
                }
            };
            handlerThread.start();
            return handlerThread;
        } catch (Throwable th) {
            C2707ac.m10206ri("HandlerThreadUtils", "new handlerThread error", th);
            return f7774lr;
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m10252ri(HandlerThread handlerThread) {
        f7774lr = handlerThread;
    }
}
