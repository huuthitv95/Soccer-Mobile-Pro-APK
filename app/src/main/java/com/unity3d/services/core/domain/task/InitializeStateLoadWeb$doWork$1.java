package com.unity3d.services.core.domain.task;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: InitializeStateLoadWeb.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
@DebugMetadata(m43503c = "com.unity3d.services.core.domain.task.InitializeStateLoadWeb", m43504f = "InitializeStateLoadWeb.kt", m43505i = {}, m43506l = {39}, m43507m = "doWork-gIAlu-s", m43508n = {}, m43509s = {})
final class InitializeStateLoadWeb$doWork$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeStateLoadWeb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeStateLoadWeb$doWork$1(InitializeStateLoadWeb initializeStateLoadWeb, Continuation<? super InitializeStateLoadWeb$doWork$1> continuation) {
        super(continuation);
        this.this$0 = initializeStateLoadWeb;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM44725doWorkgIAlus = this.this$0.m44725doWorkgIAlus((InitializeStateLoadWeb.Params) null, (Continuation<? super Result<InitializeStateLoadWeb.LoadWebResult>>) this);
        return objM44725doWorkgIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM44725doWorkgIAlus : Result.m44945boximpl(objM44725doWorkgIAlus);
    }
}
