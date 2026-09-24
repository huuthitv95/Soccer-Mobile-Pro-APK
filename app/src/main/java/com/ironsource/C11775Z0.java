package com.ironsource;

import com.unity3d.mediation.LevelPlay;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.Z0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11775Z0 {
    /* JADX INFO: renamed from: a */
    public final InterfaceC11741X0 m28058a(String adUnitId, LevelPlay.AdFormat adFormat, InterfaceC11452G8 sdkConfigService) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        Intrinsics.checkNotNullParameter(sdkConfigService, "sdkConfigService");
        if (adUnitId.length() == 0) {
            return new InterfaceC11741X0.a(C11758Y0.f26562a);
        }
        if (!sdkConfigService.mo25858c()) {
            return new InterfaceC11741X0.a(C11758Y0.f26563b);
        }
        C11666Sa c11666SaMo25856a = sdkConfigService.mo25856a();
        return (c11666SaMo25856a == null || !c11666SaMo25856a.m27464a(adUnitId, adFormat)) ? new InterfaceC11741X0.a(C11758Y0.f26564c) : InterfaceC11741X0.b.f26117a;
    }
}
