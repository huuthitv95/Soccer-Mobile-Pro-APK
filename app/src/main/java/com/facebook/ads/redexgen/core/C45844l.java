package com.facebook.ads.redexgen.core;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.4l */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C45844l extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {
    public final C45884p A00;

    public C45844l(C45884p c45884p) {
        this.A00 = c45884p;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        boolean is5gNsa = overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5;
        this.A00.A07(is5gNsa ? 10 : 5);
    }
}
