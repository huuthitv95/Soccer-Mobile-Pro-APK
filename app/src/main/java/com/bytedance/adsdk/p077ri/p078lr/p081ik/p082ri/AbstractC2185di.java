package com.bytedance.adsdk.p077ri.p078lr.p081ik.p082ri;

import com.bytedance.adsdk.p077ri.p078lr.p079fi.C2176ri;
import com.bytedance.adsdk.p077ri.p078lr.p081ik.InterfaceC2184ri;
import com.bytedance.adsdk.p077ri.p078lr.p084lr.InterfaceC2200ri;
import java.util.Deque;

/* JADX INFO: renamed from: com.bytedance.adsdk.ri.lr.ik.ri.di */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2185di {
    /* JADX INFO: renamed from: lr */
    protected int m7271lr(int i, String str) {
        while (C2176ri.m7229ri(m7272ri(i, str))) {
            i++;
        }
        return i;
    }

    /* JADX INFO: renamed from: ri */
    protected char m7272ri(int i, String str) {
        if (i >= str.length()) {
            return (char) 26;
        }
        return str.charAt(i);
    }

    /* JADX INFO: renamed from: ri */
    public abstract int mo7273ri(String str, int i, Deque<InterfaceC2200ri> deque, InterfaceC2184ri interfaceC2184ri);
}
