package com.unity3d.ironsourceads;

import android.content.Context;
import com.ironsource.C11543L9;
import com.ironsource.mediationsdk.C12367p;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.List;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class IronSourceAds {
    public static final IronSourceAds INSTANCE = new IronSourceAds();

    public enum AdFormat {
        BANNER("Banner"),
        INTERSTITIAL("Interstitial"),
        REWARDED("RewardedVideo");


        /* JADX INFO: renamed from: a */
        private final String f41388a;

        AdFormat(String str) {
            this.f41388a = str;
        }

        public final String getValue() {
            return this.f41388a;
        }
    }

    private IronSourceAds() {
    }

    @JvmStatic
    public static final void enableDebugMode(boolean z) {
        IronLog.API.info("enabled: " + z);
        C12367p.m32628h().mo27296a(z);
    }

    @JvmStatic
    public static final String getSdkVersion() {
        IronLog.API.info("");
        return "9.3.0";
    }

    @JvmStatic
    public static final void init(Context context, InitRequest initRequest, InitListener initializationListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initRequest, "initRequest");
        Intrinsics.checkNotNullParameter(initializationListener, "initializationListener");
        C11543L9.f25039a.m26371a(context, initRequest, initializationListener);
    }

    @JvmStatic
    public static final void setConsent(boolean z) {
        IronLog.API.info("consent: " + z);
        C12367p.m32628h().m32661b(z);
    }

    @JvmStatic
    public static final void setMetaData(String key, String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        IronLog.API.info("key = " + key + ", value = " + value);
        C11543L9.f25039a.m26372a(key, value);
    }

    @JvmStatic
    public static final void setMetaData(String key, List<String> values) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(values, "values");
        IronLog.API.info("key = " + key + ", values = " + values);
        C12367p.m32628h().m32652a(key, values);
    }
}
