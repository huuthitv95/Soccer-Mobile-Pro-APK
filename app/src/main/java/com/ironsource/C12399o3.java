package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.o3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12399o3 extends AbstractC11461H {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12399o3(AbstractC12593x0 adUnitData, C12591wg waterfallInstances) {
        super(adUnitData, waterfallInstances);
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
    }

    @Override // com.ironsource.AbstractC11461H
    /* JADX INFO: renamed from: a */
    public void mo25767a(AbstractC11353B instance, AbstractC11461H.b loadSelection) {
        String str;
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(loadSelection, "loadSelection");
        if (!instance.m25360u()) {
            IronLog.INTERNAL.verbose(instance.m25344d().name() + " - Instance " + instance.m25355p() + " (non-bidder) is ready to load");
            loadSelection.m25960a().add(instance);
            return;
        }
        loadSelection.m25961a(true);
        if (loadSelection.m25965e()) {
            str = "Advanced Loading: Starting to load bidder " + instance.m25355p() + ". No other instances will be loaded at the same time.";
            loadSelection.m25960a().add(instance);
        } else {
            str = "Advanced Loading: Won't start loading bidder " + instance.m25355p() + " as a non bidder is being loaded";
        }
        IronLog.INTERNAL.verbose(instance.m25344d().name() + " - " + str);
    }

    @Override // com.ironsource.AbstractC11461H
    /* JADX INFO: renamed from: a */
    public boolean mo25956a(AbstractC11461H.b loadSelection) {
        Intrinsics.checkNotNullParameter(loadSelection, "loadSelection");
        return super.mo25956a(loadSelection) || loadSelection.m25964d();
    }
}
