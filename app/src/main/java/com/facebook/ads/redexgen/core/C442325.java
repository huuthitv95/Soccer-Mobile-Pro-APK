package com.facebook.ads.redexgen.core;

import com.google.common.collect.ElementTypesAreNonnullByDefault;
import javax.annotation.CheckForNull;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.25 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
@ElementTypesAreNonnullByDefault
public final class C442325<E> extends AbstractC4977BO<E> {
    public final transient E A00;

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.25 != com.google.common.collect.SingletonImmutableSet<E> */
    public C442325(E e) {
        this.A00 = (E) AbstractC7142ki.A04(e);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.25 != com.google.common.collect.SingletonImmutableSet<E> */
    @Override // com.facebook.ads.redexgen.core.AbstractC7355oO
    public final int A0I(Object[] dst, int offset) {
        dst[offset] = this.A00;
        return offset + 1;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.25 != com.google.common.collect.SingletonImmutableSet<E> */
    @Override // com.facebook.ads.redexgen.core.AbstractC4977BO, com.facebook.ads.redexgen.core.AbstractC7355oO
    public final AbstractC4978BP<E> A0J() {
        return AbstractC4978BP.A04(this.A00);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.25 != com.google.common.collect.SingletonImmutableSet<E> */
    @Override // com.facebook.ads.redexgen.core.AbstractC7355oO
    public final boolean A0K() {
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.25 != com.google.common.collect.SingletonImmutableSet<E> */
    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: A0N, reason: merged with bridge method [inline-methods] */
    public final AbstractC45494C<E> iterator() {
        return AbstractC7402p9.A03(this.A00);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.25 != com.google.common.collect.SingletonImmutableSet<E> */
    @Override // com.facebook.ads.redexgen.core.AbstractC7355oO, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(@CheckForNull Object target) {
        return this.A00.equals(target);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.25 != com.google.common.collect.SingletonImmutableSet<E> */
    @Override // com.facebook.ads.redexgen.core.AbstractC4977BO, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.A00.hashCode();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.25 != com.google.common.collect.SingletonImmutableSet<E> */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.25 != com.google.common.collect.SingletonImmutableSet<E> */
    @Override // java.util.AbstractCollection
    public final String toString() {
        return AbstractJsonLexerKt.BEGIN_LIST + this.A00.toString() + AbstractJsonLexerKt.END_LIST;
    }
}
