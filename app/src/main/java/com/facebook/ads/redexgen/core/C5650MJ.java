package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.MJ */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5650MJ {
    public static final C5650MJ A02 = new C5650MJ();
    public byte A00 = 3;
    public boolean A01 = true;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || !(obj instanceof C5650MJ)) {
            return false;
        }
        C5650MJ c5650mj = (C5650MJ) obj;
        return this.A00 == c5650mj.A00 && this.A01 == c5650mj.A01;
    }

    public final int hashCode() {
        return new Byte(this.A00).hashCode() + new Boolean(this.A01).hashCode();
    }
}
