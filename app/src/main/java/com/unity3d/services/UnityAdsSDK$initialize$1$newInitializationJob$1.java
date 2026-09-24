package com.unity3d.services;

import com.unity3d.ads.core.configuration.AlternativeFlowReader;
import com.unity3d.ads.core.domain.InitializeBoldSDK;
import com.unity3d.services.core.domain.task.InitializeSDK;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: UnityAdsSDK.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m43475d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
@DebugMetadata(m43503c = "com.unity3d.services.UnityAdsSDK$initialize$1$newInitializationJob$1", m43504f = "UnityAdsSDK.kt", m43505i = {}, m43506l = {128, 134}, m43507m = "invokeSuspend", m43508n = {}, m43509s = {})
final class UnityAdsSDK$initialize$1$newInitializationJob$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Lazy<AlternativeFlowReader> $alternativeFlowReader$delegate;
    final /* synthetic */ String $gameId;
    final /* synthetic */ CoroutineScope $initScope;
    final /* synthetic */ Lazy<InitializeBoldSDK> $initializeBoldSDK$delegate;
    final /* synthetic */ Lazy<InitializeSDK> $initializeSDK$delegate;
    final /* synthetic */ String $source;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    UnityAdsSDK$initialize$1$newInitializationJob$1(String str, String str2, CoroutineScope coroutineScope, Lazy<? extends AlternativeFlowReader> lazy, Lazy<? extends InitializeBoldSDK> lazy2, Lazy<InitializeSDK> lazy3, Continuation<? super UnityAdsSDK$initialize$1$newInitializationJob$1> continuation) {
        super(2, continuation);
        this.$source = str;
        this.$gameId = str2;
        this.$initScope = coroutineScope;
        this.$alternativeFlowReader$delegate = lazy;
        this.$initializeBoldSDK$delegate = lazy2;
        this.$initializeSDK$delegate = lazy3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UnityAdsSDK$initialize$1$newInitializationJob$1(this.$source, this.$gameId, this.$initScope, this.$alternativeFlowReader$delegate, this.$initializeBoldSDK$delegate, this.$initializeSDK$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((UnityAdsSDK$initialize$1$newInitializationJob$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0045, code lost:
    
        if (com.unity3d.services.UnityAdsSDK.initialize$lambda$9$lambda$8(r5.$initializeBoldSDK$delegate).invoke(r5.$source, r5) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a7, code lost:
    
        if (com.unity3d.services.UnityAdsSDK.initialize$lambda$9$lambda$7(r5.$initializeSDK$delegate).mo44712invokegIAlus(com.unity3d.services.core.domain.task.EmptyParams.INSTANCE, r5) == r0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00a9, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L25
            if (r1 == r3) goto L20
            if (r1 != r2) goto L18
            kotlin.ResultKt.throwOnFailure(r6)
            kotlin.Result r6 = (kotlin.Result) r6
            r6.getValue()
            goto Laa
        L18:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L20:
            kotlin.ResultKt.throwOnFailure(r6)
            goto Laa
        L25:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlin.Lazy<com.unity3d.ads.core.configuration.AlternativeFlowReader> r6 = r5.$alternativeFlowReader$delegate
            com.unity3d.ads.core.configuration.AlternativeFlowReader r6 = com.unity3d.services.UnityAdsSDK.access$initialize$lambda$9$lambda$6(r6)
            boolean r6 = r6.invoke()
            if (r6 == 0) goto L48
            kotlin.Lazy<com.unity3d.ads.core.domain.InitializeBoldSDK> r6 = r5.$initializeBoldSDK$delegate
            com.unity3d.ads.core.domain.InitializeBoldSDK r6 = com.unity3d.services.UnityAdsSDK.access$initialize$lambda$9$lambda$8(r6)
            java.lang.String r1 = r5.$source
            r2 = r5
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            r5.label = r3
            java.lang.Object r6 = r6.invoke(r1, r2)
            if (r6 != r0) goto Laa
            goto La9
        L48:
            boolean r6 = com.unity3d.services.core.properties.SdkProperties.isTestMode()
            if (r6 == 0) goto L51
            java.lang.String r6 = "test mode"
            goto L53
        L51:
            java.lang.String r6 = "production mode"
        L53:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r4 = "Initializing Unity Services "
            r1.<init>(r4)
            java.lang.String r4 = com.unity3d.services.core.properties.SdkProperties.getVersionName()
            r1.append(r4)
            java.lang.String r4 = " ("
            r1.append(r4)
            int r4 = com.unity3d.services.core.properties.SdkProperties.getVersionCode()
            r1.append(r4)
            java.lang.String r4 = ") with game id "
            r1.append(r4)
            java.lang.String r4 = r5.$gameId
            r1.append(r4)
            java.lang.String r4 = " in "
            r1.append(r4)
            r1.append(r6)
            java.lang.String r6 = ", session "
            r1.append(r6)
            com.unity3d.services.core.properties.Session$Default r6 = com.unity3d.services.core.properties.Session.INSTANCE
            java.lang.String r6 = r6.getId()
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            com.unity3d.services.core.log.DeviceLog.info(r6)
            kotlin.Lazy<com.unity3d.services.core.domain.task.InitializeSDK> r6 = r5.$initializeSDK$delegate
            com.unity3d.services.core.domain.task.InitializeSDK r6 = com.unity3d.services.UnityAdsSDK.access$initialize$lambda$9$lambda$7(r6)
            com.unity3d.services.core.domain.task.EmptyParams r1 = com.unity3d.services.core.domain.task.EmptyParams.INSTANCE
            com.unity3d.services.core.domain.task.BaseParams r1 = (com.unity3d.services.core.domain.task.BaseParams) r1
            r4 = r5
            kotlin.coroutines.Continuation r4 = (kotlin.coroutines.Continuation) r4
            r5.label = r2
            java.lang.Object r6 = r6.mo44712invokegIAlus(r1, r4)
            if (r6 != r0) goto Laa
        La9:
            return r0
        Laa:
            kotlinx.coroutines.CoroutineScope r6 = r5.$initScope
            r0 = 0
            kotlinx.coroutines.CoroutineScopeKt.cancel$default(r6, r0, r3, r0)
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.services.UnityAdsSDK$initialize$1$newInitializationJob$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
