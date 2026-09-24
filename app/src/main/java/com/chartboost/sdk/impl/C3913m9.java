package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.w3c.dom.Element;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.m9 */
/* JADX INFO: loaded from: classes3.dex */
public final class C3913m9 {

    /* JADX INFO: renamed from: a */
    public static final C3913m9 f15335a = new C3913m9();

    /* JADX INFO: renamed from: a */
    public final C3890l9 m18633a(Element element) {
        Intrinsics.checkNotNullParameter(element, "element");
        C3925ml c3925ml = C3925ml.f15411a;
        String strM18697e = c3925ml.m18697e(element, "IconClickThrough");
        List listM18698f = c3925ml.m18698f(element, "IconClickTracking");
        ArrayList arrayList = new ArrayList();
        Element elementM18695c = c3925ml.m18695c(element, "IconClickFallbackImages");
        if (elementM18695c != null) {
            Iterator it = c3925ml.m18696d(elementM18695c, "IconClickFallbackImage").iterator();
            while (it.hasNext()) {
                C3867k9 c3867k9M18634b = f15335a.m18634b((Element) it.next());
                if (c3867k9M18634b != null) {
                    arrayList.add(c3867k9M18634b);
                }
            }
        }
        if (strM18697e == null && listM18698f.isEmpty() && arrayList.isEmpty()) {
            return null;
        }
        return new C3890l9(strM18697e, listM18698f, arrayList);
    }

    /* JADX INFO: renamed from: b */
    public final C3867k9 m18634b(Element element) {
        C3925ml c3925ml = C3925ml.f15411a;
        String strM18694b = c3925ml.m18694b(element, "width");
        Integer intOrNull = strM18694b != null ? StringsKt.toIntOrNull(strM18694b) : null;
        String strM18694b2 = c3925ml.m18694b(element, "height");
        Integer intOrNull2 = strM18694b2 != null ? StringsKt.toIntOrNull(strM18694b2) : null;
        String strM18697e = c3925ml.m18697e(element, "AltText");
        Element elementM18695c = c3925ml.m18695c(element, "StaticResource");
        C3691ch c3691chM17304a = elementM18695c != null ? C3714dh.f13839a.m17304a(elementM18695c) : null;
        if (c3691chM17304a != null) {
            return new C3867k9(intOrNull, intOrNull2, strM18697e, c3691chM17304a);
        }
        return null;
    }
}
