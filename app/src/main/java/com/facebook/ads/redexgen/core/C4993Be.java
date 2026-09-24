package com.facebook.ads.redexgen.core;

import com.google.common.collect.ParametricNullness;
import java.util.Comparator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Be */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4993Be extends AbstractC7324ns {
    public C4993Be() {
        super(null);
    }

    private final AbstractC7324ns A00(int result) {
        if (result < 0) {
            return AbstractC7324ns.A02;
        }
        if (result > 0) {
            return AbstractC7324ns.A01;
        }
        return AbstractC7324ns.A00;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC7324ns
    public final int A05() {
        return 0;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC7324ns
    public final AbstractC7324ns A06(int left, int right) {
        return A00(Integer.compare(left, right));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC7324ns
    public final AbstractC7324ns A07(long left, long right) {
        return A00(Long.compare(left, right));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC7324ns
    public final <T> AbstractC7324ns A08(@ParametricNullness T left, @ParametricNullness T right, Comparator<T> comparator) {
        return A00(comparator.compare(left, right));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC7324ns
    public final AbstractC7324ns A09(boolean left, boolean right) {
        return A00(Boolean.compare(left, right));
    }

    @Override // com.facebook.ads.redexgen.core.AbstractC7324ns
    public final AbstractC7324ns A0A(boolean left, boolean right) {
        return A00(Boolean.compare(right, left));
    }
}
