package com.mbridge.msdk.video.module.listener.impl;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.module.listener.InterfaceC14058a;
import com.mbridge.msdk.video.signal.InterfaceC14199j;
import com.mbridge.msdk.video.signal.factory.IJSFactory;
import com.mbridge.msdk.videocommon.download.C14202a;
import com.mbridge.msdk.videocommon.entity.C14216c;

/* JADX INFO: renamed from: com.mbridge.msdk.video.module.listener.impl.c */
/* JADX INFO: compiled from: ContainerViewJSListener.java */
/* JADX INFO: loaded from: classes7.dex */
public class C14061c extends C14062d {

    /* JADX INFO: renamed from: n */
    private IJSFactory f40534n;

    public C14061c(IJSFactory iJSFactory, CampaignEx campaignEx, C14216c c14216c, C14202a c14202a, String str, String str2, InterfaceC14058a interfaceC14058a, int i, boolean z) {
        super(campaignEx, c14202a, c14216c, str, str2, interfaceC14058a, i, z);
        this.f40534n = iJSFactory;
        if (iJSFactory == null) {
            this.f40543a = false;
        }
    }

    @Override // com.mbridge.msdk.video.module.listener.impl.C14062d, com.mbridge.msdk.video.module.listener.impl.C14069k, com.mbridge.msdk.video.module.listener.impl.C14064f, com.mbridge.msdk.video.module.listener.InterfaceC14058a
    /* JADX INFO: renamed from: a */
    public void mo41600a(int i, Object obj) {
        if (this.f40543a) {
            if (i != 8) {
                if (i == 105) {
                    this.f40534n.getJSNotifyProxy().mo42346a(3, obj.toString());
                    i = -1;
                } else if (i == 107) {
                    this.f40534n.getJSContainerModule().showVideoClickView(-1);
                    this.f40534n.getJSVideoModule().setCover(false);
                    this.f40534n.getJSVideoModule().setMiniEndCardState(false);
                    this.f40534n.getJSVideoModule().videoOperate(1);
                } else if (i == 112) {
                    this.f40534n.getJSVideoModule().setCover(true);
                    this.f40534n.getJSVideoModule().setMiniEndCardState(true);
                    this.f40534n.getJSVideoModule().videoOperate(2);
                } else if (i == 115) {
                    InterfaceC14199j jSVideoModule = this.f40534n.getJSVideoModule();
                    this.f40534n.getJSContainerModule().resizeMiniCard(jSVideoModule.getBorderViewWidth(), jSVideoModule.getBorderViewHeight(), jSVideoModule.getBorderViewRadius());
                }
            } else if (this.f40534n.getJSContainerModule().showAlertWebView()) {
                this.f40534n.getJSVideoModule().alertWebViewShowed();
            } else {
                this.f40534n.getJSVideoModule().showAlertView();
            }
        }
        super.mo41600a(i, obj);
    }
}
