package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.h9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3798h9 implements InterfaceC3946nj {

    /* JADX INFO: renamed from: a */
    public final String f14394a;

    public C3798h9(String str) {
        this.f14394a = str;
    }

    /* JADX INFO: renamed from: a */
    public final String m17870a() {
        return this.f14394a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3798h9) && Intrinsics.areEqual(this.f14394a, ((C3798h9) obj).f14394a);
    }

    public int hashCode() {
        String str = this.f14394a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public String toString() {
        return "IFrameResource(url=" + this.f14394a + ")";
    }
}
