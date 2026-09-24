package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C12431q {

    /* JADX INFO: renamed from: a */
    private final Boolean f31728a;

    public C12431q(JSONObject adFormatAuctionSettings) {
        Intrinsics.checkNotNullParameter(adFormatAuctionSettings, "adFormatAuctionSettings");
        this.f31728a = adFormatAuctionSettings.has(C12449r.f31811a) ? Boolean.valueOf(adFormatAuctionSettings.optBoolean(C12449r.f31811a)) : null;
    }

    /* JADX INFO: renamed from: a */
    public final Boolean m33117a() {
        return this.f31728a;
    }
}
