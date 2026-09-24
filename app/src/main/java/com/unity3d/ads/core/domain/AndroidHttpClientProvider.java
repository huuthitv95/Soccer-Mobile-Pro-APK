package com.unity3d.ads.core.domain;

import android.content.Context;
import com.fyber.inneractive.sdk.bidder.TokenParametersOuterClass$TokenParameters;
import com.google.android.gms.net.CronetProviderInstaller;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.configuration.MediationTraitsMetadataReader;
import com.unity3d.services.core.domain.ISDKDispatchers;
import com.unity3d.services.core.network.core.CronetClient;
import com.unity3d.services.core.network.core.CronetEngineBuilderFactory;
import com.unity3d.services.core.network.core.HttpClient;
import com.unity3d.services.core.network.core.LegacyHttpClient;
import com.unity3d.services.core.network.core.OkHttp3Client;
import com.unity3d.services.core.p295di.ServiceProvider;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlin.time.DurationUnit;
import kotlin.time.TimeSource;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.ExecutorsKt;
import kotlinx.coroutines.TimeoutKt;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;
import okhttp3.OkHttpClient;
import org.chromium.net.CronetEngine;

/* JADX INFO: compiled from: AndroidHttpClientProvider.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0002\u0010\u000eJ)\u0010\u0013\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0015H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0016J\u0011\u0010\u0017\u001a\u00020\u0010H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010\u0018J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0011\u0010\u001b\u001a\u00020\u0010H\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u0018R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, m43475d2 = {"Lcom/unity3d/ads/core/domain/AndroidHttpClientProvider;", "Lcom/unity3d/ads/core/domain/HttpClientProvider;", "alternativeFlowReader", "Lcom/unity3d/ads/core/configuration/AlternativeFlowReader;", "dispatchers", "Lcom/unity3d/services/core/domain/ISDKDispatchers;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "context", "Landroid/content/Context;", "cronetEngineBuilderFactory", "Lcom/unity3d/services/core/network/core/CronetEngineBuilderFactory;", "mediationTraitsMetadataReader", "Lcom/unity3d/ads/core/configuration/MediationTraitsMetadataReader;", "(Lcom/unity3d/ads/core/configuration/AlternativeFlowReader;Lcom/unity3d/services/core/domain/ISDKDispatchers;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Landroid/content/Context;Lcom/unity3d/services/core/network/core/CronetEngineBuilderFactory;Lcom/unity3d/ads/core/configuration/MediationTraitsMetadataReader;)V", "cachedClient", "Lcom/unity3d/services/core/network/core/HttpClient;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "buildNetworkClient", "selectedHttpClient", "Lcom/unity3d/ads/core/domain/HttpClientSelection;", "(Landroid/content/Context;Lcom/unity3d/services/core/domain/ISDKDispatchers;Lcom/unity3d/ads/core/domain/HttpClientSelection;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createHttpClient", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOkHttp3Client", "Lcom/unity3d/services/core/network/core/OkHttp3Client;", "invoke", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class AndroidHttpClientProvider implements HttpClientProvider {
    private final AlternativeFlowReader alternativeFlowReader;
    private HttpClient cachedClient;
    private final Context context;
    private final CronetEngineBuilderFactory cronetEngineBuilderFactory;
    private final ISDKDispatchers dispatchers;
    private final MediationTraitsMetadataReader mediationTraitsMetadataReader;
    private final Mutex mutex;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHttpClientProvider$createHttpClient$1 */
    /* JADX INFO: compiled from: AndroidHttpClientProvider.kt */
    @Metadata(m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
    @DebugMetadata(m43503c = "com.unity3d.ads.core.domain.AndroidHttpClientProvider", m43504f = "AndroidHttpClientProvider.kt", m43505i = {0, 0, 0}, m43506l = {TokenParametersOuterClass$TokenParameters.ENCRYPTEDTOPICS_FIELD_NUMBER}, m43507m = "createHttpClient", m43508n = {"this", "selectedHttpClient", "startTime"}, m43509s = {"L$0", "L$1", "J$0"})
    static final class C145101 extends ContinuationImpl {
        long J$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C145101(Continuation<? super C145101> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidHttpClientProvider.this.createHttpClient(this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidHttpClientProvider$invoke$1 */
    /* JADX INFO: compiled from: AndroidHttpClientProvider.kt */
    @Metadata(m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
    @DebugMetadata(m43503c = "com.unity3d.ads.core.domain.AndroidHttpClientProvider", m43504f = "AndroidHttpClientProvider.kt", m43505i = {0, 0, 1, 1}, m43506l = {134, 57}, m43507m = "invoke", m43508n = {"this", "$this$withLock_u24default$iv", "this", "$this$withLock_u24default$iv"}, m43509s = {"L$0", "L$1", "L$0", "L$1"})
    static final class C145111 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C145111(Continuation<? super C145111> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidHttpClientProvider.this.invoke(this);
        }
    }

    public AndroidHttpClientProvider(AlternativeFlowReader alternativeFlowReader, ISDKDispatchers dispatchers, SendDiagnosticEvent sendDiagnosticEvent, Context context, CronetEngineBuilderFactory cronetEngineBuilderFactory, MediationTraitsMetadataReader mediationTraitsMetadataReader) {
        Intrinsics.checkNotNullParameter(alternativeFlowReader, "alternativeFlowReader");
        Intrinsics.checkNotNullParameter(dispatchers, "dispatchers");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(cronetEngineBuilderFactory, "cronetEngineBuilderFactory");
        Intrinsics.checkNotNullParameter(mediationTraitsMetadataReader, "mediationTraitsMetadataReader");
        this.alternativeFlowReader = alternativeFlowReader;
        this.dispatchers = dispatchers;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.context = context;
        this.cronetEngineBuilderFactory = cronetEngineBuilderFactory;
        this.mediationTraitsMetadataReader = mediationTraitsMetadataReader;
        this.mutex = MutexKt.Mutex$default(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object buildNetworkClient(final Context context, final ISDKDispatchers iSDKDispatchers, final HttpClientSelection httpClientSelection, Continuation<? super HttpClient> continuation) {
        CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        final CancellableContinuationImpl cancellableContinuationImpl2 = cancellableContinuationImpl;
        CronetProviderInstaller.installProvider(context).addOnCompleteListener(ExecutorsKt.asExecutor(iSDKDispatchers.getIo()), new OnCompleteListener() { // from class: com.unity3d.ads.core.domain.AndroidHttpClientProvider$buildNetworkClient$2$1
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task<Void> it) {
                String message;
                Intrinsics.checkNotNullParameter(it, "it");
                String str = "Errored without message.";
                if (!it.isSuccessful()) {
                    SendDiagnosticEvent sendDiagnosticEvent = this.this$0.sendDiagnosticEvent;
                    Exception exception = it.getException();
                    if (exception != null && (message = exception.getMessage()) != null) {
                        str = message;
                    }
                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_cronet_install_error", null, MapsKt.mapOf(TuplesKt.m43482to("reason", str)), null, null, null, 58, null);
                    CancellableContinuation<HttpClient> cancellableContinuation = cancellableContinuationImpl2;
                    Result.Companion companion = Result.INSTANCE;
                    cancellableContinuation.resumeWith(Result.m44946constructorimpl(this.this$0.getOkHttp3Client()));
                    return;
                }
                try {
                    CronetEngine.Builder builderCreateCronetEngineBuilder = this.this$0.cronetEngineBuilderFactory.createCronetEngineBuilder(context);
                    if (httpClientSelection == HttpClientSelection.CRONET_WITH_QUIC) {
                        builderCreateCronetEngineBuilder.enableQuic(true);
                        builderCreateCronetEngineBuilder.addQuicHint(ServiceProvider.GATEWAY_HOST, 443, 443);
                        builderCreateCronetEngineBuilder.addQuicHint(ServiceProvider.CDN_CREATIVES_HOST, 443, 443);
                    }
                    CronetEngine cronetEngine = builderCreateCronetEngineBuilder.build();
                    CancellableContinuation<HttpClient> cancellableContinuation2 = cancellableContinuationImpl2;
                    Result.Companion companion2 = Result.INSTANCE;
                    Intrinsics.checkNotNullExpressionValue(cronetEngine, "cronetEngine");
                    cancellableContinuation2.resumeWith(Result.m44946constructorimpl(new CronetClient(cronetEngine, iSDKDispatchers)));
                } catch (Throwable th) {
                    SendDiagnosticEvent sendDiagnosticEvent2 = this.this$0.sendDiagnosticEvent;
                    String message2 = th.getMessage();
                    SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, "native_cronet_engine_error", null, MapsKt.mapOf(TuplesKt.m43482to("reason", message2 != null ? message2 : "Errored without message.")), null, null, null, 58, null);
                    CancellableContinuation<HttpClient> cancellableContinuation3 = cancellableContinuationImpl2;
                    Result.Companion companion3 = Result.INSTANCE;
                    cancellableContinuation3.resumeWith(Result.m44946constructorimpl(this.this$0.getOkHttp3Client()));
                }
            }
        });
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:29:0x008b  */
    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object createHttpClient(Continuation<? super HttpClient> continuation) throws Throwable {
        C145101 c145101;
        Object objM44946constructorimpl;
        HttpClientSelection httpClientSelection;
        HttpClientSelection httpClientSelection2;
        long j;
        AndroidHttpClientProvider androidHttpClientProvider;
        String str;
        if (continuation instanceof C145101) {
            c145101 = (C145101) continuation;
            if ((c145101.label & Integer.MIN_VALUE) != 0) {
                c145101.label -= Integer.MIN_VALUE;
            } else {
                c145101 = new C145101(continuation);
            }
        } else {
            c145101 = new C145101(continuation);
        }
        C145101 c145102 = c145101;
        Object obj = c145102.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c145102.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            if (!this.alternativeFlowReader.invoke()) {
                return new LegacyHttpClient(this.dispatchers);
            }
            String stringTrait = this.mediationTraitsMetadataReader.getStringTrait(MediationTraitsMetadataReader.USE_HTTP_CLIENT);
            if (stringTrait != null) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    AndroidHttpClientProvider androidHttpClientProvider2 = this;
                    String upperCase = stringTrait.toUpperCase(Locale.ROOT);
                    Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                    objM44946constructorimpl = Result.m44946constructorimpl(HttpClientSelection.valueOf(upperCase));
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(th));
                }
                if (Result.m44952isFailureimpl(objM44946constructorimpl)) {
                    objM44946constructorimpl = null;
                }
                httpClientSelection = (HttpClientSelection) objM44946constructorimpl;
                if (httpClientSelection == null) {
                    httpClientSelection = HttpClientSelection.CRONET_WITHOUT_QUIC;
                }
            } else {
                httpClientSelection = HttpClientSelection.CRONET_WITHOUT_QUIC;
            }
            long jM46400markNowz9LOYto = TimeSource.Monotonic.INSTANCE.m46400markNowz9LOYto();
            AndroidHttpClientProvider$createHttpClient$client$1 androidHttpClientProvider$createHttpClient$client$1 = new AndroidHttpClientProvider$createHttpClient$client$1(httpClientSelection, this, null);
            c145102.L$0 = this;
            c145102.L$1 = httpClientSelection;
            c145102.J$0 = jM46400markNowz9LOYto;
            c145102.label = 1;
            Object objWithTimeoutOrNull = TimeoutKt.withTimeoutOrNull(500L, androidHttpClientProvider$createHttpClient$client$1, c145102);
            if (objWithTimeoutOrNull == coroutine_suspended) {
                return coroutine_suspended;
            }
            httpClientSelection2 = httpClientSelection;
            j = jM46400markNowz9LOYto;
            obj = objWithTimeoutOrNull;
            androidHttpClientProvider = this;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = c145102.J$0;
            httpClientSelection2 = (HttpClientSelection) c145102.L$1;
            androidHttpClientProvider = (AndroidHttpClientProvider) c145102.L$0;
            ResultKt.throwOnFailure(obj);
        }
        HttpClient httpClient = (HttpClient) obj;
        double dM46327toDoubleimpl = Duration.m46327toDoubleimpl(TimeSource.Monotonic.ValueTimeMark.m46405elapsedNowUwyO8pc(j), DurationUnit.MILLISECONDS);
        if (StringsKt.contains$default((CharSequence) httpClientSelection2.name(), (CharSequence) "CRONET", false, 2, (Object) null)) {
            if (httpClient == null) {
                str = "native_cronet_timeout";
            } else {
                str = httpClient instanceof CronetClient ? "native_cronet_success_time" : "native_cronet_failure_time";
            }
            SendDiagnosticEvent.DefaultImpls.invoke$default(androidHttpClientProvider.sendDiagnosticEvent, str, Boxing.boxDouble(dM46327toDoubleimpl), null, null, null, null, 60, null);
        }
        return httpClient == null ? androidHttpClientProvider.getOkHttp3Client() : httpClient;
    }

    public final OkHttp3Client getOkHttp3Client() {
        return new OkHttp3Client(this.dispatchers, new OkHttpClient());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // com.unity3d.ads.core.domain.HttpClientProvider
    public Object invoke(Continuation<? super HttpClient> continuation) throws Throwable {
        C145111 c145111;
        Mutex mutex;
        AndroidHttpClientProvider androidHttpClientProvider;
        Mutex mutex2;
        Throwable th;
        AndroidHttpClientProvider androidHttpClientProvider2;
        if (continuation instanceof C145111) {
            c145111 = (C145111) continuation;
            if ((c145111.label & Integer.MIN_VALUE) != 0) {
                c145111.label -= Integer.MIN_VALUE;
            } else {
                c145111 = new C145111(continuation);
            }
        } else {
            c145111 = new C145111(continuation);
        }
        Object obj = c145111.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c145111.label;
        try {
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                mutex = this.mutex;
                c145111.L$0 = this;
                c145111.L$1 = mutex;
                c145111.label = 1;
                if (mutex.lock(null, c145111) != coroutine_suspended) {
                    androidHttpClientProvider = this;
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mutex2 = (Mutex) c145111.L$1;
                androidHttpClientProvider2 = (AndroidHttpClientProvider) c145111.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                    HttpClient httpClient = (HttpClient) obj;
                    androidHttpClientProvider2.cachedClient = httpClient;
                    mutex2.unlock(null);
                    return httpClient;
                } catch (Throwable th2) {
                    th = th2;
                    mutex2.unlock(null);
                    throw th;
                }
            }
            Mutex mutex3 = (Mutex) c145111.L$1;
            androidHttpClientProvider = (AndroidHttpClientProvider) c145111.L$0;
            ResultKt.throwOnFailure(obj);
            mutex = mutex3;
            HttpClient httpClient2 = androidHttpClientProvider.cachedClient;
            if (httpClient2 != null) {
                mutex.unlock(null);
                return httpClient2;
            }
            c145111.L$0 = androidHttpClientProvider;
            c145111.L$1 = mutex;
            c145111.label = 2;
            Object objCreateHttpClient = androidHttpClientProvider.createHttpClient(c145111);
            if (objCreateHttpClient != coroutine_suspended) {
                mutex2 = mutex;
                obj = objCreateHttpClient;
                androidHttpClientProvider2 = androidHttpClientProvider;
                HttpClient httpClient3 = (HttpClient) obj;
                androidHttpClientProvider2.cachedClient = httpClient3;
                mutex2.unlock(null);
                return httpClient3;
            }
            return coroutine_suspended;
        } catch (Throwable th3) {
            mutex2 = mutex;
            th = th3;
            mutex2.unlock(null);
            throw th;
        }
    }
}
