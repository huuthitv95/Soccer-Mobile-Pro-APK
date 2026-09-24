package com.facebook.ads.redexgen.core;

import android.content.Context;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.internal.api.InitApi;
import com.facebook.ads.internal.settings.MultithreadedBundleWrapper;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Rr */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C5989Rr implements InitApi {
    @Override // com.facebook.ads.internal.api.InitApi
    public final void initialize(Context context, MultithreadedBundleWrapper multithreadedBundleWrapper, AudienceNetworkAds.InitListener initListener, int i) {
        C6122U2.A0H(C5987Rp.A09(context), multithreadedBundleWrapper, initListener, i);
    }

    @Override // com.facebook.ads.internal.api.InitApi
    public final boolean isInitialized() {
        return C6122U2.A0I();
    }

    @Override // com.facebook.ads.internal.api.InitApi
    public final void onAdLoadInvoked(Context context) {
        C6122U2.A08(C5987Rp.A09(context));
    }

    @Override // com.facebook.ads.internal.api.InitApi
    public final void onContentProviderCreated(Context context) {
        C6122U2.A09(C5987Rp.A09(context));
    }
}
