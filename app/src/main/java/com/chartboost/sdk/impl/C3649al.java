package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.w3c.dom.Element;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.al */
/* JADX INFO: loaded from: classes3.dex */
public final class C3649al {

    /* JADX INFO: renamed from: a */
    public static final C3649al f13483a = new C3649al();

    /* JADX INFO: renamed from: a */
    public final C4211zk m16849a(Element element) {
        Intrinsics.checkNotNullParameter(element, "element");
        C3925ml c3925ml = C3925ml.f15411a;
        return new C4211zk(c3925ml.m18694b(element, "id"), c3925ml.m18698f(element, "Viewable"), c3925ml.m18698f(element, "NotViewable"), c3925ml.m18698f(element, "ViewUndetermined"));
    }

    /* JADX INFO: renamed from: b */
    public final List m16850b(Element parentElement) {
        C4211zk c4211zkM16849a;
        Intrinsics.checkNotNullParameter(parentElement, "parentElement");
        List listM18696d = C3925ml.f15411a.m18696d(parentElement, "ViewableImpression");
        ArrayList arrayList = new ArrayList();
        Iterator it = listM18696d.iterator();
        while (it.hasNext()) {
            try {
                c4211zkM16849a = f13483a.m16849a((Element) it.next());
            } catch (Exception e) {
                C4048sb.m19410b("Failed to parse ViewableImpression element: " + e.getMessage(), e);
                c4211zkM16849a = null;
            }
            if (c4211zkM16849a != null) {
                arrayList.add(c4211zkM16849a);
            }
        }
        return arrayList;
    }
}
