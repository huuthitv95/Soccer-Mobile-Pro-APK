package com.chartboost.sdk.impl;

import android.content.Context;
import com.chartboost.sdk.events.ChartboostError;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.bb */
/* JADX INFO: loaded from: classes3.dex */
public final class C3662bb {

    /* JADX INFO: renamed from: a */
    public final C4028rd f13555a;

    public C3662bb(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        C4028rd c4028rd = new C4028rd(context);
        C4028rd.m19335a(c4028rd, null, 1, null);
        this.f13555a = c4028rd;
    }

    /* JADX INFO: renamed from: a */
    public final void m16912a() {
        this.f13555a.m19341b();
    }

    /* JADX INFO: renamed from: b */
    public final Object m16913b() {
        Result.Companion companion = Result.INSTANCE;
        return Result.m44946constructorimpl(Unit.INSTANCE);
    }

    /* JADX INFO: renamed from: c */
    public final Object m16914c() {
        if (this.f13555a.m19340a()) {
            Result.Companion companion = Result.INSTANCE;
            return Result.m44946constructorimpl(Unit.INSTANCE);
        }
        C4048sb.m19411b("Internet connection is not available.", (Throwable) null, 2, (Object) null);
        Result.Companion companion2 = Result.INSTANCE;
        return Result.m44946constructorimpl(ResultKt.createFailure(ChartboostError.Connectivity.NoInternet.INSTANCE));
    }

    /* JADX INFO: renamed from: d */
    public final Object m16915d() {
        Object objM16913b = m16913b();
        if (Result.m44952isFailureimpl(objM16913b)) {
            return objM16913b;
        }
        Object objM16914c = m16914c();
        if (Result.m44952isFailureimpl(objM16914c)) {
            return objM16914c;
        }
        Result.Companion companion = Result.INSTANCE;
        return Result.m44946constructorimpl(Unit.INSTANCE);
    }
}
