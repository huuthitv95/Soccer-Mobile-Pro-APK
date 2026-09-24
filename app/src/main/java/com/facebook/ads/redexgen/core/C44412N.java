package com.facebook.ads.redexgen.core;

import com.google.common.collect.ParametricNullness;
import java.util.List;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.2N */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C44412N extends AbstractC44392L<K, V>.WrappedList implements RandomAccess {
    public final /* synthetic */ AbstractC44392L A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.2N != com.google.common.collect.AbstractMapBasedMultimap<K, V>$RandomAccessWrappedList */
    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.lp != com.google.common.collect.AbstractMapBasedMultimap<K, V>$WrappedCollection */
    /* JADX WARN: Incorrect inner types in method signature: (TK;Ljava/util/List<TV;>;Lcom/facebook/ads/redexgen/X/2L<TK;TV;>.WrappedCollection;)V */
    public C44412N(@ParametricNullness final AbstractC44392L this$0, @CheckForNull Object key, List delegate, C7210lp ancestor) {
        super(this$0, key, delegate, ancestor);
        this.A00 = this$0;
    }
}
