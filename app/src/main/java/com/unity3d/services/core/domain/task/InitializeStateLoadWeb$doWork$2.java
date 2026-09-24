package com.unity3d.services.core.domain.task;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: InitializeStateLoadWeb.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, m43475d2 = {"<anonymous>", "Lkotlin/Result;", "Lcom/unity3d/services/core/domain/task/InitializeStateLoadWeb$LoadWebResult;", "Lkotlinx/coroutines/CoroutineScope;"}, m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
@DebugMetadata(m43503c = "com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2", m43504f = "InitializeStateLoadWeb.kt", m43505i = {0, 0, 1}, m43506l = {46, 64, 71}, m43507m = "invokeSuspend", m43508n = {"$this$withContext", "request", "request"}, m43509s = {"L$0", "L$3", "L$2"})
final class InitializeStateLoadWeb$doWork$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends InitializeStateLoadWeb.LoadWebResult>>, Object> {
    final /* synthetic */ InitializeStateLoadWeb.Params $params;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ InitializeStateLoadWeb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeStateLoadWeb$doWork$2(InitializeStateLoadWeb.Params params, InitializeStateLoadWeb initializeStateLoadWeb, Continuation<? super InitializeStateLoadWeb$doWork$2> continuation) {
        super(2, continuation);
        this.$params = params;
        this.this$0 = initializeStateLoadWeb;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InitializeStateLoadWeb$doWork$2 initializeStateLoadWeb$doWork$2 = new InitializeStateLoadWeb$doWork$2(this.$params, this.this$0, continuation);
        initializeStateLoadWeb$doWork$2.L$0 = obj;
        return initializeStateLoadWeb$doWork$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends InitializeStateLoadWeb.LoadWebResult>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<InitializeStateLoadWeb.LoadWebResult>>) continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<InitializeStateLoadWeb.LoadWebResult>> continuation) {
        return ((InitializeStateLoadWeb$doWork$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x016b A[Catch: all -> 0x01f5, CancellationException -> 0x0222, TryCatch #5 {CancellationException -> 0x0222, all -> 0x01f5, blocks: (B:8:0x001a, B:46:0x018e, B:50:0x01b1, B:52:0x01bb, B:55:0x01c6, B:56:0x01d8, B:58:0x01db, B:59:0x01e7, B:41:0x0165, B:43:0x016b, B:47:0x0191, B:48:0x01a3, B:40:0x015b, B:33:0x0129, B:49:0x01a4, B:32:0x011f, B:23:0x0071), top: B:75:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0191 A[Catch: all -> 0x01f5, CancellationException -> 0x0222, TryCatch #5 {CancellationException -> 0x0222, all -> 0x01f5, blocks: (B:8:0x001a, B:46:0x018e, B:50:0x01b1, B:52:0x01bb, B:55:0x01c6, B:56:0x01d8, B:58:0x01db, B:59:0x01e7, B:41:0x0165, B:43:0x016b, B:47:0x0191, B:48:0x01a3, B:40:0x015b, B:33:0x0129, B:49:0x01a4, B:32:0x011f, B:23:0x0071), top: B:75:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:58:0x01db A[Catch: all -> 0x01f5, CancellationException -> 0x0222, TryCatch #5 {CancellationException -> 0x0222, all -> 0x01f5, blocks: (B:8:0x001a, B:46:0x018e, B:50:0x01b1, B:52:0x01bb, B:55:0x01c6, B:56:0x01d8, B:58:0x01db, B:59:0x01e7, B:41:0x0165, B:43:0x016b, B:47:0x0191, B:48:0x01a3, B:40:0x015b, B:33:0x0129, B:49:0x01a4, B:32:0x011f, B:23:0x0071), top: B:75:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0206  */
    /* JADX WARN: Code duplicated, block: B:66:0x020d  */
    /* JADX WARN: Code duplicated, block: B:68:0x0213  */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x018b, code lost:
    
        if (r0 == r8) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v28 */
    /* JADX WARN: Type inference failed for: r1v29 */
    /* JADX WARN: Type inference failed for: r1v3, types: [com.unity3d.services.core.network.model.HttpRequest] */
    /* JADX WARN: Type inference failed for: r1v30 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.unity3d.services.core.domain.task.InitializeStateLoadWeb] */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.core.domain.task.InitializeStateLoadWeb$doWork$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
