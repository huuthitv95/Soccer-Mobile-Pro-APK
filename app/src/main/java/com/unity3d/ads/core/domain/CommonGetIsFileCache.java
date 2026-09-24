package com.unity3d.ads.core.domain;

import com.google.firebase.sessions.settings.RemoteSettings;
import com.unity3d.ads.core.data.repository.CacheRepository;
import com.unity3d.ads.core.extensions.TimeExtensionsKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.time.TimeSource;

/* JADX INFO: compiled from: CommonGetIsFileCache.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096Bø\u0001\u0000¢\u0006\u0002\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, m43475d2 = {"Lcom/unity3d/ads/core/domain/CommonGetIsFileCache;", "Lcom/unity3d/ads/core/domain/GetIsFileCache;", "cacheRepository", "Lcom/unity3d/ads/core/data/repository/CacheRepository;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "(Lcom/unity3d/ads/core/data/repository/CacheRepository;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "invoke", "", "url", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class CommonGetIsFileCache implements GetIsFileCache {
    private final CacheRepository cacheRepository;
    private final SendDiagnosticEvent sendDiagnosticEvent;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.CommonGetIsFileCache$invoke$1 */
    /* JADX INFO: compiled from: CommonGetIsFileCache.kt */
    @Metadata(m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
    @DebugMetadata(m43503c = "com.unity3d.ads.core.domain.CommonGetIsFileCache", m43504f = "CommonGetIsFileCache.kt", m43505i = {0, 0}, m43506l = {18}, m43507m = "invoke", m43508n = {"this", "startTime"}, m43509s = {"L$0", "J$0"})
    static final class C145271 extends ContinuationImpl {
        long J$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C145271(Continuation<? super C145271> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return CommonGetIsFileCache.this.invoke(null, this);
        }
    }

    public CommonGetIsFileCache(CacheRepository cacheRepository, SendDiagnosticEvent sendDiagnosticEvent) {
        Intrinsics.checkNotNullParameter(cacheRepository, "cacheRepository");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.cacheRepository = cacheRepository;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Override // com.unity3d.ads.core.domain.GetIsFileCache
    public Object invoke(String str, Continuation<? super Boolean> continuation) throws Throwable {
        C145271 c145271;
        CommonGetIsFileCache commonGetIsFileCache;
        long j;
        if (continuation instanceof C145271) {
            c145271 = (C145271) continuation;
            if ((c145271.label & Integer.MIN_VALUE) != 0) {
                c145271.label -= Integer.MIN_VALUE;
            } else {
                c145271 = new C145271(continuation);
            }
        } else {
            c145271 = new C145271(continuation);
        }
        Object objDoesFileExist = c145271.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c145271.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objDoesFileExist);
            long jM46400markNowz9LOYto = TimeSource.Monotonic.INSTANCE.m46400markNowz9LOYto();
            String strSubstringAfterLast$default = StringsKt.substringAfterLast$default(str, RemoteSettings.FORWARD_SLASH_STRING, (String) null, 2, (Object) null);
            CacheRepository cacheRepository = this.cacheRepository;
            c145271.L$0 = this;
            c145271.J$0 = jM46400markNowz9LOYto;
            c145271.label = 1;
            objDoesFileExist = cacheRepository.doesFileExist(strSubstringAfterLast$default, c145271);
            if (objDoesFileExist == coroutine_suspended) {
                return coroutine_suspended;
            }
            commonGetIsFileCache = this;
            j = jM46400markNowz9LOYto;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = c145271.J$0;
            commonGetIsFileCache = (CommonGetIsFileCache) c145271.L$0;
            ResultKt.throwOnFailure(objDoesFileExist);
        }
        boolean zBooleanValue = ((Boolean) objDoesFileExist).booleanValue();
        SendDiagnosticEvent.DefaultImpls.invoke$default(commonGetIsFileCache.sendDiagnosticEvent, zBooleanValue ? "native_show_is_file_cached_success_time" : "native_show_is_file_cached_failure_time", Boxing.boxDouble(TimeExtensionsKt.elapsedMillis(TimeSource.Monotonic.ValueTimeMark.m46401boximpl(j))), null, null, null, null, 60, null);
        return Boxing.boxBoolean(zBooleanValue);
    }
}
