package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;
import com.facebook.ads.internal.protocol.AdErrorType;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.XE */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC6315XE {
    public static AdError A00(C6229Vm c6229Vm) {
        if (c6229Vm.A03().isPublicError()) {
            return new AdError(c6229Vm.A03().getErrorCode(), c6229Vm.A04());
        }
        return new AdError(AdErrorType.UNKNOWN_ERROR.getErrorCode(), AdErrorType.UNKNOWN_ERROR.getDefaultErrorMessage());
    }
}
