package com.bytedance.adsdk.p077ri.p078lr.p084lr.p085ri;

import com.bytedance.adsdk.p077ri.p078lr.p083ka.EnumC2193di;
import com.bytedance.adsdk.p077ri.p078lr.p083ka.EnumC2195ik;
import com.bytedance.adsdk.p077ri.p078lr.p083ka.InterfaceC2194fi;
import com.bytedance.adsdk.p077ri.p078lr.p084lr.InterfaceC2200ri;

/* JADX INFO: renamed from: com.bytedance.adsdk.ri.lr.lr.ri.bu */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2203bu implements InterfaceC2200ri {

    /* JADX INFO: renamed from: ik */
    protected EnumC2195ik f5450ik;

    /* JADX INFO: renamed from: lr */
    protected InterfaceC2200ri f5451lr;

    /* JADX INFO: renamed from: ri */
    protected InterfaceC2200ri f5452ri;

    protected AbstractC2203bu(EnumC2195ik enumC2195ik) {
        this.f5450ik = enumC2195ik;
    }

    @Override // com.bytedance.adsdk.p077ri.p078lr.p084lr.InterfaceC2200ri
    /* JADX INFO: renamed from: lr */
    public String mo7291lr() {
        return this.f5452ri.mo7291lr() + this.f5450ik.m7281ri() + this.f5451lr.mo7291lr();
    }

    /* JADX INFO: renamed from: lr */
    public void m7294lr(InterfaceC2200ri interfaceC2200ri) {
        this.f5451lr = interfaceC2200ri;
    }

    @Override // com.bytedance.adsdk.p077ri.p078lr.p084lr.InterfaceC2200ri
    /* JADX INFO: renamed from: ri */
    public InterfaceC2194fi mo7292ri() {
        return EnumC2193di.OPERATOR_RESULT;
    }

    /* JADX INFO: renamed from: ri */
    public void m7295ri(InterfaceC2200ri interfaceC2200ri) {
        this.f5452ri = interfaceC2200ri;
    }

    public String toString() {
        return mo7291lr();
    }
}
