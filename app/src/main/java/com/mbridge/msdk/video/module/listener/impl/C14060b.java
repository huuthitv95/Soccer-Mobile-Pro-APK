package com.mbridge.msdk.video.module.listener.impl;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.module.MBridgeContainerView;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.module.listener.InterfaceC14058a;
import com.mbridge.msdk.videocommon.download.C14202a;
import com.mbridge.msdk.videocommon.entity.C14216c;

/* JADX INFO: renamed from: com.mbridge.msdk.video.module.listener.impl.b */
/* JADX INFO: compiled from: ContainerViewDefaultListener.java */
/* JADX INFO: loaded from: classes7.dex */
public class C14060b extends C14062d {

    /* JADX INFO: renamed from: n */
    private MBridgeVideoView f40532n;

    /* JADX INFO: renamed from: o */
    private MBridgeContainerView f40533o;

    public C14060b(MBridgeVideoView mBridgeVideoView, MBridgeContainerView mBridgeContainerView, CampaignEx campaignEx, C14216c c14216c, C14202a c14202a, String str, String str2, InterfaceC14058a interfaceC14058a, int i, boolean z) {
        super(campaignEx, c14202a, c14216c, str, str2, interfaceC14058a, i, z);
        this.f40532n = mBridgeVideoView;
        this.f40533o = mBridgeContainerView;
        if (mBridgeVideoView == null || mBridgeContainerView == null) {
            this.f40543a = false;
        }
    }

    @Override // com.mbridge.msdk.video.module.listener.impl.C14062d, com.mbridge.msdk.video.module.listener.impl.C14069k, com.mbridge.msdk.video.module.listener.impl.C14064f, com.mbridge.msdk.video.module.listener.InterfaceC14058a
    /* JADX INFO: renamed from: a */
    public void mo41600a(int i, Object obj) {
        if (this.f40543a) {
            if (i == 8) {
                MBridgeContainerView mBridgeContainerView = this.f40533o;
                if (mBridgeContainerView == null) {
                    MBridgeVideoView mBridgeVideoView = this.f40532n;
                    if (mBridgeVideoView != null) {
                        mBridgeVideoView.showAlertView();
                    }
                } else if (mBridgeContainerView.showAlertWebView()) {
                    MBridgeVideoView mBridgeVideoView2 = this.f40532n;
                    if (mBridgeVideoView2 != null) {
                        mBridgeVideoView2.alertWebViewShowed();
                    }
                } else {
                    MBridgeVideoView mBridgeVideoView3 = this.f40532n;
                    if (mBridgeVideoView3 != null) {
                        mBridgeVideoView3.showAlertView();
                    }
                }
            } else if (i == 107) {
                this.f40533o.showVideoClickView(-1);
                this.f40532n.setCover(false);
                this.f40532n.setMiniEndCardState(false);
                this.f40532n.videoOperate(1);
            } else if (i == 112) {
                this.f40532n.setCover(true);
                this.f40532n.setMiniEndCardState(true);
                this.f40532n.videoOperate(2);
            } else if (i == 115) {
                this.f40533o.resizeMiniCard(this.f40532n.getBorderViewWidth(), this.f40532n.getBorderViewHeight(), this.f40532n.getBorderViewRadius());
            }
        }
        super.mo41600a(i, obj);
    }
}
