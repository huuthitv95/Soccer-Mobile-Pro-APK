package com.unity3d.services.core.domain.task;

import com.unity3d.services.core.domain.task.BaseParams;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: BaseTask.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
@DebugMetadata(m43503c = "com.unity3d.services.core.domain.task.BaseTask$DefaultImpls", m43504f = "BaseTask.kt", m43505i = {}, m43506l = {11}, m43507m = "invoke-gIAlu-s", m43508n = {}, m43509s = {})
final class BaseTask$invoke$1<P extends BaseParams, R> extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    BaseTask$invoke$1(Continuation<? super BaseTask$invoke$1> continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM44713invokegIAlus = BaseTask.DefaultImpls.m44713invokegIAlus(null, null, this);
        return objM44713invokegIAlus == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM44713invokegIAlus : Result.m44945boximpl(objM44713invokegIAlus);
    }
}
