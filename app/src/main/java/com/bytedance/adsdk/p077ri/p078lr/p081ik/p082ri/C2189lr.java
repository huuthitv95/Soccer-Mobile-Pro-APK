package com.bytedance.adsdk.p077ri.p078lr.p081ik.p082ri;

import com.bytedance.adsdk.p077ri.p078lr.p081ik.InterfaceC2184ri;
import com.bytedance.adsdk.p077ri.p078lr.p084lr.InterfaceC2200ri;
import com.bytedance.adsdk.p077ri.p078lr.p084lr.p085ri.C2201ac;
import com.bytedance.adsdk.p077ri.p087ri.C2223ri;
import java.util.Deque;

/* JADX INFO: renamed from: com.bytedance.adsdk.ri.lr.ik.ri.lr */
/* JADX INFO: loaded from: classes3.dex */
public class C2189lr extends AbstractC2185di {
    @Override // com.bytedance.adsdk.p077ri.p078lr.p081ik.p082ri.AbstractC2185di
    /* JADX INFO: renamed from: ri */
    public int mo7273ri(String str, int i, Deque<InterfaceC2200ri> deque, InterfaceC2184ri interfaceC2184ri) {
        if ('\'' != m7272ri(i, str)) {
            return interfaceC2184ri.mo7270ri(str, i, deque);
        }
        int i2 = i + 1;
        int length = str.length();
        int i3 = i2;
        while (i3 < length && m7272ri(i3, str) != '\'') {
            i3++;
        }
        if (m7272ri(i3, str) != '\'') {
            throw new C2223ri("String expression not surrounded by '", str.substring(i));
        }
        deque.push(new C2201ac(str.substring(i2, i3)));
        return i3 + 1;
    }
}
