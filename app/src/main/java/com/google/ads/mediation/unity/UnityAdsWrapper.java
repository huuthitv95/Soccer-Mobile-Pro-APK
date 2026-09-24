package com.google.ads.mediation.unity;

import android.content.Context;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.metadata.MediationMetaData;

/* JADX INFO: loaded from: classes4.dex */
class UnityAdsWrapper {
    UnityAdsWrapper() {
    }

    public MediationMetaData getMediationMetaData(Context context) {
        return new MediationMetaData(context);
    }

    public void getToken(IUnityAdsTokenListener iUnityAdsTokenListener) {
        UnityAds.getToken(iUnityAdsTokenListener);
    }

    public void getToken(TokenConfiguration tokenConfiguration, IUnityAdsTokenListener iUnityAdsTokenListener) {
        UnityAds.getToken(tokenConfiguration, iUnityAdsTokenListener);
    }

    public String getVersion() {
        return UnityAds.getVersion();
    }

    public void initialize(Context context, String str, IUnityAdsInitializationListener iUnityAdsInitializationListener) {
        UnityAds.initialize(context, str, false, iUnityAdsInitializationListener);
    }

    public boolean isInitialized() {
        return UnityAds.isInitialized();
    }
}
