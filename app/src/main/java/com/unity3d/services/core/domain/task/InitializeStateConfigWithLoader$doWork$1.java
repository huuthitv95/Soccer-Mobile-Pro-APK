package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.configuration.Configuration;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: InitializeStateConfigWithLoader.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
@DebugMetadata(m43503c = "com.unity3d.services.core.domain.task.InitializeStateConfigWithLoader", m43504f = "InitializeStateConfigWithLoader.kt", m43505i = {}, m43506l = {33}, m43507m = "doWork-gIAlu-s", m43508n = {}, m43509s = {})
final class InitializeStateConfigWithLoader$doWork$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InitializeStateConfigWithLoader this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeStateConfigWithLoader$doWork$1(InitializeStateConfigWithLoader initializeStateConfigWithLoader, Continuation<? super InitializeStateConfigWithLoader$doWork$1> continuation) {
        super(continuation);
        this.this$0 = initializeStateConfigWithLoader;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objMo44711doWorkgIAlus = this.this$0.mo44711doWorkgIAlus((InitializeStateConfigWithLoader.Params) null, (Continuation<? super Result<? extends Configuration>>) this);
        return objMo44711doWorkgIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objMo44711doWorkgIAlus : Result.m44945boximpl(objMo44711doWorkgIAlus);
    }
}
