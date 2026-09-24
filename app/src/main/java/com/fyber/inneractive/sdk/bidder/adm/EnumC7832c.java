package com.fyber.inneractive.sdk.bidder.adm;

import com.fyber.inneractive.sdk.protobuf.InterfaceC8924d1;
import com.fyber.inneractive.sdk.protobuf.InterfaceC8930e1;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.bidder.adm.c */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC7832c implements InterfaceC8924d1 {
    OTHER(0),
    HTML(4),
    MRAID(6),
    VAST(8),
    NATIVE(10),
    DV360(15),
    UNRECOGNIZED(-1);

    public static final int DV360_VALUE = 15;
    public static final int HTML_VALUE = 4;
    public static final int MRAID_VALUE = 6;
    public static final int NATIVE_VALUE = 10;
    public static final int OTHER_VALUE = 0;
    public static final int VAST_VALUE = 8;
    private static final InterfaceC8930e1 internalValueMap = new InterfaceC8930e1() { // from class: com.fyber.inneractive.sdk.bidder.adm.b
        @Override // com.fyber.inneractive.sdk.protobuf.InterfaceC8930e1
        /* JADX INFO: renamed from: a */
        public final InterfaceC8924d1 mo20329a(int i) {
            if (i == 0) {
                return EnumC7832c.OTHER;
            }
            if (i == 4) {
                return EnumC7832c.HTML;
            }
            if (i == 6) {
                return EnumC7832c.MRAID;
            }
            if (i == 8) {
                return EnumC7832c.VAST;
            }
            if (i == 10) {
                return EnumC7832c.NATIVE;
            }
            if (i != 15) {
                return null;
            }
            return EnumC7832c.DV360;
        }
    };
    private final int value;

    EnumC7832c(int i) {
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
