package com.bytedance.sdk.openadsdk.p246nr;

import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.core.C3304qt;
import com.bytedance.sdk.openadsdk.core.C3332vr;
import com.bytedance.sdk.openadsdk.p246nr.p249lr.C3481ri;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.nr.fi */
/* JADX INFO: loaded from: classes3.dex */
class C3475fi implements InterfaceC3478ka {

    /* JADX INFO: renamed from: ik */
    private int f12565ik;

    /* JADX INFO: renamed from: ka */
    private int f12566ka;

    /* JADX INFO: renamed from: lr */
    private int f12567lr;

    /* JADX INFO: renamed from: ri */
    private InterfaceC3478ka f12568ri;

    public C3475fi(InterfaceC3478ka interfaceC3478ka, int i, int i2, int i3) {
        this.f12568ri = interfaceC3478ka;
        this.f12567lr = i;
        this.f12565ik = i2;
        this.f12566ka = i3;
    }

    @Override // com.bytedance.sdk.openadsdk.p246nr.InterfaceC3478ka
    /* JADX INFO: renamed from: ri */
    public C3481ri mo10650ri() {
        C3481ri c3481riMo10650ri = this.f12568ri.mo10650ri();
        c3481riMo10650ri.m15790ri(BuildConfig.VERSION_NAME);
        c3481riMo10650ri.m15788ri(this.f12567lr);
        c3481riMo10650ri.m15782lr(this.f12565ik);
        c3481riMo10650ri.m15776ik(this.f12566ka);
        c3481riMo10650ri.m15772di(C3304qt.m14669lr().xha());
        c3481riMo10650ri.m15779ka(C3332vr.m14977ka());
        return c3481riMo10650ri;
    }
}
