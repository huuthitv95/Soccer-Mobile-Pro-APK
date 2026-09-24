package com.facebook.ads.redexgen.core;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.X8 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class InterpolatorC6309X8 implements Interpolator {
    public final float A00;

    public InterpolatorC6309X8(float f) {
        this.A00 = f;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return (float) (1.0d - Math.pow(1.0f - f, this.A00));
    }
}
