package com.chartboost.sdk.impl;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.w3c.dom.Element;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.mb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3915mb {

    /* JADX INFO: renamed from: a */
    public static final C3915mb f15344a = new C3915mb();

    /* JADX INFO: renamed from: a */
    public final C3892lb m18636a(Element element, C3923mj context) {
        List listEmptyList;
        List listEmptyList2;
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(context, "context");
        C3925ml c3925ml = C3925ml.f15411a;
        String strM18697e = c3925ml.m18697e(element, "Duration");
        Element elementM18695c = c3925ml.m18695c(element, "TrackingEvents");
        if (elementM18695c == null || (listEmptyList = C3853ji.f14980a.m18288a(elementM18695c, context)) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List list = listEmptyList;
        Element elementM18695c2 = c3925ml.m18695c(element, "VideoClicks");
        C4188yj c4188yjM20156a = elementM18695c2 != null ? C4210zj.f17154a.m20156a(elementM18695c2) : null;
        Element elementM18695c3 = c3925ml.m18695c(element, "MediaFiles");
        if (elementM18695c3 == null || (listEmptyList2 = C3663bc.f13556a.m16917b(elementM18695c3)) == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        return new C3892lb(strM18697e, list, c4188yjM20156a, listEmptyList2, C3936n9.f15481a.m18777b(element, context));
    }
}
