package com.fyber.inneractive.sdk.bidder.adm;

import com.fyber.inneractive.sdk.protobuf.InterfaceC8924d1;
import com.fyber.inneractive.sdk.protobuf.InterfaceC8930e1;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.bidder.adm.j */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC7839j implements InterfaceC8924d1 {
    MANUAL(0),
    AUTOMATIC(1),
    UNRECOGNIZED(-1);

    public static final int AUTOMATIC_VALUE = 1;
    public static final int MANUAL_VALUE = 0;
    private static final InterfaceC8930e1 internalValueMap = new InterfaceC8930e1() { // from class: com.fyber.inneractive.sdk.bidder.adm.i
        @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC8930e1
        /* JADX INFO: renamed from: a */
        public final InterfaceC8924d1 mo20329a(int i) {
            if (i == 0) {
                return EnumC7839j.MANUAL;
            }
            if (i != 1) {
                return null;
            }
            return EnumC7839j.AUTOMATIC;
        }
    };
    private final int value;

    EnumC7839j(int i) {
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
