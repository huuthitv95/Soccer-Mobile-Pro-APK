package com.fyber.inneractive.sdk.bidder;

import com.fyber.inneractive.sdk.protobuf.InterfaceC8924d1;
import com.fyber.inneractive.sdk.protobuf.InterfaceC8930e1;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.bidder.n0 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC7880n0 implements InterfaceC8924d1 {
    UNITDISPLAYTYPEUNKNOWN(0),
    BANNER(1),
    INTERSTITIAL(2),
    REWARDED(3),
    MRECT(4),
    TYPENATIVE(5),
    UNRECOGNIZED(-1);

    public static final int BANNER_VALUE = 1;
    public static final int INTERSTITIAL_VALUE = 2;
    public static final int MRECT_VALUE = 4;
    public static final int REWARDED_VALUE = 3;
    public static final int TYPENATIVE_VALUE = 5;
    public static final int UNITDISPLAYTYPEUNKNOWN_VALUE = 0;
    private static final InterfaceC8930e1 internalValueMap = new InterfaceC8930e1() { // from class: com.fyber.inneractive.sdk.bidder.m0
        @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC8930e1
        /* JADX INFO: renamed from: a */
        public final InterfaceC8924d1 mo20329a(int i) {
            return EnumC7880n0.m20348a(i);
        }
    };
    private final int value;

    EnumC7880n0(int i) {
        this.value = i;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC7880n0 m20348a(int i) {
        if (i == 0) {
            return UNITDISPLAYTYPEUNKNOWN;
        }
        if (i == 1) {
            return BANNER;
        }
        if (i == 2) {
            return INTERSTITIAL;
        }
        if (i == 3) {
            return REWARDED;
        }
        if (i == 4) {
            return MRECT;
        }
        if (i != 5) {
            return null;
        }
        return TYPENATIVE;
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
