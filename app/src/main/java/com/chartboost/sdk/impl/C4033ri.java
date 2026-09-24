package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.ri */
/* JADX INFO: loaded from: classes3.dex */
public final class C4033ri {

    /* JADX INFO: renamed from: a */
    public final String f16199a;

    public C4033ri(String actionName) {
        Intrinsics.checkNotNullParameter(actionName, "actionName");
        this.f16199a = actionName;
    }

    /* JADX INFO: renamed from: a */
    public final String m19360a() {
        return this.f16199a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C4033ri) && Intrinsics.areEqual(this.f16199a, ((C4033ri) obj).f16199a);
    }

    public int hashCode() {
        return this.f16199a.hashCode();
    }

    public String toString() {
        return "UrlActionResult(actionName=" + this.f16199a + ")";
    }
}
