package com.bytedance.sdk.component;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: com.bytedance.sdk.component.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C2632ik {

    /* JADX INFO: renamed from: lr */
    private static volatile Handler f7402lr;

    /* JADX INFO: renamed from: ri */
    private static final Object f7403ri = new Object();

    /* JADX INFO: renamed from: ik */
    private static final LinkedList<Runnable> f7400ik = new LinkedList<>();

    /* JADX INFO: renamed from: ka */
    private static Object f7401ka = new Object();

    /* JADX INFO: renamed from: com.bytedance.sdk.component.ik$ri */
    private static class ri extends Handler {
        ri(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (message.what == 1) {
                try {
                    C2632ik.m9743ik();
                } catch (OutOfMemoryError unused) {
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ik */
    public static void m9743ik() {
        LinkedList linkedList;
        synchronized (f7401ka) {
            synchronized (f7403ri) {
                LinkedList<Runnable> linkedList2 = f7400ik;
                linkedList = (LinkedList) linkedList2.clone();
                linkedList2.clear();
                m9744lr().removeMessages(1);
            }
            if (linkedList.size() > 0) {
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    ((Runnable) it.next()).run();
                }
            }
        }
    }

    /* JADX INFO: renamed from: lr */
    private static Handler m9744lr() {
        Handler handler;
        if (f7402lr != null) {
            return f7402lr;
        }
        synchronized (f7403ri) {
            if (f7402lr == null) {
                HandlerThread handlerThreadMo9872ri = C2644lr.f7498ri != null ? C2644lr.f7498ri.mo9872ri("queued-work-looper", -2) : null;
                if (handlerThreadMo9872ri == null) {
                    handlerThreadMo9872ri = new HandlerThread("queued-work-looper", -2);
                    handlerThreadMo9872ri.start();
                }
                f7402lr = new ri(handlerThreadMo9872ri.getLooper());
            }
            handler = f7402lr;
        }
        return handler;
    }

    /* JADX INFO: renamed from: ri */
    public static void m9746ri(Runnable runnable, boolean z) {
        try {
            Handler handlerM9744lr = m9744lr();
            synchronized (f7403ri) {
                f7400ik.add(runnable);
                if (z) {
                    handlerM9744lr.sendEmptyMessageDelayed(1, 100L);
                } else {
                    handlerM9744lr.sendEmptyMessage(1);
                }
            }
        } catch (OutOfMemoryError unused) {
        }
    }
}
