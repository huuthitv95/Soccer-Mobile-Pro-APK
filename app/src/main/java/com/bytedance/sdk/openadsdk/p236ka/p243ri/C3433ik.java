package com.bytedance.sdk.openadsdk.p236ka.p243ri;

import com.bytedance.sdk.component.p130di.p131ri.p133fi.InterfaceC2542ik;
import com.bytedance.sdk.component.p130di.p131ri.p133fi.InterfaceC2543ka;
import com.bytedance.sdk.component.xha.p170lr.C2742lr;
import com.bytedance.sdk.openadsdk.p172ac.C2751lr;

/* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.ka.ri.ik */
/* JADX INFO: loaded from: classes3.dex */
class C3433ik implements InterfaceC2542ik {

    /* JADX INFO: renamed from: ri */
    private final C2742lr f12446ri;

    public C3433ik() {
        C2742lr c2742lrM10410ik = C2751lr.m10463lr().m10466ik().m10410ik();
        this.f12446ri = c2742lrM10410ik;
        c2742lrM10410ik.m10373ri(7);
        c2742lrM10410ik.m10371lr("track_url");
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.p133fi.InterfaceC2542ik
    /* JADX INFO: renamed from: ri */
    public InterfaceC2543ka mo9234ri() {
        return new C3432fi(this.f12446ri.m10391ri());
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.p133fi.InterfaceC2542ik
    /* JADX INFO: renamed from: ri */
    public void mo9235ri(String str) {
        this.f12446ri.m10365ik(str);
    }

    @Override // com.bytedance.sdk.component.p130di.p131ri.p133fi.InterfaceC2542ik
    /* JADX INFO: renamed from: ri */
    public void mo9236ri(String str, String str2) {
        this.f12446ri.m10372lr(str, str2);
    }
}
