package com.bytedance.sdk.component.adexpress.p125lr;

import android.content.Context;
import android.view.View;

/* JADX INFO: renamed from: com.bytedance.sdk.component.adexpress.lr.di */
/* JADX INFO: loaded from: classes3.dex */
public class C2502di implements InterfaceC2508qt {

    /* JADX INFO: renamed from: ik */
    private C2500aw f6943ik;

    /* JADX INFO: renamed from: lr */
    private AbstractC2509ri f6944lr;

    /* JADX INFO: renamed from: ri */
    private Context f6945ri;

    public C2502di(Context context, C2500aw c2500aw, AbstractC2509ri abstractC2509ri) {
        this.f6945ri = context;
        this.f6944lr = abstractC2509ri;
        this.f6943ik = c2500aw;
    }

    @Override // com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2508qt
    /* JADX INFO: renamed from: ri */
    public void mo8978ri() {
    }

    /* JADX INFO: renamed from: ri */
    public void m8979ri(InterfaceC2504ik interfaceC2504ik) {
        this.f6944lr.mo9003ri(interfaceC2504ik);
    }

    @Override // com.bytedance.sdk.component.adexpress.p125lr.InterfaceC2508qt
    /* JADX INFO: renamed from: ri */
    public boolean mo8980ri(final InterfaceC2508qt.ri riVar) {
        this.f6943ik.m8881fi().xha(0);
        this.f6944lr.mo8759ri(new xha() { // from class: com.bytedance.sdk.component.adexpress.lr.di.1
            @Override // com.bytedance.sdk.component.adexpress.p125lr.xha
            /* JADX INFO: renamed from: ri */
            public void mo8981ri(int i, String str) {
                InterfaceC2513vr interfaceC2513vrMo8971lr = riVar.mo8971lr();
                if (interfaceC2513vrMo8971lr != null) {
                    interfaceC2513vrMo8971lr.mo9010a_(i);
                }
            }

            @Override // com.bytedance.sdk.component.adexpress.p125lr.xha
            /* JADX INFO: renamed from: ri */
            public void mo8982ri(View view, bgr bgrVar) {
                if (riVar.mo8970ik()) {
                    return;
                }
                InterfaceC2513vr interfaceC2513vrMo8971lr = riVar.mo8971lr();
                if (interfaceC2513vrMo8971lr != null) {
                    interfaceC2513vrMo8971lr.mo9011ri(C2502di.this.f6944lr, bgrVar);
                }
                riVar.mo8976ri(true);
            }
        });
        return true;
    }
}
