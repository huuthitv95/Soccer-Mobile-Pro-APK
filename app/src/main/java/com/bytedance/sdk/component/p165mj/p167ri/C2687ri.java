package com.bytedance.sdk.component.p165mj.p167ri;

import android.os.Handler;
import com.bytedance.sdk.component.utils.C2723mj;
import com.bytedance.sdk.component.utils.igq;

/* JADX INFO: renamed from: com.bytedance.sdk.component.mj.ri.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2687ri {

    /* JADX INFO: renamed from: lr */
    private Handler f7673lr;

    /* JADX INFO: renamed from: ri */
    private final C2685ka<HandlerC2686lr> f7674ri;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.mj.ri.ri$ri */
    private static class ri {

        /* JADX INFO: renamed from: ri */
        private static final C2687ri f7680ri = new C2687ri();
    }

    private C2687ri() {
        this.f7674ri = C2685ka.m10085ri(2);
    }

    /* JADX INFO: renamed from: lr */
    private HandlerC2686lr m10090lr(igq.InterfaceC2719ri interfaceC2719ri, String str) {
        return new HandlerC2686lr(C2723mj.m10250ri(str), interfaceC2719ri);
    }

    /* JADX INFO: renamed from: ri */
    public static C2687ri m10091ri() {
        return ri.f7680ri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: ri */
    public void m10092ri(final Handler handler, final Handler handler2) {
        if (!handler.getLooper().getQueue().isIdle()) {
            handler2.postDelayed(new Runnable() { // from class: com.bytedance.sdk.component.mj.ri.ri.1
                @Override // java.lang.Runnable
                public void run() {
                    C2687ri.this.m10092ri(handler, handler2);
                }
            }, 1000L);
        } else {
            handler.removeCallbacksAndMessages(null);
            handler.getLooper().quit();
        }
    }

    /* JADX INFO: renamed from: lr */
    public Handler m10094lr() {
        if (this.f7673lr == null) {
            synchronized (C2687ri.class) {
                if (this.f7673lr == null) {
                    this.f7673lr = m10096ri("csj_io_handler");
                }
            }
        }
        return this.f7673lr;
    }

    /* JADX INFO: renamed from: ri */
    public igq m10095ri(igq.InterfaceC2719ri interfaceC2719ri, final String str) {
        HandlerC2686lr handlerC2686lr = (HandlerC2686lr) this.f7674ri.m10086ri();
        if (handlerC2686lr == null) {
            return m10090lr(interfaceC2719ri, str);
        }
        handlerC2686lr.m10089ri(interfaceC2719ri);
        handlerC2686lr.post(new Runnable() { // from class: com.bytedance.sdk.component.mj.ri.ri.2
            @Override // java.lang.Runnable
            public void run() {
                Thread.currentThread().setName(str);
            }
        });
        return handlerC2686lr;
    }

    /* JADX INFO: renamed from: ri */
    public igq m10096ri(String str) {
        return m10095ri((igq.InterfaceC2719ri) null, str);
    }

    /* JADX INFO: renamed from: ri */
    public boolean m10097ri(igq igqVar) {
        if (!(igqVar instanceof HandlerC2686lr)) {
            return false;
        }
        HandlerC2686lr handlerC2686lr = (HandlerC2686lr) igqVar;
        if (this.f7674ri.m10087ri(handlerC2686lr)) {
            return true;
        }
        handlerC2686lr.m10088lr();
        return true;
    }
}
