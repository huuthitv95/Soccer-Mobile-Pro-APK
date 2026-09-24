package com.applovin.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.applovin.impl.x3 */
/* JADX INFO: loaded from: classes3.dex */
public class C1812x3 {

    /* JADX INFO: renamed from: a */
    private final List f3556a = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: com.applovin.impl.x3$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo3662a(AbstractC1482a3 abstractC1482a3);
    }

    /* JADX INFO: renamed from: a */
    public void m5575a(AbstractC1482a3 abstractC1482a3) {
        Iterator it = new ArrayList(this.f3556a).iterator();
        while (it.hasNext()) {
            ((a) it.next()).mo3662a(abstractC1482a3);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m5576a(a aVar) {
        this.f3556a.add(aVar);
    }

    /* JADX INFO: renamed from: b */
    public void m5577b(a aVar) {
        this.f3556a.remove(aVar);
    }
}
