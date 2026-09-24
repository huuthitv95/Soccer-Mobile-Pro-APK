package com.google.android.material.color.utilities;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;

/* JADX INFO: loaded from: classes4.dex */
public final class ViewingConditions {
    public static final ViewingConditions DEFAULT = defaultWithBackgroundLstar(50.0d);

    /* JADX INFO: renamed from: aw */
    private final double f21944aw;

    /* JADX INFO: renamed from: c */
    private final double f21945c;

    /* JADX INFO: renamed from: fl */
    private final double f21946fl;
    private final double flRoot;

    /* JADX INFO: renamed from: n */
    private final double f21947n;
    private final double nbb;

    /* JADX INFO: renamed from: nc */
    private final double f21948nc;
    private final double ncb;
    private final double[] rgbD;

    /* JADX INFO: renamed from: z */
    private final double f21949z;

    private ViewingConditions(double d, double d2, double d3, double d4, double d5, double d6, double[] dArr, double d7, double d8, double d9) {
        this.f21947n = d;
        this.f21944aw = d2;
        this.nbb = d3;
        this.ncb = d4;
        this.f21945c = d5;
        this.f21948nc = d6;
        this.rgbD = dArr;
        this.f21946fl = d7;
        this.flRoot = d8;
        this.f21949z = d9;
    }

    public static ViewingConditions defaultWithBackgroundLstar(double d) {
        return make(ColorUtils.whitePointD65(), (ColorUtils.yFromLstar(50.0d) * 63.66197723675813d) / 100.0d, d, 2.0d, false);
    }

    public static ViewingConditions make(double[] dArr, double d, double d2, double d3, boolean z) {
        double dMax = Math.max(0.1d, d2);
        double[][] dArr2 = Cam16.XYZ_TO_CAM16RGB;
        double d4 = dArr[0];
        double[] dArr3 = dArr2[0];
        double d5 = dArr3[0] * d4;
        double d6 = dArr[1];
        double d7 = d5 + (dArr3[1] * d6);
        double d8 = dArr[2];
        double d9 = d7 + (dArr3[2] * d8);
        double[] dArr4 = dArr2[1];
        double d10 = (dArr4[0] * d4) + (dArr4[1] * d6) + (dArr4[2] * d8);
        double[] dArr5 = dArr2[2];
        double d11 = (d4 * dArr5[0]) + (d6 * dArr5[1]) + (d8 * dArr5[2]);
        double d12 = (d3 / 10.0d) + 0.8d;
        double dLerp = d12 >= 0.9d ? MathUtils.lerp(0.59d, 0.69d, (d12 - 0.9d) * 10.0d) : MathUtils.lerp(0.525d, 0.59d, (d12 - 0.8d) * 10.0d);
        double dClampDouble = MathUtils.clampDouble(FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, 1.0d, z ? 1.0d : (1.0d - (Math.exp(((-d) - 42.0d) / 92.0d) * 0.2777777777777778d)) * d12);
        double[] dArr6 = {(((100.0d / d9) * dClampDouble) + 1.0d) - dClampDouble, (((100.0d / d10) * dClampDouble) + 1.0d) - dClampDouble, (((100.0d / d11) * dClampDouble) + 1.0d) - dClampDouble};
        double d13 = 5.0d * d;
        double d14 = 1.0d / (d13 + 1.0d);
        double d15 = d14 * d14 * d14 * d14;
        double d16 = 1.0d - d15;
        double dCbrt = (d15 * d) + (d16 * 0.1d * d16 * Math.cbrt(d13));
        double dYFromLstar = ColorUtils.yFromLstar(dMax) / dArr[1];
        double dSqrt = Math.sqrt(dYFromLstar) + 1.48d;
        double dPow = 0.725d / Math.pow(dYFromLstar, 0.2d);
        double[] dArr7 = {Math.pow(((dArr6[0] * dCbrt) * d9) / 100.0d, 0.42d), Math.pow(((dArr6[1] * dCbrt) * d10) / 100.0d, 0.42d), Math.pow(((dArr6[2] * dCbrt) * d11) / 100.0d, 0.42d)};
        double d17 = dArr7[0];
        double d18 = (d17 * 400.0d) / (d17 + 27.13d);
        double d19 = dArr7[1];
        double d20 = (d19 * 400.0d) / (d19 + 27.13d);
        double d21 = dArr7[2];
        double[] dArr8 = {d18, d20, (400.0d * d21) / (d21 + 27.13d)};
        return new ViewingConditions(dYFromLstar, ((dArr8[0] * 2.0d) + dArr8[1] + (dArr8[2] * 0.05d)) * dPow, dPow, dPow, dLerp, d12, dArr6, dCbrt, Math.pow(dCbrt, 0.25d), dSqrt);
    }

    public double getAw() {
        return this.f21944aw;
    }

    double getC() {
        return this.f21945c;
    }

    double getFl() {
        return this.f21946fl;
    }

    public double getFlRoot() {
        return this.flRoot;
    }

    public double getN() {
        return this.f21947n;
    }

    public double getNbb() {
        return this.nbb;
    }

    double getNc() {
        return this.f21948nc;
    }

    double getNcb() {
        return this.ncb;
    }

    public double[] getRgbD() {
        return this.rgbD;
    }

    double getZ() {
        return this.f21949z;
    }
}
