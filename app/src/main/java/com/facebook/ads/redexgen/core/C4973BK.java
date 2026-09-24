package com.facebook.ads.redexgen.core;

import com.google.common.collect.ParametricNullness;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.BK */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class C4973BK<K, V> extends AbstractC43951d<Map.Entry<K, V>, V> {
    public C4973BK(Iterator backingIterator) {
        super(backingIterator);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.AbstractC43951d
    @ParametricNullness
    /* JADX INFO: renamed from: A00, reason: merged with bridge method [inline-methods] */
    public final V A01(Map.Entry<K, V> entry) {
        return entry.getValue();
    }
}
