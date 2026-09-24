package com.chartboost.sdk.impl;

import com.chartboost.sdk.internal.Model.CBError;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.h */
/* JADX INFO: loaded from: classes3.dex */
public final class C3788h {

    /* JADX INFO: renamed from: a */
    public static final C3788h f14349a = new C3788h();

    /* JADX INFO: renamed from: a */
    public Object m17825a(String str, C3768g2 base64Wrapper, Function2 onLoadFailure) {
        Intrinsics.checkNotNullParameter(base64Wrapper, "base64Wrapper");
        Intrinsics.checkNotNullParameter(onLoadFailure, "onLoadFailure");
        String str2 = null;
        if (str != null) {
            String strM17751b = base64Wrapper.m17751b(str);
            if (strM17751b.length() == 0) {
                C4048sb.m19411b("Cannot decode provided bidResponse.", (Throwable) null, 2, (Object) null);
                onLoadFailure.invoke("", CBError.Impression.INVALID_RESPONSE);
                Result.Companion companion = Result.INSTANCE;
                return Result.m44946constructorimpl(ResultKt.createFailure(AbstractC3765g.a.f14258b));
            }
            str2 = strM17751b;
        }
        Result.Companion companion2 = Result.INSTANCE;
        return Result.m44946constructorimpl(str2);
    }
}
