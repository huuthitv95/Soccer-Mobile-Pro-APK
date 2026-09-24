package com.bytedance.adsdk.p077ri.p078lr.p081ik.p082ri;

import com.bytedance.adsdk.p077ri.p078lr.p079fi.C2176ri;
import com.bytedance.adsdk.p077ri.p078lr.p081ik.InterfaceC2184ri;
import com.bytedance.adsdk.p077ri.p078lr.p083ka.EnumC2195ik;
import com.bytedance.adsdk.p077ri.p078lr.p084lr.InterfaceC2200ri;
import com.bytedance.adsdk.p077ri.p078lr.p084lr.p085ri.slm;
import java.util.Deque;

/* JADX INFO: renamed from: com.bytedance.adsdk.ri.lr.ik.ri.mj */
/* JADX INFO: loaded from: classes3.dex */
public class C2190mj extends AbstractC2185di {
    @Override // com.bytedance.adsdk.p077ri.p078lr.p081ik.p082ri.AbstractC2185di
    /* JADX INFO: renamed from: ri */
    public int mo7273ri(String str, int i, Deque<InterfaceC2200ri> deque, InterfaceC2184ri interfaceC2184ri) {
        if (!C2176ri.m7227ka(m7272ri(i, str))) {
            return interfaceC2184ri.mo7270ri(str, i, deque);
        }
        int i2 = i + 1;
        String str2 = new String(new char[]{m7272ri(i, str), m7272ri(i2, str)});
        if (EnumC2195ik.m7278ri(str2) != null) {
            deque.push(new slm(EnumC2195ik.m7278ri(str2)));
            return i + 2;
        }
        String strValueOf = String.valueOf(m7272ri(i, str));
        if (EnumC2195ik.m7278ri(strValueOf) != null) {
            deque.push(new slm(EnumC2195ik.m7278ri(strValueOf)));
            return i2;
        }
        throw new IllegalArgumentException("Unrecognized:" + strValueOf + "examine:" + str.substring(0, i));
    }
}
