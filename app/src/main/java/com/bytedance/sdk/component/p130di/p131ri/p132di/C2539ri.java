package com.bytedance.sdk.component.p130di.p131ri.p132di;

import com.bytedance.sdk.component.p130di.p131ri.xha;

/* JADX INFO: renamed from: com.bytedance.sdk.component.di.ri.di.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2539ri {

    /* JADX INFO: renamed from: ri */
    private static volatile InterfaceC2538lr f7053ri;

    /* JADX INFO: renamed from: ri */
    public static InterfaceC2538lr m9211ri() {
        if (f7053ri == null) {
            synchronized (InterfaceC2538lr.class) {
                if (f7053ri == null) {
                    f7053ri = new C2536ik(xha.m9524di().m9528fi(), new C2534di(xha.m9524di().m9528fi()));
                }
            }
        }
        return f7053ri;
    }
}
