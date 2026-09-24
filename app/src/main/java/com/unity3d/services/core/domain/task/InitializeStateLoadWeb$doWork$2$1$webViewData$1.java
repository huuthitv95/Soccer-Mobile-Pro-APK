package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.network.model.HttpRequest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: InitializeStateLoadWeb.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m43475d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
@DebugMetadata(m43503c = "com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2$1$webViewData$1", m43504f = "InitializeStateLoadWeb.kt", m43505i = {}, m43506l = {71, 71}, m43507m = "invokeSuspend", m43508n = {}, m43509s = {})
final class InitializeStateLoadWeb$doWork$2$1$webViewData$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super String>, Object> {
    final /* synthetic */ HttpRequest $request;
    int label;
    final /* synthetic */ InitializeStateLoadWeb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeStateLoadWeb$doWork$2$1$webViewData$1(InitializeStateLoadWeb initializeStateLoadWeb, HttpRequest httpRequest, Continuation<? super InitializeStateLoadWeb$doWork$2$1$webViewData$1> continuation) {
        super(2, continuation);
        this.this$0 = initializeStateLoadWeb;
        this.$request = httpRequest;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new InitializeStateLoadWeb$doWork$2$1$webViewData$1(this.this$0, this.$request, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super String> continuation) {
        return ((InitializeStateLoadWeb$doWork$2$1$webViewData$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (r10 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.ResultKt.throwOnFailure(r10)
            goto L47
        L12:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L1a:
            kotlin.ResultKt.throwOnFailure(r10)
            goto L33
        L1e:
            kotlin.ResultKt.throwOnFailure(r10)
            com.unity3d.services.core.domain.task.InitializeStateLoadWeb r10 = r9.this$0
            com.unity3d.ads.core.domain.HttpClientProvider r10 = com.unity3d.services.core.domain.task.InitializeStateLoadWeb.access$getHttpClientProvider$p(r10)
            r1 = r9
            kotlin.coroutines.Continuation r1 = (kotlin.coroutines.Continuation) r1
            r9.label = r3
            java.lang.Object r10 = r10.invoke(r1)
            if (r10 != r0) goto L33
            goto L46
        L33:
            r3 = r10
            com.unity3d.services.core.network.core.HttpClient r3 = (com.unity3d.services.core.network.core.HttpClient) r3
            com.unity3d.services.core.network.model.HttpRequest r4 = r9.$request
            r6 = r9
            kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
            r9.label = r2
            r5 = 0
            r7 = 2
            r8 = 0
            java.lang.Object r10 = com.unity3d.services.core.network.core.HttpClient.DefaultImpls.execute$default(r3, r4, r5, r6, r7, r8)
            if (r10 != r0) goto L47
        L46:
            return r0
        L47:
            com.unity3d.services.core.network.model.HttpResponse r10 = (com.unity3d.services.core.network.model.HttpResponse) r10
            java.lang.Object r10 = r10.getBody()
            java.lang.String r10 = r10.toString()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2$1$webViewData$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
