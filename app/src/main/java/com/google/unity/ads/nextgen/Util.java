package com.google.unity.ads.nextgen;

import com.google.android.libraries.ads.mobile.sdk.common.PrecisionType;

/* JADX INFO: loaded from: classes6.dex */
class Util {
    private Util() {
    }

    /* JADX INFO: renamed from: com.google.unity.ads.nextgen.Util$1 */
    static /* synthetic */ class C108841 {

        /* JADX INFO: renamed from: $SwitchMap$com$google$android$libraries$ads$mobile$sdk$common$PrecisionType */
        static final /* synthetic */ int[] f22625xc6c7b6af;

        static {
            int[] iArr = new int[PrecisionType.values().length];
            f22625xc6c7b6af = iArr;
            try {
                iArr[PrecisionType.ESTIMATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22625xc6c7b6af[PrecisionType.PUBLISHER_PROVIDED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22625xc6c7b6af[PrecisionType.PRECISE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22625xc6c7b6af[PrecisionType.UNKNOWN.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static int getAdValuePrecisionType(PrecisionType precisionType) {
        int i = C108841.f22625xc6c7b6af[precisionType.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    return 0;
                }
            }
        }
        return i2;
    }
}
