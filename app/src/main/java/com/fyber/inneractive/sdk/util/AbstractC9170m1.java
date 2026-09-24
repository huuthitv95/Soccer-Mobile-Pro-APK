package com.fyber.inneractive.sdk.util;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.util.m1 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9170m1 {
    /* JADX INFO: renamed from: a */
    public static void m21979a(UnitDisplayType unitDisplayType, C9155h1 c9155h1, int i, int i2, int i3, int i4) {
        if (i > 0 && i2 > 0) {
            float f = i;
            float f2 = i2;
            float f3 = f / f2;
            if (unitDisplayType == UnitDisplayType.SQUARE) {
                i3 = (int) (i4 * f3);
            } else {
                if (Math.abs(f3 - 1.7777778f) >= 0.1f) {
                    Math.abs(f3 - 1.3333334f);
                }
                float fMin = Math.min(i3 / f, 10.0f);
                float f4 = i4;
                float f5 = fMin * f2;
                if (f4 > f5) {
                    i3 = (int) (fMin * f);
                    i4 = (int) f5;
                } else {
                    float fMin2 = Math.min(f4 / f2, 10.0f);
                    i3 = (int) (f * fMin2);
                    i4 = (int) (fMin2 * f2);
                }
            }
        }
        c9155h1.f21454a = i3;
        c9155h1.f21455b = i4;
    }
}
