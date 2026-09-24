package com.bytedance.sdk.openadsdk.p236ka.p243ri;

import com.bytedance.sdk.component.p130di.p131ri.C2555lr;
import com.bytedance.sdk.component.p130di.p131ri.p135ka.p137ri.C2554ri;
import com.bytedance.sdk.component.p165mj.p166lr.AbstractRunnableC2676ik;
import com.bytedance.sdk.openadsdk.core.C3299nr;
import com.bytedance.sdk.openadsdk.slm.InterfaceC3522lr;
import com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3524ik;
import com.bytedance.sdk.openadsdk.slm.p261ri.InterfaceC3530ik;
import com.bytedance.sdk.openadsdk.utils.C3593su;
import com.bytedance.sdk.openadsdk.utils.dzy;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ka.ri.mj */
/* JADX INFO: loaded from: classes3.dex */
class C3436mj implements InterfaceC3524ik {

    /* JADX INFO: renamed from: ri */
    public static final C3436mj f12456ri = new C3436mj();

    private C3436mj() {
    }

    /* JADX INFO: renamed from: ri */
    private void m15672ri(AbstractRunnableC2676ik abstractRunnableC2676ik) {
        if (abstractRunnableC2676ik == null) {
            return;
        }
        if (dzy.xha()) {
            abstractRunnableC2676ik.run();
        } else {
            dzy.m16402lr(abstractRunnableC2676ik, 5);
        }
    }

    @Override // com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3524ik
    /* JADX INFO: renamed from: ri */
    public void mo15673ri(InterfaceC3522lr interfaceC3522lr) {
        mo15674ri(interfaceC3522lr, false);
    }

    @Override // com.bytedance.sdk.openadsdk.slm.p260lr.InterfaceC3524ik
    /* JADX INFO: renamed from: ri */
    public void mo15674ri(final InterfaceC3522lr interfaceC3522lr, final boolean z) {
        m15672ri(new AbstractRunnableC2676ik("uploadLogEvent") { // from class: com.bytedance.sdk.openadsdk.ka.ri.mj.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    InterfaceC3530ik interfaceC3530ikMo11574ri = interfaceC3522lr.mo11574ri();
                    if (interfaceC3530ikMo11574ri == null) {
                        return;
                    }
                    C2554ri c2554ri = new C2554ri(C3593su.m16658ri(), interfaceC3530ikMo11574ri.mo15966ri());
                    c2554ri.m9305ri((byte) 0);
                    c2554ri.m9302ik(z ? (byte) 2 : (byte) 3);
                    c2554ri.m9303lr((byte) 1);
                    if (C2555lr.m9310lr()) {
                        C3435lr.m15667ri(C3299nr.m14642ri());
                    }
                    C2555lr.m9312ri(c2554ri);
                } catch (Throwable unused) {
                }
            }
        });
    }
}
