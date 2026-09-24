package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.rb */
/* JADX INFO: loaded from: classes3.dex */
public final class C4026rb {

    /* JADX INFO: renamed from: a */
    public final C3825id f16164a;

    /* JADX INFO: renamed from: b */
    public final String f16165b;

    /* JADX INFO: renamed from: c */
    public final C4168y f16166c;

    public C4026rb(C3825id multiRenderable, String auctionId, C4168y adMarkupConfig) {
        Intrinsics.checkNotNullParameter(multiRenderable, "multiRenderable");
        Intrinsics.checkNotNullParameter(auctionId, "auctionId");
        Intrinsics.checkNotNullParameter(adMarkupConfig, "adMarkupConfig");
        this.f16164a = multiRenderable;
        this.f16165b = auctionId;
        this.f16166c = adMarkupConfig;
    }

    /* JADX INFO: renamed from: a */
    public final C4168y m19329a() {
        return this.f16166c;
    }

    /* JADX INFO: renamed from: b */
    public final String m19330b() {
        return this.f16165b;
    }

    /* JADX INFO: renamed from: c */
    public final C3825id m19331c() {
        return this.f16164a;
    }
}
