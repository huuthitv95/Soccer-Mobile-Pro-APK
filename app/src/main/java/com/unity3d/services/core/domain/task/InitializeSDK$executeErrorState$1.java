package com.unity3d.services.core.domain.task;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: InitializeSDK.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
@DebugMetadata(m43503c = "com.unity3d.services.core.domain.task.InitializeSDK", m43504f = "InitializeSDK.kt", m43505i = {}, m43506l = {120}, m43507m = "executeErrorState-BWLJW6A", m43508n = {}, m43509s = {})
final class InitializeSDK$executeErrorState$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeSDK this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeSDK$executeErrorState$1(InitializeSDK initializeSDK, Continuation<? super InitializeSDK$executeErrorState$1> continuation) {
        super(continuation);
        this.this$0 = initializeSDK;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM44716executeErrorStateBWLJW6A = this.this$0.m44716executeErrorStateBWLJW6A(null, null, null, this);
        return objM44716executeErrorStateBWLJW6A == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM44716executeErrorStateBWLJW6A : Result.m44945boximpl(objM44716executeErrorStateBWLJW6A);
    }
}
