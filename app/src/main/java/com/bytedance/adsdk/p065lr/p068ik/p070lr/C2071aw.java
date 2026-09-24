package com.bytedance.adsdk.p065lr.p068ik.p070lr;

import com.bytedance.adsdk.p065lr.jbs;
import com.bytedance.adsdk.p065lr.p068ik.p069ik.AbstractC2068ri;
import com.bytedance.adsdk.p065lr.p068ik.p071ri.InterfaceC2088aw;
import com.bytedance.adsdk.p065lr.p074ri.p076ri.C2146bu;
import com.bytedance.adsdk.p065lr.p074ri.p076ri.InterfaceC2150ik;
import com.bytedance.adsdk.p065lr.xha;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.ik.lr.aw */
/* JADX INFO: loaded from: classes3.dex */
public class C2071aw implements InterfaceC2076ik {

    /* JADX INFO: renamed from: lr */
    private final InterfaceC2088aw<Float, Float> f4916lr;

    /* JADX INFO: renamed from: ri */
    private final String f4917ri;

    public C2071aw(String str, InterfaceC2088aw<Float, Float> interfaceC2088aw) {
        this.f4917ri = str;
        this.f4916lr = interfaceC2088aw;
    }

    /* JADX INFO: renamed from: lr */
    public InterfaceC2088aw<Float, Float> m6800lr() {
        return this.f4916lr;
    }

    @Override // com.bytedance.adsdk.p065lr.p068ik.p070lr.InterfaceC2076ik
    /* JADX INFO: renamed from: ri */
    public InterfaceC2150ik mo6801ri(jbs jbsVar, xha xhaVar, AbstractC2068ri abstractC2068ri) {
        return new C2146bu(jbsVar, abstractC2068ri, this);
    }

    /* JADX INFO: renamed from: ri */
    public String m6802ri() {
        return this.f4917ri;
    }
}
