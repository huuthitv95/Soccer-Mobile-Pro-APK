package com.facebook.ads.redexgen.core;

import com.google.common.collect.ParametricNullness;
import java.util.Comparator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Bc */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4991Bc extends AbstractC7324ns {
    public final int A00;

    public C4991Bc(int result) {
        super(null);
        this.A00 = result;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC7324ns
    public final int A05() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC7324ns
    public final AbstractC7324ns A06(int left, int right) {
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC7324ns
    public final AbstractC7324ns A07(long left, long right) {
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC7324ns
    public final <T> AbstractC7324ns A08(@ParametricNullness T left, @ParametricNullness T right, Comparator<T> comparator) {
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC7324ns
    public final AbstractC7324ns A09(boolean left, boolean right) {
        return this;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC7324ns
    public final AbstractC7324ns A0A(boolean left, boolean right) {
        return this;
    }
}
