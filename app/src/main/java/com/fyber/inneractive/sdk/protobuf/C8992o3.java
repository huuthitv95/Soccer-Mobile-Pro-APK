package com.fyber.inneractive.sdk.protobuf;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.protobuf.o3 */
/* JADX INFO: loaded from: classes4.dex */
public final class C8992o3 {
    /* JADX INFO: renamed from: a */
    public static void m21691a(Object obj, Object obj2) {
        ((AbstractC9047z0) obj).unknownFields = (C8986n3) obj2;
    }

    /* JADX INFO: renamed from: a */
    public static boolean m21692a(Object obj, InterfaceC9014s2 interfaceC9014s2) throws C8984n1 {
        int iMo21582e = interfaceC9014s2.mo21582e();
        int i = iMo21582e >>> 3;
        int i2 = iMo21582e & 7;
        if (i2 == 0) {
            ((C8986n3) obj).m21688a(i << 3, Long.valueOf(interfaceC9014s2.mo21603o()));
            return true;
        }
        if (i2 == 1) {
            ((C8986n3) obj).m21688a((i << 3) | 1, Long.valueOf(interfaceC9014s2.mo21587g()));
            return true;
        }
        if (i2 == 2) {
            ((C8986n3) obj).m21688a((i << 3) | 2, interfaceC9014s2.mo21560a());
            return true;
        }
        if (i2 != 3) {
            if (i2 == 4) {
                return false;
            }
            if (i2 == 5) {
                ((C8986n3) obj).m21688a((i << 3) | 5, Integer.valueOf(interfaceC9014s2.mo21607q()));
                return true;
            }
            int i3 = C8984n1.f21076a;
            throw new C8978m1();
        }
        C8986n3 c8986n3 = new C8986n3();
        int i4 = i << 3;
        int i5 = i4 | 4;
        while (interfaceC9014s2.mo21610s() != Integer.MAX_VALUE && m21692a((Object) c8986n3, interfaceC9014s2)) {
        }
        if (i5 != interfaceC9014s2.mo21582e()) {
            throw new C8984n1("Protocol message end-group tag did not match expected tag.");
        }
        c8986n3.f21082e = false;
        ((C8986n3) obj).m21688a(i4 | 3, c8986n3);
        return true;
    }
}
