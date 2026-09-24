package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.w3c.dom.Element;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.bc */
/* JADX INFO: loaded from: classes3.dex */
public final class C3663bc {

    /* JADX INFO: renamed from: a */
    public static final C3663bc f13556a = new C3663bc();

    /* JADX INFO: renamed from: a */
    public final C3640ac m16916a(Element element) {
        String str;
        Integer num;
        String string;
        Intrinsics.checkNotNullParameter(element, "element");
        C3925ml c3925ml = C3925ml.f15411a;
        String strM18694b = c3925ml.m18694b(element, "type");
        if (strM18694b == null) {
            strM18694b = "";
        }
        String strM18694b2 = c3925ml.m18694b(element, "width");
        Integer intOrNull = strM18694b2 != null ? StringsKt.toIntOrNull(strM18694b2) : null;
        String strM18694b3 = c3925ml.m18694b(element, "height");
        Integer intOrNull2 = strM18694b3 != null ? StringsKt.toIntOrNull(strM18694b3) : null;
        String strM18694b4 = c3925ml.m18694b(element, "bitrate");
        Integer intOrNull3 = strM18694b4 != null ? StringsKt.toIntOrNull(strM18694b4) : null;
        String textContent = element.getTextContent();
        if (textContent == null || (string = StringsKt.trim((CharSequence) textContent).toString()) == null) {
            Integer num2 = intOrNull2;
            str = "";
            num = num2;
        } else {
            num = intOrNull2;
            str = string;
        }
        return new C3640ac(strM18694b, intOrNull, num, intOrNull3, str);
    }

    /* JADX INFO: renamed from: b */
    public final List m16917b(Element parentElement) {
        C3640ac c3640acM16916a;
        Intrinsics.checkNotNullParameter(parentElement, "parentElement");
        List listM18696d = C3925ml.f15411a.m18696d(parentElement, "MediaFile");
        ArrayList arrayList = new ArrayList();
        Iterator it = listM18696d.iterator();
        while (it.hasNext()) {
            try {
                c3640acM16916a = f13556a.m16916a((Element) it.next());
            } catch (Exception e) {
                C4048sb.m19410b("Failed to parse MediaFile element: " + e.getMessage(), e);
                c3640acM16916a = null;
            }
            if (c3640acM16916a != null) {
                arrayList.add(c3640acM16916a);
            }
        }
        return arrayList;
    }
}
