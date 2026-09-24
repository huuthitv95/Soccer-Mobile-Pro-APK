package com.facebook.ads.redexgen.core;

import android.media.metrics.LogSessionId;
import java.util.Objects;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.8O */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C48098O {
    public static final C48098O A03;
    public final String A00;
    public final C48088N A01;
    public final Object A02;

    static {
        C48098O c48098o;
        if (AbstractC46115C.A02 < 31) {
            c48098o = new C48098O("");
        } else {
            c48098o = new C48098O(C48088N.A01, "");
        }
        A03 = c48098o;
    }

    public C48098O(C48088N c48088n, String str) {
        this.A01 = c48088n;
        this.A00 = str;
        this.A02 = new Object();
    }

    public C48098O(String str) {
        AbstractC45353y.A08(AbstractC46115C.A02 < 31);
        this.A00 = str;
        this.A01 = null;
        this.A02 = new Object();
    }

    public final LogSessionId A00() {
        return ((C48088N) AbstractC45353y.A01(this.A01)).A00;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48098O)) {
            return false;
        }
        C48098O c48098o = (C48098O) obj;
        if (Objects.equals(this.A00, c48098o.A00) && Objects.equals(this.A01, c48098o.A01) && Objects.equals(this.A02, c48098o.A02)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.A00, this.A01, this.A02);
    }
}
