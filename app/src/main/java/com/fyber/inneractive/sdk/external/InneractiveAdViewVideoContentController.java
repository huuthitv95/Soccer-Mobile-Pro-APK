package com.fyber.inneractive.sdk.external;

import com.fyber.inneractive.sdk.flow.AbstractC8221u0;
import com.fyber.inneractive.sdk.flow.C8219t0;
import com.fyber.inneractive.sdk.renderers.C9080x;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public class InneractiveAdViewVideoContentController extends AbstractC8221u0 {
    @Override // com.fyber.inneractive.sdk.flow.AbstractC8128j0
    public boolean canControl(InneractiveAdSpot inneractiveAdSpot) {
        return inneractiveAdSpot.getAdContent() instanceof C8219t0;
    }

    public void pauseVideo() {
    }

    public void playVideo() {
    }

    public void setControlledRenderer(C9080x c9080x) {
        new WeakReference(c9080x);
    }
}
