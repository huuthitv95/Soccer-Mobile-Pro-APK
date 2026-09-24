package com.pgl.ssdk;

import android.os.HandlerThread;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.pgl.ssdk.a1 */
/* JADX INFO: loaded from: classes7.dex */
public class HandlerC14238a1 extends HandlerC14241a4 implements InterfaceC14239a2 {

    /* JADX INFO: renamed from: b */
    private final HandlerThread f41202b;

    HandlerC14238a1(HandlerThread handlerThread, HandlerC14241a4.a aVar) {
        super(handlerThread.getLooper(), aVar);
        this.f41202b = handlerThread;
    }

    /* JADX INFO: renamed from: a */
    public void m42791a(HandlerC14241a4.a aVar) {
        this.f41205a = new WeakReference<>(aVar);
    }

    /* JADX INFO: renamed from: a */
    public void m42792a(String str) {
        HandlerThread handlerThread = this.f41202b;
        if (handlerThread != null) {
            handlerThread.setName(str);
        }
    }
}
