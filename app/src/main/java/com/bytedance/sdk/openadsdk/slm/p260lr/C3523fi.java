package com.bytedance.sdk.openadsdk.slm.p260lr;

import com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.slm.lr.fi */
/* JADX INFO: loaded from: classes3.dex */
class C3523fi implements InterfaceC3524ik {

    /* JADX INFO: renamed from: ri */
    private static volatile C3523fi f12794ri;

    private C3523fi() {
    }

    /* JADX INFO: renamed from: ri */
    public static C3523fi m15960ri() {
        if (f12794ri == null) {
            synchronized (C3523fi.class) {
                if (f12794ri == null) {
                    f12794ri = new C3523fi();
                }
            }
        }
        return f12794ri;
    }

    @Override // com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3524ik
    /* JADX INFO: renamed from: ri */
    public void mo15673ri(InterfaceC3522lr interfaceC3522lr) {
    }

    @Override // com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3524ik
    /* JADX INFO: renamed from: ri */
    public void mo15674ri(InterfaceC3522lr interfaceC3522lr, boolean z) {
    }
}
