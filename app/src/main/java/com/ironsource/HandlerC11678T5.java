package com.ironsource;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.ironsource.T5 */
/* JADX INFO: loaded from: classes6.dex */
public class HandlerC11678T5 extends Handler {

    /* JADX INFO: renamed from: a */
    private final ConcurrentHashMap<String, InterfaceC11510Jc> f25730a;

    public HandlerC11678T5(Looper looper) {
        super(looper);
        this.f25730a = new ConcurrentHashMap<>();
    }

    /* JADX INFO: renamed from: a */
    private boolean m27517a(int i) {
        return i == 1016 || i == 1015;
    }

    /* JADX INFO: renamed from: a */
    void m27518a(String str, InterfaceC11510Jc interfaceC11510Jc) {
        if (str == null || interfaceC11510Jc == null) {
            return;
        }
        this.f25730a.put(str, interfaceC11510Jc);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        try {
            C12601x8 c12601x8 = (C12601x8) message.obj;
            String path = c12601x8.getPath();
            InterfaceC11510Jc interfaceC11510Jc = this.f25730a.get(path);
            if (interfaceC11510Jc == null) {
                return;
            }
            if (m27517a(message.what)) {
                interfaceC11510Jc.mo26216a(c12601x8);
            } else {
                int i = message.what;
                interfaceC11510Jc.mo26217a(c12601x8, new C12404o8(i, C12174eg.m31379a(i)));
            }
            this.f25730a.remove(path);
        } catch (Throwable th) {
            C12317m4.m32153d().m32155a(th);
            IronLog.INTERNAL.error(th.toString());
        }
    }
}
