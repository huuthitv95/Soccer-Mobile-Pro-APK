package com.mbridge.msdk.out.strategy.base;

import android.app.Activity;
import android.content.Context;
import com.mbridge.msdk.config.manager.C12907a;
import com.mbridge.msdk.newinterstitial.out.NewInterstitialListener;
import com.mbridge.msdk.out.strategy.IVideoAdStrategy;
import com.mbridge.msdk.video.p291bt.module.orglistener.InterfaceC13938g;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class NonBidAdHandler extends BaseAdHandler {
    protected IVideoAdStrategy componentAdStrategy;
    protected IVideoAdStrategy legacyVideoAdStrategy;

    public NonBidAdHandler(Context context, String str, String str2) {
        super(context, str, str2);
    }

    public void clearVideoCache() {
        if (C12907a.m36194c().m36202d()) {
            this.componentAdStrategy.clearVideoCache();
        } else {
            this.legacyVideoAdStrategy.clearVideoCache();
        }
    }

    public String getCreativeIdWithUnitId() {
        return C12907a.m36194c().m36202d() ? this.componentAdStrategy.getCreativeIdWithUnitId() : this.legacyVideoAdStrategy.getCreativeIdWithUnitId();
    }

    public String getRequestId() {
        return C12907a.m36194c().m36202d() ? this.componentAdStrategy.getRequestId() : this.legacyVideoAdStrategy.getRequestId();
    }

    public boolean isReady() {
        return C12907a.m36194c().m36202d() ? this.componentAdStrategy.isReady() : this.legacyVideoAdStrategy.isReady();
    }

    public void load() {
        if (C12907a.m36194c().m36202d()) {
            this.componentAdStrategy.load();
        } else {
            this.legacyVideoAdStrategy.load();
        }
    }

    public void loadFormSelfFilling() {
        if (C12907a.m36194c().m36202d()) {
            this.componentAdStrategy.loadFormSelfFilling();
        } else {
            this.legacyVideoAdStrategy.loadFormSelfFilling();
        }
    }

    public void playVideoMute(int i) {
        if (C12907a.m36194c().m36202d()) {
            this.componentAdStrategy.playVideoMute(i);
        } else {
            this.legacyVideoAdStrategy.playVideoMute(i);
        }
    }

    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        if (C12907a.m36194c().m36202d()) {
            this.componentAdStrategy.setAlertDialogText(str, str2, str3, str4);
        } else {
            this.legacyVideoAdStrategy.setAlertDialogText(str, str2, str3, str4);
        }
    }

    @Override // com.mbridge.msdk.out.BaseExtraInterfaceForHandler
    public void setExtraInfo(JSONObject jSONObject) {
        if (C12907a.m36194c().m36202d()) {
            this.componentAdStrategy.setExtraInfo(jSONObject);
        } else {
            this.legacyVideoAdStrategy.setExtraInfo(jSONObject);
        }
    }

    public void setIVRewardEnable(int i, int i2) {
        if (C12907a.m36194c().m36202d()) {
            this.componentAdStrategy.setIVRewardEnable(i, i2);
        } else {
            this.legacyVideoAdStrategy.setIVRewardEnable(i, i2);
        }
    }

    public void setInterstitialVideoListener(NewInterstitialListener newInterstitialListener) {
        if (C12907a.m36194c().m36202d()) {
            this.componentAdStrategy.setInterstitialVideoListener(newInterstitialListener);
        } else {
            this.legacyVideoAdStrategy.setInterstitialVideoListener(newInterstitialListener);
        }
    }

    public void setRewardPlus(boolean z) {
        if (C12907a.m36194c().m36202d()) {
            this.componentAdStrategy.setRewardPlus(z);
        } else {
            this.legacyVideoAdStrategy.setRewardPlus(z);
        }
    }

    public void setRewardVideoListener(InterfaceC13938g interfaceC13938g) {
        if (C12907a.m36194c().m36202d()) {
            this.componentAdStrategy.setRewardVideoListener(interfaceC13938g);
        } else {
            this.legacyVideoAdStrategy.setRewardVideoListener(interfaceC13938g);
        }
    }

    public void show() {
        if (C12907a.m36194c().m36202d()) {
            this.componentAdStrategy.show();
        } else {
            this.legacyVideoAdStrategy.show();
        }
    }

    public NonBidAdHandler(String str, String str2) {
        super(str, str2);
    }

    public void setIVRewardEnable(int i, double d) {
        if (C12907a.m36194c().m36202d()) {
            this.componentAdStrategy.setIVRewardEnable(i, d);
        } else {
            this.legacyVideoAdStrategy.setIVRewardEnable(i, d);
        }
    }

    public void show(Activity activity) {
        if (C12907a.m36194c().m36202d()) {
            this.componentAdStrategy.show(activity);
        } else {
            this.legacyVideoAdStrategy.show(activity);
        }
    }

    public void show(String str) {
        if (C12907a.m36194c().m36202d()) {
            this.componentAdStrategy.show(str);
        } else {
            this.legacyVideoAdStrategy.show(str);
        }
    }

    public void show(String str, String str2) {
        if (C12907a.m36194c().m36202d()) {
            this.componentAdStrategy.show(str, str2);
        } else {
            this.legacyVideoAdStrategy.show(str, str2);
        }
    }

    public void show(Activity activity, String str) {
        if (C12907a.m36194c().m36202d()) {
            this.componentAdStrategy.show(activity, str);
        } else {
            this.legacyVideoAdStrategy.show(activity, str);
        }
    }

    public void show(Activity activity, String str, String str2) {
        if (C12907a.m36194c().m36202d()) {
            this.componentAdStrategy.show(activity, str, str2);
        } else {
            this.legacyVideoAdStrategy.show(activity, str, str2);
        }
    }
}
