package com.chartboost.sdk.impl;

import java.net.URL;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: renamed from: com.chartboost.sdk.impl.x6 */
/* JADX INFO: loaded from: classes3.dex */
public interface InterfaceC4153x6 {

    /* JADX INFO: renamed from: com.chartboost.sdk.impl.x6$a */
    public static final class a {

        /* JADX INFO: renamed from: com.chartboost.sdk.impl.x6$a$a, reason: collision with other inner class name */
        public static final class C15489a extends ContinuationImpl {

            /* JADX INFO: renamed from: b */
            public /* synthetic */ Object f16906b;

            /* JADX INFO: renamed from: c */
            public int f16907c;

            public C15489a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) throws Throwable {
                this.f16906b = obj;
                this.f16907c |= Integer.MIN_VALUE;
                Object objM19919a = a.m19919a(null, null, this);
                return objM19919a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM19919a : Result.m44945boximpl(objM19919a);
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX INFO: renamed from: a */
        public static Object m19919a(InterfaceC4153x6 interfaceC4153x6, URL url, Continuation continuation) throws Throwable {
            C15489a c15489a;
            if (continuation instanceof C15489a) {
                c15489a = (C15489a) continuation;
                int i = c15489a.f16907c;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c15489a.f16907c = i - Integer.MIN_VALUE;
                } else {
                    c15489a = new C15489a(continuation);
                }
            } else {
                c15489a = new C15489a(continuation);
            }
            Object obj = c15489a.f16906b;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i2 = c15489a.f16907c;
            if (i2 != 0) {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((Result) obj).getValue();
            }
            ResultKt.throwOnFailure(obj);
            c15489a.f16907c = 1;
            Object objMo19895a = interfaceC4153x6.mo19895a(url, -1L, c15489a);
            return objMo19895a == coroutine_suspended ? coroutine_suspended : objMo19895a;
        }
    }

    /* JADX INFO: renamed from: a */
    Object mo19895a(URL url, long j, Continuation continuation);

    /* JADX INFO: renamed from: a */
    Object mo19897a(URL url, Continuation continuation);

    /* JADX INFO: renamed from: a */
    Flow mo19900a(URL url);
}
