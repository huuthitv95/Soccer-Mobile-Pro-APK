package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.7s */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C47777s {
    public static final C47777s A01 = new C47777s(false);
    public final boolean A00;

    public C47777s(boolean z) {
        this.A00 = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.A00 == ((C47777s) obj).A00;
    }

    public final int hashCode() {
        return !this.A00 ? 1 : 0;
    }
}
