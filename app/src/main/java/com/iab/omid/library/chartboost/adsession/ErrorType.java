package com.iab.omid.library.chartboost.adsession;

import com.facebook.share.internal.MessengerShareContentUtility;

/* JADX INFO: loaded from: classes6.dex */
public enum ErrorType {
    GENERIC(MessengerShareContentUtility.TEMPLATE_GENERIC_TYPE),
    VIDEO("video");

    private final String errorType;

    ErrorType(String str) {
        this.errorType = str;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.errorType;
    }
}
