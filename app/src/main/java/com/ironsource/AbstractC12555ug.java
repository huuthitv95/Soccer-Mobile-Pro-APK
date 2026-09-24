package com.ironsource;

import com.ironsource.mediationsdk.C12332c;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.ug */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC12555ug {

    /* JADX INFO: renamed from: d */
    public static final a f32581d = new a(null);

    /* JADX INFO: renamed from: a */
    private final C11707V0 f32582a;

    /* JADX INFO: renamed from: b */
    private final AbstractC12593x0 f32583b;

    /* JADX INFO: renamed from: c */
    private final InterfaceC11635Qc f32584c;

    /* JADX INFO: renamed from: com.ironsource.ug$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final AbstractC12555ug m33918a(C11707V0 adTools, AbstractC12593x0 adUnitData) {
            Intrinsics.checkNotNullParameter(adTools, "adTools");
            Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
            return adUnitData.m34090t() ? new C12523t2(adTools, adUnitData) : new C12641zc(adTools, adUnitData);
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.ironsource.ug$b */
    public static final class b implements InterfaceC11635Qc {
        b() {
        }

        @Override // com.ironsource.InterfaceC11635Qc
        /* JADX INFO: renamed from: a */
        public /* synthetic */ void mo27302a(AbstractC11353B abstractC11353B, String str, C12266ja c12266ja) {
            InterfaceC11635Qc.CC.$default$a(this, abstractC11353B, str, c12266ja);
        }

        @Override // com.ironsource.InterfaceC11635Qc
        /* JADX INFO: renamed from: a */
        public /* synthetic */ void mo27303a(List list, AbstractC11353B abstractC11353B) {
            InterfaceC11635Qc.CC.$default$a(this, list, abstractC11353B);
        }
    }

    public AbstractC12555ug(C11707V0 adTools, AbstractC12593x0 adUnitData) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        this.f32582a = adTools;
        this.f32583b = adUnitData;
        this.f32584c = new b();
    }

    /* JADX INFO: renamed from: a */
    public InterfaceC11635Qc mo33726a() {
        return this.f32584c;
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo33727a(InterfaceC11407E interfaceC11407E, InterfaceC12573vg interfaceC12573vg);

    /* JADX INFO: renamed from: a */
    public final C12591wg m33917a(List<? extends C12434q2> waterfallItems, Map<String, C11479I> adInstancePayloads, C12380n2 auctionData, InterfaceC11407E adInstanceFactory) {
        Intrinsics.checkNotNullParameter(waterfallItems, "waterfallItems");
        Intrinsics.checkNotNullParameter(adInstancePayloads, "adInstancePayloads");
        Intrinsics.checkNotNullParameter(auctionData, "auctionData");
        Intrinsics.checkNotNullParameter(adInstanceFactory, "adInstanceFactory");
        IronLog.INTERNAL.verbose(C12414p0.m33033a(this.f32582a, "waterfall.size() = " + waterfallItems.size(), (String) null, 2, (Object) null));
        ArrayList arrayList = new ArrayList();
        int size = waterfallItems.size();
        for (int i = 0; i < size; i++) {
            C12434q2 c12434q2 = waterfallItems.get(i);
            AbstractC11353B abstractC11353BM33915a = m33915a(c12434q2, auctionData, adInstanceFactory, adInstancePayloads.get(c12434q2.m33143c()));
            if (abstractC11353BM33915a != null && abstractC11353BM33915a.m25347g() != null) {
                arrayList.add(abstractC11353BM33915a);
            }
        }
        C12591wg c12591wg = new C12591wg(arrayList);
        IronLog.INTERNAL.verbose(C12414p0.m33033a(this.f32582a, "updateWaterfall() - next waterfall is " + c12591wg + ".toWaterfallString()", (String) null, 2, (Object) null));
        return c12591wg;
    }

    /* JADX INFO: renamed from: a */
    private final AbstractC11353B m33915a(C12434q2 c12434q2, C12380n2 c12380n2, InterfaceC11407E interfaceC11407E, C11479I c11479i) {
        AbstractC12593x0 abstractC12593x0 = this.f32583b;
        String strM33143c = c12434q2.m33143c();
        Intrinsics.checkNotNullExpressionValue(strM33143c, "item.instanceName");
        NetworkSettings networkSettingsM34071a = abstractC12593x0.m34071a(strM33143c);
        if (networkSettingsM34071a == null) {
            String strM33143c2 = c12434q2.m33143c();
            Intrinsics.checkNotNullExpressionValue(strM33143c2, "item.instanceName");
            m33916a("Could not find matching provider settings for auction response item", strM33143c2);
            return null;
        }
        if (c11479i == null) {
            String strM33143c3 = c12434q2.m33143c();
            Intrinsics.checkNotNullExpressionValue(strM33143c3, "item.instanceName");
            m33916a("Could not find matching adInstancePayload for auction response item", strM33143c3);
            return null;
        }
        C12332c.m32303b().m32322b(networkSettingsM34071a, this.f32583b.mo26467b().m31567a(), this.f32583b.mo26467b().m31569b());
        int iM33048f = this.f32582a.m33048f();
        AbstractC12593x0 abstractC12593x1 = this.f32583b;
        return interfaceC11407E.mo25641a(new C11371C(abstractC12593x1, networkSettingsM34071a, c12380n2, new C12159e1(networkSettingsM34071a, abstractC12593x1.mo26468b(networkSettingsM34071a), this.f32583b.mo26467b().m31567a()), c12434q2, iM33048f), c11479i);
    }

    /* JADX INFO: renamed from: a */
    private final void m33916a(String str, String str2) {
        String str3 = str + " - item = " + str2;
        IronLog.INTERNAL.error(C12414p0.m33033a(this.f32582a, str3, (String) null, 2, (Object) null));
        this.f32582a.m33047e().m34220h().m27988i(str3);
    }
}
