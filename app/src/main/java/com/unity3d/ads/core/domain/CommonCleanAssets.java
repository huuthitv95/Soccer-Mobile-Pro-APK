package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import kotlin.Metadata;
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

/* JADX INFO: compiled from: CommonCleanAssets.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0011\u0010\u0007\u001a\u00020\bH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, m43475d2 = {"Lcom/unity3d/ads/core/domain/CommonCleanAssets;", "Lcom/unity3d/ads/core/domain/CleanAssets;", "cacheRepository", "Lcom/unity3d/ads/core/data/repository/CacheRepository;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "(Lcom/unity3d/ads/core/data/repository/CacheRepository;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "invoke", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class CommonCleanAssets implements CleanAssets {
    private final CacheRepository cacheRepository;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.CommonCleanAssets$invoke$1 */
    /* JADX INFO: compiled from: CommonCleanAssets.kt */
    @Metadata(m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
    @DebugMetadata(m43503c = "com.unity3d.ads.core.domain.CommonCleanAssets", m43504f = "CommonCleanAssets.kt", m43505i = {0, 0, 1, 1, 1}, m43506l = {18, 19}, m43507m = "invoke", m43508n = {"this", "startTime", "this", "startTime", "currentSize"}, m43509s = {"L$0", "J$0", "L$0", "J$0", "J$1"})
    static final class C145251 extends ContinuationImpl {
        long J$0;
        long J$1;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C145251(Continuation<? super C145251> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonCleanAssets.this.invoke(this);
        }
    }

    public CommonCleanAssets(CacheRepository cacheRepository, SendDiagnosticEvent sendDiagnosticEvent) {
        Intrinsics.checkNotNullParameter(cacheRepository, "cacheRepository");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.cacheRepository = cacheRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // com.unity3d.ads.core.domain.CleanAssets
    public Object invoke(Continuation<? super Unit> continuation) throws Throwable {
        C145251 c145251;
        CommonCleanAssets commonCleanAssets;
        long j;
        CommonCleanAssets commonCleanAssets2;
        long j2;
        long j3;
        if (continuation instanceof C145251) {
            c145251 = (C145251) continuation;
            if ((c145251.label & Integer.MIN_VALUE) != 0) {
                c145251.label -= Integer.MIN_VALUE;
            } else {
                c145251 = new C145251(continuation);
            }
        } else {
            c145251 = new C145251(continuation);
        }
        Object cacheSize = c145251.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c145251.label;
        if (i == 0) {
            ResultKt.throwOnFailure(cacheSize);
            long jM46400markNowz9LOYto = TimeSource.Monotonic.INSTANCE.m46400markNowz9LOYto();
            CacheRepository cacheRepository = this.cacheRepository;
            c145251.L$0 = this;
            c145251.J$0 = jM46400markNowz9LOYto;
            c145251.label = 1;
            cacheSize = cacheRepository.getCacheSize(c145251);
            if (cacheSize != coroutine_suspended) {
                commonCleanAssets = this;
                j = jM46400markNowz9LOYto;
            }
            return coroutine_suspended;
        }
        if (i == 1) {
            j = c145251.J$0;
            commonCleanAssets = (CommonCleanAssets) c145251.L$0;
            ResultKt.throwOnFailure(cacheSize);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j3 = c145251.J$1;
            j2 = c145251.J$0;
            commonCleanAssets2 = (CommonCleanAssets) c145251.L$0;
            ResultKt.throwOnFailure(cacheSize);
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(commonCleanAssets2.sendDiagnosticEvent, "native_clean_assets_task_success_time", Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource.Monotonic.ValueTimeMark.m46401boximpl(j2))), null, MapsKt.mapOf(TuplesKt.m43482to("size_kb", Boxing.boxInt((int) (j3 / ((long) 1024))))), null, null, 52, null);
        return Unit.INSTANCE;
        long jLongValue = ((Number) cacheSize).longValue();
        CacheRepository cacheRepository2 = commonCleanAssets.cacheRepository;
        c145251.L$0 = commonCleanAssets;
        c145251.J$0 = j;
        c145251.J$1 = jLongValue;
        c145251.label = 2;
        if (cacheRepository2.clearCache(c145251) != coroutine_suspended) {
            commonCleanAssets2 = commonCleanAssets;
            j2 = j;
            j3 = jLongValue;
            SendDiagnosticEvent.DefaultImpls.invoke$default(commonCleanAssets2.sendDiagnosticEvent, "native_clean_assets_task_success_time", Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource.Monotonic.ValueTimeMark.m46401boximpl(j2))), null, MapsKt.mapOf(TuplesKt.m43482to("size_kb", Boxing.boxInt((int) (j3 / ((long) 1024))))), null, null, 52, null);
            return Unit.INSTANCE;
        }
        return coroutine_suspended;
    }
}
