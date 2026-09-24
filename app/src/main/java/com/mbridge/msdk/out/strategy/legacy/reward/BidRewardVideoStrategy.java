package com.mbridge.msdk.out.strategy.legacy.reward;

import android.app.Activity;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.C13008c;
import com.mbridge.msdk.foundation.same.report.metrics.C13156d;
import com.mbridge.msdk.foundation.same.report.metrics.C13157e;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.foundation.tools.C13229v0;
import com.mbridge.msdk.newinterstitial.out.NewInterstitialListener;
import com.mbridge.msdk.newreward.function.common.MBridgeGlobalCommon;
import com.mbridge.msdk.out.strategy.IBidVideoAdStrategy;
import com.mbridge.msdk.reward.controller.C13613a;
import com.mbridge.msdk.util.C13884b;
import com.mbridge.msdk.video.p291bt.module.orglistener.C13932a;
import com.mbridge.msdk.video.p291bt.module.orglistener.InterfaceC13938g;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class BidRewardVideoStrategy implements IBidVideoAdStrategy {
    private static final String TAG = "TraditionalBidStrategy";
    private String cancelText;
    private String confirmContent;
    private String confirmText;
    private String confirmTitle;
    private C13613a controller;
    private String placementId;
    private String unitId;
    private InterfaceC13938g listener = null;
    private int isSilent = 2;
    private boolean isRewardPlusOpen = false;
    private boolean isSetListenerController = false;
    private boolean isConfigAlertDialogTextController = false;

    public BidRewardVideoStrategy(String str, String str2) {
        initData(str, str2);
    }

    private void checkAndCreateController() {
        if (this.controller == null) {
            initMBBidRewardVideoHandler(this.placementId, this.unitId);
        }
        configController();
    }

    private void configController() {
        if (this.controller == null) {
            return;
        }
        if (this.isSetListenerController) {
            if (C13884b.m41421a()) {
                this.controller.m39237a(new C13932a(this.listener, this.unitId, true));
            } else {
                this.controller.m39237a(new C13932a(this.listener));
            }
            this.isSetListenerController = false;
        }
        this.controller.m39249f(this.isRewardPlusOpen);
        if (this.isConfigAlertDialogTextController) {
            this.controller.m39239a(this.confirmTitle, this.confirmContent, this.confirmText, this.cancelText);
            this.isConfigAlertDialogTextController = false;
        }
    }

    private void initData(String str, String str2) {
        String strM37926e = C13229v0.m37926e(str2);
        if (!TextUtils.isEmpty(strM37926e)) {
            C13229v0.m37922d(str2, strM37926e);
        }
        this.placementId = str;
        this.unitId = str2;
        checkAndCreateController();
    }

    private void initMBBidRewardVideoHandler(String str, String str2) {
        try {
            if (this.controller == null) {
                C13613a c13613a = new C13613a();
                this.controller = c13613a;
                c13613a.m39246d(false);
                this.controller.m39248e(true);
                this.controller.m39244c(str, str2);
            }
        } catch (Throwable th) {
            C13219q0.m37817b(TAG, th.getMessage(), th);
        }
    }

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy
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

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy
    public boolean isBidReady() {
        checkAndCreateController();
        C13613a c13613a = this.controller;
        if (c13613a != null) {
            return c13613a.m39245c(true);
        }
        return false;
    }

    @Override // com.mbridge.msdk.out.strategy.IBaseVideoAdStrategy
    public void loadFormSelfFilling() {
    }

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy
    public void loadFromBid(String str) {
        checkAndCreateController();
        if (this.controller != null) {
            this.controller.m39242a(true, str, C13156d.m37475b().m37479a(1, 94, this.unitId, true, 2));
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

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy
    public void setIVRewardEnable(int i, double d) {
    }

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy
    public void setIVRewardEnable(int i, int i2) {
    }

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy
    public void setInterstitialVideoListener(NewInterstitialListener newInterstitialListener) {
    }

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy, com.mbridge.msdk.out.strategy.IBaseVideoAdStrategy
    public void setRewardPlus(boolean z) {
        this.isRewardPlusOpen = z;
        C13613a c13613a = this.controller;
        if (c13613a != null) {
            c13613a.m39249f(z);
        }
    }

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy
    public void setRewardVideoListener(InterfaceC13938g interfaceC13938g) {
        this.listener = interfaceC13938g;
        this.isSetListenerController = true;
        C13613a c13613a = this.controller;
        if (c13613a == null || c13613a.m39264u()) {
            return;
        }
        if (C13884b.m41421a()) {
            this.controller.m39237a(new C13932a(interfaceC13938g, this.unitId, true));
        } else {
            this.controller.m39237a(new C13932a(interfaceC13938g));
        }
        this.isSetListenerController = false;
    }

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy
    public void showFromBid() {
        checkAndCreateController();
        if (this.controller != null) {
            C13157e c13157eM37479a = C13156d.m37475b().m37479a(1, 94, this.unitId, false, -1);
            c13157eM37479a.m37501a("activity_overload", 0);
            this.controller.m39238a((String) null, (String) null, (String) null, c13157eM37479a);
        }
    }

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy
    public void showFromBid(Activity activity) {
        checkAndCreateController();
        if (this.controller != null) {
            C13157e c13157eM37479a = C13156d.m37475b().m37479a(1, 94, this.unitId, false, -1);
            c13157eM37479a.m37501a("activity_overload", 1);
            C13008c.m36588n().m36527a(activity);
            this.controller.m39238a((String) null, (String) null, (String) null, c13157eM37479a);
        }
    }

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy
    public void showFromBid(String str) {
        checkAndCreateController();
        if (this.controller != null) {
            C13157e c13157eM37479a = C13156d.m37475b().m37479a(1, 94, this.unitId, false, -1);
            c13157eM37479a.m37501a("activity_overload", 0);
            this.controller.m39238a((String) null, str, (String) null, c13157eM37479a);
        }
    }

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy
    public void showFromBid(String str, String str2) {
        checkAndCreateController();
        if (this.controller != null) {
            C13157e c13157eM37479a = C13156d.m37475b().m37479a(1, 94, this.unitId, false, -1);
            c13157eM37479a.m37501a("activity_overload", 0);
            this.controller.m39238a((String) null, str, str2, c13157eM37479a);
        }
    }

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy
    public void showFromBid(Activity activity, String str) {
        checkAndCreateController();
        if (this.controller != null) {
            C13157e c13157eM37479a = C13156d.m37475b().m37479a(1, 94, this.unitId, false, -1);
            c13157eM37479a.m37501a("activity_overload", 1);
            C13008c.m36588n().m36527a(activity);
            this.controller.m39238a((String) null, str, (String) null, c13157eM37479a);
        }
    }

    @Override // com.mbridge.msdk.out.strategy.IBidVideoAdStrategy
    public void showFromBid(Activity activity, String str, String str2) {
        checkAndCreateController();
        if (this.controller != null) {
            C13157e c13157eM37479a = C13156d.m37475b().m37479a(1, 94, this.unitId, false, -1);
            c13157eM37479a.m37501a("activity_overload", 1);
            C13008c.m36588n().m36527a(activity);
            this.controller.m39238a((String) null, str, str2, c13157eM37479a);
        }
    }
}
