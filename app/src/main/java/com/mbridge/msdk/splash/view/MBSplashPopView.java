package com.mbridge.msdk.splash.view;

import android.content.Context;
import android.util.AttributeSet;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.splash.middle.C13664d;

/* JADX INFO: loaded from: classes7.dex */
public class MBSplashPopView extends BaseSplashPopView {
    public MBSplashPopView(Context context) {
        super(context);
    }

    public MBSplashPopView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MBSplashPopView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MBSplashPopView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public MBSplashPopView(Context context, BaseSplashPopView.C13695i c13695i, C13664d c13664d) {
        super(context, c13695i, c13664d);
    }

    @Override // com.mbridge.msdk.splash.view.BaseSplashPopView
    /* JADX INFO: renamed from: b */
    protected void mo40127b(CampaignEx campaignEx) {
        super.mo40127b(campaignEx);
        m40126a(campaignEx);
    }
}
