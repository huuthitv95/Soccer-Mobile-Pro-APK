package com.mbridge.msdk.dycreator.viewobserver;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.mbridge.msdk.dycreator.viewobserver.c */
/* JADX INFO: compiled from: ClickSubject.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12990c extends AbstractC12988a {
    /* JADX INFO: renamed from: a */
    public void m36434a(Object obj) {
        InterfaceC12989b interfaceC12989b;
        ConcurrentHashMap<Integer, Object> concurrentHashMap = this.f35402b;
        if (concurrentHashMap == null || concurrentHashMap.size() <= 0) {
            return;
        }
        for (Map.Entry<Integer, Object> entry : this.f35402b.entrySet()) {
            if (entry != null) {
                try {
                    if (entry.getValue() != null && (interfaceC12989b = (InterfaceC12989b) entry.getValue()) != null) {
                        interfaceC12989b.mo36323a(obj);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
