package com.bytedance.adsdk.ugeno.p101ka.p105ri;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ka.ri.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2315ri {

    /* JADX INFO: renamed from: ri */
    private volatile Map<String, InterfaceC2312ik> f5849ri = new HashMap();

    /* JADX INFO: renamed from: ri */
    public InterfaceC2312ik m7809ri(String str) {
        if (this.f5849ri.containsKey(str) && this.f5849ri.get(str) != null) {
            return this.f5849ri.get(str);
        }
        C2314lr c2314lr = new C2314lr();
        this.f5849ri.put(str, c2314lr);
        return c2314lr;
    }

    /* JADX INFO: renamed from: ri */
    public void m7810ri(String str, InterfaceC2312ik interfaceC2312ik) {
        if (!this.f5849ri.containsKey(str) || this.f5849ri.get(str) == null) {
            this.f5849ri.put(str, interfaceC2312ik);
        }
    }
}
