package com.unity3d.services.core.domain.task;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: InitializeStateError.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
@DebugMetadata(m43503c = "com.unity3d.services.core.domain.task.InitializeStateError", m43504f = "InitializeStateError.kt", m43505i = {}, m43506l = {27}, m43507m = "doWork-gIAlu-s", m43508n = {}, m43509s = {})
final class InitializeStateError$doWork$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeStateError this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeStateError$doWork$1(InitializeStateError initializeStateError, Continuation<? super InitializeStateError$doWork$1> continuation) {
        super(continuation);
        this.this$0 = initializeStateError;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM44723doWorkgIAlus = this.this$0.m44723doWorkgIAlus((InitializeStateError.Params) null, (Continuation<? super Result<Unit>>) this);
        return objM44723doWorkgIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM44723doWorkgIAlus : Result.m44945boximpl(objM44723doWorkgIAlus);
    }
}
