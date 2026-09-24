package com.chartboost.sdk.impl;

import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.e3 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3723e3 {

    /* JADX INFO: renamed from: a */
    public final int f14006a;

    /* JADX INFO: renamed from: b */
    public final byte[] f14007b;

    public C3723e3(int i, byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.f14006a = i;
        this.f14007b = data;
    }

    /* JADX INFO: renamed from: a */
    public final byte[] m17473a() {
        return this.f14007b;
    }

    /* JADX INFO: renamed from: b */
    public final int m17474b() {
        return this.f14006a;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m17475c() {
        int i = this.f14006a;
        return i >= 200 && i < 300;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3723e3)) {
            return false;
        }
        C3723e3 c3723e3 = (C3723e3) obj;
        return this.f14006a == c3723e3.f14006a && Intrinsics.areEqual(this.f14007b, c3723e3.f14007b);
    }

    public int hashCode() {
        return (this.f14006a * 31) + Arrays.hashCode(this.f14007b);
    }

    public String toString() {
        return "CBNetworkServerResponse(statusCode=" + this.f14006a + ", data=" + Arrays.toString(this.f14007b) + ")";
    }
}
