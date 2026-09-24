package com.mbridge.msdk.out.strategy;

import android.app.Activity;
import com.mbridge.msdk.newinterstitial.out.NewInterstitialListener;
import com.mbridge.msdk.video.p291bt.module.orglistener.InterfaceC13938g;

/* JADX INFO: loaded from: classes6.dex */
public interface IBidVideoAdStrategy extends IBaseVideoAdStrategy {
    void clearBitmapCache();

    boolean isBidReady();

    void loadFromBid(String str);

    void setIVRewardEnable(int i, double d);

    void setIVRewardEnable(int i, int i2);

    void setInterstitialVideoListener(NewInterstitialListener newInterstitialListener);

    @Override // com.mbridge.msdk.out.strategy.IBaseVideoAdStrategy
    void setRewardPlus(boolean z);

    void setRewardVideoListener(InterfaceC13938g interfaceC13938g);

    void showFromBid();

    void showFromBid(Activity activity);

    void showFromBid(Activity activity, String str);

    void showFromBid(Activity activity, String str, String str2);

    void showFromBid(String str);

    void showFromBid(String str, String str2);
}
