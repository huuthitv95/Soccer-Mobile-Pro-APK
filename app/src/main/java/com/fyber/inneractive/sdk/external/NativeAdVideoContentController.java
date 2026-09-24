package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.flow.AbstractC8221u0;
import com.fyber.inneractive.sdk.flow.AbstractC8236x;

/* JADX INFO: loaded from: classes4.dex */
public class NativeAdVideoContentController extends AbstractC8221u0 {
    @Override // com.fyber.inneractive.sdk.flow.AbstractC8128j0
    public boolean canControl(InneractiveAdSpot inneractiveAdSpot) {
        AbstractC8236x adContent = inneractiveAdSpot.getAdContent();
        return (adContent instanceof NativeAdContent) && adContent.isVideoAd();
    }
}
