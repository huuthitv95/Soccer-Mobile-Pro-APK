package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.F4 */
/* JADX INFO: loaded from: classes6.dex */
public class C11430F4 extends AbstractC11461H {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11430F4(AbstractC12593x0 adUnitData, C12591wg waterfallInstances) {
        super(adUnitData, waterfallInstances);
        Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        Intrinsics.checkNotNullParameter(waterfallInstances, "waterfallInstances");
    }

    @Override // com.ironsource.AbstractC11461H
    /* JADX INFO: renamed from: a */
    public void mo25767a(AbstractC11353B instance, AbstractC11461H.b loadSelection) {
        Intrinsics.checkNotNullParameter(instance, "instance");
        Intrinsics.checkNotNullParameter(loadSelection, "loadSelection");
        IronLog.INTERNAL.verbose(instance.m25344d().name() + " - Instance " + instance.m25356q() + " is ready to load");
        loadSelection.m25960a().add(instance);
    }
}
