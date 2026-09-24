package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.services.core.properties.SdkProperties;
import gatewayprotocol.p299v1.DynamicDeviceInfoOuterClass;
import gatewayprotocol.p299v1.StaticDeviceInfoOuterClass;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: AndroidGetAdPlayerContext.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\bH\u0086Bø\u0001\u0000¢\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, m43475d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetAdPlayerContext;", "", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "(Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/repository/SessionRepository;)V", "invoke", "", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public final class AndroidGetAdPlayerContext {
    public static final String KEY_GAME_ID = "gameId";
    private final DeviceInfoRepository deviceInfoRepository;
    private final SessionRepository sessionRepository;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidGetAdPlayerContext$invoke$1 */
    /* JADX INFO: compiled from: AndroidGetAdPlayerContext.kt */
    @Metadata(m43476k = 3, m43477mv = {1, 8, 0}, m43479xi = 48)
    @DebugMetadata(m43503c = "com.unity3d.ads.core.domain.AndroidGetAdPlayerContext", m43504f = "AndroidGetAdPlayerContext.kt", m43505i = {0}, m43506l = {15}, m43507m = "invoke", m43508n = {"this"}, m43509s = {"L$0"})
    static final class C144841 extends ContinuationImpl {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C144841(Continuation<? super C144841> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidGetAdPlayerContext.this.invoke(this);
        }
    }

    public AndroidGetAdPlayerContext(DeviceInfoRepository deviceInfoRepository, SessionRepository sessionRepository) {
        Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    public final Object invoke(Continuation<? super Map<String, ? extends Object>> continuation) throws Throwable {
        C144841 c144841;
        AndroidGetAdPlayerContext androidGetAdPlayerContext;
        if (continuation instanceof C144841) {
            c144841 = (C144841) continuation;
            if ((c144841.label & Integer.MIN_VALUE) != 0) {
                c144841.label -= Integer.MIN_VALUE;
            } else {
                c144841 = new C144841(continuation);
            }
        } else {
            c144841 = new C144841(continuation);
        }
        Object objStaticDeviceInfo = c144841.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = c144841.label;
        if (i == 0) {
            ResultKt.throwOnFailure(objStaticDeviceInfo);
            DeviceInfoRepository deviceInfoRepository = this.deviceInfoRepository;
            c144841.L$0 = this;
            c144841.label = 1;
            objStaticDeviceInfo = deviceInfoRepository.staticDeviceInfo(c144841);
            if (objStaticDeviceInfo == coroutine_suspended) {
                return coroutine_suspended;
            }
            androidGetAdPlayerContext = this;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            androidGetAdPlayerContext = (AndroidGetAdPlayerContext) c144841.L$0;
            ResultKt.throwOnFailure(objStaticDeviceInfo);
        }
        StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo = (StaticDeviceInfoOuterClass.StaticDeviceInfo) objStaticDeviceInfo;
        DynamicDeviceInfoOuterClass.DynamicDeviceInfo dynamicDeviceInfo = androidGetAdPlayerContext.deviceInfoRepository.getDynamicDeviceInfo();
        String gameId = androidGetAdPlayerContext.sessionRepository.getGameId();
        if (gameId == null) {
            gameId = "";
        }
        return MapsKt.mapOf(TuplesKt.m43482to("bundleId", staticDeviceInfo.getBundleId()), TuplesKt.m43482to("bundleVersion", staticDeviceInfo.getBundleVersion()), TuplesKt.m43482to("webviewHash", "unknown"), TuplesKt.m43482to("sdkVersion", Boxing.boxInt(SdkProperties.getVersionCode())), TuplesKt.m43482to("sdkVersionName", SdkProperties.getVersionName()), TuplesKt.m43482to("osVersion", staticDeviceInfo.getOsVersion()), TuplesKt.m43482to("systemLanguage", Locale.getDefault().toString()), TuplesKt.m43482to("deviceModel", staticDeviceInfo.getDeviceModel()), TuplesKt.m43482to("limitAdTracking", Boxing.boxBoolean(dynamicDeviceInfo.getLimitedTracking())), TuplesKt.m43482to("maxVolume", Boxing.boxDouble(dynamicDeviceInfo.getAndroid().getMaxVolume())), TuplesKt.m43482to(KEY_GAME_ID, gameId));
    }
}
