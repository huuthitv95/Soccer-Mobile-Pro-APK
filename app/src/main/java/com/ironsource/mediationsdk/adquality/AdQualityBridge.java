package com.ironsource.mediationsdk.adquality;

import android.content.Context;
import android.text.TextUtils;
import android.util.Pair;
import com.ironsource.C11455Gb;
import com.ironsource.C11486I6;
import com.ironsource.C11767Y9;
import com.ironsource.C12256j0;
import com.ironsource.C12317m4;
import com.ironsource.C12580w5;
import com.ironsource.EnumC12598x5;
import com.ironsource.RunnableC11504J6;
import com.ironsource.adqualitysdk.sdk.ISAdQualityConfig;
import com.ironsource.adqualitysdk.sdk.ISAdQualityDeviceIdType;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener;
import com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel;
import com.ironsource.adqualitysdk.sdk.ISAdQualitySegment;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class AdQualityBridge {
    public static final Companion Companion = new Companion(null);
    private static Boolean isGetVersionMethodExist;

    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final boolean isGetVersionMethodExist() throws JSONException {
            try {
                if (AdQualityBridge.isGetVersionMethodExist != null) {
                    return Intrinsics.areEqual(AdQualityBridge.isGetVersionMethodExist, Boolean.TRUE);
                }
                boolean z = Class.forName("com.ironsource.adqualitysdk.sdk.IronSourceAdQuality").getDeclaredMethods().length >= 10;
                AdQualityBridge.isGetVersionMethodExist = Boolean.valueOf(z);
                return z;
            } catch (Throwable th) {
                C12317m4.m32153d().m32155a(th);
                logEvent$default(this, EnumC12598x5.TROUBLESHOOTING_AD_QUALITY_SDK_NOT_EXIST, null, null, 6, null);
                return false;
            }
        }

        @JvmStatic
        private static /* synthetic */ void isGetVersionMethodExist$annotations() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final void logEvent(EnumC12598x5 enumC12598x5, Integer num, String str) throws JSONException {
            JSONObject jSONObjectM32751b = IronSourceUtils.m32751b(false);
            if (num != null) {
                jSONObjectM32751b.put("errorCode", num.intValue());
            }
            if (str != null) {
                jSONObjectM32751b.put("reason", str);
            }
            jSONObjectM32751b.put(IronSourceConstants.EVENTS_EXT1, C12330a.f30989a.m32257a().m32255b());
            C11455Gb.f24351s.m25905d().mo25850q().mo25281a(new C12580w5(enumC12598x5, jSONObjectM32751b));
        }

        static /* synthetic */ void logEvent$default(Companion companion, EnumC12598x5 enumC12598x5, Integer num, String str, int i, Object obj) throws JSONException {
            if ((i & 2) != 0) {
                num = null;
            }
            if ((i & 4) != 0) {
                str = null;
            }
            companion.logEvent(enumC12598x5, num, str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @JvmStatic
        public final int versionCompare(String str, String str2) {
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                return -1;
            }
            int i = 0;
            String[] strArr = (String[]) StringsKt.split$default((CharSequence) new Regex("[^0-9.]").replace(str, ""), new String[]{"."}, false, 0, 6, (Object) null).toArray(new String[0]);
            String[] strArr2 = (String[]) StringsKt.split$default((CharSequence) new Regex("[^0-9.]").replace(str2, ""), new String[]{"."}, false, 0, 6, (Object) null).toArray(new String[0]);
            while (i < strArr.length && i < strArr2.length && Intrinsics.areEqual(strArr[i], strArr2[i])) {
                i++;
            }
            if (i >= strArr.length || i >= strArr2.length) {
                return Integer.signum(strArr.length - strArr2.length);
            }
            int iIntValue = Integer.valueOf(strArr[i]).intValue();
            Integer numValueOf = Integer.valueOf(strArr2[i]);
            Intrinsics.checkNotNullExpressionValue(numValueOf, "valueOf(vals2[i])");
            return Integer.signum(Intrinsics.compare(iIntValue, numValueOf.intValue()));
        }

        @JvmStatic
        public final boolean adQualityAvailable() {
            return versionCompare(getAdQualitySdkVersion(), "7.9.0") >= 0;
        }

        @JvmStatic
        public final String getAdQualitySdkVersion() {
            if (!isGetVersionMethodExist()) {
                return new String();
            }
            String sDKVersion = IronSourceAdQuality.getSDKVersion();
            Intrinsics.checkNotNullExpressionValue(sDKVersion, "getSDKVersion()");
            return sDKVersion;
        }

        private Companion() {
        }
    }

    public AdQualityBridge(Context context, String appKey, String str, C12256j0 adQualityDataProvider, int i) throws JSONException {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(adQualityDataProvider, "adQualityDataProvider");
        ISAdQualityConfig.Builder deviceIdType = new ISAdQualityConfig.Builder().setInitializationSource("LevelPlay").setLogLevel(convertToAdQualityLogLevel(i)).setAdQualityInitListener(new ISAdQualityInitListener() { // from class: com.ironsource.mediationsdk.adquality.AdQualityBridge$configBuilder$1
            @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener
            public void adQualitySdkInitFailed(ISAdQualityInitError isAdQualityInitError, String message) throws JSONException {
                Intrinsics.checkNotNullParameter(isAdQualityInitError, "isAdQualityInitError");
                Intrinsics.checkNotNullParameter(message, "message");
                EnumC12598x5 enumC12598x5 = EnumC12598x5.TROUBLESHOOTING_AD_QUALITY_SDK_FAILED_TO_INITIALIZE_EVENT;
                if (isAdQualityInitError == ISAdQualityInitError.AD_QUALITY_ALREADY_INITIALIZED) {
                    enumC12598x5 = EnumC12598x5.TROUBLESHOOTING_AD_QUALITY_SDK_WAS_ALREADY_INITIALIZED_EVENT;
                }
                AdQualityBridge.Companion.logEvent(enumC12598x5, Integer.valueOf(isAdQualityInitError.getValue()), message);
                IronSourceLoggerManager.getLogger().log(IronSourceLogger.IronSourceTag.API, "Ad Quality failed to initialize: " + message, 3);
            }

            @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener
            public void adQualitySdkInitSuccess() throws JSONException {
                AdQualityBridge.Companion.logEvent$default(AdQualityBridge.Companion, EnumC12598x5.TROUBLESHOOTING_AD_QUALITY_SDK_INITIALIZED_SUCCESSFULLY_EVENT, null, null, 6, null);
            }
        }).setCoppa(getCoppaValue()).setDeviceIdType(getDeviceIdType());
        if (!TextUtils.isEmpty(str)) {
            deviceIdType.setUserId(str);
        }
        Companion companion = Companion;
        if (companion.versionCompare(companion.getAdQualitySdkVersion(), "7.14.1") >= 0) {
            JSONObject jSONObjectM31774a = adQualityDataProvider.m31774a();
            if (jSONObjectM31774a.length() > 0) {
                deviceIdType.setMetaData(jSONObjectM31774a);
            }
        }
        Companion.logEvent$default(companion, EnumC12598x5.TROUBLESHOOTING_INITIALIZING_AD_QUALITY_SDK_EVENT, null, null, 6, null);
        IronSourceAdQuality.getInstance().initialize(context, appKey, deviceIdType.build());
    }

    @JvmStatic
    public static final boolean adQualityAvailable() {
        return Companion.adQualityAvailable();
    }

    private final ISAdQualityLogLevel convertToAdQualityLogLevel(int i) {
        if (i == 0) {
            return ISAdQualityLogLevel.VERBOSE;
        }
        if (i == 1) {
            return ISAdQualityLogLevel.INFO;
        }
        if (i != 2) {
            return i != 3 ? ISAdQualityLogLevel.INFO : ISAdQualityLogLevel.ERROR;
        }
        return ISAdQualityLogLevel.WARNING;
    }

    @JvmStatic
    public static final String getAdQualitySdkVersion() {
        return Companion.getAdQualitySdkVersion();
    }

    private final boolean getCoppaValue() {
        String strM26070a = C11486I6.m26069a().m26070a("is_coppa");
        return strM26070a != null && Boolean.parseBoolean(strM26070a);
    }

    private final ISAdQualityDeviceIdType getDeviceIdType() {
        return !TextUtils.isEmpty(C11486I6.m26069a().m26070a(RunnableC11504J6.f24725N)) ? ISAdQualityDeviceIdType.NONE : ISAdQualityDeviceIdType.GAID;
    }

    @JvmStatic
    private static final boolean isGetVersionMethodExist() {
        return Companion.isGetVersionMethodExist();
    }

    @JvmStatic
    private static final void logEvent(EnumC12598x5 enumC12598x5, Integer num, String str) throws JSONException {
        Companion.logEvent(enumC12598x5, num, str);
    }

    @JvmStatic
    private static final int versionCompare(String str, String str2) {
        return Companion.versionCompare(str, str2);
    }

    public final void changeUserId(String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        IronSourceAdQuality.getInstance().changeUserId(userId);
    }

    public final void setSegment(C11767Y9 segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        ISAdQualitySegment.Builder builder = new ISAdQualitySegment.Builder();
        if (segment.m28033g() != null) {
            builder.setSegmentName(segment.m28033g());
        }
        if (segment.m28021a() > -1) {
            builder.setAge(segment.m28021a());
        }
        if (segment.m28028b() != null) {
            builder.setGender(segment.m28028b());
        }
        if (segment.m28031e() > -1) {
            builder.setLevel(segment.m28031e());
        }
        if (segment.m28030d() != null) {
            builder.setIsPaying(segment.m28030d().get());
        }
        if (segment.m28029c() > -1.0d) {
            builder.setInAppPurchasesTotal(segment.m28029c());
        }
        if (segment.m28034h() > 0) {
            builder.setUserCreationDate(segment.m28034h());
        }
        for (Pair<String, String> pair : segment.m28032f()) {
            String key = (String) pair.first;
            String str = (String) pair.second;
            Intrinsics.checkNotNullExpressionValue(key, "key");
            if (StringsKt.startsWith$default(key, "custom_", false, 2, (Object) null)) {
                builder.setCustomData(StringsKt.removePrefix(key, (CharSequence) "custom_"), str);
            }
        }
        IronSourceAdQuality.getInstance().setSegment(builder.build());
    }
}
