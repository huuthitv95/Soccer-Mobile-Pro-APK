package com.unity3d.services.core.domain.task;

import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: MetricTask.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
@DebugMetadata(m43503c = "com.unity3d.services.core.domain.task.MetricTask", m43504f = "MetricTask.kt", m43505i = {0, 0, 0}, m43506l = {24}, m43507m = "invoke-gIAlu-s$suspendImpl", m43508n = {"$this", "result", "start$iv"}, m43509s = {"L$0", "L$1", "J$0"})
final class MetricTask$invoke$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ MetricTask<P, R> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    MetricTask$invoke$1(MetricTask<? super P, R> metricTask, Continuation<? super MetricTask$invoke$1> continuation) {
        super(continuation);
        this.this$0 = metricTask;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM44729invokegIAlus$suspendImpl = MetricTask.m44729invokegIAlus$suspendImpl(this.this$0, null, this);
        return objM44729invokegIAlus$suspendImpl == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM44729invokegIAlus$suspendImpl : Result.m44945boximpl(objM44729invokegIAlus$suspendImpl);
    }
}
