package com.fyber.inneractive.sdk.protobuf;

import java.util.List;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.s1 */
/* JADX INFO: loaded from: classes4.dex */
public final class C9013s1 extends AbstractC9018t1 {
    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9018t1
    /* JADX INFO: renamed from: a */
    public final void mo21709a(long j, Object obj, Object obj2) {
        InterfaceC8966k1 interfaceC8966k1Mo21502b = (InterfaceC8966k1) AbstractC9040x3.m21839e(obj, j);
        InterfaceC8966k1 interfaceC8966k1 = (InterfaceC8966k1) AbstractC9040x3.m21839e(obj2, j);
        int size = interfaceC8966k1Mo21502b.size();
        int size2 = interfaceC8966k1.size();
        if (size > 0 && size2 > 0) {
            if (!((AbstractC8916c) interfaceC8966k1Mo21502b).f20989a) {
                interfaceC8966k1Mo21502b = interfaceC8966k1Mo21502b.mo21502b(size2 + size);
            }
            interfaceC8966k1Mo21502b.addAll(interfaceC8966k1);
        }
        if (size > 0) {
            interfaceC8966k1 = interfaceC8966k1Mo21502b;
        }
        AbstractC9040x3.m21828a(j, obj, interfaceC8966k1);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9018t1
    /* JADX INFO: renamed from: a */
    public final void mo21710a(Object obj, long j) {
        ((AbstractC8916c) ((InterfaceC8966k1) AbstractC9040x3.m21839e(obj, j))).f20989a = false;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC9018t1
    /* JADX INFO: renamed from: b */
    public final List mo21711b(Object obj, long j) {
        InterfaceC8966k1 interfaceC8966k1 = (InterfaceC8966k1) AbstractC9040x3.m21839e(obj, j);
        if (((AbstractC8916c) interfaceC8966k1).f20989a) {
            return interfaceC8966k1;
        }
        int size = interfaceC8966k1.size();
        InterfaceC8966k1 interfaceC8966k1Mo21502b = interfaceC8966k1.mo21502b(size == 0 ? 10 : size * 2);
        AbstractC9040x3.m21828a(j, obj, interfaceC8966k1Mo21502b);
        return interfaceC8966k1Mo21502b;
    }
}
