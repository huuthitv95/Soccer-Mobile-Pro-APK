package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
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
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.zc */
/* JADX INFO: loaded from: classes6.dex */
public final class C12641zc extends AbstractC12555ug {

    /* JADX INFO: renamed from: e */
    private final C11707V0 f33301e;

    /* JADX INFO: renamed from: f */
    private final AbstractC12593x0 f33302f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12641zc(C11707V0 tools, AbstractC12593x0 adUnitData) {
        super(tools, adUnitData);
        Intrinsics.checkNotNullParameter(tools, "tools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        this.f33301e = tools;
        this.f33302f = adUnitData;
    }

    /* JADX INFO: renamed from: b */
    private final C12380n2 m34315b() {
        return new C12380n2("", new JSONObject(), null, 0, "");
    }

    /* JADX INFO: renamed from: c */
    private final Map<String, C11479I> m34316c() {
        C11405Df c11405DfM31574g = this.f33302f.mo26467b().m31574g();
        List<NetworkSettings> listM34083m = this.f33302f.m34083m();
        ArrayList<NetworkSettings> arrayList = new ArrayList();
        for (Object obj : listM34083m) {
            NetworkSettings networkSettings = (NetworkSettings) obj;
            if (c11405DfM31574g == null || c11405DfM31574g.m25634a(networkSettings, this.f33302f.mo26467b().m31567a())) {
                if (!networkSettings.isBidder(this.f33302f.mo26467b().m31567a())) {
                    arrayList.add(obj);
                }
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(arrayList, 10)), 16));
        for (NetworkSettings networkSettings2 : arrayList) {
            Pair pairM43482to = TuplesKt.m43482to(networkSettings2.getProviderInstanceName(), new C11479I(this.f33301e, this.f33302f, networkSettings2));
            linkedHashMap.put(pairM43482to.getFirst(), pairM43482to.getSecond());
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: d */
    private final List<C12434q2> m34317d() {
        C11405Df c11405DfM31574g = this.f33302f.mo26467b().m31574g();
        List<NetworkSettings> listM34083m = this.f33302f.m34083m();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM34083m) {
            NetworkSettings networkSettings = (NetworkSettings) obj;
            if (c11405DfM31574g == null || c11405DfM31574g.m25634a(networkSettings, this.f33302f.mo26467b().m31567a())) {
                if (!networkSettings.isBidder(this.f33302f.mo26467b().m31567a())) {
                    arrayList.add(obj);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new C12434q2(((NetworkSettings) it.next()).getProviderInstanceName()));
        }
        return arrayList2;
    }

    @Override // com.ironsource.AbstractC12555ug
    /* JADX INFO: renamed from: a */
    public void mo33727a(InterfaceC11407E adInstanceFactory, InterfaceC12573vg waterfallFetcherListener) {
        Intrinsics.checkNotNullParameter(adInstanceFactory, "adInstanceFactory");
        Intrinsics.checkNotNullParameter(waterfallFetcherListener, "waterfallFetcherListener");
        IronLog.INTERNAL.verbose(C12414p0.m33033a(this.f33301e, "auction disabled", (String) null, 2, (Object) null));
        m34314a(waterfallFetcherListener, m34315b(), adInstanceFactory);
    }

    /* JADX INFO: renamed from: a */
    public final void m34318a(InterfaceC12573vg waterfallFetcherListener, int i, String auctionFallback, String auctionId, InterfaceC11407E adInstanceFactory) {
        Intrinsics.checkNotNullParameter(waterfallFetcherListener, "waterfallFetcherListener");
        Intrinsics.checkNotNullParameter(auctionFallback, "auctionFallback");
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(adInstanceFactory, "adInstanceFactory");
        m34314a(waterfallFetcherListener, new C12380n2(auctionId, new JSONObject(), null, i, auctionFallback), adInstanceFactory);
    }

    /* JADX INFO: renamed from: a */
    private final void m34314a(InterfaceC12573vg interfaceC12573vg, C12380n2 c12380n2, InterfaceC11407E interfaceC11407E) {
        IronLog.INTERNAL.verbose(C12414p0.m33033a(this.f33301e, (String) null, (String) null, 3, (Object) null));
        interfaceC12573vg.mo33272a(m33917a(m34317d(), m34316c(), c12380n2, interfaceC11407E));
    }
}
