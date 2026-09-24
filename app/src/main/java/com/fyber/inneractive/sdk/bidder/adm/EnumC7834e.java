package com.fyber.inneractive.sdk.bidder.adm;

import com.fyber.inneractive.sdk.protobuf.InterfaceC8924d1;
import com.fyber.inneractive.sdk.protobuf.InterfaceC8930e1;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.bidder.adm.e */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC7834e implements InterfaceC8924d1 {
    DISPLAY(0),
    VIDEO(1),
    VIDEOANDDISPLAY(2),
    UNRECOGNIZED(-1);

    public static final int DISPLAY_VALUE = 0;
    public static final int VIDEOANDDISPLAY_VALUE = 2;
    public static final int VIDEO_VALUE = 1;
    private static final InterfaceC8930e1 internalValueMap = new InterfaceC8930e1() { // from class: com.fyber.inneractive.sdk.bidder.adm.d
        @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC8930e1
        /* JADX INFO: renamed from: a */
        public final InterfaceC8924d1 mo20329a(int i) {
            if (i == 0) {
                return EnumC7834e.DISPLAY;
            }
            if (i == 1) {
                return EnumC7834e.VIDEO;
            }
            if (i != 2) {
                return null;
            }
            return EnumC7834e.VIDEOANDDISPLAY;
        }
    };
    private final int value;

    EnumC7834e(int i) {
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
