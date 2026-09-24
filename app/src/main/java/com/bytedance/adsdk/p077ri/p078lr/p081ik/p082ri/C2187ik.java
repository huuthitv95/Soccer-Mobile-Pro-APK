package com.bytedance.adsdk.p077ri.p078lr.p081ik.p082ri;

import com.bytedance.adsdk.p077ri.p078lr.p079fi.C2176ri;
import com.bytedance.adsdk.p077ri.p078lr.p081ik.InterfaceC2184ri;
import com.bytedance.adsdk.p077ri.p078lr.p083ka.EnumC2198ri;
import com.bytedance.adsdk.p077ri.p078lr.p084lr.InterfaceC2200ri;
import com.bytedance.adsdk.p077ri.p078lr.p084lr.p085ri.C2215uq;
import com.bytedance.adsdk.p077ri.p078lr.p084lr.p085ri.xha;
import java.util.Deque;

/* JADX INFO: renamed from: com.bytedance.adsdk.ri.lr.ik.ri.ik */
/* JADX INFO: loaded from: classes3.dex */
public class C2187ik extends AbstractC2185di {
    /* JADX INFO: renamed from: ri */
    private int m7274ri(String str, int i, Deque<InterfaceC2200ri> deque) {
        int i2;
        int i3 = 0;
        while (true) {
            i2 = i3 + i;
            char cRi = m7272ri(i2, str);
            if (!C2176ri.m7228lr(cRi) && !C2176ri.m7226ik(cRi) && '.' != cRi && '[' != cRi && ']' != cRi && '_' != cRi && '$' != cRi) {
                break;
            }
            i3++;
        }
        String strSubstring = str.substring(i, i2);
        if (EnumC2198ri.m7286ri(strSubstring) != null) {
            deque.push(new xha(strSubstring));
            return i2;
        }
        deque.push(new C2215uq(strSubstring));
        return i2;
    }

    @Override // com.bytedance.adsdk.p077ri.p078lr.p081ik.p082ri.AbstractC2185di
    /* JADX INFO: renamed from: ri */
    public int mo7273ri(String str, int i, Deque<InterfaceC2200ri> deque, InterfaceC2184ri interfaceC2184ri) {
        char cRi = m7272ri(i, str);
        return (C2176ri.m7228lr(cRi) || cRi == '$') ? m7274ri(str, i, deque) : interfaceC2184ri.mo7270ri(str, i, deque);
    }
}
