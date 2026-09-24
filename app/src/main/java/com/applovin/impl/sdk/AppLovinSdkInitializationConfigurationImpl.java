package com.applovin.impl.sdk;

import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxSegmentCollection;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class AppLovinSdkInitializationConfigurationImpl extends AppLovinSdkInitializationConfiguration {

    /* JADX INFO: renamed from: a */
    private final String f2838a;

    /* JADX INFO: renamed from: b */
    private final String f2839b;

    /* JADX INFO: renamed from: c */
    private final String f2840c;

    /* JADX INFO: renamed from: d */
    private final String f2841d;

    /* JADX INFO: renamed from: e */
    private final MaxSegmentCollection f2842e;

    /* JADX INFO: renamed from: f */
    private final List f2843f;

    /* JADX INFO: renamed from: g */
    private final List f2844g;

    /* JADX INFO: renamed from: h */
    private final boolean f2845h;

    public static class BuilderImpl implements AppLovinSdkInitializationConfiguration.Builder {

        /* JADX INFO: renamed from: a */
        private String f2846a;

        /* JADX INFO: renamed from: b */
        private final String f2847b;

        /* JADX INFO: renamed from: c */
        private String f2848c;

        /* JADX INFO: renamed from: d */
        private String f2849d;

        /* JADX INFO: renamed from: e */
        private MaxSegmentCollection f2850e;

        /* JADX INFO: renamed from: f */
        private List f2851f = Collections.EMPTY_LIST;

        /* JADX INFO: renamed from: g */
        private List f2852g = Collections.EMPTY_LIST;

        /* JADX INFO: renamed from: h */
        private boolean f2853h = true;

        public BuilderImpl(String str, String str2) {
            this.f2846a = str;
            this.f2847b = str2;
            C1768p.m5165e("AppLovinSdkInitializationConfiguration", "Initializing with key: " + str);
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration build() {
            return new AppLovinSdkInitializationConfigurationImpl(this);
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public List<String> getAdUnitIds() {
            return this.f2852g;
        }

        public String getAxonEventKey() {
            return this.f2847b;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public String getMediationProvider() {
            return this.f2848c;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public String getPluginVersion() {
            return this.f2849d;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public String getSdkKey() {
            return this.f2846a;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public MaxSegmentCollection getSegmentCollection() {
            return this.f2850e;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public List<String> getTestDeviceAdvertisingIds() {
            return this.f2851f;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public boolean isExceptionHandlerEnabled() {
            return this.f2853h;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration.Builder setAdUnitIds(List<String> list) {
            C1768p.m5165e("AppLovinSdkInitializationConfiguration", "setAdUnitIds(adUnitIds=" + list + ")");
            if (list == null) {
                return this;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (String str : list) {
                if (StringUtils.isValidString(str) && str.length() > 0) {
                    if (str.length() == 16) {
                        arrayList.add(str);
                    } else {
                        C1768p.m5167h("AppLovinSdkInitializationConfiguration", "Unable to set initialization ad unit id (" + str + ") - please make sure it is in the format of XXXXXXXXXXXXXXXX");
                    }
                }
            }
            this.f2852g = arrayList;
            return this;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration.Builder setExceptionHandlerEnabled(boolean z) {
            C1768p.m5165e("AppLovinSdkInitializationConfiguration", "setExceptionHandlerEnabled(exceptionHandlerEnabled=" + z + ")");
            this.f2853h = z;
            return this;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration.Builder setMediationProvider(String str) {
            C1768p.m5165e("AppLovinSdkInitializationConfiguration", "setMediationProvider(mediationProvider=" + str + ")");
            if (str == null || (!str.isEmpty() && str.length() <= 64 && StringUtils.isAlphaNumeric(str))) {
                this.f2848c = str;
                return this;
            }
            C1768p.m5167h("AppLovinSdkInitializationConfiguration", "Mediation provider set to invalid value: " + str + ". Please use a valid mediation provider (e.g., AppLovinMediationProvider.MAX)");
            return this;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration.Builder setPluginVersion(String str) {
            C1768p.m5165e("AppLovinSdkInitializationConfiguration", "setPluginVersion(pluginVersion=" + str + ")");
            this.f2849d = str;
            return this;
        }

        public AppLovinSdkInitializationConfiguration.Builder setSdkKey(String str) {
            this.f2846a = str;
            return this;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration.Builder setSegmentCollection(MaxSegmentCollection maxSegmentCollection) {
            C1768p.m5165e("AppLovinSdkInitializationConfiguration", "setSegmentCollection(segmentCollection=" + maxSegmentCollection + ")");
            this.f2850e = maxSegmentCollection;
            return this;
        }

        @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration.Builder
        public AppLovinSdkInitializationConfiguration.Builder setTestDeviceAdvertisingIds(List<String> list) {
            C1768p.m5165e("AppLovinSdkInitializationConfiguration", "setTestDeviceAdvertisingIds(testDeviceAdvertisingIds=" + list + ")");
            if (list == null) {
                return this;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (String str : list) {
                if (str == null || str.length() != 36) {
                    C1768p.m5167h("AppLovinSdkInitializationConfiguration", "Unable to set test device advertising id (" + str + ") - please make sure it is in the format of xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx");
                } else {
                    arrayList.add(str);
                }
            }
            this.f2851f = arrayList;
            return this;
        }

        public String toString() {
            return "AppLovinSdkInitializationConfiguration.Builder{ sdkKey=" + this.f2846a + ", axonEventKey=" + this.f2847b + ", mediationProvider=" + this.f2848c + ", pluginVersion=" + this.f2849d + ", testDeviceAdvertisingIdentifiers=" + this.f2851f + ", adUnitIdentifiers=" + this.f2852g + ", isExceptionHandlerEnabled=" + this.f2853h + ", segmentCollection=" + this.f2850e + "}";
        }
    }

    private AppLovinSdkInitializationConfigurationImpl(BuilderImpl builderImpl) {
        this.f2838a = builderImpl.f2846a;
        this.f2839b = builderImpl.f2847b;
        this.f2840c = builderImpl.f2848c;
        this.f2841d = builderImpl.f2849d;
        this.f2842e = builderImpl.f2850e;
        this.f2843f = builderImpl.f2851f;
        this.f2844g = builderImpl.f2852g;
        this.f2845h = builderImpl.f2853h;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    public List<String> getAdUnitIds() {
        return this.f2844g;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    public String getAxonEventKey() {
        return this.f2839b;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    public String getMediationProvider() {
        return this.f2840c;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    public String getPluginVersion() {
        return this.f2841d;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    public String getSdkKey() {
        return this.f2838a;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    public MaxSegmentCollection getSegmentCollection() {
        return this.f2842e;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    public List<String> getTestDeviceAdvertisingIds() {
        return this.f2843f;
    }

    @Override // com.applovin.sdk.AppLovinSdkInitializationConfiguration
    public boolean isExceptionHandlerEnabled() {
        return this.f2845h;
    }

    public String toString() {
        return "AppLovinSdkInitializationConfiguration{ sdkKey=" + this.f2838a + ", axonEventKey=" + this.f2839b + ", mediationProvider=" + this.f2840c + ", pluginVersion=" + this.f2841d + ", testDeviceAdvertisingIds=" + this.f2843f + ", adUnitIdentifiers=" + this.f2844g + ", isExceptionHandlerEnabled=" + this.f2845h + ", segmentCollection=" + this.f2842e + "}";
    }
}
