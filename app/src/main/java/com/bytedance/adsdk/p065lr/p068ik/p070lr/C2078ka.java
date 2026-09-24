package com.bytedance.adsdk.p065lr.p068ik.p070lr;

import com.bytedance.adsdk.p065lr.p066di.C2018fi;
import com.bytedance.adsdk.p065lr.p066di.C2021lr;
import java.util.Arrays;

/* JADX INFO: renamed from: com.bytedance.adsdk.lr.ik.lr.ka */
/* JADX INFO: loaded from: classes3.dex */
public class C2078ka {

    /* JADX INFO: renamed from: lr */
    private final int[] f4958lr;

    /* JADX INFO: renamed from: ri */
    private final float[] f4959ri;

    public C2078ka(float[] fArr, int[] iArr) {
        this.f4959ri = fArr;
        this.f4958lr = iArr;
    }

    /* JADX INFO: renamed from: ri */
    private int m6839ri(float f) {
        int iBinarySearch = Arrays.binarySearch(this.f4959ri, f);
        if (iBinarySearch >= 0) {
            return this.f4958lr[iBinarySearch];
        }
        int i = -(iBinarySearch + 1);
        if (i == 0) {
            return this.f4958lr[0];
        }
        int[] iArr = this.f4958lr;
        if (i == iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        float[] fArr = this.f4959ri;
        int i2 = i - 1;
        float f2 = fArr[i2];
        return C2021lr.m6589ri((f - f2) / (fArr[i] - f2), iArr[i2], iArr[i]);
    }

    /* JADX INFO: renamed from: ik */
    public int m6840ik() {
        return this.f4958lr.length;
    }

    /* JADX INFO: renamed from: lr */
    public int[] m6841lr() {
        return this.f4958lr;
    }

    /* JADX INFO: renamed from: ri */
    public C2078ka m6842ri(float[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            iArr[i] = m6839ri(fArr[i]);
        }
        return new C2078ka(fArr, iArr);
    }

    /* JADX INFO: renamed from: ri */
    public void m6843ri(C2078ka c2078ka, C2078ka c2078ka2, float f) {
        if (c2078ka.f4958lr.length == c2078ka2.f4958lr.length) {
            for (int i = 0; i < c2078ka.f4958lr.length; i++) {
                this.f4959ri[i] = C2018fi.m6560ri(c2078ka.f4959ri[i], c2078ka2.f4959ri[i], f);
                this.f4958lr[i] = C2021lr.m6589ri(f, c2078ka.f4958lr[i], c2078ka2.f4958lr[i]);
            }
            return;
        }
        throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + c2078ka.f4958lr.length + " vs " + c2078ka2.f4958lr.length + ")");
    }

    /* JADX INFO: renamed from: ri */
    public float[] m6844ri() {
        return this.f4959ri;
    }
}
