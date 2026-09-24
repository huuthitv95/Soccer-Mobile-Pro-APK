package com.mbridge.msdk.dycreator.viewobserver;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.mbridge.msdk.dycreator.viewobserver.f */
/* JADX INFO: compiled from: EffectSubject.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12993f extends AbstractC12988a {
    /* JADX INFO: renamed from: a */
    public void m36436a(Object obj) {
        InterfaceC12992e interfaceC12992e;
        ConcurrentHashMap<Integer, Object> concurrentHashMap = this.f35402b;
        if (concurrentHashMap == null || concurrentHashMap.size() <= 0) {
            return;
        }
        for (Map.Entry<Integer, Object> entry : this.f35402b.entrySet()) {
            if (entry != null) {
                try {
                    if (entry.getValue() != null && (interfaceC12992e = (InterfaceC12992e) entry.getValue()) != null) {
                        interfaceC12992e.mo36321a(obj);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
