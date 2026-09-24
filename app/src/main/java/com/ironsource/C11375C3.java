package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.C3 */
/* JADX INFO: loaded from: classes6.dex */
public final class C11375C3 {

    /* JADX INFO: renamed from: a */
    private final Boolean f24123a;

    /* JADX INFO: renamed from: b */
    private final Integer f24124b;

    /* JADX INFO: renamed from: c */
    private final EnumC11465H3 f24125c;

    public C11375C3(JSONObject features) {
        Intrinsics.checkNotNullParameter(features, "features");
        this.f24123a = features.has("enabled") ? Boolean.valueOf(features.getBoolean("enabled")) : null;
        this.f24124b = features.has("maxImpressions") ? Integer.valueOf(features.getInt("maxImpressions")) : null;
        this.f24125c = features.has("unit") ? EnumC11465H3.f24413c.m25979a(features.optString("unit")) : null;
    }

    /* JADX INFO: renamed from: a */
    public final Boolean m25554a() {
        return this.f24123a;
    }

    /* JADX INFO: renamed from: b */
    public final Integer m25555b() {
        return this.f24124b;
    }

    /* JADX INFO: renamed from: c */
    public final EnumC11465H3 m25556c() {
        return this.f24125c;
    }
}
