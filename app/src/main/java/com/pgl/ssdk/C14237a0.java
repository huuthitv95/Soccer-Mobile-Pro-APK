package com.pgl.ssdk;

import android.os.HandlerThread;

/* JADX INFO: renamed from: com.pgl.ssdk.a0 */
/* JADX INFO: loaded from: classes7.dex */
public class C14237a0 {

    /* JADX INFO: renamed from: a */
    private final C14240a3<HandlerC14238a1> f41199a;

    /* JADX INFO: renamed from: b */
    private HandlerC14241a4 f41200b;

    /* JADX INFO: renamed from: com.pgl.ssdk.a0$b */
    private static class b {

        /* JADX INFO: renamed from: a */
        private static final C14237a0 f41201a = new C14237a0();
    }

    private C14237a0() {
        this.f41199a = C14240a3.m42793a(2);
    }

    /* JADX INFO: renamed from: a */
    public static C14237a0 m42784a() {
        return b.f41201a;
    }

    /* JADX INFO: renamed from: a */
    private HandlerC14238a1 m42785a(HandlerC14241a4.a aVar, String str) {
        try {
            HandlerThread handlerThread = new HandlerThread(str);
            handlerThread.start();
            return new HandlerC14238a1(handlerThread, aVar);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public HandlerC14241a4 m42786a(String str) {
        return m42788b(null, str);
    }

    /* JADX INFO: renamed from: b */
    public HandlerC14241a4 m42787b() {
        if (this.f41200b == null) {
            synchronized (C14237a0.class) {
                if (this.f41200b == null) {
                    this.f41200b = m42786a("pags_net_handler");
                }
            }
        }
        return this.f41200b;
    }

    /* JADX INFO: renamed from: b */
    public HandlerC14241a4 m42788b(HandlerC14241a4.a aVar, String str) {
        HandlerC14238a1 handlerC14238a1 = (HandlerC14238a1) this.f41199a.m42794a();
        if (handlerC14238a1 == null) {
            return m42785a(aVar, str);
        }
        handlerC14238a1.m42791a(aVar);
        handlerC14238a1.m42792a(str);
        return handlerC14238a1;
    }

    /* JADX INFO: renamed from: c */
    public HandlerC14241a4 m42789c() {
        if (this.f41200b == null) {
            synchronized (C14237a0.class) {
                if (this.f41200b == null) {
                    this.f41200b = m42786a("pags_ssdk_handler");
                }
            }
        }
        return this.f41200b;
    }
}
