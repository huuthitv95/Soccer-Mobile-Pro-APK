package com.ironsource;

import android.p004os.OutcomeReceiver;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.ironsource.v1 */
/* JADX INFO: loaded from: classes6.dex */
public final class C12558v1 {

    /* JADX INFO: renamed from: com.ironsource.v1$a */
    public static final class a implements OutcomeReceiver<Object, Exception> {

        /* JADX INFO: renamed from: a */
        final /* synthetic */ Continuation<Unit> f32587a;

        /* JADX WARN: Multi-variable type inference failed */
        a(Continuation<? super Unit> continuation) {
            this.f32587a = continuation;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onError(Exception error) {
            Intrinsics.checkNotNullParameter(error, "error");
            Continuation<Unit> continuation = this.f32587a;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m44946constructorimpl(ResultKt.createFailure(error)));
        }

        public void onResult(Object obj) {
            Continuation<Unit> continuation = this.f32587a;
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m44946constructorimpl(Unit.INSTANCE));
        }
    }

    /* JADX INFO: renamed from: a */
    public static final OutcomeReceiver<Object, Exception> m33922a(Continuation<? super Unit> continuation) {
        Intrinsics.checkNotNullParameter(continuation, "<this>");
        return new a(continuation);
    }
}
