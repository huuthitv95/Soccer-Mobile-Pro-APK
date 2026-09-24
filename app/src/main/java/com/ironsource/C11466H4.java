package com.ironsource;

import com.ironsource.AbstractC12259j3;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.H4 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11466H4<Smash extends AbstractC12259j3<?>> extends AbstractC11514Jg<Smash> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11466H4(int i, boolean z, List<? extends Smash> waterfall) {
        super(i, z, waterfall);
        Intrinsics.checkNotNullParameter(waterfall, "waterfall");
    }

    @Override // com.ironsource.AbstractC11514Jg
    /* JADX INFO: renamed from: c */
    public void mo25980c(Smash smash) {
        Intrinsics.checkNotNullParameter(smash, "smash");
        IronLog.INTERNAL.verbose(smash.m31822g().name() + " - Smash " + smash.m31826k() + " is ready to load");
        smash.m31817a(true);
        m26240c().add(smash);
    }
}
