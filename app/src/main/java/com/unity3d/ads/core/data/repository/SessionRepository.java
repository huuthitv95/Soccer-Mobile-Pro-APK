package com.unity3d.ads.core.data.repository;

import com.google.protobuf.ByteString;
import com.unity3d.ads.core.data.model.InitializationConfigurationInternal;
import com.unity3d.ads.core.data.model.InitializationState;
import com.unity3d.ads.core.data.model.SessionChange;
import com.unity3d.ads.core.data.model.TokenCounters;
import com.unity3d.ads.core.data.model.exception.InitializationException;
import com.unity3d.ads.core.domain.AndroidGetAdPlayerContext;
import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import gatewayprotocol.p299v1.AdFormatOuterClass;
import gatewayprotocol.p299v1.InitializationResponseOuterClass;
import gatewayprotocol.p299v1.NativeConfigurationOuterClass;
import gatewayprotocol.p299v1.SessionCountersOuterClass;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SharedFlow;

/* JADX INFO: compiled from: SessionRepository.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0017\b`\u0018\u00002\u00020\u0001J\u0010\u0010g\u001a\u00020h2\u0006\u0010i\u001a\u00020\u0016H&J\u0011\u0010j\u001a\u00020\rH¦@ø\u0001\u0000¢\u0006\u0002\u0010kJ\u0011\u0010l\u001a\u00020\rH¦@ø\u0001\u0000¢\u0006\u0002\u0010kJ\u0011\u0010m\u001a\u00020\rH¦@ø\u0001\u0000¢\u0006\u0002\u0010kJ\b\u0010n\u001a\u00020hH&J\b\u0010o\u001a\u00020hH&J\b\u0010p\u001a\u00020hH&J\b\u0010q\u001a\u00020hH&J\b\u0010r\u001a\u00020hH&J\b\u0010s\u001a\u00020hH&J\b\u0010t\u001a\u00020hH&J\b\u0010u\u001a\u00020hH&J\b\u0010v\u001a\u00020hH&J\b\u0010w\u001a\u00020hH&J\u0011\u0010x\u001a\u00020hH¦@ø\u0001\u0000¢\u0006\u0002\u0010kJ\b\u0010y\u001a\u00020hH&J\u0019\u0010z\u001a\u00020h2\u0006\u0010{\u001a\u00020\rH¦@ø\u0001\u0000¢\u0006\u0002\u0010|J\u0019\u0010}\u001a\u00020h2\u0006\u0010{\u001a\u00020\rH¦@ø\u0001\u0000¢\u0006\u0002\u0010|J\u0019\u0010~\u001a\u00020h2\u0006\u0010{\u001a\u00020\rH¦@ø\u0001\u0000¢\u0006\u0002\u0010|R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u0007X¦\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\u00020\rX¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\u00020\u0007X¦\u000e¢\u0006\f\u001a\u0004\b\u0013\u0010\t\"\u0004\b\u0014\u0010\u000bR\u0012\u0010\u0015\u001a\u00020\u0016X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R \u0010\u0019\u001a\u0004\u0018\u00010\u001aX¦\u000e¢\u0006\u0012\u0012\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u0004\u0018\u00010\"X¦\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0018\u0010'\u001a\u00020(X¦\u000e¢\u0006\f\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\u0012\u0010-\u001a\u00020.X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010/R\u0012\u00100\u001a\u00020.X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u0010/R\u0012\u00101\u001a\u00020.X¦\u0004¢\u0006\u0006\u001a\u0004\b1\u0010/R\u0012\u00102\u001a\u00020.X¦\u0004¢\u0006\u0006\u001a\u0004\b2\u0010/R\u0012\u00103\u001a\u00020.X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u0010/R\u0018\u00104\u001a\u000205X¦\u000e¢\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u0018\u0010:\u001a\b\u0012\u0004\u0012\u00020(0;X¦\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0018\u0010>\u001a\b\u0012\u0004\u0012\u00020@0?X¦\u0004¢\u0006\u0006\u001a\u0004\bA\u0010BR\u001e\u0010C\u001a\b\u0012\u0004\u0012\u00020E0DX¦\u000e¢\u0006\f\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\u0018\u0010J\u001a\b\u0012\u0004\u0012\u00020L0KX¦\u0004¢\u0006\u0006\u001a\u0004\bM\u0010GR\u0018\u0010N\u001a\u00020OX¦\u000e¢\u0006\f\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u0012\u0010T\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\bU\u0010\u000fR\u0018\u0010V\u001a\u00020\rX¦\u000e¢\u0006\f\u001a\u0004\bW\u0010\u000f\"\u0004\bX\u0010\u0011R\u0018\u0010Y\u001a\u00020.X¦\u000e¢\u0006\f\u001a\u0004\bZ\u0010/\"\u0004\b[\u0010\\R\u0018\u0010]\u001a\u00020^X¦\u000e¢\u0006\f\u001a\u0004\b_\u0010`\"\u0004\ba\u0010bR\u0014\u0010c\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\bd\u0010\tR\u0014\u0010e\u001a\u0004\u0018\u00010\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\bf\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u007f"}, m43475d2 = {"Lcom/unity3d/ads/core/data/repository/SessionRepository;", "", "featureFlags", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$FeatureFlags;", "getFeatureFlags", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$FeatureFlags;", AndroidGetAdPlayerContext.KEY_GAME_ID, "", "getGameId", "()Ljava/lang/String;", "setGameId", "(Ljava/lang/String;)V", "gatewayState", "Lcom/google/protobuf/ByteString;", "getGatewayState", "()Lcom/google/protobuf/ByteString;", "setGatewayState", "(Lcom/google/protobuf/ByteString;)V", "gatewayUrl", "getGatewayUrl", "setGatewayUrl", "headerBiddingTokenCounter", "", "getHeaderBiddingTokenCounter", "()I", "initializationConfiguration", "Lcom/unity3d/ads/core/data/model/InitializationConfigurationInternal;", "getInitializationConfiguration$annotations", "()V", "getInitializationConfiguration", "()Lcom/unity3d/ads/core/data/model/InitializationConfigurationInternal;", "setInitializationConfiguration", "(Lcom/unity3d/ads/core/data/model/InitializationConfigurationInternal;)V", "initializationError", "Lcom/unity3d/ads/core/data/model/exception/InitializationException;", "getInitializationError", "()Lcom/unity3d/ads/core/data/model/exception/InitializationException;", "setInitializationError", "(Lcom/unity3d/ads/core/data/model/exception/InitializationException;)V", "initializationState", "Lcom/unity3d/ads/core/data/model/InitializationState;", "getInitializationState", "()Lcom/unity3d/ads/core/data/model/InitializationState;", "setInitializationState", "(Lcom/unity3d/ads/core/data/model/InitializationState;)V", "isDiagnosticsEnabled", "", "()Z", "isFirstInitAttempt", "isOmEnabled", "isSdkInitialized", "isTestModeEnabled", "nativeConfiguration", "Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "getNativeConfiguration", "()Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;", "setNativeConfiguration", "(Lgatewayprotocol/v1/NativeConfigurationOuterClass$NativeConfiguration;)V", "observeInitializationState", "Lkotlinx/coroutines/flow/Flow;", "getObserveInitializationState", "()Lkotlinx/coroutines/flow/Flow;", "onChange", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/unity3d/ads/core/data/model/SessionChange;", "getOnChange", "()Lkotlinx/coroutines/flow/SharedFlow;", "requestUrlOverrides", "", "Lgatewayprotocol/v1/InitializationResponseOuterClass$RequestUrlOverride;", "getRequestUrlOverrides", "()Ljava/util/List;", "setRequestUrlOverrides", "(Ljava/util/List;)V", "scarEligibleFormats", "", "Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "getScarEligibleFormats", "sessionCounters", "Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "getSessionCounters", "()Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;", "setSessionCounters", "(Lgatewayprotocol/v1/SessionCountersOuterClass$SessionCounters;)V", JsonStorageKeyNames.SESSION_ID_KEY, "getSessionId", "sessionToken", "getSessionToken", "setSessionToken", "shouldInitialize", "getShouldInitialize", "setShouldInitialize", "(Z)V", "tokenCounters", "Lcom/unity3d/ads/core/data/model/TokenCounters;", "getTokenCounters", "()Lcom/unity3d/ads/core/data/model/TokenCounters;", "setTokenCounters", "(Lcom/unity3d/ads/core/data/model/TokenCounters;)V", "unityInstallationId", "getUnityInstallationId", "unityMegaSessionId", "getUnityMegaSessionId", "addTimeToGlobalAdsFocusTime", "", "timeMs", "getGatewayCache", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getPrivacy", "getPrivacyFsm", "incrementBannerImpressionCount", "incrementBannerLoadRequestAdmCount", "incrementBannerLoadRequestCount", "incrementFocusChangeCount", "incrementGlobalAdsFocusChangeCount", "incrementLoadRequestAdmCount", "incrementLoadRequestCount", "incrementTokenSequenceNumber", "incrementTokenStartsCount", "incrementTokenWinsCount", "persistNativeConfiguration", "resetTokenCounters", "setGatewayCache", "value", "(Lcom/google/protobuf/ByteString;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setPrivacy", "setPrivacyFsm", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public interface SessionRepository {

    /* JADX INFO: compiled from: SessionRepository.kt */
    @Metadata(m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void getInitializationConfiguration$annotations() {
        }
    }

    void addTimeToGlobalAdsFocusTime(int timeMs);

    NativeConfigurationOuterClass.FeatureFlags getFeatureFlags();

    String getGameId();

    Object getGatewayCache(Continuation<? super ByteString> continuation);

    ByteString getGatewayState();

    String getGatewayUrl();

    int getHeaderBiddingTokenCounter();

    InitializationConfigurationInternal getInitializationConfiguration();

    InitializationException getInitializationError();

    InitializationState getInitializationState();

    NativeConfigurationOuterClass.NativeConfiguration getNativeConfiguration();

    Flow<InitializationState> getObserveInitializationState();

    SharedFlow<SessionChange> getOnChange();

    Object getPrivacy(Continuation<? super ByteString> continuation);

    Object getPrivacyFsm(Continuation<? super ByteString> continuation);

    List<InitializationResponseOuterClass.RequestUrlOverride> getRequestUrlOverrides();

    List<AdFormatOuterClass.AdFormat> getScarEligibleFormats();

    SessionCountersOuterClass.SessionCounters getSessionCounters();

    ByteString getSessionId();

    ByteString getSessionToken();

    boolean getShouldInitialize();

    TokenCounters getTokenCounters();

    String getUnityInstallationId();

    String getUnityMegaSessionId();

    void incrementBannerImpressionCount();

    void incrementBannerLoadRequestAdmCount();

    void incrementBannerLoadRequestCount();

    void incrementFocusChangeCount();

    void incrementGlobalAdsFocusChangeCount();

    void incrementLoadRequestAdmCount();

    void incrementLoadRequestCount();

    void incrementTokenSequenceNumber();

    void incrementTokenStartsCount();

    void incrementTokenWinsCount();

    boolean isDiagnosticsEnabled();

    boolean isFirstInitAttempt();

    boolean isOmEnabled();

    boolean isSdkInitialized();

    boolean isTestModeEnabled();

    Object persistNativeConfiguration(Continuation<? super Unit> continuation);

    void resetTokenCounters();

    void setGameId(String str);

    Object setGatewayCache(ByteString byteString, Continuation<? super Unit> continuation);

    void setGatewayState(ByteString byteString);

    void setGatewayUrl(String str);

    void setInitializationConfiguration(InitializationConfigurationInternal initializationConfigurationInternal);

    void setInitializationError(InitializationException initializationException);

    void setInitializationState(InitializationState initializationState);

    void setNativeConfiguration(NativeConfigurationOuterClass.NativeConfiguration nativeConfiguration);

    Object setPrivacy(ByteString byteString, Continuation<? super Unit> continuation);

    Object setPrivacyFsm(ByteString byteString, Continuation<? super Unit> continuation);

    void setRequestUrlOverrides(List<InitializationResponseOuterClass.RequestUrlOverride> list);

    void setSessionCounters(SessionCountersOuterClass.SessionCounters sessionCounters);

    void setSessionToken(ByteString byteString);

    void setShouldInitialize(boolean z);

    void setTokenCounters(TokenCounters tokenCounters);
}
