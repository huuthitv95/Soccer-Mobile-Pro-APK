package com.mbridge.msdk.dycreator.viewobserver;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.mbridge.msdk.dycreator.viewobserver.h */
/* JADX INFO: compiled from: ReportSubject.java */
/* JADX INFO: loaded from: classes5.dex */
public class C12995h extends AbstractC12988a {
    /* JADX INFO: renamed from: a */
    public void m36437a(Object obj) {
        InterfaceC12994g interfaceC12994g;
        ConcurrentHashMap<Integer, Object> concurrentHashMap = this.f35402b;
        if (concurrentHashMap == null || concurrentHashMap.size() <= 0) {
            return;
        }
        for (Map.Entry<Integer, Object> entry : this.f35402b.entrySet()) {
            if (entry != null) {
                try {
                    if (entry.getValue() != null && (interfaceC12994g = (InterfaceC12994g) entry.getValue()) != null) {
                        interfaceC12994g.mo36320a(obj);
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
