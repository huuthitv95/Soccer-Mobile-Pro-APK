package com.bytedance.adsdk.p077ri.p078lr.p081ik.p082ri;

import com.bytedance.adsdk.p077ri.p078lr.p079fi.C2176ri;
import com.bytedance.adsdk.p077ri.p078lr.p081ik.InterfaceC2184ri;
import com.bytedance.adsdk.p077ri.p078lr.p083ka.EnumC2195ik;
import com.bytedance.adsdk.p077ri.p078lr.p084lr.InterfaceC2200ri;
import com.bytedance.adsdk.p077ri.p078lr.p084lr.p085ri.C2216vr;
import java.util.Deque;

/* JADX INFO: loaded from: classes3.dex */
public class xha extends AbstractC2185di {
    /* JADX INFO: renamed from: ri */
    private boolean m7275ri(String str, int i, Deque<InterfaceC2200ri> deque) {
        if ('-' != m7272ri(i, str)) {
            return C2176ri.m7226ik(m7272ri(i, str));
        }
        if (deque.peek() != null && !EnumC2195ik.m7279ri(deque.peek().mo7292ri())) {
            return false;
        }
        if (C2176ri.m7226ik(m7272ri(i + 1, str))) {
            return true;
        }
        throw new IllegalArgumentException("Unrecognized - symbol, not a negative number or operator, problem range:" + str.substring(0, i));
    }

    @Override // com.bytedance.adsdk.p077ri.p078lr.p081ik.p082ri.AbstractC2185di
    /* JADX INFO: renamed from: ri */
    public int mo7273ri(String str, int i, Deque<InterfaceC2200ri> deque, InterfaceC2184ri interfaceC2184ri) {
        char cRi;
        if (!m7275ri(str, i, deque)) {
            return interfaceC2184ri.mo7270ri(str, i, deque);
        }
        int i2 = m7272ri(i, str) == '-' ? i + 1 : i;
        boolean z = false;
        while (true) {
            cRi = m7272ri(i2, str);
            if (!C2176ri.m7226ik(cRi) && (z || cRi != '.')) {
                break;
            }
            i2++;
            if (cRi == '.') {
                z = true;
            }
        }
        if (cRi != '.') {
            deque.push(new C2216vr(str.substring(i, i2)));
            return i2;
        }
        throw new IllegalArgumentException("Illegal negative number format, problem interval:" + str.substring(i, i2));
    }
}
