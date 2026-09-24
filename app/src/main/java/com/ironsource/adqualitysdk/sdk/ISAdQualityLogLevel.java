package com.ironsource.adqualitysdk.sdk;

/* JADX INFO: loaded from: classes6.dex */
public enum ISAdQualityLogLevel {
    NONE(0),
    ERROR(1),
    WARNING(2),
    INFO(3),
    DEBUG(4),
    VERBOSE(5);


    /* JADX INFO: renamed from: ﾒ */
    private final int f26834;

    ISAdQualityLogLevel(int i) {
        this.f26834 = i;
    }

    public final int getValue() {
        return this.f26834;
    }

    public final boolean shouldPrintLog(ISAdQualityLogLevel iSAdQualityLogLevel) {
        int i = this.f26834;
        return i != NONE.f26834 && i >= iSAdQualityLogLevel.f26834;
    }

    public static ISAdQualityLogLevel fromInt(int i) {
        if (i == 0) {
            return NONE;
        }
        if (i == 1) {
            return ERROR;
        }
        if (i == 2) {
            return WARNING;
        }
        if (i == 3) {
            return INFO;
        }
        if (i == 4) {
            return DEBUG;
        }
        if (i != 5) {
            return null;
        }
        return VERBOSE;
    }
}
