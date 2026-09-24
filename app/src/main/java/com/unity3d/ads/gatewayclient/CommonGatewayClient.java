package com.unity3d.ads.gatewayclient;

import com.google.protobuf.InvalidProtocolBufferException;
import com.ironsource.C11494Ie;
import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.ads.core.data.model.exception.NetworkTimeoutException;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.HandleGatewayUniversalResponse;
import com.unity3d.ads.core.domain.HttpClientProvider;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import com.unity3d.services.core.network.model.HttpResponseKt;
import com.unity3d.services.core.network.model.RequestType;
import com.vungle.ads.internal.protos.Sdk;
import gatewayprotocol.p299v1.ErrorKt;
import gatewayprotocol.p299v1.ErrorOuterClass;
import gatewayprotocol.p299v1.UniversalRequestOuterClass;
import gatewayprotocol.p299v1.UniversalResponseKt;
import gatewayprotocol.p299v1.UniversalResponseOuterClass;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.random.Random;
import kotlin.text.Charsets;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;
import kotlin.time.TimeMark;
import kotlin.time.TimeSource;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.TimeoutCancellationException;
import kotlinx.coroutines.TimeoutKt;

/* JADX INFO: compiled from: CommonGatewayClient.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0000\u0018\u0000 =2\u00020\u0001:\u0001=B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ:\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J \u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J \u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0018\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!H\u0002J)\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020\u000e2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020&H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010'J1\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010%\u001a\u00020&H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010+J\u0010\u0010,\u001a\u00020\u00102\u0006\u0010*\u001a\u00020\u0010H\u0002J\"\u0010-\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00130\u00122\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0018\u0010.\u001a\u00020)2\u0006\u0010/\u001a\u00020#2\u0006\u0010%\u001a\u00020&H\u0002J1\u0010\u0016\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010%\u001a\u00020&H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010+J(\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020&2\u0006\u00104\u001a\u000205H\u0002J(\u00106\u001a\u0002012\u0006\u00107\u001a\u00020#2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020&2\u0006\u00104\u001a\u000205H\u0002J \u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u001c2\u0006\u0010;\u001a\u00020\u00192\u0006\u0010<\u001a\u00020\u001cH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006>"}, m43475d2 = {"Lcom/unity3d/ads/gatewayclient/CommonGatewayClient;", "Lcom/unity3d/ads/gatewayclient/GatewayClient;", "httpClientProvider", "Lcom/unity3d/ads/core/domain/HttpClientProvider;", "handleGatewayUniversalResponse", "Lcom/unity3d/ads/core/domain/HandleGatewayUniversalResponse;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "requestUrlFactory", "Lcom/unity3d/ads/gatewayclient/RequestUrlFactory;", "(Lcom/unity3d/ads/core/domain/HttpClientProvider;Lcom/unity3d/ads/core/domain/HandleGatewayUniversalResponse;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/gatewayclient/RequestUrlFactory;)V", "buildHttpRequest", "Lcom/unity3d/services/core/network/model/HttpRequest;", "gatewayUrl", "", "headers", "", "", "requestPolicy", "Lcom/unity3d/ads/gatewayclient/RequestPolicy;", "request", "Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;", "calculateDelayTime", "", "currentDelay", "retryCount", "", "calculateExponentialBackoff", "calculateJitter", "retryWaitBase", "retryJitterPct", "", "executeRequest", "Lcom/unity3d/services/core/network/model/HttpResponse;", "httpRequest", "operationType", "Lcom/unity3d/ads/core/data/model/OperationType;", "(Lcom/unity3d/services/core/network/model/HttpRequest;ILcom/unity3d/ads/core/data/model/OperationType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeWithRetry", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;", "url", "(Ljava/lang/String;Lgatewayprotocol/v1/UniversalRequestOuterClass$UniversalRequest;Lcom/unity3d/ads/gatewayclient/RequestPolicy;Lcom/unity3d/ads/core/data/model/OperationType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getGatewayUrl", "getHeaders", "getUniversalResponse", C11494Ie.f24627n, "sendNetworkErrorDiagnosticEvent", "", "e", "Lcom/unity3d/ads/core/data/model/exception/UnityAdsNetworkException;", "startTime", "Lkotlin/time/TimeMark;", "sendNetworkSuccessDiagnosticEvent", "httpResponse", "shouldRetry", "", "responseCode", "duration", "maxDuration", "Companion", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class CommonGatewayClient implements GatewayClient {
    public static final int CODE_400 = 400;
    public static final int CODE_599 = 599;
    public static final int CODE_TOO_MANY_REQUESTS = 429;
    public static final String HEADER_CONTENT_TYPE = "Content-Type";
    public static final String HEADER_PROTOBUF = "application/x-protobuf";
    public static final String HEADER_RETRY_AFTER = "Retry-After";
    public static final String HEADER_RETRY_ATTEMPT = "X-RETRY-ATTEMPT";
    private final HandleGatewayUniversalResponse handleGatewayUniversalResponse;
    private final HttpClientProvider httpClientProvider;
    private final RequestUrlFactory requestUrlFactory;
    private final SendDiagnosticEvent sendDiagnosticEvent;
    private final SessionRepository sessionRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.gatewayclient.CommonGatewayClient$executeRequest$1 */
    /* JADX INFO: compiled from: CommonGatewayClient.kt */
    @Metadata(m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
    @DebugMetadata(m43503c = "com.unity3d.ads.gatewayclient.CommonGatewayClient", m43504f = "CommonGatewayClient.kt", m43505i = {0, 0, 0, 0, 0, 1, 1, 1, 1}, m43506l = {Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE, 120}, m43507m = "executeRequest", m43508n = {"this", "httpRequest", "operationType", "retryCount", "startTime", "this", "operationType", "retryCount", "startTime"}, m43509s = {"L$0", "L$1", "L$2", "I$0", "J$0", "L$0", "L$1", "I$0", "J$0"})
    static final class C146311 extends ContinuationImpl {
        int I$0;
        long J$0;
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;

        C146311(Continuation<? super C146311> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonGatewayClient.this.executeRequest(null, 0, null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.gatewayclient.CommonGatewayClient$executeWithRetry$1 */
    /* JADX INFO: compiled from: CommonGatewayClient.kt */
    @Metadata(m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
    @DebugMetadata(m43503c = "com.unity3d.ads.gatewayclient.CommonGatewayClient", m43504f = "CommonGatewayClient.kt", m43505i = {0, 0, 0, 0, 0, 0, 0, 0, 2, 2, 2, 2, 2, 2, 2, 2}, m43506l = {76, 82, 106}, m43507m = "executeWithRetry", m43508n = {"this", "request", "requestPolicy", "operationType", "gatewayUrl", "retryCount", "timer", "delayTime", "this", "request", "requestPolicy", "operationType", "gatewayUrl", "retryCount", "timer", "delayTime"}, m43509s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "J$0", "J$1", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "J$0", "J$1"})
    static final class C146321 extends ContinuationImpl {
        int I$0;
        long J$0;
        long J$1;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        /* synthetic */ Object result;

        C146321(Continuation<? super C146321> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonGatewayClient.this.executeWithRetry(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.gatewayclient.CommonGatewayClient$request$1 */
    /* JADX INFO: compiled from: CommonGatewayClient.kt */
    @Metadata(m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
    @DebugMetadata(m43503c = "com.unity3d.ads.gatewayclient.CommonGatewayClient", m43504f = "CommonGatewayClient.kt", m43505i = {0}, m43506l = {60}, m43507m = "request", m43508n = {"requestPolicy"}, m43509s = {"L$0"})
    static final class C146331 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C146331(Continuation<? super C146331> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonGatewayClient.this.request(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.gatewayclient.CommonGatewayClient$request$2 */
    /* JADX INFO: compiled from: CommonGatewayClient.kt */
    @Metadata(m43474d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m43475d2 = {"<anonymous>", "Lgatewayprotocol/v1/UniversalResponseOuterClass$UniversalResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
    @DebugMetadata(m43503c = "com.unity3d.ads.gatewayclient.CommonGatewayClient$request$2", m43504f = "CommonGatewayClient.kt", m43505i = {}, m43506l = {61}, m43507m = "invokeSuspend", m43508n = {}, m43509s = {})
    static final class C146342 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super UniversalResponseOuterClass.UniversalResponse>, Object> {
        final /* synthetic */ OperationType $operationType;
        final /* synthetic */ UniversalRequestOuterClass.UniversalRequest $request;
        final /* synthetic */ RequestPolicy $requestPolicy;
        final /* synthetic */ String $url;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C146342(OperationType operationType, String str, UniversalRequestOuterClass.UniversalRequest universalRequest, RequestPolicy requestPolicy, Continuation<? super C146342> continuation) {
            super(2, continuation);
            this.$operationType = operationType;
            this.$url = str;
            this.$request = universalRequest;
            this.$requestPolicy = requestPolicy;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return CommonGatewayClient.this.new C146342(this.$operationType, this.$url, this.$request, this.$requestPolicy, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super UniversalResponseOuterClass.UniversalResponse> continuation) {
            return ((C146342) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            CommonGatewayClient commonGatewayClient = CommonGatewayClient.this;
            this.label = 1;
            Object objExecuteWithRetry = commonGatewayClient.executeWithRetry(commonGatewayClient.requestUrlFactory.getRequestUrl(this.$operationType, this.$url), this.$request, this.$requestPolicy, this.$operationType, this);
            return objExecuteWithRetry == coroutine_suspended ? coroutine_suspended : objExecuteWithRetry;
        }
    }

    public CommonGatewayClient(HttpClientProvider httpClientProvider, HandleGatewayUniversalResponse handleGatewayUniversalResponse, SendDiagnosticEvent sendDiagnosticEvent, SessionRepository sessionRepository, RequestUrlFactory requestUrlFactory) {
        Intrinsics.checkNotNullParameter(httpClientProvider, "httpClientProvider");
        Intrinsics.checkNotNullParameter(handleGatewayUniversalResponse, "handleGatewayUniversalResponse");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(requestUrlFactory, "requestUrlFactory");
        this.httpClientProvider = httpClientProvider;
        this.handleGatewayUniversalResponse = handleGatewayUniversalResponse;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.sessionRepository = sessionRepository;
        this.requestUrlFactory = requestUrlFactory;
    }

    private final HttpRequest buildHttpRequest(String gatewayUrl, Map<String, ? extends List<String>> headers, RequestPolicy requestPolicy, UniversalRequestOuterClass.UniversalRequest request) {
        return new HttpRequest(gatewayUrl, null, RequestType.POST, request.toByteArray(), headers, null, null, null, null, requestPolicy.getConnectTimeout(), requestPolicy.getReadTimeout(), requestPolicy.getWriteTimeout(), requestPolicy.getOverallTimeout(), true, null, null, 0, 115170, null);
    }

    private final long calculateDelayTime(long currentDelay, RequestPolicy requestPolicy, int retryCount) {
        return Math.min(calculateExponentialBackoff(currentDelay, requestPolicy, retryCount) + calculateJitter(requestPolicy.getRetryWaitBase(), requestPolicy.getRetryJitterPct()), requestPolicy.getRetryMaxInterval());
    }

    private final long calculateExponentialBackoff(long currentDelay, RequestPolicy requestPolicy, int retryCount) {
        return retryCount == 0 ? currentDelay : (long) (currentDelay * requestPolicy.getRetryScalingFactor());
    }

    private final long calculateJitter(int retryWaitBase, float retryJitterPct) {
        if (retryJitterPct == 0.0f) {
            return 0L;
        }
        long j = (long) (retryWaitBase * retryJitterPct);
        return Random.INSTANCE.nextLong(-j, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:41:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    public final Object executeRequest(HttpRequest httpRequest, int i, OperationType operationType, Continuation<? super HttpResponse> continuation) throws Throwable {
        C146311 c146311;
        long jM46400markNowz9LOYto;
        int i2;
        OperationType operationType2;
        CommonGatewayClient commonGatewayClient;
        HttpRequest httpRequest2;
        CommonGatewayClient commonGatewayClient2;
        long j;
        long j2;
        OperationType operationType3;
        int i3;
        if (continuation instanceof C146311) {
            c146311 = (C146311) continuation;
            if ((c146311.label & Integer.MIN_VALUE) != 0) {
                c146311.label -= Integer.MIN_VALUE;
            } else {
                c146311 = new C146311(continuation);
            }
        } else {
            c146311 = new C146311(continuation);
        }
        C146311 c146312 = c146311;
        Object objInvoke = c146312.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = c146312.label;
        if (i4 != 0) {
            if (i4 != 1) {
                if (i4 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = c146312.J$0;
                i3 = c146312.I$0;
                operationType3 = (OperationType) c146312.L$1;
                commonGatewayClient = (CommonGatewayClient) c146312.L$0;
                try {
                    ResultKt.throwOnFailure(objInvoke);
                    HttpResponse httpResponse = (HttpResponse) objInvoke;
                    commonGatewayClient.sendNetworkSuccessDiagnosticEvent(httpResponse, i3, operationType3, TimeSource.Monotonic.ValueTimeMark.m46401boximpl(j));
                    return httpResponse;
                } catch (UnityAdsNetworkException e) {
                    e = e;
                    i2 = i3;
                    operationType2 = operationType3;
                    commonGatewayClient.sendNetworkErrorDiagnosticEvent(e, i2, operationType2, TimeSource.Monotonic.ValueTimeMark.m46401boximpl(j));
                    return HttpResponseKt.toHttpResponse(e);
                } catch (TimeoutCancellationException e2) {
                    e = e2;
                    i2 = i3;
                    operationType2 = operationType3;
                    commonGatewayClient.sendNetworkErrorDiagnosticEvent(new NetworkTimeoutException("Gateway request was canceled due to exceeding timeout for operation", null, null, null, null, null, null, 126, null), i2, operationType2, TimeSource.Monotonic.ValueTimeMark.m46401boximpl(j));
                    throw e;
                }
            }
            jM46400markNowz9LOYto = c146312.J$0;
            int i5 = c146312.I$0;
            OperationType operationType4 = (OperationType) c146312.L$2;
            HttpRequest httpRequest3 = (HttpRequest) c146312.L$1;
            CommonGatewayClient commonGatewayClient3 = (CommonGatewayClient) c146312.L$0;
            try {
                ResultKt.throwOnFailure(objInvoke);
                commonGatewayClient2 = commonGatewayClient3;
                i2 = i5;
                httpRequest2 = httpRequest3;
                operationType2 = operationType4;
                j2 = jM46400markNowz9LOYto;
                try {
                    c146312.L$0 = commonGatewayClient2;
                    c146312.L$1 = operationType2;
                    c146312.L$2 = null;
                    c146312.I$0 = i2;
                    c146312.J$0 = j2;
                    c146312.label = 2;
                    objInvoke = HttpClient.DefaultImpls.execute$default((HttpClient) objInvoke, httpRequest2, false, c146312, 2, null);
                    if (objInvoke != coroutine_suspended) {
                        operationType3 = operationType2;
                        i3 = i2;
                        j = j2;
                        commonGatewayClient = commonGatewayClient2;
                        HttpResponse httpResponse2 = (HttpResponse) objInvoke;
                        commonGatewayClient.sendNetworkSuccessDiagnosticEvent(httpResponse2, i3, operationType3, TimeSource.Monotonic.ValueTimeMark.m46401boximpl(j));
                        return httpResponse2;
                    }
                    return coroutine_suspended;
                } catch (UnityAdsNetworkException e3) {
                    e = e3;
                    j = j2;
                    commonGatewayClient = commonGatewayClient2;
                    commonGatewayClient.sendNetworkErrorDiagnosticEvent(e, i2, operationType2, TimeSource.Monotonic.ValueTimeMark.m46401boximpl(j));
                    return HttpResponseKt.toHttpResponse(e);
                } catch (TimeoutCancellationException e4) {
                    e = e4;
                    j = j2;
                    commonGatewayClient = commonGatewayClient2;
                    commonGatewayClient.sendNetworkErrorDiagnosticEvent(new NetworkTimeoutException("Gateway request was canceled due to exceeding timeout for operation", null, null, null, null, null, null, 126, null), i2, operationType2, TimeSource.Monotonic.ValueTimeMark.m46401boximpl(j));
                    throw e;
                }
            } catch (UnityAdsNetworkException e5) {
                e = e5;
                operationType2 = operationType4;
                commonGatewayClient = commonGatewayClient3;
                i2 = i5;
                j = jM46400markNowz9LOYto;
                commonGatewayClient.sendNetworkErrorDiagnosticEvent(e, i2, operationType2, TimeSource.Monotonic.ValueTimeMark.m46401boximpl(j));
                return HttpResponseKt.toHttpResponse(e);
            } catch (TimeoutCancellationException e6) {
                e = e6;
                operationType2 = operationType4;
                commonGatewayClient = commonGatewayClient3;
                i2 = i5;
                j = jM46400markNowz9LOYto;
                commonGatewayClient.sendNetworkErrorDiagnosticEvent(new NetworkTimeoutException("Gateway request was canceled due to exceeding timeout for operation", null, null, null, null, null, null, 126, null), i2, operationType2, TimeSource.Monotonic.ValueTimeMark.m46401boximpl(j));
                throw e;
            }
        }
        ResultKt.throwOnFailure(objInvoke);
        jM46400markNowz9LOYto = TimeSource.Monotonic.INSTANCE.m46400markNowz9LOYto();
        try {
            HttpClientProvider httpClientProvider = this.httpClientProvider;
            c146312.L$0 = this;
            httpRequest2 = httpRequest;
            c146312.L$1 = httpRequest2;
            operationType2 = operationType;
            try {
                c146312.L$2 = operationType2;
                i2 = i;
                try {
                    c146312.I$0 = i2;
                    c146312.J$0 = jM46400markNowz9LOYto;
                    c146312.label = 1;
                    objInvoke = httpClientProvider.invoke(c146312);
                    if (objInvoke != coroutine_suspended) {
                        commonGatewayClient2 = this;
                        j2 = jM46400markNowz9LOYto;
                        c146312.L$0 = commonGatewayClient2;
                        c146312.L$1 = operationType2;
                        c146312.L$2 = null;
                        c146312.I$0 = i2;
                        c146312.J$0 = j2;
                        c146312.label = 2;
                        objInvoke = HttpClient.DefaultImpls.execute$default((HttpClient) objInvoke, httpRequest2, false, c146312, 2, null);
                        if (objInvoke != coroutine_suspended) {
                            operationType3 = operationType2;
                            i3 = i2;
                            j = j2;
                            commonGatewayClient = commonGatewayClient2;
                            HttpResponse httpResponse3 = (HttpResponse) objInvoke;
                            commonGatewayClient.sendNetworkSuccessDiagnosticEvent(httpResponse3, i3, operationType3, TimeSource.Monotonic.ValueTimeMark.m46401boximpl(j));
                            return httpResponse3;
                        }
                    }
                    return coroutine_suspended;
                } catch (UnityAdsNetworkException e7) {
                    e = e7;
                    commonGatewayClient = this;
                    j = jM46400markNowz9LOYto;
                    commonGatewayClient.sendNetworkErrorDiagnosticEvent(e, i2, operationType2, TimeSource.Monotonic.ValueTimeMark.m46401boximpl(j));
                    return HttpResponseKt.toHttpResponse(e);
                } catch (TimeoutCancellationException e8) {
                    e = e8;
                    commonGatewayClient = this;
                    j = jM46400markNowz9LOYto;
                    commonGatewayClient.sendNetworkErrorDiagnosticEvent(new NetworkTimeoutException("Gateway request was canceled due to exceeding timeout for operation", null, null, null, null, null, null, 126, null), i2, operationType2, TimeSource.Monotonic.ValueTimeMark.m46401boximpl(j));
                    throw e;
                }
            } catch (UnityAdsNetworkException e9) {
                e = e9;
                i2 = i;
            } catch (TimeoutCancellationException e10) {
                e = e10;
                i2 = i;
            }
        } catch (UnityAdsNetworkException e11) {
            e = e11;
            i2 = i;
            operationType2 = operationType;
        } catch (TimeoutCancellationException e12) {
            e = e12;
            i2 = i;
            operationType2 = operationType;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:23:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:26:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:29:0x010b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:30:0x010c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0114  */
    /* JADX WARN: Code duplicated, block: B:39:0x0142  */
    /* JADX WARN: Code duplicated, block: B:41:0x0147  */
    /* JADX WARN: Code duplicated, block: B:42:0x014c  */
    /* JADX WARN: Code duplicated, block: B:45:0x016b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0185  */
    /* JADX WARN: Code duplicated, block: B:50:0x0197  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x0185 -> B:49:0x018b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object executeWithRetry(java.lang.String r31, gatewayprotocol.v1.UniversalRequestOuterClass.UniversalRequest r32, com.unity3d.ads.gatewayclient.RequestPolicy r33, com.unity3d.ads.core.data.model.OperationType r34, kotlin.coroutines.Continuation<? super gatewayprotocol.v1.UniversalResponseOuterClass.UniversalResponse> r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.gatewayclient.CommonGatewayClient.executeWithRetry(java.lang.String, gatewayprotocol.v1.UniversalRequestOuterClass$UniversalRequest, com.unity3d.ads.gatewayclient.RequestPolicy, com.unity3d.ads.core.data.model.OperationType, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final String getGatewayUrl(String url) {
        return !Intrinsics.areEqual(url, UnityAdsConstants.DefaultUrls.GATEWAY_URL) ? url : this.sessionRepository.getGatewayUrl();
    }

    private final Map<String, List<String>> getHeaders(int retryCount) {
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.put("Content-Type", CollectionsKt.listOf(HEADER_PROTOBUF));
        if (retryCount > 0) {
            mapCreateMapBuilder.put(HEADER_RETRY_ATTEMPT, CollectionsKt.listOf(String.valueOf(retryCount)));
        }
        return MapsKt.build(mapCreateMapBuilder);
    }

    private final UniversalResponseOuterClass.UniversalResponse getUniversalResponse(HttpResponse response, OperationType operationType) {
        try {
            Object body = response.getBody();
            if (body instanceof byte[]) {
                UniversalResponseOuterClass.UniversalResponse from = UniversalResponseOuterClass.UniversalResponse.parseFrom((byte[]) body);
                Intrinsics.checkNotNullExpressionValue(from, "parseFrom(responseBody)");
                return from;
            }
            if (!(body instanceof String)) {
                throw new InvalidProtocolBufferException("Could not parse response from gateway service");
            }
            byte[] bytes = ((String) body).getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            UniversalResponseOuterClass.UniversalResponse from2 = UniversalResponseOuterClass.UniversalResponse.parseFrom(bytes);
            Intrinsics.checkNotNullExpressionValue(from2, "parseFrom(\n             ….UTF_8)\n                )");
            return from2;
        } catch (InvalidProtocolBufferException e) {
            DeviceLog.debug("Failed to parse response from gateway service with exception: %s", e.getLocalizedMessage());
            SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_network_parse_failure", null, MapsKt.mapOf(TuplesKt.m43482to("operation", operationType.toString()), TuplesKt.m43482to("reason", "protobuf_parsing"), TuplesKt.m43482to("reason_debug", response.getBody().toString())), null, null, null, 58, null);
            UniversalResponseKt.Dsl.Companion companion = UniversalResponseKt.Dsl.INSTANCE;
            UniversalResponseOuterClass.UniversalResponse.Builder builderNewBuilder = UniversalResponseOuterClass.UniversalResponse.newBuilder();
            Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
            UniversalResponseKt.Dsl dsl_create = companion._create(builderNewBuilder);
            ErrorKt.Dsl.Companion companion2 = ErrorKt.Dsl.INSTANCE;
            ErrorOuterClass.Error.Builder builderNewBuilder2 = ErrorOuterClass.Error.newBuilder();
            Intrinsics.checkNotNullExpressionValue(builderNewBuilder2, "newBuilder()");
            ErrorKt.Dsl dsl_create2 = companion2._create(builderNewBuilder2);
            dsl_create2.setErrorText("ERROR: Could not parse response from gateway service");
            dsl_create.setError(dsl_create2._build());
            return dsl_create._build();
        }
    }

    private final void sendNetworkErrorDiagnosticEvent(UnityAdsNetworkException e, int retryCount, OperationType operationType, TimeMark startTime) {
        if (operationType == OperationType.DIAGNOSTIC_EVENT) {
            return;
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_network_failure_time", Double.valueOf(TimeExtensionsKt.elapsedMillis(startTime)), MapsKt.mutableMapOf(TuplesKt.m43482to("operation", operationType.toString()), TuplesKt.m43482to("retries", String.valueOf(retryCount)), TuplesKt.m43482to("protocol", String.valueOf(e.getProtocol())), TuplesKt.m43482to("network_client", String.valueOf(e.getClient())), TuplesKt.m43482to("reason_code", String.valueOf(e.getCode())), TuplesKt.m43482to("reason_debug", e.getMessage())), null, null, null, 56, null);
    }

    private final void sendNetworkSuccessDiagnosticEvent(HttpResponse httpResponse, int retryCount, OperationType operationType, TimeMark startTime) {
        if (operationType == OperationType.DIAGNOSTIC_EVENT) {
            return;
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_network_success_time", Double.valueOf(TimeExtensionsKt.elapsedMillis(startTime)), MapsKt.mutableMapOf(TuplesKt.m43482to("operation", operationType.toString()), TuplesKt.m43482to("retries", String.valueOf(retryCount)), TuplesKt.m43482to("protocol", httpResponse.getProtocol()), TuplesKt.m43482to("network_client", httpResponse.getClient()), TuplesKt.m43482to("reason_code", String.valueOf(httpResponse.getStatusCode()))), null, null, null, 56, null);
    }

    private final boolean shouldRetry(int responseCode, long duration, int maxDuration) {
        return 400 <= responseCode && responseCode < 600 && duration < ((long) maxDuration);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Override // com.unity3d.ads.gatewayclient.GatewayClient
    public Object request(String str, UniversalRequestOuterClass.UniversalRequest universalRequest, RequestPolicy requestPolicy, OperationType operationType, Continuation<? super UniversalResponseOuterClass.UniversalResponse> continuation) throws Throwable {
        C146331 c146331;
        RequestPolicy requestPolicy2;
        if (continuation instanceof C146331) {
            c146331 = (C146331) continuation;
            if ((c146331.label & Integer.MIN_VALUE) != 0) {
                c146331.label -= Integer.MIN_VALUE;
            } else {
                c146331 = new C146331(continuation);
            }
        } else {
            c146331 = new C146331(continuation);
        }
        Object objM46437withTimeoutOrNullKLykuaI = c146331.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c146331.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objM46437withTimeoutOrNullKLykuaI);
            Duration.Companion companion = Duration.INSTANCE;
            long duration = DurationKt.toDuration(requestPolicy.getMaxDuration(), DurationUnit.MILLISECONDS);
            C146342 c146342 = new C146342(operationType, str, universalRequest, requestPolicy, null);
            c146331.L$0 = requestPolicy;
            c146331.label = 1;
            objM46437withTimeoutOrNullKLykuaI = TimeoutKt.m46437withTimeoutOrNullKLykuaI(duration, c146342, c146331);
            if (objM46437withTimeoutOrNullKLykuaI == coroutine_suspended) {
                return coroutine_suspended;
            }
            requestPolicy2 = requestPolicy;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            requestPolicy2 = (RequestPolicy) c146331.L$0;
            ResultKt.throwOnFailure(objM46437withTimeoutOrNullKLykuaI);
        }
        UniversalResponseOuterClass.UniversalResponse universalResponse = (UniversalResponseOuterClass.UniversalResponse) objM46437withTimeoutOrNullKLykuaI;
        if (universalResponse != null) {
            return universalResponse;
        }
        throw new NetworkTimeoutException("Gateway request timed out after " + requestPolicy2.getMaxDuration() + "ms", null, null, null, null, null, null, 126, null);
    }
}
