package com.bykv.p028vk.openvk.preload.p029a;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.bykv.vk.openvk.preload.a.c */
/* JADX INFO: compiled from: Factory.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C1885c {
    /* JADX INFO: renamed from: a */
    public static <IN> InterfaceC1882b<IN> m5845a(List<C1890h> list, InterfaceC1887e interfaceC1887e) {
        return m5846a(list, interfaceC1887e, null);
    }

    /* JADX INFO: renamed from: a */
    static <IN> InterfaceC1882b<IN> m5846a(List<C1890h> list, InterfaceC1887e interfaceC1887e, AbstractC1886d abstractC1886d) {
        if (list == null) {
            throw new IllegalArgumentException("interceptors == null !");
        }
        if (interfaceC1887e == null) {
            interfaceC1887e = new InterfaceC1887e.a();
        }
        return new C1891i(Collections.unmodifiableList(new ArrayList(list)), 0, interfaceC1887e, abstractC1886d);
    }
}
