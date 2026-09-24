package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.w3c.dom.Element;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.ta */
/* JADX INFO: loaded from: classes3.dex */
public final class C4069ta {

    /* JADX INFO: renamed from: a */
    public static final C4069ta f16329a = new C4069ta();

    /* JADX INFO: renamed from: a */
    public final Object m19464a(Element element, C3923mj context) throws Throwable {
        String str;
        List listEmptyList;
        List listM18696d;
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(context, "context");
        C3925ml c3925ml = C3925ml.f15411a;
        String strM18697e = c3925ml.m18697e(element, "AdSystem");
        String strM18697e2 = c3925ml.m18697e(element, "AdTitle");
        String strM18697e3 = c3925ml.m18697e(element, "Description");
        String strM18697e4 = c3925ml.m18697e(element, "Error");
        if (strM18697e4 != null) {
            str = strM18697e4;
            context.m18689b().add(new C3761fi("error", str, context.m18690c(), null, null, null, 56, null));
        } else {
            str = strM18697e4;
        }
        List listM18698f = c3925ml.m18698f(element, "Impression");
        Iterator it = listM18698f.iterator();
        while (it.hasNext()) {
            context.m18689b().add(new C3761fi("impression", (String) it.next(), context.m18690c(), null, null, null, 56, null));
        }
        C3925ml c3925ml2 = C3925ml.f15411a;
        Element elementM18695c = c3925ml2.m18695c(element, "Creatives");
        if (elementM18695c == null) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m44946constructorimpl(ResultKt.createFailure(new C3824ic("Creatives in InLine", null, 2, null)));
        }
        Object objM18487b = C3886l5.f15193a.m18487b(elementM18695c, context);
        if (Result.m44952isFailureimpl(objM18487b)) {
            Result.Companion companion2 = Result.INSTANCE;
            Throwable thM44949exceptionOrNullimpl = Result.m44949exceptionOrNullimpl(objM18487b);
            Intrinsics.checkNotNull(thM44949exceptionOrNullimpl);
            return Result.m44946constructorimpl(ResultKt.createFailure(thM44949exceptionOrNullimpl));
        }
        Element elementM18695c2 = c3925ml2.m18695c(element, "Extensions");
        if (elementM18695c2 == null || (listEmptyList = C3889l8.f15196a.m18495b(elementM18695c2, context)) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List list = listEmptyList;
        ArrayList arrayList = new ArrayList();
        Element elementM18695c3 = c3925ml2.m18695c(element, "AdVerifications");
        if (elementM18695c3 != null) {
            arrayList.addAll(C4059t0.f16312a.m19450b(elementM18695c3, context));
        }
        if (elementM18695c2 != null && (listM18696d = c3925ml2.m18696d(elementM18695c2, "Extension")) != null) {
            Iterator it2 = listM18696d.iterator();
            while (it2.hasNext()) {
                Element elementM18695c4 = C3925ml.f15411a.m18695c((Element) it2.next(), "AdVerifications");
                if (elementM18695c4 != null) {
                    arrayList.addAll(C4059t0.f16312a.m19450b(elementM18695c4, context));
                }
            }
        }
        List listDistinct = CollectionsKt.distinct(arrayList);
        context.m18688a().addAll(listDistinct);
        List listM16850b = C3649al.f13483a.m16850b(element);
        Result.Companion companion3 = Result.INSTANCE;
        ResultKt.throwOnFailure(objM18487b);
        return Result.m44946constructorimpl(new C4047sa(strM18697e, strM18697e2, strM18697e3, str, listM18698f, (List) objM18487b, list, listDistinct, listM16850b));
    }
}
