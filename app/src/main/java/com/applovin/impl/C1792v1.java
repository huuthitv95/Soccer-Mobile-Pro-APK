package com.applovin.impl;

import com.applovin.impl.sdk.C1734a;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: com.applovin.impl.v1 */
/* JADX INFO: loaded from: classes3.dex */
public class C1792v1 implements C1734a.a {

    /* JADX INFO: renamed from: a */
    private final C1748l f3456a;

    /* JADX INFO: renamed from: b */
    private final Map f3457b = new HashMap();

    /* JADX INFO: renamed from: c */
    private final Object f3458c = new Object();

    public C1792v1(C1748l c1748l) {
        this.f3456a = c1748l;
    }

    /* JADX INFO: renamed from: a */
    public C1539e3 m5361a(String str) {
        synchronized (this.f3458c) {
            List list = (List) this.f3457b.get(str);
            if (CollectionUtils.isEmpty(list)) {
                return null;
            }
            return (C1539e3) list.get(0);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m5362a(C1539e3 c1539e3) {
        if (AbstractC1821y3.m5706b(c1539e3)) {
            if (!this.f3456a.m4828f().m4431a(c1539e3, this)) {
                this.f3456a.m4797Z().destroyAd(c1539e3);
                return;
            }
            synchronized (this.f3458c) {
                String adUnitId = c1539e3.getAdUnitId();
                List arrayList = (List) this.f3457b.get(adUnitId);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    this.f3457b.put(adUnitId, arrayList);
                }
                double dM1822H = c1539e3.m1822H();
                int i = 0;
                while (i < arrayList.size() && dM1822H <= ((C1539e3) arrayList.get(i)).m1822H()) {
                    i++;
                }
                arrayList.add(i, c1539e3);
                if (arrayList.size() > ((Integer) this.f3456a.m4801a(AbstractC1776t3.f3326H8)).intValue()) {
                    C1539e3 c1539e4 = (C1539e3) arrayList.remove(arrayList.size() - 1);
                    this.f3456a.m4828f().m4430a(c1539e4);
                    this.f3456a.m4797Z().destroyAd(c1539e4);
                    this.f3456a.m4784R().m2095a(C1548f2.f1481I0, c1539e4);
                }
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m5363b(C1539e3 c1539e3) {
        synchronized (this.f3458c) {
            List list = (List) this.f3457b.get(c1539e3.getAdUnitId());
            if (CollectionUtils.isEmpty(list)) {
                return;
            }
            list.remove(c1539e3);
            this.f3456a.m4828f().m4430a(c1539e3);
        }
    }

    @Override // com.applovin.impl.sdk.C1734a.a
    public void onAdExpired(InterfaceC1783u1 interfaceC1783u1) {
        C1539e3 c1539e3 = (C1539e3) interfaceC1783u1;
        this.f3456a.m4782Q();
        if (C1768p.m5160a()) {
            this.f3456a.m4782Q().m5171a("FailoverAdCacheManager", "Failover ad expired for ad unit: " + c1539e3.getAdUnitId() + ". Removing from cache");
        }
        m5363b(c1539e3);
        this.f3456a.m4797Z().destroyAd(c1539e3);
        this.f3456a.m4784R().m2095a(C1548f2.f1479H0, c1539e3);
    }
}
