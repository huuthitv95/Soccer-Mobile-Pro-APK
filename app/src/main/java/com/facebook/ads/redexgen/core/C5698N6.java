package com.facebook.ads.redexgen.core;

import com.facebook.ads.internal.protocol.AdPlacementType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.N6 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5698N6 {
    public static InterfaceC5693N1 A00;

    public final InterfaceC5693N1 A00(final C6902gi c6902gi, AdPlacementType adPlacementType) {
        if (A00 != null) {
            return A00;
        }
        switch (C5697N5.A00[adPlacementType.ordinal()]) {
            case 1:
                return new C478681();
            case 2:
                if (C6171Up.A1O(c6902gi)) {
                    return new C478580();
                }
                return new C478681();
            case 3:
                return new C7099jz();
            case 4:
                return new C7094ju(c6902gi);
            case 5:
                return new C7094ju(c6902gi) { // from class: com.facebook.ads.redexgen.X.7z
                    @Override // com.facebook.ads.redexgen.core.C7094ju, com.facebook.ads.redexgen.core.InterfaceC5693N1
                    public final AdPlacementType A8k() {
                        return AdPlacementType.NATIVE_BANNER;
                    }
                };
            case 6:
                return new C47817w();
            default:
                return null;
        }
    }
}
