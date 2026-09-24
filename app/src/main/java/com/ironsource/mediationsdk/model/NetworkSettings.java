package com.ironsource.mediationsdk.model;

import android.text.TextUtils;
import com.ironsource.C12317m4;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class NetworkSettings {

    /* JADX INFO: renamed from: r */
    private static final String f31329r = "customNetwork";

    /* JADX INFO: renamed from: s */
    private static final String f31330s = "customNetworkPackage";

    /* JADX INFO: renamed from: t */
    private static final String f31331t = "customNetworkAdapterName";

    /* JADX INFO: renamed from: a */
    private String f31332a;

    /* JADX INFO: renamed from: b */
    private String f31333b;

    /* JADX INFO: renamed from: c */
    private JSONObject f31334c;

    /* JADX INFO: renamed from: d */
    private JSONObject f31335d;

    /* JADX INFO: renamed from: e */
    private JSONObject f31336e;

    /* JADX INFO: renamed from: f */
    private JSONObject f31337f;

    /* JADX INFO: renamed from: g */
    private JSONObject f31338g;

    /* JADX INFO: renamed from: h */
    private String f31339h;

    /* JADX INFO: renamed from: i */
    private String f31340i;

    /* JADX INFO: renamed from: j */
    private boolean f31341j;

    /* JADX INFO: renamed from: k */
    private String f31342k;

    /* JADX INFO: renamed from: l */
    private int f31343l;

    /* JADX INFO: renamed from: m */
    private int f31344m;

    /* JADX INFO: renamed from: n */
    private int f31345n;

    /* JADX INFO: renamed from: o */
    private int f31346o;

    /* JADX INFO: renamed from: p */
    private String f31347p;

    /* JADX INFO: renamed from: q */
    private String f31348q;

    public NetworkSettings(String str) {
        this.f31332a = str;
        this.f31342k = str;
        this.f31333b = str;
        this.f31347p = str;
        this.f31348q = str;
        this.f31335d = new JSONObject();
        this.f31336e = new JSONObject();
        this.f31337f = new JSONObject();
        this.f31338g = new JSONObject();
        this.f31334c = new JSONObject();
        this.f31343l = -1;
        this.f31344m = -1;
        this.f31345n = -1;
        this.f31346o = -1;
    }

    public String getAdSourceNameForEvents() {
        return this.f31340i;
    }

    public JSONObject getApplicationSettings() {
        return this.f31334c;
    }

    public int getBannerPriority() {
        return this.f31345n;
    }

    public JSONObject getBannerSettings() {
        return this.f31337f;
    }

    public String getCustomNetwork() {
        JSONObject jSONObject = this.f31334c;
        if (jSONObject != null) {
            return jSONObject.optString("customNetwork");
        }
        return null;
    }

    public String getCustomNetworkAdapterName(IronSource.EnumC12328a enumC12328a) {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        JSONObject jSONObject3;
        JSONObject jSONObject4;
        JSONObject jSONObject5;
        if (enumC12328a == null && (jSONObject5 = this.f31334c) != null) {
            return jSONObject5.optString(f31331t);
        }
        if (enumC12328a.equals(IronSource.EnumC12328a.REWARDED_VIDEO) && (jSONObject4 = this.f31335d) != null) {
            return jSONObject4.optString(f31331t);
        }
        if (enumC12328a.equals(IronSource.EnumC12328a.INTERSTITIAL) && (jSONObject3 = this.f31336e) != null) {
            return jSONObject3.optString(f31331t);
        }
        if (enumC12328a.equals(IronSource.EnumC12328a.BANNER) && (jSONObject2 = this.f31337f) != null) {
            return jSONObject2.optString(f31331t);
        }
        if (!enumC12328a.equals(IronSource.EnumC12328a.NATIVE_AD) || (jSONObject = this.f31338g) == null) {
            return null;
        }
        return jSONObject.optString(f31331t);
    }

    public String getCustomNetworkPackage() {
        JSONObject jSONObject = this.f31334c;
        return jSONObject != null ? jSONObject.optString(f31330s, "") : "";
    }

    public int getInstanceType(IronSource.EnumC12328a enumC12328a) {
        if (enumC12328a == IronSource.EnumC12328a.REWARDED_VIDEO) {
            return getRewardedVideoSettings().optInt("instanceType");
        }
        if (enumC12328a == IronSource.EnumC12328a.INTERSTITIAL) {
            return getInterstitialSettings().optInt("instanceType");
        }
        if (enumC12328a == IronSource.EnumC12328a.BANNER) {
            return getBannerSettings().optInt("instanceType");
        }
        if (enumC12328a == IronSource.EnumC12328a.NATIVE_AD) {
            return getNativeAdSettings().optInt("instanceType");
        }
        return 1;
    }

    public int getInterstitialPriority() {
        return this.f31344m;
    }

    public JSONObject getInterstitialSettings() {
        return this.f31336e;
    }

    public int getMaxAdsPerSession(IronSource.EnumC12328a enumC12328a) {
        if (enumC12328a == IronSource.EnumC12328a.REWARDED_VIDEO) {
            return getRewardedVideoSettings().optInt("maxAdsPerSession", 99);
        }
        if (enumC12328a == IronSource.EnumC12328a.INTERSTITIAL) {
            return getInterstitialSettings().optInt("maxAdsPerSession", 99);
        }
        if (enumC12328a == IronSource.EnumC12328a.BANNER) {
            return getBannerSettings().optInt("maxAdsPerSession", 99);
        }
        if (enumC12328a == IronSource.EnumC12328a.NATIVE_AD) {
            return getNativeAdSettings().optInt("maxAdsPerSession", 99);
        }
        return 99;
    }

    public int getNativeAdPriority() {
        return this.f31346o;
    }

    public JSONObject getNativeAdSettings() {
        return this.f31338g;
    }

    public String getProviderDefaultInstance() {
        return this.f31347p;
    }

    public String getProviderInstanceName() {
        return this.f31342k;
    }

    public String getProviderName() {
        return this.f31332a;
    }

    public String getProviderNetworkKey() {
        return this.f31348q;
    }

    public String getProviderTypeForReflection() {
        return this.f31333b;
    }

    public int getRewardedVideoPriority() {
        return this.f31343l;
    }

    public JSONObject getRewardedVideoSettings() {
        return this.f31335d;
    }

    public String getSubProviderId() {
        return this.f31339h;
    }

    public boolean isBidder(IronSource.EnumC12328a enumC12328a) {
        return !isCustomNetwork() && getInstanceType(enumC12328a) == 2;
    }

    public boolean isCustomNetwork() {
        return !TextUtils.isEmpty(getCustomNetwork());
    }

    public boolean isIronSource() {
        return getProviderTypeForReflection().equalsIgnoreCase("IronSource");
    }

    public boolean isMultipleInstances() {
        return this.f31341j;
    }

    public void setAdSourceNameForEvents(String str) {
        this.f31340i = str;
    }

    public void setApplicationSettings(JSONObject jSONObject) {
        this.f31334c = jSONObject;
    }

    public void setBannerPriority(int i) {
        this.f31345n = i;
    }

    public void setBannerSettings(JSONObject jSONObject) {
        this.f31337f = jSONObject;
    }

    public void setInterstitialPriority(int i) {
        this.f31344m = i;
    }

    public void setInterstitialSettings(JSONObject jSONObject) {
        this.f31336e = jSONObject;
    }

    public void setIsMultipleInstances(boolean z) {
        this.f31341j = z;
    }

    public void setNativeAdPriority(int i) {
        this.f31346o = i;
    }

    public void setNativeAdSettings(JSONObject jSONObject) {
        this.f31338g = jSONObject;
    }

    public void setProviderNetworkKey(String str) {
        this.f31348q = str;
    }

    public void setRewardedVideoPriority(int i) {
        this.f31343l = i;
    }

    public void setRewardedVideoSettings(JSONObject jSONObject) {
        this.f31335d = jSONObject;
    }

    public void setSubProviderId(String str) {
        this.f31339h = str;
    }

    public boolean shouldEarlyInit(boolean z) {
        JSONObject jSONObject = this.f31334c;
        return (jSONObject == null || !jSONObject.has(IronSourceConstants.EARLY_INIT_FIELD)) ? z : this.f31334c.optBoolean(IronSourceConstants.EARLY_INIT_FIELD);
    }

    public void setBannerSettings(String str, Object obj) {
        try {
            this.f31337f.put(str, obj);
        } catch (JSONException e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public void setInterstitialSettings(String str, Object obj) {
        try {
            this.f31336e.put(str, obj);
        } catch (JSONException e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public void setNativeAdSettings(String str, Object obj) {
        try {
            this.f31338g.put(str, obj);
        } catch (JSONException e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public void setRewardedVideoSettings(String str, Object obj) {
        try {
            this.f31335d.put(str, obj);
        } catch (JSONException e) {
            C12317m4.m32153d().m32155a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    public NetworkSettings(String str, String str2, String str3, String str4, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, JSONObject jSONObject4, JSONObject jSONObject5) {
        this.f31332a = str;
        this.f31342k = str;
        this.f31333b = str2;
        this.f31347p = str3;
        this.f31348q = str4;
        this.f31335d = jSONObject2;
        this.f31336e = jSONObject3;
        this.f31337f = jSONObject4;
        this.f31338g = jSONObject5;
        this.f31334c = jSONObject;
        this.f31343l = -1;
        this.f31344m = -1;
        this.f31345n = -1;
        this.f31346o = -1;
    }

    public NetworkSettings(NetworkSettings networkSettings) {
        this.f31332a = networkSettings.getProviderName();
        this.f31342k = networkSettings.getProviderName();
        this.f31333b = networkSettings.getProviderTypeForReflection();
        this.f31335d = networkSettings.getRewardedVideoSettings();
        this.f31336e = networkSettings.getInterstitialSettings();
        this.f31337f = networkSettings.getBannerSettings();
        this.f31338g = networkSettings.getNativeAdSettings();
        this.f31334c = networkSettings.getApplicationSettings();
        this.f31343l = networkSettings.getRewardedVideoPriority();
        this.f31344m = networkSettings.getInterstitialPriority();
        this.f31345n = networkSettings.getBannerPriority();
        this.f31346o = networkSettings.getNativeAdPriority();
        this.f31347p = networkSettings.getProviderDefaultInstance();
        this.f31348q = networkSettings.getProviderNetworkKey();
    }
}
