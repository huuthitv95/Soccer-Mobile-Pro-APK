package com.mbridge.msdk.video.p291bt.module;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.video.signal.impl.C14191k;

/* JADX INFO: loaded from: classes7.dex */
public class MBridgeBTNativeECDiff extends BTBaseView {
    public View ctaView;

    public MBridgeBTNativeECDiff(Context context) {
        super(context);
    }

    public MBridgeBTNativeECDiff(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean checkChinaProgressBarStatus() {
        return false;
    }

    public void doChinaJumpClick(Context context, C14191k c14191k) {
    }

    @Override // com.mbridge.msdk.video.p291bt.module.BTBaseView
    public void init(Context context) {
    }

    @Override // com.mbridge.msdk.video.p291bt.module.BTBaseView
    public void onDestory() {
    }

    public void setChinaCTAData(CampaignEx campaignEx) {
    }
}
