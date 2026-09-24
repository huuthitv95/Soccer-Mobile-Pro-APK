package com.mbridge.msdk.out.strategy.legacy.interstitial;

import android.app.Activity;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.same.C13088a;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.same.report.metrics.C13157e;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.newinterstitial.listener.C13437a;
import com.mbridge.msdk.newinterstitial.out.NewInterstitialListener;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.out.MBSupportMuteAdType;
import com.mbridge.msdk.out.strategy.IVideoAdStrategy;
import com.mbridge.msdk.reward.controller.C13613a;
import com.mbridge.msdk.setting.C13636h;
import com.mbridge.msdk.video.p291bt.module.orglistener.InterfaceC13938g;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class NewInterstitialStrategy implements IVideoAdStrategy {
    private static final String TAG = "NewInterstitialStrategy";
    private String cancelText;
    private String confirmContent;
    private String confirmText;
    private String confirmTitle;
    private C13613a controller;
    private NewInterstitialListener listener;
    private int modeType;
    private String placementId;
    private String unitId;
    private int value;
    private int valueType;
    private int isSilent = 2;
    private boolean isSetListenerController = false;
    private boolean isConfigAlertDialogTextController = false;
    private boolean isSetIVRewardEnable = false;

    public NewInterstitialStrategy(String str, String str2) {
        initData(str, str2);
    }

    private void checkAndCreateController() {
        C13613a c13613a;
        if (this.controller == null) {
            initMBRewardVideoHandler(this.placementId, this.unitId);
        }
        if (this.isSetListenerController) {
            C13613a c13613a2 = this.controller;
            if (c13613a2 != null) {
                c13613a2.m39237a(new C13437a(this.listener, this.unitId, false));
            }
            this.isSetListenerController = false;
        }
        if (this.isConfigAlertDialogTextController) {
            C13613a c13613a3 = this.controller;
            if (c13613a3 != null) {
                c13613a3.m39239a(this.confirmTitle, this.confirmContent, this.confirmText, this.cancelText);
            }
            this.isConfigAlertDialogTextController = false;
        }
        if (!this.isSetIVRewardEnable || (c13613a = this.controller) == null) {
            return;
        }
        c13613a.m39235a(this.modeType, this.valueType, this.value);
        this.isSetIVRewardEnable = false;
    }

    private void initData(String str, String str2) {
        this.placementId = str;
        this.unitId = str2;
        checkAndCreateController();
    }

    private void initMBRewardVideoHandler(String str, String str2) {
        try {
            if (this.controller == null) {
                C13613a c13613a = new C13613a();
                this.controller = c13613a;
                c13613a.m39246d(true);
                this.controller.m39244c(str, str2);
                C13636h.m39706b().m39726h(str2);
            }
        } catch (Throwable th) {
            C13219q0.m37817b(TAG, th.getMessage(), th);
        }
    }

    private void setIVRewardEnableToController() {
        C13613a c13613a = this.controller;
        if (c13613a != null) {
            c13613a.m39235a(this.modeType, this.valueType, this.value);
        }
    }

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy
    public void clearBitmapCache() {
    }

    @Override // com.mbridge.msdk.out.strategy.IBaseVideoAdStrategy
    public void clearVideoCache() {
        try {
            C13613a c13613a = this.controller;
            if (c13613a != null) {
                c13613a.m39247e();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.mbridge.msdk.out.strategy.IBaseVideoAdStrategy
    public String getCreativeIdWithUnitId() {
        C13613a c13613a = this.controller;
        return c13613a != null ? c13613a.m39253j() : "";
    }

    @Override // com.mbridge.msdk.out.strategy.IBaseVideoAdStrategy
    public String getRequestId() {
        C13613a c13613a = this.controller;
        return c13613a != null ? c13613a.m39256m() : "";
    }

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy
    public boolean isReady() {
        checkAndCreateController();
        C13613a c13613a = this.controller;
        if (c13613a != null) {
            return c13613a.m39245c(true);
        }
        return false;
    }

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy
    public void load() {
        checkAndCreateController();
        if (this.controller != null) {
            this.controller.m39241a(true, C13156d.m37475b().m37479a(0, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.unitId, true, 2));
        }
    }

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy, com.mbridge.msdk.out.strategy.IBaseVideoAdStrategy
    public void loadFormSelfFilling() {
        checkAndCreateController();
        if (this.controller != null) {
            this.controller.m39241a(false, C13156d.m37475b().m37479a(0, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.unitId, true, 1));
        }
    }

    @Override // com.mbridge.msdk.out.strategy.IBaseVideoAdStrategy
    public void playVideoMute(int i) {
        this.isSilent = i;
        C13613a c13613a = this.controller;
        if (c13613a != null) {
            c13613a.m39234a(i);
        }
    }

    @Override // com.mbridge.msdk.out.strategy.IBaseVideoAdStrategy
    public void setAlertDialogText(String str, String str2, String str3, String str4) {
        this.confirmTitle = str;
        this.confirmContent = str2;
        this.confirmText = str3;
        this.cancelText = str4;
        this.isConfigAlertDialogTextController = true;
        MBridgeGlobalCommon.setAlertDialogText(this.unitId, str, str2, str3, str4);
    }

    @Override // com.mbridge.msdk.out.strategy.IBaseVideoAdStrategy
    public void setExtraInfo(JSONObject jSONObject) {
        C13008c.m36588n().m36530a(this.unitId, jSONObject);
    }

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy
    public void setIVRewardEnable(int i, int i2) {
        this.modeType = i;
        this.value = i2;
        this.valueType = C13088a.f35845K;
        this.isSetIVRewardEnable = true;
        setIVRewardEnableToController();
    }

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy
    public void setInterstitialVideoListener(NewInterstitialListener newInterstitialListener) {
        this.listener = newInterstitialListener;
        this.isSetListenerController = true;
        C13613a c13613a = this.controller;
        if (c13613a == null || c13613a.m39264u()) {
            return;
        }
        this.controller.m39237a(new C13437a(newInterstitialListener, this.unitId, false));
        this.isSetListenerController = false;
    }

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy, com.mbridge.msdk.out.strategy.IBaseVideoAdStrategy
    public void setRewardPlus(boolean z) {
    }

    @Deprecated
    public void setRewardVideoListener(NewInterstitialListener newInterstitialListener) {
        this.listener = newInterstitialListener;
        this.isSetListenerController = true;
        C13613a c13613a = this.controller;
        if (c13613a == null || c13613a.m39264u()) {
            return;
        }
        this.controller.m39237a(new C13437a(newInterstitialListener, this.unitId, false));
        this.isSetListenerController = false;
    }

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy
    public void setRewardVideoListener(InterfaceC13938g interfaceC13938g) {
    }

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy
    public void show() {
        checkAndCreateController();
        if (this.controller != null) {
            C13157e c13157eM37479a = C13156d.m37475b().m37479a(0, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.unitId, false, -1);
            c13157eM37479a.m37501a("activity_overload", 0);
            this.controller.m39238a((String) null, (String) null, (String) null, c13157eM37479a);
        }
    }

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy
    public void setIVRewardEnable(int i, double d) {
        this.modeType = i;
        this.value = (int) (d * 100.0d);
        this.valueType = C13088a.f35844J;
        this.isSetIVRewardEnable = true;
        setIVRewardEnableToController();
    }

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy
    public void show(Activity activity) {
        checkAndCreateController();
        if (this.controller != null) {
            C13157e c13157eM37479a = C13156d.m37475b().m37479a(0, MBSupportMuteAdType.INTERSTITIAL_VIDEO, this.unitId, false, -1);
            c13157eM37479a.m37501a("activity_overload", 1);
            C13008c.m36588n().m36527a(activity);
            this.controller.m39238a((String) null, (String) null, (String) null, c13157eM37479a);
        }
    }

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy
    public void show(String str) {
        show();
    }

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy
    public void show(Activity activity, String str) {
        show(activity);
    }

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy
    public void show(String str, String str2) {
        show();
    }

    @Override // com.mbridge.msdk.out.strategy.IVideoAdStrategy
    public void show(Activity activity, String str, String str2) {
        show(activity);
    }
}
