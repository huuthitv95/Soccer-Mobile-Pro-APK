package com.bytedance.adsdk.p077ri.p078lr.p081ik.p082ri;

import com.bytedance.adsdk.p077ri.p078lr.p079fi.C2175lr;
import com.bytedance.adsdk.p077ri.p078lr.p081ik.InterfaceC2184ri;
import com.bytedance.adsdk.p077ri.p078lr.p083ka.EnumC2196ka;
import com.bytedance.adsdk.p077ri.p078lr.p083ka.EnumC2197lr;
import com.bytedance.adsdk.p077ri.p078lr.p084lr.InterfaceC2200ri;
import com.bytedance.adsdk.p077ri.p078lr.p084lr.p085ri.C2212qt;
import java.util.Deque;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes3.dex */
public class jbs extends AbstractC2185di {
    @Override // com.bytedance.adsdk.p077ri.p078lr.p081ik.p082ri.AbstractC2185di
    /* JADX INFO: renamed from: ri */
    public int mo7273ri(String str, int i, Deque<InterfaceC2200ri> deque, InterfaceC2184ri interfaceC2184ri) {
        InterfaceC2200ri interfaceC2200riPollFirst;
        if (')' != m7272ri(i, str)) {
            return interfaceC2184ri.mo7270ri(str, i, deque);
        }
        LinkedList<InterfaceC2200ri> linkedList = new LinkedList();
        while (true) {
            interfaceC2200riPollFirst = deque.pollFirst();
            if (interfaceC2200riPollFirst == null || interfaceC2200riPollFirst.mo7292ri() == EnumC2196ka.LEFT_PAREN || ((interfaceC2200riPollFirst instanceof C2212qt) && interfaceC2200riPollFirst.mo7292ri() == EnumC2197lr.METHOD && !((C2212qt) interfaceC2200riPollFirst).m7297ik())) {
                break;
            }
            linkedList.addFirst(interfaceC2200riPollFirst);
        }
        if (interfaceC2200riPollFirst == null) {
            throw new IllegalArgumentException(str.substring(0, i));
        }
        if (interfaceC2200riPollFirst.mo7292ri() != EnumC2197lr.METHOD) {
            deque.push(C2175lr.m7223ri(linkedList, str, i));
            return i + 1;
        }
        C2212qt c2212qt = (C2212qt) interfaceC2200riPollFirst;
        LinkedList linkedList2 = new LinkedList();
        LinkedList linkedList3 = new LinkedList();
        for (InterfaceC2200ri interfaceC2200ri : linkedList) {
            if (interfaceC2200ri.mo7292ri() == EnumC2196ka.COMMA) {
                linkedList2.add(C2175lr.m7223ri(linkedList3, str, i));
                linkedList3.clear();
            } else {
                linkedList3.addLast(interfaceC2200ri);
            }
        }
        if (!linkedList3.isEmpty()) {
            linkedList2.add(C2175lr.m7223ri(linkedList3, str, i));
        }
        c2212qt.m7299ri((InterfaceC2200ri[]) linkedList2.toArray(new InterfaceC2200ri[linkedList2.size()]));
        c2212qt.m7298ri(true);
        int i2 = i + 1;
        deque.push(c2212qt);
        return i2;
    }
}
