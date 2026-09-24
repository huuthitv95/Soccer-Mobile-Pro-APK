package com.google.ads.mediation.mintegral;

import android.view.ViewGroup;
import com.mbridge.msdk.out.MBSplashLoadWithCodeListener;
import com.mbridge.msdk.out.MBSplashShowListener;
import kotlin.Metadata;
import org.json.JSONObject;

/* JADX INFO: compiled from: MintegralFactory.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m43474d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u000bH&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\b\u0010\u000f\u001a\u00020\u0003H&J\u0010\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0005H&J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0018\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0005H&J\b\u0010\u0016\u001a\u00020\u0003H&¨\u0006\u0017"}, m43475d2 = {"Lcom/google/ads/mediation/mintegral/MintegralSplashAdWrapper;", "", "createAd", "", "placementId", "", "adUnitId", "setSplashLoadListener", "listener", "Lcom/mbridge/msdk/out/MBSplashLoadWithCodeListener;", "setSplashShowListener", "Lcom/mbridge/msdk/out/MBSplashShowListener;", "setExtraInfo", "jsonObject", "Lorg/json/JSONObject;", "preLoad", "preLoadByToken", "token", "show", "group", "Landroid/view/ViewGroup;", "bidToken", "onDestroy", "mintegral_release"}, m43476k = 1, m43477mv = {2, 1, 0}, m43479xi = 48)
public interface MintegralSplashAdWrapper {
    void createAd(String placementId, String adUnitId);

    void onDestroy();

    void preLoad();

    void preLoadByToken(String token);

    void setExtraInfo(JSONObject jsonObject);

    void setSplashLoadListener(MBSplashLoadWithCodeListener listener);

    void setSplashShowListener(MBSplashShowListener listener);

    void show(ViewGroup group);

    void show(ViewGroup group, String bidToken);
}
