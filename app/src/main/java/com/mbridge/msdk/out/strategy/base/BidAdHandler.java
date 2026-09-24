package com.mbridge.msdk.out.strategy.base;

import android.app.Activity;
import android.content.Context;
import com.mbridge.msdk.config.manager.C12907a;
import com.mbridge.msdk.newinterstitial.out.NewInterstitialListener;
import com.mbridge.msdk.out.strategy.IBidVideoAdStrategy;
import com.mbridge.msdk.video.p291bt.module.orglistener.InterfaceC13938g;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class BidAdHandler extends BaseAdHandler {
    protected IBidVideoAdStrategy componentBidVideoAdStrategy;
    protected IBidVideoAdStrategy legacyBidVideoAdStrategy;

    public BidAdHandler(String str, String str2) {
        super(str, str2);
    }

    public void clearVideoCache() {
        if (C12907a.m36194c().m36202d()) {
            this.componentBidVideoAdStrategy.clearVideoCache();
        } else {
            this.legacyBidVideoAdStrategy.clearVideoCache();
        }
    }

    public String getCreativeIdWithUnitId() {
        return C12907a.m36194c().m36202d() ? this.componentBidVideoAdStrategy.getCreativeIdWithUnitId() : this.legacyBidVideoAdStrategy.getCreativeIdWithUnitId();
    }

    public String getRequestId() {
        return C12907a.m36194c().m36202d() ? this.componentBidVideoAdStrategy.getRequestId() : this.legacyBidVideoAdStrategy.getRequestId();
    }

    public boolean isBidReady() {
        return C12907a.m36194c().m36202d() ? this.componentBidVideoAdStrategy.isBidReady() : this.legacyBidVideoAdStrategy.isBidReady();
    }

    public void loadFromBid(String str) {
        if (C12907a.m36194c().m36202d()) {
            this.componentBidVideoAdStrategy.loadFromBid(str);
        } else {
            this.legacyBidVideoAdStrategy.loadFromBid(str);
        }
    }

    public void playVideoMute(int i) {
        if (C12907a.m36194c().m36202d()) {
            this.componentBidVideoAdStrategy.playVideoMute(i);
        } else {
            this.legacyBidVideoAdStrategy.playVideoMute(i);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        if (C12907a.m36194c().m36202d()) {
            this.componentBidVideoAdStrategy.setAlertDialogText(str, str2, str3, str4);
        } else {
            this.legacyBidVideoAdStrategy.setAlertDialogText(str, str2, str3, str4);
        }
    }

    @Override // com.mbridge.msdk.out.BaseExtraInterfaceForHandler
    public void setExtraInfo(JSONObject jSONObject) {
        if (C12907a.m36194c().m36202d()) {
            this.componentBidVideoAdStrategy.setExtraInfo(jSONObject);
        } else {
            this.legacyBidVideoAdStrategy.setExtraInfo(jSONObject);
        }
    }

    public void setIVRewardEnable(int i, int i2) {
        if (C12907a.m36194c().m36202d()) {
            this.componentBidVideoAdStrategy.setIVRewardEnable(i, i2);
        } else {
            this.legacyBidVideoAdStrategy.setIVRewardEnable(i, i2);
        }
    }

    public void setInterstitialVideoListener(NewInterstitialListener newInterstitialListener) {
        if (C12907a.m36194c().m36202d()) {
            this.componentBidVideoAdStrategy.setInterstitialVideoListener(newInterstitialListener);
        } else {
            this.legacyBidVideoAdStrategy.setInterstitialVideoListener(newInterstitialListener);
        }
    }

    public void setRewardPlus(boolean z) {
        if (C12907a.m36194c().m36202d()) {
            this.componentBidVideoAdStrategy.setRewardPlus(z);
        } else {
            this.legacyBidVideoAdStrategy.setRewardPlus(z);
        }
    }

    public void setRewardVideoListener(InterfaceC13938g interfaceC13938g) {
        if (C12907a.m36194c().m36202d()) {
            this.componentBidVideoAdStrategy.setRewardVideoListener(interfaceC13938g);
        } else {
            this.legacyBidVideoAdStrategy.setRewardVideoListener(interfaceC13938g);
        }
    }

    public void showFromBid() {
        if (C12907a.m36194c().m36202d()) {
            this.componentBidVideoAdStrategy.showFromBid();
        } else {
            this.legacyBidVideoAdStrategy.showFromBid();
        }
    }

    public BidAdHandler(Context context, String str, String str2) {
        super(context, str, str2);
    }

    public void setIVRewardEnable(int i, double d) {
        if (C12907a.m36194c().m36202d()) {
            this.componentBidVideoAdStrategy.setIVRewardEnable(i, d);
        } else {
            this.legacyBidVideoAdStrategy.setIVRewardEnable(i, d);
        }
    }

    public void showFromBid(Activity activity) {
        if (C12907a.m36194c().m36202d()) {
            this.componentBidVideoAdStrategy.showFromBid(activity);
        } else {
            this.legacyBidVideoAdStrategy.showFromBid(activity);
        }
    }

    public void showFromBid(String str) {
        if (C12907a.m36194c().m36202d()) {
            this.componentBidVideoAdStrategy.showFromBid(str);
        } else {
            this.legacyBidVideoAdStrategy.showFromBid(str);
        }
    }

    public void showFromBid(String str, String str2) {
        if (C12907a.m36194c().m36202d()) {
            this.componentBidVideoAdStrategy.showFromBid(str, str2);
        } else {
            this.legacyBidVideoAdStrategy.showFromBid(str, str2);
        }
    }

    public void showFromBid(Activity activity, String str) {
        if (C12907a.m36194c().m36202d()) {
            this.componentBidVideoAdStrategy.showFromBid(activity, str);
        } else {
            this.legacyBidVideoAdStrategy.showFromBid(activity, str);
        }
    }

    public void showFromBid(Activity activity, String str, String str2) {
        if (C12907a.m36194c().m36202d()) {
            this.componentBidVideoAdStrategy.showFromBid(activity, str, str2);
        } else {
            this.legacyBidVideoAdStrategy.showFromBid(activity, str, str2);
        }
    }
}
