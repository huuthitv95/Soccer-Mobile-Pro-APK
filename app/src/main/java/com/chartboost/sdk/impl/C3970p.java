package com.chartboost.sdk.impl;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.w3c.dom.Element;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.p */
/* JADX INFO: loaded from: classes3.dex */
public final class C3970p {

    /* JADX INFO: renamed from: a */
    public static final C3970p f15771a = new C3970p();

    /* JADX INFO: renamed from: a */
    public final Object m18986a(Element element, C3923mj context) throws Throwable {
        Intrinsics.checkNotNullParameter(element, "element");
        Intrinsics.checkNotNullParameter(context, "context");
        C3925ml c3925ml = C3925ml.f15411a;
        String strM18694b = c3925ml.m18694b(element, "id");
        Element elementM18695c = c3925ml.m18695c(element, "InLine");
        Element elementM18695c2 = c3925ml.m18695c(element, "Wrapper");
        if (elementM18695c != null) {
            Object objM19464a = C4069ta.f16329a.m19464a(elementM18695c, context);
            if (!Result.m44953isSuccessimpl(objM19464a)) {
                return Result.m44946constructorimpl(objM19464a);
            }
            Result.Companion companion = Result.INSTANCE;
            return Result.m44946constructorimpl(new AbstractC3673c.a(strM18694b, (C4047sa) objM19464a));
        }
        if (elementM18695c2 == null) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m44946constructorimpl(ResultKt.createFailure(new C3823ib("Ad element must contain InLine or Wrapper", 101)));
        }
        Object objM18540a = C3902ll.f15270a.m18540a(elementM18695c2, context);
        if (!Result.m44953isSuccessimpl(objM18540a)) {
            return Result.m44946constructorimpl(objM18540a);
        }
        Result.Companion companion3 = Result.INSTANCE;
        return Result.m44946constructorimpl(new AbstractC3673c.b(strM18694b, (C3879kl) objM18540a));
    }
}
