package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.extensions.ExceptionExtensionsKt;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.ads.gatewayclient.GatewayClient;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import gatewayprotocol.p299v1.UniversalRequestOuterClass;
import gatewayprotocol.p299v1.UniversalResponseOuterClass;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.TimeSource;

/* JADX INFO: compiled from: AndroidTriggerInitializationCompletedRequest.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0011\u0010\u000b\u001a\u00020\fH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\rR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, m43475d2 = {"Lcom/unity3d/ads/core/domain/AndroidTriggerInitializationCompletedRequest;", "Lcom/unity3d/ads/core/domain/TriggerInitializationCompletedRequest;", "getInitializationCompletedRequest", "Lcom/unity3d/ads/core/domain/GetInitializationCompletedRequest;", "getRequestPolicy", "Lcom/unity3d/ads/core/domain/GetRequestPolicy;", "gatewayClient", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "(Lcom/unity3d/ads/core/domain/GetInitializationCompletedRequest;Lcom/unity3d/ads/core/domain/GetRequestPolicy;Lcom/unity3d/ads/gatewayclient/GatewayClient;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "invoke", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class AndroidTriggerInitializationCompletedRequest implements TriggerInitializationCompletedRequest {
    private final GatewayClient gatewayClient;
    private final GetInitializationCompletedRequest getInitializationCompletedRequest;
    private final GetRequestPolicy getRequestPolicy;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidTriggerInitializationCompletedRequest$invoke$1 */
    /* JADX INFO: compiled from: AndroidTriggerInitializationCompletedRequest.kt */
    @Metadata(m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
    @DebugMetadata(m43503c = "com.unity3d.ads.core.domain.AndroidTriggerInitializationCompletedRequest", m43504f = "AndroidTriggerInitializationCompletedRequest.kt", m43505i = {0, 0, 1, 1}, m43506l = {32, 34}, m43507m = "invoke", m43508n = {"this", "startTime", "this", "startTime"}, m43509s = {"L$0", "J$0", "L$0", "J$0"})
    static final class C145181 extends ContinuationImpl {
        long J$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C145181(Continuation<? super C145181> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidTriggerInitializationCompletedRequest.this.invoke(this);
        }
    }

    public AndroidTriggerInitializationCompletedRequest(GetInitializationCompletedRequest getInitializationCompletedRequest, GetRequestPolicy getRequestPolicy, GatewayClient gatewayClient, SendDiagnosticEvent sendDiagnosticEvent) {
        Intrinsics.checkNotNullParameter(getInitializationCompletedRequest, "getInitializationCompletedRequest");
        Intrinsics.checkNotNullParameter(getRequestPolicy, "getRequestPolicy");
        Intrinsics.checkNotNullParameter(gatewayClient, "gatewayClient");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.getInitializationCompletedRequest = getInitializationCompletedRequest;
        this.getRequestPolicy = getRequestPolicy;
        this.gatewayClient = gatewayClient;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00cf A[Catch: Exception -> 0x013d, TRY_LEAVE, TryCatch #2 {Exception -> 0x013d, blocks: (B:36:0x00c7, B:38:0x00cf), top: B:57:0x00c7 }] */
    /* JADX WARN: Code duplicated, block: B:40:0x0119  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Override // com.unity3d.ads.core.domain.TriggerInitializationCompletedRequest
    public Object invoke(Continuation<? super Unit> continuation) throws Throwable {
        C145181 c145181;
        long jM46400markNowz9LOYto;
        char c;
        int i;
        int i2;
        long j;
        AndroidTriggerInitializationCompletedRequest androidTriggerInitializationCompletedRequest;
        AndroidTriggerInitializationCompletedRequest androidTriggerInitializationCompletedRequest2;
        AndroidTriggerInitializationCompletedRequest androidTriggerInitializationCompletedRequest3;
        long j2;
        UniversalResponseOuterClass.UniversalResponse universalResponse;
        if (continuation instanceof C145181) {
            c145181 = (C145181) continuation;
            if ((c145181.label & Integer.MIN_VALUE) != 0) {
                c145181.label -= Integer.MIN_VALUE;
            } else {
                c145181 = new C145181(continuation);
            }
        } else {
            c145181 = new C145181(continuation);
        }
        C145181 c145182 = c145181;
        Object objInvoke = c145182.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i3 = c145182.label;
        if (i3 != 0) {
            if (i3 == 1) {
                jM46400markNowz9LOYto = c145182.J$0;
                androidTriggerInitializationCompletedRequest2 = (AndroidTriggerInitializationCompletedRequest) c145182.L$0;
                try {
                    ResultKt.throwOnFailure(objInvoke);
                    try {
                        UniversalRequestOuterClass.UniversalRequest universalRequest = (UniversalRequestOuterClass.UniversalRequest) objInvoke;
                        RequestPolicy requestPolicyInvoke = androidTriggerInitializationCompletedRequest2.getRequestPolicy.invoke();
                        GatewayClient gatewayClient = androidTriggerInitializationCompletedRequest2.gatewayClient;
                        OperationType operationType = OperationType.INITIALIZATION_COMPLETED;
                        c145182.L$0 = androidTriggerInitializationCompletedRequest2;
                        c145182.J$0 = jM46400markNowz9LOYto;
                        c145182.label = 2;
                        c = 2;
                        j2 = jM46400markNowz9LOYto;
                        androidTriggerInitializationCompletedRequest3 = androidTriggerInitializationCompletedRequest2;
                        i = 1;
                        i2 = 0;
                        try {
                            objInvoke = GatewayClient.DefaultImpls.request$default(gatewayClient, null, universalRequest, requestPolicyInvoke, operationType, c145182, 1, null);
                            if (objInvoke != coroutine_suspended) {
                                androidTriggerInitializationCompletedRequest = androidTriggerInitializationCompletedRequest3;
                                j = j2;
                                universalResponse = (UniversalResponseOuterClass.UniversalResponse) objInvoke;
                                if (!universalResponse.hasError()) {
                                    SendDiagnosticEvent.DefaultImpls.invoke$default(androidTriggerInitializationCompletedRequest.sendDiagnosticEvent, "native_initialization_completed_event_request_success_time", Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource.Monotonic.ValueTimeMark.m46401boximpl(j))), null, null, null, null, 60, null);
                                    return Unit.INSTANCE;
                                }
                                SendDiagnosticEvent sendDiagnosticEvent = androidTriggerInitializationCompletedRequest.sendDiagnosticEvent;
                                Double dBoxDouble = Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource.Monotonic.ValueTimeMark.m46401boximpl(j)));
                                Pair[] pairArr = new Pair[3];
                                pairArr[i2] = TuplesKt.m43482to("operation", OperationType.INITIALIZATION_COMPLETED.toString());
                                pairArr[i] = TuplesKt.m43482to("reason", "gateway");
                                pairArr[c] = TuplesKt.m43482to("reason_debug", universalResponse.getError().getErrorText());
                                SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_initialization_completed_event_request_failure_time", dBoxDouble, MapsKt.mapOf(pairArr), null, null, null, 56, null);
                                return Unit.INSTANCE;
                            }
                            return coroutine_suspended;
                        } catch (Exception e) {
                            e = e;
                            androidTriggerInitializationCompletedRequest = androidTriggerInitializationCompletedRequest3;
                            j = j2;
                        }
                    } catch (Exception e2) {
                        e = e2;
                        androidTriggerInitializationCompletedRequest3 = androidTriggerInitializationCompletedRequest2;
                        c = 2;
                        i = 1;
                        j2 = jM46400markNowz9LOYto;
                        i2 = 0;
                    }
                } catch (Exception e3) {
                    e = e3;
                    androidTriggerInitializationCompletedRequest = androidTriggerInitializationCompletedRequest2;
                    j = jM46400markNowz9LOYto;
                    c = 2;
                    i = 1;
                    i2 = 0;
                }
            } else {
                if (i3 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = c145182.J$0;
                androidTriggerInitializationCompletedRequest = (AndroidTriggerInitializationCompletedRequest) c145182.L$0;
                try {
                    ResultKt.throwOnFailure(objInvoke);
                    c = 2;
                    i = 1;
                    i2 = 0;
                    try {
                        universalResponse = (UniversalResponseOuterClass.UniversalResponse) objInvoke;
                        if (!universalResponse.hasError()) {
                            SendDiagnosticEvent.DefaultImpls.invoke$default(androidTriggerInitializationCompletedRequest.sendDiagnosticEvent, "native_initialization_completed_event_request_success_time", Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource.Monotonic.ValueTimeMark.m46401boximpl(j))), null, null, null, null, 60, null);
                            return Unit.INSTANCE;
                        }
                        SendDiagnosticEvent sendDiagnosticEvent2 = androidTriggerInitializationCompletedRequest.sendDiagnosticEvent;
                        Double dBoxDouble2 = Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource.Monotonic.ValueTimeMark.m46401boximpl(j)));
                        Pair[] pairArr2 = new Pair[3];
                        pairArr2[i2] = TuplesKt.m43482to("operation", OperationType.INITIALIZATION_COMPLETED.toString());
                        pairArr2[i] = TuplesKt.m43482to("reason", "gateway");
                        pairArr2[c] = TuplesKt.m43482to("reason_debug", universalResponse.getError().getErrorText());
                        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, "native_initialization_completed_event_request_failure_time", dBoxDouble2, MapsKt.mapOf(pairArr2), null, null, null, 56, null);
                        return Unit.INSTANCE;
                    } catch (Exception e4) {
                        e = e4;
                    }
                } catch (Exception e5) {
                    e = e5;
                    c = 2;
                    i = 1;
                    i2 = 0;
                }
            }
            c = 2;
            i = 1;
            i2 = 0;
        } else {
            ResultKt.throwOnFailure(objInvoke);
            jM46400markNowz9LOYto = TimeSource.Monotonic.INSTANCE.m46400markNowz9LOYto();
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_initialization_completed_event_request_started", null, null, null, null, null, 62, null);
            try {
                GetInitializationCompletedRequest getInitializationCompletedRequest = this.getInitializationCompletedRequest;
                c145182.L$0 = this;
                c145182.J$0 = jM46400markNowz9LOYto;
                c145182.label = 1;
                objInvoke = getInitializationCompletedRequest.invoke(c145182);
                if (objInvoke != coroutine_suspended) {
                    androidTriggerInitializationCompletedRequest2 = this;
                    UniversalRequestOuterClass.UniversalRequest universalRequest2 = (UniversalRequestOuterClass.UniversalRequest) objInvoke;
                    RequestPolicy requestPolicyInvoke2 = androidTriggerInitializationCompletedRequest2.getRequestPolicy.invoke();
                    GatewayClient gatewayClient2 = androidTriggerInitializationCompletedRequest2.gatewayClient;
                    OperationType operationType2 = OperationType.INITIALIZATION_COMPLETED;
                    c145182.L$0 = androidTriggerInitializationCompletedRequest2;
                    c145182.J$0 = jM46400markNowz9LOYto;
                    c145182.label = 2;
                    c = 2;
                    j2 = jM46400markNowz9LOYto;
                    androidTriggerInitializationCompletedRequest3 = androidTriggerInitializationCompletedRequest2;
                    i = 1;
                    i2 = 0;
                    objInvoke = GatewayClient.DefaultImpls.request$default(gatewayClient2, null, universalRequest2, requestPolicyInvoke2, operationType2, c145182, 1, null);
                    if (objInvoke != coroutine_suspended) {
                        androidTriggerInitializationCompletedRequest = androidTriggerInitializationCompletedRequest3;
                        j = j2;
                        universalResponse = (UniversalResponseOuterClass.UniversalResponse) objInvoke;
                        if (!universalResponse.hasError()) {
                            SendDiagnosticEvent.DefaultImpls.invoke$default(androidTriggerInitializationCompletedRequest.sendDiagnosticEvent, "native_initialization_completed_event_request_success_time", Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource.Monotonic.ValueTimeMark.m46401boximpl(j))), null, null, null, null, 60, null);
                            return Unit.INSTANCE;
                        }
                        SendDiagnosticEvent sendDiagnosticEvent3 = androidTriggerInitializationCompletedRequest.sendDiagnosticEvent;
                        Double dBoxDouble3 = Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource.Monotonic.ValueTimeMark.m46401boximpl(j)));
                        Pair[] pairArr3 = new Pair[3];
                        pairArr3[i2] = TuplesKt.m43482to("operation", OperationType.INITIALIZATION_COMPLETED.toString());
                        pairArr3[i] = TuplesKt.m43482to("reason", "gateway");
                        pairArr3[c] = TuplesKt.m43482to("reason_debug", universalResponse.getError().getErrorText());
                        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent3, "native_initialization_completed_event_request_failure_time", dBoxDouble3, MapsKt.mapOf(pairArr3), null, null, null, 56, null);
                        return Unit.INSTANCE;
                    }
                }
                return coroutine_suspended;
            } catch (Exception e6) {
                e = e6;
                c = 2;
                i = 1;
                i2 = 0;
                j = jM46400markNowz9LOYto;
                androidTriggerInitializationCompletedRequest = this;
            }
        }
        SendDiagnosticEvent sendDiagnosticEvent4 = androidTriggerInitializationCompletedRequest.sendDiagnosticEvent;
        Double dBoxDouble4 = Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource.Monotonic.ValueTimeMark.m46401boximpl(j)));
        Pair[] pairArr4 = new Pair[3];
        pairArr4[i2] = TuplesKt.m43482to("operation", OperationType.INITIALIZATION_COMPLETED.toString());
        pairArr4[i] = TuplesKt.m43482to("reason", "uncaught_exception");
        pairArr4[c] = TuplesKt.m43482to("reason_debug", ExceptionExtensionsKt.getShortenedStackTrace$default(e, i2, i, null));
        SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent4, "native_initialization_completed_event_request_failure_time", dBoxDouble4, MapsKt.mapOf(pairArr4), null, null, null, 56, null);
        return Unit.INSTANCE;
    }
}
