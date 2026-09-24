package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.s */
/* JADX INFO: loaded from: classes6.dex */
public final class C12467s implements InterfaceC12209g7, InterfaceC12209g7.a {

    /* JADX INFO: renamed from: a */
    private final Map<IronSource.EnumC12328a, AtomicBoolean> f31862a = MapsKt.mapOf(TuplesKt.m43482to(IronSource.EnumC12328a.REWARDED_VIDEO, new AtomicBoolean(false)), TuplesKt.m43482to(IronSource.EnumC12328a.INTERSTITIAL, new AtomicBoolean(false)), TuplesKt.m43482to(IronSource.EnumC12328a.BANNER, new AtomicBoolean(false)));

    @Override // com.ironsource.InterfaceC12209g7.a
    /* JADX INFO: renamed from: a */
    public void mo31546a(IronSource.EnumC12328a adFormat, boolean z) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        AtomicBoolean atomicBoolean = this.f31862a.get(adFormat);
        if (atomicBoolean != null) {
            atomicBoolean.set(z);
        }
    }

    @Override // com.ironsource.InterfaceC12209g7
    /* JADX INFO: renamed from: a */
    public boolean mo31545a(IronSource.EnumC12328a adFormat) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        AtomicBoolean atomicBoolean = this.f31862a.get(adFormat);
        if (atomicBoolean != null) {
            return atomicBoolean.get();
        }
        return false;
    }
}
