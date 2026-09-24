package com.facebook.ads.redexgen.core;

import java.util.Map;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.UG */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6136UG {
    public static C6136UG A00 = new C6136UG();

    public static C6136UG A00() {
        return A00;
    }

    public final C6444ZJ A01(C6067T8 c6067t8, boolean z) {
        return new C6444ZJ(c6067t8, z, new C6046Sn());
    }

    public final Map<String, String> A02(C6067T8 c6067t8) {
        try {
            return A01(c6067t8, false).A06();
        } catch (Throwable th) {
            c6067t8.A08().A4I(th);
            return C6128U8.A01(c6067t8);
        }
    }
}
