package com.unity3d.ads.adplayer;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineExceptionHandler;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;

/* JADX INFO: compiled from: AdPlayerScope.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0012\u0010\u0007\u001a\u00020\bX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, m43475d2 = {"Lcom/unity3d/ads/adplayer/AdPlayerScope;", "Lkotlinx/coroutines/CoroutineScope;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "sdkErrorHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "(Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineExceptionHandler;)V", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class AdPlayerScope implements CoroutineScope {
    private final /* synthetic */ CoroutineScope $$delegate_0;
    private final CoroutineDispatcher defaultDispatcher;
    private final CoroutineExceptionHandler sdkErrorHandler;

    public AdPlayerScope(CoroutineDispatcher defaultDispatcher, CoroutineExceptionHandler sdkErrorHandler) {
        Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        Intrinsics.checkNotNullParameter(sdkErrorHandler, "sdkErrorHandler");
        this.defaultDispatcher = defaultDispatcher;
        this.sdkErrorHandler = sdkErrorHandler;
        this.$$delegate_0 = CoroutineScopeKt.CoroutineScope(defaultDispatcher.plus(sdkErrorHandler));
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }
}
