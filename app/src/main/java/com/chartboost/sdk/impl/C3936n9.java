package com.chartboost.sdk.impl;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.w3c.dom.Element;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.n9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3936n9 {

    /* JADX INFO: renamed from: a */
    public static final C3936n9 f15481a = new C3936n9();

    /* JADX INFO: renamed from: a */
    public final C3844j9 m18776a(Element element, C3923mj context) {
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(context, "context");
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
        Element elementM18695c = c3925ml.m18695c(element, "IconClicks");
        C3890l9 c3890l9M18633a = elementM18695c != null ? C3913m9.f15335a.m18633a(elementM18695c) : null;
        List listM18698f = c3925ml.m18698f(element, "IconViewTracking");
        Iterator it4 = listM18698f.iterator();
        while (it4.hasNext()) {
            context.m18689b().add(new C3761fi("iconView", (String) it4.next(), context.m18690c(), null, null, null, 56, null));
        }
        C3925ml c3925ml2 = C3925ml.f15411a;
        String strM18694b = c3925ml2.m18694b(element, "program");
        String strM18694b2 = c3925ml2.m18694b(element, "width");
        Integer intOrNull = strM18694b2 != null ? StringsKt.toIntOrNull(strM18694b2) : null;
        String strM18694b3 = c3925ml2.m18694b(element, "height");
        return new C3844j9(strM18694b, intOrNull, strM18694b3 != null ? StringsKt.toIntOrNull(strM18694b3) : null, c3925ml2.m18694b(element, "xPosition"), c3925ml2.m18694b(element, "yPosition"), c3925ml2.m18694b(element, "duration"), c3925ml2.m18694b(element, TypedValues.CycleType.S_WAVE_OFFSET), c3925ml2.m18694b(element, "apiFramework"), c3925ml2.m18694b(element, "pxratio"), c3925ml2.m18694b(element, "altText"), c3925ml2.m18694b(element, "hoverText"), arrayList, arrayList2, arrayList3, c3890l9M18633a, listM18698f);
    }

    /* JADX INFO: renamed from: b */
    public final List m18777b(Element parentElement, C3923mj context) {
        List listM18696d;
        C3844j9 c3844j9M18776a;
        Intrinsics.checkNotNullParameter(parentElement, "parentElement");
        Intrinsics.checkNotNullParameter(context, "context");
        C3925ml c3925ml = C3925ml.f15411a;
        Element elementM18695c = c3925ml.m18695c(parentElement, "Icons");
        if (elementM18695c == null || (listM18696d = c3925ml.m18696d(elementM18695c, "Icon")) == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = listM18696d.iterator();
        while (it.hasNext()) {
            try {
                c3844j9M18776a = f15481a.m18776a((Element) it.next(), context);
            } catch (Exception e) {
                C4048sb.m19410b("Failed to parse Icon element: " + e.getMessage(), e);
                c3844j9M18776a = null;
            }
            if (c3844j9M18776a != null) {
                arrayList.add(c3844j9M18776a);
            }
        }
        return arrayList;
    }
}
