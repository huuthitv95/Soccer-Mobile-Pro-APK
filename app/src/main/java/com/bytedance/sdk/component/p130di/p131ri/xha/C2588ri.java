package com.bytedance.sdk.component.p130di.p131ri.xha;

import android.os.Handler;
import android.os.HandlerThread;
import com.bytedance.sdk.component.p130di.p131ri.InterfaceC2540fi;
import com.bytedance.sdk.component.p130di.p131ri.xha;

/* JADX INFO: renamed from: com.bytedance.sdk.component.di.ri.xha.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2588ri {

    /* JADX INFO: renamed from: ik */
    private static int f7245ik = 3000;

    /* JADX INFO: renamed from: lr */
    private static volatile Handler f7246lr;

    /* JADX INFO: renamed from: ri */
    private static volatile HandlerThread f7247ri;

    static {
        m9550ik();
    }

    /* JADX INFO: renamed from: ik */
    private static void m9550ik() {
        HandlerThread handlerThreadMo9223ri;
        InterfaceC2540fi interfaceC2540fiM9549vr = xha.m9524di().m9549vr();
        if (interfaceC2540fiM9549vr != null && (handlerThreadMo9223ri = interfaceC2540fiM9549vr.mo9223ri("csj_ad_log", 10)) != null) {
            f7247ri = handlerThreadMo9223ri;
            return;
        }
        HandlerThread handlerThread = new HandlerThread("csj_ad_log", 10);
        f7247ri = handlerThread;
        handlerThread.start();
    }

    /* JADX INFO: renamed from: lr */
    public static int m9551lr() {
        if (f7245ik <= 0) {
            f7245ik = 3000;
        }
        return f7245ik;
    }

    /* JADX INFO: renamed from: ri */
    public static Handler m9552ri() {
        if (f7247ri == null || !f7247ri.isAlive()) {
            synchronized (C2588ri.class) {
                if (f7247ri == null || !f7247ri.isAlive()) {
                    m9550ik();
                    f7246lr = new Handler(f7247ri.getLooper());
                }
            }
        } else if (f7246lr == null) {
            synchronized (C2588ri.class) {
                if (f7246lr == null) {
                    f7246lr = new Handler(f7247ri.getLooper());
                }
            }
        }
        return f7246lr;
    }
}
