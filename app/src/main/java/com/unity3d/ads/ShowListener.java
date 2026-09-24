package com.unity3d.ads;

import kotlin.Metadata;

/* JADX INFO: compiled from: ShowListener.kt */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m43474d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0006J\u001d\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\b\u001a\u00020\tH&¢\u0006\u0002\u0010\nJ\u001d\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\rH&¢\u0006\u0002\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u0006\u0082\u0001\u0002\u0010\u0011¨\u0006\u0012"}, m43475d2 = {"Lcom/unity3d/ads/ShowListener;", "UnityAd", "", "onClicked", "", "unityAd", "(Ljava/lang/Object;)V", "onCompleted", "state", "Lcom/unity3d/ads/ShowFinishState;", "(Ljava/lang/Object;Lcom/unity3d/ads/ShowFinishState;)V", "onFailed", "error", "Lcom/unity3d/ads/UnityAdsError;", "(Ljava/lang/Object;Lcom/unity3d/ads/UnityAdsError;)V", "onStarted", "Lcom/unity3d/ads/InterstitialShowListener;", "Lcom/unity3d/ads/RewardedShowListener;", "unity-ads_defaultRelease"}, m43476k = 1, m43477mv = {1, 8, 0}, m43479xi = 48)
public interface ShowListener<UnityAd> {
    void onClicked(UnityAd unityAd);

    void onCompleted(UnityAd unityAd, ShowFinishState state);

    void onFailed(UnityAd unityAd, UnityAdsError error);

    void onStarted(UnityAd unityAd);
}
