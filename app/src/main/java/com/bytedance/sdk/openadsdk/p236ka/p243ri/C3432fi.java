package com.bytedance.sdk.openadsdk.p236ka.p243ri;

import com.bytedance.sdk.component.p130di.p131ri.p133fi.InterfaceC2543ka;
import com.bytedance.sdk.component.xha.C2739lr;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ka.ri.fi */
/* JADX INFO: loaded from: classes3.dex */
class C3432fi implements InterfaceC2543ka {

    /* JADX INFO: renamed from: ri */
    private final C2739lr f12445ri;

    public C3432fi(C2739lr c2739lr) {
        this.f12445ri = c2739lr;
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.p133fi.InterfaceC2543ka
    /* JADX INFO: renamed from: ik */
    public String mo9237ik() {
        C2739lr c2739lr = this.f12445ri;
        return c2739lr != null ? c2739lr.m10358lr() : "";
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.p133fi.InterfaceC2543ka
    /* JADX INFO: renamed from: lr */
    public int mo9238lr() {
        C2739lr c2739lr = this.f12445ri;
        if (c2739lr != null) {
            return c2739lr.m10359ri();
        }
        return -1;
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.p133fi.InterfaceC2543ka
    /* JADX INFO: renamed from: ri */
    public boolean mo9239ri() {
        C2739lr c2739lr = this.f12445ri;
        if (c2739lr != null) {
            return c2739lr.m10354di();
        }
        return false;
    }
}
