package com.chartboost.sdk.impl;

import com.chartboost.sdk.events.ChartboostError;
import com.chartboost.sdk.internal.Networking.okhttp.AbstractC4219a;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.d9 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC3706d9 {
    /* JADX INFO: renamed from: a */
    public static final ChartboostError m17262a(AbstractC4219a abstractC4219a, String url) {
        Intrinsics.checkNotNullParameter(abstractC4219a, "<this>");
        Intrinsics.checkNotNullParameter(url, "url");
        if (abstractC4219a instanceof AbstractC4219a.i) {
            return new ChartboostError.Load.AssetUnavailable(url, "Asset not found.", abstractC4219a);
        }
        if ((abstractC4219a instanceof AbstractC4219a.b) || (abstractC4219a instanceof AbstractC4219a.n) || (abstractC4219a instanceof AbstractC4219a.f) || (abstractC4219a instanceof AbstractC4219a.e)) {
            return new ChartboostError.Load.InvalidRequest(abstractC4219a.getMessage(), abstractC4219a);
        }
        if ((abstractC4219a instanceof AbstractC4219a.l) || (abstractC4219a instanceof AbstractC4219a.a) || (abstractC4219a instanceof AbstractC4219a.h) || (abstractC4219a instanceof AbstractC4219a.k)) {
            return new ChartboostError.Connectivity.ServerError(abstractC4219a.getMessage(), abstractC4219a);
        }
        if ((abstractC4219a instanceof AbstractC4219a.j) || (abstractC4219a instanceof AbstractC4219a.g)) {
            return ChartboostError.Connectivity.TimedOut.INSTANCE;
        }
        if (abstractC4219a instanceof AbstractC4219a.m) {
            return ChartboostError.Load.RateLimited.INSTANCE;
        }
        if (abstractC4219a instanceof AbstractC4219a.c) {
            return new ChartboostError.Load.InvalidRequest(abstractC4219a.getMessage(), abstractC4219a);
        }
        return abstractC4219a instanceof AbstractC4219a.o ? new ChartboostError.Connectivity.Unknown(abstractC4219a.getMessage(), abstractC4219a) : new ChartboostError.Connectivity.Unknown(abstractC4219a.getMessage(), abstractC4219a);
    }
}
