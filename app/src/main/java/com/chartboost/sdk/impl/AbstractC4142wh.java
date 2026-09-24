package com.chartboost.sdk.impl;

import com.chartboost.sdk.Mediation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.wh */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4142wh {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC3908m4 m19809a(String adType, String location, Mediation mediation, InterfaceC3911m7 eventTracker) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        return new C3931n4(adType, location, mediation, eventTracker);
    }

    /* JADX INFO: renamed from: a */
    public static final InterfaceC3911m7 m19810a() {
        return C3678c4.f13658b.mo17022b().mo19602a();
    }
}
