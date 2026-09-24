package com.ironsource;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.Dd */
/* JADX INFO: loaded from: classes6.dex */
public final class C11403Dd {

    /* JADX INFO: renamed from: a */
    private final String f24222a;

    /* JADX INFO: renamed from: b */
    private final Integer f24223b;

    public C11403Dd(JSONObject features, String nameKey, String amountKey) {
        Intrinsics.checkNotNullParameter(features, "features");
        Intrinsics.checkNotNullParameter(nameKey, "nameKey");
        Intrinsics.checkNotNullParameter(amountKey, "amountKey");
        this.f24222a = features.has(nameKey) ? features.getString(nameKey) : null;
        this.f24223b = features.has(amountKey) ? Integer.valueOf(features.getInt(amountKey)) : null;
    }

    /* JADX INFO: renamed from: a */
    public final Integer m25626a() {
        return this.f24223b;
    }

    /* JADX INFO: renamed from: b */
    public final String m25627b() {
        return this.f24222a;
    }
}
