package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

/* JADX INFO: renamed from: com.ironsource.S0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11656S0 extends C12106b2 {

    /* JADX INFO: renamed from: e */
    private final Map<String, C11533L> f25608e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11656S0(List<? extends NetworkSettings> providers, int i) {
        super(providers, i);
        Intrinsics.checkNotNullParameter(providers, "providers");
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(providers, 10)), 16));
        Iterator<T> it = providers.iterator();
        while (it.hasNext()) {
            Pair pairM43482to = TuplesKt.m43482to(((NetworkSettings) it.next()).getProviderName(), new C11533L(i));
            linkedHashMap.put(pairM43482to.getFirst(), pairM43482to.getSecond());
        }
        this.f25608e = linkedHashMap;
    }

    /* JADX INFO: renamed from: a */
    public final void m27406a(C12591wg waterfallInstances) {
        Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        List<AbstractC11353B> listM34067b = waterfallInstances.m34067b();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(listM34067b, 10)), 16));
        for (AbstractC11353B abstractC11353B : listM34067b) {
            Pair pairM43482to = TuplesKt.m43482to(abstractC11353B.m25355p(), abstractC11353B.m25358s());
            linkedHashMap.put(pairM43482to.getFirst(), pairM43482to.getSecond());
        }
        m27404a(linkedHashMap);
    }

    @Override // com.ironsource.C12106b2
    /* JADX INFO: renamed from: a */
    public String mo27405a(String instanceName) {
        String strM26317d;
        Intrinsics.checkNotNullParameter(instanceName, "instanceName");
        C11533L c11533l = this.f25608e.get(instanceName);
        return (c11533l == null || (strM26317d = c11533l.m26317d()) == null) ? "" : strM26317d;
    }

    /* JADX INFO: renamed from: a */
    private final void m27404a(Map<String, C11497J> map) {
        for (Map.Entry<String, C11533L> entry : this.f25608e.entrySet()) {
            entry.getValue().m26316a(map.get(entry.getKey()));
        }
    }
}
