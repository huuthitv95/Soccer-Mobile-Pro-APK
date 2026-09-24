package com.facebook.ads.redexgen.core;

import android.view.View;
import com.facebook.ads.NativeAdLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.aO */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public abstract class AbstractC6511aO {
    public static C6506aJ A00(C6902gi c6902gi, boolean z, AbstractC7077jd abstractC7077jd, C6200VI c6200vi, InterfaceC6406Yh interfaceC6406Yh, EnumC6509aM enumC6509aM, InterfaceC6507aK interfaceC6507aK, EnumC6512aP enumC6512aP) {
        return new C6506aJ(c6902gi, z, abstractC7077jd, c6200vi, interfaceC6406Yh, enumC6509aM, interfaceC6507aK, enumC6512aP);
    }

    public static C6506aJ A01(C6902gi c6902gi, boolean z, AbstractC7077jd abstractC7077jd, C6200VI c6200vi, InterfaceC6406Yh interfaceC6406Yh, EnumC6509aM enumC6509aM, EnumC6512aP enumC6512aP) {
        return new C6506aJ(c6902gi, z, abstractC7077jd, c6200vi, interfaceC6406Yh, enumC6509aM, enumC6512aP);
    }

    public static C6510aN A02(C6902gi c6902gi, EnumC6509aM enumC6509aM, AbstractC7077jd abstractC7077jd) {
        return new C6510aN(c6902gi, enumC6509aM, abstractC7077jd);
    }

    public static C6519aW A03(C6902gi c6902gi, EnumC6509aM enumC6509aM, AbstractC7077jd abstractC7077jd, View view, EnumC6385YM enumC6385YM, NativeAdLayout nativeAdLayout, InterfaceC6507aK interfaceC6507aK) {
        return new C6519aW(c6902gi, enumC6509aM, abstractC7077jd, view, enumC6385YM, nativeAdLayout, interfaceC6507aK);
    }
}
