package com.bytedance.adsdk.ugeno.p101ka.p105ri;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ka.ri.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2314lr implements InterfaceC2312ik {

    /* JADX INFO: renamed from: ri */
    private List<InterfaceC2313ka> f5848ri = new CopyOnWriteArrayList();

    @Override // com.bytedance.adsdk.ugeno.p101ka.p105ri.InterfaceC2312ik
    /* JADX INFO: renamed from: ri */
    public void mo7807ri(InterfaceC2313ka interfaceC2313ka) {
        this.f5848ri.add(interfaceC2313ka);
    }

    @Override // com.bytedance.adsdk.ugeno.p101ka.p105ri.InterfaceC2312ik
    /* JADX INFO: renamed from: ri */
    public void mo7808ri(String str) {
        if (this.f5848ri.isEmpty()) {
            return;
        }
        Iterator<InterfaceC2313ka> it = this.f5848ri.iterator();
        while (it.hasNext()) {
            it.next().mo7792ri(str);
        }
    }
}
