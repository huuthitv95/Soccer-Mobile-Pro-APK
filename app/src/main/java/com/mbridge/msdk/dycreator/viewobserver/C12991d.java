package com.mbridge.msdk.dycreator.viewobserver;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.mbridge.msdk.dycreator.viewobserver.d */
/* JADX INFO: compiled from: ConcreteSubject.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12991d extends AbstractC12988a {
    /* JADX INFO: renamed from: a */
    public void m36435a(Object obj) {
        InterfaceC12996i interfaceC12996i;
        try {
            synchronized (this) {
                ConcurrentHashMap<Integer, Object> concurrentHashMap = this.f35402b;
                if (concurrentHashMap != null && concurrentHashMap.size() > 0) {
                    for (Map.Entry<Integer, Object> entry : this.f35402b.entrySet()) {
                        if (entry != null && (entry.getValue() instanceof InterfaceC12996i) && (interfaceC12996i = (InterfaceC12996i) entry.getValue()) != null) {
                            interfaceC12996i.mo36322a(obj);
                        }
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
