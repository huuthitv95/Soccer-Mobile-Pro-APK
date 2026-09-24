package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.flow.C8124h0;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class InneractiveAdSpotManager {

    /* JADX INFO: renamed from: a */
    public final ConcurrentHashMap f17917a = new ConcurrentHashMap();

    public static void destroy() {
        ConcurrentHashMap concurrentHashMap = get().f17917a;
        Iterator it = concurrentHashMap.keySet().iterator();
        while (it.hasNext()) {
            InneractiveAdSpot inneractiveAdSpot = (InneractiveAdSpot) concurrentHashMap.get((String) it.next());
            if (inneractiveAdSpot != null) {
                inneractiveAdSpot.destroy();
            }
        }
        concurrentHashMap.clear();
    }

    public static InneractiveAdSpotManager get() {
        return AbstractC8058e.f17943a;
    }

    public void bindSpot(InneractiveAdSpot inneractiveAdSpot) {
        this.f17917a.put(inneractiveAdSpot.getLocalUniqueId(), inneractiveAdSpot);
    }

    public InneractiveAdSpot createSpot() {
        C8124h0 c8124h0 = new C8124h0();
        this.f17917a.put(c8124h0.f18073a, c8124h0);
        return c8124h0;
    }

    public InneractiveAdSpot getSpot(String str) {
        return (InneractiveAdSpot) this.f17917a.get(str);
    }

    public void removeSpot(InneractiveAdSpot inneractiveAdSpot) {
        ConcurrentHashMap concurrentHashMap = this.f17917a;
        if (concurrentHashMap != null) {
            concurrentHashMap.remove(inneractiveAdSpot.getLocalUniqueId());
        }
    }
}
