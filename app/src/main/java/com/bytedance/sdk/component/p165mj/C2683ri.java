package com.bytedance.sdk.component.p165mj;

import com.bytedance.sdk.component.InterfaceC2688ri;

/* JADX INFO: renamed from: com.bytedance.sdk.component.mj.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2683ri {

    /* JADX INFO: renamed from: ri */
    private static InterfaceC2688ri f7669ri;

    /* JADX INFO: renamed from: ri */
    public static void m10082ri(InterfaceC2688ri interfaceC2688ri) {
        f7669ri = interfaceC2688ri;
    }

    /* JADX INFO: renamed from: ri */
    public static void m10083ri(Runnable runnable) {
        InterfaceC2688ri interfaceC2688ri = f7669ri;
        if (interfaceC2688ri == null) {
            return;
        }
        interfaceC2688ri.mo10102ri(runnable);
    }
}
