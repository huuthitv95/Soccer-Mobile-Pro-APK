package com.facebook.ads.redexgen.core;

import android.view.View;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.internal.api.NativeComponentTagApi;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.SC */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C6010SC implements NativeComponentTagApi {
    @Override // com.facebook.ads.internal.api.NativeComponentTagApi
    public final void tagView(View view, NativeAdBase.NativeComponentTag nativeComponentTag) {
        if (view != null && nativeComponentTag != null) {
            EnumC6339Xc.A03(view, nativeComponentTag);
        }
    }
}
