package com.chartboost.sdk.impl;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.Dispatchers;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.oi */
/* JADX INFO: loaded from: classes3.dex */
public final class C3967oi implements InterfaceC3945ni {

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.oi$a */
    public static final class a extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f15743b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Function0 f15744c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Function0 function0, Continuation continuation) {
            super(2, continuation);
            this.f15744c = function0;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.f15744c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f15743b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            this.f15744c.invoke();
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.oi$b */
    public static final class b extends SuspendLambda implements Function2 {

        /* JADX INFO: renamed from: b */
        public int f15745b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ long f15746c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ Function0 f15747d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, Function0 function0, Continuation continuation) {
            super(2, continuation);
            this.f15746c = j;
            this.f15747d = function0;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.f15746c, this.f15747d, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.f15745b;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                long j = this.f15746c;
                this.f15745b = 1;
                if (DelayKt.delay(j, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            this.f15747d.invoke();
            return Unit.INSTANCE;
        }
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3945ni
    /* JADX INFO: renamed from: a */
    public void mo18804a(long j, Function0 call) {
        Intrinsics.checkNotNullParameter(call, "call");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new b(j, call, null), 3, null);
    }

    @Override // com.chartboost.sdk.impl.InterfaceC3945ni
    /* JADX INFO: renamed from: a */
    public void mo18805a(Function0 call) {
        Intrinsics.checkNotNullParameter(call, "call");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getMain()), null, null, new a(call, null), 3, null);
    }
}
