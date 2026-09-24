package com.fyber.inneractive.sdk.bidder;

import com.fyber.inneractive.sdk.protobuf.InterfaceC8924d1;
import com.fyber.inneractive.sdk.protobuf.InterfaceC8930e1;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.bidder.p0 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC7884p0 implements InterfaceC8924d1 {
    UNKNOWN(0),
    MALE(1),
    FEMALE(2),
    OTHER(3),
    UNRECOGNIZED(-1);

    public static final int FEMALE_VALUE = 2;
    public static final int MALE_VALUE = 1;
    public static final int OTHER_VALUE = 3;
    public static final int UNKNOWN_VALUE = 0;
    private static final InterfaceC8930e1 internalValueMap = new InterfaceC8930e1() { // from class: com.fyber.inneractive.sdk.bidder.o0
        @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC8930e1
        /* JADX INFO: renamed from: a */
        public final InterfaceC8924d1 mo20329a(int i) {
            if (i == 0) {
                return EnumC7884p0.UNKNOWN;
            }
            if (i == 1) {
                return EnumC7884p0.MALE;
            }
            if (i == 2) {
                return EnumC7884p0.FEMALE;
            }
            if (i != 3) {
                return null;
            }
            return EnumC7884p0.OTHER;
        }
    };
    private final int value;

    EnumC7884p0(int i) {
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
