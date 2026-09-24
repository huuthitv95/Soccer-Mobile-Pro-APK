package com.fyber.inneractive.sdk.bidder.adm;

import com.fyber.inneractive.sdk.protobuf.InterfaceC8924d1;
import com.fyber.inneractive.sdk.protobuf.InterfaceC8930e1;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.bidder.adm.n */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC7843n implements InterfaceC8924d1 {
    NONE(0),
    SINGLETAP(1),
    TRUESINGLETAP(2),
    UNRECOGNIZED(-1);

    public static final int NONE_VALUE = 0;
    public static final int SINGLETAP_VALUE = 1;
    public static final int TRUESINGLETAP_VALUE = 2;
    private static final InterfaceC8930e1 internalValueMap = new InterfaceC8930e1() { // from class: com.fyber.inneractive.sdk.bidder.adm.m
        @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC8930e1
        /* JADX INFO: renamed from: a */
        public final InterfaceC8924d1 mo20329a(int i) {
            if (i == 0) {
                return EnumC7843n.NONE;
            }
            if (i == 1) {
                return EnumC7843n.SINGLETAP;
            }
            if (i != 2) {
                return null;
            }
            return EnumC7843n.TRUESINGLETAP;
        }
    };
    private final int value;

    EnumC7843n(int i) {
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
