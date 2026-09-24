package com.unity3d.mediation;

import android.content.Context;
import com.ironsource.C12387n9;
import com.ironsource.C12443qb;
import com.ironsource.mediationsdk.C12367p;
import com.ironsource.mediationsdk.logger.IronLog;
import com.unity3d.mediation.impression.LevelPlayImpressionDataListener;
import com.unity3d.mediation.segment.LevelPlaySegment;
import java.util.List;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class LevelPlay {
    public static final LevelPlay INSTANCE = new LevelPlay();

    public enum AdFormat {
        BANNER("banner"),
        INTERSTITIAL("interstitial"),
        REWARDED("rewarded"),
        NATIVE_AD("nativeAd");


        /* JADX INFO: renamed from: a */
        private final String f41447a;

        AdFormat(String str) {
            this.f41447a = str;
        }

        public final String getValue() {
            return this.f41447a;
        }
    }

    private LevelPlay() {
    }

    @JvmStatic
    public static final void addImpressionDataListener(LevelPlayImpressionDataListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        IronLog.API.info("adding listener: " + listener.getClass().getSimpleName());
        C12443qb.f31780a.m33184a(listener);
    }

    @JvmStatic
    public static final String getSdkVersion() {
        IronLog.API.info("");
        return "9.3.0";
    }

    @JvmStatic
    public static final void init(Context context, LevelPlayInitRequest initRequest, LevelPlayInitListener listener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        Intrinsics.checkNotNullParameter(listener, "listener");
        C12443qb.f31780a.m33183a(context, initRequest, listener);
    }

    @JvmStatic
    public static final void launchTestSuite(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        IronLog.API.info("");
        C12367p.m32628h().m32663c(context);
    }

    @JvmStatic
    public static final void removeImpressionDataListener(LevelPlayImpressionDataListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        IronLog.API.info("removing listener: " + listener.getClass().getSimpleName());
        C12443qb.f31780a.m33188b(listener);
    }

    @JvmStatic
    public static final void setAdaptersDebug(boolean z) {
        IronLog.API.info("enabled: " + z);
        C12367p.m32628h().mo27296a(z);
    }

    @JvmStatic
    public static final void setConsent(boolean z) {
        IronLog.API.info("consent: " + z);
        C12367p.m32628h().m32661b(z);
    }

    @JvmStatic
    public static final boolean setDynamicUserId(String dynamicUserId) {
        Intrinsics.checkNotNullParameter(dynamicUserId, "dynamicUserId");
        IronLog.API.info("dynamicUserId: " + dynamicUserId);
        return C12367p.m32628h().mo27298b(dynamicUserId);
    }

    @JvmStatic
    public static final void setMetaData(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        IronLog.API.info("key = " + key + ", value = " + value);
        C12443qb.f31780a.m33185a(key, value);
    }

    @JvmStatic
    public static final void setMetaData(String key, List<String> values) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(values, "values");
        IronLog.API.info("key = " + key + ", values = " + values);
        C12443qb.f31780a.m33186a(key, values);
    }

    @JvmStatic
    public static final void setNetworkData(String networkKey, JSONObject networkData) {
        Intrinsics.checkNotNullParameter(networkKey, "networkKey");
        Intrinsics.checkNotNullParameter(networkData, "networkData");
        IronLog.API.info("networkKey = " + networkKey + ", networkData = " + networkData);
        C12367p.m32628h().m32660b(networkKey, networkData);
    }

    @JvmStatic
    public static final void setSegment(LevelPlaySegment segment) {
        Intrinsics.checkNotNullParameter(segment, "segment");
        IronLog.API.info("");
        C12443qb.f31780a.m33189b(segment);
    }

    @JvmStatic
    public static final void validateIntegration(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        IronLog.API.info("");
        C12387n9.f31560a.m32822a(context);
    }
}
