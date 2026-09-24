package com.facebook.ads.redexgen.core;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Qp */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public class InterpolatorC5925Qp implements Interpolator {
    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        float f2 = f - 1.0f;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}
