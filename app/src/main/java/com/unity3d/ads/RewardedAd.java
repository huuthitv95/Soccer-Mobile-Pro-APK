package com.unity3d.ads;

import android.app.Activity;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.Listeners;
import com.unity3d.ads.core.data.model.ShowConfigurationInternal;
import com.unity3d.ads.core.domain.SafeCallbackInvoke;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.ads.metadata.MetaData;
import com.unity3d.services.UnityAdsSDK;
import com.unity3d.services.core.p295di.IServiceProvider;
import com.unity3d.services.core.p295di.ServiceKey;
import com.unity3d.services.core.p295di.ServiceProvider;
import gatewayprotocol.p299v1.ErrorOuterClass;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: RewardedAd.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0017\b\u0000\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J&\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, m43475d2 = {"Lcom/unity3d/ads/RewardedAd;", "", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "safeCallbackInvoke", "Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;", "(Lcom/unity3d/ads/core/data/model/AdObject;Lcom/unity3d/ads/core/domain/SafeCallbackInvoke;)V", "onAdExpired", "Lcom/unity3d/ads/AdExpiredListener;", "getOnAdExpired", "()Lcom/unity3d/ads/AdExpiredListener;", "setOnAdExpired", "(Lcom/unity3d/ads/AdExpiredListener;)V", "show", "", "activity", "Landroid/app/Activity;", "configuration", "Lcom/unity3d/ads/ShowConfiguration;", "listener", "Lcom/unity3d/ads/RewardedShowListener;", "Companion", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class RewardedAd {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final AdObject adObject;
    private AdExpiredListener<RewardedAd> onAdExpired;
    private final SafeCallbackInvoke safeCallbackInvoke;

    /* JADX INFO: compiled from: RewardedAd.kt */
    @Metadata(m43474d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0007¨\u0006\n"}, m43475d2 = {"Lcom/unity3d/ads/RewardedAd$Companion;", "", "()V", "load", "", "configuration", "Lcom/unity3d/ads/LoadConfiguration;", "listener", "Lcom/unity3d/ads/LoadListener;", "Lcom/unity3d/ads/RewardedAd;", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void load(LoadConfiguration configuration, LoadListener<RewardedAd> listener) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            Intrinsics.checkNotNullParameter(listener, "listener");
            BuildersKt__Builders_commonKt.launch$default((CoroutineScope) ServiceProvider.INSTANCE.getRegistry().resolveService(new ServiceKey(ServiceProvider.NAMED_LOAD_SCOPE, Reflection.getOrCreateKotlinClass(CoroutineScope.class))), null, null, new RewardedAd$Companion$load$1(configuration, listener, null), 3, null);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.RewardedAd$show$1 */
    /* JADX INFO: compiled from: RewardedAd.kt */
    @Metadata(m43474d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m43475d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
    @DebugMetadata(m43503c = "com.unity3d.ads.RewardedAd$show$1", m43504f = "RewardedAd.kt", m43505i = {}, m43506l = {}, m43507m = "invokeSuspend", m43508n = {}, m43509s = {})
    static final class C143311 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Activity $activity;
        final /* synthetic */ ShowConfiguration $configuration;
        final /* synthetic */ RewardedShowListener $listener;
        int label;
        final /* synthetic */ RewardedAd this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C143311(ShowConfiguration showConfiguration, RewardedAd rewardedAd, Activity activity, RewardedShowListener rewardedShowListener, Continuation<? super C143311> continuation) {
            super(2, continuation);
            this.$configuration = showConfiguration;
            this.this$0 = rewardedAd;
            this.$activity = activity;
            this.$listener = rewardedShowListener;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C143311(this.$configuration, this.this$0, this.$activity, this.$listener, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C143311) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            Map<String, String> mapEmptyMap;
            Map<String, String> extras;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ShowConfiguration showConfiguration = this.$configuration;
            IServiceProvider iServiceProvider = null;
            Object[] objArr = 0;
            String customRewardString = showConfiguration != null ? showConfiguration.getCustomRewardString() : null;
            ShowConfiguration showConfiguration2 = this.$configuration;
            if (showConfiguration2 == null || (mapEmptyMap = showConfiguration2.getExtras()) == null) {
                mapEmptyMap = MapsKt.emptyMap();
            }
            ShowConfigurationInternal showConfigurationInternal = new ShowConfigurationInternal(customRewardString, mapEmptyMap);
            UnityAdsShowOptions unityAdsShowOptions = new UnityAdsShowOptions();
            unityAdsShowOptions.setObjectId(ProtobufExtensionsKt.toUUID(this.this$0.adObject.getOpportunityId()).toString());
            unityAdsShowOptions.showConfiguration = showConfigurationInternal;
            MetaData metaData = new MetaData(this.$activity);
            ShowConfiguration showConfiguration3 = this.$configuration;
            if (showConfiguration3 != null && (extras = showConfiguration3.getExtras()) != null) {
                for (Map.Entry<String, String> entry : extras.entrySet()) {
                    metaData.set(entry.getKey(), entry.getValue());
                }
            }
            metaData.commit();
            this.this$0.adObject.setShowConfiguration(this.$configuration);
            AdObject adObject = this.this$0.adObject;
            ShowConfiguration showConfiguration4 = this.$configuration;
            adObject.setPlayerServerId(showConfiguration4 != null ? showConfiguration4.getCustomRewardString() : null);
            this.this$0.adObject.setActivity(new WeakReference<>(this.$activity));
            UnityAdsSDK unityAdsSDK = new UnityAdsSDK(iServiceProvider, 1, objArr == true ? 1 : 0);
            String placementId = this.this$0.adObject.getPlacementId();
            final RewardedShowListener rewardedShowListener = this.$listener;
            final RewardedAd rewardedAd = this.this$0;
            unityAdsSDK.show(placementId, unityAdsShowOptions, new Listeners() { // from class: com.unity3d.ads.RewardedAd.show.1.2

                /* JADX INFO: renamed from: com.unity3d.ads.RewardedAd$show$1$2$WhenMappings */
                /* JADX INFO: compiled from: RewardedAd.kt */
                @Metadata(m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
                public /* synthetic */ class WhenMappings {
                    public static final /* synthetic */ int[] $EnumSwitchMapping$0;
                    public static final /* synthetic */ int[] $EnumSwitchMapping$1;

                    static {
                        int[] iArr = new int[UnityAds.UnityAdsShowError.values().length];
                        try {
                            iArr[UnityAds.UnityAdsShowError.TIMEOUT.ordinal()] = 1;
                        } catch (NoSuchFieldError unused) {
                        }
                        try {
                            iArr[UnityAds.UnityAdsShowError.EXPIRED.ordinal()] = 2;
                        } catch (NoSuchFieldError unused2) {
                        }
                        try {
                            iArr[UnityAds.UnityAdsShowError.ALREADY_SHOWING.ordinal()] = 3;
                        } catch (NoSuchFieldError unused3) {
                        }
                        $EnumSwitchMapping$0 = iArr;
                        int[] iArr2 = new int[UnityAds.UnityAdsShowCompletionState.values().length];
                        try {
                            iArr2[UnityAds.UnityAdsShowCompletionState.COMPLETED.ordinal()] = 1;
                        } catch (NoSuchFieldError unused4) {
                        }
                        try {
                            iArr2[UnityAds.UnityAdsShowCompletionState.SKIPPED.ordinal()] = 2;
                        } catch (NoSuchFieldError unused5) {
                        }
                        $EnumSwitchMapping$1 = iArr2;
                    }
                }

                @Override // com.unity3d.ads.core.data.model.Listeners
                public void onClick(String placementId2) {
                    Intrinsics.checkNotNullParameter(placementId2, "placementId");
                    RewardedShowListener rewardedShowListener2 = rewardedShowListener;
                    if (rewardedShowListener2 != null) {
                        rewardedShowListener2.onClicked(rewardedAd);
                    }
                }

                @Override // com.unity3d.ads.core.data.model.Listeners
                public void onComplete(String placementId2, UnityAds.UnityAdsShowCompletionState state) {
                    ShowFinishState showFinishState;
                    Intrinsics.checkNotNullParameter(placementId2, "placementId");
                    Intrinsics.checkNotNullParameter(state, "state");
                    int i = WhenMappings.$EnumSwitchMapping$1[state.ordinal()];
                    if (i == 1) {
                        showFinishState = ShowFinishState.COMPLETED;
                    } else {
                        if (i != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        showFinishState = ShowFinishState.SKIPPED;
                    }
                    RewardedShowListener rewardedShowListener2 = rewardedShowListener;
                    if (rewardedShowListener2 != null) {
                        rewardedShowListener2.onCompleted(rewardedAd, showFinishState);
                    }
                }

                @Override // com.unity3d.ads.core.data.model.Listeners
                public void onError(String placementId2, UnityAds.UnityAdsShowError error, String message) {
                    ErrorOuterClass.PublicErrorCode publicErrorCode;
                    Intrinsics.checkNotNullParameter(placementId2, "placementId");
                    Intrinsics.checkNotNullParameter(error, "error");
                    Intrinsics.checkNotNullParameter(message, "message");
                    int i = WhenMappings.$EnumSwitchMapping$0[error.ordinal()];
                    if (i == 1) {
                        publicErrorCode = ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_TIMEOUT;
                    } else if (i != 2) {
                        publicErrorCode = i != 3 ? ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_SHOW_INTERNAL : ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_SHOW_ALREADY_SHOWN;
                    } else {
                        publicErrorCode = ErrorOuterClass.PublicErrorCode.PUBLIC_ERROR_CODE_SHOW_EXPIRED;
                    }
                    RewardedShowListener rewardedShowListener2 = rewardedShowListener;
                    if (rewardedShowListener2 != null) {
                        rewardedShowListener2.onFailed(rewardedAd, new UnityAdsError(publicErrorCode.getNumber(), UnityAdsErrorKt.getShowErrorMsg(publicErrorCode)));
                    }
                }

                @Override // com.unity3d.ads.core.data.model.Listeners
                public void onLeftApplication(String placementId2) {
                    Intrinsics.checkNotNullParameter(placementId2, "placementId");
                }

                @Override // com.unity3d.ads.core.data.model.Listeners
                public void onRewarded(String placementId2) {
                    Intrinsics.checkNotNullParameter(placementId2, "placementId");
                    RewardedShowListener rewardedShowListener2 = rewardedShowListener;
                    if (rewardedShowListener2 != null) {
                        rewardedShowListener2.onRewarded(rewardedAd);
                    }
                }

                @Override // com.unity3d.ads.core.data.model.Listeners
                public void onStart(String placementId2) {
                    Intrinsics.checkNotNullParameter(placementId2, "placementId");
                    RewardedShowListener rewardedShowListener2 = rewardedShowListener;
                    if (rewardedShowListener2 != null) {
                        rewardedShowListener2.onStarted(rewardedAd);
                    }
                }
            });
            return Unit.INSTANCE;
        }
    }

    public RewardedAd(AdObject adObject, SafeCallbackInvoke safeCallbackInvoke) {
        CoroutineScope scope;
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        Intrinsics.checkNotNullParameter(safeCallbackInvoke, "safeCallbackInvoke");
        this.adObject = adObject;
        this.safeCallbackInvoke = safeCallbackInvoke;
        AdPlayer adPlayer = adObject.getAdPlayer();
        if (adPlayer == null || (scope = adPlayer.getScope()) == null) {
            return;
        }
        BuildersKt__Builders_commonKt.launch$default(scope, null, null, new RewardedAd$1$1(this, null), 3, null);
    }

    @JvmStatic
    public static final void load(LoadConfiguration loadConfiguration, LoadListener<RewardedAd> loadListener) {
        INSTANCE.load(loadConfiguration, loadListener);
    }

    public static /* synthetic */ void show$default(RewardedAd rewardedAd, Activity activity, ShowConfiguration showConfiguration, RewardedShowListener rewardedShowListener, int i, Object obj) {
        if ((i & 2) != 0) {
            showConfiguration = null;
        }
        if ((i & 4) != 0) {
            rewardedShowListener = null;
        }
        rewardedAd.show(activity, showConfiguration, rewardedShowListener);
    }

    public final AdExpiredListener<RewardedAd> getOnAdExpired() {
        return this.onAdExpired;
    }

    public final void setOnAdExpired(AdExpiredListener<RewardedAd> adExpiredListener) {
        this.onAdExpired = adExpiredListener;
    }

    public final void show(Activity activity, ShowConfiguration configuration, RewardedShowListener listener) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        BuildersKt__Builders_commonKt.launch$default((CoroutineScope) ServiceProvider.INSTANCE.getRegistry().resolveService(new ServiceKey(ServiceProvider.NAMED_SHOW_SCOPE, Reflection.getOrCreateKotlinClass(CoroutineScope.class))), null, null, new C143311(configuration, this, activity, listener, null), 3, null);
    }
}
