package com.bytedance.adsdk.ugeno.xha;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public class jbs extends Handler {

    /* JADX INFO: renamed from: ri */
    private final WeakReference<InterfaceC2344ri> f6095ri;

    /* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.xha.jbs$ri */
    public interface InterfaceC2344ri {
        /* JADX INFO: renamed from: ri */
        void mo7364ri(Message message);
    }

    public jbs(Looper looper, InterfaceC2344ri interfaceC2344ri) {
        super(looper);
        this.f6095ri = new WeakReference<>(interfaceC2344ri);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        InterfaceC2344ri interfaceC2344ri = this.f6095ri.get();
        if (interfaceC2344ri == null || message == null) {
            return;
        }
        interfaceC2344ri.mo7364ri(message);
    }
}
