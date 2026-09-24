package com.unity3d.ads;

import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.LoadConfigurationInternal;
import com.unity3d.ads.core.domain.InternalLoadListener;
import com.unity3d.ads.core.domain.SafeCallbackInvoke;
import com.unity3d.services.ads.UnityAdsImplementation;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.p295di.ServiceKey;
import com.unity3d.services.core.p295di.ServiceProvider;
import gatewayprotocol.p299v1.ErrorOuterClass;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: InterstitialAd.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m43475d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
@DebugMetadata(m43503c = "com.unity3d.ads.InterstitialAd$Companion$load$1", m43504f = "InterstitialAd.kt", m43505i = {}, m43506l = {}, m43507m = "invokeSuspend", m43508n = {}, m43509s = {})
final class InterstitialAd$Companion$load$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LoadConfiguration $configuration;
    final /* synthetic */ LoadListener<InterstitialAd> $listener;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InterstitialAd$Companion$load$1(LoadConfiguration loadConfiguration, LoadListener<InterstitialAd> loadListener, Continuation<? super InterstitialAd$Companion$load$1> continuation) {
        super(2, continuation);
        this.$configuration = loadConfiguration;
        this.$listener = loadListener;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invokeSuspend$lambda$3$lambda$2(LoadListener loadListener, Throwable th) {
        loadListener.onAdLoaded(null, new UnityAdsError(ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_INIT_UNKNOWN.getNumber(), "Unity Ads SDK load failed due to unexpected error: " + th.getMessage()));
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InterstitialAd$Companion$load$1 interstitialAd$Companion$load$1 = new InterstitialAd$Companion$load$1(this.$configuration, this.$listener, continuation);
        interstitialAd$Companion$load$1.L$0 = obj;
        return interstitialAd$Companion$load$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((InterstitialAd$Companion$load$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objM44946constructorimpl;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        LoadConfiguration loadConfiguration = this.$configuration;
        final LoadListener<InterstitialAd> loadListener = this.$listener;
        try {
            Result.Companion companion = Result.INSTANCE;
            LoadConfigurationInternal loadConfigurationInternal = new LoadConfigurationInternal(loadConfiguration.getPlacementId(), loadConfiguration.getAdMarkup(), loadConfiguration.getMediationAdUnitId(), loadConfiguration.getMediationInfo(), MapsKt.toMap(loadConfiguration.getExtras()));
            UUID uuidRandomUUID = UUID.randomUUID();
            UnityAdsLoadOptions unityAdsLoadOptions = new UnityAdsLoadOptions();
            unityAdsLoadOptions.setObjectId(uuidRandomUUID.toString());
            unityAdsLoadOptions.setAdMarkup(loadConfiguration.getAdMarkup());
            unityAdsLoadOptions.loadConfiguration = loadConfigurationInternal;
            UnityAdsImplementation.getInstance().load(loadConfiguration.getPlacementId(), unityAdsLoadOptions, new InternalLoadListener() { // from class: com.unity3d.ads.InterstitialAd$Companion$load$1$1$1
                @Override // com.unity3d.ads.core.domain.InternalLoadListener
                public void onAdLoadFail(UnityAdsError error) {
                    Intrinsics.checkNotNullParameter(error, "error");
                    loadListener.onAdLoaded(null, error);
                }

                @Override // com.unity3d.ads.core.domain.InternalLoadListener
                public void onAdLoaded(AdObject adObject) {
                    Intrinsics.checkNotNullParameter(adObject, "adObject");
                    loadListener.onAdLoaded(new InterstitialAd(adObject, (SafeCallbackInvoke) ServiceProvider.INSTANCE.getRegistry().resolveService(new ServiceKey(null, Reflection.getOrCreateKotlinClass(SafeCallbackInvoke.class), 1, null))), null);
                }
            });
            objM44946constructorimpl = Result.m44946constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(th));
        }
        final LoadListener<InterstitialAd> loadListener2 = this.$listener;
        final Throwable thM44949exceptionOrNullimpl = Result.m44949exceptionOrNullimpl(objM44946constructorimpl);
        if (thM44949exceptionOrNullimpl != null) {
            Utilities.wrapCustomerListener(new Runnable() { // from class: com.unity3d.ads.InterstitialAd$Companion$load$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    InterstitialAd$Companion$load$1.invokeSuspend$lambda$3$lambda$2(loadListener2, thM44949exceptionOrNullimpl);
                }
            });
        }
        return Unit.INSTANCE;
    }
}
