package com.facebook.ads.redexgen.core;

import com.google.common.collect.ParametricNullness;
import java.util.NoSuchElementException;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.BN */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C4976BN<T> extends AbstractC45494C<T> {
    public boolean A00;
    public final T A01;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BN != com.google.common.collect.Iterators$SingletonIterator<T> */
    public C4976BN(T value) {
        this.A01 = value;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BN != com.google.common.collect.Iterators$SingletonIterator<T> */
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.A00;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.BN != com.google.common.collect.Iterators$SingletonIterator<T> */
    @Override // java.util.Iterator
    @ParametricNullness
    public final T next() {
        if (!this.A00) {
            this.A00 = true;
            return this.A01;
        }
        throw new NoSuchElementException();
    }
}
