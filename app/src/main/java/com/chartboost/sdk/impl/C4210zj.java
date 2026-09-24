package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.w3c.dom.Element;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.zj */
/* JADX INFO: loaded from: classes3.dex */
public final class C4210zj {

    /* JADX INFO: renamed from: a */
    public static final C4210zj f17154a = new C4210zj();

    /* JADX INFO: renamed from: a */
    public final C4188yj m20156a(Element element) {
        Intrinsics.checkNotNullParameter(element, "element");
        C3925ml c3925ml = C3925ml.f15411a;
        String strM18697e = c3925ml.m18697e(element, "ClickThrough");
        List listM18698f = c3925ml.m18698f(element, "ClickTracking");
        if (strM18697e == null && listM18698f.isEmpty()) {
            return null;
        }
        return new C4188yj(strM18697e, listM18698f);
    }
}
