package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.bidder.C7871j;
import com.fyber.inneractive.sdk.bidder.EnumC7880n0;
import java.util.AbstractList;
import java.util.List;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.i1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8954i1 extends AbstractList {

    /* JADX INFO: renamed from: a */
    public final List f21030a;

    /* JADX INFO: renamed from: b */
    public final InterfaceC8948h1 f21031b;

    public C8954i1(List list, InterfaceC8948h1 interfaceC8948h1) {
        this.f21030a = list;
        this.f21031b = interfaceC8948h1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        InterfaceC8948h1 interfaceC8948h1 = this.f21031b;
        Object obj = this.f21030a.get(i);
        ((C7871j) interfaceC8948h1).getClass();
        EnumC7880n0 enumC7880n0M20348a = EnumC7880n0.m20348a(((Integer) obj).intValue());
        return enumC7880n0M20348a == null ? EnumC7880n0.UNRECOGNIZED : enumC7880n0M20348a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f21030a.size();
    }
}
