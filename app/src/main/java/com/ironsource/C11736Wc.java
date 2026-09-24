package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.Wc */
/* JADX INFO: loaded from: classes6.dex */
public final class C11736Wc {

    /* JADX INFO: renamed from: a */
    private final Boolean f26102a;

    /* JADX INFO: renamed from: b */
    private final Integer f26103b;

    /* JADX INFO: renamed from: c */
    private final EnumC11465H3 f26104c;

    public C11736Wc(JSONObject features) {
        Intrinsics.checkNotNullParameter(features, "features");
        this.f26102a = features.has("enabled") ? Boolean.valueOf(features.getBoolean("enabled")) : null;
        this.f26103b = features.has("numOfSeconds") ? Integer.valueOf(features.getInt("numOfSeconds")) : null;
        this.f26104c = EnumC11465H3.Second;
    }

    /* JADX INFO: renamed from: a */
    public final Boolean m27836a() {
        return this.f26102a;
    }

    /* JADX INFO: renamed from: b */
    public final Integer m27837b() {
        return this.f26103b;
    }

    /* JADX INFO: renamed from: c */
    public final EnumC11465H3 m27838c() {
        return this.f26104c;
    }
}
