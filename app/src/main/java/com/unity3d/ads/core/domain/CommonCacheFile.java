package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.TimeSource;
import org.json.JSONArray;

/* JADX INFO: compiled from: CommonCacheFile.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J3\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, m43475d2 = {"Lcom/unity3d/ads/core/domain/CommonCacheFile;", "Lcom/unity3d/ads/core/domain/CacheFile;", "cacheRepository", "Lcom/unity3d/ads/core/data/repository/CacheRepository;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "(Lcom/unity3d/ads/core/data/repository/CacheRepository;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "invoke", "Lcom/unity3d/ads/core/data/model/CacheResult;", "url", "", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "headers", "Lorg/json/JSONArray;", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "", "(Ljava/lang/String;Lcom/unity3d/ads/core/data/model/AdObject;Lorg/json/JSONArray;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class CommonCacheFile implements CacheFile {
    private final CacheRepository cacheRepository;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.CommonCacheFile$invoke$1 */
    /* JADX INFO: compiled from: CommonCacheFile.kt */
    @Metadata(m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
    @DebugMetadata(m43503c = "com.unity3d.ads.core.domain.CommonCacheFile", m43504f = "CommonCacheFile.kt", m43505i = {0, 0, 0}, m43506l = {26}, m43507m = "invoke", m43508n = {"this", "adObject", "startTime"}, m43509s = {"L$0", "L$1", "J$0"})
    static final class C145241 extends ContinuationImpl {
        long J$0;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C145241(Continuation<? super C145241> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonCacheFile.this.invoke(null, null, null, 0, this);
        }
    }

    public CommonCacheFile(CacheRepository cacheRepository, SendDiagnosticEvent sendDiagnosticEvent) {
        Intrinsics.checkNotNullParameter(cacheRepository, "cacheRepository");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.cacheRepository = cacheRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Override // com.unity3d.ads.core.domain.CacheFile
    public Object invoke(String str, AdObject adObject, JSONArray jSONArray, int i, Continuation<? super CacheResult> continuation) throws Throwable {
        C145241 c145241;
        CommonCacheFile commonCacheFile;
        AdObject adObject2;
        long j;
        String message;
        if (continuation instanceof C145241) {
            c145241 = (C145241) continuation;
            if ((c145241.label & Integer.MIN_VALUE) != 0) {
                c145241.label -= Integer.MIN_VALUE;
            } else {
                c145241 = new C145241(continuation);
            }
        } else {
            c145241 = new C145241(continuation);
        }
        Object file = c145241.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c145241.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(file);
            long jM46400markNowz9LOYto = TimeSource.Monotonic.INSTANCE.m46400markNowz9LOYto();
            CacheRepository cacheRepository = this.cacheRepository;
            c145241.L$0 = this;
            c145241.L$1 = adObject;
            c145241.J$0 = jM46400markNowz9LOYto;
            c145241.label = 1;
            file = cacheRepository.getFile(str, jSONArray, i, c145241);
            if (file == coroutine_suspended) {
                return coroutine_suspended;
            }
            commonCacheFile = this;
            adObject2 = adObject;
            j = jM46400markNowz9LOYto;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = c145241.J$0;
            AdObject adObject3 = (AdObject) c145241.L$1;
            commonCacheFile = (CommonCacheFile) c145241.L$0;
            ResultKt.throwOnFailure(file);
            adObject2 = adObject3;
        }
        CacheResult cacheResult = (CacheResult) file;
        if (cacheResult instanceof CacheResult.Success) {
            SendDiagnosticEvent sendDiagnosticEvent = commonCacheFile.sendDiagnosticEvent;
            Double dBoxDouble = Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource.Monotonic.ValueTimeMark.m46401boximpl(j)));
            CacheResult.Success success = (CacheResult.Success) cacheResult;
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent, "native_load_cache_success_time", dBoxDouble, MapsKt.mapOf(TuplesKt.m43482to("cache_source", success.getSource().toString()), TuplesKt.m43482to("protocol", success.getCachedFile().getProtocol())), MapsKt.mapOf(TuplesKt.m43482to("size_kb", Boxing.boxInt((int) (success.getCachedFile().getContentLength() / ((long) 1024))))), adObject2, null, 32, null);
            return cacheResult;
        }
        if (cacheResult instanceof CacheResult.Failure) {
            SendDiagnosticEvent sendDiagnosticEvent2 = commonCacheFile.sendDiagnosticEvent;
            Double dBoxDouble2 = Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource.Monotonic.ValueTimeMark.m46401boximpl(j)));
            Pair[] pairArr = new Pair[3];
            CacheResult.Failure failure = (CacheResult.Failure) cacheResult;
            pairArr[0] = TuplesKt.m43482to("cache_source", failure.getSource().toString());
            pairArr[1] = TuplesKt.m43482to("reason", failure.getError().toString());
            Throwable reason = failure.getReason();
            if (reason == null || (message = reason.getMessage()) == null) {
                message = "";
            }
            pairArr[2] = TuplesKt.m43482to("reason_debug", message);
            SendDiagnosticEvent.DefaultImpls.invoke$default(sendDiagnosticEvent2, "native_load_cache_failure_time", dBoxDouble2, MapsKt.mapOf(pairArr), null, adObject2, null, 40, null);
        }
        return cacheResult;
    }
}
