package com.unity3d.ads;

import com.ironsource.C11495If;
import kotlin.Metadata;

/* JADX INFO: compiled from: LoadListener.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bç\u0080\u0001\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J!\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00018\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0002\u0010\b¨\u0006\t"}, m43475d2 = {"Lcom/unity3d/ads/LoadListener;", "UnityAd", "", C11495If.f24691j, "", "unityAd", "error", "Lcom/unity3d/ads/UnityAdsError;", "(Ljava/lang/Object;Lcom/unity3d/ads/UnityAdsError;)V", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public interface LoadListener<UnityAd> {
    void onAdLoaded(UnityAd unityAd, UnityAdsError error);
}
