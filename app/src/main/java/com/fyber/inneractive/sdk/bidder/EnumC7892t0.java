package com.fyber.inneractive.sdk.bidder;

import com.fyber.inneractive.sdk.protobuf.InterfaceC8924d1;
import com.fyber.inneractive.sdk.protobuf.InterfaceC8930e1;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.bidder.t0 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC7892t0 implements InterfaceC8924d1 {
    NOCLICK(0),
    CTABUTTON(1),
    COMPANION(2),
    VIDEOVIEW(3),
    APPINFO(4),
    STOREPROMO(5),
    UNRECOGNIZED(-1);

    public static final int APPINFO_VALUE = 4;
    public static final int COMPANION_VALUE = 2;
    public static final int CTABUTTON_VALUE = 1;
    public static final int NOCLICK_VALUE = 0;
    public static final int STOREPROMO_VALUE = 5;
    public static final int VIDEOVIEW_VALUE = 3;
    private static final InterfaceC8930e1 internalValueMap = new InterfaceC8930e1() { // from class: com.fyber.inneractive.sdk.bidder.s0
        @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC8930e1
        /* JADX INFO: renamed from: a */
        public final InterfaceC8924d1 mo20329a(int i) {
            if (i == 0) {
                return EnumC7892t0.NOCLICK;
            }
            if (i == 1) {
                return EnumC7892t0.CTABUTTON;
            }
            if (i == 2) {
                return EnumC7892t0.COMPANION;
            }
            if (i == 3) {
                return EnumC7892t0.VIDEOVIEW;
            }
            if (i == 4) {
                return EnumC7892t0.APPINFO;
            }
            if (i != 5) {
                return null;
            }
            return EnumC7892t0.STOREPROMO;
        }
    };
    private final int value;

    EnumC7892t0(int i) {
        this.value = i;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC8924d1
    /* JADX INFO: renamed from: a */
    public final int mo20330a() {
        if (this != UNRECOGNIZED) {
            return this.value;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
}
