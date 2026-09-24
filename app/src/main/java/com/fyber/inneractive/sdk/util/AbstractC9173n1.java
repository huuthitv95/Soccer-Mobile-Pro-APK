package com.fyber.inneractive.sdk.util;

import com.fyber.inneractive.sdk.config.C8016l0;
import com.fyber.inneractive.sdk.config.C8026q0;
import com.fyber.inneractive.sdk.config.C8028r0;
import com.fyber.inneractive.sdk.config.C8043t0;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: renamed from: com.fyber.inneractive.sdk.util.n1 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC9173n1 {
    /* JADX INFO: renamed from: a */
    public static String m21986a(String str) {
        C8016l0 c8016l0;
        UnitDisplayType unitDisplayType;
        UnitDisplayType unitDisplayType2;
        UnitDisplayType unitDisplayType3;
        IAConfigManager iAConfigManager = IAConfigManager.f17654M;
        HashMap map = iAConfigManager.f17669a;
        C8026q0 c8026q0 = (map == null || !map.containsKey(str)) ? null : (C8026q0) iAConfigManager.f17669a.get(str);
        UnitDisplayType unitDisplayType4 = UnitDisplayType.BANNER;
        if (c8026q0 == null) {
            return unitDisplayType4.name().toLowerCase(Locale.US);
        }
        for (int i = 0; i < c8026q0.f17809a.size(); i++) {
            C8028r0 c8028r0 = (C8028r0) c8026q0.f17809a.get(i);
            if (c8028r0 != null && ((c8016l0 = c8028r0.f17813c) != null || c8028r0.f17816f != null || c8028r0.f17815e != null)) {
                if (c8016l0 == null || (unitDisplayType3 = c8016l0.f17798b) == null || unitDisplayType3.isDeprecated() || UnitDisplayType.DEFAULT == unitDisplayType3) {
                    C8043t0 c8043t0 = c8028r0.f17816f;
                    if (c8043t0 != null && (unitDisplayType2 = c8043t0.f17876j) != null && !unitDisplayType2.isDeprecated() && UnitDisplayType.DEFAULT != unitDisplayType2) {
                        unitDisplayType4 = c8028r0.f17816f.f17876j;
                    } else if (c8028r0.f17815e != null && (unitDisplayType = UnitDisplayType.NATIVE) != null && !unitDisplayType.isDeprecated() && UnitDisplayType.DEFAULT != unitDisplayType) {
                        c8028r0.f17815e.getClass();
                        unitDisplayType4 = unitDisplayType;
                    }
                } else {
                    unitDisplayType4 = c8028r0.f17813c.f17798b;
                }
                if (UnitDisplayType.MRECT == unitDisplayType4) {
                    unitDisplayType4 = UnitDisplayType.BANNER;
                }
                if (UnitDisplayType.REWARDED == unitDisplayType4 || UnitDisplayType.INTERSTITIAL == unitDisplayType4 || UnitDisplayType.BANNER == unitDisplayType4 || UnitDisplayType.NATIVE == unitDisplayType4) {
                    return unitDisplayType4.name().toLowerCase(Locale.US);
                }
            }
        }
        return UnitDisplayType.BANNER.name().toLowerCase(Locale.US);
    }
}
