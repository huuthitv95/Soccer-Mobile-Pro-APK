package com.unity3d.services.core.domain.task;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: InitializeStateLoadCache.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
@DebugMetadata(m43503c = "com.unity3d.services.core.domain.task.InitializeStateLoadCache", m43504f = "InitializeStateLoadCache.kt", m43505i = {}, m43506l = {32}, m43507m = "doWork-gIAlu-s", m43508n = {}, m43509s = {})
final class InitializeStateLoadCache$doWork$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeStateLoadCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeStateLoadCache$doWork$1(InitializeStateLoadCache initializeStateLoadCache, Continuation<? super InitializeStateLoadCache$doWork$1> continuation) {
        super(continuation);
        this.this$0 = initializeStateLoadCache;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM44724doWorkgIAlus = this.this$0.m44724doWorkgIAlus((InitializeStateLoadCache.Params) null, (Continuation<? super Result<InitializeStateLoadCache.LoadCacheResult>>) this);
        return objM44724doWorkgIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM44724doWorkgIAlus : Result.m44945boximpl(objM44724doWorkgIAlus);
    }
}
