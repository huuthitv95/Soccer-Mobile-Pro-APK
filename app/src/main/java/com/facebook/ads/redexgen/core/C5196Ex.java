package com.facebook.ads.redexgen.core;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ex */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5196Ex {
    public static String[] A05 = {"LpJTwMN2G", "VgMO4aUKUhad1vQS8qeWccWG6TZwybQB", "ACcLkDhyx", "Vz4L8Yk2qa8xi00BpA99exXw347yn2OW", "M93qmyVYUpuFuHp", "Ixo", "WCFkueysi57ip8GEP7BFiSRGMX4T5ofH", "LFY6A3GYQmBEHARGrOHSwwc2jPi1aXj0"};
    public final int A00;
    public final C7427pY A01;
    public final Object A02;
    public final C47777s[] A03;
    public final InterfaceC7284nE[] A04;

    public C5196Ex(C47777s[] c47777sArr, InterfaceC7284nE[] interfaceC7284nEArr, C7427pY c7427pY, Object obj) {
        this.A03 = c47777sArr;
        this.A04 = (InterfaceC7284nE[]) interfaceC7284nEArr.clone();
        this.A01 = c7427pY;
        this.A02 = obj;
        this.A00 = c47777sArr.length;
    }

    public final boolean A00(int i) {
        return this.A03[i] != null;
    }

    public final boolean A01(C5196Ex c5196Ex, int i) {
        if (c5196Ex == null) {
            return false;
        }
        C47777s[] c47777sArr = this.A03;
        if (A05[5].length() == 3) {
            A05[1] = "2a41zxf8OUQisEdMYeAN8aC4JNcLEgEy";
            if (!AbstractC46115C.A1E(c47777sArr[i], c5196Ex.A03[i])) {
                return false;
            }
            InterfaceC7284nE interfaceC7284nE = this.A04[i];
            InterfaceC7284nE interfaceC7284nE2 = c5196Ex.A04[i];
            String[] strArr = A05;
            if (strArr[2].length() == strArr[0].length()) {
                A05[4] = "ShAZgc6gkhlm9OR";
                return AbstractC46115C.A1E(interfaceC7284nE, interfaceC7284nE2);
            }
        }
        throw new RuntimeException();
    }
}
