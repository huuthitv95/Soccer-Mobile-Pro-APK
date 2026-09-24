package com.mbridge.msdk.video.signal.impl;

import com.mbridge.msdk.foundation.tools.C13219q0;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.signal.InterfaceC14178g;

/* JADX INFO: renamed from: com.mbridge.msdk.video.signal.impl.f */
/* JADX INFO: compiled from: DefaultJSNotifyProxy.java */
/* JADX INFO: loaded from: classes7.dex */
public class C14186f implements InterfaceC14178g {
    @Override // com.mbridge.msdk.video.signal.InterfaceC14178g
    /* JADX INFO: renamed from: a */
    public void mo42344a(int i) {
        C13219q0.m37813a("DefaultJSNotifyProxy", "onVideoStatusNotify:" + i);
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14178g
    /* JADX INFO: renamed from: a */
    public void mo42345a(int i, int i2, int i3, int i4) {
        C13219q0.m37813a("DefaultJSNotifyProxy", "showDataInfo");
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14178g
    /* JADX INFO: renamed from: a */
    public void mo42346a(int i, String str) {
        C13219q0.m37813a("DefaultJSNotifyProxy", "onClick:" + i + ",pt:" + str);
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14178g
    /* JADX INFO: renamed from: a */
    public void mo42347a(MBridgeVideoView.C14056v c14056v) {
        C13219q0.m37813a("DefaultJSNotifyProxy", "onProgressNotify:" + c14056v.toString());
    }

    @Override // com.mbridge.msdk.video.signal.InterfaceC14178g
    /* JADX INFO: renamed from: a */
    public void mo42348a(Object obj) {
        C13219q0.m37813a("DefaultJSNotifyProxy", "onWebviewShow:" + obj);
    }
}
