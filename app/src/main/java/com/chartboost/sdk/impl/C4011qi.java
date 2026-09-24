package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.w3c.dom.Element;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.qi */
/* JADX INFO: loaded from: classes3.dex */
public final class C4011qi {

    /* JADX INFO: renamed from: a */
    public static final C4011qi f16008a = new C4011qi();

    /* JADX INFO: renamed from: a */
    public final C3989pi m19217a(Element element) {
        String string;
        Intrinsics.checkNotNullParameter(element, "element");
        String strM18694b = C3925ml.f15411a.m18694b(element, "idRegistry");
        String textContent = element.getTextContent();
        if (textContent == null || (string = StringsKt.trim((CharSequence) textContent).toString()) == null || string.length() <= 0) {
            string = null;
        }
        return new C3989pi(strM18694b, string);
    }

    /* JADX INFO: renamed from: b */
    public final List m19218b(Element parentElement) {
        C3989pi c3989piM19217a;
        Intrinsics.checkNotNullParameter(parentElement, "parentElement");
        List listM18696d = C3925ml.f15411a.m18696d(parentElement, "UniversalAdId");
        ArrayList arrayList = new ArrayList();
        Iterator it = listM18696d.iterator();
        while (it.hasNext()) {
            try {
                c3989piM19217a = f16008a.m19217a((Element) it.next());
            } catch (Exception e) {
                C4048sb.m19410b("Failed to parse UniversalAdId element: " + e.getMessage(), e);
                c3989piM19217a = null;
            }
            if (c3989piM19217a != null) {
                arrayList.add(c3989piM19217a);
            }
        }
        return arrayList;
    }
}
