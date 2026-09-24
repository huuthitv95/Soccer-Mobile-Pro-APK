package com.unity3d.services.core.domain.task;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: InitializeStateReset.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
@DebugMetadata(m43503c = "com.unity3d.services.core.domain.task.InitializeStateReset", m43504f = "InitializeStateReset.kt", m43505i = {}, m43506l = {33}, m43507m = "doWork-gIAlu-s$suspendImpl", m43508n = {}, m43509s = {})
final class InitializeStateReset$doWork$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeStateReset this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeStateReset$doWork$1(InitializeStateReset initializeStateReset, Continuation<? super InitializeStateReset$doWork$1> continuation) {
        super(continuation);
        this.this$0 = initializeStateReset;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM44727doWorkgIAlus$suspendImpl = InitializeStateReset.m44727doWorkgIAlus$suspendImpl(this.this$0, null, this);
        return objM44727doWorkgIAlus$suspendImpl == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM44727doWorkgIAlus$suspendImpl : Result.m44945boximpl(objM44727doWorkgIAlus$suspendImpl);
    }
}
