package com.chartboost.sdk.impl;

import com.chartboost.sdk.ads.Banner;
import com.chartboost.sdk.ads.InterfaceC3614Ad;
import com.chartboost.sdk.ads.Interstitial;
import com.chartboost.sdk.ads.Rewarded;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.r */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4014r {
    /* JADX INFO: renamed from: a */
    public static final AbstractC3628a0 m19220a(InterfaceC3614Ad interfaceC3614Ad) {
        Intrinsics.checkNotNullParameter(interfaceC3614Ad, "<this>");
        if (interfaceC3614Ad instanceof Interstitial) {
            return AbstractC3628a0.b.f13429g;
        }
        if (interfaceC3614Ad instanceof Rewarded) {
            return AbstractC3628a0.c.f13430g;
        }
        if (interfaceC3614Ad instanceof Banner) {
            return AbstractC3628a0.a.f13428g;
        }
        C4048sb.m19411b("Unknown ad type: " + Reflection.getOrCreateKotlinClass(interfaceC3614Ad.getClass()).getSimpleName() + ", defaulting to Interstitial", (Throwable) null, 2, (Object) null);
        return AbstractC3628a0.b.f13429g;
    }
}
