package com.ironsource;

import com.ironsource.mediationsdk.C12352e;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.h2 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12222h2 implements InterfaceC11635Qc {

    /* JADX INFO: renamed from: a */
    private final C11707V0 f30457a;

    /* JADX INFO: renamed from: b */
    private final C12352e f30458b;

    /* JADX INFO: renamed from: c */
    private boolean f30459c;

    public C12222h2(C11707V0 adTools, C12352e auctionHandler) {
        Intrinsics.checkNotNullParameter(adTools, "adTools");
        Intrinsics.checkNotNullParameter(auctionHandler, "auctionHandler");
        this.f30457a = adTools;
        this.f30458b = auctionHandler;
    }

    @Override // com.ironsource.InterfaceC11635Qc
    /* JADX INFO: renamed from: a */
    public void mo27302a(AbstractC11353B instance, String str, C12266ja publisherDataHolder) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(publisherDataHolder, "publisherDataHolder");
        this.f30458b.m32461a(instance.m25348h(), instance.m25357r(), instance.m25353m(), str);
        m31581a(publisherDataHolder, instance);
    }

    @Override // com.ironsource.InterfaceC11635Qc
    /* JADX INFO: renamed from: a */
    public void mo27303a(List<? extends AbstractC11353B> waterfallInstances, AbstractC11353B winnerInstance) {
        Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
        Intrinsics.checkNotNullParameter(winnerInstance, "winnerInstance");
        if (this.f30459c) {
            return;
        }
        this.f30459c = true;
        C12434q2 c12434q2M25348h = winnerInstance.m25348h();
        this.f30458b.m32460a(c12434q2M25348h, winnerInstance.m25357r(), winnerInstance.m25353m());
        ArrayList<String> arrayList = new ArrayList<>();
        ConcurrentHashMap<String, C12434q2> concurrentHashMap = new ConcurrentHashMap<>();
        for (AbstractC11353B abstractC11353B : waterfallInstances) {
            arrayList.add(abstractC11353B.m25355p());
            concurrentHashMap.put(abstractC11353B.m25355p(), abstractC11353B.m25348h());
        }
        this.f30458b.m32462a(arrayList, concurrentHashMap, winnerInstance.m25357r(), winnerInstance.m25353m(), c12434q2M25348h);
    }

    /* JADX INFO: renamed from: a */
    private final void m31581a(C12266ja c12266ja, AbstractC11353B abstractC11353B) {
        final C11698U8 c11698u8 = new C11698U8(abstractC11353B.mo25345e());
        for (final ImpressionDataListener impressionDataListener : new HashSet(c12266ja.m31873a())) {
            this.f30457a.m33246e(new Runnable() { // from class: com.ironsource.h2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    C12222h2.m31580a(this.f$0, impressionDataListener, c11698u8);
                }
            });
            this.f30457a.m33047e().m34220h().m27969a(c11698u8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public static final void m31580a(C12222h2 this$0, ImpressionDataListener listener, C11698U8 impressionData) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(impressionData, "$impressionData");
        IronLog.CALLBACK.verbose(C12414p0.m33033a(this$0.f30457a, "onImpressionSuccess " + listener.getClass().getSimpleName() + ": " + impressionData, (String) null, 2, (Object) null));
        listener.onImpressionSuccess(impressionData);
    }
}
