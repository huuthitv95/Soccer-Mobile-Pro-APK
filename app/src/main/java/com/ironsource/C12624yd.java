package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: com.ironsource.yd */
/* JADX INFO: loaded from: classes6.dex */
public class C12624yd {

    /* JADX INFO: renamed from: b */
    private static C12624yd f33234b;

    /* JADX INFO: renamed from: a */
    private final ConcurrentHashMap<String, NetworkSettings> f33235a = new ConcurrentHashMap<>();

    private C12624yd() {
    }

    /* JADX INFO: renamed from: c */
    public static synchronized C12624yd m34235c() {
        if (f33234b == null) {
            f33234b = new C12624yd();
        }
        return f33234b;
    }

    /* JADX INFO: renamed from: a */
    public void m34238a(NetworkSettings networkSettings) {
        if (networkSettings == null || TextUtils.isEmpty(networkSettings.getProviderName())) {
            return;
        }
        this.f33235a.put(networkSettings.getProviderName(), networkSettings);
    }

    /* JADX INFO: renamed from: b */
    public NetworkSettings m34240b(String str) {
        NetworkSettings networkSettings = this.f33235a.get(str);
        if (networkSettings != null) {
            return networkSettings;
        }
        NetworkSettings networkSettings2 = new NetworkSettings(str);
        m34238a(networkSettings2);
        return networkSettings2;
    }

    /* JADX INFO: renamed from: d */
    public ConcurrentHashMap<String, NetworkSettings> m34243d() {
        return this.f33235a;
    }

    /* JADX INFO: renamed from: a */
    public void m34237a() {
        this.f33235a.clear();
    }

    /* JADX INFO: renamed from: a */
    public HashSet<String> m34236a(String str, String str2) {
        HashSet<String> hashSet = new HashSet<>();
        try {
            for (NetworkSettings networkSettings : this.f33235a.values()) {
                if (networkSettings.getProviderTypeForReflection().equals(str)) {
                    if (networkSettings.getRewardedVideoSettings() != null && networkSettings.getRewardedVideoSettings().length() > 0 && !TextUtils.isEmpty(networkSettings.getRewardedVideoSettings().optString(str2))) {
                        hashSet.add(networkSettings.getRewardedVideoSettings().optString(str2));
                    }
                    if (networkSettings.getInterstitialSettings() != null && networkSettings.getInterstitialSettings().length() > 0 && !TextUtils.isEmpty(networkSettings.getInterstitialSettings().optString(str2))) {
                        hashSet.add(networkSettings.getInterstitialSettings().optString(str2));
                    }
                    if (networkSettings.getBannerSettings() != null && networkSettings.getBannerSettings().length() > 0 && !TextUtils.isEmpty(networkSettings.getBannerSettings().optString(str2))) {
                        hashSet.add(networkSettings.getBannerSettings().optString(str2));
                    }
                    if (networkSettings.getNativeAdSettings() != null && networkSettings.getNativeAdSettings().length() > 0 && !TextUtils.isEmpty(networkSettings.getNativeAdSettings().optString(str2))) {
                        hashSet.add(networkSettings.getNativeAdSettings().optString(str2));
                    }
                }
            }
        } catch (Exception e) {
            C12317m4.m32153d().m32155a(e);
        }
        return hashSet;
    }

    /* JADX INFO: renamed from: c */
    public NetworkSettings m34242c(String str) {
        for (NetworkSettings networkSettings : this.f33235a.values()) {
            if ("IronSource".equals(networkSettings.getProviderTypeForReflection()) && str.equalsIgnoreCase(networkSettings.getSubProviderId())) {
                return networkSettings;
            }
        }
        return new NetworkSettings(str);
    }

    /* JADX INFO: renamed from: b */
    public void m34241b() {
        for (NetworkSettings networkSettings : this.f33235a.values()) {
            if (networkSettings.isMultipleInstances() && !TextUtils.isEmpty(networkSettings.getProviderTypeForReflection())) {
                NetworkSettings networkSettingsM34240b = m34240b(networkSettings.getProviderDefaultInstance());
                networkSettings.setApplicationSettings(IronSourceUtils.m32750b(networkSettings.getApplicationSettings(), networkSettingsM34240b.getApplicationSettings()));
                networkSettings.setInterstitialSettings(IronSourceUtils.m32750b(networkSettings.getInterstitialSettings(), networkSettingsM34240b.getInterstitialSettings()));
                networkSettings.setRewardedVideoSettings(IronSourceUtils.m32750b(networkSettings.getRewardedVideoSettings(), networkSettingsM34240b.getRewardedVideoSettings()));
                networkSettings.setBannerSettings(IronSourceUtils.m32750b(networkSettings.getBannerSettings(), networkSettingsM34240b.getBannerSettings()));
                networkSettings.setNativeAdSettings(IronSourceUtils.m32750b(networkSettings.getNativeAdSettings(), networkSettingsM34240b.getNativeAdSettings()));
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m34239a(String str) {
        return this.f33235a.containsKey(str);
    }
}
