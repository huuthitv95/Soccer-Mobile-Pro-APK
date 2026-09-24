package com.bytedance.sdk.component.p165mj.p167ri;

import android.os.HandlerThread;
import com.bytedance.sdk.component.utils.igq;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.bytedance.sdk.component.mj.ri.lr */
/* JADX INFO: loaded from: classes9.dex */
public class HandlerC2686lr extends igq implements InterfaceC2684ik {

    /* JADX INFO: renamed from: lr */
    private final HandlerThread f7672lr;

    HandlerC2686lr(HandlerThread handlerThread, igq.InterfaceC2719ri interfaceC2719ri) {
        super(handlerThread.getLooper(), interfaceC2719ri);
        this.f7672lr = handlerThread;
    }

    /* JADX INFO: renamed from: lr */
    public void m10088lr() {
        HandlerThread handlerThread = this.f7672lr;
        if (handlerThread != null) {
            handlerThread.quit();
        }
    }

    @Override // com.bytedance.sdk.component.p165mj.p167ri.InterfaceC2684ik
    /* JADX INFO: renamed from: ri */
    public void mo10084ri() {
        removeCallbacksAndMessages(null);
        if (this.f7763ri != null) {
            this.f7763ri.clear();
            this.f7763ri = null;
        }
    }

    /* JADX INFO: renamed from: ri */
    public void m10089ri(igq.InterfaceC2719ri interfaceC2719ri) {
        this.f7763ri = new WeakReference<>(interfaceC2719ri);
    }
}
