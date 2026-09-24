package com.unity3d.ads;

import com.unity3d.ads.core.data.model.LoadConfigurationInternal;

/* JADX INFO: loaded from: classes7.dex */
public class UnityAdsLoadOptions extends UnityAdsBaseOptions {
    private String AD_MARKUP = "adMarkup";
    public LoadConfigurationInternal loadConfiguration = null;

    public void setAdMarkup(String str) {
        set(this.AD_MARKUP, str);
    }
}
