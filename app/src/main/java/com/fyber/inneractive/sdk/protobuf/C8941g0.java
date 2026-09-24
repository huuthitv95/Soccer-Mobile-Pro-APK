package com.fyber.inneractive.sdk.protobuf;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.g0 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8941g0 {

    /* JADX INFO: renamed from: a */
    public final Object f21018a;

    /* JADX INFO: renamed from: b */
    public final int f21019b;

    public C8941g0(int i, Object obj) {
        this.f21018a = obj;
        this.f21019b = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C8941g0)) {
            return false;
        }
        C8941g0 c8941g0 = (C8941g0) obj;
        return this.f21018a == c8941g0.f21018a && this.f21019b == c8941g0.f21019b;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.f21018a) * 65535) + this.f21019b;
    }
}
