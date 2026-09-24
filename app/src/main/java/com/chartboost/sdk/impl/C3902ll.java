package com.chartboost.sdk.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.w3c.dom.Element;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.ll */
/* JADX INFO: loaded from: classes3.dex */
public final class C3902ll {

    /* JADX INFO: renamed from: a */
    public static final C3902ll f15270a = new C3902ll();

    /* JADX INFO: renamed from: a */
    public final Object m18540a(Element element, C3923mj context) throws Throwable {
        Object objM44946constructorimpl;
        List listEmptyList;
        List listM18696d;
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(context, "context");
        C3925ml c3925ml = C3925ml.f15411a;
        String strM18697e = c3925ml.m18697e(element, "AdSystem");
        String strM18697e2 = c3925ml.m18697e(element, "Error");
        List listM18698f = c3925ml.m18698f(element, "Impression");
        String strM18697e3 = c3925ml.m18697e(element, "VASTAdTagURI");
        if (strM18697e3 == null) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m44946constructorimpl(ResultKt.createFailure(new C3824ic("VASTAdTagURI in Wrapper", null, 2, null)));
        }
        Element elementM18695c = c3925ml.m18695c(element, "Creatives");
        if (elementM18695c != null) {
            objM44946constructorimpl = C3886l5.f15193a.m18487b(elementM18695c, context);
        } else {
            Result.Companion companion2 = Result.INSTANCE;
            objM44946constructorimpl = Result.m44946constructorimpl(CollectionsKt.emptyList());
        }
        if (Result.m44952isFailureimpl(objM44946constructorimpl)) {
            Result.Companion companion3 = Result.INSTANCE;
            Throwable thM44949exceptionOrNullimpl = Result.m44949exceptionOrNullimpl(objM44946constructorimpl);
            Intrinsics.checkNotNull(thM44949exceptionOrNullimpl);
            return Result.m44946constructorimpl(ResultKt.createFailure(thM44949exceptionOrNullimpl));
        }
        Element elementM18695c2 = c3925ml.m18695c(element, "Extensions");
        if (elementM18695c2 == null || (listEmptyList = C3889l8.f15196a.m18495b(elementM18695c2, context)) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List list = listEmptyList;
        ArrayList arrayList = new ArrayList();
        Element elementM18695c3 = c3925ml.m18695c(element, "AdVerifications");
        if (elementM18695c3 != null) {
            arrayList.addAll(C4059t0.f16312a.m19450b(elementM18695c3, context));
        }
        if (elementM18695c2 != null && (listM18696d = c3925ml.m18696d(elementM18695c2, "Extension")) != null) {
            Iterator it = listM18696d.iterator();
            while (it.hasNext()) {
                Element elementM18695c4 = C3925ml.f15411a.m18695c((Element) it.next(), "AdVerifications");
                if (elementM18695c4 != null) {
                    arrayList.addAll(C4059t0.f16312a.m19450b(elementM18695c4, context));
                }
            }
        }
        List listM16850b = C3649al.f13483a.m16850b(element);
        Result.Companion companion4 = Result.INSTANCE;
        ResultKt.throwOnFailure(objM44946constructorimpl);
        return Result.m44946constructorimpl(new C3879kl(strM18697e, strM18697e2, listM18698f, (List) objM44946constructorimpl, list, strM18697e3, arrayList, listM16850b));
    }
}
