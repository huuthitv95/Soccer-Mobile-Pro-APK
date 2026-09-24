package com.bytedance.adsdk.ugeno.p101ka;

import com.bytedance.adsdk.ugeno.p101ka.p104lr.AbstractC2308ri;
import com.bytedance.adsdk.ugeno.p101ka.p104lr.C2304fi;
import com.bytedance.adsdk.ugeno.p101ka.p104lr.C2306ka;
import com.bytedance.adsdk.ugeno.p101ka.p104lr.C2307lr;
import com.bytedance.adsdk.ugeno.p106lr.AbstractViewOnTouchListenerC2318ik;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.bytedance.adsdk.ugeno.ka.fi */
/* JADX INFO: loaded from: classes3.dex */
public class C2286fi implements InterfaceC2287ik {
    @Override // com.bytedance.adsdk.ugeno.p101ka.InterfaceC2287ik
    /* JADX INFO: renamed from: ri */
    public List<C2303lr> mo7757ri() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C2303lr("update") { // from class: com.bytedance.adsdk.ugeno.ka.fi.1
            @Override // com.bytedance.adsdk.ugeno.p101ka.C2303lr
            /* JADX INFO: renamed from: ri */
            public AbstractC2308ri mo7758ri(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik, String str, C2285di.ri riVar) {
                return new C2304fi(abstractViewOnTouchListenerC2318ik, str, riVar);
            }
        });
        arrayList.add(new C2303lr("emit") { // from class: com.bytedance.adsdk.ugeno.ka.fi.2
            @Override // com.bytedance.adsdk.ugeno.p101ka.C2303lr
            /* JADX INFO: renamed from: ri */
            public AbstractC2308ri mo7758ri(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik, String str, C2285di.ri riVar) {
                return new C2307lr(abstractViewOnTouchListenerC2318ik, str, riVar);
            }
        });
        arrayList.add(new C2303lr("startAnimate") { // from class: com.bytedance.adsdk.ugeno.ka.fi.3
            @Override // com.bytedance.adsdk.ugeno.p101ka.C2303lr
            /* JADX INFO: renamed from: ri */
            public AbstractC2308ri mo7758ri(AbstractViewOnTouchListenerC2318ik abstractViewOnTouchListenerC2318ik, String str, C2285di.ri riVar) {
                return new C2306ka(abstractViewOnTouchListenerC2318ik, str, riVar);
            }
        });
        return arrayList;
    }
}
