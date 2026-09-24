package com.fyber.inneractive.sdk.protobuf;

import java.util.Iterator;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.x2 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9039x2 extends C8926d3 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ AbstractC8932e3 f21169b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C9039x2(AbstractC8932e3 abstractC8932e3) {
        super(abstractC8932e3);
        this.f21169b = abstractC8932e3;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.C8926d3, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new C9034w2(this.f21169b);
    }
}
