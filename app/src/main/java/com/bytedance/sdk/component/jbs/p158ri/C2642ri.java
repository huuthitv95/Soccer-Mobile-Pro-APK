package com.bytedance.sdk.component.jbs.p158ri;

/* JADX INFO: renamed from: com.bytedance.sdk.component.jbs.ri.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2642ri {

    /* JADX INFO: renamed from: lr */
    private static volatile C2642ri f7489lr;

    /* JADX INFO: renamed from: ri */
    private volatile InterfaceC2641lr f7490ri;

    private C2642ri() {
    }

    /* JADX INFO: renamed from: ri */
    public static C2642ri m9829ri() {
        if (f7489lr == null) {
            synchronized (C2642ri.class) {
                if (f7489lr == null) {
                    f7489lr = new C2642ri();
                }
            }
        }
        return f7489lr;
    }

    /* JADX INFO: renamed from: lr */
    public InterfaceC2641lr m9830lr() {
        return this.f7490ri;
    }

    /* JADX INFO: renamed from: ri */
    public void m9831ri(InterfaceC2641lr interfaceC2641lr) {
        this.f7490ri = interfaceC2641lr;
    }
}
