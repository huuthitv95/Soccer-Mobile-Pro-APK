package com.fyber.inneractive.sdk.bidder;

import com.fyber.inneractive.sdk.protobuf.InterfaceC8924d1;
import com.fyber.inneractive.sdk.protobuf.InterfaceC8930e1;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.bidder.q */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC7885q implements InterfaceC8924d1 {
    NATIVE(0),
    UNITY3D(1),
    UNRECOGNIZED(-1);

    public static final int NATIVE_VALUE = 0;
    public static final int UNITY3D_VALUE = 1;
    private static final InterfaceC8930e1 internalValueMap = new InterfaceC8930e1() { // from class: com.fyber.inneractive.sdk.bidder.p
        @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC8930e1
        /* JADX INFO: renamed from: a */
        public final InterfaceC8924d1 mo20329a(int i) {
            if (i == 0) {
                return EnumC7885q.NATIVE;
            }
            if (i != 1) {
                return null;
            }
            return EnumC7885q.UNITY3D;
        }
    };
    private final int value;

    EnumC7885q(int i) {
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
