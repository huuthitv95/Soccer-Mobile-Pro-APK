package com.bytedance.sdk.openadsdk.p175ay.p176lr;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

/* JADX INFO: loaded from: classes3.dex */
public class xha {

    /* JADX INFO: renamed from: lr */
    private static HandlerThread f8633lr;

    /* JADX INFO: renamed from: ri */
    private static HandlerC2895ri f8634ri;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ay.lr.xha$ri */
    private static class HandlerC2895ri extends Handler {
        public HandlerC2895ri(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            AbstractC2892lr abstractC2892lr = (AbstractC2892lr) message.obj;
            if (abstractC2892lr == null) {
                return;
            }
            int iM11126lr = abstractC2892lr.m11126lr();
            if (iM11126lr == 1) {
                abstractC2892lr.xha();
            } else {
                if (iM11126lr != 2) {
                    C2889fi.m11107lr(abstractC2892lr.m11132sf());
                    return;
                }
                abstractC2892lr.m11127mj();
            }
            if (abstractC2892lr.jbs()) {
                C2889fi.m11107lr(abstractC2892lr.m11132sf());
            } else if (abstractC2892lr.mo11124co()) {
                m11138ri(abstractC2892lr);
            }
        }

        /* JADX INFO: renamed from: ri */
        public void m11138ri(AbstractC2892lr abstractC2892lr) {
            if (abstractC2892lr == null) {
                return;
            }
            int iIntValue = abstractC2892lr.m11132sf().intValue();
            if (hasMessages(iIntValue)) {
                return;
            }
            Message messageObtain = Message.obtain();
            messageObtain.what = iIntValue;
            messageObtain.obj = abstractC2892lr;
            sendMessageDelayed(messageObtain, abstractC2892lr.mo11116di());
        }
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0038 */
    /* JADX INFO: renamed from: lr */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m11134lr() {
        /*
            com.bytedance.sdk.openadsdk.ay.lr.xha$ri r0 = com.bytedance.sdk.openadsdk.p175ay.p176lr.xha.f8634ri
            if (r0 == 0) goto L5
            goto L10
        L5:
            android.os.HandlerThread r0 = com.bytedance.sdk.openadsdk.p175ay.p176lr.xha.f8633lr     // Catch: java.lang.Throwable -> L38
            if (r0 == 0) goto L11
            boolean r0 = r0.isAlive()     // Catch: java.lang.Throwable -> L38
            if (r0 != 0) goto L10
            goto L11
        L10:
            return
        L11:
            java.lang.Class<com.bytedance.sdk.openadsdk.ay.lr.xha> r0 = com.bytedance.sdk.openadsdk.p175ay.p176lr.xha.class
            monitor-enter(r0)     // Catch: java.lang.Throwable -> L38
            android.os.HandlerThread r1 = com.bytedance.sdk.openadsdk.p175ay.p176lr.xha.f8633lr     // Catch: java.lang.Throwable -> L35
            if (r1 == 0) goto L1e
            boolean r1 = r1.isAlive()     // Catch: java.lang.Throwable -> L35
            if (r1 != 0) goto L33
        L1e:
            java.lang.String r1 = "pag_MRC"
            android.os.HandlerThread r1 = com.bytedance.sdk.component.utils.C2723mj.m10250ri(r1)     // Catch: java.lang.Throwable -> L35
            com.bytedance.sdk.openadsdk.p175ay.p176lr.xha.f8633lr = r1     // Catch: java.lang.Throwable -> L35
            com.bytedance.sdk.openadsdk.ay.lr.xha$ri r1 = new com.bytedance.sdk.openadsdk.ay.lr.xha$ri     // Catch: java.lang.Throwable -> L35
            android.os.HandlerThread r2 = com.bytedance.sdk.openadsdk.p175ay.p176lr.xha.f8633lr     // Catch: java.lang.Throwable -> L35
            android.os.Looper r2 = r2.getLooper()     // Catch: java.lang.Throwable -> L35
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L35
            com.bytedance.sdk.openadsdk.p175ay.p176lr.xha.f8634ri = r1     // Catch: java.lang.Throwable -> L35
        L33:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L35
            return
        L35:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L38
            throw r1     // Catch: java.lang.Throwable -> L38
        L38:
            r0 = move-exception
            java.lang.String r1 = "MRC"
            java.lang.String r0 = r0.getMessage()
            com.bytedance.sdk.component.utils.C2707ac.m10196ik(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.p175ay.p176lr.xha.m11134lr():void");
    }

    /* JADX INFO: renamed from: lr */
    public static void m11135lr(AbstractC2892lr abstractC2892lr) {
        if (abstractC2892lr == null || f8634ri == null) {
            return;
        }
        try {
            int iIntValue = abstractC2892lr.m11132sf().intValue();
            if (f8634ri.hasMessages(iIntValue)) {
                f8634ri.removeMessages(iIntValue);
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ri */
    public static void m11136ri() {
    }

    /* JADX INFO: renamed from: ri */
    public static void m11137ri(AbstractC2892lr abstractC2892lr) {
        if (abstractC2892lr == null) {
            return;
        }
        m11134lr();
        HandlerC2895ri handlerC2895ri = f8634ri;
        if (handlerC2895ri != null) {
            handlerC2895ri.m11138ri(abstractC2892lr);
        }
    }
}
