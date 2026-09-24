package com.unity3d.services.core.network.core;

import com.google.common.net.HttpHeaders;
import com.unity3d.ads.core.data.model.exception.NetworkTimeoutException;
import com.unity3d.ads.core.data.model.exception.UnityAdsNetworkException;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.mapper.HttpRequestToOkHttpRequestKt;
import com.unity3d.services.core.network.model.HttpRequest;
import com.unity3d.services.core.network.model.HttpResponse;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketTimeoutException;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.CoroutineScope;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* JADX INFO: compiled from: OkHttp3Client.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J!\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0010"}, m43475d2 = {"Lcom/unity3d/services/core/network/core/OkHttp3Client;", "Lcom/unity3d/services/core/network/core/HttpClient;", "dispatchers", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "client", "Lokhttp3/OkHttpClient;", "(Lcom/unity3d/services/core/domain/ISDKDispatchers;Lokhttp3/OkHttpClient;)V", "execute", "Lcom/unity3d/services/core/network/model/HttpResponse;", "request", "Lcom/unity3d/services/core/network/model/HttpRequest;", "withInputStream", "", "(Lcom/unity3d/services/core/network/model/HttpRequest;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "executeBlocking", "Companion", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class OkHttp3Client implements HttpClient {
    public static final String MSG_CONNECTION_FAILED = "Network request failed";
    public static final String MSG_CONNECTION_TIMEOUT = "Network request timeout";
    public static final String NETWORK_CLIENT_OKHTTP = "refactored-okhttp";
    private final OkHttpClient client;
    private final ISDKDispatchers dispatchers;

    /* JADX INFO: renamed from: com.unity3d.services.core.network.core.OkHttp3Client$execute$1 */
    /* JADX INFO: compiled from: OkHttp3Client.kt */
    @Metadata(m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
    @DebugMetadata(m43503c = "com.unity3d.services.core.network.core.OkHttp3Client", m43504f = "OkHttp3Client.kt", m43505i = {0, 0, 0, 0}, m43506l = {134}, m43507m = "execute", m43508n = {"request", "okHttpRequest", "configuredClient", "withInputStream"}, m43509s = {"L$0", "L$1", "L$2", "Z$0"})
    static final class C148591 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        C148591(Continuation<? super C148591> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return OkHttp3Client.this.execute(null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.services.core.network.core.OkHttp3Client$executeBlocking$1 */
    /* JADX INFO: compiled from: OkHttp3Client.kt */
    @Metadata(m43474d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m43475d2 = {"<anonymous>", "Lcom/unity3d/services/core/network/model/HttpResponse;", "Lkotlinx/coroutines/CoroutineScope;"}, m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
    @DebugMetadata(m43503c = "com.unity3d.services.core.network.core.OkHttp3Client$executeBlocking$1", m43504f = "OkHttp3Client.kt", m43505i = {}, m43506l = {37}, m43507m = "invokeSuspend", m43508n = {}, m43509s = {})
    static final class C148601 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super HttpResponse>, Object> {
        final /* synthetic */ HttpRequest $request;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C148601(HttpRequest httpRequest, Continuation<? super C148601> continuation) {
            super(2, continuation);
            this.$request = httpRequest;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return OkHttp3Client.this.new C148601(this.$request, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super HttpResponse> continuation) {
            return ((C148601) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
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
            this.label = 1;
            Object objExecute$default = HttpClient.DefaultImpls.execute$default(OkHttp3Client.this, this.$request, false, this, 2, null);
            return objExecute$default == coroutine_suspended ? coroutine_suspended : objExecute$default;
        }
    }

    public OkHttp3Client(ISDKDispatchers dispatchers, OkHttpClient client) {
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(client, "client");
        this.dispatchers = dispatchers;
        this.client = client;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // com.unity3d.services.core.network.core.HttpClient
    public Object execute(HttpRequest httpRequest, final boolean z, Continuation<? super HttpResponse> continuation) throws Throwable {
        C148591 c148591;
        if (continuation instanceof C148591) {
            c148591 = (C148591) continuation;
            if ((c148591.label & Integer.MIN_VALUE) != 0) {
                c148591.label -= Integer.MIN_VALUE;
            } else {
                c148591 = new C148591(continuation);
            }
        } else {
            c148591 = new C148591(continuation);
        }
        Object obj = c148591.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c148591.label;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                boolean z2 = c148591.Z$0;
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            Request okHttpProtoRequest = HttpRequestToOkHttpRequestKt.toOkHttpProtoRequest(httpRequest);
            OkHttpClient okHttpClientBuild = this.client.newBuilder().connectTimeout(httpRequest.getConnectTimeout(), TimeUnit.MILLISECONDS).readTimeout(httpRequest.getReadTimeout(), TimeUnit.MILLISECONDS).writeTimeout(httpRequest.getWriteTimeout(), TimeUnit.MILLISECONDS).build();
            c148591.L$0 = httpRequest;
            c148591.L$1 = okHttpProtoRequest;
            c148591.L$2 = okHttpClientBuild;
            c148591.Z$0 = z;
            c148591.label = 1;
            CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(c148591), 1);
            cancellableContinuationImpl.initCancellability();
            final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
            final Call callNewCall = okHttpClientBuild.newCall(okHttpProtoRequest);
            cancellableContinuationImpl2.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: com.unity3d.services.core.network.core.OkHttp3Client$execute$2$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                    invoke2(th);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th) {
                    callNewCall.cancel();
                }
            });
            callNewCall.enqueue(new Callback() { // from class: com.unity3d.services.core.network.core.OkHttp3Client$execute$2$2
                @Override // okhttp3.Callback
                public void onFailure(Call call, IOException e) {
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(e, "e");
                    CancellableContinuation<HttpResponse> cancellableContinuation = cancellableContinuationImpl2;
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m44946constructorimpl(ResultKt.createFailure(e)));
                }

                @Override // okhttp3.Callback
                public void onResponse(Call call, Response response) {
                    InputStream inputStreamBytes;
                    Long longOrNull;
                    Intrinsics.checkNotNullParameter(call, "call");
                    Intrinsics.checkNotNullParameter(response, "response");
                    ResponseBody responseBodyBody = response.body();
                    if (responseBodyBody == null) {
                        CancellableContinuation<HttpResponse> cancellableContinuation = cancellableContinuationImpl2;
                        Result.Companion companion = Result.INSTANCE;
                        cancellableContinuation.resumeWith(Result.m44946constructorimpl(ResultKt.createFailure(new UnityAdsNetworkException("Empty response", null, Integer.valueOf(response.code()), null, null, null, OkHttp3Client.NETWORK_CLIENT_OKHTTP, 58, null))));
                        return;
                    }
                    if (!response.isSuccessful()) {
                        responseBodyBody.close();
                        CancellableContinuation<HttpResponse> cancellableContinuation2 = cancellableContinuationImpl2;
                        Result.Companion companion2 = Result.INSTANCE;
                        cancellableContinuation2.resumeWith(Result.m44946constructorimpl(ResultKt.createFailure(new UnityAdsNetworkException("Network request failed with code " + response.code(), null, Integer.valueOf(response.code()), null, null, null, OkHttp3Client.NETWORK_CLIENT_OKHTTP, 58, null))));
                        return;
                    }
                    try {
                        if (z) {
                            InputStream inputStreamByteStream = responseBodyBody.byteStream();
                            Intrinsics.checkNotNull(inputStreamByteStream, "null cannot be cast to non-null type kotlin.Any");
                            inputStreamBytes = inputStreamByteStream;
                        } else {
                            inputStreamBytes = responseBodyBody.bytes();
                        }
                        Object responseData = inputStreamBytes;
                        CancellableContinuation<HttpResponse> cancellableContinuation3 = cancellableContinuationImpl2;
                        int iCode = response.code();
                        Map<String, List<String>> multimap = response.headers().toMultimap();
                        String url = response.request().url().getUrl();
                        String protocol = response.protocol().getProtocol();
                        String strHeader = response.header(HttpHeaders.CONTENT_LENGTH);
                        long jLongValue = (strHeader == null || (longOrNull = StringsKt.toLongOrNull(strHeader)) == null) ? -1L : longOrNull.longValue();
                        Intrinsics.checkNotNullExpressionValue(responseData, "responseData");
                        Intrinsics.checkNotNullExpressionValue(multimap, "toMultimap()");
                        Intrinsics.checkNotNullExpressionValue(url, "toString()");
                        Intrinsics.checkNotNullExpressionValue(protocol, "toString()");
                        HttpResponse httpResponse = new HttpResponse(responseData, iCode, multimap, url, protocol, OkHttp3Client.NETWORK_CLIENT_OKHTTP, jLongValue);
                        Result.Companion companion3 = Result.INSTANCE;
                        cancellableContinuation3.resumeWith(Result.m44946constructorimpl(httpResponse));
                    } catch (Exception e) {
                        responseBodyBody.close();
                        CancellableContinuation<HttpResponse> cancellableContinuation4 = cancellableContinuationImpl2;
                        Result.Companion companion4 = Result.INSTANCE;
                        cancellableContinuation4.resumeWith(Result.m44946constructorimpl(ResultKt.createFailure(e)));
                    }
                }
            });
            Object result = cancellableContinuationImpl.getResult();
            if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                DebugProbesKt.probeCoroutineSuspended(c148591);
            }
            return result == coroutine_suspended ? coroutine_suspended : result;
        } catch (SocketTimeoutException unused) {
            throw new NetworkTimeoutException(MSG_CONNECTION_TIMEOUT, null, null, httpRequest.getBaseURL(), null, null, NETWORK_CLIENT_OKHTTP, 54, null);
        } catch (IOException unused2) {
            throw new UnityAdsNetworkException(MSG_CONNECTION_FAILED, null, null, httpRequest.getBaseURL(), null, null, NETWORK_CLIENT_OKHTTP, 54, null);
        }
    }

    @Override // com.unity3d.services.core.network.core.HttpClient
    public HttpResponse executeBlocking(HttpRequest request) {
        Intrinsics.checkNotNullParameter(request, "request");
        return (HttpResponse) BuildersKt.runBlocking(this.dispatchers.getIo(), new C148601(request, null));
    }
}
