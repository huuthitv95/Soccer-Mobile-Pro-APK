package com.mbridge.msdk.video.module.listener.impl;

import com.mbridge.msdk.video.module.MBridgeClickMiniCardView;
import com.mbridge.msdk.video.module.listener.InterfaceC14058a;

/* JADX INFO: renamed from: com.mbridge.msdk.video.module.listener.impl.g */
/* JADX INFO: compiled from: MiniCardProxyNotifyListener.java */
/* JADX INFO: loaded from: classes9.dex */
public class C14065g extends C14067i {

    /* JADX INFO: renamed from: b */
    private MBridgeClickMiniCardView f40540b;

    public C14065g(MBridgeClickMiniCardView mBridgeClickMiniCardView, InterfaceC14058a interfaceC14058a) {
        super(interfaceC14058a);
        this.f40540b = mBridgeClickMiniCardView;
    }

    @Override // com.mbridge.msdk.video.module.listener.impl.C14067i, com.mbridge.msdk.video.module.listener.impl.C14064f, com.mbridge.msdk.video.module.listener.InterfaceC14058a
    /* JADX INFO: renamed from: a */
    public void mo41600a(int i, Object obj) {
        boolean z = false;
        switch (i) {
            case 100:
                MBridgeClickMiniCardView mBridgeClickMiniCardView = this.f40540b;
                if (mBridgeClickMiniCardView != null) {
                    mBridgeClickMiniCardView.webviewshow();
                    MBridgeClickMiniCardView mBridgeClickMiniCardView2 = this.f40540b;
                    mBridgeClickMiniCardView2.onSelfConfigurationChanged(mBridgeClickMiniCardView2.getResources().getConfiguration());
                }
                break;
            case 101:
            case 102:
                z = true;
                break;
            case 103:
                i = 107;
                break;
        }
        if (z) {
            return;
        }
        super.mo41600a(i, obj);
    }
}
