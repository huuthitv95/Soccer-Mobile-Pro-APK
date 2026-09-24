package com.ironsource.adqualitysdk.sdk;

/* JADX INFO: loaded from: classes6.dex */
public enum ISAdQualityDeviceIdType {
    NONE(0),
    GAID(1),
    IDFA(2);


    /* JADX INFO: renamed from: ﻐ */
    private final int f26830;

    ISAdQualityDeviceIdType(int i) {
        this.f26830 = i;
    }

    public final int getValue() {
        return this.f26830;
    }

    public static ISAdQualityDeviceIdType fromInt(int i) {
        if (i == 0) {
            return NONE;
        }
        if (i == 1) {
            return GAID;
        }
        if (i != 2) {
            return null;
        }
        return IDFA;
    }
}
