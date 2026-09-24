package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.Configuration;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: InitializeStateConfig.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
@DebugMetadata(m43503c = "com.unity3d.services.core.domain.task.InitializeStateConfig", m43504f = "InitializeStateConfig.kt", m43505i = {}, m43506l = {24}, m43507m = "doWork-gIAlu-s", m43508n = {}, m43509s = {})
final class InitializeStateConfig$doWork$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeStateConfig this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeStateConfig$doWork$1(InitializeStateConfig initializeStateConfig, Continuation<? super InitializeStateConfig$doWork$1> continuation) {
        super(continuation);
        this.this$0 = initializeStateConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM44719doWorkgIAlus = this.this$0.m44719doWorkgIAlus((InitializeStateConfig.Params) null, (Continuation<? super Result<? extends Configuration>>) this);
        return objM44719doWorkgIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM44719doWorkgIAlus : Result.m44945boximpl(objM44719doWorkgIAlus);
    }
}
