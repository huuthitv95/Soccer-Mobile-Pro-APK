package com.fyber.inneractive.sdk.response;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.response.a */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC9083a {
    RETURNED_ADTYPE_HTML(4),
    RETURNED_ADTYPE_MRAID(6),
    RETURNED_ADTYPE_VAST(8),
    RETURNED_ADTYPE_HTML5_VIDEO(9),
    RETURNED_ADTYPE_NATIVE(10),
    RETURNED_ADTYPE_PMN(11),
    RETURNED_ADTYPE_MOBILE_ADS(15);

    private int value;

    EnumC9083a(int i) {
        this.value = i;
    }

    /* JADX INFO: renamed from: a */
    public static EnumC9083a m21884a(int i) {
        for (EnumC9083a enumC9083a : values()) {
            if (enumC9083a.value == i) {
                return enumC9083a;
            }
        }
        return null;
    }
}
