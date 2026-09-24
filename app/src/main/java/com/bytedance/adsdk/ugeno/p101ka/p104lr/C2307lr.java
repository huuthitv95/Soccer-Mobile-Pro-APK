package com.bytedance.adsdk.ugeno.p101ka.p104lr;

import com.bytedance.adsdk.ugeno.p101ka.C2285di;
import com.bytedance.adsdk.ugeno.p101ka.p105ri.C2315ri;
import com.bytedance.adsdk.ugeno.p101ka.p105ri.InterfaceC2312ik;
import com.bytedance.adsdk.ugeno.p101ka.p105ri.InterfaceC2313ka;
import com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ka.lr.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2307lr extends AbstractC2308ri {
    private List<InterfaceC2313ka> jbs;

    public C2307lr(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik, String str, C2285di.ri riVar) {
        super(abstractViewOnTouchListenerC2318ik, str, riVar);
        this.jbs = new CopyOnWriteArrayList();
    }

    @Override // com.bytedance.adsdk.ugeno.p101ka.p104lr.AbstractC2308ri
    /* JADX INFO: renamed from: ri */
    public void mo7759ri() {
        InterfaceC2312ik interfaceC2312ikM7809ri;
        if (this.f5835di == null || this.f5835di.size() <= 0) {
            return;
        }
        String str = this.f5835di.get("name");
        C2315ri c2315riM7846jc = this.f5837ik.m7846jc();
        if (c2315riM7846jc == null || (interfaceC2312ikM7809ri = c2315riM7846jc.m7809ri(str)) == null) {
            return;
        }
        interfaceC2312ikM7809ri.mo7808ri(str);
    }
}
