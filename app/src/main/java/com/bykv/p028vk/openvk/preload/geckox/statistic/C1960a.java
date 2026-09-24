package com.bykv.p028vk.openvk.preload.geckox.statistic;

import com.bykv.p028vk.openvk.preload.geckox.statistic.model.C1963a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.bykv.vk.openvk.preload.geckox.statistic.a */
/* JADX INFO: compiled from: StatisticDataManager.java */
/* JADX INFO: loaded from: classes3.dex */
final class C1960a {

    /* JADX INFO: renamed from: a */
    private static final Map<Long, C1960a> f4443a = new HashMap();

    /* JADX INFO: renamed from: b */
    private final Map<String, C1963a> f4444b = new HashMap();

    C1960a() {
    }

    /* JADX INFO: renamed from: a */
    static C1960a m6047a(long j) {
        C1960a c1960a;
        Map<Long, C1960a> map = f4443a;
        synchronized (map) {
            c1960a = map.get(Long.valueOf(j));
            if (c1960a == null) {
                c1960a = new C1960a();
                map.put(Long.valueOf(j), c1960a);
            }
        }
        return c1960a;
    }

    /* JADX INFO: renamed from: a */
    final C1963a m6048a(String str) {
        C1963a c1963a;
        synchronized (this.f4444b) {
            c1963a = this.f4444b.get(str);
            if (c1963a == null) {
                c1963a = new C1963a();
                this.f4444b.put(str, c1963a);
            }
        }
        return c1963a;
    }

    /* JADX INFO: renamed from: a */
    final List<C1963a> m6049a() {
        ArrayList arrayList;
        synchronized (this.f4444b) {
            arrayList = new ArrayList(this.f4444b.values());
        }
        return arrayList;
    }
}
