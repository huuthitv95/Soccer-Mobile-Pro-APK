package com.bytedance.adsdk.p077ri.p078lr.p081ik.p082ri;

import com.bytedance.adsdk.p077ri.p078lr.p081ik.InterfaceC2184ri;
import com.bytedance.adsdk.p077ri.p078lr.p083ka.EnumC2196ka;
import com.bytedance.adsdk.p077ri.p078lr.p084lr.InterfaceC2200ri;
import com.bytedance.adsdk.p077ri.p078lr.p084lr.p085ri.ihz;
import java.util.Deque;

/* JADX INFO: renamed from: com.bytedance.adsdk.ri.lr.ik.ri.ri */
/* JADX INFO: loaded from: classes3.dex */
public class C2192ri extends AbstractC2185di {
    @Override // com.bytedance.adsdk.p077ri.p078lr.p081ik.p082ri.AbstractC2185di
    /* JADX INFO: renamed from: ri */
    public int mo7273ri(String str, int i, Deque<InterfaceC2200ri> deque, InterfaceC2184ri interfaceC2184ri) {
        if (',' != m7272ri(i, str)) {
            return interfaceC2184ri.mo7270ri(str, i, deque);
        }
        deque.push(new ihz(EnumC2196ka.COMMA));
        return i + 1;
    }
}
