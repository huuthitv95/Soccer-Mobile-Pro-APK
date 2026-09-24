package com.ironsource;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.ff */
/* JADX INFO: loaded from: classes6.dex */
public final class C12199ff {

    /* JADX INFO: renamed from: a */
    private final String f30416a;

    /* JADX INFO: renamed from: b */
    private final String f30417b;

    public C12199ff(String identifier, String baseConst) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(baseConst, "baseConst");
        this.f30416a = identifier;
        this.f30417b = baseConst;
    }

    /* JADX INFO: renamed from: a */
    public final String m31512a() {
        return this.f30416a + "_" + this.f30417b;
    }
}
