package com.unity3d.ads;

import android.app.Activity;
import android.content.Context;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.services.UnityServices;
import com.unity3d.services.ads.IUnityAds;
import com.unity3d.services.ads.UnityAdsImplementation;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.p295di.ServiceKey;
import com.unity3d.services.core.p295di.ServiceProvider;
import com.unity3d.services.core.properties.ClientProperties;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: compiled from: UnityAds.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004DEFGB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0018\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0007J\u0018\u0010\u0018\u001a\u00020*2\u0006\u0010-\u001a\u00020.2\u0006\u0010+\u001a\u00020,H\u0007J\u001c\u0010/\u001a\u00020*2\b\u00100\u001a\u0004\u0018\u0001012\b\u00102\u001a\u0004\u0018\u00010\u0016H\u0007J&\u0010/\u001a\u00020*2\b\u00100\u001a\u0004\u0018\u0001012\b\u00102\u001a\u0004\u0018\u00010\u00162\b\u00103\u001a\u0004\u0018\u000104H\u0007J$\u0010/\u001a\u00020*2\b\u00100\u001a\u0004\u0018\u0001012\b\u00102\u001a\u0004\u0018\u00010\u00162\u0006\u00105\u001a\u00020\u0004H\u0007J.\u0010/\u001a\u00020*2\b\u00100\u001a\u0004\u0018\u0001012\b\u00102\u001a\u0004\u0018\u00010\u00162\u0006\u00105\u001a\u00020\u00042\b\u00103\u001a\u0004\u0018\u000104H\u0007J\u0018\u0010/\u001a\u00020*2\u0006\u0010-\u001a\u0002062\u0006\u0010+\u001a\u000207H\u0007J\u0012\u00108\u001a\u00020*2\b\u00109\u001a\u0004\u0018\u00010\u0016H\u0007J\u001c\u00108\u001a\u00020*2\b\u00109\u001a\u0004\u0018\u00010\u00162\b\u0010+\u001a\u0004\u0018\u00010:H\u0007J&\u00108\u001a\u00020*2\b\u00109\u001a\u0004\u0018\u00010\u00162\b\u0010;\u001a\u0004\u0018\u00010<2\b\u0010+\u001a\u0004\u0018\u00010:H\u0007J\u001c\u0010=\u001a\u00020*2\b\u0010>\u001a\u0004\u0018\u00010?2\b\u00109\u001a\u0004\u0018\u00010\u0016H\u0007J&\u0010=\u001a\u00020*2\b\u0010>\u001a\u0004\u0018\u00010?2\b\u00109\u001a\u0004\u0018\u00010\u00162\b\u0010@\u001a\u0004\u0018\u00010AH\u0007J&\u0010=\u001a\u00020*2\b\u0010>\u001a\u0004\u0018\u00010?2\b\u00109\u001a\u0004\u0018\u00010\u00162\b\u0010B\u001a\u0004\u0018\u00010CH\u0007J0\u0010=\u001a\u00020*2\b\u0010>\u001a\u0004\u0018\u00010?2\b\u00109\u001a\u0004\u0018\u00010\u00162\b\u0010B\u001a\u0004\u0018\u00010C2\b\u0010@\u001a\u0004\u0018\u00010AH\u0007R*\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00048F@FX\u0087\u000e¢\u0006\u0012\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\u0002\u001a\u0004\b\n\u0010\u0007R\u001a\u0010\f\u001a\u00020\u00048FX\u0087\u0004¢\u0006\f\u0012\u0004\b\r\u0010\u0002\u001a\u0004\b\f\u0010\u0007R(\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u0010\u0014\u0012\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00168FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0017\u0010\u0002\u001a\u0004\b\u0018\u0010\u0019R(\u0010\u001a\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u0010\u0014\u0012\u0004\b\u001b\u0010\u0002\u001a\u0004\b\u001c\u0010\u0011\"\u0004\b\u001d\u0010\u0013R&\u0010\u001e\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0087\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b\u001f\u0010\u0002\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\"R(\u0010#\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0016\n\u0002\u0010\u0014\u0012\u0004\b$\u0010\u0002\u001a\u0004\b%\u0010\u0011\"\u0004\b&\u0010\u0013R\u001a\u0010'\u001a\u00020\u00168FX\u0087\u0004¢\u0006\f\u0012\u0004\b(\u0010\u0002\u001a\u0004\b)\u0010\u0019¨\u0006H"}, m43475d2 = {"Lcom/unity3d/ads/UnityAds;", "", "()V", "debugMode", "", "getDebugMode$annotations", "getDebugMode", "()Z", "setDebugMode", "(Z)V", "isInitialized", "isInitialized$annotations", "isSupported", "isSupported$annotations", "nonBehavioral", "getNonBehavioral$annotations", "getNonBehavioral", "()Ljava/lang/Boolean;", "setNonBehavioral", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "token", "", "getToken$annotations", "getToken", "()Ljava/lang/String;", "userConsent", "getUserConsent$annotations", "getUserConsent", "setUserConsent", "userIdentifier", "getUserIdentifier$annotations", "getUserIdentifier", "setUserIdentifier", "(Ljava/lang/String;)V", "userOptOut", "getUserOptOut$annotations", "getUserOptOut", "setUserOptOut", "version", "getVersion$annotations", "getVersion", "", "listener", "Lcom/unity3d/ads/IUnityAdsTokenListener;", "configuration", "Lcom/unity3d/ads/TokenConfiguration;", MobileAdsBridgeBase.initializeMethodName, "context", "Landroid/content/Context;", AndroidGetAdPlayerContext.KEY_GAME_ID, "initializationListener", "Lcom/unity3d/ads/IUnityAdsInitializationListener;", "testMode", "Lcom/unity3d/ads/InitializationConfiguration;", "Lcom/unity3d/ads/InitializationListener;", "load", "placementId", "Lcom/unity3d/ads/IUnityAdsLoadListener;", HandleInvocationsFromAdViewer.KEY_LOAD_OPTIONS, "Lcom/unity3d/ads/UnityAdsLoadOptions;", "show", "activity", "Landroid/app/Activity;", "showListener", "Lcom/unity3d/ads/IUnityAdsShowListener;", SDKConstants.PARAM_GAME_REQUESTS_OPTIONS, "Lcom/unity3d/ads/UnityAdsShowOptions;", "UnityAdsInitializationError", "UnityAdsLoadError", "UnityAdsShowCompletionState", "UnityAdsShowError", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class UnityAds {
    public static final UnityAds INSTANCE = new UnityAds();
    private static Boolean nonBehavioral;
    private static Boolean userConsent;
    private static String userIdentifier;
    private static Boolean userOptOut;

    /* JADX INFO: compiled from: UnityAds.kt */
    @Metadata(m43474d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m43475d2 = {"Lcom/unity3d/ads/UnityAds$UnityAdsInitializationError;", "", "(Ljava/lang/String;I)V", "INTERNAL_ERROR", "INVALID_ARGUMENT", "AD_BLOCKER_DETECTED", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
    public enum UnityAdsInitializationError {
        INTERNAL_ERROR,
        INVALID_ARGUMENT,
        AD_BLOCKER_DETECTED
    }

    /* JADX INFO: compiled from: UnityAds.kt */
    @Metadata(m43474d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, m43475d2 = {"Lcom/unity3d/ads/UnityAds$UnityAdsLoadError;", "", "(Ljava/lang/String;I)V", "INITIALIZE_FAILED", "INTERNAL_ERROR", "INVALID_ARGUMENT", "NO_FILL", "TIMEOUT", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
    public enum UnityAdsLoadError {
        INITIALIZE_FAILED,
        INTERNAL_ERROR,
        INVALID_ARGUMENT,
        NO_FILL,
        TIMEOUT
    }

    /* JADX INFO: compiled from: UnityAds.kt */
    @Metadata(m43474d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m43475d2 = {"Lcom/unity3d/ads/UnityAds$UnityAdsShowCompletionState;", "", "(Ljava/lang/String;I)V", "SKIPPED", "COMPLETED", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
    public enum UnityAdsShowCompletionState {
        SKIPPED,
        COMPLETED
    }

    /* JADX INFO: compiled from: UnityAds.kt */
    @Metadata(m43474d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, m43475d2 = {"Lcom/unity3d/ads/UnityAds$UnityAdsShowError;", "", "(Ljava/lang/String;I)V", "NOT_INITIALIZED", "NOT_READY", "VIDEO_PLAYER_ERROR", "INVALID_ARGUMENT", "NO_CONNECTION", "ALREADY_SHOWING", "INTERNAL_ERROR", "TIMEOUT", "EXPIRED", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
    public enum UnityAdsShowError {
        NOT_INITIALIZED,
        NOT_READY,
        VIDEO_PLAYER_ERROR,
        INVALID_ARGUMENT,
        NO_CONNECTION,
        ALREADY_SHOWING,
        INTERNAL_ERROR,
        TIMEOUT,
        EXPIRED
    }

    /* JADX INFO: renamed from: com.unity3d.ads.UnityAds$initialize$7 */
    /* JADX INFO: compiled from: UnityAds.kt */
    @Metadata(m43474d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m43475d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
    @DebugMetadata(m43503c = "com.unity3d.ads.UnityAds$initialize$7", m43504f = "UnityAds.kt", m43505i = {}, m43506l = {}, m43507m = "invokeSuspend", m43508n = {}, m43509s = {})
    static final class C143327 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ InitializationConfiguration $configuration;
        final /* synthetic */ InitializationListener $listener;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C143327(InitializationConfiguration initializationConfiguration, InitializationListener initializationListener, Continuation<? super C143327> continuation) {
            super(2, continuation);
            this.$configuration = initializationConfiguration;
            this.$listener = initializationListener;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C143327(this.$configuration, this.$listener, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C143327) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (this.$configuration.getMediationInfo() != null) {
                MediationMetaData mediationMetaData = new MediationMetaData(ClientProperties.getApplicationContext());
                InitializationConfiguration initializationConfiguration = this.$configuration;
                mediationMetaData.setName(initializationConfiguration.getMediationInfo().getName());
                mediationMetaData.setVersion(initializationConfiguration.getMediationInfo().getVersion());
                mediationMetaData.set("adapter_version", initializationConfiguration.getMediationInfo().getAdapterVersion());
                mediationMetaData.commit();
            }
            UnityServices.initialize(ClientProperties.getApplicationContext(), this.$configuration.getGameId(), this.$configuration.getIsTestModeEnabled(), this.$configuration, this.$listener);
            return Unit.INSTANCE;
        }
    }

    private UnityAds() {
    }

    public static final boolean getDebugMode() {
        return UnityAdsImplementation.getInstance().getDebugMode();
    }

    @JvmStatic
    public static /* synthetic */ void getDebugMode$annotations() {
    }

    public static final Boolean getNonBehavioral() {
        return nonBehavioral;
    }

    @JvmStatic
    public static /* synthetic */ void getNonBehavioral$annotations() {
    }

    public static final String getToken() {
        return UnityAdsImplementation.getInstance().getToken();
    }

    @JvmStatic
    public static final void getToken(final IUnityAdsTokenListener listener) {
        Object objM44946constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            UnityAdsImplementation.getInstance().getToken(listener);
            objM44946constructorimpl = Result.m44946constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m44949exceptionOrNullimpl(objM44946constructorimpl) == null || listener == null) {
            return;
        }
        Utilities.wrapCustomerListener(new Runnable() { // from class: com.unity3d.ads.UnityAds$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                UnityAds.getToken$lambda$26$lambda$25$lambda$24(listener);
            }
        });
    }

    @JvmStatic
    public static final void getToken(TokenConfiguration configuration, final IUnityAdsTokenListener listener) {
        Object objM44946constructorimpl;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(listener, "listener");
        try {
            Result.Companion companion = Result.INSTANCE;
            UnityAdsImplementation.getInstance().getToken(configuration, listener);
            objM44946constructorimpl = Result.m44946constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m44949exceptionOrNullimpl(objM44946constructorimpl) != null) {
            Utilities.wrapCustomerListener(new Runnable() { // from class: com.unity3d.ads.UnityAds$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAds.getToken$lambda$29$lambda$28(listener);
                }
            });
        }
    }

    @JvmStatic
    public static /* synthetic */ void getToken$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getToken$lambda$26$lambda$25$lambda$24(IUnityAdsTokenListener tokenListener) {
        Intrinsics.checkNotNullParameter(tokenListener, "$tokenListener");
        tokenListener.onUnityAdsTokenReady(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getToken$lambda$29$lambda$28(IUnityAdsTokenListener listener) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        listener.onUnityAdsTokenReady(null);
    }

    public static final Boolean getUserConsent() {
        return userConsent;
    }

    @JvmStatic
    public static /* synthetic */ void getUserConsent$annotations() {
    }

    public static final String getUserIdentifier() {
        return userIdentifier;
    }

    @JvmStatic
    public static /* synthetic */ void getUserIdentifier$annotations() {
    }

    public static final Boolean getUserOptOut() {
        return userOptOut;
    }

    @JvmStatic
    public static /* synthetic */ void getUserOptOut$annotations() {
    }

    public static final String getVersion() {
        String version = UnityAdsImplementation.getInstance().getVersion();
        Intrinsics.checkNotNullExpressionValue(version, "getInstance().version");
        return version;
    }

    @JvmStatic
    public static /* synthetic */ void getVersion$annotations() {
    }

    @JvmStatic
    public static final void initialize(Context context, String gameId) {
        try {
            Result.Companion companion = Result.INSTANCE;
            UnityAdsImplementation.getInstance().initialize(context, gameId, false, null);
            Result.m44946constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m44946constructorimpl(ResultKt.createFailure(th));
        }
    }

    @JvmStatic
    public static final void initialize(Context context, String gameId, final IUnityAdsInitializationListener initializationListener) {
        Object objM44946constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            UnityAdsImplementation.getInstance().initialize(context, gameId, false, initializationListener);
            objM44946constructorimpl = Result.m44946constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(th));
        }
        final Throwable thM44949exceptionOrNullimpl = Result.m44949exceptionOrNullimpl(objM44946constructorimpl);
        if (thM44949exceptionOrNullimpl == null || initializationListener == null) {
            return;
        }
        Utilities.wrapCustomerListener(new Runnable() { // from class: com.unity3d.ads.UnityAds$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                UnityAds.initialize$lambda$4$lambda$3$lambda$2(initializationListener, thM44949exceptionOrNullimpl);
            }
        });
    }

    @JvmStatic
    public static final void initialize(Context context, String gameId, boolean testMode) {
        try {
            Result.Companion companion = Result.INSTANCE;
            UnityAdsImplementation.getInstance().initialize(context, gameId, testMode, null);
            Result.m44946constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m44946constructorimpl(ResultKt.createFailure(th));
        }
    }

    @JvmStatic
    public static final void initialize(Context context, String gameId, boolean testMode, final IUnityAdsInitializationListener initializationListener) {
        Object objM44946constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            UnityAdsImplementation.getInstance().initialize(context, gameId, testMode, initializationListener);
            objM44946constructorimpl = Result.m44946constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(th));
        }
        final Throwable thM44949exceptionOrNullimpl = Result.m44949exceptionOrNullimpl(objM44946constructorimpl);
        if (thM44949exceptionOrNullimpl == null || initializationListener == null) {
            return;
        }
        Utilities.wrapCustomerListener(new Runnable() { // from class: com.unity3d.ads.UnityAds$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                UnityAds.initialize$lambda$9$lambda$8$lambda$7(initializationListener, thM44949exceptionOrNullimpl);
            }
        });
    }

    @JvmStatic
    public static final void initialize(InitializationConfiguration configuration, InitializationListener listener) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Intrinsics.checkNotNullParameter(listener, "listener");
        BuildersKt__Builders_commonKt.launch$default((CoroutineScope) ServiceProvider.INSTANCE.getRegistry().resolveService(new ServiceKey(ServiceProvider.NAMED_INIT_SCOPE, Reflection.getOrCreateKotlinClass(CoroutineScope.class))), null, null, new C143327(configuration, listener, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initialize$lambda$4$lambda$3$lambda$2(IUnityAdsInitializationListener listener, Throwable exception) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(exception, "$exception");
        listener.onInitializationFailed(UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK initialization failed due to unexpected error: " + exception.getMessage());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initialize$lambda$9$lambda$8$lambda$7(IUnityAdsInitializationListener listener, Throwable exception) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(exception, "$exception");
        listener.onInitializationFailed(UnityAdsInitializationError.INTERNAL_ERROR, "Unity Ads SDK initialization failed due to unexpected error: " + exception.getMessage());
    }

    public static final boolean isInitialized() {
        return UnityAdsImplementation.getInstance().isInitialized();
    }

    @JvmStatic
    public static /* synthetic */ void isInitialized$annotations() {
    }

    public static final boolean isSupported() {
        return UnityAdsImplementation.getInstance().isSupported();
    }

    @JvmStatic
    public static /* synthetic */ void isSupported$annotations() {
    }

    @Deprecated(message = "")
    @JvmStatic
    public static final void load(String placementId) {
        try {
            Result.Companion companion = Result.INSTANCE;
            load(placementId, new IUnityAdsLoadListener() { // from class: com.unity3d.ads.UnityAds$load$1$1
                @Override // com.unity3d.ads.IUnityAdsLoadListener
                public void onUnityAdsAdLoaded(String placementId2) {
                    Intrinsics.checkNotNullParameter(placementId2, "placementId");
                }

                @Override // com.unity3d.ads.IUnityAdsLoadListener
                public void onUnityAdsFailedToLoad(String placementId2, UnityAds.UnityAdsLoadError error, String message) {
                    Intrinsics.checkNotNullParameter(placementId2, "placementId");
                    Intrinsics.checkNotNullParameter(error, "error");
                    Intrinsics.checkNotNullParameter(message, "message");
                }
            });
            Result.m44946constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m44946constructorimpl(ResultKt.createFailure(th));
        }
    }

    @JvmStatic
    public static final void load(String placementId, IUnityAdsLoadListener listener) {
        load(placementId, new UnityAdsLoadOptions(), listener);
    }

    @JvmStatic
    public static final void load(final String placementId, UnityAdsLoadOptions loadOptions, final IUnityAdsLoadListener listener) {
        Object objM44946constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            IUnityAds unityAdsImplementation = UnityAdsImplementation.getInstance();
            if (loadOptions == null) {
                loadOptions = new UnityAdsLoadOptions();
            }
            unityAdsImplementation.load(placementId, loadOptions, listener);
            objM44946constructorimpl = Result.m44946constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(th));
        }
        final Throwable thM44949exceptionOrNullimpl = Result.m44949exceptionOrNullimpl(objM44946constructorimpl);
        if (thM44949exceptionOrNullimpl == null || listener == null) {
            return;
        }
        Utilities.wrapCustomerListener(new Runnable() { // from class: com.unity3d.ads.UnityAds$$ExternalSyntheticLambda5
            @Override // java.lang.Runnable
            public final void run() {
                UnityAds.load$lambda$22$lambda$21$lambda$20(listener, placementId, thM44949exceptionOrNullimpl);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void load$lambda$22$lambda$21$lambda$20(IUnityAdsLoadListener loadListener, String str, Throwable exception) {
        Intrinsics.checkNotNullParameter(loadListener, "$loadListener");
        Intrinsics.checkNotNullParameter(exception, "$exception");
        if (str == null) {
            str = "unknown";
        }
        loadListener.onUnityAdsFailedToLoad(str, UnityAdsLoadError.INTERNAL_ERROR, "Unity Ads SDK load failed due to unexpected error: " + exception.getMessage());
    }

    public static final void setDebugMode(boolean z) {
        try {
            Result.Companion companion = Result.INSTANCE;
            UnityAdsImplementation.getInstance().setDebugMode(z);
            Result.m44946constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m44946constructorimpl(ResultKt.createFailure(th));
        }
    }

    public static final void setNonBehavioral(Boolean bool) {
        nonBehavioral = bool;
    }

    public static final void setUserConsent(Boolean bool) {
        userConsent = bool;
    }

    public static final void setUserIdentifier(String str) {
        userIdentifier = str;
    }

    public static final void setUserOptOut(Boolean bool) {
        userOptOut = bool;
    }

    @Deprecated(message = "")
    @JvmStatic
    public static final void show(Activity activity, String placementId) {
        try {
            Result.Companion companion = Result.INSTANCE;
            UnityAdsImplementation.getInstance().show(activity, placementId, new UnityAdsShowOptions(), null);
            Result.m44946constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m44946constructorimpl(ResultKt.createFailure(th));
        }
    }

    @JvmStatic
    public static final void show(Activity activity, String placementId, IUnityAdsShowListener showListener) {
        try {
            Result.Companion companion = Result.INSTANCE;
            UnityAdsImplementation.getInstance().show(activity, placementId, new UnityAdsShowOptions(), showListener);
            Result.m44946constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m44946constructorimpl(ResultKt.createFailure(th));
        }
    }

    @Deprecated(message = "")
    @JvmStatic
    public static final void show(Activity activity, String placementId, UnityAdsShowOptions options) {
        try {
            Result.Companion companion = Result.INSTANCE;
            UnityAdsImplementation.getInstance().show(activity, placementId, options, null);
            Result.m44946constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m44946constructorimpl(ResultKt.createFailure(th));
        }
    }

    @JvmStatic
    public static final void show(Activity activity, final String placementId, UnityAdsShowOptions options, final IUnityAdsShowListener showListener) {
        Object objM44946constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            UnityAdsImplementation.getInstance().show(activity, placementId, options, showListener);
            objM44946constructorimpl = Result.m44946constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            objM44946constructorimpl = Result.m44946constructorimpl(ResultKt.createFailure(th));
        }
        final Throwable thM44949exceptionOrNullimpl = Result.m44949exceptionOrNullimpl(objM44946constructorimpl);
        if (thM44949exceptionOrNullimpl == null || showListener == null) {
            return;
        }
        Utilities.wrapCustomerListener(new Runnable() { // from class: com.unity3d.ads.UnityAds$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                UnityAds.show$lambda$16$lambda$15$lambda$14(showListener, placementId, thM44949exceptionOrNullimpl);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda$16$lambda$15$lambda$14(IUnityAdsShowListener listener, String str, Throwable exception) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(exception, "$exception");
        if (str == null) {
            str = "unknown";
        }
        listener.onUnityAdsShowFailure(str, UnityAdsShowError.INTERNAL_ERROR, "Unity Ads SDK show failed due to unexpected error: " + exception.getMessage());
    }
}
