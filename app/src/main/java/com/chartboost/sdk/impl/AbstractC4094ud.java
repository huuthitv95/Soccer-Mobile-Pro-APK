package com.chartboost.sdk.impl;

import java.io.IOException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.ud */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4094ud {

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.ud$a */
    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Call f16489b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Call call) {
            super(1);
            this.f16489b = call;
        }

        /* JADX INFO: renamed from: a */
        public final void m19588a(Throwable th) {
            this.f16489b.cancel();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            m19588a((Throwable) obj);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.ud$b */
    public static final class b implements Callback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ CancellableContinuation f16490a;

        public b(CancellableContinuation cancellableContinuation) {
            this.f16490a = cancellableContinuation;
        }

        @Override // okhttp3.Callback
        public void onFailure(Call call, IOException e) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(e, "e");
            if (this.f16490a.isActive()) {
                CancellableContinuation cancellableContinuation = this.f16490a;
                Result.Companion companion = Result.INSTANCE;
                cancellableContinuation.resumeWith(Result.m44946constructorimpl(ResultKt.createFailure(e)));
            }
        }

        @Override // okhttp3.Callback
        public void onResponse(Call call, Response response) {
            Intrinsics.checkNotNullParameter(call, "call");
            Intrinsics.checkNotNullParameter(response, "response");
            if (!this.f16490a.isActive()) {
                response.close();
                return;
            }
            CancellableContinuation cancellableContinuation = this.f16490a;
            Result.Companion companion = Result.INSTANCE;
            cancellableContinuation.resumeWith(Result.m44946constructorimpl(response));
        }
    }

    /* JADX INFO: renamed from: a */
    public static final Object m19587a(OkHttpClient okHttpClient, Request request, Continuation continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        Call callNewCall = okHttpClient.newCall(request);
        cancellableContinuationImpl.invokeOnCancellation(new a(callNewCall));
        callNewCall.enqueue(new b(cancellableContinuationImpl));
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }
}
