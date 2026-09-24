package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import com.google.common.collect.ParametricNullness;
import java.util.Comparator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ns */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@ElementTypesAreNonnullByDefault
public abstract class AbstractC7324ns {
    public static final AbstractC7324ns A00 = new C4993Be();
    public static final AbstractC7324ns A02 = new C4991Bc(-1);
    public static final AbstractC7324ns A01 = new C4991Bc(1);

    public abstract int A05();

    public abstract AbstractC7324ns A06(int left, int right);

    public abstract AbstractC7324ns A07(long left, long right);

    public abstract <T> AbstractC7324ns A08(@ParametricNullness T left, @ParametricNullness T right, Comparator<T> comparator);

    public abstract AbstractC7324ns A09(boolean left, boolean right);

    public abstract AbstractC7324ns A0A(boolean left, boolean right);

    public AbstractC7324ns() {
    }

    public /* synthetic */ AbstractC7324ns(C4993Be c4993Be) {
        this();
    }

    public static AbstractC7324ns A01() {
        return A00;
    }
}
