package com.chartboost.sdk.impl;

import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.i0 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3812i0 {

    /* JADX INFO: renamed from: a */
    public static final C3812i0 f14536a = new C3812i0();

    /* JADX INFO: renamed from: a */
    public final Pair m17945a(C3950o1 appRequest, C3982pb params, Function2 loadOpenRTBAd, Function2 loadAdGet, Function2 loadNrpAd, AbstractC3628a0 adType, boolean z, C4197z6 nrpWaterfallEndpoints) {
        Intrinsics.checkNotNullParameter(appRequest, "appRequest");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(loadOpenRTBAd, "loadOpenRTBAd");
        Intrinsics.checkNotNullParameter(loadAdGet, "loadAdGet");
        Intrinsics.checkNotNullParameter(loadNrpAd, "loadNrpAd");
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(nrpWaterfallEndpoints, "nrpWaterfallEndpoints");
        if (appRequest.m18864c() != null) {
            return new Pair(loadOpenRTBAd, params);
        }
        return m17946a(adType, z, nrpWaterfallEndpoints) ? new Pair(loadNrpAd, params) : new Pair(loadAdGet, params);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m17946a(AbstractC3628a0 abstractC3628a0, boolean z, C4197z6 c4197z6) {
        String rewarded;
        if (!z) {
            return false;
        }
        if (Intrinsics.areEqual(abstractC3628a0, AbstractC3628a0.a.f13428g)) {
            rewarded = c4197z6.getBanner();
        } else if (Intrinsics.areEqual(abstractC3628a0, AbstractC3628a0.b.f13429g)) {
            rewarded = c4197z6.getInterstitial();
        } else {
            if (!Intrinsics.areEqual(abstractC3628a0, AbstractC3628a0.c.f13430g)) {
                throw new NoWhenBranchMatchedException();
            }
            rewarded = c4197z6.getRewarded();
        }
        return rewarded.length() > 0;
    }
}
