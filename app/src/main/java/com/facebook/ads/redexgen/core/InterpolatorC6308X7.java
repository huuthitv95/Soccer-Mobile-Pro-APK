package com.facebook.ads.redexgen.core;

import android.view.animation.Interpolator;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.X7 */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class InterpolatorC6308X7 implements Interpolator {
    public final float A00;

    public InterpolatorC6308X7(float f) {
        this.A00 = f;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f) {
        return (float) Math.pow(f, this.A00);
    }
}
