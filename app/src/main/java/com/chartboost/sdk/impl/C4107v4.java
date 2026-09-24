package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.w3c.dom.Element;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.v4 */
/* JADX INFO: loaded from: classes3.dex */
public final class C4107v4 {

    /* JADX INFO: renamed from: a */
    public static final C4107v4 f16539a = new C4107v4();

    /* JADX INFO: renamed from: a */
    public final C4085u4 m19646a(Element element, C3923mj c3923mj) {
        List listEmptyList;
        List listM18696d = C3925ml.f15411a.m18696d(element, "StaticResource");
        ArrayList arrayList = new ArrayList();
        Iterator it = listM18696d.iterator();
        while (it.hasNext()) {
            C3691ch c3691chM17304a = C3714dh.f13839a.m17304a((Element) it.next());
            if (c3691chM17304a != null) {
                arrayList.add(c3691chM17304a);
            }
        }
        List listM18696d2 = C3925ml.f15411a.m18696d(element, "IFrameResource");
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = listM18696d2.iterator();
        while (it2.hasNext()) {
            C3798h9 c3798h9M17967a = C3821i9.f14573a.m17967a((Element) it2.next());
            if (c3798h9M17967a != null) {
                arrayList2.add(c3798h9M17967a);
            }
        }
        List listM18696d3 = C3925ml.f15411a.m18696d(element, "HTMLResource");
        ArrayList arrayList3 = new ArrayList();
        Iterator it3 = listM18696d3.iterator();
        while (it3.hasNext()) {
            C3637a9 c3637a9M16911a = C3660b9.f13550a.m16911a((Element) it3.next());
            if (c3637a9M16911a != null) {
                arrayList3.add(c3637a9M16911a);
            }
        }
        C3925ml c3925ml = C3925ml.f15411a;
        Element elementM18695c = c3925ml.m18695c(element, "TrackingEvents");
        if (elementM18695c == null || (listEmptyList = C3853ji.f14980a.m18288a(elementM18695c, c3923mj)) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List list = listEmptyList;
        String strM18697e = c3925ml.m18697e(element, "CompanionClickThrough");
        List listM18698f = c3925ml.m18698f(element, "CompanionClickTracking");
        if (arrayList.isEmpty() && arrayList2.isEmpty() && arrayList3.isEmpty()) {
            return null;
        }
        String strM18694b = c3925ml.m18694b(element, "id");
        String strM18694b2 = c3925ml.m18694b(element, "width");
        Integer intOrNull = strM18694b2 != null ? StringsKt.toIntOrNull(strM18694b2) : null;
        String strM18694b3 = c3925ml.m18694b(element, "height");
        Integer intOrNull2 = strM18694b3 != null ? StringsKt.toIntOrNull(strM18694b3) : null;
        String strM18694b4 = c3925ml.m18694b(element, "assetWidth");
        Integer intOrNull3 = strM18694b4 != null ? StringsKt.toIntOrNull(strM18694b4) : null;
        String strM18694b5 = c3925ml.m18694b(element, "assetHeight");
        Integer intOrNull4 = strM18694b5 != null ? StringsKt.toIntOrNull(strM18694b5) : null;
        String strM18694b6 = c3925ml.m18694b(element, "expandedWidth");
        Integer intOrNull5 = strM18694b6 != null ? StringsKt.toIntOrNull(strM18694b6) : null;
        String strM18694b7 = c3925ml.m18694b(element, "expandedHeight");
        return new C4085u4(strM18694b, intOrNull, intOrNull2, intOrNull3, intOrNull4, intOrNull5, strM18694b7 != null ? StringsKt.toIntOrNull(strM18694b7) : null, c3925ml.m18694b(element, "apiFramework"), c3925ml.m18694b(element, "adSlotID"), c3925ml.m18694b(element, "pxratio"), c3925ml.m18697e(element, "AltText"), c3925ml.m18697e(element, "AdParameters"), arrayList, arrayList2, arrayList3, list, strM18697e, listM18698f, null, 262144, null);
    }

    /* JADX INFO: renamed from: b */
    public final C4151x4 m19647b(Element element, C3923mj context) {
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(context, "context");
        C3925ml c3925ml = C3925ml.f15411a;
        String strM18694b = c3925ml.m18694b(element, "required");
        ArrayList arrayList = new ArrayList();
        Iterator it = c3925ml.m18696d(element, "Companion").iterator();
        while (it.hasNext()) {
            C4085u4 c4085u4M19646a = f16539a.m19646a((Element) it.next(), context);
            if (c4085u4M19646a != null) {
                arrayList.add(c4085u4M19646a);
            }
        }
        return new C4151x4(strM18694b, arrayList);
    }
}
