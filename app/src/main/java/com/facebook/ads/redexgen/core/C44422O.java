package com.facebook.ads.redexgen.core;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import javax.annotation.CheckForNull;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2O */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C44422O<K, V> extends C4970BH<K, Collection<V>> {
    public final /* synthetic */ AbstractC44392L A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2O != com.google.common.collect.AbstractMapBasedMultimap<K, V>$KeySet */
    public C44422O(final AbstractC44392L this$0, final Map<K, Collection<V>> subMap) {
        super(subMap);
        this.A00 = this$0;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2O != com.google.common.collect.AbstractMapBasedMultimap<K, V>$KeySet */
    @Override // com.facebook.ads.redexgen.core.C4970BH, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        AbstractC7402p9.A09(iterator());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2O != com.google.common.collect.AbstractMapBasedMultimap<K, V>$KeySet */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> c) {
        return A00().keySet().containsAll(c);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2O != com.google.common.collect.AbstractMapBasedMultimap<K, V>$KeySet */
    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(@CheckForNull Object object) {
        return this == object || A00().keySet().equals(object);
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2O != com.google.common.collect.AbstractMapBasedMultimap<K, V>$KeySet */
    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final int hashCode() {
        return A00().keySet().hashCode();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2O != com.google.common.collect.AbstractMapBasedMultimap<K, V>$KeySet */
    @Override // com.facebook.ads.redexgen.core.C4970BH, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<K> iterator() {
        return new C7208ln(this, A00().entrySet().iterator());
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2O != com.google.common.collect.AbstractMapBasedMultimap<K, V>$KeySet */
    @Override // com.facebook.ads.redexgen.core.C4970BH, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(@CheckForNull Object key) {
        int size = 0;
        Collection collection = (Collection) A00().remove(key);
        if (collection != null) {
            size = collection.size();
            collection.clear();
            AbstractC44392L.A03(this.A00, size);
        }
        return size > 0;
    }
}
