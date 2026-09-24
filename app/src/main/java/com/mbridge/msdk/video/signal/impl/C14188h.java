package com.mbridge.msdk.video.signal.impl;

import com.applovin.impl.sdk.utils.JsonUtils;
import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.video.signal.InterfaceC14199j;

/* JADX INFO: renamed from: com.mbridge.msdk.video.signal.impl.h */
/* JADX INFO: compiled from: DefaultJSVideoModule.java */
/* JADX INFO: loaded from: classes7.dex */
public class C14188h implements InterfaceC14199j {
    @Override // com.mbridge.msdk.video.signal.InterfaceC14199j
    public void alertWebViewShowed() {
        C13219q0.m37813a("DefaultJSVideoModule", "alertWebViewShowed:");
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14199j
    public void closeVideoOperate(int i, int i2) {
        C13219q0.m37813a("DefaultJSVideoModule", "closeOperte:close=" + i + "closeViewVisible=" + i2);
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14199j
    public void dismissAllAlert() {
        C13219q0.m37813a("DefaultJSVideoModule", "dismissAllAlert");
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14199j
    public int getBorderViewHeight() {
        return 0;
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14199j
    public int getBorderViewLeft() {
        return 0;
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14199j
    public int getBorderViewRadius() {
        return 0;
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14199j
    public int getBorderViewTop() {
        return 0;
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14199j
    public int getBorderViewWidth() {
        return 0;
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14199j
    public String getCurrentProgress() {
        C13219q0.m37813a("DefaultJSVideoModule", "getCurrentProgress");
        return JsonUtils.EMPTY_JSON;
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14199j
    public void hideAlertView(int i) {
        C13219q0.m37813a("DefaultJSVideoModule", "hideAlertView:");
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14199j
    public boolean isH5Canvas() {
        return false;
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14199j
    public void notifyCloseBtn(int i) {
        C13219q0.m37813a("DefaultJSVideoModule", "notifyCloseBtn:" + i);
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14199j
    public void progressBarOperate(int i) {
        C13219q0.m37813a("DefaultJSVideoModule", "progressBarOperate:progressViewVisible=" + i);
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14199j
    public void progressOperate(int i, int i2) {
        C13219q0.m37813a("DefaultJSVideoModule", "progressOperate:progress=" + i + "progressViewVisible=" + i2);
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14199j
    public void setCover(boolean z) {
        C13219q0.m37813a("DefaultJSVideoModule", "setCover:" + z);
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14199j
    public void setMiniEndCardState(boolean z) {
        C13219q0.m37813a("DefaultJSVideoModule", "setMiniEndCardState");
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14199j
    public void setScaleFitXY(int i) {
        C13219q0.m37813a("DefaultJSVideoModule", "setScaleFitXY:" + i);
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14199j
    public void setVisible(int i) {
        C13219q0.m37813a("DefaultJSVideoModule", "setVisible:" + i);
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14199j
    public void showAlertView() {
        C13219q0.m37813a("DefaultJSVideoModule", "showAlertView:");
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14199j
    public void showIVRewardAlertView(String str) {
        C13219q0.m37813a("DefaultJSVideoModule", "showAlertView:");
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14199j
    public void showVideoLocation(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        C13219q0.m37813a("DefaultJSVideoModule", "showVideoLocation:marginTop=" + i + ",marginLeft=" + i2 + ",width=" + i3 + ",height=" + i4 + ",radius=" + i5 + ",borderTop=" + i6 + ",borderTop=" + i6 + ",borderLeft=" + i7 + ",borderWidth=" + i8 + ",borderHeight=" + i9);
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14199j
    public void soundOperate(int i, int i2) {
        C13219q0.m37813a("DefaultJSVideoModule", "soundOperate:mute=" + i + ",soundViewVisible=" + i2);
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14199j
    public void soundOperate(int i, int i2, String str) {
        C13219q0.m37813a("DefaultJSVideoModule", "soundOperate:mute=" + i + ",soundViewVisible=" + i2 + ",pt=" + str);
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14199j
    public void videoOperate(int i) {
        C13219q0.m37813a("DefaultJSVideoModule", "videoOperate:" + i);
    }
}
