package com.mbridge.msdk.video.signal.impl;

import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.video.signal.InterfaceC14175f;
import com.mbridge.msdk.video.signal.InterfaceC14179h;

/* JADX INFO: renamed from: com.mbridge.msdk.video.signal.impl.e */
/* JADX INFO: compiled from: DefaultJSContainerModule.java */
/* JADX INFO: loaded from: classes7.dex */
public class C14185e implements InterfaceC14175f, InterfaceC14179h {
    @Override // com.mbridge.msdk.video.signal.InterfaceC14175f
    public void configurationChanged(int i, int i2, int i3) {
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14175f
    public boolean endCardShowing() {
        C13219q0.m37813a("DefaultJSContainerModule", "endCardShowing");
        return true;
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14175f
    public void hideAlertWebview() {
        C13219q0.m37813a("DefaultJSContainerModule", "hideAlertWebview ,msg=");
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14175f
    public void ivRewardAdsWithoutVideo(String str) {
        C13219q0.m37813a("DefaultJSContainerModule", "ivRewardAdsWithoutVideo,params=");
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14175f
    public boolean miniCardShowing() {
        C13219q0.m37813a("DefaultJSContainerModule", "miniCardShowing");
        return false;
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14175f
    public void readyStatus(int i) {
        C13219q0.m37813a("DefaultJSContainerModule", "readyStatus:isReady=" + i);
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14175f
    public void resizeMiniCard(int i, int i2, int i3) {
        C13219q0.m37813a("DefaultJSContainerModule", "showMiniCard width = " + i + " height = " + i2 + " radius = " + i3);
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14175f
    public boolean showAlertWebView() {
        C13219q0.m37813a("DefaultJSContainerModule", "showAlertWebView ,msg=");
        return false;
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14175f
    public void showEndcard(int i) {
        C13219q0.m37813a("DefaultJSContainerModule", "showEndcard,type=" + i);
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14175f
    public void showMiniCard(int i, int i2, int i3, int i4, int i5) {
        C13219q0.m37813a("DefaultJSContainerModule", "showMiniCard top = " + i + " left = " + i2 + " width = " + i3 + " height = " + i4 + " radius = " + i5);
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14175f
    public void showVideoClickView(int i) {
        C13219q0.m37813a("DefaultJSContainerModule", "showVideoClickView:" + i);
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14175f
    public void showVideoEndCover() {
        C13219q0.m37813a("DefaultJSContainerModule", "showVideoEndCover");
    }
}
