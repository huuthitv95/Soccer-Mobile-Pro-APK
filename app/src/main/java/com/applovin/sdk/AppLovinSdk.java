package com.applovin.sdk;

import android.content.Context;
import android.net.Uri;
import com.applovin.impl.AbstractC1821y3;
import com.applovin.impl.mediation.MaxMediatedNetworkInfoImpl;
import com.applovin.impl.sdk.C1748l;
import com.applovin.impl.sdk.C1768p;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import com.applovin.mediation.MaxSegmentCollection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class AppLovinSdk {
    private static final String TAG = "AppLovinSdk";
    private static AppLovinSdk instance;
    private final C1748l coreSdk;
    public static final String VERSION = getVersion();
    public static final int VERSION_CODE = getVersionCode();
    private static final Object instanceLock = new Object();

    public interface SdkInitializationListener {
        void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration);
    }

    private AppLovinSdk(C1748l c1748l) {
        this.coreSdk = c1748l;
    }

    public static AppLovinSdk getInstance(Context context) {
        AppLovinSdk appLovinSdk;
        if (context == null) {
            throw new IllegalArgumentException("No context specified");
        }
        synchronized (instanceLock) {
            if (instance == null) {
                C1748l c1748l = new C1748l(new AppLovinSdkSettings(context), context);
                AppLovinSdk appLovinSdk2 = new AppLovinSdk(c1748l);
                c1748l.m4807a(appLovinSdk2);
                instance = appLovinSdk2;
            }
            appLovinSdk = instance;
        }
        return appLovinSdk;
    }

    private static String getVersion() {
        return "13.6.0";
    }

    private static int getVersionCode() {
        return 13060099;
    }

    /* JADX INFO: renamed from: a */
    public C1748l m5807a() {
        return this.coreSdk;
    }

    public AppLovinAdService getAdService() {
        return this.coreSdk.m4840l();
    }

    public List<MaxMediatedNetworkInfo> getAvailableMediatedNetworks() {
        JSONArray jSONArrayM5704b = AbstractC1821y3.m5704b(this.coreSdk);
        ArrayList arrayList = new ArrayList(jSONArrayM5704b.length());
        for (int i = 0; i < jSONArrayM5704b.length(); i++) {
            arrayList.add(new MaxMediatedNetworkInfoImpl(JsonUtils.getJSONObject(jSONArrayM5704b, i, (JSONObject) null)));
        }
        return arrayList;
    }

    public AppLovinCmpService getCmpService() {
        return this.coreSdk.m4854t();
    }

    public AppLovinSdkConfiguration getConfiguration() {
        return this.coreSdk.m4860w();
    }

    public AppLovinEventService getEventService() {
        return this.coreSdk.m4768G();
    }

    public String getSdkKey() {
        return this.coreSdk.m4839k0();
    }

    public MaxSegmentCollection getSegmentCollection() {
        return this.coreSdk.m4841l0();
    }

    public AppLovinSdkSettings getSettings() {
        return this.coreSdk.m4847p0();
    }

    public void initialize(AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration, SdkInitializationListener sdkInitializationListener) {
        this.coreSdk.m4808a(appLovinSdkInitializationConfiguration, sdkInitializationListener);
    }

    public boolean isInitialized() {
        return this.coreSdk.m4763D0();
    }

    public void processDeepLink(Uri uri) {
        this.coreSdk.m4805a(uri);
    }

    protected void reinitialize(Boolean bool, Boolean bool2) {
        if (this.coreSdk.m4767F0()) {
            this.coreSdk.m4788T0();
        }
        this.coreSdk.m4786S0();
        if (bool != null) {
            this.coreSdk.m4782Q();
            if (C1768p.m5160a()) {
                this.coreSdk.m4782Q().m5175d(TAG, "Toggled 'huc' to " + bool);
            }
            getEventService().trackEvent("huc", CollectionUtils.map("value", bool.toString()));
        }
        if (bool2 != null) {
            this.coreSdk.m4782Q();
            if (C1768p.m5160a()) {
                this.coreSdk.m4782Q().m5175d(TAG, "Toggled 'dns' to " + bool2);
            }
            getEventService().trackEvent("dns", CollectionUtils.map("value", bool2.toString()));
        }
    }

    public void showCreativeDebugger() {
        this.coreSdk.m4795X0();
    }

    public void showMediationDebugger() {
        this.coreSdk.m4796Y0();
    }

    public void showMediationDebugger(Map<String, List<?>> map) {
        this.coreSdk.m4810a(map);
    }

    public String toString() {
        return "AppLovinSdk{sdkKey='" + getSdkKey() + "', isInitialized=" + isInitialized() + ", isFirstSession=" + this.coreSdk.m4765E0() + AbstractJsonLexerKt.END_OBJ;
    }
}
