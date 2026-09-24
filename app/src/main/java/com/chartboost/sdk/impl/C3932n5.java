package com.chartboost.sdk.impl;

import kotlin.jvm.internal.Intrinsics;
import org.w3c.dom.Element;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.n5 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3932n5 {

    /* JADX INFO: renamed from: a */
    public static final C3932n5 f15476a = new C3932n5();

    /* JADX INFO: renamed from: a */
    public final C3909m5 m18765a(Element element) {
        Intrinsics.checkNotNullParameter(element, "element");
        C3925ml c3925ml = C3925ml.f15411a;
        String strM18694b = c3925ml.m18694b(element, "type");
        Element elementM18695c = c3925ml.m18695c(element, "UniversalAdId");
        return new C3909m5(strM18694b, elementM18695c != null ? C4011qi.f16008a.m19217a(elementM18695c) : null);
    }
}
