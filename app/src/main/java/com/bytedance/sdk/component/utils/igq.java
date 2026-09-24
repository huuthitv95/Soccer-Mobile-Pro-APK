package com.bytedance.sdk.component.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public class igq extends Handler {

    /* JADX INFO: renamed from: ri */
    protected WeakReference<InterfaceC2719ri> f7763ri;

    /* JADX INFO: renamed from: com.bytedance.sdk.component.utils.igq$ri */
    public interface InterfaceC2719ri {
        /* JADX INFO: renamed from: ri */
        void mo6180ri(Message message);
    }

    public igq(Looper looper, InterfaceC2719ri interfaceC2719ri) {
        super(looper);
        if (interfaceC2719ri != null) {
            this.f7763ri = new WeakReference<>(interfaceC2719ri);
        }
    }

    public igq(InterfaceC2719ri interfaceC2719ri) {
        if (interfaceC2719ri != null) {
            this.f7763ri = new WeakReference<>(interfaceC2719ri);
        }
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        InterfaceC2719ri interfaceC2719ri;
        WeakReference<InterfaceC2719ri> weakReference = this.f7763ri;
        if (weakReference == null || (interfaceC2719ri = weakReference.get()) == null || message == null) {
            return;
        }
        interfaceC2719ri.mo6180ri(message);
    }
}
