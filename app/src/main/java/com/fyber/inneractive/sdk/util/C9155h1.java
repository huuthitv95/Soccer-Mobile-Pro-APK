package com.fyber.inneractive.sdk.util;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.util.h1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9155h1 {

    /* JADX INFO: renamed from: a */
    public int f21454a;

    /* JADX INFO: renamed from: b */
    public int f21455b;

    public C9155h1(int i, int i2) {
        this.f21454a = i;
        this.f21455b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C9155h1.class == obj.getClass()) {
            C9155h1 c9155h1 = (C9155h1) obj;
            if (this.f21454a == c9155h1.f21454a && this.f21455b == c9155h1.f21455b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f21454a * 31) + this.f21455b;
    }
}
