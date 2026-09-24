package com.ironsource;

import com.ironsource.AbstractC12259j3;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.p3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12417p3<Smash extends AbstractC12259j3<?>> extends AbstractC11514Jg<Smash> {

    /* JADX INFO: renamed from: h */
    private boolean f31674h;

    public /* synthetic */ C12417p3(int i, boolean z, List list, boolean z2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z, list, (i2 & 8) != 0 ? false : z2);
    }

    @Override // com.ironsource.AbstractC11514Jg
    /* JADX INFO: renamed from: c */
    public void mo25980c(Smash smash) {
        String str;
        Intrinsics.checkNotNullParameter(smash, "smash");
        if (!smash.m31835w()) {
            IronLog.INTERNAL.verbose(smash.m31822g().name() + " - Smash " + smash.mo26207c() + " (non-bidder) is ready to load");
            smash.m31817a(true);
            m26240c().add(smash);
            return;
        }
        this.f31674h = true;
        if (m26241d() == 0) {
            str = "Advanced Loading: Starting to load bidder " + smash.mo26207c() + ". No other instances will be loaded at the same time.";
            smash.m31817a(true);
            m26240c().add(smash);
        } else {
            str = "Advanced Loading: Won't start loading bidder " + smash.mo26207c() + " as a non bidder is being loaded";
        }
        IronLog.INTERNAL.verbose(smash.m31822g().name() + " - " + str);
        IronSourceUtils.m32782i(str);
    }

    @Override // com.ironsource.AbstractC11514Jg
    /* JADX INFO: renamed from: e */
    public boolean mo26243e() {
        return super.mo26243e() || this.f31674h;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12417p3(int i, boolean z, List<? extends Smash> waterfall, boolean z2) {
        super(i, z, waterfall);
        Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        this.f31674h = z2;
    }
}
