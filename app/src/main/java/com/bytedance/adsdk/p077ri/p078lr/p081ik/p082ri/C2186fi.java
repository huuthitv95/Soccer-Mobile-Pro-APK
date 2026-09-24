package com.bytedance.adsdk.p077ri.p078lr.p081ik.p082ri;

import com.bytedance.adsdk.p077ri.p078lr.p079fi.C2176ri;
import com.bytedance.adsdk.p077ri.p078lr.p081ik.InterfaceC2184ri;
import com.bytedance.adsdk.p077ri.p078lr.p084lr.InterfaceC2200ri;
import com.bytedance.adsdk.p077ri.p078lr.p084lr.p085ri.C2212qt;
import java.util.Deque;

/* JADX INFO: renamed from: com.bytedance.adsdk.ri.lr.ik.ri.fi */
/* JADX INFO: loaded from: classes3.dex */
public class C2186fi extends AbstractC2185di {
    @Override // com.bytedance.adsdk.p077ri.p078lr.p081ik.p082ri.AbstractC2185di
    /* JADX INFO: renamed from: ri */
    public int mo7273ri(String str, int i, Deque<InterfaceC2200ri> deque, InterfaceC2184ri interfaceC2184ri) {
        char cRi;
        int i2 = i;
        while (true) {
            cRi = m7272ri(i2, str);
            if (!C2176ri.m7228lr(cRi) && !C2176ri.m7226ik(cRi)) {
                break;
            }
            i2++;
        }
        if (cRi != '(') {
            return interfaceC2184ri.mo7270ri(str, i, deque);
        }
        deque.push(new C2212qt(str.substring(i, i2)));
        return i2 + 1;
    }
}
