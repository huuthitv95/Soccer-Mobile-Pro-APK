package com.mbridge.msdk.dycreator.viewobserver;

import com.mbridge.msdk.dycreator.observable.C12976a;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.mbridge.msdk.dycreator.viewobserver.a */
/* JADX INFO: compiled from: BaseAbstractSubject.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC12988a extends C12976a {

    /* JADX INFO: renamed from: a */
    private List<Object> f35401a = new ArrayList();

    /* JADX INFO: renamed from: b */
    protected ConcurrentHashMap<Integer, Object> f35402b = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: a */
    public synchronized void m36433a(Object obj, int i) {
        if (obj != null) {
            ConcurrentHashMap<Integer, Object> concurrentHashMap = this.f35402b;
            if (concurrentHashMap != null && !concurrentHashMap.containsValue(obj)) {
                this.f35402b.put(Integer.valueOf(i), obj);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m36432a() {
        this.f35402b.clear();
    }
}
