package com.mbridge.msdk.video.p291bt.module;

import android.content.Context;
import android.util.AttributeSet;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.mbsignalcommon.windvane.WindVaneWebView;
import com.mbridge.msdk.video.module.MBridgeVideoView;
import com.mbridge.msdk.video.p291bt.module.listener.InterfaceC13931b;
import com.mbridge.msdk.video.p291bt.module.orglistener.InterfaceC13939h;
import com.mbridge.msdk.video.signal.container.AbstractJSContainer;

/* JADX INFO: loaded from: classes7.dex */
public class MBTempContainerDiff extends AbstractJSContainer {
    public MBridgeVideoView mbridgeVideoView;

    public MBTempContainerDiff(Context context) {
        super(context);
    }

    public MBTempContainerDiff(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean checkChinaSendToServerDiff(InterfaceC13939h interfaceC13939h) {
        return false;
    }

    public boolean checkChinaShowingAlertViewState() {
        return false;
    }

    public void setChinaBrowserCallBack(InterfaceC13931b interfaceC13931b, String str, InterfaceC13939h interfaceC13939h, CampaignEx campaignEx) {
    }

    public void setChinaCTACallBack() {
    }

    public void setChinaCallBackStatus(WindVaneWebView windVaneWebView) {
    }

    public void setChinaDestroy() {
    }

    public void setChinaJsCommonContext() {
    }
}
