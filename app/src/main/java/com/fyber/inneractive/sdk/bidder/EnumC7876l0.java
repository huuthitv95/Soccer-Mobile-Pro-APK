package com.fyber.inneractive.sdk.bidder;

import com.fyber.inneractive.sdk.protobuf.InterfaceC8924d1;
import com.fyber.inneractive.sdk.protobuf.InterfaceC8930e1;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.bidder.l0 */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC7876l0 implements InterfaceC8924d1 {
    UNITCONTENTTYPEUNKNOWN(0),
    DISPLAY(1),
    VIDEO(2),
    UNRECOGNIZED(-1);

    public static final int DISPLAY_VALUE = 1;
    public static final int UNITCONTENTTYPEUNKNOWN_VALUE = 0;
    public static final int VIDEO_VALUE = 2;
    private static final InterfaceC8930e1 internalValueMap = new InterfaceC8930e1() { // from class: com.fyber.inneractive.sdk.bidder.k0
        @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC8930e1
        /* JADX INFO: renamed from: a */
        public final InterfaceC8924d1 mo20329a(int i) {
            if (i == 0) {
                return EnumC7876l0.UNITCONTENTTYPEUNKNOWN;
            }
            if (i == 1) {
                return EnumC7876l0.DISPLAY;
            }
            if (i != 2) {
                return null;
            }
            return EnumC7876l0.VIDEO;
        }
    };
    private final int value;

    EnumC7876l0(int i) {
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
